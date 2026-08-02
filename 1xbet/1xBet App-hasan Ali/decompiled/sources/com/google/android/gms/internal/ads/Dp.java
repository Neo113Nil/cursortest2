package com.google.android.gms.internal.ads;

import A0.C0052p0;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final /* synthetic */ class Dp implements InterfaceC1852yw, Jo, Ar, D3.c, InterfaceC1805xu, Yj, LF, InterfaceC1452q {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8376k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f8377l;

    public /* synthetic */ Dp(int i, Object obj) {
        this.f8376k = i;
        this.f8377l = obj;
    }

    public static Dp m(byte[] bArr) {
        return new Dp(9, C1419pB.a(bArr));
    }

    public static Dp p(int i) {
        C0052p0 c0052p0 = AbstractC1226kz.f14310a;
        byte[] bArr = new byte[i];
        ((SecureRandom) AbstractC1226kz.f14310a.get()).nextBytes(bArr);
        return new Dp(9, C1419pB.a(bArr));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1805xu
    /* renamed from: a */
    public Object mo12a() {
        return Boolean.valueOf(((AtomicBoolean) this.f8377l).get());
    }

    @Override // D3.c
    public void b(D3.o oVar) {
        Rt rt = (Rt) this.f8377l;
        if (oVar.f969d) {
            rt.cancel(false);
            return;
        }
        if (oVar.d()) {
            rt.f(oVar.b());
            return;
        }
        Exception a5 = oVar.a();
        if (a5 == null) {
            throw new IllegalStateException();
        }
        rt.g(a5);
    }

    @Override // com.google.android.gms.internal.ads.LF
    public void c(Bundle bundle) {
        ((MediaCodec) this.f8377l).setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.LF, com.google.android.gms.internal.ads.InterfaceC1452q
    public void d() {
        switch (this.f8376k) {
            case 15:
                break;
            default:
                AH ah = (AH) this.f8377l;
                if (ah.f7571U0 != null) {
                    ah.n0(0, 1);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.LF
    public void e(int i, int i5, int i6, long j5) {
        ((MediaCodec) this.f8377l).queueInputBuffer(i, 0, i5, j5, i6);
    }

    @Override // com.google.android.gms.internal.ads.Jo
    public void h(AbstractC0762ah abstractC0762ah) {
        Qk qk = (Qk) abstractC0762ah;
        synchronized (((Jq) this.f8377l)) {
            try {
                ((Jq) this.f8377l).f10073n = qk;
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8920w3)).booleanValue()) {
                    qk.f11242s.f11827a = ((Jq) this.f8377l).f10072m;
                }
                ((Jq) this.f8377l).f10073n.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.LF
    public void j(int i, C1645uD c1645uD, long j5) {
        ((MediaCodec) this.f8377l).queueSecureInputBuffer(i, 0, c1645uD.i, j5, 0);
    }

    @Override // com.google.android.gms.internal.ads.Ar
    public Object k(Object obj) {
        if (((Boolean) AbstractC0834c8.f12977c.s()).booleanValue()) {
            ((Jr) this.f8377l).e();
        }
        return obj;
    }

    public void l(String str, ID id) {
        AbstractC1400ot.l("provider", id);
        ((LinkedHashMap) this.f8377l).put(str, id);
    }

    public void n(String str, ID id) {
        l(str, id);
    }

    public FD q() {
        return new FD((LinkedHashMap) this.f8377l);
    }

    public /* synthetic */ Dp(OE oe, C1407p c1407p, TD td) {
        this.f8376k = 12;
        this.f8377l = c1407p;
    }

    @Override // com.google.android.gms.internal.ads.Jo, com.google.android.gms.internal.ads.InterfaceC1452q
    /* renamed from: a, reason: collision with other method in class */
    public void mo10a() {
        switch (this.f8376k) {
            case 2:
                synchronized (((Jq) this.f8377l)) {
                    ((Jq) this.f8377l).f10073n = null;
                }
                return;
            default:
                AH ah = (AH) this.f8377l;
                Surface surface = ah.f7571U0;
                if (surface != null) {
                    C0709Wb c0709Wb = ah.f7561K0;
                    Handler handler = (Handler) c0709Wb.f12040l;
                    if (handler != null) {
                        handler.post(new RunnableC1317n(c0709Wb, surface, SystemClock.elapsedRealtime()));
                    }
                    ah.f7574X0 = true;
                    return;
                }
                return;
        }
    }

    public Dp(Matcher matcher) {
        this.f8376k = 7;
        matcher.getClass();
        this.f8377l = matcher;
    }

    @Override // com.google.android.gms.internal.ads.Yj
    /* renamed from: k, reason: collision with other method in class */
    public void mo11k(Object obj) {
        ((PE) obj).e((C1407p) this.f8377l);
    }

    public Dp(int i) {
        this.f8376k = 10;
        this.f8377l = AbstractC0952et.G(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1852yw, com.google.android.gms.internal.ads.InterfaceC1805xu
    /* renamed from: a */
    public E3.a mo12a() {
        String str;
        Bundle bundle;
        Gp gp = (Gp) this.f8377l;
        A7 a7 = F7.xa;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            str = gp.f9271e.f.toLowerCase(Locale.ROOT);
        } else {
            str = gp.f9271e.f;
        }
        if (((Boolean) rVar.f5056c.a(F7.f8667C1)).booleanValue()) {
            Ll ll = gp.f9273h;
            synchronized (ll) {
                bundle = new Bundle(ll.f10458k);
            }
        } else {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        ArrayList arrayList = new ArrayList();
        if (!((Boolean) rVar.f5056c.a(F7.f8717L1)).booleanValue()) {
            Iterator it = ((C1896zv) gp.f9269c.b(gp.f9274j, str).entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                List list = (List) entry.getValue();
                Bundle bundle3 = gp.f9271e.f12098d.f4969w;
                arrayList.add(gp.b(str2, list, bundle3 != null ? bundle3.getBundle(str2) : null, true, true));
            }
            gp.c(arrayList, gp.f9269c.c());
        } else {
            gp.c(arrayList, gp.f9269c.a(gp.f9274j, str));
        }
        AbstractC1044gv l5 = AbstractC1044gv.l(arrayList);
        A4 a42 = new A4(9, arrayList, bundle2);
        C0606Hd c0606Hd = gp.f9267a;
        Dw dw = new Dw(l5, true, false);
        dw.f8420z = new Cw(dw, a42, c0606Hd);
        dw.w();
        return dw;
    }

    private final void o() {
    }

    @Override // com.google.android.gms.internal.ads.LF
    public void f() {
    }

    @Override // com.google.android.gms.internal.ads.LF
    public void g() {
    }

    @Override // com.google.android.gms.internal.ads.LF
    public void i() {
    }
}
