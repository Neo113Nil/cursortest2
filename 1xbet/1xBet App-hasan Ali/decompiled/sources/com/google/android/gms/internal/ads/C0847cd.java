package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;
import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.cd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0847cd implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13002a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13003b;

    /* renamed from: c, reason: collision with root package name */
    public final ID f13004c;

    public /* synthetic */ C0847cd(Object obj, ID id, int i) {
        this.f13002a = i;
        this.f13003b = obj;
        this.f13004c = id;
    }

    public C1071hd a() {
        C0606Hd c0606Hd = AbstractC0613Id.f9540b;
        AbstractC1400ot.D(c0606Hd);
        C0606Hd c0606Hd2 = AbstractC0613Id.f9539a;
        AbstractC1400ot.D(c0606Hd2);
        Context context = (Context) ((C1796xl) this.f13003b).f16324b.d();
        AbstractC1400ot.D(c0606Hd2);
        return new C1071hd(c0606Hd, c0606Hd2, new C1348nm(context, c0606Hd2, 0), CD.a(new JD((a3.y) this.f13004c)), 10);
    }

    public C1390oj b() {
        return new C1390oj(25, new Lm(((C1520rf) this.f13003b).f15326b.a()), (Qw) ((CD) this.f13004c).d());
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f13002a) {
            case 0:
                return new SharedPreferencesOnSharedPreferenceChangeListenerC0803bd((Context) ((ED) this.f13003b).f8474a, (T2.I) ((ED) this.f13004c).f8474a);
            case 1:
                Context context = (Context) ((ED) this.f13003b).f8474a;
                C1026gd c1026gd = (C1026gd) this.f13004c;
                return new C1339nd(context, new C0709Wb(10, (C2308a) c1026gd.f13592c.f8474a, (C0892dd) c1026gd.f13591b.d()));
            case 2:
                return new C0709Wb(13, ((FD) this.f13003b).d(), ((FD) this.f13004c).d());
            case 3:
                return new C1162jg(((C1119ih) this.f13003b).a(), ((C1790xf) this.f13004c).d());
            case 4:
                return ((m2.g) this.f13003b).A(((KD) this.f13004c).d());
            case 5:
                return new C1890zp(((C0936ed) this.f13003b).b(), ((Integer) Q2.r.f5053d.f5056c.a(F7.Yb)).intValue(), (ScheduledExecutorService) ((CD) this.f13004c).d());
            case 6:
                return new C1890zp(new Mo(2, ((C0651Ng) this.f13003b).f10801b.a()), ((Integer) Q2.r.f5053d.f5056c.a(F7.dc)).intValue(), (ScheduledExecutorService) ((CD) this.f13004c).d());
            case 7:
                return new C1890zp(((C1755wp) this.f13003b).a(), ((Integer) Q2.r.f5053d.f5056c.a(F7.Zb)).intValue(), (ScheduledExecutorService) ((CD) this.f13004c).d());
            case 8:
                return new C0672Qg((InterfaceC0677Re) ((C0616Ig) this.f13003b).f9589b.f17997o, (Executor) ((CD) this.f13004c).d());
            case 9:
                String str = (String) ((CD) this.f13004c).d();
                C1528rn c1528rn = ((Gh) this.f13003b).f;
                return c1528rn != null ? c1528rn : new C1528rn(str);
            case 10:
                ((C1565sf) this.f13004c).a();
                Context context2 = ((Gh) this.f13003b).f9206a;
                AbstractC1400ot.D(context2);
                return context2;
            case 11:
                return new C1164ji(((KD) this.f13003b).d(), ((C1119ih) this.f13004c).a());
            case 12:
                Set d5 = ((KD) this.f13004c).d();
                Gi gi = (Gi) this.f13003b;
                if (gi.f9225p == null) {
                    gi.f9225p = new Oh(d5);
                }
                Oh oh = gi.f9225p;
                AbstractC1400ot.D(oh);
                return oh;
            case 13:
                Lq a5 = ((C1119ih) this.f13003b).a();
                JSONObject jSONObject = (JSONObject) ((C1614tj) this.f13004c).f15711b.f12040l;
                AbstractC1400ot.D(jSONObject);
                return new Hj(a5, jSONObject);
            case 14:
                return new Si(new Ok(((C1749wj) this.f13003b).f16143b.a()), (Executor) ((CD) this.f13004c).d());
            case 15:
                T2.v vVar = (T2.v) ((ID) this.f13003b).d();
                C2308a c2308a = (C2308a) ((CD) this.f13004c).d();
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                return new C1033gk(vVar, c2308a, c0606Hd);
            case 16:
                C0606Hd c0606Hd2 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd2);
                return new C0905dr(c0606Hd2, ((C1436pk) this.f13003b).d(), new C1390oj(20, c0606Hd2, ((C1436pk) ((C0650Nf) this.f13004c).f10799b).d()), 15, false);
            case 17:
                Cj cj = (Cj) ((C1168jm) this.f13003b).d();
                Gj a6 = ((C0650Nf) this.f13004c).a();
                ViewTreeObserverOnGlobalLayoutListenerC1840yk viewTreeObserverOnGlobalLayoutListenerC1840yk = new ViewTreeObserverOnGlobalLayoutListenerC1840yk("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
                viewTreeObserverOnGlobalLayoutListenerC1840yk.f16465k = a6.G();
                viewTreeObserverOnGlobalLayoutListenerC1840yk.f16466l = a6.J();
                viewTreeObserverOnGlobalLayoutListenerC1840yk.f16467m = cj;
                viewTreeObserverOnGlobalLayoutListenerC1840yk.f16468n = false;
                viewTreeObserverOnGlobalLayoutListenerC1840yk.f16469o = false;
                if (a6.R() != null) {
                    a6.R().O(viewTreeObserverOnGlobalLayoutListenerC1840yk);
                }
                return viewTreeObserverOnGlobalLayoutListenerC1840yk;
            case 18:
                return new C0900dl(C0905dr.C(((C1520rf) this.f13003b).f15326b.a()), (C0855cl) ((CD) this.f13004c).d());
            case 19:
                return new C1123il((C1773x6) ((CD) this.f13003b).d(), ((FD) this.f13004c).d());
            case 20:
                return new C1841yl((C1751wl) ((ID) this.f13003b).d(), (C0554Af) this.f13004c.d());
            case C1639u7.zzm /* 21 */:
                return new Bl((C0601Gf) ((ED) this.f13003b).f8474a, new C1529ro(21, (I9) ((C1700vf) this.f13004c).f16017b.f8474a));
            case 22:
                return new Vl(((C1565sf) this.f13003b).a(), ((C1745wf) this.f13004c).a());
            case 23:
                return a();
            case 24:
                Map map = ((GD) this.f13003b).f7795a;
                C0606Hd c0606Hd3 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd3);
                return new C1707vm(map, c0606Hd3, new C1389oi(((Lh) this.f13004c).f10455b.d()));
            case 25:
                C0606Hd c0606Hd4 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd4);
                return new C0905dr(c0606Hd4, ((C1520rf) this.f13003b).a(), CD.a(new JD((a3.y) this.f13004c)), 17, false);
            case 26:
                return b();
            case 27:
                return new Pm(((a3.y) this.f13003b).b(), ((C1476qf) this.f13004c).a());
            case 28:
                return new Rm(((C0847cd) this.f13003b).b(), ((C1476qf) this.f13004c).a());
            default:
                Qm qm = (Qm) ((CD) this.f13003b).d();
                C0847cd c0847cd = (C0847cd) this.f13004c;
                return new C1123il(qm, new Rm(((C0847cd) c0847cd.f13003b).b(), ((C1476qf) c0847cd.f13004c).a()));
        }
    }
}
