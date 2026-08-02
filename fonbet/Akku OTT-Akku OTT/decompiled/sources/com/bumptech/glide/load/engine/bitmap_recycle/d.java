package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public interface d {
    void a(int i);

    void b();

    @NonNull
    Bitmap c(int i, int i2, Bitmap.Config config);

    void d(Bitmap bitmap);

    @NonNull
    Bitmap e(int i, int i2, Bitmap.Config config);
}
