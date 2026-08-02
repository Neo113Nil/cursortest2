package com.google.android.material.color.utilities;

/* loaded from: classes8.dex */
public final class TemperatureCache {
    private final com.google.android.material.color.utilities.Hct input;
    private com.google.android.material.color.utilities.Hct precomputedComplement;
    private java.util.List<com.google.android.material.color.utilities.Hct> precomputedHctsByHue;
    private java.util.List<com.google.android.material.color.utilities.Hct> precomputedHctsByTemp;
    private java.util.Map<com.google.android.material.color.utilities.Hct, java.lang.Double> precomputedTempsByHct;

    private static boolean isBetween(double d, double d2, double d3) {
        return d2 < d3 ? d2 <= d && d <= d3 : d2 <= d || d <= d3;
    }

    private TemperatureCache() {
        throw new java.lang.UnsupportedOperationException();
    }

    public TemperatureCache(com.google.android.material.color.utilities.Hct hct) {
        this.input = hct;
    }

    public final com.google.android.material.color.utilities.Hct getComplement() {
        com.google.android.material.color.utilities.Hct hct = this.precomputedComplement;
        if (hct != null) {
            return hct;
        }
        double hue = getColdest().getHue();
        double doubleValue = getTempsByHct().get(getColdest()).doubleValue();
        double hue2 = getWarmest().getHue();
        double doubleValue2 = getTempsByHct().get(getWarmest()).doubleValue();
        boolean isBetween = isBetween(this.input.getHue(), hue, hue2);
        double d = isBetween ? hue2 : hue;
        if (!isBetween) {
            hue = hue2;
        }
        com.google.android.material.color.utilities.Hct hct2 = getHctsByHue().get((int) java.lang.Math.round(this.input.getHue()));
        double relativeTemperature = getRelativeTemperature(this.input);
        double d2 = 1000.0d;
        for (double d3 = 0.0d; d3 <= 360.0d; d3 += 1.0d) {
            double sanitizeDegreesDouble = com.google.android.material.color.utilities.MathUtils.sanitizeDegreesDouble((d3 * 1.0d) + d);
            if (isBetween(sanitizeDegreesDouble, d, hue)) {
                com.google.android.material.color.utilities.Hct hct3 = getHctsByHue().get((int) java.lang.Math.round(sanitizeDegreesDouble));
                double abs = java.lang.Math.abs((1.0d - relativeTemperature) - ((getTempsByHct().get(hct3).doubleValue() - doubleValue) / (doubleValue2 - doubleValue)));
                if (abs < d2) {
                    hct2 = hct3;
                    d2 = abs;
                }
            }
        }
        this.precomputedComplement = hct2;
        return hct2;
    }

    public final java.util.List<com.google.android.material.color.utilities.Hct> getAnalogousColors() {
        return getAnalogousColors(5, 12);
    }

