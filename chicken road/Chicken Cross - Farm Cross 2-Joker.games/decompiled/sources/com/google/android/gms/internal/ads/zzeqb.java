package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzeqb {
    private final Clock zza;
    private final zzeqd zzb;
    private final zzfte zzc;
    private final LinkedHashMap zzd = new LinkedHashMap();
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhT)).booleanValue();
    private final zzemv zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzeqb(Clock clock, zzeqd zzeqdVar, zzemv zzemvVar, zzfte zzfteVar) {
        this.zza = clock;
        this.zzb = zzeqdVar;
        this.zzf = zzemvVar;
        this.zzc = zzfteVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public final synchronized boolean zzi(zzfld zzfldVar) {
        zzeqa zzeqaVar = (zzeqa) this.zzd.get(zzfldVar);
        if (zzeqaVar == null) {
            return false;
        }
        return zzeqaVar.zzc == 8;
    }

    public final synchronized void zza() {
        this.zzi = this.zza.elapsedRealtime();
    }

    public final synchronized void zzb() {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
    }

    public final synchronized void zzc(List list) {
        this.zzi = this.zza.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfld zzfldVar = (zzfld) it.next();
            String str = zzfldVar.zzw;
            if (!TextUtils.isEmpty(str)) {
                this.zzd.put(zzfldVar, new zzeqa(str, zzfldVar.zzaf, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void zzd(zzfld zzfldVar) {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
        if (zzfldVar != null) {
            this.zzf.zzi(zzfldVar);
        }
        this.zzg = true;
    }

    final synchronized ListenableFuture zze(zzflo zzfloVar, zzfld zzfldVar, ListenableFuture listenableFuture, zzfta zzftaVar) {
        zzflg zzflgVar = zzfloVar.zzb.zzb;
        long elapsedRealtime = this.zza.elapsedRealtime();
        String str = zzfldVar.zzw;
        if (str != null) {
            this.zzd.put(zzfldVar, new zzeqa(str, zzfldVar.zzaf, 9, 0L, null));
            zzhcy.zzr(listenableFuture, new zzepz(this, elapsedRealtime, zzflgVar, zzfldVar, str, zzftaVar, zzfloVar), zzcgj.zzh);
        }
        return listenableFuture;
    }

    public final synchronized void zzf(zzfld zzfldVar) {
        zzeqa zzeqaVar = (zzeqa) this.zzd.get(zzfldVar);
        if (zzeqaVar == null || this.zzg) {
            return;
        }
        zzeqaVar.zzc = 8;
    }

    public final synchronized String zzg() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.zzd.entrySet().iterator();
        while (it.hasNext()) {
            zzeqa zzeqaVar = (zzeqa) ((Map.Entry) it.next()).getValue();
            if (zzeqaVar.zzc != Integer.MAX_VALUE) {
                arrayList.add(zzeqaVar.toString());
            }
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized long zzh() {
        return this.zzh;
    }

    final /* synthetic */ Clock zzj() {
        return this.zza;
    }

    final /* synthetic */ zzeqd zzk() {
        return this.zzb;
    }

    final /* synthetic */ zzfte zzl() {
        return this.zzc;
    }

    final /* synthetic */ LinkedHashMap zzm() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzn() {
        return this.zze;
    }

    final /* synthetic */ zzemv zzo() {
        return this.zzf;
    }

    final /* synthetic */ boolean zzp() {
        return this.zzg;
    }
}
