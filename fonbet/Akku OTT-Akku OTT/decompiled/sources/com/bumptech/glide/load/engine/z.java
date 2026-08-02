package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class z implements com.bumptech.glide.load.g {
    public static final com.bumptech.glide.util.i<Class<?>, byte[]> j = new com.bumptech.glide.util.i<>(50);
    public final com.bumptech.glide.load.engine.bitmap_recycle.b b;
    public final com.bumptech.glide.load.g c;
    public final com.bumptech.glide.load.g d;
    public final int e;
    public final int f;
    public final Class<?> g;
    public final com.bumptech.glide.load.i h;
    public final com.bumptech.glide.load.m<?> i;

    public z(com.bumptech.glide.load.engine.bitmap_recycle.b bVar, com.bumptech.glide.load.g gVar, com.bumptech.glide.load.g gVar2, int i, int i2, com.bumptech.glide.load.m<?> mVar, Class<?> cls, com.bumptech.glide.load.i iVar) {
        this.b = bVar;
        this.c = gVar;
        this.d = gVar2;
        this.e = i;
        this.f = i2;
        this.i = mVar;
        this.g = cls;
        this.h = iVar;
    }

    @Override // com.bumptech.glide.load.g
    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f == zVar.f && this.e == zVar.e && com.bumptech.glide.util.m.b(this.i, zVar.i) && this.g.equals(zVar.g) && this.c.equals(zVar.c) && this.d.equals(zVar.d) && this.h.equals(zVar.h)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public final int hashCode() {
        int hashCode = ((((this.d.hashCode() + (this.c.hashCode() * 31)) * 31) + this.e) * 31) + this.f;
        com.bumptech.glide.load.m<?> mVar = this.i;
        if (mVar != null) {
            hashCode = (hashCode * 31) + mVar.hashCode();
        }
        return this.h.b.hashCode() + ((this.g.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation='" + this.i + "', options=" + this.h + '}';
    }

    @Override // com.bumptech.glide.load.g
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.b;
        byte[] bArr = (byte[]) bVar.d();
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.updateDiskCacheKey(messageDigest);
        this.c.updateDiskCacheKey(messageDigest);
        messageDigest.update(bArr);
        com.bumptech.glide.load.m<?> mVar = this.i;
        if (mVar != null) {
            mVar.updateDiskCacheKey(messageDigest);
        }
        this.h.updateDiskCacheKey(messageDigest);
        com.bumptech.glide.util.i<Class<?>, byte[]> iVar = j;
        Class<?> cls = this.g;
        byte[] bArr2 = iVar.get(cls);
        if (bArr2 == null) {
            bArr2 = cls.getName().getBytes(com.bumptech.glide.load.g.a);
            iVar.put(cls, bArr2);
        }
        messageDigest.update(bArr2);
        bVar.put(bArr);
    }
}
