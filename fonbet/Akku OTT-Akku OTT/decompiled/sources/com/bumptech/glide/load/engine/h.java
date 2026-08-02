package com.bumptech.glide.load.engine;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public interface h {

    public interface a {
        void a(com.bumptech.glide.load.g gVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar);

        void c(com.bumptech.glide.load.g gVar, @Nullable Object obj, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.g gVar2);
    }

    boolean b();

    void cancel();
}
