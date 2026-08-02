package com.bumptech.glide.signature;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.g;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class a implements g {
    public static final a b = new a();

    public final String toString() {
        return "EmptySignature";
    }

    @Override // com.bumptech.glide.load.g
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
    }
}
