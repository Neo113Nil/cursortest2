package sg.bigo.ads.n1;

import android.content.Context;
import sg.bigo.ads.e1.InterfaceC5087a;

/* loaded from: classes3.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f13209a;
    public final /* synthetic */ InterfaceC5087a b;
    public final /* synthetic */ m c;
    public final /* synthetic */ n d;

    public g(n nVar, Context context, InterfaceC5087a interfaceC5087a, m mVar) {
        this.d = nVar;
        this.f13209a = context;
        this.b = interfaceC5087a;
        this.c = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a(this.f13209a, this.b, this.c, true);
    }
}
