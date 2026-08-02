package androidx.core.view;

/* loaded from: classes3.dex */
public final class DisplayShapeCompat {
    static final androidx.core.view.DisplayShapeCompat getHighSpeedVideoFpsRangesFor = new androidx.core.view.DisplayShapeCompat("", 0, 0, 1.0f, 0, 0, 0, 1.0f);
    private final androidx.core.view.DisplayShapeCompat.Impl getHighSpeedVideoSizes;

    interface Impl {
        android.view.DisplayShape cw_();

        android.graphics.Path getHighResolutionOutputSizeshNQ4ISI();
    }

    private DisplayShapeCompat(android.view.DisplayShape displayShape) {
        this.getHighSpeedVideoSizes = new androidx.core.view.DisplayShapeCompat.Impl34(displayShape);
    }

    private DisplayShapeCompat(java.lang.String str, int i, int i2, float f, int i3, int i4, int i5, float f2) {
        this.getHighSpeedVideoSizes = new androidx.core.view.DisplayShapeCompat.ImplBase(str, i, i2, f, i3, i4, i5, f2);
    }

    static androidx.core.view.DisplayShapeCompat cs_(android.view.DisplayShape displayShape) {
        if (displayShape == null) {
            return null;
        }
        return new androidx.core.view.DisplayShapeCompat(displayShape);
    }

    static android.view.DisplayShape ct_(androidx.core.view.DisplayShapeCompat displayShapeCompat) {
        if (displayShapeCompat == null) {
            return null;
        }
        return displayShapeCompat.getHighSpeedVideoSizes.cw_();
    }

    public static androidx.core.view.DisplayShapeCompat create(java.lang.String str, float f, int i, int i2) {
        return new androidx.core.view.DisplayShapeCompat(str, i, i2, f, 0, 0, 0, 1.0f);
    }

    public static androidx.core.view.DisplayShapeCompat create(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        return new androidx.core.view.DisplayShapeCompat(Camera2StreamConfigurationMap(i, i2, z, i3, i4, i5, i6), i, i2, 1.0f, 0, 0, 0, 1.0f);
    }

