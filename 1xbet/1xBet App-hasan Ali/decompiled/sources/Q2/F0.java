package Q2;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C1529ro;
import com.google.android.gms.internal.ads.Kw;
import com.google.android.gms.internal.ads.Q9;
import com.google.android.gms.internal.ads.V9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import s3.BinderC2361b;

/* loaded from: classes.dex */
public final class F0 {

    /* renamed from: h, reason: collision with root package name */
    public static F0 f4916h;
    public InterfaceC0352c0 f;

    /* renamed from: a, reason: collision with root package name */
    public final Object f4917a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public boolean f4919c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4920d = false;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4921e = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final J2.p f4922g = new J2.p(new ArrayList());

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4918b = new ArrayList();

    static {
        new HashSet(Arrays.asList(J2.c.f2704q, J2.c.f2700m, J2.c.f2701n));
    }

    public static V9 a(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashMap.put(((Q9) it.next()).f11187k, new V9(0));
        }
        return new V9(1);
    }

    public static F0 e() {
        F0 f02;
        synchronized (F0.class) {
            try {
                if (f4916h == null) {
                    f4916h = new F0();
                }
                f02 = f4916h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return f02;
    }

    public final void b(Context context) {
        try {
            if (C1529ro.f15380m == null) {
                C1529ro.f15380m = new C1529ro(9);
            }
            Object obj = null;
            if (((AtomicBoolean) C1529ro.f15380m.f15382l).compareAndSet(false, true)) {
                new Thread(new Kw(8, context, obj)).start();
            }
            this.f.k();
            this.f.E1(null, new BinderC2361b(null));
        } catch (RemoteException e3) {
            U2.j.j("MobileAdsSettingManager initialization failed", e3);
        }
    }

    public final void c(Context context) {
        if (this.f == null) {
            this.f = (InterfaceC0352c0) new C0369l(C0379q.f.f5049b, context).d(context, false);
        }
    }

    public final O2.a d() {
        V9 a5;
        synchronized (this.f4921e) {
            try {
                InterfaceC0352c0 interfaceC0352c0 = this.f;
                if (!(interfaceC0352c0 != null)) {
                    throw new IllegalStateException("MobileAds.initialize() must be called prior to getting initialization status.");
                }
                try {
                    a5 = a(interfaceC0352c0.f());
                } catch (RemoteException unused) {
                    U2.j.f("Unable to get Initialization status.");
                    return new Z0();
                }
            } finally {
            }
        }
        return a5;
    }
}
