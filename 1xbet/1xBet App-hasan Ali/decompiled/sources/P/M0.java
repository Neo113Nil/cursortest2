package P;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import r.C2343v;

/* loaded from: classes.dex */
public final class M0 implements Iterable, j4.a {

    /* renamed from: l, reason: collision with root package name */
    public int f4344l;

    /* renamed from: n, reason: collision with root package name */
    public int f4346n;

    /* renamed from: o, reason: collision with root package name */
    public int f4347o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4349q;

    /* renamed from: r, reason: collision with root package name */
    public int f4350r;

    /* renamed from: t, reason: collision with root package name */
    public HashMap f4352t;

    /* renamed from: u, reason: collision with root package name */
    public C2343v f4353u;

    /* renamed from: k, reason: collision with root package name */
    public int[] f4343k = new int[0];

    /* renamed from: m, reason: collision with root package name */
    public Object[] f4345m = new Object[0];

    /* renamed from: p, reason: collision with root package name */
    public final Object f4348p = new Object();

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f4351s = new ArrayList();

    public final int c(C0280a c0280a) {
        if (this.f4349q) {
            AbstractC0317t.c("Use active SlotWriter to determine anchor location instead");
        }
        if (!c0280a.a()) {
            AbstractC0316s0.a("Anchor refers to a group that was removed");
        }
        return c0280a.f4439a;
    }

    public final void d() {
        this.f4352t = new HashMap();
    }

    public final L0 e() {
        if (this.f4349q) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f4347o++;
        return new L0(this);
    }

    public final P0 f() {
        if (this.f4349q) {
            AbstractC0317t.c("Cannot start a writer when another writer is pending");
        }
        if (this.f4347o > 0) {
            AbstractC0317t.c("Cannot start a writer when a reader is pending");
        }
        this.f4349q = true;
        this.f4350r++;
        return new P0(this);
    }

    public final boolean g(C0280a c0280a) {
        int e3;
        return c0280a.a() && (e3 = O0.e(this.f4351s, c0280a.f4439a, this.f4344l)) >= 0 && kotlin.jvm.internal.l.a(this.f4351s.get(e3), c0280a);
    }

    public final P h(int i) {
        int i5;
        ArrayList arrayList;
        int e3;
        HashMap hashMap = this.f4352t;
        if (hashMap != null) {
            if (this.f4349q) {
                AbstractC0317t.c("use active SlotWriter to crate an anchor for location instead");
            }
            C0280a c0280a = (i < 0 || i >= (i5 = this.f4344l) || (e3 = O0.e((arrayList = this.f4351s), i, i5)) < 0) ? null : (C0280a) arrayList.get(e3);
            if (c0280a != null) {
                return (P) hashMap.get(c0280a);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new O(this, 0, this.f4344l);
    }
}
