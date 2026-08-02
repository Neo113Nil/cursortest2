package com.google.android.play.core.integrity;

import android.content.Context;
import e3.C1023h;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final s f11682a = this;

    /* renamed from: b, reason: collision with root package name */
    private final A3.j f11683b;

    /* renamed from: c, reason: collision with root package name */
    private final A3.j f11684c;

    /* renamed from: d, reason: collision with root package name */
    private final A3.j f11685d;

    /* renamed from: e, reason: collision with root package name */
    private final A3.j f11686e;

    /* renamed from: f, reason: collision with root package name */
    private final A3.j f11687f;

    public s(Context context, r rVar) {
        ad adVar;
        m mVar;
        m mVar2;
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        C1023h c1023h = new C1023h(context);
        this.f11683b = c1023h;
        adVar = ac.f11573a;
        A3.h b7 = A3.h.b(adVar);
        this.f11684c = b7;
        mVar = l.f11675a;
        au auVar = new au(c1023h, mVar);
        this.f11685d = auVar;
        mVar2 = l.f11675a;
        A3.h b8 = A3.h.b(new al(c1023h, b7, auVar, mVar2));
        this.f11686e = b8;
        this.f11687f = A3.h.b(new ab(b8));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f11687f.a();
    }
}
