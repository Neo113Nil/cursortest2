package io.objectbox.model;

/* loaded from: classes3.dex */
public final class HnswDistanceType {
    public static final short Cosine = 2;
    public static final short DotProduct = 3;
    public static final short DotProductNonNormalized = 10;
    public static final short Euclidean = 1;
    public static final short Geo = 6;
    public static final short Unknown = 0;
    public static final String[] names = {"Unknown", "Euclidean", "Cosine", "DotProduct", "", "", "Geo", "", "", "", "DotProductNonNormalized"};

    private HnswDistanceType() {
    }

    public static String name(int i) {
        return names[i];
    }
}
