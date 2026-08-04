package com.google.android.recaptcha.internal;

import D6.C;
import D6.E;
import android.content.Context;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import j6.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p044f6.f;
import p050g6.i;
import p065i6.d;
import t6.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzx extends zze {
    private final zzdc zza;
    private final List zzb;
    private zziv zzc;
    private final Map zzd;

    public /* synthetic */ zzx(zzbl zzblVar, Context context, zzdc zzdcVar, zzbo zzboVar, List list, int i7, e eVar) {
        zzad zzadVar = new zzad(zzdcVar.zza());
        zzp zzpVar = new zzp(zzdcVar.zza(), zzblVar);
        zzm zzmVar = new zzm(zzdcVar.zza(), context.getContentResolver());
        zzn zznVar = new zzn(zzdcVar.zza());
        zzdc zzdcVarZza = zzdcVar.zza();
        C cZzc = zzboVar.zzc();
        List listM0 = i.M0(zzadVar, zzpVar, zzmVar, zznVar, new zzag(zzdcVarZza, context, cZzc, new zzap(context, cZzc, zzdcVarZza, IntegrityManagerFactory.createStandard(context), 28800000L), zzbz.zza(context)));
        this.zza = zzdcVar;
        this.zzb = listM0;
        this.zzd = new LinkedHashMap();
    }

    public static final /* synthetic */ String zzo(zzx zzxVar, zzri zzriVar) {
        zziv zzivVar = zzxVar.zzc;
        if (zzivVar == null) {
            zzivVar = null;
        }
        byte[] bArrZzd = zzriVar.zzd();
        return zzca.zza(zzhz.zzh().zzi(bArrZzd, 0, bArrZzd.length), zzivVar);
    }

    public static final /* synthetic */ String zzp(zzx zzxVar, zzrm zzrmVar) {
        zziv zzivVar = zzxVar.zzc;
        if (zzivVar == null) {
            zzivVar = null;
        }
        byte[] bArrZzd = zzrmVar.zzd();
        return zzca.zza(zzhz.zzh().zzi(bArrZzd, 0, bArrZzd.length), zzivVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzpw zzt(String str) {
        zzqm zzqmVar = (zzqm) this.zzd.remove(str);
        zzpv zzpvVarZzf = zzpw.zzf();
        zzpvVarZzf.zzd(str);
        if (zzqmVar != null) {
            byte[] bArrZzd = ((zzqn) zzqmVar.zzj()).zzd();
            String strZzi = zzhz.zzh().zzi(bArrZzd, 0, bArrZzd.length);
            zzpt zzptVarZzf = zzpu.zzf();
            zzptVarZzf.zzd(strZzi);
            zzpvVarZzf.zze(zzptVarZzf);
        }
        return (zzpw) zzpvVarZzf.zzj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzu(String str, zzaa zzaaVar, d dVar) throws Throwable {
        zzq zzqVar;
        if (dVar instanceof zzq) {
            zzqVar = (zzq) dVar;
            int i7 = zzqVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzqVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzqVar = new zzq(this, dVar);
            }
        } else {
            zzqVar = new zzq(this, dVar);
        }
        Object objE = zzqVar.zza;
        a aVar = a.f14648a;
        int i8 = zzqVar.zzc;
        if (i8 == 0) {
            p003a.a.p0(objE);
            zzr zzrVar = new zzr(zzaaVar, str, this, null);
            zzqVar.zzc = 1;
            objE = E.e(zzrVar, zzqVar);
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p003a.a.p0(objE);
        }
        return objE;
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzdf zza(String str) {
        zzdc zzdcVar = this.zza;
        zzdcVar.zzc(str);
        return zzdcVar.zzf(35);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzdf zzb() {
        zzdc zzdcVar = this.zza;
        zzdcVar.zzc(zzdcVar.zzd());
        return zzdcVar.zzf(34);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzd(String str, d dVar) {
        return zzt(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzf(String str, d dVar) {
        zzs zzsVar;
        if (dVar instanceof zzs) {
            zzsVar = (zzs) dVar;
            int i7 = zzsVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzsVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzsVar = new zzs(this, dVar);
            }
        } else {
            zzsVar = new zzs(this, dVar);
        }
        Object objE = zzsVar.zza;
        a aVar = a.f14648a;
        int i8 = zzsVar.zzc;
        if (i8 == 0) {
            p003a.a.p0(objE);
            zzu zzuVar = new zzu(str, this, null);
            zzsVar.zzc = 1;
            objE = E.e(zzuVar, zzsVar);
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p003a.a.p0(objE);
        }
        return ((f) objE).f13009a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzh(zzpq zzpqVar, d dVar) {
        zzv zzvVar;
        if (dVar instanceof zzv) {
            zzvVar = (zzv) dVar;
            int i7 = zzvVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzvVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzvVar = new zzv(this, dVar);
            }
        } else {
            zzvVar = new zzv(this, dVar);
        }
        Object objE = zzvVar.zza;
        a aVar = a.f14648a;
        int i8 = zzvVar.zzc;
        if (i8 == 0) {
            p003a.a.p0(objE);
            zzw zzwVar = new zzw(zzpqVar, this, null);
            zzvVar.zzc = 1;
            objE = E.e(zzwVar, zzvVar);
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p003a.a.p0(objE);
        }
        return ((f) objE).f13009a;
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final void zzk(zzqf zzqfVar) {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            ((zzaa) it.next()).zze(zzqfVar);
        }
    }

    public final Map zzr() {
        return this.zzd;
    }
}
