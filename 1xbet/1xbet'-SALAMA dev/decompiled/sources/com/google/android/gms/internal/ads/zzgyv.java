package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzgyv implements zzgzk {
    private final zzgyr zza;
    private final zzgzw zzb;
    private final boolean zzc;
    private final zzgwr zzd;

    private zzgyv(zzgzw zzgzwVar, zzgwr zzgwrVar, zzgyr zzgyrVar) {
        this.zzb = zzgzwVar;
        this.zzc = zzgyrVar instanceof zzgxc;
        this.zzd = zzgwrVar;
        this.zza = zzgyrVar;
    }

    public static zzgyv zzc(zzgzw zzgzwVar, zzgwr zzgwrVar, zzgyr zzgyrVar) {
        return new zzgyv(zzgzwVar, zzgwrVar, zzgyrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzk
    public final int zza(Object obj) {
        int iZzb = ((zzgxg) obj).zzt.zzb();
        return this.zzc ? iZzb + ((zzgxc) obj).zza.zzd() : iZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgzk
    public final int zzb(Object obj) {
        int iHashCode = ((zzgxg) obj).zzt.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzgxc) obj).zza.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzgzk
    public final Object zze() {
        zzgyr zzgyrVar = this.zza;
        return zzgyrVar instanceof zzgxg ? ((zzgxg) zzgyrVar).zzbj() : zzgyrVar.zzcX().zzbs();
    }

    @Override // com.google.android.gms.internal.ads.zzgzk
    public final void zzf(Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgzk
    public final void zzg(Object obj, Object obj2) {
        zzgzm.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            zzgzm.zzp(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzk
    public final void zzh(Object obj, zzgze zzgzeVar, zzgwq zzgwqVar) {
        this.zzb.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgzk
    public final void zzi(Object obj, byte[] bArr, int i7, int i8, zzgvm zzgvmVar) {
        zzgxg zzgxgVar = (zzgxg) obj;
        if (zzgxgVar.zzt == zzgzx.zzc()) {
            zzgxgVar.zzt = zzgzx.zzf();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgzk
    public final void zzj(Object obj, zzhal zzhalVar) {
        Iterator itZzf = ((zzgxc) obj).zza.zzf();
        while (itZzf.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzf.next();
            zzgwu zzgwuVar = (zzgwu) entry.getKey();
            if (zzgwuVar.zzc() != zzhak.MESSAGE || zzgwuVar.zze() || zzgwuVar.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zzgxy) {
                zzhalVar.zzw(zzgwuVar.zza(), ((zzgxy) entry).zza().zzb());
            } else {
                zzhalVar.zzw(zzgwuVar.zza(), entry.getValue());
            }
        }
        ((zzgxg) obj).zzt.zzk(zzhalVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzk
    public final boolean zzk(Object obj, Object obj2) {
        if (!((zzgxg) obj).zzt.equals(((zzgxg) obj2).zzt)) {
            return false;
        }
        if (this.zzc) {
            return ((zzgxc) obj).zza.equals(((zzgxc) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgzk
    public final boolean zzl(Object obj) {
        return ((zzgxc) obj).zza.zzi();
    }
}
