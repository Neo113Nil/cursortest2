package com.bumptech.glide.load.resource.transcode;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.x;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.resource.bitmap.s;

/* loaded from: classes3.dex */
public final class b implements e<Bitmap, BitmapDrawable> {
    public final Resources a;

    public b(@NonNull Resources resources) {
        this.a = resources;
    }

    @Override // com.bumptech.glide.load.resource.transcode.e
    @Nullable
    public final x<BitmapDrawable> a(@NonNull x<Bitmap> xVar, @NonNull i iVar) {
        if (xVar == null) {
            return null;
        }
        return new s(this.a, xVar);
    }
}
