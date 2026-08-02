package org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.modelmapper.internal.bytebuddy.ClassFileVersion;
import org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.DynamicType;
import org.modelmapper.internal.bytebuddy.dynamic.TypeResolutionStrategy;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.ClassWriterStrategy;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldRegistry;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodRegistry;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeValidation;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget;
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
public class SubclassDynamicTypeBuilder<T> extends DynamicType.Builder.AbstractBase.Adapter<T> {
    private final ConstructorStrategy constructorStrategy;

    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.constructorStrategy.equals(((SubclassDynamicTypeBuilder) obj).constructorStrategy);
    }

    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter
    public int hashCode() {
        return (super.hashCode() * 31) + this.constructorStrategy.hashCode();
    }

    public SubclassDynamicTypeBuilder(InstrumentedType.WithFlexibleName withFlexibleName, ClassFileVersion classFileVersion, AuxiliaryType.NamingStrategy namingStrategy, AnnotationValueFilter.Factory factory, AnnotationRetention annotationRetention, Implementation.Context.Factory factory2, MethodGraph.Compiler compiler, TypeValidation typeValidation, ClassWriterStrategy classWriterStrategy, LatentMatcher<? super MethodDescription> latentMatcher, ConstructorStrategy constructorStrategy) {
        this(withFlexibleName, new FieldRegistry.Default(), new MethodRegistry.Default(), TypeAttributeAppender.ForInstrumentedType.INSTANCE, AsmVisitorWrapper.NoOp.INSTANCE, classFileVersion, namingStrategy, factory, annotationRetention, factory2, compiler, typeValidation, classWriterStrategy, latentMatcher, Collections.emptyList(), constructorStrategy);
    }

    protected SubclassDynamicTypeBuilder(InstrumentedType.WithFlexibleName withFlexibleName, FieldRegistry fieldRegistry, MethodRegistry methodRegistry, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, ClassFileVersion classFileVersion, AuxiliaryType.NamingStrategy namingStrategy, AnnotationValueFilter.Factory factory, AnnotationRetention annotationRetention, Implementation.Context.Factory factory2, MethodGraph.Compiler compiler, TypeValidation typeValidation, ClassWriterStrategy classWriterStrategy, LatentMatcher<? super MethodDescription> latentMatcher, List<? extends DynamicType> list, ConstructorStrategy constructorStrategy) {
        super(withFlexibleName, fieldRegistry, methodRegistry, typeAttributeAppender, asmVisitorWrapper, classFileVersion, namingStrategy, factory, annotationRetention, factory2, compiler, typeValidation, classWriterStrategy, latentMatcher, list);
        this.constructorStrategy = constructorStrategy;
    }

    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter
    protected DynamicType.Builder<T> materialize(InstrumentedType.WithFlexibleName withFlexibleName, FieldRegistry fieldRegistry, MethodRegistry methodRegistry, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, ClassFileVersion classFileVersion, AuxiliaryType.NamingStrategy namingStrategy, AnnotationValueFilter.Factory factory, AnnotationRetention annotationRetention, Implementation.Context.Factory factory2, MethodGraph.Compiler compiler, TypeValidation typeValidation, ClassWriterStrategy classWriterStrategy, LatentMatcher<? super MethodDescription> latentMatcher, List<? extends DynamicType> list) {
        return new SubclassDynamicTypeBuilder(withFlexibleName, fieldRegistry, methodRegistry, typeAttributeAppender, asmVisitorWrapper, classFileVersion, namingStrategy, factory, annotationRetention, factory2, compiler, typeValidation, classWriterStrategy, latentMatcher, list, this.constructorStrategy);
    }

    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
    public DynamicType.Unloaded<T> make(TypeResolutionStrategy typeResolutionStrategy) {
        return make(typeResolutionStrategy, TypePool.ClassLoading.ofClassPath());
    }

    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
    public DynamicType.Unloaded<T> make(TypeResolutionStrategy typeResolutionStrategy, TypePool typePool) {
        MethodRegistry.Compiled compile = this.constructorStrategy.inject(this.instrumentedType, this.methodRegistry).prepare(applyConstructorStrategy(this.instrumentedType), this.methodGraphCompiler, this.typeValidation, new InstrumentableMatcher(this.ignoredMethods)).compile(SubclassImplementationTarget.Factory.SUPER_CLASS, this.classFileVersion);
        return TypeWriter.Default.forCreation(compile, this.auxiliaryTypes, this.fieldRegistry.compile(compile.getInstrumentedType()), this.typeAttributeAppender, this.asmVisitorWrapper, this.classFileVersion, this.annotationValueFilterFactory, this.annotationRetention, this.auxiliaryTypeNamingStrategy, this.implementationContextFactory, this.typeValidation, this.classWriterStrategy, typePool).make(typeResolutionStrategy.resolve());
    }

    private InstrumentedType applyConstructorStrategy(InstrumentedType instrumentedType) {
        if (!instrumentedType.isInterface()) {
            Iterator<MethodDescription.Token> it = this.constructorStrategy.extractConstructors(instrumentedType).iterator();
            while (it.hasNext()) {
                instrumentedType = instrumentedType.withMethod(it.next());
            }
        }
        return instrumentedType;
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class InstrumentableMatcher implements LatentMatcher<MethodDescription> {
        private final LatentMatcher<? super MethodDescription> ignoredMethods;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.ignoredMethods.equals(((InstrumentableMatcher) obj).ignoredMethods);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.ignoredMethods.hashCode();
        }

        protected InstrumentableMatcher(LatentMatcher<? super MethodDescription> latentMatcher) {
            this.ignoredMethods = latentMatcher;
        }

        @Override // org.modelmapper.internal.bytebuddy.matcher.LatentMatcher
        public ElementMatcher<? super MethodDescription> resolve(TypeDescription typeDescription) {
            return ElementMatchers.isVirtual().and(ElementMatchers.not(ElementMatchers.isFinal())).and(ElementMatchers.isVisibleTo(typeDescription)).and(ElementMatchers.not(this.ignoredMethods.resolve(typeDescription))).or(ElementMatchers.isDeclaredBy(typeDescription));
        }
    }
}
