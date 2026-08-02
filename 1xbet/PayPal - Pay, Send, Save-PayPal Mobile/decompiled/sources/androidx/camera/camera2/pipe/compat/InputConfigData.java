package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Landroidx/camera/camera2/pipe/compat/InputConfigData;", "", "", "width", "height", "format", "<init>", "(III)V", "component1", "()I", "component2", "component3", "copy", "(III)Landroidx/camera/camera2/pipe/compat/InputConfigData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getWidth", "getHeight", "getFormat"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class InputConfigData {
    private final int format;
    private final int height;
    private final int width;

    public InputConfigData(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.format = i3;
    }

    public final int getFormat() {
        return this.format;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InputConfigData(width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", format=");
        sb.append(this.format);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Integer.hashCode(this.width) * 31) + java.lang.Integer.hashCode(this.height)) * 31) + java.lang.Integer.hashCode(this.format);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.camera.camera2.pipe.compat.InputConfigData)) {
            return false;
        }
        androidx.camera.camera2.pipe.compat.InputConfigData inputConfigData = (androidx.camera.camera2.pipe.compat.InputConfigData) other;
        return this.width == inputConfigData.width && this.height == inputConfigData.height && this.format == inputConfigData.format;
    }

    public final androidx.camera.camera2.pipe.compat.InputConfigData copy(int width, int height, int format) {
        return new androidx.camera.camera2.pipe.compat.InputConfigData(width, height, format);
    }

    /* renamed from: component3, reason: from getter */
    public final int getFormat() {
        return this.format;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    public static /* synthetic */ androidx.camera.camera2.pipe.compat.InputConfigData copy$default(androidx.camera.camera2.pipe.compat.InputConfigData inputConfigData, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = inputConfigData.width;
        }
        if ((i4 & 2) != 0) {
            i2 = inputConfigData.height;
        }
        if ((i4 & 4) != 0) {
            i3 = inputConfigData.format;
        }
        return inputConfigData.copy(i, i2, i3);
    }
}
