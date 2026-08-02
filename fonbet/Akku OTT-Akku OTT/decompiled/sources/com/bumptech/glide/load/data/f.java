package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.e;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class f {
    public static final a b = new a();
    public final HashMap a = new HashMap();

    public class a implements e.a<Object> {
        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public final e<Object> a(@NonNull Object obj) {
            return new b(obj);
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public final Class<Object> getDataClass() {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    public static final class b implements e<Object> {
        public final Object a;

        public b(@NonNull Object obj) {
            this.a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        @NonNull
        public final Object a() {
            return this.a;
        }

        @Override // com.bumptech.glide.load.data.e
        public final void cleanup() {
        }
    }
}
