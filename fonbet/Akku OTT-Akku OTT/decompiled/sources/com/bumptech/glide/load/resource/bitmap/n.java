package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class n implements com.bumptech.glide.load.m<Drawable> {
    public final com.bumptech.glide.load.m<Bitmap> b;

    public n(com.bumptech.glide.load.m mVar) {
        this.b = mVar;
    }

    @Override // com.bumptech.glide.load.m
    @NonNull
    public final com.bumptech.glide.load.engine.x<Drawable> a(@NonNull Context context, @NonNull com.bumptech.glide.load.engine.x<Drawable> xVar, int i, int i2) {
        com.bumptech.glide.load.engine.bitmap_recycle.d dVar = com.bumptech.glide.b.a(context).a;
        Drawable drawable = xVar.get();
        e a = m.a(dVar, drawable, i, i2);
        if (a == null) {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
        com.bumptech.glide.load.engine.x<Bitmap> a2 = this.b.a(context, a, i, i2);
        if (!a2.equals(a)) {
            return new s(context.getResources(), a2);
        }
        a2.recycle();
        return xVar;
    }

    @Override // com.bumptech.glide.load.g
    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.b.equals(((n) obj).b);
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
