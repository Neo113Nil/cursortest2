package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class h extends b<AssetFileDescriptor> {
    @Override // com.bumptech.glide.load.data.b
    public final void a(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.b
    public final AssetFileDescriptor b(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public final Class<AssetFileDescriptor> getDataClass() {
        return AssetFileDescriptor.class;
    }
}
