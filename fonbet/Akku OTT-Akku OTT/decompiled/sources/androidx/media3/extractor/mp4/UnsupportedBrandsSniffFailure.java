package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SniffFailure;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes3.dex */
public final class UnsupportedBrandsSniffFailure implements SniffFailure {
    public final com.google.common.primitives.b compatibleBrands;
    public final int majorBrand;

    public UnsupportedBrandsSniffFailure(int i, @Nullable int[] iArr) {
        com.google.common.primitives.b bVar;
        this.majorBrand = i;
        if (iArr != null) {
            com.google.common.primitives.b bVar2 = com.google.common.primitives.b.c;
            bVar = iArr.length == 0 ? com.google.common.primitives.b.c : new com.google.common.primitives.b(Arrays.copyOf(iArr, iArr.length));
        } else {
            bVar = com.google.common.primitives.b.c;
        }
        this.compatibleBrands = bVar;
    }
}
