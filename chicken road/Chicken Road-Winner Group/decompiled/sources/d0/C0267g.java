package d0;

import kotlin.jvm.internal.j;
import o2.l;

/* renamed from: d0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267g extends X0.a {

    /* renamed from: g, reason: collision with root package name */
    public final Object f4835g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4836h;

    /* renamed from: i, reason: collision with root package name */
    public final C0261a f4837i;

    public C0267g(Object value, int i3, C0261a c0261a) {
        j.e(value, "value");
        B0.c.m(i3, "verificationMode");
        this.f4835g = value;
        this.f4836h = i3;
        this.f4837i = c0261a;
    }

    @Override // X0.a
    public final X0.a E(String str, l lVar) {
        Object obj = this.f4835g;
        return ((Boolean) lVar.invoke(obj)).booleanValue() ? this : new C0266f(obj, str, this.f4837i, this.f4836h);
    }

    @Override // X0.a
    public final Object k() {
        return this.f4835g;
    }
}
