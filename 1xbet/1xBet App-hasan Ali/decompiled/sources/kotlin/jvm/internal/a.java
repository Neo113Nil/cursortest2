package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes.dex */
public class a implements h, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final Object f17604k;

    /* renamed from: l, reason: collision with root package name */
    public final Class f17605l;

    /* renamed from: m, reason: collision with root package name */
    public final String f17606m;

    /* renamed from: n, reason: collision with root package name */
    public final String f17607n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f17608o = false;

    /* renamed from: p, reason: collision with root package name */
    public final int f17609p;

    /* renamed from: q, reason: collision with root package name */
    public final int f17610q;

    public a(int i, int i5, Class cls, Object obj, String str, String str2) {
        this.f17604k = obj;
        this.f17605l = cls;
        this.f17606m = str;
        this.f17607n = str2;
        this.f17609p = i;
        this.f17610q = i5 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f17608o == aVar.f17608o && this.f17609p == aVar.f17609p && this.f17610q == aVar.f17610q && this.f17604k.equals(aVar.f17604k) && this.f17605l.equals(aVar.f17605l) && this.f17606m.equals(aVar.f17606m) && this.f17607n.equals(aVar.f17607n);
    }

    @Override // kotlin.jvm.internal.h
    public final int getArity() {
        return this.f17609p;
    }

    public final int hashCode() {
        return ((((L1.a.i(L1.a.i((this.f17605l.hashCode() + (this.f17604k.hashCode() * 31)) * 31, 31, this.f17606m), 31, this.f17607n) + (this.f17608o ? 1231 : 1237)) * 31) + this.f17609p) * 31) + this.f17610q;
    }

    public final String toString() {
        x.f17625a.getClass();
        return y.a(this);
    }
}
