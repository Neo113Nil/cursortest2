package Cb0;

import dc0.C6154S;
import zb0.AbstractC11017b;
import zb0.f;

/* loaded from: classes3.dex */
public final class j extends AbstractC11017b {

    /* renamed from: a, reason: collision with root package name */
    private final f.b f4649a;

    /* renamed from: b, reason: collision with root package name */
    private final zb0.j f4650b;

    j(f.b bVar, C6154S c6154s) {
        zb0.j jVar;
        this.f4649a = bVar;
        if (c6154s != null) {
            Long h11 = c6154s.h();
            long longValue = h11 != null ? h11.longValue() : 0L;
            String a11 = c6154s.a();
            a11 = a11 == null ? "" : a11;
            String e11 = c6154s.e();
            jVar = new zb0.j(longValue, a11, e11 == null ? "" : e11, c6154s.b(), c6154s.f(), c6154s.g(), c6154s.c(), c6154s.d());
        } else {
            jVar = null;
        }
        this.f4650b = jVar;
    }

    @Override // zb0.AbstractC11017b
    public final f.b a() {
        return this.f4649a;
    }

    @Override // zb0.AbstractC11017b
    public final zb0.j b() {
        return this.f4650b;
    }
}
