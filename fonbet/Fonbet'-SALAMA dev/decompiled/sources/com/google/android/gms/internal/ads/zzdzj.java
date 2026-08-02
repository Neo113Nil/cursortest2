package com.google.android.gms.internal.ads;

import E2.o;
import I2.L;
import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzbbd;
import io.sentry.protocol.Device;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzdzj extends zzdzk {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzctt zzd;
    private final TelephonyManager zze;
    private final zzdzb zzf;
    private zzbbd.zzq zzg;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbbd.zzaf.zzd.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbbd.zzaf.zzd zzdVar = zzbbd.zzaf.zzd.CONNECTING;
        sparseArray.put(ordinal, zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbbd.zzaf.zzd.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbbd.zzaf.zzd zzdVar2 = zzbbd.zzaf.zzd.DISCONNECTED;
        sparseArray.put(ordinal2, zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbbd.zzaf.zzd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzdVar);
    }

    public zzdzj(Context context, zzctt zzcttVar, zzdzb zzdzbVar, zzdyx zzdyxVar, L l7) {
        super(zzdyxVar, l7);
        this.zzc = context;
        this.zzd = zzcttVar;
        this.zzf = zzdzbVar;
        this.zze = (TelephonyManager) context.getSystemService("phone");
    }

    public static /* bridge */ /* synthetic */ zzbbd.zzab zza(zzdzj zzdzjVar, Bundle bundle) {
        zzbbd.zzab.zzb zzbVar;
        zzbbd.zzab.zza zza = zzbbd.zzab.zza();
        int i7 = bundle.getInt("cnt", -2);
        int i8 = bundle.getInt("gnt", 0);
        if (i7 == -1) {
            zzdzjVar.zzg = zzbbd.zzq.ENUM_TRUE;
        } else {
            zzdzjVar.zzg = zzbbd.zzq.ENUM_FALSE;
            if (i7 == 0) {
                zza.zzd(zzbbd.zzab.zzc.CELL);
            } else if (i7 != 1) {
                zza.zzd(zzbbd.zzab.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                zza.zzd(zzbbd.zzab.zzc.WIFI);
            }
            switch (i8) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zzbbd.zzab.zzb.TWO_G;
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
                    zzbVar = zzbbd.zzab.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = zzbbd.zzab.zzb.LTE;
                    break;
                default:
                    zzbVar = zzbbd.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zza.zzc(zzbVar);
        }
        return zza.zzbr();
    }

    public static /* bridge */ /* synthetic */ zzbbd.zzaf.zzd zzb(zzdzj zzdzjVar, Bundle bundle) {
        return (zzbbd.zzaf.zzd) zzb.get(zzfbo.zza(zzfbo.zza(bundle, Device.TYPE), "network").getInt("active_network_state", -1), zzbbd.zzaf.zzd.UNSPECIFIED);
    }

    public static byte[] zze(zzdzj zzdzjVar, boolean z4, ArrayList arrayList, zzbbd.zzab zzabVar, zzbbd.zzaf.zzd zzdVar) {
        zzbbd.zzaf.zza.C0002zza zzn = zzbbd.zzaf.zza.zzn();
        zzn.zzn(arrayList);
        zzn.zzD(zzg(Settings.Global.getInt(zzdzjVar.zzc.getContentResolver(), "airplane_mode_on", 0) != 0));
        o oVar = o.f1952C;
        zzn.zzE(oVar.f1959e.b(zzdzjVar.zzc, zzdzjVar.zze));
        zzn.zzM(zzdzjVar.zzf.zze());
        zzn.zzL(zzdzjVar.zzf.zzb());
        zzn.zzG(zzdzjVar.zzf.zza());
        zzn.zzH(zzdVar);
        zzn.zzJ(zzabVar);
        zzn.zzK(zzdzjVar.zzg);
        zzn.zzN(zzg(z4));
        zzn.zzP(zzdzjVar.zzf.zzd());
        oVar.j.getClass();
        zzn.zzO(System.currentTimeMillis());
        zzn.zzQ(zzg(Settings.Global.getInt(zzdzjVar.zzc.getContentResolver(), "wifi_on", 0) != 0));
        return zzn.zzbr().zzaV();
    }

    private static final zzbbd.zzq zzg(boolean z4) {
        return z4 ? zzbbd.zzq.ENUM_TRUE : zzbbd.zzq.ENUM_FALSE;
    }

    public final void zzd(boolean z4) {
        zzgbc.zzr(this.zzd.zzb(new Bundle()), new zzdzi(this, z4), zzbza.zzg);
    }
}
