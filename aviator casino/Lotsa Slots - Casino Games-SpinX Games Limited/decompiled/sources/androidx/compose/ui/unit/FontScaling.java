package androidx.compose.ui.unit;

/* compiled from: FontScaling.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0016\u0010\b\u001a\u00020\t*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\u00020\n*\u00020\tH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/FontScaling;", "", "fontScale", "", "getFontScale$annotations", "()V", "getFontScale", "()F", "toDp", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/unit/TextUnit;", "toDp-GaN1DYA", "(J)F", "toSp", "toSp-0xMU5do", "(F)J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FontScaling {
    float getFontScale();

    /* renamed from: toDp-GaN1DYA */
    float mo310toDpGaN1DYA(long j);

    /* renamed from: toSp-0xMU5do */
    long mo317toSp0xMU5do(float f);

    /* compiled from: FontScaling.android.kt */
    /* renamed from: androidx.compose.ui.unit.FontScaling$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: $default$toSp-0xMU5do, reason: not valid java name */
        public static long m4588$default$toSp0xMU5do(androidx.compose.ui.unit.FontScaling _this, float f) {
            if (!androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory.INSTANCE.isNonLinearFontScalingActive(_this.getFontScale()) || androidx.compose.ui.unit.FontScalingKt.getDisableNonLinearFontScalingInCompose()) {
                return androidx.compose.ui.unit.TextUnitKt.getSp(f / _this.getFontScale());
            }
            androidx.compose.ui.unit.fontscaling.FontScaleConverter forScale = androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory.INSTANCE.forScale(_this.getFontScale());
            return androidx.compose.ui.unit.TextUnitKt.getSp(forScale != null ? forScale.convertDpToSp(f) : f / _this.getFontScale());
        }

        /* renamed from: $default$toDp-GaN1DYA, reason: not valid java name */
        public static float m4587$default$toDpGaN1DYA(androidx.compose.ui.unit.FontScaling _this, long j) {
            if (!androidx.compose.ui.unit.TextUnitType.m4701equalsimpl0(androidx.compose.ui.unit.TextUnit.m4672getTypeUIouoOA(j), androidx.compose.ui.unit.TextUnitType.INSTANCE.m4706getSpUIouoOA())) {
                throw new java.lang.IllegalStateException("Only Sp can convert to Px".toString());
            }
            if (!androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory.INSTANCE.isNonLinearFontScalingActive(_this.getFontScale()) || androidx.compose.ui.unit.FontScalingKt.getDisableNonLinearFontScalingInCompose()) {
                return androidx.compose.ui.unit.Dp.m4478constructorimpl(androidx.compose.ui.unit.TextUnit.m4673getValueimpl(j) * _this.getFontScale());
            }
            androidx.compose.ui.unit.fontscaling.FontScaleConverter forScale = androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory.INSTANCE.forScale(_this.getFontScale());
            float m4673getValueimpl = androidx.compose.ui.unit.TextUnit.m4673getValueimpl(j);
            return androidx.compose.ui.unit.Dp.m4478constructorimpl(forScale == null ? m4673getValueimpl * _this.getFontScale() : forScale.convertSpToDp(m4673getValueimpl));
        }
    }

    /* compiled from: FontScaling.android.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getFontScale$annotations() {
        }

        @java.lang.Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m4592toSp0xMU5do(androidx.compose.ui.unit.FontScaling fontScaling, float f) {
            return androidx.compose.ui.unit.FontScaling.CC.m4588$default$toSp0xMU5do(fontScaling, f);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m4591toDpGaN1DYA(androidx.compose.ui.unit.FontScaling fontScaling, long j) {
            return androidx.compose.ui.unit.FontScaling.CC.m4587$default$toDpGaN1DYA(fontScaling, j);
        }
    }
}
