package sg.bigo.ads.Z0;

import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import java.util.HashMap;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.P.s;
import sg.bigo.ads.P.t;
import sg.bigo.ads.P.x;
import sg.bigo.ads.X0.o;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.e1.InterfaceC5087a;

/* loaded from: classes3.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f12660a;
    public final /* synthetic */ int b;
    public final /* synthetic */ k c;
    public final /* synthetic */ sg.bigo.ads.P.c[] d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Ad f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ String k;

    public i(boolean z, int i, k kVar, sg.bigo.ads.P.c[] cVarArr, boolean z2, Ad ad, String str, String str2, int i2, int i3, String str3) {
        this.f12660a = z;
        this.b = i;
        this.c = kVar;
        this.d = cVarArr;
        this.e = z2;
        this.f = ad;
        this.g = str;
        this.h = str2;
        this.i = i2;
        this.j = i3;
        this.k = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        String str;
        sg.bigo.ads.P.c cVar;
        sg.bigo.ads.N.c cVar2;
        String str2;
        String str3;
        String str4;
        boolean z;
        HashMap hashMap;
        boolean z2 = !this.f12660a && this.b == 10206;
        if (this.b == 10213) {
            i = 3;
        } else {
            k kVar = this.c;
            i = kVar.f12662a ? 2 : kVar.b ? 4 : 1;
        }
        k kVar2 = this.c;
        o oVar = kVar2.i;
        int i4 = oVar == null ? 0 : oVar.f;
        sg.bigo.ads.P.c[] cVarArr = this.d;
        if (cVarArr == null) {
            cVarArr = kVar2.c;
        }
        if (cVarArr != null) {
            m.a(cVarArr, i, i4, false);
            sg.bigo.ads.P.c cVar3 = (sg.bigo.ads.P.c) A.b(cVarArr);
            i2 = cVar3 != null ? ((sg.bigo.ads.U0.b) cVar3).c0 : 0;
            sg.bigo.ads.P.c cVar4 = (sg.bigo.ads.P.c) A.b(cVarArr);
            i3 = cVar4 != null ? ((sg.bigo.ads.U0.b) cVar4).a0 : 0;
            sg.bigo.ads.P.c cVar5 = (sg.bigo.ads.P.c) A.b(cVarArr);
            str = String.valueOf(cVar5 != null ? ((sg.bigo.ads.U0.b) cVar5).d0 : 0);
            if (i2 == 1 && i == 1) {
                i = 4;
            } else if (i2 == 1 && i3 == 0) {
                i3 = 1;
            }
        } else {
            i2 = 0;
            i3 = 0;
            str = "0";
        }
        int i5 = (A.c(this.c.d) ? A.c(this.c.c) || (cVar = (sg.bigo.ads.P.c) A.b(this.c.c)) == null : (cVar = (sg.bigo.ads.P.c) A.b(this.c.d)) == null) ? 0 : ((sg.bigo.ads.U0.b) cVar).k;
        if (this.e || i2 == 1 || z2) {
            sg.bigo.ads.P.c cVar6 = (sg.bigo.ads.P.c) A.b(this.d);
            sg.bigo.ads.N.c cVar7 = cVar6 != null ? ((sg.bigo.ads.U0.b) cVar6).C : null;
            if (cVar7 != null) {
                str2 = cVar7.b;
                o oVar2 = this.c.i;
                str3 = oVar2 == null ? "0" : ((sg.bigo.ads.N.d) oVar2.f12610a).h.b;
                if (TextUtils.equals(str2, str3)) {
                    str3 = "0";
                }
            } else {
                k kVar3 = this.c;
                o oVar3 = kVar3.i;
                if (oVar3 == null) {
                    sg.bigo.ads.N.d dVar = kVar3.j;
                    if (dVar == null) {
                        str2 = "0";
                        str3 = null;
                    } else {
                        cVar2 = dVar.h;
                    }
                } else {
                    cVar2 = ((sg.bigo.ads.N.d) oVar3.f12610a).h;
                }
                str2 = cVar2.b;
                str3 = null;
            }
            sg.bigo.ads.P.c cVar8 = (sg.bigo.ads.P.c) A.b(this.d);
            t tVar = cVar8 == null ? null : ((sg.bigo.ads.U0.b) cVar8).i0;
            if (tVar == null) {
                o oVar4 = this.c.i;
                tVar = oVar4 == null ? null : oVar4.g;
            }
            Ad ad = this.f;
            s i6 = ad instanceof sg.bigo.ads.Q.b ? ((sg.bigo.ads.Q.b) ad).i() : null;
            String str5 = this.g;
            if (cVar8 == null) {
                cVar8 = (sg.bigo.ads.P.c) A.b(this.c.c);
            }
            String str6 = this.h;
            if (str2 == null) {
                str2 = "0";
            }
            if (str3 == null) {
                str3 = "0";
            }
            int i7 = this.i;
            int i8 = this.j;
            s sVar = i6;
            int i9 = this.b;
            int i10 = i5;
            String str7 = this.k;
            int i11 = i4;
            int i12 = i2;
            int i13 = i3;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.c.h;
            boolean z3 = tVar != null && tVar.f12492a;
            boolean z4 = tVar != null && tVar.b;
            int i14 = tVar != null ? tVar.c : 4;
            String str8 = tVar != null ? tVar.d : null;
            if (cVar8 == null) {
                hashMap = new HashMap();
                str4 = str8;
                z = z4;
            } else {
                HashMap a2 = sg.bigo.ads.s1.b.a(cVar8, (sg.bigo.ads.Q.b) null, false);
                sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) cVar8;
                str4 = str8;
                z = z4;
                a2.put("ad_resp_type", String.valueOf(bVar.k));
                if (cVar8 instanceof InterfaceC5087a) {
                    sg.bigo.ads.P.c cVar9 = (InterfaceC5087a) cVar8;
                    if (bVar.k == 2) {
                        a2.put("dl_status", String.valueOf(((sg.bigo.ads.U0.k) cVar9).S0));
                    }
                    if (((sg.bigo.ads.U0.b) cVar9).k == 2) {
                        a2.put("fill_strategy", String.valueOf(((sg.bigo.ads.U0.k) cVar9).Q0));
                    }
                    sg.bigo.ads.U0.k kVar4 = (sg.bigo.ads.U0.k) cVar9;
                    if (kVar4.Q0 == 2) {
                        a2.put("backup_source", String.valueOf(!I.a((CharSequence) kVar4.e()) ? 1 : 0));
                    }
                    a2.put("companion_type", sg.bigo.ads.s1.b.f13304a[kVar4.m() ? 1 : 0][kVar4.l() ? 1 : 0]);
                    a2.put("backup_dl_status", String.valueOf(kVar4.U0));
                }
                hashMap = a2;
            }
            if (!hashMap.containsKey("slot") && !TextUtils.isEmpty(str5)) {
                hashMap.put("slot", str5);
            }
            if (!hashMap.containsKey("ad_type") && !TextUtils.isEmpty(str6)) {
                hashMap.put("ad_type", str6);
            }
            hashMap.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, str2);
            hashMap.put("session_id2", str3);
            hashMap.put("rslt", String.valueOf(i7));
            hashMap.put("e_code", String.valueOf(i8));
            hashMap.put("s_code", String.valueOf(i9));
            if (str7 != null) {
                hashMap.put("error", str7);
            }
            hashMap.put("cost_total", String.valueOf(elapsedRealtime));
            hashMap.put("cache_ad_source", String.valueOf(str));
            hashMap.put("cache_ad", String.valueOf(i12));
            hashMap.put("cache_req_status", String.valueOf(i13));
            hashMap.put("req_type", String.valueOf(i));
            hashMap.put("cur_req_status", String.valueOf(i11));
            hashMap.put("adx_type_req", String.valueOf(i10));
            hashMap.put("cur_in_fg", String.valueOf(sg.bigo.ads.a0.o.b()));
            hashMap.put("encrypt", z3 ? "1" : "0");
            hashMap.put("req_encrypt_enable", z ? "1" : "0");
            hashMap.put("resp_decrypt_enable", String.valueOf(i14));
            if (!TextUtils.isEmpty(str4)) {
                hashMap.put("enc_logid", str4);
            }
            x xVar = sVar != null ? sVar.f12491a : null;
            if (xVar != null) {
                hashMap.put("is_vpaid", "1");
                hashMap.put("vpaid_version", String.valueOf(xVar.f12496a));
                hashMap.put("vpaid_version_cost", String.valueOf(xVar.b));
                hashMap.put("vpaid_init_cost", String.valueOf(xVar.c));
            }
            sg.bigo.ads.s1.b.a("06002057", hashMap);
        }
    }
}
