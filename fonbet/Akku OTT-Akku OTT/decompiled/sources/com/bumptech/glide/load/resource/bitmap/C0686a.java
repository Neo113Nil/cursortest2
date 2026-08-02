package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0686a<DataType> implements com.bumptech.glide.load.k<DataType, BitmapDrawable> {
    public final com.bumptech.glide.load.k<DataType, Bitmap> a;
    public final Resources b;

    public C0686a(@NonNull Resources resources, @NonNull com.bumptech.glide.load.k<DataType, Bitmap> kVar) {
        this.b = resources;
        this.a = kVar;
    }

    @Override // com.bumptech.glide.load.k
    public final boolean a(@NonNull DataType datatype, @NonNull com.bumptech.glide.load.i iVar) throws IOException {
        return this.a.a(datatype, iVar);
    }

    @Override // com.bumptech.glide.load.k
    public final com.bumptech.glide.load.engine.x<BitmapDrawable> b(@NonNull DataType datatype, int i, int i2, @NonNull com.bumptech.glide.load.i iVar) throws IOException {
        com.bumptech.glide.load.engine.x<Bitmap> b = this.a.b(datatype, i, i2, iVar);
        if (b == null) {
            return null;
        }
        return new s(this.b, b);
    }
}
