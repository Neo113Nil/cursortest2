package com.bumptech.glide.load.resource.bytes;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.x;
import com.bumptech.glide.util.l;

/* loaded from: classes3.dex */
public final class b implements x<byte[]> {
    public final byte[] a;

    public b(byte[] bArr) {
        l.c(bArr, "Argument must not be null");
        this.a = bArr;
    }

    @Override // com.bumptech.glide.load.engine.x
    public final int a() {
        return this.a.length;
    }

    @Override // com.bumptech.glide.load.engine.x
    @NonNull
    public final Class<byte[]> c() {
        return byte[].class;
    }

    @Override // com.bumptech.glide.load.engine.x
    @NonNull
    public final byte[] get() {
        return this.a;
    }

    @Override // com.bumptech.glide.load.engine.x
    public final void recycle() {
    }
}
