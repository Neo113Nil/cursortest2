package com.google.common.math;

/* loaded from: classes9.dex */
public class BigDecimalMath {
    private BigDecimalMath() {
    }

    public static double roundToDouble(java.math.BigDecimal bigDecimal, java.math.RoundingMode roundingMode) {
        return com.google.common.math.BigDecimalMath.BigDecimalToDoubleRounder.INSTANCE.roundToDouble(bigDecimal, roundingMode);
    }

    static final class BigDecimalToDoubleRounder extends com.google.common.math.ToDoubleRounder<java.math.BigDecimal> {
        static final com.google.common.math.BigDecimalMath.BigDecimalToDoubleRounder INSTANCE = new com.google.common.math.BigDecimalMath.BigDecimalToDoubleRounder();

        private BigDecimalToDoubleRounder() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        public final double roundToDoubleArbitrarily(java.math.BigDecimal bigDecimal) {
            return bigDecimal.doubleValue();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        public final int sign(java.math.BigDecimal bigDecimal) {
            return bigDecimal.signum();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        public final java.math.BigDecimal toX(double d, java.math.RoundingMode roundingMode) {
            return new java.math.BigDecimal(d);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        public final java.math.BigDecimal minus(java.math.BigDecimal bigDecimal, java.math.BigDecimal bigDecimal2) {
            return bigDecimal.subtract(bigDecimal2);
        }
    }
}
