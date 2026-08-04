package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f11682a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A3.j f11683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final A3.j f11684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final A3.j f11685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final A3.j f11686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final A3.j f11687f;

    public s(Context context, r rVar) {
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        p033e3.h hVar = new p033e3.h(context);
        this.f11683b = hVar;
        A3.h hVarB = A3.h.b(ac.f11573a);
        this.f11684c = hVarB;
        au auVar = new au(hVar, l.f11675a);
        this.f11685d = auVar;
        A3.h hVarB2 = A3.h.b(new al(hVar, hVarB, auVar, l.f11675a));
        this.f11686e = hVarB2;
        this.f11687f = A3.h.b(new ab(hVarB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f11687f.a();
    }
}
