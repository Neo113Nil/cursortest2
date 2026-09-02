package t;

import F.AbstractC0010k;
import f0.l;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1264a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1265b;

    /* renamed from: c, reason: collision with root package name */
    public final C0090a f1266c;

    public g(Object obj, int i2, C0090a c0090a) {
        g0.h.e(obj, "value");
        AbstractC0010k.f("verificationMode", i2);
        this.f1264a = obj;
        this.f1265b = i2;
        this.f1266c = c0090a;
    }

    @Override // t.h
    public final Object a() {
        return this.f1264a;
    }

    @Override // t.h
    public final h d(String str, l lVar) {
        Object obj = this.f1264a;
        return ((Boolean) lVar.i(obj)).booleanValue() ? this : new f(obj, str, this.f1266c, this.f1265b);
    }
}
