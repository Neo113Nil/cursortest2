package org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass;

import org.modelmapper.internal.bytebuddy.ClassFileVersion;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodList;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class SubclassImplementationTarget extends Implementation.Target.AbstractBase {
    protected final OriginTypeResolver originTypeResolver;

    public enum OriginTypeResolver {
        SUPER_CLASS { // from class: org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.OriginTypeResolver.1
            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.OriginTypeResolver
            protected TypeDefinition identify(TypeDescription typeDescription) {
                return typeDescription.getSuperClass();
            }
        },
        LEVEL_TYPE { // from class: org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.OriginTypeResolver.2
            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.OriginTypeResolver
            protected TypeDefinition identify(TypeDescription typeDescription) {
                return typeDescription;
            }
        };

        protected abstract TypeDefinition identify(TypeDescription typeDescription);
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Target.AbstractBase
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.originTypeResolver.equals(((SubclassImplementationTarget) obj).originTypeResolver);
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Target.AbstractBase
    public int hashCode() {
        return (super.hashCode() * 31) + this.originTypeResolver.hashCode();
    }

    protected SubclassImplementationTarget(TypeDescription typeDescription, MethodGraph.Linked linked, Implementation.Target.AbstractBase.DefaultMethodInvocation defaultMethodInvocation, OriginTypeResolver originTypeResolver) {
        super(typeDescription, linked, defaultMethodInvocation);
        this.originTypeResolver = originTypeResolver;
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Target
    public Implementation.SpecialMethodInvocation invokeSuper(MethodDescription.SignatureToken signatureToken) {
        if (signatureToken.getName().equals(MethodDescription.CONSTRUCTOR_INTERNAL_NAME)) {
            return invokeConstructor(signatureToken);
        }
        return invokeMethod(signatureToken);
    }

    private Implementation.SpecialMethodInvocation invokeConstructor(MethodDescription.SignatureToken signatureToken) {
        MethodList filter;
        TypeDescription.Generic superClass = this.instrumentedType.getSuperClass();
        if (superClass == null) {
            filter = new MethodList.Empty();
        } else {
            filter = superClass.getDeclaredMethods().filter(ElementMatchers.hasSignature(signatureToken).and(ElementMatchers.isVisibleTo(this.instrumentedType)));
        }
        return filter.size() == 1 ? Implementation.SpecialMethodInvocation.Simple.of((MethodDescription) filter.getOnly(), this.instrumentedType.getSuperClass().asErasure()) : Implementation.SpecialMethodInvocation.Illegal.INSTANCE;
    }

    private Implementation.SpecialMethodInvocation invokeMethod(MethodDescription.SignatureToken signatureToken) {
        MethodGraph.Node locate = this.methodGraph.getSuperClassGraph().locate(signatureToken);
        return locate.getSort().isUnique() ? Implementation.SpecialMethodInvocation.Simple.of(locate.getRepresentative(), this.instrumentedType.getSuperClass().asErasure()) : Implementation.SpecialMethodInvocation.Illegal.INSTANCE;
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Target
    public TypeDefinition getOriginType() {
        return this.originTypeResolver.identify(this.instrumentedType);
    }

    public enum Factory implements Implementation.Target.Factory {
        SUPER_CLASS(OriginTypeResolver.SUPER_CLASS),
        LEVEL_TYPE(OriginTypeResolver.LEVEL_TYPE);

        private final OriginTypeResolver originTypeResolver;

        Factory(OriginTypeResolver originTypeResolver) {
            this.originTypeResolver = originTypeResolver;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Target.Factory
        public Implementation.Target make(TypeDescription typeDescription, MethodGraph.Linked linked, ClassFileVersion classFileVersion) {
            return new SubclassImplementationTarget(typeDescription, linked, Implementation.Target.AbstractBase.DefaultMethodInvocation.of(classFileVersion), this.originTypeResolver);
        }
    }
}
