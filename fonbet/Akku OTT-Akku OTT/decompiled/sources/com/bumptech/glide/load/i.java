package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.h;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class i implements g {
    public final com.bumptech.glide.util.b b = new com.bumptech.glide.util.b();

    @Nullable
    public final <T> T b(@NonNull h<T> hVar) {
        com.bumptech.glide.util.b bVar = this.b;
        return bVar.containsKey(hVar) ? (T) bVar.get(hVar) : hVar.a;
    }

    @Override // com.bumptech.glide.load.g
    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.b.equals(((i) obj).b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b + '}';
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.g
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        for (int i = 0; i < this.b.getSize(); i++) {
            h hVar = (h) this.b.keyAt(i);
            V valueAt = this.b.valueAt(i);
            h.b<T> bVar = hVar.b;
            if (hVar.d == null) {
                hVar.d = hVar.c.getBytes(g.a);
            }
            bVar.a(hVar.d, valueAt, messageDigest);
        }
    }
}
