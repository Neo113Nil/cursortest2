package p000;

import android.os.Bundle;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class aq0 {

    /* JADX INFO: renamed from: h */
    public static final HashMap f596h;

    /* JADX INFO: renamed from: i */
    public static final HashMap f597i;

    /* JADX INFO: renamed from: a */
    public final C0468mf f598a;

    /* JADX INFO: renamed from: b */
    public final w00 f599b;

    /* JADX INFO: renamed from: c */
    public final m10 f600c;

    /* JADX INFO: renamed from: d */
    public final kc1 f601d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0826w3 f602e;

    /* JADX INFO: renamed from: f */
    public final C0666rs f603f;

    /* JADX INFO: renamed from: g */
    public final Executor f604g;

    static {
        HashMap map = new HashMap();
        f596h = map;
        HashMap map2 = new HashMap();
        f597i = map2;
        map.put(f10.f2262j, b11.f675k);
        map.put(f10.f2263k, b11.f676l);
        map.put(f10.f2264l, b11.f677m);
        map.put(f10.f2265m, b11.f678n);
        map2.put(e10.f1898k, EnumC0667rt.f6953l);
        map2.put(e10.f1899l, EnumC0667rt.f6954m);
        map2.put(e10.f1900m, EnumC0667rt.f6955n);
        map2.put(e10.f1897j, EnumC0667rt.f6952k);
    }

    public aq0(C0468mf c0468mf, InterfaceC0826w3 interfaceC0826w3, w00 w00Var, m10 m10Var, kc1 kc1Var, C0666rs c0666rs, Executor executor) {
        this.f598a = c0468mf;
        this.f602e = interfaceC0826w3;
        this.f599b = w00Var;
        this.f600c = m10Var;
        this.f601d = kc1Var;
        this.f603f = c0666rs;
        this.f604g = executor;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m461b(C0047b2 c0047b2) {
        String str;
        return (c0047b2 == null || (str = c0047b2.f684a) == null || str.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public final C0467me m462a(zc0 zc0Var, String str) {
        C0467me c0467meM3530v = C0504ne.m3530v();
        c0467meM3530v.m3637c();
        C0504ne.m3527s((C0504ne) c0467meM3530v.f5645k);
        w00 w00Var = this.f599b;
        w00Var.m5224a();
        r10 r10Var = w00Var.f8320c;
        String str2 = r10Var.f6654e;
        c0467meM3530v.m3637c();
        C0504ne.m3526r((C0504ne) c0467meM3530v.f5645k, str2);
        String str3 = (String) zc0Var.f9733b.f5010l;
        c0467meM3530v.m3637c();
        C0504ne.m3528t((C0504ne) c0467meM3530v.f5645k, str3);
        C0765ug c0765ugM5327p = C0839wg.m5327p();
        w00Var.m5224a();
        String str4 = r10Var.f6651b;
        c0765ugM5327p.m3637c();
        C0839wg.m5325n((C0839wg) c0765ugM5327p.f5645k, str4);
        c0765ugM5327p.m3637c();
        C0839wg.m5326o((C0839wg) c0765ugM5327p.f5645k, str);
        c0467meM3530v.m3637c();
        C0504ne.m3529u((C0504ne) c0467meM3530v.f5645k, (C0839wg) c0765ugM5327p.m3635a());
        this.f601d.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c0467meM3530v.m3637c();
        C0504ne.m3522n((C0504ne) c0467meM3530v.f5645k, jCurrentTimeMillis);
        return c0467meM3530v;
    }

    /* JADX INFO: renamed from: c */
    public final void m463c(zc0 zc0Var, String str, boolean z) {
        m81 m81Var = zc0Var.f9733b;
        String str2 = (String) m81Var.f5010l;
        String str3 = (String) m81Var.f5011m;
        Bundle bundle = new Bundle();
        bundle.putString("_nmid", str2);
        bundle.putString("_nmn", str3);
        try {
            this.f601d.getClass();
            bundle.putInt("_ndt", (int) (System.currentTimeMillis() / 1000));
        } catch (NumberFormatException e) {
            n80.m3498g("Error while parsing use_device_time in FIAM event: " + e.getMessage());
        }
        n80.m3496e("Sending event=" + str + " params=" + bundle);
        InterfaceC0826w3 interfaceC0826w3 = this.f602e;
        if (interfaceC0826w3 == null) {
            n80.m3498g("Unable to log event: analytics library is missing");
            return;
        }
        interfaceC0826w3.mo4425f("fiam", str, bundle);
        if (z) {
            interfaceC0826w3.mo4423d("fiam:".concat(str2), "fiam");
        }
    }
}
