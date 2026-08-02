package com.google.android.exoplayer2.source.dash;

import B4.V;
import E1.b;
import M4.e;
import io.sentry.TransactionOptions;
import u1.c;
import u2.InterfaceC1635l;

/* loaded from: classes.dex */
public final class DashMediaSource$Factory {

    /* renamed from: a, reason: collision with root package name */
    public final c f10677a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1635l f10678b;

    /* renamed from: c, reason: collision with root package name */
    public final b f10679c = new b();

    /* renamed from: e, reason: collision with root package name */
    public final e f10681e = new e();

    /* renamed from: f, reason: collision with root package name */
    public final long f10682f = TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION;

    /* renamed from: d, reason: collision with root package name */
    public final V f10680d = new V(15);

    public DashMediaSource$Factory(InterfaceC1635l interfaceC1635l) {
        this.f10677a = new c(interfaceC1635l, 17);
        this.f10678b = interfaceC1635l;
    }
}
