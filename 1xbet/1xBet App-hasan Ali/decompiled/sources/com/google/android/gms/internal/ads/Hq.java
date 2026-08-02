package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.os.Handler;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Hq implements Jo, Ei, Jw, D3.d, InterfaceC1149jB, InterfaceC1805xu, Yj, WF {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f9490k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f9491l;

    public /* synthetic */ Hq(int i, Object obj) {
        this.f9490k = i;
        this.f9491l = obj;
    }

    public static Hq e(C1221ku c1221ku) {
        return new Hq(5, new Ps(c1221ku));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1805xu
    /* renamed from: a */
    public Object mo12a() {
        switch (this.f9490k) {
            case 8:
                return (Qt) this.f9491l;
            default:
                return (C1112iH) this.f9491l;
        }
    }

    @Override // D3.d
    public void b(Exception exc) {
        C0375o c0375o = (C0375o) this.f9491l;
        c0375o.getClass();
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        ((P.W) c0375o.f5044n).g(2025, -1L, exc);
    }

    public void c(Exception exc) {
        JB.g("MediaCodecAudioRenderer", "Audio sink error", exc);
        Er er = ((C1602tF) this.f9491l).f15666J0;
        Handler handler = (Handler) er.f8617l;
        if (handler != null) {
            handler.post(new RunnableC0975fF(er, exc, 6));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1149jB
    public Object d(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i5 = 0; i5 < 3; i5++) {
            Provider provider = Security.getProvider(strArr[i5]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        Exception exc = null;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                return ((Fz) this.f9491l).i(str, (Provider) obj);
            } catch (Exception e3) {
                if (exc == null) {
                    exc = e3;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    public void f(AbstractC1823yB abstractC1823yB) {
        if (!abstractC1823yB.j()) {
            if (!(abstractC1823yB instanceof C1509rC)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(abstractC1823yB.getClass())));
            }
            C1509rC c1509rC = (C1509rC) abstractC1823yB;
            f(c1509rC.f15279n);
            f(c1509rC.f15280o);
            return;
        }
        int binarySearch = Arrays.binarySearch(C1509rC.f15277r, abstractC1823yB.g());
        if (binarySearch < 0) {
            binarySearch = (-(binarySearch + 1)) - 1;
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.f9491l;
        int t5 = C1509rC.t(binarySearch + 1);
        if (arrayDeque.isEmpty() || ((AbstractC1823yB) arrayDeque.peek()).g() >= t5) {
            arrayDeque.push(abstractC1823yB);
            return;
        }
        int t6 = C1509rC.t(binarySearch);
        AbstractC1823yB abstractC1823yB2 = (AbstractC1823yB) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((AbstractC1823yB) arrayDeque.peek()).g() < t6) {
            abstractC1823yB2 = new C1509rC((AbstractC1823yB) arrayDeque.pop(), abstractC1823yB2);
        }
        C1509rC c1509rC2 = new C1509rC(abstractC1823yB2, abstractC1823yB);
        while (!arrayDeque.isEmpty()) {
            int binarySearch2 = Arrays.binarySearch(C1509rC.f15277r, c1509rC2.f15278m);
            if (binarySearch2 < 0) {
                binarySearch2 = (-(binarySearch2 + 1)) - 1;
            }
            if (((AbstractC1823yB) arrayDeque.peek()).g() >= C1509rC.t(binarySearch2 + 1)) {
                break;
            } else {
                c1509rC2 = new C1509rC((AbstractC1823yB) arrayDeque.pop(), c1509rC2);
            }
        }
        arrayDeque.push(c1509rC2);
    }

    public int g() {
        int optInt = ((JSONObject) this.f9491l).optInt("media_type", -1);
        if (optInt != 0) {
            return optInt != 1 ? 3 : 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.Jo
    public void h(AbstractC0762ah abstractC0762ah) {
        Qk qk = (Qk) abstractC0762ah;
        synchronized (((Iq) this.f9491l)) {
            try {
                ((Iq) this.f9491l).f9636t = qk;
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8920w3)).booleanValue()) {
                    qk.f11242s.f11827a = ((Iq) this.f9491l).f9631o;
                }
                ((Iq) this.f9491l).f9636t.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List i(CharSequence charSequence) {
        charSequence.getClass();
        Iterator c5 = ((InterfaceC1760wu) this.f9491l).c(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            AbstractC1715vu abstractC1715vu = (AbstractC1715vu) c5;
            if (!abstractC1715vu.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) abstractC1715vu.next());
        }
    }

    @Override // com.google.android.gms.internal.ads.WF
    public int k(Object obj) {
        NF nf = (NF) obj;
        HashMap hashMap = YF.f12311a;
        nf.getClass();
        C1407p c1407p = (C1407p) this.f9491l;
        String str = c1407p.f14904m;
        String str2 = nf.f10789b;
        return ((str2.equals(str) || str2.equals(YF.a(c1407p))) && nf.i(c1407p, false)) ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.Jw
    /* renamed from: o */
    public void mo14o(Object obj) {
        C1174js c1174js = (C1174js) this.f9491l;
        synchronized (c1174js) {
            try {
                c1174js.f14180j.set(false);
                if (obj != null) {
                    C1219ks c1219ks = c1174js.i;
                    c1219ks.f14301e = c1219ks.f14297a;
                    c1219ks.f14299c = 0L;
                    c1174js.f14183m.set(true);
                    c1174js.o(obj);
                }
                c1174js.b(obj == null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Jw
    public void u(Throwable th) {
        C1174js c1174js = (C1174js) this.f9491l;
        synchronized (c1174js) {
            try {
                c1174js.f14180j.set(false);
                if ((th instanceof C1086hs) && ((C1086hs) th).f13811k == 0) {
                    throw null;
                }
                c1174js.b(true);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public /* synthetic */ Hq(OE oe, SD sd) {
        this.f9490k = 11;
        this.f9491l = sd;
    }

    public /* synthetic */ Hq(OE oe, Object obj, long j5) {
        this.f9490k = 12;
        this.f9491l = obj;
    }

    @Override // com.google.android.gms.internal.ads.Jo, com.google.android.gms.internal.ads.InterfaceC1452q
    /* renamed from: a */
    public void mo10a() {
        synchronized (((Iq) this.f9491l)) {
            ((Iq) this.f9491l).f9636t = null;
        }
    }

    public Hq(int i) {
        this.f9490k = i;
        switch (i) {
            case 15:
                this.f9491l = new CopyOnWriteArrayList();
                break;
            default:
                this.f9491l = new ArrayDeque();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ei
    /* renamed from: k, reason: collision with other method in class */
    public void mo13k(Object obj) {
        switch (this.f9490k) {
            case 2:
                Cr cr = (Cr) this.f9491l;
                ((Hr) obj).o((Dr) cr.f8091k, cr.f8092l);
                break;
            case 11:
                ((PE) obj).i((SD) this.f9491l);
                break;
            default:
                ((PE) obj).n();
                break;
        }
    }
}
