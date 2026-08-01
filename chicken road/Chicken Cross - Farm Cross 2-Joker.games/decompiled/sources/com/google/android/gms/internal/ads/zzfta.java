package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfta {
    private final zzeqb zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzflp zzf;
    private final zzflq zzg;
    private final Clock zzh;
    private final zzbbd zzi;

    public zzfta(zzeqb zzeqbVar, VersionInfoParcel versionInfoParcel, String str, String str2, Context context, zzflp zzflpVar, zzflq zzflqVar, Clock clock, zzbbd zzbbdVar) {
        this.zza = zzeqbVar;
        this.zzb = versionInfoParcel.afmaVersion;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzflpVar;
        this.zzg = zzflqVar;
        this.zzh = clock;
        this.zzi = zzbbdVar;
    }

    public static String zzd(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzg(String str) {
        return TextUtils.isEmpty(str) ? "" : com.google.android.gms.ads.internal.util.client.zzl.zzj() ? "fakeForAdDebugLog" : str;
    }

    public final List zza(zzflo zzfloVar, zzfld zzfldVar, List list) {
        return zzb(zzfloVar, zzfldVar, false, "", "", list, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0155, code lost:
    
        if (r5 == false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzb(zzflo zzfloVar, zzfld zzfldVar, boolean z, String str, String str2, List list, zzdck zzdckVar, zzcfw zzcfwVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z2 = true;
            String zzd = zzd(zzd(zzd((String) it.next(), "@gw_adlocid@", zzfloVar.zza.zza.zzg), "@gw_adnetrefresh@", true != z ? "0" : "1"), "@gw_sdkver@", this.zzb);
            if (zzfldVar != null) {
                String zzd2 = zzd(zzd(zzd(zzd, "@gw_qdata@", zzfldVar.zzy), "@gw_adnetid@", zzfldVar.zzx), "@gw_allocid@", zzfldVar.zzw);
                Context context = this.zze;
                zzd = zzcet.zza(zzd2, context, zzfldVar.zzW, zzfldVar.zzaw);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpq)).booleanValue() && zzfldVar.zze == 4) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    zzd = zzd(zzd, "@gw_aps@", true == com.google.android.gms.ads.internal.util.zzs.zzJ(context) ? "1" : "0");
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpB)).booleanValue() && zzcfwVar != null) {
                    int i = zzcfwVar.zza;
                    String zzd3 = zzd(zzd, "@gw_is@", i >= 0 ? Integer.toString(i) : "");
                    int i2 = zzcfwVar.zzb;
                    String zzd4 = zzd(zzd3, "@gw_fis@", i2 >= 0 ? Integer.toString(i2) : "");
                    int i3 = zzcfwVar.zzc;
                    zzd = zzd(zzd4, "@gw_sfis@", i3 >= 0 ? Integer.toString(i3) : "");
                }
            }
            zzeqb zzeqbVar = this.zza;
            String zzd5 = zzd(zzd(zzd(zzd(zzd, "@gw_adnetstatus@", zzeqbVar.zzg()), "@gw_ttr@", Long.toString(zzeqbVar.zzh(), 10)), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpz)).booleanValue()) {
                zzd5 = (zzdckVar == null || zzdckVar.zza() <= 0) ? zzd(zzd5, "@gw_placement_id@", "") : zzd(zzd5, "@gw_placement_id@", Long.toString(zzdckVar.zza(), 10));
            }
            boolean z3 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeB)).booleanValue() && !TextUtils.isEmpty(str)) {
                z3 = true;
            }
            boolean isEmpty = TextUtils.isEmpty(str2);
            boolean z4 = !isEmpty;
            if (z3) {
                z2 = z4;
            }
            if (this.zzi.zza(Uri.parse(zzd5))) {
                Uri.Builder buildUpon = Uri.parse(zzd5).buildUpon();
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                zzd5 = buildUpon.build().toString();
                arrayList.add(zzd5);
            }
            arrayList.add(zzd5);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f A[LOOP:0: B:10:0x0059->B:12:0x005f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzc(zzfld zzfldVar, List list, zzcch zzcchVar) {
        zzflp zzflpVar;
        zzgui zzd;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = this.zzh.currentTimeMillis();
        try {
            String zza = zzcchVar.zza();
            String num = Integer.toString(zzcchVar.zzb());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeC)).booleanValue()) {
                zzflq zzflqVar = this.zzg;
                if (zzflqVar == null) {
                    zzd = zzgui.zzc();
                    String str = (String) zzd.zzb(zzfsz.zza).zza("");
                    String str2 = (String) zzd.zzb(zzfsy.zza).zza("");
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(zzcet.zza(zzd(zzd(zzd(zzd(zzd(zzd((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(zza)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.zzb), this.zze, zzfldVar.zzW, zzfldVar.zzaw));
                    }
                    return arrayList;
                }
                zzflpVar = zzflqVar.zza;
            } else {
                zzflpVar = this.zzf;
            }
            zzd = zzgui.zzd(zzflpVar);
            String str3 = (String) zzd.zzb(zzfsz.zza).zza("");
            String str22 = (String) zzd.zzb(zzfsy.zza).zza("");
            it = list.iterator();
            while (it.hasNext()) {
            }
            return arrayList;
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }
}
