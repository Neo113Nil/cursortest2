package androidx.activity;

import androidx.fragment.app.H;
import g6.C1157f;

/* loaded from: classes.dex */
public final class y implements c {

    /* renamed from: a, reason: collision with root package name */
    public final H f8139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f8140b;

    public y(A a2, H h6) {
        t6.h.e(h6, "onBackPressedCallback");
        this.f8140b = a2;
        this.f8139a = h6;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [s6.a, t6.g] */
    @Override // androidx.activity.c
    public final void cancel() {
        A a2 = this.f8140b;
        C1157f c1157f = a2.f8081b;
        H h6 = this.f8139a;
        c1157f.remove(h6);
        if (t6.h.a(a2.f8082c, h6)) {
            h6.a();
            a2.f8082c = null;
        }
        h6.f9357b.remove(this);
        ?? r02 = h6.f9358c;
        if (r02 != 0) {
            r02.invoke();
        }
        h6.f9358c = null;
    }
}
