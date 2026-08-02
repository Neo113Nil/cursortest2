package F2;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbkx;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzblg;
import com.google.android.gms.internal.ads.zzbog;
import e6.C1054c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o3.BinderC1507b;
import y2.EnumC1798b;

/* loaded from: classes.dex */
public final class T0 {

    /* renamed from: i, reason: collision with root package name */
    public static T0 f2633i;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0238k0 f2639f;

    /* renamed from: a, reason: collision with root package name */
    public final Object f2634a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2636c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2637d = false;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2638e = new Object();

    /* renamed from: g, reason: collision with root package name */
    public R4.c f2640g = null;

    /* renamed from: h, reason: collision with root package name */
    public y2.u f2641h = new y2.u(-1, -1, null, new ArrayList(), 1);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2635b = new ArrayList();

    static {
        new HashSet(Arrays.asList(EnumC1798b.APP_OPEN_AD, EnumC1798b.INTERSTITIAL, EnumC1798b.REWARDED));
    }

    public static zzblg a(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbkx zzbkxVar = (zzbkx) it.next();
            hashMap.put(zzbkxVar.zza, new zzblf(zzbkxVar.zzb ? D2.a.f1710b : D2.a.f1709a, zzbkxVar.zzd, zzbkxVar.zzc));
        }
        return new zzblg(hashMap);
    }

    public static T0 e() {
        T0 t02;
        synchronized (T0.class) {
            try {
                if (f2633i == null) {
                    f2633i = new T0();
                }
                t02 = f2633i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t02;
    }

    public final void b(Context context) {
        try {
            zzbog.zza().zzb(context, null);
            this.f2639f.zzk();
            this.f2639f.zzl(null, new BinderC1507b(null));
        } catch (RemoteException e7) {
            J2.j.h("MobileAdsSettingManager initialization failed", e7);
        }
    }

    public final void c(Context context) {
        if (this.f2639f == null) {
            this.f2639f = (InterfaceC0238k0) new C0243n(C0252s.f2717f.f2719b, context).d(context, false);
        }
    }

    public final D2.c d() {
        zzblg a2;
        synchronized (this.f2638e) {
            try {
                com.google.android.gms.common.internal.D.k("MobileAds.initialize() must be called prior to getting initialization status.", this.f2639f != null);
                try {
                    a2 = a(this.f2639f.zzg());
                } catch (RemoteException unused) {
                    J2.j.d("Unable to get Initialization status.");
                    return new C1054c(4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a2;
    }
}
