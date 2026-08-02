package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbbd;
import io.sentry.protocol.SentryStackFrame;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class zzdzi implements zzgay {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzdzj zzb;

    public zzdzi(zzdzj zzdzjVar, boolean z4) {
        this.zza = z4;
        this.zzb = zzdzjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        int i7 = J.f3546b;
        j.d("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    @Override // com.google.android.gms.internal.ads.zzgay
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<String> emptyList;
        List asList;
        char c3;
        zzcts zzctsVar = (zzcts) obj;
        if (this.zzb.zzf()) {
            return;
        }
        Bundle bundle = zzctsVar.zza;
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
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1052618729:
                            if (str.equals(SentryStackFrame.JsonKeys.NATIVE)) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -239580146:
                            if (str.equals("rewarded")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 604727084:
                            if (str.equals("interstitial")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    arrayList.add(c3 != 0 ? c3 != 1 ? c3 != 2 ? c3 != 3 ? zzbbd.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzbbd.zzd.zza.REWARD_BASED_VIDEO_AD : zzbbd.zzd.zza.NATIVE_APP_INSTALL : zzbbd.zzd.zza.INTERSTITIAL : zzbbd.zzd.zza.BANNER);
                }
                final zzbbd.zzaf.zzd zzb = zzdzj.zzb(this.zzb, bundle);
                final zzbbd.zzab zza = zzdzj.zza(this.zzb, bundle);
                zzdzj zzdzjVar = this.zzb;
                final boolean z4 = this.zza;
                zzdzjVar.zza.zza(new zzfei() { // from class: com.google.android.gms.internal.ads.zzdzh
                    @Override // com.google.android.gms.internal.ads.zzfei
                    public final Object zza(Object obj3) {
                        zzdzb zzdzbVar;
                        zzdzi zzdziVar = zzdzi.this;
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                        if (zzdziVar.zzb.zzf()) {
                            return null;
                        }
                        zzbbd.zzaf.zzd zzdVar = zzb;
                        zzbbd.zzab zzabVar = zza;
                        ArrayList arrayList2 = arrayList;
                        boolean z7 = z4;
                        byte[] zze = zzdzj.zze(zzdziVar.zzb, z7, arrayList2, zzabVar, zzdVar);
                        zzdzm.zzf(sQLiteDatabase, z7, true);
                        zzdzbVar = zzdziVar.zzb.zzf;
                        zzdzm.zzc(sQLiteDatabase, zzdzbVar.zzd(), zze);
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
        while (r0.hasNext()) {
        }
        final zzbbd.zzaf.zzd zzb2 = zzdzj.zzb(this.zzb, bundle);
        final zzbbd.zzab zza2 = zzdzj.zza(this.zzb, bundle);
        zzdzj zzdzjVar2 = this.zzb;
        final boolean z42 = this.zza;
        zzdzjVar2.zza.zza(new zzfei() { // from class: com.google.android.gms.internal.ads.zzdzh
            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object zza(Object obj32) {
                zzdzb zzdzbVar;
                zzdzi zzdziVar = zzdzi.this;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj32;
                if (zzdziVar.zzb.zzf()) {
                    return null;
                }
                zzbbd.zzaf.zzd zzdVar = zzb2;
                zzbbd.zzab zzabVar = zza2;
                ArrayList arrayList22 = arrayList3;
                boolean z7 = z42;
                byte[] zze = zzdzj.zze(zzdziVar.zzb, z7, arrayList22, zzabVar, zzdVar);
                zzdzm.zzf(sQLiteDatabase, z7, true);
                zzdzbVar = zzdziVar.zzb.zzf;
                zzdzm.zzc(sQLiteDatabase, zzdzbVar.zzd(), zze);
                return null;
            }
        });
    }
}
