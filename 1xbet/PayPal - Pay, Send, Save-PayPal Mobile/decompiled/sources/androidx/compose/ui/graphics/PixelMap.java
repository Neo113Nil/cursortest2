package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ \u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016"}, d2 = {"Landroidx/compose/ui/graphics/PixelMap;", "", "", "buffer", "", "width", "height", "bufferOffset", "stride", "<init>", "([IIIII)V", "x", "y", "Landroidx/compose/ui/graphics/Color;", "get-WaAFU9c", "(II)J", "get", "[I", "getBuffer", "()[I", com.visa.cbp.getEncExpo.warmup, "getWidth", "()I", "getHeight", "getBufferOffset", "getStride"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PixelMap {
    public static final int $stable = 8;
    private final int[] buffer;
    private final int bufferOffset;
    private final int height;
    private final int stride;
    private final int width;

    public PixelMap(int[] iArr, int i, int i2, int i3, int i4) {
        this.buffer = iArr;
        this.width = i;
        this.height = i2;
        this.bufferOffset = i3;
        this.stride = i4;
    }

    public final int[] getBuffer() {
        return this.buffer;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getBufferOffset() {
        return this.bufferOffset;
    }

    public final int getStride() {
        return this.stride;
    }

    /* renamed from: get-WaAFU9c, reason: not valid java name */
    public final long m6289getWaAFU9c(int x, int y) {
        return androidx.compose.ui.graphics.ColorKt.Color(this.buffer[this.bufferOffset + (y * this.stride) + x]);
    }
}
