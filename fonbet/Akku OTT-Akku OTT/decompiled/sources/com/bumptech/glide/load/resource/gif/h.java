package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.x;
import com.bumptech.glide.load.k;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class h implements k<com.bumptech.glide.gifdecoder.a, Bitmap> {
    public final com.bumptech.glide.load.engine.bitmap_recycle.d a;

    public h(com.bumptech.glide.load.engine.bitmap_recycle.d dVar) {
        this.a = dVar;
    }

    @Override // com.bumptech.glide.load.k
    public final /* bridge */ /* synthetic */ boolean a(@NonNull com.bumptech.glide.gifdecoder.a aVar, @NonNull com.bumptech.glide.load.i iVar) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.k
    public final x<Bitmap> b(@NonNull com.bumptech.glide.gifdecoder.a aVar, int i, int i2, @NonNull com.bumptech.glide.load.i iVar) throws IOException {
        return com.bumptech.glide.load.resource.bitmap.e.b(aVar.a(), this.a);
    }
}
