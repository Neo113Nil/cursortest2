package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public abstract class AbstractLazyTypeParameterDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractLazyTypeParameterDescriptor(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.types.Variance variance, boolean z, int i, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker supertypeLoopChecker) {
        super(storageManager, declarationDescriptor, annotations, name2, variance, z, i, sourceElement, supertypeLoopChecker);
        if (storageManager == null) {
            getHighSpeedVideoFpsRangesFor(0);
        }
        if (declarationDescriptor == null) {
            getHighSpeedVideoFpsRangesFor(1);
        }
        if (annotations == null) {
            getHighSpeedVideoFpsRangesFor(2);
        }
        if (name2 == null) {
            getHighSpeedVideoFpsRangesFor(3);
        }
        if (variance == null) {
            getHighSpeedVideoFpsRangesFor(4);
        }
        if (sourceElement == null) {
            getHighSpeedVideoFpsRangesFor(5);
        }
        if (supertypeLoopChecker == null) {
            getHighSpeedVideoFpsRangesFor(6);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public java.lang.String toString() {
        java.lang.String str = "";
        java.lang.String str2 = isReified() ? "reified " : "";
        if (getVariance() != kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getVariance());
            sb.append(" ");
            str = sb.toString();
        }
        return java.lang.String.format("%s%s%s", str2, str, getName());
    }

    private static /* synthetic */ void getHighSpeedVideoFpsRangesFor(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
