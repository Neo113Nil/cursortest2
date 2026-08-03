package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcnk {
    private com.google.android.gms.ads.internal.util.client.VersionInfoParcel zza;
    private android.content.Context zzb;
    private long zzc;
    private java.lang.ref.WeakReference zzd;

    public final com.google.android.gms.internal.ads.zzcnk zza(com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        this.zza = versionInfoParcel;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcnk zzb(android.content.Context context) {
        this.zzd = new java.lang.ref.WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzb = context;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcnk zzc(long j) {
        this.zzc = j;
        return this;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd() {
        return this.zza;
    }

    final /* synthetic */ android.content.Context zze() {
        return this.zzb;
    }

    final /* synthetic */ long zzf() {
        return this.zzc;
    }

    final /* synthetic */ java.lang.ref.WeakReference zzg() {
        return this.zzd;
    }
}
