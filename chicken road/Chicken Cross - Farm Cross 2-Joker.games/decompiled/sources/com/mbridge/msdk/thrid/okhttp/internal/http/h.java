package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.u;
import javax.annotation.Nullable;

/* compiled from: RealResponseBody.java */
/* loaded from: classes6.dex */
public final class h extends b0 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f9898a;
    private final long b;
    private final com.mbridge.msdk.thrid.okio.e c;

    public h(@Nullable String str, long j, com.mbridge.msdk.thrid.okio.e eVar) {
        this.f9898a = str;
        this.b = j;
        this.c = eVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.b0
    public long k() {
        return this.b;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.b0
    public u l() {
        String str = this.f9898a;
        if (str != null) {
            return u.b(str);
        }
        return null;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.b0
    public com.mbridge.msdk.thrid.okio.e m() {
        return this.c;
    }
}
