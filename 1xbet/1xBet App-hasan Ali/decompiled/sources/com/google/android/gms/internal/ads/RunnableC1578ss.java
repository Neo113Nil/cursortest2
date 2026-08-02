package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.Optional;

/* renamed from: com.google.android.gms.internal.ads.ss, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1578ss implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15608k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1174js f15609l;

    public /* synthetic */ RunnableC1578ss(C1174js c1174js, int i) {
        this.f15608k = i;
        this.f15609l = c1174js;
    }

    private final void a() {
        C1174js c1174js = this.f15609l;
        synchronized (c1174js) {
            if (c1174js.f14182l.get()) {
                try {
                    Q2.O o5 = c1174js.f14178g;
                    Q2.R0 r02 = c1174js.f14177e;
                    Parcel N5 = o5.N();
                    F5.c(N5, r02);
                    o5.d1(N5, 2);
                } catch (RemoteException unused) {
                    U2.j.i("Failed to call onAdsExhausted");
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Optional empty;
        Optional empty2;
        switch (this.f15608k) {
            case 0:
                this.f15609l.j();
                return;
            case 1:
                C1174js c1174js = this.f15609l;
                synchronized (c1174js) {
                    if (c1174js.f14182l.get()) {
                        try {
                            Q2.O o5 = c1174js.f14178g;
                            Q2.R0 r02 = c1174js.f14177e;
                            Parcel N5 = o5.N();
                            F5.c(N5, r02);
                            o5.d1(N5, 1);
                        } catch (RemoteException unused) {
                            U2.j.i("Failed to call onAdsAvailable");
                            return;
                        }
                    }
                }
                return;
            case 2:
                a();
                return;
            default:
                C1174js c1174js2 = this.f15609l;
                U4 u42 = c1174js2.f14184n;
                if (u42 != null) {
                    J2.c a5 = J2.c.a(c1174js2.f14177e.f4936l);
                    c1174js2.f14185o.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    empty = Optional.empty();
                    empty2 = Optional.empty();
                    u42.r(a5, empty, "paeo_ts", currentTimeMillis, empty2);
                    return;
                }
                return;
        }
    }
}
