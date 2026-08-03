package androidx.compose.ui.unit;

/* compiled from: Density.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0016\u0010\b\u001a\u00020\t*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\b\u001a\u00020\t*\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\n*\u00020\u0003H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0010\u001a\u00020\n*\u00020\tH\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0003*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0012J\u0016\u0010\u0019\u001a\u00020\u0003*\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\f\u0010\u001d\u001a\u00020\u001e*\u00020\u001fH\u0017J\u0016\u0010 \u001a\u00020\u0016*\u00020\u0015H\u0017ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0018J\u0019\u0010\"\u001a\u00020\r*\u00020\u0003H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0019\u0010\"\u001a\u00020\r*\u00020\tH\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010%R\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006&À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/FontScaling;", "density", "", "getDensity$annotations", "()V", "getDensity", "()F", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "(J)F", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-kPz2Gy4", "(F)J", "(I)J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Density extends androidx.compose.ui.unit.FontScaling {
    float getDensity();

    /* renamed from: roundToPx--R2X_6o */
    int mo308roundToPxR2X_6o(long j);

    /* renamed from: roundToPx-0680j_4 */
    int mo309roundToPx0680j_4(float f);

    /* renamed from: toDp-u2uoSUM */
    float mo311toDpu2uoSUM(float f);

    /* renamed from: toDp-u2uoSUM */
    float mo312toDpu2uoSUM(int i);

    /* renamed from: toDpSize-k-rfVVM */
    long mo313toDpSizekrfVVM(long j);

    /* renamed from: toPx--R2X_6o */
    float mo314toPxR2X_6o(long j);

    /* renamed from: toPx-0680j_4 */
    float mo315toPx0680j_4(float f);

    androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.unit.DpRect dpRect);

    /* renamed from: toSize-XkaWNTQ */
    long mo316toSizeXkaWNTQ(long j);

    /* renamed from: toSp-kPz2Gy4 */
    long mo318toSpkPz2Gy4(float f);

    /* renamed from: toSp-kPz2Gy4 */
    long mo319toSpkPz2Gy4(int i);

    /* compiled from: Density.kt */
    /* renamed from: androidx.compose.ui.unit.Density$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: $default$toPx-0680j_4, reason: not valid java name */
        public static float m4448$default$toPx0680j_4(androidx.compose.ui.unit.Density _this, float f) {
            return f * _this.getDensity();
        }

        /* renamed from: $default$roundToPx-0680j_4, reason: not valid java name */
        public static int m4443$default$roundToPx0680j_4(androidx.compose.ui.unit.Density _this, float f) {
            float mo315toPx0680j_4 = _this.mo315toPx0680j_4(f);
            if (java.lang.Float.isInfinite(mo315toPx0680j_4)) {
                return Integer.MAX_VALUE;
            }
            return kotlin.math.MathKt.roundToInt(mo315toPx0680j_4);
        }

        /* renamed from: $default$toPx--R2X_6o, reason: not valid java name */
        public static float m4447$default$toPxR2X_6o(androidx.compose.ui.unit.Density _this, long j) {
            if (!androidx.compose.ui.unit.TextUnitType.m4701equalsimpl0(androidx.compose.ui.unit.TextUnit.m4672getTypeUIouoOA(j), androidx.compose.ui.unit.TextUnitType.INSTANCE.m4706getSpUIouoOA())) {
                throw new java.lang.IllegalStateException("Only Sp can convert to Px".toString());
            }
            return _this.mo315toPx0680j_4(_this.mo310toDpGaN1DYA(j));
        }

        /* renamed from: $default$roundToPx--R2X_6o, reason: not valid java name */
        public static int m4442$default$roundToPxR2X_6o(androidx.compose.ui.unit.Density _this, long j) {
            return kotlin.math.MathKt.roundToInt(_this.mo314toPxR2X_6o(j));
        }

        /* renamed from: $default$toDp-u2uoSUM, reason: not valid java name */
        public static float m4445$default$toDpu2uoSUM(androidx.compose.ui.unit.Density _this, int i) {
            return androidx.compose.ui.unit.Dp.m4478constructorimpl(i / _this.getDensity());
        }

        /* renamed from: $default$toSp-kPz2Gy4, reason: not valid java name */
        public static long m4451$default$toSpkPz2Gy4(androidx.compose.ui.unit.Density _this, int i) {
            return _this.mo317toSp0xMU5do(_this.mo312toDpu2uoSUM(i));
        }

        /* renamed from: $default$toDp-u2uoSUM, reason: not valid java name */
        public static float m4444$default$toDpu2uoSUM(androidx.compose.ui.unit.Density _this, float f) {
            return androidx.compose.ui.unit.Dp.m4478constructorimpl(f / _this.getDensity());
        }

        /* renamed from: $default$toSp-kPz2Gy4, reason: not valid java name */
        public static long m4450$default$toSpkPz2Gy4(androidx.compose.ui.unit.Density _this, float f) {
            return _this.mo317toSp0xMU5do(_this.mo311toDpu2uoSUM(f));
        }

        public static androidx.compose.ui.geometry.Rect $default$toRect(androidx.compose.ui.unit.Density _this, androidx.compose.ui.unit.DpRect dpRect) {
            return new androidx.compose.ui.geometry.Rect(_this.mo315toPx0680j_4(dpRect.m4561getLeftD9Ej5fM()), _this.mo315toPx0680j_4(dpRect.m4563getTopD9Ej5fM()), _this.mo315toPx0680j_4(dpRect.m4562getRightD9Ej5fM()), _this.mo315toPx0680j_4(dpRect.m4560getBottomD9Ej5fM()));
        }

        /* renamed from: $default$toSize-XkaWNTQ, reason: not valid java name */
        public static long m4449$default$toSizeXkaWNTQ(androidx.compose.ui.unit.Density _this, long j) {
            if (j != androidx.compose.ui.unit.DpSize.INSTANCE.m4585getUnspecifiedMYxV2XQ()) {
                return androidx.compose.ui.geometry.SizeKt.Size(_this.mo315toPx0680j_4(androidx.compose.ui.unit.DpSize.m4576getWidthD9Ej5fM(j)), _this.mo315toPx0680j_4(androidx.compose.ui.unit.DpSize.m4574getHeightD9Ej5fM(j)));
            }
            return androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc();
        }

        /* renamed from: $default$toDpSize-k-rfVVM, reason: not valid java name */
        public static long m4446$default$toDpSizekrfVVM(androidx.compose.ui.unit.Density _this, long j) {
            if (j != androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc()) {
                return androidx.compose.ui.unit.DpKt.m4500DpSizeYgX7TsA(_this.mo311toDpu2uoSUM(androidx.compose.ui.geometry.Size.m1940getWidthimpl(j)), _this.mo311toDpu2uoSUM(androidx.compose.ui.geometry.Size.m1937getHeightimpl(j)));
            }
            return androidx.compose.ui.unit.DpSize.INSTANCE.m4585getUnspecifiedMYxV2XQ();
        }
    }

    /* compiled from: Density.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getDensity$annotations() {
        }

        @java.lang.Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m4466toDpGaN1DYA(androidx.compose.ui.unit.Density density, long j) {
            return androidx.compose.ui.unit.FontScaling.CC.m4587$default$toDpGaN1DYA(density, j);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m4473toSp0xMU5do(androidx.compose.ui.unit.Density density, float f) {
            return androidx.compose.ui.unit.FontScaling.CC.m4588$default$toSp0xMU5do(density, f);
        }

        @java.lang.Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m4471toPx0680j_4(androidx.compose.ui.unit.Density density, float f) {
            return androidx.compose.ui.unit.Density.CC.m4448$default$toPx0680j_4(density, f);
        }

        @java.lang.Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m4465roundToPx0680j_4(androidx.compose.ui.unit.Density density, float f) {
            return androidx.compose.ui.unit.Density.CC.m4443$default$roundToPx0680j_4(density, f);
        }

        @java.lang.Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m4470toPxR2X_6o(androidx.compose.ui.unit.Density density, long j) {
            return androidx.compose.ui.unit.Density.CC.m4447$default$toPxR2X_6o(density, j);
        }

        @java.lang.Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m4464roundToPxR2X_6o(androidx.compose.ui.unit.Density density, long j) {
            return androidx.compose.ui.unit.Density.CC.m4442$default$roundToPxR2X_6o(density, j);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4468toDpu2uoSUM(androidx.compose.ui.unit.Density density, int i) {
            return androidx.compose.ui.unit.Density.CC.m4445$default$toDpu2uoSUM(density, i);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4475toSpkPz2Gy4(androidx.compose.ui.unit.Density density, int i) {
            return androidx.compose.ui.unit.Density.CC.m4451$default$toSpkPz2Gy4(density, i);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4467toDpu2uoSUM(androidx.compose.ui.unit.Density density, float f) {
            return androidx.compose.ui.unit.Density.CC.m4444$default$toDpu2uoSUM(density, f);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4474toSpkPz2Gy4(androidx.compose.ui.unit.Density density, float f) {
            return androidx.compose.ui.unit.Density.CC.m4450$default$toSpkPz2Gy4(density, f);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.DpRect dpRect) {
            return androidx.compose.ui.unit.Density.CC.$default$toRect(density, dpRect);
        }

        @java.lang.Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m4472toSizeXkaWNTQ(androidx.compose.ui.unit.Density density, long j) {
            return androidx.compose.ui.unit.Density.CC.m4449$default$toSizeXkaWNTQ(density, j);
        }

        @java.lang.Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m4469toDpSizekrfVVM(androidx.compose.ui.unit.Density density, long j) {
            return androidx.compose.ui.unit.Density.CC.m4446$default$toDpSizekrfVVM(density, j);
        }
    }
}
