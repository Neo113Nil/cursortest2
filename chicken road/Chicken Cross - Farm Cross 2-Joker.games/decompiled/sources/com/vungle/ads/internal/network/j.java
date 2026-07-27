package com.vungle.ads.internal.network;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.Okio;

/* loaded from: classes7.dex */
public final class j extends ResponseBody {

    /* renamed from: a, reason: collision with root package name */
    public final ResponseBody f12051a;
    public final BufferedSource b;
    public IOException c;

    public j(ResponseBody delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f12051a = delegate;
        this.b = Okio.buffer(new i(this, delegate.source()));
    }

    public final void a(IOException iOException) {
        this.c = iOException;
    }

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12051a.close();
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        return this.f12051a.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        return this.f12051a.contentType();
    }

    @Override // okhttp3.ResponseBody
    public final BufferedSource source() {
        return this.b;
    }

    public final void a() {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
    }
}
