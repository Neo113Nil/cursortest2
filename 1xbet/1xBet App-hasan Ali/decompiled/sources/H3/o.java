package H3;

import java.util.Map;

/* loaded from: classes.dex */
public final class o implements Map.Entry {

    /* renamed from: k, reason: collision with root package name */
    public o f2341k;

    /* renamed from: l, reason: collision with root package name */
    public o f2342l;

    /* renamed from: m, reason: collision with root package name */
    public o f2343m;

    /* renamed from: n, reason: collision with root package name */
    public o f2344n;

    /* renamed from: o, reason: collision with root package name */
    public o f2345o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f2346p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f2347q;

    /* renamed from: r, reason: collision with root package name */
    public Object f2348r;

    /* renamed from: s, reason: collision with root package name */
    public int f2349s;

    public o(boolean z3) {
        this.f2346p = null;
        this.f2347q = z3;
        this.f2345o = this;
        this.f2344n = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f2346p;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f2348r;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2346p;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2348r;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f2346p;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f2348r;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f2347q) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f2348r;
        this.f2348r = obj;
        return obj2;
    }

    public final String toString() {
        return this.f2346p + "=" + this.f2348r;
    }

    public o(boolean z3, o oVar, Object obj, o oVar2, o oVar3) {
        this.f2341k = oVar;
        this.f2346p = obj;
        this.f2347q = z3;
        this.f2349s = 1;
        this.f2344n = oVar2;
        this.f2345o = oVar3;
        oVar3.f2344n = this;
        oVar2.f2345o = this;
    }
}
