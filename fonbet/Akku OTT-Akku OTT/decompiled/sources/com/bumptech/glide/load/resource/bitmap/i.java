package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class i extends f {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(com.bumptech.glide.load.g.a);

    @Override // com.bumptech.glide.load.g
    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // com.bumptech.glide.load.g
    public final int hashCode() {
        return -599754482;
    }

    @Override // com.bumptech.glide.load.g
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(b);
    }
}
