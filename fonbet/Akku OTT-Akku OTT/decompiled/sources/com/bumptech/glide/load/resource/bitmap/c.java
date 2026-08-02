package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class c implements com.bumptech.glide.load.l<Bitmap> {
    public static final com.bumptech.glide.load.h<Integer> b = com.bumptech.glide.load.h.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
    public static final com.bumptech.glide.load.h<Bitmap.CompressFormat> c = new com.bumptech.glide.load.h<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, com.bumptech.glide.load.h.e);

    @Nullable
    public final com.bumptech.glide.load.engine.bitmap_recycle.b a;

    public c(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.a = bVar;
    }

    @Override // com.bumptech.glide.load.l
    @NonNull
    public final com.bumptech.glide.load.c a(@NonNull com.bumptech.glide.load.i iVar) {
        return com.bumptech.glide.load.c.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    @Override // com.bumptech.glide.load.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean encode(@NonNull Object obj, @NonNull File file, @NonNull com.bumptech.glide.load.i iVar) {
        boolean z;
        Bitmap bitmap = (Bitmap) ((com.bumptech.glide.load.engine.x) obj).get();
        com.bumptech.glide.load.h<Bitmap.CompressFormat> hVar = c;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) iVar.b(hVar);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = com.bumptech.glide.util.h.a;
        SystemClock.elapsedRealtimeNanos();
        int intValue = ((Integer) iVar.b(b)).intValue();
        OutputStream outputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.a;
                if (bVar != null) {
                    try {
                        outputStream = new com.bumptech.glide.load.data.c(fileOutputStream, bVar);
                    } catch (IOException unused) {
                        outputStream = fileOutputStream;
                        Log.isLoggable("BitmapEncoder", 3);
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        z = false;
                        if (Log.isLoggable("BitmapEncoder", 2)) {
                        }
                        return z;
                    } catch (Throwable th) {
                        th = th;
                        outputStream = fileOutputStream;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } else {
                    outputStream = fileOutputStream;
                }
                bitmap.compress(compressFormat, intValue, outputStream);
                outputStream.close();
                try {
                    outputStream.close();
                } catch (IOException unused4) {
                }
                z = true;
            } catch (IOException unused5) {
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Objects.toString(compressFormat);
                com.bumptech.glide.util.m.c(bitmap);
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(iVar.b(hVar));
                bitmap.hasAlpha();
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
