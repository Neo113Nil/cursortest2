package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzdb;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzck implements zzgj {
    private final zzci zzmo;

    private zzck(zzci zzciVar) {
        this.zzmo = (zzci) zzdd.zza(zzciVar, "output");
        this.zzmo.zzng = this;
    }

    public static zzck zza(zzci zzciVar) {
        return zzciVar.zzng != null ? zzciVar.zzng : new zzck(zzciVar);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zza(int i, double d) throws IOException {
        this.zzmo.zza(i, d);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zza(int i, float f) throws IOException {
        this.zzmo.zza(i, f);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zza(int i, long j) throws IOException {
        this.zzmo.zza(i, j);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zza(int i, zzbu zzbuVar) throws IOException {
        this.zzmo.zza(i, zzbuVar);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final <K, V> void zza(int i, zzea<K, V> zzeaVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zzmo.zzb(i, 2);
            this.zzmo.zzx(zzdz.zza(zzeaVar, entry.getKey(), entry.getValue()));
            zzdz.zza(this.zzmo, zzeaVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zza(int i, Object obj) throws IOException {
        if (obj instanceof zzbu) {
            this.zzmo.zzb(i, (zzbu) obj);
        } else {
            this.zzmo.zzb(i, (zzeh) obj);
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zza(int i, Object obj, zzev zzevVar) throws IOException {
        this.zzmo.zza(i, (zzeh) obj, zzevVar);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zza(int i, String str) throws IOException {
        this.zzmo.zza(i, str);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zza(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzdq)) {
            while (i2 < list.size()) {
                this.zzmo.zza(i, list.get(i2));
                i2++;
            }
            return;
        }
        zzdq zzdqVar = (zzdq) list;
        while (i2 < list.size()) {
            Object raw = zzdqVar.getRaw(i2);
            if (raw instanceof String) {
                this.zzmo.zza(i, (String) raw);
            } else {
                this.zzmo.zza(i, (zzbu) raw);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zza(int i, List<?> list, zzev zzevVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zza(i, list.get(i2), zzevVar);
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zza(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzmo.zzc(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.zzmo.zzb(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzci.zzab(list.get(i4).intValue());
        }
        this.zzmo.zzx(i3);
        while (i2 < list.size()) {
            this.zzmo.zzw(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zzaj(int i) throws IOException {
        this.zzmo.zzb(i, 3);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zzak(int i) throws IOException {
        this.zzmo.zzb(i, 4);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zzb(int i, long j) throws IOException {
        this.zzmo.zzb(i, j);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zzb(int i, Object obj, zzev zzevVar) throws IOException {
        zzci zzciVar = this.zzmo;
        zzciVar.zzb(i, 3);
        zzevVar.zza((zzeh) obj, zzciVar.zzng);
        zzciVar.zzb(i, 4);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zzb(int i, List<zzbu> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zzmo.zza(i, list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zzb(int i, List<?> list, zzev zzevVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzb(i, list.get(i2), zzevVar);
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zzb(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzmo.zzf(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.zzmo.zzb(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzci.zzae(list.get(i4).intValue());
        }
        this.zzmo.zzx(i3);
        while (i2 < list.size()) {
            this.zzmo.zzz(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zzb(int i, boolean z) throws IOException {
        this.zzmo.zzb(i, z);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zzc(int i, int i2) throws IOException {
        this.zzmo.zzc(i, i2);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zzc(int i, long j) throws IOException {
        this.zzmo.zzc(i, j);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zzc(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzmo.zza(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.zzmo.zzb(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzci.zzd(list.get(i4).longValue());
        }
        this.zzmo.zzx(i3);
        while (i2 < list.size()) {
            this.zzmo.zza(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zzd(int i, int i2) throws IOException {
        this.zzmo.zzd(i, i2);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zzd(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzmo.zza(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.zzmo.zzb(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzci.zze(list.get(i4).longValue());
        }
        this.zzmo.zzx(i3);
        while (i2 < list.size()) {
            this.zzmo.zza(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final int zzdf() {
        return zzdb.zze.zzrp;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zze(int i, int i2) throws IOException {
        this.zzmo.zze(i, i2);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zze(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzmo.zzc(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.zzmo.zzb(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzci.zzg(list.get(i4).longValue());
        }
        this.zzmo.zzx(i3);
        while (i2 < list.size()) {
            this.zzmo.zzc(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zzf(int i, int i2) throws IOException {
        this.zzmo.zzf(i, i2);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zzf(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzmo.zza(i, list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        this.zzmo.zzb(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzci.zzb(list.get(i4).floatValue());
        }
        this.zzmo.zzx(i3);
        while (i2 < list.size()) {
            this.zzmo.zza(list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zzg(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzmo.zza(i, list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        this.zzmo.zzb(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzci.zzb(list.get(i4).doubleValue());
        }
        this.zzmo.zzx(i3);
        while (i2 < list.size()) {
            this.zzmo.zza(list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zzh(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzmo.zzc(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.zzmo.zzb(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzci.zzag(list.get(i4).intValue());
        }
        this.zzmo.zzx(i3);
        while (i2 < list.size()) {
            this.zzmo.zzw(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zzi(int i, long j) throws IOException {
        this.zzmo.zza(i, j);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zzi(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzmo.zzb(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        this.zzmo.zzb(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzci.zzg(list.get(i4).booleanValue());
        }
        this.zzmo.zzx(i3);
        while (i2 < list.size()) {
            this.zzmo.zzf(list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zzj(int i, long j) throws IOException {
        this.zzmo.zzc(i, j);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zzj(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzmo.zzd(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.zzmo.zzb(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzci.zzac(list.get(i4).intValue());
        }
        this.zzmo.zzx(i3);
        while (i2 < list.size()) {
            this.zzmo.zzx(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zzk(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzmo.zzf(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.zzmo.zzb(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzci.zzaf(list.get(i4).intValue());
        }
        this.zzmo.zzx(i3);
        while (i2 < list.size()) {
            this.zzmo.zzz(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zzl(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzmo.zzc(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.zzmo.zzb(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzci.zzh(list.get(i4).longValue());
        }
        this.zzmo.zzx(i3);
        while (i2 < list.size()) {
            this.zzmo.zzc(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zzm(int i, int i2) throws IOException {
        this.zzmo.zzf(i, i2);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zzm(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzmo.zze(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.zzmo.zzb(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzci.zzad(list.get(i4).intValue());
        }
        this.zzmo.zzx(i3);
        while (i2 < list.size()) {
            this.zzmo.zzy(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zzn(int i, int i2) throws IOException {
        this.zzmo.zzc(i, i2);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgj
    public final void zzn(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzmo.zzb(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.zzmo.zzb(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzci.zzf(list.get(i4).longValue());
        }
        this.zzmo.zzx(i3);
        while (i2 < list.size()) {
            this.zzmo.zzb(list.get(i2).longValue());
            i2++;
        }
    }
}
