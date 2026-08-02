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
import m3.InterfaceC1436a;

/* loaded from: classes.dex */
public final class zzfhv {
    private final zzefg zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfas zzf;
    private final zzfat zzg;
    private final InterfaceC1436a zzh;
    private final zzauo zzi;

    public zzfhv(zzefg zzefgVar, VersionInfoParcel versionInfoParcel, String str, String str2, Context context, zzfas zzfasVar, zzfat zzfatVar, InterfaceC1436a interfaceC1436a, zzauo zzauoVar) {
        this.zza = zzefgVar;
        this.zzb = versionInfoParcel.f10834a;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfasVar;
        this.zzg = zzfatVar;
        this.zzh = interfaceC1436a;
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
        return TextUtils.isEmpty(str) ? "" : g.c() ? "fakeForAdDebugLog" : str;
    }

    public final List zzd(zzfar zzfarVar, zzfaf zzfafVar, List list) {
        return zze(zzfarVar, zzfafVar, false, "", "", list);
    }

    public final List zze(zzfar zzfarVar, zzfaf zzfafVar, boolean z4, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z7 = true;
            String zzc = zzc(zzc(zzc((String) it.next(), "@gw_adlocid@", zzfarVar.zza.zza.zzf), "@gw_adnetrefresh@", true != z4 ? "0" : "1"), "@gw_sdkver@", this.zzb);
            if (zzfafVar != null) {
                zzc = zzbxo.zzc(zzc(zzc(zzc(zzc, "@gw_qdata@", zzfafVar.zzy), "@gw_adnetid@", zzfafVar.zzx), "@gw_allocid@", zzfafVar.zzw), this.zze, zzfafVar.zzW, zzfafVar.zzaw);
            }
            String zzc2 = zzc(zzc(zzc(zzc(zzc, "@gw_adnetstatus@", this.zza.zzg()), "@gw_ttr@", Long.toString(this.zza.zza(), 10)), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z8 = false;
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdJ)).booleanValue() && !TextUtils.isEmpty(str)) {
                z8 = true;
            }
            boolean isEmpty = TextUtils.isEmpty(str2);
            boolean z9 = !isEmpty;
            if (z8) {
                z7 = z9;
            } else if (isEmpty) {
                arrayList.add(zzc2);
            }
            if (this.zzi.zzf(Uri.parse(zzc2))) {
                Uri.Builder buildUpon = Uri.parse(zzc2).buildUpon();
                if (z8) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z7) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                zzc2 = buildUpon.build().toString();
            }
            arrayList.add(zzc2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b A[LOOP:0: B:10:0x0065->B:12:0x006b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzf(zzfaf zzfafVar, List list, zzbva zzbvaVar) {
        zzfas zzfasVar;
        zzftf zzd;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        ((m3.b) this.zzh).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            String zzc = zzbvaVar.zzc();
            String num = Integer.toString(zzbvaVar.zzb());
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdK)).booleanValue()) {
                zzfat zzfatVar = this.zzg;
                if (zzfatVar == null) {
                    zzd = zzftf.zzc();
                    String str = (String) zzd.zza(new zzfsw() { // from class: com.google.android.gms.internal.ads.zzfht
                        @Override // com.google.android.gms.internal.ads.zzfsw
                        public final Object apply(Object obj) {
                            String zzg;
                            zzg = zzfhv.zzg(((zzfas) obj).zza);
                            return zzg;
                        }
                    }).zzb("");
                    String str2 = (String) zzd.zza(new zzfsw() { // from class: com.google.android.gms.internal.ads.zzfhu
                        @Override // com.google.android.gms.internal.ads.zzfsw
                        public final Object apply(Object obj) {
                            String zzg;
                            zzg = zzfhv.zzg(((zzfas) obj).zzb);
                            return zzg;
                        }
                    }).zzb("");
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(zzbxo.zzc(zzc(zzc(zzc(zzc(zzc(zzc((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(zzc)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.zzb), this.zze, zzfafVar.zzW, zzfafVar.zzaw));
                    }
                    return arrayList;
                }
                zzfasVar = zzfatVar.zza;
            } else {
                zzfasVar = this.zzf;
            }
            zzd = zzftf.zzd(zzfasVar);
            String str3 = (String) zzd.zza(new zzfsw() { // from class: com.google.android.gms.internal.ads.zzfht
                @Override // com.google.android.gms.internal.ads.zzfsw
                public final Object apply(Object obj) {
                    String zzg;
                    zzg = zzfhv.zzg(((zzfas) obj).zza);
                    return zzg;
                }
            }).zzb("");
            String str22 = (String) zzd.zza(new zzfsw() { // from class: com.google.android.gms.internal.ads.zzfhu
                @Override // com.google.android.gms.internal.ads.zzfsw
                public final Object apply(Object obj) {
                    String zzg;
                    zzg = zzfhv.zzg(((zzfas) obj).zzb);
                    return zzg;
                }
            }).zzb("");
            it = list.iterator();
            while (it.hasNext()) {
            }
            return arrayList;
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.e("Unable to determine award type and amount.", e7);
            return arrayList;
        }
    }
}
