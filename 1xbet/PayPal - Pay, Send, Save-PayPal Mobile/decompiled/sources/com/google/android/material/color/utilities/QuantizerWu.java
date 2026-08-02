package com.google.android.material.color.utilities;

/* loaded from: classes8.dex */
public final class QuantizerWu implements com.google.android.material.color.utilities.Quantizer {
    private static final int INDEX_BITS = 5;
    private static final int INDEX_COUNT = 33;
    private static final int TOTAL_SIZE = 35937;
    com.google.android.material.color.utilities.QuantizerWu.Box[] cubes;
    double[] moments;
    int[] momentsB;
    int[] momentsG;
    int[] momentsR;
    int[] weights;

    enum Direction {
        RED,
        GREEN,
        BLUE
    }

    static int getIndex(int i, int i2, int i3) {
        return (i << 10) + (i << 6) + i + (i2 << 5) + i2 + i3;
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public final com.google.android.material.color.utilities.QuantizerResult quantize(int[] iArr, int i) {
        constructHistogram(new com.google.android.material.color.utilities.QuantizerMap().quantize(iArr, i).colorToCount);
        createMoments();
        java.util.List<java.lang.Integer> createResult = createResult(createBoxes(i).resultCount);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator<java.lang.Integer> it = createResult.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(java.lang.Integer.valueOf(it.next().intValue()), 0);
        }
        return new com.google.android.material.color.utilities.QuantizerResult(linkedHashMap);
    }

