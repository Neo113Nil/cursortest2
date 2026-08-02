package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzbkw implements zzaou {
    private volatile zzbkj zza;
    private final Context zzb;

    public zzbkw(Context context) {
        this.zzb = context;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzbkw zzbkwVar) {
        if (zzbkwVar.zza == null) {
            return;
        }
        zzbkwVar.zza.disconnect();
        Binder.flushPendingCommands();
    }

    @Override // com.google.android.gms.internal.ads.zzaou
    public final zzaox zza(zzapb zzapbVar) {
        Parcelable.Creator<zzbkk> creator = zzbkk.CREATOR;
        Map zzl = zzapbVar.zzl();
        int size = zzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i7 = 0;
        int i8 = 0;
        for (Map.Entry entry : zzl.entrySet()) {
            strArr[i8] = (String) entry.getKey();
            strArr2[i8] = (String) entry.getValue();
            i8++;
        }
        zzbkk zzbkkVar = new zzbkk(zzapbVar.zzk(), strArr, strArr2);
        o oVar = o.f1952C;
        oVar.j.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            zzbzf zzbzfVar = new zzbzf();
            this.zza = new zzbkj(this.zzb, oVar.f1972s.l(), new zzbku(this, zzbzfVar), new zzbkv(this, zzbzfVar));
            this.zza.checkAvailabilityAndConnect();
            zzbks zzbksVar = new zzbks(this, zzbkkVar);
            zzgbn zzgbnVar = zzbza.zza;
            I3.b zzo = zzgbc.zzo(zzgbc.zzn(zzbzfVar, zzbksVar, zzgbnVar), ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzeD)).intValue(), TimeUnit.MILLISECONDS, zzbza.zzd);
            zzo.addListener(new zzbkt(this), zzgbnVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzo.get();
            oVar.j.getClass();
            J.k("Http assets remote cache took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
            zzbkm zzbkmVar = (zzbkm) new zzbum(parcelFileDescriptor).zza(zzbkm.CREATOR);
            if (zzbkmVar == null) {
                return null;
            }
            if (zzbkmVar.zza) {
                throw new zzapk(zzbkmVar.zzb);
            }
            if (zzbkmVar.zze.length != zzbkmVar.zzf.length) {
                return null;
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String[] strArr3 = zzbkmVar.zze;
                if (i7 >= strArr3.length) {
                    return new zzaox(zzbkmVar.zzc, zzbkmVar.zzd, hashMap, zzbkmVar.zzg, zzbkmVar.zzh);
                }
                hashMap.put(strArr3[i7], zzbkmVar.zzf[i7]);
                i7++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            o.f1952C.j.getClass();
            J.k("Http assets remote cache took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            o.f1952C.j.getClass();
            J.k("Http assets remote cache took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
            throw th;
        }
    }
}
