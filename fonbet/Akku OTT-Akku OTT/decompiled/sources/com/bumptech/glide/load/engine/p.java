package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes3.dex */
public final class p implements com.bumptech.glide.load.g {
    public final Object b;
    public final int c;
    public final int d;
    public final Class<?> e;
    public final Class<?> f;
    public final com.bumptech.glide.load.g g;
    public final Map<Class<?>, com.bumptech.glide.load.m<?>> h;
    public final com.bumptech.glide.load.i i;
    public int j;

    public p(Object obj, com.bumptech.glide.load.g gVar, int i, int i2, Map<Class<?>, com.bumptech.glide.load.m<?>> map, Class<?> cls, Class<?> cls2, com.bumptech.glide.load.i iVar) {
        com.bumptech.glide.util.l.c(obj, "Argument must not be null");
        this.b = obj;
        com.bumptech.glide.util.l.c(gVar, "Signature must not be null");
        this.g = gVar;
        this.c = i;
        this.d = i2;
        com.bumptech.glide.util.l.c(map, "Argument must not be null");
        this.h = map;
        com.bumptech.glide.util.l.c(cls, "Resource class must not be null");
        this.e = cls;
        com.bumptech.glide.util.l.c(cls2, "Transcode class must not be null");
        this.f = cls2;
        com.bumptech.glide.util.l.c(iVar, "Argument must not be null");
        this.i = iVar;
    }

    @Override // com.bumptech.glide.load.g
    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.b.equals(pVar.b) && this.g.equals(pVar.g) && this.d == pVar.d && this.c == pVar.c && this.h.equals(pVar.h) && this.e.equals(pVar.e) && this.f.equals(pVar.f) && this.i.equals(pVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public final int hashCode() {
        if (this.j == 0) {
            int hashCode = this.b.hashCode();
            this.j = hashCode;
            int hashCode2 = ((((this.g.hashCode() + (hashCode * 31)) * 31) + this.c) * 31) + this.d;
            this.j = hashCode2;
            int hashCode3 = this.h.hashCode() + (hashCode2 * 31);
            this.j = hashCode3;
            int hashCode4 = this.e.hashCode() + (hashCode3 * 31);
            this.j = hashCode4;
            int hashCode5 = this.f.hashCode() + (hashCode4 * 31);
            this.j = hashCode5;
            this.j = this.i.b.hashCode() + (hashCode5 * 31);
        }
        return this.j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + '}';
    }

    @Override // com.bumptech.glide.load.g
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
