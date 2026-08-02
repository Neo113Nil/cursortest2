package coil3;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0014R\u0014\u0010%\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0014"}, d2 = {"Lcoil3/BitmapImage;", "Lcoil3/Image;", "Landroid/graphics/Bitmap;", "bitmap", "", "shareable", "<init>", "(Landroid/graphics/Bitmap;Z)V", "Landroid/graphics/Canvas;", "Lcoil3/getHighSpeedVideoFpsRanges;", "canvas", "", "draw", "(Landroid/graphics/Canvas;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "Z", "getShareable", "()Z", "", "getSize", "()J", io.ktor.http.ContentDisposition.Parameters.Size, "getWidth", "width", "getHeight", "height"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BitmapImage implements coil3.Image {
    private final android.graphics.Bitmap bitmap;
    private final boolean shareable;

    public BitmapImage(android.graphics.Bitmap bitmap, boolean z) {
        this.bitmap = bitmap;
        this.shareable = z;
    }

    public final android.graphics.Bitmap getBitmap() {
        return this.bitmap;
    }

    @Override // coil3.Image
    public final boolean getShareable() {
        return this.shareable;
    }

    @Override // coil3.Image
    public final long getSize() {
        return coil3.content.Bitmap.getAllocationByteCountCompat(this.bitmap);
    }

    @Override // coil3.Image
    public final int getWidth() {
        return this.bitmap.getWidth();
    }

    @Override // coil3.Image
    public final int getHeight() {
        return this.bitmap.getHeight();
    }

    @Override // coil3.Image
    public final void draw(android.graphics.Canvas canvas) {
        canvas.drawBitmap(this.bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
    }

    public final java.lang.String toString() {
        android.graphics.Bitmap bitmap = this.bitmap;
        boolean z = this.shareable;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BitmapImage(bitmap=");
        sb.append(bitmap);
        sb.append(", shareable=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.bitmap.hashCode() * 31) + java.lang.Boolean.hashCode(this.shareable);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof coil3.BitmapImage)) {
            return false;
        }
        coil3.BitmapImage bitmapImage = (coil3.BitmapImage) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.bitmap, bitmapImage.bitmap) && this.shareable == bitmapImage.shareable;
    }
}
