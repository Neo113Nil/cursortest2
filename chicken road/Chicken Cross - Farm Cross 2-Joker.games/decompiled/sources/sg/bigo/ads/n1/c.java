package sg.bigo.ads.n1;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.Iterator;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.f0.C5115b;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f13206a;

    public c(d dVar) {
        this.f13206a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb;
        d dVar = this.f13206a;
        C5115b c5115b = dVar.f13207a;
        if (c5115b != null) {
            dVar.b.b.remove(c5115b.f12782a);
            d dVar2 = this.f13206a;
            e eVar = dVar2.b.f13208a;
            C5115b c5115b2 = dVar2.f13207a;
            n nVar = (n) eVar;
            nVar.getClass();
            if (c5115b2 != null) {
                c5115b2.toString();
            }
            if (c5115b2 != null) {
                c5115b2.toString();
            }
            Iterator it = nVar.f.iterator();
            boolean a2 = I.a((CharSequence) c5115b2.r);
            while (it.hasNext()) {
                InterfaceC5087a interfaceC5087a = (InterfaceC5087a) it.next();
                Context context = nVar.d;
                sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) interfaceC5087a;
                StringBuilder sb2 = new StringBuilder();
                if (kVar.o()) {
                    StringBuilder sb3 = new StringBuilder();
                    StringBuilder append = new StringBuilder().append(sg.bigo.ads.U.q.a(context));
                    String str = File.separator;
                    sb = sg.bigo.ads.U.p.a(append, str, "video", sb3, str).append("vpaid").toString();
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    StringBuilder append2 = new StringBuilder().append(sg.bigo.ads.U.q.a(context));
                    String str2 = File.separator;
                    sb = sg.bigo.ads.U.p.a(append2, str2, "video", sb4, str2).append("files").toString();
                }
                if (TextUtils.equals(sb2.append(sb).append(File.separator).append(kVar.d()).toString(), c5115b2.a())) {
                    if (!a2) {
                        kVar.a(c5115b2.r);
                    }
                    kVar.S0 = 2;
                    m mVar = (m) nVar.g.get(kVar.h());
                    if (mVar != null) {
                        mVar.a(c5115b2);
                        if (c5115b2.b == null) {
                            nVar.g.remove(kVar.h());
                        }
                    }
                    it.remove();
                }
            }
            nVar.f13214a = 4;
            if (System.currentTimeMillis() - nVar.c > 3600000) {
                nVar.c = System.currentTimeMillis();
                AbstractC5446j.a(1, null, new i(nVar), 30000L);
            }
        }
    }
}
