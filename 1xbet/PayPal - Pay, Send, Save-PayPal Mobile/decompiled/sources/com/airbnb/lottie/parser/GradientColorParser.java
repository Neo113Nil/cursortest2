package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
public class GradientColorParser implements com.airbnb.lottie.parser.ValueParser<com.airbnb.lottie.model.content.GradientColor> {
    private int getHighSpeedVideoFpsRangesFor;

    public GradientColorParser(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.parser.ValueParser
    public com.airbnb.lottie.model.content.GradientColor parse(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, float f) throws java.io.IOException {
        boolean z;
        int i;
        int argb;
        int argb2;
        float lerp;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        char c = 0;
        boolean z2 = jsonReader.peek() == com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_ARRAY;
        if (z2) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(java.lang.Float.valueOf((float) jsonReader.nextDouble()));
        }
        int i2 = 3;
        int i3 = 2;
        if (arrayList.size() == 4 && ((java.lang.Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, java.lang.Float.valueOf(0.0f));
            arrayList.add(java.lang.Float.valueOf(1.0f));
            arrayList.add((java.lang.Float) arrayList.get(1));
            arrayList.add((java.lang.Float) arrayList.get(2));
            arrayList.add((java.lang.Float) arrayList.get(3));
            this.getHighSpeedVideoFpsRangesFor = 2;
        }
        if (z2) {
            jsonReader.endArray();
        }
        if (this.getHighSpeedVideoFpsRangesFor == -1) {
            this.getHighSpeedVideoFpsRangesFor = arrayList.size() / 4;
        }
        int i4 = this.getHighSpeedVideoFpsRangesFor;
        float[] fArr = new float[i4];
        int[] iArr = new int[i4];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < this.getHighSpeedVideoFpsRangesFor * 4) {
            int i8 = i5 / 4;
            double floatValue = ((java.lang.Float) arrayList.get(i5)).floatValue();
            int i9 = i5 % 4;
            if (i9 == 0) {
                if (i8 > 0) {
                    float f2 = (float) floatValue;
                    if (fArr[i8 - 1] >= f2) {
                        fArr[i8] = f2 + 0.01f;
                    }
                }
                fArr[i8] = (float) floatValue;
            } else if (i9 == 1) {
                i6 = (int) (floatValue * 255.0d);
            } else if (i9 == 2) {
                i7 = (int) (floatValue * 255.0d);
            } else if (i9 == i2) {
                iArr[i8] = android.graphics.Color.argb(255, i6, i7, (int) (floatValue * 255.0d));
            }
            i5++;
            i2 = 3;
        }
        com.airbnb.lottie.model.content.GradientColor gradientColor = new com.airbnb.lottie.model.content.GradientColor(fArr, iArr);
        int i10 = this.getHighSpeedVideoFpsRangesFor * 4;
        if (arrayList.size() <= i10) {
            return gradientColor;
        }
        float[] positions = gradientColor.getPositions();
        int[] colors = gradientColor.getColors();
        int size = (arrayList.size() - i10) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i11 = 0;
        while (i10 < arrayList.size()) {
            if (i10 % 2 == 0) {
                fArr2[i11] = ((java.lang.Float) arrayList.get(i10)).floatValue();
            } else {
                fArr3[i11] = ((java.lang.Float) arrayList.get(i10)).floatValue();
                i11++;
            }
            i10++;
        }
        float[] mergeUniqueElements = mergeUniqueElements(gradientColor.getPositions(), fArr2);
        int length = mergeUniqueElements.length;
        int[] iArr2 = new int[length];
        int i12 = 0;
        while (i12 < length) {
            float f3 = mergeUniqueElements[i12];
            int binarySearch = java.util.Arrays.binarySearch(positions, f3);
            int binarySearch2 = java.util.Arrays.binarySearch(fArr2, f3);
            if (binarySearch < 0 || binarySearch2 > 0) {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                float f4 = fArr3[binarySearch2];
                if (colors.length < 2 || f3 == positions[c]) {
                    z = true;
                    i = colors[c];
                } else {
                    for (int i13 = 1; i13 < positions.length; i13++) {
                        float f5 = positions[i13];
                        if (f5 < f3) {
                            z = true;
                            if (i13 != positions.length - 1) {
                            }
                        } else {
                            z = true;
                        }
                        if (i13 == positions.length - 1 && f3 >= f5) {
                            argb = android.graphics.Color.argb((int) (f4 * 255.0f), android.graphics.Color.red(colors[i13]), android.graphics.Color.green(colors[i13]), android.graphics.Color.blue(colors[i13]));
                        } else {
                            int i14 = i13 - 1;
                            float f6 = positions[i14];
                            int evaluate = com.airbnb.lottie.utils.GammaEvaluator.evaluate((f3 - f6) / (f5 - f6), colors[i14], colors[i13]);
                            argb = android.graphics.Color.argb((int) (f4 * 255.0f), android.graphics.Color.red(evaluate), android.graphics.Color.green(evaluate), android.graphics.Color.blue(evaluate));
                        }
                        i = argb;
                        c = 0;
                    }
                    throw new java.lang.IllegalArgumentException("Unreachable code.");
                }
                iArr2[i12] = i;
            } else {
                int i15 = colors[binarySearch];
                if (size < i3 || f3 <= fArr2[c]) {
                    argb2 = android.graphics.Color.argb((int) (fArr3[c] * 255.0f), android.graphics.Color.red(i15), android.graphics.Color.green(i15), android.graphics.Color.blue(i15));
                } else {
                    for (int i16 = 1; i16 < size; i16++) {
                        float f7 = fArr2[i16];
                        if (f7 >= f3 || i16 == size - 1) {
                            if (f7 <= f3) {
                                lerp = fArr3[i16];
                            } else {
                                int i17 = i16 - 1;
                                float f8 = fArr2[i17];
                                lerp = com.airbnb.lottie.utils.MiscUtils.lerp(fArr3[i17], fArr3[i16], (f3 - f8) / (f7 - f8));
                            }
                            argb2 = android.graphics.Color.argb((int) (lerp * 255.0f), android.graphics.Color.red(i15), android.graphics.Color.green(i15), android.graphics.Color.blue(i15));
                        }
                    }
                    throw new java.lang.IllegalArgumentException("Unreachable code.");
                }
                iArr2[i12] = argb2;
                z = true;
            }
            i12++;
            i3 = 2;
        }
        return new com.airbnb.lottie.model.content.GradientColor(mergeUniqueElements, iArr2);
    }

    protected static float[] mergeUniqueElements(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            float f = i2 < fArr.length ? fArr[i2] : Float.NaN;
            float f2 = i3 < fArr2.length ? fArr2[i3] : Float.NaN;
            if (java.lang.Float.isNaN(f2) || f < f2) {
                fArr3[i4] = f;
                i2++;
            } else if (java.lang.Float.isNaN(f) || f2 < f) {
                fArr3[i4] = f2;
                i3++;
            } else {
                fArr3[i4] = f;
                i2++;
                i3++;
                i++;
            }
        }
        return i == 0 ? fArr3 : java.util.Arrays.copyOf(fArr3, length - i);
    }
}
