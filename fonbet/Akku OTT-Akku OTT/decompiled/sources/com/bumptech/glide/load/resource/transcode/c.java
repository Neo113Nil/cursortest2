package com.bumptech.glide.load.resource.transcode;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.x;
import com.bumptech.glide.load.i;

/* loaded from: classes3.dex */
public final class c implements e<Drawable, byte[]> {
    public final com.bumptech.glide.load.engine.bitmap_recycle.d a;
    public final a b;
    public final d c;

    public c(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.d dVar, @NonNull a aVar, @NonNull d dVar2) {
        this.a = dVar;
        this.b = aVar;
        this.c = dVar2;
    }

    @Override // com.bumptech.glide.load.resource.transcode.e
    @Nullable
    public final x<byte[]> a(@NonNull x<Drawable> xVar, @NonNull i iVar) {
        Drawable drawable = xVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(com.bumptech.glide.load.resource.bitmap.e.b(((BitmapDrawable) drawable).getBitmap(), this.a), iVar);
        }
        if (drawable instanceof com.bumptech.glide.load.resource.gif.c) {
            return this.c.a(xVar, iVar);
        }
        return null;
    }
}
