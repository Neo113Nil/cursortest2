package org.modelmapper.internal.bytebuddy.asm;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.ByteCodeElement;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.field.FieldList;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodList;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeList;
import org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Duplication;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Removal;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackSize;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.DefaultValue;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.FieldAccess;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;
import org.modelmapper.internal.bytebuddy.pool.TypePool;
import org.modelmapper.internal.bytebuddy.utility.CompoundList;
import org.modelmapper.internal.bytebuddy.utility.OpenedClassReader;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class MemberSubstitution implements AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper {
    private final MethodGraph.Compiler methodGraphCompiler;
    private final boolean strict;
    private final Substitution substitution;
    private final TypePoolResolver typePoolResolver;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MemberSubstitution memberSubstitution = (MemberSubstitution) obj;
        return this.methodGraphCompiler.equals(memberSubstitution.methodGraphCompiler) && this.strict == memberSubstitution.strict && this.typePoolResolver.equals(memberSubstitution.typePoolResolver) && this.substitution.equals(memberSubstitution.substitution);
    }

    public int hashCode() {
        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodGraphCompiler.hashCode()) * 31) + (this.strict ? 1 : 0)) * 31) + this.typePoolResolver.hashCode()) * 31) + this.substitution.hashCode();
    }

    /* synthetic */ MemberSubstitution(MethodGraph.Compiler compiler, TypePoolResolver typePoolResolver, boolean z, Substitution substitution, AnonymousClass1 anonymousClass1) {
        this(compiler, typePoolResolver, z, substitution);
    }

    protected MemberSubstitution(boolean z) {
        this(MethodGraph.Compiler.DEFAULT, TypePoolResolver.OfImplicitPool.INSTANCE, z, Substitution.NoOp.INSTANCE);
    }

    private MemberSubstitution(MethodGraph.Compiler compiler, TypePoolResolver typePoolResolver, boolean z, Substitution substitution) {
        this.methodGraphCompiler = compiler;
        this.typePoolResolver = typePoolResolver;
        this.strict = z;
        this.substitution = substitution;
    }

    public static MemberSubstitution strict() {
        return new MemberSubstitution(true);
    }

    public static MemberSubstitution relaxed() {
        return new MemberSubstitution(false);
    }

    public WithoutSpecification element(ElementMatcher<? super ByteCodeElement> elementMatcher) {
        return new WithoutSpecification.ForMatchedByteCodeElement(this.methodGraphCompiler, this.typePoolResolver, this.strict, this.substitution, elementMatcher);
    }

    public WithoutSpecification.ForMatchedField field(ElementMatcher<? super FieldDescription.InDefinedShape> elementMatcher) {
        return new WithoutSpecification.ForMatchedField(this.methodGraphCompiler, this.typePoolResolver, this.strict, this.substitution, elementMatcher);
    }

    public WithoutSpecification.ForMatchedMethod method(ElementMatcher<? super MethodDescription> elementMatcher) {
        return new WithoutSpecification.ForMatchedMethod(this.methodGraphCompiler, this.typePoolResolver, this.strict, this.substitution, elementMatcher);
    }

    public WithoutSpecification constructor(ElementMatcher<? super MethodDescription> elementMatcher) {
        return invokable(ElementMatchers.isConstructor().and(elementMatcher));
    }

    public WithoutSpecification invokable(ElementMatcher<? super MethodDescription> elementMatcher) {
        return new WithoutSpecification.ForMatchedMethod(this.methodGraphCompiler, this.typePoolResolver, this.strict, this.substitution, elementMatcher);
    }

    public MemberSubstitution with(MethodGraph.Compiler compiler) {
        return new MemberSubstitution(compiler, this.typePoolResolver, this.strict, this.substitution);
    }

    public MemberSubstitution with(TypePoolResolver typePoolResolver) {
        return new MemberSubstitution(this.methodGraphCompiler, typePoolResolver, this.strict, this.substitution);
    }

    public AsmVisitorWrapper.ForDeclaredMethods on(ElementMatcher<? super MethodDescription> elementMatcher) {
        return new AsmVisitorWrapper.ForDeclaredMethods().method(elementMatcher, this);
    }

    @Override // org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper
    public MethodVisitor wrap(TypeDescription typeDescription, MethodDescription methodDescription, MethodVisitor methodVisitor, Implementation.Context context, TypePool typePool, int i, int i2) {
        return new SubstitutingMethodVisitor(methodVisitor, this.methodGraphCompiler, this.strict, this.substitution, typeDescription, context, this.typePoolResolver.resolve(typeDescription, methodDescription, typePool));
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static abstract class WithoutSpecification {
        protected final MethodGraph.Compiler methodGraphCompiler;
        protected final boolean strict;
        protected final Substitution substitution;
        protected final TypePoolResolver typePoolResolver;

        protected abstract Substitution doReplaceWith(FieldDescription fieldDescription);

        protected abstract Substitution doReplaceWith(MethodDescription methodDescription);

        protected abstract Substitution doStub();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            WithoutSpecification withoutSpecification = (WithoutSpecification) obj;
            return this.methodGraphCompiler.equals(withoutSpecification.methodGraphCompiler) && this.typePoolResolver.equals(withoutSpecification.typePoolResolver) && this.strict == withoutSpecification.strict && this.substitution.equals(withoutSpecification.substitution);
        }

        public int hashCode() {
            return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodGraphCompiler.hashCode()) * 31) + this.typePoolResolver.hashCode()) * 31) + (this.strict ? 1 : 0)) * 31) + this.substitution.hashCode();
        }

        protected WithoutSpecification(MethodGraph.Compiler compiler, TypePoolResolver typePoolResolver, boolean z, Substitution substitution) {
            this.methodGraphCompiler = compiler;
            this.typePoolResolver = typePoolResolver;
            this.strict = z;
            this.substitution = substitution;
        }

        public MemberSubstitution stub() {
            return new MemberSubstitution(this.methodGraphCompiler, this.typePoolResolver, this.strict, new Substitution.Compound(doStub(), this.substitution), null);
        }

        public MemberSubstitution replaceWith(Field field) {
            return replaceWith(new FieldDescription.ForLoadedField(field));
        }

        public MemberSubstitution replaceWith(FieldDescription fieldDescription) {
            return new MemberSubstitution(this.methodGraphCompiler, this.typePoolResolver, this.strict, new Substitution.Compound(doReplaceWith(fieldDescription), this.substitution), null);
        }

        public MemberSubstitution replaceWith(Method method) {
            return replaceWith(new MethodDescription.ForLoadedMethod(method));
        }

        public MemberSubstitution replaceWith(MethodDescription methodDescription) {
            if (!methodDescription.isMethod()) {
                throw new IllegalArgumentException("Cannot use " + methodDescription + " as a replacement");
            }
            return new MemberSubstitution(this.methodGraphCompiler, this.typePoolResolver, this.strict, new Substitution.Compound(doReplaceWith(methodDescription), this.substitution), null);
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class ForMatchedByteCodeElement extends WithoutSpecification {
            private final ElementMatcher<? super ByteCodeElement> matcher;

            @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.WithoutSpecification
            public boolean equals(Object obj) {
                if (!super.equals(obj)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.matcher.equals(((ForMatchedByteCodeElement) obj).matcher);
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.WithoutSpecification
            public int hashCode() {
                return (super.hashCode() * 31) + this.matcher.hashCode();
            }

            protected ForMatchedByteCodeElement(MethodGraph.Compiler compiler, TypePoolResolver typePoolResolver, boolean z, Substitution substitution, ElementMatcher<? super ByteCodeElement> elementMatcher) {
                super(compiler, typePoolResolver, z, substitution);
                this.matcher = elementMatcher;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.WithoutSpecification
            protected Substitution doStub() {
                return Substitution.ForElementMatchers.of(this.matcher, Substitution.Resolver.Stubbing.INSTANCE);
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.WithoutSpecification
            protected Substitution doReplaceWith(FieldDescription fieldDescription) {
                return Substitution.ForElementMatchers.of(this.matcher, new Substitution.Resolver.FieldAccessing(fieldDescription));
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.WithoutSpecification
            protected Substitution doReplaceWith(MethodDescription methodDescription) {
                return Substitution.ForElementMatchers.of(this.matcher, new Substitution.Resolver.MethodInvoking(methodDescription));
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForMatchedField extends WithoutSpecification {
            private final boolean matchRead;
            private final boolean matchWrite;
            private final ElementMatcher<? super FieldDescription.InDefinedShape> matcher;

            @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.WithoutSpecification
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
                ForMatchedField forMatchedField = (ForMatchedField) obj;
                return this.matcher.equals(forMatchedField.matcher) && this.matchRead == forMatchedField.matchRead && this.matchWrite == forMatchedField.matchWrite;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.WithoutSpecification
            public int hashCode() {
                return (((((super.hashCode() * 31) + this.matcher.hashCode()) * 31) + (this.matchRead ? 1 : 0)) * 31) + (this.matchWrite ? 1 : 0);
            }

            protected ForMatchedField(MethodGraph.Compiler compiler, TypePoolResolver typePoolResolver, boolean z, Substitution substitution, ElementMatcher<? super FieldDescription.InDefinedShape> elementMatcher) {
                this(compiler, typePoolResolver, z, substitution, elementMatcher, true, true);
            }

            protected ForMatchedField(MethodGraph.Compiler compiler, TypePoolResolver typePoolResolver, boolean z, Substitution substitution, ElementMatcher<? super FieldDescription.InDefinedShape> elementMatcher, boolean z2, boolean z3) {
                super(compiler, typePoolResolver, z, substitution);
                this.matcher = elementMatcher;
                this.matchRead = z2;
                this.matchWrite = z3;
            }

            public WithoutSpecification onRead() {
                return new ForMatchedField(this.methodGraphCompiler, this.typePoolResolver, this.strict, this.substitution, this.matcher, true, false);
            }

            public WithoutSpecification onWrite() {
                return new ForMatchedField(this.methodGraphCompiler, this.typePoolResolver, this.strict, this.substitution, this.matcher, false, true);
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.WithoutSpecification
            protected Substitution doStub() {
                return Substitution.ForElementMatchers.ofField(this.matcher, this.matchRead, this.matchWrite, Substitution.Resolver.Stubbing.INSTANCE);
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.WithoutSpecification
            protected Substitution doReplaceWith(FieldDescription fieldDescription) {
                return Substitution.ForElementMatchers.ofField(this.matcher, this.matchRead, this.matchWrite, new Substitution.Resolver.FieldAccessing(fieldDescription));
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.WithoutSpecification
            protected Substitution doReplaceWith(MethodDescription methodDescription) {
                return Substitution.ForElementMatchers.ofField(this.matcher, this.matchRead, this.matchWrite, new Substitution.Resolver.MethodInvoking(methodDescription));
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForMatchedMethod extends WithoutSpecification {
            private final boolean includeSuperCalls;
            private final boolean includeVirtualCalls;
            private final ElementMatcher<? super MethodDescription> matcher;

            @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.WithoutSpecification
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
                ForMatchedMethod forMatchedMethod = (ForMatchedMethod) obj;
                return this.matcher.equals(forMatchedMethod.matcher) && this.includeVirtualCalls == forMatchedMethod.includeVirtualCalls && this.includeSuperCalls == forMatchedMethod.includeSuperCalls;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.WithoutSpecification
            public int hashCode() {
                return (((((super.hashCode() * 31) + this.matcher.hashCode()) * 31) + (this.includeVirtualCalls ? 1 : 0)) * 31) + (this.includeSuperCalls ? 1 : 0);
            }

            protected ForMatchedMethod(MethodGraph.Compiler compiler, TypePoolResolver typePoolResolver, boolean z, Substitution substitution, ElementMatcher<? super MethodDescription> elementMatcher) {
                this(compiler, typePoolResolver, z, substitution, elementMatcher, true, true);
            }

            protected ForMatchedMethod(MethodGraph.Compiler compiler, TypePoolResolver typePoolResolver, boolean z, Substitution substitution, ElementMatcher<? super MethodDescription> elementMatcher, boolean z2, boolean z3) {
                super(compiler, typePoolResolver, z, substitution);
                this.matcher = elementMatcher;
                this.includeVirtualCalls = z2;
                this.includeSuperCalls = z3;
            }

            public WithoutSpecification onVirtualCall() {
                return new ForMatchedMethod(this.methodGraphCompiler, this.typePoolResolver, this.strict, this.substitution, ElementMatchers.isVirtual().and(this.matcher), true, false);
            }

            public WithoutSpecification onSuperCall() {
                return new ForMatchedMethod(this.methodGraphCompiler, this.typePoolResolver, this.strict, this.substitution, ElementMatchers.isVirtual().and(this.matcher), false, true);
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.WithoutSpecification
            protected Substitution doStub() {
                return Substitution.ForElementMatchers.ofMethod(this.matcher, this.includeVirtualCalls, this.includeSuperCalls, Substitution.Resolver.Stubbing.INSTANCE);
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.WithoutSpecification
            protected Substitution doReplaceWith(FieldDescription fieldDescription) {
                return Substitution.ForElementMatchers.ofMethod(this.matcher, this.includeVirtualCalls, this.includeSuperCalls, new Substitution.Resolver.FieldAccessing(fieldDescription));
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.WithoutSpecification
            protected Substitution doReplaceWith(MethodDescription methodDescription) {
                return Substitution.ForElementMatchers.ofMethod(this.matcher, this.includeVirtualCalls, this.includeSuperCalls, new Substitution.Resolver.MethodInvoking(methodDescription));
            }
        }
    }

    public interface TypePoolResolver {

        public enum OfImplicitPool implements TypePoolResolver {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.TypePoolResolver
            public TypePool resolve(TypeDescription typeDescription, MethodDescription methodDescription, TypePool typePool) {
                return typePool;
            }
        }

        TypePool resolve(TypeDescription typeDescription, MethodDescription methodDescription, TypePool typePool);

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForExplicitPool implements TypePoolResolver {
            private final TypePool typePool;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.typePool.equals(((ForExplicitPool) obj).typePool);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typePool.hashCode();
            }

            public ForExplicitPool(TypePool typePool) {
                this.typePool = typePool;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.TypePoolResolver
            public TypePool resolve(TypeDescription typeDescription, MethodDescription methodDescription, TypePool typePool) {
                return this.typePool;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForClassFileLocator implements TypePoolResolver {
            private final ClassFileLocator classFileLocator;
            private final TypePool.Default.ReaderMode readerMode;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForClassFileLocator forClassFileLocator = (ForClassFileLocator) obj;
                return this.classFileLocator.equals(forClassFileLocator.classFileLocator) && this.readerMode.equals(forClassFileLocator.readerMode);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.classFileLocator.hashCode()) * 31) + this.readerMode.hashCode();
            }

            public ForClassFileLocator(ClassFileLocator classFileLocator) {
                this(classFileLocator, TypePool.Default.ReaderMode.FAST);
            }

            public ForClassFileLocator(ClassFileLocator classFileLocator, TypePool.Default.ReaderMode readerMode) {
                this.classFileLocator = classFileLocator;
                this.readerMode = readerMode;
            }

            public static TypePoolResolver of(ClassLoader classLoader) {
                return new ForClassFileLocator(ClassFileLocator.ForClassLoader.of(classLoader));
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.TypePoolResolver
            public TypePool resolve(TypeDescription typeDescription, MethodDescription methodDescription, TypePool typePool) {
                return new TypePool.Default(new TypePool.CacheProvider.Simple(), this.classFileLocator, this.readerMode, typePool);
            }
        }
    }

    protected interface Substitution {
        Resolver resolve(FieldDescription.InDefinedShape inDefinedShape, boolean z);

        Resolver resolve(MethodDescription methodDescription, InvocationType invocationType);

        public interface Resolver {
            StackManipulation apply(TypeDescription typeDescription, ByteCodeElement byteCodeElement, TypeList.Generic generic, TypeDescription.Generic generic2);

            boolean isResolved();

            public enum Unresolved implements Resolver {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.Substitution.Resolver
                public boolean isResolved() {
                    return false;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.Substitution.Resolver
                public StackManipulation apply(TypeDescription typeDescription, ByteCodeElement byteCodeElement, TypeList.Generic generic, TypeDescription.Generic generic2) {
                    throw new IllegalStateException("Cannot apply unresolved resolver");
                }
            }

            public enum Stubbing implements Resolver {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.Substitution.Resolver
                public boolean isResolved() {
                    return true;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.Substitution.Resolver
                public StackManipulation apply(TypeDescription typeDescription, ByteCodeElement byteCodeElement, TypeList.Generic generic, TypeDescription.Generic generic2) {
                    ArrayList arrayList = new ArrayList(generic.size());
                    for (int size = generic.size() - 1; size >= 0; size--) {
                        arrayList.add(Removal.of((TypeDefinition) generic.get(size)));
                    }
                    return new StackManipulation.Compound((List<? extends StackManipulation>) CompoundList.of(arrayList, DefaultValue.of(generic2.asErasure())));
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class FieldAccessing implements Resolver {
                private final FieldDescription fieldDescription;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.fieldDescription.equals(((FieldAccessing) obj).fieldDescription);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fieldDescription.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.Substitution.Resolver
                public boolean isResolved() {
                    return true;
                }

                protected FieldAccessing(FieldDescription fieldDescription) {
                    this.fieldDescription = fieldDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.Substitution.Resolver
                public StackManipulation apply(TypeDescription typeDescription, ByteCodeElement byteCodeElement, TypeList.Generic generic, TypeDescription.Generic generic2) {
                    if (!this.fieldDescription.isAccessibleTo(typeDescription)) {
                        throw new IllegalStateException(typeDescription + " cannot access " + this.fieldDescription);
                    }
                    if (generic2.represents(Void.TYPE)) {
                        if (generic.size() != (this.fieldDescription.isStatic() ? 1 : 2)) {
                            throw new IllegalStateException("Cannot set " + this.fieldDescription + " with " + generic);
                        }
                        if (!this.fieldDescription.isStatic() && !((TypeDescription.Generic) generic.get(0)).asErasure().isAssignableTo(this.fieldDescription.getDeclaringType().asErasure())) {
                            throw new IllegalStateException("Cannot set " + this.fieldDescription + " on " + generic.get(0));
                        }
                        if (!((TypeDescription.Generic) generic.get(!this.fieldDescription.isStatic() ? 1 : 0)).asErasure().isAssignableTo(this.fieldDescription.getType().asErasure())) {
                            throw new IllegalStateException("Cannot set " + this.fieldDescription + " to " + generic.get(!this.fieldDescription.isStatic() ? 1 : 0));
                        }
                        return FieldAccess.forField(this.fieldDescription).write();
                    }
                    if (generic.size() != (1 ^ (this.fieldDescription.isStatic() ? 1 : 0))) {
                        throw new IllegalStateException("Cannot set " + this.fieldDescription + " with " + generic);
                    }
                    if (!this.fieldDescription.isStatic() && !((TypeDescription.Generic) generic.get(0)).asErasure().isAssignableTo(this.fieldDescription.getDeclaringType().asErasure())) {
                        throw new IllegalStateException("Cannot get " + this.fieldDescription + " on " + generic.get(0));
                    }
                    if (!this.fieldDescription.getType().asErasure().isAssignableTo(generic2.asErasure())) {
                        throw new IllegalStateException("Cannot get " + this.fieldDescription + " as " + generic2);
                    }
                    return FieldAccess.forField(this.fieldDescription).read();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class MethodInvoking implements Resolver {
                private static final int THIS_REFERENCE = 0;
                private final MethodDescription methodDescription;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.methodDescription.equals(((MethodInvoking) obj).methodDescription);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodDescription.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.Substitution.Resolver
                public boolean isResolved() {
                    return true;
                }

                protected MethodInvoking(MethodDescription methodDescription) {
                    this.methodDescription = methodDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.Substitution.Resolver
                public StackManipulation apply(TypeDescription typeDescription, ByteCodeElement byteCodeElement, TypeList.Generic generic, TypeDescription.Generic generic2) {
                    TypeList.Generic explicit;
                    if (!this.methodDescription.isAccessibleTo(typeDescription)) {
                        throw new IllegalStateException(typeDescription + " cannot access " + this.methodDescription);
                    }
                    if (this.methodDescription.isStatic()) {
                        explicit = this.methodDescription.getParameters().asTypeList();
                    } else {
                        explicit = new TypeList.Generic.Explicit((List<? extends TypeDefinition>) CompoundList.of(this.methodDescription.getDeclaringType(), this.methodDescription.getParameters().asTypeList()));
                    }
                    if (!this.methodDescription.getReturnType().asErasure().isAssignableTo(generic2.asErasure())) {
                        throw new IllegalStateException("Cannot assign return value of " + this.methodDescription + " to " + generic2);
                    }
                    if (explicit.size() != generic.size()) {
                        throw new IllegalStateException("Cannot invoke " + this.methodDescription + " on " + generic);
                    }
                    for (int i = 0; i < explicit.size(); i++) {
                        if (!((TypeDescription.Generic) explicit.get(i)).asErasure().isAssignableTo(((TypeDescription.Generic) generic.get(i)).asErasure())) {
                            throw new IllegalStateException("Cannot invoke " + this.methodDescription + " on " + generic);
                        }
                    }
                    if (this.methodDescription.isVirtual()) {
                        return MethodInvocation.invoke(this.methodDescription).virtual(((TypeDescription.Generic) explicit.get(0)).asErasure());
                    }
                    return MethodInvocation.invoke(this.methodDescription);
                }
            }
        }

        public enum InvocationType {
            VIRTUAL,
            SUPER,
            OTHER;

            protected static InvocationType of(int i, MethodDescription methodDescription) {
                if (i != 182) {
                    if (i == 183) {
                        return methodDescription.isVirtual() ? SUPER : OTHER;
                    }
                    if (i != 185) {
                        return OTHER;
                    }
                }
                return VIRTUAL;
            }

            protected boolean matches(boolean z, boolean z2) {
                int i = AnonymousClass1.$SwitchMap$net$bytebuddy$asm$MemberSubstitution$Substitution$InvocationType[ordinal()];
                if (i == 1) {
                    return z;
                }
                if (i != 2) {
                    return true;
                }
                return z2;
            }
        }

        public enum NoOp implements Substitution {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.Substitution
            public Resolver resolve(FieldDescription.InDefinedShape inDefinedShape, boolean z) {
                return Resolver.Unresolved.INSTANCE;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.Substitution
            public Resolver resolve(MethodDescription methodDescription, InvocationType invocationType) {
                return Resolver.Unresolved.INSTANCE;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForElementMatchers implements Substitution {
            private final ElementMatcher<? super FieldDescription.InDefinedShape> fieldMatcher;
            private final boolean includeSuperCalls;
            private final boolean includeVirtualCalls;
            private final boolean matchFieldRead;
            private final boolean matchFieldWrite;
            private final ElementMatcher<? super MethodDescription> methodMatcher;
            private final Resolver resolver;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForElementMatchers forElementMatchers = (ForElementMatchers) obj;
                return this.fieldMatcher.equals(forElementMatchers.fieldMatcher) && this.methodMatcher.equals(forElementMatchers.methodMatcher) && this.matchFieldRead == forElementMatchers.matchFieldRead && this.matchFieldWrite == forElementMatchers.matchFieldWrite && this.includeVirtualCalls == forElementMatchers.includeVirtualCalls && this.includeSuperCalls == forElementMatchers.includeSuperCalls && this.resolver.equals(forElementMatchers.resolver);
            }

            public int hashCode() {
                return ((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fieldMatcher.hashCode()) * 31) + this.methodMatcher.hashCode()) * 31) + (this.matchFieldRead ? 1 : 0)) * 31) + (this.matchFieldWrite ? 1 : 0)) * 31) + (this.includeVirtualCalls ? 1 : 0)) * 31) + (this.includeSuperCalls ? 1 : 0)) * 31) + this.resolver.hashCode();
            }

            protected static Substitution of(ElementMatcher<? super ByteCodeElement> elementMatcher, Resolver resolver) {
                return new ForElementMatchers(elementMatcher, elementMatcher, true, true, true, true, resolver);
            }

            protected static Substitution ofField(ElementMatcher<? super FieldDescription.InDefinedShape> elementMatcher, boolean z, boolean z2, Resolver resolver) {
                return new ForElementMatchers(elementMatcher, ElementMatchers.none(), z, z2, false, false, resolver);
            }

            protected static Substitution ofMethod(ElementMatcher<? super MethodDescription> elementMatcher, boolean z, boolean z2, Resolver resolver) {
                return new ForElementMatchers(ElementMatchers.none(), elementMatcher, false, false, z, z2, resolver);
            }

            protected ForElementMatchers(ElementMatcher<? super FieldDescription.InDefinedShape> elementMatcher, ElementMatcher<? super MethodDescription> elementMatcher2, boolean z, boolean z2, boolean z3, boolean z4, Resolver resolver) {
                this.fieldMatcher = elementMatcher;
                this.methodMatcher = elementMatcher2;
                this.matchFieldRead = z;
                this.matchFieldWrite = z2;
                this.includeVirtualCalls = z3;
                this.includeSuperCalls = z4;
                this.resolver = resolver;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.Substitution
            public Resolver resolve(FieldDescription.InDefinedShape inDefinedShape, boolean z) {
                if (!z ? this.matchFieldRead : this.matchFieldWrite) {
                    if (this.fieldMatcher.matches(inDefinedShape)) {
                        return this.resolver;
                    }
                }
                return Resolver.Unresolved.INSTANCE;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.Substitution
            public Resolver resolve(MethodDescription methodDescription, InvocationType invocationType) {
                return (invocationType.matches(this.includeVirtualCalls, this.includeSuperCalls) && this.methodMatcher.matches(methodDescription)) ? this.resolver : Resolver.Unresolved.INSTANCE;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Compound implements Substitution {
            private final List<Substitution> substitutions;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.substitutions.equals(((Compound) obj).substitutions);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.substitutions.hashCode();
            }

            protected Compound(Substitution... substitutionArr) {
                this((List<? extends Substitution>) Arrays.asList(substitutionArr));
            }

            protected Compound(List<? extends Substitution> list) {
                this.substitutions = new ArrayList(list.size());
                for (Substitution substitution : list) {
                    if (substitution instanceof Compound) {
                        this.substitutions.addAll(((Compound) substitution).substitutions);
                    } else if (!(substitution instanceof NoOp)) {
                        this.substitutions.add(substitution);
                    }
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.Substitution
            public Resolver resolve(FieldDescription.InDefinedShape inDefinedShape, boolean z) {
                Iterator<Substitution> it = this.substitutions.iterator();
                while (it.hasNext()) {
                    Resolver resolve = it.next().resolve(inDefinedShape, z);
                    if (resolve.isResolved()) {
                        return resolve;
                    }
                }
                return Resolver.Unresolved.INSTANCE;
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.MemberSubstitution.Substitution
            public Resolver resolve(MethodDescription methodDescription, InvocationType invocationType) {
                Iterator<Substitution> it = this.substitutions.iterator();
                while (it.hasNext()) {
                    Resolver resolve = it.next().resolve(methodDescription, invocationType);
                    if (resolve.isResolved()) {
                        return resolve;
                    }
                }
                return Resolver.Unresolved.INSTANCE;
            }
        }
    }

    /* renamed from: org.modelmapper.internal.bytebuddy.asm.MemberSubstitution$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$bytebuddy$asm$MemberSubstitution$Substitution$InvocationType;

        static {
            int[] iArr = new int[Substitution.InvocationType.values().length];
            $SwitchMap$net$bytebuddy$asm$MemberSubstitution$Substitution$InvocationType = iArr;
            try {
                iArr[Substitution.InvocationType.VIRTUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$bytebuddy$asm$MemberSubstitution$Substitution$InvocationType[Substitution.InvocationType.SUPER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    protected static class SubstitutingMethodVisitor extends MethodVisitor {
        private final Implementation.Context implementationContext;
        private final TypeDescription instrumentedType;
        private final MethodGraph.Compiler methodGraphCompiler;
        private int stackSizeBuffer;
        private final boolean strict;
        private final Substitution substitution;
        private final TypePool typePool;

        protected SubstitutingMethodVisitor(MethodVisitor methodVisitor, MethodGraph.Compiler compiler, boolean z, Substitution substitution, TypeDescription typeDescription, Implementation.Context context, TypePool typePool) {
            super(OpenedClassReader.ASM_API, methodVisitor);
            this.methodGraphCompiler = compiler;
            this.strict = z;
            this.substitution = substitution;
            this.instrumentedType = typeDescription;
            this.implementationContext = context;
            this.typePool = typePool;
            this.stackSizeBuffer = 0;
        }

        @Override // org.modelmapper.internal.asm.MethodVisitor
        public void visitFieldInsn(int i, String str, String str2, String str3) {
            ElementMatcher.Junction failSafe;
            TypeList.Generic empty;
            TypeDescription.Generic type;
            TypePool.Resolution describe = this.typePool.describe(str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
            if (describe.isResolved()) {
                FieldList<FieldDescription.InDefinedShape> declaredFields = describe.resolve().getDeclaredFields();
                if (this.strict) {
                    failSafe = ElementMatchers.named(str2).and(ElementMatchers.hasDescriptor(str3));
                } else {
                    failSafe = ElementMatchers.failSafe(ElementMatchers.named(str2).and(ElementMatchers.hasDescriptor(str3)));
                }
                FieldList filter = declaredFields.filter(failSafe);
                if (!filter.isEmpty()) {
                    Substitution.Resolver resolve = this.substitution.resolve((FieldDescription.InDefinedShape) filter.getOnly(), i == 181 || i == 179);
                    if (resolve.isResolved()) {
                        switch (i) {
                            case Opcodes.GETSTATIC /* 178 */:
                                empty = new TypeList.Generic.Empty();
                                type = ((FieldDescription.InDefinedShape) filter.getOnly()).getType();
                                break;
                            case Opcodes.PUTSTATIC /* 179 */:
                                empty = new TypeList.Generic.Explicit(((FieldDescription.InDefinedShape) filter.getOnly()).getType());
                                type = TypeDescription.Generic.VOID;
                                break;
                            case 180:
                                empty = new TypeList.Generic.Explicit(((FieldDescription.InDefinedShape) filter.getOnly()).getDeclaringType());
                                type = ((FieldDescription.InDefinedShape) filter.getOnly()).getType();
                                break;
                            case Opcodes.PUTFIELD /* 181 */:
                                empty = new TypeList.Generic.Explicit(((FieldDescription.InDefinedShape) filter.getOnly()).getDeclaringType(), ((FieldDescription.InDefinedShape) filter.getOnly()).getType());
                                type = TypeDescription.Generic.VOID;
                                break;
                            default:
                                throw new AssertionError();
                        }
                        resolve.apply(this.instrumentedType, (ByteCodeElement) filter.getOnly(), empty, type).apply(this.mv, this.implementationContext);
                        return;
                    }
                } else if (this.strict) {
                    throw new IllegalStateException("Could not resolve " + str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH) + "." + str2 + str3 + " using " + this.typePool);
                }
            } else if (this.strict) {
                throw new IllegalStateException("Could not resolve " + str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH) + " using " + this.typePool);
            }
            super.visitFieldInsn(i, str, str2, str3);
        }

        @Override // org.modelmapper.internal.asm.MethodVisitor
        public void visitMethodInsn(int i, String str, String str2, String str3, boolean z) {
            ElementMatcher.Junction failSafe;
            MethodList filter;
            ElementMatcher.Junction failSafe2;
            ElementMatcher.Junction failSafe3;
            TypeDescription.Generic returnType;
            ElementMatcher.Junction failSafe4;
            TypePool.Resolution describe = this.typePool.describe(str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
            if (describe.isResolved()) {
                if (i == 183 && str2.equals(MethodDescription.CONSTRUCTOR_INTERNAL_NAME)) {
                    MethodList<MethodDescription.InDefinedShape> declaredMethods = describe.resolve().getDeclaredMethods();
                    if (this.strict) {
                        failSafe4 = ElementMatchers.isConstructor().and(ElementMatchers.hasDescriptor(str3));
                    } else {
                        failSafe4 = ElementMatchers.failSafe(ElementMatchers.isConstructor().and(ElementMatchers.hasDescriptor(str3)));
                    }
                    filter = declaredMethods.filter(failSafe4);
                } else if (i == 184 || i == 183) {
                    MethodList<MethodDescription.InDefinedShape> declaredMethods2 = describe.resolve().getDeclaredMethods();
                    if (this.strict) {
                        failSafe = ElementMatchers.named(str2).and(ElementMatchers.hasDescriptor(str3));
                    } else {
                        failSafe = ElementMatchers.failSafe(ElementMatchers.named(str2).and(ElementMatchers.hasDescriptor(str3)));
                    }
                    filter = declaredMethods2.filter(failSafe);
                } else {
                    MethodList<MethodDescription.InDefinedShape> declaredMethods3 = describe.resolve().getDeclaredMethods();
                    if (this.strict) {
                        failSafe2 = ElementMatchers.isPrivate().and(ElementMatchers.not(ElementMatchers.isStatic())).and(ElementMatchers.named(str2).and(ElementMatchers.hasDescriptor(str3)));
                    } else {
                        failSafe2 = ElementMatchers.failSafe(ElementMatchers.isPrivate().and(ElementMatchers.not(ElementMatchers.isStatic())).and(ElementMatchers.named(str2).and(ElementMatchers.hasDescriptor(str3))));
                    }
                    MethodList filter2 = declaredMethods3.filter(failSafe2);
                    if (filter2.isEmpty()) {
                        MethodList<?> asMethodList = this.methodGraphCompiler.compile(describe.resolve()).listNodes().asMethodList();
                        if (this.strict) {
                            failSafe3 = ElementMatchers.named(str2).and(ElementMatchers.hasDescriptor(str3));
                        } else {
                            failSafe3 = ElementMatchers.failSafe(ElementMatchers.named(str2).and(ElementMatchers.hasDescriptor(str3)));
                        }
                        filter = (MethodList) asMethodList.filter(failSafe3);
                    } else {
                        filter = filter2;
                    }
                }
                if (!filter.isEmpty()) {
                    Substitution.Resolver resolve = this.substitution.resolve((MethodDescription) filter.getOnly(), Substitution.InvocationType.of(i, (MethodDescription) filter.getOnly()));
                    if (resolve.isResolved()) {
                        TypeDescription typeDescription = this.instrumentedType;
                        ByteCodeElement byteCodeElement = (ByteCodeElement) filter.getOnly();
                        TypeList.Generic asTypeList = (((MethodDescription) filter.getOnly()).isStatic() || ((MethodDescription) filter.getOnly()).isConstructor()) ? ((MethodDescription) filter.getOnly()).getParameters().asTypeList() : new TypeList.Generic.Explicit((List<? extends TypeDefinition>) CompoundList.of(((MethodDescription) filter.getOnly()).getDeclaringType(), ((MethodDescription) filter.getOnly()).getParameters().asTypeList()));
                        if (((MethodDescription) filter.getOnly()).isConstructor()) {
                            returnType = ((MethodDescription) filter.getOnly()).getDeclaringType().asGenericType();
                        } else {
                            returnType = ((MethodDescription) filter.getOnly()).getReturnType();
                        }
                        resolve.apply(typeDescription, byteCodeElement, asTypeList, returnType).apply(this.mv, this.implementationContext);
                        if (((MethodDescription) filter.getOnly()).isConstructor()) {
                            this.stackSizeBuffer = new StackManipulation.Compound(Duplication.SINGLE.flipOver(TypeDescription.OBJECT), Removal.SINGLE, Removal.SINGLE, Duplication.SINGLE.flipOver(TypeDescription.OBJECT), Removal.SINGLE, Removal.SINGLE).apply(this.mv, this.implementationContext).getMaximalSize() + StackSize.SINGLE.getSize();
                            return;
                        }
                        return;
                    }
                } else if (this.strict) {
                    throw new IllegalStateException("Could not resolve " + str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH) + "." + str2 + str3 + " using " + this.typePool);
                }
            } else if (this.strict) {
                throw new IllegalStateException("Could not resolve " + str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH) + " using " + this.typePool);
            }
            super.visitMethodInsn(i, str, str2, str3, z);
        }

        @Override // org.modelmapper.internal.asm.MethodVisitor
        public void visitMaxs(int i, int i2) {
            super.visitMaxs(i + this.stackSizeBuffer, i2);
        }
    }
}
