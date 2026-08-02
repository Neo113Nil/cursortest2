package com.google.common.math;

/* loaded from: classes9.dex */
public abstract class LinearTransformation {
    public abstract com.google.common.math.LinearTransformation inverse();

    public abstract boolean isHorizontal();

    public abstract boolean isVertical();

    public abstract double slope();

    public abstract double transform(double d);

    @java.lang.Deprecated
    public LinearTransformation() {
    }

    public static com.google.common.math.LinearTransformation.LinearTransformationBuilder mapping(double d, double d2) {
        com.google.common.base.Preconditions.checkArgument(com.google.common.math.DoubleUtils.isFinite(d) && com.google.common.math.DoubleUtils.isFinite(d2));
        return new com.google.common.math.LinearTransformation.LinearTransformationBuilder(d, d2);
    }

    public static final class LinearTransformationBuilder {
        private final double x1;
        private final double y1;

        private LinearTransformationBuilder(double d, double d2) {
            this.x1 = d;
            this.y1 = d2;
        }

        public final com.google.common.math.LinearTransformation and(double d, double d2) {
            com.google.common.base.Preconditions.checkArgument(com.google.common.math.DoubleUtils.isFinite(d) && com.google.common.math.DoubleUtils.isFinite(d2));
            double d3 = this.x1;
            if (d == d3) {
                com.google.common.base.Preconditions.checkArgument(d2 != this.y1);
                return new com.google.common.math.LinearTransformation.VerticalLinearTransformation(this.x1);
            }
            return withSlope((d2 - this.y1) / (d - d3));
        }

        public final com.google.common.math.LinearTransformation withSlope(double d) {
            com.google.common.base.Preconditions.checkArgument(!java.lang.Double.isNaN(d));
            if (com.google.common.math.DoubleUtils.isFinite(d)) {
                return new com.google.common.math.LinearTransformation.RegularLinearTransformation(d, this.y1 - (this.x1 * d));
            }
            return new com.google.common.math.LinearTransformation.VerticalLinearTransformation(this.x1);
        }
    }

    public static com.google.common.math.LinearTransformation vertical(double d) {
        com.google.common.base.Preconditions.checkArgument(com.google.common.math.DoubleUtils.isFinite(d));
        return new com.google.common.math.LinearTransformation.VerticalLinearTransformation(d);
    }

    public static com.google.common.math.LinearTransformation horizontal(double d) {
        com.google.common.base.Preconditions.checkArgument(com.google.common.math.DoubleUtils.isFinite(d));
        return new com.google.common.math.LinearTransformation.RegularLinearTransformation(0.0d, d);
    }

    public static com.google.common.math.LinearTransformation forNaN() {
        return com.google.common.math.LinearTransformation.NaNLinearTransformation.INSTANCE;
    }

    static final class RegularLinearTransformation extends com.google.common.math.LinearTransformation {

        @com.google.errorprone.annotations.concurrent.LazyInit
        com.google.common.math.LinearTransformation inverse;
        final double slope;
        final double yIntercept;

        @Override // com.google.common.math.LinearTransformation
        public final boolean isVertical() {
            return false;
        }

        RegularLinearTransformation(double d, double d2) {
            this.slope = d;
            this.yIntercept = d2;
            this.inverse = null;
        }

        RegularLinearTransformation(double d, double d2, com.google.common.math.LinearTransformation linearTransformation) {
            this.slope = d;
            this.yIntercept = d2;
            this.inverse = linearTransformation;
        }

        @Override // com.google.common.math.LinearTransformation
        public final boolean isHorizontal() {
            return this.slope == 0.0d;
        }

        @Override // com.google.common.math.LinearTransformation
        public final double slope() {
            return this.slope;
        }

        @Override // com.google.common.math.LinearTransformation
        public final double transform(double d) {
            return (d * this.slope) + this.yIntercept;
        }

        @Override // com.google.common.math.LinearTransformation
        public final com.google.common.math.LinearTransformation inverse() {
            com.google.common.math.LinearTransformation linearTransformation = this.inverse;
            if (linearTransformation != null) {
                return linearTransformation;
            }
            com.google.common.math.LinearTransformation createInverse = createInverse();
            this.inverse = createInverse;
            return createInverse;
        }

        public final java.lang.String toString() {
            return java.lang.String.format("y = %g * x + %g", java.lang.Double.valueOf(this.slope), java.lang.Double.valueOf(this.yIntercept));
        }

        private com.google.common.math.LinearTransformation createInverse() {
            double d = this.slope;
            if (d != 0.0d) {
                return new com.google.common.math.LinearTransformation.RegularLinearTransformation(1.0d / d, (this.yIntercept * (-1.0d)) / d, this);
            }
            return new com.google.common.math.LinearTransformation.VerticalLinearTransformation(this.yIntercept, this);
        }
    }

    static final class VerticalLinearTransformation extends com.google.common.math.LinearTransformation {

        @com.google.errorprone.annotations.concurrent.LazyInit
        com.google.common.math.LinearTransformation inverse;
        final double x;

        @Override // com.google.common.math.LinearTransformation
        public final boolean isHorizontal() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public final boolean isVertical() {
            return true;
        }

        VerticalLinearTransformation(double d) {
            this.x = d;
            this.inverse = null;
        }

        VerticalLinearTransformation(double d, com.google.common.math.LinearTransformation linearTransformation) {
            this.x = d;
            this.inverse = linearTransformation;
        }

        @Override // com.google.common.math.LinearTransformation
        public final double slope() {
            throw new java.lang.IllegalStateException();
        }

        @Override // com.google.common.math.LinearTransformation
        public final double transform(double d) {
            throw new java.lang.IllegalStateException();
        }

        @Override // com.google.common.math.LinearTransformation
        public final com.google.common.math.LinearTransformation inverse() {
            com.google.common.math.LinearTransformation linearTransformation = this.inverse;
            if (linearTransformation != null) {
                return linearTransformation;
            }
            com.google.common.math.LinearTransformation createInverse = createInverse();
            this.inverse = createInverse;
            return createInverse;
        }

        public final java.lang.String toString() {
            return java.lang.String.format("x = %g", java.lang.Double.valueOf(this.x));
        }

        private com.google.common.math.LinearTransformation createInverse() {
            return new com.google.common.math.LinearTransformation.RegularLinearTransformation(0.0d, this.x, this);
        }
    }

    static final class NaNLinearTransformation extends com.google.common.math.LinearTransformation {
        static final com.google.common.math.LinearTransformation.NaNLinearTransformation INSTANCE = new com.google.common.math.LinearTransformation.NaNLinearTransformation();

        @Override // com.google.common.math.LinearTransformation
        public final com.google.common.math.LinearTransformation inverse() {
            return this;
        }

        @Override // com.google.common.math.LinearTransformation
        public final boolean isHorizontal() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public final boolean isVertical() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public final double slope() {
            return Double.NaN;
        }

        @Override // com.google.common.math.LinearTransformation
        public final double transform(double d) {
            return Double.NaN;
        }

        private NaNLinearTransformation() {
        }

        public final java.lang.String toString() {
            return "NaN";
        }
    }
}
