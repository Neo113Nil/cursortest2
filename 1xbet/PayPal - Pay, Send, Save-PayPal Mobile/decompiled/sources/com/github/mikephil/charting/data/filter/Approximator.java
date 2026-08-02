package com.github.mikephil.charting.data.filter;

/* loaded from: classes8.dex */
public class Approximator {
    public float[] reduceWithDouglasPeucker(float[] fArr, float f) {
        com.github.mikephil.charting.data.filter.Approximator.Line line = new com.github.mikephil.charting.data.filter.Approximator.Line(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1]);
        float f2 = 0.0f;
        int i = 0;
        for (int i2 = 2; i2 < fArr.length - 2; i2 += 2) {
            float abs = java.lang.Math.abs((((line.getHighSpeedVideoSizes * fArr[i2]) - (line.Camera2StreamConfigurationMap * fArr[i2 + 1])) + line.getOutputFormats) - line.getHighSpeedVideoFpsRangesFor) / line.getHighResolutionOutputSizeshNQ4ISI;
            if (abs > f2) {
                i = i2;
                f2 = abs;
            }
        }
        if (f2 > f) {
            float[] reduceWithDouglasPeucker = reduceWithDouglasPeucker(java.util.Arrays.copyOfRange(fArr, 0, i + 2), f);
            float[] reduceWithDouglasPeucker2 = reduceWithDouglasPeucker(java.util.Arrays.copyOfRange(fArr, i, fArr.length), f);
            float[][] fArr2 = {reduceWithDouglasPeucker, java.util.Arrays.copyOfRange(reduceWithDouglasPeucker2, 2, reduceWithDouglasPeucker2.length)};
            int i3 = 0;
            for (int i4 = 0; i4 < 2; i4++) {
                i3 += fArr2[i4].length;
            }
            float[] fArr3 = new float[i3];
            int i5 = 0;
            for (int i6 = 0; i6 < 2; i6++) {
                for (float f3 : fArr2[i6]) {
                    fArr3[i5] = f3;
                    i5++;
                }
            }
            return fArr3;
        }
        return line.getHighSpeedVideoFpsRanges;
    }

    class Line {
        float Camera2StreamConfigurationMap;
        float getHighResolutionOutputSizeshNQ4ISI;
        float[] getHighSpeedVideoFpsRanges;
        float getHighSpeedVideoFpsRangesFor;
        float getHighSpeedVideoSizes;
        float getOutputFormats;

        public Line(float f, float f2, float f3, float f4) {
            this.Camera2StreamConfigurationMap = f - f3;
            this.getHighSpeedVideoSizes = f2 - f4;
            this.getOutputFormats = f * f4;
            this.getHighSpeedVideoFpsRangesFor = f3 * f2;
            this.getHighResolutionOutputSizeshNQ4ISI = (float) java.lang.Math.sqrt((r3 * r3) + (r0 * r0));
            this.getHighSpeedVideoFpsRanges = new float[]{f, f2, f3, f4};
        }
    }
}
