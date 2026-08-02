package com.google.android.gms.internal.ads;

import J2.j;
import L2.e;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* loaded from: classes.dex */
public final class zzbok extends zzbon {
    @Override // com.google.android.gms.internal.ads.zzboo
    public final zzbor zzb(String str) {
        zzbpp zzbppVar;
        try {
            try {
                Class<?> cls = Class.forName(str, false, zzbok.class.getClassLoader());
                if (e.class.isAssignableFrom(cls)) {
                    return new zzbpp((e) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (L2.a.class.isAssignableFrom(cls)) {
                    return new zzbpp((L2.a) cls.getDeclaredConstructor(null).newInstance(null));
                }
                j.g("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable th) {
                j.h("Could not instantiate mediation adapter: " + str + ". ", th);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            j.b("Reflection failed, retrying using direct instantiation");
            if (!"com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    zzbppVar = new zzbpp(new CustomEventAdapter());
                }
                throw new RemoteException();
            }
            zzbppVar = new zzbpp(new AdMobAdapter());
            return zzbppVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboo
    public final zzbqn zzc(String str) {
        return new zzbra((RtbAdapter) Class.forName(str, false, zzbqr.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
    }

    @Override // com.google.android.gms.internal.ads.zzboo
    public final boolean zzd(String str) {
        try {
            return L2.a.class.isAssignableFrom(Class.forName(str, false, zzbok.class.getClassLoader()));
        } catch (Throwable unused) {
            j.g("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboo
    public final boolean zze(String str) {
        try {
            return M2.a.class.isAssignableFrom(Class.forName(str, false, zzbok.class.getClassLoader()));
        } catch (Throwable unused) {
            j.g("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }
}
