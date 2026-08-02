package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.x;
import java.io.IOException;

/* loaded from: classes3.dex */
public interface k<T, Z> {
    boolean a(@NonNull T t, @NonNull i iVar) throws IOException;

    @Nullable
    x<Z> b(@NonNull T t, int i, int i2, @NonNull i iVar) throws IOException;
}
