package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzeq implements com.google.android.gms.internal.play_games_inputmapping.zzhu {
    private final com.google.android.gms.internal.play_games_inputmapping.zzep zza;

    private zzeq(com.google.android.gms.internal.play_games_inputmapping.zzep zzepVar) {
        com.google.android.gms.internal.play_games_inputmapping.zzfi.zzb(zzepVar, "output");
        this.zza = zzepVar;
        zzepVar.zza = this;
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzeq zza(com.google.android.gms.internal.play_games_inputmapping.zzep zzepVar) {
        com.google.android.gms.internal.play_games_inputmapping.zzeq zzeqVar = zzepVar.zza;
        return zzeqVar != null ? zzeqVar : new com.google.android.gms.internal.play_games_inputmapping.zzeq(zzepVar);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzC(int i, java.util.List list) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_games_inputmapping.zzfp)) {
            while (i2 < list.size()) {
                this.zza.zzh(i, (java.lang.String) list.get(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_games_inputmapping.zzfp zzfpVar = (com.google.android.gms.internal.play_games_inputmapping.zzfp) list;
        while (i2 < list.size()) {
            java.lang.Object zze = zzfpVar.zze(i2);
            if (zze instanceof java.lang.String) {
                this.zza.zzh(i, (java.lang.String) zze);
            } else {
                this.zza.zzi(i, (com.google.android.gms.internal.play_games_inputmapping.zzek) zze);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzD(int i, java.util.List list) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzi(i, (com.google.android.gms.internal.play_games_inputmapping.zzek) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzb(int i, int i2) throws java.io.IOException {
        this.zza.zzd(i, i2);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzc(int i, long j) throws java.io.IOException {
        this.zza.zze(i, j);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzd(int i, long j) throws java.io.IOException {
        this.zza.zzf(i, j);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zze(int i, float f) throws java.io.IOException {
        this.zza.zzd(i, java.lang.Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzf(int i, double d) throws java.io.IOException {
        this.zza.zzf(i, java.lang.Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzg(int i, int i2) throws java.io.IOException {
        this.zza.zzb(i, i2);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzh(int i, long j) throws java.io.IOException {
        this.zza.zze(i, j);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzi(int i, int i2) throws java.io.IOException {
        this.zza.zzb(i, i2);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzj(int i, long j) throws java.io.IOException {
        this.zza.zzf(i, j);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzk(int i, int i2) throws java.io.IOException {
        this.zza.zzd(i, i2);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzl(int i, boolean z) throws java.io.IOException {
        this.zza.zzg(i, z);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzm(int i, java.lang.String str) throws java.io.IOException {
        this.zza.zzh(i, str);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzn(int i, com.google.android.gms.internal.play_games_inputmapping.zzek zzekVar) throws java.io.IOException {
        this.zza.zzi(i, zzekVar);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzo(int i, int i2) throws java.io.IOException {
        this.zza.zzc(i, i2);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzp(int i, int i2) throws java.io.IOException {
        this.zza.zzc(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzq(int i, long j) throws java.io.IOException {
        this.zza.zze(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzr(int i, java.lang.Object obj, com.google.android.gms.internal.play_games_inputmapping.zzgp zzgpVar) throws java.io.IOException {
        java.lang.Object obj2 = (com.google.android.gms.internal.play_games_inputmapping.zzge) obj;
        com.google.android.gms.internal.play_games_inputmapping.zzen zzenVar = (com.google.android.gms.internal.play_games_inputmapping.zzen) this.zza;
        zzenVar.zzl((i << 3) | 2);
        com.google.android.gms.internal.play_games_inputmapping.zzdy zzdyVar = (com.google.android.gms.internal.play_games_inputmapping.zzdy) obj2;
        int zzh = zzdyVar.zzh();
        if (zzh == -1) {
            zzh = zzgpVar.zzd(zzdyVar);
            zzdyVar.zzi(zzh);
        }
        zzenVar.zzl(zzh);
        zzgpVar.zze(obj2, zzenVar.zza);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzs(int i, java.lang.Object obj, com.google.android.gms.internal.play_games_inputmapping.zzgp zzgpVar) throws java.io.IOException {
        com.google.android.gms.internal.play_games_inputmapping.zzep zzepVar = this.zza;
        zzepVar.zza(i, 3);
        zzgpVar.zze((com.google.android.gms.internal.play_games_inputmapping.zzge) obj, zzepVar.zza);
        zzepVar.zza(i, 4);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzA(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzb(i, ((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zza(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += com.google.android.gms.internal.play_games_inputmapping.zzep.zzv(((java.lang.Integer) list.get(i4)).intValue());
        }
        this.zza.zzl(i3);
        while (i2 < list.size()) {
            this.zza.zzk(((java.lang.Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzB(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzg(i, ((java.lang.Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.zza.zza(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((java.lang.Boolean) list.get(i4)).booleanValue();
            i3++;
        }
        this.zza.zzl(i3);
        while (i2 < list.size()) {
            this.zza.zzj(((java.lang.Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzE(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzc(i, ((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zza(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(((java.lang.Integer) list.get(i4)).intValue());
        }
        this.zza.zzl(i3);
        while (i2 < list.size()) {
            this.zza.zzl(((java.lang.Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzF(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzd(i, ((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zza(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((java.lang.Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        this.zza.zzl(i3);
        while (i2 < list.size()) {
            this.zza.zzm(((java.lang.Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzG(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzf(i, ((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zza(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((java.lang.Long) list.get(i4)).longValue();
            i3 += 8;
        }
        this.zza.zzl(i3);
        while (i2 < list.size()) {
            this.zza.zzo(((java.lang.Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzH(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                com.google.android.gms.internal.play_games_inputmapping.zzep zzepVar = this.zza;
                int intValue = ((java.lang.Integer) list.get(i2)).intValue();
                zzepVar.zzc(i, (intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
            return;
        }
        this.zza.zza(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((java.lang.Integer) list.get(i4)).intValue();
            i3 += com.google.android.gms.internal.play_games_inputmapping.zzep.zzw((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.zza.zzl(i3);
        while (i2 < list.size()) {
            com.google.android.gms.internal.play_games_inputmapping.zzep zzepVar2 = this.zza;
            int intValue3 = ((java.lang.Integer) list.get(i2)).intValue();
            zzepVar2.zzl((intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzI(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                com.google.android.gms.internal.play_games_inputmapping.zzep zzepVar = this.zza;
                long longValue = ((java.lang.Long) list.get(i2)).longValue();
                zzepVar.zze(i, (longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
            return;
        }
        this.zza.zza(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((java.lang.Long) list.get(i4)).longValue();
            i3 += com.google.android.gms.internal.play_games_inputmapping.zzep.zzx((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.zza.zzl(i3);
        while (i2 < list.size()) {
            com.google.android.gms.internal.play_games_inputmapping.zzep zzepVar2 = this.zza;
            long longValue3 = ((java.lang.Long) list.get(i2)).longValue();
            zzepVar2.zzn((longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzt(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzb(i, ((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zza(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += com.google.android.gms.internal.play_games_inputmapping.zzep.zzv(((java.lang.Integer) list.get(i4)).intValue());
        }
        this.zza.zzl(i3);
        while (i2 < list.size()) {
            this.zza.zzk(((java.lang.Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzu(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzd(i, ((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zza(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((java.lang.Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        this.zza.zzl(i3);
        while (i2 < list.size()) {
            this.zza.zzm(((java.lang.Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzv(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zze(i, ((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zza(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += com.google.android.gms.internal.play_games_inputmapping.zzep.zzx(((java.lang.Long) list.get(i4)).longValue());
        }
        this.zza.zzl(i3);
        while (i2 < list.size()) {
            this.zza.zzn(((java.lang.Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzw(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zze(i, ((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zza(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += com.google.android.gms.internal.play_games_inputmapping.zzep.zzx(((java.lang.Long) list.get(i4)).longValue());
        }
        this.zza.zzl(i3);
        while (i2 < list.size()) {
            this.zza.zzn(((java.lang.Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzx(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzf(i, ((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zza(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((java.lang.Long) list.get(i4)).longValue();
            i3 += 8;
        }
        this.zza.zzl(i3);
        while (i2 < list.size()) {
            this.zza.zzo(((java.lang.Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzy(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzd(i, java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        this.zza.zza(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((java.lang.Float) list.get(i4)).floatValue();
            i3 += 4;
        }
        this.zza.zzl(i3);
        while (i2 < list.size()) {
            this.zza.zzm(java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzhu
    public final void zzz(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzf(i, java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        this.zza.zza(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((java.lang.Double) list.get(i4)).doubleValue();
            i3 += 8;
        }
        this.zza.zzl(i3);
        while (i2 < list.size()) {
            this.zza.zzo(java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }
}
