package l5;

import A5.f;
import A5.j;
import A5.s;
import android.content.Context;
import android.net.ConnectivityManager;
import w1.C1761y0;
import w5.C1782b;
import w5.InterfaceC1783c;

/* renamed from: l5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1410c implements InterfaceC1783c {

    /* renamed from: a, reason: collision with root package name */
    public s f15035a;

    /* renamed from: b, reason: collision with root package name */
    public j f15036b;

    /* renamed from: c, reason: collision with root package name */
    public C1409b f15037c;

    @Override // w5.InterfaceC1783c
    public final void onAttachedToEngine(C1782b c1782b) {
        f fVar = c1782b.f18077c;
        this.f15035a = new s(fVar, "dev.fluttercommunity.plus/connectivity");
        this.f15036b = new j(fVar, "dev.fluttercommunity.plus/connectivity_status");
        Context context = c1782b.f18075a;
        u1.c cVar = new u1.c((ConnectivityManager) context.getSystemService("connectivity"), 21);
        C1761y0 c1761y0 = new C1761y0(cVar, 18);
        this.f15037c = new C1409b(context, cVar);
        this.f15035a.b(c1761y0);
        this.f15036b.a(this.f15037c);
    }

    @Override // w5.InterfaceC1783c
    public final void onDetachedFromEngine(C1782b c1782b) {
        this.f15035a.b(null);
        this.f15036b.a(null);
        this.f15037c.b();
        this.f15035a = null;
        this.f15036b = null;
        this.f15037c = null;
    }
}
