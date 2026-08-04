package F2;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbkx;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzblg;
import com.google.android.gms.internal.ads.zzbog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p167y2.EnumC1058b;

/* JADX INFO: loaded from: classes.dex */
public final class T0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static T0 f2633i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC0238k0 f2639f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2634a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2636c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2637d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f2638e = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public R4.c f2640g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p167y2.u f2641h = new p167y2.u(-1, -1, null, new ArrayList(), 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2635b = new ArrayList();

    static {
        new HashSet(Arrays.asList(EnumC1058b.APP_OPEN_AD, EnumC1058b.INTERSTITIAL, EnumC1058b.REWARDED));
    }

    public static zzblg a(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbkx zzbkxVar = (zzbkx) it.next();
            map.put(zzbkxVar.zza, new zzblf(zzbkxVar.zzb ? D2.a.f1710b : D2.a.f1709a, zzbkxVar.zzd, zzbkxVar.zzc));
        }
        return new zzblg(map);
    }

    public static T0 e() {
        T0 t7;
        synchronized (T0.class) {
            try {
                if (f2633i == null) {
                    f2633i = new T0();
                }
                t7 = f2633i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t7;
    }

    public final void b(Context context) {
        try {
            zzbog.zza().zzb(context, null);
            this.f2639f.zzk();
            this.f2639f.zzl(null, new p105o3.b(null));
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
        zzblg zzblgVarA;
        synchronized (this.f2638e) {
            try {
                com.google.android.gms.common.internal.D.k("MobileAds.initialize() must be called prior to getting initialization status.", this.f2639f != null);
                try {
                    zzblgVarA = a(this.f2639f.zzg());
                } catch (RemoteException unused) {
                    J2.j.d("Unable to get Initialization status.");
                    return new p036e6.c(4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblgVarA;
    }
}
