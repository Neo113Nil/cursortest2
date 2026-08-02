package com.airbnb.lottie.model.content;

/* loaded from: classes7.dex */
public class GradientColor {
    private final int[] Camera2StreamConfigurationMap;
    private final float[] getHighResolutionOutputSizeshNQ4ISI;

    public GradientColor(float[] fArr, int[] iArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = fArr;
        this.Camera2StreamConfigurationMap = iArr;
    }

    public float[] getPositions() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int[] getColors() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getSize() {
        return this.Camera2StreamConfigurationMap.length;
    }

    public void lerp(com.airbnb.lottie.model.content.GradientColor gradientColor, com.airbnb.lottie.model.content.GradientColor gradientColor2, float f) {
        int[] iArr;
        if (gradientColor.equals(gradientColor2)) {
            getHighResolutionOutputSizeshNQ4ISI(gradientColor);
            return;
        }
        if (f <= 0.0f) {
            getHighResolutionOutputSizeshNQ4ISI(gradientColor);
            return;
        }
        if (f >= 1.0f) {
            getHighResolutionOutputSizeshNQ4ISI(gradientColor2);
            return;
        }
        if (gradientColor.Camera2StreamConfigurationMap.length != gradientColor2.Camera2StreamConfigurationMap.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb.append(gradientColor.Camera2StreamConfigurationMap.length);
            sb.append(" vs ");
            sb.append(gradientColor2.Camera2StreamConfigurationMap.length);
            sb.append(")");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        int i = 0;
        while (true) {
            iArr = gradientColor.Camera2StreamConfigurationMap;
            if (i >= iArr.length) {
                break;
            }
            this.getHighResolutionOutputSizeshNQ4ISI[i] = com.airbnb.lottie.utils.MiscUtils.lerp(gradientColor.getHighResolutionOutputSizeshNQ4ISI[i], gradientColor2.getHighResolutionOutputSizeshNQ4ISI[i], f);
            this.Camera2StreamConfigurationMap[i] = com.airbnb.lottie.utils.GammaEvaluator.evaluate(f, gradientColor.Camera2StreamConfigurationMap[i], gradientColor2.Camera2StreamConfigurationMap[i]);
            i++;
        }
        int length = iArr.length;
        while (true) {
            float[] fArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (length >= fArr.length) {
                return;
            }
            int[] iArr2 = gradientColor.Camera2StreamConfigurationMap;
            fArr[length] = fArr[iArr2.length - 1];
            int[] iArr3 = this.Camera2StreamConfigurationMap;
            iArr3[length] = iArr3[iArr2.length - 1];
            length++;
        }
    }

    public com.airbnb.lottie.model.content.GradientColor copyWithPositions(float[] fArr) {
        int evaluate;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            int binarySearch = java.util.Arrays.binarySearch(this.getHighResolutionOutputSizeshNQ4ISI, f);
            if (binarySearch >= 0) {
                evaluate = this.Camera2StreamConfigurationMap[binarySearch];
            } else {
                int i2 = -(binarySearch + 1);
                if (i2 == 0) {
                    evaluate = this.Camera2StreamConfigurationMap[0];
                } else {
                    int[] iArr2 = this.Camera2StreamConfigurationMap;
                    if (i2 == iArr2.length - 1) {
                        evaluate = iArr2[iArr2.length - 1];
                    } else {
                        float[] fArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        int i3 = i2 - 1;
                        float f2 = fArr2[i3];
                        evaluate = com.airbnb.lottie.utils.GammaEvaluator.evaluate((f - f2) / (fArr2[i2] - f2), iArr2[i3], iArr2[i2]);
                    }
                }
            }
            iArr[i] = evaluate;
        }
        return new com.airbnb.lottie.model.content.GradientColor(fArr, iArr);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.airbnb.lottie.model.content.GradientColor gradientColor = (com.airbnb.lottie.model.content.GradientColor) obj;
        return java.util.Arrays.equals(this.getHighResolutionOutputSizeshNQ4ISI, gradientColor.getHighResolutionOutputSizeshNQ4ISI) && java.util.Arrays.equals(this.Camera2StreamConfigurationMap, gradientColor.Camera2StreamConfigurationMap);
    }

    public int hashCode() {
        return (java.util.Arrays.hashCode(this.getHighResolutionOutputSizeshNQ4ISI) * 31) + java.util.Arrays.hashCode(this.Camera2StreamConfigurationMap);
    }

    private void getHighResolutionOutputSizeshNQ4ISI(com.airbnb.lottie.model.content.GradientColor gradientColor) {
        int i = 0;
        while (true) {
            int[] iArr = gradientColor.Camera2StreamConfigurationMap;
            if (i >= iArr.length) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI[i] = gradientColor.getHighResolutionOutputSizeshNQ4ISI[i];
            this.Camera2StreamConfigurationMap[i] = iArr[i];
            i++;
        }
    }
}
