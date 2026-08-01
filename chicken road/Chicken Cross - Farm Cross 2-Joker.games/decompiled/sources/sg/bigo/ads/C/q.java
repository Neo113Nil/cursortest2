package sg.bigo.ads.C;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.URLUtil;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.f0.C5115b;

/* loaded from: classes3.dex */
public final class q implements sg.bigo.ads.n1.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f12237a;

    public q(r rVar) {
        this.f12237a = rVar;
    }

    @Override // sg.bigo.ads.n1.m
    public final void a() {
        if (this.f12237a.e.n0.get()) {
            return;
        }
        r rVar = this.f12237a;
        sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) rVar.c;
        if (kVar.U0 == 3 || kVar.V0 != null) {
            return;
        }
        rVar.e.n0.set(true);
        Pair D = this.f12237a.e.D();
        ArrayList arrayList = new ArrayList();
        if (((Boolean) D.first).booleanValue()) {
            arrayList.add(((sg.bigo.ads.U0.k) this.f12237a.c).M0.b);
        }
        String e = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.f12237a.e.k.f12482a)).e();
        if (!TextUtils.isEmpty(e) && URLUtil.isNetworkUrl(e)) {
            arrayList.add(((sg.bigo.ads.U0.k) this.f12237a.c).e());
        }
        if (arrayList.size() == 0 && !((Boolean) D.second).booleanValue()) {
            ((sg.bigo.ads.U0.k) this.f12237a.c).U0 = 0;
            return;
        }
        r rVar2 = this.f12237a;
        sg.bigo.ads.P.c cVar = rVar2.c;
        ((sg.bigo.ads.U0.k) cVar).U0 = 3;
        Context context = rVar2.e.k.e;
        boolean z = ((sg.bigo.ads.U0.b) cVar).T;
        p pVar = new p(this, D);
        if (arrayList.size() == 0) {
            pVar.a(0, "urlList all download Failed", null);
        } else {
            sg.bigo.ads.s0.x.a(context, (String) arrayList.remove(0), z, new sg.bigo.ads.s0.w(pVar, context, arrayList, z));
        }
    }

    @Override // sg.bigo.ads.n1.m
    public final void b(int i) {
        r rVar = this.f12237a;
        rVar.e.a(rVar.c);
        t tVar = this.f12237a.e;
        int i2 = 0;
        Boolean valueOf = Boolean.valueOf(i == 0);
        synchronized (tVar) {
            tVar.N.put("is_cache", valueOf);
        }
        r rVar2 = this.f12237a;
        ((sg.bigo.ads.U0.k) rVar2.c).W0 = true;
        VideoController videoController = rVar2.e.getVideoController();
        if (videoController != null) {
            videoController.notifyResourceReady();
        }
        t tVar2 = this.f12237a.e;
        if (tVar2.n || tVar2.p) {
            return;
        }
        InterfaceC5087a interfaceC5087a = (InterfaceC5087a) tVar2.k.f12482a;
        if (i == 0) {
            i2 = 1;
        } else if (i == 1) {
            i2 = 4;
        } else if (i == 2) {
            i2 = 3;
        }
        ((sg.bigo.ads.U0.k) interfaceC5087a).Q0 = i2;
        if (sg.bigo.ads.O.g.f12472a.B.a(29)) {
            sg.bigo.ads.n1.n nVar = sg.bigo.ads.n1.n.n;
            InterfaceC5087a interfaceC5087a2 = (InterfaceC5087a) this.f12237a.e.k.f12482a;
            String d = ((sg.bigo.ads.U0.k) interfaceC5087a2).d();
            nVar.getClass();
            if (interfaceC5087a2 != null && !TextUtils.isEmpty(d)) {
                nVar.l.put(interfaceC5087a2, d);
            }
        }
        r rVar3 = this.f12237a;
        rVar3.b.a(rVar3.e);
    }

    @Override // sg.bigo.ads.n1.m
    public final void a(int i) {
        InterfaceC5087a interfaceC5087a;
        int i2;
        r rVar = this.f12237a;
        t tVar = rVar.e;
        if (tVar.n || tVar.p) {
            return;
        }
        if (((sg.bigo.ads.U0.k) rVar.c).n()) {
            interfaceC5087a = this.f12237a.c;
            i2 = 3;
        } else {
            interfaceC5087a = this.f12237a.c;
            i2 = 4;
        }
        ((sg.bigo.ads.U0.k) interfaceC5087a).Q0 = i2;
        r rVar2 = this.f12237a;
        rVar2.b.a(rVar2.e, IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, i, "Failed to download media video.");
    }

    @Override // sg.bigo.ads.n1.m
    public final void a(C5115b c5115b) {
        sg.bigo.ads.f0.i iVar;
        r rVar = this.f12237a;
        t tVar = rVar.e;
        if (tVar.n || tVar.p) {
            return;
        }
        InterfaceC5087a interfaceC5087a = rVar.c;
        sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) interfaceC5087a;
        kVar.Q0 = 2;
        if (((sg.bigo.ads.U0.b) rVar.d).l == 1) {
            if (kVar.V0 == null && ((iVar = c5115b.t) == null || !iVar.b)) {
                sg.bigo.ads.s1.b.a(interfaceC5087a, c5115b.b, "", 0L, c5115b.g / 1024, 2, "video", c5115b.q, null, null, null, 0);
                r rVar2 = this.f12237a;
                rVar2.b.a(rVar2.e, IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, 10202, "video download failed and no backup creative resource.");
                return;
            }
            if (sg.bigo.ads.O.g.f12472a.B.a(29)) {
                sg.bigo.ads.n1.n nVar = sg.bigo.ads.n1.n.n;
                InterfaceC5087a interfaceC5087a2 = (InterfaceC5087a) this.f12237a.e.k.f12482a;
                String d = ((sg.bigo.ads.U0.k) interfaceC5087a2).d();
                nVar.getClass();
                if (interfaceC5087a2 != null && !TextUtils.isEmpty(d)) {
                    nVar.l.put(interfaceC5087a2, d);
                }
            }
            r rVar3 = this.f12237a;
            rVar3.b.a(rVar3.e);
            return;
        }
        sg.bigo.ads.Q.c cVar = rVar.b;
        sg.bigo.ads.f0.i iVar2 = c5115b.t;
        cVar.a(tVar, iVar2 != null && iVar2.b);
    }
}
