package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzbz implements com.google.android.gms.internal.play_billing.zzfx {
    private final com.google.android.gms.internal.play_billing.zzby zza;

    private zzbz(com.google.android.gms.internal.play_billing.zzby zzbyVar) {
        byte[] bArr = com.google.android.gms.internal.play_billing.zzda.zzd;
        this.zza = zzbyVar;
        zzbyVar.zza = this;
    }

    public static com.google.android.gms.internal.play_billing.zzbz zza(com.google.android.gms.internal.play_billing.zzby zzbyVar) {
        com.google.android.gms.internal.play_billing.zzbz zzbzVar = zzbyVar.zza;
        return zzbzVar != null ? zzbzVar : new com.google.android.gms.internal.play_billing.zzbz(zzbyVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzB(int i, int i2) throws java.io.IOException {
        this.zza.zzp(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzD(int i, long j) throws java.io.IOException {
        this.zza.zzr(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    @java.lang.Deprecated
    public final void zzF(int i) throws java.io.IOException {
        this.zza.zzo(i, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzG(int i, java.lang.String str) throws java.io.IOException {
        this.zza.zzm(i, str);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzI(int i, int i2) throws java.io.IOException {
        this.zza.zzp(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzK(int i, long j) throws java.io.IOException {
        this.zza.zzr(i, j);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzb(int i, boolean z) throws java.io.IOException {
        this.zza.zzd(i, z);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzd(int i, com.google.android.gms.internal.play_billing.zzbq zzbqVar) throws java.io.IOException {
        this.zza.zze(i, zzbqVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zze(int i, java.util.List list) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zze(i, (com.google.android.gms.internal.play_billing.zzbq) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzf(int i, double d) throws java.io.IOException {
        this.zza.zzh(i, java.lang.Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    @java.lang.Deprecated
    public final void zzh(int i) throws java.io.IOException {
        this.zza.zzo(i, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzi(int i, int i2) throws java.io.IOException {
        this.zza.zzj(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzk(int i, int i2) throws java.io.IOException {
        this.zza.zzf(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzm(int i, long j) throws java.io.IOException {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzo(int i, float f) throws java.io.IOException {
        this.zza.zzf(i, java.lang.Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzq(int i, java.lang.Object obj, com.google.android.gms.internal.play_billing.zzeo zzeoVar) throws java.io.IOException {
        com.google.android.gms.internal.play_billing.zzby zzbyVar = this.zza;
        zzbyVar.zzo(i, 3);
        zzeoVar.zzi((com.google.android.gms.internal.play_billing.zzec) obj, zzbyVar.zza);
        zzbyVar.zzo(i, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzr(int i, int i2) throws java.io.IOException {
        this.zza.zzj(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzt(int i, long j) throws java.io.IOException {
        this.zza.zzr(i, j);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzv(int i, java.lang.Object obj, com.google.android.gms.internal.play_billing.zzeo zzeoVar) throws java.io.IOException {
        com.google.android.gms.internal.play_billing.zzec zzecVar = (com.google.android.gms.internal.play_billing.zzec) obj;
        com.google.android.gms.internal.play_billing.zzbv zzbvVar = (com.google.android.gms.internal.play_billing.zzbv) this.zza;
        zzbvVar.zzq((i << 3) | 2);
        zzbvVar.zzq(((com.google.android.gms.internal.play_billing.zzay) zzecVar).zza(zzeoVar));
        zzeoVar.zzi(zzecVar, zzbvVar.zza);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzw(int i, java.lang.Object obj) throws java.io.IOException {
        if (obj instanceof com.google.android.gms.internal.play_billing.zzbq) {
            com.google.android.gms.internal.play_billing.zzbv zzbvVar = (com.google.android.gms.internal.play_billing.zzbv) this.zza;
            zzbvVar.zzq(11);
            zzbvVar.zzp(2, i);
            zzbvVar.zze(3, (com.google.android.gms.internal.play_billing.zzbq) obj);
            zzbvVar.zzq(12);
            return;
        }
        com.google.android.gms.internal.play_billing.zzby zzbyVar = this.zza;
        com.google.android.gms.internal.play_billing.zzec zzecVar = (com.google.android.gms.internal.play_billing.zzec) obj;
        com.google.android.gms.internal.play_billing.zzbv zzbvVar2 = (com.google.android.gms.internal.play_billing.zzbv) zzbyVar;
        zzbvVar2.zzq(11);
        zzbvVar2.zzp(2, i);
        zzbvVar2.zzq(26);
        zzbvVar2.zzq(zzecVar.zzf());
        zzecVar.zze(zzbyVar);
        zzbvVar2.zzq(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzx(int i, int i2) throws java.io.IOException {
        this.zza.zzf(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzz(int i, long j) throws java.io.IOException {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzH(int i, java.util.List list) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzdk)) {
            while (i2 < list.size()) {
                this.zza.zzm(i, (java.lang.String) list.get(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzdk zzdkVar = (com.google.android.gms.internal.play_billing.zzdk) list;
        while (i2 < list.size()) {
            java.lang.Object zzf = zzdkVar.zzf(i2);
            if (zzf instanceof java.lang.String) {
                this.zza.zzm(i, (java.lang.String) zzf);
            } else {
                this.zza.zze(i, (com.google.android.gms.internal.play_billing.zzbq) zzf);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzJ(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzct)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzp(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.android.gms.internal.play_billing.zzby.zzw(((java.lang.Integer) list.get(i4)).intValue());
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzq(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzct zzctVar = (com.google.android.gms.internal.play_billing.zzct) list;
        if (!z) {
            while (i2 < zzctVar.size()) {
                this.zza.zzp(i, zzctVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzctVar.size(); i6++) {
            i5 += com.google.android.gms.internal.play_billing.zzby.zzw(zzctVar.zze(i6));
        }
        this.zza.zzq(i5);
        while (i2 < zzctVar.size()) {
            this.zza.zzq(zzctVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzL(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzdr)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzr(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.android.gms.internal.play_billing.zzby.zzx(((java.lang.Long) list.get(i4)).longValue());
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzs(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzdr zzdrVar = (com.google.android.gms.internal.play_billing.zzdr) list;
        if (!z) {
            while (i2 < zzdrVar.size()) {
                this.zza.zzr(i, zzdrVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzdrVar.size(); i6++) {
            i5 += com.google.android.gms.internal.play_billing.zzby.zzx(zzdrVar.zze(i6));
        }
        this.zza.zzq(i5);
        while (i2 < zzdrVar.size()) {
            this.zza.zzs(zzdrVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzl(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzct)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzg(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzct zzctVar = (com.google.android.gms.internal.play_billing.zzct) list;
        if (!z) {
            while (i2 < zzctVar.size()) {
                this.zza.zzf(i, zzctVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzctVar.size(); i6++) {
            zzctVar.zze(i6);
            i5 += 4;
        }
        this.zza.zzq(i5);
        while (i2 < zzctVar.size()) {
            this.zza.zzg(zzctVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzn(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzdr)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzi(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzdr zzdrVar = (com.google.android.gms.internal.play_billing.zzdr) list;
        if (!z) {
            while (i2 < zzdrVar.size()) {
                this.zza.zzh(i, zzdrVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzdrVar.size(); i6++) {
            zzdrVar.zze(i6);
            i5 += 8;
        }
        this.zza.zzq(i5);
        while (i2 < zzdrVar.size()) {
            this.zza.zzi(zzdrVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzc(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzbe)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzd(i, ((java.lang.Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzb(((java.lang.Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzbe zzbeVar = (com.google.android.gms.internal.play_billing.zzbe) list;
        if (!z) {
            while (i2 < zzbeVar.size()) {
                this.zza.zzd(i, zzbeVar.zzf(i2));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbeVar.size(); i6++) {
            zzbeVar.zzf(i6);
            i5++;
        }
        this.zza.zzq(i5);
        while (i2 < zzbeVar.size()) {
            this.zza.zzb(zzbeVar.zzf(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzs(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzct)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.android.gms.internal.play_billing.zzby.zzx(((java.lang.Integer) list.get(i4)).intValue());
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzk(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzct zzctVar = (com.google.android.gms.internal.play_billing.zzct) list;
        if (!z) {
            while (i2 < zzctVar.size()) {
                this.zza.zzj(i, zzctVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzctVar.size(); i6++) {
            i5 += com.google.android.gms.internal.play_billing.zzby.zzx(zzctVar.zze(i6));
        }
        this.zza.zzq(i5);
        while (i2 < zzctVar.size()) {
            this.zza.zzk(zzctVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzA(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzdr)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzi(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzdr zzdrVar = (com.google.android.gms.internal.play_billing.zzdr) list;
        if (!z) {
            while (i2 < zzdrVar.size()) {
                this.zza.zzh(i, zzdrVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzdrVar.size(); i6++) {
            zzdrVar.zze(i6);
            i5 += 8;
        }
        this.zza.zzq(i5);
        while (i2 < zzdrVar.size()) {
            this.zza.zzi(zzdrVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzg(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzca)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzi(java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzca zzcaVar = (com.google.android.gms.internal.play_billing.zzca) list;
        if (!z) {
            while (i2 < zzcaVar.size()) {
                this.zza.zzh(i, java.lang.Double.doubleToRawLongBits(zzcaVar.zze(i2)));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzcaVar.size(); i6++) {
            zzcaVar.zze(i6);
            i5 += 8;
        }
        this.zza.zzq(i5);
        while (i2 < zzcaVar.size()) {
            this.zza.zzi(java.lang.Double.doubleToRawLongBits(zzcaVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzp(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzck)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzg(java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzck zzckVar = (com.google.android.gms.internal.play_billing.zzck) list;
        if (!z) {
            while (i2 < zzckVar.size()) {
                this.zza.zzf(i, java.lang.Float.floatToRawIntBits(zzckVar.zze(i2)));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzckVar.size(); i6++) {
            zzckVar.zze(i6);
            i5 += 4;
        }
        this.zza.zzq(i5);
        while (i2 < zzckVar.size()) {
            this.zza.zzg(java.lang.Float.floatToRawIntBits(zzckVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzy(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzct)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzg(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzct zzctVar = (com.google.android.gms.internal.play_billing.zzct) list;
        if (!z) {
            while (i2 < zzctVar.size()) {
                this.zza.zzf(i, zzctVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzctVar.size(); i6++) {
            zzctVar.zze(i6);
            i5 += 4;
        }
        this.zza.zzq(i5);
        while (i2 < zzctVar.size()) {
            this.zza.zzg(zzctVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzC(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzct)) {
            if (!z) {
                while (i2 < list.size()) {
                    com.google.android.gms.internal.play_billing.zzby zzbyVar = this.zza;
                    int intValue = ((java.lang.Integer) list.get(i2)).intValue();
                    zzbyVar.zzp(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((java.lang.Integer) list.get(i4)).intValue();
                i3 += com.google.android.gms.internal.play_billing.zzby.zzw((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                com.google.android.gms.internal.play_billing.zzby zzbyVar2 = this.zza;
                int intValue3 = ((java.lang.Integer) list.get(i2)).intValue();
                zzbyVar2.zzq((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzct zzctVar = (com.google.android.gms.internal.play_billing.zzct) list;
        if (!z) {
            while (i2 < zzctVar.size()) {
                com.google.android.gms.internal.play_billing.zzby zzbyVar3 = this.zza;
                int zze = zzctVar.zze(i2);
                zzbyVar3.zzp(i, (zze >> 31) ^ (zze + zze));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzctVar.size(); i6++) {
            int zze2 = zzctVar.zze(i6);
            i5 += com.google.android.gms.internal.play_billing.zzby.zzw((zze2 >> 31) ^ (zze2 + zze2));
        }
        this.zza.zzq(i5);
        while (i2 < zzctVar.size()) {
            com.google.android.gms.internal.play_billing.zzby zzbyVar4 = this.zza;
            int zze3 = zzctVar.zze(i2);
            zzbyVar4.zzq((zze3 >> 31) ^ (zze3 + zze3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzE(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzdr)) {
            if (!z) {
                while (i2 < list.size()) {
                    com.google.android.gms.internal.play_billing.zzby zzbyVar = this.zza;
                    long longValue = ((java.lang.Long) list.get(i2)).longValue();
                    zzbyVar.zzr(i, (longValue >> 63) ^ (longValue + longValue));
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((java.lang.Long) list.get(i4)).longValue();
                i3 += com.google.android.gms.internal.play_billing.zzby.zzx((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                com.google.android.gms.internal.play_billing.zzby zzbyVar2 = this.zza;
                long longValue3 = ((java.lang.Long) list.get(i2)).longValue();
                zzbyVar2.zzs((longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzdr zzdrVar = (com.google.android.gms.internal.play_billing.zzdr) list;
        if (!z) {
            while (i2 < zzdrVar.size()) {
                com.google.android.gms.internal.play_billing.zzby zzbyVar3 = this.zza;
                long zze = zzdrVar.zze(i2);
                zzbyVar3.zzr(i, (zze >> 63) ^ (zze + zze));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzdrVar.size(); i6++) {
            long zze2 = zzdrVar.zze(i6);
            i5 += com.google.android.gms.internal.play_billing.zzby.zzx((zze2 >> 63) ^ (zze2 + zze2));
        }
        this.zza.zzq(i5);
        while (i2 < zzdrVar.size()) {
            com.google.android.gms.internal.play_billing.zzby zzbyVar4 = this.zza;
            long zze3 = zzdrVar.zze(i2);
            zzbyVar4.zzs((zze3 >> 63) ^ (zze3 + zze3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzj(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzct)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.android.gms.internal.play_billing.zzby.zzx(((java.lang.Integer) list.get(i4)).intValue());
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzk(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzct zzctVar = (com.google.android.gms.internal.play_billing.zzct) list;
        if (!z) {
            while (i2 < zzctVar.size()) {
                this.zza.zzj(i, zzctVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzctVar.size(); i6++) {
            i5 += com.google.android.gms.internal.play_billing.zzby.zzx(zzctVar.zze(i6));
        }
        this.zza.zzq(i5);
        while (i2 < zzctVar.size()) {
            this.zza.zzk(zzctVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzu(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzdr)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzr(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.android.gms.internal.play_billing.zzby.zzx(((java.lang.Long) list.get(i4)).longValue());
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzs(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzdr zzdrVar = (com.google.android.gms.internal.play_billing.zzdr) list;
        if (!z) {
            while (i2 < zzdrVar.size()) {
                this.zza.zzr(i, zzdrVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzdrVar.size(); i6++) {
            i5 += com.google.android.gms.internal.play_billing.zzby.zzx(zzdrVar.zze(i6));
        }
        this.zza.zzq(i5);
        while (i2 < zzdrVar.size()) {
            this.zza.zzs(zzdrVar.zze(i2));
            i2++;
        }
    }
}
