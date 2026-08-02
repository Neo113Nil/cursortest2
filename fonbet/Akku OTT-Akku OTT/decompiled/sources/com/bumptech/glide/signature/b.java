package com.bumptech.glide.signature;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.g;
import com.bumptech.glide.util.l;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class b implements g {
    public final Object b;

    public b(@NonNull Object obj) {
        l.c(obj, "Argument must not be null");
        this.b = obj;
    }

    @Override // com.bumptech.glide.load.g
    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.b.equals(((b) obj).b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.b + '}';
    }

    @Override // com.bumptech.glide.load.g
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(g.a));
    }
}
