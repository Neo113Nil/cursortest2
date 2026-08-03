package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class zzcja implements com.google.android.gms.common.api.Releasable {
    protected final android.content.Context zza;
    protected final java.lang.String zzb;
    protected final java.lang.ref.WeakReference zzc;

    public zzcja(com.google.android.gms.internal.ads.zzchn zzchnVar) {
        android.content.Context context = zzchnVar.getContext();
        this.zza = context;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzc().zze(context, zzchnVar.zzs().afmaVersion);
        this.zzc = new java.lang.ref.WeakReference(zzchnVar);
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    public abstract boolean zze(java.lang.String str);

    public boolean zzf(java.lang.String str, java.lang.String[] strArr) {
        return zze(str);
    }

    public boolean zzg(java.lang.String str, java.lang.String[] strArr, com.google.android.gms.internal.ads.zzcis zzcisVar) {
        return zze(str);
    }

    protected void zzh(int i) {
    }

    protected void zzi(int i) {
    }

    protected void zzj(int i) {
    }

    protected void zzk(int i) {
    }

    public abstract void zzl();

    public final void zzm(java.lang.String str, java.lang.String str2, long j, long j2, boolean z, long j3, long j4, long j5, int i, int i2) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new com.google.android.gms.internal.ads.zzciv(this, str, str2, j, j2, j3, j4, j5, z, i, i2));
    }

    public final void zzn(java.lang.String str, java.lang.String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new com.google.android.gms.internal.ads.zzciw(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    protected final void zzo(java.lang.String str, java.lang.String str2, int i) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new com.google.android.gms.internal.ads.zzcix(this, str, str2, i));
    }

    public final void zzp(java.lang.String str, java.lang.String str2, long j) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new com.google.android.gms.internal.ads.zzciy(this, str, str2, j));
    }

    public final void zzq(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new com.google.android.gms.internal.ads.zzciz(this, str, str2, str3, str4));
    }

    final /* synthetic */ void zzw(java.lang.String str, java.util.Map map) {
        com.google.android.gms.internal.ads.zzchn zzchnVar = (com.google.android.gms.internal.ads.zzchn) this.zzc.get();
        if (zzchnVar != null) {
            zzchnVar.zze("onPrecacheEvent", map);
        }
    }
}
