package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class w implements aw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f11689a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A3.j f11690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final A3.j f11691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final A3.j f11692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final A3.j f11693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final A3.j f11694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final A3.j f11695g;

    public w(Context context, v vVar) {
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        p033e3.h hVar = new p033e3.h(context);
        this.f11690b = hVar;
        A3.h hVarB = A3.h.b(bb.f11626a);
        this.f11691c = hVarB;
        au auVar = new au(hVar, n.f11680a);
        this.f11692d = auVar;
        A3.h hVarB2 = A3.h.b(new bp(hVar, hVarB, auVar, n.f11680a));
        this.f11693e = hVarB2;
        A3.h hVarB3 = A3.h.b(new bu(hVarB2));
        this.f11694f = hVarB3;
        this.f11695g = A3.h.b(new ba(hVarB2, hVarB3));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f11695g.a();
    }
}
