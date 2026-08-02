package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.os.RemoteException;
import android.os.SystemClock;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import s3.BinderC2361b;

/* loaded from: classes.dex */
public final class Mt implements InterfaceC1766x, InterfaceC0648Nd, InterfaceC0641Md, W2.c, Jw, Ei, P2.i, InterfaceC1887zm, InterfaceC1165jj {

    /* renamed from: m, reason: collision with root package name */
    public static Mt f10738m;

    /* renamed from: n, reason: collision with root package name */
    public static final Fz f10739n = new Fz(17);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10740k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f10741l;

    public /* synthetic */ Mt(int i, Object obj) {
        this.f10740k = i;
        this.f10741l = obj;
    }

    public static final Mt b(Context context) {
        Mt mt;
        synchronized (Mt.class) {
            try {
                if (f10738m == null) {
                    f10738m = new Mt(context);
                }
                mt = f10738m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mt;
    }

    public void D(boolean z3) {
        synchronized (Mt.class) {
            try {
                ((C1667ur) this.f10741l).g("paidv2_publisher_option", Boolean.valueOf(z3));
                if (!z3) {
                    ((C1667ur) this.f10741l).h("paidv2_creation_time");
                    ((C1667ur) this.f10741l).h("paidv2_id");
                    ((C1667ur) this.f10741l).h("vendor_scoped_gpid_v2_id");
                    ((C1667ur) this.f10741l).h("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean E() {
        boolean z3;
        synchronized (Mt.class) {
            z3 = ((SharedPreferences) ((C1667ur) this.f10741l).f15915m).getBoolean("paidv2_publisher_option", true);
        }
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0641Md
    /* renamed from: a */
    public void mo16a() {
        T2.G.m("Rejecting reference for JS Engine.");
        boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(F7.p7)).booleanValue();
        C1471qa c1471qa = (C1471qa) this.f10741l;
        if (booleanValue) {
            c1471qa.o("SdkJavascriptFactory.createNewReference.FailureCallback", new IllegalStateException("Unable to create JS engine reference."));
        } else {
            c1471qa.n();
        }
    }

    public AtomicReference d(String str) {
        synchronized (this) {
            try {
                if (!((HashMap) this.f10741l).containsKey(str)) {
                    ((HashMap) this.f10741l).put(str, new AtomicReference());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (AtomicReference) ((HashMap) this.f10741l).get(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1766x
    public long i(long j5) {
        K k5 = (K) this.f10741l;
        return Math.max(0L, Math.min((j5 * k5.f10093e) / 1000000, k5.f10096j - 1));
    }

    public void j(long j5, C1617tm c1617tm) {
        switch (this.f10740k) {
            case 3:
                AbstractC1803xs.j(j5, c1617tm, ((C1498r1) this.f10741l).f15218H);
                break;
            default:
                AbstractC1803xs.j(j5, c1617tm, (InterfaceC0737a0[]) ((C0905dr) this.f10741l).f13187m);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0648Nd, com.google.android.gms.internal.ads.Ei
    /* renamed from: k */
    public void mo13k(Object obj) {
        switch (this.f10740k) {
            case 7:
                C4.m mVar = (C4.m) this.f10741l;
                mVar.getClass();
                if (((C1068ha) obj).f13758k.S()) {
                    mVar.f908a = 1;
                    break;
                }
                break;
            case 17:
                Th th = (Th) obj;
                String message = ((C1121ij) this.f10741l).getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                th.q(AbstractC1803xs.I(12, message, null));
                break;
            case 18:
                ((InterfaceC1434pi) obj).D((C1428pc) this.f10741l);
                break;
            case 19:
                ((Bi) obj).y((C0789b7) this.f10741l);
                break;
            default:
                ((H9) obj).v0((C0575Dc) this.f10741l);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Jw
    /* renamed from: o */
    public void mo14o(Object obj) {
        switch (this.f10740k) {
            case 16:
                ((C1837yh) this.f10741l).f16453k.i();
                return;
            case 22:
                InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) obj;
                C0634Ld c0634Ld = (C0634Ld) this.f10741l;
                if (interfaceC0677Re == null) {
                    c0634Ld.c(new C0858co("Missing webview from video view future.", 1));
                    return;
                }
                interfaceC0677Re.s0("/video", new C1417p9(6, new C1354ns(4, c0634Ld)));
                interfaceC0677Re.X();
                return;
            case 24:
                String str = (String) obj;
                synchronized (this) {
                    Kl kl = (Kl) this.f10741l;
                    kl.f10230c = true;
                    P2.o.f4767B.f4776j.getClass();
                    kl.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - ((Kl) this.f10741l).f10231d), "", true);
                    ((Kl) this.f10741l).i.execute(new Kw(27, this, str));
                }
                return;
            default:
                ((AbstractC0579Dg) obj).a();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1887zm
    public E3.a p(C1428pc c1428pc) {
        C1572sm c1572sm = (C1572sm) ((C0905dr) this.f10741l).f13187m;
        String str = c1428pc.f15002r;
        synchronized (c1572sm.f15169l) {
            try {
                int i = c1572sm.f15599r;
                if (i != 1 && i != 3) {
                    return AbstractC1400ot.Z(new C1797xm(2));
                }
                if (c1572sm.f15170m) {
                    return c1572sm.f15168k;
                }
                c1572sm.f15599r = 3;
                c1572sm.f15170m = true;
                c1572sm.f15598q = str;
                c1572sm.f15173p.n();
                C0634Ld c0634Ld = c1572sm.f15168k;
                c0634Ld.f10334k.a(new RunnableC1527rm(c1572sm, 1), AbstractC0613Id.f9544g);
                return c1572sm.f15168k;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // P2.i
    public void q() {
        C1344ni c1344ni = ((Wk) this.f10741l).f12073g;
        synchronized (c1344ni) {
            try {
                if (c1344ni.f14688s) {
                    return;
                }
                ScheduledFuture scheduledFuture = c1344ni.f14689t;
                if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                    c1344ni.f14686q = -1L;
                } else {
                    c1344ni.f14689t.cancel(false);
                    long j5 = c1344ni.f14684o;
                    c1344ni.f14683n.getClass();
                    c1344ni.f14686q = j5 - SystemClock.elapsedRealtime();
                }
                ScheduledFuture scheduledFuture2 = c1344ni.f14690u;
                if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                    c1344ni.f14687r = -1L;
                } else {
                    c1344ni.f14690u.cancel(false);
                    long j6 = c1344ni.f14685p;
                    c1344ni.f14683n.getClass();
                    c1344ni.f14687r = j6 - SystemClock.elapsedRealtime();
                }
                c1344ni.f14688s = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Jw
    public void u(Throwable th) {
        switch (this.f10740k) {
            case 16:
                return;
            case 22:
                U2.j.f("Failed to load media data due to video view load failure.");
                ((C0634Ld) this.f10741l).c(th);
                return;
            case 24:
                synchronized (this) {
                    Kl kl = (Kl) this.f10741l;
                    kl.f10230c = true;
                    P2.o.f4767B.f4776j.getClass();
                    kl.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - ((Kl) this.f10741l).f10231d), "Internal Error.", false);
                    ((Kl) this.f10741l).f10232e.c(new Exception());
                }
                return;
            default:
                Gn gn = (Gn) this.f10741l;
                C0387u0 s2 = AbstractC1803xs.s(th, ((C1253lh) gn.f9260a.f8972H0.d()).f14401l);
                gn.f9263d.l0(s2);
                AbstractC1668us.D(s2.f5058k, "DelayedBannerAd.onFailure", th);
                return;
        }
    }

    @Override // W2.c
    public void w(J2.b bVar) {
        switch (this.f10740k) {
            case 9:
                try {
                    ((InterfaceC1024gb) this.f10741l).q(bVar.m());
                    break;
                } catch (RemoteException e3) {
                    U2.j.g("", e3);
                    return;
                }
            default:
                try {
                    ((InterfaceC1202kb) this.f10741l).q(bVar.m());
                    break;
                } catch (RemoteException e5) {
                    U2.j.g("", e5);
                }
        }
    }

    @Override // P2.i
    public void y() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        C1344ni c1344ni = ((Wk) this.f10741l).f12073g;
        synchronized (c1344ni) {
            try {
                if (c1344ni.f14688s) {
                    if (c1344ni.f14686q > 0 && (scheduledFuture2 = c1344ni.f14689t) != null && scheduledFuture2.isCancelled()) {
                        c1344ni.r1(c1344ni.f14686q);
                    }
                    if (c1344ni.f14687r > 0 && (scheduledFuture = c1344ni.f14690u) != null && scheduledFuture.isCancelled()) {
                        c1344ni.s1(c1344ni.f14687r);
                    }
                    c1344ni.f14688s = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1165jj
    public void z(boolean z3, Context context, Sh sh) {
        Object obj = ((C1394on) this.f10741l).f14849b;
        try {
            ((C0950er) obj).b(z3);
            try {
                ((C0950er) obj).f13363a.y1(new BinderC2361b(context));
            } catch (Throwable th) {
                throw new Yq(th);
            }
        } catch (Yq e3) {
            throw new C1121ij(e3.getCause());
        }
    }

    public Mt(int i) {
        this.f10740k = i;
        switch (i) {
            case 6:
                this.f10741l = new HashMap();
                break;
            case 11:
                this.f10741l = new WeakHashMap();
                break;
            case 12:
                AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
                int i5 = AbstractC1260lo.f14419a;
                if (i5 >= 29) {
                    usage.setAllowedCapturePolicy(1);
                }
                if (i5 >= 32) {
                    usage.setSpatializationBehavior(0);
                }
                this.f10741l = usage.build();
                break;
            default:
                C1285mC c1285mC = C1285mC.f14484c;
                Qs qs = new Qs(4, new InterfaceC0972fC[]{C1543s1.f15414u, f10739n});
                Charset charset = VB.f11871a;
                this.f10741l = qs;
                break;
        }
    }

    public Mt(Context context) {
        this.f10740k = 0;
        if (C1667ur.f15912n == null) {
            C1667ur.f15912n = new C1667ur(context, 4);
        }
        this.f10741l = C1667ur.f15912n;
    }

    public Mt(byte[] bArr) {
        this.f10740k = 5;
        this.f10741l = new byte[256];
        for (int i = 0; i < 256; i++) {
            ((byte[]) this.f10741l)[i] = (byte) i;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < 256; i6++) {
            byte[] bArr2 = (byte[]) this.f10741l;
            byte b3 = bArr2[i6];
            i5 = (i5 + b3 + bArr[i6 % bArr.length]) & 255;
            bArr2[i6] = bArr2[i5];
            bArr2[i5] = b3;
        }
    }

    private final void C(Throwable th) {
    }
}
