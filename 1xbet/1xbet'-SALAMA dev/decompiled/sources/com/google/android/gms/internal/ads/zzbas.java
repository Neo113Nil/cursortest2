package com.google.android.gms.internal.ads;

import E2.o;
import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class zzbas {
    private zzbah zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    public zzbas(Context context) {
        this.zzc = context;
    }

    public static /* bridge */ /* synthetic */ void zze(zzbas zzbasVar) {
        synchronized (zzbasVar.zzd) {
            try {
                zzbah zzbahVar = zzbasVar.zza;
                if (zzbahVar == null) {
                    return;
                }
                zzbahVar.disconnect();
                zzbasVar.zza = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Future zzc(zzbai zzbaiVar) {
        zzbam zzbamVar = new zzbam(this);
        zzbaq zzbaqVar = new zzbaq(this, zzbaiVar, zzbamVar);
        zzbar zzbarVar = new zzbar(this, zzbamVar);
        synchronized (this.zzd) {
            zzbah zzbahVar = new zzbah(this.zzc, o.f1952C.f1972s.l(), zzbaqVar, zzbarVar);
            this.zza = zzbahVar;
            zzbahVar.checkAvailabilityAndConnect();
        }
        return zzbamVar;
    }
}
