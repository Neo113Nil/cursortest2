package coil3;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001&B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0014R\u0014\u0010%\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0014"}, d2 = {"Lcoil3/DrawableImage;", "Lcoil3/Image;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "shareable", "<init>", "(Landroid/graphics/drawable/Drawable;Z)V", "Landroid/graphics/Canvas;", "Lcoil3/getHighSpeedVideoFpsRanges;", "canvas", "", "draw", "(Landroid/graphics/Canvas;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "Z", "getShareable", "()Z", "", "getSize", "()J", io.ktor.http.ContentDisposition.Parameters.Size, "getWidth", "width", "getHeight", "height", "SizeProvider"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DrawableImage implements coil3.Image {
    private final android.graphics.drawable.Drawable drawable;
    private final boolean shareable;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcoil3/DrawableImage$SizeProvider;", "", "", "getSize", "()J", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface SizeProvider {
        long getSize();
    }

    public DrawableImage(android.graphics.drawable.Drawable drawable, boolean z) {
        this.drawable = drawable;
        this.shareable = z;
    }

    public final android.graphics.drawable.Drawable getDrawable() {
        return this.drawable;
    }

    @Override // coil3.Image
    public final boolean getShareable() {
        return this.shareable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // coil3.Image
    public final long getSize() {
        long width;
        android.graphics.drawable.Drawable drawable = this.drawable;
        if (drawable instanceof coil3.DrawableImage.SizeProvider) {
            width = ((coil3.DrawableImage.SizeProvider) drawable).getSize();
        } else {
            width = coil3.content.Utils_androidKt.getWidth(drawable) * 4 * coil3.content.Utils_androidKt.getHeight(this.drawable);
        }
        return kotlin.ranges.RangesKt.coerceAtLeast(width, 0L);
    }

    @Override // coil3.Image
    public final int getWidth() {
        return coil3.content.Utils_androidKt.getWidth(this.drawable);
    }

    @Override // coil3.Image
    public final int getHeight() {
        return coil3.content.Utils_androidKt.getHeight(this.drawable);
    }

    @Override // coil3.Image
    public final void draw(android.graphics.Canvas canvas) {
        this.drawable.draw(canvas);
    }

    public final java.lang.String toString() {
        android.graphics.drawable.Drawable drawable = this.drawable;
        boolean z = this.shareable;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DrawableImage(drawable=");
        sb.append(drawable);
        sb.append(", shareable=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.drawable.hashCode() * 31) + java.lang.Boolean.hashCode(this.shareable);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof coil3.DrawableImage)) {
            return false;
        }
        coil3.DrawableImage drawableImage = (coil3.DrawableImage) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.drawable, drawableImage.drawable) && this.shareable == drawableImage.shareable;
    }
}
