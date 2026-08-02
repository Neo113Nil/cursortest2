package com.google.android.gms.internal.ads;

import E2.h;
import E2.o;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class zzcge {
    private final VersionInfoParcel zza;
    private final Context zzb;
    private final long zzc;
    private final WeakReference zzd;

    public /* synthetic */ zzcge(zzcgc zzcgcVar, zzcgd zzcgdVar) {
        VersionInfoParcel versionInfoParcel;
        Context context;
        WeakReference weakReference;
        long j;
        versionInfoParcel = zzcgcVar.zza;
        this.zza = versionInfoParcel;
        context = zzcgcVar.zzb;
        this.zzb = context;
        weakReference = zzcgcVar.zzd;
        this.zzd = weakReference;
        j = zzcgcVar.zzc;
        this.zzc = j;
    }

    public final long zza() {
        return this.zzc;
    }

    public final Context zzb() {
        return this.zzb;
    }

    public final h zzc() {
        return new h(this.zzb, this.zza);
    }

    public final zzber zzd() {
        return new zzber(this.zzb);
    }

    public final VersionInfoParcel zze() {
        return this.zza;
    }

    public final String zzf() {
        return o.f1952C.f1957c.x(this.zzb, this.zza.f10834a);
    }

    public final WeakReference zzg() {
        return this.zzd;
    }
}
