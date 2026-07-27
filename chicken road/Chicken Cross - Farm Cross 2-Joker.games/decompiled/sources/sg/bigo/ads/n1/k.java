package sg.bigo.ads.n1;

import android.content.Context;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import sg.bigo.ads.h0.C5228a;
import sg.bigo.ads.s0.AbstractC5459A;
import sg.bigo.ads.s0.C5460B;
import sg.bigo.ads.s0.t;

/* loaded from: classes3.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f13212a;
    public final /* synthetic */ n b;

    public k(n nVar, Context context) {
        this.b = nVar;
        this.f13212a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sg.bigo.ads.f0.h hVar = this.b.h;
        if (hVar != null) {
            Iterator it = sg.bigo.ads.h0.g.f12955a.values().iterator();
            while (it.hasNext()) {
                sg.bigo.ads.h0.g.a((C5228a) it.next());
            }
            sg.bigo.ads.h0.g.f12955a.clear();
            hVar.f12787a.clear();
            hVar.c.clear();
            hVar.b.clear();
            hVar.d.clear();
        }
        ArrayList arrayList = this.b.e;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.b.f;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        Hashtable hashtable = this.b.g;
        if (hashtable != null) {
            hashtable.clear();
        }
        Context context = this.f13212a;
        C5460B c5460b = AbstractC5459A.f13283a;
        synchronized (c5460b.f) {
            c5460b.b.clear();
            c5460b.f13292a.clear();
            t.a(context).a();
        }
    }
}
