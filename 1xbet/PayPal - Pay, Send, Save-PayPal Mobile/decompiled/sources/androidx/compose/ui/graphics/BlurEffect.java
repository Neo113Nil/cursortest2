package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/ui/graphics/BlurEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "", "radiusX", "radiusY", "Landroidx/compose/ui/graphics/TileMode;", "edgeTreatment", "<init>", "(Landroidx/compose/ui/graphics/RenderEffect;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/graphics/RenderEffect;", "createRenderEffect", "()Landroid/graphics/RenderEffect;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/graphics/RenderEffect;", "getHighSpeedVideoFpsRanges", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BlurEffect extends androidx.compose.ui.graphics.RenderEffect {
    public static final int $stable = 0;
    private final androidx.compose.ui.graphics.RenderEffect getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final float getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    private BlurEffect(androidx.compose.ui.graphics.RenderEffect renderEffect, float f, float f2, int i) {
        super(null);
        this.getHighResolutionOutputSizeshNQ4ISI = renderEffect;
        this.getHighSpeedVideoFpsRangesFor = f;
        this.getHighSpeedVideoSizes = f2;
        this.Camera2StreamConfigurationMap = i;
    }

    @Override // androidx.compose.ui.graphics.RenderEffect
    /* renamed from: createRenderEffect */
    protected final android.graphics.RenderEffect getAndroidRenderEffect() {
        androidx.compose.ui.graphics.RenderEffectVerificationHelper renderEffectVerificationHelper = androidx.compose.ui.graphics.RenderEffectVerificationHelper.INSTANCE;
        return androidx.compose.ui.graphics.RenderEffectVerificationHelper.aI_(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
    }

    public /* synthetic */ BlurEffect(androidx.compose.ui.graphics.RenderEffect renderEffect, float f, float f2, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(renderEffect, f, (i2 & 4) != 0 ? f : f2, (i2 & 8) != 0 ? androidx.compose.ui.graphics.TileMode.INSTANCE.m6361getClamp3opZhB0() : i, null);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.graphics.BlurEffect)) {
            return false;
        }
        androidx.compose.ui.graphics.BlurEffect blurEffect = (androidx.compose.ui.graphics.BlurEffect) other;
        return this.getHighSpeedVideoFpsRangesFor == blurEffect.getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoSizes == blurEffect.getHighSpeedVideoSizes && androidx.compose.ui.graphics.TileMode.m6357equalsimpl0(this.Camera2StreamConfigurationMap, blurEffect.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, blurEffect.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final int hashCode() {
        androidx.compose.ui.graphics.RenderEffect renderEffect = this.getHighResolutionOutputSizeshNQ4ISI;
        return ((((((renderEffect != null ? renderEffect.hashCode() : 0) * 31) + java.lang.Float.hashCode(this.getHighSpeedVideoFpsRangesFor)) * 31) + java.lang.Float.hashCode(this.getHighSpeedVideoSizes)) * 31) + androidx.compose.ui.graphics.TileMode.m6358hashCodeimpl(this.Camera2StreamConfigurationMap);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BlurEffect(renderEffect=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", radiusX=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", radiusY=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", edgeTreatment=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.TileMode.m6359toStringimpl(this.Camera2StreamConfigurationMap));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ BlurEffect(androidx.compose.ui.graphics.RenderEffect renderEffect, float f, float f2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(renderEffect, f, f2, i);
    }
}
