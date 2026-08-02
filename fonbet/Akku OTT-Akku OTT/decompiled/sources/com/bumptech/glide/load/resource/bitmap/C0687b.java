package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.File;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0687b implements com.bumptech.glide.load.l<BitmapDrawable> {
    public final com.bumptech.glide.load.engine.bitmap_recycle.d a;
    public final c b;

    public C0687b(com.bumptech.glide.load.engine.bitmap_recycle.d dVar, c cVar) {
        this.a = dVar;
        this.b = cVar;
    }

    @Override // com.bumptech.glide.load.l
    @NonNull
    public final com.bumptech.glide.load.c a(@NonNull com.bumptech.glide.load.i iVar) {
        return com.bumptech.glide.load.c.b;
    }

    @Override // com.bumptech.glide.load.d
    public final boolean encode(@NonNull Object obj, @NonNull File file, @NonNull com.bumptech.glide.load.i iVar) {
        return this.b.encode(new e(((BitmapDrawable) ((com.bumptech.glide.load.engine.x) obj).get()).getBitmap(), this.a), file, iVar);
    }
}
