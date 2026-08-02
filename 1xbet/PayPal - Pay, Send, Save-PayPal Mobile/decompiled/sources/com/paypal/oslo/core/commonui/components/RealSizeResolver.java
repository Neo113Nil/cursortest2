package com.paypal.oslo.core.commonui.components;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/RealSizeResolver;", "Lcom/paypal/oslo/core/commonui/components/SizeResolver;", "", "width", "height", "<init>", "(II)V", com.visa.cbp.getEncExpo.warmup, "getWidth", "()I", "getHeight"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RealSizeResolver extends com.paypal.oslo.core.commonui.components.SizeResolver {
    public static final int $stable = 8;
    private final int height;
    private final int width;

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public RealSizeResolver(final int i, final int i2) {
        super(new coil3.view.SizeResolver() { // from class: com.paypal.oslo.core.commonui.components.RealSizeResolver.1
            @Override // coil3.view.SizeResolver
            public final java.lang.Object size(kotlin.coroutines.Continuation<? super coil3.view.Size> continuation) {
                return coil3.view.SizeKt.Size(i, i2);
            }
        });
        this.width = i;
        this.height = i2;
    }
}
