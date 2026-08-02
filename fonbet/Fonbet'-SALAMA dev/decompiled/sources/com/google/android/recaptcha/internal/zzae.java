package com.google.android.recaptcha.internal;

import D6.C;
import a.AbstractC0603a;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import f6.C1116i;
import i6.InterfaceC1287d;
import j6.a;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzae extends AbstractC1362i implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzag zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzae(zzag zzagVar, String str, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.zzc = zzagVar;
        this.zzd = str;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new zzae(this.zzc, this.zzd, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzae) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.recaptcha.internal.zzdf] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        zzaa zzaaVar;
        zzap zzapVar;
        String str;
        a aVar = a.f14642a;
        zzdf zzdfVar = this.zzb;
        try {
        } catch (Exception e7) {
            zzdfVar.zzb(new zzbj(zzbh.zzb, zzbg.zzab, e7.getMessage()));
            zzag zzagVar = this.zzc;
            this.zza = zzagVar;
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
                    }
                } else {
                    i7 = 28;
                }
            } else {
                i7 = 45;
            }
            zzrh zzf = zzri.zzf();
            zzf.zzp(i7);
            zzf.zzq(15);
            obj = zzf.zzj();
            if (obj == aVar) {
                return aVar;
            }
            zzaaVar = zzagVar;
        }
        if (zzdfVar == 0) {
            AbstractC0603a.p0(obj);
            zzdf zzb = zzab.zzb(this.zzc, this.zzd);
            zzag zzagVar2 = this.zzc;
            zzapVar = zzagVar2.zzb;
            str = zzagVar2.zzd;
            this.zza = zzb;
            this.zzb = 1;
            obj = zzapVar.zzc(str, this);
            zzdfVar = zzb;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (zzdfVar != 1) {
                zzaaVar = (zzaa) this.zza;
                AbstractC0603a.p0(obj);
                int zza = zzaaVar.zza();
                zzrh zzrhVar = (zzrh) ((zzri) obj).zzq();
                zzrhVar.zze(zzaaVar.zza());
                return new zzy(zza, (zzri) zzrhVar.zzj());
            }
            zzdf zzdfVar2 = (zzdf) this.zza;
            AbstractC0603a.p0(obj);
            zzdfVar = zzdfVar2;
        }
        zzdfVar.zza();
        zzag zzagVar3 = this.zzc;
        zzrj zzf2 = zzrm.zzf();
        zzrk zzf3 = zzrl.zzf();
        zzf3.zzv((String) obj);
        zzf2.zze((zzrl) zzf3.zzj());
        return zzab.zza(zzagVar3, (zzrm) zzf2.zzj());
    }
}
