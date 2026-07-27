package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.ArrayList;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes9.dex */
public final class zzfdr implements zzfdg {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final boolean zze;
    public final boolean zzf;
    public final String zzg;
    public final String zzh;

    @Nullable
    public final String zzi;
    public final ArrayList zzj;

    @Nullable
    public final String zzk;

    @Nullable
    public final String zzl;
    public final String zzm;
    public final boolean zzn;
    public final String zzo;
    public final long zzp;
    public final boolean zzq;

    @Nullable
    public final String zzr;
    public final int zzs;

    @Nullable
    public final String zzt;

    public zzfdr(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList arrayList, @Nullable String str3, @Nullable String str4, String str5, boolean z6, String str6, long j, boolean z7, @Nullable String str7, int i, String str8, @Nullable String str9, @Nullable String str10) {
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
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbjg.zzpm)).booleanValue() != false) goto L9;
     */
    @Override // com.google.android.gms.internal.ads.zzfdg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.zza);
        bundle.putBoolean("coh", this.zzb);
        bundle.putString("gl", this.zzc);
        bundle.putBoolean("simulator", this.zzd);
        bundle.putBoolean("is_latchsky", this.zze);
        bundle.putInt("build_api_level", this.zzs);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmH)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.zzf);
        }
        bundle.putString("hl", this.zzg);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpl)).booleanValue()) {
        }
        bundle.putString("dlc", this.zzh);
        ArrayList<String> arrayList = this.zzj;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        String str2 = this.zzi;
        if (str2 != null) {
            bundle.putString("dgl", str2);
        }
        bundle.putString("mv", this.zzk);
        bundle.putString("submodel", this.zzo);
        Bundle zza = zzfml.zza(bundle, "device");
        bundle.putBundle("device", zza);
        zza.putString(InAppPurchaseConstants.METHOD_BUILD, this.zzm);
        zza.putLong("remaining_data_partition_space", this.zzp);
        Bundle zza2 = zzfml.zza(zza, "browser");
        zza.putBundle("browser", zza2);
        zza2.putBoolean("is_browser_custom_tabs_capable", this.zzn);
        String str3 = this.zzl;
        if (!TextUtils.isEmpty(str3)) {
            Bundle zza3 = zzfml.zza(zza, "play_store");
            zza.putBundle("play_store", zza3);
            zza3.putString("package_version", str3);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmX)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.zzq);
        }
        String str4 = this.zzr;
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString("v_unity", str4);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmR)).booleanValue()) {
            zzfml.zzd(bundle, "gotmt_l", true, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmO)).booleanValue());
            zzfml.zzd(bundle, "gotmt_i", true, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmN)).booleanValue());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzqb)).booleanValue() || (str = this.zzt) == null) {
            return;
        }
        bundle.putString("sdk_i_s", str);
    }
}
