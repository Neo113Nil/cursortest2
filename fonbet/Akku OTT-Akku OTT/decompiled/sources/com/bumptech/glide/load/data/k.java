package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.resource.bitmap.u;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class k implements e<InputStream> {
    public final u a;

    public static final class a implements e.a<InputStream> {
        public final com.bumptech.glide.load.engine.bitmap_recycle.b a;

        public a(com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public final e<InputStream> a(InputStream inputStream) {
            return new k(inputStream, this.a);
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public final Class<InputStream> getDataClass() {
            return InputStream.class;
        }
    }

    public k(InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        u uVar = new u(inputStream, bVar);
        this.a = uVar;
        uVar.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    @NonNull
    public final InputStream a() throws IOException {
        u uVar = this.a;
        uVar.reset();
        return uVar;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cleanup() {
        this.a.l();
    }
}
