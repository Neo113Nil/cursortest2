package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes5.dex */
public final class DescriptorRendererOptionsImpl$property$$inlined$vetoable$1<T> extends kotlin.properties.ObservableProperty<T> {
    final /* synthetic */ kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(java.lang.Object obj, kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        super(obj);
        this.getHighSpeedVideoSizes = descriptorRendererOptionsImpl;
    }

    @Override // kotlin.properties.ObservableProperty
    public final boolean beforeChange(kotlin.reflect.KProperty<?> kProperty, T t, T t2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "");
        if (this.getHighSpeedVideoSizes.isLocked()) {
            throw new java.lang.IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
        return true;
    }
}
