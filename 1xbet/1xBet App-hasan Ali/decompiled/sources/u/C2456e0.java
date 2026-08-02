package u;

import k0.C2023c;
import n.AbstractC2107A;

/* renamed from: u.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2456e0 implements InterfaceC2430A {

    /* renamed from: a, reason: collision with root package name */
    public final float f19802a;

    /* renamed from: b, reason: collision with root package name */
    public final float f19803b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19804c;

    public C2456e0(float f, float f5, Object obj) {
        this.f19802a = f;
        this.f19803b = f5;
        this.f19804c = obj;
    }

    @Override // u.InterfaceC2464k
    public final C0 a(A0 a02) {
        Object obj = this.f19804c;
        return new C2023c(this.f19802a, this.f19803b, obj == null ? null : (AbstractC2470q) a02.f19643a.c(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2456e0) {
            C2456e0 c2456e0 = (C2456e0) obj;
            if (c2456e0.f19802a == this.f19802a && c2456e0.f19803b == this.f19803b && kotlin.jvm.internal.l.a(c2456e0.f19804c, this.f19804c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f19804c;
        return Float.floatToIntBits(this.f19803b) + AbstractC2107A.n(this.f19802a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ C2456e0(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
