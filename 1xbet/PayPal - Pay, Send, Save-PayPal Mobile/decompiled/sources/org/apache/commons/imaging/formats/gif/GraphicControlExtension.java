package org.apache.commons.imaging.formats.gif;

/* loaded from: classes17.dex */
class GraphicControlExtension extends org.apache.commons.imaging.formats.gif.GifBlock {
    public final int delay;
    public final int dispose;
    public final int packed;
    public final boolean transparency;
    public final int transparentColorIndex;

    GraphicControlExtension(int i, int i2, int i3, boolean z, int i4, int i5) {
        super(i);
        this.packed = i2;
        this.dispose = i3;
        this.transparency = z;
        this.delay = i4;
        this.transparentColorIndex = i5;
    }
}
