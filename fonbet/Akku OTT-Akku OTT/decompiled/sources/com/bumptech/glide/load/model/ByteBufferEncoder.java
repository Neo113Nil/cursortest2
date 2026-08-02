package com.bumptech.glide.load.model;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.d;
import com.bumptech.glide.load.i;
import com.bumptech.glide.util.a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class ByteBufferEncoder implements d<ByteBuffer> {
    private static final String TAG = "ByteBufferEncoder";

    @Override // com.bumptech.glide.load.d
    public boolean encode(@NonNull ByteBuffer byteBuffer, @NonNull File file, @NonNull i iVar) {
        try {
            a.d(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable(TAG, 3);
            return false;
        }
    }
}
