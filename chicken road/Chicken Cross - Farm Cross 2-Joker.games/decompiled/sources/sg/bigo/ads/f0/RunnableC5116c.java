package sg.bigo.ads.f0;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.Iterator;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.U.p;
import sg.bigo.ads.U.q;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.n1.n;

/* renamed from: sg.bigo.ads.f0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5116c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5115b f12783a;
    public final /* synthetic */ h b;

    public RunnableC5116c(h hVar, C5115b c5115b) {
        this.b = hVar;
        this.f12783a = c5115b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb;
        g gVar = this.b.f;
        C5115b c5115b = this.f12783a;
        n nVar = (n) gVar;
        nVar.getClass();
        sg.bigo.ads.q1.e eVar = sg.bigo.ads.q1.e.g;
        Context context = nVar.d;
        eVar.getClass();
        if (q.a(context, c5115b.c, c5115b.d)) {
            return;
        }
        Iterator it = nVar.e.iterator();
        boolean a2 = I.a((CharSequence) c5115b.r);
        while (!a2 && it.hasNext()) {
            InterfaceC5087a interfaceC5087a = (InterfaceC5087a) it.next();
            Context context2 = nVar.d;
            sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) interfaceC5087a;
            StringBuilder sb2 = new StringBuilder();
            if (kVar.o()) {
                StringBuilder sb3 = new StringBuilder();
                StringBuilder append = new StringBuilder().append(q.a(context2));
                String str = File.separator;
                sb = p.a(append, str, "video", sb3, str).append("vpaid").toString();
            } else {
                StringBuilder sb4 = new StringBuilder();
                StringBuilder append2 = new StringBuilder().append(q.a(context2));
                String str2 = File.separator;
                sb = p.a(append2, str2, "video", sb4, str2).append("files").toString();
            }
            if (TextUtils.equals(sb2.append(sb).append(File.separator).append(kVar.d()).toString(), c5115b.a())) {
                kVar.a(c5115b.r);
            }
        }
    }
}
