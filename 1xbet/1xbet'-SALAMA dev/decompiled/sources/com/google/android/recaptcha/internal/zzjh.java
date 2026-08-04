package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzjh implements zzno {
    private final zzjg zza;

    private zzjh(zzjg zzjgVar) {
        byte[] bArr = zzla.zzb;
        this.zza = zzjgVar;
        zzjgVar.zza = this;
    }

    public static zzjh zza(zzjg zzjgVar) {
        zzjh zzjhVar = zzjgVar.zza;
        return zzjhVar != null ? zzjhVar : new zzjh(zzjgVar);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzA(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzlm)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzh(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            this.zza.zzo(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).getClass();
                i9 += 8;
            }
            this.zza.zzq(i9);
            while (i8 < list.size()) {
                this.zza.zzi(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zzlm zzlmVar = (zzlm) list;
        if (!z4) {
            while (i8 < zzlmVar.size()) {
                this.zza.zzh(i7, zzlmVar.zze(i8));
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzlmVar.size(); i12++) {
            zzlmVar.zze(i12);
            i11 += 8;
        }
        this.zza.zzq(i11);
        while (i8 < zzlmVar.size()) {
            this.zza.zzi(zzlmVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzB(int i7, int i8) {
        this.zza.zzp(i7, (i8 >> 31) ^ (i8 + i8));
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzC(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzkt)) {
            if (!z4) {
                while (i8 < list.size()) {
                    zzjg zzjgVar = this.zza;
                    int iIntValue = ((Integer) list.get(i8)).intValue();
                    zzjgVar.zzp(i7, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i8++;
                }
                return;
            }
            this.zza.zzo(i7, 2);
            int iZzx = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                int iIntValue2 = ((Integer) list.get(i9)).intValue();
                iZzx += zzjg.zzx((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.zza.zzq(iZzx);
            while (i8 < list.size()) {
                zzjg zzjgVar2 = this.zza;
                int iIntValue3 = ((Integer) list.get(i8)).intValue();
                zzjgVar2.zzq((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i8++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (!z4) {
            while (i8 < zzktVar.size()) {
                zzjg zzjgVar3 = this.zza;
                int iZze = zzktVar.zze(i8);
                zzjgVar3.zzp(i7, (iZze >> 31) ^ (iZze + iZze));
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int iZzx2 = 0;
        for (int i10 = 0; i10 < zzktVar.size(); i10++) {
            int iZze2 = zzktVar.zze(i10);
            iZzx2 += zzjg.zzx((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        this.zza.zzq(iZzx2);
        while (i8 < zzktVar.size()) {
            zzjg zzjgVar4 = this.zza;
            int iZze3 = zzktVar.zze(i8);
            zzjgVar4.zzq((iZze3 >> 31) ^ (iZze3 + iZze3));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzD(int i7, long j) {
        this.zza.zzr(i7, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzE(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzlm)) {
            if (!z4) {
                while (i8 < list.size()) {
                    zzjg zzjgVar = this.zza;
                    long jLongValue = ((Long) list.get(i8)).longValue();
                    zzjgVar.zzr(i7, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i8++;
                }
                return;
            }
            this.zza.zzo(i7, 2);
            int iZzy = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                long jLongValue2 = ((Long) list.get(i9)).longValue();
                iZzy += zzjg.zzy((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.zza.zzq(iZzy);
            while (i8 < list.size()) {
                zzjg zzjgVar2 = this.zza;
                long jLongValue3 = ((Long) list.get(i8)).longValue();
                zzjgVar2.zzs((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i8++;
            }
            return;
        }
        zzlm zzlmVar = (zzlm) list;
        if (!z4) {
            while (i8 < zzlmVar.size()) {
                zzjg zzjgVar3 = this.zza;
                long jZze = zzlmVar.zze(i8);
                zzjgVar3.zzr(i7, (jZze >> 63) ^ (jZze + jZze));
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int iZzy2 = 0;
        for (int i10 = 0; i10 < zzlmVar.size(); i10++) {
            long jZze2 = zzlmVar.zze(i10);
            iZzy2 += zzjg.zzy((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        this.zza.zzq(iZzy2);
        while (i8 < zzlmVar.size()) {
            zzjg zzjgVar4 = this.zza;
            long jZze3 = zzlmVar.zze(i8);
            zzjgVar4.zzs((jZze3 >> 63) ^ (jZze3 + jZze3));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    @Deprecated
    public final void zzF(int i7) {
        this.zza.zzo(i7, 3);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzG(int i7, String str) {
        this.zza.zzm(i7, str);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzH(int i7, List list) {
        int i8 = 0;
        if (!(list instanceof zzlj)) {
            while (i8 < list.size()) {
                this.zza.zzm(i7, (String) list.get(i8));
                i8++;
            }
            return;
        }
        zzlj zzljVar = (zzlj) list;
        while (i8 < list.size()) {
            Object objZzc = zzljVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzm(i7, (String) objZzc);
            } else {
                this.zza.zze(i7, (zziv) objZzc);
            }
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzI(int i7, int i8) {
        this.zza.zzp(i7, i8);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzJ(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzkt)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzp(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzo(i7, 2);
            int iZzx = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzx += zzjg.zzx(((Integer) list.get(i9)).intValue());
            }
            this.zza.zzq(iZzx);
            while (i8 < list.size()) {
                this.zza.zzq(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (!z4) {
            while (i8 < zzktVar.size()) {
                this.zza.zzp(i7, zzktVar.zze(i8));
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int iZzx2 = 0;
        for (int i10 = 0; i10 < zzktVar.size(); i10++) {
            iZzx2 += zzjg.zzx(zzktVar.zze(i10));
        }
        this.zza.zzq(iZzx2);
        while (i8 < zzktVar.size()) {
            this.zza.zzq(zzktVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzK(int i7, long j) {
        this.zza.zzr(i7, j);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzL(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzlm)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzr(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            this.zza.zzo(i7, 2);
            int iZzy = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzy += zzjg.zzy(((Long) list.get(i9)).longValue());
            }
            this.zza.zzq(iZzy);
            while (i8 < list.size()) {
                this.zza.zzs(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zzlm zzlmVar = (zzlm) list;
        if (!z4) {
            while (i8 < zzlmVar.size()) {
                this.zza.zzr(i7, zzlmVar.zze(i8));
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int iZzy2 = 0;
        for (int i10 = 0; i10 < zzlmVar.size(); i10++) {
            iZzy2 += zzjg.zzy(zzlmVar.zze(i10));
        }
        this.zza.zzq(iZzy2);
        while (i8 < zzlmVar.size()) {
            this.zza.zzs(zzlmVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzb(int i7, boolean z4) {
        this.zza.zzd(i7, z4);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzc(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzim)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzd(i7, ((Boolean) list.get(i8)).booleanValue());
                    i8++;
                }
                return;
            }
            this.zza.zzo(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Boolean) list.get(i10)).getClass();
                i9++;
            }
            this.zza.zzq(i9);
            while (i8 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i8)).booleanValue() ? (byte) 1 : (byte) 0);
                i8++;
            }
            return;
        }
        zzim zzimVar = (zzim) list;
        if (!z4) {
            while (i8 < zzimVar.size()) {
                this.zza.zzd(i7, zzimVar.zzf(i8));
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzimVar.size(); i12++) {
            zzimVar.zzf(i12);
            i11++;
        }
        this.zza.zzq(i11);
        while (i8 < zzimVar.size()) {
            this.zza.zzb(zzimVar.zzf(i8) ? (byte) 1 : (byte) 0);
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzd(int i7, zziv zzivVar) {
        this.zza.zze(i7, zzivVar);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zze(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.zza.zze(i7, (zziv) list.get(i8));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzf(int i7, double d7) {
        this.zza.zzh(i7, Double.doubleToRawLongBits(d7));
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzg(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzjx)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzh(i7, Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                    i8++;
                }
                return;
            }
            this.zza.zzo(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Double) list.get(i10)).getClass();
                i9 += 8;
            }
            this.zza.zzq(i9);
            while (i8 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                i8++;
            }
            return;
        }
        zzjx zzjxVar = (zzjx) list;
        if (!z4) {
            while (i8 < zzjxVar.size()) {
                this.zza.zzh(i7, Double.doubleToRawLongBits(zzjxVar.zze(i8)));
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzjxVar.size(); i12++) {
            zzjxVar.zze(i12);
            i11 += 8;
        }
        this.zza.zzq(i11);
        while (i8 < zzjxVar.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(zzjxVar.zze(i8)));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    @Deprecated
    public final void zzh(int i7) {
        this.zza.zzo(i7, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzi(int i7, int i8) {
        this.zza.zzj(i7, i8);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzj(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzkt)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzj(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzo(i7, 2);
            int iZzy = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzy += zzjg.zzy(((Integer) list.get(i9)).intValue());
            }
            this.zza.zzq(iZzy);
            while (i8 < list.size()) {
                this.zza.zzk(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (!z4) {
            while (i8 < zzktVar.size()) {
                this.zza.zzj(i7, zzktVar.zze(i8));
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int iZzy2 = 0;
        for (int i10 = 0; i10 < zzktVar.size(); i10++) {
            iZzy2 += zzjg.zzy(zzktVar.zze(i10));
        }
        this.zza.zzq(iZzy2);
        while (i8 < zzktVar.size()) {
            this.zza.zzk(zzktVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzk(int i7, int i8) {
        this.zza.zzf(i7, i8);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzl(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzkt)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzf(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzo(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i9 += 4;
            }
            this.zza.zzq(i9);
            while (i8 < list.size()) {
                this.zza.zzg(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (!z4) {
            while (i8 < zzktVar.size()) {
                this.zza.zzf(i7, zzktVar.zze(i8));
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzktVar.size(); i12++) {
            zzktVar.zze(i12);
            i11 += 4;
        }
        this.zza.zzq(i11);
        while (i8 < zzktVar.size()) {
            this.zza.zzg(zzktVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzm(int i7, long j) {
        this.zza.zzh(i7, j);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzn(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzlm)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzh(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            this.zza.zzo(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).getClass();
                i9 += 8;
            }
            this.zza.zzq(i9);
            while (i8 < list.size()) {
                this.zza.zzi(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zzlm zzlmVar = (zzlm) list;
        if (!z4) {
            while (i8 < zzlmVar.size()) {
                this.zza.zzh(i7, zzlmVar.zze(i8));
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzlmVar.size(); i12++) {
            zzlmVar.zze(i12);
            i11 += 8;
        }
        this.zza.zzq(i11);
        while (i8 < zzlmVar.size()) {
            this.zza.zzi(zzlmVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzo(int i7, float f7) {
        this.zza.zzf(i7, Float.floatToRawIntBits(f7));
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzp(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzkk)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzf(i7, Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                    i8++;
                }
                return;
            }
            this.zza.zzo(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Float) list.get(i10)).getClass();
                i9 += 4;
            }
            this.zza.zzq(i9);
            while (i8 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                i8++;
            }
            return;
        }
        zzkk zzkkVar = (zzkk) list;
        if (!z4) {
            while (i8 < zzkkVar.size()) {
                this.zza.zzf(i7, Float.floatToRawIntBits(zzkkVar.zze(i8)));
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzkkVar.size(); i12++) {
            zzkkVar.zze(i12);
            i11 += 4;
        }
        this.zza.zzq(i11);
        while (i8 < zzkkVar.size()) {
            this.zza.zzg(Float.floatToRawIntBits(zzkkVar.zze(i8)));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzq(int i7, Object obj, zzmk zzmkVar) {
        zzjg zzjgVar = this.zza;
        zzjgVar.zzo(i7, 3);
        zzmkVar.zzj((zzlx) obj, zzjgVar.zza);
        zzjgVar.zzo(i7, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzr(int i7, int i8) {
        this.zza.zzj(i7, i8);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzs(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzkt)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzj(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzo(i7, 2);
            int iZzy = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzy += zzjg.zzy(((Integer) list.get(i9)).intValue());
            }
            this.zza.zzq(iZzy);
            while (i8 < list.size()) {
                this.zza.zzk(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (!z4) {
            while (i8 < zzktVar.size()) {
                this.zza.zzj(i7, zzktVar.zze(i8));
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int iZzy2 = 0;
        for (int i10 = 0; i10 < zzktVar.size(); i10++) {
            iZzy2 += zzjg.zzy(zzktVar.zze(i10));
        }
        this.zza.zzq(iZzy2);
        while (i8 < zzktVar.size()) {
            this.zza.zzk(zzktVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzt(int i7, long j) {
        this.zza.zzr(i7, j);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzu(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzlm)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzr(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            this.zza.zzo(i7, 2);
            int iZzy = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzy += zzjg.zzy(((Long) list.get(i9)).longValue());
            }
            this.zza.zzq(iZzy);
            while (i8 < list.size()) {
                this.zza.zzs(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zzlm zzlmVar = (zzlm) list;
        if (!z4) {
            while (i8 < zzlmVar.size()) {
                this.zza.zzr(i7, zzlmVar.zze(i8));
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int iZzy2 = 0;
        for (int i10 = 0; i10 < zzlmVar.size(); i10++) {
            iZzy2 += zzjg.zzy(zzlmVar.zze(i10));
        }
        this.zza.zzq(iZzy2);
        while (i8 < zzlmVar.size()) {
            this.zza.zzs(zzlmVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzv(int i7, Object obj, zzmk zzmkVar) {
        zzlx zzlxVar = (zzlx) obj;
        zzjd zzjdVar = (zzjd) this.zza;
        zzjdVar.zzq((i7 << 3) | 2);
        zzjdVar.zzq(((zzig) zzlxVar).zza(zzmkVar));
        zzmkVar.zzj(zzlxVar, zzjdVar.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzw(int i7, Object obj) {
        if (obj instanceof zziv) {
            zzjd zzjdVar = (zzjd) this.zza;
            zzjdVar.zzq(11);
            zzjdVar.zzp(2, i7);
            zzjdVar.zze(3, (zziv) obj);
            zzjdVar.zzq(12);
            return;
        }
        zzjg zzjgVar = this.zza;
        zzlx zzlxVar = (zzlx) obj;
        zzjd zzjdVar2 = (zzjd) zzjgVar;
        zzjdVar2.zzq(11);
        zzjdVar2.zzp(2, i7);
        zzjdVar2.zzq(26);
        zzjdVar2.zzq(zzlxVar.zzn());
        zzlxVar.zze(zzjgVar);
        zzjdVar2.zzq(12);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzx(int i7, int i8) {
        this.zza.zzf(i7, i8);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzy(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzkt)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzf(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzo(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i9 += 4;
            }
            this.zza.zzq(i9);
            while (i8 < list.size()) {
                this.zza.zzg(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (!z4) {
            while (i8 < zzktVar.size()) {
                this.zza.zzf(i7, zzktVar.zze(i8));
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzktVar.size(); i12++) {
            zzktVar.zze(i12);
            i11 += 4;
        }
        this.zza.zzq(i11);
        while (i8 < zzktVar.size()) {
            this.zza.zzg(zzktVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzz(int i7, long j) {
        this.zza.zzh(i7, j);
    }
}
