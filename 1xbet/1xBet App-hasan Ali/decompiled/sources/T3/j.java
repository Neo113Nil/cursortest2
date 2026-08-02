package T3;

import G1.C0140k;
import P.C0315s;
import S3.AbstractC0406i;
import W3.o;
import android.os.Bundle;
import i4.InterfaceC2015a;
import t.C2396h;

/* loaded from: classes.dex */
public final class j implements i4.g {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5793k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2015a f5794l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f5795m;

    public j(int i, InterfaceC2015a interfaceC2015a, String str) {
        this.f5793k = i;
        this.f5794l = interfaceC2015a;
        this.f5795m = str;
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
            int i = c5.getInt("playerKey");
            Bundle c6 = c0140k.c();
            int i5 = c6 != null ? c6.getInt("yearKey") : this.f5793k;
            G4.d.a(false, this.f5794l, c0315s, 0);
            AbstractC0406i.a(i, i5, this.f5794l, this.f5795m, null, c0315s, 0);
        }
        return o.f6046a;
    }
}
