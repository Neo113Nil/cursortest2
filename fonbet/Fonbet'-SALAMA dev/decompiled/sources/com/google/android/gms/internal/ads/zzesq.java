package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.os.Bundle;
import android.text.TextUtils;
import io.sentry.protocol.Browser;
import io.sentry.protocol.Device;
import io.sentry.protocol.OperatingSystem;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzesq implements zzesg {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final boolean zze;
    public final boolean zzf;
    public final String zzg;
    public final ArrayList zzh;
    public final String zzi;
    public final String zzj;
    public final String zzk;
    public final boolean zzl;
    public final String zzm;
    public final long zzn;
    public final boolean zzo;
    public final String zzp;
    public final int zzq;

    public zzesq(boolean z4, boolean z7, String str, boolean z8, boolean z9, boolean z10, String str2, ArrayList arrayList, String str3, String str4, String str5, boolean z11, String str6, long j, boolean z12, String str7, int i7) {
        this.zza = z4;
        this.zzb = z7;
        this.zzc = str;
        this.zzd = z8;
        this.zze = z9;
        this.zzf = z10;
        this.zzg = str2;
        this.zzh = arrayList;
        this.zzi = str3;
        this.zzj = str4;
        this.zzk = str5;
        this.zzl = z11;
        this.zzm = str6;
        this.zzn = j;
        this.zzo = z12;
        this.zzp = str7;
        this.zzq = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcts) obj).zzb;
        bundle.putBoolean(Device.JsonKeys.SIMULATOR, this.zzd);
        bundle.putInt("build_api_level", this.zzq);
        if (!this.zzh.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.zzh);
        }
        bundle.putString("submodel", this.zzm);
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final void zzb(Object obj) {
        Bundle bundle = ((zzcts) obj).zza;
        bundle.putBoolean("cog", this.zza);
        bundle.putBoolean("coh", this.zzb);
        bundle.putString("gl", this.zzc);
        bundle.putBoolean(Device.JsonKeys.SIMULATOR, this.zzd);
        bundle.putBoolean("is_latchsky", this.zze);
        bundle.putInt("build_api_level", this.zzq);
        zzbbp zzbbpVar = zzbby.zzla;
        C0254t c0254t = C0254t.f2723d;
        if (!((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.zzf);
        }
        bundle.putString("hl", this.zzg);
        if (!this.zzh.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.zzh);
        }
        bundle.putString("mv", this.zzi);
        bundle.putString("submodel", this.zzm);
        Bundle zza = zzfbo.zza(bundle, Device.TYPE);
        bundle.putBundle(Device.TYPE, zza);
        zza.putString(OperatingSystem.JsonKeys.BUILD, this.zzk);
        zza.putLong("remaining_data_partition_space", this.zzn);
        Bundle zza2 = zzfbo.zza(zza, Browser.TYPE);
        zza.putBundle(Browser.TYPE, zza2);
        zza2.putBoolean("is_browser_custom_tabs_capable", this.zzl);
        if (!TextUtils.isEmpty(this.zzj)) {
            Bundle zza3 = zzfbo.zza(zza, "play_store");
            zza.putBundle("play_store", zza3);
            zza3.putString("package_version", this.zzj);
        }
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzlq)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.zzo);
        }
        if (!TextUtils.isEmpty(this.zzp)) {
            bundle.putString("v_unity", this.zzp);
        }
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzlk)).booleanValue()) {
            zzfbo.zzg(bundle, "gotmt_l", true, ((Boolean) c0254t.f2726c.zzb(zzbby.zzlh)).booleanValue());
            zzfbo.zzg(bundle, "gotmt_i", true, ((Boolean) c0254t.f2726c.zzb(zzbby.zzlg)).booleanValue());
        }
    }
}
