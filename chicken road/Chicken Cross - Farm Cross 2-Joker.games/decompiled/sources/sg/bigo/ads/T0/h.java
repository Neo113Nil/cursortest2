package sg.bigo.ads.T0;

import android.content.Context;
import sg.bigo.ads.r0.AbstractC5451b;
import sg.bigo.ads.r0.C5452c;
import sg.bigo.ads.r0.C5453d;

/* loaded from: classes3.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f12553a;

    public h(g gVar) {
        this.f12553a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sg.bigo.ads.U.a aVar;
        g gVar = this.f12553a;
        Context context = gVar.f12563a;
        long j = 15 * 1000;
        try {
            aVar = new C5453d(context, j).a();
        } catch (Throwable unused) {
            aVar = null;
        }
        if (aVar == null) {
            try {
                aVar = AbstractC5451b.a(context, j);
            } catch (C5452c unused2) {
            }
            if (aVar == null) {
                aVar = new sg.bigo.ads.U.a("", true);
            }
        }
        gVar.e = aVar;
        this.f12553a.a(0L);
    }
}
