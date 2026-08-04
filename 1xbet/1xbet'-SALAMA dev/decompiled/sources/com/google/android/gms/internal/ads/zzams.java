package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;

/* JADX INFO: loaded from: classes.dex */
public final class zzams implements zzann {
    private final zzaly zza;
    private final zzec zzb = new zzec(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzek zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzams(zzaly zzalyVar) {
        this.zza = zzalyVar;
    }

    private final void zze(int i7) {
        this.zzc = i7;
        this.zzd = 0;
    }

    private final boolean zzf(zzed zzedVar, byte[] bArr, int i7) {
        int iMin = Math.min(zzedVar.zzb(), i7 - this.zzd);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zzedVar.zzM(iMin);
        } else {
            zzedVar.zzH(bArr, this.zzd, iMin);
        }
        int i8 = this.zzd + iMin;
        this.zzd = i8;
        return i8 == i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r8v15, types: [com.google.android.gms.internal.ads.zzec] */
    /* JADX WARN: Type inference failed for: r8v8, types: [com.google.android.gms.internal.ads.zzaly] */
    /* JADX WARN: Type inference failed for: r8v9, types: [int] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v9, types: [int] */
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
    @Override // com.google.android.gms.internal.ads.zzann
    public final void zza(zzed zzedVar, int i7) {
        int i8;
        ?? r7;
        int i9;
        int i10;
        int i11;
        int i12;
        ?? r9;
        long jZzb;
        zzcv.zzb(this.zze);
        int i13 = -1;
        int i14 = 2;
        ?? r8 = 0;
        int i15 = 1;
        if ((i7 & 1) != 0) {
            int i16 = this.zzc;
            if (i16 != 0 && i16 != 1) {
                if (i16 != 2) {
                    int i17 = this.zzj;
                    if (i17 != -1) {
                        zzdq.zzf("PesReader", "Unexpected start indicator: expected " + i17 + " more bytes");
                    }
                    this.zza.zzc(zzedVar.zze() == 0);
                } else {
                    zzdq.zzf("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i18 = i7;
        while (zzedVar.zzb() > 0) {
            int i19 = this.zzc;
            if (i19 == 0) {
                i8 = i14;
                r7 = r8;
                i9 = i15;
                i10 = i13;
                zzedVar.zzM(zzedVar.zzb());
            } else if (i19 != i15) {
                if (i19 != i14) {
                    int iZzb = zzedVar.zzb();
                    int i20 = this.zzj;
                    if (i20 == i13) {
                        r9 = r8;
                    } else {
                        i12 = iZzb - i20;
                    }
                    if (r9 > 0) {
                        r9 = i12;
                        iZzb -= r9;
                        zzedVar.zzK(zzedVar.zzd() + iZzb);
                    }
                    r9 = i12;
                    this.zza.zza(zzedVar);
                    int i21 = this.zzj;
                    if (i21 != i13) {
                        int i22 = i21 - iZzb;
                        this.zzj = i22;
                        if (i22 == 0) {
                            this.zza.zzc(r8);
                            zze(i15);
                        }
                    }
                } else {
                    if (zzf(zzedVar, this.zzb.zza, Math.min(10, this.zzi)) && zzf(zzedVar, null, this.zzi)) {
                        this.zzb.zzl(r8);
                        if (this.zzf) {
                            this.zzb.zzn(4);
                            long jZzd = this.zzb.zzd(3);
                            this.zzb.zzn(i15);
                            int iZzd = this.zzb.zzd(15) << 15;
                            this.zzb.zzn(i15);
                            long jZzd2 = this.zzb.zzd(15);
                            this.zzb.zzn(i15);
                            if (!this.zzh && this.zzg) {
                                this.zzb.zzn(4);
                                long jZzd3 = ((long) this.zzb.zzd(3)) << 30;
                                this.zzb.zzn(i15);
                                int iZzd2 = this.zzb.zzd(15) << 15;
                                this.zzb.zzn(i15);
                                long jZzd4 = this.zzb.zzd(15);
                                this.zzb.zzn(i15);
                                this.zze.zzb(jZzd3 | ((long) iZzd2) | jZzd4);
                                this.zzh = true;
                            }
                            jZzb = this.zze.zzb((jZzd << 30) | ((long) iZzd) | jZzd2);
                        } else {
                            jZzb = -9223372036854775807L;
                        }
                        i18 |= true != this.zzk ? 0 : 4;
                        this.zza.zzd(jZzb, i18);
                        zze(3);
                        i13 = -1;
                        i14 = 2;
                        r8 = 0;
                        i15 = 1;
                    }
                }
                i8 = i14;
                r7 = r8;
                i9 = i15;
                i10 = i13;
            } else if (zzf(zzedVar, this.zzb.zza, 9)) {
                r7 = 0;
                this.zzb.zzl(0);
                int iZzd3 = this.zzb.zzd(24);
                i9 = 1;
                if (iZzd3 != 1) {
                    AbstractC0486a1.k(iZzd3, "Unexpected start code prefix: ", "PesReader");
                    this.zzj = -1;
                    i10 = -1;
                    i11 = 0;
                    i8 = 2;
                } else {
                    this.zzb.zzn(8);
                    zzec zzecVar = this.zzb;
                    int iZzd4 = zzecVar.zzd(16);
                    zzecVar.zzn(5);
                    this.zzk = this.zzb.zzp();
                    i8 = 2;
                    this.zzb.zzn(2);
                    this.zzf = this.zzb.zzp();
                    this.zzg = this.zzb.zzp();
                    this.zzb.zzn(6);
                    int iZzd5 = this.zzb.zzd(8);
                    this.zzi = iZzd5;
                    i10 = -1;
                    if (iZzd4 == 0) {
                        this.zzj = -1;
                    } else {
                        int i23 = (iZzd4 - 3) - iZzd5;
                        this.zzj = i23;
                        if (i23 < 0) {
                            AbstractC0486a1.k(i23, "Found negative packet payload size: ", "PesReader");
                            this.zzj = -1;
                        }
                    }
                    i11 = 2;
                }
                zze(i11);
            } else {
                r7 = 0;
                i9 = 1;
                i10 = -1;
                i8 = 2;
            }
            i13 = i10;
            i15 = i9;
            r8 = r7;
            i14 = i8;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final void zzb(zzek zzekVar, zzacy zzacyVar, zzanm zzanmVar) {
        this.zze = zzekVar;
        this.zza.zzb(zzacyVar, zzanmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }

    public final boolean zzd(boolean z4) {
        return this.zzc == 3 && this.zzj == -1;
    }
}
