package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public abstract class DelegatedDescriptorVisibility extends kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility {
    private final kotlin.reflect.jvm.internal.impl.descriptors.Visibility getHighResolutionOutputSizeshNQ4ISI;

    public DelegatedDescriptorVisibility(kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visibility, "");
        this.getHighResolutionOutputSizeshNQ4ISI = visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    public kotlin.reflect.jvm.internal.impl.descriptors.Visibility getDelegate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    public java.lang.String getInternalDisplayName() {
        return getDelegate().getInternalDisplayName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    public kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility normalize() {
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.toDescriptorVisibility(getDelegate().normalize());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(descriptorVisibility, "");
        return descriptorVisibility;
    }
}
