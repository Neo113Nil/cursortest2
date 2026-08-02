package A1;

import E3.AbstractC0167z;
import E3.C0165x;
import java.util.Collections;

/* renamed from: A1.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0022h0 implements InterfaceC0027k {

    /* renamed from: x, reason: collision with root package name */
    public static final C0046u f365x;

    /* renamed from: a, reason: collision with root package name */
    public final String f366a;

    /* renamed from: b, reason: collision with root package name */
    public final C0016e0 f367b;

    /* renamed from: c, reason: collision with root package name */
    public final C0014d0 f368c;

    /* renamed from: d, reason: collision with root package name */
    public final C0026j0 f369d;

    /* renamed from: e, reason: collision with root package name */
    public final C0012c0 f370e;

    /* renamed from: f, reason: collision with root package name */
    public final C0018f0 f371f;

    static {
        C0008a0 c0008a0 = new C0008a0();
        C0165x c0165x = AbstractC0167z.f2083b;
        E3.L l7 = E3.L.f2000e;
        Collections.emptyList();
        E3.L l8 = E3.L.f2000e;
        C0018f0 c0018f0 = C0018f0.f352c;
        c0008a0.a();
        C0026j0 c0026j0 = C0026j0.f414X;
        f365x = new C0046u(7);
    }

    public C0022h0(String str, C0012c0 c0012c0, C0016e0 c0016e0, C0014d0 c0014d0, C0026j0 c0026j0, C0018f0 c0018f0) {
        this.f366a = str;
        this.f367b = c0016e0;
        this.f368c = c0014d0;
        this.f369d = c0026j0;
        this.f370e = c0012c0;
        this.f371f = c0018f0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0022h0)) {
            return false;
        }
        C0022h0 c0022h0 = (C0022h0) obj;
        return v2.t.a(this.f366a, c0022h0.f366a) && this.f370e.equals(c0022h0.f370e) && v2.t.a(this.f367b, c0022h0.f367b) && this.f368c.equals(c0022h0.f368c) && v2.t.a(this.f369d, c0022h0.f369d) && v2.t.a(this.f371f, c0022h0.f371f);
    }

    public final int hashCode() {
        int hashCode = this.f366a.hashCode() * 31;
        C0016e0 c0016e0 = this.f367b;
        return this.f371f.hashCode() + ((this.f369d.hashCode() + ((this.f370e.hashCode() + ((this.f368c.hashCode() + ((hashCode + (c0016e0 != null ? c0016e0.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
