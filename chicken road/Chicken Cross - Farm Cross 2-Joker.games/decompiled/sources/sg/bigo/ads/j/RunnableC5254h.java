package sg.bigo.ads.j;

import android.content.Context;
import android.os.SystemClock;
import android.webkit.URLUtil;
import java.util.HashMap;
import java.util.List;
import sg.bigo.ads.i.C5230b;
import sg.bigo.ads.k.C5256a;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.s0.x;

/* renamed from: sg.bigo.ads.j.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5254h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f13001a;
    public final /* synthetic */ sg.bigo.ads.z1.a b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ l e;

    public RunnableC5254h(l lVar, List list, sg.bigo.ads.z1.a aVar, int i, Context context) {
        this.e = lVar;
        this.f13001a = list;
        this.b = aVar;
        this.c = i;
        this.d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e.l) {
            return;
        }
        if (!this.f13001a.isEmpty()) {
            this.e.p = (sg.bigo.ads.z1.a) this.f13001a.remove(0);
            String str = this.e.p.b;
            if (URLUtil.isNetworkUrl(str)) {
                x.a(this.d, null, str, ((sg.bigo.ads.U0.b) this.e.f).T, new C5253g(this));
                return;
            } else {
                l lVar = this.e;
                AbstractC5446j.b(new RunnableC5254h(lVar, this.f13001a, lVar.p, this.c + 1, this.d));
                return;
            }
        }
        l lVar2 = this.e;
        C5230b c5230b = lVar2.g;
        if (c5230b != null) {
            sg.bigo.ads.P.c cVar = lVar2.f;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.e.m;
            sg.bigo.ads.z1.a aVar = this.b;
            String str2 = aVar == null ? null : aVar.b;
            int i = this.c - 1;
            String str3 = aVar != null ? aVar.e : null;
            C5256a c5256a = c5230b.f12977a.c;
            if (c5256a.f13012a.contains(4)) {
                return;
            }
            c5256a.f13012a.add(4);
            sg.bigo.ads.s1.b.a(cVar, 4, elapsedRealtime, str2, i, str3, "load failed", (HashMap) null);
        }
    }
}
