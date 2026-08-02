package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.x;
import com.bumptech.glide.load.k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class j implements k<InputStream, c> {
    public final ArrayList a;
    public final a b;
    public final com.bumptech.glide.load.engine.bitmap_recycle.b c;

    public j(ArrayList arrayList, a aVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.a = arrayList;
        this.b = aVar;
        this.c = bVar;
    }

    @Override // com.bumptech.glide.load.k
    public final boolean a(@NonNull InputStream inputStream, @NonNull com.bumptech.glide.load.i iVar) throws IOException {
        return !((Boolean) iVar.b(i.b)).booleanValue() && com.bumptech.glide.load.f.b(this.a, inputStream, this.c) == ImageHeaderParser.ImageType.GIF;
    }

    @Override // com.bumptech.glide.load.k
    public final x<c> b(@NonNull InputStream inputStream, int i, int i2, @NonNull com.bumptech.glide.load.i iVar) throws IOException {
        byte[] bArr;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream2.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            Log.isLoggable("StreamGifDecoder", 5);
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.b.b(ByteBuffer.wrap(bArr), i, i2, iVar);
    }
}
