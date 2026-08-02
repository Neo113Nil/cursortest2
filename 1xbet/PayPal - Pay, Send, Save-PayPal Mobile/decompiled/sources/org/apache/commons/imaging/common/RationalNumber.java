package org.apache.commons.imaging.common;

/* loaded from: classes17.dex */
public class RationalNumber extends java.lang.Number {
    private static final double TOLERANCE = 1.0E-8d;
    private static final long serialVersionUID = -8412262656468158691L;
    public final int divisor;
    public final int numerator;

    public RationalNumber(int i, int i2) {
        this.numerator = i;
        this.divisor = i2;
    }

    static org.apache.commons.imaging.common.RationalNumber factoryMethod(long j, long j2) {
        if (j > androidx.collection.SieveCacheKt.NodeLinkMask || j < androidx.collection.SieveCacheKt.NodeMetaAndPreviousMask || j2 > androidx.collection.SieveCacheKt.NodeLinkMask || j2 < androidx.collection.SieveCacheKt.NodeMetaAndPreviousMask) {
            while (true) {
                if ((j > androidx.collection.SieveCacheKt.NodeLinkMask || j < androidx.collection.SieveCacheKt.NodeMetaAndPreviousMask || j2 > androidx.collection.SieveCacheKt.NodeLinkMask || j2 < androidx.collection.SieveCacheKt.NodeMetaAndPreviousMask) && java.lang.Math.abs(j) > 1 && java.lang.Math.abs(j2) > 1) {
                    j >>= 1;
                    j2 >>= 1;
                }
            }
            if (j2 == 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid value, numerator: ");
                sb.append(j);
                sb.append(", divisor: ");
                sb.append(j2);
                throw new java.lang.NumberFormatException(sb.toString());
            }
        }
        long gcd = gcd(j, j2);
        return new org.apache.commons.imaging.common.RationalNumber((int) (j / gcd), (int) (j2 / gcd));
    }

    private static long gcd(long j, long j2) {
        while (true) {
            long j3 = j;
            j = j2;
            if (j == 0) {
                return j3;
            }
            j2 = j3 % j;
        }
    }

    public org.apache.commons.imaging.common.RationalNumber negate() {
        return new org.apache.commons.imaging.common.RationalNumber(-this.numerator, this.divisor);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.numerator / this.divisor;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.numerator / this.divisor;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.numerator / this.divisor;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.numerator / this.divisor;
    }

    public java.lang.String toString() {
        if (this.divisor == 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid rational (");
            sb.append(this.numerator);
            sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            sb.append(this.divisor);
            sb.append(")");
            return sb.toString();
        }
        java.text.NumberFormat numberFormat = java.text.NumberFormat.getInstance();
        if (this.numerator % this.divisor == 0) {
            return numberFormat.format(r3 / r4);
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(this.numerator);
        sb2.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb2.append(this.divisor);
        sb2.append(" (");
        sb2.append(numberFormat.format(this.numerator / this.divisor));
        sb2.append(")");
        return sb2.toString();
    }

    public java.lang.String toDisplayString() {
        int i = this.numerator;
        int i2 = this.divisor;
        if (i % i2 == 0) {
            return java.lang.Integer.toString(i / i2);
        }
        java.text.NumberFormat numberFormat = java.text.NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(3);
        return numberFormat.format(this.numerator / this.divisor);
    }

    static final class Option {
        public final double error;
        public final org.apache.commons.imaging.common.RationalNumber rationalNumber;

        private Option(org.apache.commons.imaging.common.RationalNumber rationalNumber, double d) {
            this.rationalNumber = rationalNumber;
            this.error = d;
        }

        public static org.apache.commons.imaging.common.RationalNumber.Option factory(org.apache.commons.imaging.common.RationalNumber rationalNumber, double d) {
            return new org.apache.commons.imaging.common.RationalNumber.Option(rationalNumber, java.lang.Math.abs(rationalNumber.doubleValue() - d));
        }

        public final java.lang.String toString() {
            return this.rationalNumber.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.apache.commons.imaging.common.RationalNumber valueOf(double d) {
        boolean z;
        org.apache.commons.imaging.common.RationalNumber rationalNumber;
        org.apache.commons.imaging.common.RationalNumber rationalNumber2;
        org.apache.commons.imaging.common.RationalNumber rationalNumber3;
        org.apache.commons.imaging.common.RationalNumber.Option option;
        org.apache.commons.imaging.common.RationalNumber.Option option2;
        if (d >= 2.147483647E9d) {
            return new org.apache.commons.imaging.common.RationalNumber(Integer.MAX_VALUE, 1);
        }
        if (d <= -2.147483647E9d) {
            return new org.apache.commons.imaging.common.RationalNumber(androidx.media3.common.C.RATE_UNSET_INT, 1);
        }
        if (d < 0.0d) {
            d = java.lang.Math.abs(d);
            z = true;
        } else {
            z = false;
        }
        if (d == 0.0d) {
            return new org.apache.commons.imaging.common.RationalNumber(0, 1);
        }
        if (d >= 1.0d) {
            int i = (int) d;
            if (i < d) {
                rationalNumber = new org.apache.commons.imaging.common.RationalNumber(i, 1);
                rationalNumber3 = new org.apache.commons.imaging.common.RationalNumber(i + 1, 1);
            } else {
                rationalNumber = new org.apache.commons.imaging.common.RationalNumber(i - 1, 1);
                rationalNumber3 = new org.apache.commons.imaging.common.RationalNumber(i, 1);
            }
        } else {
            int i2 = (int) (1.0d / d);
            if (1.0d / i2 < d) {
                rationalNumber = new org.apache.commons.imaging.common.RationalNumber(1, i2);
                rationalNumber2 = new org.apache.commons.imaging.common.RationalNumber(1, i2 - 1);
            } else {
                rationalNumber = new org.apache.commons.imaging.common.RationalNumber(1, i2 + 1);
                rationalNumber2 = new org.apache.commons.imaging.common.RationalNumber(1, i2);
            }
            rationalNumber3 = rationalNumber2;
        }
        org.apache.commons.imaging.common.RationalNumber.Option factory = org.apache.commons.imaging.common.RationalNumber.Option.factory(rationalNumber, d);
        org.apache.commons.imaging.common.RationalNumber.Option factory2 = org.apache.commons.imaging.common.RationalNumber.Option.factory(rationalNumber3, d);
        if (factory.error < factory2.error) {
            option = factory2;
            option2 = factory;
        } else {
            option = factory2;
            option2 = factory;
            factory = option;
        }
        for (int i3 = 0; factory.error > TOLERANCE && i3 < 100; i3++) {
            org.apache.commons.imaging.common.RationalNumber factoryMethod = factoryMethod(option2.rationalNumber.numerator + option.rationalNumber.numerator, option2.rationalNumber.divisor + option.rationalNumber.divisor);
            org.apache.commons.imaging.common.RationalNumber.Option factory3 = org.apache.commons.imaging.common.RationalNumber.Option.factory(factoryMethod, d);
            if (d >= factoryMethod.doubleValue()) {
                if (option2.error <= factory3.error) {
                    break;
                }
                option2 = factory3;
                if (factory3.error >= factory.error) {
                }
            } else {
                if (option.error <= factory3.error) {
                    break;
                }
                option = factory3;
                if (factory3.error >= factory.error) {
                    factory = factory3;
                }
            }
        }
        org.apache.commons.imaging.common.RationalNumber rationalNumber4 = factory.rationalNumber;
        return z ? rationalNumber4.negate() : rationalNumber4;
    }
}
