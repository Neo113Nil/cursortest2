package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class BG extends AbstractC0976fG {

    /* renamed from: r, reason: collision with root package name */
    public static final Q3 f7800r;

    /* renamed from: k, reason: collision with root package name */
    public final ZF[] f7801k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f7802l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC0715Xa[] f7803m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f7804n;

    /* renamed from: o, reason: collision with root package name */
    public int f7805o = -1;

    /* renamed from: p, reason: collision with root package name */
    public long[][] f7806p;

    /* renamed from: q, reason: collision with root package name */
    public N3.c f7807q;

    static {
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        C1761wv c1761wv = C1761wv.f16184o;
        List list = Collections.EMPTY_LIST;
        C0918e3 c0918e3 = C0918e3.f13233a;
        f7800r = new Q3("MergingMediaSource", new C1184k1(), null, new C1052h2(), P4.f11040z);
    }

    public BG(RE re, ZF... zfArr) {
        this.f7801k = zfArr;
        this.f7804n = new ArrayList(Arrays.asList(zfArr));
        this.f7802l = new ArrayList(zfArr.length);
        int i = 0;
        while (true) {
            int length = zfArr.length;
            if (i >= length) {
                this.f7803m = new AbstractC0715Xa[length];
                this.f7806p = new long[0][];
                new HashMap();
                AbstractC1400ot.W(new Uu().isEmpty());
                return;
            }
            this.f7802l.add(new ArrayList());
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void a(InterfaceC1558sG interfaceC1558sG) {
        C1873zG c1873zG = (C1873zG) interfaceC1558sG;
        int i = 0;
        while (true) {
            ZF[] zfArr = this.f7801k;
            if (i >= zfArr.length) {
                return;
            }
            List list = (List) this.f7802l.get(i);
            int i5 = 0;
            while (true) {
                if (i5 >= list.size()) {
                    break;
                }
                if (((AG) list.get(i5)).f7556b.equals(interfaceC1558sG)) {
                    list.remove(i5);
                    break;
                }
                i5++;
            }
            ZF zf = zfArr[i];
            InterfaceC1558sG interfaceC1558sG2 = c1873zG.f16580k[i];
            if (interfaceC1558sG2 instanceof SG) {
                interfaceC1558sG2 = ((SG) interfaceC1558sG2).f11529k;
            }
            zf.a(interfaceC1558sG2);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final InterfaceC1558sG b(C1603tG c1603tG, C1425pH c1425pH, long j5) {
        ZF[] zfArr = this.f7801k;
        int length = zfArr.length;
        InterfaceC1558sG[] interfaceC1558sGArr = new InterfaceC1558sG[length];
        AbstractC0715Xa[] abstractC0715XaArr = this.f7803m;
        int a5 = abstractC0715XaArr[0].a(c1603tG.f15679a);
        for (int i = 0; i < length; i++) {
            C1603tG a6 = c1603tG.a(abstractC0715XaArr[i].f(a5));
            interfaceC1558sGArr[i] = zfArr[i].b(a6, c1425pH, j5 - this.f7806p[a5][i]);
            ((List) this.f7802l.get(i)).add(new AG(a6, interfaceC1558sGArr[i]));
        }
        return new C1873zG(this.f7806p[a5], interfaceC1558sGArr);
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final Q3 c() {
        ZF[] zfArr = this.f7801k;
        return zfArr.length > 0 ? zfArr[0].c() : f7800r;
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void j(C1514rH c1514rH) {
        this.f13467j = c1514rH;
        int i = AbstractC1260lo.f14419a;
        Looper myLooper = Looper.myLooper();
        AbstractC1668us.F(myLooper);
        this.i = new Handler(myLooper, null);
        int i5 = 0;
        while (true) {
            ZF[] zfArr = this.f7801k;
            if (i5 >= zfArr.length) {
                return;
            }
            t(Integer.valueOf(i5), zfArr[i5]);
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0976fG, com.google.android.gms.internal.ads.ZF
    public final void m() {
        super.m();
        Arrays.fill(this.f7803m, (Object) null);
        this.f7805o = -1;
        this.f7807q = null;
        ArrayList arrayList = this.f7804n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f7801k);
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void p(Q3 q32) {
        this.f7801k[0].p(q32);
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void r() {
        N3.c cVar = this.f7807q;
        if (cVar != null) {
            throw cVar;
        }
        Iterator it = this.f13466h.values().iterator();
        while (it.hasNext()) {
            ((C0931eG) it.next()).f13245a.r();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0976fG
    public final void s(Integer num, ZF zf, AbstractC0715Xa abstractC0715Xa) {
        int i;
        if (this.f7807q != null) {
            return;
        }
        if (this.f7805o == -1) {
            i = abstractC0715Xa.b();
            this.f7805o = i;
        } else {
            int b3 = abstractC0715Xa.b();
            int i5 = this.f7805o;
            if (b3 != i5) {
                this.f7807q = new N3.c();
                return;
            }
            i = i5;
        }
        int length = this.f7806p.length;
        AbstractC0715Xa[] abstractC0715XaArr = this.f7803m;
        if (length == 0) {
            this.f7806p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i, abstractC0715XaArr.length);
        }
        ArrayList arrayList = this.f7804n;
        arrayList.remove(zf);
        abstractC0715XaArr[num.intValue()] = abstractC0715Xa;
        if (arrayList.isEmpty()) {
            k(abstractC0715XaArr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0976fG
    public final /* bridge */ /* synthetic */ C1603tG w(Integer num, C1603tG c1603tG) {
        int intValue = num.intValue();
        ArrayList arrayList = this.f7802l;
        List list = (List) arrayList.get(intValue);
        for (int i = 0; i < list.size(); i++) {
            if (((AG) list.get(i)).f7555a.equals(c1603tG)) {
                return ((AG) ((List) arrayList.get(0)).get(i)).f7555a;
            }
        }
        return null;
    }
}
