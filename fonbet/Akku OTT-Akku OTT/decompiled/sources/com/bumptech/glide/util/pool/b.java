package com.bumptech.glide.util.pool;

import androidx.annotation.NonNull;
import com.bumptech.glide.util.pool.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class b implements a.b<List<Object>> {
    @Override // com.bumptech.glide.util.pool.a.b
    @NonNull
    public final List<Object> create() {
        return new ArrayList();
    }
}
