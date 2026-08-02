package com.google.android.gms.ads;

import P3.a;
import Q2.E0;
import Q2.F0;
import Q2.InterfaceC0352c0;
import Q2.r;
import U2.c;
import U2.j;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC0968f8;
import com.google.android.gms.internal.ads.BinderC0610Ia;
import com.google.android.gms.internal.ads.F7;

/* loaded from: classes.dex */
public class MobileAds {
    public static void a(final Context context, a aVar) {
        final F0 e3 = F0.e();
        synchronized (e3.f4917a) {
            try {
                if (e3.f4919c) {
                    e3.f4918b.add(aVar);
                    return;
                }
                if (e3.f4920d) {
                    aVar.a(e3.d());
                    return;
                }
                e3.f4919c = true;
                e3.f4918b.add(aVar);
                if (context == null) {
                    throw new IllegalArgumentException("Context cannot be null.");
                }
                synchronized (e3.f4921e) {
                    try {
                        e3.c(context);
                        e3.f.r2(new E0(0, e3));
                        e3.f.s0(new BinderC0610Ia());
                        e3.f4922g.getClass();
                        e3.f4922g.getClass();
                    } catch (RemoteException e5) {
                        j.j("MobileAdsSettingManager initialization failed", e5);
                    }
                    F7.a(context);
                    if (((Boolean) AbstractC0968f8.f13454a.s()).booleanValue()) {
                        if (((Boolean) r.f5053d.f5056c.a(F7.Ka)).booleanValue()) {
                            j.d("Initializing on bg thread");
                            final int i = 0;
                            c.f5859a.execute(new Runnable() { // from class: Q2.D0
                                private final void a() {
                                    F0 f02 = e3;
                                    Context context2 = context;
                                    synchronized (f02.f4921e) {
                                        f02.b(context2);
                                    }
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i) {
                                        case 0:
                                            a();
                                            return;
                                        default:
                                            F0 f02 = e3;
                                            Context context2 = context;
                                            synchronized (f02.f4921e) {
                                                f02.b(context2);
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                    }
                    if (((Boolean) AbstractC0968f8.f13455b.s()).booleanValue()) {
                        if (((Boolean) r.f5053d.f5056c.a(F7.Ka)).booleanValue()) {
                            final int i5 = 1;
                            c.f5860b.execute(new Runnable() { // from class: Q2.D0
                                private final void a() {
                                    F0 f02 = e3;
                                    Context context2 = context;
                                    synchronized (f02.f4921e) {
                                        f02.b(context2);
                                    }
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i5) {
                                        case 0:
                                            a();
                                            return;
                                        default:
                                            F0 f02 = e3;
                                            Context context2 = context;
                                            synchronized (f02.f4921e) {
                                                f02.b(context2);
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                    }
                    j.d("Initializing on calling thread");
                    e3.b(context);
                }
            } finally {
            }
        }
    }

    private static void setPlugin(String str) {
        F0 e3 = F0.e();
        synchronized (e3.f4921e) {
            InterfaceC0352c0 interfaceC0352c0 = e3.f;
            if (!(interfaceC0352c0 != null)) {
                throw new IllegalStateException("MobileAds.initialize() must be called prior to setting the plugin.");
            }
            try {
                interfaceC0352c0.p0(str);
            } catch (RemoteException e5) {
                j.g("Unable to set plugin.", e5);
            }
        }
    }
}
