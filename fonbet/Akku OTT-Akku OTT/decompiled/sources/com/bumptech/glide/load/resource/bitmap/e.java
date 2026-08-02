package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class e implements com.bumptech.glide.load.engine.x<Bitmap>, com.bumptech.glide.load.engine.t {
    public final Bitmap a;
    public final com.bumptech.glide.load.engine.bitmap_recycle.d b;

    public e(@NonNull Bitmap bitmap, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.d dVar) {
        com.bumptech.glide.util.l.c(bitmap, "Bitmap must not be null");
        this.a = bitmap;
        com.bumptech.glide.util.l.c(dVar, "BitmapPool must not be null");
        this.b = dVar;
    }

    @Nullable
    public static e b(@Nullable Bitmap bitmap, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new e(bitmap, dVar);
    }

    @Override // com.bumptech.glide.load.engine.x
    public final int a() {
        return com.bumptech.glide.util.m.c(this.a);
    }

    @Override // com.bumptech.glide.load.engine.x
    @NonNull
    public final Class<Bitmap> c() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.engine.x
    @NonNull
    public final Bitmap get() {
        return this.a;
    }

    @Override // com.bumptech.glide.load.engine.t
    public final void initialize() {
        this.a.prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.x
    public final void recycle() {
        this.b.d(this.a);
    }
}
