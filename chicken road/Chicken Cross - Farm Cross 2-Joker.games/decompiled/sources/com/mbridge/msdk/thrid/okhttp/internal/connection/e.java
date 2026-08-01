package com.mbridge.msdk.thrid.okhttp.internal.connection;

import java.io.IOException;

/* compiled from: RouteException.java */
/* loaded from: classes6.dex */
public final class e extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private IOException f9888a;
    private IOException b;

    public e(IOException iOException) {
        super(iOException);
        this.f9888a = iOException;
        this.b = iOException;
    }

    public void a(IOException iOException) {
        com.mbridge.msdk.thrid.okhttp.internal.c.a((Throwable) this.f9888a, (Throwable) iOException);
        this.b = iOException;
    }

    public IOException d() {
        return this.f9888a;
    }

    public IOException g() {
        return this.b;
    }
}
