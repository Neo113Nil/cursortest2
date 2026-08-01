package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzeki implements zzhcv {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzekj zzb;

    zzeki(zzekj zzekjVar, boolean z) {
        this.zza = z;
        Objects.requireNonNull(zzekjVar);
        this.zzb = zzekjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    @Override // com.google.android.gms.internal.ads.zzhcv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<String> emptyList;
        List asList;
        char c;
        zzekj zzekjVar = this.zzb;
        Bundle bundle = (Bundle) obj;
        if (zzekjVar.zzf()) {
            return;
        }
        Object obj2 = bundle.get("ad_types");
        if (obj2 instanceof List) {
            asList = (List) obj2;
        } else {
            if (!(obj2 instanceof String[])) {
                emptyList = Collections.emptyList();
                final ArrayList arrayList = new ArrayList();
                for (String str : emptyList) {
                    switch (str.hashCode()) {
                        case -1396342996:
                            if (str.equals("banner")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1052618729:
                            if (str.equals("native")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -239580146:
                            if (str.equals("rewarded")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 604727084:
                            if (str.equals("interstitial")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    arrayList.add(c != 0 ? c != 1 ? c != 2 ? c != 3 ? zzbil.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzbil.zzd.zza.REWARD_BASED_VIDEO_AD : zzbil.zzd.zza.NATIVE_APP_INSTALL : zzbil.zzd.zza.INTERSTITIAL : zzbil.zzd.zza.BANNER);
                }
                final zzbil.zzaf.zzd zze = zzekj.zze(bundle);
                final zzbil.zzab zzb = zzekjVar.zzb(bundle);
                final boolean z = this.zza;
                zzekjVar.zza.zza(new zzfpi() { // from class: com.google.android.gms.internal.ads.zzekh
                    @Override // com.google.android.gms.internal.ads.zzfpi
                    public final /* synthetic */ Object zza(Object obj3) {
                        zzekj zzekjVar2 = zzeki.this.zzb;
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                        if (zzekjVar2.zzf()) {
                            return null;
                        }
                        zzbil.zzaf.zzd zzdVar = zze;
                        zzbil.zzab zzabVar = zzb;
                        ArrayList arrayList2 = arrayList;
                        boolean z2 = z;
                        byte[] zzc = zzekjVar2.zzc(z2, arrayList2, zzabVar, zzdVar);
                        zzekm.zzf(sQLiteDatabase, z2, true);
                        zzekm.zze(sQLiteDatabase, zzekjVar2.zzd().zzb(), zzc);
                        return null;
                    }
                });
            }
            asList = Arrays.asList((String[]) obj2);
        }
        ArrayList arrayList2 = new ArrayList(asList.size());
        for (Object obj3 : asList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        emptyList = Collections.unmodifiableList(arrayList2);
        final ArrayList arrayList3 = new ArrayList();
        while (r1.hasNext()) {
        }
        final zzbil.zzaf.zzd zze2 = zzekj.zze(bundle);
        final zzbil.zzab zzb2 = zzekjVar.zzb(bundle);
        final boolean z2 = this.zza;
        zzekjVar.zza.zza(new zzfpi() { // from class: com.google.android.gms.internal.ads.zzekh
            @Override // com.google.android.gms.internal.ads.zzfpi
            public final /* synthetic */ Object zza(Object obj32) {
                zzekj zzekjVar2 = zzeki.this.zzb;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj32;
                if (zzekjVar2.zzf()) {
                    return null;
                }
                zzbil.zzaf.zzd zzdVar = zze2;
                zzbil.zzab zzabVar = zzb2;
                ArrayList arrayList22 = arrayList3;
                boolean z22 = z2;
                byte[] zzc = zzekjVar2.zzc(z22, arrayList22, zzabVar, zzdVar);
                zzekm.zzf(sQLiteDatabase, z22, true);
                zzekm.zze(sQLiteDatabase, zzekjVar2.zzd().zzb(), zzc);
                return null;
            }
        });
    }
}
