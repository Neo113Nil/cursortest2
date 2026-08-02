package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class f implements com.bumptech.glide.load.g {
    public final com.bumptech.glide.load.g b;
    public final com.bumptech.glide.load.g c;

    public f(com.bumptech.glide.load.g gVar, com.bumptech.glide.load.g gVar2) {
        this.b = gVar;
        this.c = gVar2;
    }

    @Override // com.bumptech.glide.load.g
    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.b.equals(fVar.b) && this.c.equals(fVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + '}';
    }

    @Override // com.bumptech.glide.load.g
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        this.b.updateDiskCacheKey(messageDigest);
        this.c.updateDiskCacheKey(messageDigest);
    }
}