    public final java.util.List<com.google.android.material.color.utilities.Hct> getAnalogousColors(int i, int i2) {
        int round = (int) java.lang.Math.round(this.input.getHue());
        com.google.android.material.color.utilities.Hct hct = getHctsByHue().get(round);
        double relativeTemperature = getRelativeTemperature(hct);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(hct);
        double d = 0.0d;
        double d2 = 0.0d;
        int i3 = 0;
        while (i3 < 360) {
            double relativeTemperature2 = getRelativeTemperature(getHctsByHue().get(com.google.android.material.color.utilities.MathUtils.sanitizeDegreesInt(round + i3)));
            d2 += java.lang.Math.abs(relativeTemperature2 - relativeTemperature);
            i3++;
            relativeTemperature = relativeTemperature2;
        }
        double d3 = d2 / i2;
        double relativeTemperature3 = getRelativeTemperature(hct);
        int i4 = 1;
        while (true) {
            if (arrayList.size() >= i2) {
                break;
            }
            com.google.android.material.color.utilities.Hct hct2 = getHctsByHue().get(com.google.android.material.color.utilities.MathUtils.sanitizeDegreesInt(round + i4));
            double relativeTemperature4 = getRelativeTemperature(hct2);
            d += java.lang.Math.abs(relativeTemperature4 - relativeTemperature3);
            boolean z = d >= ((double) arrayList.size()) * d3;
            int i5 = 1;
            while (z && arrayList.size() < i2) {
                arrayList.add(hct2);
                z = d >= ((double) (arrayList.size() + i5)) * d3;
                i5++;
            }
            i4++;
            if (i4 > 360) {
                while (arrayList.size() < i2) {
                    arrayList.add(hct2);
                }
            } else {
                relativeTemperature3 = relativeTemperature4;
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(this.input);
        int floor = (int) java.lang.Math.floor((i - 1.0d) / 2.0d);
        for (int i6 = 1; i6 < floor + 1; i6++) {
            int i7 = 0 - i6;
            while (i7 < 0) {
                i7 += arrayList.size();
            }
            if (i7 >= arrayList.size()) {
                i7 %= arrayList.size();
            }
            arrayList2.add(0, (com.google.android.material.color.utilities.Hct) arrayList.get(i7));
        }
        for (int i8 = 1; i8 < i - floor; i8++) {
            int i9 = i8;
            while (i9 < 0) {
                i9 += arrayList.size();
            }
            if (i9 >= arrayList.size()) {
                i9 %= arrayList.size();
            }
            arrayList2.add((com.google.android.material.color.utilities.Hct) arrayList.get(i9));
        }
        return arrayList2;
    }

    public final double getRelativeTemperature(com.google.android.material.color.utilities.Hct hct) {
        double doubleValue = getTempsByHct().get(getWarmest()).doubleValue() - getTempsByHct().get(getColdest()).doubleValue();
        double doubleValue2 = getTempsByHct().get(hct).doubleValue();
        double doubleValue3 = getTempsByHct().get(getColdest()).doubleValue();
        if (doubleValue == 0.0d) {
            return 0.5d;
        }
        return (doubleValue2 - doubleValue3) / doubleValue;
    }

    public static double rawTemperature(com.google.android.material.color.utilities.Hct hct) {
        double[] labFromArgb = com.google.android.material.color.utilities.ColorUtils.labFromArgb(hct.toInt());
        return ((java.lang.Math.pow(java.lang.Math.hypot(labFromArgb[1], labFromArgb[2]), 1.07d) * 0.02d) * java.lang.Math.cos(java.lang.Math.toRadians(com.google.android.material.color.utilities.MathUtils.sanitizeDegreesDouble(com.google.android.material.color.utilities.MathUtils.sanitizeDegreesDouble(java.lang.Math.toDegrees(java.lang.Math.atan2(labFromArgb[2], labFromArgb[1]))) - 50.0d)))) - 0.5d;
    }

    private com.google.android.material.color.utilities.Hct getColdest() {
        return getHctsByTemp().get(0);
    }

    private java.util.List<com.google.android.material.color.utilities.Hct> getHctsByHue() {
        java.util.List<com.google.android.material.color.utilities.Hct> list = this.precomputedHctsByHue;
        if (list != null) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (double d = 0.0d; d <= 360.0d; d += 1.0d) {
            arrayList.add(com.google.android.material.color.utilities.Hct.from(d, this.input.getChroma(), this.input.getTone()));
        }
        java.util.List<com.google.android.material.color.utilities.Hct> unmodifiableList = java.util.Collections.unmodifiableList(arrayList);
        this.precomputedHctsByHue = unmodifiableList;
        return unmodifiableList;
    }

    private java.util.List<com.google.android.material.color.utilities.Hct> getHctsByTemp() {
        java.util.List<com.google.android.material.color.utilities.Hct> list = this.precomputedHctsByTemp;
        if (list != null) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(getHctsByHue());
        arrayList.add(this.input);
        java.util.Collections.sort(arrayList, java.util.Comparator.comparing(new java.util.function.Function() { // from class: com.google.android.material.color.utilities.TemperatureCache$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.material.color.utilities.TemperatureCache.this.m10263xb7a75f35((com.google.android.material.color.utilities.Hct) obj);
            }
        }, new java.util.Comparator() { // from class: com.google.android.material.color.utilities.TemperatureCache$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int compareTo;
                compareTo = ((java.lang.Double) obj).compareTo((java.lang.Double) obj2);
                return compareTo;
            }
        }));
        this.precomputedHctsByTemp = arrayList;
        return arrayList;
    }

    /* renamed from: lambda$getHctsByTemp$0$com-google-android-material-color-utilities-TemperatureCache, reason: not valid java name */
    final /* synthetic */ java.lang.Double m10263xb7a75f35(com.google.android.material.color.utilities.Hct hct) {
        return getTempsByHct().get(hct);
    }

    private java.util.Map<com.google.android.material.color.utilities.Hct, java.lang.Double> getTempsByHct() {
        java.util.Map<com.google.android.material.color.utilities.Hct, java.lang.Double> map = this.precomputedTempsByHct;
        if (map != null) {
            return map;
        }
        java.util.ArrayList<com.google.android.material.color.utilities.Hct> arrayList = new java.util.ArrayList(getHctsByHue());
        arrayList.add(this.input);
        java.util.HashMap hashMap = new java.util.HashMap();
        for (com.google.android.material.color.utilities.Hct hct : arrayList) {
            hashMap.put(hct, java.lang.Double.valueOf(rawTemperature(hct)));
        }
        this.precomputedTempsByHct = hashMap;
        return hashMap;
    }

    private com.google.android.material.color.utilities.Hct getWarmest() {
        return getHctsByTemp().get(getHctsByTemp().size() - 1);
    }
}
