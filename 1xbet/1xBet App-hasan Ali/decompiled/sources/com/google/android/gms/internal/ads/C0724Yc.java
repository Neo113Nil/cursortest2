package com.google.android.gms.internal.ads;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import r3.C2350b;

/* renamed from: com.google.android.gms.internal.ads.Yc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0724Yc implements InterfaceC0758ad {

    /* renamed from: l, reason: collision with root package name */
    public static final List f12336l = Collections.synchronizedList(new ArrayList());

    /* renamed from: a, reason: collision with root package name */
    public final LC f12337a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f12338b;

    /* renamed from: e, reason: collision with root package name */
    public final Context f12341e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final C0731Zc f12342g;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f12339c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f12340d = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final Object f12343h = new Object();
    public final HashSet i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public boolean f12344j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12345k = false;

    public C0724Yc(Context context, U2.a aVar, C0731Zc c0731Zc, String str) {
        this.f12341e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f12338b = new LinkedHashMap();
        this.f12342g = c0731Zc;
        Iterator it = c0731Zc.f12490o.iterator();
        while (it.hasNext()) {
            this.i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.i.remove("cookie".toLowerCase(Locale.ENGLISH));
        LC w5 = C1331nD.w();
        w5.e();
        C1331nD.K((C1331nD) w5.f10141l, 9);
        w5.e();
        C1331nD.J((C1331nD) w5.f10141l, str);
        w5.e();
        C1331nD.H((C1331nD) w5.f10141l, str);
        MC w6 = NC.w();
        String str2 = this.f12342g.f12486k;
        if (str2 != null) {
            w6.e();
            NC.x((NC) w6.f10141l, str2);
        }
        NC nc = (NC) w6.b();
        w5.e();
        C1331nD.G((C1331nD) w5.f10141l, nc);
        C1151jD w7 = C1196kD.w();
        boolean d5 = C2350b.a(this.f12341e).d();
        w7.e();
        C1196kD.z((C1196kD) w7.f10141l, d5);
        String str3 = aVar.f5852k;
        if (str3 != null) {
            w7.e();
            C1196kD.x((C1196kD) w7.f10141l, str3);
        }
        j3.f fVar = j3.f.f17514b;
        Context context2 = this.f12341e;
        fVar.getClass();
        long a5 = j3.f.a(context2);
        if (a5 > 0) {
            w7.e();
            C1196kD.y((C1196kD) w7.f10141l, a5);
        }
        C1196kD c1196kD = (C1196kD) w7.b();
        w5.e();
        C1331nD.F((C1331nD) w5.f10141l, c1196kD);
        this.f12337a = w5;
    }

    public final void a(String str, Map map, int i) {
        synchronized (this.f12343h) {
            if (i == 3) {
                try {
                    this.f12345k = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f12338b.containsKey(str)) {
                if (i == 3) {
                    C1063hD c1063hD = (C1063hD) this.f12338b.get(str);
                    c1063hD.e();
                    C1108iD.D((C1108iD) c1063hD.f10141l, 4);
                }
                return;
            }
            C1063hD x5 = C1108iD.x();
            int i5 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 4 : 3 : 2 : 1;
            if (i5 != 0) {
                x5.e();
                C1108iD.D((C1108iD) x5.f10141l, i5);
            }
            int size = this.f12338b.size();
            x5.e();
            C1108iD.A((C1108iD) x5.f10141l, size);
            x5.e();
            C1108iD.C((C1108iD) x5.f10141l, str);
            UC w5 = WC.w();
            if (!this.i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        RC w6 = SC.w();
                        Charset charset = VB.f11871a;
                        C1733wB c1733wB = new C1733wB(str2.getBytes(charset));
                        w6.e();
                        SC.x((SC) w6.f10141l, c1733wB);
                        C1733wB c1733wB2 = new C1733wB(str3.getBytes(charset));
                        w6.e();
                        SC.y((SC) w6.f10141l, c1733wB2);
                        SC sc = (SC) w6.b();
                        w5.e();
                        WC.x((WC) w5.f10141l, sc);
                    }
                }
            }
            WC wc = (WC) w5.b();
            x5.e();
            C1108iD.B((C1108iD) x5.f10141l, wc);
            this.f12338b.put(str, x5);
        }
    }

    public final void b() {
        synchronized (this.f12343h) {
            this.f12338b.keySet();
            Mw c02 = AbstractC1400ot.c0(Collections.EMPTY_MAP);
            N9 n9 = new N9(1, this);
            C0606Hd c0606Hd = AbstractC0613Id.f9544g;
            C1537rw j02 = AbstractC1400ot.j0(c02, n9, c0606Hd);
            E3.a l02 = AbstractC1400ot.l0(j02, 10L, TimeUnit.SECONDS, AbstractC0613Id.f9542d);
            j02.a(new Kw(0, j02, new Qt(9, l02)), c0606Hd);
            f12336l.add(l02);
        }
    }

    public final void c(String str) {
        synchronized (this.f12343h) {
            try {
                if (str == null) {
                    LC lc = this.f12337a;
                    lc.e();
                    C1331nD.D((C1331nD) lc.f10141l);
                } else {
                    LC lc2 = this.f12337a;
                    lc2.e();
                    C1331nD.E((C1331nD) lc2.f10141l, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
