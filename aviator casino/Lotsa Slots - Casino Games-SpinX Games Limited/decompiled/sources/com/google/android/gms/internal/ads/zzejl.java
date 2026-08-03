package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzejl extends com.google.android.gms.internal.ads.zzejm {
    private static final android.util.SparseArray zzg;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzdbw zzc;
    private final android.telephony.TelephonyManager zzd;
    private final com.google.android.gms.internal.ads.zzejd zze;
    private com.google.android.gms.internal.ads.zzbhv.zzq zzf;

    static {
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        zzg = sparseArray;
        sparseArray.put(android.net.NetworkInfo.DetailedState.CONNECTED.ordinal(), com.google.android.gms.internal.ads.zzbhv.zzaf.zzd.CONNECTED);
        sparseArray.put(android.net.NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), com.google.android.gms.internal.ads.zzbhv.zzaf.zzd.CONNECTING);
        sparseArray.put(android.net.NetworkInfo.DetailedState.CONNECTING.ordinal(), com.google.android.gms.internal.ads.zzbhv.zzaf.zzd.CONNECTING);
        sparseArray.put(android.net.NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), com.google.android.gms.internal.ads.zzbhv.zzaf.zzd.CONNECTING);
        sparseArray.put(android.net.NetworkInfo.DetailedState.DISCONNECTING.ordinal(), com.google.android.gms.internal.ads.zzbhv.zzaf.zzd.DISCONNECTING);
        sparseArray.put(android.net.NetworkInfo.DetailedState.BLOCKED.ordinal(), com.google.android.gms.internal.ads.zzbhv.zzaf.zzd.DISCONNECTED);
        sparseArray.put(android.net.NetworkInfo.DetailedState.DISCONNECTED.ordinal(), com.google.android.gms.internal.ads.zzbhv.zzaf.zzd.DISCONNECTED);
        sparseArray.put(android.net.NetworkInfo.DetailedState.FAILED.ordinal(), com.google.android.gms.internal.ads.zzbhv.zzaf.zzd.DISCONNECTED);
        sparseArray.put(android.net.NetworkInfo.DetailedState.IDLE.ordinal(), com.google.android.gms.internal.ads.zzbhv.zzaf.zzd.DISCONNECTED);
        sparseArray.put(android.net.NetworkInfo.DetailedState.SCANNING.ordinal(), com.google.android.gms.internal.ads.zzbhv.zzaf.zzd.DISCONNECTED);
        sparseArray.put(android.net.NetworkInfo.DetailedState.SUSPENDED.ordinal(), com.google.android.gms.internal.ads.zzbhv.zzaf.zzd.SUSPENDED);
        sparseArray.put(android.net.NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), com.google.android.gms.internal.ads.zzbhv.zzaf.zzd.CONNECTING);
        sparseArray.put(android.net.NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), com.google.android.gms.internal.ads.zzbhv.zzaf.zzd.CONNECTING);
    }

    zzejl(android.content.Context context, com.google.android.gms.internal.ads.zzdbw zzdbwVar, com.google.android.gms.internal.ads.zzejd zzejdVar, com.google.android.gms.internal.ads.zzeiz zzeizVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzeizVar, zzgVar);
        this.zzb = context;
        this.zzc = zzdbwVar;
        this.zze = zzejdVar;
        this.zzd = (android.telephony.TelephonyManager) context.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
    }

    static final /* synthetic */ com.google.android.gms.internal.ads.zzbhv.zzaf.zzd zze(android.os.Bundle bundle) {
        return (com.google.android.gms.internal.ads.zzbhv.zzaf.zzd) zzg.get(com.google.android.gms.internal.ads.zzfln.zza(com.google.android.gms.internal.ads.zzfln.zza(bundle, "device"), "network").getInt("active_network_state", -1), com.google.android.gms.internal.ads.zzbhv.zzaf.zzd.UNSPECIFIED);
    }

    private static final com.google.android.gms.internal.ads.zzbhv.zzq zzg(boolean z) {
        return z ? com.google.android.gms.internal.ads.zzbhv.zzq.ENUM_TRUE : com.google.android.gms.internal.ads.zzbhv.zzq.ENUM_FALSE;
    }

    public final void zza(boolean z) {
        com.google.android.gms.internal.ads.zzhbw.zzr(this.zzc.zza(new android.os.Bundle()), new com.google.android.gms.internal.ads.zzejk(this, z), com.google.android.gms.internal.ads.zzcfr.zzh);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzbhv.zzab zzb(android.os.Bundle bundle) {
        com.google.android.gms.internal.ads.zzbhv.zzab.zzb zzbVar;
        com.google.android.gms.internal.ads.zzbhv.zzab.zza zzq = com.google.android.gms.internal.ads.zzbhv.zzab.zzq();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        if (i == -1) {
            this.zzf = com.google.android.gms.internal.ads.zzbhv.zzq.ENUM_TRUE;
        } else {
            this.zzf = com.google.android.gms.internal.ads.zzbhv.zzq.ENUM_FALSE;
            if (i == 0) {
                zzq.zzc(com.google.android.gms.internal.ads.zzbhv.zzab.zzc.CELL);
            } else if (i != 1) {
                zzq.zzc(com.google.android.gms.internal.ads.zzbhv.zzab.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                zzq.zzc(com.google.android.gms.internal.ads.zzbhv.zzab.zzc.WIFI);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = com.google.android.gms.internal.ads.zzbhv.zzab.zzb.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzbVar = com.google.android.gms.internal.ads.zzbhv.zzab.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = com.google.android.gms.internal.ads.zzbhv.zzab.zzb.LTE;
                    break;
                default:
                    zzbVar = com.google.android.gms.internal.ads.zzbhv.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zzq.zzg(zzbVar);
        }
        return zzq.zzbu();
    }

    final /* synthetic */ byte[] zzc(boolean z, java.util.ArrayList arrayList, com.google.android.gms.internal.ads.zzbhv.zzab zzabVar, com.google.android.gms.internal.ads.zzbhv.zzaf.zzd zzdVar) {
        com.google.android.gms.internal.ads.zzbhv.zzaf.zza.C0070zza zzz = com.google.android.gms.internal.ads.zzbhv.zzaf.zza.zzz();
        zzz.zzv(arrayList);
        android.content.Context context = this.zzb;
        zzz.zzJ(zzg(android.provider.Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0));
        zzz.zzN(com.google.android.gms.ads.internal.zzt.zzf().zzf(context, this.zzd));
        com.google.android.gms.internal.ads.zzejd zzejdVar = this.zze;
        zzz.zzk(zzejdVar.zzf());
        zzz.zzo(zzejdVar.zzj());
        zzz.zzR(zzejdVar.zzd());
        zzz.zzZ(zzdVar);
        zzz.zzz(zzabVar);
        zzz.zzV(this.zzf);
        zzz.zzg(zzg(z));
        zzz.zzad(zzejdVar.zzb());
        zzz.zzc(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        zzz.zzF(zzg(android.provider.Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0));
        return zzz.zzbu().zzaN();
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzejd zzd() {
        return this.zze;
    }
}
