package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class s implements com.bumptech.glide.load.engine.x<BitmapDrawable>, com.bumptech.glide.load.engine.t {
    public final Resources a;
    public final com.bumptech.glide.load.engine.x<Bitmap> b;

    public s(@NonNull Resources resources, @NonNull com.bumptech.glide.load.engine.x<Bitmap> xVar) {
        com.bumptech.glide.util.l.c(resources, "Argument must not be null");
        this.a = resources;
        com.bumptech.glide.util.l.c(xVar, "Argument must not be null");
        this.b = xVar;
    }

    @Override // com.bumptech.glide.load.engine.x
    public final int a() {
        return this.b.a();
    }

    @Override // com.bumptech.glide.load.engine.x
    @NonNull
    public final Class<BitmapDrawable> c() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.x
    @NonNull
    public final BitmapDrawable get() {
        return new BitmapDrawable(this.a, this.b.get());
    }

    @Override // com.bumptech.glide.load.engine.t
    public final void initialize() {
        com.bumptech.glide.load.engine.x<Bitmap> xVar = this.b;
        if (xVar instanceof com.bumptech.glide.load.engine.t) {
            ((com.bumptech.glide.load.engine.t) xVar).initialize();
        }
    }

    @Override // com.bumptech.glide.load.engine.x
    public final void recycle() {
        this.b.recycle();
    }
}
