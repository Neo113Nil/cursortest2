package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class WD implements InterfaceC1422pE {

    /* renamed from: a, reason: collision with root package name */
    public final C1425pH f12027a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12028b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12029c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12030d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12031e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f12032g;

    /* renamed from: h, reason: collision with root package name */
    public long f12033h;

    public WD() {
        C1425pH c1425pH = new C1425pH();
        j(2500, 0, "bufferForPlaybackMs", "0");
        j(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        j(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        j(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        j(50000, 50000, "maxBufferMs", "minBufferMs");
        j(0, 0, "backBufferDurationMs", "0");
        this.f12027a = c1425pH;
        long s2 = AbstractC1260lo.s(50000L);
        this.f12028b = s2;
        this.f12029c = s2;
        this.f12030d = AbstractC1260lo.s(2500L);
        this.f12031e = AbstractC1260lo.s(5000L);
        this.f = AbstractC1260lo.s(0L);
        this.f12032g = new HashMap();
        this.f12033h = -1L;
    }

    public static void j(int i, int i5, String str, String str2) {
        AbstractC1668us.W(AbstractC0467k.v(str, " cannot be less than ", str2), i >= i5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1422pE
    public final boolean a(C1377oE c1377oE) {
        int i;
        VD vd = (VD) this.f12032g.get(c1377oE.f14786a);
        vd.getClass();
        C1425pH c1425pH = this.f12027a;
        synchronized (c1425pH) {
            i = c1425pH.f14989b * 65536;
        }
        int i5 = i();
        float f = c1377oE.f14788c;
        long j5 = this.f12029c;
        long j6 = this.f12028b;
        if (f > 1.0f) {
            j6 = Math.min(AbstractC1260lo.r(f, j6), j5);
        }
        long max = Math.max(j6, 500000L);
        long j7 = c1377oE.f14787b;
        if (j7 < max) {
            boolean z3 = i < i5;
            vd.f11874a = z3;
            if (!z3 && j7 < 500000) {
                JB.l("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j7 >= j5 || i >= i5) {
            vd.f11874a = false;
        }
        return vd.f11874a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1422pE
    public final void b(ZE ze) {
        long id = Thread.currentThread().getId();
        long j5 = this.f12033h;
        boolean z3 = true;
        if (j5 != -1 && j5 != id) {
            z3 = false;
        }
        if (!z3) {
            throw new IllegalStateException("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        }
        this.f12033h = id;
        HashMap hashMap = this.f12032g;
        if (!hashMap.containsKey(ze)) {
            hashMap.put(ze, new VD());
        }
        VD vd = (VD) hashMap.get(ze);
        vd.getClass();
        vd.f11875b = 13107200;
        vd.f11874a = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1422pE
    public final void c(ZE ze) {
        if (this.f12032g.remove(ze) != null) {
            boolean isEmpty = this.f12032g.isEmpty();
            C1425pH c1425pH = this.f12027a;
            if (!isEmpty) {
                c1425pH.a(i());
            } else {
                synchronized (c1425pH) {
                    c1425pH.a(0);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1422pE
    public final long d() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1422pE
    public final boolean e() {
        Iterator it = this.f12032g.values().iterator();
        while (it.hasNext()) {
            if (((VD) it.next()).f11874a) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1422pE
    public final void f(C1377oE c1377oE, InterfaceC1200kH[] interfaceC1200kHArr) {
        VD vd = (VD) this.f12032g.get(c1377oE.f14786a);
        vd.getClass();
        int length = interfaceC1200kHArr.length;
        int i = 0;
        int i5 = 0;
        while (true) {
            int i6 = 13107200;
            if (i >= length) {
                break;
            }
            InterfaceC1200kH interfaceC1200kH = interfaceC1200kHArr[i];
            if (interfaceC1200kH != null) {
                int i7 = interfaceC1200kH.f().f14497c;
                if (i7 != -1) {
                    if (i7 == 0) {
                        i6 = 144310272;
                    } else if (i7 != 1) {
                        i6 = i7 != 2 ? 131072 : 131072000;
                    }
                }
                i5 += i6;
            }
            i++;
        }
        vd.f11875b = Math.max(13107200, i5);
        boolean isEmpty = this.f12032g.isEmpty();
        C1425pH c1425pH = this.f12027a;
        if (!isEmpty) {
            c1425pH.a(i());
        } else {
            synchronized (c1425pH) {
                c1425pH.a(0);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1422pE
    public final boolean g(C1377oE c1377oE) {
        int i;
        boolean z3 = c1377oE.f14789d;
        long j5 = c1377oE.f14787b;
        float f = c1377oE.f14788c;
        int i5 = AbstractC1260lo.f14419a;
        if (f != 1.0f) {
            j5 = Math.round(j5 / f);
        }
        long j6 = z3 ? this.f12031e : this.f12030d;
        long j7 = c1377oE.f14790e;
        if (j7 != -9223372036854775807L) {
            j6 = Math.min(j7 / 2, j6);
        }
        if (j6 <= 0 || j5 >= j6) {
            return true;
        }
        C1425pH c1425pH = this.f12027a;
        synchronized (c1425pH) {
            i = c1425pH.f14989b * 65536;
        }
        return i >= i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1422pE
    public final void h(ZE ze) {
        if (this.f12032g.remove(ze) != null) {
            boolean isEmpty = this.f12032g.isEmpty();
            C1425pH c1425pH = this.f12027a;
            if (isEmpty) {
                synchronized (c1425pH) {
                    c1425pH.a(0);
                }
            } else {
                c1425pH.a(i());
            }
        }
        if (this.f12032g.isEmpty()) {
            this.f12033h = -1L;
        }
    }

    public final int i() {
        Iterator it = this.f12032g.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((VD) it.next()).f11875b;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1422pE
    public final C1425pH k() {
        return this.f12027a;
    }
}
