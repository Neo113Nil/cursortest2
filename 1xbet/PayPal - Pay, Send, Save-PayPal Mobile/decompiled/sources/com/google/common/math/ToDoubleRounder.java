package com.google.common.math;

/* loaded from: classes9.dex */
abstract class ToDoubleRounder<X extends java.lang.Number & java.lang.Comparable<X>> {
    abstract X minus(X x, X x2);

    abstract double roundToDoubleArbitrarily(X x);

    abstract int sign(X x);

    abstract X toX(double d, java.math.RoundingMode roundingMode);

    ToDoubleRounder() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final double roundToDouble(X x, java.math.RoundingMode roundingMode) {
        X x2;
        double d;
        int compareTo;
        com.google.common.base.Preconditions.checkNotNull(x, "x");
        com.google.common.base.Preconditions.checkNotNull(roundingMode, "mode");
        double roundToDoubleArbitrarily = roundToDoubleArbitrarily(x);
        if (java.lang.Double.isInfinite(roundToDoubleArbitrarily)) {
            switch (com.google.common.math.ToDoubleRounder.AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
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
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(x);
                    sb.append(" cannot be represented precisely as a double");
                    throw new java.lang.ArithmeticException(sb.toString());
            }
        }
        X x3 = toX(roundToDoubleArbitrarily, java.math.RoundingMode.UNNECESSARY);
        int compareTo2 = ((java.lang.Comparable) x).compareTo(x3);
        switch (com.google.common.math.ToDoubleRounder.AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                if (sign(x) >= 0) {
                    if (compareTo2 < 0) {
                        return com.google.common.math.DoubleUtils.nextDown(roundToDoubleArbitrarily);
                    }
                } else if (compareTo2 > 0) {
                    return java.lang.Math.nextUp(roundToDoubleArbitrarily);
                }
                return roundToDoubleArbitrarily;
            case 2:
            case 3:
            case 4:
                if (compareTo2 >= 0) {
                    d = java.lang.Math.nextUp(roundToDoubleArbitrarily);
                    if (d != Double.POSITIVE_INFINITY) {
                        x2 = toX(d, java.math.RoundingMode.CEILING);
                        compareTo = ((java.lang.Comparable) minus(x, x3)).compareTo(minus(x2, x));
                        if (compareTo >= 0) {
                            if (compareTo <= 0) {
                                int i = com.google.common.math.ToDoubleRounder.AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()];
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            if (sign(x) >= 0) {
                                            }
                                        } else {
                                            throw new java.lang.AssertionError("impossible");
                                        }
                                    } else if (sign(x) >= 0) {
                                    }
                                } else if ((java.lang.Double.doubleToRawLongBits(roundToDoubleArbitrarily) & 1) == 0) {
                                }
                            }
                            return d;
                        }
                        return roundToDoubleArbitrarily;
                    }
                    return roundToDoubleArbitrarily;
                }
                double nextDown = com.google.common.math.DoubleUtils.nextDown(roundToDoubleArbitrarily);
                if (nextDown != Double.NEGATIVE_INFINITY) {
                    X x4 = toX(nextDown, java.math.RoundingMode.FLOOR);
                    x2 = x3;
                    x3 = x4;
                    d = roundToDoubleArbitrarily;
                    roundToDoubleArbitrarily = nextDown;
                    compareTo = ((java.lang.Comparable) minus(x, x3)).compareTo(minus(x2, x));
                    if (compareTo >= 0) {
                    }
                    return roundToDoubleArbitrarily;
                }
                return roundToDoubleArbitrarily;
            case 5:
                if (compareTo2 < 0) {
                    return com.google.common.math.DoubleUtils.nextDown(roundToDoubleArbitrarily);
                }
                return roundToDoubleArbitrarily;
            case 6:
                if (compareTo2 > 0) {
                    return java.lang.Math.nextUp(roundToDoubleArbitrarily);
                }
                return roundToDoubleArbitrarily;
            case 7:
                if (sign(x) >= 0) {
                    if (compareTo2 > 0) {
                        return java.lang.Math.nextUp(roundToDoubleArbitrarily);
                    }
                } else if (compareTo2 < 0) {
                    return com.google.common.math.DoubleUtils.nextDown(roundToDoubleArbitrarily);
                }
                return roundToDoubleArbitrarily;
            case 8:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(compareTo2 == 0);
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
