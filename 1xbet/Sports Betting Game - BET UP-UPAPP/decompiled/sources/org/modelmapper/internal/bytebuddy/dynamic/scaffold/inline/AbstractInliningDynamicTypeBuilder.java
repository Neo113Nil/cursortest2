package org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline;

import java.util.List;
import org.modelmapper.internal.bytebuddy.ClassFileVersion;
import org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
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
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationRetention;
import org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationValueFilter;
import org.modelmapper.internal.bytebuddy.implementation.attribute.TypeAttributeAppender;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.AuxiliaryType;
import org.modelmapper.internal.bytebuddy.matcher.LatentMatcher;
import org.modelmapper.internal.bytebuddy.pool.TypePool;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public abstract class AbstractInliningDynamicTypeBuilder<T> extends DynamicType.Builder.AbstractBase.Adapter<T> {
    protected final ClassFileLocator classFileLocator;
    protected final TypeDescription originalType;

    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter
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
        AbstractInliningDynamicTypeBuilder abstractInliningDynamicTypeBuilder = (AbstractInliningDynamicTypeBuilder) obj;
        return this.originalType.equals(abstractInliningDynamicTypeBuilder.originalType) && this.classFileLocator.equals(abstractInliningDynamicTypeBuilder.classFileLocator);
    }

    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter
    public int hashCode() {
        return (((super.hashCode() * 31) + this.originalType.hashCode()) * 31) + this.classFileLocator.hashCode();
    }

    protected AbstractInliningDynamicTypeBuilder(InstrumentedType.WithFlexibleName withFlexibleName, FieldRegistry fieldRegistry, MethodRegistry methodRegistry, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, ClassFileVersion classFileVersion, AuxiliaryType.NamingStrategy namingStrategy, AnnotationValueFilter.Factory factory, AnnotationRetention annotationRetention, Implementation.Context.Factory factory2, MethodGraph.Compiler compiler, TypeValidation typeValidation, ClassWriterStrategy classWriterStrategy, LatentMatcher<? super MethodDescription> latentMatcher, List<? extends DynamicType> list, TypeDescription typeDescription, ClassFileLocator classFileLocator) {
        super(withFlexibleName, fieldRegistry, methodRegistry, typeAttributeAppender, asmVisitorWrapper, classFileVersion, namingStrategy, factory, annotationRetention, factory2, compiler, typeValidation, classWriterStrategy, latentMatcher, list);
        this.originalType = typeDescription;
        this.classFileLocator = classFileLocator;
    }

    @Override // org.modelmapper.internal.bytebuddy.dynamic.DynamicType.Builder
    public DynamicType.Unloaded<T> make(TypeResolutionStrategy typeResolutionStrategy) {
        return make(typeResolutionStrategy, TypePool.Default.of(this.classFileLocator));
    }
}
