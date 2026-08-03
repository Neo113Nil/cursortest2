package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzpw implements com.google.android.gms.internal.consent_sdk.zztb {
    private final com.google.android.gms.internal.consent_sdk.zzpv zza;

    private zzpw(com.google.android.gms.internal.consent_sdk.zzpv zzpvVar) {
        byte[] bArr = com.google.android.gms.internal.consent_sdk.zzqs.zzb;
        this.zza = zzpvVar;
        zzpvVar.zze = this;
    }

    public static com.google.android.gms.internal.consent_sdk.zzpw zza(com.google.android.gms.internal.consent_sdk.zzpv zzpvVar) {
        java.lang.Object obj = zzpvVar.zze;
        return obj != null ? (com.google.android.gms.internal.consent_sdk.zzpw) obj : new com.google.android.gms.internal.consent_sdk.zzpw(zzpvVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzB(int i, int i2) throws java.io.IOException {
        this.zza.zzv(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzD(int i, long j) throws java.io.IOException {
        this.zza.zzx(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzF(int i, java.lang.String str) throws java.io.IOException {
        this.zza.zzs(i, str);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzH(int i, int i2) throws java.io.IOException {
        this.zza.zzv(i, i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzJ(int i, long j) throws java.io.IOException {
        this.zza.zzx(i, j);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzb(int i, boolean z) throws java.io.IOException {
        this.zza.zzK(i, z);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzd(int i, com.google.android.gms.internal.consent_sdk.zzpm zzpmVar) throws java.io.IOException {
        this.zza.zzh(i, zzpmVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zze(int i, java.util.List list) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzh(i, (com.google.android.gms.internal.consent_sdk.zzpm) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzf(int i, double d) throws java.io.IOException {
        this.zza.zzl(i, java.lang.Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzh(int i, int i2) throws java.io.IOException {
        this.zza.zzn(i, i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzj(int i, int i2) throws java.io.IOException {
        this.zza.zzj(i, i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzl(int i, long j) throws java.io.IOException {
        this.zza.zzl(i, j);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzn(int i, float f) throws java.io.IOException {
        this.zza.zzj(i, java.lang.Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzp(int i, java.lang.Object obj, com.google.android.gms.internal.consent_sdk.zzsa zzsaVar) throws java.io.IOException {
        com.google.android.gms.internal.consent_sdk.zzpv zzpvVar = this.zza;
        zzpvVar.zzu(i, 3);
        zzsaVar.zzf((com.google.android.gms.internal.consent_sdk.zzpa) obj, this);
        zzpvVar.zzu(i, 4);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzq(int i, int i2) throws java.io.IOException {
        this.zza.zzn(i, i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzs(int i, long j) throws java.io.IOException {
        this.zza.zzx(i, j);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzu(int i, com.google.android.gms.internal.consent_sdk.zzri zzriVar, java.util.Map map) throws java.io.IOException {
        for (java.util.Map.Entry entry : map.entrySet()) {
            com.google.android.gms.internal.consent_sdk.zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i, 2);
            zzpvVar.zzw(com.google.android.gms.internal.consent_sdk.zzrj.zzb(zzriVar, entry.getKey(), entry.getValue()));
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            com.google.android.gms.internal.consent_sdk.zzqf.zzi(zzpvVar, zzriVar.zza, 1, key);
            com.google.android.gms.internal.consent_sdk.zzqf.zzi(zzpvVar, zzriVar.zzb, 2, value);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzv(int i, java.lang.Object obj, com.google.android.gms.internal.consent_sdk.zzsa zzsaVar) throws java.io.IOException {
        com.google.android.gms.internal.consent_sdk.zzpv zzpvVar = this.zza;
        com.google.android.gms.internal.consent_sdk.zzpa zzpaVar = (com.google.android.gms.internal.consent_sdk.zzpa) obj;
        zzpvVar.zzu(i, 2);
        zzpvVar.zzw(zzpaVar.zzj(zzsaVar));
        zzsaVar.zzf(zzpaVar, this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzw(int i, java.lang.Object obj) throws java.io.IOException {
        if (obj instanceof com.google.android.gms.internal.consent_sdk.zzpm) {
            this.zza.zzr(i, (com.google.android.gms.internal.consent_sdk.zzpm) obj);
        } else {
            this.zza.zzq(i, (com.google.android.gms.internal.consent_sdk.zzrq) obj);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzx(int i, int i2) throws java.io.IOException {
        this.zza.zzj(i, i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzz(int i, long j) throws java.io.IOException {
        this.zza.zzl(i, j);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzG(int i, java.util.List list) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.consent_sdk.zzrb)) {
            while (i2 < list.size()) {
                this.zza.zzs(i, (java.lang.String) list.get(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzrb zzrbVar = (com.google.android.gms.internal.consent_sdk.zzrb) list;
        while (i2 < list.size()) {
            java.lang.Object zza = zzrbVar.zza();
            if (zza instanceof java.lang.String) {
                this.zza.zzs(i, (java.lang.String) zza);
            } else {
                this.zza.zzh(i, (com.google.android.gms.internal.consent_sdk.zzpm) zza);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzI(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.consent_sdk.zzqn)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzv(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.consent_sdk.zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.android.gms.internal.consent_sdk.zzpv.zzC(((java.lang.Integer) list.get(i4)).intValue());
            }
            zzpvVar.zzw(i3);
            while (i2 < list.size()) {
                zzpvVar.zzw(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzqn zzqnVar = (com.google.android.gms.internal.consent_sdk.zzqn) list;
        if (!z) {
            while (i2 < zzqnVar.size()) {
                this.zza.zzv(i, zzqnVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzqnVar.size(); i6++) {
            i5 += com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzqnVar.zze(i6));
        }
        zzpvVar2.zzw(i5);
        while (i2 < zzqnVar.size()) {
            zzpvVar2.zzw(zzqnVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzK(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.consent_sdk.zzre)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzx(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.consent_sdk.zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.android.gms.internal.consent_sdk.zzpv.zzD(((java.lang.Long) list.get(i4)).longValue());
            }
            zzpvVar.zzw(i3);
            while (i2 < list.size()) {
                zzpvVar.zzy(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzre zzreVar = (com.google.android.gms.internal.consent_sdk.zzre) list;
        if (!z) {
            while (i2 < zzreVar.size()) {
                this.zza.zzx(i, zzreVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzreVar.size(); i6++) {
            i5 += com.google.android.gms.internal.consent_sdk.zzpv.zzD(zzreVar.zze(i6));
        }
        zzpvVar2.zzw(i5);
        while (i2 < zzreVar.size()) {
            zzpvVar2.zzy(zzreVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzk(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.consent_sdk.zzqn)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.consent_sdk.zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            zzpvVar.zzw(i3);
            while (i2 < list.size()) {
                zzpvVar.zzk(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzqn zzqnVar = (com.google.android.gms.internal.consent_sdk.zzqn) list;
        if (!z) {
            while (i2 < zzqnVar.size()) {
                this.zza.zzj(i, zzqnVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzqnVar.size(); i6++) {
            zzqnVar.zze(i6);
            i5 += 4;
        }
        zzpvVar2.zzw(i5);
        while (i2 < zzqnVar.size()) {
            zzpvVar2.zzk(zzqnVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzm(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.consent_sdk.zzre)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzl(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.consent_sdk.zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Long) list.get(i4)).longValue();
                i3 += 8;
            }
            zzpvVar.zzw(i3);
            while (i2 < list.size()) {
                zzpvVar.zzm(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzre zzreVar = (com.google.android.gms.internal.consent_sdk.zzre) list;
        if (!z) {
            while (i2 < zzreVar.size()) {
                this.zza.zzl(i, zzreVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzreVar.size(); i6++) {
            zzreVar.zze(i6);
            i5 += 8;
        }
        zzpvVar2.zzw(i5);
        while (i2 < zzreVar.size()) {
            zzpvVar2.zzm(zzreVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzc(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.consent_sdk.zzpd)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzK(i, ((java.lang.Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.consent_sdk.zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            zzpvVar.zzw(i3);
            while (i2 < list.size()) {
                zzpvVar.zzJ(((java.lang.Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzpd zzpdVar = (com.google.android.gms.internal.consent_sdk.zzpd) list;
        if (!z) {
            while (i2 < zzpdVar.size()) {
                this.zza.zzK(i, zzpdVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzpdVar.size(); i6++) {
            zzpdVar.zze(i6);
            i5++;
        }
        zzpvVar2.zzw(i5);
        while (i2 < zzpdVar.size()) {
            zzpvVar2.zzJ(zzpdVar.zze(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzr(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.consent_sdk.zzqn)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzn(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.consent_sdk.zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.android.gms.internal.consent_sdk.zzpv.zzD(((java.lang.Integer) list.get(i4)).intValue());
            }
            zzpvVar.zzw(i3);
            while (i2 < list.size()) {
                zzpvVar.zzo(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzqn zzqnVar = (com.google.android.gms.internal.consent_sdk.zzqn) list;
        if (!z) {
            while (i2 < zzqnVar.size()) {
                this.zza.zzn(i, zzqnVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzqnVar.size(); i6++) {
            i5 += com.google.android.gms.internal.consent_sdk.zzpv.zzD(zzqnVar.zze(i6));
        }
        zzpvVar2.zzw(i5);
        while (i2 < zzqnVar.size()) {
            zzpvVar2.zzo(zzqnVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzA(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.consent_sdk.zzre)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzl(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.consent_sdk.zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Long) list.get(i4)).longValue();
                i3 += 8;
            }
            zzpvVar.zzw(i3);
            while (i2 < list.size()) {
                zzpvVar.zzm(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzre zzreVar = (com.google.android.gms.internal.consent_sdk.zzre) list;
        if (!z) {
            while (i2 < zzreVar.size()) {
                this.zza.zzl(i, zzreVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzreVar.size(); i6++) {
            zzreVar.zze(i6);
            i5 += 8;
        }
        zzpvVar2.zzw(i5);
        while (i2 < zzreVar.size()) {
            zzpvVar2.zzm(zzreVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzg(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.consent_sdk.zzpx)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzl(i, java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.consent_sdk.zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            zzpvVar.zzw(i3);
            while (i2 < list.size()) {
                zzpvVar.zzm(java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzpx zzpxVar = (com.google.android.gms.internal.consent_sdk.zzpx) list;
        if (!z) {
            while (i2 < zzpxVar.size()) {
                this.zza.zzl(i, java.lang.Double.doubleToRawLongBits(zzpxVar.zze(i2)));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzpxVar.size(); i6++) {
            zzpxVar.zze(i6);
            i5 += 8;
        }
        zzpvVar2.zzw(i5);
        while (i2 < zzpxVar.size()) {
            zzpvVar2.zzm(java.lang.Double.doubleToRawLongBits(zzpxVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzo(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.consent_sdk.zzqh)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.consent_sdk.zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            zzpvVar.zzw(i3);
            while (i2 < list.size()) {
                zzpvVar.zzk(java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzqh zzqhVar = (com.google.android.gms.internal.consent_sdk.zzqh) list;
        if (!z) {
            while (i2 < zzqhVar.size()) {
                this.zza.zzj(i, java.lang.Float.floatToRawIntBits(zzqhVar.zze(i2)));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzqhVar.size(); i6++) {
            zzqhVar.zze(i6);
            i5 += 4;
        }
        zzpvVar2.zzw(i5);
        while (i2 < zzqhVar.size()) {
            zzpvVar2.zzk(java.lang.Float.floatToRawIntBits(zzqhVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzy(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.consent_sdk.zzqn)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.consent_sdk.zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            zzpvVar.zzw(i3);
            while (i2 < list.size()) {
                zzpvVar.zzk(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzqn zzqnVar = (com.google.android.gms.internal.consent_sdk.zzqn) list;
        if (!z) {
            while (i2 < zzqnVar.size()) {
                this.zza.zzj(i, zzqnVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzqnVar.size(); i6++) {
            zzqnVar.zze(i6);
            i5 += 4;
        }
        zzpvVar2.zzw(i5);
        while (i2 < zzqnVar.size()) {
            zzpvVar2.zzk(zzqnVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzC(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.consent_sdk.zzqn)) {
            if (!z) {
                while (i2 < list.size()) {
                    com.google.android.gms.internal.consent_sdk.zzpv zzpvVar = this.zza;
                    int intValue = ((java.lang.Integer) list.get(i2)).intValue();
                    zzpvVar.zzv(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.consent_sdk.zzpv zzpvVar2 = this.zza;
            zzpvVar2.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((java.lang.Integer) list.get(i4)).intValue();
                i3 += com.google.android.gms.internal.consent_sdk.zzpv.zzC((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zzpvVar2.zzw(i3);
            while (i2 < list.size()) {
                int intValue3 = ((java.lang.Integer) list.get(i2)).intValue();
                zzpvVar2.zzw((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzqn zzqnVar = (com.google.android.gms.internal.consent_sdk.zzqn) list;
        if (!z) {
            while (i2 < zzqnVar.size()) {
                com.google.android.gms.internal.consent_sdk.zzpv zzpvVar3 = this.zza;
                int zze = zzqnVar.zze(i2);
                zzpvVar3.zzv(i, (zze >> 31) ^ (zze + zze));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzpv zzpvVar4 = this.zza;
        zzpvVar4.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzqnVar.size(); i6++) {
            int zze2 = zzqnVar.zze(i6);
            i5 += com.google.android.gms.internal.consent_sdk.zzpv.zzC((zze2 >> 31) ^ (zze2 + zze2));
        }
        zzpvVar4.zzw(i5);
        while (i2 < zzqnVar.size()) {
            int zze3 = zzqnVar.zze(i2);
            zzpvVar4.zzw((zze3 >> 31) ^ (zze3 + zze3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzE(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.consent_sdk.zzre)) {
            if (!z) {
                while (i2 < list.size()) {
                    com.google.android.gms.internal.consent_sdk.zzpv zzpvVar = this.zza;
                    long longValue = ((java.lang.Long) list.get(i2)).longValue();
                    zzpvVar.zzx(i, (longValue >> 63) ^ (longValue + longValue));
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.consent_sdk.zzpv zzpvVar2 = this.zza;
            zzpvVar2.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((java.lang.Long) list.get(i4)).longValue();
                i3 += com.google.android.gms.internal.consent_sdk.zzpv.zzD((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            zzpvVar2.zzw(i3);
            while (i2 < list.size()) {
                long longValue3 = ((java.lang.Long) list.get(i2)).longValue();
                zzpvVar2.zzy((longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzre zzreVar = (com.google.android.gms.internal.consent_sdk.zzre) list;
        if (!z) {
            while (i2 < zzreVar.size()) {
                com.google.android.gms.internal.consent_sdk.zzpv zzpvVar3 = this.zza;
                long zze = zzreVar.zze(i2);
                zzpvVar3.zzx(i, (zze >> 63) ^ (zze + zze));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzpv zzpvVar4 = this.zza;
        zzpvVar4.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzreVar.size(); i6++) {
            long zze2 = zzreVar.zze(i6);
            i5 += com.google.android.gms.internal.consent_sdk.zzpv.zzD((zze2 >> 63) ^ (zze2 + zze2));
        }
        zzpvVar4.zzw(i5);
        while (i2 < zzreVar.size()) {
            long zze3 = zzreVar.zze(i2);
            zzpvVar4.zzy((zze3 >> 63) ^ (zze3 + zze3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzi(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.consent_sdk.zzqn)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzn(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.consent_sdk.zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.android.gms.internal.consent_sdk.zzpv.zzD(((java.lang.Integer) list.get(i4)).intValue());
            }
            zzpvVar.zzw(i3);
            while (i2 < list.size()) {
                zzpvVar.zzo(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzqn zzqnVar = (com.google.android.gms.internal.consent_sdk.zzqn) list;
        if (!z) {
            while (i2 < zzqnVar.size()) {
                this.zza.zzn(i, zzqnVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzqnVar.size(); i6++) {
            i5 += com.google.android.gms.internal.consent_sdk.zzpv.zzD(zzqnVar.zze(i6));
        }
        zzpvVar2.zzw(i5);
        while (i2 < zzqnVar.size()) {
            zzpvVar2.zzo(zzqnVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztb
    public final void zzt(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.consent_sdk.zzre)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzx(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.consent_sdk.zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += com.google.android.gms.internal.consent_sdk.zzpv.zzD(((java.lang.Long) list.get(i4)).longValue());
            }
            zzpvVar.zzw(i3);
            while (i2 < list.size()) {
                zzpvVar.zzy(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzre zzreVar = (com.google.android.gms.internal.consent_sdk.zzre) list;
        if (!z) {
            while (i2 < zzreVar.size()) {
                this.zza.zzx(i, zzreVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzreVar.size(); i6++) {
            i5 += com.google.android.gms.internal.consent_sdk.zzpv.zzD(zzreVar.zze(i6));
        }
        zzpvVar2.zzw(i5);
        while (i2 < zzreVar.size()) {
            zzpvVar2.zzy(zzreVar.zze(i2));
            i2++;
        }
    }
}
