package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public abstract class DescriptorVisibility {
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.Visibility getDelegate();

    public abstract java.lang.String getInternalDisplayName();

    public abstract boolean isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, boolean z);

    public abstract kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility normalize();

    protected DescriptorVisibility() {
    }

    public final boolean isPublicAPI() {
        return getDelegate().isPublicAPI();
    }

    public final java.lang.Integer compareTo(kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorVisibility, "");
        return getDelegate().compareTo(descriptorVisibility.getDelegate());
    }

    public final java.lang.String toString() {
        return getDelegate().toString();
    }
}
