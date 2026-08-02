package com.google.android.material.color.utilities;

/* loaded from: classes8.dex */
public final class Score {
    private static final int BLUE_500 = -12417548;
    private static final double CUTOFF_CHROMA = 5.0d;
    private static final double CUTOFF_EXCITED_PROPORTION = 0.01d;
    private static final int MAX_COLOR_COUNT = 4;
    private static final double TARGET_CHROMA = 48.0d;
    private static final double WEIGHT_CHROMA_ABOVE = 0.3d;
    private static final double WEIGHT_CHROMA_BELOW = 0.1d;
    private static final double WEIGHT_PROPORTION = 0.7d;

    private Score() {
    }

    public static java.util.List<java.lang.Integer> score(java.util.Map<java.lang.Integer, java.lang.Integer> map) {
        return score(map, 4, BLUE_500, true);
    }

    public static java.util.List<java.lang.Integer> score(java.util.Map<java.lang.Integer, java.lang.Integer> map, int i) {
        return score(map, i, BLUE_500, true);
    }

    public static java.util.List<java.lang.Integer> score(java.util.Map<java.lang.Integer, java.lang.Integer> map, int i, int i2) {
        return score(map, i, i2, true);
    }

    public static java.util.List<java.lang.Integer> score(java.util.Map<java.lang.Integer, java.lang.Integer> map, int i, int i2, boolean z) {
        java.util.ArrayList<com.google.android.material.color.utilities.Hct> arrayList = new java.util.ArrayList();
        int[] iArr = new int[360];
        double d = 0.0d;
        for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry : map.entrySet()) {
            com.google.android.material.color.utilities.Hct fromInt = com.google.android.material.color.utilities.Hct.fromInt(entry.getKey().intValue());
            arrayList.add(fromInt);
            int floor = (int) java.lang.Math.floor(fromInt.getHue());
            int intValue = entry.getValue().intValue();
            iArr[floor] = iArr[floor] + intValue;
            d += intValue;
        }
        double[] dArr = new double[360];
        for (int i3 = 0; i3 < 360; i3++) {
            double d2 = iArr[i3] / d;
            for (int i4 = i3 - 14; i4 < i3 + 16; i4++) {
                int sanitizeDegreesInt = com.google.android.material.color.utilities.MathUtils.sanitizeDegreesInt(i4);
                dArr[sanitizeDegreesInt] = dArr[sanitizeDegreesInt] + d2;
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.google.android.material.color.utilities.Hct hct : arrayList) {
            double d3 = dArr[com.google.android.material.color.utilities.MathUtils.sanitizeDegreesInt((int) java.lang.Math.round(hct.getHue()))];
            if (!z || (hct.getChroma() >= 5.0d && d3 > 0.01d)) {
                arrayList2.add(new com.google.android.material.color.utilities.Score.ScoredHCT(hct, (d3 * 100.0d * WEIGHT_PROPORTION) + ((hct.getChroma() - TARGET_CHROMA) * (hct.getChroma() < TARGET_CHROMA ? WEIGHT_CHROMA_BELOW : WEIGHT_CHROMA_ABOVE))));
            }
        }
        java.util.Collections.sort(arrayList2, new com.google.android.material.color.utilities.Score.ScoredComparator());
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (int i5 = 90; i5 >= 15; i5--) {
            arrayList3.clear();
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                com.google.android.material.color.utilities.Hct hct2 = ((com.google.android.material.color.utilities.Score.ScoredHCT) it.next()).hct;
                java.util.Iterator it2 = arrayList3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList3.add(hct2);
                        break;
                    }
                    if (com.google.android.material.color.utilities.MathUtils.differenceDegrees(hct2.getHue(), ((com.google.android.material.color.utilities.Hct) it2.next()).getHue()) < i5) {
                        break;
                    }
                }
                if (arrayList3.size() >= i) {
                    break;
                }
            }
            if (arrayList3.size() >= i) {
                break;
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        if (arrayList3.isEmpty()) {
            arrayList4.add(java.lang.Integer.valueOf(i2));
            return arrayList4;
        }
        java.util.Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(java.lang.Integer.valueOf(((com.google.android.material.color.utilities.Hct) it3.next()).toInt()));
        }
        return arrayList4;
    }

    static class ScoredHCT {
        public final com.google.android.material.color.utilities.Hct hct;
        public final double score;

        public ScoredHCT(com.google.android.material.color.utilities.Hct hct, double d) {
            this.hct = hct;
            this.score = d;
        }
    }

    static class ScoredComparator implements java.util.Comparator<com.google.android.material.color.utilities.Score.ScoredHCT> {
        @Override // java.util.Comparator
        public int compare(com.google.android.material.color.utilities.Score.ScoredHCT scoredHCT, com.google.android.material.color.utilities.Score.ScoredHCT scoredHCT2) {
            return java.lang.Double.compare(scoredHCT2.score, scoredHCT.score);
        }
    }
}
