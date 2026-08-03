package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbih {
    private final int zza;
    private final java.lang.String zzb;
    private final java.lang.Object zzc;
    private final java.lang.Object zzd;

    /* synthetic */ zzbih(int i, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        com.google.android.gms.ads.internal.client.zzba.zzb().zza(this);
    }

    public static com.google.android.gms.internal.ads.zzbih zzh(int i, java.lang.String str, int i2, int i3) {
        return new com.google.android.gms.internal.ads.zzbid(1, str, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3));
    }

    public static com.google.android.gms.internal.ads.zzbih zzi(int i, java.lang.String str, long j, long j2) {
        return new com.google.android.gms.internal.ads.zzbie(1, str, java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2));
    }

    public static com.google.android.gms.internal.ads.zzbih zzj(int i, java.lang.String str, float f, float f2) {
        return new com.google.android.gms.internal.ads.zzbif(1, str, java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2));
    }

    public static com.google.android.gms.internal.ads.zzbih zzk(int i, java.lang.String str) {
        com.google.android.gms.internal.ads.zzbig zzbigVar = new com.google.android.gms.internal.ads.zzbig(1, "gads:sdk_core_constants:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzba.zzb().zzb(zzbigVar);
        return zzbigVar;
    }

    public static com.google.android.gms.internal.ads.zzbih zzl(int i, java.lang.String str) {
        com.google.android.gms.internal.ads.zzbig zzbigVar = new com.google.android.gms.internal.ads.zzbig(1, "gads:sdk_core_constants_service:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzba.zzb().zzc(zzbigVar);
        return zzbigVar;
    }

    public abstract java.lang.Object zza(android.os.Bundle bundle);

    public abstract void zzb(android.content.SharedPreferences.Editor editor, java.lang.Object obj);

    protected abstract java.lang.Object zzc(org.json.JSONObject jSONObject);

    protected abstract java.lang.Object zzd(android.content.SharedPreferences sharedPreferences);

    public final java.lang.String zze() {
        return this.zzb;
    }

    public final java.lang.Object zzf() {
        return com.google.android.gms.ads.internal.client.zzba.zzc().zzb() ? this.zzd : this.zzc;
    }

    public final java.lang.Object zzg() {
        return com.google.android.gms.ads.internal.client.zzba.zzc().zzd(this);
    }

    public final int zzm() {
        return this.zza;
    }
}
