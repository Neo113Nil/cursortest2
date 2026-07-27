package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.HashSet;

/* renamed from: io.appmetrica.analytics.impl.q2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0916q2 extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final zo f9046b;

    /* renamed from: c, reason: collision with root package name */
    public final C0572ck f9047c;

    public C0916q2(C0608e5 c0608e5) {
        this(c0608e5, c0608e5.u(), C0572ck.c());
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        C0608e5 c0608e5 = this.f7670a;
        if (!this.f9046b.c() && !this.f9046b.d()) {
            if (((C0905ph) c0608e5.f8095k.a()).f9008e) {
                this.f9047c.b();
            }
            R8 r8 = this.f7670a.f8096l;
            if (r8.f7367c == null) {
                r8.a();
            }
            T8 t8 = r8.f7367c;
            t8.getClass();
            t8.f7520b = new HashSet();
            t8.f7522d = 0;
            T8 t82 = r8.f7367c;
            t82.f7519a = true;
            W8 w8 = r8.f7366b;
            IBinaryDataHelper iBinaryDataHelper = w8.f7666c;
            V8 v8 = w8.f7665b;
            w8.f7664a.getClass();
            iBinaryDataHelper.insert("event_hashes", v8.toByteArray((V8) U8.a(t82)));
        }
        return false;
    }

    public C0916q2(C0608e5 c0608e5, zo zoVar, C0572ck c0572ck) {
        super(c0608e5);
        this.f9046b = zoVar;
        this.f9047c = c0572ck;
    }
}
