package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import io.sentry.protocol.SentryStackFrame;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
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
    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x008c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x0096  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x009f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab  */
    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List listEmptyList;
        List listAsList;
        final ArrayList arrayList;
        Iterator it;
        byte b7;
        zzbbd.zzd.zza zzaVar;
        zzcts zzctsVar = (zzcts) obj;
        if (this.zzb.zzf()) {
            return;
        }
        Bundle bundle = zzctsVar.zza;
        Object obj2 = bundle.get("ad_types");
        if (!(obj2 instanceof List)) {
            if (obj2 instanceof String[]) {
                listAsList = Arrays.asList((String[]) obj2);
            } else {
                listEmptyList = Collections.emptyList();
            }
            arrayList = new ArrayList();
            it = listEmptyList.iterator();
            while (it.hasNext()) {
                switch ((String) it.next()) {
                    case "banner":
                        b7 = 0;
                        break;
                    case "native":
                        b7 = 2;
                        break;
                    case "rewarded":
                        b7 = 3;
                        break;
                    case "interstitial":
                        b7 = 1;
                        break;
                    default:
                        b7 = -1;
                        break;
                }
                if (b7 != 0) {
                    zzaVar = zzbbd.zzd.zza.BANNER;
                } else if (b7 != 1) {
                    zzaVar = zzbbd.zzd.zza.INTERSTITIAL;
                } else if (b7 != 2) {
                    zzaVar = zzbbd.zzd.zza.NATIVE_APP_INSTALL;
                } else if (b7 != 3) {
                    zzaVar = zzbbd.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                } else {
                    zzaVar = zzbbd.zzd.zza.REWARD_BASED_VIDEO_AD;
                }
                arrayList.add(zzaVar);
            }
            final zzbbd.zzaf.zzd zzdVarZzb = zzdzj.zzb(this.zzb, bundle);
            final zzbbd.zzab zzabVarZza = zzdzj.zza(this.zzb, bundle);
            zzdzj zzdzjVar = this.zzb;
            final boolean z4 = this.zza;
            zzdzjVar.zza.zza(new zzfei() { // from class: com.google.android.gms.internal.ads.zzdzh
                @Override // com.google.android.gms.internal.ads.zzfei
                public final Object zza(Object obj3) {
                    zzdzi zzdziVar = this.zza;
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                    if (zzdziVar.zzb.zzf()) {
                        return null;
                    }
                    zzbbd.zzaf.zzd zzdVar = zzdVarZzb;
                    zzbbd.zzab zzabVar = zzabVarZza;
                    ArrayList arrayList2 = arrayList;
                    boolean z7 = z4;
                    byte[] bArrZze = zzdzj.zze(zzdziVar.zzb, z7, arrayList2, zzabVar, zzdVar);
                    zzdzm.zzf(sQLiteDatabase, z7, true);
                    zzdzm.zzc(sQLiteDatabase, zzdziVar.zzb.zzf.zzd(), bArrZze);
                    return null;
                }
            });
        }
        listAsList = (List) obj2;
        ArrayList arrayList2 = new ArrayList(listAsList.size());
        for (Object obj3 : listAsList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        listEmptyList = Collections.unmodifiableList(arrayList2);
        arrayList = new ArrayList();
        it = listEmptyList.iterator();
        while (it.hasNext()) {
            switch ((String) it.next()) {
                case -1396342996:
                    if (!r1.equals("banner")) {
                        b7 = 0;
                    } else {
                        b7 = -1;
                    }
                    break;
                case -1052618729:
                    if (!r1.equals(SentryStackFrame.JsonKeys.NATIVE)) {
                        b7 = 2;
                    } else {
                        b7 = -1;
                    }
                    break;
                case -239580146:
                    if (!r1.equals("rewarded")) {
                        b7 = 3;
                    } else {
                        b7 = -1;
                    }
                    break;
                case 604727084:
                    if (!r1.equals("interstitial")) {
                        b7 = 1;
                    } else {
                        b7 = -1;
                    }
                    break;
                default:
                    b7 = -1;
                    break;
            }
            if (b7 != 0) {
                zzaVar = zzbbd.zzd.zza.BANNER;
            } else if (b7 != 1) {
                zzaVar = zzbbd.zzd.zza.INTERSTITIAL;
            } else if (b7 != 2) {
                zzaVar = zzbbd.zzd.zza.NATIVE_APP_INSTALL;
            } else if (b7 != 3) {
                zzaVar = zzbbd.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
            } else {
                zzaVar = zzbbd.zzd.zza.REWARD_BASED_VIDEO_AD;
            }
            arrayList.add(zzaVar);
        }
        final zzbbd.zzaf.zzd zzdVarZzb2 = zzdzj.zzb(this.zzb, bundle);
        final zzbbd.zzab zzabVarZza2 = zzdzj.zza(this.zzb, bundle);
        zzdzj zzdzjVar2 = this.zzb;
        final boolean z7 = this.zza;
        zzdzjVar2.zza.zza(new zzfei() { // from class: com.google.android.gms.internal.ads.zzdzh
            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object zza(Object obj4) {
                zzdzi zzdziVar = this.zza;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj4;
                if (zzdziVar.zzb.zzf()) {
                    return null;
                }
                zzbbd.zzaf.zzd zzdVar = zzdVarZzb2;
                zzbbd.zzab zzabVar = zzabVarZza2;
                ArrayList arrayList3 = arrayList;
                boolean z8 = z7;
                byte[] bArrZze = zzdzj.zze(zzdziVar.zzb, z8, arrayList3, zzabVar, zzdVar);
                zzdzm.zzf(sQLiteDatabase, z8, true);
                zzdzm.zzc(sQLiteDatabase, zzdziVar.zzb.zzf.zzd(), bArrZze);
                return null;
            }
        });
    }
}
