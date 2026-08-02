package coil3;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\t\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'"}, d2 = {"Lcoil3/ColorImage;", "Lcoil3/Image;", "", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "width", "height", "", io.ktor.http.ContentDisposition.Parameters.Size, "", "shareable", "<init>", "(IIIJZ)V", "Landroid/graphics/Canvas;", "Lcoil3/getHighSpeedVideoFpsRanges;", "canvas", "", "draw", "(Landroid/graphics/Canvas;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getColor", "getWidth", "getHeight", "J", "getSize", "()J", "Z", "getShareable", "()Z", "Landroid/graphics/Paint;", "getHighSpeedVideoFpsRanges", "Landroid/graphics/Paint;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ColorImage implements coil3.Image {
    private final int color;
    private android.graphics.Paint getHighSpeedVideoFpsRanges;
    private final int height;
    private final boolean shareable;
    private final long size;
    private final int width;

    public ColorImage(int i, int i2, int i3, long j, boolean z) {
        this.color = i;
        this.width = i2;
        this.height = i3;
        this.size = j;
        this.shareable = z;
    }

    public /* synthetic */ ColorImage(int i, int i2, int i3, long j, boolean z, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -16777216 : i, (i4 & 2) != 0 ? -1 : i2, (i4 & 4) == 0 ? i3 : -1, (i4 & 8) != 0 ? 0L : j, (i4 & 16) != 0 ? true : z);
    }

    public final int getColor() {
        return this.color;
    }

    @Override // coil3.Image
    public final int getWidth() {
        return this.width;
    }

    @Override // coil3.Image
    public final int getHeight() {
        return this.height;
    }

    @Override // coil3.Image
    public final long getSize() {
        return this.size;
    }

    @Override // coil3.Image
    public final boolean getShareable() {
        return this.shareable;
    }

    @Override // coil3.Image
    public final void draw(android.graphics.Canvas canvas) {
        android.graphics.Paint paint = this.getHighSpeedVideoFpsRanges;
        if (paint == null) {
            paint = new android.graphics.Paint();
            paint.setColor(this.color);
            this.getHighSpeedVideoFpsRanges = paint;
        }
        android.graphics.Paint paint2 = paint;
        if (getWidth() >= 0 && getHeight() >= 0) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint2);
        } else {
            canvas.drawPaint(paint2);
        }
    }

    public final java.lang.String toString() {
        int i = this.color;
        int i2 = this.width;
        int i3 = this.height;
        long j = this.size;
        boolean z = this.shareable;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ColorImage(color=");
        sb.append(i);
        sb.append(", width=");
        sb.append(i2);
        sb.append(", height=");
        sb.append(i3);
        sb.append(", size=");
        sb.append(j);
        sb.append(", shareable=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.color * 31) + this.width) * 31) + this.height) * 31) + java.lang.Long.hashCode(this.size)) * 31) + java.lang.Boolean.hashCode(this.shareable);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof coil3.ColorImage)) {
            return false;
        }
        coil3.ColorImage colorImage = (coil3.ColorImage) other;
        return this.color == colorImage.color && this.width == colorImage.width && this.height == colorImage.height && this.size == colorImage.size && this.shareable == colorImage.shareable;
    }

    public ColorImage() {
        this(0, 0, 0, 0L, false, 31, null);
    }
}
