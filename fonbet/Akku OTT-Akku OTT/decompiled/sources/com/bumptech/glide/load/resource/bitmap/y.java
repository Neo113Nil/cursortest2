package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class y implements com.bumptech.glide.load.k<Bitmap, Bitmap> {

    public static final class a implements com.bumptech.glide.load.engine.x<Bitmap> {
        public final Bitmap a;

        public a(@NonNull Bitmap bitmap) {
            this.a = bitmap;
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

        @Override // com.bumptech.glide.load.engine.x
        public final void recycle() {
        }
    }

    @Override // com.bumptech.glide.load.k
    public final /* bridge */ /* synthetic */ boolean a(@NonNull Bitmap bitmap, @NonNull com.bumptech.glide.load.i iVar) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.k
    public final com.bumptech.glide.load.engine.x<Bitmap> b(@NonNull Bitmap bitmap, int i, int i2, @NonNull com.bumptech.glide.load.i iVar) throws IOException {
        return new a(bitmap);
    }
}
