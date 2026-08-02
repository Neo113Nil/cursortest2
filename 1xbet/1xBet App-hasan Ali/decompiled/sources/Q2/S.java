package Q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC0605Hc;
import com.google.android.gms.internal.ads.AbstractBinderC0625Kb;
import com.google.android.gms.internal.ads.AbstractBinderC1518rd;
import com.google.android.gms.internal.ads.BinderC0857cn;
import com.google.android.gms.internal.ads.C0582Eb;
import com.google.android.gms.internal.ads.C0598Gc;
import com.google.android.gms.internal.ads.C0618Jb;
import com.google.android.gms.internal.ads.C1474qd;
import com.google.android.gms.internal.ads.D5;
import com.google.android.gms.internal.ads.F5;
import com.google.android.gms.internal.ads.InterfaceC0590Fb;
import com.google.android.gms.internal.ads.InterfaceC0612Ic;
import com.google.android.gms.internal.ads.InterfaceC0624Ka;
import com.google.android.gms.internal.ads.InterfaceC0632Lb;
import com.google.android.gms.internal.ads.InterfaceC1563sd;
import com.google.android.gms.internal.ads.K8;
import com.google.android.gms.internal.ads.L8;
import com.google.android.gms.internal.ads.N8;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class S extends D5 implements T {
    @Override // Q2.T
    public final K A2(InterfaceC2360a interfaceC2360a, a1 a1Var, String str, InterfaceC0624Ka interfaceC0624Ka, int i) {
        K i5;
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        F5.c(N5, a1Var);
        N5.writeString(str);
        F5.e(N5, interfaceC0624Ka);
        N5.writeInt(244410000);
        Parcel Y4 = Y(N5, 1);
        IBinder readStrongBinder = Y4.readStrongBinder();
        if (readStrongBinder == null) {
            i5 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            i5 = queryLocalInterface instanceof K ? (K) queryLocalInterface : new I(readStrongBinder);
        }
        Y4.recycle();
        return i5;
    }

    @Override // Q2.T
    public final G B0(InterfaceC2360a interfaceC2360a, String str, InterfaceC0624Ka interfaceC0624Ka, int i) {
        G e3;
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        N5.writeString(str);
        F5.e(N5, interfaceC0624Ka);
        N5.writeInt(244410000);
        Parcel Y4 = Y(N5, 3);
        IBinder readStrongBinder = Y4.readStrongBinder();
        if (readStrongBinder == null) {
            e3 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            e3 = queryLocalInterface instanceof G ? (G) queryLocalInterface : new E(readStrongBinder);
        }
        Y4.recycle();
        return e3;
    }

    @Override // Q2.T
    public final InterfaceC0352c0 E0(InterfaceC2360a interfaceC2360a, int i) {
        InterfaceC0352c0 c0348a0;
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        N5.writeInt(244410000);
        Parcel Y4 = Y(N5, 9);
        IBinder readStrongBinder = Y4.readStrongBinder();
        if (readStrongBinder == null) {
            c0348a0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            c0348a0 = queryLocalInterface instanceof InterfaceC0352c0 ? (InterfaceC0352c0) queryLocalInterface : new C0348a0(readStrongBinder);
        }
        Y4.recycle();
        return c0348a0;
    }

    @Override // Q2.T
    public final K F2(InterfaceC2360a interfaceC2360a, a1 a1Var, String str, int i) {
        K i5;
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        F5.c(N5, a1Var);
        N5.writeString(str);
        N5.writeInt(244410000);
        Parcel Y4 = Y(N5, 10);
        IBinder readStrongBinder = Y4.readStrongBinder();
        if (readStrongBinder == null) {
            i5 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            i5 = queryLocalInterface instanceof K ? (K) queryLocalInterface : new I(readStrongBinder);
        }
        Y4.recycle();
        return i5;
    }

    @Override // Q2.T
    public final K J1(InterfaceC2360a interfaceC2360a, a1 a1Var, String str, InterfaceC0624Ka interfaceC0624Ka, int i) {
        K i5;
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        F5.c(N5, a1Var);
        N5.writeString(str);
        F5.e(N5, interfaceC0624Ka);
        N5.writeInt(244410000);
        Parcel Y4 = Y(N5, 2);
        IBinder readStrongBinder = Y4.readStrongBinder();
        if (readStrongBinder == null) {
            i5 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            i5 = queryLocalInterface instanceof K ? (K) queryLocalInterface : new I(readStrongBinder);
        }
        Y4.recycle();
        return i5;
    }

    @Override // Q2.T
    public final K J2(InterfaceC2360a interfaceC2360a, a1 a1Var, String str, InterfaceC0624Ka interfaceC0624Ka, int i) {
        K i5;
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        F5.c(N5, a1Var);
        N5.writeString(str);
        F5.e(N5, interfaceC0624Ka);
        N5.writeInt(244410000);
        Parcel Y4 = Y(N5, 13);
        IBinder readStrongBinder = Y4.readStrongBinder();
        if (readStrongBinder == null) {
            i5 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            i5 = queryLocalInterface instanceof K ? (K) queryLocalInterface : new I(readStrongBinder);
        }
        Y4.recycle();
        return i5;
    }

    @Override // Q2.T
    public final InterfaceC0378p0 N1(InterfaceC2360a interfaceC2360a, InterfaceC0624Ka interfaceC0624Ka, int i) {
        InterfaceC0378p0 c0376o0;
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        F5.e(N5, interfaceC0624Ka);
        N5.writeInt(244410000);
        Parcel Y4 = Y(N5, 17);
        IBinder readStrongBinder = Y4.readStrongBinder();
        if (readStrongBinder == null) {
            c0376o0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            c0376o0 = queryLocalInterface instanceof InterfaceC0378p0 ? (InterfaceC0378p0) queryLocalInterface : new C0376o0(readStrongBinder);
        }
        Y4.recycle();
        return c0376o0;
    }

    @Override // Q2.T
    public final InterfaceC0632Lb Q(InterfaceC2360a interfaceC2360a) {
        InterfaceC0632Lb c0618Jb;
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        Parcel Y4 = Y(N5, 8);
        IBinder readStrongBinder = Y4.readStrongBinder();
        int i = AbstractBinderC0625Kb.f10151k;
        if (readStrongBinder == null) {
            c0618Jb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            c0618Jb = queryLocalInterface instanceof InterfaceC0632Lb ? (InterfaceC0632Lb) queryLocalInterface : new C0618Jb(readStrongBinder);
        }
        Y4.recycle();
        return c0618Jb;
    }

    @Override // Q2.T
    public final N8 k2(InterfaceC2360a interfaceC2360a, InterfaceC2360a interfaceC2360a2) {
        N8 k8;
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        F5.e(N5, interfaceC2360a2);
        Parcel Y4 = Y(N5, 5);
        IBinder readStrongBinder = Y4.readStrongBinder();
        int i = L8.f10326k;
        if (readStrongBinder == null) {
            k8 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            k8 = queryLocalInterface instanceof N8 ? (N8) queryLocalInterface : new K8(readStrongBinder);
        }
        Y4.recycle();
        return k8;
    }

    @Override // Q2.T
    public final InterfaceC0612Ic q1(InterfaceC2360a interfaceC2360a, String str, InterfaceC0624Ka interfaceC0624Ka, int i) {
        InterfaceC0612Ic c0598Gc;
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        N5.writeString(str);
        F5.e(N5, interfaceC0624Ka);
        N5.writeInt(244410000);
        Parcel Y4 = Y(N5, 12);
        IBinder readStrongBinder = Y4.readStrongBinder();
        int i5 = AbstractBinderC0605Hc.f9408k;
        if (readStrongBinder == null) {
            c0598Gc = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            c0598Gc = queryLocalInterface instanceof InterfaceC0612Ic ? (InterfaceC0612Ic) queryLocalInterface : new C0598Gc(readStrongBinder);
        }
        Y4.recycle();
        return c0598Gc;
    }

    @Override // Q2.T
    public final InterfaceC0590Fb v1(InterfaceC2360a interfaceC2360a, InterfaceC0624Ka interfaceC0624Ka, int i) {
        InterfaceC0590Fb c0582Eb;
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        F5.e(N5, interfaceC0624Ka);
        N5.writeInt(244410000);
        Parcel Y4 = Y(N5, 15);
        IBinder readStrongBinder = Y4.readStrongBinder();
        int i5 = BinderC0857cn.f13036r;
        if (readStrongBinder == null) {
            c0582Eb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            c0582Eb = queryLocalInterface instanceof InterfaceC0590Fb ? (InterfaceC0590Fb) queryLocalInterface : new C0582Eb(readStrongBinder);
        }
        Y4.recycle();
        return c0582Eb;
    }

    @Override // Q2.T
    public final InterfaceC1563sd y0(InterfaceC2360a interfaceC2360a, InterfaceC0624Ka interfaceC0624Ka, int i) {
        InterfaceC1563sd c1474qd;
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        F5.e(N5, interfaceC0624Ka);
        N5.writeInt(244410000);
        Parcel Y4 = Y(N5, 14);
        IBinder readStrongBinder = Y4.readStrongBinder();
        int i5 = AbstractBinderC1518rd.f15320k;
        if (readStrongBinder == null) {
            c1474qd = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            c1474qd = queryLocalInterface instanceof InterfaceC1563sd ? (InterfaceC1563sd) queryLocalInterface : new C1474qd(readStrongBinder);
        }
        Y4.recycle();
        return c1474qd;
    }
}
