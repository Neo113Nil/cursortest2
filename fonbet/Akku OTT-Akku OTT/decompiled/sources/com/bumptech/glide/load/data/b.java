package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class b<T> implements d<T> {
    public final String a;
    public final AssetManager b;
    public T c;

    public b(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
    }

    public abstract void a(T t) throws IOException;

    public abstract T b(AssetManager assetManager, String str) throws IOException;

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cleanup() {
        T t = this.c;
        if (t == null) {
            return;
        }
        try {
            a(t);
        } catch (IOException unused) {
        }
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public final com.bumptech.glide.load.a getDataSource() {
        return com.bumptech.glide.load.a.a;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void loadData(@NonNull com.bumptech.glide.h hVar, @NonNull d.a<? super T> aVar) {
        try {
            T b = b(this.b, this.a);
            this.c = b;
            aVar.onDataReady(b);
        } catch (IOException e) {
            Log.isLoggable("AssetPathFetcher", 3);
            aVar.onLoadFailed(e);
        }
    }
}
