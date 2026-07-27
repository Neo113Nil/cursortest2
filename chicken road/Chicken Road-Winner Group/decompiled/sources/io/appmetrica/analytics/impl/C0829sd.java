package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.sd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0829sd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0881ud f8299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8300b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f8301c;

    public C0829sd(C0881ud c0881ud, String str, byte[] bArr) {
        this.f8299a = c0881ud;
        this.f8300b = str;
        this.f8301c = bArr;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0881ud.a(this.f8299a).setSessionExtra(this.f8300b, this.f8301c);
    }
}
