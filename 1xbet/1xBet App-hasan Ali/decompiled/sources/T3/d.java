package T3;

import G1.C0140k;
import G1.E;
import P.C0302l;
import P.C0315s;
import S3.K;
import W3.o;
import android.os.Bundle;
import i4.InterfaceC2015a;
import t.C2396h;

/* loaded from: classes.dex */
public final class d implements i4.g {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5769k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2015a f5770l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i4.c f5771m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ E f5772n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f5773o;

    public d(int i, E e3, InterfaceC2015a interfaceC2015a, i4.c cVar, String str) {
        this.f5769k = i;
        this.f5770l = interfaceC2015a;
        this.f5771m = cVar;
        this.f5772n = e3;
        this.f5773o = str;
    }

    @Override // i4.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        C0140k c0140k = (C0140k) obj2;
        C0315s c0315s = (C0315s) obj3;
        ((Number) obj4).intValue();
        kotlin.jvm.internal.l.f("$this$composable", (C2396h) obj);
        kotlin.jvm.internal.l.f("stackEntry", c0140k);
        Bundle c5 = c0140k.c();
        if (c5 != null) {
            int i = c5.getInt("leagueKey");
            Bundle c6 = c0140k.c();
            int i5 = c6 != null ? c6.getInt("yearKey") : this.f5769k;
            G4.d.a(false, this.f5770l, c0315s, 0);
            c0315s.X(789485473);
            i4.c cVar = this.f5771m;
            boolean f = c0315s.f(cVar);
            E e3 = this.f5772n;
            boolean h3 = f | c0315s.h(e3);
            Object M5 = c0315s.M();
            if (h3 || M5 == C0302l.f4480a) {
                M5 = new b(cVar, e3, 0);
                c0315s.i0(M5);
            }
            c0315s.q(false);
            K.d(i, i5, this.f5770l, (i4.c) M5, this.f5773o, null, c0315s, 0);
        }
        return o.f6046a;
    }
}
