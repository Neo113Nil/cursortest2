package com.google.common.math;

@com.google.common.math.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
abstract class ToDoubleRounder<X extends java.lang.Number & java.lang.Comparable<X>> {
    abstract X minus(X a2, X b);

    abstract double roundToDoubleArbitrarily(X x);

    abstract int sign(X x);

    abstract X toX(double d, java.math.RoundingMode mode);

    ToDoubleRounder() {
    }

    final double roundToDouble(X x, java.math.RoundingMode mode) {
        X x2;
        double d;
        com.google.common.base.Preconditions.checkNotNull(x, "x");
        com.google.common.base.Preconditions.checkNotNull(mode, com.ironsource.X3.a.t);
        double roundToDoubleArbitrarily = roundToDoubleArbitrarily(x);
        if (java.lang.Double.isInfinite(roundToDoubleArbitrarily)) {
            switch (com.google.common.math.ToDoubleRounder.AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return sign(x) * Double.MAX_VALUE;
                case 5:
                    return roundToDoubleArbitrarily == Double.POSITIVE_INFINITY ? Double.MAX_VALUE : Double.NEGATIVE_INFINITY;
                case 6:
                    return roundToDoubleArbitrarily == Double.POSITIVE_INFINITY ? Double.POSITIVE_INFINITY : -1.7976931348623157E308d;
                case 7:
                    return roundToDoubleArbitrarily;
                case 8:
                    throw new java.lang.ArithmeticException(x + " cannot be represented precisely as a double");
            }
        }
        X x3 = toX(roundToDoubleArbitrarily, java.math.RoundingMode.UNNECESSARY);
        int compareTo = ((java.lang.Comparable) x).compareTo(x3);
        switch (com.google.common.math.ToDoubleRounder.AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                return sign(x) >= 0 ? compareTo >= 0 ? roundToDoubleArbitrarily : com.google.common.math.DoubleUtils.nextDown(roundToDoubleArbitrarily) : compareTo <= 0 ? roundToDoubleArbitrarily : java.lang.Math.nextUp(roundToDoubleArbitrarily);
            case 2:
            case 3:
            case 4:
                if (compareTo >= 0) {
                    d = java.lang.Math.nextUp(roundToDoubleArbitrarily);
                    if (d == Double.POSITIVE_INFINITY) {
                        return roundToDoubleArbitrarily;
                    }
                    x2 = toX(d, java.math.RoundingMode.CEILING);
                } else {
                    double nextDown = com.google.common.math.DoubleUtils.nextDown(roundToDoubleArbitrarily);
                    if (nextDown == Double.NEGATIVE_INFINITY) {
                        return roundToDoubleArbitrarily;
                    }
                    X x4 = toX(nextDown, java.math.RoundingMode.FLOOR);
                    x2 = x3;
                    x3 = x4;
                    d = roundToDoubleArbitrarily;
                    roundToDoubleArbitrarily = nextDown;
                }
                int compareTo2 = ((java.lang.Comparable) minus(x, x3)).compareTo(minus(x2, x));
                if (compareTo2 < 0) {
                    return roundToDoubleArbitrarily;
                }
                if (compareTo2 > 0) {
                    return d;
                }
                int i = com.google.common.math.ToDoubleRounder.AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()];
                if (i == 2) {
                    return (java.lang.Double.doubleToRawLongBits(roundToDoubleArbitrarily) & 1) == 0 ? roundToDoubleArbitrarily : d;
                }
                if (i == 3) {
                    return sign(x) >= 0 ? roundToDoubleArbitrarily : d;
                }
                if (i == 4) {
                    return sign(x) >= 0 ? d : roundToDoubleArbitrarily;
                }
                throw new java.lang.AssertionError("impossible");
            case 5:
                return compareTo >= 0 ? roundToDoubleArbitrarily : com.google.common.math.DoubleUtils.nextDown(roundToDoubleArbitrarily);
            case 6:
                return compareTo <= 0 ? roundToDoubleArbitrarily : java.lang.Math.nextUp(roundToDoubleArbitrarily);
            case 7:
                return sign(x) >= 0 ? compareTo <= 0 ? roundToDoubleArbitrarily : java.lang.Math.nextUp(roundToDoubleArbitrarily) : compareTo >= 0 ? roundToDoubleArbitrarily : com.google.common.math.DoubleUtils.nextDown(roundToDoubleArbitrarily);
            case 8:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(compareTo == 0);
                return roundToDoubleArbitrarily;
            default:
                throw new java.lang.AssertionError("impossible");
        }
    }

    /* renamed from: com.google.common.math.ToDoubleRounder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode;

        static {
            int[] iArr = new int[java.math.RoundingMode.values().length];
            $SwitchMap$java$math$RoundingMode = iArr;
            try {
                iArr[java.math.RoundingMode.DOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.HALF_EVEN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.HALF_DOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.HALF_UP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.FLOOR.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.CEILING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.UP.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.UNNECESSARY.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }
}
