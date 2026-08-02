package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.q;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class g implements com.bumptech.glide.load.k<ByteBuffer, Bitmap> {
    public final l a;

    public g(l lVar) {
        this.a = lVar;
    }

    @Override // com.bumptech.glide.load.k
    public final boolean a(@NonNull ByteBuffer byteBuffer, @NonNull com.bumptech.glide.load.i iVar) throws IOException {
        this.a.getClass();
        return true;
    }

    @Override // com.bumptech.glide.load.k
    public final com.bumptech.glide.load.engine.x<Bitmap> b(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull com.bumptech.glide.load.i iVar) throws IOException {
        l lVar = this.a;
        return lVar.a(new q.a(byteBuffer, lVar.d, lVar.c), i, i2, iVar, l.k);
    }
}
