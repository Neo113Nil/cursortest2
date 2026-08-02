package androidx.compose.ui.unit;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\t\u001a\u00020\u0002*\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8'X¦\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/FontScaling;", "", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/unit/TextUnit;", "toSp-0xMU5do", "(F)J", "toSp", "toDp-GaN1DYA", "(J)F", "toDp", "", "getFontScale", "()F", "getFontScale$annotations", "()V", "fontScale"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FontScaling {
    /* renamed from: getFontScale */
    float getGetHighSpeedVideoFpsRangesFor();

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void getFontScale$annotations() {
        }

        @java.lang.Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m8713toSp0xMU5do(androidx.compose.ui.unit.FontScaling fontScaling, float f) {
            return androidx.compose.ui.unit.FontScaling.super.mo1420toSp0xMU5do(f);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m8712toDpGaN1DYA(androidx.compose.ui.unit.FontScaling fontScaling, long j) {
            return androidx.compose.ui.unit.FontScaling.super.mo1413toDpGaN1DYA(j);
        }
    }

    /* renamed from: toSp-0xMU5do */
    default long mo1420toSp0xMU5do(float f) {
        if (!androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory.INSTANCE.isNonLinearFontScalingActive(getGetHighSpeedVideoFpsRangesFor())) {
            return androidx.compose.ui.unit.TextUnitKt.getSp(f / getGetHighSpeedVideoFpsRangesFor());
        }
        androidx.compose.ui.unit.fontscaling.FontScaleConverter forScale = androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory.INSTANCE.forScale(getGetHighSpeedVideoFpsRangesFor());
        return androidx.compose.ui.unit.TextUnitKt.getSp(forScale != null ? forScale.convertDpToSp(f) : f / getGetHighSpeedVideoFpsRangesFor());
    }

    /* renamed from: toDp-GaN1DYA */
    default float mo1413toDpGaN1DYA(long j) {
        if (!androidx.compose.ui.unit.TextUnitType.m8823equalsimpl0(androidx.compose.ui.unit.TextUnit.m8794getTypeUIouoOA(j), androidx.compose.ui.unit.TextUnitType.INSTANCE.m8828getSpUIouoOA())) {
            androidx.compose.ui.unit.InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        if (!androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory.INSTANCE.isNonLinearFontScalingActive(getGetHighSpeedVideoFpsRangesFor())) {
            return androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.ui.unit.TextUnit.m8795getValueimpl(j) * getGetHighSpeedVideoFpsRangesFor());
        }
        androidx.compose.ui.unit.fontscaling.FontScaleConverter forScale = androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory.INSTANCE.forScale(getGetHighSpeedVideoFpsRangesFor());
        float m8795getValueimpl = androidx.compose.ui.unit.TextUnit.m8795getValueimpl(j);
        return forScale == null ? androidx.compose.ui.unit.Dp.m8601constructorimpl(m8795getValueimpl * getGetHighSpeedVideoFpsRangesFor()) : androidx.compose.ui.unit.Dp.m8601constructorimpl(forScale.convertSpToDp(m8795getValueimpl));
    }
}
