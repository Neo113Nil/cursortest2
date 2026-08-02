package com.paypal.oslo.core.commonui.components;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/SizeResolver;", "", "Lcoil3/size/SizeResolver;", "delegate", "<init>", "(Lcoil3/size/SizeResolver;)V", "Lcoil3/size/SizeResolver;", "getDelegate$common_ui_release", "()Lcoil3/size/SizeResolver;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public class SizeResolver {
    public static final int $stable = 8;
    private final coil3.view.SizeResolver delegate;

    public SizeResolver(coil3.view.SizeResolver sizeResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sizeResolver, "");
        this.delegate = sizeResolver;
    }

    /* renamed from: getDelegate$common_ui_release, reason: from getter */
    public final coil3.view.SizeResolver getDelegate() {
        return this.delegate;
    }
}
