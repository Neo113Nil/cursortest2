package com.google.android.recaptcha.internal;

import D6.C;
import D6.E;
import a.AbstractC0603a;
import android.content.Context;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import f6.C1113f;
import g6.AbstractC1160i;
import i6.InterfaceC1287d;
import j6.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import t6.e;

/* loaded from: classes.dex */
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
        zzdc zza = zzdcVar.zza();
        C zzc = zzboVar.zzc();
        List M02 = AbstractC1160i.M0(zzadVar, zzpVar, zzmVar, zznVar, new zzag(zza, context, zzc, new zzap(context, zzc, zza, IntegrityManagerFactory.createStandard(context), 28800000L), zzbz.zza(context)));
        this.zza = zzdcVar;
        this.zzb = M02;
        this.zzd = new LinkedHashMap();
    }

    public static final /* synthetic */ String zzo(zzx zzxVar, zzri zzriVar) {
        zziv zzivVar = zzxVar.zzc;
        if (zzivVar == null) {
            zzivVar = null;
        }
        byte[] zzd = zzriVar.zzd();
        return zzca.zza(zzhz.zzh().zzi(zzd, 0, zzd.length), zzivVar);
    }

    public static final /* synthetic */ String zzp(zzx zzxVar, zzrm zzrmVar) {
        zziv zzivVar = zzxVar.zzc;
        if (zzivVar == null) {
            zzivVar = null;
        }
        byte[] zzd = zzrmVar.zzd();
        return zzca.zza(zzhz.zzh().zzi(zzd, 0, zzd.length), zzivVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzpw zzt(String str) {
        zzqm zzqmVar = (zzqm) this.zzd.remove(str);
        zzpv zzf = zzpw.zzf();
        zzf.zzd(str);
        if (zzqmVar != null) {
            byte[] zzd = ((zzqn) zzqmVar.zzj()).zzd();
            String zzi = zzhz.zzh().zzi(zzd, 0, zzd.length);
            zzpt zzf2 = zzpu.zzf();
            zzf2.zzd(zzi);
            zzf.zze(zzf2);
        }
        return (zzpw) zzf.zzj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzu(String str, zzaa zzaaVar, InterfaceC1287d interfaceC1287d) {
        zzq zzqVar;
        int i7;
        if (interfaceC1287d instanceof zzq) {
            zzqVar = (zzq) interfaceC1287d;
            int i8 = zzqVar.zzc;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                zzqVar.zzc = i8 - Integer.MIN_VALUE;
                Object obj = zzqVar.zza;
                a aVar = a.f14642a;
                i7 = zzqVar.zzc;
                if (i7 != 0) {
                    AbstractC0603a.p0(obj);
                    zzr zzrVar = new zzr(zzaaVar, str, this, null);
                    zzqVar.zzc = 1;
                    obj = E.e(zzrVar, zzqVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0603a.p0(obj);
                }
                return obj;
            }
        }
        zzqVar = new zzq(this, interfaceC1287d);
        Object obj2 = zzqVar.zza;
        a aVar2 = a.f14642a;
        i7 = zzqVar.zzc;
        if (i7 != 0) {
        }
        return obj2;
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
    public final Object zzd(String str, InterfaceC1287d interfaceC1287d) {
        return zzt(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzf(String str, InterfaceC1287d interfaceC1287d) {
        zzs zzsVar;
        int i7;
        if (interfaceC1287d instanceof zzs) {
            zzsVar = (zzs) interfaceC1287d;
            int i8 = zzsVar.zzc;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                zzsVar.zzc = i8 - Integer.MIN_VALUE;
                Object obj = zzsVar.zza;
                a aVar = a.f14642a;
                i7 = zzsVar.zzc;
                if (i7 != 0) {
                    AbstractC0603a.p0(obj);
                    zzu zzuVar = new zzu(str, this, null);
                    zzsVar.zzc = 1;
                    obj = E.e(zzuVar, zzsVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0603a.p0(obj);
                }
                return ((C1113f) obj).f13003a;
            }
        }
        zzsVar = new zzs(this, interfaceC1287d);
        Object obj2 = zzsVar.zza;
        a aVar2 = a.f14642a;
        i7 = zzsVar.zzc;
        if (i7 != 0) {
        }
        return ((C1113f) obj2).f13003a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzh(zzpq zzpqVar, InterfaceC1287d interfaceC1287d) {
        zzv zzvVar;
        int i7;
        if (interfaceC1287d instanceof zzv) {
            zzvVar = (zzv) interfaceC1287d;
            int i8 = zzvVar.zzc;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                zzvVar.zzc = i8 - Integer.MIN_VALUE;
                Object obj = zzvVar.zza;
                a aVar = a.f14642a;
                i7 = zzvVar.zzc;
                if (i7 != 0) {
                    AbstractC0603a.p0(obj);
                    zzw zzwVar = new zzw(zzpqVar, this, null);
                    zzvVar.zzc = 1;
                    obj = E.e(zzwVar, zzvVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0603a.p0(obj);
                }
                return ((C1113f) obj).f13003a;
            }
        }
        zzvVar = new zzv(this, interfaceC1287d);
        Object obj2 = zzvVar.zza;
        a aVar2 = a.f14642a;
        i7 = zzvVar.zzc;
        if (i7 != 0) {
        }
        return ((C1113f) obj2).f13003a;
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
