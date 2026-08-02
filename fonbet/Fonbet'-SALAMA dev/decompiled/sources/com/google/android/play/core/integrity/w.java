package com.google.android.play.core.integrity;

import android.content.Context;
import e3.C1023h;

/* loaded from: classes.dex */
final class w implements aw {

    /* renamed from: a, reason: collision with root package name */
    private final w f11689a = this;

    /* renamed from: b, reason: collision with root package name */
    private final A3.j f11690b;

    /* renamed from: c, reason: collision with root package name */
    private final A3.j f11691c;

    /* renamed from: d, reason: collision with root package name */
    private final A3.j f11692d;

    /* renamed from: e, reason: collision with root package name */
    private final A3.j f11693e;

    /* renamed from: f, reason: collision with root package name */
    private final A3.j f11694f;

    /* renamed from: g, reason: collision with root package name */
    private final A3.j f11695g;

    public w(Context context, v vVar) {
        bc bcVar;
        o oVar;
        o oVar2;
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        C1023h c1023h = new C1023h(context);
        this.f11690b = c1023h;
        bcVar = bb.f11626a;
        A3.h b7 = A3.h.b(bcVar);
        this.f11691c = b7;
        oVar = n.f11680a;
        au auVar = new au(c1023h, oVar);
        this.f11692d = auVar;
        oVar2 = n.f11680a;
        A3.h b8 = A3.h.b(new bp(c1023h, b7, auVar, oVar2));
        this.f11693e = b8;
        A3.h b9 = A3.h.b(new bu(b8));
        this.f11694f = b9;
        this.f11695g = A3.h.b(new ba(b8, b9));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f11695g.a();
    }
}
