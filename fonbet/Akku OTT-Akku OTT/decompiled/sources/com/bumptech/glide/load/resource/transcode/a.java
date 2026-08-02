package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.x;
import com.bumptech.glide.load.i;
import java.io.ByteArrayOutputStream;

/* loaded from: classes3.dex */
public final class a implements e<Bitmap, byte[]> {
    public final Bitmap.CompressFormat a = Bitmap.CompressFormat.JPEG;
    public final int b = 100;

    @Override // com.bumptech.glide.load.resource.transcode.e
    @Nullable
    public final x<byte[]> a(@NonNull x<Bitmap> xVar, @NonNull i iVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        xVar.get().compress(this.a, this.b, byteArrayOutputStream);
        xVar.recycle();
        return new com.bumptech.glide.load.resource.bytes.b(byteArrayOutputStream.toByteArray());
    }
}
