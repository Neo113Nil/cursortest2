package sg.bigo.ads.X0;

import android.util.Log;
import sg.bigo.ads.q0.InterfaceC5437a;

/* loaded from: classes3.dex */
public final class i implements InterfaceC5437a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f12605a;

    public i(r rVar) {
        this.f12605a = rVar;
    }

    @Override // sg.bigo.ads.q0.InterfaceC5437a
    public final void a(Throwable th) {
        r rVar = this.f12605a;
        String name = Thread.currentThread().getName();
        rVar.getClass();
        if (name.contains("ReportNet") || name.contains("Stat-Worker")) {
            return;
        }
        sg.bigo.ads.s1.b.a(3000, 10100, Log.getStackTraceString(th), (sg.bigo.ads.P.c) null);
    }
}
