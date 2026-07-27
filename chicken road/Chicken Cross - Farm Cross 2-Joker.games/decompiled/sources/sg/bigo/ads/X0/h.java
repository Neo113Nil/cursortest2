package sg.bigo.ads.X0;

import android.content.Context;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.ironsource.Fc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.b0.AbstractC5025b;
import sg.bigo.ads.d.C5055a;
import sg.bigo.ads.g0.C5123a;
import sg.bigo.ads.l0.C5294e;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.s0.AbstractC5459A;
import sg.bigo.ads.s0.C5460B;

/* loaded from: classes3.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f12604a;
    public final /* synthetic */ r b;

    public h(r rVar, sg.bigo.ads.a aVar) {
        this.b = rVar;
        this.f12604a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap;
        long j;
        Context context;
        r rVar = this.b;
        rVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap2 = new HashMap();
        rVar.e.l();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
        hashMap2.put("1", String.valueOf(elapsedRealtime3));
        String.valueOf(elapsedRealtime3);
        C5055a a2 = BigoAdSdk.a(rVar.f12613a);
        if (I.a((CharSequence) a2.e)) {
            a2.e = rVar.e.f12615a.getAppKey();
        }
        long elapsedRealtime4 = SystemClock.elapsedRealtime();
        long elapsedRealtime5 = SystemClock.elapsedRealtime() - elapsedRealtime2;
        hashMap2.put("2", String.valueOf(elapsedRealtime5));
        String.valueOf(elapsedRealtime5);
        if (TextUtils.equals(rVar.e.f12615a.getAppKey(), a2.e)) {
            sg.bigo.ads.Q0.n nVar = rVar.d;
            nVar.f12510a.a(rVar.f12613a);
            String str = (String) sg.bigo.ads.F0.b.a("sp_ads", "sp_asn_local", "", 3);
            if (!TextUtils.isEmpty(str)) {
                sg.bigo.ads.Q0.b bVar = nVar.f12510a;
                synchronized (bVar) {
                    bVar.f = str;
                }
            }
            rVar.b.a(rVar.f12613a);
            rVar.c.a(rVar.f12613a);
        }
        long elapsedRealtime6 = SystemClock.elapsedRealtime();
        long elapsedRealtime7 = SystemClock.elapsedRealtime() - elapsedRealtime4;
        hashMap2.put(ExifInterface.GPS_MEASUREMENT_3D, String.valueOf(elapsedRealtime7));
        String.valueOf(elapsedRealtime7);
        sg.bigo.ads.T0.g gVar = rVar.b;
        gVar.d();
        gVar.e();
        gVar.c();
        E e = E.j;
        sg.bigo.ads.P.v vVar = rVar.b.D;
        e.getClass();
        e.f12599a = vVar.f12494a == 1;
        e.b = vVar.b;
        e.c = vVar.c;
        AbstractC5025b.a(rVar.f12613a, new j());
        long elapsedRealtime8 = SystemClock.elapsedRealtime();
        long elapsedRealtime9 = SystemClock.elapsedRealtime() - elapsedRealtime6;
        hashMap2.put("4", String.valueOf(elapsedRealtime9));
        String.valueOf(elapsedRealtime9);
        sg.bigo.ads.x1.p pVar = sg.bigo.ads.x1.p.h;
        Context context2 = rVar.f12613a;
        sg.bigo.ads.P.u uVar = rVar.b.X;
        sg.bigo.ads.V0.i iVar = new sg.bigo.ads.V0.i(rVar.d);
        pVar.e = context2;
        if (!pVar.b.getAndSet(true)) {
            pVar.c = uVar;
            pVar.d = iVar;
            if (uVar.f12493a) {
                AbstractC5446j.a(1, null, new sg.bigo.ads.x1.o(pVar), 0L);
            }
        }
        sg.bigo.ads.s1.d dVar = sg.bigo.ads.s1.d.e;
        Context context3 = rVar.f12613a;
        sg.bigo.ads.t1.b bVar2 = rVar.b.Z;
        u uVar2 = rVar.e;
        sg.bigo.ads.V0.m mVar = new sg.bigo.ads.V0.m(uVar2, rVar.d);
        if (!dVar.c.getAndSet(true)) {
            dVar.f13306a = bVar2;
            dVar.d = uVar2;
            dVar.b = new sg.bigo.ads.u1.g(context3, bVar2, mVar, uVar2);
        }
        sg.bigo.ads.f1.b bVar3 = sg.bigo.ads.f1.b.i;
        Context context4 = rVar.f12613a;
        sg.bigo.ads.g1.a aVar = rVar.b.a0;
        u uVar3 = rVar.e;
        sg.bigo.ads.Q0.n nVar2 = rVar.d;
        sg.bigo.ads.V0.c cVar = new sg.bigo.ads.V0.c(uVar3, nVar2);
        sg.bigo.ads.V0.g gVar2 = new sg.bigo.ads.V0.g(uVar3, nVar2);
        bVar3.d = aVar;
        bVar3.e = context4;
        bVar3.f = cVar;
        bVar3.g = gVar2;
        bVar3.h = uVar3;
        if (!bVar3.b.getAndSet(true)) {
            sg.bigo.ads.g1.a aVar2 = bVar3.d;
            if (aVar2 == null || !aVar2.d) {
                bVar3.f12791a = new sg.bigo.ads.h1.f(context4, aVar, cVar, uVar3);
            } else {
                bVar3.c = new sg.bigo.ads.h1.x(bVar3.e, aVar2, bVar3.f, bVar3.g, bVar3.h);
            }
        }
        C5294e c5294e = C5294e.c;
        sg.bigo.ads.V0.e eVar = new sg.bigo.ads.V0.e(rVar.e, rVar.d);
        c5294e.f13056a.set(true);
        c5294e.b = eVar;
        sg.bigo.ads.s1.a aVar3 = sg.bigo.ads.s1.a.b;
        u uVar4 = rVar.e;
        aVar3.f13303a = new sg.bigo.ads.V0.k(uVar4, rVar.d);
        sg.bigo.ads.T0.g gVar3 = rVar.b;
        C5123a c5123a = gVar3.Y;
        sg.bigo.ads.P.q qVar = gVar3.B;
        sg.bigo.ads.n1.n nVar3 = sg.bigo.ads.n1.n.n;
        Context context5 = rVar.f12613a;
        boolean a3 = qVar.a(12);
        nVar3.m = uVar4;
        nVar3.d = context5;
        if (nVar3.b.getAndSet(true)) {
            hashMap = hashMap2;
            j = elapsedRealtime8;
        } else {
            nVar3.j = c5123a;
            sg.bigo.ads.q1.e eVar2 = sg.bigo.ads.q1.e.g;
            eVar2.f = context5;
            eVar2.e = c5123a;
            hashMap = hashMap2;
            if (context5 == null) {
                j = elapsedRealtime8;
            } else {
                eVar2.f13262a = System.currentTimeMillis();
                j = elapsedRealtime8;
                AbstractC5446j.a(1, null, new sg.bigo.ads.q1.b(eVar2), 30000L);
            }
            nVar3.h = new sg.bigo.ads.f0.h(context5, nVar3.j, a3, nVar3);
            nVar3.i = new sg.bigo.ads.n1.f(nVar3);
            nVar3.e = new ArrayList();
            nVar3.f = new ArrayList();
            nVar3.g = new Hashtable();
            nVar3.c = System.currentTimeMillis();
            AbstractC5446j.a(1, null, new sg.bigo.ads.n1.i(nVar3), 30000L);
            C5460B c5460b = AbstractC5459A.f13283a;
            c5460b.c = c5123a;
            sg.bigo.ads.s0.v vVar2 = sg.bigo.ads.s0.u.f13300a;
            vVar2.c = c5123a;
            c5460b.a(context5);
            vVar2.a(context5);
        }
        if (qVar.a(15) && (context = rVar.f12613a) != null && !sg.bigo.ads.I0.f.j) {
            context.registerReceiver(sg.bigo.ads.I0.f.k, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            sg.bigo.ads.I0.f.j = true;
        }
        long elapsedRealtime10 = SystemClock.elapsedRealtime();
        long elapsedRealtime11 = SystemClock.elapsedRealtime() - j;
        hashMap.put(CampaignEx.CLICKMODE_ON, String.valueOf(elapsedRealtime11));
        String.valueOf(elapsedRealtime11);
        if (!qVar.a(21)) {
            AbstractC5446j.b(new k(rVar));
        }
        long elapsedRealtime12 = SystemClock.elapsedRealtime();
        long elapsedRealtime13 = SystemClock.elapsedRealtime() - elapsedRealtime10;
        hashMap.put("6", String.valueOf(elapsedRealtime13));
        String.valueOf(elapsedRealtime13);
        sg.bigo.ads.a1.b.a(rVar.f12613a, rVar);
        sg.bigo.ads.I0.f.k(rVar.f12613a);
        q qVar2 = rVar.p;
        if (qVar2.f12612a == 0 || qVar2.f12612a == 2) {
            AbstractC5446j.a(3, null, qVar2, 5000L);
            qVar2.f12612a = 1;
        }
        sg.bigo.ads.Q0.n nVar4 = rVar.d;
        AbstractC5446j.a(nVar4.l);
        AbstractC5446j.a(1, null, nVar4.l, Math.max(8000L, 0L));
        long elapsedRealtime14 = SystemClock.elapsedRealtime() - elapsedRealtime12;
        hashMap.put(Fc.e, String.valueOf(elapsedRealtime14));
        String.valueOf(elapsedRealtime14);
        if (1 == sg.bigo.ads.O.g.f12472a.Q) {
            sg.bigo.ads.S0.h hVar = sg.bigo.ads.S0.g.f12539a;
            sg.bigo.ads.Q0.n nVar5 = rVar.d;
            u uVar5 = rVar.e;
            sg.bigo.ads.T0.g gVar4 = rVar.b;
            sg.bigo.ads.T0.n nVar6 = rVar.c;
            z zVar = rVar.f;
            hVar.f12540a = nVar5;
            hVar.b = uVar5;
            hVar.c = gVar4;
            hVar.d = nVar6;
            hVar.e = zVar;
        }
        Runnable runnable = this.f12604a;
        if (runnable != null) {
            runnable.run();
        }
        r.a(this.b, 0, hashMap);
        this.b.getClass();
        AbstractC5446j.a(1, null, new RunnableC5009d(), 0L);
    }
}
