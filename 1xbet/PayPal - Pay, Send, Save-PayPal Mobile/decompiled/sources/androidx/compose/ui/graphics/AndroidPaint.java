package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0013\u0010\b\u001a\u00060\u0002j\u0002`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001e\u0010\n\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u001e8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010$\u001a\u00020#2\u0006\u0010$\u001a\u00020#8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010-\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00101\u001a\u00020.2\u0006\u0010\u0018\u001a\u00020.8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R$\u00104\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b2\u0010\u001a\"\u0004\b3\u0010\u001cR$\u00108\u001a\u0002052\u0006\u0010\u0018\u001a\u0002058W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b6\u0010*\"\u0004\b7\u0010,R$\u0010<\u001a\u0002092\u0006\u0010\u0018\u001a\u0002098W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b:\u0010*\"\u0004\b;\u0010,R$\u0010?\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b=\u0010\u001a\"\u0004\b>\u0010\u001cR$\u0010C\u001a\u00020@2\u0006\u0010\u0018\u001a\u00020@8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bA\u0010*\"\u0004\bB\u0010,R4\u0010H\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\u000e\u0010\u0018\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR(\u0010M\u001a\u0004\u0018\u00010\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u00138W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR.\u0010O\u001a\u0004\u0018\u00010N2\b\u0010\u0018\u001a\u0004\u0018\u00010N8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPaint;", "Landroidx/compose/ui/graphics/Paint;", "Landroid/graphics/Paint;", "internalPaint", "<init>", "(Landroid/graphics/Paint;)V", "()V", "Landroidx/compose/ui/graphics/getHighResolutionOutputSizeshNQ4ISI;", "asFrameworkPaint", "()Landroid/graphics/Paint;", "getHighSpeedVideoSizes", "Landroid/graphics/Paint;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/graphics/BlendMode;", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/getHighSpeedVideoFpsRanges;", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/ColorFilter;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/graphics/ColorFilter;", "getHighSpeedVideoFpsRanges", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getAlpha", "()F", "setAlpha", "(F)V", "alpha", "", "isAntiAlias", "()Z", "setAntiAlias", "(Z)V", "Landroidx/compose/ui/graphics/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "getColor-0d7_KjU", "()J", "setColor-8_81llA", "(J)V", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "blendMode", "Landroidx/compose/ui/graphics/PaintingStyle;", "getStyle-TiuSbCo", "setStyle-k9PVt8s", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "getStrokeWidth", "setStrokeWidth", "strokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "getStrokeCap-KaPHkGw", "setStrokeCap-BeK7IIE", "strokeCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "getStrokeJoin-LxFBmk8", "setStrokeJoin-Ww9F2mQ", "strokeJoin", "getStrokeMiterLimit", "setStrokeMiterLimit", "strokeMiterLimit", "Landroidx/compose/ui/graphics/FilterQuality;", "getFilterQuality-f-v9h1I", "setFilterQuality-vDHp3xo", "filterQuality", "getShader", "()Landroid/graphics/Shader;", "setShader", "(Landroid/graphics/Shader;)V", "shader", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "colorFilter", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "getPathEffect", "()Landroidx/compose/ui/graphics/PathEffect;", "setPathEffect", "(Landroidx/compose/ui/graphics/PathEffect;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidPaint implements androidx.compose.ui.graphics.Paint {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private android.graphics.Shader getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.ColorFilter getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private android.graphics.Paint getHighSpeedVideoFpsRangesFor;
    private androidx.compose.ui.graphics.PathEffect pathEffect;

    public AndroidPaint(android.graphics.Paint paint) {
        this.getHighSpeedVideoFpsRangesFor = paint;
        this.Camera2StreamConfigurationMap = androidx.compose.ui.graphics.BlendMode.INSTANCE.m5937getSrcOver0nO6VwU();
    }

    public AndroidPaint() {
        this(androidx.compose.ui.graphics.AndroidPaint_androidKt.makeNativePaint());
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: asFrameworkPaint, reason: from getter */
    public final android.graphics.Paint getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final float getAlpha() {
        return androidx.compose.ui.graphics.AndroidPaint_androidKt.getNativeAlpha(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final void setAlpha(float f) {
        androidx.compose.ui.graphics.AndroidPaint_androidKt.setNativeAlpha(this.getHighSpeedVideoFpsRangesFor, f);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final boolean isAntiAlias() {
        return androidx.compose.ui.graphics.AndroidPaint_androidKt.getNativeAntiAlias(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final void setAntiAlias(boolean z) {
        androidx.compose.ui.graphics.AndroidPaint_androidKt.setNativeAntiAlias(this.getHighSpeedVideoFpsRangesFor, z);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long mo5867getColor0d7_KjU() {
        return androidx.compose.ui.graphics.AndroidPaint_androidKt.getNativeColor(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public final void mo5873setColor8_81llA(long j) {
        androidx.compose.ui.graphics.AndroidPaint_androidKt.m5879setNativeColor4WTKRHQ(this.getHighSpeedVideoFpsRangesFor, j);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name and from getter */
    public final int getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void mo5872setBlendModes9anfk8(int i) {
        if (androidx.compose.ui.graphics.BlendMode.m5906equalsimpl0(this.Camera2StreamConfigurationMap, i)) {
            return;
        }
        this.Camera2StreamConfigurationMap = i;
        androidx.compose.ui.graphics.AndroidPaint_androidKt.m5878setNativeBlendModeGB0RdKg(this.getHighSpeedVideoFpsRangesFor, i);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: getStyle-TiuSbCo, reason: not valid java name */
    public final int mo5871getStyleTiuSbCo() {
        return androidx.compose.ui.graphics.AndroidPaint_androidKt.getNativeStyle(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: setStyle-k9PVt8s, reason: not valid java name */
    public final void mo5877setStylek9PVt8s(int i) {
        androidx.compose.ui.graphics.AndroidPaint_androidKt.m5883setNativeStyle5YerkU(this.getHighSpeedVideoFpsRangesFor, i);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final float getStrokeWidth() {
        return androidx.compose.ui.graphics.AndroidPaint_androidKt.getNativeStrokeWidth(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final void setStrokeWidth(float f) {
        androidx.compose.ui.graphics.AndroidPaint_androidKt.setNativeStrokeWidth(this.getHighSpeedVideoFpsRangesFor, f);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: getStrokeCap-KaPHkGw, reason: not valid java name */
    public final int mo5869getStrokeCapKaPHkGw() {
        return androidx.compose.ui.graphics.AndroidPaint_androidKt.getNativeStrokeCap(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: setStrokeCap-BeK7IIE, reason: not valid java name */
    public final void mo5875setStrokeCapBeK7IIE(int i) {
        androidx.compose.ui.graphics.AndroidPaint_androidKt.m5881setNativeStrokeCapCSYIeUk(this.getHighSpeedVideoFpsRangesFor, i);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: getStrokeJoin-LxFBmk8, reason: not valid java name */
    public final int mo5870getStrokeJoinLxFBmk8() {
        return androidx.compose.ui.graphics.AndroidPaint_androidKt.getNativeStrokeJoin(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: setStrokeJoin-Ww9F2mQ, reason: not valid java name */
    public final void mo5876setStrokeJoinWw9F2mQ(int i) {
        androidx.compose.ui.graphics.AndroidPaint_androidKt.m5882setNativeStrokeJoinkLtJ_vA(this.getHighSpeedVideoFpsRangesFor, i);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final float getStrokeMiterLimit() {
        return androidx.compose.ui.graphics.AndroidPaint_androidKt.getNativeStrokeMiterLimit(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final void setStrokeMiterLimit(float f) {
        androidx.compose.ui.graphics.AndroidPaint_androidKt.setNativeStrokeMiterLimit(this.getHighSpeedVideoFpsRangesFor, f);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: getFilterQuality-f-v9h1I, reason: not valid java name */
    public final int mo5868getFilterQualityfv9h1I() {
        return androidx.compose.ui.graphics.AndroidPaint_androidKt.getNativeFilterQuality(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: setFilterQuality-vDHp3xo, reason: not valid java name */
    public final void mo5874setFilterQualityvDHp3xo(int i) {
        androidx.compose.ui.graphics.AndroidPaint_androidKt.m5880setNativeFilterQuality50PEsBU(this.getHighSpeedVideoFpsRangesFor, i);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: getShader, reason: from getter */
    public final android.graphics.Shader getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final void setShader(android.graphics.Shader shader) {
        this.getHighSpeedVideoSizes = shader;
        androidx.compose.ui.graphics.AndroidPaint_androidKt.setNativeShader(this.getHighSpeedVideoFpsRangesFor, shader);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: getColorFilter, reason: from getter */
    public final androidx.compose.ui.graphics.ColorFilter getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final void setColorFilter(androidx.compose.ui.graphics.ColorFilter colorFilter) {
        this.getHighSpeedVideoFpsRanges = colorFilter;
        androidx.compose.ui.graphics.AndroidPaint_androidKt.setNativeColorFilter(this.getHighSpeedVideoFpsRangesFor, colorFilter);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final androidx.compose.ui.graphics.PathEffect getPathEffect() {
        return this.pathEffect;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final void setPathEffect(androidx.compose.ui.graphics.PathEffect pathEffect) {
        androidx.compose.ui.graphics.AndroidPaint_androidKt.setNativePathEffect(this.getHighSpeedVideoFpsRangesFor, pathEffect);
        this.pathEffect = pathEffect;
    }
}
