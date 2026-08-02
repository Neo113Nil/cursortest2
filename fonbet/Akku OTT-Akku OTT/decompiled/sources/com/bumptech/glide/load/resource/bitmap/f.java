package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public abstract class f implements com.bumptech.glide.load.m<Bitmap> {
    @Override // com.bumptech.glide.load.m
    @NonNull
    public final com.bumptech.glide.load.engine.x<Bitmap> a(@NonNull Context context, @NonNull com.bumptech.glide.load.engine.x<Bitmap> xVar, int i, int i2) {
        float width;
        float height;
        Bitmap e;
        if (!com.bumptech.glide.util.m.i(i, i2)) {
            throw new IllegalArgumentException(androidx.compose.runtime.collection.a.b("Cannot apply transformation on width: ", i, i2, " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        com.bumptech.glide.load.engine.bitmap_recycle.d dVar = com.bumptech.glide.b.a(context).a;
        Bitmap bitmap = xVar.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Paint paint = x.a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            e = bitmap;
        } else {
            Matrix matrix = new Matrix();
            float f = 0.0f;
            if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
                width = i2 / bitmap.getHeight();
                f = (i - (bitmap.getWidth() * width)) * 0.5f;
                height = 0.0f;
            } else {
                width = i / bitmap.getWidth();
                height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
            }
            matrix.setScale(width, width);
            matrix.postTranslate((int) (f + 0.5f), (int) (height + 0.5f));
            e = dVar.e(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
            e.setHasAlpha(bitmap.hasAlpha());
            x.a(bitmap, e, matrix);
        }
        return bitmap.equals(e) ? xVar : e.b(e, dVar);
    }
}
