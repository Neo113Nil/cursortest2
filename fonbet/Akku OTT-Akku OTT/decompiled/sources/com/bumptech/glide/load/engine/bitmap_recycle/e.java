package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class e implements d {
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
    public final void a(int i) {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
    public final void b() {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
    @NonNull
    public final Bitmap c(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
    @NonNull
    public final Bitmap e(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }
}
