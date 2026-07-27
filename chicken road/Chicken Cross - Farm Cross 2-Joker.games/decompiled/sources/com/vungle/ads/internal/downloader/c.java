package com.vungle.ads.internal.downloader;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f11898a;
    public final Throwable b;
    public final int c;

    public c(int i, Throwable cause, int i2) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f11898a = i;
        this.b = cause;
        this.c = i2;
    }

    public final Throwable a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.f11898a;
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("DownloadError(serverCode=").append(this.f11898a).append(", reason=").append(this.c).append(", cause=").append(this.b).append(')').toString();
    }
}