    final void constructHistogram(java.util.Map<java.lang.Integer, java.lang.Integer> map) {
        this.weights = new int[TOTAL_SIZE];
        this.momentsR = new int[TOTAL_SIZE];
        this.momentsG = new int[TOTAL_SIZE];
        this.momentsB = new int[TOTAL_SIZE];
        this.moments = new double[TOTAL_SIZE];
        for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            int redFromArgb = com.google.android.material.color.utilities.ColorUtils.redFromArgb(intValue);
            int greenFromArgb = com.google.android.material.color.utilities.ColorUtils.greenFromArgb(intValue);
            int blueFromArgb = com.google.android.material.color.utilities.ColorUtils.blueFromArgb(intValue);
            int index = getIndex((redFromArgb >> 3) + 1, (greenFromArgb >> 3) + 1, (blueFromArgb >> 3) + 1);
            int[] iArr = this.weights;
            iArr[index] = iArr[index] + intValue2;
            int[] iArr2 = this.momentsR;
            iArr2[index] = iArr2[index] + (redFromArgb * intValue2);
            int[] iArr3 = this.momentsG;
            iArr3[index] = iArr3[index] + (greenFromArgb * intValue2);
            int[] iArr4 = this.momentsB;
            iArr4[index] = iArr4[index] + (blueFromArgb * intValue2);
            double[] dArr = this.moments;
            dArr[index] = dArr[index] + (intValue2 * ((redFromArgb * redFromArgb) + (greenFromArgb * greenFromArgb) + (blueFromArgb * blueFromArgb)));
        }
    }

    final void createMoments() {
        int i = 1;
        while (true) {
            int i2 = 33;
            if (i >= 33) {
                return;
            }
            int[] iArr = new int[33];
            int[] iArr2 = new int[33];
            int[] iArr3 = new int[33];
            int[] iArr4 = new int[33];
            double[] dArr = new double[33];
            int i3 = 1;
            while (i3 < i2) {
                int i4 = 0;
                int i5 = 0;
                double d = 0.0d;
                int i6 = 1;
                int i7 = 0;
                int i8 = 0;
                while (i6 < i2) {
                    int index = getIndex(i, i3, i6);
                    int i9 = i4 + this.weights[index];
                    i7 += this.momentsR[index];
                    i8 += this.momentsG[index];
                    i5 += this.momentsB[index];
                    d += this.moments[index];
                    iArr[i6] = iArr[i6] + i9;
                    iArr2[i6] = iArr2[i6] + i7;
                    iArr3[i6] = iArr3[i6] + i8;
                    iArr4[i6] = iArr4[i6] + i5;
                    dArr[i6] = dArr[i6] + d;
                    int index2 = getIndex(i - 1, i3, i6);
                    int[] iArr5 = this.weights;
                    iArr5[index] = iArr5[index2] + iArr[i6];
                    int[] iArr6 = this.momentsR;
                    iArr6[index] = iArr6[index2] + iArr2[i6];
                    int[] iArr7 = this.momentsG;
                    iArr7[index] = iArr7[index2] + iArr3[i6];
                    int[] iArr8 = this.momentsB;
                    iArr8[index] = iArr8[index2] + iArr4[i6];
                    double[] dArr2 = this.moments;
                    dArr2[index] = dArr2[index2] + dArr[i6];
                    i6++;
                    i4 = i9;
                    i2 = 33;
                }
                i3++;
                i2 = 33;
            }
            i++;
        }
    }

    final com.google.android.material.color.utilities.QuantizerWu.CreateBoxesResult createBoxes(int i) {
        int i2;
        this.cubes = new com.google.android.material.color.utilities.QuantizerWu.Box[i];
        for (int i3 = 0; i3 < i; i3++) {
            this.cubes[i3] = new com.google.android.material.color.utilities.QuantizerWu.Box(null);
        }
        double[] dArr = new double[i];
        com.google.android.material.color.utilities.QuantizerWu.Box box = this.cubes[0];
        box.r1 = 32;
        box.g1 = 32;
        box.b1 = 32;
        int i4 = 0;
        int i5 = 1;
        while (true) {
            if (i5 >= i) {
                i2 = i;
                break;
            }
            com.google.android.material.color.utilities.QuantizerWu.Box[] boxArr = this.cubes;
            if (cut(boxArr[i4], boxArr[i5]).booleanValue()) {
                dArr[i4] = this.cubes[i4].vol > 1 ? variance(this.cubes[i4]) : 0.0d;
                dArr[i5] = this.cubes[i5].vol > 1 ? variance(this.cubes[i5]) : 0.0d;
            } else {
                dArr[i4] = 0.0d;
                i5--;
            }
            double d = dArr[0];
            int i6 = 0;
            for (int i7 = 1; i7 <= i5; i7++) {
                double d2 = dArr[i7];
                if (d2 > d) {
                    i6 = i7;
                    d = d2;
                }
            }
            if (d <= 0.0d) {
                i2 = i5 + 1;
                break;
            }
            i5++;
            i4 = i6;
        }
        return new com.google.android.material.color.utilities.QuantizerWu.CreateBoxesResult(i, i2);
    }

    final java.util.List<java.lang.Integer> createResult(int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            com.google.android.material.color.utilities.QuantizerWu.Box box = this.cubes[i2];
            int volume = volume(box, this.weights);
            if (volume > 0) {
                arrayList.add(java.lang.Integer.valueOf(((volume(box, this.momentsB) / volume) & 255) | (((volume(box, this.momentsR) / volume) & 255) << 16) | (-16777216) | (((volume(box, this.momentsG) / volume) & 255) << 8)));
            }
        }
        return arrayList;
    }

    final double variance(com.google.android.material.color.utilities.QuantizerWu.Box box) {
        int volume = volume(box, this.momentsR);
        int volume2 = volume(box, this.momentsG);
        int volume3 = volume(box, this.momentsB);
        double d = this.moments[getIndex(box.r1, box.g1, box.b1)];
        double d2 = this.moments[getIndex(box.r1, box.g1, box.b0)];
        double d3 = this.moments[getIndex(box.r1, box.g0, box.b1)];
        double d4 = this.moments[getIndex(box.r1, box.g0, box.b0)];
        double d5 = this.moments[getIndex(box.r0, box.g1, box.b1)];
        double d6 = this.moments[getIndex(box.r0, box.g1, box.b0)];
        return (((((((d - d2) - d3) + d4) - d5) + d6) + this.moments[getIndex(box.r0, box.g0, box.b1)]) - this.moments[getIndex(box.r0, box.g0, box.b0)]) - ((((volume * volume) + (volume2 * volume2)) + (volume3 * volume3)) / volume(box, this.weights));
    }

    final java.lang.Boolean cut(com.google.android.material.color.utilities.QuantizerWu.Box box, com.google.android.material.color.utilities.QuantizerWu.Box box2) {
        com.google.android.material.color.utilities.QuantizerWu.Direction direction;
        int volume = volume(box, this.momentsR);
        int volume2 = volume(box, this.momentsG);
        int volume3 = volume(box, this.momentsB);
        int volume4 = volume(box, this.weights);
        com.google.android.material.color.utilities.QuantizerWu.MaximizeResult maximize = maximize(box, com.google.android.material.color.utilities.QuantizerWu.Direction.RED, box.r0 + 1, box.r1, volume, volume2, volume3, volume4);
        com.google.android.material.color.utilities.QuantizerWu.MaximizeResult maximize2 = maximize(box, com.google.android.material.color.utilities.QuantizerWu.Direction.GREEN, box.g0 + 1, box.g1, volume, volume2, volume3, volume4);
        com.google.android.material.color.utilities.QuantizerWu.MaximizeResult maximize3 = maximize(box, com.google.android.material.color.utilities.QuantizerWu.Direction.BLUE, box.b0 + 1, box.b1, volume, volume2, volume3, volume4);
        double d = maximize.maximum;
        double d2 = maximize2.maximum;
        double d3 = maximize3.maximum;
        if (d < d2 || d < d3) {
            if (d2 >= d && d2 >= d3) {
                direction = com.google.android.material.color.utilities.QuantizerWu.Direction.GREEN;
            } else {
                direction = com.google.android.material.color.utilities.QuantizerWu.Direction.BLUE;
            }
        } else {
            if (maximize.cutLocation < 0) {
                return java.lang.Boolean.FALSE;
            }
            direction = com.google.android.material.color.utilities.QuantizerWu.Direction.RED;
        }
        box2.r1 = box.r1;
        box2.g1 = box.g1;
        box2.b1 = box.b1;
        int i = com.google.android.material.color.utilities.QuantizerWu.AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[direction.ordinal()];
        if (i == 1) {
            box.r1 = maximize.cutLocation;
            box2.r0 = box.r1;
            box2.g0 = box.g0;
            box2.b0 = box.b0;
        } else if (i == 2) {
            box.g1 = maximize2.cutLocation;
            box2.r0 = box.r0;
            box2.g0 = box.g1;
            box2.b0 = box.b0;
        } else if (i == 3) {
            box.b1 = maximize3.cutLocation;
            box2.r0 = box.r0;
            box2.g0 = box.g0;
            box2.b0 = box.b1;
        }
        box.vol = (box.r1 - box.r0) * (box.g1 - box.g0) * (box.b1 - box.b0);
        box2.vol = (box2.r1 - box2.r0) * (box2.g1 - box2.g0) * (box2.b1 - box2.b0);
        return java.lang.Boolean.TRUE;
    }

    /* renamed from: com.google.android.material.color.utilities.QuantizerWu$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction;

        static {
            int[] iArr = new int[com.google.android.material.color.utilities.QuantizerWu.Direction.values().length];
            $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction = iArr;
            try {
                iArr[com.google.android.material.color.utilities.QuantizerWu.Direction.RED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[com.google.android.material.color.utilities.QuantizerWu.Direction.GREEN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[com.google.android.material.color.utilities.QuantizerWu.Direction.BLUE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    final com.google.android.material.color.utilities.QuantizerWu.MaximizeResult maximize(com.google.android.material.color.utilities.QuantizerWu.Box box, com.google.android.material.color.utilities.QuantizerWu.Direction direction, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        com.google.android.material.color.utilities.QuantizerWu quantizerWu = this;
        com.google.android.material.color.utilities.QuantizerWu.Box box2 = box;
        com.google.android.material.color.utilities.QuantizerWu.Direction direction2 = direction;
        int bottom = bottom(box2, direction2, quantizerWu.momentsR);
        int bottom2 = bottom(box2, direction2, quantizerWu.momentsG);
        int bottom3 = bottom(box2, direction2, quantizerWu.momentsB);
        int bottom4 = bottom(box2, direction2, quantizerWu.weights);
        double d = 0.0d;
        int i8 = -1;
        int i9 = i;
        while (i9 < i2) {
            int pVar = top(box2, direction2, i9, quantizerWu.momentsR) + bottom;
            int pVar2 = top(box2, direction2, i9, quantizerWu.momentsG) + bottom2;
            int pVar3 = top(box2, direction2, i9, quantizerWu.momentsB) + bottom3;
            int pVar4 = top(box2, direction2, i9, quantizerWu.weights) + bottom4;
            if (pVar4 == 0) {
                i7 = bottom;
            } else {
                i7 = bottom;
                double d2 = (((pVar * pVar) + (pVar2 * pVar2)) + (pVar3 * pVar3)) / pVar4;
                int i10 = i3 - pVar;
                int i11 = i4 - pVar2;
                int i12 = i5 - pVar3;
                int i13 = i6 - pVar4;
                if (i13 != 0) {
                    double d3 = d2 + ((((i10 * i10) + (i11 * i11)) + (i12 * i12)) / i13);
                    if (d3 > d) {
                        d = d3;
                        i8 = i9;
                    }
                }
            }
            i9++;
            quantizerWu = this;
            box2 = box;
            direction2 = direction;
            bottom = i7;
        }
        return new com.google.android.material.color.utilities.QuantizerWu.MaximizeResult(i8, d);
    }

    static int volume(com.google.android.material.color.utilities.QuantizerWu.Box box, int[] iArr) {
        int i = iArr[getIndex(box.r1, box.g1, box.b1)];
        int i2 = iArr[getIndex(box.r1, box.g1, box.b0)];
        int i3 = iArr[getIndex(box.r1, box.g0, box.b1)];
        int i4 = iArr[getIndex(box.r1, box.g0, box.b0)];
        int i5 = iArr[getIndex(box.r0, box.g1, box.b1)];
        int i6 = iArr[getIndex(box.r0, box.g1, box.b0)];
        return ((((((i - i2) - i3) + i4) - i5) + i6) + iArr[getIndex(box.r0, box.g0, box.b1)]) - iArr[getIndex(box.r0, box.g0, box.b0)];
    }

    static int bottom(com.google.android.material.color.utilities.QuantizerWu.Box box, com.google.android.material.color.utilities.QuantizerWu.Direction direction, int[] iArr) {
        int i;
        int i2;
        int i3 = com.google.android.material.color.utilities.QuantizerWu.AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[direction.ordinal()];
        if (i3 == 1) {
            i = (-iArr[getIndex(box.r0, box.g1, box.b1)]) + iArr[getIndex(box.r0, box.g1, box.b0)] + iArr[getIndex(box.r0, box.g0, box.b1)];
            i2 = iArr[getIndex(box.r0, box.g0, box.b0)];
        } else if (i3 == 2) {
            i = (-iArr[getIndex(box.r1, box.g0, box.b1)]) + iArr[getIndex(box.r1, box.g0, box.b0)] + iArr[getIndex(box.r0, box.g0, box.b1)];
            i2 = iArr[getIndex(box.r0, box.g0, box.b0)];
        } else if (i3 == 3) {
            i = (-iArr[getIndex(box.r1, box.g1, box.b0)]) + iArr[getIndex(box.r1, box.g0, box.b0)] + iArr[getIndex(box.r0, box.g1, box.b0)];
            i2 = iArr[getIndex(box.r0, box.g0, box.b0)];
        } else {
            throw new java.lang.IllegalArgumentException("unexpected direction ".concat(java.lang.String.valueOf(direction)));
        }
        return i - i2;
    }

    static int top(com.google.android.material.color.utilities.QuantizerWu.Box box, com.google.android.material.color.utilities.QuantizerWu.Direction direction, int i, int[] iArr) {
        int i2;
        int i3;
        int i4 = com.google.android.material.color.utilities.QuantizerWu.AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[direction.ordinal()];
        if (i4 == 1) {
            i2 = (iArr[getIndex(i, box.g1, box.b1)] - iArr[getIndex(i, box.g1, box.b0)]) - iArr[getIndex(i, box.g0, box.b1)];
            i3 = iArr[getIndex(i, box.g0, box.b0)];
        } else if (i4 == 2) {
            i2 = (iArr[getIndex(box.r1, i, box.b1)] - iArr[getIndex(box.r1, i, box.b0)]) - iArr[getIndex(box.r0, i, box.b1)];
            i3 = iArr[getIndex(box.r0, i, box.b0)];
        } else if (i4 == 3) {
            i2 = (iArr[getIndex(box.r1, box.g1, i)] - iArr[getIndex(box.r1, box.g0, i)]) - iArr[getIndex(box.r0, box.g1, i)];
            i3 = iArr[getIndex(box.r0, box.g0, i)];
        } else {
            throw new java.lang.IllegalArgumentException("unexpected direction ".concat(java.lang.String.valueOf(direction)));
        }
        return i2 + i3;
    }

    static final class MaximizeResult {
        int cutLocation;
        double maximum;

        MaximizeResult(int i, double d) {
            this.cutLocation = i;
            this.maximum = d;
        }
    }

    static final class CreateBoxesResult {
        int resultCount;

        CreateBoxesResult(int i, int i2) {
            this.resultCount = i2;
        }
    }

    static final class Box {
        int b0;
        int b1;
        int g0;
        int g1;
        int r0;
        int r1;
        int vol;

        private Box() {
            this.r0 = 0;
            this.r1 = 0;
            this.g0 = 0;
            this.g1 = 0;
            this.b0 = 0;
            this.b1 = 0;
            this.vol = 0;
        }

        /* synthetic */ Box(com.google.android.material.color.utilities.QuantizerWu.AnonymousClass1 anonymousClass1) {
            this();
        }
    }
}
