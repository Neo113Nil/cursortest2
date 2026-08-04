package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.D;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzekw implements zzesg {
    public final com.google.android.gms.ads.internal.client.zzr zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final boolean zzi;

    public zzekw(com.google.android.gms.ads.internal.client.zzr zzrVar, String str, boolean z4, String str2, float f7, int i7, int i8, String str3, boolean z7) {
        D.j(zzrVar, "the adSize must not be null");
        this.zza = zzrVar;
        this.zzb = str;
        this.zzc = z4;
        this.zzd = str2;
        this.zze = f7;
        this.zzf = i7;
        this.zzg = i8;
        this.zzh = str3;
        this.zzi = z7;
    }

    private final void zzc(Bundle bundle) {
        zzfbo.zzf(bundle, "smart_w", "full", this.zza.f10775e == -1);
        zzfbo.zzf(bundle, "smart_h", "auto", this.zza.f10772b == -2);
        zzfbo.zzg(bundle, "ene", true, this.zza.f10765A);
        zzfbo.zzf(bundle, "rafmt", "102", this.zza.f10768D);
        zzfbo.zzf(bundle, "rafmt", "103", this.zza.f10769E);
        zzfbo.zzf(bundle, "rafmt", "105", this.zza.f10770F);
        zzfbo.zzg(bundle, "inline_adaptive_slot", true, this.zzi);
        zzfbo.zzg(bundle, "interscroller_slot", true, this.zza.f10770F);
        zzfbo.zzc(bundle, "format", this.zzb);
        zzfbo.zzf(bundle, "fluid", "height", this.zzc);
        zzfbo.zzf(bundle, "sz", this.zzd, !TextUtils.isEmpty(this.zzd));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        zzfbo.zzf(bundle, "sc", this.zzh, !TextUtils.isEmpty(this.zzh));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = this.zza.f10777x;
        if (zzrVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.zza.f10772b);
            bundle2.putInt("width", this.zza.f10775e);
            bundle2.putBoolean("is_fluid_height", this.zza.f10779z);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzr zzrVar : zzrVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzrVar.f10779z);
                bundle3.putInt("height", zzrVar.f10772b);
                bundle3.putInt("width", zzrVar.f10775e);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* synthetic */ void zza(Object obj) {
        zzc(((zzcts) obj).zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* synthetic */ void zzb(Object obj) {
        zzc(((zzcts) obj).zza);
    }
}
