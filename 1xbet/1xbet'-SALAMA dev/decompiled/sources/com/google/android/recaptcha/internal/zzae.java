package com.google.android.recaptcha.internal;

import D6.C;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import j6.a;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
final class zzae extends i implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzag zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzae(zzag zzagVar, String str, d dVar) {
        super(2, dVar);
        this.zzc = zzagVar;
        this.zzd = str;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new zzae(this.zzc, this.zzd, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzae) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.recaptcha.internal.zzdf] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        zzaa zzaaVar;
        a aVar = a.f14648a;
        zzdf zzdfVar = this.zzb;
        try {
            if (zzdfVar == 0) {
                p003a.a.p0(obj);
                zzdf zzdfVarZzb = zzab.zzb(this.zzc, this.zzd);
                zzag zzagVar = this.zzc;
                zzap zzapVar = zzagVar.zzb;
                String str = zzagVar.zzd;
                this.zza = zzdfVarZzb;
                this.zzb = 1;
                obj = zzapVar.zzc(str, this);
                zzdfVar = zzdfVarZzb;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (zzdfVar != 1) {
                    zzaaVar = (zzaa) this.zza;
                    p003a.a.p0(obj);
                    int iZza = zzaaVar.zza();
                    zzrh zzrhVar = (zzrh) ((zzri) obj).zzq();
                    zzrhVar.zze(zzaaVar.zza());
                    return new zzy(iZza, (zzri) zzrhVar.zzj());
                }
                zzdf zzdfVar2 = (zzdf) this.zza;
                p003a.a.p0(obj);
                zzdfVar = zzdfVar2;
            }
            zzdfVar.zza();
            zzag zzagVar2 = this.zzc;
            zzrj zzrjVarZzf = zzrm.zzf();
            zzrk zzrkVarZzf = zzrl.zzf();
            zzrkVarZzf.zzv((String) obj);
            zzrjVarZzf.zze((zzrl) zzrkVarZzf.zzj());
            return zzab.zza(zzagVar2, (zzrm) zzrjVarZzf.zzj());
        } catch (Exception e7) {
            zzdfVar.zzb(new zzbj(zzbh.zzb, zzbg.zzab, e7.getMessage()));
            zzag zzagVar3 = this.zzc;
            this.zza = zzagVar3;
            int i7 = 2;
            this.zzb = 2;
            if (e7 instanceof StandardIntegrityException) {
                int errorCode = ((StandardIntegrityException) e7).getErrorCode();
                if (errorCode == -100) {
                    i7 = 44;
                } else if (errorCode == -12) {
                    i7 = 39;
                } else if (errorCode == -3) {
                    i7 = 30;
                } else if (errorCode == -2) {
                    i7 = 29;
                } else if (errorCode != -1) {
                    switch (errorCode) {
                        case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                            i7 = 54;
                            break;
                        case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                            i7 = 53;
                            break;
                        case -17:
                            i7 = 52;
                            break;
                        case -16:
                            i7 = 43;
                            break;
                        case -15:
                            i7 = 42;
                            break;
                        case -14:
                            i7 = 41;
                            break;
                        default:
                            switch (errorCode) {
                                case -9:
                                    i7 = 36;
                                    break;
                                case -8:
                                    i7 = 35;
                                    break;
                                case -7:
                                    i7 = 34;
                                    break;
                                case -6:
                                    i7 = 33;
                                    break;
                                case -5:
                                    i7 = 32;
                                    break;
                            }
                            break;
                    }
                } else {
                    i7 = 28;
                }
            } else {
                i7 = 45;
            }
            zzrh zzrhVarZzf = zzri.zzf();
            zzrhVarZzf.zzp(i7);
            zzrhVarZzf.zzq(15);
            obj = zzrhVarZzf.zzj();
            if (obj == aVar) {
                return aVar;
            }
            zzaaVar = zzagVar3;
        }
    }
}
