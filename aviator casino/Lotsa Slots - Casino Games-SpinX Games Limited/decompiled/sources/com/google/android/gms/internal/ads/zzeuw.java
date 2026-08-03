package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeuw implements com.google.android.gms.internal.ads.zzfci {
    public final com.google.android.gms.ads.internal.client.zzr zza;
    public final java.lang.String zzb;
    public final boolean zzc;
    public final java.lang.String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final java.lang.String zzh;
    public final int zzi;
    public final boolean zzj;
    public final androidx.core.graphics.Insets zzk;
    public final com.google.android.gms.internal.ads.zzeut zzl;

    public zzeuw(com.google.android.gms.ads.internal.client.zzr zzrVar, java.lang.String str, boolean z, java.lang.String str2, float f, int i, int i2, java.lang.String str3, int i3, boolean z2, androidx.core.graphics.Insets insets, com.google.android.gms.internal.ads.zzeut zzeutVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar, "the adSize must not be null");
        this.zza = zzrVar;
        this.zzb = str;
        this.zzc = z;
        this.zzd = str2;
        this.zze = f;
        this.zzf = i;
        this.zzg = i2;
        this.zzh = str3;
        this.zzi = i3;
        this.zzj = z2;
        this.zzk = insets;
        this.zzl = zzeutVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zza;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i = zzrVar.zze;
        com.google.android.gms.internal.ads.zzfln.zzb(bundle, "smart_w", "full", i == -1);
        int i2 = zzrVar.zzb;
        com.google.android.gms.internal.ads.zzfln.zzb(bundle, "smart_h", "auto", i2 == -2);
        com.google.android.gms.internal.ads.zzfln.zzd(bundle, "ene", true, zzrVar.zzj);
        com.google.android.gms.internal.ads.zzfln.zzb(bundle, "rafmt", "102", zzrVar.zzm);
        com.google.android.gms.internal.ads.zzfln.zzb(bundle, "rafmt", "108", zzrVar.zzp);
        com.google.android.gms.internal.ads.zzfln.zzb(bundle, "rafmt", "103", zzrVar.zzn);
        com.google.android.gms.internal.ads.zzfln.zzb(bundle, "rafmt", "105", zzrVar.zzo);
        com.google.android.gms.internal.ads.zzfln.zzd(bundle, "inline_adaptive_slot", true, this.zzj);
        com.google.android.gms.internal.ads.zzfln.zzd(bundle, "interscroller_slot", true, zzrVar.zzo);
        com.google.android.gms.internal.ads.zzfln.zze(bundle, "format", this.zzb);
        com.google.android.gms.internal.ads.zzfln.zzb(bundle, "fluid", "height", this.zzc);
        com.google.android.gms.internal.ads.zzfln.zzb(bundle, "sz", this.zzd, !android.text.TextUtils.isEmpty(r6));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        java.lang.String str = this.zzh;
        com.google.android.gms.internal.ads.zzfln.zzb(bundle, "sc", str, true ^ android.text.TextUtils.isEmpty(str));
        int i3 = this.zzi;
        if (i3 != -1) {
            bundle.putInt("u_mso", i3);
        }
        androidx.core.graphics.Insets insets = this.zzk;
        if (insets != null) {
            bundle.putInt("sam_t", insets.top);
            bundle.putInt("sam_b", insets.bottom);
            bundle.putInt("sam_l", insets.left);
            bundle.putInt("sam_r", insets.right);
        }
        com.google.android.gms.internal.ads.zzeut zzeutVar = this.zzl;
        if (zzeutVar != null) {
            bundle.putInt("rc_tl", zzeutVar.zza);
            bundle.putInt("rc_tr", zzeutVar.zzb);
            bundle.putInt("rc_bl", zzeutVar.zzc);
            bundle.putInt("rc_br", zzeutVar.zzd);
        }
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = zzrVar.zzg;
        if (zzrVarArr == null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("height", i2);
            bundle2.putInt("width", i);
            bundle2.putBoolean("is_fluid_height", zzrVar.zzi);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr) {
                android.os.Bundle bundle3 = new android.os.Bundle();
                bundle3.putBoolean("is_fluid_height", zzrVar2.zzi);
                bundle3.putInt("height", zzrVar2.zzb);
                bundle3.putInt("width", zzrVar2.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
