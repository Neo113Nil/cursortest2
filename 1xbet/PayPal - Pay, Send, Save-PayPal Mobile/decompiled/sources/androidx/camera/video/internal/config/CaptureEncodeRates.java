package androidx.camera.video.internal.config;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\bJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Landroidx/camera/video/internal/config/CaptureEncodeRates;", "", "", "captureRate", "encodeRate", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Landroidx/camera/video/internal/config/CaptureEncodeRates;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getCaptureRate", "getEncodeRate"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CaptureEncodeRates {
    private final int captureRate;
    private final int encodeRate;

    public CaptureEncodeRates(int i, int i2) {
        this.captureRate = i;
        this.encodeRate = i2;
    }

    public final int getCaptureRate() {
        return this.captureRate;
    }

    public final int getEncodeRate() {
        return this.encodeRate;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CaptureEncodeRates(captureRate=");
        sb.append(this.captureRate);
        sb.append(", encodeRate=");
        sb.append(this.encodeRate);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Integer.hashCode(this.captureRate) * 31) + java.lang.Integer.hashCode(this.encodeRate);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.camera.video.internal.config.CaptureEncodeRates)) {
            return false;
        }
        androidx.camera.video.internal.config.CaptureEncodeRates captureEncodeRates = (androidx.camera.video.internal.config.CaptureEncodeRates) other;
        return this.captureRate == captureEncodeRates.captureRate && this.encodeRate == captureEncodeRates.encodeRate;
    }

    public final androidx.camera.video.internal.config.CaptureEncodeRates copy(int captureRate, int encodeRate) {
        return new androidx.camera.video.internal.config.CaptureEncodeRates(captureRate, encodeRate);
    }

    /* renamed from: component2, reason: from getter */
    public final int getEncodeRate() {
        return this.encodeRate;
    }

    /* renamed from: component1, reason: from getter */
    public final int getCaptureRate() {
        return this.captureRate;
    }

    public static /* synthetic */ androidx.camera.video.internal.config.CaptureEncodeRates copy$default(androidx.camera.video.internal.config.CaptureEncodeRates captureEncodeRates, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = captureEncodeRates.captureRate;
        }
        if ((i3 & 2) != 0) {
            i2 = captureEncodeRates.encodeRate;
        }
        return captureEncodeRates.copy(i, i2);
    }
}
