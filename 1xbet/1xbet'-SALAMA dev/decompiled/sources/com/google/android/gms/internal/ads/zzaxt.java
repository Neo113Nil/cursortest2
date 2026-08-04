package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzaxt {
    private final String zza;
    private final JSONObject zzb;
    private final String zzc;
    private final String zzd;
    private final boolean zze;

    public zzaxt(String str, VersionInfoParcel versionInfoParcel, String str2, JSONObject jSONObject, boolean z4, boolean z7) {
        this.zzd = versionInfoParcel.f10834a;
        this.zzb = jSONObject;
        this.zzc = str;
        this.zza = str2;
        this.zze = z7;
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final JSONObject zzd() {
        return this.zzb;
    }

    public final boolean zze() {
        return this.zze;
    }
}
