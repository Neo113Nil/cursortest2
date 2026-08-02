package com.google.android.gms.internal.ads;

import android.media.metrics.PlaybackMetrics;
import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes.dex */
public final class UE {

    /* renamed from: h, reason: collision with root package name */
    public static final Random f11760h = new Random();

    /* renamed from: d, reason: collision with root package name */
    public XE f11764d;
    public String f;

    /* renamed from: a, reason: collision with root package name */
    public final C0603Ha f11761a = new C0603Ha();

    /* renamed from: b, reason: collision with root package name */
    public final C1785xa f11762b = new C1785xa();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f11763c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public AbstractC0715Xa f11765e = AbstractC0715Xa.f12197a;

    /* renamed from: g, reason: collision with root package name */
    public long f11766g = -1;

    public final synchronized String a(AbstractC0715Xa abstractC0715Xa, C1603tG c1603tG) {
        return e(abstractC0715Xa.n(c1603tG.f15679a, this.f11762b).f16290c, c1603tG).f11636a;
    }

    public final synchronized void b(OE oe) {
        XE xe;
        try {
            String str = this.f;
            if (str != null) {
                TE te = (TE) this.f11763c.get(str);
                if (te == null) {
                    throw null;
                }
                f(te);
            }
            Iterator it = this.f11763c.values().iterator();
            while (it.hasNext()) {
                TE te2 = (TE) it.next();
                it.remove();
                if (te2.f11640e && (xe = this.f11764d) != null) {
                    xe.c(oe, te2.f11636a);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x000f, B:13:0x0013, B:15:0x0021, B:18:0x002d, B:20:0x0033, B:22:0x003f, B:24:0x0045, B:27:0x0028, B:28:0x004f, B:30:0x005b, B:31:0x005f, B:33:0x0064, B:35:0x006a, B:37:0x007f, B:38:0x00a9, B:40:0x00ad, B:41:0x00af, B:43:0x00b9, B:45:0x00bd, B:47:0x00ca, B:52:0x00d1, B:54:0x00f0), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void c(OE oe) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        long j5;
        try {
            if (this.f11764d == null) {
                throw null;
            }
            if (!oe.f10942b.o()) {
                C1603tG c1603tG = oe.f10944d;
                if (c1603tG != null) {
                    TE te = (TE) this.f11763c.get(this.f);
                    if (te != null) {
                        j5 = te.f11638c;
                        if (j5 != -1) {
                            if (c1603tG.f15682d >= j5) {
                                TE te2 = (TE) this.f11763c.get(this.f);
                                if (te2 == null) {
                                    if (te2.f11638c != -1) {
                                        if (te2.f11637b == oe.f10943c) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j5 = this.f11766g + 1;
                    if (c1603tG.f15682d >= j5) {
                    }
                }
                TE e3 = e(oe.f10943c, oe.f10944d);
                if (this.f == null) {
                    this.f = e3.f11636a;
                }
                C1603tG c1603tG2 = oe.f10944d;
                if (c1603tG2 != null && c1603tG2.b()) {
                    Object obj = c1603tG2.f15679a;
                    TE e5 = e(oe.f10943c, new C1603tG(c1603tG2.f15680b, c1603tG2.f15682d, obj));
                    if (!e5.f11640e) {
                        e5.f11640e = true;
                        AbstractC0715Xa abstractC0715Xa = oe.f10942b;
                        C1603tG c1603tG3 = oe.f10944d;
                        abstractC0715Xa.n(c1603tG3.f15679a, this.f11762b);
                        C1785xa c1785xa = this.f11762b;
                        c1785xa.f.a(oe.f10944d.f15680b).getClass();
                        Math.max(0L, AbstractC1260lo.v(0L) + AbstractC1260lo.v(0L));
                    }
                }
                if (!e3.f11640e) {
                    e3.f11640e = true;
                }
                if (e3.f11636a.equals(this.f) && !e3.f) {
                    e3.f = true;
                    XE xe = this.f11764d;
                    String str = e3.f11636a;
                    xe.getClass();
                    C1603tG c1603tG4 = oe.f10944d;
                    if (c1603tG4 == null || !c1603tG4.b()) {
                        xe.f();
                        xe.f12183s = str;
                        playerName = WE.k().setPlayerName("AndroidXMedia3");
                        playerVersion = playerName.setPlayerVersion("1.5.0-beta01");
                        xe.f12184t = playerVersion;
                        xe.g(oe.f10942b, oe.f10944d);
                    }
                }
            }
        } finally {
        }
    }

    public final synchronized void d(OE oe, int i) {
        try {
            if (this.f11764d == null) {
                throw null;
            }
            Iterator it = this.f11763c.values().iterator();
            while (it.hasNext()) {
                TE te = (TE) it.next();
                if (te.a(oe)) {
                    it.remove();
                    if (te.f11640e) {
                        if (te.f11636a.equals(this.f)) {
                            f(te);
                        }
                        this.f11764d.c(oe, te.f11636a);
                    }
                }
            }
            g(oe);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if (r13 != (-1)) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TE e(int i, C1603tG c1603tG) {
        long j5;
        long j6;
        long j7;
        HashMap hashMap = this.f11763c;
        long j8 = Long.MAX_VALUE;
        TE te = null;
        for (TE te2 : hashMap.values()) {
            if (te2.f11638c == -1 && i == te2.f11637b && c1603tG != null) {
                UE ue = te2.f11641g;
                TE te3 = (TE) ue.f11763c.get(ue.f);
                if (te3 != null) {
                    j7 = te3.f11638c;
                }
                j7 = 1 + ue.f11766g;
                long j9 = c1603tG.f15682d;
                if (j9 >= j7) {
                    te2.f11638c = j9;
                }
            }
            C1603tG c1603tG2 = te2.f11639d;
            if (c1603tG != null) {
                long j10 = c1603tG.f15682d;
                if (c1603tG2 != null) {
                    j5 = -1;
                    if (j10 == c1603tG2.f15682d && c1603tG.f15680b == c1603tG2.f15680b && c1603tG.f15681c == c1603tG2.f15681c) {
                        j6 = te2.f11638c;
                        if (j6 == j5) {
                        }
                        te = te2;
                        j8 = j6;
                    }
                } else if (!c1603tG.b()) {
                    j5 = -1;
                    if (j10 == te2.f11638c) {
                        j6 = te2.f11638c;
                        if (j6 == j5) {
                        }
                        te = te2;
                        j8 = j6;
                    }
                }
            } else if (i == te2.f11637b) {
                j5 = -1;
                j6 = te2.f11638c;
                if (j6 == j5 || j6 < j8) {
                    te = te2;
                    j8 = j6;
                } else if (j6 == j8) {
                    int i5 = AbstractC1260lo.f14419a;
                    if (te.f11639d != null && c1603tG2 != null) {
                        te = te2;
                    }
                }
            }
        }
        if (te != null) {
            return te;
        }
        byte[] bArr = new byte[12];
        f11760h.nextBytes(bArr);
        String encodeToString = Base64.encodeToString(bArr, 10);
        TE te4 = new TE(this, encodeToString, i, c1603tG);
        hashMap.put(encodeToString, te4);
        return te4;
    }

    public final void f(TE te) {
        long j5 = te.f11638c;
        if (j5 != -1) {
            this.f11766g = j5;
        }
        this.f = null;
    }

    public final void g(OE oe) {
        C1603tG c1603tG;
        boolean o5 = oe.f10942b.o();
        HashMap hashMap = this.f11763c;
        if (o5) {
            String str = this.f;
            if (str != null) {
                TE te = (TE) hashMap.get(str);
                te.getClass();
                f(te);
                return;
            }
            return;
        }
        TE te2 = (TE) hashMap.get(this.f);
        int i = oe.f10943c;
        C1603tG c1603tG2 = oe.f10944d;
        this.f = e(i, c1603tG2).f11636a;
        c(oe);
        if (c1603tG2 == null || !c1603tG2.b()) {
            return;
        }
        long j5 = c1603tG2.f15682d;
        if (te2 != null && te2.f11638c == j5 && (c1603tG = te2.f11639d) != null && c1603tG.f15680b == c1603tG2.f15680b && c1603tG.f15681c == c1603tG2.f15681c) {
            return;
        }
        e(i, new C1603tG(c1603tG2.f15679a, j5));
    }
}
