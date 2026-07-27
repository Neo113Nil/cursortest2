package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class F extends AbstractC0200k implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final F f2620b;

    /* renamed from: c, reason: collision with root package name */
    public static final F f2621c;

    /* renamed from: a, reason: collision with root package name */
    public final transient Q f2622a;

    static {
        C0244z c0244z = C.f2606b;
        f2620b = new F(Q.f2666e);
        Object[] objArr = {O.f2662c};
        for (int i3 = 0; i3 < 1; i3++) {
            if (objArr[i3] == null) {
                throw new NullPointerException(B0.c.h(i3, "at index "));
            }
        }
        f2621c = new F(C.j(1, objArr));
    }

    public F(Q q3) {
        this.f2622a = q3;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0200k
    public final /* bridge */ /* synthetic */ H a() {
        Q q3 = this.f2622a;
        return q3.isEmpty() ? X.f2702i : new Y(q3, M.f2654c);
    }
}
