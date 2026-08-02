package coil3.svg.internal;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R(\u0010\u0016\u001a\u0004\u0018\u00010\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\u00198W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u001e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 "}, d2 = {"Lcoil3/svg/internal/AndroidSvg;", "Lcoil3/svg/Svg;", "Lcom/caverock/androidsvg/SVG;", "p0", "<init>", "(Lcom/caverock/androidsvg/SVG;)V", "", "", "width", "(Ljava/lang/String;)V", "height", "Lcoil3/request/Options;", "options", "(Lcoil3/request/Options;)V", "", "p1", "Lcoil3/Image;", "asImage", "(II)Lcoil3/Image;", "Camera2StreamConfigurationMap", "Lcom/caverock/androidsvg/SVG;", "Lcom/caverock/androidsvg/RenderOptions;", "getHighSpeedVideoSizes", "Lcom/caverock/androidsvg/RenderOptions;", "getHighSpeedVideoFpsRangesFor", "Lcoil3/svg/Svg$ViewBox;", "getViewBox", "()Lcoil3/svg/Svg$ViewBox;", "setViewBox", "(Lcoil3/svg/Svg$ViewBox;)V", "", "getWidth", "()F", "getHighResolutionOutputSizeshNQ4ISI", "getHeight", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class AndroidSvg implements coil3.svg.Svg {
    private final com.caverock.androidsvg.SVG Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private com.caverock.androidsvg.RenderOptions getHighSpeedVideoFpsRangesFor;

    public AndroidSvg(com.caverock.androidsvg.SVG svg) {
        this.Camera2StreamConfigurationMap = svg;
    }

    @Override // coil3.svg.Svg
    public final coil3.svg.Svg.ViewBox getViewBox() {
        android.graphics.RectF documentViewBox = this.Camera2StreamConfigurationMap.getDocumentViewBox();
        if (documentViewBox != null) {
            return new coil3.svg.Svg.ViewBox(documentViewBox.left, documentViewBox.top, documentViewBox.right, documentViewBox.bottom);
        }
        return null;
    }

    @Override // coil3.svg.Svg
    public final void setViewBox(coil3.svg.Svg.ViewBox viewBox) {
        if (viewBox == null) {
            throw new java.lang.UnsupportedOperationException();
        }
        this.Camera2StreamConfigurationMap.setDocumentViewBox(viewBox.getLeft(), viewBox.getTop(), coil3.svg.SvgKt.getWidth(viewBox), coil3.svg.SvgKt.getHeight(viewBox));
    }

    @Override // coil3.svg.Svg
    public final float getWidth() {
        return this.Camera2StreamConfigurationMap.getDocumentWidth();
    }

    @Override // coil3.svg.Svg
    public final float getHeight() {
        return this.Camera2StreamConfigurationMap.getDocumentHeight();
    }

    @Override // coil3.svg.Svg
    public final void width(java.lang.String p0) {
        this.Camera2StreamConfigurationMap.setDocumentWidth(p0);
    }

    @Override // coil3.svg.Svg
    public final void height(java.lang.String p0) {
        this.Camera2StreamConfigurationMap.setDocumentHeight(p0);
    }

    @Override // coil3.svg.Svg
    public final void options(coil3.view.Options p0) {
        java.lang.String css = coil3.svg.ImageRequests_androidKt.getCss(p0);
        if (css != null) {
            com.caverock.androidsvg.RenderOptions renderOptions = new com.caverock.androidsvg.RenderOptions();
            renderOptions.css(css);
            this.getHighSpeedVideoFpsRangesFor = renderOptions;
        }
    }

    @Override // coil3.svg.Svg
    public final coil3.Image asImage(int p0, int p1) {
        return new coil3.svg.SvgImage(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, p0, p1);
    }
}
