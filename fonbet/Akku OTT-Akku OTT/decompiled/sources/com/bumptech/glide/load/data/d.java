package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public interface d<T> {

    public interface a<T> {
        void onDataReady(@Nullable T t);

        void onLoadFailed(@NonNull Exception exc);
    }

    void cancel();

    void cleanup();

    @NonNull
    Class<T> getDataClass();

    @NonNull
    com.bumptech.glide.load.a getDataSource();

    void loadData(@NonNull com.bumptech.glide.h hVar, @NonNull a<? super T> aVar);
}
