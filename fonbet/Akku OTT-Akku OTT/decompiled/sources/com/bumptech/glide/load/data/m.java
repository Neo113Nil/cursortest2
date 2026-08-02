package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class m extends b<InputStream> {
    @Override // com.bumptech.glide.load.data.b
    public final void a(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.bumptech.glide.load.data.b
    public final InputStream b(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public final Class<InputStream> getDataClass() {
        return InputStream.class;
    }
}
