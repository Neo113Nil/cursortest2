package coil3.svg;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!"}, d2 = {"Lcoil3/svg/SvgImage;", "Lcoil3/Image;", "Lcom/caverock/androidsvg/SVG;", "svg", "Lcom/caverock/androidsvg/RenderOptions;", "renderOptions", "", "width", "height", "<init>", "(Lcom/caverock/androidsvg/SVG;Lcom/caverock/androidsvg/RenderOptions;II)V", "Landroid/graphics/Canvas;", "Lcoil3/getHighSpeedVideoFpsRanges;", "canvas", "", "draw", "(Landroid/graphics/Canvas;)V", "Lcom/caverock/androidsvg/SVG;", "getSvg", "()Lcom/caverock/androidsvg/SVG;", "Lcom/caverock/androidsvg/RenderOptions;", "getRenderOptions", "()Lcom/caverock/androidsvg/RenderOptions;", com.visa.cbp.getEncExpo.warmup, "getWidth", "()I", "getHeight", "", "getSize", "()J", io.ktor.http.ContentDisposition.Parameters.Size, "", "getShareable", "()Z", "shareable"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SvgImage implements coil3.Image {
    private final int height;
    private final com.caverock.androidsvg.RenderOptions renderOptions;
    private final com.caverock.androidsvg.SVG svg;
    private final int width;

    @Override // coil3.Image
    public final boolean getShareable() {
        return true;
    }

    @Override // coil3.Image
    public final long getSize() {
        return coil3.svg.internal.UtilsKt.SVG_SIZE_BYTES;
    }

    public SvgImage(com.caverock.androidsvg.SVG svg, com.caverock.androidsvg.RenderOptions renderOptions, int i, int i2) {
        this.svg = svg;
        this.renderOptions = renderOptions;
        this.width = i;
        this.height = i2;
    }

    public final com.caverock.androidsvg.SVG getSvg() {
        return this.svg;
    }

    public final com.caverock.androidsvg.RenderOptions getRenderOptions() {
        return this.renderOptions;
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
    public final void draw(android.graphics.Canvas canvas) {
        this.svg.renderToCanvas(canvas, this.renderOptions);
    }
}
