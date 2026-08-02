package com.paypal.oslo.core.commonui.components;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/Size;", "", "", "width", "height", "<init>", "(II)V", "Lcoil3/size/Size;", "toCoilSize$common_ui_release", "()Lcoil3/size/Size;", com.visa.cbp.getEncExpo.warmup, "getWidth", "()I", "getHeight"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Size {
    public static final int $stable = 0;
    private final int height;
    private final int width;

    public Size(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final coil3.view.Size toCoilSize$common_ui_release() {
        return coil3.view.SizeKt.Size(this.width, this.height);
    }
}
