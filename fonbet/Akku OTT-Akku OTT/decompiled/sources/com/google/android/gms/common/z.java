package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.T;
import com.google.android.gms.common.internal.U;
import com.google.android.gms.common.internal.V;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes4.dex */
public final class z {
    public static final t a;
    public static final u b;
    public static volatile V c;
    public static final Object d;
    public static Context e;

    static {
        new r(v.C("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new s(v.C("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        a = new t(v.C("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        b = new u(v.C("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        d = new Object();
    }

    public static H a(String str, w wVar, boolean z, boolean z2) {
        try {
            b();
            C0875q.g(e);
            try {
                return c.h(new E(str, wVar, z, z2), new com.google.android.gms.dynamic.b(e.getPackageManager())) ? H.c : new G(new q(z, str, wVar));
            } catch (RemoteException e2) {
                return new H("module call", false, e2);
            }
        } catch (DynamiteModule.a e3) {
            return new H("module init: ".concat(String.valueOf(e3.getMessage())), false, e3);
        }
    }

    public static void b() throws DynamiteModule.a {
        V t;
        if (c != null) {
            return;
        }
        C0875q.g(e);
        synchronized (d) {
            try {
                if (c == null) {
                    IBinder b2 = DynamiteModule.c(e, DynamiteModule.e, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = U.a;
                    if (b2 == null) {
                        t = null;
                    } else {
                        IInterface queryLocalInterface = b2.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        t = queryLocalInterface instanceof V ? (V) queryLocalInterface : new T(b2, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    }
                    c = t;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
