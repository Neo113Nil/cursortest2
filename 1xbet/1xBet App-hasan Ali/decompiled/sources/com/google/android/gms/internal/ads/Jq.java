package com.google.android.gms.internal.ads;

import Q2.InterfaceC0383s0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class Jq extends E5 {

    /* renamed from: k, reason: collision with root package name */
    public final Fq f10070k;

    /* renamed from: l, reason: collision with root package name */
    public final Bq f10071l;

    /* renamed from: m, reason: collision with root package name */
    public final Tq f10072m;

    /* renamed from: n, reason: collision with root package name */
    public Qk f10073n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10074o;

    public Jq(Fq fq, Bq bq, Tq tq) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        this.f10074o = false;
        this.f10070k = fq;
        this.f10071l = bq;
        this.f10072m = tq;
    }

    public final synchronized void V0(InterfaceC2360a interfaceC2360a) {
        m3.v.c("pause must be called on the main UI thread.");
        if (this.f10073n != null) {
            Context context = interfaceC2360a == null ? null : (Context) BinderC2361b.t1(interfaceC2360a);
            Xh xh = this.f10073n.f12694c;
            xh.getClass();
            xh.n1(new Ms(context, 1));
        }
    }

    public final synchronized void W1(InterfaceC2360a interfaceC2360a) {
        m3.v.c("destroy must be called on the main UI thread.");
        Context context = null;
        this.f10071l.f7894l.set(null);
        if (this.f10073n != null) {
            if (interfaceC2360a != null) {
                context = (Context) BinderC2361b.t1(interfaceC2360a);
            }
            Xh xh = this.f10073n.f12694c;
            xh.getClass();
            xh.n1(new E7(context, 1));
        }
    }

    public final synchronized InterfaceC0383s0 i() {
        Qk qk;
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.q6)).booleanValue() && (qk = this.f10073n) != null) {
            return qk.f;
        }
        return null;
    }

    public final synchronized void m2(InterfaceC2360a interfaceC2360a) {
        m3.v.c("resume must be called on the main UI thread.");
        if (this.f10073n != null) {
            Context context = interfaceC2360a == null ? null : (Context) BinderC2361b.t1(interfaceC2360a);
            Xh xh = this.f10073n.f12694c;
            xh.getClass();
            xh.n1(new C1864z7(context, false));
        }
    }

    public final synchronized void s() {
        y3(null);
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        Q2.N n5;
        InterfaceC0677Re interfaceC0677Re;
        int i5 = 0;
        if (i == 1) {
            C1877zc c1877zc = (C1877zc) F5.a(parcel, C1877zc.CREATOR);
            F5.b(parcel);
            v3(c1877zc);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            s();
            parcel2.writeNoException();
            return true;
        }
        D5 d5 = null;
        if (i == 3) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                d5 = queryLocalInterface instanceof C1832yc ? (C1832yc) queryLocalInterface : new C1832yc(readStrongBinder);
            }
            F5.b(parcel);
            m3.v.c("setRewardedVideoAdListener can only be called from the UI thread.");
            this.f10071l.f7897o.set(d5);
            parcel2.writeNoException();
            return true;
        }
        if (i == 34) {
            boolean f = F5.f(parcel);
            F5.b(parcel);
            synchronized (this) {
                m3.v.c("setImmersiveMode must be called on the main UI thread.");
                this.f10074o = f;
            }
            parcel2.writeNoException();
            return true;
        }
        switch (i) {
            case 5:
                m3.v.c("isLoaded must be called on the main UI thread.");
                boolean z3 = z3();
                parcel2.writeNoException();
                ClassLoader classLoader = F5.f8654a;
                parcel2.writeInt(z3 ? 1 : 0);
                return true;
            case 6:
                V0(null);
                parcel2.writeNoException();
                return true;
            case 7:
                m2(null);
                parcel2.writeNoException();
                return true;
            case 8:
                W1(null);
                parcel2.writeNoException();
                return true;
            case 9:
                InterfaceC2360a h1 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                V0(h1);
                parcel2.writeNoException();
                return true;
            case 10:
                InterfaceC2360a h12 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                m2(h12);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC2360a h13 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                W1(h13);
                parcel2.writeNoException();
                return true;
            case 12:
                String u32 = u3();
                parcel2.writeNoException();
                parcel2.writeString(u32);
                return true;
            case 13:
                String readString = parcel.readString();
                F5.b(parcel);
                x3(readString);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    n5 = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    n5 = queryLocalInterface2 instanceof Q2.N ? (Q2.N) queryLocalInterface2 : new Q2.N(readStrongBinder2, "com.google.android.gms.ads.internal.client.IAdMetadataListener", 0);
                }
                F5.b(parcel);
                m3.v.c("setAdMetadataListener can only be called from the UI thread.");
                Bq bq = this.f10071l;
                if (n5 == null) {
                    bq.f7894l.set(null);
                } else {
                    bq.f7894l.set(new Gq(this, n5, 1));
                }
                parcel2.writeNoException();
                return true;
            case 15:
                m3.v.c("getAdMetadata can only be called from the UI thread.");
                Qk qk = this.f10073n;
                Bundle b3 = qk != null ? qk.b() : new Bundle();
                parcel2.writeNoException();
                F5.d(parcel2, b3);
                return true;
            case 16:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                    d5 = queryLocalInterface3 instanceof C1742wc ? (C1742wc) queryLocalInterface3 : new C1742wc(readStrongBinder3, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener", 0);
                }
                F5.b(parcel);
                m3.v.c("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
                this.f10071l.f7899q.set(d5);
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.readString();
                F5.b(parcel);
                parcel2.writeNoException();
                return true;
            case 18:
                InterfaceC2360a h14 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                y3(h14);
                parcel2.writeNoException();
                return true;
            case 19:
                String readString2 = parcel.readString();
                F5.b(parcel);
                w3(readString2);
                parcel2.writeNoException();
                return true;
            case 20:
                Qk qk2 = this.f10073n;
                if (qk2 != null && (interfaceC0677Re = (InterfaceC0677Re) qk2.f11234k.get()) != null && !interfaceC0677Re.F0()) {
                    i5 = 1;
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = F5.f8654a;
                parcel2.writeInt(i5);
                return true;
            case C1639u7.zzm /* 21 */:
                InterfaceC0383s0 i6 = i();
                parcel2.writeNoException();
                F5.e(parcel2, i6);
                return true;
            default:
                return false;
        }
    }

    public final synchronized String u3() {
        Ih ih;
        Qk qk = this.f10073n;
        if (qk == null || (ih = qk.f) == null) {
            return null;
        }
        return ih.f9590k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (((java.lang.Boolean) Q2.r.f5053d.f5056c.a(com.google.android.gms.internal.ads.F7.h5)).booleanValue() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (java.util.regex.Pattern.matches(r1, r0) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void v3(C1877zc c1877zc) {
        m3.v.c("loadAd must be called on the main UI thread.");
        String str = c1877zc.f16609l;
        String str2 = (String) Q2.r.f5053d.f5056c.a(F7.f5);
        if (str2 != null && str != null) {
            try {
            } catch (RuntimeException e3) {
                P2.o.f4767B.f4774g.i("NonagonUtil.isPatternMatched", e3);
            }
        }
        if (z3()) {
        }
        Cq cq = new Cq();
        this.f10073n = null;
        Fq fq = this.f10070k;
        fq.f9133h.f11955o.f17003l = 1;
        fq.a(c1877zc.f16608k, c1877zc.f16609l, cq, new Dp(2, this));
    }

    public final synchronized void w3(String str) {
        m3.v.c("#008 Must be called on the main UI thread.: setCustomData");
        this.f10072m.f11694b = str;
    }

    public final synchronized void x3(String str) {
        m3.v.c("setUserId must be called on the main UI thread.");
        this.f10072m.f11693a = str;
    }

    public final synchronized void y3(InterfaceC2360a interfaceC2360a) {
        try {
            m3.v.c("showAd must be called on the main UI thread.");
            if (this.f10073n != null) {
                Activity activity = null;
                if (interfaceC2360a != null) {
                    Object t12 = BinderC2361b.t1(interfaceC2360a);
                    if (t12 instanceof Activity) {
                        activity = (Activity) t12;
                    }
                }
                this.f10073n.c(activity, this.f10074o);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean z3() {
        Qk qk = this.f10073n;
        if (qk != null) {
            if (!qk.f11239p.f14127l.get()) {
                return true;
            }
        }
        return false;
    }
}
