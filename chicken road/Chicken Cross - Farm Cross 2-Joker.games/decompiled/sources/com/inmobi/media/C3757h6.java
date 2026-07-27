package com.inmobi.media;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: com.inmobi.media.h6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3757h6 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream[] f7135a;

    public C3757h6(InputStream[] inputStreamArr) {
        this.f7135a = inputStreamArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InputStream inputStream : this.f7135a) {
            AbstractC3945nn.a(inputStream);
        }
    }
}