    private static java.lang.String Camera2StreamConfigurationMap(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        if (z) {
            int i7 = i / 2;
            int i8 = i2 / 2;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("M0,");
            sb.append(i8);
            sb.append(" A");
            sb.append(i7);
            sb.append(",");
            sb.append(i8);
            sb.append(" 0 1,1 ");
            sb.append(i);
            sb.append(",");
            sb.append(i8);
            sb.append(" A");
            sb.append(i7);
            sb.append(",");
            sb.append(i8);
            sb.append(" 0 1,1 0,");
            sb.append(i8);
            sb.append(" Z");
            return sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("M ");
        int min = java.lang.Math.min(i / 2, i2 / 2);
        int min2 = java.lang.Math.min(min, i3);
        int min3 = java.lang.Math.min(min, i4);
        int min4 = java.lang.Math.min(min, i5);
        int min5 = java.lang.Math.min(min, i6);
        sb2.append(min2);
        sb2.append(",0 L ");
        sb2.append(i - min3);
        sb2.append(",0");
        if (min3 > 0) {
            sb2.append(" A ");
            sb2.append(min3);
            sb2.append(",");
            sb2.append(min3);
            sb2.append(" 0 0,1 ");
            sb2.append(i);
            sb2.append(",");
            sb2.append(min3);
        }
        sb2.append(" L ");
        sb2.append(i);
        sb2.append(",");
        sb2.append(i2 - min4);
        if (min4 > 0) {
            sb2.append(" A ");
            sb2.append(min4);
            sb2.append(",");
            sb2.append(min4);
            sb2.append(" 0 0,1 ");
            sb2.append(i - min4);
            sb2.append(",");
            sb2.append(i2);
        }
        sb2.append(" L ");
        sb2.append(min5);
        sb2.append(",");
        sb2.append(i2);
        if (min5 > 0) {
            sb2.append(" A ");
            sb2.append(min5);
            sb2.append(",");
            sb2.append(min5);
            sb2.append(" 0 0,1 0,");
            sb2.append(i2 - min5);
        }
        if (min2 > 0) {
            sb2.append(" L 0,");
            sb2.append(min2);
            sb2.append(" A ");
            sb2.append(min2);
            sb2.append(",");
            sb2.append(min2);
            sb2.append(" 0 0,1 ");
            sb2.append(min2);
            sb2.append(",0");
        }
        sb2.append(" Z");
        return sb2.toString();
    }

    public final android.graphics.Path getPath() {
        return this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.core.view.DisplayShapeCompat) {
            return java.util.Objects.equals(this.getHighSpeedVideoSizes, ((androidx.core.view.DisplayShapeCompat) obj).getHighSpeedVideoSizes);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Objects.hashCode(this.getHighSpeedVideoSizes);
    }

    public final java.lang.String toString() {
        return this.getHighSpeedVideoSizes.toString();
    }

    static class ImplBase implements androidx.core.view.DisplayShapeCompat.Impl {
        private android.graphics.Path Camera2StreamConfigurationMap;
        private final int getHighResolutionOutputSizeshNQ4ISI;
        private final java.lang.String getHighSpeedVideoFpsRanges;
        private final int getHighSpeedVideoFpsRangesFor;
        private final int getHighSpeedVideoSizes;
        private final int getInputFormats;
        private final float getInputSizeshNQ4ISI;
        private final float getOutputFormats;
        private final int getOutputMinFrameDuration;

        @Override // androidx.core.view.DisplayShapeCompat.Impl
        public android.view.DisplayShape cw_() {
            return null;
        }

        ImplBase(java.lang.String str, int i, int i2, float f, int i3, int i4, int i5, float f2) {
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighSpeedVideoSizes = i;
            this.getHighResolutionOutputSizeshNQ4ISI = i2;
            this.getOutputFormats = f;
            this.getOutputMinFrameDuration = i3;
            this.getHighSpeedVideoFpsRangesFor = i4;
            this.getInputFormats = i5;
            this.getInputSizeshNQ4ISI = f2;
        }

        @Override // androidx.core.view.DisplayShapeCompat.Impl
        public android.graphics.Path getHighResolutionOutputSizeshNQ4ISI() {
            float f;
            float f2;
            float f3;
            float f4;
            android.graphics.Path path = this.Camera2StreamConfigurationMap;
            if (path != null) {
                return path;
            }
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            if (str == null || str.isEmpty()) {
                return new android.graphics.Path();
            }
            try {
                android.graphics.Path createPathFromPathData = androidx.core.graphics.PathParser.createPathFromPathData(this.getHighSpeedVideoFpsRanges);
                if (!createPathFromPathData.isEmpty()) {
                    android.graphics.Matrix matrix = new android.graphics.Matrix();
                    int i = this.getOutputMinFrameDuration;
                    if (i != 0) {
                        float f5 = 0.0f;
                        if (i != 1) {
                            if (i == 2) {
                                f5 = this.getHighSpeedVideoSizes;
                                f3 = this.getHighResolutionOutputSizeshNQ4ISI;
                                f4 = 180.0f;
                            } else if (i != 3) {
                                f = 0.0f;
                                f2 = 0.0f;
                            } else {
                                f3 = this.getHighResolutionOutputSizeshNQ4ISI;
                                f4 = 270.0f;
                            }
                            float f6 = f4;
                            f2 = f3;
                            f = f5;
                            f5 = f6;
                        } else {
                            f = this.getHighSpeedVideoSizes;
                            f5 = 90.0f;
                            f2 = 0.0f;
                        }
                        matrix.preRotate(f5, f, f2);
                    }
                    float f7 = this.getOutputFormats;
                    if (f7 != 1.0f) {
                        matrix.preScale(f7, f7);
                    }
                    int i2 = this.getHighSpeedVideoFpsRangesFor;
                    if (i2 != 0 || this.getInputFormats != 0) {
                        matrix.postTranslate(i2, this.getInputFormats);
                    }
                    float f8 = this.getInputSizeshNQ4ISI;
                    if (f8 != 1.0f) {
                        matrix.postScale(f8, f8);
                    }
                    createPathFromPathData.transform(matrix);
                }
                this.Camera2StreamConfigurationMap = createPathFromPathData;
                return createPathFromPathData;
            } catch (java.lang.RuntimeException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to parse DisplayShapeCompat path data: ");
                sb.append(this.getHighSpeedVideoFpsRanges);
                throw new java.lang.IllegalArgumentException(sb.toString(), e);
            }
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.core.view.DisplayShapeCompat.ImplBase)) {
                return false;
            }
            androidx.core.view.DisplayShapeCompat.ImplBase implBase = (androidx.core.view.DisplayShapeCompat.ImplBase) obj;
            return java.util.Objects.equals(this.getHighSpeedVideoFpsRanges, implBase.getHighSpeedVideoFpsRanges) && this.getHighSpeedVideoSizes == implBase.getHighSpeedVideoSizes && this.getHighResolutionOutputSizeshNQ4ISI == implBase.getHighResolutionOutputSizeshNQ4ISI && this.getOutputFormats == implBase.getOutputFormats && this.getOutputMinFrameDuration == implBase.getOutputMinFrameDuration && this.getHighSpeedVideoFpsRangesFor == implBase.getHighSpeedVideoFpsRangesFor && this.getInputFormats == implBase.getInputFormats && this.getInputSizeshNQ4ISI == implBase.getInputSizeshNQ4ISI;
        }

