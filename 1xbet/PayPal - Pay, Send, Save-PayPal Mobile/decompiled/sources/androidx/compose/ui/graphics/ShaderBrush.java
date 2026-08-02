package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\n\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R.\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\""}, d2 = {"Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/Brush;", "<init>", "()V", "Landroidx/compose/ui/geometry/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/getHighSpeedVideoFpsRanges;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "Landroidx/compose/ui/graphics/TransformShader;", "getHighResolutionOutputSizeshNQ4ISI", "()Landroidx/compose/ui/graphics/TransformShader;", "Landroidx/compose/ui/graphics/Paint;", "p", "", "alpha", "", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "applyTo", "Landroidx/compose/ui/graphics/TransformShader;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "J", "getHighSpeedVideoSizes", "Landroidx/compose/ui/graphics/Matrix;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "transform", "[F", "getTransform-3i98HWw", "()[F", "setTransform-Q8lPUPs", "([F)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ShaderBrush extends androidx.compose.ui.graphics.Brush {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.TransformShader Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private long getHighSpeedVideoSizes;
    private float[] transform;

    /* renamed from: createShader-uvyYCjk */
    public abstract android.graphics.Shader mo5965createShaderuvyYCjk(long size);

    public ShaderBrush() {
        super(null);
        this.getHighSpeedVideoSizes = androidx.compose.ui.geometry.Size.INSTANCE.m5829getUnspecifiedNHjbRc();
    }

    /* renamed from: getTransform-3i98HWw, reason: not valid java name and from getter */
    public final float[] getTransform() {
        return this.transform;
    }

    /* renamed from: setTransform-Q8lPUPs, reason: not valid java name */
    public final void m6306setTransformQ8lPUPs(float[] fArr) {
        this.transform = fArr;
        androidx.compose.ui.graphics.TransformShader transformShader = this.Camera2StreamConfigurationMap;
        if (transformShader != null) {
            transformShader.m6379transformQ8lPUPs(fArr);
        }
    }

    private final androidx.compose.ui.graphics.TransformShader getHighResolutionOutputSizeshNQ4ISI() {
        androidx.compose.ui.graphics.TransformShader transformShader = this.Camera2StreamConfigurationMap;
        if (transformShader != null) {
            return transformShader;
        }
        androidx.compose.ui.graphics.TransformShader transformShader2 = new androidx.compose.ui.graphics.TransformShader();
        this.Camera2StreamConfigurationMap = transformShader2;
        return transformShader2;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public final void mo5941applyToPq9zytI(long size, androidx.compose.ui.graphics.Paint p, float alpha) {
        androidx.compose.ui.graphics.TransformShader transformShader = this.Camera2StreamConfigurationMap;
        if (transformShader == null || !androidx.compose.ui.geometry.Size.m5817equalsimpl0(this.getHighSpeedVideoSizes, size)) {
            if (androidx.compose.ui.geometry.Size.m5823isEmptyimpl(size)) {
                this.Camera2StreamConfigurationMap = null;
                this.getHighSpeedVideoSizes = androidx.compose.ui.geometry.Size.INSTANCE.m5829getUnspecifiedNHjbRc();
                transformShader = null;
            } else {
                transformShader = getHighResolutionOutputSizeshNQ4ISI();
                float[] fArr = this.transform;
                if (fArr != null) {
                    transformShader.m6379transformQ8lPUPs(fArr);
                }
                transformShader.setShader(mo5965createShaderuvyYCjk(size));
                this.Camera2StreamConfigurationMap = transformShader;
                this.getHighSpeedVideoSizes = size;
            }
        }
        if (!androidx.compose.ui.graphics.Color.m5997equalsimpl0(p.mo5867getColor0d7_KjU(), androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU())) {
            p.mo5873setColor8_81llA(androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU());
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(p.getShader(), transformShader != null ? transformShader.getShader() : null)) {
            p.setShader(transformShader != null ? transformShader.getShader() : null);
        }
        if (p.getAlpha() == alpha) {
            return;
        }
        p.setAlpha(alpha);
    }
}
