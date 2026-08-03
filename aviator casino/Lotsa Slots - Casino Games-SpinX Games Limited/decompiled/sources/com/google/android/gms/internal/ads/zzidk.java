package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzidk implements com.google.android.gms.internal.ads.zzihi {
    private final com.google.android.gms.internal.ads.zzidj zza;

    private zzidk(com.google.android.gms.internal.ads.zzidj zzidjVar) {
        zzidjVar.getClass();
        this.zza = zzidjVar;
        zzidjVar.zza = this;
    }

    public static com.google.android.gms.internal.ads.zzidk zza(com.google.android.gms.internal.ads.zzidj zzidjVar) {
        java.lang.Object obj = zzidjVar.zza;
        return obj != null ? (com.google.android.gms.internal.ads.zzidk) obj : new com.google.android.gms.internal.ads.zzidk(zzidjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzG(int i, java.util.List list) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzj(i, (com.google.android.gms.internal.ads.zzida) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzM(int i, com.google.android.gms.internal.ads.zzifh zzifhVar, java.util.Map map) throws java.io.IOException {
        for (java.util.Map.Entry entry : map.entrySet()) {
            com.google.android.gms.internal.ads.zzidj zzidjVar = this.zza;
            zzidjVar.zzb(i, 2);
            zzidjVar.zzr(com.google.android.gms.internal.ads.zzifi.zzc(zzifhVar, entry.getKey(), entry.getValue()));
            com.google.android.gms.internal.ads.zzifi.zzb(zzidjVar, zzifhVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzb(int i, int i2) throws java.io.IOException {
        this.zza.zze(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzc(int i, long j) throws java.io.IOException {
        this.zza.zzf(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzd(int i, long j) throws java.io.IOException {
        this.zza.zzg(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zze(int i, float f) throws java.io.IOException {
        this.zza.zze(i, java.lang.Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzf(int i, double d) throws java.io.IOException {
        this.zza.zzg(i, java.lang.Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzg(int i, int i2) throws java.io.IOException {
        this.zza.zzc(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzh(int i, long j) throws java.io.IOException {
        this.zza.zzf(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzi(int i, int i2) throws java.io.IOException {
        this.zza.zzc(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzj(int i, long j) throws java.io.IOException {
        this.zza.zzg(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzk(int i, int i2) throws java.io.IOException {
        this.zza.zze(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzl(int i, boolean z) throws java.io.IOException {
        this.zza.zzh(i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzm(int i, java.lang.String str) throws java.io.IOException {
        this.zza.zzi(i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzn(int i, com.google.android.gms.internal.ads.zzida zzidaVar) throws java.io.IOException {
        this.zza.zzj(i, zzidaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzo(int i, int i2) throws java.io.IOException {
        this.zza.zzd(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzp(int i, int i2) throws java.io.IOException {
        this.zza.zzd(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzq(int i, long j) throws java.io.IOException {
        this.zza.zzf(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzr(int i, java.lang.Object obj, com.google.android.gms.internal.ads.zzigh zzighVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzidj zzidjVar = this.zza;
        com.google.android.gms.internal.ads.zzicj zzicjVar = (com.google.android.gms.internal.ads.zzicj) obj;
        zzidjVar.zzb(i, 2);
        zzidjVar.zzr(zzicjVar.zzaT(zzighVar));
        zzighVar.zzf(zzicjVar, this);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzs(int i, java.lang.Object obj, com.google.android.gms.internal.ads.zzigh zzighVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzidj zzidjVar = this.zza;
        zzidjVar.zzb(i, 3);
        zzighVar.zzf((com.google.android.gms.internal.ads.zzicj) obj, this);
        zzidjVar.zzb(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    @java.lang.Deprecated
    public final void zzt(int i) throws java.io.IOException {
        this.zza.zzb(i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    @java.lang.Deprecated
    public final void zzu(int i) throws java.io.IOException {
        this.zza.zzb(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzv(int i, java.lang.Object obj) throws java.io.IOException {
        if (obj instanceof com.google.android.gms.internal.ads.zzida) {
            this.zza.zzn(i, (com.google.android.gms.internal.ads.zzida) obj);
        } else {
            this.zza.zzm(i, (com.google.android.gms.internal.ads.zzifp) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzF(int i, java.util.List list) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzifa)) {
            while (i2 < list.size()) {
                this.zza.zzi(i, (java.lang.String) list.get(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzifa zzifaVar = (com.google.android.gms.internal.ads.zzifa) list;
        while (i2 < list.size()) {
            java.lang.Object zzc = zzifaVar.zzc();
            if (zzc instanceof java.lang.String) {
                this.zza.zzi(i, (java.lang.String) zzc);
            } else {
                this.zza.zzj(i, (com.google.android.gms.internal.ads.zzida) zzc);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzA(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzifd)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.ads.zzidj zzidjVar = this.zza;
            zzidjVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Long) list.get(i4)).longValue();
                i3 += 8;
            }
            zzidjVar.zzr(i3);
            while (i2 < list.size()) {
                zzidjVar.zzu(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzifd zzifdVar = (com.google.android.gms.internal.ads.zzifd) list;
        if (!z) {
            while (i2 < zzifdVar.size()) {
                this.zza.zzg(i, zzifdVar.zzc(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzidj zzidjVar2 = this.zza;
        zzidjVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzifdVar.size(); i6++) {
            zzifdVar.zzc(i6);
            i5 += 8;
        }
        zzidjVar2.zzr(i5);
        while (i2 < zzifdVar.size()) {
            zzidjVar2.zzu(zzifdVar.zzc(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzH(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzief)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzd(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.ads.zzidj zzidjVar = this.zza;
            zzidjVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.android.gms.internal.ads.zzidj.zzF(((java.lang.Integer) list.get(i4)).intValue());
            }
            zzidjVar.zzr(i3);
            while (i2 < list.size()) {
                zzidjVar.zzr(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzief zziefVar = (com.google.android.gms.internal.ads.zzief) list;
        if (!z) {
            while (i2 < zziefVar.size()) {
                this.zza.zzd(i, zziefVar.zzf(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzidj zzidjVar2 = this.zza;
        zzidjVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zziefVar.size(); i6++) {
            i5 += com.google.android.gms.internal.ads.zzidj.zzF(zziefVar.zzf(i6));
        }
        zzidjVar2.zzr(i5);
        while (i2 < zziefVar.size()) {
            zzidjVar2.zzr(zziefVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzx(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzief)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zze(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.ads.zzidj zzidjVar = this.zza;
            zzidjVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            zzidjVar.zzr(i3);
            while (i2 < list.size()) {
                zzidjVar.zzs(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzief zziefVar = (com.google.android.gms.internal.ads.zzief) list;
        if (!z) {
            while (i2 < zziefVar.size()) {
                this.zza.zze(i, zziefVar.zzf(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzidj zzidjVar2 = this.zza;
        zzidjVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zziefVar.size(); i6++) {
            zziefVar.zzf(i6);
            i5 += 4;
        }
        zzidjVar2.zzr(i5);
        while (i2 < zziefVar.size()) {
            zzidjVar2.zzs(zziefVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzz(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzifd)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.ads.zzidj zzidjVar = this.zza;
            zzidjVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.android.gms.internal.ads.zzidj.zzG(((java.lang.Long) list.get(i4)).longValue());
            }
            zzidjVar.zzr(i3);
            while (i2 < list.size()) {
                zzidjVar.zzt(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzifd zzifdVar = (com.google.android.gms.internal.ads.zzifd) list;
        if (!z) {
            while (i2 < zzifdVar.size()) {
                this.zza.zzf(i, zzifdVar.zzc(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzidj zzidjVar2 = this.zza;
        zzidjVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzifdVar.size(); i6++) {
            i5 += com.google.android.gms.internal.ads.zzidj.zzG(zzifdVar.zzc(i6));
        }
        zzidjVar2.zzr(i5);
        while (i2 < zzifdVar.size()) {
            zzidjVar2.zzt(zzifdVar.zzc(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzE(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzicq)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((java.lang.Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.ads.zzidj zzidjVar = this.zza;
            zzidjVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            zzidjVar.zzr(i3);
            while (i2 < list.size()) {
                zzidjVar.zzp(((java.lang.Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzicq zzicqVar = (com.google.android.gms.internal.ads.zzicq) list;
        if (!z) {
            while (i2 < zzicqVar.size()) {
                this.zza.zzh(i, zzicqVar.zzf(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzidj zzidjVar2 = this.zza;
        zzidjVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzicqVar.size(); i6++) {
            zzicqVar.zzf(i6);
            i5++;
        }
        zzidjVar2.zzr(i5);
        while (i2 < zzicqVar.size()) {
            zzidjVar2.zzp(zzicqVar.zzf(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzw(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzief)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzc(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.ads.zzidj zzidjVar = this.zza;
            zzidjVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.android.gms.internal.ads.zzidj.zzG(((java.lang.Integer) list.get(i4)).intValue());
            }
            zzidjVar.zzr(i3);
            while (i2 < list.size()) {
                zzidjVar.zzq(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzief zziefVar = (com.google.android.gms.internal.ads.zzief) list;
        if (!z) {
            while (i2 < zziefVar.size()) {
                this.zza.zzc(i, zziefVar.zzf(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzidj zzidjVar2 = this.zza;
        zzidjVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zziefVar.size(); i6++) {
            i5 += com.google.android.gms.internal.ads.zzidj.zzG(zziefVar.zzf(i6));
        }
        zzidjVar2.zzr(i5);
        while (i2 < zziefVar.size()) {
            zzidjVar2.zzq(zziefVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzB(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzidv)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zze(i, java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.ads.zzidj zzidjVar = this.zza;
            zzidjVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            zzidjVar.zzr(i3);
            while (i2 < list.size()) {
                zzidjVar.zzs(java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzidv zzidvVar = (com.google.android.gms.internal.ads.zzidv) list;
        if (!z) {
            while (i2 < zzidvVar.size()) {
                this.zza.zze(i, java.lang.Float.floatToRawIntBits(zzidvVar.zzf(i2)));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzidj zzidjVar2 = this.zza;
        zzidjVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzidvVar.size(); i6++) {
            zzidvVar.zzf(i6);
            i5 += 4;
        }
        zzidjVar2.zzr(i5);
        while (i2 < zzidvVar.size()) {
            zzidjVar2.zzs(java.lang.Float.floatToRawIntBits(zzidvVar.zzf(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzC(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzidl)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.ads.zzidj zzidjVar = this.zza;
            zzidjVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            zzidjVar.zzr(i3);
            while (i2 < list.size()) {
                zzidjVar.zzu(java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzidl zzidlVar = (com.google.android.gms.internal.ads.zzidl) list;
        if (!z) {
            while (i2 < zzidlVar.size()) {
                this.zza.zzg(i, java.lang.Double.doubleToRawLongBits(zzidlVar.zzf(i2)));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzidj zzidjVar2 = this.zza;
        zzidjVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzidlVar.size(); i6++) {
            zzidlVar.zzf(i6);
            i5 += 8;
        }
        zzidjVar2.zzr(i5);
        while (i2 < zzidlVar.size()) {
            zzidjVar2.zzu(java.lang.Double.doubleToRawLongBits(zzidlVar.zzf(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzI(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzief)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zze(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.ads.zzidj zzidjVar = this.zza;
            zzidjVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            zzidjVar.zzr(i3);
            while (i2 < list.size()) {
                zzidjVar.zzs(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzief zziefVar = (com.google.android.gms.internal.ads.zzief) list;
        if (!z) {
            while (i2 < zziefVar.size()) {
                this.zza.zze(i, zziefVar.zzf(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzidj zzidjVar2 = this.zza;
        zzidjVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zziefVar.size(); i6++) {
            zziefVar.zzf(i6);
            i5 += 4;
        }
        zzidjVar2.zzr(i5);
        while (i2 < zziefVar.size()) {
            zzidjVar2.zzs(zziefVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzJ(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzifd)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.ads.zzidj zzidjVar = this.zza;
            zzidjVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Long) list.get(i4)).longValue();
                i3 += 8;
            }
            zzidjVar.zzr(i3);
            while (i2 < list.size()) {
                zzidjVar.zzu(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzifd zzifdVar = (com.google.android.gms.internal.ads.zzifd) list;
        if (!z) {
            while (i2 < zzifdVar.size()) {
                this.zza.zzg(i, zzifdVar.zzc(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzidj zzidjVar2 = this.zza;
        zzidjVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzifdVar.size(); i6++) {
            zzifdVar.zzc(i6);
            i5 += 8;
        }
        zzidjVar2.zzr(i5);
        while (i2 < zzifdVar.size()) {
            zzidjVar2.zzu(zzifdVar.zzc(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzD(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzief)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzc(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.ads.zzidj zzidjVar = this.zza;
            zzidjVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.android.gms.internal.ads.zzidj.zzG(((java.lang.Integer) list.get(i4)).intValue());
            }
            zzidjVar.zzr(i3);
            while (i2 < list.size()) {
                zzidjVar.zzq(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzief zziefVar = (com.google.android.gms.internal.ads.zzief) list;
        if (!z) {
            while (i2 < zziefVar.size()) {
                this.zza.zzc(i, zziefVar.zzf(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzidj zzidjVar2 = this.zza;
        zzidjVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zziefVar.size(); i6++) {
            i5 += com.google.android.gms.internal.ads.zzidj.zzG(zziefVar.zzf(i6));
        }
        zzidjVar2.zzr(i5);
        while (i2 < zziefVar.size()) {
            zzidjVar2.zzq(zziefVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzK(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzief)) {
            if (!z) {
                while (i2 < list.size()) {
                    com.google.android.gms.internal.ads.zzidj zzidjVar = this.zza;
                    int intValue = ((java.lang.Integer) list.get(i2)).intValue();
                    zzidjVar.zzd(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.ads.zzidj zzidjVar2 = this.zza;
            zzidjVar2.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((java.lang.Integer) list.get(i4)).intValue();
                i3 += com.google.android.gms.internal.ads.zzidj.zzF((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zzidjVar2.zzr(i3);
            while (i2 < list.size()) {
                int intValue3 = ((java.lang.Integer) list.get(i2)).intValue();
                zzidjVar2.zzr((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzief zziefVar = (com.google.android.gms.internal.ads.zzief) list;
        if (!z) {
            while (i2 < zziefVar.size()) {
                com.google.android.gms.internal.ads.zzidj zzidjVar3 = this.zza;
                int zzf = zziefVar.zzf(i2);
                zzidjVar3.zzd(i, (zzf >> 31) ^ (zzf + zzf));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzidj zzidjVar4 = this.zza;
        zzidjVar4.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zziefVar.size(); i6++) {
            int zzf2 = zziefVar.zzf(i6);
            i5 += com.google.android.gms.internal.ads.zzidj.zzF((zzf2 >> 31) ^ (zzf2 + zzf2));
        }
        zzidjVar4.zzr(i5);
        while (i2 < zziefVar.size()) {
            int zzf3 = zziefVar.zzf(i2);
            zzidjVar4.zzr((zzf3 >> 31) ^ (zzf3 + zzf3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzL(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzifd)) {
            if (!z) {
                while (i2 < list.size()) {
                    com.google.android.gms.internal.ads.zzidj zzidjVar = this.zza;
                    long longValue = ((java.lang.Long) list.get(i2)).longValue();
                    zzidjVar.zzf(i, (longValue >> 63) ^ (longValue + longValue));
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.ads.zzidj zzidjVar2 = this.zza;
            zzidjVar2.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((java.lang.Long) list.get(i4)).longValue();
                i3 += com.google.android.gms.internal.ads.zzidj.zzG((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            zzidjVar2.zzr(i3);
            while (i2 < list.size()) {
                long longValue3 = ((java.lang.Long) list.get(i2)).longValue();
                zzidjVar2.zzt((longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzifd zzifdVar = (com.google.android.gms.internal.ads.zzifd) list;
        if (!z) {
            while (i2 < zzifdVar.size()) {
                com.google.android.gms.internal.ads.zzidj zzidjVar3 = this.zza;
                long zzc = zzifdVar.zzc(i2);
                zzidjVar3.zzf(i, (zzc >> 63) ^ (zzc + zzc));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzidj zzidjVar4 = this.zza;
        zzidjVar4.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzifdVar.size(); i6++) {
            long zzc2 = zzifdVar.zzc(i6);
            i5 += com.google.android.gms.internal.ads.zzidj.zzG((zzc2 >> 63) ^ (zzc2 + zzc2));
        }
        zzidjVar4.zzr(i5);
        while (i2 < zzifdVar.size()) {
            long zzc3 = zzifdVar.zzc(i2);
            zzidjVar4.zzt((zzc3 >> 63) ^ (zzc3 + zzc3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzy(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzifd)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.ads.zzidj zzidjVar = this.zza;
            zzidjVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.android.gms.internal.ads.zzidj.zzG(((java.lang.Long) list.get(i4)).longValue());
            }
            zzidjVar.zzr(i3);
            while (i2 < list.size()) {
                zzidjVar.zzt(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzifd zzifdVar = (com.google.android.gms.internal.ads.zzifd) list;
        if (!z) {
            while (i2 < zzifdVar.size()) {
                this.zza.zzf(i, zzifdVar.zzc(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzidj zzidjVar2 = this.zza;
        zzidjVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzifdVar.size(); i6++) {
            i5 += com.google.android.gms.internal.ads.zzidj.zzG(zzifdVar.zzc(i6));
        }
        zzidjVar2.zzr(i5);
        while (i2 < zzifdVar.size()) {
            zzidjVar2.zzt(zzifdVar.zzc(i2));
            i2++;
        }
    }
}
