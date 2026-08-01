package sg.bigo.ads.n1;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.f0.C5115b;

/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f13204a;

    public a(b bVar) {
        this.f13204a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb;
        WeakReference weakReference = this.f13204a.f13205a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        b bVar = this.f13204a;
        bVar.b.c.remove(((C5115b) bVar.f13205a.get()).f12782a);
        b bVar2 = this.f13204a;
        e eVar = bVar2.b.f13208a;
        C5115b c5115b = (C5115b) bVar2.f13205a.get();
        n nVar = (n) eVar;
        nVar.getClass();
        if (c5115b != null) {
            c5115b.toString();
        }
        sg.bigo.ads.f0.i iVar = c5115b.t;
        int i = iVar != null ? iVar.e : 20;
        long j = c5115b.i;
        if (j > 0 && c5115b.g * 100 >= j * i) {
            c5115b.toString();
            return;
        }
        c5115b.toString();
        Iterator it = nVar.e.iterator();
        boolean a2 = I.a((CharSequence) c5115b.r);
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
            if (TextUtils.equals(sb2.append(sb).append(File.separator).append(kVar.d()).toString(), c5115b.a())) {
                if (!a2) {
                    kVar.a(c5115b.r);
                }
                m mVar = (m) nVar.g.get(kVar.h());
                if (mVar != null) {
                    mVar.a();
                }
            }
        }
    }
}
