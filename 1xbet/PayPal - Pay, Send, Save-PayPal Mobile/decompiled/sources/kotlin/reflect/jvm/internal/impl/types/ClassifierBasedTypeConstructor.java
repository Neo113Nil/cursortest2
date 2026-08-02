package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public abstract class ClassifierBasedTypeConstructor implements kotlin.reflect.jvm.internal.impl.types.TypeConstructor {
    private int Camera2StreamConfigurationMap;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: getDeclarationDescriptor */
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor();

    protected abstract boolean isSameClassifier(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor);

    public int hashCode() {
        int identityHashCode;
        int i = this.Camera2StreamConfigurationMap;
        if (i != 0) {
            return i;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = mo23898getDeclarationDescriptor();
        if (!kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.isError(mo23898getDeclarationDescriptor) && !kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isLocal(mo23898getDeclarationDescriptor)) {
            identityHashCode = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqName(mo23898getDeclarationDescriptor).hashCode();
        } else {
            identityHashCode = java.lang.System.identityHashCode(this);
        }
        this.Camera2StreamConfigurationMap = identityHashCode;
        return identityHashCode;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) || obj.hashCode() != hashCode()) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = (kotlin.reflect.jvm.internal.impl.types.TypeConstructor) obj;
        if (typeConstructor.getParameters().size() != getParameters().size()) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = mo23898getDeclarationDescriptor();
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor2 = typeConstructor.mo23898getDeclarationDescriptor();
        if (mo23898getDeclarationDescriptor2 == null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor = mo23898getDeclarationDescriptor;
        if (!kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.isError(classifierDescriptor) && !kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isLocal(classifierDescriptor)) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor2 = mo23898getDeclarationDescriptor2;
            if (!kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.isError(classifierDescriptor2) && !kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isLocal(classifierDescriptor2)) {
                return isSameClassifier(mo23898getDeclarationDescriptor2);
            }
        }
        return false;
    }

    protected final boolean areFqNamesEqual(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classifierDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classifierDescriptor2, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(classifierDescriptor.getName(), classifierDescriptor2.getName())) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = classifierDescriptor.getContainingDeclaration();
        for (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration2 = classifierDescriptor2.getContainingDeclaration(); containingDeclaration != null && containingDeclaration2 != null; containingDeclaration2 = containingDeclaration2.getContainingDeclaration()) {
            if (containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor) {
                return containingDeclaration2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
            }
            if (containingDeclaration2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor) {
                return false;
            }
            if (containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) {
                return (containingDeclaration2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) && kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) containingDeclaration).getFqName(), ((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) containingDeclaration2).getFqName());
            }
            if ((containingDeclaration2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) || !kotlin.jvm.internal.Intrinsics.areEqual(containingDeclaration.getName(), containingDeclaration2.getName())) {
                return false;
            }
            containingDeclaration = containingDeclaration.getContainingDeclaration();
        }
        return true;
    }
}
