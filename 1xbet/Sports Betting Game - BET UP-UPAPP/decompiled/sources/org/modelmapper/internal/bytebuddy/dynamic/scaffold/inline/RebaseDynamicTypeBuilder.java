package org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.modelmapper.internal.bytebuddy.ClassFileVersion;
import org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodList;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator;
import org.modelmapper.internal.bytebuddy.dynamic.DynamicType;
import org.modelmapper.internal.bytebuddy.dynamic.TypeResolutionStrategy;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.ClassWriterStrategy;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldRegistry;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodRegistry;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeValidation;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationRetention;
import org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationValueFilter;
import org.modelmapper.internal.bytebuddy.implementation.attribute.TypeAttributeAppender;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.AuxiliaryType;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;
import org.modelmapper.internal.bytebuddy.matcher.LatentMatcher;
import org.modelmapper.internal.bytebuddy.pool.TypePool;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class RebaseDynamicTypeBuilder<T> extends AbstractInliningDynamicTypeBuilder<T> {
    private final MethodNameTransformer methodNameTransformer;

    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.AbstractInliningDynamicTypeBuilder, org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.methodNameTransformer.equals(((RebaseDynamicTypeBuilder) obj).methodNameTransformer);
    }

    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.AbstractInliningDynamicTypeBuilder, org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter
    public int hashCode() {
        return (super.hashCode() * 31) + this.methodNameTransformer.hashCode();
    }

    public RebaseDynamicTypeBuilder(InstrumentedType.WithFlexibleName withFlexibleName, ClassFileVersion classFileVersion, AuxiliaryType.NamingStrategy namingStrategy, AnnotationValueFilter.Factory factory, AnnotationRetention annotationRetention, Implementation.Context.Factory factory2, MethodGraph.Compiler compiler, TypeValidation typeValidation, ClassWriterStrategy classWriterStrategy, LatentMatcher<? super MethodDescription> latentMatcher, TypeDescription typeDescription, ClassFileLocator classFileLocator, MethodNameTransformer methodNameTransformer) {
        this(withFlexibleName, new FieldRegistry.Default(), new MethodRegistry.Default(), annotationRetention.isEnabled() ? new TypeAttributeAppender.ForInstrumentedType.Differentiating(typeDescription) : TypeAttributeAppender.ForInstrumentedType.INSTANCE, AsmVisitorWrapper.NoOp.INSTANCE, classFileVersion, namingStrategy, factory, annotationRetention, factory2, compiler, typeValidation, classWriterStrategy, latentMatcher, Collections.emptyList(), typeDescription, classFileLocator, methodNameTransformer);
    }

    protected RebaseDynamicTypeBuilder(InstrumentedType.WithFlexibleName withFlexibleName, FieldRegistry fieldRegistry, MethodRegistry methodRegistry, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, ClassFileVersion classFileVersion, AuxiliaryType.NamingStrategy namingStrategy, AnnotationValueFilter.Factory factory, AnnotationRetention annotationRetention, Implementation.Context.Factory factory2, MethodGraph.Compiler compiler, TypeValidation typeValidation, ClassWriterStrategy classWriterStrategy, LatentMatcher<? super MethodDescription> latentMatcher, List<? extends DynamicType> list, TypeDescription typeDescription, ClassFileLocator classFileLocator, MethodNameTransformer methodNameTransformer) {
        super(withFlexibleName, fieldRegistry, methodRegistry, typeAttributeAppender, asmVisitorWrapper, classFileVersion, namingStrategy, factory, annotationRetention, factory2, compiler, typeValidation, classWriterStrategy, latentMatcher, list, typeDescription, classFileLocator);
        this.methodNameTransformer = methodNameTransformer;
    }

    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter
    protected DynamicType.Builder<T> materialize(InstrumentedType.WithFlexibleName withFlexibleName, FieldRegistry fieldRegistry, MethodRegistry methodRegistry, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, ClassFileVersion classFileVersion, AuxiliaryType.NamingStrategy namingStrategy, AnnotationValueFilter.Factory factory, AnnotationRetention annotationRetention, Implementation.Context.Factory factory2, MethodGraph.Compiler compiler, TypeValidation typeValidation, ClassWriterStrategy classWriterStrategy, LatentMatcher<? super MethodDescription> latentMatcher, List<? extends DynamicType> list) {
        return new RebaseDynamicTypeBuilder(withFlexibleName, fieldRegistry, methodRegistry, typeAttributeAppender, asmVisitorWrapper, classFileVersion, namingStrategy, factory, annotationRetention, factory2, compiler, typeValidation, classWriterStrategy, latentMatcher, list, this.originalType, this.classFileLocator, this.methodNameTransformer);
    }

    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
    public DynamicType.Unloaded<T> make(TypeResolutionStrategy typeResolutionStrategy, TypePool typePool) {
        MethodRegistry.Prepared prepare = this.methodRegistry.prepare(this.instrumentedType, this.methodGraphCompiler, this.typeValidation, InliningImplementationMatcher.of(this.ignoredMethods, this.originalType));
        return TypeWriter.Default.forRebasing(prepare, this.auxiliaryTypes, this.fieldRegistry.compile(prepare.getInstrumentedType()), this.typeAttributeAppender, this.asmVisitorWrapper, this.classFileVersion, this.annotationValueFilterFactory, this.annotationRetention, this.auxiliaryTypeNamingStrategy, this.implementationContextFactory, this.typeValidation, this.classWriterStrategy, typePool, this.originalType, this.classFileLocator, MethodRebaseResolver.Default.make(prepare.getInstrumentedType(), new HashSet(this.originalType.getDeclaredMethods().asTokenList(ElementMatchers.is(this.originalType)).filter(RebaseableMatcher.of(prepare.getInstrumentedType(), prepare.getInstrumentedMethods()))), this.classFileVersion, this.auxiliaryTypeNamingStrategy, this.methodNameTransformer)).make(typeResolutionStrategy.resolve());
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class RebaseableMatcher implements ElementMatcher<MethodDescription.Token> {
        private final Set<MethodDescription.Token> tokens;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.tokens.equals(((RebaseableMatcher) obj).tokens);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.tokens.hashCode();
        }

        protected RebaseableMatcher(Set<MethodDescription.Token> set) {
            this.tokens = set;
        }

        protected static ElementMatcher<MethodDescription.Token> of(TypeDescription typeDescription, MethodList<?> methodList) {
            return new RebaseableMatcher(new HashSet(methodList.asTokenList(ElementMatchers.is(typeDescription))));
        }

        @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
        public boolean matches(MethodDescription.Token token) {
            return this.tokens.contains(token);
        }
    }
}
