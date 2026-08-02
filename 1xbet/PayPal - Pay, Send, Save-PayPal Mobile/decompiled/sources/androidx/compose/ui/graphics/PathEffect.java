package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/PathEffect;", "", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PathEffect {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.PathEffect.Companion INSTANCE = androidx.compose.ui.graphics.PathEffect.Companion.getHighResolutionOutputSizeshNQ4ISI;

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/ui/graphics/PathEffect$Companion;", "", "<init>", "()V", "", "radius", "Landroidx/compose/ui/graphics/PathEffect;", "cornerPathEffect", "(F)Landroidx/compose/ui/graphics/PathEffect;", "", "intervals", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_PHASE, "dashPathEffect", "([FF)Landroidx/compose/ui/graphics/PathEffect;", "outer", "inner", "chainPathEffect", "(Landroidx/compose/ui/graphics/PathEffect;Landroidx/compose/ui/graphics/PathEffect;)Landroidx/compose/ui/graphics/PathEffect;", "Landroidx/compose/ui/graphics/Path;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "advance", "Landroidx/compose/ui/graphics/StampedPathEffectStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "stampedPathEffect-7aD1DOk", "(Landroidx/compose/ui/graphics/Path;FFI)Landroidx/compose/ui/graphics/PathEffect;", "stampedPathEffect"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.graphics.PathEffect.Companion getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.ui.graphics.PathEffect.Companion();

        private Companion() {
        }

        public final androidx.compose.ui.graphics.PathEffect cornerPathEffect(float radius) {
            return androidx.compose.ui.graphics.AndroidPathEffect_androidKt.actualCornerPathEffect(radius);
        }

        public static /* synthetic */ androidx.compose.ui.graphics.PathEffect dashPathEffect$default(androidx.compose.ui.graphics.PathEffect.Companion companion, float[] fArr, float f, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            return companion.dashPathEffect(fArr, f);
        }

        public final androidx.compose.ui.graphics.PathEffect dashPathEffect(float[] intervals, float phase) {
            return androidx.compose.ui.graphics.AndroidPathEffect_androidKt.actualDashPathEffect(intervals, phase);
        }

        public final androidx.compose.ui.graphics.PathEffect chainPathEffect(androidx.compose.ui.graphics.PathEffect outer, androidx.compose.ui.graphics.PathEffect inner) {
            return androidx.compose.ui.graphics.AndroidPathEffect_androidKt.actualChainPathEffect(outer, inner);
        }

        /* renamed from: stampedPathEffect-7aD1DOk, reason: not valid java name */
        public final androidx.compose.ui.graphics.PathEffect m6266stampedPathEffect7aD1DOk(androidx.compose.ui.graphics.Path shape, float advance, float phase, int style) {
            return androidx.compose.ui.graphics.AndroidPathEffect_androidKt.m5890actualStampedPathEffect7aD1DOk(shape, advance, phase, style);
        }
    }
}
