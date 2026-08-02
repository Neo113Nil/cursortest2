package com.google.android.gms.internal.ads;

import E2.o;
import F2.AbstractBinderC0230g0;
import F2.InterfaceC0232h0;
import I2.J;
import I2.P;
import J2.j;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzfbw {
    private static zzfbw zza;
    private final Context zzb;
    private final InterfaceC0232h0 zzc;
    private final AtomicReference zzd = new AtomicReference();

    public zzfbw(Context context, InterfaceC0232h0 interfaceC0232h0) {
        this.zzb = context;
        this.zzc = interfaceC0232h0;
    }

    public static InterfaceC0232h0 zza(Context context) {
        try {
            return AbstractBinderC0230g0.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e7) {
            int i7 = J.f3546b;
            j.e("Failed to retrieve lite SDK info.", e7);
            return null;
        }
    }

    public static zzfbw zzd(Context context) {
        synchronized (zzfbw.class) {
            try {
                zzfbw zzfbwVar = zza;
                if (zzfbwVar != null) {
                    return zzfbwVar;
                }
                Context applicationContext = context.getApplicationContext();
                long longValue = ((Long) zzbdz.zzb.zze()).longValue();
                InterfaceC0232h0 interfaceC0232h0 = null;
                if (longValue > 0 && longValue <= 250915000) {
                    interfaceC0232h0 = zza(applicationContext);
                }
                zzfbw zzfbwVar2 = new zzfbw(applicationContext, interfaceC0232h0);
                zza = zzfbwVar2;
                return zzfbwVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final com.google.android.gms.ads.internal.client.zzey zzg() {
        InterfaceC0232h0 interfaceC0232h0 = this.zzc;
        if (interfaceC0232h0 != null) {
            try {
                return interfaceC0232h0.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final zzboo zzb() {
        return (zzboo) this.zzd.get();
    }

    public final VersionInfoParcel zzc(int i7, boolean z4, int i8) {
        com.google.android.gms.ads.internal.client.zzey zzg;
        P p5 = o.f1952C.f1957c;
        boolean e7 = P.e(this.zzb);
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(250930000, i8, true, e7);
        return (((Boolean) zzbdz.zzc.zze()).booleanValue() && (zzg = zzg()) != null) ? new VersionInfoParcel(250930000, zzg.f10727b, true, e7) : versionInfoParcel;
    }

    public final String zze() {
        com.google.android.gms.ads.internal.client.zzey zzg = zzg();
        if (zzg != null) {
            return zzg.f10728c;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(zzboo zzbooVar) {
        zzboo adapterCreator;
        if (!((Boolean) zzbdz.zza.zze()).booleanValue()) {
            zzfbv.zza(this.zzd, null, zzbooVar);
            return;
        }
        InterfaceC0232h0 interfaceC0232h0 = this.zzc;
        if (interfaceC0232h0 != null) {
            try {
                adapterCreator = interfaceC0232h0.getAdapterCreator();
            } catch (RemoteException unused) {
            }
            AtomicReference atomicReference = this.zzd;
            if (adapterCreator != null) {
                zzbooVar = adapterCreator;
            }
            zzfbv.zza(atomicReference, null, zzbooVar);
        }
        adapterCreator = null;
        AtomicReference atomicReference2 = this.zzd;
        if (adapterCreator != null) {
        }
        zzfbv.zza(atomicReference2, null, zzbooVar);
    }
}
