package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class v implements com.bumptech.glide.load.k<Uri, Bitmap> {
    public final com.bumptech.glide.load.resource.drawable.e a;
    public final com.bumptech.glide.load.engine.bitmap_recycle.d b;

    public v(com.bumptech.glide.load.resource.drawable.e eVar, com.bumptech.glide.load.engine.bitmap_recycle.d dVar) {
        this.a = eVar;
        this.b = dVar;
    }

    @Override // com.bumptech.glide.load.k
    public final boolean a(@NonNull Uri uri, @NonNull com.bumptech.glide.load.i iVar) throws IOException {
        return "android.resource".equals(uri.getScheme());
    }

    @Override // com.bumptech.glide.load.k
    @Nullable
    public final com.bumptech.glide.load.engine.x<Bitmap> b(@NonNull Uri uri, int i, int i2, @NonNull com.bumptech.glide.load.i iVar) throws IOException {
        com.bumptech.glide.load.engine.x c = this.a.c(uri, iVar);
        if (c == null) {
            return null;
        }
        return m.a(this.b, (Drawable) ((com.bumptech.glide.load.resource.drawable.c) c).get(), i, i2);
    }
}
