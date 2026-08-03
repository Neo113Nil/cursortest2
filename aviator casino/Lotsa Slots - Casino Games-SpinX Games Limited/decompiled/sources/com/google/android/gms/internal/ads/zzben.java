package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzben {
    private final java.lang.String zza;
    private final org.json.JSONObject zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final boolean zze;

    public zzben(java.lang.String str, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, java.lang.String str2, org.json.JSONObject jSONObject, boolean z, boolean z2) {
        this.zzd = versionInfoParcel.afmaVersion;
        this.zzb = jSONObject;
        this.zzc = str;
        this.zza = str2;
        this.zze = z2;
    }

    public final java.lang.String zza() {
        return this.zza;
    }

    public final java.lang.String zzb() {
        return this.zzd;
    }

    public final org.json.JSONObject zzc() {
        return this.zzb;
    }

    public final java.lang.String zzd() {
        return this.zzc;
    }

    public final boolean zze() {
        return this.zze;
    }
}
