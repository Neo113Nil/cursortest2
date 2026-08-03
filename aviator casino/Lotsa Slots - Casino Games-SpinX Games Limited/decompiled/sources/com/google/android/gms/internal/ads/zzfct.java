package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzfct implements com.google.android.gms.internal.ads.zzfci {
    public final boolean zza;
    public final boolean zzb;
    public final java.lang.String zzc;
    public final boolean zzd;
    public final boolean zze;
    public final boolean zzf;
    public final java.lang.String zzg;
    public final java.lang.String zzh;

    @javax.annotation.Nullable
    public final java.lang.String zzi;
    public final java.util.ArrayList zzj;

    @javax.annotation.Nullable
    public final java.lang.String zzk;

    @javax.annotation.Nullable
    public final java.lang.String zzl;
    public final java.lang.String zzm;
    public final boolean zzn;
    public final java.lang.String zzo;
    public final long zzp;
    public final boolean zzq;

    @javax.annotation.Nullable
    public final java.lang.String zzr;
    public final int zzs;

    @javax.annotation.Nullable
    public final java.lang.String zzt;

    public zzfct(boolean z, boolean z2, java.lang.String str, boolean z3, boolean z4, boolean z5, java.lang.String str2, java.util.ArrayList arrayList, @javax.annotation.Nullable java.lang.String str3, @javax.annotation.Nullable java.lang.String str4, java.lang.String str5, boolean z6, java.lang.String str6, long j, boolean z7, @javax.annotation.Nullable java.lang.String str7, int i, java.lang.String str8, @javax.annotation.Nullable java.lang.String str9, @javax.annotation.Nullable java.lang.String str10) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = str;
        this.zzd = z3;
        this.zze = z4;
        this.zzf = z5;
        this.zzg = str2;
        this.zzh = str8;
        this.zzj = arrayList;
        this.zzk = str3;
        this.zzl = str4;
        this.zzm = str5;
        this.zzn = z6;
        this.zzo = str6;
        this.zzp = j;
        this.zzq = z7;
        this.zzr = str7;
        this.zzs = i;
        this.zzt = str10;
        this.zzi = str9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x006e, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoV)).booleanValue() != false) goto L9;
     */
    @Override // com.google.android.gms.internal.ads.zzfci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        java.lang.String str;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        bundle.putBoolean("cog", this.zza);
        bundle.putBoolean("coh", this.zzb);
        bundle.putString("gl", this.zzc);
        bundle.putBoolean("simulator", this.zzd);
        bundle.putBoolean("is_latchsky", this.zze);
        bundle.putInt("build_api_level", this.zzs);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmw)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.zzf);
        }
        bundle.putString("hl", this.zzg);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoU)).booleanValue()) {
        }
        bundle.putString("dlc", this.zzh);
        java.util.ArrayList<java.lang.String> arrayList = this.zzj;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        java.lang.String str2 = this.zzi;
        if (str2 != null) {
            bundle.putString("dgl", str2);
        }
        bundle.putString("mv", this.zzk);
        bundle.putString("submodel", this.zzo);
        android.os.Bundle zza = com.google.android.gms.internal.ads.zzfln.zza(bundle, "device");
        bundle.putBundle("device", zza);
        zza.putString("build", this.zzm);
        zza.putLong("remaining_data_partition_space", this.zzp);
        android.os.Bundle zza2 = com.google.android.gms.internal.ads.zzfln.zza(zza, "browser");
        zza.putBundle("browser", zza2);
        zza2.putBoolean("is_browser_custom_tabs_capable", this.zzn);
        java.lang.String str3 = this.zzl;
        if (!android.text.TextUtils.isEmpty(str3)) {
            android.os.Bundle zza3 = com.google.android.gms.internal.ads.zzfln.zza(zza, "play_store");
            zza.putBundle("play_store", zza3);
            zza3.putString("package_version", str3);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmM)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.zzq);
        }
        java.lang.String str4 = this.zzr;
        if (!android.text.TextUtils.isEmpty(str4)) {
            bundle.putString("v_unity", str4);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmG)).booleanValue()) {
            com.google.android.gms.internal.ads.zzfln.zzd(bundle, "gotmt_l", true, ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmD)).booleanValue());
            com.google.android.gms.internal.ads.zzfln.zzd(bundle, "gotmt_i", true, ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmC)).booleanValue());
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpK)).booleanValue() || (str = this.zzt) == null) {
            return;
        }
        bundle.putString("sdk_i_s", str);
    }
}
