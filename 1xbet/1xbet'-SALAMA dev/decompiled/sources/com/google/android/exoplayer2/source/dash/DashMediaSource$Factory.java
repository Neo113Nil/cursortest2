package com.google.android.exoplayer2.source.dash;

import B4.V;
import E1.b;
import M4.e;
import io.sentry.TransactionOptions;
import p145u1.c;
import p146u2.InterfaceC0953l;

/* JADX INFO: loaded from: classes.dex */
public final class DashMediaSource$Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f10677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0953l f10678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f10679c = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f10681e = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10682f = TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V f10680d = new V(15);

    public DashMediaSource$Factory(InterfaceC0953l interfaceC0953l) {
        this.f10677a = new c(interfaceC0953l, 17);
        this.f10678b = interfaceC0953l;
    }
}
