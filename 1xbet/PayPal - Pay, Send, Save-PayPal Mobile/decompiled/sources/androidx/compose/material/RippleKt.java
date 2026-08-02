package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f\"\u001f\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015\"\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001a\"\u0014\u0010\u0014\u001a\u00020\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a"}, d2 = {"", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/ui/graphics/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Landroidx/compose/foundation/IndicationNodeFactory;", "ripple-H2RKhps", "(ZFJ)Landroidx/compose/foundation/IndicationNodeFactory;", "ripple", "Landroidx/compose/ui/graphics/ColorProducer;", "ripple-wH6b6FI", "(Landroidx/compose/ui/graphics/ColorProducer;ZF)Landroidx/compose/foundation/IndicationNodeFactory;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/RippleConfiguration;", "LocalRippleConfiguration", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalRippleConfiguration", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/RippleNodeFactory;", "getHighSpeedVideoSizes", "Landroidx/compose/material/RippleNodeFactory;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/material/ripple/RippleAlpha;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/material/ripple/RippleAlpha;", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RippleKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.RippleConfiguration> LocalRippleConfiguration = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf$default(null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.RippleKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.compose.material.RippleKt.$r8$lambda$AsQRcUQqfI7cgcQksp4Ty8X_wr0();
        }
    }, 1, null);
    private static final androidx.compose.material.RippleNodeFactory getHighSpeedVideoSizes = new androidx.compose.material.RippleNodeFactory(true, androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM(), androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU(), (kotlin.jvm.internal.DefaultConstructorMarker) null);
    private static final androidx.compose.material.RippleNodeFactory getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.material.RippleNodeFactory(false, androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM(), androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU(), (kotlin.jvm.internal.DefaultConstructorMarker) null);
    private static final androidx.compose.material.ripple.RippleAlpha getHighSpeedVideoFpsRanges = new androidx.compose.material.ripple.RippleAlpha(0.16f, 0.24f, 0.08f, 0.24f);
    private static final androidx.compose.material.ripple.RippleAlpha getHighSpeedVideoFpsRangesFor = new androidx.compose.material.ripple.RippleAlpha(0.08f, 0.12f, 0.04f, 0.12f);
    private static final androidx.compose.material.ripple.RippleAlpha Camera2StreamConfigurationMap = new androidx.compose.material.ripple.RippleAlpha(0.08f, 0.12f, 0.04f, 0.1f);

    /* renamed from: ripple-H2RKhps$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.foundation.IndicationNodeFactory m2713rippleH2RKhps$default(boolean z, float f, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            j = androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU();
        }
        return m2712rippleH2RKhps(z, f, j);
    }

    /* renamed from: ripple-H2RKhps, reason: not valid java name */
    public static final androidx.compose.foundation.IndicationNodeFactory m2712rippleH2RKhps(boolean z, float f, long j) {
        if (androidx.compose.ui.unit.Dp.m8606equalsimpl0(f, androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM()) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU())) {
            return z ? getHighSpeedVideoSizes : getHighResolutionOutputSizeshNQ4ISI;
        }
        return new androidx.compose.material.RippleNodeFactory(z, f, j, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: ripple-wH6b6FI$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.foundation.IndicationNodeFactory m2715ripplewH6b6FI$default(androidx.compose.ui.graphics.ColorProducer colorProducer, boolean z, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            f = androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM();
        }
        return m2714ripplewH6b6FI(colorProducer, z, f);
    }

    /* renamed from: ripple-wH6b6FI, reason: not valid java name */
    public static final androidx.compose.foundation.IndicationNodeFactory m2714ripplewH6b6FI(androidx.compose.ui.graphics.ColorProducer colorProducer, boolean z, float f) {
        return new androidx.compose.material.RippleNodeFactory(z, f, colorProducer, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.RippleConfiguration> getLocalRippleConfiguration() {
        return LocalRippleConfiguration;
    }

    public static /* synthetic */ androidx.compose.material.RippleConfiguration $r8$lambda$AsQRcUQqfI7cgcQksp4Ty8X_wr0() {
        return new androidx.compose.material.RippleConfiguration(0L, null, 3, null);
    }
}
