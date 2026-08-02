package org.modelmapper.internal.bytebuddy.description.method;

import com.google.firebase.dynamiclinks.DynamicLink;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.modelmapper.internal.asm.Type;
import org.modelmapper.internal.asm.signature.SignatureVisitor;
import org.modelmapper.internal.asm.signature.SignatureWriter;
import org.modelmapper.internal.bytebuddy.build.CachedReturnPlugin;
import org.modelmapper.internal.bytebuddy.description.ByteCodeElement;
import org.modelmapper.internal.bytebuddy.description.ModifierReviewable;
import org.modelmapper.internal.bytebuddy.description.NamedElement;
import org.modelmapper.internal.bytebuddy.description.TypeVariableSource;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationList;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue;
import org.modelmapper.internal.bytebuddy.description.enumeration.EnumerationDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterList;
import org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor;
import org.modelmapper.internal.bytebuddy.description.modifier.Visibility;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeList;
import org.modelmapper.internal.bytebuddy.description.type.TypeVariableToken;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;
import org.modelmapper.internal.bytebuddy.pool.TypePool;
import org.modelmapper.internal.bytebuddy.utility.JavaConstant;
import org.modelmapper.internal.bytebuddy.utility.JavaType;

/* loaded from: classes4.dex */
public interface MethodDescription extends TypeVariableSource, ModifierReviewable.ForMethodDescription, NamedElement.WithGenericName, ByteCodeElement, ByteCodeElement.TypeDependant<InDefinedShape, Token> {
    public static final String CONSTRUCTOR_INTERNAL_NAME = "<init>";
    public static final String TYPE_INITIALIZER_INTERNAL_NAME = "<clinit>";
    public static final int TYPE_INITIALIZER_MODIFIER = 8;
    public static final InDefinedShape UNDEFINED = null;

    public interface InGenericShape extends MethodDescription {
        @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
        TypeDescription.Generic getDeclaringType();

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription, org.modelmapper.internal.bytebuddy.description.method.MethodDescription.InDefinedShape
        ParameterList<ParameterDescription.InGenericShape> getParameters();
    }

    SignatureToken asSignatureToken();

    TypeToken asTypeToken();

    int getActualModifiers();

    int getActualModifiers(boolean z);

    int getActualModifiers(boolean z, Visibility visibility);

    <T> T getDefaultValue(Class<T> cls);

    AnnotationValue<?, ?> getDefaultValue();

    TypeList.Generic getExceptionTypes();

    ParameterList<?> getParameters();

    TypeDescription.Generic getReceiverType();

    TypeDescription.Generic getReturnType();

    int getStackSize();

    boolean isBridgeCompatible(TypeToken typeToken);

    boolean isConstantBootstrap();

    boolean isConstantBootstrap(List<?> list);

    boolean isConstructor();

    boolean isDefaultMethod();

    boolean isDefaultValue();

    boolean isDefaultValue(AnnotationValue<?, ?> annotationValue);

    boolean isInvokableOn(TypeDescription typeDescription);

    boolean isInvokeBootstrap();

    boolean isInvokeBootstrap(List<?> list);

    boolean isMethod();

    boolean isSpecializableFor(TypeDescription typeDescription);

    boolean isTypeInitializer();

    boolean isVirtual();

    boolean represents(Constructor<?> constructor);

    boolean represents(Method method);

    public interface InDefinedShape extends MethodDescription {
        @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
        TypeDescription getDeclaringType();

        ParameterList<ParameterDescription.InDefinedShape> getParameters();

        public static abstract class AbstractBase extends AbstractBase implements InDefinedShape {
            @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement.TypeDependant
            public InDefinedShape asDefined() {
                return this;
            }

            public TypeDescription.Generic getReceiverType() {
                if (isStatic()) {
                    return TypeDescription.Generic.UNDEFINED;
                }
                if (isConstructor()) {
                    TypeDescription declaringType = getDeclaringType();
                    TypeDescription enclosingType = getDeclaringType().getEnclosingType();
                    if (enclosingType == null) {
                        return TypeDescription.Generic.OfParameterizedType.ForGenerifiedErasure.of(declaringType);
                    }
                    if (declaringType.isStatic()) {
                        return enclosingType.asGenericType();
                    }
                    return TypeDescription.Generic.OfParameterizedType.ForGenerifiedErasure.of(enclosingType);
                }
                return TypeDescription.Generic.OfParameterizedType.ForGenerifiedErasure.of(getDeclaringType());
            }
        }
    }

