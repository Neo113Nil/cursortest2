package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.HashSet;

/* renamed from: io.appmetrica.analytics.impl.q2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0767q2 extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final zo f8108b;

    /* renamed from: c, reason: collision with root package name */
    public final C0423ck f8109c;

    public C0767q2(C0459e5 c0459e5) {
        this(c0459e5, c0459e5.u(), C0423ck.c());
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        C0459e5 c0459e5 = this.f6796a;
        if (!this.f8108b.c() && !this.f8108b.d()) {
            if (((C0756ph) c0459e5.f7202k.a()).f8072e) {
                this.f8109c.b();
            }
            R8 r8 = this.f6796a.f7203l;
            if (r8.f6503c == null) {
                r8.a();
            }
            T8 t8 = r8.f6503c;
            t8.getClass();
            t8.f6649b = new HashSet();
            t8.f6651d = 0;
            T8 t82 = r8.f6503c;
            t82.f6648a = true;
            W8 w8 = r8.f6502b;
            IBinaryDataHelper iBinaryDataHelper = w8.f6792c;
            V8 v8 = w8.f6791b;
            w8.f6790a.getClass();
            iBinaryDataHelper.insert("event_hashes", v8.toByteArray((V8) U8.a(t82)));
        }
        return false;
    }

    public C0767q2(C0459e5 c0459e5, zo zoVar, C0423ck c0423ck) {
        super(c0459e5);
        this.f8108b = zoVar;
        this.f8109c = c0423ck;
    }
}
