package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Immutable
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u000b\u001a\u00020\f*\u00020\rH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u000b\u001a\u00020\f*\u00020\u0010H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\r*\u00020\u0010H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0013\u001a\u00020\r*\u00020\u0003H\u0017ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0013\u001a\u00020\r*\u00020\fH\u0017ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u001a*\u00020\u001bH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u0003*\u00020\rH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0019\u0010\u001e\u001a\u00020\u0003*\u00020\u0010H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u0015J\f\u0010!\u001a\u00020\"*\u00020#H\u0017J\u0019\u0010$\u001a\u00020\u001b*\u00020\u001aH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010\u001dJ\u0019\u0010&\u001a\u00020\u0010*\u00020\rH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u001c\u0010&\u001a\u00020\u0010*\u00020\u0003H\u0017ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b)\u0010(J\u001c\u0010&\u001a\u00020\u0010*\u00020\fH\u0017ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/ui/unit/Density;", "", "density", "", "getDensity$annotations", "()V", "getDensity", "()F", "fontScale", "getFontScale$annotations", "getFontScale", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Density {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @Stable
        public static /* synthetic */ void getDensity$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFontScale$annotations() {
        }

        @Stable
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m1007roundToPxR2X_6o(Density density, long j) {
            Intrinsics.checkNotNullParameter(density, "this");
            return MathKt.roundToInt(density.mo871toPxR2X_6o(j));
        }

        @Stable
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m1008roundToPx0680j_4(Density density, float f) {
            Intrinsics.checkNotNullParameter(density, "this");
            float mo872toPx0680j_4 = density.mo872toPx0680j_4(f);
            if (Float.isInfinite(mo872toPx0680j_4)) {
                return Integer.MAX_VALUE;
            }
            return MathKt.roundToInt(mo872toPx0680j_4);
        }

        @Stable
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m1009toDpGaN1DYA(Density density, long j) {
            Intrinsics.checkNotNullParameter(density, "this");
            if (!TextUnitType.m1230equalsimpl0(TextUnit.m1201getTypeUIouoOA(j), TextUnitType.INSTANCE.m1235getSpUIouoOA())) {
                throw new IllegalStateException("Only Sp can convert to Px");
            }
            return Dp.m1021constructorimpl(density.getFontScale() * TextUnit.m1202getValueimpl(j));
        }

        @Stable
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m1011toDpu2uoSUM(Density density, int i) {
            Intrinsics.checkNotNullParameter(density, "this");
            return Dp.m1021constructorimpl(i / density.getDensity());
        }

        @Stable
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m1012toDpSizekrfVVM(Density density, long j) {
            Intrinsics.checkNotNullParameter(density, "this");
            return j != Size.INSTANCE.m353getUnspecifiedNHjbRc() ? DpKt.m1043DpSizeYgX7TsA(density.mo868toDpu2uoSUM(Size.m345getWidthimpl(j)), density.mo868toDpu2uoSUM(Size.m342getHeightimpl(j))) : DpSize.INSTANCE.m1128getUnspecifiedMYxV2XQ();
        }

        @Stable
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m1013toPxR2X_6o(Density density, long j) {
            Intrinsics.checkNotNullParameter(density, "this");
            if (!TextUnitType.m1230equalsimpl0(TextUnit.m1201getTypeUIouoOA(j), TextUnitType.INSTANCE.m1235getSpUIouoOA())) {
                throw new IllegalStateException("Only Sp can convert to Px");
            }
            return density.getDensity() * density.getFontScale() * TextUnit.m1202getValueimpl(j);
        }

        @Stable
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m1014toPx0680j_4(Density density, float f) {
            Intrinsics.checkNotNullParameter(density, "this");
            return density.getDensity() * f;
        }

        @Stable
        public static Rect toRect(Density density, DpRect receiver) {
            Intrinsics.checkNotNullParameter(density, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return new Rect(density.mo872toPx0680j_4(receiver.m1104getLeftD9Ej5fM()), density.mo872toPx0680j_4(receiver.m1106getTopD9Ej5fM()), density.mo872toPx0680j_4(receiver.m1105getRightD9Ej5fM()), density.mo872toPx0680j_4(receiver.m1103getBottomD9Ej5fM()));
        }

        @Stable
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m1015toSizeXkaWNTQ(Density density, long j) {
            Intrinsics.checkNotNullParameter(density, "this");
            return j != DpSize.INSTANCE.m1128getUnspecifiedMYxV2XQ() ? SizeKt.Size(density.mo872toPx0680j_4(DpSize.m1119getWidthD9Ej5fM(j)), density.mo872toPx0680j_4(DpSize.m1117getHeightD9Ej5fM(j))) : Size.INSTANCE.m353getUnspecifiedNHjbRc();
        }

        @Stable
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m1016toSp0xMU5do(Density density, float f) {
            Intrinsics.checkNotNullParameter(density, "this");
            return TextUnitKt.getSp(f / density.getFontScale());
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m1018toSpkPz2Gy4(Density density, int i) {
            Intrinsics.checkNotNullParameter(density, "this");
            return TextUnitKt.getSp(i / (density.getDensity() * density.getFontScale()));
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m1017toSpkPz2Gy4(Density density, float f) {
            Intrinsics.checkNotNullParameter(density, "this");
            return TextUnitKt.getSp(f / (density.getDensity() * density.getFontScale()));
        }

        @Stable
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m1010toDpu2uoSUM(Density density, float f) {
            Intrinsics.checkNotNullParameter(density, "this");
            return Dp.m1021constructorimpl(f / density.getDensity());
        }
    }

    float getDensity();

    float getFontScale();

    @Stable
    /* renamed from: roundToPx--R2X_6o */
    int mo865roundToPxR2X_6o(long j);

    @Stable
    /* renamed from: roundToPx-0680j_4 */
    int mo866roundToPx0680j_4(float f);

    @Stable
    /* renamed from: toDp-GaN1DYA */
    float mo867toDpGaN1DYA(long j);

    @Stable
    /* renamed from: toDp-u2uoSUM */
    float mo868toDpu2uoSUM(float f);

    @Stable
    /* renamed from: toDp-u2uoSUM */
    float mo869toDpu2uoSUM(int i);

    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    long mo870toDpSizekrfVVM(long j);

    @Stable
    /* renamed from: toPx--R2X_6o */
    float mo871toPxR2X_6o(long j);

    @Stable
    /* renamed from: toPx-0680j_4 */
    float mo872toPx0680j_4(float f);

    @Stable
    Rect toRect(DpRect dpRect);

    @Stable
    /* renamed from: toSize-XkaWNTQ */
    long mo873toSizeXkaWNTQ(long j);

    @Stable
    /* renamed from: toSp-0xMU5do */
    long mo874toSp0xMU5do(float f);

    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    long mo875toSpkPz2Gy4(float f);

    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    long mo876toSpkPz2Gy4(int i);
}