        public int hashCode() {
            return java.util.Objects.hash(this.getHighSpeedVideoFpsRanges, java.lang.Integer.valueOf(this.getHighSpeedVideoSizes), java.lang.Integer.valueOf(this.getHighResolutionOutputSizeshNQ4ISI), java.lang.Float.valueOf(this.getOutputFormats), java.lang.Integer.valueOf(this.getOutputMinFrameDuration), java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor), java.lang.Integer.valueOf(this.getInputFormats), java.lang.Float.valueOf(this.getInputSizeshNQ4ISI));
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DisplayShapeCompat{ spec=");
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            sb.append(str != null ? java.lang.Integer.valueOf(str.hashCode()) : "null");
            sb.append(" displayWidth=");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(" displayHeight=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(" physicalPixelDisplaySizeRatio=");
            sb.append(this.getOutputFormats);
            sb.append(" rotation=");
            sb.append(this.getOutputMinFrameDuration);
            sb.append(" offsetX=");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(" offsetY=");
            sb.append(this.getInputFormats);
            sb.append(" scale=");
            sb.append(this.getInputSizeshNQ4ISI);
            sb.append("}");
            return sb.toString();
        }
    }

    /* loaded from: classes7.dex */
    static class Impl34 implements androidx.core.view.DisplayShapeCompat.Impl {
        private final android.view.DisplayShape getHighSpeedVideoSizes;

        Impl34(android.view.DisplayShape displayShape) {
            this.getHighSpeedVideoSizes = displayShape;
        }

        @Override // androidx.core.view.DisplayShapeCompat.Impl
        public android.graphics.Path getHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighSpeedVideoSizes.getPath();
        }

        @Override // androidx.core.view.DisplayShapeCompat.Impl
        public android.view.DisplayShape cw_() {
            return this.getHighSpeedVideoSizes;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof androidx.core.view.DisplayShapeCompat.Impl34) {
                return java.util.Objects.equals(this.getHighSpeedVideoSizes, ((androidx.core.view.DisplayShapeCompat.Impl34) obj).getHighSpeedVideoSizes);
            }
            return false;
        }

        public int hashCode() {
            return java.util.Objects.hashCode(this.getHighSpeedVideoSizes);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DisplayShapeCompat{mPlatformDisplayShape=");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
            return sb.toString();
        }
    }
}
