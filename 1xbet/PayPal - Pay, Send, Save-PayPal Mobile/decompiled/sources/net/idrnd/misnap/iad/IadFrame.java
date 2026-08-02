package net.idrnd.misnap.iad;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lnet/idrnd/misnap/iad/IadFrame;", "", "Landroid/graphics/YuvImage;", "yuvImage", "", "imageInfoTimestamp", "", "imageInfoRotationDegrees", "<init>", "(Landroid/graphics/YuvImage;JI)V", "a", "Landroid/graphics/YuvImage;", "getYuvImage", "()Landroid/graphics/YuvImage;", util.h.xy.cb.b.f1091, "J", "getImageInfoTimestamp", "()J", "c", com.visa.cbp.getEncExpo.warmup, "getImageInfoRotationDegrees", "()I"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes17.dex */
public final class IadFrame {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final android.graphics.YuvImage yuvImage;

    /* renamed from: b, reason: from kotlin metadata */
    public final long imageInfoTimestamp;

    /* renamed from: c, reason: from kotlin metadata */
    public final int imageInfoRotationDegrees;

    public IadFrame(android.graphics.YuvImage yuvImage, long j, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yuvImage, "");
        this.yuvImage = yuvImage;
        this.imageInfoTimestamp = j;
        this.imageInfoRotationDegrees = i;
    }

    public final int getImageInfoRotationDegrees() {
        return this.imageInfoRotationDegrees;
    }

    public final long getImageInfoTimestamp() {
        return this.imageInfoTimestamp;
    }

    public final android.graphics.YuvImage getYuvImage() {
        return this.yuvImage;
    }
}
