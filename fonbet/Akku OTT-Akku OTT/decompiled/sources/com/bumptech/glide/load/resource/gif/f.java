package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.x;
import com.bumptech.glide.load.m;
import com.bumptech.glide.util.l;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class f implements m<c> {
    public final m<Bitmap> b;

    public f(m<Bitmap> mVar) {
        l.c(mVar, "Argument must not be null");
        this.b = mVar;
    }

    @Override // com.bumptech.glide.load.m
    @NonNull
    public final x<c> a(@NonNull Context context, @NonNull x<c> xVar, int i, int i2) {
        c cVar = xVar.get();
        x<Bitmap> eVar = new com.bumptech.glide.load.resource.bitmap.e(cVar.a.a.l, com.bumptech.glide.b.a(context).a);
        m<Bitmap> mVar = this.b;
        x<Bitmap> a = mVar.a(context, eVar, i, i2);
        if (!eVar.equals(a)) {
            eVar.recycle();
        }
        cVar.a.a.c(mVar, a.get());
        return xVar;
    }

    @Override // com.bumptech.glide.load.g
    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.b.equals(((f) obj).b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // com.bumptech.glide.load.g
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        this.b.updateDiskCacheKey(messageDigest);
    }
}
