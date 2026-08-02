package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.l;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class f {
    public final ArrayList a = new ArrayList();

    public static final class a<T> {
        public final Class<T> a;
        public final l<T> b;

        public a(@NonNull Class<T> cls, @NonNull l<T> lVar) {
            this.a = cls;
            this.b = lVar;
        }
    }

    @Nullable
    public final synchronized <Z> l<Z> a(@NonNull Class<Z> cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) this.a.get(i);
            if (aVar.a.isAssignableFrom(cls)) {
                return (l<Z>) aVar.b;
            }
        }
        return null;
    }
}
