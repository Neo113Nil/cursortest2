package androidx.compose.ui.unit;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0002*\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0015\u001a\u00020\u000b*\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0012\u001a\u00020\u0002*\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0005J\u0013\u0010\u0015\u001a\u00020\u000b*\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0016J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001f\u001a\u00020\u001c*\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010!\u001a\u00020\u001b*\u00020\u001cH\u0016¢\u0006\u0004\b \u0010\u001eR\u001a\u0010&\u001a\u00020\u00038'X¦\u0004¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/FontScaling;", "Landroidx/compose/ui/unit/Dp;", "", "toPx-0680j_4", "(F)F", "toPx", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "toPx--R2X_6o", "(J)F", "roundToPx--R2X_6o", "(J)I", "toDp-u2uoSUM", "(I)F", "toDp", "toSp-kPz2Gy4", "(I)J", "toSp", "(F)J", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toSize-XkaWNTQ", "(J)J", "toSize", "toDpSize-k-rfVVM", "toDpSize", "getDensity", "()F", "getDensity$annotations", "()V", "density"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Density extends androidx.compose.ui.unit.FontScaling {
    float getDensity();

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void getDensity$annotations() {
        }

        @java.lang.Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m8589toDpGaN1DYA(androidx.compose.ui.unit.Density density, long j) {
            return androidx.compose.ui.unit.Density.super.mo1413toDpGaN1DYA(j);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m8596toSp0xMU5do(androidx.compose.ui.unit.Density density, float f) {
            return androidx.compose.ui.unit.Density.super.mo1420toSp0xMU5do(f);
        }

        @java.lang.Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m8594toPx0680j_4(androidx.compose.ui.unit.Density density, float f) {
            return androidx.compose.ui.unit.Density.super.mo1418toPx0680j_4(f);
        }

        @java.lang.Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m8588roundToPx0680j_4(androidx.compose.ui.unit.Density density, float f) {
            return androidx.compose.ui.unit.Density.super.mo1412roundToPx0680j_4(f);
        }

        @java.lang.Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m8593toPxR2X_6o(androidx.compose.ui.unit.Density density, long j) {
            return androidx.compose.ui.unit.Density.super.mo1417toPxR2X_6o(j);
        }

        @java.lang.Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m8587roundToPxR2X_6o(androidx.compose.ui.unit.Density density, long j) {
            return androidx.compose.ui.unit.Density.super.mo1411roundToPxR2X_6o(j);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m8591toDpu2uoSUM(androidx.compose.ui.unit.Density density, int i) {
            return androidx.compose.ui.unit.Density.super.mo1415toDpu2uoSUM(i);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m8598toSpkPz2Gy4(androidx.compose.ui.unit.Density density, int i) {
            return androidx.compose.ui.unit.Density.super.mo1422toSpkPz2Gy4(i);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m8590toDpu2uoSUM(androidx.compose.ui.unit.Density density, float f) {
            return androidx.compose.ui.unit.Density.super.mo1414toDpu2uoSUM(f);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m8597toSpkPz2Gy4(androidx.compose.ui.unit.Density density, float f) {
            return androidx.compose.ui.unit.Density.super.mo1421toSpkPz2Gy4(f);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.DpRect dpRect) {
            return androidx.compose.ui.unit.Density.super.toRect(dpRect);
        }

        @java.lang.Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m8595toSizeXkaWNTQ(androidx.compose.ui.unit.Density density, long j) {
            return androidx.compose.ui.unit.Density.super.mo1419toSizeXkaWNTQ(j);
        }

        @java.lang.Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m8592toDpSizekrfVVM(androidx.compose.ui.unit.Density density, long j) {
            return androidx.compose.ui.unit.Density.super.mo1416toDpSizekrfVVM(j);
        }
    }

    /* renamed from: toPx-0680j_4 */
    default float mo1418toPx0680j_4(float f) {
        return f * getDensity();
    }

    /* renamed from: roundToPx-0680j_4 */
    default int mo1412roundToPx0680j_4(float f) {
        float mo1418toPx0680j_4 = mo1418toPx0680j_4(f);
        if (java.lang.Float.isInfinite(mo1418toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return java.lang.Math.round(mo1418toPx0680j_4);
    }

    /* renamed from: toPx--R2X_6o */
    default float mo1417toPxR2X_6o(long j) {
        if (!androidx.compose.ui.unit.TextUnitType.m8823equalsimpl0(androidx.compose.ui.unit.TextUnit.m8794getTypeUIouoOA(j), androidx.compose.ui.unit.TextUnitType.INSTANCE.m8828getSpUIouoOA())) {
            androidx.compose.ui.unit.InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        return mo1418toPx0680j_4(mo1413toDpGaN1DYA(j));
    }

    /* renamed from: roundToPx--R2X_6o */
    default int mo1411roundToPxR2X_6o(long j) {
        return java.lang.Math.round(mo1417toPxR2X_6o(j));
    }

    /* renamed from: toDp-u2uoSUM */
    default float mo1415toDpu2uoSUM(int i) {
        return androidx.compose.ui.unit.Dp.m8601constructorimpl(i / getDensity());
    }

    /* renamed from: toSp-kPz2Gy4 */
    default long mo1422toSpkPz2Gy4(int i) {
        return mo1420toSp0xMU5do(mo1415toDpu2uoSUM(i));
    }

    /* renamed from: toDp-u2uoSUM */
    default float mo1414toDpu2uoSUM(float f) {
        return androidx.compose.ui.unit.Dp.m8601constructorimpl(f / getDensity());
    }

    /* renamed from: toSp-kPz2Gy4 */
    default long mo1421toSpkPz2Gy4(float f) {
        return mo1420toSp0xMU5do(mo1414toDpu2uoSUM(f));
    }

    default androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.unit.DpRect dpRect) {
        return new androidx.compose.ui.geometry.Rect(mo1418toPx0680j_4(dpRect.m8684getLeftD9Ej5fM()), mo1418toPx0680j_4(dpRect.m8686getTopD9Ej5fM()), mo1418toPx0680j_4(dpRect.m8685getRightD9Ej5fM()), mo1418toPx0680j_4(dpRect.m8683getBottomD9Ej5fM()));
    }

    /* renamed from: toSize-XkaWNTQ */
    default long mo1419toSizeXkaWNTQ(long j) {
        if (j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            float mo1418toPx0680j_4 = mo1418toPx0680j_4(androidx.compose.ui.unit.DpSize.m8699getWidthD9Ej5fM(j));
            return androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(mo1418toPx0680j_4(androidx.compose.ui.unit.DpSize.m8697getHeightD9Ej5fM(j))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(mo1418toPx0680j_4) << 32));
        }
        return androidx.compose.ui.geometry.Size.INSTANCE.m5829getUnspecifiedNHjbRc();
    }

    /* renamed from: toDpSize-k-rfVVM */
    default long mo1416toDpSizekrfVVM(long j) {
        if (j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            return androidx.compose.ui.unit.DpKt.m8623DpSizeYgX7TsA(mo1414toDpu2uoSUM(java.lang.Float.intBitsToFloat((int) (j >> 32))), mo1414toDpu2uoSUM(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return androidx.compose.ui.unit.DpSize.INSTANCE.m8708getUnspecifiedMYxV2XQ();
    }
}
