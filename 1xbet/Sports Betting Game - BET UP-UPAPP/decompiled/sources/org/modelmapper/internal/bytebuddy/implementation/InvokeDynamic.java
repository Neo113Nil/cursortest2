package org.modelmapper.internal.bytebuddy.implementation;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.Type;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue;
import org.modelmapper.internal.bytebuddy.description.enumeration.EnumerationDescription;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodList;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterList;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeList;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldLocator;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.LoadedTypeInitializer;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Removal;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.ClassConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.DoubleConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.FloatConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.JavaConstantValue;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.LongConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.NullConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.TextConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.FieldAccess;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodReturn;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;
import org.modelmapper.internal.bytebuddy.utility.CompoundList;
import org.modelmapper.internal.bytebuddy.utility.JavaConstant;
import org.modelmapper.internal.bytebuddy.utility.JavaType;
import org.modelmapper.internal.bytebuddy.utility.RandomString;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class InvokeDynamic implements Implementation.Composable {
    protected final Assigner assigner;
    protected final MethodDescription.InDefinedShape bootstrapMethod;
    protected final List<?> handleArguments;
    protected final InvocationProvider invocationProvider;
    protected final TerminationHandler terminationHandler;
    protected final Assigner.Typing typing;

    protected enum TerminationHandler {
        RETURNING { // from class: org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.TerminationHandler.1
            @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.TerminationHandler
            protected StackManipulation resolve(MethodDescription methodDescription, TypeDescription typeDescription, Assigner assigner, Assigner.Typing typing) {
                StackManipulation assign = assigner.assign(typeDescription.asGenericType(), methodDescription.getReturnType(), typing);
                if (!assign.isValid()) {
                    throw new IllegalStateException("Cannot return " + typeDescription + " from " + methodDescription);
                }
                return new StackManipulation.Compound(assign, MethodReturn.of(methodDescription.getReturnType()));
            }
        },
        DROPPING { // from class: org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.TerminationHandler.2
            @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.TerminationHandler
            protected StackManipulation resolve(MethodDescription methodDescription, TypeDescription typeDescription, Assigner assigner, Assigner.Typing typing) {
                TypeDefinition returnType;
                if (methodDescription.isConstructor()) {
                    returnType = methodDescription.getDeclaringType();
                } else {
                    returnType = methodDescription.getReturnType();
                }
                return Removal.of(returnType);
            }
        };

        protected abstract StackManipulation resolve(MethodDescription methodDescription, TypeDescription typeDescription, Assigner assigner, Assigner.Typing typing);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InvokeDynamic invokeDynamic = (InvokeDynamic) obj;
        return this.bootstrapMethod.equals(invokeDynamic.bootstrapMethod) && this.handleArguments.equals(invokeDynamic.handleArguments) && this.invocationProvider.equals(invokeDynamic.invocationProvider) && this.terminationHandler.equals(invokeDynamic.terminationHandler) && this.assigner.equals(invokeDynamic.assigner) && this.typing.equals(invokeDynamic.typing);
    }

    public int hashCode() {
        return ((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.bootstrapMethod.hashCode()) * 31) + this.handleArguments.hashCode()) * 31) + this.invocationProvider.hashCode()) * 31) + this.terminationHandler.hashCode()) * 31) + this.assigner.hashCode()) * 31) + this.typing.hashCode();
    }

    protected InvokeDynamic(MethodDescription.InDefinedShape inDefinedShape, List<?> list, InvocationProvider invocationProvider, TerminationHandler terminationHandler, Assigner assigner, Assigner.Typing typing) {
        this.bootstrapMethod = inDefinedShape;
        this.handleArguments = list;
        this.invocationProvider = invocationProvider;
        this.terminationHandler = terminationHandler;
        this.assigner = assigner;
        this.typing = typing;
    }

    public static WithImplicitTarget bootstrap(Method method, Object... objArr) {
        return bootstrap(new MethodDescription.ForLoadedMethod(method), objArr);
    }

    public static WithImplicitTarget bootstrap(Method method, List<?> list) {
        return bootstrap(new MethodDescription.ForLoadedMethod(method), list);
    }

    public static WithImplicitTarget bootstrap(Constructor<?> constructor, Object... objArr) {
        return bootstrap(new MethodDescription.ForLoadedConstructor(constructor), objArr);
    }

    public static WithImplicitTarget bootstrap(Constructor<?> constructor, List<?> list) {
        return bootstrap(new MethodDescription.ForLoadedConstructor(constructor), list);
    }

    public static WithImplicitTarget bootstrap(MethodDescription.InDefinedShape inDefinedShape, Object... objArr) {
        return bootstrap(inDefinedShape, (List<?>) Arrays.asList(objArr));
    }

    public static WithImplicitTarget bootstrap(MethodDescription.InDefinedShape inDefinedShape, List<?> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            if (obj == null) {
                obj = JavaConstant.Dynamic.ofNullConstant();
            } else if (obj instanceof Class) {
                Class cls = (Class) obj;
                if (cls.isPrimitive()) {
                    obj = JavaConstant.Dynamic.ofPrimitiveType((Class<?>) cls);
                } else {
                    obj = TypeDescription.ForLoadedType.of(cls);
                }
            } else {
                if (obj instanceof TypeDescription) {
                    TypeDescription typeDescription = (TypeDescription) obj;
                    if (typeDescription.isPrimitive()) {
                        obj = JavaConstant.Dynamic.ofPrimitiveType(typeDescription);
                    }
                }
                if (JavaType.METHOD_HANDLE.getTypeStub().isInstance(obj)) {
                    obj = JavaConstant.MethodHandle.ofLoaded(obj);
                } else if (JavaType.METHOD_TYPE.getTypeStub().isInstance(obj)) {
                    obj = JavaConstant.MethodType.ofLoaded(obj);
                }
            }
            arrayList.add(obj);
        }
        if (!inDefinedShape.isInvokeBootstrap(arrayList)) {
            throw new IllegalArgumentException("Not a valid bootstrap method " + inDefinedShape + " for " + arrayList);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (Object obj2 : arrayList) {
            if (obj2 instanceof TypeDescription) {
                obj2 = Type.getType(((TypeDescription) obj2).getDescriptor());
            } else if (obj2 instanceof JavaConstant) {
                obj2 = ((JavaConstant) obj2).asConstantPoolValue();
            }
            arrayList2.add(obj2);
        }
        return new WithImplicitTarget(inDefinedShape, arrayList2, new InvocationProvider.Default(), TerminationHandler.RETURNING, Assigner.DEFAULT, Assigner.Typing.STATIC);
    }

    public static WithImplicitArguments lambda(Method method, Class<?> cls) {
        return lambda(new MethodDescription.ForLoadedMethod(method), TypeDescription.ForLoadedType.of(cls));
    }

    public static WithImplicitArguments lambda(Method method, Class<?> cls, MethodGraph.Compiler compiler) {
        return lambda(new MethodDescription.ForLoadedMethod(method), TypeDescription.ForLoadedType.of(cls), compiler);
    }

    public static WithImplicitArguments lambda(MethodDescription.InDefinedShape inDefinedShape, TypeDescription typeDescription) {
        return lambda(inDefinedShape, typeDescription, MethodGraph.Compiler.Default.forJavaHierarchy());
    }

    public static WithImplicitArguments lambda(MethodDescription.InDefinedShape inDefinedShape, TypeDescription typeDescription, MethodGraph.Compiler compiler) {
        if (!typeDescription.isInterface()) {
            throw new IllegalArgumentException(typeDescription + " is not an interface type");
        }
        MethodList filter = compiler.compile(typeDescription).listNodes().asMethodList().filter(ElementMatchers.isAbstract());
        if (filter.size() != 1) {
            throw new IllegalArgumentException(typeDescription + " does not define exactly one abstract method: " + filter);
        }
        return bootstrap(new MethodDescription.Latent(new TypeDescription.Latent("java.lang.invoke.LambdaMetafactory", 1, TypeDescription.Generic.OBJECT, new TypeDescription.Generic[0]), "metafactory", 9, Collections.emptyList(), JavaType.CALL_SITE.getTypeStub().asGenericType(), Arrays.asList(new ParameterDescription.Token(JavaType.METHOD_HANDLES_LOOKUP.getTypeStub().asGenericType()), new ParameterDescription.Token(TypeDescription.STRING.asGenericType()), new ParameterDescription.Token(JavaType.METHOD_TYPE.getTypeStub().asGenericType()), new ParameterDescription.Token(JavaType.METHOD_TYPE.getTypeStub().asGenericType()), new ParameterDescription.Token(JavaType.METHOD_HANDLE.getTypeStub().asGenericType()), new ParameterDescription.Token(JavaType.METHOD_TYPE.getTypeStub().asGenericType())), Collections.emptyList(), Collections.emptyList(), AnnotationValue.UNDEFINED, TypeDescription.Generic.UNDEFINED), JavaConstant.MethodType.of((MethodDescription) filter.asDefined().getOnly()), JavaConstant.MethodHandle.of(inDefinedShape), JavaConstant.MethodType.of((MethodDescription) filter.asDefined().getOnly())).invoke(((MethodDescription.InDefinedShape) filter.asDefined().getOnly()).getInternalName());
    }

    public InvokeDynamic withBooleanValue(boolean... zArr) {
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(new InvocationProvider.ArgumentProvider.ForBooleanConstant(z));
        }
        return new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider.appendArguments(arrayList), this.terminationHandler, this.assigner, this.typing);
    }

    public InvokeDynamic withByteValue(byte... bArr) {
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(new InvocationProvider.ArgumentProvider.ForByteConstant(b));
        }
        return new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider.appendArguments(arrayList), this.terminationHandler, this.assigner, this.typing);
    }

    public InvokeDynamic withShortValue(short... sArr) {
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s : sArr) {
            arrayList.add(new InvocationProvider.ArgumentProvider.ForShortConstant(s));
        }
        return new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider.appendArguments(arrayList), this.terminationHandler, this.assigner, this.typing);
    }

    public InvokeDynamic withCharacterValue(char... cArr) {
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c : cArr) {
            arrayList.add(new InvocationProvider.ArgumentProvider.ForCharacterConstant(c));
        }
        return new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider.appendArguments(arrayList), this.terminationHandler, this.assigner, this.typing);
    }

    public InvokeDynamic withIntegerValue(int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(new InvocationProvider.ArgumentProvider.ForIntegerConstant(i));
        }
        return new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider.appendArguments(arrayList), this.terminationHandler, this.assigner, this.typing);
    }

    public InvokeDynamic withLongValue(long... jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(new InvocationProvider.ArgumentProvider.ForLongConstant(j));
        }
        return new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider.appendArguments(arrayList), this.terminationHandler, this.assigner, this.typing);
    }

    public InvokeDynamic withFloatValue(float... fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(new InvocationProvider.ArgumentProvider.ForFloatConstant(f));
        }
        return new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider.appendArguments(arrayList), this.terminationHandler, this.assigner, this.typing);
    }

    public InvokeDynamic withDoubleValue(double... dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(new InvocationProvider.ArgumentProvider.ForDoubleConstant(d));
        }
        return new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider.appendArguments(arrayList), this.terminationHandler, this.assigner, this.typing);
    }

    public InvokeDynamic withValue(Object... objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(InvocationProvider.ArgumentProvider.ConstantPoolWrapper.of(obj));
        }
        return new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider.appendArguments(arrayList), this.terminationHandler, this.assigner, this.typing);
    }

    public WithImplicitType withReference(Object obj) {
        return new WithImplicitType.OfInstance(this.bootstrapMethod, this.handleArguments, this.invocationProvider, this.terminationHandler, this.assigner, this.typing, obj);
    }

    public InvokeDynamic withReference(Object... objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(InvocationProvider.ArgumentProvider.ForInstance.of(obj));
        }
        return new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider.appendArguments(arrayList), this.terminationHandler, this.assigner, this.typing);
    }

    public InvokeDynamic withType(TypeDescription... typeDescriptionArr) {
        ArrayList arrayList = new ArrayList(typeDescriptionArr.length);
        for (TypeDescription typeDescription : typeDescriptionArr) {
            arrayList.add(new InvocationProvider.ArgumentProvider.ForClassConstant(typeDescription));
        }
        return new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider.appendArguments(arrayList), this.terminationHandler, this.assigner, this.typing);
    }

    public InvokeDynamic withEnumeration(EnumerationDescription... enumerationDescriptionArr) {
        ArrayList arrayList = new ArrayList(enumerationDescriptionArr.length);
        for (EnumerationDescription enumerationDescription : enumerationDescriptionArr) {
            arrayList.add(new InvocationProvider.ArgumentProvider.ForEnumerationValue(enumerationDescription));
        }
        return new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider.appendArguments(arrayList), this.terminationHandler, this.assigner, this.typing);
    }

    public InvokeDynamic withInstance(JavaConstant... javaConstantArr) {
        ArrayList arrayList = new ArrayList(javaConstantArr.length);
        for (JavaConstant javaConstant : javaConstantArr) {
            arrayList.add(new InvocationProvider.ArgumentProvider.ForJavaConstant(javaConstant));
        }
        return new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider.appendArguments(arrayList), this.terminationHandler, this.assigner, this.typing);
    }

    public InvokeDynamic withNullValue(Class<?>... clsArr) {
        return withNullValue((TypeDescription[]) new TypeList.ForLoadedTypes(clsArr).toArray(new TypeDescription[clsArr.length]));
    }

    public InvokeDynamic withNullValue(TypeDescription... typeDescriptionArr) {
        ArrayList arrayList = new ArrayList(typeDescriptionArr.length);
        for (TypeDescription typeDescription : typeDescriptionArr) {
            if (typeDescription.isPrimitive()) {
                throw new IllegalArgumentException("Cannot assign null to primitive type: " + typeDescription);
            }
            arrayList.add(new InvocationProvider.ArgumentProvider.ForNullValue(typeDescription));
        }
        return new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider.appendArguments(arrayList), this.terminationHandler, this.assigner, this.typing);
    }

    public InvokeDynamic withArgument(int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            if (i < 0) {
                throw new IllegalArgumentException("Method parameter indices cannot be negative: " + i);
            }
            arrayList.add(new InvocationProvider.ArgumentProvider.ForMethodParameter(i));
        }
        return new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider.appendArguments(arrayList), this.terminationHandler, this.assigner, this.typing);
    }

    public WithImplicitType withArgument(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Method parameter indices cannot be negative: " + i);
        }
        return new WithImplicitType.OfArgument(this.bootstrapMethod, this.handleArguments, this.invocationProvider, this.terminationHandler, this.assigner, this.typing, i);
    }

    public InvokeDynamic withThis(Class<?>... clsArr) {
        return withThis((TypeDescription[]) new TypeList.ForLoadedTypes(clsArr).toArray(new TypeDescription[clsArr.length]));
    }

    public InvokeDynamic withThis(TypeDescription... typeDescriptionArr) {
        ArrayList arrayList = new ArrayList(typeDescriptionArr.length);
        for (TypeDescription typeDescription : typeDescriptionArr) {
            arrayList.add(new InvocationProvider.ArgumentProvider.ForThisInstance(typeDescription));
        }
        return new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider.appendArguments(arrayList), this.terminationHandler, this.assigner, this.typing);
    }

    public InvokeDynamic withMethodArguments() {
        return new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider.appendArgument(InvocationProvider.ArgumentProvider.ForInterceptedMethodParameters.INSTANCE), this.terminationHandler, this.assigner, this.typing);
    }

    public InvokeDynamic withImplicitAndMethodArguments() {
        return new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider.appendArgument(InvocationProvider.ArgumentProvider.ForInterceptedMethodInstanceAndParameters.INSTANCE), this.terminationHandler, this.assigner, this.typing);
    }

    public InvokeDynamic withField(String... strArr) {
        return withField(FieldLocator.ForClassHierarchy.Factory.INSTANCE, strArr);
    }

    public InvokeDynamic withField(FieldLocator.Factory factory, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new InvocationProvider.ArgumentProvider.ForField(str, factory));
        }
        return new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider.appendArguments(arrayList), this.terminationHandler, this.assigner, this.typing);
    }

    public WithImplicitType withField(String str) {
        return withField(str, FieldLocator.ForClassHierarchy.Factory.INSTANCE);
    }

    public WithImplicitType withField(String str, FieldLocator.Factory factory) {
        return new WithImplicitType.OfField(this.bootstrapMethod, this.handleArguments, this.invocationProvider, this.terminationHandler, this.assigner, this.typing, str, factory);
    }

    public Implementation.Composable withAssigner(Assigner assigner, Assigner.Typing typing) {
        return new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider, this.terminationHandler, assigner, typing);
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Composable
    public Implementation andThen(Implementation implementation) {
        return new Implementation.Compound(new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider, TerminationHandler.DROPPING, this.assigner, this.typing), implementation);
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Composable
    public Implementation.Composable andThen(Implementation.Composable composable) {
        return new Implementation.Compound.Composable(new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider, TerminationHandler.DROPPING, this.assigner, this.typing), composable);
    }

    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public InstrumentedType prepare(InstrumentedType instrumentedType) {
        return this.invocationProvider.prepare(instrumentedType);
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
    public ByteCodeAppender appender(Implementation.Target target) {
        return new Appender(target.getInstrumentedType());
    }

    protected interface InvocationProvider {
        InvocationProvider appendArgument(ArgumentProvider argumentProvider);

        InvocationProvider appendArguments(List<ArgumentProvider> list);

        Target make(MethodDescription methodDescription);

        InstrumentedType prepare(InstrumentedType instrumentedType);

        InvocationProvider withNameProvider(NameProvider nameProvider);

        InvocationProvider withReturnTypeProvider(ReturnTypeProvider returnTypeProvider);

        InvocationProvider withoutArguments();

        public interface Target {
            Resolved resolve(TypeDescription typeDescription, Assigner assigner, Assigner.Typing typing);

            public interface Resolved {
                String getInternalName();

                List<TypeDescription> getParameterTypes();

                TypeDescription getReturnType();

                StackManipulation getStackManipulation();

                @HashCodeAndEqualsPlugin.Enhance
                public static class Simple implements Resolved {
                    private final String internalName;
                    private final List<TypeDescription> parameterTypes;
                    private final TypeDescription returnType;
                    private final StackManipulation stackManipulation;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        Simple simple = (Simple) obj;
                        return this.stackManipulation.equals(simple.stackManipulation) && this.internalName.equals(simple.internalName) && this.returnType.equals(simple.returnType) && this.parameterTypes.equals(simple.parameterTypes);
                    }

                    public int hashCode() {
                        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.stackManipulation.hashCode()) * 31) + this.internalName.hashCode()) * 31) + this.returnType.hashCode()) * 31) + this.parameterTypes.hashCode();
                    }

                    public Simple(StackManipulation stackManipulation, String str, TypeDescription typeDescription, List<TypeDescription> list) {
                        this.stackManipulation = stackManipulation;
                        this.internalName = str;
                        this.returnType = typeDescription;
                        this.parameterTypes = list;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.Target.Resolved
                    public StackManipulation getStackManipulation() {
                        return this.stackManipulation;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.Target.Resolved
                    public TypeDescription getReturnType() {
                        return this.returnType;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.Target.Resolved
                    public String getInternalName() {
                        return this.internalName;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.Target.Resolved
                    public List<TypeDescription> getParameterTypes() {
                        return this.parameterTypes;
                    }
                }
            }
        }

        public interface ArgumentProvider {
            InstrumentedType prepare(InstrumentedType instrumentedType);

            Resolved resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing);

            public enum ForInterceptedMethodInstanceAndParameters implements ArgumentProvider {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public Resolved resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing) {
                    List of;
                    StackManipulation prependThisReference = MethodVariableAccess.allArgumentsOf(methodDescription).prependThisReference();
                    if (methodDescription.isStatic()) {
                        of = methodDescription.getParameters().asTypeList().asErasures();
                    } else {
                        of = CompoundList.of(methodDescription.getDeclaringType().asErasure(), methodDescription.getParameters().asTypeList().asErasures());
                    }
                    return new Resolved.Simple(prependThisReference, (List<TypeDescription>) of);
                }
            }

            public enum ForInterceptedMethodParameters implements ArgumentProvider {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public Resolved resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing) {
                    return new Resolved.Simple(MethodVariableAccess.allArgumentsOf(methodDescription), methodDescription.getParameters().asTypeList().asErasures());
                }
            }

            public enum ConstantPoolWrapper {
                BOOLEAN(Boolean.TYPE, Boolean.class) { // from class: org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.1
                    @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper
                    protected ArgumentProvider make(Object obj) {
                        return new WrappingArgumentProvider(IntegerConstant.forValue(((Boolean) obj).booleanValue()));
                    }
                },
                BYTE(Byte.TYPE, Byte.class) { // from class: org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.2
                    @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper
                    protected ArgumentProvider make(Object obj) {
                        return new WrappingArgumentProvider(IntegerConstant.forValue(((Byte) obj).byteValue()));
                    }
                },
                SHORT(Short.TYPE, Short.class) { // from class: org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.3
                    @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper
                    protected ArgumentProvider make(Object obj) {
                        return new WrappingArgumentProvider(IntegerConstant.forValue(((Short) obj).shortValue()));
                    }
                },
                CHARACTER(Character.TYPE, Character.class) { // from class: org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.4
                    @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper
                    protected ArgumentProvider make(Object obj) {
                        return new WrappingArgumentProvider(IntegerConstant.forValue(((Character) obj).charValue()));
                    }
                },
                INTEGER(Integer.TYPE, Integer.class) { // from class: org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.5
                    @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper
                    protected ArgumentProvider make(Object obj) {
                        return new WrappingArgumentProvider(IntegerConstant.forValue(((Integer) obj).intValue()));
                    }
                },
                LONG(Long.TYPE, Long.class) { // from class: org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.6
                    @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper
                    protected ArgumentProvider make(Object obj) {
                        return new WrappingArgumentProvider(LongConstant.forValue(((Long) obj).longValue()));
                    }
                },
                FLOAT(Float.TYPE, Float.class) { // from class: org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.7
                    @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper
                    protected ArgumentProvider make(Object obj) {
                        return new WrappingArgumentProvider(FloatConstant.forValue(((Float) obj).floatValue()));
                    }
                },
                DOUBLE(Double.TYPE, Double.class) { // from class: org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.8
                    @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper
                    protected ArgumentProvider make(Object obj) {
                        return new WrappingArgumentProvider(DoubleConstant.forValue(((Double) obj).doubleValue()));
                    }
                };

                private final TypeDescription primitiveType;
                private final TypeDescription wrapperType;

                protected abstract ArgumentProvider make(Object obj);

                ConstantPoolWrapper(Class cls, Class cls2) {
                    this.primitiveType = TypeDescription.ForLoadedType.of(cls);
                    this.wrapperType = TypeDescription.ForLoadedType.of(cls2);
                }

                public static ArgumentProvider of(Object obj) {
                    if (obj instanceof Boolean) {
                        return BOOLEAN.make(obj);
                    }
                    if (obj instanceof Byte) {
                        return BYTE.make(obj);
                    }
                    if (obj instanceof Short) {
                        return SHORT.make(obj);
                    }
                    if (obj instanceof Character) {
                        return CHARACTER.make(obj);
                    }
                    if (obj instanceof Integer) {
                        return INTEGER.make(obj);
                    }
                    if (obj instanceof Long) {
                        return LONG.make(obj);
                    }
                    if (obj instanceof Float) {
                        return FLOAT.make(obj);
                    }
                    if (obj instanceof Double) {
                        return DOUBLE.make(obj);
                    }
                    if (obj instanceof String) {
                        return new ForStringConstant((String) obj);
                    }
                    if (obj instanceof Class) {
                        return new ForClassConstant(TypeDescription.ForLoadedType.of((Class) obj));
                    }
                    if (obj instanceof Enum) {
                        return new ForEnumerationValue(new EnumerationDescription.ForLoadedEnumeration((Enum) obj));
                    }
                    if (JavaType.METHOD_HANDLE.getTypeStub().isInstance(obj)) {
                        return new ForJavaConstant(JavaConstant.MethodHandle.ofLoaded(obj));
                    }
                    if (JavaType.METHOD_TYPE.getTypeStub().isInstance(obj)) {
                        return new ForJavaConstant(JavaConstant.MethodType.ofLoaded(obj));
                    }
                    return ForInstance.of(obj);
                }

                @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                protected class WrappingArgumentProvider implements ArgumentProvider {
                    private final StackManipulation stackManipulation;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        WrappingArgumentProvider wrappingArgumentProvider = (WrappingArgumentProvider) obj;
                        return this.stackManipulation.equals(wrappingArgumentProvider.stackManipulation) && ConstantPoolWrapper.this.equals(ConstantPoolWrapper.this);
                    }

                    public int hashCode() {
                        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.stackManipulation.hashCode()) * 31) + ConstantPoolWrapper.this.hashCode();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                    public InstrumentedType prepare(InstrumentedType instrumentedType) {
                        return instrumentedType;
                    }

                    protected WrappingArgumentProvider(StackManipulation stackManipulation) {
                        this.stackManipulation = stackManipulation;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                    public Resolved resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing) {
                        return new Resolved.Simple(new StackManipulation.Compound(this.stackManipulation, assigner.assign(ConstantPoolWrapper.this.primitiveType.asGenericType(), ConstantPoolWrapper.this.wrapperType.asGenericType(), typing)), ConstantPoolWrapper.this.wrapperType);
                    }
                }
            }

            public interface Resolved {
                StackManipulation getLoadInstruction();

                List<TypeDescription> getLoadedTypes();

                @HashCodeAndEqualsPlugin.Enhance
                public static class Simple implements Resolved {
                    private final List<TypeDescription> loadedTypes;
                    private final StackManipulation stackManipulation;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        Simple simple = (Simple) obj;
                        return this.stackManipulation.equals(simple.stackManipulation) && this.loadedTypes.equals(simple.loadedTypes);
                    }

                    public int hashCode() {
                        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.stackManipulation.hashCode()) * 31) + this.loadedTypes.hashCode();
                    }

                    public Simple(StackManipulation stackManipulation, TypeDescription typeDescription) {
                        this(stackManipulation, (List<TypeDescription>) Collections.singletonList(typeDescription));
                    }

                    public Simple(StackManipulation stackManipulation, List<TypeDescription> list) {
                        this.stackManipulation = stackManipulation;
                        this.loadedTypes = list;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved
                    public StackManipulation getLoadInstruction() {
                        return this.stackManipulation;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved
                    public List<TypeDescription> getLoadedTypes() {
                        return this.loadedTypes;
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForThisInstance implements ArgumentProvider {
                private final TypeDescription typeDescription;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((ForThisInstance) obj).typeDescription);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDescription.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                protected ForThisInstance(TypeDescription typeDescription) {
                    this.typeDescription = typeDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public Resolved resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing) {
                    if (methodDescription.isStatic()) {
                        throw new IllegalStateException("Cannot get this instance from static method: " + methodDescription);
                    }
                    if (!typeDescription.isAssignableTo(this.typeDescription)) {
                        throw new IllegalStateException(typeDescription + " is not assignable to " + typeDescription);
                    }
                    return new Resolved.Simple(MethodVariableAccess.loadThis(), this.typeDescription);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForInstance implements ArgumentProvider {
                private static final String FIELD_PREFIX = "invokeDynamic";
                private final TypeDescription fieldType;

                @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
                private final String name = "invokeDynamic$" + RandomString.make();
                private final Object value;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    ForInstance forInstance = (ForInstance) obj;
                    return this.value.equals(forInstance.value) && this.fieldType.equals(forInstance.fieldType);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.value.hashCode()) * 31) + this.fieldType.hashCode();
                }

                protected ForInstance(Object obj, TypeDescription typeDescription) {
                    this.value = obj;
                    this.fieldType = typeDescription;
                }

                protected static ArgumentProvider of(Object obj) {
                    return new ForInstance(obj, TypeDescription.ForLoadedType.of(obj.getClass()));
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public Resolved resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing) {
                    FieldDescription fieldDescription = (FieldDescription) typeDescription.getDeclaredFields().filter(ElementMatchers.named(this.name)).getOnly();
                    StackManipulation assign = assigner.assign(fieldDescription.getType(), this.fieldType.asGenericType(), typing);
                    if (!assign.isValid()) {
                        throw new IllegalStateException("Cannot assign " + fieldDescription + " to " + this.fieldType);
                    }
                    return new Resolved.Simple(new StackManipulation.Compound(FieldAccess.forField(fieldDescription).read(), assign), fieldDescription.getType().asErasure());
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType.withField(new FieldDescription.Token(this.name, 4169, this.fieldType.asGenericType())).withInitializer(new LoadedTypeInitializer.ForStaticField(this.name, this.value));
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForField implements ArgumentProvider {
                protected final FieldLocator.Factory fieldLocatorFactory;
                protected final String fieldName;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    ForField forField = (ForField) obj;
                    return this.fieldName.equals(forField.fieldName) && this.fieldLocatorFactory.equals(forField.fieldLocatorFactory);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fieldName.hashCode()) * 31) + this.fieldLocatorFactory.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                protected ForField(String str, FieldLocator.Factory factory) {
                    this.fieldName = str;
                    this.fieldLocatorFactory = factory;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public Resolved resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing) {
                    FieldLocator.Resolution locate = this.fieldLocatorFactory.make(typeDescription).locate(this.fieldName);
                    if (!locate.isResolved()) {
                        throw new IllegalStateException("Cannot find a field " + this.fieldName + " for " + typeDescription);
                    }
                    if (!locate.getField().isStatic() && methodDescription.isStatic()) {
                        throw new IllegalStateException("Cannot access non-static " + locate.getField() + " from " + methodDescription);
                    }
                    StackManipulation[] stackManipulationArr = new StackManipulation[2];
                    stackManipulationArr[0] = locate.getField().isStatic() ? StackManipulation.Trivial.INSTANCE : MethodVariableAccess.loadThis();
                    stackManipulationArr[1] = FieldAccess.forField(locate.getField()).read();
                    return doResolve(new StackManipulation.Compound(stackManipulationArr), locate.getField().getType(), assigner, typing);
                }

                protected Resolved doResolve(StackManipulation stackManipulation, TypeDescription.Generic generic, Assigner assigner, Assigner.Typing typing) {
                    return new Resolved.Simple(stackManipulation, generic.asErasure());
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static class WithExplicitType extends ForField {
                    private final TypeDescription typeDescription;

                    @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForField
                    public boolean equals(Object obj) {
                        if (!super.equals(obj)) {
                            return false;
                        }
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((WithExplicitType) obj).typeDescription);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForField
                    public int hashCode() {
                        return (super.hashCode() * 31) + this.typeDescription.hashCode();
                    }

                    protected WithExplicitType(String str, FieldLocator.Factory factory, TypeDescription typeDescription) {
                        super(str, factory);
                        this.typeDescription = typeDescription;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForField
                    protected Resolved doResolve(StackManipulation stackManipulation, TypeDescription.Generic generic, Assigner assigner, Assigner.Typing typing) {
                        StackManipulation assign = assigner.assign(generic, this.typeDescription.asGenericType(), typing);
                        if (!assign.isValid()) {
                            throw new IllegalStateException("Cannot assign " + generic + " to " + this.typeDescription);
                        }
                        return new Resolved.Simple(new StackManipulation.Compound(stackManipulation, assign), this.typeDescription);
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForMethodParameter implements ArgumentProvider {
                protected final int index;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.index == ((ForMethodParameter) obj).index;
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.index;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                protected ForMethodParameter(int i) {
                    this.index = i;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public Resolved resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing) {
                    ParameterList<?> parameters = methodDescription.getParameters();
                    if (this.index >= parameters.size()) {
                        throw new IllegalStateException("No parameter " + this.index + " for " + methodDescription);
                    }
                    return doResolve(MethodVariableAccess.load((ParameterDescription) parameters.get(this.index)), ((ParameterDescription) parameters.get(this.index)).getType(), assigner, typing);
                }

                protected Resolved doResolve(StackManipulation stackManipulation, TypeDescription.Generic generic, Assigner assigner, Assigner.Typing typing) {
                    return new Resolved.Simple(stackManipulation, generic.asErasure());
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static class WithExplicitType extends ForMethodParameter {
                    private final TypeDescription typeDescription;

                    @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForMethodParameter
                    public boolean equals(Object obj) {
                        if (!super.equals(obj)) {
                            return false;
                        }
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((WithExplicitType) obj).typeDescription);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForMethodParameter
                    public int hashCode() {
                        return (super.hashCode() * 31) + this.typeDescription.hashCode();
                    }

                    protected WithExplicitType(int i, TypeDescription typeDescription) {
                        super(i);
                        this.typeDescription = typeDescription;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForMethodParameter
                    protected Resolved doResolve(StackManipulation stackManipulation, TypeDescription.Generic generic, Assigner assigner, Assigner.Typing typing) {
                        StackManipulation assign = assigner.assign(generic, this.typeDescription.asGenericType(), typing);
                        if (!assign.isValid()) {
                            throw new IllegalStateException("Cannot assign " + generic + " to " + this.typeDescription);
                        }
                        return new Resolved.Simple(new StackManipulation.Compound(stackManipulation, assign), this.typeDescription);
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForBooleanConstant implements ArgumentProvider {
                private final boolean value;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.value == ((ForBooleanConstant) obj).value;
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (this.value ? 1 : 0);
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                protected ForBooleanConstant(boolean z) {
                    this.value = z;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public Resolved resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing) {
                    return new Resolved.Simple(IntegerConstant.forValue(this.value), TypeDescription.ForLoadedType.of(Boolean.TYPE));
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForByteConstant implements ArgumentProvider {
                private final byte value;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.value == ((ForByteConstant) obj).value;
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.value;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                protected ForByteConstant(byte b) {
                    this.value = b;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public Resolved resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing) {
                    return new Resolved.Simple(IntegerConstant.forValue(this.value), TypeDescription.ForLoadedType.of(Byte.TYPE));
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForShortConstant implements ArgumentProvider {
                private final short value;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.value == ((ForShortConstant) obj).value;
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.value;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                protected ForShortConstant(short s) {
                    this.value = s;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public Resolved resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing) {
                    return new Resolved.Simple(IntegerConstant.forValue(this.value), TypeDescription.ForLoadedType.of(Short.TYPE));
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForCharacterConstant implements ArgumentProvider {
                private final char value;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.value == ((ForCharacterConstant) obj).value;
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.value;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                protected ForCharacterConstant(char c) {
                    this.value = c;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public Resolved resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing) {
                    return new Resolved.Simple(IntegerConstant.forValue(this.value), TypeDescription.ForLoadedType.of(Character.TYPE));
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForIntegerConstant implements ArgumentProvider {
                private final int value;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.value == ((ForIntegerConstant) obj).value;
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.value;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                protected ForIntegerConstant(int i) {
                    this.value = i;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public Resolved resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing) {
                    return new Resolved.Simple(IntegerConstant.forValue(this.value), TypeDescription.ForLoadedType.of(Integer.TYPE));
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForLongConstant implements ArgumentProvider {
                private final long value;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.value == ((ForLongConstant) obj).value;
                }

                public int hashCode() {
                    long j = this.value;
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + ((int) (j ^ (j >>> 32)));
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                protected ForLongConstant(long j) {
                    this.value = j;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public Resolved resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing) {
                    return new Resolved.Simple(LongConstant.forValue(this.value), TypeDescription.ForLoadedType.of(Long.TYPE));
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForFloatConstant implements ArgumentProvider {
                private final float value;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.value == ((ForFloatConstant) obj).value;
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Float.floatToIntBits(this.value);
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                protected ForFloatConstant(float f) {
                    this.value = f;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public Resolved resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing) {
                    return new Resolved.Simple(FloatConstant.forValue(this.value), TypeDescription.ForLoadedType.of(Float.TYPE));
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForDoubleConstant implements ArgumentProvider {
                private final double value;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.value == ((ForDoubleConstant) obj).value;
                }

                public int hashCode() {
                    long doubleToLongBits = Double.doubleToLongBits(this.value);
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                protected ForDoubleConstant(double d) {
                    this.value = d;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public Resolved resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing) {
                    return new Resolved.Simple(DoubleConstant.forValue(this.value), TypeDescription.ForLoadedType.of(Double.TYPE));
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForStringConstant implements ArgumentProvider {
                private final String value;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.value.equals(((ForStringConstant) obj).value);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.value.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                protected ForStringConstant(String str) {
                    this.value = str;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public Resolved resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing) {
                    return new Resolved.Simple(new TextConstant(this.value), TypeDescription.STRING);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForClassConstant implements ArgumentProvider {
                private final TypeDescription typeDescription;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((ForClassConstant) obj).typeDescription);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDescription.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                protected ForClassConstant(TypeDescription typeDescription) {
                    this.typeDescription = typeDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public Resolved resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing) {
                    return new Resolved.Simple(ClassConstant.of(this.typeDescription), TypeDescription.CLASS);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForEnumerationValue implements ArgumentProvider {
                private final EnumerationDescription enumerationDescription;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.enumerationDescription.equals(((ForEnumerationValue) obj).enumerationDescription);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.enumerationDescription.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                protected ForEnumerationValue(EnumerationDescription enumerationDescription) {
                    this.enumerationDescription = enumerationDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public Resolved resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing) {
                    return new Resolved.Simple(FieldAccess.forEnumeration(this.enumerationDescription), this.enumerationDescription.getEnumerationType());
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForNullValue implements ArgumentProvider {
                private final TypeDescription typeDescription;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((ForNullValue) obj).typeDescription);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDescription.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                protected ForNullValue(TypeDescription typeDescription) {
                    this.typeDescription = typeDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public Resolved resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing) {
                    return new Resolved.Simple(NullConstant.INSTANCE, this.typeDescription);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForJavaConstant implements ArgumentProvider {
                private final JavaConstant javaConstant;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.javaConstant.equals(((ForJavaConstant) obj).javaConstant);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.javaConstant.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                protected ForJavaConstant(JavaConstant javaConstant) {
                    this.javaConstant = javaConstant;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public Resolved resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing) {
                    return new Resolved.Simple(new JavaConstantValue(this.javaConstant), this.javaConstant.getType());
                }
            }
        }

        public interface NameProvider {
            String resolve(MethodDescription methodDescription);

            public enum ForInterceptedMethod implements NameProvider {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.NameProvider
                public String resolve(MethodDescription methodDescription) {
                    return methodDescription.getInternalName();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForExplicitName implements NameProvider {
                private final String internalName;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.internalName.equals(((ForExplicitName) obj).internalName);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.internalName.hashCode();
                }

                protected ForExplicitName(String str) {
                    this.internalName = str;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.NameProvider
                public String resolve(MethodDescription methodDescription) {
                    return this.internalName;
                }
            }
        }

        public interface ReturnTypeProvider {
            TypeDescription resolve(MethodDescription methodDescription);

            public enum ForInterceptedMethod implements ReturnTypeProvider {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ReturnTypeProvider
                public TypeDescription resolve(MethodDescription methodDescription) {
                    return methodDescription.getReturnType().asErasure();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForExplicitType implements ReturnTypeProvider {
                private final TypeDescription typeDescription;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((ForExplicitType) obj).typeDescription);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDescription.hashCode();
                }

                protected ForExplicitType(TypeDescription typeDescription) {
                    this.typeDescription = typeDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ReturnTypeProvider
                public TypeDescription resolve(MethodDescription methodDescription) {
                    return this.typeDescription;
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Default implements InvocationProvider {
            private final List<ArgumentProvider> argumentProviders;
            private final NameProvider nameProvider;
            private final ReturnTypeProvider returnTypeProvider;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Default r5 = (Default) obj;
                return this.nameProvider.equals(r5.nameProvider) && this.returnTypeProvider.equals(r5.returnTypeProvider) && this.argumentProviders.equals(r5.argumentProviders);
            }

            public int hashCode() {
                return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.nameProvider.hashCode()) * 31) + this.returnTypeProvider.hashCode()) * 31) + this.argumentProviders.hashCode();
            }

            protected Default() {
                this(NameProvider.ForInterceptedMethod.INSTANCE, ReturnTypeProvider.ForInterceptedMethod.INSTANCE, Collections.singletonList(ArgumentProvider.ForInterceptedMethodInstanceAndParameters.INSTANCE));
            }

            protected Default(NameProvider nameProvider, ReturnTypeProvider returnTypeProvider, List<ArgumentProvider> list) {
                this.nameProvider = nameProvider;
                this.returnTypeProvider = returnTypeProvider;
                this.argumentProviders = list;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider
            public Target make(MethodDescription methodDescription) {
                return new Target(this.nameProvider.resolve(methodDescription), this.returnTypeProvider.resolve(methodDescription), this.argumentProviders, methodDescription);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider
            public InvocationProvider appendArguments(List<ArgumentProvider> list) {
                return new Default(this.nameProvider, this.returnTypeProvider, CompoundList.of((List) this.argumentProviders, (List) list));
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider
            public InvocationProvider appendArgument(ArgumentProvider argumentProvider) {
                return new Default(this.nameProvider, this.returnTypeProvider, CompoundList.of(this.argumentProviders, argumentProvider));
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider
            public InvocationProvider withoutArguments() {
                return new Default(this.nameProvider, this.returnTypeProvider, Collections.emptyList());
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider
            public InvocationProvider withNameProvider(NameProvider nameProvider) {
                return new Default(nameProvider, this.returnTypeProvider, this.argumentProviders);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider
            public InvocationProvider withReturnTypeProvider(ReturnTypeProvider returnTypeProvider) {
                return new Default(this.nameProvider, returnTypeProvider, this.argumentProviders);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                Iterator<ArgumentProvider> it = this.argumentProviders.iterator();
                while (it.hasNext()) {
                    instrumentedType = it.next().prepare(instrumentedType);
                }
                return instrumentedType;
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class Target implements Target {
                private final List<ArgumentProvider> argumentProviders;
                private final MethodDescription instrumentedMethod;
                private final String internalName;
                private final TypeDescription returnType;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Target target = (Target) obj;
                    return this.internalName.equals(target.internalName) && this.returnType.equals(target.returnType) && this.argumentProviders.equals(target.argumentProviders) && this.instrumentedMethod.equals(target.instrumentedMethod);
                }

                public int hashCode() {
                    return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.internalName.hashCode()) * 31) + this.returnType.hashCode()) * 31) + this.argumentProviders.hashCode()) * 31) + this.instrumentedMethod.hashCode();
                }

                protected Target(String str, TypeDescription typeDescription, List<ArgumentProvider> list, MethodDescription methodDescription) {
                    this.internalName = str;
                    this.returnType = typeDescription;
                    this.argumentProviders = list;
                    this.instrumentedMethod = methodDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.InvocationProvider.Target
                public Target.Resolved resolve(TypeDescription typeDescription, Assigner assigner, Assigner.Typing typing) {
                    StackManipulation[] stackManipulationArr = new StackManipulation[this.argumentProviders.size()];
                    ArrayList arrayList = new ArrayList();
                    Iterator<ArgumentProvider> it = this.argumentProviders.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        ArgumentProvider.Resolved resolve = it.next().resolve(typeDescription, this.instrumentedMethod, assigner, typing);
                        arrayList.addAll(resolve.getLoadedTypes());
                        stackManipulationArr[i] = resolve.getLoadInstruction();
                        i++;
                    }
                    return new Target.Resolved.Simple(new StackManipulation.Compound(stackManipulationArr), this.internalName, this.returnType, arrayList);
                }
            }
        }
    }

    protected static abstract class AbstractDelegator extends InvokeDynamic {
        protected abstract InvokeDynamic materialize();

        protected AbstractDelegator(MethodDescription.InDefinedShape inDefinedShape, List<?> list, InvocationProvider invocationProvider, TerminationHandler terminationHandler, Assigner assigner, Assigner.Typing typing) {
            super(inDefinedShape, list, invocationProvider, terminationHandler, assigner, typing);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public InvokeDynamic withBooleanValue(boolean... zArr) {
            return materialize().withBooleanValue(zArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public InvokeDynamic withByteValue(byte... bArr) {
            return materialize().withByteValue(bArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public InvokeDynamic withShortValue(short... sArr) {
            return materialize().withShortValue(sArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public InvokeDynamic withCharacterValue(char... cArr) {
            return materialize().withCharacterValue(cArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public InvokeDynamic withIntegerValue(int... iArr) {
            return materialize().withIntegerValue(iArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public InvokeDynamic withLongValue(long... jArr) {
            return materialize().withLongValue(jArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public InvokeDynamic withFloatValue(float... fArr) {
            return materialize().withFloatValue(fArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public InvokeDynamic withDoubleValue(double... dArr) {
            return materialize().withDoubleValue(dArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public InvokeDynamic withValue(Object... objArr) {
            return materialize().withValue(objArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public WithImplicitType withReference(Object obj) {
            return materialize().withReference(obj);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public InvokeDynamic withReference(Object... objArr) {
            return materialize().withReference(objArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public InvokeDynamic withType(TypeDescription... typeDescriptionArr) {
            return materialize().withType(typeDescriptionArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public InvokeDynamic withInstance(JavaConstant... javaConstantArr) {
            return materialize().withInstance(javaConstantArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public InvokeDynamic withNullValue(Class<?>... clsArr) {
            return materialize().withNullValue(clsArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public InvokeDynamic withNullValue(TypeDescription... typeDescriptionArr) {
            return materialize().withNullValue(typeDescriptionArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public InvokeDynamic withArgument(int... iArr) {
            return materialize().withArgument(iArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public WithImplicitType withArgument(int i) {
            return materialize().withArgument(i);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public InvokeDynamic withThis(Class<?>... clsArr) {
            return materialize().withThis(clsArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public InvokeDynamic withThis(TypeDescription... typeDescriptionArr) {
            return materialize().withThis(typeDescriptionArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public InvokeDynamic withMethodArguments() {
            return materialize().withMethodArguments();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public InvokeDynamic withImplicitAndMethodArguments() {
            return materialize().withImplicitAndMethodArguments();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public InvokeDynamic withField(String... strArr) {
            return materialize().withField(strArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public InvokeDynamic withEnumeration(EnumerationDescription... enumerationDescriptionArr) {
            return materialize().withEnumeration(enumerationDescriptionArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public InvokeDynamic withField(FieldLocator.Factory factory, String... strArr) {
            return materialize().withField(factory, strArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public WithImplicitType withField(String str) {
            return materialize().withField(str);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public WithImplicitType withField(String str, FieldLocator.Factory factory) {
            return materialize().withField(str, factory);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public Implementation.Composable withAssigner(Assigner assigner, Assigner.Typing typing) {
            return materialize().withAssigner(assigner, typing);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic, org.modelmapper.internal.bytebuddy.implementation.Implementation.Composable
        public Implementation andThen(Implementation implementation) {
            return materialize().andThen(implementation);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic, org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public InstrumentedType prepare(InstrumentedType instrumentedType) {
            return materialize().prepare(instrumentedType);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic, org.modelmapper.internal.bytebuddy.implementation.Implementation
        public ByteCodeAppender appender(Implementation.Target target) {
            return materialize().appender(target);
        }
    }

    public static class WithImplicitArguments extends AbstractDelegator {
        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic, org.modelmapper.internal.bytebuddy.implementation.Implementation.Composable
        public /* bridge */ /* synthetic */ Implementation andThen(Implementation implementation) {
            return super.andThen(implementation);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic, org.modelmapper.internal.bytebuddy.implementation.Implementation
        public /* bridge */ /* synthetic */ ByteCodeAppender appender(Implementation.Target target) {
            return super.appender(target);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic, org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public /* bridge */ /* synthetic */ InstrumentedType prepare(InstrumentedType instrumentedType) {
            return super.prepare(instrumentedType);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ WithImplicitType withArgument(int i) {
            return super.withArgument(i);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withArgument(int[] iArr) {
            return super.withArgument(iArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withBooleanValue(boolean[] zArr) {
            return super.withBooleanValue(zArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withByteValue(byte[] bArr) {
            return super.withByteValue(bArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withCharacterValue(char[] cArr) {
            return super.withCharacterValue(cArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withDoubleValue(double[] dArr) {
            return super.withDoubleValue(dArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withEnumeration(EnumerationDescription[] enumerationDescriptionArr) {
            return super.withEnumeration(enumerationDescriptionArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ WithImplicitType withField(String str) {
            return super.withField(str);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ WithImplicitType withField(String str, FieldLocator.Factory factory) {
            return super.withField(str, factory);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withField(FieldLocator.Factory factory, String[] strArr) {
            return super.withField(factory, strArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withField(String[] strArr) {
            return super.withField(strArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withFloatValue(float[] fArr) {
            return super.withFloatValue(fArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withImplicitAndMethodArguments() {
            return super.withImplicitAndMethodArguments();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withInstance(JavaConstant[] javaConstantArr) {
            return super.withInstance(javaConstantArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withIntegerValue(int[] iArr) {
            return super.withIntegerValue(iArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withLongValue(long[] jArr) {
            return super.withLongValue(jArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withMethodArguments() {
            return super.withMethodArguments();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withNullValue(Class[] clsArr) {
            return super.withNullValue((Class<?>[]) clsArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withNullValue(TypeDescription[] typeDescriptionArr) {
            return super.withNullValue(typeDescriptionArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ WithImplicitType withReference(Object obj) {
            return super.withReference(obj);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withReference(Object[] objArr) {
            return super.withReference(objArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withShortValue(short[] sArr) {
            return super.withShortValue(sArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withThis(Class[] clsArr) {
            return super.withThis((Class<?>[]) clsArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withThis(TypeDescription[] typeDescriptionArr) {
            return super.withThis(typeDescriptionArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withType(TypeDescription[] typeDescriptionArr) {
            return super.withType(typeDescriptionArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withValue(Object[] objArr) {
            return super.withValue(objArr);
        }

        protected WithImplicitArguments(MethodDescription.InDefinedShape inDefinedShape, List<?> list, InvocationProvider invocationProvider, TerminationHandler terminationHandler, Assigner assigner, Assigner.Typing typing) {
            super(inDefinedShape, list, invocationProvider, terminationHandler, assigner, typing);
        }

        public InvokeDynamic withoutArguments() {
            return new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider.withoutArguments(), this.terminationHandler, this.assigner, this.typing);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator
        protected InvokeDynamic materialize() {
            return withoutArguments();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public WithImplicitArguments withAssigner(Assigner assigner, Assigner.Typing typing) {
            return new WithImplicitArguments(this.bootstrapMethod, this.handleArguments, this.invocationProvider, this.terminationHandler, assigner, typing);
        }
    }

    public static class WithImplicitTarget extends WithImplicitArguments {
        protected WithImplicitTarget(MethodDescription.InDefinedShape inDefinedShape, List<?> list, InvocationProvider invocationProvider, TerminationHandler terminationHandler, Assigner assigner, Assigner.Typing typing) {
            super(inDefinedShape, list, invocationProvider, terminationHandler, assigner, typing);
        }

        public WithImplicitArguments invoke(Class<?> cls) {
            return invoke(TypeDescription.ForLoadedType.of(cls));
        }

        public WithImplicitArguments invoke(TypeDescription typeDescription) {
            return new WithImplicitArguments(this.bootstrapMethod, this.handleArguments, this.invocationProvider.withReturnTypeProvider(new InvocationProvider.ReturnTypeProvider.ForExplicitType(typeDescription)), this.terminationHandler, this.assigner, this.typing);
        }

        public WithImplicitArguments invoke(String str) {
            return new WithImplicitArguments(this.bootstrapMethod, this.handleArguments, this.invocationProvider.withNameProvider(new InvocationProvider.NameProvider.ForExplicitName(str)), this.terminationHandler, this.assigner, this.typing);
        }

        public WithImplicitArguments invoke(String str, Class<?> cls) {
            return invoke(str, TypeDescription.ForLoadedType.of(cls));
        }

        public WithImplicitArguments invoke(String str, TypeDescription typeDescription) {
            return new WithImplicitArguments(this.bootstrapMethod, this.handleArguments, this.invocationProvider.withNameProvider(new InvocationProvider.NameProvider.ForExplicitName(str)).withReturnTypeProvider(new InvocationProvider.ReturnTypeProvider.ForExplicitType(typeDescription)), this.terminationHandler, this.assigner, this.typing);
        }
    }

    public static abstract class WithImplicitType extends AbstractDelegator {
        public abstract InvokeDynamic as(TypeDescription typeDescription);

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic, org.modelmapper.internal.bytebuddy.implementation.Implementation.Composable
        public /* bridge */ /* synthetic */ Implementation andThen(Implementation implementation) {
            return super.andThen(implementation);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic, org.modelmapper.internal.bytebuddy.implementation.Implementation
        public /* bridge */ /* synthetic */ ByteCodeAppender appender(Implementation.Target target) {
            return super.appender(target);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic, org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public /* bridge */ /* synthetic */ InstrumentedType prepare(InstrumentedType instrumentedType) {
            return super.prepare(instrumentedType);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ WithImplicitType withArgument(int i) {
            return super.withArgument(i);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withArgument(int[] iArr) {
            return super.withArgument(iArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ Implementation.Composable withAssigner(Assigner assigner, Assigner.Typing typing) {
            return super.withAssigner(assigner, typing);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withBooleanValue(boolean[] zArr) {
            return super.withBooleanValue(zArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withByteValue(byte[] bArr) {
            return super.withByteValue(bArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withCharacterValue(char[] cArr) {
            return super.withCharacterValue(cArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withDoubleValue(double[] dArr) {
            return super.withDoubleValue(dArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withEnumeration(EnumerationDescription[] enumerationDescriptionArr) {
            return super.withEnumeration(enumerationDescriptionArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ WithImplicitType withField(String str) {
            return super.withField(str);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ WithImplicitType withField(String str, FieldLocator.Factory factory) {
            return super.withField(str, factory);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withField(FieldLocator.Factory factory, String[] strArr) {
            return super.withField(factory, strArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withField(String[] strArr) {
            return super.withField(strArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withFloatValue(float[] fArr) {
            return super.withFloatValue(fArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withImplicitAndMethodArguments() {
            return super.withImplicitAndMethodArguments();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withInstance(JavaConstant[] javaConstantArr) {
            return super.withInstance(javaConstantArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withIntegerValue(int[] iArr) {
            return super.withIntegerValue(iArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withLongValue(long[] jArr) {
            return super.withLongValue(jArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withMethodArguments() {
            return super.withMethodArguments();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withNullValue(Class[] clsArr) {
            return super.withNullValue((Class<?>[]) clsArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withNullValue(TypeDescription[] typeDescriptionArr) {
            return super.withNullValue(typeDescriptionArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ WithImplicitType withReference(Object obj) {
            return super.withReference(obj);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withReference(Object[] objArr) {
            return super.withReference(objArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withShortValue(short[] sArr) {
            return super.withShortValue(sArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withThis(Class[] clsArr) {
            return super.withThis((Class<?>[]) clsArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withThis(TypeDescription[] typeDescriptionArr) {
            return super.withThis(typeDescriptionArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withType(TypeDescription[] typeDescriptionArr) {
            return super.withType(typeDescriptionArr);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ InvokeDynamic withValue(Object[] objArr) {
            return super.withValue(objArr);
        }

        protected WithImplicitType(MethodDescription.InDefinedShape inDefinedShape, List<?> list, InvocationProvider invocationProvider, TerminationHandler terminationHandler, Assigner assigner, Assigner.Typing typing) {
            super(inDefinedShape, list, invocationProvider, terminationHandler, assigner, typing);
        }

        public InvokeDynamic as(Class<?> cls) {
            return as(TypeDescription.ForLoadedType.of(cls));
        }

        protected static class OfInstance extends WithImplicitType {
            private final InvocationProvider.ArgumentProvider argumentProvider;
            private final Object value;

            protected OfInstance(MethodDescription.InDefinedShape inDefinedShape, List<?> list, InvocationProvider invocationProvider, TerminationHandler terminationHandler, Assigner assigner, Assigner.Typing typing, Object obj) {
                super(inDefinedShape, list, invocationProvider, terminationHandler, assigner, typing);
                this.value = obj;
                this.argumentProvider = InvocationProvider.ArgumentProvider.ForInstance.of(obj);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.WithImplicitType
            public InvokeDynamic as(TypeDescription typeDescription) {
                if (!typeDescription.asBoxed().isInstance(this.value)) {
                    throw new IllegalArgumentException(this.value + " is not of type " + typeDescription);
                }
                return new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider.appendArgument(new InvocationProvider.ArgumentProvider.ForInstance(this.value, typeDescription)), this.terminationHandler, this.assigner, this.typing);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator
            protected InvokeDynamic materialize() {
                return new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider.appendArgument(this.argumentProvider), this.terminationHandler, this.assigner, this.typing);
            }
        }

        protected static class OfArgument extends WithImplicitType {
            private final int index;

            protected OfArgument(MethodDescription.InDefinedShape inDefinedShape, List<?> list, InvocationProvider invocationProvider, TerminationHandler terminationHandler, Assigner assigner, Assigner.Typing typing, int i) {
                super(inDefinedShape, list, invocationProvider, terminationHandler, assigner, typing);
                this.index = i;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.WithImplicitType
            public InvokeDynamic as(TypeDescription typeDescription) {
                return new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider.appendArgument(new InvocationProvider.ArgumentProvider.ForMethodParameter.WithExplicitType(this.index, typeDescription)), this.terminationHandler, this.assigner, this.typing);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator
            protected InvokeDynamic materialize() {
                return new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider.appendArgument(new InvocationProvider.ArgumentProvider.ForMethodParameter(this.index)), this.terminationHandler, this.assigner, this.typing);
            }
        }

        protected static class OfField extends WithImplicitType {
            private final FieldLocator.Factory fieldLocatorFactory;
            private final String fieldName;

            protected OfField(MethodDescription.InDefinedShape inDefinedShape, List<?> list, InvocationProvider invocationProvider, TerminationHandler terminationHandler, Assigner assigner, Assigner.Typing typing, String str, FieldLocator.Factory factory) {
                super(inDefinedShape, list, invocationProvider, terminationHandler, assigner, typing);
                this.fieldName = str;
                this.fieldLocatorFactory = factory;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.WithImplicitType
            public InvokeDynamic as(TypeDescription typeDescription) {
                return new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider.appendArgument(new InvocationProvider.ArgumentProvider.ForField.WithExplicitType(this.fieldName, this.fieldLocatorFactory, typeDescription)), this.terminationHandler, this.assigner, this.typing);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.InvokeDynamic.AbstractDelegator
            protected InvokeDynamic materialize() {
                return new InvokeDynamic(this.bootstrapMethod, this.handleArguments, this.invocationProvider.appendArgument(new InvocationProvider.ArgumentProvider.ForField(this.fieldName, this.fieldLocatorFactory)), this.terminationHandler, this.assigner, this.typing);
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
    protected class Appender implements ByteCodeAppender {
        private final TypeDescription instrumentedType;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Appender appender = (Appender) obj;
            return this.instrumentedType.equals(appender.instrumentedType) && InvokeDynamic.this.equals(InvokeDynamic.this);
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentedType.hashCode()) * 31) + InvokeDynamic.this.hashCode();
        }

        public Appender(TypeDescription typeDescription) {
            this.instrumentedType = typeDescription;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
        public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            InvocationProvider.Target.Resolved resolve = InvokeDynamic.this.invocationProvider.make(methodDescription).resolve(this.instrumentedType, InvokeDynamic.this.assigner, InvokeDynamic.this.typing);
            return new ByteCodeAppender.Size(new StackManipulation.Compound(resolve.getStackManipulation(), MethodInvocation.invoke(InvokeDynamic.this.bootstrapMethod).dynamic(resolve.getInternalName(), resolve.getReturnType(), resolve.getParameterTypes(), InvokeDynamic.this.handleArguments), InvokeDynamic.this.terminationHandler.resolve(methodDescription, resolve.getReturnType(), InvokeDynamic.this.assigner, InvokeDynamic.this.typing)).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
        }
    }
}
