package com.google.android.exoplayer2.util;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.common.util.concurrent.u;

@Deprecated
/* loaded from: classes4.dex */
public interface BitmapLoader {
    u<Bitmap> decodeBitmap(byte[] bArr);

    u<Bitmap> loadBitmap(Uri uri);

    @Nullable
    default u<Bitmap> loadBitmapFromMetadata(MediaMetadata mediaMetadata) {
        byte[] bArr = mediaMetadata.artworkData;
        if (bArr != null) {
            return decodeBitmap(bArr);
        }
        Uri uri = mediaMetadata.artworkUri;
        if (uri != null) {
            return loadBitmap(uri);
        }
        return null;
    }
}
