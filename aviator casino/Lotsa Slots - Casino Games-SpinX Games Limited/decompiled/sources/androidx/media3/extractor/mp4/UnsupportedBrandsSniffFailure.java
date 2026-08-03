package androidx.media3.extractor.mp4;

/* loaded from: classes2.dex */
public final class UnsupportedBrandsSniffFailure implements androidx.media3.extractor.SniffFailure {
    public final com.google.common.primitives.ImmutableIntArray compatibleBrands;
    public final int majorBrand;

    public UnsupportedBrandsSniffFailure(int i, int[] iArr) {
        com.google.common.primitives.ImmutableIntArray of;
        this.majorBrand = i;
        if (iArr != null) {
            of = com.google.common.primitives.ImmutableIntArray.copyOf(iArr);
        } else {
            of = com.google.common.primitives.ImmutableIntArray.of();
        }
        this.compatibleBrands = of;
    }
}
