package org.betup.utils;

import java.math.BigInteger;
import java.util.Locale;
import org.betup.model.local.entity.OddType;

/* loaded from: classes4.dex */
public final class OddHelper {
    private static final double LARGE_ODDS_THRESHOLD = 15.0d;
    private static final int MAX_TWO_DIGITS = 99;
    private static final double SINGLE_DIGIT_ERROR_TOLERANCE = 0.02d;
    private static final int SINGLE_DIGIT_MAX = 9;

    private OddHelper() {
    }

    /* renamed from: org.betup.utils.OddHelper$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$betup$model$local$entity$OddType;

        static {
            int[] iArr = new int[OddType.values().length];
            $SwitchMap$org$betup$model$local$entity$OddType = iArr;
            try {
                iArr[OddType.FRACTIONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$betup$model$local$entity$OddType[OddType.AMERICAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static String format(OddType type, double coef) {
        int i = AnonymousClass1.$SwitchMap$org$betup$model$local$entity$OddType[type.ordinal()];
        if (i == 1) {
            return formatFractionalCompact(coef);
        }
        if (i != 2) {
            return FormatHelper.getTextFormattedOdd(coef);
        }
        if (coef < 2.0d) {
            return String.valueOf((int) ((-100.0d) / (coef - 1.0d)));
        }
        return String.valueOf((int) ((coef * 100.0d) - 100.0d));
    }

    private static String formatFractionalCompact(double coef) {
        String str;
        int i;
        if (coef <= 1.0d) {
            return "0/1";
        }
        double d = coef - 1.0d;
        int i2 = 1;
        if (coef >= LARGE_ODDS_THRESHOLD) {
            return String.format(Locale.getDefault(), "%d/1", Integer.valueOf(Math.max(1, Math.min((int) Math.round(d), 99))));
        }
        int i3 = 1;
        int i4 = 1;
        int i5 = 1;
        double d2 = Double.POSITIVE_INFINITY;
        while (true) {
            if (i3 > 9) {
                break;
            }
            int i6 = i2;
            for (int i7 = 9; i6 <= i7; i7 = 9) {
                int intValue = BigInteger.valueOf(i6).gcd(BigInteger.valueOf(i3)).intValue();
                int i8 = i6 / intValue;
                int i9 = i3 / intValue;
                if (i8 > i7 || i9 > i7) {
                    i = i6;
                } else {
                    i = i6;
                    double abs = Math.abs((i8 / i9) - d);
                    if (abs < d2) {
                        d2 = abs;
                        i5 = i9;
                        i4 = i8;
                    }
                }
                i6 = i + 1;
            }
            i3++;
            i2 = 1;
        }
        String str2 = "%d/%d";
        if (d2 <= SINGLE_DIGIT_ERROR_TOLERANCE) {
            return String.format(Locale.getDefault(), "%d/%d", Integer.valueOf(i4), Integer.valueOf(i5));
        }
        int i10 = 0;
        int i11 = 1;
        int i12 = 1;
        double d3 = Double.POSITIVE_INFINITY;
        for (int i13 = 99; i11 <= i13; i13 = 99) {
            int round = (int) Math.round(i11 * d);
            if (round > 0 && round <= i13) {
                int intValue2 = BigInteger.valueOf(round).gcd(BigInteger.valueOf(i11)).intValue();
                int i14 = round / intValue2;
                int i15 = i11 / intValue2;
                if (i14 <= i13 && i15 <= i13) {
                    if (i14 <= 9 || i15 <= 9) {
                        str = str2;
                        double abs2 = Math.abs((i14 / i15) - d);
                        if (abs2 < d3) {
                            d3 = abs2;
                            i10 = i14;
                            i12 = i15;
                        }
                    } else {
                        str = str2;
                    }
                    i11++;
                    str2 = str;
                }
            }
            str = str2;
            i11++;
            str2 = str;
        }
        String str3 = str2;
        if (i10 == 0) {
            return String.format(Locale.getDefault(), str3, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        return String.format(Locale.getDefault(), str3, Integer.valueOf(i10), Integer.valueOf(i12));
    }

    public static OddType getFromString(String name) {
        if (name == null) {
            return OddType.DECIMAL;
        }
        name.hashCode();
        if (name.equals("fractional")) {
            return OddType.FRACTIONAL;
        }
        if (name.equals("decimal")) {
            return OddType.DECIMAL;
        }
        return OddType.AMERICAN;
    }
}