    public static abstract class AbstractBase extends TypeVariableSource.AbstractBase implements MethodDescription {
        private static final int SOURCE_MODIFIERS = 1343;

        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement.TypeDependant
        public /* bridge */ /* synthetic */ Token asToken(ElementMatcher elementMatcher) {
            return asToken2((ElementMatcher<? super TypeDescription>) elementMatcher);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public int getStackSize() {
            return getParameters().asTypeList().getStackSize() + (!isStatic() ? 1 : 0);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public boolean isMethod() {
            return (isConstructor() || isTypeInitializer()) ? false : true;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public boolean isConstructor() {
            return MethodDescription.CONSTRUCTOR_INTERNAL_NAME.equals(getInternalName());
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public boolean isTypeInitializer() {
            return MethodDescription.TYPE_INITIALIZER_INTERNAL_NAME.equals(getInternalName());
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public boolean represents(Method method) {
            return equals(new ForLoadedMethod(method));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public boolean represents(Constructor<?> constructor) {
            return equals(new ForLoadedConstructor(constructor));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
        public String getName() {
            if (isMethod()) {
                return getInternalName();
            }
            return getDeclaringType().asErasure().getName();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement
        public String getActualName() {
            return isMethod() ? getName() : "";
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement
        public String getDescriptor() {
            StringBuilder sb = new StringBuilder("(");
            Iterator it = getParameters().asTypeList().asErasures().iterator();
            while (it.hasNext()) {
                sb.append(((TypeDescription) it.next()).getDescriptor());
            }
            return sb.append(')').append(getReturnType().asErasure().getDescriptor()).toString();
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x00be A[Catch: GenericSignatureFormatError -> 0x00f5, TryCatch #0 {GenericSignatureFormatError -> 0x00f5, blocks: (B:2:0x0000, B:3:0x000f, B:5:0x0016, B:6:0x002c, B:8:0x0032, B:10:0x003c, B:12:0x0045, B:13:0x0041, B:18:0x004f, B:19:0x005b, B:21:0x0061, B:23:0x0075, B:35:0x0084, B:37:0x0096, B:41:0x00a4, B:43:0x00be, B:44:0x00c2, B:46:0x00c8, B:48:0x00dc, B:61:0x00ed, B:64:0x00f2), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00ed A[Catch: GenericSignatureFormatError -> 0x00f5, TryCatch #0 {GenericSignatureFormatError -> 0x00f5, blocks: (B:2:0x0000, B:3:0x000f, B:5:0x0016, B:6:0x002c, B:8:0x0032, B:10:0x003c, B:12:0x0045, B:13:0x0041, B:18:0x004f, B:19:0x005b, B:21:0x0061, B:23:0x0075, B:35:0x0084, B:37:0x0096, B:41:0x00a4, B:43:0x00be, B:44:0x00c2, B:46:0x00c8, B:48:0x00dc, B:61:0x00ed, B:64:0x00f2), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00f2 A[Catch: GenericSignatureFormatError -> 0x00f5, TRY_LEAVE, TryCatch #0 {GenericSignatureFormatError -> 0x00f5, blocks: (B:2:0x0000, B:3:0x000f, B:5:0x0016, B:6:0x002c, B:8:0x0032, B:10:0x003c, B:12:0x0045, B:13:0x0041, B:18:0x004f, B:19:0x005b, B:21:0x0061, B:23:0x0075, B:35:0x0084, B:37:0x0096, B:41:0x00a4, B:43:0x00be, B:44:0x00c2, B:46:0x00c8, B:48:0x00dc, B:61:0x00ed, B:64:0x00f2), top: B:1:0x0000 }] */
        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String getGenericSignature() {
            boolean z;
            TypeList.Generic<TypeDescription.Generic> exceptionTypes;
            SignatureVisitor visitInterfaceBound;
            try {
                SignatureWriter signatureWriter = new SignatureWriter();
                boolean z2 = false;
                for (TypeDescription.Generic generic : getTypeVariables()) {
                    signatureWriter.visitFormalTypeParameter(generic.getSymbol());
                    boolean z3 = true;
                    for (TypeDescription.Generic generic2 : generic.getUpperBounds()) {
                        if (z3) {
                            visitInterfaceBound = signatureWriter.visitClassBound();
                        } else {
                            visitInterfaceBound = signatureWriter.visitInterfaceBound();
                        }
                        generic2.accept(new TypeDescription.Generic.Visitor.ForSignatureVisitor(visitInterfaceBound));
                        z3 = false;
                    }
                    z2 = true;
                }
                for (TypeDescription.Generic generic3 : getParameters().asTypeList()) {
                    generic3.accept(new TypeDescription.Generic.Visitor.ForSignatureVisitor(signatureWriter.visitParameterType()));
                    z2 = z2 || !generic3.getSort().isNonGeneric();
                }
                TypeDescription.Generic returnType = getReturnType();
                returnType.accept(new TypeDescription.Generic.Visitor.ForSignatureVisitor(signatureWriter.visitReturnType()));
                if (!z2 && returnType.getSort().isNonGeneric()) {
                    z = false;
                    exceptionTypes = getExceptionTypes();
                    if (!exceptionTypes.filter(ElementMatchers.not(ElementMatchers.ofSort(TypeDefinition.Sort.NON_GENERIC))).isEmpty()) {
                        for (TypeDescription.Generic generic4 : exceptionTypes) {
                            generic4.accept(new TypeDescription.Generic.Visitor.ForSignatureVisitor(signatureWriter.visitExceptionType()));
                            z = z || !generic4.getSort().isNonGeneric();
                        }
                    }
                    return !z ? signatureWriter.toString() : NON_GENERIC_SIGNATURE;
                }
                z = true;
                exceptionTypes = getExceptionTypes();
                if (!exceptionTypes.filter(ElementMatchers.not(ElementMatchers.ofSort(TypeDefinition.Sort.NON_GENERIC))).isEmpty()) {
                }
                if (!z) {
                }
            } catch (GenericSignatureFormatError unused) {
                return NON_GENERIC_SIGNATURE;
            }
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public int getActualModifiers() {
            return getModifiers() | (getDeclaredAnnotations().isAnnotationPresent(Deprecated.class) ? 131072 : 0);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public int getActualModifiers(boolean z) {
            if (z) {
                return getActualModifiers() & (-1281);
            }
            return (getActualModifiers() & (-257)) | 1024;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public int getActualModifiers(boolean z, Visibility visibility) {
            return ModifierContributor.Resolver.of(Collections.singleton(getVisibility().expandTo(visibility))).resolve(getActualModifiers(z));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement
        public boolean isVisibleTo(TypeDescription typeDescription) {
            return (isVirtual() || getDeclaringType().asErasure().isVisibleTo(typeDescription)) && (isPublic() || typeDescription.equals(getDeclaringType().asErasure()) || ((isProtected() && getDeclaringType().asErasure().isAssignableFrom(typeDescription)) || (!isPrivate() && typeDescription.isSamePackage(getDeclaringType().asErasure()))));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement
        public boolean isAccessibleTo(TypeDescription typeDescription) {
            return ((isVirtual() || getDeclaringType().asErasure().isVisibleTo(typeDescription)) && (isPublic() || typeDescription.equals(getDeclaringType().asErasure()) || (!isPrivate() && typeDescription.isSamePackage(getDeclaringType().asErasure())))) || (isPrivate() && typeDescription.isNestMateOf(getDeclaringType().asErasure()));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public boolean isVirtual() {
            return (isConstructor() || isPrivate() || isStatic() || isTypeInitializer()) ? false : true;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public boolean isDefaultMethod() {
            return (isAbstract() || isBridge() || !getDeclaringType().isInterface()) ? false : true;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public boolean isSpecializableFor(TypeDescription typeDescription) {
            if (isStatic()) {
                return false;
            }
            if (isPrivate() || isConstructor()) {
                return getDeclaringType().equals(typeDescription);
            }
            return !isAbstract() && getDeclaringType().asErasure().isAssignableFrom(typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public <T> T getDefaultValue(Class<T> cls) {
            return cls.cast(getDefaultValue());
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public boolean isInvokableOn(TypeDescription typeDescription) {
            return !isStatic() && !isTypeInitializer() && isVisibleTo(typeDescription) && (!isVirtual() ? !getDeclaringType().asErasure().equals(typeDescription) : !getDeclaringType().asErasure().isAssignableFrom(typeDescription));
        }

        private boolean isBootstrap(TypeDescription typeDescription) {
            TypeList asErasures = getParameters().asTypeList().asErasures();
            int size = asErasures.size();
            if (size == 0) {
                return false;
            }
            if (size == 1) {
                return asErasures.getOnly().represents(Object[].class);
            }
            if (size == 2) {
                return JavaType.METHOD_HANDLES_LOOKUP.getTypeStub().isAssignableTo((TypeDescription) asErasures.get(0)) && ((TypeDescription) asErasures.get(1)).represents(Object[].class);
            }
            if (size == 3) {
                if (!JavaType.METHOD_HANDLES_LOOKUP.getTypeStub().isAssignableTo((TypeDescription) asErasures.get(0))) {
                    return false;
                }
                if (((TypeDescription) asErasures.get(1)).represents(Object.class) || ((TypeDescription) asErasures.get(1)).represents(String.class)) {
                    return ((TypeDescription) asErasures.get(2)).represents(Object[].class) || ((TypeDescription) asErasures.get(2)).isAssignableFrom(typeDescription);
                }
                return false;
            }
            if (JavaType.METHOD_HANDLES_LOOKUP.getTypeStub().isAssignableTo((TypeDescription) asErasures.get(0))) {
                return (((TypeDescription) asErasures.get(1)).represents(Object.class) || ((TypeDescription) asErasures.get(1)).represents(String.class)) && ((TypeDescription) asErasures.get(2)).isAssignableFrom(typeDescription);
            }
            return false;
        }

        private boolean isBootstrap(List<?> list) {
            for (Object obj : list) {
                if (obj == null) {
                    throw new IllegalArgumentException("The null value is not a bootstrap constant");
                }
                Class<?> cls = obj.getClass();
                if (cls != String.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && !TypeDescription.class.isAssignableFrom(cls) && !JavaConstant.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Not a Java constant representation: " + obj);
                }
            }
            TypeList asErasures = getParameters().asTypeList().asErasures();
            int i = 4;
            if (asErasures.size() < 4) {
                return list.isEmpty() || ((TypeDescription) asErasures.get(asErasures.size() - 1)).represents(Object[].class);
            }
            Iterator<?> it = list.iterator();
            for (TypeDescription typeDescription : asErasures.subList(3, asErasures.size())) {
                boolean hasNext = it.hasNext();
                boolean z = !hasNext;
                if (hasNext) {
                    Object next = it.next();
                    z = (((next instanceof JavaConstant) && ((JavaConstant) next).getType().isAssignableTo(typeDescription)) || (typeDescription.represents(Class.class) && (next instanceof TypeDescription) && !((TypeDescription) next).isPrimitive()) || ((typeDescription.represents(String.class) && next.getClass() == String.class) || ((typeDescription.represents(Integer.TYPE) && next.getClass() == Integer.class) || ((typeDescription.represents(Long.TYPE) && next.getClass() == Long.class) || ((typeDescription.represents(Float.TYPE) && next.getClass() == Float.class) || (typeDescription.represents(Double.TYPE) && next.getClass() == Double.class)))))) ? false : true;
                }
                if (z) {
                    return i == asErasures.size() && typeDescription.represents(Object[].class);
                }
                i++;
            }
            return true;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public boolean isInvokeBootstrap() {
            TypeDescription asErasure = getReturnType().asErasure();
            if (isMethod()) {
                if (!isStatic()) {
                    return false;
                }
                if (!JavaType.CALL_SITE.getTypeStub().isAssignableFrom(asErasure) && !JavaType.CALL_SITE.getTypeStub().isAssignableTo(asErasure)) {
                    return false;
                }
            }
            if (!isConstructor() || JavaType.CALL_SITE.getTypeStub().isAssignableFrom(getDeclaringType().asErasure())) {
                return isBootstrap(JavaType.METHOD_TYPE.getTypeStub());
            }
            return false;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public boolean isInvokeBootstrap(List<?> list) {
            return isInvokeBootstrap() && isBootstrap(list);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public boolean isConstantBootstrap() {
            return !getParameters().isEmpty() && ((ParameterDescription) getParameters().get(0)).getType().asErasure().equals(JavaType.METHOD_HANDLES_LOOKUP.getTypeStub()) && isBootstrap(TypeDescription.CLASS);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public boolean isConstantBootstrap(List<?> list) {
            return isConstantBootstrap() && isBootstrap(list);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public boolean isDefaultValue() {
            return !isConstructor() && !isStatic() && getReturnType().asErasure().isAnnotationReturnType() && getParameters().isEmpty();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public boolean isDefaultValue(AnnotationValue<?, ?> annotationValue) {
            if (!isDefaultValue()) {
                return false;
            }
            TypeDescription asErasure = getReturnType().asErasure();
            Object resolve = annotationValue.resolve();
            return (asErasure.represents(Boolean.TYPE) && (resolve instanceof Boolean)) || (asErasure.represents(Byte.TYPE) && (resolve instanceof Byte)) || ((asErasure.represents(Character.TYPE) && (resolve instanceof Character)) || ((asErasure.represents(Short.TYPE) && (resolve instanceof Short)) || ((asErasure.represents(Integer.TYPE) && (resolve instanceof Integer)) || ((asErasure.represents(Long.TYPE) && (resolve instanceof Long)) || ((asErasure.represents(Float.TYPE) && (resolve instanceof Float)) || ((asErasure.represents(Double.TYPE) && (resolve instanceof Double)) || ((asErasure.represents(String.class) && (resolve instanceof String)) || ((asErasure.isAssignableTo(Enum.class) && (resolve instanceof EnumerationDescription) && isEnumerationType(asErasure, (EnumerationDescription) resolve)) || ((asErasure.isAssignableTo(Annotation.class) && (resolve instanceof AnnotationDescription) && isAnnotationType(asErasure, (AnnotationDescription) resolve)) || ((asErasure.represents(Class.class) && (resolve instanceof TypeDescription)) || ((asErasure.represents(boolean[].class) && (resolve instanceof boolean[])) || ((asErasure.represents(byte[].class) && (resolve instanceof byte[])) || ((asErasure.represents(char[].class) && (resolve instanceof char[])) || ((asErasure.represents(short[].class) && (resolve instanceof short[])) || ((asErasure.represents(int[].class) && (resolve instanceof int[])) || ((asErasure.represents(long[].class) && (resolve instanceof long[])) || ((asErasure.represents(float[].class) && (resolve instanceof float[])) || ((asErasure.represents(double[].class) && (resolve instanceof double[])) || ((asErasure.represents(String[].class) && (resolve instanceof String[])) || ((asErasure.isAssignableTo(Enum[].class) && (resolve instanceof EnumerationDescription[]) && isEnumerationType(asErasure.getComponentType(), (EnumerationDescription[]) resolve)) || ((asErasure.isAssignableTo(Annotation[].class) && (resolve instanceof AnnotationDescription[]) && isAnnotationType(asErasure.getComponentType(), (AnnotationDescription[]) resolve)) || (asErasure.represents(Class[].class) && (resolve instanceof TypeDescription[])))))))))))))))))))))));
        }

        private static boolean isEnumerationType(TypeDescription typeDescription, EnumerationDescription... enumerationDescriptionArr) {
            for (EnumerationDescription enumerationDescription : enumerationDescriptionArr) {
                if (!enumerationDescription.getEnumerationType().equals(typeDescription)) {
                    return false;
                }
            }
            return true;
        }

        private static boolean isAnnotationType(TypeDescription typeDescription, AnnotationDescription... annotationDescriptionArr) {
            for (AnnotationDescription annotationDescription : annotationDescriptionArr) {
                if (!annotationDescription.getAnnotationType().equals(typeDescription)) {
                    return false;
                }
            }
            return true;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
        public TypeVariableSource getEnclosingSource() {
            return isStatic() ? TypeVariableSource.UNDEFINED : getDeclaringType().asErasure();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
        public <T> T accept(TypeVariableSource.Visitor<T> visitor) {
            return visitor.onMethod(asDefined());
        }

        @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
        public boolean isGenerified() {
            return !getTypeVariables().isEmpty();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement.TypeDependant
        /* renamed from: asToken, reason: avoid collision after fix types in other method */
        public Token asToken2(ElementMatcher<? super TypeDescription> elementMatcher) {
            TypeDescription.Generic receiverType = getReceiverType();
            return new Token(getInternalName(), getModifiers(), getTypeVariables().asTokenList(elementMatcher), (TypeDescription.Generic) getReturnType().accept(new TypeDescription.Generic.Visitor.Substitutor.ForDetachment(elementMatcher)), getParameters().asTokenList(elementMatcher), getExceptionTypes().accept(new TypeDescription.Generic.Visitor.Substitutor.ForDetachment(elementMatcher)), getDeclaredAnnotations(), getDefaultValue(), receiverType == null ? TypeDescription.Generic.UNDEFINED : (TypeDescription.Generic) receiverType.accept(new TypeDescription.Generic.Visitor.Substitutor.ForDetachment(elementMatcher)));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public SignatureToken asSignatureToken() {
            return new SignatureToken(getInternalName(), getReturnType().asErasure(), getParameters().asTypeList().asErasures());
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public TypeToken asTypeToken() {
            return new TypeToken(getReturnType().asErasure(), getParameters().asTypeList().asErasures());
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public boolean isBridgeCompatible(TypeToken typeToken) {
            TypeList asErasures = getParameters().asTypeList().asErasures();
            List<TypeDescription> parameterTypes = typeToken.getParameterTypes();
            if (asErasures.size() != parameterTypes.size()) {
                return false;
            }
            for (int i = 0; i < asErasures.size(); i++) {
                if (!asErasures.get(i).equals(parameterTypes.get(i)) && (asErasures.get(i).isPrimitive() || parameterTypes.get(i).isPrimitive())) {
                    return false;
                }
            }
            TypeDescription asErasure = getReturnType().asErasure();
            TypeDescription returnType = typeToken.getReturnType();
            return asErasure.equals(returnType) || !(asErasure.isPrimitive() || returnType.isPrimitive());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodDescription)) {
                return false;
            }
            MethodDescription methodDescription = (MethodDescription) obj;
            return getInternalName().equals(methodDescription.getInternalName()) && getDeclaringType().equals(methodDescription.getDeclaringType()) && getReturnType().asErasure().equals(methodDescription.getReturnType().asErasure()) && getParameters().asTypeList().asErasures().equals(methodDescription.getParameters().asTypeList().asErasures());
        }

        public int hashCode() {
            return ((((((getDeclaringType().hashCode() + 17) * 31) + getInternalName().hashCode()) * 31) + getReturnType().asErasure().hashCode()) * 31) + getParameters().asTypeList().asErasures().hashCode();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithGenericName
        public String toGenericString() {
            StringBuilder sb = new StringBuilder();
            int modifiers = getModifiers() & SOURCE_MODIFIERS;
            if (modifiers != 0) {
                sb.append(Modifier.toString(modifiers)).append(' ');
            }
            if (isMethod()) {
                sb.append(getReturnType().getActualName()).append(' ');
                sb.append(getDeclaringType().asErasure().getActualName()).append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            }
            sb.append(getName()).append('(');
            boolean z = true;
            boolean z2 = true;
            for (TypeDescription.Generic generic : getParameters().asTypeList()) {
                if (z2) {
                    z2 = false;
                } else {
                    sb.append(AbstractJsonLexerKt.COMMA);
                }
                sb.append(generic.getActualName());
            }
            sb.append(')');
            TypeList.Generic<TypeDescription.Generic> exceptionTypes = getExceptionTypes();
            if (!exceptionTypes.isEmpty()) {
                sb.append(" throws ");
                for (TypeDescription.Generic generic2 : exceptionTypes) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(AbstractJsonLexerKt.COMMA);
                    }
                    sb.append(generic2.getActualName());
                }
            }
            return sb.toString();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            int modifiers = getModifiers() & SOURCE_MODIFIERS;
            if (modifiers != 0) {
                sb.append(Modifier.toString(modifiers)).append(' ');
            }
            if (isMethod()) {
                sb.append(getReturnType().asErasure().getActualName()).append(' ');
                sb.append(getDeclaringType().asErasure().getActualName()).append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            }
            sb.append(getName()).append('(');
            boolean z = true;
            boolean z2 = true;
            for (TypeDescription typeDescription : getParameters().asTypeList().asErasures()) {
                if (z2) {
                    z2 = false;
                } else {
                    sb.append(AbstractJsonLexerKt.COMMA);
                }
                sb.append(typeDescription.getActualName());
            }
            sb.append(')');
            TypeList<TypeDescription> asErasures = getExceptionTypes().asErasures();
            if (!asErasures.isEmpty()) {
                sb.append(" throws ");
                for (TypeDescription typeDescription2 : asErasures) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(AbstractJsonLexerKt.COMMA);
                    }
                    sb.append(typeDescription2.getActualName());
                }
            }
            return sb.toString();
        }
    }

    public static class ForLoadedConstructor extends InDefinedShape.AbstractBase implements ParameterDescription.ForLoadedParameter.ParameterAnnotationSource {
        private final Constructor<?> constructor;
        private transient /* synthetic */ AnnotationList declaredAnnotations;
        private transient /* synthetic */ Annotation[][] parameterAnnotations;
        private transient /* synthetic */ ParameterList parameters;

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public boolean isConstructor() {
            return true;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public boolean isTypeInitializer() {
            return false;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public boolean represents(Method method) {
            return false;
        }

        public ForLoadedConstructor(Constructor<?> constructor) {
            this.constructor = constructor;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
        public TypeDescription getDeclaringType() {
            return TypeDescription.ForLoadedType.of(this.constructor.getDeclaringClass());
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public TypeDescription.Generic getReturnType() {
            return TypeDescription.Generic.VOID;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription, org.modelmapper.internal.bytebuddy.description.method.MethodDescription.InDefinedShape
        @CachedReturnPlugin.Enhance(DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS)
        public ParameterList<ParameterDescription.InDefinedShape> getParameters() {
            ParameterList<ParameterDescription.InDefinedShape> of = this.parameters != null ? null : ParameterList.ForLoadedExecutable.of(this.constructor, (ParameterDescription.ForLoadedParameter.ParameterAnnotationSource) this);
            if (of == null) {
                return this.parameters;
            }
            this.parameters = of;
            return of;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public TypeList.Generic getExceptionTypes() {
            return new TypeList.Generic.OfConstructorExceptionTypes(this.constructor);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public boolean represents(Constructor<?> constructor) {
            return this.constructor.equals(constructor) || equals(new ForLoadedConstructor(constructor));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
        public String getName() {
            return this.constructor.getName();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
            return this.constructor.getModifiers();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.AbstractBase, org.modelmapper.internal.bytebuddy.description.ModifierReviewable
        public boolean isSynthetic() {
            return this.constructor.isSynthetic();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
        public String getInternalName() {
            return MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.ByteCodeElement
        public String getDescriptor() {
            return Type.getConstructorDescriptor(this.constructor);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public AnnotationValue<?, ?> getDefaultValue() {
            return AnnotationValue.UNDEFINED;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
        @CachedReturnPlugin.Enhance("declaredAnnotations")
        public AnnotationList getDeclaredAnnotations() {
            AnnotationList.ForLoadedAnnotations forLoadedAnnotations = this.declaredAnnotations != null ? null : new AnnotationList.ForLoadedAnnotations(this.constructor.getDeclaredAnnotations());
            if (forLoadedAnnotations == null) {
                return this.declaredAnnotations;
            }
            this.declaredAnnotations = forLoadedAnnotations;
            return forLoadedAnnotations;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
        public TypeList.Generic getTypeVariables() {
            return TypeList.Generic.ForLoadedTypes.OfTypeVariables.of((GenericDeclaration) this.constructor);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase, org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public TypeDescription.Generic getReceiverType() {
            TypeDescription.Generic resolveReceiverType = TypeDescription.Generic.AnnotationReader.DISPATCHER.resolveReceiverType(this.constructor);
            return resolveReceiverType == null ? super.getReceiverType() : resolveReceiverType;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource
        @CachedReturnPlugin.Enhance("parameterAnnotations")
        public Annotation[][] getParameterAnnotations() {
            Annotation[][] parameterAnnotations = this.parameterAnnotations != null ? null : this.constructor.getParameterAnnotations();
            if (parameterAnnotations == null) {
                return this.parameterAnnotations;
            }
            this.parameterAnnotations = parameterAnnotations;
            return parameterAnnotations;
        }
    }

    public static class ForLoadedMethod extends InDefinedShape.AbstractBase implements ParameterDescription.ForLoadedParameter.ParameterAnnotationSource {
        private transient /* synthetic */ AnnotationList declaredAnnotations;
        private final Method method;
        private transient /* synthetic */ Annotation[][] parameterAnnotations;
        private transient /* synthetic */ ParameterList parameters;

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public boolean isConstructor() {
            return false;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public boolean isTypeInitializer() {
            return false;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public boolean represents(Constructor<?> constructor) {
            return false;
        }

        public ForLoadedMethod(Method method) {
            this.method = method;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
        public TypeDescription getDeclaringType() {
            return TypeDescription.ForLoadedType.of(this.method.getDeclaringClass());
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public TypeDescription.Generic getReturnType() {
            if (TypeDescription.AbstractBase.RAW_TYPES) {
                return TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(this.method.getReturnType());
            }
            return new TypeDescription.Generic.LazyProjection.ForLoadedReturnType(this.method);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription, org.modelmapper.internal.bytebuddy.description.method.MethodDescription.InDefinedShape
        @CachedReturnPlugin.Enhance(DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS)
        public ParameterList<ParameterDescription.InDefinedShape> getParameters() {
            ParameterList<ParameterDescription.InDefinedShape> of = this.parameters != null ? null : ParameterList.ForLoadedExecutable.of(this.method, (ParameterDescription.ForLoadedParameter.ParameterAnnotationSource) this);
            if (of == null) {
                return this.parameters;
            }
            this.parameters = of;
            return of;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public TypeList.Generic getExceptionTypes() {
            if (TypeDescription.AbstractBase.RAW_TYPES) {
                return new TypeList.Generic.ForLoadedTypes(this.method.getExceptionTypes());
            }
            return new TypeList.Generic.OfMethodExceptionTypes(this.method);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.AbstractBase, org.modelmapper.internal.bytebuddy.description.ModifierReviewable.ForMethodDescription
        public boolean isBridge() {
            return this.method.isBridge();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public boolean represents(Method method) {
            return this.method.equals(method) || equals(new ForLoadedMethod(method));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
        public String getName() {
            return this.method.getName();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
            return this.method.getModifiers();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.AbstractBase, org.modelmapper.internal.bytebuddy.description.ModifierReviewable
        public boolean isSynthetic() {
            return this.method.isSynthetic();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
        public String getInternalName() {
            return this.method.getName();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.ByteCodeElement
        public String getDescriptor() {
            return Type.getMethodDescriptor(this.method);
        }

        public Method getLoadedMethod() {
            return this.method;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
        @CachedReturnPlugin.Enhance("declaredAnnotations")
        public AnnotationList getDeclaredAnnotations() {
            AnnotationList.ForLoadedAnnotations forLoadedAnnotations = this.declaredAnnotations != null ? null : new AnnotationList.ForLoadedAnnotations(this.method.getDeclaredAnnotations());
            if (forLoadedAnnotations == null) {
                return this.declaredAnnotations;
            }
            this.declaredAnnotations = forLoadedAnnotations;
            return forLoadedAnnotations;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public AnnotationValue<?, ?> getDefaultValue() {
            Object defaultValue = this.method.getDefaultValue();
            if (defaultValue == null) {
                return AnnotationValue.UNDEFINED;
            }
            return AnnotationDescription.ForLoadedAnnotation.asValue(defaultValue, this.method.getReturnType());
        }

        @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
        public TypeList.Generic getTypeVariables() {
            if (TypeDescription.AbstractBase.RAW_TYPES) {
                return new TypeList.Generic.Empty();
            }
            return TypeList.Generic.ForLoadedTypes.OfTypeVariables.of((GenericDeclaration) this.method);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase, org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public TypeDescription.Generic getReceiverType() {
            if (TypeDescription.AbstractBase.RAW_TYPES) {
                return super.getReceiverType();
            }
            TypeDescription.Generic resolveReceiverType = TypeDescription.Generic.AnnotationReader.DISPATCHER.resolveReceiverType(this.method);
            return resolveReceiverType == null ? super.getReceiverType() : resolveReceiverType;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource
        @CachedReturnPlugin.Enhance("parameterAnnotations")
        public Annotation[][] getParameterAnnotations() {
            Annotation[][] parameterAnnotations = this.parameterAnnotations != null ? null : this.method.getParameterAnnotations();
            if (parameterAnnotations == null) {
                return this.parameterAnnotations;
            }
            this.parameterAnnotations = parameterAnnotations;
            return parameterAnnotations;
        }
    }

    public static class Latent extends InDefinedShape.AbstractBase {
        private final List<? extends AnnotationDescription> declaredAnnotations;
        private final TypeDescription declaringType;
        private final AnnotationValue<?, ?> defaultValue;
        private final List<? extends TypeDescription.Generic> exceptionTypes;
        private final String internalName;
        private final int modifiers;
        private final List<? extends ParameterDescription.Token> parameterTokens;
        private final TypeDescription.Generic receiverType;
        private final TypeDescription.Generic returnType;
        private final List<? extends TypeVariableToken> typeVariables;

        public Latent(TypeDescription typeDescription, Token token) {
            this(typeDescription, token.getName(), token.getModifiers(), token.getTypeVariableTokens(), token.getReturnType(), token.getParameterTokens(), token.getExceptionTypes(), token.getAnnotations(), token.getDefaultValue(), token.getReceiverType());
        }

        public Latent(TypeDescription typeDescription, String str, int i, List<? extends TypeVariableToken> list, TypeDescription.Generic generic, List<? extends ParameterDescription.Token> list2, List<? extends TypeDescription.Generic> list3, List<? extends AnnotationDescription> list4, AnnotationValue<?, ?> annotationValue, TypeDescription.Generic generic2) {
            this.declaringType = typeDescription;
            this.internalName = str;
            this.modifiers = i;
            this.typeVariables = list;
            this.returnType = generic;
            this.parameterTokens = list2;
            this.exceptionTypes = list3;
            this.declaredAnnotations = list4;
            this.defaultValue = annotationValue;
            this.receiverType = generic2;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
        public TypeList.Generic getTypeVariables() {
            return TypeList.Generic.ForDetachedTypes.attachVariables(this, this.typeVariables);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public TypeDescription.Generic getReturnType() {
            return (TypeDescription.Generic) this.returnType.accept(TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(this));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription, org.modelmapper.internal.bytebuddy.description.method.MethodDescription.InDefinedShape
        public ParameterList<ParameterDescription.InDefinedShape> getParameters() {
            return new ParameterList.ForTokens(this, this.parameterTokens);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public TypeList.Generic getExceptionTypes() {
            return TypeList.Generic.ForDetachedTypes.attach(this, this.exceptionTypes);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
        public AnnotationList getDeclaredAnnotations() {
            return new AnnotationList.Explicit(this.declaredAnnotations);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
        public String getInternalName() {
            return this.internalName;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
        public TypeDescription getDeclaringType() {
            return this.declaringType;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
            return this.modifiers;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public AnnotationValue<?, ?> getDefaultValue() {
            return this.defaultValue;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase, org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public TypeDescription.Generic getReceiverType() {
            TypeDescription.Generic generic = this.receiverType;
            if (generic == null) {
                return super.getReceiverType();
            }
            return (TypeDescription.Generic) generic.accept(TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(this));
        }

        public static class TypeInitializer extends InDefinedShape.AbstractBase {
            private final TypeDescription typeDescription;

            @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
            public int getModifiers() {
                return 8;
            }

            public TypeInitializer(TypeDescription typeDescription) {
                this.typeDescription = typeDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
            public TypeDescription.Generic getReturnType() {
                return TypeDescription.Generic.VOID;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription, org.modelmapper.internal.bytebuddy.description.method.MethodDescription.InDefinedShape
            public ParameterList<ParameterDescription.InDefinedShape> getParameters() {
                return new ParameterList.Empty();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
            public TypeList.Generic getExceptionTypes() {
                return new TypeList.Generic.Empty();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
            public AnnotationValue<?, ?> getDefaultValue() {
                return AnnotationValue.UNDEFINED;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
            public TypeList.Generic getTypeVariables() {
                return new TypeList.Generic.Empty();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
            public AnnotationList getDeclaredAnnotations() {
                return new AnnotationList.Empty();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
            public TypeDescription getDeclaringType() {
                return this.typeDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
            public String getInternalName() {
                return MethodDescription.TYPE_INITIALIZER_INTERNAL_NAME;
            }
        }
    }

    public static class TypeSubstituting extends AbstractBase implements InGenericShape {
        private final TypeDescription.Generic declaringType;
        private final MethodDescription methodDescription;
        private final TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor;

        public TypeSubstituting(TypeDescription.Generic generic, MethodDescription methodDescription, TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
            this.declaringType = generic;
            this.methodDescription = methodDescription;
            this.visitor = visitor;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public TypeDescription.Generic getReturnType() {
            return (TypeDescription.Generic) this.methodDescription.getReturnType().accept(this.visitor);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
        public TypeList.Generic getTypeVariables() {
            return this.methodDescription.getTypeVariables().accept(this.visitor).filter(ElementMatchers.ofSort(TypeDefinition.Sort.VARIABLE));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription, org.modelmapper.internal.bytebuddy.description.method.MethodDescription.InDefinedShape
        public ParameterList<ParameterDescription.InGenericShape> getParameters() {
            return new ParameterList.TypeSubstituting(this, this.methodDescription.getParameters(), this.visitor);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public TypeList.Generic getExceptionTypes() {
            return new TypeList.Generic.ForDetachedTypes(this.methodDescription.getExceptionTypes(), this.visitor);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public AnnotationValue<?, ?> getDefaultValue() {
            return this.methodDescription.getDefaultValue();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public TypeDescription.Generic getReceiverType() {
            TypeDescription.Generic receiverType = this.methodDescription.getReceiverType();
            if (receiverType == null) {
                return TypeDescription.Generic.UNDEFINED;
            }
            return (TypeDescription.Generic) receiverType.accept(this.visitor);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
        public AnnotationList getDeclaredAnnotations() {
            return this.methodDescription.getDeclaredAnnotations();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
        public TypeDescription.Generic getDeclaringType() {
            return this.declaringType;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
            return this.methodDescription.getModifiers();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
        public String getInternalName() {
            return this.methodDescription.getInternalName();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement.TypeDependant
        public InDefinedShape asDefined() {
            return this.methodDescription.asDefined();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public boolean isConstructor() {
            return this.methodDescription.isConstructor();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public boolean isMethod() {
            return this.methodDescription.isMethod();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.method.MethodDescription
        public boolean isTypeInitializer() {
            return this.methodDescription.isTypeInitializer();
        }
    }

    public static class Token implements ByteCodeElement.Token<Token> {
        private final List<? extends AnnotationDescription> annotations;
        private final AnnotationValue<?, ?> defaultValue;
        private final List<? extends TypeDescription.Generic> exceptionTypes;
        private final int modifiers;
        private final String name;
        private final List<? extends ParameterDescription.Token> parameterTokens;
        private final TypeDescription.Generic receiverType;
        private final TypeDescription.Generic returnType;
        private final List<? extends TypeVariableToken> typeVariableTokens;

        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement.Token
        public /* bridge */ /* synthetic */ Token accept(TypeDescription.Generic.Visitor visitor) {
            return accept2((TypeDescription.Generic.Visitor<? extends TypeDescription.Generic>) visitor);
        }

        public Token(int i) {
            this(MethodDescription.CONSTRUCTOR_INTERNAL_NAME, i, TypeDescription.Generic.VOID);
        }

        public Token(String str, int i, TypeDescription.Generic generic) {
            this(str, i, generic, Collections.emptyList());
        }

        public Token(String str, int i, TypeDescription.Generic generic, List<? extends TypeDescription.Generic> list) {
            this(str, i, Collections.emptyList(), generic, new ParameterDescription.Token.TypeList(list), Collections.emptyList(), Collections.emptyList(), AnnotationValue.UNDEFINED, TypeDescription.Generic.UNDEFINED);
        }

        public Token(String str, int i, List<? extends TypeVariableToken> list, TypeDescription.Generic generic, List<? extends ParameterDescription.Token> list2, List<? extends TypeDescription.Generic> list3, List<? extends AnnotationDescription> list4, AnnotationValue<?, ?> annotationValue, TypeDescription.Generic generic2) {
            this.name = str;
            this.modifiers = i;
            this.typeVariableTokens = list;
            this.returnType = generic;
            this.parameterTokens = list2;
            this.exceptionTypes = list3;
            this.annotations = list4;
            this.defaultValue = annotationValue;
            this.receiverType = generic2;
        }

        public String getName() {
            return this.name;
        }

        public int getModifiers() {
            return this.modifiers;
        }

        public ByteCodeElement.Token.TokenList<TypeVariableToken> getTypeVariableTokens() {
            return new ByteCodeElement.Token.TokenList<>(this.typeVariableTokens);
        }

        public TypeDescription.Generic getReturnType() {
            return this.returnType;
        }

        public ByteCodeElement.Token.TokenList<ParameterDescription.Token> getParameterTokens() {
            return new ByteCodeElement.Token.TokenList<>(this.parameterTokens);
        }

        public TypeList.Generic getExceptionTypes() {
            return new TypeList.Generic.Explicit(this.exceptionTypes);
        }

        public AnnotationList getAnnotations() {
            return new AnnotationList.Explicit(this.annotations);
        }

        public AnnotationValue<?, ?> getDefaultValue() {
            return this.defaultValue;
        }

        public TypeDescription.Generic getReceiverType() {
            return this.receiverType;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement.Token
        /* renamed from: accept, reason: avoid collision after fix types in other method */
        public Token accept2(TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
            String str = this.name;
            int i = this.modifiers;
            ByteCodeElement.Token.TokenList<TypeVariableToken> accept = getTypeVariableTokens().accept(visitor);
            TypeDescription.Generic generic = (TypeDescription.Generic) this.returnType.accept(visitor);
            ByteCodeElement.Token.TokenList<ParameterDescription.Token> accept2 = getParameterTokens().accept(visitor);
            TypeList.Generic accept3 = getExceptionTypes().accept(visitor);
            List<? extends AnnotationDescription> list = this.annotations;
            AnnotationValue<?, ?> annotationValue = this.defaultValue;
            TypeDescription.Generic generic2 = this.receiverType;
            return new Token(str, i, accept, generic, accept2, accept3, list, annotationValue, generic2 == null ? TypeDescription.Generic.UNDEFINED : (TypeDescription.Generic) generic2.accept(visitor));
        }

        public SignatureToken asSignatureToken(TypeDescription typeDescription) {
            TypeDescription.Generic.Visitor.Reducing reducing = new TypeDescription.Generic.Visitor.Reducing(typeDescription, this.typeVariableTokens);
            ArrayList arrayList = new ArrayList(this.parameterTokens.size());
            Iterator<? extends ParameterDescription.Token> it = this.parameterTokens.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getType().accept(reducing));
            }
            return new SignatureToken(this.name, (TypeDescription) this.returnType.accept(reducing), arrayList);
        }

        public boolean equals(Object obj) {
            AnnotationValue<?, ?> annotationValue;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Token token = (Token) obj;
            if (this.modifiers == token.modifiers && this.name.equals(token.name) && this.typeVariableTokens.equals(token.typeVariableTokens) && this.returnType.equals(token.returnType) && this.parameterTokens.equals(token.parameterTokens) && this.exceptionTypes.equals(token.exceptionTypes) && this.annotations.equals(token.annotations) && ((annotationValue = this.defaultValue) == null ? token.defaultValue == null : annotationValue.equals(token.defaultValue))) {
                TypeDescription.Generic generic = this.receiverType;
                if (generic != null) {
                    if (generic.equals(token.receiverType)) {
                        return true;
                    }
                } else if (token.receiverType == null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((((((((((((this.name.hashCode() * 31) + this.modifiers) * 31) + this.typeVariableTokens.hashCode()) * 31) + this.returnType.hashCode()) * 31) + this.parameterTokens.hashCode()) * 31) + this.exceptionTypes.hashCode()) * 31) + this.annotations.hashCode()) * 31;
            AnnotationValue<?, ?> annotationValue = this.defaultValue;
            int hashCode2 = (hashCode + (annotationValue != null ? annotationValue.hashCode() : 0)) * 31;
            TypeDescription.Generic generic = this.receiverType;
            return hashCode2 + (generic != null ? generic.hashCode() : 0);
        }

        public String toString() {
            return "MethodDescription.Token{name='" + this.name + "', modifiers=" + this.modifiers + ", typeVariableTokens=" + this.typeVariableTokens + ", returnType=" + this.returnType + ", parameterTokens=" + this.parameterTokens + ", exceptionTypes=" + this.exceptionTypes + ", annotations=" + this.annotations + ", defaultValue=" + this.defaultValue + ", receiverType=" + this.receiverType + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class SignatureToken {
        private final String name;
        private final List<? extends TypeDescription> parameterTypes;
        private final TypeDescription returnType;

        public SignatureToken(String str, TypeDescription typeDescription, List<? extends TypeDescription> list) {
            this.name = str;
            this.returnType = typeDescription;
            this.parameterTypes = list;
        }

        public String getName() {
            return this.name;
        }

        public TypeDescription getReturnType() {
            return this.returnType;
        }

        public List<TypeDescription> getParameterTypes() {
            return this.parameterTypes;
        }

        public TypeToken asTypeToken() {
            return new TypeToken(this.returnType, this.parameterTypes);
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.returnType.hashCode()) * 31) + this.parameterTypes.hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SignatureToken)) {
                return false;
            }
            SignatureToken signatureToken = (SignatureToken) obj;
            return this.name.equals(signatureToken.name) && this.returnType.equals(signatureToken.returnType) && this.parameterTypes.equals(signatureToken.parameterTypes);
        }

        public String toString() {
            StringBuilder append = new StringBuilder().append(this.returnType).append(' ').append(this.name).append('(');
            boolean z = true;
            for (TypeDescription typeDescription : this.parameterTypes) {
                if (z) {
                    z = false;
                } else {
                    append.append(AbstractJsonLexerKt.COMMA);
                }
                append.append(typeDescription);
            }
            return append.append(')').toString();
        }
    }

    public static class TypeToken {
        private final List<? extends TypeDescription> parameterTypes;
        private final TypeDescription returnType;

        public TypeToken(TypeDescription typeDescription, List<? extends TypeDescription> list) {
            this.returnType = typeDescription;
            this.parameterTypes = list;
        }

        public TypeDescription getReturnType() {
            return this.returnType;
        }

        public List<TypeDescription> getParameterTypes() {
            return this.parameterTypes;
        }

        public int hashCode() {
            return (this.returnType.hashCode() * 31) + this.parameterTypes.hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TypeToken)) {
                return false;
            }
            TypeToken typeToken = (TypeToken) obj;
            return this.returnType.equals(typeToken.returnType) && this.parameterTypes.equals(typeToken.parameterTypes);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("(");
            Iterator<? extends TypeDescription> it = this.parameterTypes.iterator();
            while (it.hasNext()) {
                sb.append(it.next().getDescriptor());
            }
            return sb.append(')').append(this.returnType.getDescriptor()).toString();
        }
    }
}
