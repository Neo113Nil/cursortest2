package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.activity.D;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;

@RequiresApi(api = 28)
/* loaded from: classes3.dex */
public final class d implements com.bumptech.glide.load.k<ImageDecoder.Source, Bitmap> {
    public final com.bumptech.glide.load.engine.bitmap_recycle.e a = new com.bumptech.glide.load.engine.bitmap_recycle.e();

    @Override // com.bumptech.glide.load.k
    public final /* bridge */ /* synthetic */ boolean a(@NonNull ImageDecoder.Source source, @NonNull com.bumptech.glide.load.i iVar) throws IOException {
        D.b(source);
        return true;
    }

    @Override // com.bumptech.glide.load.k
    public final /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.x<Bitmap> b(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull com.bumptech.glide.load.i iVar) throws IOException {
        return c(androidx.core.text.i.b(source), i, i2, iVar);
    }

    public final e c(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull com.bumptech.glide.load.i iVar) throws IOException {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new com.bumptech.glide.load.resource.b(i, i2, iVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            decodeBitmap.getWidth();
            decodeBitmap.getHeight();
        }
        return new e(decodeBitmap, this.a);
    }
}
