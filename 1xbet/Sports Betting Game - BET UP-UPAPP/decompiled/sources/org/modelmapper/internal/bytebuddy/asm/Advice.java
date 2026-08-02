package org.modelmapper.internal.bytebuddy.asm;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.modelmapper.internal.asm.AnnotationVisitor;
import org.modelmapper.internal.asm.Attribute;
import org.modelmapper.internal.asm.ClassReader;
import org.modelmapper.internal.asm.ClassVisitor;
import org.modelmapper.internal.asm.Label;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.asm.Type;
import org.modelmapper.internal.asm.TypePath;
import org.modelmapper.internal.bytebuddy.ClassFileVersion;
import org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.enumeration.EnumerationDescription;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodList;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterList;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator;
import org.modelmapper.internal.bytebuddy.dynamic.TargetType;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldLocator;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.SuperMethodCall;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Addition;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Duplication;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Removal;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackSize;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.collection.ArrayAccess;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.collection.ArrayFactory;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.ClassConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.DefaultValue;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.DoubleConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.FloatConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.LongConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.MethodConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.NullConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.SerializedConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.TextConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.FieldAccess;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;
import org.modelmapper.internal.bytebuddy.pool.TypePool;
import org.modelmapper.internal.bytebuddy.utility.CompoundList;
import org.modelmapper.internal.bytebuddy.utility.JavaType;
import org.modelmapper.internal.bytebuddy.utility.OpenedClassReader;
import org.modelmapper.internal.bytebuddy.utility.visitor.ExceptionTableSensitiveMethodVisitor;
import org.modelmapper.internal.bytebuddy.utility.visitor.LineNumberPrependingMethodVisitor;
import org.modelmapper.internal.bytebuddy.utility.visitor.StackAwareMethodVisitor;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class Advice implements AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper, Implementation {
    private static final MethodDescription.InDefinedShape BACKUP_ARGUMENTS;
    private static final MethodDescription.InDefinedShape INLINE_ENTER;
    private static final MethodDescription.InDefinedShape INLINE_EXIT;
    private static final MethodDescription.InDefinedShape ON_THROWABLE;
    private static final MethodDescription.InDefinedShape PREPEND_LINE_NUMBER;
    private static final MethodDescription.InDefinedShape REPEAT_ON;
    private static final MethodDescription.InDefinedShape SKIP_ON;
    private static final MethodDescription.InDefinedShape SUPPRESS_ENTER;
    private static final MethodDescription.InDefinedShape SUPPRESS_EXIT;
    private static final ClassReader UNDEFINED = null;
    private final Assigner assigner;
    private final Implementation delegate;
    private final ExceptionHandler exceptionHandler;
    private final Dispatcher.Resolved.ForMethodEnter methodEnter;
    private final Dispatcher.Resolved.ForMethodExit methodExit;

    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface AllArguments {
        boolean readOnly() default true;

        Assigner.Typing typing() default Assigner.Typing.STATIC;
    }

    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Argument {
        boolean optional() default false;

        boolean readOnly() default true;

        Assigner.Typing typing() default Assigner.Typing.STATIC;

        int value();
    }

    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Enter {
        boolean readOnly() default true;

        Assigner.Typing typing() default Assigner.Typing.STATIC;
    }

    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Exit {
        boolean readOnly() default true;

        Assigner.Typing typing() default Assigner.Typing.STATIC;
    }

    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface FieldValue {
        Class<?> declaringType() default void.class;

        boolean readOnly() default true;

        Assigner.Typing typing() default Assigner.Typing.STATIC;

        String value();
    }

    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Local {
        String value();
    }

    @Target({ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface OnMethodEnter {
        boolean inline() default true;

        boolean prependLineNumber() default true;

        Class<?> skipOn() default void.class;

        Class<? extends Throwable> suppress() default NoExceptionHandler.class;
    }

    @Target({ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface OnMethodExit {
        boolean backupArguments() default true;

        boolean inline() default true;

        Class<? extends Throwable> onThrowable() default NoExceptionHandler.class;

        Class<?> repeatOn() default void.class;

        Class<? extends Throwable> suppress() default NoExceptionHandler.class;
    }

    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Origin {
        public static final String DEFAULT = "";

        String value() default "";
    }

    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Return {
        boolean readOnly() default true;

        Assigner.Typing typing() default Assigner.Typing.STATIC;
    }

    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface StubValue {
    }

    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface This {
        boolean optional() default false;

        boolean readOnly() default true;

        Assigner.Typing typing() default Assigner.Typing.STATIC;
    }

    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Thrown {
        boolean readOnly() default true;

        Assigner.Typing typing() default Assigner.Typing.DYNAMIC;
    }

    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Unused {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Advice advice = (Advice) obj;
        return this.methodEnter.equals(advice.methodEnter) && this.methodExit.equals(advice.methodExit) && this.assigner.equals(advice.assigner) && this.exceptionHandler.equals(advice.exceptionHandler) && this.delegate.equals(advice.delegate);
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodEnter.hashCode()) * 31) + this.methodExit.hashCode()) * 31) + this.assigner.hashCode()) * 31) + this.exceptionHandler.hashCode()) * 31) + this.delegate.hashCode();
    }

    static {
        MethodList<MethodDescription.InDefinedShape> declaredMethods = TypeDescription.ForLoadedType.of(OnMethodEnter.class).getDeclaredMethods();
        SKIP_ON = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("skipOn")).getOnly();
        PREPEND_LINE_NUMBER = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("prependLineNumber")).getOnly();
        INLINE_ENTER = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("inline")).getOnly();
        SUPPRESS_ENTER = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("suppress")).getOnly();
        MethodList<MethodDescription.InDefinedShape> declaredMethods2 = TypeDescription.ForLoadedType.of(OnMethodExit.class).getDeclaredMethods();
        REPEAT_ON = (MethodDescription.InDefinedShape) declaredMethods2.filter(ElementMatchers.named("repeatOn")).getOnly();
        ON_THROWABLE = (MethodDescription.InDefinedShape) declaredMethods2.filter(ElementMatchers.named("onThrowable")).getOnly();
        BACKUP_ARGUMENTS = (MethodDescription.InDefinedShape) declaredMethods2.filter(ElementMatchers.named("backupArguments")).getOnly();
        INLINE_EXIT = (MethodDescription.InDefinedShape) declaredMethods2.filter(ElementMatchers.named("inline")).getOnly();
        SUPPRESS_EXIT = (MethodDescription.InDefinedShape) declaredMethods2.filter(ElementMatchers.named("suppress")).getOnly();
    }

    protected Advice(Dispatcher.Resolved.ForMethodEnter forMethodEnter, Dispatcher.Resolved.ForMethodExit forMethodExit) {
        this(forMethodEnter, forMethodExit, Assigner.DEFAULT, ExceptionHandler.Default.SUPPRESSING, SuperMethodCall.INSTANCE);
    }

    private Advice(Dispatcher.Resolved.ForMethodEnter forMethodEnter, Dispatcher.Resolved.ForMethodExit forMethodExit, Assigner assigner, ExceptionHandler exceptionHandler, Implementation implementation) {
        this.methodEnter = forMethodEnter;
        this.methodExit = forMethodExit;
        this.assigner = assigner;
        this.exceptionHandler = exceptionHandler;
        this.delegate = implementation;
    }

    public static Advice to(Class<?> cls) {
        return to(cls, ClassFileLocator.ForClassLoader.of(cls.getClassLoader()));
    }

    public static Advice to(Class<?> cls, ClassFileLocator classFileLocator) {
        return to(TypeDescription.ForLoadedType.of(cls), classFileLocator);
    }

    public static Advice to(TypeDescription typeDescription) {
        return to(typeDescription, ClassFileLocator.NoOp.INSTANCE);
    }

    public static Advice to(TypeDescription typeDescription, ClassFileLocator classFileLocator) {
        return to(typeDescription, classFileLocator, (List<? extends OffsetMapping.Factory<?>>) Collections.emptyList());
    }

    protected static Advice to(TypeDescription typeDescription, ClassFileLocator classFileLocator, List<? extends OffsetMapping.Factory<?>> list) {
        ClassReader of;
        Dispatcher.Unresolved unresolved = Dispatcher.Inactive.INSTANCE;
        Dispatcher.Unresolved unresolved2 = Dispatcher.Inactive.INSTANCE;
        for (MethodDescription.InDefinedShape inDefinedShape : typeDescription.getDeclaredMethods()) {
            unresolved = locate(OnMethodEnter.class, INLINE_ENTER, unresolved, inDefinedShape);
            unresolved2 = locate(OnMethodExit.class, INLINE_EXIT, unresolved2, inDefinedShape);
        }
        if (!unresolved.isAlive() && !unresolved2.isAlive()) {
            throw new IllegalArgumentException("No advice defined by " + typeDescription);
        }
        try {
            if (!unresolved.isBinary() && !unresolved2.isBinary()) {
                of = UNDEFINED;
                return new Advice(unresolved.asMethodEnter(list, of, unresolved2), unresolved2.asMethodExit(list, of, unresolved));
            }
            of = OpenedClassReader.of(classFileLocator.locate(typeDescription.getName()).resolve());
            return new Advice(unresolved.asMethodEnter(list, of, unresolved2), unresolved2.asMethodExit(list, of, unresolved));
        } catch (IOException e) {
            throw new IllegalStateException("Error reading class file of " + typeDescription, e);
        }
    }

    public static Advice to(Class<?> cls, Class<?> cls2) {
        ClassLoader classLoader = cls.getClassLoader();
        ClassLoader classLoader2 = cls2.getClassLoader();
        return to(cls, cls2, classLoader == classLoader2 ? ClassFileLocator.ForClassLoader.of(classLoader) : new ClassFileLocator.Compound(ClassFileLocator.ForClassLoader.of(classLoader), ClassFileLocator.ForClassLoader.of(classLoader2)));
    }

    public static Advice to(Class<?> cls, Class<?> cls2, ClassFileLocator classFileLocator) {
        return to(TypeDescription.ForLoadedType.of(cls), TypeDescription.ForLoadedType.of(cls2), classFileLocator);
    }

    public static Advice to(TypeDescription typeDescription, TypeDescription typeDescription2) {
        return to(typeDescription, typeDescription2, ClassFileLocator.NoOp.INSTANCE);
    }

    public static Advice to(TypeDescription typeDescription, TypeDescription typeDescription2, ClassFileLocator classFileLocator) {
        return to(typeDescription, typeDescription2, classFileLocator, Collections.emptyList());
    }

    protected static Advice to(TypeDescription typeDescription, TypeDescription typeDescription2, ClassFileLocator classFileLocator, List<? extends OffsetMapping.Factory<?>> list) {
        Dispatcher.Unresolved unresolved = Dispatcher.Inactive.INSTANCE;
        Dispatcher.Unresolved unresolved2 = Dispatcher.Inactive.INSTANCE;
        Iterator it = typeDescription.getDeclaredMethods().iterator();
        while (it.hasNext()) {
            unresolved = locate(OnMethodEnter.class, INLINE_ENTER, unresolved, (MethodDescription.InDefinedShape) it.next());
        }
        if (!unresolved.isAlive()) {
            throw new IllegalArgumentException("No enter advice defined by " + typeDescription);
        }
        Iterator it2 = typeDescription2.getDeclaredMethods().iterator();
        while (it2.hasNext()) {
            unresolved2 = locate(OnMethodExit.class, INLINE_EXIT, unresolved2, (MethodDescription.InDefinedShape) it2.next());
        }
        if (!unresolved2.isAlive()) {
            throw new IllegalArgumentException("No exit advice defined by " + typeDescription2);
        }
        try {
            return new Advice(unresolved.asMethodEnter(list, unresolved.isBinary() ? OpenedClassReader.of(classFileLocator.locate(typeDescription.getName()).resolve()) : UNDEFINED, unresolved2), unresolved2.asMethodExit(list, unresolved2.isBinary() ? OpenedClassReader.of(classFileLocator.locate(typeDescription2.getName()).resolve()) : UNDEFINED, unresolved));
        } catch (IOException e) {
            throw new IllegalStateException("Error reading class file of " + typeDescription + " or " + typeDescription2, e);
        }
    }

    private static Dispatcher.Unresolved locate(Class<? extends Annotation> cls, MethodDescription.InDefinedShape inDefinedShape, Dispatcher.Unresolved unresolved, MethodDescription.InDefinedShape inDefinedShape2) {
        AnnotationDescription.Loadable ofType = inDefinedShape2.getDeclaredAnnotations().ofType(cls);
        if (ofType == null) {
            return unresolved;
        }
        if (unresolved.isAlive()) {
            throw new IllegalStateException("Duplicate advice for " + unresolved + " and " + inDefinedShape2);
        }
        if (inDefinedShape2.isStatic()) {
            return ((Boolean) ofType.getValue(inDefinedShape).resolve(Boolean.class)).booleanValue() ? new Dispatcher.Inlining(inDefinedShape2) : new Dispatcher.Delegating(inDefinedShape2);
        }
        throw new IllegalStateException("Advice for " + inDefinedShape2 + " is not static");
    }

    public static WithCustomMapping withCustomMapping() {
        return new WithCustomMapping();
    }

    public AsmVisitorWrapper.ForDeclaredMethods on(ElementMatcher<? super MethodDescription> elementMatcher) {
        return new AsmVisitorWrapper.ForDeclaredMethods().method(elementMatcher, this);
    }

    @Override // org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper
    public MethodVisitor wrap(TypeDescription typeDescription, MethodDescription methodDescription, MethodVisitor methodVisitor, Implementation.Context context, TypePool typePool, int i, int i2) {
        return (methodDescription.isAbstract() || methodDescription.isNative()) ? methodVisitor : doWrap(typeDescription, methodDescription, methodVisitor, context, i, i2);
    }

    protected MethodVisitor doWrap(TypeDescription typeDescription, MethodDescription methodDescription, MethodVisitor methodVisitor, Implementation.Context context, int i, int i2) {
        MethodVisitor lineNumberPrependingMethodVisitor = this.methodEnter.isPrependLineNumber() ? new LineNumberPrependingMethodVisitor(methodVisitor) : methodVisitor;
        if (!this.methodExit.isAlive()) {
            return new AdviceVisitor.WithoutExitAdvice(lineNumberPrependingMethodVisitor, context, this.assigner, this.exceptionHandler.resolve(methodDescription, typeDescription), typeDescription, methodDescription, this.methodEnter, i, i2);
        }
        if (this.methodExit.getThrowable().represents(NoExceptionHandler.class)) {
            return new AdviceVisitor.WithExitAdvice.WithoutExceptionHandling(lineNumberPrependingMethodVisitor, context, this.assigner, this.exceptionHandler.resolve(methodDescription, typeDescription), typeDescription, methodDescription, this.methodEnter, this.methodExit, i, i2);
        }
        if (methodDescription.isConstructor()) {
            throw new IllegalStateException("Cannot catch exception during constructor call for " + methodDescription);
        }
        Assigner assigner = this.assigner;
        StackManipulation resolve = this.exceptionHandler.resolve(methodDescription, typeDescription);
        Dispatcher.Resolved.ForMethodEnter forMethodEnter = this.methodEnter;
        Dispatcher.Resolved.ForMethodExit forMethodExit = this.methodExit;
        return new AdviceVisitor.WithExitAdvice.WithExceptionHandling(lineNumberPrependingMethodVisitor, context, assigner, resolve, typeDescription, methodDescription, forMethodEnter, forMethodExit, i, i2, forMethodExit.getThrowable());
    }

    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public InstrumentedType prepare(InstrumentedType instrumentedType) {
        return this.delegate.prepare(instrumentedType);
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
    public ByteCodeAppender appender(Implementation.Target target) {
        return new Appender(this, target, this.delegate.appender(target));
    }

    public Advice withAssigner(Assigner assigner) {
        return new Advice(this.methodEnter, this.methodExit, assigner, this.exceptionHandler, this.delegate);
    }

    public Advice withExceptionPrinting() {
        return withExceptionHandler(ExceptionHandler.Default.PRINTING);
    }

    public Advice withExceptionHandler(StackManipulation stackManipulation) {
        return withExceptionHandler(new ExceptionHandler.Simple(stackManipulation));
    }

    public Advice withExceptionHandler(ExceptionHandler exceptionHandler) {
        return new Advice(this.methodEnter, this.methodExit, this.assigner, exceptionHandler, this.delegate);
    }

    public Implementation wrap(Implementation implementation) {
        return new Advice(this.methodEnter, this.methodExit, this.assigner, this.exceptionHandler, implementation);
    }

    public interface OffsetMapping {

        public enum Sort {
            ENTER { // from class: org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Sort.1
                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Sort
                public boolean isPremature(MethodDescription methodDescription) {
                    return methodDescription.isConstructor();
                }
            },
            EXIT { // from class: org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Sort.2
                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Sort
                public boolean isPremature(MethodDescription methodDescription) {
                    return false;
                }
            };

            public abstract boolean isPremature(MethodDescription methodDescription);
        }

        Target resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, ArgumentHandler argumentHandler, Sort sort);

        public interface Target {
            StackManipulation resolveIncrement(int i);

            StackManipulation resolveRead();

            StackManipulation resolveWrite();

            public static abstract class AbstractReadOnlyAdapter implements Target {
                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target
                public StackManipulation resolveWrite() {
                    throw new IllegalStateException("Cannot write to read-only value");
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target
                public StackManipulation resolveIncrement(int i) {
                    throw new IllegalStateException("Cannot write to read-only value");
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static abstract class ForDefaultValue implements Target {
                protected final StackManipulation readAssignment;
                protected final TypeDefinition typeDefinition;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    ForDefaultValue forDefaultValue = (ForDefaultValue) obj;
                    return this.typeDefinition.equals(forDefaultValue.typeDefinition) && this.readAssignment.equals(forDefaultValue.readAssignment);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDefinition.hashCode()) * 31) + this.readAssignment.hashCode();
                }

                protected ForDefaultValue(TypeDefinition typeDefinition, StackManipulation stackManipulation) {
                    this.typeDefinition = typeDefinition;
                    this.readAssignment = stackManipulation;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target
                public StackManipulation resolveRead() {
                    return new StackManipulation.Compound(DefaultValue.of(this.typeDefinition), this.readAssignment);
                }

                public static class ReadOnly extends ForDefaultValue {
                    public ReadOnly(TypeDefinition typeDefinition) {
                        this(typeDefinition, StackManipulation.Trivial.INSTANCE);
                    }

                    public ReadOnly(TypeDefinition typeDefinition, StackManipulation stackManipulation) {
                        super(typeDefinition, stackManipulation);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target
                    public StackManipulation resolveWrite() {
                        throw new IllegalStateException("Cannot write to read-only default value");
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target
                    public StackManipulation resolveIncrement(int i) {
                        throw new IllegalStateException("Cannot write to read-only default value");
                    }
                }

                public static class ReadWrite extends ForDefaultValue {
                    public ReadWrite(TypeDefinition typeDefinition) {
                        this(typeDefinition, StackManipulation.Trivial.INSTANCE);
                    }

                    public ReadWrite(TypeDefinition typeDefinition, StackManipulation stackManipulation) {
                        super(typeDefinition, stackManipulation);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target
                    public StackManipulation resolveWrite() {
                        return Removal.of(this.typeDefinition);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target
                    public StackManipulation resolveIncrement(int i) {
                        return StackManipulation.Trivial.INSTANCE;
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static abstract class ForVariable implements Target {
                protected final int offset;
                protected final StackManipulation readAssignment;
                protected final TypeDefinition typeDefinition;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    ForVariable forVariable = (ForVariable) obj;
                    return this.typeDefinition.equals(forVariable.typeDefinition) && this.offset == forVariable.offset && this.readAssignment.equals(forVariable.readAssignment);
                }

                public int hashCode() {
                    return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDefinition.hashCode()) * 31) + this.offset) * 31) + this.readAssignment.hashCode();
                }

                protected ForVariable(TypeDefinition typeDefinition, int i, StackManipulation stackManipulation) {
                    this.typeDefinition = typeDefinition;
                    this.offset = i;
                    this.readAssignment = stackManipulation;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target
                public StackManipulation resolveRead() {
                    return new StackManipulation.Compound(MethodVariableAccess.of(this.typeDefinition).loadFrom(this.offset), this.readAssignment);
                }

                public static class ReadOnly extends ForVariable {
                    public ReadOnly(TypeDefinition typeDefinition, int i) {
                        this(typeDefinition, i, StackManipulation.Trivial.INSTANCE);
                    }

                    public ReadOnly(TypeDefinition typeDefinition, int i, StackManipulation stackManipulation) {
                        super(typeDefinition, i, stackManipulation);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target
                    public StackManipulation resolveWrite() {
                        throw new IllegalStateException("Cannot write to read-only parameter " + this.typeDefinition + " at " + this.offset);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target
                    public StackManipulation resolveIncrement(int i) {
                        throw new IllegalStateException("Cannot write to read-only variable " + this.typeDefinition + " at " + this.offset);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ReadWrite extends ForVariable {
                    private final StackManipulation writeAssignment;

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target.ForVariable
                    public boolean equals(Object obj) {
                        if (!super.equals(obj)) {
                            return false;
                        }
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.writeAssignment.equals(((ReadWrite) obj).writeAssignment);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target.ForVariable
                    public int hashCode() {
                        return (super.hashCode() * 31) + this.writeAssignment.hashCode();
                    }

                    public ReadWrite(TypeDefinition typeDefinition, int i) {
                        this(typeDefinition, i, StackManipulation.Trivial.INSTANCE, StackManipulation.Trivial.INSTANCE);
                    }

                    public ReadWrite(TypeDefinition typeDefinition, int i, StackManipulation stackManipulation, StackManipulation stackManipulation2) {
                        super(typeDefinition, i, stackManipulation);
                        this.writeAssignment = stackManipulation2;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target
                    public StackManipulation resolveWrite() {
                        return new StackManipulation.Compound(this.writeAssignment, MethodVariableAccess.of(this.typeDefinition).storeAt(this.offset));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target
                    public StackManipulation resolveIncrement(int i) {
                        return this.typeDefinition.represents(Integer.TYPE) ? MethodVariableAccess.of(this.typeDefinition).increment(this.offset, i) : new StackManipulation.Compound(resolveRead(), IntegerConstant.forValue(1), Addition.INTEGER, resolveWrite());
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static abstract class ForArray implements Target {
                protected final TypeDescription.Generic target;
                protected final List<? extends StackManipulation> valueReads;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    ForArray forArray = (ForArray) obj;
                    return this.target.equals(forArray.target) && this.valueReads.equals(forArray.valueReads);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.target.hashCode()) * 31) + this.valueReads.hashCode();
                }

                protected ForArray(TypeDescription.Generic generic, List<? extends StackManipulation> list) {
                    this.target = generic;
                    this.valueReads = list;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target
                public StackManipulation resolveRead() {
                    return ArrayFactory.forType(this.target).withValues(this.valueReads);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target
                public StackManipulation resolveIncrement(int i) {
                    throw new IllegalStateException("Cannot increment read-only array value");
                }

                public static class ReadOnly extends ForArray {
                    public ReadOnly(TypeDescription.Generic generic, List<? extends StackManipulation> list) {
                        super(generic, list);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target
                    public StackManipulation resolveWrite() {
                        throw new IllegalStateException("Cannot write to read-only array value");
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ReadWrite extends ForArray {
                    private final List<? extends StackManipulation> valueWrites;

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target.ForArray
                    public boolean equals(Object obj) {
                        if (!super.equals(obj)) {
                            return false;
                        }
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.valueWrites.equals(((ReadWrite) obj).valueWrites);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target.ForArray
                    public int hashCode() {
                        return (super.hashCode() * 31) + this.valueWrites.hashCode();
                    }

                    public ReadWrite(TypeDescription.Generic generic, List<? extends StackManipulation> list, List<? extends StackManipulation> list2) {
                        super(generic, list);
                        this.valueWrites = list2;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target
                    public StackManipulation resolveWrite() {
                        return ArrayAccess.of(this.target).forEach(this.valueWrites);
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static abstract class ForField implements Target {
                protected final FieldDescription fieldDescription;
                protected final StackManipulation readAssignment;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    ForField forField = (ForField) obj;
                    return this.fieldDescription.equals(forField.fieldDescription) && this.readAssignment.equals(forField.readAssignment);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fieldDescription.hashCode()) * 31) + this.readAssignment.hashCode();
                }

                protected ForField(FieldDescription fieldDescription, StackManipulation stackManipulation) {
                    this.fieldDescription = fieldDescription;
                    this.readAssignment = stackManipulation;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target
                public StackManipulation resolveRead() {
                    StackManipulation[] stackManipulationArr = new StackManipulation[3];
                    stackManipulationArr[0] = this.fieldDescription.isStatic() ? StackManipulation.Trivial.INSTANCE : MethodVariableAccess.loadThis();
                    stackManipulationArr[1] = FieldAccess.forField(this.fieldDescription).read();
                    stackManipulationArr[2] = this.readAssignment;
                    return new StackManipulation.Compound(stackManipulationArr);
                }

                public static class ReadOnly extends ForField {
                    public ReadOnly(FieldDescription fieldDescription) {
                        this(fieldDescription, StackManipulation.Trivial.INSTANCE);
                    }

                    public ReadOnly(FieldDescription fieldDescription, StackManipulation stackManipulation) {
                        super(fieldDescription, stackManipulation);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target
                    public StackManipulation resolveWrite() {
                        throw new IllegalStateException("Cannot write to read-only field value");
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target
                    public StackManipulation resolveIncrement(int i) {
                        throw new IllegalStateException("Cannot write to read-only field value");
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ReadWrite extends ForField {
                    private final StackManipulation writeAssignment;

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target.ForField
                    public boolean equals(Object obj) {
                        if (!super.equals(obj)) {
                            return false;
                        }
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.writeAssignment.equals(((ReadWrite) obj).writeAssignment);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target.ForField
                    public int hashCode() {
                        return (super.hashCode() * 31) + this.writeAssignment.hashCode();
                    }

                    public ReadWrite(FieldDescription fieldDescription) {
                        this(fieldDescription, StackManipulation.Trivial.INSTANCE, StackManipulation.Trivial.INSTANCE);
                    }

                    public ReadWrite(FieldDescription fieldDescription, StackManipulation stackManipulation, StackManipulation stackManipulation2) {
                        super(fieldDescription, stackManipulation);
                        this.writeAssignment = stackManipulation2;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target
                    public StackManipulation resolveWrite() {
                        StackManipulation compound;
                        if (this.fieldDescription.isStatic()) {
                            compound = StackManipulation.Trivial.INSTANCE;
                        } else {
                            compound = new StackManipulation.Compound(MethodVariableAccess.loadThis(), Duplication.SINGLE.flipOver(this.fieldDescription.getType()), Removal.SINGLE);
                        }
                        return new StackManipulation.Compound(this.writeAssignment, compound, FieldAccess.forField(this.fieldDescription).write());
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target
                    public StackManipulation resolveIncrement(int i) {
                        return new StackManipulation.Compound(resolveRead(), IntegerConstant.forValue(i), Addition.INTEGER, resolveWrite());
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForStackManipulation implements Target {
                private final StackManipulation stackManipulation;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.stackManipulation.equals(((ForStackManipulation) obj).stackManipulation);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.stackManipulation.hashCode();
                }

                public ForStackManipulation(StackManipulation stackManipulation) {
                    this.stackManipulation = stackManipulation;
                }

                public static Target of(MethodDescription.InDefinedShape inDefinedShape) {
                    return new ForStackManipulation(MethodConstant.of(inDefinedShape));
                }

                public static Target of(TypeDescription typeDescription) {
                    return new ForStackManipulation(ClassConstant.of(typeDescription));
                }

                public static Target of(Object obj) {
                    if (obj == null) {
                        return new ForStackManipulation(NullConstant.INSTANCE);
                    }
                    if (obj instanceof Boolean) {
                        return new ForStackManipulation(IntegerConstant.forValue(((Boolean) obj).booleanValue()));
                    }
                    if (obj instanceof Byte) {
                        return new ForStackManipulation(IntegerConstant.forValue(((Byte) obj).byteValue()));
                    }
                    if (obj instanceof Short) {
                        return new ForStackManipulation(IntegerConstant.forValue(((Short) obj).shortValue()));
                    }
                    if (obj instanceof Character) {
                        return new ForStackManipulation(IntegerConstant.forValue(((Character) obj).charValue()));
                    }
                    if (obj instanceof Integer) {
                        return new ForStackManipulation(IntegerConstant.forValue(((Integer) obj).intValue()));
                    }
                    if (obj instanceof Long) {
                        return new ForStackManipulation(LongConstant.forValue(((Long) obj).longValue()));
                    }
                    if (obj instanceof Float) {
                        return new ForStackManipulation(FloatConstant.forValue(((Float) obj).floatValue()));
                    }
                    if (obj instanceof Double) {
                        return new ForStackManipulation(DoubleConstant.forValue(((Double) obj).doubleValue()));
                    }
                    if (obj instanceof String) {
                        return new ForStackManipulation(new TextConstant((String) obj));
                    }
                    throw new IllegalArgumentException("Not a constant value: " + obj);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target
                public StackManipulation resolveRead() {
                    return this.stackManipulation;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target
                public StackManipulation resolveWrite() {
                    throw new IllegalStateException("Cannot write to constant value: " + this.stackManipulation);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Target
                public StackManipulation resolveIncrement(int i) {
                    throw new IllegalStateException("Cannot write to constant value: " + this.stackManipulation);
                }
            }
        }

        public interface Factory<T extends Annotation> {
            Class<T> getAnnotationType();

            OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<T> loadable, AdviceType adviceType);

            public enum AdviceType {
                DELEGATION(true),
                INLINING(false);

                private final boolean delegation;

                AdviceType(boolean z) {
                    this.delegation = z;
                }

                public boolean isDelegation() {
                    return this.delegation;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Simple<T extends Annotation> implements Factory<T> {
                private final Class<T> annotationType;
                private final OffsetMapping offsetMapping;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Simple simple = (Simple) obj;
                    return this.annotationType.equals(simple.annotationType) && this.offsetMapping.equals(simple.offsetMapping);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.annotationType.hashCode()) * 31) + this.offsetMapping.hashCode();
                }

                public Simple(Class<T> cls, OffsetMapping offsetMapping) {
                    this.annotationType = cls;
                    this.offsetMapping = offsetMapping;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public Class<T> getAnnotationType() {
                    return this.annotationType;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<T> loadable, AdviceType adviceType) {
                    return this.offsetMapping;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Illegal<T extends Annotation> implements Factory<T> {
                private final Class<T> annotationType;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.annotationType.equals(((Illegal) obj).annotationType);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.annotationType.hashCode();
                }

                public Illegal(Class<T> cls) {
                    this.annotationType = cls;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public Class<T> getAnnotationType() {
                    return this.annotationType;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<T> loadable, AdviceType adviceType) {
                    throw new IllegalStateException("Usage of " + this.annotationType + " is not allowed on " + inDefinedShape);
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static abstract class ForArgument implements OffsetMapping {
            protected final boolean readOnly;
            protected final TypeDescription.Generic target;
            private final Assigner.Typing typing;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForArgument forArgument = (ForArgument) obj;
                return this.target.equals(forArgument.target) && this.readOnly == forArgument.readOnly && this.typing.equals(forArgument.typing);
            }

            public int hashCode() {
                return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.target.hashCode()) * 31) + (this.readOnly ? 1 : 0)) * 31) + this.typing.hashCode();
            }

            protected abstract ParameterDescription resolve(MethodDescription methodDescription);

            protected ForArgument(TypeDescription.Generic generic, boolean z, Assigner.Typing typing) {
                this.target = generic;
                this.readOnly = z;
                this.typing = typing;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping
            public Target resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, ArgumentHandler argumentHandler, Sort sort) {
                ParameterDescription resolve = resolve(methodDescription);
                StackManipulation assign = assigner.assign(resolve.getType(), this.target, this.typing);
                if (!assign.isValid()) {
                    throw new IllegalStateException("Cannot assign " + resolve + " to " + this.target);
                }
                if (this.readOnly) {
                    return new Target.ForVariable.ReadOnly(resolve.getType(), argumentHandler.argument(resolve.getOffset()), assign);
                }
                StackManipulation assign2 = assigner.assign(this.target, resolve.getType(), this.typing);
                if (!assign2.isValid()) {
                    throw new IllegalStateException("Cannot assign " + resolve + " to " + this.target);
                }
                return new Target.ForVariable.ReadWrite(resolve.getType(), argumentHandler.argument(resolve.getOffset()), assign, assign2);
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Unresolved extends ForArgument {
                private final int index;
                private final boolean optional;

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForArgument
                public boolean equals(Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Unresolved unresolved = (Unresolved) obj;
                    return this.index == unresolved.index && this.optional == unresolved.optional;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForArgument
                public int hashCode() {
                    return (((super.hashCode() * 31) + this.index) * 31) + (this.optional ? 1 : 0);
                }

                protected Unresolved(TypeDescription.Generic generic, Argument argument) {
                    this(generic, argument.readOnly(), argument.typing(), argument.value(), argument.optional());
                }

                protected Unresolved(ParameterDescription parameterDescription) {
                    this(parameterDescription.getType(), true, Assigner.Typing.STATIC, parameterDescription.getIndex());
                }

                public Unresolved(TypeDescription.Generic generic, boolean z, Assigner.Typing typing, int i) {
                    this(generic, z, typing, i, false);
                }

                public Unresolved(TypeDescription.Generic generic, boolean z, Assigner.Typing typing, int i, boolean z2) {
                    super(generic, z, typing);
                    this.index = i;
                    this.optional = z2;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForArgument
                protected ParameterDescription resolve(MethodDescription methodDescription) {
                    ParameterList<?> parameters = methodDescription.getParameters();
                    int size = parameters.size();
                    int i = this.index;
                    if (size <= i) {
                        throw new IllegalStateException(methodDescription + " does not define an index " + this.index);
                    }
                    return (ParameterDescription) parameters.get(i);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForArgument, org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping
                public Target resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, ArgumentHandler argumentHandler, Sort sort) {
                    if (!this.optional || methodDescription.getParameters().size() > this.index) {
                        return super.resolve(typeDescription, methodDescription, assigner, argumentHandler, sort);
                    }
                    return this.readOnly ? new Target.ForDefaultValue.ReadOnly(this.target) : new Target.ForDefaultValue.ReadWrite(this.target);
                }

                protected enum Factory implements Factory<Argument> {
                    INSTANCE;

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                    public Class<Argument> getAnnotationType() {
                        return Argument.class;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                    public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<Argument> loadable, Factory.AdviceType adviceType) {
                        if (adviceType.isDelegation() && !loadable.loadSilent().readOnly()) {
                            throw new IllegalStateException("Cannot define writable field access for " + inDefinedShape + " when using delegation");
                        }
                        return new Unresolved(inDefinedShape.getType(), loadable.loadSilent());
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Resolved extends ForArgument {
                private final ParameterDescription parameterDescription;

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForArgument
                public boolean equals(Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.parameterDescription.equals(((Resolved) obj).parameterDescription);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForArgument
                public int hashCode() {
                    return (super.hashCode() * 31) + this.parameterDescription.hashCode();
                }

                public Resolved(TypeDescription.Generic generic, boolean z, Assigner.Typing typing, ParameterDescription parameterDescription) {
                    super(generic, z, typing);
                    this.parameterDescription = parameterDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForArgument
                protected ParameterDescription resolve(MethodDescription methodDescription) {
                    if (!this.parameterDescription.getDeclaringMethod().equals(methodDescription)) {
                        throw new IllegalStateException(this.parameterDescription + " is not a parameter of " + methodDescription);
                    }
                    return this.parameterDescription;
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class Factory<T extends Annotation> implements Factory<T> {
                    private final Class<T> annotationType;
                    private final ParameterDescription parameterDescription;
                    private final boolean readOnly;
                    private final Assigner.Typing typing;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        Factory factory = (Factory) obj;
                        return this.annotationType.equals(factory.annotationType) && this.parameterDescription.equals(factory.parameterDescription) && this.readOnly == factory.readOnly && this.typing.equals(factory.typing);
                    }

                    public int hashCode() {
                        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.annotationType.hashCode()) * 31) + this.parameterDescription.hashCode()) * 31) + (this.readOnly ? 1 : 0)) * 31) + this.typing.hashCode();
                    }

                    public Factory(Class<T> cls, ParameterDescription parameterDescription) {
                        this(cls, parameterDescription, true, Assigner.Typing.STATIC);
                    }

                    public Factory(Class<T> cls, ParameterDescription parameterDescription, boolean z, Assigner.Typing typing) {
                        this.annotationType = cls;
                        this.parameterDescription = parameterDescription;
                        this.readOnly = z;
                        this.typing = typing;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                    public Class<T> getAnnotationType() {
                        return this.annotationType;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                    public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<T> loadable, Factory.AdviceType adviceType) {
                        return new Resolved(inDefinedShape.getType(), this.readOnly, this.typing, this.parameterDescription);
                    }
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForThisReference implements OffsetMapping {
            private final boolean optional;
            private final boolean readOnly;
            private final TypeDescription.Generic target;
            private final Assigner.Typing typing;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForThisReference forThisReference = (ForThisReference) obj;
                return this.target.equals(forThisReference.target) && this.readOnly == forThisReference.readOnly && this.typing.equals(forThisReference.typing) && this.optional == forThisReference.optional;
            }

            public int hashCode() {
                return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.target.hashCode()) * 31) + (this.readOnly ? 1 : 0)) * 31) + this.typing.hashCode()) * 31) + (this.optional ? 1 : 0);
            }

            protected ForThisReference(TypeDescription.Generic generic, This r4) {
                this(generic, r4.readOnly(), r4.typing(), r4.optional());
            }

            public ForThisReference(TypeDescription.Generic generic, boolean z, Assigner.Typing typing, boolean z2) {
                this.target = generic;
                this.readOnly = z;
                this.typing = typing;
                this.optional = z2;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping
            public Target resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, ArgumentHandler argumentHandler, Sort sort) {
                if (methodDescription.isStatic() || sort.isPremature(methodDescription)) {
                    if (this.optional) {
                        return this.readOnly ? new Target.ForDefaultValue.ReadOnly(typeDescription) : new Target.ForDefaultValue.ReadWrite(typeDescription);
                    }
                    throw new IllegalStateException("Cannot map this reference for static method or constructor start: " + methodDescription);
                }
                StackManipulation assign = assigner.assign(typeDescription.asGenericType(), this.target, this.typing);
                if (!assign.isValid()) {
                    throw new IllegalStateException("Cannot assign " + typeDescription + " to " + this.target);
                }
                if (this.readOnly) {
                    return new Target.ForVariable.ReadOnly(typeDescription.asGenericType(), argumentHandler.argument(0), assign);
                }
                StackManipulation assign2 = assigner.assign(this.target, typeDescription.asGenericType(), this.typing);
                if (!assign2.isValid()) {
                    throw new IllegalStateException("Cannot assign " + this.target + " to " + typeDescription);
                }
                return new Target.ForVariable.ReadWrite(typeDescription.asGenericType(), argumentHandler.argument(0), assign, assign2);
            }

            protected enum Factory implements Factory<This> {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public Class<This> getAnnotationType() {
                    return This.class;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<This> loadable, Factory.AdviceType adviceType) {
                    if (adviceType.isDelegation() && !loadable.loadSilent().readOnly()) {
                        throw new IllegalStateException("Cannot write to this reference for " + inDefinedShape + " in read-only context");
                    }
                    return new ForThisReference(inDefinedShape.getType(), loadable.loadSilent());
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForAllArguments implements OffsetMapping {
            private final boolean readOnly;
            private final TypeDescription.Generic target;
            private final Assigner.Typing typing;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForAllArguments forAllArguments = (ForAllArguments) obj;
                return this.target.equals(forAllArguments.target) && this.readOnly == forAllArguments.readOnly && this.typing.equals(forAllArguments.typing);
            }

            public int hashCode() {
                return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.target.hashCode()) * 31) + (this.readOnly ? 1 : 0)) * 31) + this.typing.hashCode();
            }

            protected ForAllArguments(TypeDescription.Generic generic, AllArguments allArguments) {
                this(generic, allArguments.readOnly(), allArguments.typing());
            }

            public ForAllArguments(TypeDescription.Generic generic, boolean z, Assigner.Typing typing) {
                this.target = generic;
                this.readOnly = z;
                this.typing = typing;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping
            public Target resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, ArgumentHandler argumentHandler, Sort sort) {
                ArrayList arrayList = new ArrayList(methodDescription.getParameters().size());
                Iterator it = methodDescription.getParameters().iterator();
                while (it.hasNext()) {
                    ParameterDescription parameterDescription = (ParameterDescription) it.next();
                    StackManipulation assign = assigner.assign(parameterDescription.getType(), this.target, this.typing);
                    if (!assign.isValid()) {
                        throw new IllegalStateException("Cannot assign " + parameterDescription + " to " + this.target);
                    }
                    arrayList.add(new StackManipulation.Compound(MethodVariableAccess.of(parameterDescription.getType()).loadFrom(argumentHandler.argument(parameterDescription.getOffset())), assign));
                }
                if (this.readOnly) {
                    return new Target.ForArray.ReadOnly(this.target, arrayList);
                }
                ArrayList arrayList2 = new ArrayList(methodDescription.getParameters().size());
                Iterator it2 = methodDescription.getParameters().iterator();
                while (it2.hasNext()) {
                    ParameterDescription parameterDescription2 = (ParameterDescription) it2.next();
                    StackManipulation assign2 = assigner.assign(this.target, parameterDescription2.getType(), this.typing);
                    if (!assign2.isValid()) {
                        throw new IllegalStateException("Cannot assign " + this.target + " to " + parameterDescription2);
                    }
                    arrayList2.add(new StackManipulation.Compound(assign2, MethodVariableAccess.of(parameterDescription2.getType()).storeAt(argumentHandler.argument(parameterDescription2.getOffset()))));
                }
                return new Target.ForArray.ReadWrite(this.target, arrayList, arrayList2);
            }

            protected enum Factory implements Factory<AllArguments> {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public Class<AllArguments> getAnnotationType() {
                    return AllArguments.class;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<AllArguments> loadable, Factory.AdviceType adviceType) {
                    if (!inDefinedShape.getType().represents(Object.class) && !inDefinedShape.getType().isArray()) {
                        throw new IllegalStateException("Cannot use AllArguments annotation on a non-array type");
                    }
                    if (adviceType.isDelegation() && !loadable.loadSilent().readOnly()) {
                        throw new IllegalStateException("Cannot define writable field access for " + inDefinedShape);
                    }
                    return new ForAllArguments(inDefinedShape.getType().represents(Object.class) ? TypeDescription.Generic.OBJECT : inDefinedShape.getType().getComponentType(), loadable.loadSilent());
                }
            }
        }

        public enum ForInstrumentedType implements OffsetMapping {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping
            public Target resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, ArgumentHandler argumentHandler, Sort sort) {
                return Target.ForStackManipulation.of(typeDescription);
            }
        }

        public enum ForInstrumentedMethod implements OffsetMapping {
            METHOD { // from class: org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForInstrumentedMethod.1
                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForInstrumentedMethod
                protected boolean isRepresentable(MethodDescription methodDescription) {
                    return methodDescription.isMethod();
                }
            },
            CONSTRUCTOR { // from class: org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForInstrumentedMethod.2
                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForInstrumentedMethod
                protected boolean isRepresentable(MethodDescription methodDescription) {
                    return methodDescription.isConstructor();
                }
            },
            EXECUTABLE { // from class: org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForInstrumentedMethod.3
                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForInstrumentedMethod
                protected boolean isRepresentable(MethodDescription methodDescription) {
                    return true;
                }
            };

            protected abstract boolean isRepresentable(MethodDescription methodDescription);

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping
            public Target resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, ArgumentHandler argumentHandler, Sort sort) {
                if (!isRepresentable(methodDescription)) {
                    throw new IllegalStateException("Cannot represent " + methodDescription + " as given method constant");
                }
                return Target.ForStackManipulation.of(methodDescription.asDefined());
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static abstract class ForField implements OffsetMapping {
            private static final MethodDescription.InDefinedShape DECLARING_TYPE;
            private static final MethodDescription.InDefinedShape READ_ONLY;
            private static final MethodDescription.InDefinedShape TYPING;
            private static final MethodDescription.InDefinedShape VALUE;
            private final boolean readOnly;
            private final TypeDescription.Generic target;
            private final Assigner.Typing typing;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForField forField = (ForField) obj;
                return this.target.equals(forField.target) && this.readOnly == forField.readOnly && this.typing.equals(forField.typing);
            }

            public int hashCode() {
                return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.target.hashCode()) * 31) + (this.readOnly ? 1 : 0)) * 31) + this.typing.hashCode();
            }

            protected abstract FieldDescription resolve(TypeDescription typeDescription);

            static {
                MethodList<MethodDescription.InDefinedShape> declaredMethods = TypeDescription.ForLoadedType.of(FieldValue.class).getDeclaredMethods();
                VALUE = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("value")).getOnly();
                DECLARING_TYPE = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("declaringType")).getOnly();
                READ_ONLY = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("readOnly")).getOnly();
                TYPING = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("typing")).getOnly();
            }

            public ForField(TypeDescription.Generic generic, boolean z, Assigner.Typing typing) {
                this.target = generic;
                this.readOnly = z;
                this.typing = typing;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping
            public Target resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, ArgumentHandler argumentHandler, Sort sort) {
                FieldDescription resolve = resolve(typeDescription);
                if (!resolve.isStatic() && methodDescription.isStatic()) {
                    throw new IllegalStateException("Cannot read non-static field " + resolve + " from static method " + methodDescription);
                }
                if (sort.isPremature(methodDescription) && !resolve.isStatic()) {
                    throw new IllegalStateException("Cannot access non-static field before calling constructor: " + methodDescription);
                }
                StackManipulation assign = assigner.assign(resolve.getType(), this.target, this.typing);
                if (!assign.isValid()) {
                    throw new IllegalStateException("Cannot assign " + resolve + " to " + this.target);
                }
                if (this.readOnly) {
                    return new Target.ForField.ReadOnly(resolve, assign);
                }
                StackManipulation assign2 = assigner.assign(this.target, resolve.getType(), this.typing);
                if (!assign2.isValid()) {
                    throw new IllegalStateException("Cannot assign " + this.target + " to " + resolve);
                }
                return new Target.ForField.ReadWrite(resolve.asDefined(), assign, assign2);
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static abstract class Unresolved extends ForField {
                private final String name;

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForField
                public boolean equals(Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.name.equals(((Unresolved) obj).name);
                }

                protected abstract FieldLocator fieldLocator(TypeDescription typeDescription);

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForField
                public int hashCode() {
                    return (super.hashCode() * 31) + this.name.hashCode();
                }

                public Unresolved(TypeDescription.Generic generic, boolean z, Assigner.Typing typing, String str) {
                    super(generic, z, typing);
                    this.name = str;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForField
                protected FieldDescription resolve(TypeDescription typeDescription) {
                    FieldLocator.Resolution locate = fieldLocator(typeDescription).locate(this.name);
                    if (!locate.isResolved()) {
                        throw new IllegalStateException("Cannot locate field named " + this.name + " for " + typeDescription);
                    }
                    return locate.getField();
                }

                public static class WithImplicitType extends Unresolved {
                    protected WithImplicitType(TypeDescription.Generic generic, AnnotationDescription.Loadable<FieldValue> loadable) {
                        this(generic, ((Boolean) loadable.getValue(ForField.READ_ONLY).resolve(Boolean.class)).booleanValue(), (Assigner.Typing) loadable.getValue(ForField.TYPING).loadSilent(Assigner.Typing.class.getClassLoader()).resolve(Assigner.Typing.class), (String) loadable.getValue(ForField.VALUE).resolve(String.class));
                    }

                    public WithImplicitType(TypeDescription.Generic generic, boolean z, Assigner.Typing typing, String str) {
                        super(generic, z, typing, str);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForField.Unresolved
                    protected FieldLocator fieldLocator(TypeDescription typeDescription) {
                        return new FieldLocator.ForClassHierarchy(typeDescription);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class WithExplicitType extends Unresolved {
                    private final TypeDescription declaringType;

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForField.Unresolved, org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForField
                    public boolean equals(Object obj) {
                        if (!super.equals(obj)) {
                            return false;
                        }
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.declaringType.equals(((WithExplicitType) obj).declaringType);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForField.Unresolved, org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForField
                    public int hashCode() {
                        return (super.hashCode() * 31) + this.declaringType.hashCode();
                    }

                    protected WithExplicitType(TypeDescription.Generic generic, AnnotationDescription.Loadable<FieldValue> loadable, TypeDescription typeDescription) {
                        this(generic, ((Boolean) loadable.getValue(ForField.READ_ONLY).resolve(Boolean.class)).booleanValue(), (Assigner.Typing) loadable.getValue(ForField.TYPING).loadSilent(Assigner.Typing.class.getClassLoader()).resolve(Assigner.Typing.class), (String) loadable.getValue(ForField.VALUE).resolve(String.class), typeDescription);
                    }

                    public WithExplicitType(TypeDescription.Generic generic, boolean z, Assigner.Typing typing, String str, TypeDescription typeDescription) {
                        super(generic, z, typing, str);
                        this.declaringType = typeDescription;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForField.Unresolved
                    protected FieldLocator fieldLocator(TypeDescription typeDescription) {
                        if (!this.declaringType.represents(TargetType.class) && !typeDescription.isAssignableTo(this.declaringType)) {
                            throw new IllegalStateException(this.declaringType + " is no super type of " + typeDescription);
                        }
                        return new FieldLocator.ForExactType(TargetType.resolve(this.declaringType, typeDescription));
                    }
                }

                protected enum Factory implements Factory<FieldValue> {
                    INSTANCE;

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                    public Class<FieldValue> getAnnotationType() {
                        return FieldValue.class;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                    public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<FieldValue> loadable, Factory.AdviceType adviceType) {
                        if (!adviceType.isDelegation() || ((Boolean) loadable.getValue(ForField.READ_ONLY).resolve(Boolean.class)).booleanValue()) {
                            TypeDescription typeDescription = (TypeDescription) loadable.getValue(ForField.DECLARING_TYPE).resolve(TypeDescription.class);
                            if (typeDescription.represents(Void.TYPE)) {
                                return new WithImplicitType(inDefinedShape.getType(), loadable);
                            }
                            return new WithExplicitType(inDefinedShape.getType(), loadable, typeDescription);
                        }
                        throw new IllegalStateException("Cannot write to field for " + inDefinedShape + " in read-only context");
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Resolved extends ForField {
                private final FieldDescription fieldDescription;

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForField
                public boolean equals(Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.fieldDescription.equals(((Resolved) obj).fieldDescription);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForField
                public int hashCode() {
                    return (super.hashCode() * 31) + this.fieldDescription.hashCode();
                }

                public Resolved(TypeDescription.Generic generic, boolean z, Assigner.Typing typing, FieldDescription fieldDescription) {
                    super(generic, z, typing);
                    this.fieldDescription = fieldDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForField
                protected FieldDescription resolve(TypeDescription typeDescription) {
                    if (!this.fieldDescription.isStatic() && !this.fieldDescription.getDeclaringType().asErasure().isAssignableFrom(typeDescription)) {
                        throw new IllegalStateException(this.fieldDescription + " is no member of " + typeDescription);
                    }
                    if (!this.fieldDescription.isAccessibleTo(typeDescription)) {
                        throw new IllegalStateException("Cannot access " + this.fieldDescription + " from " + typeDescription);
                    }
                    return this.fieldDescription;
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class Factory<T extends Annotation> implements Factory<T> {
                    private final Class<T> annotationType;
                    private final FieldDescription fieldDescription;
                    private final boolean readOnly;
                    private final Assigner.Typing typing;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        Factory factory = (Factory) obj;
                        return this.annotationType.equals(factory.annotationType) && this.fieldDescription.equals(factory.fieldDescription) && this.readOnly == factory.readOnly && this.typing.equals(factory.typing);
                    }

                    public int hashCode() {
                        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.annotationType.hashCode()) * 31) + this.fieldDescription.hashCode()) * 31) + (this.readOnly ? 1 : 0)) * 31) + this.typing.hashCode();
                    }

                    public Factory(Class<T> cls, FieldDescription fieldDescription) {
                        this(cls, fieldDescription, true, Assigner.Typing.STATIC);
                    }

                    public Factory(Class<T> cls, FieldDescription fieldDescription, boolean z, Assigner.Typing typing) {
                        this.annotationType = cls;
                        this.fieldDescription = fieldDescription;
                        this.readOnly = z;
                        this.typing = typing;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                    public Class<T> getAnnotationType() {
                        return this.annotationType;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                    public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<T> loadable, Factory.AdviceType adviceType) {
                        return new Resolved(inDefinedShape.getType(), this.readOnly, this.typing, this.fieldDescription);
                    }
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForOrigin implements OffsetMapping {
            private static final char DELIMITER = '#';
            private static final char ESCAPE = '\\';
            private final List<Renderer> renderers;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.renderers.equals(((ForOrigin) obj).renderers);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.renderers.hashCode();
            }

            public ForOrigin(List<Renderer> list) {
                this.renderers = list;
            }

            public static OffsetMapping parse(String str) {
                int i;
                if (str.equals("")) {
                    return new ForOrigin(Collections.singletonList(Renderer.ForStringRepresentation.INSTANCE));
                }
                ArrayList arrayList = new ArrayList(str.length());
                int indexOf = str.indexOf(35);
                int i2 = 0;
                while (indexOf != -1) {
                    if (indexOf != 0) {
                        int i3 = indexOf - 1;
                        if (str.charAt(i3) == '\\' && (indexOf == 1 || str.charAt(indexOf - 2) != '\\')) {
                            arrayList.add(new Renderer.ForConstantValue(str.substring(i2, Math.max(0, i3)) + DELIMITER));
                            i = indexOf + 1;
                            i2 = i;
                            indexOf = str.indexOf(35, i2);
                        }
                    }
                    int i4 = indexOf + 1;
                    if (str.length() == i4) {
                        throw new IllegalStateException("Missing sort descriptor for " + str + " at index " + indexOf);
                    }
                    arrayList.add(new Renderer.ForConstantValue(str.substring(i2, indexOf).replace("\\\\", "\\")));
                    char charAt = str.charAt(i4);
                    if (charAt == 'd') {
                        arrayList.add(Renderer.ForDescriptor.INSTANCE);
                    } else if (charAt == 'm') {
                        arrayList.add(Renderer.ForMethodName.INSTANCE);
                    } else {
                        switch (charAt) {
                            case 'r':
                                arrayList.add(Renderer.ForReturnTypeName.INSTANCE);
                                break;
                            case 's':
                                arrayList.add(Renderer.ForJavaSignature.INSTANCE);
                                break;
                            case 't':
                                arrayList.add(Renderer.ForTypeName.INSTANCE);
                                break;
                            default:
                                throw new IllegalStateException("Illegal sort descriptor " + str.charAt(i4) + " for " + str);
                        }
                    }
                    i = indexOf + 2;
                    i2 = i;
                    indexOf = str.indexOf(35, i2);
                }
                arrayList.add(new Renderer.ForConstantValue(str.substring(i2)));
                return new ForOrigin(arrayList);
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping
            public Target resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, ArgumentHandler argumentHandler, Sort sort) {
                StringBuilder sb = new StringBuilder();
                Iterator<Renderer> it = this.renderers.iterator();
                while (it.hasNext()) {
                    sb.append(it.next().apply(typeDescription, methodDescription));
                }
                return Target.ForStackManipulation.of(sb.toString());
            }

            public interface Renderer {
                String apply(TypeDescription typeDescription, MethodDescription methodDescription);

                public enum ForMethodName implements Renderer {
                    INSTANCE;

                    public static final char SYMBOL = 'm';

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer
                    public String apply(TypeDescription typeDescription, MethodDescription methodDescription) {
                        return methodDescription.getInternalName();
                    }
                }

                public enum ForTypeName implements Renderer {
                    INSTANCE;

                    public static final char SYMBOL = 't';

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer
                    public String apply(TypeDescription typeDescription, MethodDescription methodDescription) {
                        return typeDescription.getName();
                    }
                }

                public enum ForDescriptor implements Renderer {
                    INSTANCE;

                    public static final char SYMBOL = 'd';

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer
                    public String apply(TypeDescription typeDescription, MethodDescription methodDescription) {
                        return methodDescription.getDescriptor();
                    }
                }

                public enum ForJavaSignature implements Renderer {
                    INSTANCE;

                    public static final char SYMBOL = 's';

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer
                    public String apply(TypeDescription typeDescription, MethodDescription methodDescription) {
                        StringBuilder sb = new StringBuilder("(");
                        boolean z = false;
                        for (TypeDescription typeDescription2 : methodDescription.getParameters().asTypeList().asErasures()) {
                            if (z) {
                                sb.append(AbstractJsonLexerKt.COMMA);
                            } else {
                                z = true;
                            }
                            sb.append(typeDescription2.getName());
                        }
                        return sb.append(')').toString();
                    }
                }

                public enum ForReturnTypeName implements Renderer {
                    INSTANCE;

                    public static final char SYMBOL = 'r';

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer
                    public String apply(TypeDescription typeDescription, MethodDescription methodDescription) {
                        return methodDescription.getReturnType().asErasure().getName();
                    }
                }

                public enum ForStringRepresentation implements Renderer {
                    INSTANCE;

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer
                    public String apply(TypeDescription typeDescription, MethodDescription methodDescription) {
                        return methodDescription.toString();
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForConstantValue implements Renderer {
                    private final String value;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.value.equals(((ForConstantValue) obj).value);
                    }

                    public int hashCode() {
                        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.value.hashCode();
                    }

                    public ForConstantValue(String str) {
                        this.value = str;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer
                    public String apply(TypeDescription typeDescription, MethodDescription methodDescription) {
                        return this.value;
                    }
                }
            }

            protected enum Factory implements Factory<Origin> {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public Class<Origin> getAnnotationType() {
                    return Origin.class;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<Origin> loadable, Factory.AdviceType adviceType) {
                    if (inDefinedShape.getType().asErasure().represents(Class.class)) {
                        return ForInstrumentedType.INSTANCE;
                    }
                    if (inDefinedShape.getType().asErasure().represents(Method.class)) {
                        return ForInstrumentedMethod.METHOD;
                    }
                    if (inDefinedShape.getType().asErasure().represents(Constructor.class)) {
                        return ForInstrumentedMethod.CONSTRUCTOR;
                    }
                    if (JavaType.EXECUTABLE.getTypeStub().equals(inDefinedShape.getType().asErasure())) {
                        return ForInstrumentedMethod.EXECUTABLE;
                    }
                    if (inDefinedShape.getType().asErasure().isAssignableFrom(String.class)) {
                        return ForOrigin.parse(loadable.loadSilent().value());
                    }
                    throw new IllegalStateException("Non-supported type " + inDefinedShape.getType() + " for @Origin annotation");
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForUnusedValue implements OffsetMapping {
            private final TypeDefinition target;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.target.equals(((ForUnusedValue) obj).target);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.target.hashCode();
            }

            public ForUnusedValue(TypeDefinition typeDefinition) {
                this.target = typeDefinition;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping
            public Target resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, ArgumentHandler argumentHandler, Sort sort) {
                return new Target.ForDefaultValue.ReadWrite(this.target);
            }

            protected enum Factory implements Factory<Unused> {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public Class<Unused> getAnnotationType() {
                    return Unused.class;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<Unused> loadable, Factory.AdviceType adviceType) {
                    return new ForUnusedValue(inDefinedShape.getType());
                }
            }
        }

        public enum ForStubValue implements OffsetMapping, Factory<StubValue> {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping
            public Target resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, ArgumentHandler argumentHandler, Sort sort) {
                return new Target.ForDefaultValue.ReadOnly(methodDescription.getReturnType(), assigner.assign(methodDescription.getReturnType(), TypeDescription.Generic.OBJECT, Assigner.Typing.DYNAMIC));
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
            public Class<StubValue> getAnnotationType() {
                return StubValue.class;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
            public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<StubValue> loadable, Factory.AdviceType adviceType) {
                if (inDefinedShape.getType().represents(Object.class)) {
                    return this;
                }
                throw new IllegalStateException("Cannot use StubValue on non-Object parameter type " + inDefinedShape);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForEnterValue implements OffsetMapping {
            private final TypeDescription.Generic enterType;
            private final boolean readOnly;
            private final TypeDescription.Generic target;
            private final Assigner.Typing typing;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForEnterValue forEnterValue = (ForEnterValue) obj;
                return this.target.equals(forEnterValue.target) && this.enterType.equals(forEnterValue.enterType) && this.readOnly == forEnterValue.readOnly && this.typing.equals(forEnterValue.typing);
            }

            public int hashCode() {
                return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.target.hashCode()) * 31) + this.enterType.hashCode()) * 31) + (this.readOnly ? 1 : 0)) * 31) + this.typing.hashCode();
            }

            protected ForEnterValue(TypeDescription.Generic generic, TypeDescription.Generic generic2, Enter enter) {
                this(generic, generic2, enter.readOnly(), enter.typing());
            }

            public ForEnterValue(TypeDescription.Generic generic, TypeDescription.Generic generic2, boolean z, Assigner.Typing typing) {
                this.target = generic;
                this.enterType = generic2;
                this.readOnly = z;
                this.typing = typing;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping
            public Target resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, ArgumentHandler argumentHandler, Sort sort) {
                StackManipulation assign = assigner.assign(this.enterType, this.target, this.typing);
                if (!assign.isValid()) {
                    throw new IllegalStateException("Cannot assign " + this.enterType + " to " + this.target);
                }
                if (this.readOnly) {
                    return new Target.ForVariable.ReadOnly(this.target, argumentHandler.enter(), assign);
                }
                StackManipulation assign2 = assigner.assign(this.target, this.enterType, this.typing);
                if (!assign2.isValid()) {
                    throw new IllegalStateException("Cannot assign " + this.target + " to " + this.enterType);
                }
                return new Target.ForVariable.ReadWrite(this.target, argumentHandler.enter(), assign, assign2);
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class Factory implements Factory<Enter> {
                private final TypeDefinition enterType;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.enterType.equals(((Factory) obj).enterType);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.enterType.hashCode();
                }

                protected Factory(TypeDefinition typeDefinition) {
                    this.enterType = typeDefinition;
                }

                protected static Factory<Enter> of(TypeDefinition typeDefinition) {
                    return typeDefinition.represents(Void.TYPE) ? new Factory.Illegal(Enter.class) : new Factory(typeDefinition);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public Class<Enter> getAnnotationType() {
                    return Enter.class;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<Enter> loadable, Factory.AdviceType adviceType) {
                    if (adviceType.isDelegation() && !loadable.loadSilent().readOnly()) {
                        throw new IllegalStateException("Cannot use writable " + inDefinedShape + " on read-only parameter");
                    }
                    return new ForEnterValue(inDefinedShape.getType(), this.enterType.asGenericType(), loadable.loadSilent());
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForExitValue implements OffsetMapping {
            private final TypeDescription.Generic exitType;
            private final boolean readOnly;
            private final TypeDescription.Generic target;
            private final Assigner.Typing typing;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForExitValue forExitValue = (ForExitValue) obj;
                return this.target.equals(forExitValue.target) && this.exitType.equals(forExitValue.exitType) && this.readOnly == forExitValue.readOnly && this.typing.equals(forExitValue.typing);
            }

            public int hashCode() {
                return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.target.hashCode()) * 31) + this.exitType.hashCode()) * 31) + (this.readOnly ? 1 : 0)) * 31) + this.typing.hashCode();
            }

            protected ForExitValue(TypeDescription.Generic generic, TypeDescription.Generic generic2, Exit exit) {
                this(generic, generic2, exit.readOnly(), exit.typing());
            }

            public ForExitValue(TypeDescription.Generic generic, TypeDescription.Generic generic2, boolean z, Assigner.Typing typing) {
                this.target = generic;
                this.exitType = generic2;
                this.readOnly = z;
                this.typing = typing;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping
            public Target resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, ArgumentHandler argumentHandler, Sort sort) {
                StackManipulation assign = assigner.assign(this.exitType, this.target, this.typing);
                if (!assign.isValid()) {
                    throw new IllegalStateException("Cannot assign " + this.exitType + " to " + this.target);
                }
                if (this.readOnly) {
                    return new Target.ForVariable.ReadOnly(this.target, argumentHandler.exit(), assign);
                }
                StackManipulation assign2 = assigner.assign(this.target, this.exitType, this.typing);
                if (!assign2.isValid()) {
                    throw new IllegalStateException("Cannot assign " + this.target + " to " + this.exitType);
                }
                return new Target.ForVariable.ReadWrite(this.target, argumentHandler.exit(), assign, assign2);
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class Factory implements Factory<Exit> {
                private final TypeDefinition exitType;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.exitType.equals(((Factory) obj).exitType);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.exitType.hashCode();
                }

                protected Factory(TypeDefinition typeDefinition) {
                    this.exitType = typeDefinition;
                }

                protected static Factory<Exit> of(TypeDefinition typeDefinition) {
                    return typeDefinition.represents(Void.TYPE) ? new Factory.Illegal(Exit.class) : new Factory(typeDefinition);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public Class<Exit> getAnnotationType() {
                    return Exit.class;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<Exit> loadable, Factory.AdviceType adviceType) {
                    if (adviceType.isDelegation() && !loadable.loadSilent().readOnly()) {
                        throw new IllegalStateException("Cannot use writable " + inDefinedShape + " on read-only parameter");
                    }
                    return new ForExitValue(inDefinedShape.getType(), this.exitType.asGenericType(), loadable.loadSilent());
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForLocalValue implements OffsetMapping {
            private final TypeDescription.Generic localType;
            private final String name;
            private final TypeDescription.Generic target;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForLocalValue forLocalValue = (ForLocalValue) obj;
                return this.target.equals(forLocalValue.target) && this.localType.equals(forLocalValue.localType) && this.name.equals(forLocalValue.name);
            }

            public int hashCode() {
                return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.target.hashCode()) * 31) + this.localType.hashCode()) * 31) + this.name.hashCode();
            }

            public ForLocalValue(TypeDescription.Generic generic, TypeDescription.Generic generic2, String str) {
                this.target = generic;
                this.localType = generic2;
                this.name = str;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping
            public Target resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, ArgumentHandler argumentHandler, Sort sort) {
                StackManipulation assign = assigner.assign(this.localType, this.target, Assigner.Typing.STATIC);
                StackManipulation assign2 = assigner.assign(this.target, this.localType, Assigner.Typing.STATIC);
                if (!assign.isValid() || !assign2.isValid()) {
                    throw new IllegalStateException("Cannot assign " + this.localType + " to " + this.target);
                }
                return new Target.ForVariable.ReadWrite(this.target, argumentHandler.named(this.name), assign, assign2);
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class Factory implements Factory<Local> {
                private final Map<String, TypeDefinition> namedTypes;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.namedTypes.equals(((Factory) obj).namedTypes);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.namedTypes.hashCode();
                }

                protected Factory(Map<String, TypeDefinition> map) {
                    this.namedTypes = map;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public Class<Local> getAnnotationType() {
                    return Local.class;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<Local> loadable, Factory.AdviceType adviceType) {
                    String value = loadable.loadSilent().value();
                    TypeDefinition typeDefinition = this.namedTypes.get(value);
                    if (typeDefinition == null) {
                        throw new IllegalStateException("Named local variable is unknown: " + value);
                    }
                    return new ForLocalValue(inDefinedShape.getType(), typeDefinition.asGenericType(), value);
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForReturnValue implements OffsetMapping {
            private final boolean readOnly;
            private final TypeDescription.Generic target;
            private final Assigner.Typing typing;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForReturnValue forReturnValue = (ForReturnValue) obj;
                return this.target.equals(forReturnValue.target) && this.readOnly == forReturnValue.readOnly && this.typing.equals(forReturnValue.typing);
            }

            public int hashCode() {
                return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.target.hashCode()) * 31) + (this.readOnly ? 1 : 0)) * 31) + this.typing.hashCode();
            }

            protected ForReturnValue(TypeDescription.Generic generic, Return r3) {
                this(generic, r3.readOnly(), r3.typing());
            }

            public ForReturnValue(TypeDescription.Generic generic, boolean z, Assigner.Typing typing) {
                this.target = generic;
                this.readOnly = z;
                this.typing = typing;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping
            public Target resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, ArgumentHandler argumentHandler, Sort sort) {
                StackManipulation assign = assigner.assign(methodDescription.getReturnType(), this.target, this.typing);
                if (!assign.isValid()) {
                    throw new IllegalStateException("Cannot assign " + methodDescription.getReturnType() + " to " + this.target);
                }
                if (this.readOnly) {
                    return methodDescription.getReturnType().represents(Void.TYPE) ? new Target.ForDefaultValue.ReadOnly(this.target) : new Target.ForVariable.ReadOnly(methodDescription.getReturnType(), argumentHandler.returned(), assign);
                }
                StackManipulation assign2 = assigner.assign(this.target, methodDescription.getReturnType(), this.typing);
                if (assign2.isValid()) {
                    return methodDescription.getReturnType().represents(Void.TYPE) ? new Target.ForDefaultValue.ReadWrite(this.target) : new Target.ForVariable.ReadWrite(methodDescription.getReturnType(), argumentHandler.returned(), assign, assign2);
                }
                throw new IllegalStateException("Cannot assign " + this.target + " to " + methodDescription.getReturnType());
            }

            protected enum Factory implements Factory<Return> {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public Class<Return> getAnnotationType() {
                    return Return.class;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<Return> loadable, Factory.AdviceType adviceType) {
                    if (adviceType.isDelegation() && !loadable.loadSilent().readOnly()) {
                        throw new IllegalStateException("Cannot write return value for " + inDefinedShape + " in read-only context");
                    }
                    return new ForReturnValue(inDefinedShape.getType(), loadable.loadSilent());
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForThrowable implements OffsetMapping {
            private final boolean readOnly;
            private final TypeDescription.Generic target;
            private final Assigner.Typing typing;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForThrowable forThrowable = (ForThrowable) obj;
                return this.target.equals(forThrowable.target) && this.readOnly == forThrowable.readOnly && this.typing.equals(forThrowable.typing);
            }

            public int hashCode() {
                return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.target.hashCode()) * 31) + (this.readOnly ? 1 : 0)) * 31) + this.typing.hashCode();
            }

            protected ForThrowable(TypeDescription.Generic generic, Thrown thrown) {
                this(generic, thrown.readOnly(), thrown.typing());
            }

            public ForThrowable(TypeDescription.Generic generic, boolean z, Assigner.Typing typing) {
                this.target = generic;
                this.readOnly = z;
                this.typing = typing;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping
            public Target resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, ArgumentHandler argumentHandler, Sort sort) {
                StackManipulation assign = assigner.assign(TypeDescription.THROWABLE.asGenericType(), this.target, this.typing);
                if (!assign.isValid()) {
                    throw new IllegalStateException("Cannot assign Throwable to " + this.target);
                }
                if (this.readOnly) {
                    return new Target.ForVariable.ReadOnly(TypeDescription.THROWABLE, argumentHandler.thrown(), assign);
                }
                StackManipulation assign2 = assigner.assign(this.target, TypeDescription.THROWABLE.asGenericType(), this.typing);
                if (!assign2.isValid()) {
                    throw new IllegalStateException("Cannot assign " + this.target + " to Throwable");
                }
                return new Target.ForVariable.ReadWrite(TypeDescription.THROWABLE, argumentHandler.thrown(), assign, assign2);
            }

            protected enum Factory implements Factory<Thrown> {
                INSTANCE;

                protected static Factory<?> of(MethodDescription.InDefinedShape inDefinedShape) {
                    return ((TypeDescription) inDefinedShape.getDeclaredAnnotations().ofType(OnMethodExit.class).getValue(Advice.ON_THROWABLE).resolve(TypeDescription.class)).represents(NoExceptionHandler.class) ? new Factory.Illegal(Thrown.class) : INSTANCE;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public Class<Thrown> getAnnotationType() {
                    return Thrown.class;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<Thrown> loadable, Factory.AdviceType adviceType) {
                    if (adviceType.isDelegation() && !loadable.loadSilent().readOnly()) {
                        throw new IllegalStateException("Cannot use writable " + inDefinedShape + " on read-only parameter");
                    }
                    return new ForThrowable(inDefinedShape.getType(), loadable.loadSilent());
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForStackManipulation implements OffsetMapping {
            private final StackManipulation stackManipulation;
            private final TypeDescription.Generic targetType;
            private final TypeDescription.Generic typeDescription;
            private final Assigner.Typing typing;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForStackManipulation forStackManipulation = (ForStackManipulation) obj;
                return this.stackManipulation.equals(forStackManipulation.stackManipulation) && this.typeDescription.equals(forStackManipulation.typeDescription) && this.targetType.equals(forStackManipulation.targetType) && this.typing.equals(forStackManipulation.typing);
            }

            public int hashCode() {
                return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.stackManipulation.hashCode()) * 31) + this.typeDescription.hashCode()) * 31) + this.targetType.hashCode()) * 31) + this.typing.hashCode();
            }

            public ForStackManipulation(StackManipulation stackManipulation, TypeDescription.Generic generic, TypeDescription.Generic generic2, Assigner.Typing typing) {
                this.stackManipulation = stackManipulation;
                this.typeDescription = generic;
                this.targetType = generic2;
                this.typing = typing;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping
            public Target resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, ArgumentHandler argumentHandler, Sort sort) {
                StackManipulation assign = assigner.assign(this.typeDescription, this.targetType, this.typing);
                if (!assign.isValid()) {
                    throw new IllegalStateException("Cannot assign " + this.typeDescription + " to " + this.targetType);
                }
                return new Target.ForStackManipulation(new StackManipulation.Compound(this.stackManipulation, assign));
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Factory<T extends Annotation> implements Factory<T> {
                private final Class<T> annotationType;
                private final StackManipulation stackManipulation;
                private final TypeDescription.Generic typeDescription;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Factory factory = (Factory) obj;
                    return this.annotationType.equals(factory.annotationType) && this.stackManipulation.equals(factory.stackManipulation) && this.typeDescription.equals(factory.typeDescription);
                }

                public int hashCode() {
                    return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.annotationType.hashCode()) * 31) + this.stackManipulation.hashCode()) * 31) + this.typeDescription.hashCode();
                }

                public Factory(Class<T> cls, TypeDescription typeDescription) {
                    this(cls, ClassConstant.of(typeDescription), TypeDescription.CLASS.asGenericType());
                }

                public Factory(Class<T> cls, EnumerationDescription enumerationDescription) {
                    this(cls, FieldAccess.forEnumeration(enumerationDescription), enumerationDescription.getEnumerationType().asGenericType());
                }

                public Factory(Class<T> cls, StackManipulation stackManipulation, TypeDescription.Generic generic) {
                    this.annotationType = cls;
                    this.stackManipulation = stackManipulation;
                    this.typeDescription = generic;
                }

                public static <S extends Annotation> Factory<S> of(Class<S> cls, Object obj) {
                    TypeDescription typeDescription;
                    StackManipulation stackManipulation;
                    if (obj == null) {
                        return new OfDefaultValue(cls);
                    }
                    if (obj instanceof Boolean) {
                        stackManipulation = IntegerConstant.forValue(((Boolean) obj).booleanValue());
                        typeDescription = TypeDescription.ForLoadedType.of(Boolean.TYPE);
                    } else if (obj instanceof Byte) {
                        stackManipulation = IntegerConstant.forValue(((Byte) obj).byteValue());
                        typeDescription = TypeDescription.ForLoadedType.of(Byte.TYPE);
                    } else if (obj instanceof Short) {
                        stackManipulation = IntegerConstant.forValue(((Short) obj).shortValue());
                        typeDescription = TypeDescription.ForLoadedType.of(Short.TYPE);
                    } else if (obj instanceof Character) {
                        stackManipulation = IntegerConstant.forValue(((Character) obj).charValue());
                        typeDescription = TypeDescription.ForLoadedType.of(Character.TYPE);
                    } else if (obj instanceof Integer) {
                        stackManipulation = IntegerConstant.forValue(((Integer) obj).intValue());
                        typeDescription = TypeDescription.ForLoadedType.of(Integer.TYPE);
                    } else if (obj instanceof Long) {
                        stackManipulation = LongConstant.forValue(((Long) obj).longValue());
                        typeDescription = TypeDescription.ForLoadedType.of(Long.TYPE);
                    } else if (obj instanceof Float) {
                        stackManipulation = FloatConstant.forValue(((Float) obj).floatValue());
                        typeDescription = TypeDescription.ForLoadedType.of(Float.TYPE);
                    } else if (obj instanceof Double) {
                        stackManipulation = DoubleConstant.forValue(((Double) obj).doubleValue());
                        typeDescription = TypeDescription.ForLoadedType.of(Double.TYPE);
                    } else if (obj instanceof String) {
                        TextConstant textConstant = new TextConstant((String) obj);
                        typeDescription = TypeDescription.STRING;
                        stackManipulation = textConstant;
                    } else {
                        throw new IllegalStateException("Not a constant value: " + obj);
                    }
                    return new Factory(cls, stackManipulation, typeDescription.asGenericType());
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public Class<T> getAnnotationType() {
                    return this.annotationType;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<T> loadable, Factory.AdviceType adviceType) {
                    return new ForStackManipulation(this.stackManipulation, this.typeDescription, inDefinedShape.getType(), Assigner.Typing.STATIC);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class OfDefaultValue<T extends Annotation> implements Factory<T> {
                private final Class<T> annotationType;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.annotationType.equals(((OfDefaultValue) obj).annotationType);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.annotationType.hashCode();
                }

                public OfDefaultValue(Class<T> cls) {
                    this.annotationType = cls;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public Class<T> getAnnotationType() {
                    return this.annotationType;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<T> loadable, Factory.AdviceType adviceType) {
                    return new ForStackManipulation(DefaultValue.of(inDefinedShape.getType()), inDefinedShape.getType(), inDefinedShape.getType(), Assigner.Typing.STATIC);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class OfAnnotationProperty<T extends Annotation> implements Factory<T> {
                private final Class<T> annotationType;
                private final MethodDescription.InDefinedShape property;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    OfAnnotationProperty ofAnnotationProperty = (OfAnnotationProperty) obj;
                    return this.annotationType.equals(ofAnnotationProperty.annotationType) && this.property.equals(ofAnnotationProperty.property);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.annotationType.hashCode()) * 31) + this.property.hashCode();
                }

                protected OfAnnotationProperty(Class<T> cls, MethodDescription.InDefinedShape inDefinedShape) {
                    this.annotationType = cls;
                    this.property = inDefinedShape;
                }

                public static <S extends Annotation> Factory<S> of(Class<S> cls, String str) {
                    if (!cls.isAnnotation()) {
                        throw new IllegalArgumentException("Not an annotation type: " + cls);
                    }
                    try {
                        return new OfAnnotationProperty(cls, new MethodDescription.ForLoadedMethod(cls.getMethod(str, new Class[0])));
                    } catch (NoSuchMethodException e) {
                        throw new IllegalArgumentException("Cannot find a property " + str + " on " + cls, e);
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public Class<T> getAnnotationType() {
                    return this.annotationType;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<T> loadable, Factory.AdviceType adviceType) {
                    Factory of;
                    Object resolve = loadable.getValue(this.property).resolve();
                    if (resolve instanceof TypeDescription) {
                        of = new Factory(this.annotationType, (TypeDescription) resolve);
                    } else if (resolve instanceof EnumerationDescription) {
                        of = new Factory(this.annotationType, (EnumerationDescription) resolve);
                    } else {
                        if (resolve instanceof AnnotationDescription) {
                            throw new IllegalStateException("Cannot bind annotation as fixed value for " + this.property);
                        }
                        of = Factory.of(this.annotationType, resolve);
                    }
                    return of.make(inDefinedShape, loadable, adviceType);
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForSerializedValue implements OffsetMapping {
            private final StackManipulation deserialization;
            private final TypeDescription.Generic target;
            private final TypeDescription typeDescription;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForSerializedValue forSerializedValue = (ForSerializedValue) obj;
                return this.target.equals(forSerializedValue.target) && this.typeDescription.equals(forSerializedValue.typeDescription) && this.deserialization.equals(forSerializedValue.deserialization);
            }

            public int hashCode() {
                return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.target.hashCode()) * 31) + this.typeDescription.hashCode()) * 31) + this.deserialization.hashCode();
            }

            public ForSerializedValue(TypeDescription.Generic generic, TypeDescription typeDescription, StackManipulation stackManipulation) {
                this.target = generic;
                this.typeDescription = typeDescription;
                this.deserialization = stackManipulation;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping
            public Target resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, ArgumentHandler argumentHandler, Sort sort) {
                StackManipulation assign = assigner.assign(this.typeDescription.asGenericType(), this.target, Assigner.Typing.DYNAMIC);
                if (!assign.isValid()) {
                    throw new IllegalStateException("Cannot assign " + this.typeDescription + " to " + this.target);
                }
                return new Target.ForStackManipulation(new StackManipulation.Compound(this.deserialization, assign));
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Factory<T extends Annotation> implements Factory<T> {
                private final Class<T> annotationType;
                private final StackManipulation deserialization;
                private final TypeDescription typeDescription;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Factory factory = (Factory) obj;
                    return this.annotationType.equals(factory.annotationType) && this.typeDescription.equals(factory.typeDescription) && this.deserialization.equals(factory.deserialization);
                }

                public int hashCode() {
                    return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.annotationType.hashCode()) * 31) + this.typeDescription.hashCode()) * 31) + this.deserialization.hashCode();
                }

                protected Factory(Class<T> cls, TypeDescription typeDescription, StackManipulation stackManipulation) {
                    this.annotationType = cls;
                    this.typeDescription = typeDescription;
                    this.deserialization = stackManipulation;
                }

                public static <S extends Annotation> Factory<S> of(Class<S> cls, Serializable serializable, Class<?> cls2) {
                    if (!cls2.isInstance(serializable)) {
                        throw new IllegalArgumentException(serializable + " is no instance of " + cls2);
                    }
                    return new Factory(cls, TypeDescription.ForLoadedType.of(cls2), SerializedConstant.of(serializable));
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public Class<T> getAnnotationType() {
                    return this.annotationType;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping.Factory
                public OffsetMapping make(ParameterDescription.InDefinedShape inDefinedShape, AnnotationDescription.Loadable<T> loadable, Factory.AdviceType adviceType) {
                    return new ForSerializedValue(inDefinedShape.getType(), this.typeDescription, this.deserialization);
                }
            }
        }
    }

    public interface ArgumentHandler {
        public static final int THIS_REFERENCE = 0;

        public enum Factory {
            SIMPLE { // from class: org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler.Factory.1
                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler.Factory
                protected ForInstrumentedMethod resolve(MethodDescription methodDescription, TypeDefinition typeDefinition, TypeDefinition typeDefinition2, Map<String, TypeDefinition> map) {
                    return new ForInstrumentedMethod.Default.Simple(methodDescription, typeDefinition2, new TreeMap(map), typeDefinition);
                }
            },
            COPYING { // from class: org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler.Factory.2
                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler.Factory
                protected ForInstrumentedMethod resolve(MethodDescription methodDescription, TypeDefinition typeDefinition, TypeDefinition typeDefinition2, Map<String, TypeDefinition> map) {
                    return new ForInstrumentedMethod.Default.Copying(methodDescription, typeDefinition2, new TreeMap(map), typeDefinition);
                }
            };

            protected abstract ForInstrumentedMethod resolve(MethodDescription methodDescription, TypeDefinition typeDefinition, TypeDefinition typeDefinition2, Map<String, TypeDefinition> map);
        }

        int argument(int i);

        int enter();

        int exit();

        int named(String str);

        int returned();

        int thrown();

        public interface ForInstrumentedMethod extends ArgumentHandler {
            ForAdvice bindEnter(MethodDescription methodDescription);

            ForAdvice bindExit(MethodDescription methodDescription, boolean z);

            List<TypeDescription> getNamedTypes();

            boolean isCopyingArguments();

            int prepare(MethodVisitor methodVisitor);

            int variable(int i);

            public static abstract class Default implements ForInstrumentedMethod {
                protected final TypeDefinition enterType;
                protected final TypeDefinition exitType;
                protected final MethodDescription instrumentedMethod;
                protected final NavigableMap<String, TypeDefinition> namedTypes;

                protected Default(MethodDescription methodDescription, TypeDefinition typeDefinition, NavigableMap<String, TypeDefinition> navigableMap, TypeDefinition typeDefinition2) {
                    this.instrumentedMethod = methodDescription;
                    this.namedTypes = navigableMap;
                    this.exitType = typeDefinition;
                    this.enterType = typeDefinition2;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler
                public int exit() {
                    return this.instrumentedMethod.getStackSize();
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler
                public int named(String str) {
                    return this.instrumentedMethod.getStackSize() + this.exitType.getStackSize().getSize() + StackSize.of(this.namedTypes.headMap(str).values());
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler
                public int enter() {
                    return this.instrumentedMethod.getStackSize() + this.exitType.getStackSize().getSize() + StackSize.of(this.namedTypes.values());
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler
                public int returned() {
                    return this.instrumentedMethod.getStackSize() + this.exitType.getStackSize().getSize() + StackSize.of(this.namedTypes.values()) + this.enterType.getStackSize().getSize();
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler
                public int thrown() {
                    return this.instrumentedMethod.getStackSize() + this.exitType.getStackSize().getSize() + StackSize.of(this.namedTypes.values()) + this.enterType.getStackSize().getSize() + this.instrumentedMethod.getReturnType().getStackSize().getSize();
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler.ForInstrumentedMethod
                public ForAdvice bindEnter(MethodDescription methodDescription) {
                    return new ForAdvice.Default.ForMethodEnter(this.instrumentedMethod, methodDescription, this.exitType, this.namedTypes);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler.ForInstrumentedMethod
                public ForAdvice bindExit(MethodDescription methodDescription, boolean z) {
                    return new ForAdvice.Default.ForMethodExit(this.instrumentedMethod, methodDescription, this.exitType, this.namedTypes, this.enterType, z ? StackSize.ZERO : StackSize.SINGLE);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler.ForInstrumentedMethod
                public List<TypeDescription> getNamedTypes() {
                    ArrayList arrayList = new ArrayList(this.namedTypes.size());
                    Iterator<TypeDefinition> it = this.namedTypes.values().iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().asErasure());
                    }
                    return arrayList;
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static class Simple extends Default {
                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass();
                    }

                    public int hashCode() {
                        return 17;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler.ForInstrumentedMethod
                    public boolean isCopyingArguments() {
                        return false;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler.ForInstrumentedMethod
                    public int prepare(MethodVisitor methodVisitor) {
                        return 0;
                    }

                    protected Simple(MethodDescription methodDescription, TypeDefinition typeDefinition, NavigableMap<String, TypeDefinition> navigableMap, TypeDefinition typeDefinition2) {
                        super(methodDescription, typeDefinition, navigableMap, typeDefinition2);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler
                    public int argument(int i) {
                        return i < this.instrumentedMethod.getStackSize() ? i : i + this.exitType.getStackSize().getSize() + StackSize.of(this.namedTypes.values()) + this.enterType.getStackSize().getSize();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler.ForInstrumentedMethod
                    public int variable(int i) {
                        return i < (!this.instrumentedMethod.isStatic() ? 1 : 0) + this.instrumentedMethod.getParameters().size() ? i : i + (!this.exitType.represents(Void.TYPE) ? 1 : 0) + StackSize.of(this.namedTypes.values()) + (!this.enterType.represents(Void.TYPE) ? 1 : 0);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static class Copying extends Default {
                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass();
                    }

                    public int hashCode() {
                        return 17;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler.ForInstrumentedMethod
                    public boolean isCopyingArguments() {
                        return true;
                    }

                    protected Copying(MethodDescription methodDescription, TypeDefinition typeDefinition, NavigableMap<String, TypeDefinition> navigableMap, TypeDefinition typeDefinition2) {
                        super(methodDescription, typeDefinition, navigableMap, typeDefinition2);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler
                    public int argument(int i) {
                        return this.instrumentedMethod.getStackSize() + this.exitType.getStackSize().getSize() + StackSize.of(this.namedTypes.values()) + this.enterType.getStackSize().getSize() + i;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler.ForInstrumentedMethod
                    public int variable(int i) {
                        return (!this.instrumentedMethod.isStatic() ? 1 : 0) + this.instrumentedMethod.getParameters().size() + (!this.exitType.represents(Void.TYPE) ? 1 : 0) + this.namedTypes.size() + (!this.enterType.represents(Void.TYPE) ? 1 : 0) + i;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler.ForInstrumentedMethod
                    public int prepare(MethodVisitor methodVisitor) {
                        StackSize stackSize;
                        if (!this.instrumentedMethod.isStatic()) {
                            methodVisitor.visitVarInsn(25, 0);
                            methodVisitor.visitVarInsn(58, this.instrumentedMethod.getStackSize() + this.exitType.getStackSize().getSize() + StackSize.of(this.namedTypes.values()) + this.enterType.getStackSize().getSize());
                            stackSize = StackSize.SINGLE;
                        } else {
                            stackSize = StackSize.ZERO;
                        }
                        Iterator it = this.instrumentedMethod.getParameters().iterator();
                        while (it.hasNext()) {
                            ParameterDescription parameterDescription = (ParameterDescription) it.next();
                            Type type = Type.getType(parameterDescription.getType().asErasure().getDescriptor());
                            methodVisitor.visitVarInsn(type.getOpcode(21), parameterDescription.getOffset());
                            methodVisitor.visitVarInsn(type.getOpcode(54), this.instrumentedMethod.getStackSize() + this.exitType.getStackSize().getSize() + StackSize.of(this.namedTypes.values()) + this.enterType.getStackSize().getSize() + parameterDescription.getOffset());
                            stackSize = stackSize.maximum(parameterDescription.getType().getStackSize());
                        }
                        return stackSize.getSize();
                    }
                }
            }
        }

        public interface ForAdvice extends ArgumentHandler {
            int mapped(int i);

            public static abstract class Default implements ForAdvice {
                protected final MethodDescription adviceMethod;
                protected final TypeDefinition exitType;
                protected final MethodDescription instrumentedMethod;
                protected final NavigableMap<String, TypeDefinition> namedTypes;

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler
                public int argument(int i) {
                    return i;
                }

                protected Default(MethodDescription methodDescription, MethodDescription methodDescription2, TypeDefinition typeDefinition, NavigableMap<String, TypeDefinition> navigableMap) {
                    this.instrumentedMethod = methodDescription;
                    this.adviceMethod = methodDescription2;
                    this.exitType = typeDefinition;
                    this.namedTypes = navigableMap;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler
                public int exit() {
                    return this.instrumentedMethod.getStackSize();
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler
                public int named(String str) {
                    return this.instrumentedMethod.getStackSize() + this.exitType.getStackSize().getSize() + StackSize.of(this.namedTypes.headMap(str).values());
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler
                public int enter() {
                    return this.instrumentedMethod.getStackSize() + this.exitType.getStackSize().getSize() + StackSize.of(this.namedTypes.values());
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static class ForMethodEnter extends Default {
                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass();
                    }

                    public int hashCode() {
                        return 17;
                    }

                    protected ForMethodEnter(MethodDescription methodDescription, MethodDescription methodDescription2, TypeDefinition typeDefinition, NavigableMap<String, TypeDefinition> navigableMap) {
                        super(methodDescription, methodDescription2, typeDefinition, navigableMap);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler
                    public int returned() {
                        throw new IllegalStateException("Cannot resolve the return value offset during enter advice");
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler
                    public int thrown() {
                        throw new IllegalStateException("Cannot resolve the thrown value offset during enter advice");
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler.ForAdvice
                    public int mapped(int i) {
                        return (((this.instrumentedMethod.getStackSize() + this.exitType.getStackSize().getSize()) + StackSize.of(this.namedTypes.values())) - this.adviceMethod.getStackSize()) + i;
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static class ForMethodExit extends Default {
                    private final TypeDefinition enterType;
                    private final StackSize throwableSize;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        ForMethodExit forMethodExit = (ForMethodExit) obj;
                        return this.enterType.equals(forMethodExit.enterType) && this.throwableSize.equals(forMethodExit.throwableSize);
                    }

                    public int hashCode() {
                        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.enterType.hashCode()) * 31) + this.throwableSize.hashCode();
                    }

                    protected ForMethodExit(MethodDescription methodDescription, MethodDescription methodDescription2, TypeDefinition typeDefinition, NavigableMap<String, TypeDefinition> navigableMap, TypeDefinition typeDefinition2, StackSize stackSize) {
                        super(methodDescription, methodDescription2, typeDefinition, navigableMap);
                        this.enterType = typeDefinition2;
                        this.throwableSize = stackSize;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler
                    public int returned() {
                        return this.instrumentedMethod.getStackSize() + this.exitType.getStackSize().getSize() + StackSize.of(this.namedTypes.values()) + this.enterType.getStackSize().getSize();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler
                    public int thrown() {
                        return this.instrumentedMethod.getStackSize() + this.exitType.getStackSize().getSize() + StackSize.of(this.namedTypes.values()) + this.enterType.getStackSize().getSize() + this.instrumentedMethod.getReturnType().getStackSize().getSize();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ArgumentHandler.ForAdvice
                    public int mapped(int i) {
                        return ((((((this.instrumentedMethod.getStackSize() + this.exitType.getStackSize().getSize()) + StackSize.of(this.namedTypes.values())) + this.enterType.getStackSize().getSize()) + this.instrumentedMethod.getReturnType().getStackSize().getSize()) + this.throwableSize.getSize()) - this.adviceMethod.getStackSize()) + i;
                    }
                }
            }
        }
    }

    protected interface MethodSizeHandler {
        public static final int UNDEFINED_SIZE = 32767;

        public interface ForAdvice extends MethodSizeHandler {
            void recordMaxima(int i, int i2);

            void requireLocalVariableLengthPadding(int i);

            void requireStackSizePadding(int i);
        }

        public interface ForInstrumentedMethod extends MethodSizeHandler {
            ForAdvice bindEnter(MethodDescription.InDefinedShape inDefinedShape);

            ForAdvice bindExit(MethodDescription.InDefinedShape inDefinedShape);

            int compoundLocalVariableLength(int i);

            int compoundStackSize(int i);
        }

        public enum NoOp implements ForInstrumentedMethod, ForAdvice {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.MethodSizeHandler.ForInstrumentedMethod
            public ForAdvice bindEnter(MethodDescription.InDefinedShape inDefinedShape) {
                return this;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.MethodSizeHandler.ForInstrumentedMethod
            public ForAdvice bindExit(MethodDescription.InDefinedShape inDefinedShape) {
                return this;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.MethodSizeHandler.ForInstrumentedMethod
            public int compoundLocalVariableLength(int i) {
                return 32767;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.MethodSizeHandler.ForInstrumentedMethod
            public int compoundStackSize(int i) {
                return 32767;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.MethodSizeHandler.ForAdvice
            public void recordMaxima(int i, int i2) {
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.MethodSizeHandler
            public void requireLocalVariableLength(int i) {
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.MethodSizeHandler.ForAdvice
            public void requireLocalVariableLengthPadding(int i) {
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.MethodSizeHandler
            public void requireStackSize(int i) {
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.MethodSizeHandler.ForAdvice
            public void requireStackSizePadding(int i) {
            }
        }

        void requireLocalVariableLength(int i);

        void requireStackSize(int i);

        public static abstract class Default implements ForInstrumentedMethod {
            protected final List<? extends TypeDescription> initialTypes;
            protected final MethodDescription instrumentedMethod;
            protected int localVariableLength;
            protected final List<? extends TypeDescription> postMethodTypes;
            protected final List<? extends TypeDescription> preMethodTypes;
            protected int stackSize;

            protected Default(MethodDescription methodDescription, List<? extends TypeDescription> list, List<? extends TypeDescription> list2, List<? extends TypeDescription> list3) {
                this.instrumentedMethod = methodDescription;
                this.initialTypes = list;
                this.preMethodTypes = list2;
                this.postMethodTypes = list3;
            }

            protected static ForInstrumentedMethod of(MethodDescription methodDescription, List<? extends TypeDescription> list, List<? extends TypeDescription> list2, List<? extends TypeDescription> list3, boolean z, int i) {
                if ((i & 3) != 0) {
                    return NoOp.INSTANCE;
                }
                if (z) {
                    return new WithCopiedArguments(methodDescription, list, list2, list3);
                }
                return new WithRetainedArguments(methodDescription, list, list2, list3);
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.MethodSizeHandler.ForInstrumentedMethod
            public ForAdvice bindEnter(MethodDescription.InDefinedShape inDefinedShape) {
                return new ForAdvice(inDefinedShape, this.instrumentedMethod.getStackSize() + StackSize.of(this.initialTypes));
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.MethodSizeHandler
            public void requireStackSize(int i) {
                this.stackSize = Math.max(this.stackSize, i);
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.MethodSizeHandler
            public void requireLocalVariableLength(int i) {
                this.localVariableLength = Math.max(this.localVariableLength, i);
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.MethodSizeHandler.ForInstrumentedMethod
            public int compoundStackSize(int i) {
                return Math.max(this.stackSize, i);
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.MethodSizeHandler.ForInstrumentedMethod
            public int compoundLocalVariableLength(int i) {
                return Math.max(this.localVariableLength, i + StackSize.of(this.postMethodTypes) + StackSize.of(this.initialTypes) + StackSize.of(this.preMethodTypes));
            }

            protected static class WithRetainedArguments extends Default {
                protected WithRetainedArguments(MethodDescription methodDescription, List<? extends TypeDescription> list, List<? extends TypeDescription> list2, List<? extends TypeDescription> list3) {
                    super(methodDescription, list, list2, list3);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.MethodSizeHandler.ForInstrumentedMethod
                public ForAdvice bindExit(MethodDescription.InDefinedShape inDefinedShape) {
                    return new ForAdvice(inDefinedShape, this.instrumentedMethod.getStackSize() + StackSize.of(this.postMethodTypes) + StackSize.of(this.initialTypes) + StackSize.of(this.preMethodTypes));
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.MethodSizeHandler.Default, org.modelmapper.internal.bytebuddy.asm.Advice.MethodSizeHandler.ForInstrumentedMethod
                public int compoundLocalVariableLength(int i) {
                    return Math.max(this.localVariableLength, i + StackSize.of(this.postMethodTypes) + StackSize.of(this.initialTypes) + StackSize.of(this.preMethodTypes));
                }
            }

            protected static class WithCopiedArguments extends Default {
                protected WithCopiedArguments(MethodDescription methodDescription, List<? extends TypeDescription> list, List<? extends TypeDescription> list2, List<? extends TypeDescription> list3) {
                    super(methodDescription, list, list2, list3);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.MethodSizeHandler.ForInstrumentedMethod
                public ForAdvice bindExit(MethodDescription.InDefinedShape inDefinedShape) {
                    return new ForAdvice(inDefinedShape, (this.instrumentedMethod.getStackSize() * 2) + StackSize.of(this.initialTypes) + StackSize.of(this.preMethodTypes) + StackSize.of(this.postMethodTypes));
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.MethodSizeHandler.Default, org.modelmapper.internal.bytebuddy.asm.Advice.MethodSizeHandler.ForInstrumentedMethod
                public int compoundLocalVariableLength(int i) {
                    return Math.max(this.localVariableLength, i + this.instrumentedMethod.getStackSize() + StackSize.of(this.postMethodTypes) + StackSize.of(this.initialTypes) + StackSize.of(this.preMethodTypes));
                }
            }

            protected class ForAdvice implements ForAdvice {
                private final MethodDescription.InDefinedShape adviceMethod;
                private final int baseLocalVariableLength;
                private int localVariableLengthPadding;
                private int stackSizePadding;

                protected ForAdvice(MethodDescription.InDefinedShape inDefinedShape, int i) {
                    this.adviceMethod = inDefinedShape;
                    this.baseLocalVariableLength = i;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.MethodSizeHandler
                public void requireStackSize(int i) {
                    Default.this.requireStackSize(i);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.MethodSizeHandler
                public void requireLocalVariableLength(int i) {
                    Default.this.requireLocalVariableLength(i);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.MethodSizeHandler.ForAdvice
                public void requireStackSizePadding(int i) {
                    this.stackSizePadding = Math.max(this.stackSizePadding, i);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.MethodSizeHandler.ForAdvice
                public void requireLocalVariableLengthPadding(int i) {
                    this.localVariableLengthPadding = Math.max(this.localVariableLengthPadding, i);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.MethodSizeHandler.ForAdvice
                public void recordMaxima(int i, int i2) {
                    Default.this.requireStackSize(i + this.stackSizePadding);
                    Default.this.requireLocalVariableLength((i2 - this.adviceMethod.getStackSize()) + this.baseLocalVariableLength + this.localVariableLengthPadding);
                }
            }
        }
    }

    protected interface StackMapFrameHandler {

        public interface ForAdvice extends StackMapFrameHandler {
        }

        public interface ForInstrumentedMethod extends StackMapFrameHandler {
            ForAdvice bindEnter(MethodDescription.InDefinedShape inDefinedShape);

            ForAdvice bindExit(MethodDescription.InDefinedShape inDefinedShape);

            int getReaderHint();

            void injectInitializationFrame(MethodVisitor methodVisitor);

            void injectPostCompletionFrame(MethodVisitor methodVisitor);

            void injectStartFrame(MethodVisitor methodVisitor);
        }

        public enum NoOp implements ForInstrumentedMethod, ForAdvice {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler.ForInstrumentedMethod
            public ForAdvice bindEnter(MethodDescription.InDefinedShape inDefinedShape) {
                return this;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler.ForInstrumentedMethod
            public ForAdvice bindExit(MethodDescription.InDefinedShape inDefinedShape) {
                return this;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler.ForInstrumentedMethod
            public int getReaderHint() {
                return 4;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler
            public void injectCompletionFrame(MethodVisitor methodVisitor) {
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler
            public void injectExceptionFrame(MethodVisitor methodVisitor) {
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler.ForInstrumentedMethod
            public void injectInitializationFrame(MethodVisitor methodVisitor) {
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler.ForInstrumentedMethod
            public void injectPostCompletionFrame(MethodVisitor methodVisitor) {
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler
            public void injectReturnFrame(MethodVisitor methodVisitor) {
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler.ForInstrumentedMethod
            public void injectStartFrame(MethodVisitor methodVisitor) {
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler
            public void translateFrame(MethodVisitor methodVisitor, int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
            }
        }

        void injectCompletionFrame(MethodVisitor methodVisitor);

        void injectExceptionFrame(MethodVisitor methodVisitor);

        void injectReturnFrame(MethodVisitor methodVisitor);

        void translateFrame(MethodVisitor methodVisitor, int i, int i2, Object[] objArr, int i3, Object[] objArr2);

        public static abstract class Default implements ForInstrumentedMethod {
            protected static final Object[] EMPTY = new Object[0];
            protected int currentFrameDivergence;
            protected final boolean expandFrames;
            protected final List<? extends TypeDescription> initialTypes;
            protected final MethodDescription instrumentedMethod;
            protected final TypeDescription instrumentedType;
            protected final List<? extends TypeDescription> postMethodTypes;
            protected final List<? extends TypeDescription> preMethodTypes;

            protected enum TranslationMode {
                COPY { // from class: org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler.Default.TranslationMode.1
                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler.Default.TranslationMode
                    protected int copy(TypeDescription typeDescription, MethodDescription methodDescription, MethodDescription methodDescription2, Object[] objArr, Object[] objArr2) {
                        int size = methodDescription.getParameters().size() + (!methodDescription.isStatic() ? 1 : 0);
                        System.arraycopy(objArr, 0, objArr2, 0, size);
                        return size;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler.Default.TranslationMode
                    protected boolean isPossibleThisFrameValue(TypeDescription typeDescription, MethodDescription methodDescription, Object obj) {
                        return (methodDescription.isConstructor() && Opcodes.UNINITIALIZED_THIS.equals(obj)) || Default.toFrame(typeDescription).equals(obj);
                    }
                },
                ENTER { // from class: org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler.Default.TranslationMode.2
                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler.Default.TranslationMode
                    protected int copy(TypeDescription typeDescription, MethodDescription methodDescription, MethodDescription methodDescription2, Object[] objArr, Object[] objArr2) {
                        int i = 0;
                        if (!methodDescription.isStatic()) {
                            objArr2[0] = methodDescription.isConstructor() ? Opcodes.UNINITIALIZED_THIS : Default.toFrame(typeDescription);
                            i = 1;
                        }
                        Iterator it = methodDescription.getParameters().asTypeList().asErasures().iterator();
                        while (it.hasNext()) {
                            objArr2[i] = Default.toFrame((TypeDescription) it.next());
                            i++;
                        }
                        return i;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler.Default.TranslationMode
                    protected boolean isPossibleThisFrameValue(TypeDescription typeDescription, MethodDescription methodDescription, Object obj) {
                        if (methodDescription.isConstructor()) {
                            return Opcodes.UNINITIALIZED_THIS.equals(obj);
                        }
                        return Default.toFrame(typeDescription).equals(obj);
                    }
                },
                EXIT { // from class: org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler.Default.TranslationMode.3
                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler.Default.TranslationMode
                    protected int copy(TypeDescription typeDescription, MethodDescription methodDescription, MethodDescription methodDescription2, Object[] objArr, Object[] objArr2) {
                        int i = 0;
                        if (!methodDescription.isStatic()) {
                            objArr2[0] = Default.toFrame(typeDescription);
                            i = 1;
                        }
                        Iterator it = methodDescription.getParameters().asTypeList().asErasures().iterator();
                        while (it.hasNext()) {
                            objArr2[i] = Default.toFrame((TypeDescription) it.next());
                            i++;
                        }
                        return i;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler.Default.TranslationMode
                    protected boolean isPossibleThisFrameValue(TypeDescription typeDescription, MethodDescription methodDescription, Object obj) {
                        return Default.toFrame(typeDescription).equals(obj);
                    }
                };

                protected abstract int copy(TypeDescription typeDescription, MethodDescription methodDescription, MethodDescription methodDescription2, Object[] objArr, Object[] objArr2);

                protected abstract boolean isPossibleThisFrameValue(TypeDescription typeDescription, MethodDescription methodDescription, Object obj);
            }

            protected Default(TypeDescription typeDescription, MethodDescription methodDescription, List<? extends TypeDescription> list, List<? extends TypeDescription> list2, List<? extends TypeDescription> list3, boolean z) {
                this.instrumentedType = typeDescription;
                this.instrumentedMethod = methodDescription;
                this.initialTypes = list;
                this.preMethodTypes = list2;
                this.postMethodTypes = list3;
                this.expandFrames = z;
            }

            protected static ForInstrumentedMethod of(TypeDescription typeDescription, MethodDescription methodDescription, List<? extends TypeDescription> list, List<? extends TypeDescription> list2, List<? extends TypeDescription> list3, boolean z, boolean z2, ClassFileVersion classFileVersion, int i, int i2) {
                if ((i & 2) != 0 || classFileVersion.isLessThan(ClassFileVersion.JAVA_V6)) {
                    return NoOp.INSTANCE;
                }
                if (!z) {
                    return new Trivial(typeDescription, methodDescription, (i2 & 8) != 0);
                }
                if (z2) {
                    return new WithPreservedArguments.UsingArgumentCopy(typeDescription, methodDescription, list, list2, list3, (i2 & 8) != 0);
                }
                return new WithPreservedArguments.RequiringConsistentShape(typeDescription, methodDescription, list, list2, list3, (i2 & 8) != 0);
            }

            protected static Object toFrame(TypeDescription typeDescription) {
                if (typeDescription.represents(Boolean.TYPE) || typeDescription.represents(Byte.TYPE) || typeDescription.represents(Short.TYPE) || typeDescription.represents(Character.TYPE) || typeDescription.represents(Integer.TYPE)) {
                    return Opcodes.INTEGER;
                }
                if (typeDescription.represents(Long.TYPE)) {
                    return Opcodes.LONG;
                }
                if (typeDescription.represents(Float.TYPE)) {
                    return Opcodes.FLOAT;
                }
                if (typeDescription.represents(Double.TYPE)) {
                    return Opcodes.DOUBLE;
                }
                return typeDescription.getInternalName();
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler.ForInstrumentedMethod
            public ForAdvice bindEnter(MethodDescription.InDefinedShape inDefinedShape) {
                return new ForAdvice(inDefinedShape, this.initialTypes, this.preMethodTypes, TranslationMode.ENTER);
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler.ForInstrumentedMethod
            public int getReaderHint() {
                return this.expandFrames ? 8 : 0;
            }

            protected void translateFrame(MethodVisitor methodVisitor, TranslationMode translationMode, MethodDescription methodDescription, List<? extends TypeDescription> list, int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
                int i4;
                int i5;
                Object[] objArr3;
                if (i == -1 || i == 0) {
                    if (methodDescription.getParameters().size() + (!methodDescription.isStatic() ? 1 : 0) > i2) {
                        throw new IllegalStateException("Inconsistent frame length for " + methodDescription + ": " + i2);
                    }
                    if (methodDescription.isStatic()) {
                        i4 = 0;
                    } else {
                        if (!translationMode.isPossibleThisFrameValue(this.instrumentedType, this.instrumentedMethod, objArr[0])) {
                            throw new IllegalStateException(methodDescription + " is inconsistent for 'this' reference: " + objArr[0]);
                        }
                        i4 = 1;
                    }
                    for (int i6 = 0; i6 < methodDescription.getParameters().size(); i6++) {
                        int i7 = i6 + i4;
                        if (!toFrame(((ParameterDescription) methodDescription.getParameters().get(i6)).getType().asErasure()).equals(objArr[i7])) {
                            throw new IllegalStateException(methodDescription + " is inconsistent at " + i6 + ": " + objArr[i7]);
                        }
                    }
                    int size = ((i2 - (!methodDescription.isStatic() ? 1 : 0)) - methodDescription.getParameters().size()) + (!this.instrumentedMethod.isStatic() ? 1 : 0) + this.instrumentedMethod.getParameters().size() + list.size();
                    Object[] objArr4 = new Object[size];
                    int copy = translationMode.copy(this.instrumentedType, this.instrumentedMethod, methodDescription, objArr, objArr4);
                    Iterator<? extends TypeDescription> it = list.iterator();
                    while (it.hasNext()) {
                        objArr4[copy] = toFrame(it.next());
                        copy++;
                    }
                    int i8 = size - copy;
                    System.arraycopy(objArr, methodDescription.getParameters().size() + (!methodDescription.isStatic() ? 1 : 0), objArr4, copy, i8);
                    this.currentFrameDivergence = i8;
                    i5 = size;
                    objArr3 = objArr4;
                } else {
                    if (i == 1) {
                        this.currentFrameDivergence += i2;
                    } else if (i == 2) {
                        int i9 = this.currentFrameDivergence - i2;
                        this.currentFrameDivergence = i9;
                        if (i9 < 0) {
                            throw new IllegalStateException(methodDescription + " dropped " + Math.abs(this.currentFrameDivergence) + " implicit frames");
                        }
                    } else if (i != 3 && i != 4) {
                        throw new IllegalArgumentException("Unexpected frame type: " + i);
                    }
                    i5 = i2;
                    objArr3 = objArr;
                }
                methodVisitor.visitFrame(i, i5, objArr3, i3, objArr2);
            }

            protected void injectFullFrame(MethodVisitor methodVisitor, List<? extends TypeDescription> list, List<? extends TypeDescription> list2) {
                int i = 1;
                int size = this.instrumentedMethod.getParameters().size() + (!this.instrumentedMethod.isStatic() ? 1 : 0) + list.size();
                Object[] objArr = new Object[size];
                if (this.instrumentedMethod.isStatic()) {
                    i = 0;
                } else {
                    objArr[0] = toFrame(this.instrumentedType);
                }
                Iterator it = this.instrumentedMethod.getParameters().asTypeList().asErasures().iterator();
                while (it.hasNext()) {
                    objArr[i] = toFrame((TypeDescription) it.next());
                    i++;
                }
                Iterator<? extends TypeDescription> it2 = list.iterator();
                while (it2.hasNext()) {
                    objArr[i] = toFrame(it2.next());
                    i++;
                }
                int size2 = list2.size();
                Object[] objArr2 = new Object[size2];
                Iterator<? extends TypeDescription> it3 = list2.iterator();
                int i2 = 0;
                while (it3.hasNext()) {
                    objArr2[i2] = toFrame(it3.next());
                    i2++;
                }
                methodVisitor.visitFrame(this.expandFrames ? -1 : 0, size, objArr, size2, objArr2);
                this.currentFrameDivergence = 0;
            }

            protected static class Trivial extends Default {
                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler.ForInstrumentedMethod
                public void injectInitializationFrame(MethodVisitor methodVisitor) {
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler.ForInstrumentedMethod
                public void injectStartFrame(MethodVisitor methodVisitor) {
                }

                protected Trivial(TypeDescription typeDescription, MethodDescription methodDescription, boolean z) {
                    super(typeDescription, methodDescription, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), z);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler
                public void translateFrame(MethodVisitor methodVisitor, int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
                    methodVisitor.visitFrame(i, i2, objArr, i3, objArr2);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler.ForInstrumentedMethod
                public ForAdvice bindExit(MethodDescription.InDefinedShape inDefinedShape) {
                    throw new IllegalStateException("Did not expect exit advice " + inDefinedShape + " for " + this.instrumentedMethod);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler
                public void injectReturnFrame(MethodVisitor methodVisitor) {
                    throw new IllegalStateException("Did not expect return frame for " + this.instrumentedMethod);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler
                public void injectExceptionFrame(MethodVisitor methodVisitor) {
                    throw new IllegalStateException("Did not expect exception frame for " + this.instrumentedMethod);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler
                public void injectCompletionFrame(MethodVisitor methodVisitor) {
                    throw new IllegalStateException("Did not expect completion frame for " + this.instrumentedMethod);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler.ForInstrumentedMethod
                public void injectPostCompletionFrame(MethodVisitor methodVisitor) {
                    throw new IllegalStateException("Did not expect post completion frame for " + this.instrumentedMethod);
                }
            }

            protected static abstract class WithPreservedArguments extends Default {
                protected WithPreservedArguments(TypeDescription typeDescription, MethodDescription methodDescription, List<? extends TypeDescription> list, List<? extends TypeDescription> list2, List<? extends TypeDescription> list3, boolean z) {
                    super(typeDescription, methodDescription, list, list2, list3, z);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler.ForInstrumentedMethod
                public ForAdvice bindExit(MethodDescription.InDefinedShape inDefinedShape) {
                    return new ForAdvice(inDefinedShape, CompoundList.of(this.initialTypes, this.preMethodTypes, this.postMethodTypes), Collections.emptyList(), TranslationMode.EXIT);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler
                public void injectReturnFrame(MethodVisitor methodVisitor) {
                    List<? extends TypeDescription> singletonList;
                    if (!this.expandFrames && this.currentFrameDivergence == 0) {
                        if (this.instrumentedMethod.getReturnType().represents(Void.TYPE)) {
                            methodVisitor.visitFrame(3, EMPTY.length, EMPTY, EMPTY.length, EMPTY);
                            return;
                        } else {
                            methodVisitor.visitFrame(4, EMPTY.length, EMPTY, 1, new Object[]{toFrame(this.instrumentedMethod.getReturnType().asErasure())});
                            return;
                        }
                    }
                    List<? extends TypeDescription> of = CompoundList.of((List) this.initialTypes, (List) this.preMethodTypes);
                    if (this.instrumentedMethod.getReturnType().represents(Void.TYPE)) {
                        singletonList = Collections.emptyList();
                    } else {
                        singletonList = Collections.singletonList(this.instrumentedMethod.getReturnType().asErasure());
                    }
                    injectFullFrame(methodVisitor, of, singletonList);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler
                public void injectExceptionFrame(MethodVisitor methodVisitor) {
                    if (!this.expandFrames && this.currentFrameDivergence == 0) {
                        methodVisitor.visitFrame(4, EMPTY.length, EMPTY, 1, new Object[]{Type.getInternalName(Throwable.class)});
                    } else {
                        injectFullFrame(methodVisitor, CompoundList.of((List) this.initialTypes, (List) this.preMethodTypes), Collections.singletonList(TypeDescription.THROWABLE));
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler
                public void injectCompletionFrame(MethodVisitor methodVisitor) {
                    if (!this.expandFrames && this.currentFrameDivergence == 0) {
                        int size = this.postMethodTypes.size();
                        Object[] objArr = new Object[size];
                        Iterator<? extends TypeDescription> it = this.postMethodTypes.iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            objArr[i] = toFrame(it.next());
                            i++;
                        }
                        methodVisitor.visitFrame(1, size, objArr, EMPTY.length, EMPTY);
                        return;
                    }
                    injectFullFrame(methodVisitor, CompoundList.of(this.initialTypes, this.preMethodTypes, this.postMethodTypes), Collections.emptyList());
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler.ForInstrumentedMethod
                public void injectPostCompletionFrame(MethodVisitor methodVisitor) {
                    if (!this.expandFrames && this.currentFrameDivergence == 0) {
                        methodVisitor.visitFrame(3, EMPTY.length, EMPTY, EMPTY.length, EMPTY);
                    } else {
                        injectFullFrame(methodVisitor, CompoundList.of(this.initialTypes, this.preMethodTypes, this.postMethodTypes), Collections.emptyList());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler.ForInstrumentedMethod
                public void injectInitializationFrame(MethodVisitor methodVisitor) {
                    if (this.initialTypes.isEmpty()) {
                        return;
                    }
                    if (!this.expandFrames && this.initialTypes.size() < 4) {
                        int size = this.initialTypes.size();
                        Object[] objArr = new Object[size];
                        Iterator<? extends TypeDescription> it = this.initialTypes.iterator();
                        while (it.hasNext()) {
                            objArr[r1] = toFrame(it.next());
                            r1++;
                        }
                        methodVisitor.visitFrame(1, size, objArr, EMPTY.length, EMPTY);
                        return;
                    }
                    int i = 1;
                    int size2 = (!this.instrumentedMethod.isStatic() ? 1 : 0) + this.instrumentedMethod.getParameters().size() + this.initialTypes.size();
                    Object[] objArr2 = new Object[size2];
                    if (this.instrumentedMethod.isConstructor()) {
                        objArr2[0] = Opcodes.UNINITIALIZED_THIS;
                    } else if (this.instrumentedMethod.isStatic()) {
                        i = 0;
                    } else {
                        objArr2[0] = toFrame(this.instrumentedType);
                    }
                    Iterator it2 = this.instrumentedMethod.getParameters().asTypeList().asErasures().iterator();
                    while (it2.hasNext()) {
                        objArr2[i] = toFrame((TypeDescription) it2.next());
                        i++;
                    }
                    Iterator<? extends TypeDescription> it3 = this.initialTypes.iterator();
                    while (it3.hasNext()) {
                        objArr2[i] = toFrame(it3.next());
                        i++;
                    }
                    methodVisitor.visitFrame(this.expandFrames ? -1 : 0, size2, objArr2, EMPTY.length, EMPTY);
                }

                protected static class RequiringConsistentShape extends WithPreservedArguments {
                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler.ForInstrumentedMethod
                    public void injectStartFrame(MethodVisitor methodVisitor) {
                    }

                    protected RequiringConsistentShape(TypeDescription typeDescription, MethodDescription methodDescription, List<? extends TypeDescription> list, List<? extends TypeDescription> list2, List<? extends TypeDescription> list3, boolean z) {
                        super(typeDescription, methodDescription, list, list2, list3, z);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler
                    public void translateFrame(MethodVisitor methodVisitor, int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
                        translateFrame(methodVisitor, TranslationMode.COPY, this.instrumentedMethod, CompoundList.of((List) this.initialTypes, (List) this.preMethodTypes), i, i2, objArr, i3, objArr2);
                    }
                }

                protected static class UsingArgumentCopy extends WithPreservedArguments {
                    protected UsingArgumentCopy(TypeDescription typeDescription, MethodDescription methodDescription, List<? extends TypeDescription> list, List<? extends TypeDescription> list2, List<? extends TypeDescription> list3, boolean z) {
                        super(typeDescription, methodDescription, list, list2, list3, z);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:19:0x007b A[LOOP:0: B:17:0x0075->B:19:0x007b, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:35:0x00f8 A[LOOP:1: B:33:0x00f2->B:35:0x00f8, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:40:0x0114 A[LOOP:2: B:38:0x010e->B:40:0x0114, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:45:0x0130 A[LOOP:3: B:43:0x012a->B:45:0x0130, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:49:0x0148  */
                    /* JADX WARN: Removed duplicated region for block: B:54:0x017b A[LOOP:4: B:52:0x0175->B:54:0x017b, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:58:0x018f  */
                    /* JADX WARN: Removed duplicated region for block: B:60:0x0150  */
                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler.ForInstrumentedMethod
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public void injectStartFrame(MethodVisitor methodVisitor) {
                        int i;
                        Iterator it;
                        Iterator<? extends TypeDescription> it2;
                        Iterator<? extends TypeDescription> it3;
                        int i2;
                        Iterator it4;
                        Iterator it5;
                        if (!this.instrumentedMethod.isStatic() || !this.instrumentedMethod.getParameters().isEmpty()) {
                            if (!this.expandFrames && (!this.instrumentedMethod.isStatic() ? 1 : 0) + this.instrumentedMethod.getParameters().size() < 4) {
                                int size = (!this.instrumentedMethod.isStatic() ? 1 : 0) + this.instrumentedMethod.getParameters().size();
                                Object[] objArr = new Object[size];
                                if (this.instrumentedMethod.isConstructor()) {
                                    objArr[0] = Opcodes.UNINITIALIZED_THIS;
                                } else {
                                    if (!this.instrumentedMethod.isStatic()) {
                                        objArr[0] = toFrame(this.instrumentedType);
                                    }
                                    it5 = this.instrumentedMethod.getParameters().asTypeList().asErasures().iterator();
                                    while (it5.hasNext()) {
                                        objArr[r2] = toFrame((TypeDescription) it5.next());
                                        r2++;
                                    }
                                    methodVisitor.visitFrame(1, size, objArr, EMPTY.length, EMPTY);
                                }
                                r2 = 1;
                                it5 = this.instrumentedMethod.getParameters().asTypeList().asErasures().iterator();
                                while (it5.hasNext()) {
                                }
                                methodVisitor.visitFrame(1, size, objArr, EMPTY.length, EMPTY);
                            } else {
                                int size2 = (this.instrumentedMethod.isStatic() ? 0 : 2) + (this.instrumentedMethod.getParameters().size() * 2) + this.initialTypes.size() + this.preMethodTypes.size();
                                Object[] objArr2 = new Object[size2];
                                if (this.instrumentedMethod.isConstructor()) {
                                    objArr2[0] = Opcodes.UNINITIALIZED_THIS;
                                } else if (!this.instrumentedMethod.isStatic()) {
                                    objArr2[0] = toFrame(this.instrumentedType);
                                } else {
                                    i = 0;
                                    it = this.instrumentedMethod.getParameters().asTypeList().asErasures().iterator();
                                    while (it.hasNext()) {
                                        objArr2[i] = toFrame((TypeDescription) it.next());
                                        i++;
                                    }
                                    it2 = this.initialTypes.iterator();
                                    while (it2.hasNext()) {
                                        objArr2[i] = toFrame(it2.next());
                                        i++;
                                    }
                                    it3 = this.preMethodTypes.iterator();
                                    while (it3.hasNext()) {
                                        objArr2[i] = toFrame(it3.next());
                                        i++;
                                    }
                                    if (!this.instrumentedMethod.isConstructor()) {
                                        i2 = i + 1;
                                        objArr2[i] = Opcodes.UNINITIALIZED_THIS;
                                    } else {
                                        if (!this.instrumentedMethod.isStatic()) {
                                            i2 = i + 1;
                                            objArr2[i] = toFrame(this.instrumentedType);
                                        }
                                        it4 = this.instrumentedMethod.getParameters().asTypeList().asErasures().iterator();
                                        while (it4.hasNext()) {
                                            objArr2[i] = toFrame((TypeDescription) it4.next());
                                            i++;
                                        }
                                        methodVisitor.visitFrame(this.expandFrames ? -1 : 0, size2, objArr2, EMPTY.length, EMPTY);
                                    }
                                    i = i2;
                                    it4 = this.instrumentedMethod.getParameters().asTypeList().asErasures().iterator();
                                    while (it4.hasNext()) {
                                    }
                                    methodVisitor.visitFrame(this.expandFrames ? -1 : 0, size2, objArr2, EMPTY.length, EMPTY);
                                }
                                i = 1;
                                it = this.instrumentedMethod.getParameters().asTypeList().asErasures().iterator();
                                while (it.hasNext()) {
                                }
                                it2 = this.initialTypes.iterator();
                                while (it2.hasNext()) {
                                }
                                it3 = this.preMethodTypes.iterator();
                                while (it3.hasNext()) {
                                }
                                if (!this.instrumentedMethod.isConstructor()) {
                                }
                                i = i2;
                                it4 = this.instrumentedMethod.getParameters().asTypeList().asErasures().iterator();
                                while (it4.hasNext()) {
                                }
                                methodVisitor.visitFrame(this.expandFrames ? -1 : 0, size2, objArr2, EMPTY.length, EMPTY);
                            }
                        }
                        this.currentFrameDivergence = (!this.instrumentedMethod.isStatic() ? 1 : 0) + this.instrumentedMethod.getParameters().size();
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler
                    public void translateFrame(MethodVisitor methodVisitor, int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
                        int i4;
                        Object[] objArr3;
                        Object[] objArr4;
                        Object frame;
                        int i5 = 1;
                        if (i == -1 || i == 0) {
                            int size = (!this.instrumentedMethod.isStatic() ? 1 : 0) + i2 + this.instrumentedMethod.getParameters().size() + this.initialTypes.size() + this.preMethodTypes.size();
                            Object[] objArr5 = new Object[size];
                            if (this.instrumentedMethod.isConstructor()) {
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= i2) {
                                        objArr4 = false;
                                        break;
                                    } else {
                                        if (objArr[i6] == Opcodes.UNINITIALIZED_THIS) {
                                            objArr4 = true;
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                                if (objArr4 != false) {
                                    frame = Opcodes.UNINITIALIZED_THIS;
                                } else {
                                    frame = toFrame(this.instrumentedType);
                                }
                                objArr5[0] = frame;
                            } else if (this.instrumentedMethod.isStatic()) {
                                i5 = 0;
                            } else {
                                objArr5[0] = toFrame(this.instrumentedType);
                            }
                            Iterator it = this.instrumentedMethod.getParameters().asTypeList().asErasures().iterator();
                            while (it.hasNext()) {
                                objArr5[i5] = toFrame((TypeDescription) it.next());
                                i5++;
                            }
                            Iterator<? extends TypeDescription> it2 = this.initialTypes.iterator();
                            while (it2.hasNext()) {
                                objArr5[i5] = toFrame(it2.next());
                                i5++;
                            }
                            Iterator<? extends TypeDescription> it3 = this.preMethodTypes.iterator();
                            while (it3.hasNext()) {
                                objArr5[i5] = toFrame(it3.next());
                                i5++;
                            }
                            System.arraycopy(objArr, 0, objArr5, i5, i2);
                            this.currentFrameDivergence = size;
                            i4 = size;
                            objArr3 = objArr5;
                        } else {
                            if (i == 1) {
                                this.currentFrameDivergence += i2;
                            } else if (i == 2) {
                                this.currentFrameDivergence -= i2;
                            } else if (i != 3 && i != 4) {
                                throw new IllegalArgumentException("Unexpected frame type: " + i);
                            }
                            objArr3 = objArr;
                            i4 = i2;
                        }
                        methodVisitor.visitFrame(i, i4, objArr3, i3, objArr2);
                    }
                }
            }

            protected class ForAdvice implements ForAdvice {
                protected final MethodDescription.InDefinedShape adviceMethod;
                protected final List<? extends TypeDescription> endTypes;
                protected final List<? extends TypeDescription> startTypes;
                protected final TranslationMode translationMode;

                protected ForAdvice(MethodDescription.InDefinedShape inDefinedShape, List<? extends TypeDescription> list, List<? extends TypeDescription> list2, TranslationMode translationMode) {
                    this.adviceMethod = inDefinedShape;
                    this.startTypes = list;
                    this.endTypes = list2;
                    this.translationMode = translationMode;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler
                public void translateFrame(MethodVisitor methodVisitor, int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
                    Default.this.translateFrame(methodVisitor, this.translationMode, this.adviceMethod, this.startTypes, i, i2, objArr, i3, objArr2);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler
                public void injectReturnFrame(MethodVisitor methodVisitor) {
                    List<? extends TypeDescription> singletonList;
                    if (!Default.this.expandFrames && Default.this.currentFrameDivergence == 0) {
                        if (this.adviceMethod.getReturnType().represents(Void.TYPE)) {
                            methodVisitor.visitFrame(3, Default.EMPTY.length, Default.EMPTY, Default.EMPTY.length, Default.EMPTY);
                            return;
                        } else {
                            methodVisitor.visitFrame(4, Default.EMPTY.length, Default.EMPTY, 1, new Object[]{Default.toFrame(this.adviceMethod.getReturnType().asErasure())});
                            return;
                        }
                    }
                    Default r0 = Default.this;
                    List<? extends TypeDescription> list = this.startTypes;
                    if (this.adviceMethod.getReturnType().represents(Void.TYPE)) {
                        singletonList = Collections.emptyList();
                    } else {
                        singletonList = Collections.singletonList(this.adviceMethod.getReturnType().asErasure());
                    }
                    r0.injectFullFrame(methodVisitor, list, singletonList);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler
                public void injectExceptionFrame(MethodVisitor methodVisitor) {
                    if (!Default.this.expandFrames && Default.this.currentFrameDivergence == 0) {
                        methodVisitor.visitFrame(4, Default.EMPTY.length, Default.EMPTY, 1, new Object[]{Type.getInternalName(Throwable.class)});
                    } else {
                        Default.this.injectFullFrame(methodVisitor, this.startTypes, Collections.singletonList(TypeDescription.THROWABLE));
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.StackMapFrameHandler
                public void injectCompletionFrame(MethodVisitor methodVisitor) {
                    if (!Default.this.expandFrames && Default.this.currentFrameDivergence == 0 && this.endTypes.size() < 4) {
                        if (this.endTypes.isEmpty()) {
                            methodVisitor.visitFrame(3, Default.EMPTY.length, Default.EMPTY, Default.EMPTY.length, Default.EMPTY);
                            return;
                        }
                        int size = this.endTypes.size();
                        Object[] objArr = new Object[size];
                        Iterator<? extends TypeDescription> it = this.endTypes.iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            objArr[i] = Default.toFrame(it.next());
                            i++;
                        }
                        methodVisitor.visitFrame(1, size, objArr, Default.EMPTY.length, Default.EMPTY);
                        return;
                    }
                    Default.this.injectFullFrame(methodVisitor, CompoundList.of((List) this.startTypes, (List) this.endTypes), Collections.emptyList());
                }
            }
        }
    }

    public interface ExceptionHandler {

        public enum Default implements ExceptionHandler {
            SUPPRESSING { // from class: org.modelmapper.internal.bytebuddy.asm.Advice.ExceptionHandler.Default.1
                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ExceptionHandler
                public StackManipulation resolve(MethodDescription methodDescription, TypeDescription typeDescription) {
                    return Removal.SINGLE;
                }
            },
            PRINTING { // from class: org.modelmapper.internal.bytebuddy.asm.Advice.ExceptionHandler.Default.2
                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ExceptionHandler
                public StackManipulation resolve(MethodDescription methodDescription, TypeDescription typeDescription) {
                    try {
                        return MethodInvocation.invoke((MethodDescription.InDefinedShape) new MethodDescription.ForLoadedMethod(Throwable.class.getMethod("printStackTrace", new Class[0])));
                    } catch (NoSuchMethodException unused) {
                        throw new IllegalStateException("Cannot locate Throwable::printStackTrace");
                    }
                }
            }
        }

        StackManipulation resolve(MethodDescription methodDescription, TypeDescription typeDescription);

        @HashCodeAndEqualsPlugin.Enhance
        public static class Simple implements ExceptionHandler {
            private final StackManipulation stackManipulation;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.stackManipulation.equals(((Simple) obj).stackManipulation);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.stackManipulation.hashCode();
            }

            public Simple(StackManipulation stackManipulation) {
                this.stackManipulation = stackManipulation;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.ExceptionHandler
            public StackManipulation resolve(MethodDescription methodDescription, TypeDescription typeDescription) {
                return this.stackManipulation;
            }
        }
    }

    protected interface Dispatcher {
        public static final AnnotationVisitor IGNORE_ANNOTATION = null;
        public static final MethodVisitor IGNORE_METHOD = null;

        public interface Bound {
            void apply();

            void initialize();

            void prepare();
        }

        public interface Unresolved extends Dispatcher {
            Resolved.ForMethodEnter asMethodEnter(List<? extends OffsetMapping.Factory<?>> list, ClassReader classReader, Unresolved unresolved);

            Resolved.ForMethodExit asMethodExit(List<? extends OffsetMapping.Factory<?>> list, ClassReader classReader, Unresolved unresolved);

            Map<String, TypeDefinition> getNamedTypes();

            boolean isBinary();
        }

        TypeDefinition getAdviceType();

        boolean isAlive();

        public interface SuppressionHandler {

            public interface Bound {
                void onEnd(MethodVisitor methodVisitor, Implementation.Context context, MethodSizeHandler.ForAdvice forAdvice, StackMapFrameHandler.ForAdvice forAdvice2, TypeDefinition typeDefinition);

                void onEndWithSkip(MethodVisitor methodVisitor, Implementation.Context context, MethodSizeHandler.ForAdvice forAdvice, StackMapFrameHandler.ForAdvice forAdvice2, TypeDefinition typeDefinition);

                void onPrepare(MethodVisitor methodVisitor);

                void onStart(MethodVisitor methodVisitor);
            }

            public enum NoOp implements SuppressionHandler, Bound {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.SuppressionHandler
                public Bound bind(StackManipulation stackManipulation) {
                    return this;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.SuppressionHandler.Bound
                public void onEnd(MethodVisitor methodVisitor, Implementation.Context context, MethodSizeHandler.ForAdvice forAdvice, StackMapFrameHandler.ForAdvice forAdvice2, TypeDefinition typeDefinition) {
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.SuppressionHandler.Bound
                public void onEndWithSkip(MethodVisitor methodVisitor, Implementation.Context context, MethodSizeHandler.ForAdvice forAdvice, StackMapFrameHandler.ForAdvice forAdvice2, TypeDefinition typeDefinition) {
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.SuppressionHandler.Bound
                public void onPrepare(MethodVisitor methodVisitor) {
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.SuppressionHandler.Bound
                public void onStart(MethodVisitor methodVisitor) {
                }
            }

            Bound bind(StackManipulation stackManipulation);

            @HashCodeAndEqualsPlugin.Enhance
            public static class Suppressing implements SuppressionHandler {
                private final TypeDescription suppressedType;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.suppressedType.equals(((Suppressing) obj).suppressedType);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.suppressedType.hashCode();
                }

                protected Suppressing(TypeDescription typeDescription) {
                    this.suppressedType = typeDescription;
                }

                protected static SuppressionHandler of(TypeDescription typeDescription) {
                    return typeDescription.represents(NoExceptionHandler.class) ? NoOp.INSTANCE : new Suppressing(typeDescription);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.SuppressionHandler
                public Bound bind(StackManipulation stackManipulation) {
                    return new Bound(this.suppressedType, stackManipulation);
                }

                protected static class Bound implements Bound {
                    private final StackManipulation exceptionHandler;
                    private final TypeDescription suppressedType;
                    private final Label startOfMethod = new Label();
                    private final Label endOfMethod = new Label();

                    protected Bound(TypeDescription typeDescription, StackManipulation stackManipulation) {
                        this.suppressedType = typeDescription;
                        this.exceptionHandler = stackManipulation;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.SuppressionHandler.Bound
                    public void onPrepare(MethodVisitor methodVisitor) {
                        Label label = this.startOfMethod;
                        Label label2 = this.endOfMethod;
                        methodVisitor.visitTryCatchBlock(label, label2, label2, this.suppressedType.getInternalName());
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.SuppressionHandler.Bound
                    public void onStart(MethodVisitor methodVisitor) {
                        methodVisitor.visitLabel(this.startOfMethod);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.SuppressionHandler.Bound
                    public void onEnd(MethodVisitor methodVisitor, Implementation.Context context, MethodSizeHandler.ForAdvice forAdvice, StackMapFrameHandler.ForAdvice forAdvice2, TypeDefinition typeDefinition) {
                        methodVisitor.visitLabel(this.endOfMethod);
                        forAdvice2.injectExceptionFrame(methodVisitor);
                        forAdvice.requireStackSize(this.exceptionHandler.apply(methodVisitor, context).getMaximalSize() + 1);
                        if (typeDefinition.represents(Boolean.TYPE) || typeDefinition.represents(Byte.TYPE) || typeDefinition.represents(Short.TYPE) || typeDefinition.represents(Character.TYPE) || typeDefinition.represents(Integer.TYPE)) {
                            methodVisitor.visitInsn(3);
                            return;
                        }
                        if (typeDefinition.represents(Long.TYPE)) {
                            methodVisitor.visitInsn(9);
                            return;
                        }
                        if (typeDefinition.represents(Float.TYPE)) {
                            methodVisitor.visitInsn(11);
                        } else if (typeDefinition.represents(Double.TYPE)) {
                            methodVisitor.visitInsn(14);
                        } else {
                            if (typeDefinition.represents(Void.TYPE)) {
                                return;
                            }
                            methodVisitor.visitInsn(1);
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.SuppressionHandler.Bound
                    public void onEndWithSkip(MethodVisitor methodVisitor, Implementation.Context context, MethodSizeHandler.ForAdvice forAdvice, StackMapFrameHandler.ForAdvice forAdvice2, TypeDefinition typeDefinition) {
                        Label label = new Label();
                        methodVisitor.visitJumpInsn(Opcodes.GOTO, label);
                        onEnd(methodVisitor, context, forAdvice, forAdvice2, typeDefinition);
                        methodVisitor.visitLabel(label);
                        forAdvice2.injectReturnFrame(methodVisitor);
                    }
                }
            }
        }

        public interface RelocationHandler {

            public interface Bound {
                public static final int NO_REQUIRED_SIZE = 0;

                int apply(MethodVisitor methodVisitor, int i);
            }

            public enum Disabled implements RelocationHandler, Bound {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.RelocationHandler.Bound
                public int apply(MethodVisitor methodVisitor, int i) {
                    return 0;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.RelocationHandler
                public Bound bind(MethodDescription methodDescription, Relocation relocation) {
                    return this;
                }
            }

            Bound bind(MethodDescription methodDescription, Relocation relocation);

            public interface Relocation {
                void apply(MethodVisitor methodVisitor);

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForLabel implements Relocation {
                    private final Label label;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.label.equals(((ForLabel) obj).label);
                    }

                    public int hashCode() {
                        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.label.hashCode();
                    }

                    public ForLabel(Label label) {
                        this.label = label;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.RelocationHandler.Relocation
                    public void apply(MethodVisitor methodVisitor) {
                        methodVisitor.visitJumpInsn(Opcodes.GOTO, this.label);
                    }
                }
            }

            /* JADX WARN: Enum visitor error
            jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'LONG' uses external variables
            	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
            	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
            	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
            	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
            	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
            	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
             */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            public static abstract class ForValue implements RelocationHandler {
                private static final /* synthetic */ ForValue[] $VALUES;
                public static final ForValue DOUBLE;
                public static final ForValue FLOAT;
                public static final ForValue INTEGER;
                public static final ForValue LONG;
                public static final ForValue REFERENCE;
                private final int defaultJump;
                private final int load;
                private final int nonDefaultJump;
                private final int requiredSize;

                protected abstract void convertValue(MethodVisitor methodVisitor);

                public static ForValue valueOf(String str) {
                    return (ForValue) Enum.valueOf(ForValue.class, str);
                }

                public static ForValue[] values() {
                    return (ForValue[]) $VALUES.clone();
                }

                static {
                    ForValue forValue = new ForValue("INTEGER", 0, 21, 154, 153, 0) { // from class: org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.RelocationHandler.ForValue.1
                        @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.RelocationHandler.ForValue
                        protected void convertValue(MethodVisitor methodVisitor) {
                        }
                    };
                    INTEGER = forValue;
                    int i = 153;
                    int i2 = 154;
                    ForValue forValue2 = new ForValue("LONG", 1, 22, i2, i, 0) { // from class: org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.RelocationHandler.ForValue.2
                        @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.RelocationHandler.ForValue
                        protected void convertValue(MethodVisitor methodVisitor) {
                            methodVisitor.visitInsn(136);
                        }
                    };
                    LONG = forValue2;
                    ForValue forValue3 = new ForValue("FLOAT", 2, 23, 154, 153, 2) { // from class: org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.RelocationHandler.ForValue.3
                        @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.RelocationHandler.ForValue
                        protected void convertValue(MethodVisitor methodVisitor) {
                            methodVisitor.visitInsn(11);
                            methodVisitor.visitInsn(Opcodes.FCMPL);
                        }
                    };
                    FLOAT = forValue3;
                    ForValue forValue4 = new ForValue("DOUBLE", 3, 24, i2, i, 4) { // from class: org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.RelocationHandler.ForValue.4
                        @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.RelocationHandler.ForValue
                        protected void convertValue(MethodVisitor methodVisitor) {
                            methodVisitor.visitInsn(14);
                            methodVisitor.visitInsn(Opcodes.DCMPL);
                        }
                    };
                    DOUBLE = forValue4;
                    ForValue forValue5 = new ForValue("REFERENCE", 4, 25, Opcodes.IFNONNULL, Opcodes.IFNULL, 0) { // from class: org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.RelocationHandler.ForValue.5
                        @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.RelocationHandler.ForValue
                        protected void convertValue(MethodVisitor methodVisitor) {
                        }
                    };
                    REFERENCE = forValue5;
                    $VALUES = new ForValue[]{forValue, forValue2, forValue3, forValue4, forValue5};
                }

                private ForValue(String str, int i, int i2, int i3, int i4, int i5) {
                    this.load = i2;
                    this.defaultJump = i3;
                    this.nonDefaultJump = i4;
                    this.requiredSize = i5;
                }

                protected static RelocationHandler of(TypeDefinition typeDefinition, boolean z) {
                    ForValue forValue;
                    if (typeDefinition.represents(Long.TYPE)) {
                        forValue = LONG;
                    } else if (typeDefinition.represents(Float.TYPE)) {
                        forValue = FLOAT;
                    } else if (typeDefinition.represents(Double.TYPE)) {
                        forValue = DOUBLE;
                    } else {
                        if (typeDefinition.represents(Void.TYPE)) {
                            throw new IllegalStateException("Cannot skip on default value for void return type");
                        }
                        if (typeDefinition.isPrimitive()) {
                            forValue = INTEGER;
                        } else {
                            forValue = REFERENCE;
                        }
                    }
                    if (!z) {
                        return forValue;
                    }
                    forValue.getClass();
                    return forValue.new Inverted();
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.RelocationHandler
                public Bound bind(MethodDescription methodDescription, Relocation relocation) {
                    return new Bound(methodDescription, relocation, false);
                }

                @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                protected class Inverted implements RelocationHandler {
                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && ForValue.this.equals(ForValue.this);
                    }

                    public int hashCode() {
                        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + ForValue.this.hashCode();
                    }

                    protected Inverted() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.RelocationHandler
                    public Bound bind(MethodDescription methodDescription, Relocation relocation) {
                        return ForValue.this.new Bound(methodDescription, relocation, true);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                protected class Bound implements Bound {
                    private final MethodDescription instrumentedMethod;
                    private final boolean inverted;
                    private final Relocation relocation;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        Bound bound = (Bound) obj;
                        return this.instrumentedMethod.equals(bound.instrumentedMethod) && this.relocation.equals(bound.relocation) && this.inverted == bound.inverted && ForValue.this.equals(ForValue.this);
                    }

                    public int hashCode() {
                        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentedMethod.hashCode()) * 31) + this.relocation.hashCode()) * 31) + (this.inverted ? 1 : 0)) * 31) + ForValue.this.hashCode();
                    }

                    protected Bound(MethodDescription methodDescription, Relocation relocation, boolean z) {
                        this.instrumentedMethod = methodDescription;
                        this.relocation = relocation;
                        this.inverted = z;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.RelocationHandler.Bound
                    public int apply(MethodVisitor methodVisitor, int i) {
                        if (!this.instrumentedMethod.isConstructor()) {
                            methodVisitor.visitVarInsn(ForValue.this.load, i);
                            ForValue.this.convertValue(methodVisitor);
                            Label label = new Label();
                            methodVisitor.visitJumpInsn(this.inverted ? ForValue.this.nonDefaultJump : ForValue.this.defaultJump, label);
                            this.relocation.apply(methodVisitor);
                            methodVisitor.visitLabel(label);
                            return ForValue.this.requiredSize;
                        }
                        throw new IllegalStateException("Cannot skip code execution from constructor: " + this.instrumentedMethod);
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForType implements RelocationHandler {
                private final TypeDescription typeDescription;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((ForType) obj).typeDescription);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDescription.hashCode();
                }

                protected ForType(TypeDescription typeDescription) {
                    this.typeDescription = typeDescription;
                }

                protected static RelocationHandler of(TypeDescription typeDescription, TypeDefinition typeDefinition) {
                    if (typeDescription.represents(Void.TYPE)) {
                        return Disabled.INSTANCE;
                    }
                    if (typeDescription.represents(OnDefaultValue.class)) {
                        return ForValue.of(typeDefinition, false);
                    }
                    if (typeDescription.represents(OnNonDefaultValue.class)) {
                        return ForValue.of(typeDefinition, true);
                    }
                    if (typeDescription.isPrimitive() || typeDefinition.isPrimitive()) {
                        throw new IllegalStateException("Cannot skip method by instance type for primitive return type " + typeDefinition);
                    }
                    return new ForType(typeDescription);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.RelocationHandler
                public Bound bind(MethodDescription methodDescription, Relocation relocation) {
                    return new Bound(methodDescription, relocation);
                }

                @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                protected class Bound implements Bound {
                    private final MethodDescription instrumentedMethod;
                    private final Relocation relocation;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        Bound bound = (Bound) obj;
                        return this.instrumentedMethod.equals(bound.instrumentedMethod) && this.relocation.equals(bound.relocation) && ForType.this.equals(ForType.this);
                    }

                    public int hashCode() {
                        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentedMethod.hashCode()) * 31) + this.relocation.hashCode()) * 31) + ForType.this.hashCode();
                    }

                    protected Bound(MethodDescription methodDescription, Relocation relocation) {
                        this.instrumentedMethod = methodDescription;
                        this.relocation = relocation;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.RelocationHandler.Bound
                    public int apply(MethodVisitor methodVisitor, int i) {
                        if (this.instrumentedMethod.isConstructor()) {
                            throw new IllegalStateException("Cannot skip code execution from constructor: " + this.instrumentedMethod);
                        }
                        methodVisitor.visitVarInsn(25, i);
                        methodVisitor.visitTypeInsn(Opcodes.INSTANCEOF, ForType.this.typeDescription.getInternalName());
                        Label label = new Label();
                        methodVisitor.visitJumpInsn(153, label);
                        this.relocation.apply(methodVisitor);
                        methodVisitor.visitLabel(label);
                        return 0;
                    }
                }
            }
        }

        public interface Resolved extends Dispatcher {

            public interface ForMethodEnter extends Resolved {
                Map<String, TypeDefinition> getNamedTypes();

                boolean isPrependLineNumber();
            }

            public interface ForMethodExit extends Resolved {
                ArgumentHandler.Factory getArgumentHandlerFactory();

                TypeDescription getThrowable();
            }

            Bound bind(TypeDescription typeDescription, MethodDescription methodDescription, MethodVisitor methodVisitor, Implementation.Context context, Assigner assigner, ArgumentHandler.ForInstrumentedMethod forInstrumentedMethod, MethodSizeHandler.ForInstrumentedMethod forInstrumentedMethod2, StackMapFrameHandler.ForInstrumentedMethod forInstrumentedMethod3, StackManipulation stackManipulation, RelocationHandler.Relocation relocation);

            @HashCodeAndEqualsPlugin.Enhance
            public static abstract class AbstractBase implements Resolved {
                protected final MethodDescription.InDefinedShape adviceMethod;
                protected final Map<Integer, OffsetMapping> offsetMappings;
                protected final RelocationHandler relocationHandler;
                protected final SuppressionHandler suppressionHandler;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    AbstractBase abstractBase = (AbstractBase) obj;
                    return this.adviceMethod.equals(abstractBase.adviceMethod) && this.offsetMappings.equals(abstractBase.offsetMappings) && this.suppressionHandler.equals(abstractBase.suppressionHandler) && this.relocationHandler.equals(abstractBase.relocationHandler);
                }

                public int hashCode() {
                    return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.adviceMethod.hashCode()) * 31) + this.offsetMappings.hashCode()) * 31) + this.suppressionHandler.hashCode()) * 31) + this.relocationHandler.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher
                public boolean isAlive() {
                    return true;
                }

                protected AbstractBase(MethodDescription.InDefinedShape inDefinedShape, List<? extends OffsetMapping.Factory<?>> list, TypeDescription typeDescription, TypeDescription typeDescription2, OffsetMapping.Factory.AdviceType adviceType) {
                    this.adviceMethod = inDefinedShape;
                    HashMap hashMap = new HashMap();
                    for (OffsetMapping.Factory<?> factory : list) {
                        hashMap.put(TypeDescription.ForLoadedType.of(factory.getAnnotationType()), factory);
                    }
                    this.offsetMappings = new LinkedHashMap();
                    for (ParameterDescription.InDefinedShape inDefinedShape2 : inDefinedShape.getParameters()) {
                        OffsetMapping offsetMapping = null;
                        for (AnnotationDescription annotationDescription : inDefinedShape2.getDeclaredAnnotations()) {
                            OffsetMapping.Factory factory2 = (OffsetMapping.Factory) hashMap.get(annotationDescription.getAnnotationType());
                            if (factory2 != null) {
                                OffsetMapping make = factory2.make(inDefinedShape2, annotationDescription.prepare(factory2.getAnnotationType()), adviceType);
                                if (offsetMapping != null) {
                                    throw new IllegalStateException(inDefinedShape2 + " is bound to both " + make + " and " + offsetMapping);
                                }
                                offsetMapping = make;
                            }
                        }
                        Map<Integer, OffsetMapping> map = this.offsetMappings;
                        Integer valueOf = Integer.valueOf(inDefinedShape2.getOffset());
                        if (offsetMapping == null) {
                            offsetMapping = new OffsetMapping.ForArgument.Unresolved(inDefinedShape2);
                        }
                        map.put(valueOf, offsetMapping);
                    }
                    this.suppressionHandler = SuppressionHandler.Suppressing.of(typeDescription);
                    this.relocationHandler = RelocationHandler.ForType.of(typeDescription2, inDefinedShape.getReturnType());
                }
            }
        }

        public enum Inactive implements Unresolved, Resolved.ForMethodEnter, Resolved.ForMethodExit, Bound {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Bound
            public void apply() {
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Unresolved
            public Resolved.ForMethodEnter asMethodEnter(List<? extends OffsetMapping.Factory<?>> list, ClassReader classReader, Unresolved unresolved) {
                return this;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Unresolved
            public Resolved.ForMethodExit asMethodExit(List<? extends OffsetMapping.Factory<?>> list, ClassReader classReader, Unresolved unresolved) {
                return this;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved
            public Bound bind(TypeDescription typeDescription, MethodDescription methodDescription, MethodVisitor methodVisitor, Implementation.Context context, Assigner assigner, ArgumentHandler.ForInstrumentedMethod forInstrumentedMethod, MethodSizeHandler.ForInstrumentedMethod forInstrumentedMethod2, StackMapFrameHandler.ForInstrumentedMethod forInstrumentedMethod3, StackManipulation stackManipulation, RelocationHandler.Relocation relocation) {
                return this;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Bound
            public void initialize() {
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher
            public boolean isAlive() {
                return false;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Unresolved
            public boolean isBinary() {
                return false;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved.ForMethodEnter
            public boolean isPrependLineNumber() {
                return false;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Bound
            public void prepare() {
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher
            public TypeDescription getAdviceType() {
                return TypeDescription.VOID;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Unresolved
            public Map<String, TypeDefinition> getNamedTypes() {
                return Collections.emptyMap();
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved.ForMethodExit
            public TypeDescription getThrowable() {
                return NoExceptionHandler.DESCRIPTION;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved.ForMethodExit
            public ArgumentHandler.Factory getArgumentHandlerFactory() {
                return ArgumentHandler.Factory.SIMPLE;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Inlining implements Unresolved {
            protected final MethodDescription.InDefinedShape adviceMethod;
            private final Map<String, TypeDefinition> namedTypes = new HashMap();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Inlining inlining = (Inlining) obj;
                return this.adviceMethod.equals(inlining.adviceMethod) && this.namedTypes.equals(inlining.namedTypes);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.adviceMethod.hashCode()) * 31) + this.namedTypes.hashCode();
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher
            public boolean isAlive() {
                return true;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Unresolved
            public boolean isBinary() {
                return true;
            }

            protected Inlining(MethodDescription.InDefinedShape inDefinedShape) {
                this.adviceMethod = inDefinedShape;
                for (ParameterDescription parameterDescription : inDefinedShape.getParameters().filter(ElementMatchers.isAnnotatedWith((Class<? extends Annotation>) Local.class))) {
                    String value = ((Local) parameterDescription.getDeclaredAnnotations().ofType(Local.class).loadSilent()).value();
                    TypeDefinition put = this.namedTypes.put(value, parameterDescription.getType());
                    if (put != null && !put.equals(parameterDescription.getType())) {
                        throw new IllegalStateException("Local variable for " + value + " is defined with inconsistent types");
                    }
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher
            public TypeDescription getAdviceType() {
                return this.adviceMethod.getReturnType().asErasure();
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Unresolved
            public Map<String, TypeDefinition> getNamedTypes() {
                return this.namedTypes;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Unresolved
            public Resolved.ForMethodEnter asMethodEnter(List<? extends OffsetMapping.Factory<?>> list, ClassReader classReader, Unresolved unresolved) {
                return Resolved.ForMethodEnter.of(this.adviceMethod, this.namedTypes, list, unresolved.getAdviceType(), classReader, unresolved.isAlive());
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Unresolved
            public Resolved.ForMethodExit asMethodExit(List<? extends OffsetMapping.Factory<?>> list, ClassReader classReader, Unresolved unresolved) {
                Map<String, TypeDefinition> namedTypes = unresolved.getNamedTypes();
                for (Map.Entry<String, TypeDefinition> entry : this.namedTypes.entrySet()) {
                    TypeDefinition typeDefinition = this.namedTypes.get(entry.getKey());
                    if (typeDefinition == null) {
                        throw new IllegalStateException(this.adviceMethod + " attempts use of undeclared local variable " + entry.getKey());
                    }
                    if (!typeDefinition.equals(entry.getValue())) {
                        throw new IllegalStateException(this.adviceMethod + " does not read variable " + entry.getKey() + " as " + typeDefinition);
                    }
                }
                return Resolved.ForMethodExit.of(this.adviceMethod, namedTypes, list, classReader, unresolved.getAdviceType());
            }

            protected static abstract class Resolved extends Resolved.AbstractBase {
                protected final ClassReader classReader;

                protected abstract MethodVisitor apply(MethodVisitor methodVisitor, Implementation.Context context, Assigner assigner, ArgumentHandler.ForInstrumentedMethod forInstrumentedMethod, MethodSizeHandler.ForInstrumentedMethod forInstrumentedMethod2, StackMapFrameHandler.ForInstrumentedMethod forInstrumentedMethod3, TypeDescription typeDescription, MethodDescription methodDescription, SuppressionHandler.Bound bound, RelocationHandler.Bound bound2);

                protected abstract Map<Integer, TypeDefinition> resolveInitializationTypes(ArgumentHandler argumentHandler);

                protected Resolved(MethodDescription.InDefinedShape inDefinedShape, List<? extends OffsetMapping.Factory<?>> list, TypeDescription typeDescription, TypeDescription typeDescription2, ClassReader classReader) {
                    super(inDefinedShape, list, typeDescription, typeDescription2, OffsetMapping.Factory.AdviceType.INLINING);
                    this.classReader = classReader;
                }

                protected class AdviceMethodInliner extends ClassVisitor implements Bound {
                    protected final ArgumentHandler.ForInstrumentedMethod argumentHandler;
                    protected final Assigner assigner;
                    protected final ClassReader classReader;
                    protected final Implementation.Context implementationContext;
                    protected final MethodDescription instrumentedMethod;
                    protected final TypeDescription instrumentedType;
                    protected final List<Label> labels;
                    protected final MethodSizeHandler.ForInstrumentedMethod methodSizeHandler;
                    protected final MethodVisitor methodVisitor;
                    protected final RelocationHandler.Bound relocationHandler;
                    protected final StackMapFrameHandler.ForInstrumentedMethod stackMapFrameHandler;
                    protected final SuppressionHandler.Bound suppressionHandler;

                    protected AdviceMethodInliner(TypeDescription typeDescription, MethodDescription methodDescription, MethodVisitor methodVisitor, Implementation.Context context, Assigner assigner, ArgumentHandler.ForInstrumentedMethod forInstrumentedMethod, MethodSizeHandler.ForInstrumentedMethod forInstrumentedMethod2, StackMapFrameHandler.ForInstrumentedMethod forInstrumentedMethod3, SuppressionHandler.Bound bound, RelocationHandler.Bound bound2, ClassReader classReader) {
                        super(OpenedClassReader.ASM_API);
                        this.instrumentedType = typeDescription;
                        this.instrumentedMethod = methodDescription;
                        this.methodVisitor = methodVisitor;
                        this.implementationContext = context;
                        this.assigner = assigner;
                        this.argumentHandler = forInstrumentedMethod;
                        this.methodSizeHandler = forInstrumentedMethod2;
                        this.stackMapFrameHandler = forInstrumentedMethod3;
                        this.suppressionHandler = bound;
                        this.classReader = classReader;
                        this.relocationHandler = bound2;
                        this.labels = new ArrayList();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Bound
                    public void prepare() {
                        this.classReader.accept(new ExceptionTableExtractor(), 6);
                        this.suppressionHandler.onPrepare(this.methodVisitor);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Bound
                    public void initialize() {
                        for (Map.Entry<Integer, TypeDefinition> entry : Resolved.this.resolveInitializationTypes(this.argumentHandler).entrySet()) {
                            if (entry.getValue().represents(Boolean.TYPE) || entry.getValue().represents(Byte.TYPE) || entry.getValue().represents(Short.TYPE) || entry.getValue().represents(Character.TYPE) || entry.getValue().represents(Integer.TYPE)) {
                                this.methodVisitor.visitInsn(3);
                                this.methodVisitor.visitVarInsn(54, entry.getKey().intValue());
                            } else if (entry.getValue().represents(Long.TYPE)) {
                                this.methodVisitor.visitInsn(9);
                                this.methodVisitor.visitVarInsn(55, entry.getKey().intValue());
                            } else if (entry.getValue().represents(Float.TYPE)) {
                                this.methodVisitor.visitInsn(11);
                                this.methodVisitor.visitVarInsn(56, entry.getKey().intValue());
                            } else if (entry.getValue().represents(Double.TYPE)) {
                                this.methodVisitor.visitInsn(14);
                                this.methodVisitor.visitVarInsn(57, entry.getKey().intValue());
                            } else {
                                this.methodVisitor.visitInsn(1);
                                this.methodVisitor.visitVarInsn(58, entry.getKey().intValue());
                            }
                            this.methodSizeHandler.requireStackSize(entry.getValue().getStackSize().getSize());
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Bound
                    public void apply() {
                        this.classReader.accept(this, this.stackMapFrameHandler.getReaderHint() | 2);
                    }

                    @Override // org.modelmapper.internal.asm.ClassVisitor
                    public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
                        return (Resolved.this.adviceMethod.getInternalName().equals(str) && Resolved.this.adviceMethod.getDescriptor().equals(str2)) ? new ExceptionTableSubstitutor(Resolved.this.apply(this.methodVisitor, this.implementationContext, this.assigner, this.argumentHandler, this.methodSizeHandler, this.stackMapFrameHandler, this.instrumentedType, this.instrumentedMethod, this.suppressionHandler, this.relocationHandler)) : Dispatcher.IGNORE_METHOD;
                    }

                    protected class ExceptionTableExtractor extends ClassVisitor {
                        protected ExceptionTableExtractor() {
                            super(OpenedClassReader.ASM_API);
                        }

                        @Override // org.modelmapper.internal.asm.ClassVisitor
                        public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
                            if (!Resolved.this.adviceMethod.getInternalName().equals(str) || !Resolved.this.adviceMethod.getDescriptor().equals(str2)) {
                                return Dispatcher.IGNORE_METHOD;
                            }
                            AdviceMethodInliner adviceMethodInliner = AdviceMethodInliner.this;
                            return adviceMethodInliner.new ExceptionTableCollector(adviceMethodInliner.methodVisitor);
                        }
                    }

                    protected class ExceptionTableCollector extends MethodVisitor {
                        private final MethodVisitor methodVisitor;

                        protected ExceptionTableCollector(MethodVisitor methodVisitor) {
                            super(OpenedClassReader.ASM_API);
                            this.methodVisitor = methodVisitor;
                        }

                        @Override // org.modelmapper.internal.asm.MethodVisitor
                        public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
                            this.methodVisitor.visitTryCatchBlock(label, label2, label3, str);
                            AdviceMethodInliner.this.labels.addAll(Arrays.asList(label, label2, label3));
                        }

                        @Override // org.modelmapper.internal.asm.MethodVisitor
                        public AnnotationVisitor visitTryCatchAnnotation(int i, TypePath typePath, String str, boolean z) {
                            return this.methodVisitor.visitTryCatchAnnotation(i, typePath, str, z);
                        }
                    }

                    protected class ExceptionTableSubstitutor extends MethodVisitor {
                        private int index;
                        private final Map<Label, Label> substitutions;

                        protected ExceptionTableSubstitutor(MethodVisitor methodVisitor) {
                            super(OpenedClassReader.ASM_API, methodVisitor);
                            this.substitutions = new IdentityHashMap();
                        }

                        @Override // org.modelmapper.internal.asm.MethodVisitor
                        public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
                            Map<Label, Label> map = this.substitutions;
                            List<Label> list = AdviceMethodInliner.this.labels;
                            int i = this.index;
                            this.index = i + 1;
                            map.put(label, list.get(i));
                            Map<Label, Label> map2 = this.substitutions;
                            List<Label> list2 = AdviceMethodInliner.this.labels;
                            int i2 = this.index;
                            this.index = i2 + 1;
                            map2.put(label2, list2.get(i2));
                            List<Label> list3 = AdviceMethodInliner.this.labels;
                            int i3 = this.index;
                            this.index = i3 + 1;
                            Label label4 = list3.get(i3);
                            this.substitutions.put(label3, label4);
                            ((CodeTranslationVisitor) this.mv).propagateHandler(label4);
                        }

                        @Override // org.modelmapper.internal.asm.MethodVisitor
                        public AnnotationVisitor visitTryCatchAnnotation(int i, TypePath typePath, String str, boolean z) {
                            return Dispatcher.IGNORE_ANNOTATION;
                        }

                        @Override // org.modelmapper.internal.asm.MethodVisitor
                        public void visitLabel(Label label) {
                            super.visitLabel(resolve(label));
                        }

                        @Override // org.modelmapper.internal.asm.MethodVisitor
                        public void visitJumpInsn(int i, Label label) {
                            super.visitJumpInsn(i, resolve(label));
                        }

                        @Override // org.modelmapper.internal.asm.MethodVisitor
                        public void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr) {
                            super.visitTableSwitchInsn(i, i2, label, resolve(labelArr));
                        }

                        @Override // org.modelmapper.internal.asm.MethodVisitor
                        public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
                            super.visitLookupSwitchInsn(resolve(label), iArr, resolve(labelArr));
                        }

                        private Label[] resolve(Label[] labelArr) {
                            Label[] labelArr2 = new Label[labelArr.length];
                            int length = labelArr.length;
                            int i = 0;
                            int i2 = 0;
                            while (i < length) {
                                labelArr2[i2] = resolve(labelArr[i]);
                                i++;
                                i2++;
                            }
                            return labelArr2;
                        }

                        private Label resolve(Label label) {
                            Label label2 = this.substitutions.get(label);
                            return label2 == null ? label : label2;
                        }
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static abstract class ForMethodEnter extends Resolved implements Resolved.ForMethodEnter {
                    private final Map<String, TypeDefinition> namedTypes;
                    private final boolean prependLineNumber;

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved.AbstractBase
                    public boolean equals(Object obj) {
                        if (!super.equals(obj)) {
                            return false;
                        }
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        ForMethodEnter forMethodEnter = (ForMethodEnter) obj;
                        return this.namedTypes.equals(forMethodEnter.namedTypes) && this.prependLineNumber == forMethodEnter.prependLineNumber;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved.AbstractBase
                    public int hashCode() {
                        return (((super.hashCode() * 31) + this.namedTypes.hashCode()) * 31) + (this.prependLineNumber ? 1 : 0);
                    }

                    protected ForMethodEnter(MethodDescription.InDefinedShape inDefinedShape, Map<String, TypeDefinition> map, List<? extends OffsetMapping.Factory<?>> list, TypeDefinition typeDefinition, ClassReader classReader) {
                        super(inDefinedShape, CompoundList.of(Arrays.asList(OffsetMapping.ForArgument.Unresolved.Factory.INSTANCE, OffsetMapping.ForAllArguments.Factory.INSTANCE, OffsetMapping.ForThisReference.Factory.INSTANCE, OffsetMapping.ForField.Unresolved.Factory.INSTANCE, OffsetMapping.ForOrigin.Factory.INSTANCE, OffsetMapping.ForUnusedValue.Factory.INSTANCE, OffsetMapping.ForStubValue.INSTANCE, OffsetMapping.ForThrowable.Factory.INSTANCE, OffsetMapping.ForExitValue.Factory.of(typeDefinition), new OffsetMapping.ForLocalValue.Factory(map), new OffsetMapping.Factory.Illegal(Thrown.class), new OffsetMapping.Factory.Illegal(Enter.class), new OffsetMapping.Factory.Illegal(Return.class)), (List) list), (TypeDescription) inDefinedShape.getDeclaredAnnotations().ofType(OnMethodEnter.class).getValue(Advice.SUPPRESS_ENTER).resolve(TypeDescription.class), (TypeDescription) inDefinedShape.getDeclaredAnnotations().ofType(OnMethodEnter.class).getValue(Advice.SKIP_ON).resolve(TypeDescription.class), classReader);
                        this.namedTypes = map;
                        this.prependLineNumber = ((Boolean) inDefinedShape.getDeclaredAnnotations().ofType(OnMethodEnter.class).getValue(Advice.PREPEND_LINE_NUMBER).resolve(Boolean.class)).booleanValue();
                    }

                    protected static Resolved.ForMethodEnter of(MethodDescription.InDefinedShape inDefinedShape, Map<String, TypeDefinition> map, List<? extends OffsetMapping.Factory<?>> list, TypeDefinition typeDefinition, ClassReader classReader, boolean z) {
                        return z ? new WithRetainedEnterType(inDefinedShape, map, list, typeDefinition, classReader) : new WithDiscardedEnterType(inDefinedShape, map, list, typeDefinition, classReader);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Inlining.Resolved
                    protected Map<Integer, TypeDefinition> resolveInitializationTypes(ArgumentHandler argumentHandler) {
                        TreeMap treeMap = new TreeMap();
                        for (Map.Entry<String, TypeDefinition> entry : this.namedTypes.entrySet()) {
                            treeMap.put(Integer.valueOf(argumentHandler.named(entry.getKey())), entry.getValue());
                        }
                        return treeMap;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved
                    public Bound bind(TypeDescription typeDescription, MethodDescription methodDescription, MethodVisitor methodVisitor, Implementation.Context context, Assigner assigner, ArgumentHandler.ForInstrumentedMethod forInstrumentedMethod, MethodSizeHandler.ForInstrumentedMethod forInstrumentedMethod2, StackMapFrameHandler.ForInstrumentedMethod forInstrumentedMethod3, StackManipulation stackManipulation, RelocationHandler.Relocation relocation) {
                        return new AdviceMethodInliner(typeDescription, methodDescription, methodVisitor, context, assigner, forInstrumentedMethod, forInstrumentedMethod2, forInstrumentedMethod3, this.suppressionHandler.bind(stackManipulation), this.relocationHandler.bind(methodDescription, relocation), this.classReader);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved.ForMethodEnter
                    public boolean isPrependLineNumber() {
                        return this.prependLineNumber;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved.ForMethodEnter
                    public Map<String, TypeDefinition> getNamedTypes() {
                        return this.namedTypes;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Inlining.Resolved
                    protected MethodVisitor apply(MethodVisitor methodVisitor, Implementation.Context context, Assigner assigner, ArgumentHandler.ForInstrumentedMethod forInstrumentedMethod, MethodSizeHandler.ForInstrumentedMethod forInstrumentedMethod2, StackMapFrameHandler.ForInstrumentedMethod forInstrumentedMethod3, TypeDescription typeDescription, MethodDescription methodDescription, SuppressionHandler.Bound bound, RelocationHandler.Bound bound2) {
                        return doApply(methodVisitor, context, assigner, forInstrumentedMethod.bindEnter(this.adviceMethod), forInstrumentedMethod2.bindEnter(this.adviceMethod), forInstrumentedMethod3.bindEnter(this.adviceMethod), typeDescription, methodDescription, bound, bound2);
                    }

                    protected MethodVisitor doApply(MethodVisitor methodVisitor, Implementation.Context context, Assigner assigner, ArgumentHandler.ForAdvice forAdvice, MethodSizeHandler.ForAdvice forAdvice2, StackMapFrameHandler.ForAdvice forAdvice3, TypeDescription typeDescription, MethodDescription methodDescription, SuppressionHandler.Bound bound, RelocationHandler.Bound bound2) {
                        HashMap hashMap = new HashMap();
                        for (Map.Entry<Integer, OffsetMapping> entry : this.offsetMappings.entrySet()) {
                            hashMap.put(entry.getKey(), entry.getValue().resolve(typeDescription, methodDescription, assigner, forAdvice, OffsetMapping.Sort.ENTER));
                        }
                        return new CodeTranslationVisitor.ForMethodEnter(methodVisitor, context, forAdvice, forAdvice2, forAdvice3, methodDescription, this.adviceMethod, hashMap, bound, bound2);
                    }

                    protected static class WithRetainedEnterType extends ForMethodEnter {
                        protected WithRetainedEnterType(MethodDescription.InDefinedShape inDefinedShape, Map<String, TypeDefinition> map, List<? extends OffsetMapping.Factory<?>> list, TypeDefinition typeDefinition, ClassReader classReader) {
                            super(inDefinedShape, map, list, typeDefinition, classReader);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher
                        public TypeDefinition getAdviceType() {
                            return this.adviceMethod.getReturnType();
                        }
                    }

                    protected static class WithDiscardedEnterType extends ForMethodEnter {
                        protected WithDiscardedEnterType(MethodDescription.InDefinedShape inDefinedShape, Map<String, TypeDefinition> map, List<? extends OffsetMapping.Factory<?>> list, TypeDefinition typeDefinition, ClassReader classReader) {
                            super(inDefinedShape, map, list, typeDefinition, classReader);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher
                        public TypeDefinition getAdviceType() {
                            return TypeDescription.VOID;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Inlining.Resolved.ForMethodEnter
                        protected MethodVisitor doApply(MethodVisitor methodVisitor, Implementation.Context context, Assigner assigner, ArgumentHandler.ForAdvice forAdvice, MethodSizeHandler.ForAdvice forAdvice2, StackMapFrameHandler.ForAdvice forAdvice3, TypeDescription typeDescription, MethodDescription methodDescription, SuppressionHandler.Bound bound, RelocationHandler.Bound bound2) {
                            forAdvice2.requireLocalVariableLengthPadding(this.adviceMethod.getReturnType().getStackSize().getSize());
                            return super.doApply(methodVisitor, context, assigner, forAdvice, forAdvice2, forAdvice3, typeDescription, methodDescription, bound, bound2);
                        }
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static abstract class ForMethodExit extends Resolved implements Resolved.ForMethodExit {
                    private final boolean backupArguments;

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved.AbstractBase
                    public boolean equals(Object obj) {
                        if (!super.equals(obj)) {
                            return false;
                        }
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.backupArguments == ((ForMethodExit) obj).backupArguments;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved.AbstractBase
                    public int hashCode() {
                        return (super.hashCode() * 31) + (this.backupArguments ? 1 : 0);
                    }

                    protected ForMethodExit(MethodDescription.InDefinedShape inDefinedShape, Map<String, TypeDefinition> map, List<? extends OffsetMapping.Factory<?>> list, ClassReader classReader, TypeDefinition typeDefinition) {
                        super(inDefinedShape, CompoundList.of(Arrays.asList(OffsetMapping.ForArgument.Unresolved.Factory.INSTANCE, OffsetMapping.ForAllArguments.Factory.INSTANCE, OffsetMapping.ForThisReference.Factory.INSTANCE, OffsetMapping.ForField.Unresolved.Factory.INSTANCE, OffsetMapping.ForOrigin.Factory.INSTANCE, OffsetMapping.ForUnusedValue.Factory.INSTANCE, OffsetMapping.ForStubValue.INSTANCE, OffsetMapping.ForEnterValue.Factory.of(typeDefinition), OffsetMapping.ForExitValue.Factory.of(inDefinedShape.getReturnType()), new OffsetMapping.ForLocalValue.Factory(map), OffsetMapping.ForReturnValue.Factory.INSTANCE, OffsetMapping.ForThrowable.Factory.of(inDefinedShape)), (List) list), (TypeDescription) inDefinedShape.getDeclaredAnnotations().ofType(OnMethodExit.class).getValue(Advice.SUPPRESS_EXIT).resolve(TypeDescription.class), (TypeDescription) inDefinedShape.getDeclaredAnnotations().ofType(OnMethodExit.class).getValue(Advice.REPEAT_ON).resolve(TypeDescription.class), classReader);
                        this.backupArguments = ((Boolean) inDefinedShape.getDeclaredAnnotations().ofType(OnMethodExit.class).getValue(Advice.BACKUP_ARGUMENTS).resolve(Boolean.class)).booleanValue();
                    }

                    protected static Resolved.ForMethodExit of(MethodDescription.InDefinedShape inDefinedShape, Map<String, TypeDefinition> map, List<? extends OffsetMapping.Factory<?>> list, ClassReader classReader, TypeDefinition typeDefinition) {
                        TypeDescription typeDescription = (TypeDescription) inDefinedShape.getDeclaredAnnotations().ofType(OnMethodExit.class).getValue(Advice.ON_THROWABLE).resolve(TypeDescription.class);
                        return typeDescription.represents(NoExceptionHandler.class) ? new WithoutExceptionHandler(inDefinedShape, map, list, classReader, typeDefinition) : new WithExceptionHandler(inDefinedShape, map, list, classReader, typeDefinition, typeDescription);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Inlining.Resolved
                    protected Map<Integer, TypeDefinition> resolveInitializationTypes(ArgumentHandler argumentHandler) {
                        if (this.adviceMethod.getReturnType().represents(Void.TYPE)) {
                            return Collections.emptyMap();
                        }
                        return Collections.singletonMap(Integer.valueOf(argumentHandler.exit()), this.adviceMethod.getReturnType());
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Inlining.Resolved
                    protected MethodVisitor apply(MethodVisitor methodVisitor, Implementation.Context context, Assigner assigner, ArgumentHandler.ForInstrumentedMethod forInstrumentedMethod, MethodSizeHandler.ForInstrumentedMethod forInstrumentedMethod2, StackMapFrameHandler.ForInstrumentedMethod forInstrumentedMethod3, TypeDescription typeDescription, MethodDescription methodDescription, SuppressionHandler.Bound bound, RelocationHandler.Bound bound2) {
                        return doApply(methodVisitor, context, assigner, forInstrumentedMethod.bindExit(this.adviceMethod, getThrowable().represents(NoExceptionHandler.class)), forInstrumentedMethod2.bindExit(this.adviceMethod), forInstrumentedMethod3.bindExit(this.adviceMethod), typeDescription, methodDescription, bound, bound2);
                    }

                    private MethodVisitor doApply(MethodVisitor methodVisitor, Implementation.Context context, Assigner assigner, ArgumentHandler.ForAdvice forAdvice, MethodSizeHandler.ForAdvice forAdvice2, StackMapFrameHandler.ForAdvice forAdvice3, TypeDescription typeDescription, MethodDescription methodDescription, SuppressionHandler.Bound bound, RelocationHandler.Bound bound2) {
                        HashMap hashMap = new HashMap();
                        for (Map.Entry<Integer, OffsetMapping> entry : this.offsetMappings.entrySet()) {
                            hashMap.put(entry.getKey(), entry.getValue().resolve(typeDescription, methodDescription, assigner, forAdvice, OffsetMapping.Sort.EXIT));
                        }
                        return new CodeTranslationVisitor.ForMethodExit(methodVisitor, context, forAdvice, forAdvice2, forAdvice3, methodDescription, this.adviceMethod, hashMap, bound, bound2);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved.ForMethodExit
                    public ArgumentHandler.Factory getArgumentHandlerFactory() {
                        return this.backupArguments ? ArgumentHandler.Factory.COPYING : ArgumentHandler.Factory.SIMPLE;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher
                    public TypeDefinition getAdviceType() {
                        return this.adviceMethod.getReturnType();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved
                    public Bound bind(TypeDescription typeDescription, MethodDescription methodDescription, MethodVisitor methodVisitor, Implementation.Context context, Assigner assigner, ArgumentHandler.ForInstrumentedMethod forInstrumentedMethod, MethodSizeHandler.ForInstrumentedMethod forInstrumentedMethod2, StackMapFrameHandler.ForInstrumentedMethod forInstrumentedMethod3, StackManipulation stackManipulation, RelocationHandler.Relocation relocation) {
                        return new AdviceMethodInliner(typeDescription, methodDescription, methodVisitor, context, assigner, forInstrumentedMethod, forInstrumentedMethod2, forInstrumentedMethod3, this.suppressionHandler.bind(stackManipulation), this.relocationHandler.bind(methodDescription, relocation), this.classReader);
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    protected static class WithExceptionHandler extends ForMethodExit {
                        private final TypeDescription throwable;

                        @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Inlining.Resolved.ForMethodExit, org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved.AbstractBase
                        public boolean equals(Object obj) {
                            if (!super.equals(obj)) {
                                return false;
                            }
                            if (this == obj) {
                                return true;
                            }
                            return obj != null && getClass() == obj.getClass() && this.throwable.equals(((WithExceptionHandler) obj).throwable);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Inlining.Resolved.ForMethodExit, org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved.AbstractBase
                        public int hashCode() {
                            return (super.hashCode() * 31) + this.throwable.hashCode();
                        }

                        protected WithExceptionHandler(MethodDescription.InDefinedShape inDefinedShape, Map<String, TypeDefinition> map, List<? extends OffsetMapping.Factory<?>> list, ClassReader classReader, TypeDefinition typeDefinition, TypeDescription typeDescription) {
                            super(inDefinedShape, map, list, classReader, typeDefinition);
                            this.throwable = typeDescription;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved.ForMethodExit
                        public TypeDescription getThrowable() {
                            return this.throwable;
                        }
                    }

                    protected static class WithoutExceptionHandler extends ForMethodExit {
                        protected WithoutExceptionHandler(MethodDescription.InDefinedShape inDefinedShape, Map<String, TypeDefinition> map, List<? extends OffsetMapping.Factory<?>> list, ClassReader classReader, TypeDefinition typeDefinition) {
                            super(inDefinedShape, map, list, classReader, typeDefinition);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved.ForMethodExit
                        public TypeDescription getThrowable() {
                            return NoExceptionHandler.DESCRIPTION;
                        }
                    }
                }
            }

            protected static abstract class CodeTranslationVisitor extends MethodVisitor {
                protected final MethodDescription.InDefinedShape adviceMethod;
                protected final ArgumentHandler.ForAdvice argumentHandler;
                protected final Label endOfMethod;
                protected final Implementation.Context implementationContext;
                protected final MethodSizeHandler.ForAdvice methodSizeHandler;
                protected final MethodVisitor methodVisitor;
                private final Map<Integer, OffsetMapping.Target> offsetMappings;
                private final RelocationHandler.Bound relocationHandler;
                protected final StackMapFrameHandler.ForAdvice stackMapFrameHandler;
                private final SuppressionHandler.Bound suppressionHandler;

                protected abstract int getReturnValueOffset();

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public void visitAnnotableParameterCount(int i, boolean z) {
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public void visitAttribute(Attribute attribute) {
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public void visitParameter(String str, int i) {
                }

                protected CodeTranslationVisitor(MethodVisitor methodVisitor, Implementation.Context context, ArgumentHandler.ForAdvice forAdvice, MethodSizeHandler.ForAdvice forAdvice2, StackMapFrameHandler.ForAdvice forAdvice3, MethodDescription methodDescription, MethodDescription.InDefinedShape inDefinedShape, Map<Integer, OffsetMapping.Target> map, SuppressionHandler.Bound bound, RelocationHandler.Bound bound2) {
                    super(OpenedClassReader.ASM_API, new StackAwareMethodVisitor(methodVisitor, methodDescription));
                    this.methodVisitor = methodVisitor;
                    this.implementationContext = context;
                    this.argumentHandler = forAdvice;
                    this.methodSizeHandler = forAdvice2;
                    this.stackMapFrameHandler = forAdvice3;
                    this.adviceMethod = inDefinedShape;
                    this.offsetMappings = map;
                    this.suppressionHandler = bound;
                    this.relocationHandler = bound2;
                    this.endOfMethod = new Label();
                }

                protected void propagateHandler(Label label) {
                    ((StackAwareMethodVisitor) this.mv).register(label, Collections.singletonList(StackSize.SINGLE));
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public AnnotationVisitor visitAnnotationDefault() {
                    return Dispatcher.IGNORE_ANNOTATION;
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public AnnotationVisitor visitAnnotation(String str, boolean z) {
                    return Dispatcher.IGNORE_ANNOTATION;
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
                    return Dispatcher.IGNORE_ANNOTATION;
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public AnnotationVisitor visitParameterAnnotation(int i, String str, boolean z) {
                    return Dispatcher.IGNORE_ANNOTATION;
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public void visitCode() {
                    this.suppressionHandler.onStart(this.methodVisitor);
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public void visitFrame(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
                    this.stackMapFrameHandler.translateFrame(this.methodVisitor, i, i2, objArr, i3, objArr2);
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public void visitEnd() {
                    this.suppressionHandler.onEnd(this.methodVisitor, this.implementationContext, this.methodSizeHandler, this.stackMapFrameHandler, this.adviceMethod.getReturnType());
                    this.methodVisitor.visitLabel(this.endOfMethod);
                    if (this.adviceMethod.getReturnType().represents(Boolean.TYPE) || this.adviceMethod.getReturnType().represents(Byte.TYPE) || this.adviceMethod.getReturnType().represents(Short.TYPE) || this.adviceMethod.getReturnType().represents(Character.TYPE) || this.adviceMethod.getReturnType().represents(Integer.TYPE)) {
                        this.stackMapFrameHandler.injectReturnFrame(this.methodVisitor);
                        this.methodVisitor.visitVarInsn(54, getReturnValueOffset());
                    } else if (this.adviceMethod.getReturnType().represents(Long.TYPE)) {
                        this.stackMapFrameHandler.injectReturnFrame(this.methodVisitor);
                        this.methodVisitor.visitVarInsn(55, getReturnValueOffset());
                    } else if (this.adviceMethod.getReturnType().represents(Float.TYPE)) {
                        this.stackMapFrameHandler.injectReturnFrame(this.methodVisitor);
                        this.methodVisitor.visitVarInsn(56, getReturnValueOffset());
                    } else if (this.adviceMethod.getReturnType().represents(Double.TYPE)) {
                        this.stackMapFrameHandler.injectReturnFrame(this.methodVisitor);
                        this.methodVisitor.visitVarInsn(57, getReturnValueOffset());
                    } else if (!this.adviceMethod.getReturnType().represents(Void.TYPE)) {
                        this.stackMapFrameHandler.injectReturnFrame(this.methodVisitor);
                        this.methodVisitor.visitVarInsn(58, getReturnValueOffset());
                    }
                    this.methodSizeHandler.requireStackSize(this.relocationHandler.apply(this.methodVisitor, getReturnValueOffset()));
                    this.stackMapFrameHandler.injectCompletionFrame(this.methodVisitor);
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public void visitMaxs(int i, int i2) {
                    this.methodSizeHandler.recordMaxima(i, i2);
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public void visitVarInsn(int i, int i2) {
                    StackManipulation resolveRead;
                    StackSize stackSize;
                    OffsetMapping.Target target = this.offsetMappings.get(Integer.valueOf(i2));
                    if (target != null) {
                        switch (i) {
                            case 21:
                            case 23:
                            case 25:
                                resolveRead = target.resolveRead();
                                stackSize = StackSize.SINGLE;
                                break;
                            case 22:
                            case 24:
                                resolveRead = target.resolveRead();
                                stackSize = StackSize.DOUBLE;
                                break;
                            default:
                                switch (i) {
                                    case 54:
                                    case 55:
                                    case 56:
                                    case 57:
                                    case 58:
                                        resolveRead = target.resolveWrite();
                                        stackSize = StackSize.ZERO;
                                        break;
                                    default:
                                        throw new IllegalStateException("Unexpected opcode: " + i);
                                }
                        }
                        this.methodSizeHandler.requireStackSizePadding(resolveRead.apply(this.mv, this.implementationContext).getMaximalSize() - stackSize.getSize());
                        return;
                    }
                    this.mv.visitVarInsn(i, this.argumentHandler.mapped(i2));
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public void visitIincInsn(int i, int i2) {
                    OffsetMapping.Target target = this.offsetMappings.get(Integer.valueOf(i));
                    if (target != null) {
                        this.methodSizeHandler.requireStackSizePadding(target.resolveIncrement(i2).apply(this.mv, this.implementationContext).getMaximalSize());
                    } else {
                        this.mv.visitIincInsn(this.argumentHandler.mapped(i), i2);
                    }
                }

                @Override // org.modelmapper.internal.asm.MethodVisitor
                public void visitInsn(int i) {
                    switch (i) {
                        case 172:
                            this.methodSizeHandler.requireLocalVariableLength(((StackAwareMethodVisitor) this.mv).drainStack(54, 21, StackSize.SINGLE));
                            break;
                        case 173:
                            this.methodSizeHandler.requireLocalVariableLength(((StackAwareMethodVisitor) this.mv).drainStack(55, 22, StackSize.DOUBLE));
                            break;
                        case Opcodes.FRETURN /* 174 */:
                            this.methodSizeHandler.requireLocalVariableLength(((StackAwareMethodVisitor) this.mv).drainStack(56, 23, StackSize.SINGLE));
                            break;
                        case Opcodes.DRETURN /* 175 */:
                            this.methodSizeHandler.requireLocalVariableLength(((StackAwareMethodVisitor) this.mv).drainStack(57, 24, StackSize.DOUBLE));
                            break;
                        case Opcodes.ARETURN /* 176 */:
                            this.methodSizeHandler.requireLocalVariableLength(((StackAwareMethodVisitor) this.mv).drainStack(58, 25, StackSize.SINGLE));
                            break;
                        case Opcodes.RETURN /* 177 */:
                            ((StackAwareMethodVisitor) this.mv).drainStack();
                            break;
                        default:
                            this.mv.visitInsn(i);
                            return;
                    }
                    this.mv.visitJumpInsn(Opcodes.GOTO, this.endOfMethod);
                }

                protected static class ForMethodEnter extends CodeTranslationVisitor {
                    protected ForMethodEnter(MethodVisitor methodVisitor, Implementation.Context context, ArgumentHandler.ForAdvice forAdvice, MethodSizeHandler.ForAdvice forAdvice2, StackMapFrameHandler.ForAdvice forAdvice3, MethodDescription methodDescription, MethodDescription.InDefinedShape inDefinedShape, Map<Integer, OffsetMapping.Target> map, SuppressionHandler.Bound bound, RelocationHandler.Bound bound2) {
                        super(methodVisitor, context, forAdvice, forAdvice2, forAdvice3, methodDescription, inDefinedShape, map, bound, bound2);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Inlining.CodeTranslationVisitor
                    protected int getReturnValueOffset() {
                        return this.argumentHandler.enter();
                    }
                }

                protected static class ForMethodExit extends CodeTranslationVisitor {
                    protected ForMethodExit(MethodVisitor methodVisitor, Implementation.Context context, ArgumentHandler.ForAdvice forAdvice, MethodSizeHandler.ForAdvice forAdvice2, StackMapFrameHandler.ForAdvice forAdvice3, MethodDescription methodDescription, MethodDescription.InDefinedShape inDefinedShape, Map<Integer, OffsetMapping.Target> map, SuppressionHandler.Bound bound, RelocationHandler.Bound bound2) {
                        super(methodVisitor, context, forAdvice, forAdvice2, forAdvice3, methodDescription, inDefinedShape, map, bound, bound2);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Inlining.CodeTranslationVisitor
                    protected int getReturnValueOffset() {
                        return this.argumentHandler.exit();
                    }
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Delegating implements Unresolved {
            protected final MethodDescription.InDefinedShape adviceMethod;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.adviceMethod.equals(((Delegating) obj).adviceMethod);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.adviceMethod.hashCode();
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher
            public boolean isAlive() {
                return true;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Unresolved
            public boolean isBinary() {
                return false;
            }

            protected Delegating(MethodDescription.InDefinedShape inDefinedShape) {
                this.adviceMethod = inDefinedShape;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher
            public TypeDescription getAdviceType() {
                return this.adviceMethod.getReturnType().asErasure();
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Unresolved
            public Map<String, TypeDefinition> getNamedTypes() {
                return Collections.emptyMap();
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Unresolved
            public Resolved.ForMethodEnter asMethodEnter(List<? extends OffsetMapping.Factory<?>> list, ClassReader classReader, Unresolved unresolved) {
                return Resolved.ForMethodEnter.of(this.adviceMethod, list, unresolved.getAdviceType(), unresolved.isAlive());
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Unresolved
            public Resolved.ForMethodExit asMethodExit(List<? extends OffsetMapping.Factory<?>> list, ClassReader classReader, Unresolved unresolved) {
                Map<String, TypeDefinition> namedTypes = unresolved.getNamedTypes();
                for (ParameterDescription parameterDescription : this.adviceMethod.getParameters().filter(ElementMatchers.isAnnotatedWith((Class<? extends Annotation>) Local.class))) {
                    String value = ((Local) parameterDescription.getDeclaredAnnotations().ofType(Local.class).loadSilent()).value();
                    TypeDefinition typeDefinition = namedTypes.get(value);
                    if (typeDefinition == null) {
                        throw new IllegalStateException(this.adviceMethod + " attempts use of undeclared local variable " + value);
                    }
                    if (!typeDefinition.equals(parameterDescription.getType())) {
                        throw new IllegalStateException(this.adviceMethod + " does not read variable " + value + " as " + typeDefinition);
                    }
                }
                return Resolved.ForMethodExit.of(this.adviceMethod, namedTypes, list, unresolved.getAdviceType());
            }

            protected static abstract class Resolved extends Resolved.AbstractBase {
                protected abstract Bound resolve(TypeDescription typeDescription, MethodDescription methodDescription, MethodVisitor methodVisitor, Implementation.Context context, Assigner assigner, ArgumentHandler.ForInstrumentedMethod forInstrumentedMethod, MethodSizeHandler.ForInstrumentedMethod forInstrumentedMethod2, StackMapFrameHandler.ForInstrumentedMethod forInstrumentedMethod3, StackManipulation stackManipulation, RelocationHandler.Relocation relocation);

                protected Resolved(MethodDescription.InDefinedShape inDefinedShape, List<? extends OffsetMapping.Factory<?>> list, TypeDescription typeDescription, TypeDescription typeDescription2) {
                    super(inDefinedShape, list, typeDescription, typeDescription2, OffsetMapping.Factory.AdviceType.DELEGATION);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved
                public Bound bind(TypeDescription typeDescription, MethodDescription methodDescription, MethodVisitor methodVisitor, Implementation.Context context, Assigner assigner, ArgumentHandler.ForInstrumentedMethod forInstrumentedMethod, MethodSizeHandler.ForInstrumentedMethod forInstrumentedMethod2, StackMapFrameHandler.ForInstrumentedMethod forInstrumentedMethod3, StackManipulation stackManipulation, RelocationHandler.Relocation relocation) {
                    if (!this.adviceMethod.isVisibleTo(typeDescription)) {
                        throw new IllegalStateException(this.adviceMethod + " is not visible to " + methodDescription.getDeclaringType());
                    }
                    return resolve(typeDescription, methodDescription, methodVisitor, context, assigner, forInstrumentedMethod, forInstrumentedMethod2, forInstrumentedMethod3, stackManipulation, relocation);
                }

                protected static abstract class AdviceMethodWriter implements Bound {
                    private static final int EMPTY = 0;
                    protected final MethodDescription.InDefinedShape adviceMethod;
                    protected final ArgumentHandler.ForAdvice argumentHandler;
                    protected final Implementation.Context implementationContext;
                    protected final MethodSizeHandler.ForAdvice methodSizeHandler;
                    protected final MethodVisitor methodVisitor;
                    private final List<OffsetMapping.Target> offsetMappings;
                    private final RelocationHandler.Bound relocationHandler;
                    protected final StackMapFrameHandler.ForAdvice stackMapFrameHandler;
                    private final SuppressionHandler.Bound suppressionHandler;

                    protected abstract int getReturnValueOffset();

                    protected AdviceMethodWriter(MethodDescription.InDefinedShape inDefinedShape, List<OffsetMapping.Target> list, MethodVisitor methodVisitor, Implementation.Context context, ArgumentHandler.ForAdvice forAdvice, MethodSizeHandler.ForAdvice forAdvice2, StackMapFrameHandler.ForAdvice forAdvice3, SuppressionHandler.Bound bound, RelocationHandler.Bound bound2) {
                        this.adviceMethod = inDefinedShape;
                        this.offsetMappings = list;
                        this.methodVisitor = methodVisitor;
                        this.implementationContext = context;
                        this.argumentHandler = forAdvice;
                        this.methodSizeHandler = forAdvice2;
                        this.stackMapFrameHandler = forAdvice3;
                        this.suppressionHandler = bound;
                        this.relocationHandler = bound2;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Bound
                    public void prepare() {
                        this.suppressionHandler.onPrepare(this.methodVisitor);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Bound
                    public void apply() {
                        this.suppressionHandler.onStart(this.methodVisitor);
                        int i = 0;
                        int i2 = 0;
                        int i3 = 0;
                        for (OffsetMapping.Target target : this.offsetMappings) {
                            i += ((ParameterDescription.InDefinedShape) this.adviceMethod.getParameters().get(i2)).getType().getStackSize().getSize();
                            i3 = Math.max(i3, target.resolveRead().apply(this.methodVisitor, this.implementationContext).getMaximalSize() + i);
                            i2++;
                        }
                        this.methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, this.adviceMethod.getDeclaringType().getInternalName(), this.adviceMethod.getInternalName(), this.adviceMethod.getDescriptor(), false);
                        this.suppressionHandler.onEndWithSkip(this.methodVisitor, this.implementationContext, this.methodSizeHandler, this.stackMapFrameHandler, this.adviceMethod.getReturnType());
                        if (this.adviceMethod.getReturnType().represents(Boolean.TYPE) || this.adviceMethod.getReturnType().represents(Byte.TYPE) || this.adviceMethod.getReturnType().represents(Short.TYPE) || this.adviceMethod.getReturnType().represents(Character.TYPE) || this.adviceMethod.getReturnType().represents(Integer.TYPE)) {
                            this.methodVisitor.visitVarInsn(54, getReturnValueOffset());
                        } else if (this.adviceMethod.getReturnType().represents(Long.TYPE)) {
                            this.methodVisitor.visitVarInsn(55, getReturnValueOffset());
                        } else if (this.adviceMethod.getReturnType().represents(Float.TYPE)) {
                            this.methodVisitor.visitVarInsn(56, getReturnValueOffset());
                        } else if (this.adviceMethod.getReturnType().represents(Double.TYPE)) {
                            this.methodVisitor.visitVarInsn(57, getReturnValueOffset());
                        } else if (!this.adviceMethod.getReturnType().represents(Void.TYPE)) {
                            this.methodVisitor.visitVarInsn(58, getReturnValueOffset());
                        }
                        this.methodSizeHandler.requireStackSize(this.relocationHandler.apply(this.methodVisitor, getReturnValueOffset()));
                        this.stackMapFrameHandler.injectCompletionFrame(this.methodVisitor);
                        this.methodSizeHandler.recordMaxima(Math.max(i3, this.adviceMethod.getReturnType().getStackSize().getSize()), 0);
                    }

                    protected static class ForMethodEnter extends AdviceMethodWriter {
                        @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Bound
                        public void initialize() {
                        }

                        protected ForMethodEnter(MethodDescription.InDefinedShape inDefinedShape, List<OffsetMapping.Target> list, MethodVisitor methodVisitor, Implementation.Context context, ArgumentHandler.ForAdvice forAdvice, MethodSizeHandler.ForAdvice forAdvice2, StackMapFrameHandler.ForAdvice forAdvice3, SuppressionHandler.Bound bound, RelocationHandler.Bound bound2) {
                            super(inDefinedShape, list, methodVisitor, context, forAdvice, forAdvice2, forAdvice3, bound, bound2);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Delegating.Resolved.AdviceMethodWriter
                        protected int getReturnValueOffset() {
                            return this.argumentHandler.enter();
                        }
                    }

                    protected static class ForMethodExit extends AdviceMethodWriter {
                        protected ForMethodExit(MethodDescription.InDefinedShape inDefinedShape, List<OffsetMapping.Target> list, MethodVisitor methodVisitor, Implementation.Context context, ArgumentHandler.ForAdvice forAdvice, MethodSizeHandler.ForAdvice forAdvice2, StackMapFrameHandler.ForAdvice forAdvice3, SuppressionHandler.Bound bound, RelocationHandler.Bound bound2) {
                            super(inDefinedShape, list, methodVisitor, context, forAdvice, forAdvice2, forAdvice3, bound, bound2);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Bound
                        public void initialize() {
                            if (this.adviceMethod.getReturnType().represents(Boolean.TYPE) || this.adviceMethod.getReturnType().represents(Byte.TYPE) || this.adviceMethod.getReturnType().represents(Short.TYPE) || this.adviceMethod.getReturnType().represents(Character.TYPE) || this.adviceMethod.getReturnType().represents(Integer.TYPE)) {
                                this.methodVisitor.visitInsn(3);
                                this.methodVisitor.visitVarInsn(54, this.argumentHandler.exit());
                            } else if (this.adviceMethod.getReturnType().represents(Long.TYPE)) {
                                this.methodVisitor.visitInsn(9);
                                this.methodVisitor.visitVarInsn(55, this.argumentHandler.exit());
                            } else if (this.adviceMethod.getReturnType().represents(Float.TYPE)) {
                                this.methodVisitor.visitInsn(11);
                                this.methodVisitor.visitVarInsn(56, this.argumentHandler.exit());
                            } else if (this.adviceMethod.getReturnType().represents(Double.TYPE)) {
                                this.methodVisitor.visitInsn(14);
                                this.methodVisitor.visitVarInsn(57, this.argumentHandler.exit());
                            } else if (!this.adviceMethod.getReturnType().represents(Void.TYPE)) {
                                this.methodVisitor.visitInsn(1);
                                this.methodVisitor.visitVarInsn(58, this.argumentHandler.exit());
                            }
                            this.methodSizeHandler.requireStackSize(this.adviceMethod.getReturnType().getStackSize().getSize());
                        }

                        @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Delegating.Resolved.AdviceMethodWriter
                        protected int getReturnValueOffset() {
                            return this.argumentHandler.exit();
                        }
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static abstract class ForMethodEnter extends Resolved implements Resolved.ForMethodEnter {
                    private final boolean prependLineNumber;

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved.AbstractBase
                    public boolean equals(Object obj) {
                        if (!super.equals(obj)) {
                            return false;
                        }
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.prependLineNumber == ((ForMethodEnter) obj).prependLineNumber;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved.AbstractBase
                    public int hashCode() {
                        return (super.hashCode() * 31) + (this.prependLineNumber ? 1 : 0);
                    }

                    protected ForMethodEnter(MethodDescription.InDefinedShape inDefinedShape, List<? extends OffsetMapping.Factory<?>> list, TypeDefinition typeDefinition) {
                        super(inDefinedShape, CompoundList.of(Arrays.asList(OffsetMapping.ForArgument.Unresolved.Factory.INSTANCE, OffsetMapping.ForAllArguments.Factory.INSTANCE, OffsetMapping.ForThisReference.Factory.INSTANCE, OffsetMapping.ForField.Unresolved.Factory.INSTANCE, OffsetMapping.ForOrigin.Factory.INSTANCE, OffsetMapping.ForUnusedValue.Factory.INSTANCE, OffsetMapping.ForStubValue.INSTANCE, OffsetMapping.ForExitValue.Factory.of(typeDefinition), new OffsetMapping.Factory.Illegal(Thrown.class), new OffsetMapping.Factory.Illegal(Enter.class), new OffsetMapping.Factory.Illegal(Local.class), new OffsetMapping.Factory.Illegal(Return.class)), (List) list), (TypeDescription) inDefinedShape.getDeclaredAnnotations().ofType(OnMethodEnter.class).getValue(Advice.SUPPRESS_ENTER).resolve(TypeDescription.class), (TypeDescription) inDefinedShape.getDeclaredAnnotations().ofType(OnMethodEnter.class).getValue(Advice.SKIP_ON).resolve(TypeDescription.class));
                        this.prependLineNumber = ((Boolean) inDefinedShape.getDeclaredAnnotations().ofType(OnMethodEnter.class).getValue(Advice.PREPEND_LINE_NUMBER).resolve(Boolean.class)).booleanValue();
                    }

                    protected static Resolved.ForMethodEnter of(MethodDescription.InDefinedShape inDefinedShape, List<? extends OffsetMapping.Factory<?>> list, TypeDefinition typeDefinition, boolean z) {
                        return z ? new WithRetainedEnterType(inDefinedShape, list, typeDefinition) : new WithDiscardedEnterType(inDefinedShape, list, typeDefinition);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved.ForMethodEnter
                    public boolean isPrependLineNumber() {
                        return this.prependLineNumber;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved.ForMethodEnter
                    public Map<String, TypeDefinition> getNamedTypes() {
                        return Collections.emptyMap();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Delegating.Resolved
                    protected Bound resolve(TypeDescription typeDescription, MethodDescription methodDescription, MethodVisitor methodVisitor, Implementation.Context context, Assigner assigner, ArgumentHandler.ForInstrumentedMethod forInstrumentedMethod, MethodSizeHandler.ForInstrumentedMethod forInstrumentedMethod2, StackMapFrameHandler.ForInstrumentedMethod forInstrumentedMethod3, StackManipulation stackManipulation, RelocationHandler.Relocation relocation) {
                        return doResolve(typeDescription, methodDescription, methodVisitor, context, assigner, forInstrumentedMethod.bindEnter(this.adviceMethod), forInstrumentedMethod2.bindEnter(this.adviceMethod), forInstrumentedMethod3.bindEnter(this.adviceMethod), this.suppressionHandler.bind(stackManipulation), this.relocationHandler.bind(methodDescription, relocation));
                    }

                    protected Bound doResolve(TypeDescription typeDescription, MethodDescription methodDescription, MethodVisitor methodVisitor, Implementation.Context context, Assigner assigner, ArgumentHandler.ForAdvice forAdvice, MethodSizeHandler.ForAdvice forAdvice2, StackMapFrameHandler.ForAdvice forAdvice3, SuppressionHandler.Bound bound, RelocationHandler.Bound bound2) {
                        ArrayList arrayList = new ArrayList(this.offsetMappings.size());
                        Iterator<OffsetMapping> it = this.offsetMappings.values().iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().resolve(typeDescription, methodDescription, assigner, forAdvice, OffsetMapping.Sort.ENTER));
                        }
                        return new AdviceMethodWriter.ForMethodEnter(this.adviceMethod, arrayList, methodVisitor, context, forAdvice, forAdvice2, forAdvice3, bound, bound2);
                    }

                    protected static class WithRetainedEnterType extends ForMethodEnter {
                        protected WithRetainedEnterType(MethodDescription.InDefinedShape inDefinedShape, List<? extends OffsetMapping.Factory<?>> list, TypeDefinition typeDefinition) {
                            super(inDefinedShape, list, typeDefinition);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher
                        public TypeDefinition getAdviceType() {
                            return this.adviceMethod.getReturnType();
                        }
                    }

                    protected static class WithDiscardedEnterType extends ForMethodEnter {
                        protected WithDiscardedEnterType(MethodDescription.InDefinedShape inDefinedShape, List<? extends OffsetMapping.Factory<?>> list, TypeDefinition typeDefinition) {
                            super(inDefinedShape, list, typeDefinition);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher
                        public TypeDefinition getAdviceType() {
                            return TypeDescription.VOID;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Delegating.Resolved.ForMethodEnter
                        protected Bound doResolve(TypeDescription typeDescription, MethodDescription methodDescription, MethodVisitor methodVisitor, Implementation.Context context, Assigner assigner, ArgumentHandler.ForAdvice forAdvice, MethodSizeHandler.ForAdvice forAdvice2, StackMapFrameHandler.ForAdvice forAdvice3, SuppressionHandler.Bound bound, RelocationHandler.Bound bound2) {
                            forAdvice2.requireLocalVariableLengthPadding(this.adviceMethod.getReturnType().getStackSize().getSize());
                            return super.doResolve(typeDescription, methodDescription, methodVisitor, context, assigner, forAdvice, forAdvice2, forAdvice3, bound, bound2);
                        }
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static abstract class ForMethodExit extends Resolved implements Resolved.ForMethodExit {
                    private final boolean backupArguments;

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved.AbstractBase
                    public boolean equals(Object obj) {
                        if (!super.equals(obj)) {
                            return false;
                        }
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.backupArguments == ((ForMethodExit) obj).backupArguments;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved.AbstractBase
                    public int hashCode() {
                        return (super.hashCode() * 31) + (this.backupArguments ? 1 : 0);
                    }

                    protected ForMethodExit(MethodDescription.InDefinedShape inDefinedShape, Map<String, TypeDefinition> map, List<? extends OffsetMapping.Factory<?>> list, TypeDefinition typeDefinition) {
                        super(inDefinedShape, CompoundList.of(Arrays.asList(OffsetMapping.ForArgument.Unresolved.Factory.INSTANCE, OffsetMapping.ForAllArguments.Factory.INSTANCE, OffsetMapping.ForThisReference.Factory.INSTANCE, OffsetMapping.ForField.Unresolved.Factory.INSTANCE, OffsetMapping.ForOrigin.Factory.INSTANCE, OffsetMapping.ForUnusedValue.Factory.INSTANCE, OffsetMapping.ForStubValue.INSTANCE, OffsetMapping.ForEnterValue.Factory.of(typeDefinition), OffsetMapping.ForExitValue.Factory.of(inDefinedShape.getReturnType()), new OffsetMapping.ForLocalValue.Factory(map), OffsetMapping.ForReturnValue.Factory.INSTANCE, OffsetMapping.ForThrowable.Factory.of(inDefinedShape)), (List) list), (TypeDescription) inDefinedShape.getDeclaredAnnotations().ofType(OnMethodExit.class).getValue(Advice.SUPPRESS_EXIT).resolve(TypeDescription.class), (TypeDescription) inDefinedShape.getDeclaredAnnotations().ofType(OnMethodExit.class).getValue(Advice.REPEAT_ON).resolve(TypeDescription.class));
                        this.backupArguments = ((Boolean) inDefinedShape.getDeclaredAnnotations().ofType(OnMethodExit.class).getValue(Advice.BACKUP_ARGUMENTS).resolve(Boolean.class)).booleanValue();
                    }

                    protected static Resolved.ForMethodExit of(MethodDescription.InDefinedShape inDefinedShape, Map<String, TypeDefinition> map, List<? extends OffsetMapping.Factory<?>> list, TypeDefinition typeDefinition) {
                        TypeDescription typeDescription = (TypeDescription) inDefinedShape.getDeclaredAnnotations().ofType(OnMethodExit.class).getValue(Advice.ON_THROWABLE).resolve(TypeDescription.class);
                        return typeDescription.represents(NoExceptionHandler.class) ? new WithoutExceptionHandler(inDefinedShape, map, list, typeDefinition) : new WithExceptionHandler(inDefinedShape, map, list, typeDefinition, typeDescription);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Delegating.Resolved
                    protected Bound resolve(TypeDescription typeDescription, MethodDescription methodDescription, MethodVisitor methodVisitor, Implementation.Context context, Assigner assigner, ArgumentHandler.ForInstrumentedMethod forInstrumentedMethod, MethodSizeHandler.ForInstrumentedMethod forInstrumentedMethod2, StackMapFrameHandler.ForInstrumentedMethod forInstrumentedMethod3, StackManipulation stackManipulation, RelocationHandler.Relocation relocation) {
                        return doResolve(typeDescription, methodDescription, methodVisitor, context, assigner, forInstrumentedMethod.bindExit(this.adviceMethod, getThrowable().represents(NoExceptionHandler.class)), forInstrumentedMethod2.bindExit(this.adviceMethod), forInstrumentedMethod3.bindExit(this.adviceMethod), this.suppressionHandler.bind(stackManipulation), this.relocationHandler.bind(methodDescription, relocation));
                    }

                    private Bound doResolve(TypeDescription typeDescription, MethodDescription methodDescription, MethodVisitor methodVisitor, Implementation.Context context, Assigner assigner, ArgumentHandler.ForAdvice forAdvice, MethodSizeHandler.ForAdvice forAdvice2, StackMapFrameHandler.ForAdvice forAdvice3, SuppressionHandler.Bound bound, RelocationHandler.Bound bound2) {
                        ArrayList arrayList = new ArrayList(this.offsetMappings.size());
                        Iterator<OffsetMapping> it = this.offsetMappings.values().iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().resolve(typeDescription, methodDescription, assigner, forAdvice, OffsetMapping.Sort.EXIT));
                        }
                        return new AdviceMethodWriter.ForMethodExit(this.adviceMethod, arrayList, methodVisitor, context, forAdvice, forAdvice2, forAdvice3, bound, bound2);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved.ForMethodExit
                    public ArgumentHandler.Factory getArgumentHandlerFactory() {
                        return this.backupArguments ? ArgumentHandler.Factory.COPYING : ArgumentHandler.Factory.SIMPLE;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher
                    public TypeDefinition getAdviceType() {
                        return this.adviceMethod.getReturnType();
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    protected static class WithExceptionHandler extends ForMethodExit {
                        private final TypeDescription throwable;

                        @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Delegating.Resolved.ForMethodExit, org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved.AbstractBase
                        public boolean equals(Object obj) {
                            if (!super.equals(obj)) {
                                return false;
                            }
                            if (this == obj) {
                                return true;
                            }
                            return obj != null && getClass() == obj.getClass() && this.throwable.equals(((WithExceptionHandler) obj).throwable);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Delegating.Resolved.ForMethodExit, org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved.AbstractBase
                        public int hashCode() {
                            return (super.hashCode() * 31) + this.throwable.hashCode();
                        }

                        protected WithExceptionHandler(MethodDescription.InDefinedShape inDefinedShape, Map<String, TypeDefinition> map, List<? extends OffsetMapping.Factory<?>> list, TypeDefinition typeDefinition, TypeDescription typeDescription) {
                            super(inDefinedShape, map, list, typeDefinition);
                            this.throwable = typeDescription;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved.ForMethodExit
                        public TypeDescription getThrowable() {
                            return this.throwable;
                        }
                    }

                    protected static class WithoutExceptionHandler extends ForMethodExit {
                        protected WithoutExceptionHandler(MethodDescription.InDefinedShape inDefinedShape, Map<String, TypeDefinition> map, List<? extends OffsetMapping.Factory<?>> list, TypeDefinition typeDefinition) {
                            super(inDefinedShape, map, list, typeDefinition);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.Resolved.ForMethodExit
                        public TypeDescription getThrowable() {
                            return NoExceptionHandler.DESCRIPTION;
                        }
                    }
                }
            }
        }
    }

    protected static abstract class AdviceVisitor extends ExceptionTableSensitiveMethodVisitor implements Dispatcher.RelocationHandler.Relocation {
        protected final ArgumentHandler.ForInstrumentedMethod argumentHandler;
        protected final MethodDescription instrumentedMethod;
        private final Dispatcher.Bound methodEnter;
        protected final Dispatcher.Bound methodExit;
        protected final MethodSizeHandler.ForInstrumentedMethod methodSizeHandler;
        protected final MethodVisitor methodVisitor;
        private final Label preparationStart;
        protected final StackMapFrameHandler.ForInstrumentedMethod stackMapFrameHandler;

        protected abstract void onUserEnd();

        protected abstract void onUserPrepare();

        protected abstract void onUserStart();

        protected AdviceVisitor(MethodVisitor methodVisitor, MethodVisitor methodVisitor2, Implementation.Context context, Assigner assigner, StackManipulation stackManipulation, TypeDescription typeDescription, MethodDescription methodDescription, Dispatcher.Resolved.ForMethodEnter forMethodEnter, Dispatcher.Resolved.ForMethodExit forMethodExit, List<? extends TypeDescription> list, int i, int i2) {
            super(OpenedClassReader.ASM_API, methodVisitor2);
            List singletonList;
            List singletonList2;
            this.methodVisitor = methodVisitor;
            this.instrumentedMethod = methodDescription;
            Label label = new Label();
            this.preparationStart = label;
            ArgumentHandler.ForInstrumentedMethod resolve = forMethodExit.getArgumentHandlerFactory().resolve(methodDescription, forMethodEnter.getAdviceType(), forMethodExit.getAdviceType(), forMethodEnter.getNamedTypes());
            this.argumentHandler = resolve;
            if (forMethodExit.getAdviceType().represents(Void.TYPE)) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(forMethodExit.getAdviceType().asErasure());
            }
            List of = CompoundList.of(singletonList, (List) resolve.getNamedTypes());
            if (forMethodEnter.getAdviceType().represents(Void.TYPE)) {
                singletonList2 = Collections.emptyList();
            } else {
                singletonList2 = Collections.singletonList(forMethodEnter.getAdviceType().asErasure());
            }
            List list2 = singletonList2;
            MethodSizeHandler.ForInstrumentedMethod of2 = MethodSizeHandler.Default.of(methodDescription, of, list2, list, resolve.isCopyingArguments(), i);
            this.methodSizeHandler = of2;
            StackMapFrameHandler.ForInstrumentedMethod of3 = StackMapFrameHandler.Default.of(typeDescription, methodDescription, of, list2, list, forMethodExit.isAlive(), resolve.isCopyingArguments(), context.getClassFileVersion(), i, i2);
            this.stackMapFrameHandler = of3;
            this.methodEnter = forMethodEnter.bind(typeDescription, methodDescription, methodVisitor, context, assigner, resolve, of2, of3, stackManipulation, this);
            this.methodExit = forMethodExit.bind(typeDescription, methodDescription, methodVisitor, context, assigner, resolve, of2, of3, stackManipulation, new Dispatcher.RelocationHandler.Relocation.ForLabel(label));
        }

        @Override // org.modelmapper.internal.bytebuddy.utility.visitor.ExceptionTableSensitiveMethodVisitor
        protected void onAfterExceptionTable() {
            this.methodEnter.prepare();
            onUserPrepare();
            this.methodExit.prepare();
            this.methodEnter.initialize();
            this.methodExit.initialize();
            this.stackMapFrameHandler.injectInitializationFrame(this.methodVisitor);
            this.methodEnter.apply();
            this.methodVisitor.visitLabel(this.preparationStart);
            this.methodSizeHandler.requireStackSize(this.argumentHandler.prepare(this.methodVisitor));
            this.stackMapFrameHandler.injectStartFrame(this.methodVisitor);
            onUserStart();
        }

        @Override // org.modelmapper.internal.bytebuddy.utility.visitor.ExceptionTableSensitiveMethodVisitor
        protected void onVisitVarInsn(int i, int i2) {
            this.mv.visitVarInsn(i, this.argumentHandler.argument(i2));
        }

        @Override // org.modelmapper.internal.bytebuddy.utility.visitor.ExceptionTableSensitiveMethodVisitor
        protected void onVisitIincInsn(int i, int i2) {
            this.mv.visitIincInsn(this.argumentHandler.argument(i), i2);
        }

        @Override // org.modelmapper.internal.asm.MethodVisitor
        public void visitFrame(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
            this.stackMapFrameHandler.translateFrame(this.methodVisitor, i, i2, objArr, i3, objArr2);
        }

        @Override // org.modelmapper.internal.asm.MethodVisitor
        public void visitMaxs(int i, int i2) {
            onUserEnd();
            this.methodVisitor.visitMaxs(this.methodSizeHandler.compoundStackSize(i), this.methodSizeHandler.compoundLocalVariableLength(i2));
        }

        @Override // org.modelmapper.internal.asm.MethodVisitor
        public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i) {
            this.mv.visitLocalVariable(str, str2, str3, label, label2, this.argumentHandler.variable(i));
        }

        @Override // org.modelmapper.internal.asm.MethodVisitor
        public AnnotationVisitor visitLocalVariableAnnotation(int i, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z) {
            int[] iArr2 = new int[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                iArr2[i2] = this.argumentHandler.variable(iArr[i2]);
            }
            return this.mv.visitLocalVariableAnnotation(i, typePath, labelArr, labelArr2, iArr2, str, z);
        }

        protected static class WithoutExitAdvice extends AdviceVisitor {
            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.AdviceVisitor
            protected void onUserEnd() {
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.AdviceVisitor
            protected void onUserPrepare() {
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.AdviceVisitor
            protected void onUserStart() {
            }

            protected WithoutExitAdvice(MethodVisitor methodVisitor, Implementation.Context context, Assigner assigner, StackManipulation stackManipulation, TypeDescription typeDescription, MethodDescription methodDescription, Dispatcher.Resolved.ForMethodEnter forMethodEnter, int i, int i2) {
                super(methodVisitor, methodVisitor, context, assigner, stackManipulation, typeDescription, methodDescription, forMethodEnter, Dispatcher.Inactive.INSTANCE, Collections.emptyList(), i, i2);
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.RelocationHandler.Relocation
            public void apply(MethodVisitor methodVisitor) {
                if (this.instrumentedMethod.getReturnType().represents(Boolean.TYPE) || this.instrumentedMethod.getReturnType().represents(Byte.TYPE) || this.instrumentedMethod.getReturnType().represents(Short.TYPE) || this.instrumentedMethod.getReturnType().represents(Character.TYPE) || this.instrumentedMethod.getReturnType().represents(Integer.TYPE)) {
                    methodVisitor.visitInsn(3);
                    methodVisitor.visitInsn(172);
                    return;
                }
                if (this.instrumentedMethod.getReturnType().represents(Long.TYPE)) {
                    methodVisitor.visitInsn(9);
                    methodVisitor.visitInsn(173);
                    return;
                }
                if (this.instrumentedMethod.getReturnType().represents(Float.TYPE)) {
                    methodVisitor.visitInsn(11);
                    methodVisitor.visitInsn(Opcodes.FRETURN);
                } else if (this.instrumentedMethod.getReturnType().represents(Double.TYPE)) {
                    methodVisitor.visitInsn(14);
                    methodVisitor.visitInsn(Opcodes.DRETURN);
                } else if (this.instrumentedMethod.getReturnType().represents(Void.TYPE)) {
                    methodVisitor.visitInsn(Opcodes.RETURN);
                } else {
                    methodVisitor.visitInsn(1);
                    methodVisitor.visitInsn(Opcodes.ARETURN);
                }
            }
        }

        protected static abstract class WithExitAdvice extends AdviceVisitor {
            protected final Label returnHandler;

            protected abstract void onExitAdviceReturn();

            protected abstract void onUserReturn();

            protected WithExitAdvice(MethodVisitor methodVisitor, Implementation.Context context, Assigner assigner, StackManipulation stackManipulation, TypeDescription typeDescription, MethodDescription methodDescription, Dispatcher.Resolved.ForMethodEnter forMethodEnter, Dispatcher.Resolved.ForMethodExit forMethodExit, List<? extends TypeDescription> list, int i, int i2) {
                super(methodVisitor, new StackAwareMethodVisitor(methodVisitor, methodDescription), context, assigner, stackManipulation, typeDescription, methodDescription, forMethodEnter, forMethodExit, list, i, i2);
                this.returnHandler = new Label();
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.Dispatcher.RelocationHandler.Relocation
            public void apply(MethodVisitor methodVisitor) {
                if (this.instrumentedMethod.getReturnType().represents(Boolean.TYPE) || this.instrumentedMethod.getReturnType().represents(Byte.TYPE) || this.instrumentedMethod.getReturnType().represents(Short.TYPE) || this.instrumentedMethod.getReturnType().represents(Character.TYPE) || this.instrumentedMethod.getReturnType().represents(Integer.TYPE)) {
                    methodVisitor.visitInsn(3);
                } else if (this.instrumentedMethod.getReturnType().represents(Long.TYPE)) {
                    methodVisitor.visitInsn(9);
                } else if (this.instrumentedMethod.getReturnType().represents(Float.TYPE)) {
                    methodVisitor.visitInsn(11);
                } else if (this.instrumentedMethod.getReturnType().represents(Double.TYPE)) {
                    methodVisitor.visitInsn(14);
                } else if (!this.instrumentedMethod.getReturnType().represents(Void.TYPE)) {
                    methodVisitor.visitInsn(1);
                }
                methodVisitor.visitJumpInsn(Opcodes.GOTO, this.returnHandler);
            }

            @Override // org.modelmapper.internal.bytebuddy.utility.visitor.ExceptionTableSensitiveMethodVisitor
            protected void onVisitInsn(int i) {
                switch (i) {
                    case 172:
                        this.methodSizeHandler.requireLocalVariableLength(((StackAwareMethodVisitor) this.mv).drainStack(54, 21, StackSize.SINGLE));
                        break;
                    case 173:
                        this.methodSizeHandler.requireLocalVariableLength(((StackAwareMethodVisitor) this.mv).drainStack(55, 22, StackSize.DOUBLE));
                        break;
                    case Opcodes.FRETURN /* 174 */:
                        this.methodSizeHandler.requireLocalVariableLength(((StackAwareMethodVisitor) this.mv).drainStack(56, 23, StackSize.SINGLE));
                        break;
                    case Opcodes.DRETURN /* 175 */:
                        this.methodSizeHandler.requireLocalVariableLength(((StackAwareMethodVisitor) this.mv).drainStack(57, 24, StackSize.DOUBLE));
                        break;
                    case Opcodes.ARETURN /* 176 */:
                        this.methodSizeHandler.requireLocalVariableLength(((StackAwareMethodVisitor) this.mv).drainStack(58, 25, StackSize.SINGLE));
                        break;
                    case Opcodes.RETURN /* 177 */:
                        ((StackAwareMethodVisitor) this.mv).drainStack();
                        break;
                    default:
                        this.mv.visitInsn(i);
                        return;
                }
                this.mv.visitJumpInsn(Opcodes.GOTO, this.returnHandler);
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.Advice.AdviceVisitor
            protected void onUserEnd() {
                this.methodVisitor.visitLabel(this.returnHandler);
                onUserReturn();
                this.stackMapFrameHandler.injectCompletionFrame(this.methodVisitor);
                this.methodExit.apply();
                onExitAdviceReturn();
                if (this.instrumentedMethod.getReturnType().represents(Boolean.TYPE) || this.instrumentedMethod.getReturnType().represents(Byte.TYPE) || this.instrumentedMethod.getReturnType().represents(Short.TYPE) || this.instrumentedMethod.getReturnType().represents(Character.TYPE) || this.instrumentedMethod.getReturnType().represents(Integer.TYPE)) {
                    this.methodVisitor.visitVarInsn(21, this.argumentHandler.returned());
                    this.methodVisitor.visitInsn(172);
                } else if (this.instrumentedMethod.getReturnType().represents(Long.TYPE)) {
                    this.methodVisitor.visitVarInsn(22, this.argumentHandler.returned());
                    this.methodVisitor.visitInsn(173);
                } else if (this.instrumentedMethod.getReturnType().represents(Float.TYPE)) {
                    this.methodVisitor.visitVarInsn(23, this.argumentHandler.returned());
                    this.methodVisitor.visitInsn(Opcodes.FRETURN);
                } else if (this.instrumentedMethod.getReturnType().represents(Double.TYPE)) {
                    this.methodVisitor.visitVarInsn(24, this.argumentHandler.returned());
                    this.methodVisitor.visitInsn(Opcodes.DRETURN);
                } else if (!this.instrumentedMethod.getReturnType().represents(Void.TYPE)) {
                    this.methodVisitor.visitVarInsn(25, this.argumentHandler.returned());
                    this.methodVisitor.visitInsn(Opcodes.ARETURN);
                } else {
                    this.methodVisitor.visitInsn(Opcodes.RETURN);
                }
                this.methodSizeHandler.requireStackSize(this.instrumentedMethod.getReturnType().getStackSize().getSize());
            }

            protected static class WithoutExceptionHandling extends WithExitAdvice {
                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.AdviceVisitor.WithExitAdvice
                protected void onExitAdviceReturn() {
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.AdviceVisitor
                protected void onUserPrepare() {
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.AdviceVisitor
                protected void onUserStart() {
                }

                /* JADX WARN: Illegal instructions before constructor call */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                protected WithoutExceptionHandling(MethodVisitor methodVisitor, Implementation.Context context, Assigner assigner, StackManipulation stackManipulation, TypeDescription typeDescription, MethodDescription methodDescription, Dispatcher.Resolved.ForMethodEnter forMethodEnter, Dispatcher.Resolved.ForMethodExit forMethodExit, int i, int i2) {
                    super(methodVisitor, context, assigner, stackManipulation, typeDescription, methodDescription, forMethodEnter, forMethodExit, r0, i, i2);
                    List singletonList;
                    if (methodDescription.getReturnType().represents(Void.TYPE)) {
                        singletonList = Collections.emptyList();
                    } else {
                        singletonList = Collections.singletonList(methodDescription.getReturnType().asErasure());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.AdviceVisitor.WithExitAdvice
                protected void onUserReturn() {
                    if (this.instrumentedMethod.getReturnType().represents(Boolean.TYPE) || this.instrumentedMethod.getReturnType().represents(Byte.TYPE) || this.instrumentedMethod.getReturnType().represents(Short.TYPE) || this.instrumentedMethod.getReturnType().represents(Character.TYPE) || this.instrumentedMethod.getReturnType().represents(Integer.TYPE)) {
                        this.stackMapFrameHandler.injectReturnFrame(this.methodVisitor);
                        this.methodVisitor.visitVarInsn(54, this.argumentHandler.returned());
                        return;
                    }
                    if (this.instrumentedMethod.getReturnType().represents(Long.TYPE)) {
                        this.stackMapFrameHandler.injectReturnFrame(this.methodVisitor);
                        this.methodVisitor.visitVarInsn(55, this.argumentHandler.returned());
                        return;
                    }
                    if (this.instrumentedMethod.getReturnType().represents(Float.TYPE)) {
                        this.stackMapFrameHandler.injectReturnFrame(this.methodVisitor);
                        this.methodVisitor.visitVarInsn(56, this.argumentHandler.returned());
                    } else if (this.instrumentedMethod.getReturnType().represents(Double.TYPE)) {
                        this.stackMapFrameHandler.injectReturnFrame(this.methodVisitor);
                        this.methodVisitor.visitVarInsn(57, this.argumentHandler.returned());
                    } else {
                        if (this.instrumentedMethod.getReturnType().represents(Void.TYPE)) {
                            return;
                        }
                        this.stackMapFrameHandler.injectReturnFrame(this.methodVisitor);
                        this.methodVisitor.visitVarInsn(58, this.argumentHandler.returned());
                    }
                }
            }

            protected static class WithExceptionHandling extends WithExitAdvice {
                private final Label exceptionHandler;
                private final TypeDescription throwable;
                protected final Label userStart;

                protected WithExceptionHandling(MethodVisitor methodVisitor, Implementation.Context context, Assigner assigner, StackManipulation stackManipulation, TypeDescription typeDescription, MethodDescription methodDescription, Dispatcher.Resolved.ForMethodEnter forMethodEnter, Dispatcher.Resolved.ForMethodExit forMethodExit, int i, int i2, TypeDescription typeDescription2) {
                    super(methodVisitor, context, assigner, stackManipulation, typeDescription, methodDescription, forMethodEnter, forMethodExit, methodDescription.getReturnType().represents(Void.TYPE) ? Collections.singletonList(TypeDescription.THROWABLE) : Arrays.asList(methodDescription.getReturnType().asErasure(), TypeDescription.THROWABLE), i, i2);
                    this.throwable = typeDescription2;
                    this.exceptionHandler = new Label();
                    this.userStart = new Label();
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.AdviceVisitor
                protected void onUserPrepare() {
                    this.methodVisitor.visitTryCatchBlock(this.userStart, this.returnHandler, this.exceptionHandler, this.throwable.getInternalName());
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.AdviceVisitor
                protected void onUserStart() {
                    this.methodVisitor.visitLabel(this.userStart);
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.AdviceVisitor.WithExitAdvice
                protected void onUserReturn() {
                    this.stackMapFrameHandler.injectReturnFrame(this.methodVisitor);
                    if (this.instrumentedMethod.getReturnType().represents(Boolean.TYPE) || this.instrumentedMethod.getReturnType().represents(Byte.TYPE) || this.instrumentedMethod.getReturnType().represents(Short.TYPE) || this.instrumentedMethod.getReturnType().represents(Character.TYPE) || this.instrumentedMethod.getReturnType().represents(Integer.TYPE)) {
                        this.methodVisitor.visitVarInsn(54, this.argumentHandler.returned());
                    } else if (this.instrumentedMethod.getReturnType().represents(Long.TYPE)) {
                        this.methodVisitor.visitVarInsn(55, this.argumentHandler.returned());
                    } else if (this.instrumentedMethod.getReturnType().represents(Float.TYPE)) {
                        this.methodVisitor.visitVarInsn(56, this.argumentHandler.returned());
                    } else if (this.instrumentedMethod.getReturnType().represents(Double.TYPE)) {
                        this.methodVisitor.visitVarInsn(57, this.argumentHandler.returned());
                    } else if (!this.instrumentedMethod.getReturnType().represents(Void.TYPE)) {
                        this.methodVisitor.visitVarInsn(58, this.argumentHandler.returned());
                    }
                    this.methodVisitor.visitInsn(1);
                    this.methodVisitor.visitVarInsn(58, this.argumentHandler.thrown());
                    Label label = new Label();
                    this.methodVisitor.visitJumpInsn(Opcodes.GOTO, label);
                    this.methodVisitor.visitLabel(this.exceptionHandler);
                    this.stackMapFrameHandler.injectExceptionFrame(this.methodVisitor);
                    this.methodVisitor.visitVarInsn(58, this.argumentHandler.thrown());
                    if (this.instrumentedMethod.getReturnType().represents(Boolean.TYPE) || this.instrumentedMethod.getReturnType().represents(Byte.TYPE) || this.instrumentedMethod.getReturnType().represents(Short.TYPE) || this.instrumentedMethod.getReturnType().represents(Character.TYPE) || this.instrumentedMethod.getReturnType().represents(Integer.TYPE)) {
                        this.methodVisitor.visitInsn(3);
                        this.methodVisitor.visitVarInsn(54, this.argumentHandler.returned());
                    } else if (this.instrumentedMethod.getReturnType().represents(Long.TYPE)) {
                        this.methodVisitor.visitInsn(9);
                        this.methodVisitor.visitVarInsn(55, this.argumentHandler.returned());
                    } else if (this.instrumentedMethod.getReturnType().represents(Float.TYPE)) {
                        this.methodVisitor.visitInsn(11);
                        this.methodVisitor.visitVarInsn(56, this.argumentHandler.returned());
                    } else if (this.instrumentedMethod.getReturnType().represents(Double.TYPE)) {
                        this.methodVisitor.visitInsn(14);
                        this.methodVisitor.visitVarInsn(57, this.argumentHandler.returned());
                    } else if (!this.instrumentedMethod.getReturnType().represents(Void.TYPE)) {
                        this.methodVisitor.visitInsn(1);
                        this.methodVisitor.visitVarInsn(58, this.argumentHandler.returned());
                    }
                    this.methodVisitor.visitLabel(label);
                    this.methodSizeHandler.requireStackSize(StackSize.SINGLE.getSize());
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.Advice.AdviceVisitor.WithExitAdvice
                protected void onExitAdviceReturn() {
                    this.methodVisitor.visitVarInsn(25, this.argumentHandler.thrown());
                    Label label = new Label();
                    this.methodVisitor.visitJumpInsn(Opcodes.IFNULL, label);
                    this.methodVisitor.visitVarInsn(25, this.argumentHandler.thrown());
                    this.methodVisitor.visitInsn(Opcodes.ATHROW);
                    this.methodVisitor.visitLabel(label);
                    this.stackMapFrameHandler.injectPostCompletionFrame(this.methodVisitor);
                }
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class Appender implements ByteCodeAppender {
        private final Advice advice;
        private final ByteCodeAppender delegate;
        private final Implementation.Target implementationTarget;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Appender appender = (Appender) obj;
            return this.advice.equals(appender.advice) && this.implementationTarget.equals(appender.implementationTarget) && this.delegate.equals(appender.delegate);
        }

        public int hashCode() {
            return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.advice.hashCode()) * 31) + this.implementationTarget.hashCode()) * 31) + this.delegate.hashCode();
        }

        protected Appender(Advice advice, Implementation.Target target, ByteCodeAppender byteCodeAppender) {
            this.advice = advice;
            this.implementationTarget = target;
            this.delegate = byteCodeAppender;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
        public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            EmulatingMethodVisitor emulatingMethodVisitor = new EmulatingMethodVisitor(methodVisitor, this.delegate);
            return emulatingMethodVisitor.resolve(this.advice.doWrap(this.implementationTarget.getInstrumentedType(), methodDescription, emulatingMethodVisitor, context, 0, 0), context, methodDescription);
        }

        protected static class EmulatingMethodVisitor extends MethodVisitor {
            private final ByteCodeAppender delegate;
            private int localVariableLength;
            private int stackSize;

            @Override // org.modelmapper.internal.asm.MethodVisitor
            public void visitCode() {
            }

            @Override // org.modelmapper.internal.asm.MethodVisitor
            public void visitEnd() {
            }

            protected EmulatingMethodVisitor(MethodVisitor methodVisitor, ByteCodeAppender byteCodeAppender) {
                super(OpenedClassReader.ASM_API, methodVisitor);
                this.delegate = byteCodeAppender;
            }

            protected ByteCodeAppender.Size resolve(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
                methodVisitor.visitCode();
                ByteCodeAppender.Size apply = this.delegate.apply(methodVisitor, context, methodDescription);
                methodVisitor.visitMaxs(apply.getOperandStackSize(), apply.getLocalVariableSize());
                methodVisitor.visitEnd();
                return new ByteCodeAppender.Size(this.stackSize, this.localVariableLength);
            }

            @Override // org.modelmapper.internal.asm.MethodVisitor
            public void visitMaxs(int i, int i2) {
                this.stackSize = i;
                this.localVariableLength = i2;
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class WithCustomMapping {
        private final Map<Class<? extends Annotation>, OffsetMapping.Factory<?>> offsetMappings;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.offsetMappings.equals(((WithCustomMapping) obj).offsetMappings);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.offsetMappings.hashCode();
        }

        protected WithCustomMapping() {
            this(Collections.emptyMap());
        }

        protected WithCustomMapping(Map<Class<? extends Annotation>, OffsetMapping.Factory<?>> map) {
            this.offsetMappings = map;
        }

        public <T extends Annotation> WithCustomMapping bind(Class<T> cls, Object obj) {
            return bind(OffsetMapping.ForStackManipulation.Factory.of(cls, obj));
        }

        public <T extends Annotation> WithCustomMapping bind(Class<T> cls, Field field) {
            return bind((Class) cls, (FieldDescription) new FieldDescription.ForLoadedField(field));
        }

        public <T extends Annotation> WithCustomMapping bind(Class<T> cls, FieldDescription fieldDescription) {
            return bind(new OffsetMapping.ForField.Resolved.Factory(cls, fieldDescription));
        }

        public <T extends Annotation> WithCustomMapping bind(Class<T> cls, Method method, int i) {
            if (i < 0) {
                throw new IllegalArgumentException("A parameter cannot be negative: " + i);
            }
            if (method.getParameterTypes().length <= i) {
                throw new IllegalArgumentException(method + " does not declare a parameter with index " + i);
            }
            return bind((Class) cls, (ParameterDescription) new MethodDescription.ForLoadedMethod(method).getParameters().get(i));
        }

        public <T extends Annotation> WithCustomMapping bind(Class<T> cls, Constructor<?> constructor, int i) {
            if (i < 0) {
                throw new IllegalArgumentException("A parameter cannot be negative: " + i);
            }
            if (constructor.getParameterTypes().length <= i) {
                throw new IllegalArgumentException(constructor + " does not declare a parameter with index " + i);
            }
            return bind((Class) cls, (ParameterDescription) new MethodDescription.ForLoadedConstructor(constructor).getParameters().get(i));
        }

        public <T extends Annotation> WithCustomMapping bind(Class<T> cls, ParameterDescription parameterDescription) {
            return bind(new OffsetMapping.ForArgument.Resolved.Factory(cls, parameterDescription));
        }

        public <T extends Annotation> WithCustomMapping bind(Class<T> cls, Class<?> cls2) {
            return bind((Class) cls, TypeDescription.ForLoadedType.of(cls2));
        }

        public <T extends Annotation> WithCustomMapping bind(Class<T> cls, TypeDescription typeDescription) {
            return bind(new OffsetMapping.ForStackManipulation.Factory(cls, typeDescription));
        }

        public <T extends Annotation> WithCustomMapping bind(Class<T> cls, Enum<?> r3) {
            return bind((Class) cls, (EnumerationDescription) new EnumerationDescription.ForLoadedEnumeration(r3));
        }

        public <T extends Annotation> WithCustomMapping bind(Class<T> cls, EnumerationDescription enumerationDescription) {
            return bind(new OffsetMapping.ForStackManipulation.Factory(cls, enumerationDescription));
        }

        public <T extends Annotation> WithCustomMapping bindSerialized(Class<T> cls, Serializable serializable) {
            return bindSerialized(cls, serializable, serializable.getClass());
        }

        public <T extends Annotation, S extends Serializable> WithCustomMapping bindSerialized(Class<T> cls, S s, Class<? super S> cls2) {
            return bind(OffsetMapping.ForSerializedValue.Factory.of(cls, s, cls2));
        }

        public <T extends Annotation> WithCustomMapping bindProperty(Class<T> cls, String str) {
            return bind(OffsetMapping.ForStackManipulation.OfAnnotationProperty.of(cls, str));
        }

        public <T extends Annotation> WithCustomMapping bind(Class<T> cls, StackManipulation stackManipulation, java.lang.reflect.Type type) {
            return bind(cls, stackManipulation, TypeDefinition.Sort.describe(type));
        }

        public <T extends Annotation> WithCustomMapping bind(Class<T> cls, StackManipulation stackManipulation, TypeDescription.Generic generic) {
            return bind(new OffsetMapping.ForStackManipulation.Factory(cls, stackManipulation, generic));
        }

        public <T extends Annotation> WithCustomMapping bind(Class<T> cls, OffsetMapping offsetMapping) {
            return bind(new OffsetMapping.Factory.Simple(cls, offsetMapping));
        }

        public WithCustomMapping bind(OffsetMapping.Factory<?> factory) {
            HashMap hashMap = new HashMap(this.offsetMappings);
            if (!factory.getAnnotationType().isAnnotation()) {
                throw new IllegalArgumentException("Not an annotation type: " + factory.getAnnotationType());
            }
            if (hashMap.put(factory.getAnnotationType(), factory) != null) {
                throw new IllegalArgumentException("Annotation type already mapped: " + factory.getAnnotationType());
            }
            return new WithCustomMapping(hashMap);
        }

        public Advice to(Class<?> cls) {
            return to(cls, ClassFileLocator.ForClassLoader.of(cls.getClassLoader()));
        }

        public Advice to(Class<?> cls, ClassFileLocator classFileLocator) {
            return to(TypeDescription.ForLoadedType.of(cls), classFileLocator);
        }

        public Advice to(TypeDescription typeDescription, ClassFileLocator classFileLocator) {
            return Advice.to(typeDescription, classFileLocator, new ArrayList(this.offsetMappings.values()));
        }

        public Advice to(Class<?> cls, Class<?> cls2) {
            ClassLoader classLoader = cls.getClassLoader();
            ClassLoader classLoader2 = cls2.getClassLoader();
            return to(cls, cls2, classLoader == classLoader2 ? ClassFileLocator.ForClassLoader.of(classLoader) : new ClassFileLocator.Compound(ClassFileLocator.ForClassLoader.of(classLoader), ClassFileLocator.ForClassLoader.of(classLoader2)));
        }

        public Advice to(Class<?> cls, Class<?> cls2, ClassFileLocator classFileLocator) {
            return to(TypeDescription.ForLoadedType.of(cls), TypeDescription.ForLoadedType.of(cls2), classFileLocator);
        }

        public Advice to(TypeDescription typeDescription, TypeDescription typeDescription2) {
            return to(typeDescription, typeDescription2, ClassFileLocator.NoOp.INSTANCE);
        }

        public Advice to(TypeDescription typeDescription, TypeDescription typeDescription2, ClassFileLocator classFileLocator) {
            return Advice.to(typeDescription, typeDescription2, classFileLocator, new ArrayList(this.offsetMappings.values()));
        }
    }

    private static class NoExceptionHandler extends Throwable {
        private static final TypeDescription DESCRIPTION = TypeDescription.ForLoadedType.of(NoExceptionHandler.class);

        private NoExceptionHandler() {
            throw new UnsupportedOperationException("This class only serves as a marker type and should not be instantiated");
        }
    }

    public static final class OnDefaultValue {
        private OnDefaultValue() {
            throw new UnsupportedOperationException("This class only serves as a marker type and should not be instantiated");
        }
    }

    public static final class OnNonDefaultValue {
        private OnNonDefaultValue() {
            throw new UnsupportedOperationException("This class only serves as a marker type and should not be instantiated");
        }
    }
}
