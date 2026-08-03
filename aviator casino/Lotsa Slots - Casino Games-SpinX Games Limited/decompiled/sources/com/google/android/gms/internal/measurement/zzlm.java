package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
final class zzlm implements com.google.android.gms.internal.measurement.zzou {
    private final com.google.android.gms.internal.measurement.zzll zza;

    private zzlm(com.google.android.gms.internal.measurement.zzll zzllVar) {
        byte[] bArr = com.google.android.gms.internal.measurement.zzmo.zzb;
        this.zza = zzllVar;
        zzllVar.zza = this;
    }

    public static com.google.android.gms.internal.measurement.zzlm zza(com.google.android.gms.internal.measurement.zzll zzllVar) {
        com.google.android.gms.internal.measurement.zzlm zzlmVar = zzllVar.zza;
        return zzlmVar != null ? zzlmVar : new com.google.android.gms.internal.measurement.zzlm(zzllVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzG(int i, java.util.List list) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzi(i, (com.google.android.gms.internal.measurement.zzlg) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzM(int i, com.google.android.gms.internal.measurement.zznd zzndVar, java.util.Map map) throws java.io.IOException {
        for (java.util.Map.Entry entry : map.entrySet()) {
            com.google.android.gms.internal.measurement.zzll zzllVar = this.zza;
            zzllVar.zza(i, 2);
            zzllVar.zzr(com.google.android.gms.internal.measurement.zzne.zzc(zzndVar, entry.getKey(), entry.getValue()));
            com.google.android.gms.internal.measurement.zzne.zzb(zzllVar, zzndVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzb(int i, int i2) throws java.io.IOException {
        this.zza.zzd(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzc(int i, long j) throws java.io.IOException {
        this.zza.zze(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzd(int i, long j) throws java.io.IOException {
        this.zza.zzf(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zze(int i, float f) throws java.io.IOException {
        this.zza.zzd(i, java.lang.Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzf(int i, double d) throws java.io.IOException {
        this.zza.zzf(i, java.lang.Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzg(int i, int i2) throws java.io.IOException {
        this.zza.zzb(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzh(int i, long j) throws java.io.IOException {
        this.zza.zze(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzi(int i, int i2) throws java.io.IOException {
        this.zza.zzb(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzj(int i, long j) throws java.io.IOException {
        this.zza.zzf(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzk(int i, int i2) throws java.io.IOException {
        this.zza.zzd(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzl(int i, boolean z) throws java.io.IOException {
        this.zza.zzg(i, z);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzm(int i, java.lang.String str) throws java.io.IOException {
        this.zza.zzh(i, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzn(int i, com.google.android.gms.internal.measurement.zzlg zzlgVar) throws java.io.IOException {
        this.zza.zzi(i, zzlgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzo(int i, int i2) throws java.io.IOException {
        this.zza.zzc(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzp(int i, int i2) throws java.io.IOException {
        this.zza.zzc(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzq(int i, long j) throws java.io.IOException {
        this.zza.zze(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzr(int i, java.lang.Object obj, com.google.android.gms.internal.measurement.zznw zznwVar) throws java.io.IOException {
        this.zza.zzl(i, (com.google.android.gms.internal.measurement.zznl) obj, zznwVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzs(int i, java.lang.Object obj, com.google.android.gms.internal.measurement.zznw zznwVar) throws java.io.IOException {
        com.google.android.gms.internal.measurement.zzll zzllVar = this.zza;
        zzllVar.zza(i, 3);
        zznwVar.zzf((com.google.android.gms.internal.measurement.zznl) obj, zzllVar.zza);
        zzllVar.zza(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    @java.lang.Deprecated
    public final void zzt(int i) throws java.io.IOException {
        this.zza.zza(i, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    @java.lang.Deprecated
    public final void zzu(int i) throws java.io.IOException {
        this.zza.zza(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzv(int i, java.lang.Object obj) throws java.io.IOException {
        if (obj instanceof com.google.android.gms.internal.measurement.zzlg) {
            this.zza.zzn(i, (com.google.android.gms.internal.measurement.zzlg) obj);
        } else {
            this.zza.zzm(i, (com.google.android.gms.internal.measurement.zznl) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzF(int i, java.util.List list) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzmw)) {
            while (i2 < list.size()) {
                this.zza.zzh(i, (java.lang.String) list.get(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzmw zzmwVar = (com.google.android.gms.internal.measurement.zzmw) list;
        while (i2 < list.size()) {
            java.lang.Object zzc = zzmwVar.zzc();
            if (zzc instanceof java.lang.String) {
                this.zza.zzh(i, (java.lang.String) zzc);
            } else {
                this.zza.zzi(i, (com.google.android.gms.internal.measurement.zzlg) zzc);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzA(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzmz)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzll zzllVar = this.zza;
            zzllVar.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Long) list.get(i4)).longValue();
                i3 += 8;
            }
            zzllVar.zzr(i3);
            while (i2 < list.size()) {
                zzllVar.zzu(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzmz zzmzVar = (com.google.android.gms.internal.measurement.zzmz) list;
        if (!z) {
            while (i2 < zzmzVar.size()) {
                this.zza.zzf(i, zzmzVar.zzc(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzll zzllVar2 = this.zza;
        zzllVar2.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzmzVar.size(); i6++) {
            zzmzVar.zzc(i6);
            i5 += 8;
        }
        zzllVar2.zzr(i5);
        while (i2 < zzmzVar.size()) {
            zzllVar2.zzu(zzmzVar.zzc(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzH(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzmf)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzc(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzll zzllVar = this.zza;
            zzllVar.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.android.gms.internal.measurement.zzll.zzz(((java.lang.Integer) list.get(i4)).intValue());
            }
            zzllVar.zzr(i3);
            while (i2 < list.size()) {
                zzllVar.zzr(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzmf zzmfVar = (com.google.android.gms.internal.measurement.zzmf) list;
        if (!z) {
            while (i2 < zzmfVar.size()) {
                this.zza.zzc(i, zzmfVar.zzf(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzll zzllVar2 = this.zza;
        zzllVar2.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzmfVar.size(); i6++) {
            i5 += com.google.android.gms.internal.measurement.zzll.zzz(zzmfVar.zzf(i6));
        }
        zzllVar2.zzr(i5);
        while (i2 < zzmfVar.size()) {
            zzllVar2.zzr(zzmfVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzx(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzmf)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzd(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzll zzllVar = this.zza;
            zzllVar.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            zzllVar.zzr(i3);
            while (i2 < list.size()) {
                zzllVar.zzs(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzmf zzmfVar = (com.google.android.gms.internal.measurement.zzmf) list;
        if (!z) {
            while (i2 < zzmfVar.size()) {
                this.zza.zzd(i, zzmfVar.zzf(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzll zzllVar2 = this.zza;
        zzllVar2.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzmfVar.size(); i6++) {
            zzmfVar.zzf(i6);
            i5 += 4;
        }
        zzllVar2.zzr(i5);
        while (i2 < zzmfVar.size()) {
            zzllVar2.zzs(zzmfVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzz(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzmz)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zze(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzll zzllVar = this.zza;
            zzllVar.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.android.gms.internal.measurement.zzll.zzA(((java.lang.Long) list.get(i4)).longValue());
            }
            zzllVar.zzr(i3);
            while (i2 < list.size()) {
                zzllVar.zzt(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzmz zzmzVar = (com.google.android.gms.internal.measurement.zzmz) list;
        if (!z) {
            while (i2 < zzmzVar.size()) {
                this.zza.zze(i, zzmzVar.zzc(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzll zzllVar2 = this.zza;
        zzllVar2.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzmzVar.size(); i6++) {
            i5 += com.google.android.gms.internal.measurement.zzll.zzA(zzmzVar.zzc(i6));
        }
        zzllVar2.zzr(i5);
        while (i2 < zzmzVar.size()) {
            zzllVar2.zzt(zzmzVar.zzc(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzE(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzkx)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, ((java.lang.Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzll zzllVar = this.zza;
            zzllVar.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            zzllVar.zzr(i3);
            while (i2 < list.size()) {
                zzllVar.zzp(((java.lang.Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzkx zzkxVar = (com.google.android.gms.internal.measurement.zzkx) list;
        if (!z) {
            while (i2 < zzkxVar.size()) {
                this.zza.zzg(i, zzkxVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzll zzllVar2 = this.zza;
        zzllVar2.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzkxVar.size(); i6++) {
            zzkxVar.zze(i6);
            i5++;
        }
        zzllVar2.zzr(i5);
        while (i2 < zzkxVar.size()) {
            zzllVar2.zzp(zzkxVar.zze(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzw(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzmf)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzb(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzll zzllVar = this.zza;
            zzllVar.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.android.gms.internal.measurement.zzll.zzA(((java.lang.Integer) list.get(i4)).intValue());
            }
            zzllVar.zzr(i3);
            while (i2 < list.size()) {
                zzllVar.zzq(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzmf zzmfVar = (com.google.android.gms.internal.measurement.zzmf) list;
        if (!z) {
            while (i2 < zzmfVar.size()) {
                this.zza.zzb(i, zzmfVar.zzf(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzll zzllVar2 = this.zza;
        zzllVar2.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzmfVar.size(); i6++) {
            i5 += com.google.android.gms.internal.measurement.zzll.zzA(zzmfVar.zzf(i6));
        }
        zzllVar2.zzr(i5);
        while (i2 < zzmfVar.size()) {
            zzllVar2.zzq(zzmfVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzB(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzlx)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzd(i, java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzll zzllVar = this.zza;
            zzllVar.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            zzllVar.zzr(i3);
            while (i2 < list.size()) {
                zzllVar.zzs(java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzlx zzlxVar = (com.google.android.gms.internal.measurement.zzlx) list;
        if (!z) {
            while (i2 < zzlxVar.size()) {
                this.zza.zzd(i, java.lang.Float.floatToRawIntBits(zzlxVar.zze(i2)));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzll zzllVar2 = this.zza;
        zzllVar2.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzlxVar.size(); i6++) {
            zzlxVar.zze(i6);
            i5 += 4;
        }
        zzllVar2.zzr(i5);
        while (i2 < zzlxVar.size()) {
            zzllVar2.zzs(java.lang.Float.floatToRawIntBits(zzlxVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzC(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzln)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzll zzllVar = this.zza;
            zzllVar.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            zzllVar.zzr(i3);
            while (i2 < list.size()) {
                zzllVar.zzu(java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzln zzlnVar = (com.google.android.gms.internal.measurement.zzln) list;
        if (!z) {
            while (i2 < zzlnVar.size()) {
                this.zza.zzf(i, java.lang.Double.doubleToRawLongBits(zzlnVar.zze(i2)));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzll zzllVar2 = this.zza;
        zzllVar2.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzlnVar.size(); i6++) {
            zzlnVar.zze(i6);
            i5 += 8;
        }
        zzllVar2.zzr(i5);
        while (i2 < zzlnVar.size()) {
            zzllVar2.zzu(java.lang.Double.doubleToRawLongBits(zzlnVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzI(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzmf)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzd(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzll zzllVar = this.zza;
            zzllVar.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            zzllVar.zzr(i3);
            while (i2 < list.size()) {
                zzllVar.zzs(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzmf zzmfVar = (com.google.android.gms.internal.measurement.zzmf) list;
        if (!z) {
            while (i2 < zzmfVar.size()) {
                this.zza.zzd(i, zzmfVar.zzf(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzll zzllVar2 = this.zza;
        zzllVar2.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzmfVar.size(); i6++) {
            zzmfVar.zzf(i6);
            i5 += 4;
        }
        zzllVar2.zzr(i5);
        while (i2 < zzmfVar.size()) {
            zzllVar2.zzs(zzmfVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzJ(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzmz)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzll zzllVar = this.zza;
            zzllVar.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Long) list.get(i4)).longValue();
                i3 += 8;
            }
            zzllVar.zzr(i3);
            while (i2 < list.size()) {
                zzllVar.zzu(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzmz zzmzVar = (com.google.android.gms.internal.measurement.zzmz) list;
        if (!z) {
            while (i2 < zzmzVar.size()) {
                this.zza.zzf(i, zzmzVar.zzc(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzll zzllVar2 = this.zza;
        zzllVar2.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzmzVar.size(); i6++) {
            zzmzVar.zzc(i6);
            i5 += 8;
        }
        zzllVar2.zzr(i5);
        while (i2 < zzmzVar.size()) {
            zzllVar2.zzu(zzmzVar.zzc(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzD(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzmf)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzb(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzll zzllVar = this.zza;
            zzllVar.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.android.gms.internal.measurement.zzll.zzA(((java.lang.Integer) list.get(i4)).intValue());
            }
            zzllVar.zzr(i3);
            while (i2 < list.size()) {
                zzllVar.zzq(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzmf zzmfVar = (com.google.android.gms.internal.measurement.zzmf) list;
        if (!z) {
            while (i2 < zzmfVar.size()) {
                this.zza.zzb(i, zzmfVar.zzf(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzll zzllVar2 = this.zza;
        zzllVar2.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzmfVar.size(); i6++) {
            i5 += com.google.android.gms.internal.measurement.zzll.zzA(zzmfVar.zzf(i6));
        }
        zzllVar2.zzr(i5);
        while (i2 < zzmfVar.size()) {
            zzllVar2.zzq(zzmfVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzK(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzmf)) {
            if (!z) {
                while (i2 < list.size()) {
                    com.google.android.gms.internal.measurement.zzll zzllVar = this.zza;
                    int intValue = ((java.lang.Integer) list.get(i2)).intValue();
                    zzllVar.zzc(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzll zzllVar2 = this.zza;
            zzllVar2.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((java.lang.Integer) list.get(i4)).intValue();
                i3 += com.google.android.gms.internal.measurement.zzll.zzz((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zzllVar2.zzr(i3);
            while (i2 < list.size()) {
                int intValue3 = ((java.lang.Integer) list.get(i2)).intValue();
                zzllVar2.zzr((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzmf zzmfVar = (com.google.android.gms.internal.measurement.zzmf) list;
        if (!z) {
            while (i2 < zzmfVar.size()) {
                com.google.android.gms.internal.measurement.zzll zzllVar3 = this.zza;
                int zzf = zzmfVar.zzf(i2);
                zzllVar3.zzc(i, (zzf >> 31) ^ (zzf + zzf));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzll zzllVar4 = this.zza;
        zzllVar4.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzmfVar.size(); i6++) {
            int zzf2 = zzmfVar.zzf(i6);
            i5 += com.google.android.gms.internal.measurement.zzll.zzz((zzf2 >> 31) ^ (zzf2 + zzf2));
        }
        zzllVar4.zzr(i5);
        while (i2 < zzmfVar.size()) {
            int zzf3 = zzmfVar.zzf(i2);
            zzllVar4.zzr((zzf3 >> 31) ^ (zzf3 + zzf3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzL(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzmz)) {
            if (!z) {
                while (i2 < list.size()) {
                    com.google.android.gms.internal.measurement.zzll zzllVar = this.zza;
                    long longValue = ((java.lang.Long) list.get(i2)).longValue();
                    zzllVar.zze(i, (longValue >> 63) ^ (longValue + longValue));
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzll zzllVar2 = this.zza;
            zzllVar2.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((java.lang.Long) list.get(i4)).longValue();
                i3 += com.google.android.gms.internal.measurement.zzll.zzA((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            zzllVar2.zzr(i3);
            while (i2 < list.size()) {
                long longValue3 = ((java.lang.Long) list.get(i2)).longValue();
                zzllVar2.zzt((longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzmz zzmzVar = (com.google.android.gms.internal.measurement.zzmz) list;
        if (!z) {
            while (i2 < zzmzVar.size()) {
                com.google.android.gms.internal.measurement.zzll zzllVar3 = this.zza;
                long zzc = zzmzVar.zzc(i2);
                zzllVar3.zze(i, (zzc >> 63) ^ (zzc + zzc));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzll zzllVar4 = this.zza;
        zzllVar4.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzmzVar.size(); i6++) {
            long zzc2 = zzmzVar.zzc(i6);
            i5 += com.google.android.gms.internal.measurement.zzll.zzA((zzc2 >> 63) ^ (zzc2 + zzc2));
        }
        zzllVar4.zzr(i5);
        while (i2 < zzmzVar.size()) {
            long zzc3 = zzmzVar.zzc(i2);
            zzllVar4.zzt((zzc3 >> 63) ^ (zzc3 + zzc3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzy(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzmz)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zze(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzll zzllVar = this.zza;
            zzllVar.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.android.gms.internal.measurement.zzll.zzA(((java.lang.Long) list.get(i4)).longValue());
            }
            zzllVar.zzr(i3);
            while (i2 < list.size()) {
                zzllVar.zzt(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzmz zzmzVar = (com.google.android.gms.internal.measurement.zzmz) list;
        if (!z) {
            while (i2 < zzmzVar.size()) {
                this.zza.zze(i, zzmzVar.zzc(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzll zzllVar2 = this.zza;
        zzllVar2.zza(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzmzVar.size(); i6++) {
            i5 += com.google.android.gms.internal.measurement.zzll.zzA(zzmzVar.zzc(i6));
        }
        zzllVar2.zzr(i5);
        while (i2 < zzmzVar.size()) {
            zzllVar2.zzt(zzmzVar.zzc(i2));
            i2++;
        }
    }
}
