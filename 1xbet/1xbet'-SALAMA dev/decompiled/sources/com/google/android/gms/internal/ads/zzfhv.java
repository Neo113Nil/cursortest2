package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.J;
import J2.g;
import J2.j;
import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzfhv {
    private final zzefg zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfas zzf;
    private final zzfat zzg;
    private final p090m3.a zzh;
    private final zzauo zzi;

    public zzfhv(zzefg zzefgVar, VersionInfoParcel versionInfoParcel, String str, String str2, Context context, zzfas zzfasVar, zzfat zzfatVar, p090m3.a aVar, zzauo zzauoVar) {
        this.zza = zzefgVar;
        this.zzb = versionInfoParcel.f10834a;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfasVar;
        this.zzg = zzfatVar;
        this.zzh = aVar;
        this.zzi = zzauoVar;
    }

    public static String zzc(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzg(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return g.c() ? "fakeForAdDebugLog" : str;
    }

    public final List zzd(zzfar zzfarVar, zzfaf zzfafVar, List list) {
        return zze(zzfarVar, zzfafVar, false, "", "", list);
    }

    public final List zze(zzfar zzfarVar, zzfaf zzfafVar, boolean z4, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z7 = true;
            String strZzc = zzc(zzc(zzc((String) it.next(), "@gw_adlocid@", zzfarVar.zza.zza.zzf), "@gw_adnetrefresh@", true != z4 ? "0" : "1"), "@gw_sdkver@", this.zzb);
            if (zzfafVar != null) {
                strZzc = zzbxo.zzc(zzc(zzc(zzc(strZzc, "@gw_qdata@", zzfafVar.zzy), "@gw_adnetid@", zzfafVar.zzx), "@gw_allocid@", zzfafVar.zzw), this.zze, zzfafVar.zzW, zzfafVar.zzaw);
            }
            String strZzc2 = zzc(zzc(zzc(zzc(strZzc, "@gw_adnetstatus@", this.zza.zzg()), "@gw_ttr@", Long.toString(this.zza.zza(), 10)), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z8 = false;
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdJ)).booleanValue() && !TextUtils.isEmpty(str)) {
                z8 = true;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean z9 = !zIsEmpty;
            if (z8) {
                z7 = z9;
            } else {
                if (!zIsEmpty) {
                }
                arrayList.add(strZzc2);
            }
            if (this.zzi.zzf(Uri.parse(strZzc2))) {
                Uri.Builder builderBuildUpon = Uri.parse(strZzc2).buildUpon();
                if (z8) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z7) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strZzc2 = builderBuildUpon.build().toString();
            }
            arrayList.add(strZzc2);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006b A[LOOP:0: B:13:0x0065->B:15:0x006b, LOOP_END] */
    public final List zzf(zzfaf zzfafVar, List list, zzbva zzbvaVar) {
        zzfas zzfasVar;
        zzftf zzftfVarZzd;
        String str;
        String str2;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        ((p090m3.b) this.zzh).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            String strZzc = zzbvaVar.zzc();
            String string = Integer.toString(zzbvaVar.zzb());
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdK)).booleanValue()) {
                zzfat zzfatVar = this.zzg;
                if (zzfatVar == null) {
                    zzftfVarZzd = zzftf.zzc();
                } else {
                    zzfasVar = zzfatVar.zza;
                }
                str = (String) zzftfVarZzd.zza(new zzfsw() { // from class: com.google.android.gms.internal.ads.zzfht
                    @Override // com.google.android.gms.internal.ads.zzfsw
                    public final Object apply(Object obj) {
                        return zzfhv.zzg(((zzfas) obj).zza);
                    }
                }).zzb("");
                str2 = (String) zzftfVarZzd.zza(new zzfsw() { // from class: com.google.android.gms.internal.ads.zzfhu
                    @Override // com.google.android.gms.internal.ads.zzfsw
                    public final Object apply(Object obj) {
                        return zzfhv.zzg(((zzfas) obj).zzb);
                    }
                }).zzb("");
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(zzbxo.zzc(zzc(zzc(zzc(zzc(zzc(zzc((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(strZzc)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.zzb), this.zze, zzfafVar.zzW, zzfafVar.zzaw));
                }
                return arrayList;
            }
            zzfasVar = this.zzf;
            zzftfVarZzd = zzftf.zzd(zzfasVar);
            str = (String) zzftfVarZzd.zza(new zzfsw() { // from class: com.google.android.gms.internal.ads.zzfht
                @Override // com.google.android.gms.internal.ads.zzfsw
                public final Object apply(Object obj) {
                    return zzfhv.zzg(((zzfas) obj).zza);
                }
            }).zzb("");
            str2 = (String) zzftfVarZzd.zza(new zzfsw() { // from class: com.google.android.gms.internal.ads.zzfhu
                @Override // com.google.android.gms.internal.ads.zzfsw
                public final Object apply(Object obj) {
                    return zzfhv.zzg(((zzfas) obj).zzb);
                }
            }).zzb("");
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzbxo.zzc(zzc(zzc(zzc(zzc(zzc(zzc((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(strZzc)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.zzb), this.zze, zzfafVar.zzW, zzfafVar.zzaw));
            }
            return arrayList;
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.e("Unable to determine award type and amount.", e7);
            return arrayList;
        }
    }
}
