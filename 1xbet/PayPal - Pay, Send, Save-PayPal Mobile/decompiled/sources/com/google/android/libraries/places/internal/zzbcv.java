package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbcv implements com.google.android.libraries.places.internal.zzbgl {
    private final com.google.android.libraries.places.internal.zzbcu zza;

    private zzbcv(com.google.android.libraries.places.internal.zzbcu zzbcuVar) {
        this.zza = zzbcuVar;
        zzbcuVar.zze = this;
    }

    public static com.google.android.libraries.places.internal.zzbcv zza(com.google.android.libraries.places.internal.zzbcu zzbcuVar) {
        java.lang.Object obj = zzbcuVar.zze;
        return obj != null ? (com.google.android.libraries.places.internal.zzbcv) obj : new com.google.android.libraries.places.internal.zzbcv(zzbcuVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzG(int i, java.util.List list) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzl(i, (com.google.android.libraries.places.internal.zzbcl) list.get(i2));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzb(int i, int i2) throws java.io.IOException {
        this.zza.zzK(i, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzc(int i, long j) throws java.io.IOException {
        this.zza.zzL(i, j);
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzd(int i, long j) throws java.io.IOException {
        this.zza.zzi(i, j);
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zze(int i, float f) throws java.io.IOException {
        this.zza.zzK(i, java.lang.Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzf(int i, double d) throws java.io.IOException {
        this.zza.zzi(i, java.lang.Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzg(int i, int i2) throws java.io.IOException {
        this.zza.zzI(i, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzh(int i, long j) throws java.io.IOException {
        this.zza.zzL(i, j);
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzi(int i, int i2) throws java.io.IOException {
        this.zza.zzI(i, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzj(int i, long j) throws java.io.IOException {
        this.zza.zzi(i, j);
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzk(int i, int i2) throws java.io.IOException {
        this.zza.zzK(i, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzl(int i, boolean z) throws java.io.IOException {
        this.zza.zzj(i, z);
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzm(int i, java.lang.String str) throws java.io.IOException {
        this.zza.zzk(i, str);
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzn(int i, com.google.android.libraries.places.internal.zzbcl zzbclVar) throws java.io.IOException {
        this.zza.zzl(i, zzbclVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzo(int i, int i2) throws java.io.IOException {
        this.zza.zzJ(i, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzp(int i, int i2) throws java.io.IOException {
        this.zza.zzJ(i, (i2 + i2) ^ (i2 >> 31));
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzq(int i, long j) throws java.io.IOException {
        this.zza.zzL(i, (j + j) ^ (j >> 63));
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzr(int i, java.lang.Object obj, com.google.android.libraries.places.internal.zzbfl zzbflVar) throws java.io.IOException {
        com.google.android.libraries.places.internal.zzbcu zzbcuVar = this.zza;
        com.google.android.libraries.places.internal.zzbby zzbbyVar = (com.google.android.libraries.places.internal.zzbby) obj;
        zzbcuVar.zzH(i, 2);
        zzbcuVar.zzq(zzbbyVar.zzbn(zzbflVar));
        zzbflVar.zzf(zzbbyVar, this);
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzs(int i, java.lang.Object obj, com.google.android.libraries.places.internal.zzbfl zzbflVar) throws java.io.IOException {
        com.google.android.libraries.places.internal.zzbcu zzbcuVar = this.zza;
        zzbcuVar.zzH(i, 3);
        zzbflVar.zzf((com.google.android.libraries.places.internal.zzbby) obj, this);
        zzbcuVar.zzH(i, 4);
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    @java.lang.Deprecated
    public final void zzt(int i) throws java.io.IOException {
        this.zza.zzH(i, 3);
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    @java.lang.Deprecated
    public final void zzu(int i) throws java.io.IOException {
        this.zza.zzH(i, 4);
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzv(int i, java.lang.Object obj) throws java.io.IOException {
        if (obj instanceof com.google.android.libraries.places.internal.zzbcl) {
            this.zza.zzn(i, (com.google.android.libraries.places.internal.zzbcl) obj);
        } else {
            this.zza.zzm(i, (com.google.android.libraries.places.internal.zzbex) obj);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzF(int i, java.util.List list) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.libraries.places.internal.zzbej)) {
            while (i2 < list.size()) {
                this.zza.zzk(i, (java.lang.String) list.get(i2));
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbej zzbejVar = (com.google.android.libraries.places.internal.zzbej) list;
        while (i2 < list.size()) {
            java.lang.Object zzc = zzbejVar.zzc();
            if (zzc instanceof java.lang.String) {
                this.zza.zzk(i, (java.lang.String) zzc);
            } else {
                this.zza.zzl(i, (com.google.android.libraries.places.internal.zzbcl) zzc);
            }
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzA(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.libraries.places.internal.zzbem)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzi(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            com.google.android.libraries.places.internal.zzbcu zzbcuVar = this.zza;
            zzbcuVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += 8;
            }
            zzbcuVar.zzq(i3);
            while (i2 < list.size()) {
                zzbcuVar.zzt(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbem zzbemVar = (com.google.android.libraries.places.internal.zzbem) list;
        if (!z) {
            while (i2 < zzbemVar.size()) {
                this.zza.zzi(i, zzbemVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbcu zzbcuVar2 = this.zza;
        zzbcuVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbemVar.size(); i6++) {
            zzbemVar.zze(i6);
            i5 += 8;
        }
        zzbcuVar2.zzq(i5);
        while (i2 < zzbemVar.size()) {
            zzbcuVar2.zzt(zzbemVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzH(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.libraries.places.internal.zzbdr)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzJ(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.libraries.places.internal.zzbcu zzbcuVar = this.zza;
            zzbcuVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.android.libraries.places.internal.zzbcu.zzy(((java.lang.Integer) list.get(i4)).intValue());
            }
            zzbcuVar.zzq(i3);
            while (i2 < list.size()) {
                zzbcuVar.zzq(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbdr zzbdrVar = (com.google.android.libraries.places.internal.zzbdr) list;
        if (!z) {
            while (i2 < zzbdrVar.size()) {
                this.zza.zzJ(i, zzbdrVar.zzf(i2));
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbcu zzbcuVar2 = this.zza;
        zzbcuVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbdrVar.size(); i6++) {
            i5 += com.google.android.libraries.places.internal.zzbcu.zzy(zzbdrVar.zzf(i6));
        }
        zzbcuVar2.zzq(i5);
        while (i2 < zzbdrVar.size()) {
            zzbcuVar2.zzq(zzbdrVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzx(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.libraries.places.internal.zzbdr)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzK(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.libraries.places.internal.zzbcu zzbcuVar = this.zza;
            zzbcuVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += 4;
            }
            zzbcuVar.zzq(i3);
            while (i2 < list.size()) {
                zzbcuVar.zzr(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbdr zzbdrVar = (com.google.android.libraries.places.internal.zzbdr) list;
        if (!z) {
            while (i2 < zzbdrVar.size()) {
                this.zza.zzK(i, zzbdrVar.zzf(i2));
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbcu zzbcuVar2 = this.zza;
        zzbcuVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbdrVar.size(); i6++) {
            zzbdrVar.zzf(i6);
            i5 += 4;
        }
        zzbcuVar2.zzq(i5);
        while (i2 < zzbdrVar.size()) {
            zzbcuVar2.zzr(zzbdrVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzz(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.libraries.places.internal.zzbem)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzL(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            com.google.android.libraries.places.internal.zzbcu zzbcuVar = this.zza;
            zzbcuVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.android.libraries.places.internal.zzbcu.zzz(((java.lang.Long) list.get(i4)).longValue());
            }
            zzbcuVar.zzq(i3);
            while (i2 < list.size()) {
                zzbcuVar.zzs(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbem zzbemVar = (com.google.android.libraries.places.internal.zzbem) list;
        if (!z) {
            while (i2 < zzbemVar.size()) {
                this.zza.zzL(i, zzbemVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbcu zzbcuVar2 = this.zza;
        zzbcuVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbemVar.size(); i6++) {
            i5 += com.google.android.libraries.places.internal.zzbcu.zzz(zzbemVar.zze(i6));
        }
        zzbcuVar2.zzq(i5);
        while (i2 < zzbemVar.size()) {
            zzbcuVar2.zzs(zzbemVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzE(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.libraries.places.internal.zzbcd)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((java.lang.Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            com.google.android.libraries.places.internal.zzbcu zzbcuVar = this.zza;
            zzbcuVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3++;
            }
            zzbcuVar.zzq(i3);
            while (i2 < list.size()) {
                zzbcuVar.zzo(((java.lang.Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbcd zzbcdVar = (com.google.android.libraries.places.internal.zzbcd) list;
        if (!z) {
            while (i2 < zzbcdVar.size()) {
                this.zza.zzj(i, zzbcdVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbcu zzbcuVar2 = this.zza;
        zzbcuVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbcdVar.size(); i6++) {
            zzbcdVar.zze(i6);
            i5++;
        }
        zzbcuVar2.zzq(i5);
        while (i2 < zzbcdVar.size()) {
            zzbcuVar2.zzo(zzbcdVar.zze(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzw(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.libraries.places.internal.zzbdr)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzI(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.libraries.places.internal.zzbcu zzbcuVar = this.zza;
            zzbcuVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.android.libraries.places.internal.zzbcu.zzz(((java.lang.Integer) list.get(i4)).intValue());
            }
            zzbcuVar.zzq(i3);
            while (i2 < list.size()) {
                zzbcuVar.zzp(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbdr zzbdrVar = (com.google.android.libraries.places.internal.zzbdr) list;
        if (!z) {
            while (i2 < zzbdrVar.size()) {
                this.zza.zzI(i, zzbdrVar.zzf(i2));
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbcu zzbcuVar2 = this.zza;
        zzbcuVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbdrVar.size(); i6++) {
            i5 += com.google.android.libraries.places.internal.zzbcu.zzz(zzbdrVar.zzf(i6));
        }
        zzbcuVar2.zzq(i5);
        while (i2 < zzbdrVar.size()) {
            zzbcuVar2.zzp(zzbdrVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzB(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.libraries.places.internal.zzbdi)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzK(i, java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            com.google.android.libraries.places.internal.zzbcu zzbcuVar = this.zza;
            zzbcuVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += 4;
            }
            zzbcuVar.zzq(i3);
            while (i2 < list.size()) {
                zzbcuVar.zzr(java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbdi zzbdiVar = (com.google.android.libraries.places.internal.zzbdi) list;
        if (!z) {
            while (i2 < zzbdiVar.size()) {
                this.zza.zzK(i, java.lang.Float.floatToRawIntBits(zzbdiVar.zze(i2)));
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbcu zzbcuVar2 = this.zza;
        zzbcuVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbdiVar.size(); i6++) {
            zzbdiVar.zze(i6);
            i5 += 4;
        }
        zzbcuVar2.zzq(i5);
        while (i2 < zzbdiVar.size()) {
            zzbcuVar2.zzr(java.lang.Float.floatToRawIntBits(zzbdiVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzC(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.libraries.places.internal.zzbcw)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzi(i, java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            com.google.android.libraries.places.internal.zzbcu zzbcuVar = this.zza;
            zzbcuVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += 8;
            }
            zzbcuVar.zzq(i3);
            while (i2 < list.size()) {
                zzbcuVar.zzt(java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbcw zzbcwVar = (com.google.android.libraries.places.internal.zzbcw) list;
        if (!z) {
            while (i2 < zzbcwVar.size()) {
                this.zza.zzi(i, java.lang.Double.doubleToRawLongBits(zzbcwVar.zze(i2)));
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbcu zzbcuVar2 = this.zza;
        zzbcuVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbcwVar.size(); i6++) {
            zzbcwVar.zze(i6);
            i5 += 8;
        }
        zzbcuVar2.zzq(i5);
        while (i2 < zzbcwVar.size()) {
            zzbcuVar2.zzt(java.lang.Double.doubleToRawLongBits(zzbcwVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzI(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.libraries.places.internal.zzbdr)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzK(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.libraries.places.internal.zzbcu zzbcuVar = this.zza;
            zzbcuVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += 4;
            }
            zzbcuVar.zzq(i3);
            while (i2 < list.size()) {
                zzbcuVar.zzr(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbdr zzbdrVar = (com.google.android.libraries.places.internal.zzbdr) list;
        if (!z) {
            while (i2 < zzbdrVar.size()) {
                this.zza.zzK(i, zzbdrVar.zzf(i2));
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbcu zzbcuVar2 = this.zza;
        zzbcuVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbdrVar.size(); i6++) {
            zzbdrVar.zzf(i6);
            i5 += 4;
        }
        zzbcuVar2.zzq(i5);
        while (i2 < zzbdrVar.size()) {
            zzbcuVar2.zzr(zzbdrVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzJ(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.libraries.places.internal.zzbem)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzi(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            com.google.android.libraries.places.internal.zzbcu zzbcuVar = this.zza;
            zzbcuVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += 8;
            }
            zzbcuVar.zzq(i3);
            while (i2 < list.size()) {
                zzbcuVar.zzt(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbem zzbemVar = (com.google.android.libraries.places.internal.zzbem) list;
        if (!z) {
            while (i2 < zzbemVar.size()) {
                this.zza.zzi(i, zzbemVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbcu zzbcuVar2 = this.zza;
        zzbcuVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbemVar.size(); i6++) {
            zzbemVar.zze(i6);
            i5 += 8;
        }
        zzbcuVar2.zzq(i5);
        while (i2 < zzbemVar.size()) {
            zzbcuVar2.zzt(zzbemVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzD(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.libraries.places.internal.zzbdr)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzI(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.libraries.places.internal.zzbcu zzbcuVar = this.zza;
            zzbcuVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.android.libraries.places.internal.zzbcu.zzz(((java.lang.Integer) list.get(i4)).intValue());
            }
            zzbcuVar.zzq(i3);
            while (i2 < list.size()) {
                zzbcuVar.zzp(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbdr zzbdrVar = (com.google.android.libraries.places.internal.zzbdr) list;
        if (!z) {
            while (i2 < zzbdrVar.size()) {
                this.zza.zzI(i, zzbdrVar.zzf(i2));
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbcu zzbcuVar2 = this.zza;
        zzbcuVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbdrVar.size(); i6++) {
            i5 += com.google.android.libraries.places.internal.zzbcu.zzz(zzbdrVar.zzf(i6));
        }
        zzbcuVar2.zzq(i5);
        while (i2 < zzbdrVar.size()) {
            zzbcuVar2.zzp(zzbdrVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzK(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.libraries.places.internal.zzbdr)) {
            if (!z) {
                while (i2 < list.size()) {
                    com.google.android.libraries.places.internal.zzbcu zzbcuVar = this.zza;
                    int intValue = ((java.lang.Integer) list.get(i2)).intValue();
                    zzbcuVar.zzJ(i, (intValue + intValue) ^ (intValue >> 31));
                    i2++;
                }
                return;
            }
            com.google.android.libraries.places.internal.zzbcu zzbcuVar2 = this.zza;
            zzbcuVar2.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((java.lang.Integer) list.get(i4)).intValue();
                i3 += com.google.android.libraries.places.internal.zzbcu.zzy((intValue2 + intValue2) ^ (intValue2 >> 31));
            }
            zzbcuVar2.zzq(i3);
            while (i2 < list.size()) {
                int intValue3 = ((java.lang.Integer) list.get(i2)).intValue();
                zzbcuVar2.zzq((intValue3 + intValue3) ^ (intValue3 >> 31));
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbdr zzbdrVar = (com.google.android.libraries.places.internal.zzbdr) list;
        if (!z) {
            while (i2 < zzbdrVar.size()) {
                com.google.android.libraries.places.internal.zzbcu zzbcuVar3 = this.zza;
                int zzf = zzbdrVar.zzf(i2);
                zzbcuVar3.zzJ(i, (zzf + zzf) ^ (zzf >> 31));
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbcu zzbcuVar4 = this.zza;
        zzbcuVar4.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbdrVar.size(); i6++) {
            int zzf2 = zzbdrVar.zzf(i6);
            i5 += com.google.android.libraries.places.internal.zzbcu.zzy((zzf2 + zzf2) ^ (zzf2 >> 31));
        }
        zzbcuVar4.zzq(i5);
        while (i2 < zzbdrVar.size()) {
            int zzf3 = zzbdrVar.zzf(i2);
            zzbcuVar4.zzq((zzf3 + zzf3) ^ (zzf3 >> 31));
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzL(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.libraries.places.internal.zzbem)) {
            if (!z) {
                while (i2 < list.size()) {
                    com.google.android.libraries.places.internal.zzbcu zzbcuVar = this.zza;
                    long longValue = ((java.lang.Long) list.get(i2)).longValue();
                    zzbcuVar.zzL(i, (longValue + longValue) ^ (longValue >> 63));
                    i2++;
                }
                return;
            }
            com.google.android.libraries.places.internal.zzbcu zzbcuVar2 = this.zza;
            zzbcuVar2.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((java.lang.Long) list.get(i4)).longValue();
                i3 += com.google.android.libraries.places.internal.zzbcu.zzz((longValue2 + longValue2) ^ (longValue2 >> 63));
            }
            zzbcuVar2.zzq(i3);
            while (i2 < list.size()) {
                long longValue3 = ((java.lang.Long) list.get(i2)).longValue();
                zzbcuVar2.zzs((longValue3 + longValue3) ^ (longValue3 >> 63));
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbem zzbemVar = (com.google.android.libraries.places.internal.zzbem) list;
        if (!z) {
            while (i2 < zzbemVar.size()) {
                com.google.android.libraries.places.internal.zzbcu zzbcuVar3 = this.zza;
                long zze = zzbemVar.zze(i2);
                zzbcuVar3.zzL(i, (zze + zze) ^ (zze >> 63));
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbcu zzbcuVar4 = this.zza;
        zzbcuVar4.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbemVar.size(); i6++) {
            long zze2 = zzbemVar.zze(i6);
            i5 += com.google.android.libraries.places.internal.zzbcu.zzz((zze2 + zze2) ^ (zze2 >> 63));
        }
        zzbcuVar4.zzq(i5);
        while (i2 < zzbemVar.size()) {
            long zze3 = zzbemVar.zze(i2);
            zzbcuVar4.zzs((zze3 + zze3) ^ (zze3 >> 63));
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbgl
    public final void zzy(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.libraries.places.internal.zzbem)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzL(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            com.google.android.libraries.places.internal.zzbcu zzbcuVar = this.zza;
            zzbcuVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.android.libraries.places.internal.zzbcu.zzz(((java.lang.Long) list.get(i4)).longValue());
            }
            zzbcuVar.zzq(i3);
            while (i2 < list.size()) {
                zzbcuVar.zzs(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbem zzbemVar = (com.google.android.libraries.places.internal.zzbem) list;
        if (!z) {
            while (i2 < zzbemVar.size()) {
                this.zza.zzL(i, zzbemVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.libraries.places.internal.zzbcu zzbcuVar2 = this.zza;
        zzbcuVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbemVar.size(); i6++) {
            i5 += com.google.android.libraries.places.internal.zzbcu.zzz(zzbemVar.zze(i6));
        }
        zzbcuVar2.zzq(i5);
        while (i2 < zzbemVar.size()) {
            zzbcuVar2.zzs(zzbemVar.zze(i2));
            i2++;
        }
    }
}
