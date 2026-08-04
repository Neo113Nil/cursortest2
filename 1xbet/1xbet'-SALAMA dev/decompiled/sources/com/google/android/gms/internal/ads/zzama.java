package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class zzama implements zzaly {
    private static final double[] zza = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zzb;
    private zzaeb zzc;
    private final zzanp zzd;
    private final String zze;
    private final zzed zzf;
    private final zzamq zzg;
    private final boolean[] zzh = new boolean[4];
    private final zzalz zzi = new zzalz(128);
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;

    public zzama(zzanp zzanpVar, String str) {
        zzed zzedVar;
        this.zzd = zzanpVar;
        this.zze = str;
        if (zzanpVar != null) {
            this.zzg = new zzamq(178, 128);
            zzedVar = new zzed();
        } else {
            zzedVar = null;
            this.zzg = null;
        }
        this.zzf = zzedVar;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0133  */
    /* JADX WARN: Code duplicated, block: B:55:0x0180  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zza(zzed zzedVar) {
        boolean z4;
        boolean z7;
        int i7;
        float f7;
        int i8;
        int i9;
        char c3 = 4;
        zzcv.zzb(this.zzc);
        int iZzd = zzedVar.zzd();
        int iZze = zzedVar.zze();
        byte[] bArrZzN = zzedVar.zzN();
        this.zzj += (long) zzedVar.zzb();
        this.zzc.zzr(zzedVar, zzedVar.zzb());
        while (true) {
            int iZza = zzfj.zza(bArrZzN, iZzd, iZze, this.zzh);
            if (iZza == iZze) {
                break;
            }
            int i10 = iZza + 3;
            int i11 = zzedVar.zzN()[i10] & 255;
            int i12 = iZza - iZzd;
            if (!this.zzl) {
                if (i12 > 0) {
                    this.zzi.zza(bArrZzN, iZzd, iZza);
                }
                if (this.zzi.zzc(i11, i12 < 0 ? -i12 : 0)) {
                    zzalz zzalzVar = this.zzi;
                    String str = this.zzb;
                    str.getClass();
                    String str2 = this.zze;
                    byte[] bArrCopyOf = Arrays.copyOf(zzalzVar.zzc, zzalzVar.zza);
                    int i13 = bArrCopyOf[c3] & 255;
                    byte b7 = bArrCopyOf[5];
                    int i14 = bArrCopyOf[6] & 255;
                    int i15 = ((b7 & 255) >> 4) | (i13 << 4);
                    int i16 = (bArrCopyOf[7] & 240) >> 4;
                    int i17 = ((b7 & 15) << 8) | i14;
                    if (i16 != 2) {
                        if (i16 == 3) {
                            i8 = i17 * 16;
                            i9 = i15 * 9;
                        } else if (i16 != 4) {
                            f7 = 1.0f;
                        } else {
                            i8 = i17 * 121;
                            i9 = i15 * 100;
                        }
                        f7 = i8 / i9;
                    } else {
                        f7 = (i17 * 4) / (i15 * 3);
                    }
                    zzx zzxVar = new zzx();
                    zzxVar.zzO(str);
                    zzxVar.zzE(str2);
                    zzxVar.zzad("video/mpeg2");
                    zzxVar.zzai(i15);
                    zzxVar.zzM(i17);
                    zzxVar.zzZ(f7);
                    zzxVar.zzP(Collections.singletonList(bArrCopyOf));
                    zzz zzzVarZzaj = zzxVar.zzaj();
                    int i18 = (bArrCopyOf[7] & 15) - 1;
                    long j = 0;
                    if (i18 >= 0 && i18 < 8) {
                        double d7 = zza[i18];
                        byte b8 = bArrCopyOf[zzalzVar.zzb + 9];
                        int i19 = (b8 & 96) >> 5;
                        int i20 = b8 & 31;
                        if (i19 != i20) {
                            d7 *= (((double) i19) + 1.0d) / ((double) (i20 + 1));
                        }
                        j = (long) (1000000.0d / d7);
                    }
                    Pair pairCreate = Pair.create(zzzVarZzaj, Long.valueOf(j));
                    this.zzc.zzm((zzz) pairCreate.first);
                    this.zzm = ((Long) pairCreate.second).longValue();
                    this.zzl = true;
                }
            }
            zzamq zzamqVar = this.zzg;
            if (zzamqVar != null) {
                if (i12 > 0) {
                    zzamqVar.zza(bArrZzN, iZzd, iZza);
                    i7 = 0;
                } else {
                    i7 = -i12;
                }
                if (this.zzg.zzd(i7)) {
                    zzamq zzamqVar2 = this.zzg;
                    int iZzc = zzfj.zzc(zzamqVar2.zza, zzamqVar2.zzb);
                    zzed zzedVar2 = this.zzf;
                    int i21 = zzen.zza;
                    zzedVar2.zzJ(this.zzg.zza, iZzc);
                    this.zzd.zza(this.zzp, this.zzf);
                }
                if (i11 == 178) {
                    if (zzedVar.zzN()[iZza + 2] == 1) {
                        this.zzg.zzc(178);
                    }
                    i11 = 178;
                }
            }
            if (i11 == 0 || i11 == 179) {
                int i22 = iZze - iZza;
                if (this.zzr && this.zzl) {
                    long j3 = this.zzp;
                    if (j3 != -9223372036854775807L) {
                        this.zzc.zzt(j3, this.zzq ? 1 : 0, ((int) (this.zzj - this.zzo)) - i22, i22, null);
                    }
                }
                if (!this.zzk || this.zzr) {
                    this.zzo = this.zzj - ((long) i22);
                    long j7 = this.zzn;
                    if (j7 == -9223372036854775807L) {
                        long j8 = this.zzp;
                        j7 = j8 != -9223372036854775807L ? j8 + this.zzm : -9223372036854775807L;
                    }
                    this.zzp = j7;
                    z4 = false;
                    this.zzq = false;
                    this.zzn = -9223372036854775807L;
                    z7 = true;
                    this.zzk = true;
                } else {
                    z4 = false;
                    z7 = true;
                }
                this.zzr = i11 == 0 ? z7 : z4;
            } else if (i11 == 184) {
                this.zzq = true;
            }
            iZzd = i10;
            iZze = iZze;
            c3 = 4;
        }
        if (!this.zzl) {
            this.zzi.zza(bArrZzN, iZzd, iZze);
        }
        zzamq zzamqVar3 = this.zzg;
        if (zzamqVar3 != null) {
            zzamqVar3.zza(bArrZzN, iZzd, iZze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzb(zzacy zzacyVar, zzanm zzanmVar) {
        zzanmVar.zzc();
        this.zzb = zzanmVar.zzb();
        this.zzc = zzacyVar.zzw(zzanmVar.zza(), 2);
        zzanp zzanpVar = this.zzd;
        if (zzanpVar != null) {
            zzanpVar.zzb(zzacyVar, zzanmVar);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzc(boolean z4) {
        zzcv.zzb(this.zzc);
        if (z4) {
            boolean z7 = this.zzq;
            long j = this.zzj - this.zzo;
            this.zzc.zzt(this.zzp, z7 ? 1 : 0, (int) j, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzd(long j, int i7) {
        this.zzn = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zze() {
        zzfj.zzi(this.zzh);
        this.zzi.zzb();
        zzamq zzamqVar = this.zzg;
        if (zzamqVar != null) {
            zzamqVar.zzb();
        }
        this.zzj = 0L;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }
}
