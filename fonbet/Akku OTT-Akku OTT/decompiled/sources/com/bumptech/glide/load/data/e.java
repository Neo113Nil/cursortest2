package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.IOException;

/* loaded from: classes3.dex */
public interface e<T> {

    public interface a<T> {
        @NonNull
        e<T> a(@NonNull T t);

        @NonNull
        Class<T> getDataClass();
    }

    @NonNull
    T a() throws IOException;

    void cleanup();
}
