package com.google.android.recaptcha.internal;

import C6.g;
import D6.E;
import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import j6.a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import p044f6.f;
import p050g6.j;
import p050g6.s;
import p065i6.d;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class zzcx implements RecaptchaClient, RecaptchaTasksClient {
    private static final g zza = new g("^[a-zA-Z0-9/_]{0,100}$");
    private final Application zzb;
    private final zzl zzc;
    private final String zzd;
    private final zzbv zze;
    private final zzpq zzf;
    private final zzdc zzg;
    private final zzbl zzh;
    private final zzbo zzi;

    public zzcx(Application application, zzl zzlVar, String str, zzbo zzboVar, zzbv zzbvVar, zzpq zzpqVar, zzdc zzdcVar, zzbl zzblVar, zzds zzdsVar) {
        this.zzb = application;
        this.zzc = zzlVar;
        this.zzd = str;
        this.zzi = zzboVar;
        this.zze = zzbvVar;
        this.zzf = zzpqVar;
        this.zzg = zzdcVar;
        this.zzh = zzblVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzf(long j, String str, zzdc zzdcVar, d dVar) throws zzbj {
        zzcp zzcpVar;
        Exception e7;
        zzdf zzdfVar;
        zzbj zzbjVar;
        if (dVar instanceof zzcp) {
            zzcpVar = (zzcp) dVar;
            int i7 = zzcpVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzcpVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzcpVar = new zzcp(this, dVar);
            }
        } else {
            zzcpVar = new zzcp(this, dVar);
        }
        Object objZzb = zzcpVar.zza;
        a aVar = a.f14648a;
        int i8 = zzcpVar.zzc;
        if (i8 == 0) {
            p003a.a.p0(objZzb);
            zzdf zzdfVarZzf = zzdcVar.zzf(27);
            try {
                zzl zzlVar = this.zzc;
                zzcpVar.zzd = zzdfVarZzf;
                zzcpVar.zzc = 1;
                objZzb = zzlVar.zzb(str, j, zzcpVar);
                if (objZzb == aVar) {
                    return aVar;
                }
                zzdfVar = zzdfVarZzf;
            } catch (Exception e8) {
                e7 = e8;
                zzdfVar = zzdfVarZzf;
                if (e7 instanceof zzbj) {
                    zzbjVar = (zzbj) e7;
                } else {
                    zzbjVar = new zzbj(zzbh.zzb, zzbg.zzaa, null);
                }
                zzdfVar.zzb(zzbjVar);
                throw zzbjVar;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzdfVar = zzcpVar.zzd;
            try {
                p003a.a.p0(objZzb);
            } catch (Exception e9) {
                e7 = e9;
                if (e7 instanceof zzbj) {
                    zzbjVar = (zzbj) e7;
                } else {
                    zzbjVar = new zzbj(zzbh.zzb, zzbg.zzaa, null);
                }
                zzdfVar.zzb(zzbjVar);
                throw zzbjVar;
            }
        }
        zzpw zzpwVar = (zzpw) objZzb;
        zzdfVar.zza();
        return zzpwVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:53:0x013a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0148  */
    /* JADX WARN: Code duplicated, block: B:58:0x0158  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object zzg(RecaptchaAction recaptchaAction, long j, d dVar) throws Throwable {
        zzcs zzcsVar;
        zzdc zzdcVarZza;
        zzdf zzdfVarZzf;
        zzcx zzcxVar;
        RecaptchaAction recaptchaAction2;
        double d7;
        zzdf zzdfVar;
        zzdc zzdcVar;
        zzbj zzbjVar;
        zzbh zzbhVarZzb;
        zzbh zzbhVar;
        if (dVar instanceof zzcs) {
            zzcsVar = (zzcs) dVar;
            int i7 = zzcsVar.zzf;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzcsVar.zzf = i7 - Integer.MIN_VALUE;
            } else {
                zzcsVar = new zzcs(this, dVar);
            }
        } else {
            zzcsVar = new zzcs(this, dVar);
        }
        zzcs zzcsVar2 = zzcsVar;
        Object objZzf = zzcsVar2.zzd;
        a aVar = a.f14648a;
        int i8 = zzcsVar2.zzf;
        try {
            if (i8 == 0) {
                p003a.a.p0(objZzf);
                String string = UUID.randomUUID().toString();
                zzdcVarZza = this.zzg.zza();
                zzdcVarZza.zzc(string);
                zzdfVarZzf = zzdcVarZza.zzf(9);
                double d8 = j;
                try {
                    zzdf zzdfVarZzf2 = zzdcVarZza.zzf(7);
                    g gVar = zza;
                    String action = recaptchaAction.getAction();
                    gVar.getClass();
                    h.e(action, "input");
                    zzbj zzbjVar2 = !gVar.f1599a.matcher(action).matches() ? new zzbj(zzbh.zzg, zzbg.zzh, null) : null;
                    if (j < 5000) {
                        zzbjVar2 = new zzbj(zzbh.zzb, zzbg.zzI, null);
                    }
                    if (zzbjVar2 != null) {
                        zzdfVarZzf2.zzb(zzbjVar2);
                        throw zzbjVar2;
                    }
                    zzdfVarZzf2.zza();
                    zzcsVar2.zzg = this;
                    zzcsVar2.zza = recaptchaAction;
                    zzcsVar2.zzb = zzdcVarZza;
                    zzcsVar2.zzh = zzdfVarZzf;
                    double d9 = 0.55d * d8;
                    zzcsVar2.zzc = d9;
                    zzcsVar2.zzf = 1;
                    objZzf = zzf((long) (0.45d * d8), string, zzdcVarZza, zzcsVar2);
                    if (objZzf == aVar) {
                        return aVar;
                    }
                    zzcxVar = this;
                    recaptchaAction2 = recaptchaAction;
                    d7 = d9;
                } catch (Exception e7) {
                    e = e7;
                    zzcxVar = this;
                    zzdfVar = zzdfVarZzf;
                    if (e instanceof zzbj) {
                        zzbjVar = (zzbj) e;
                        zzbhVarZzb = zzbjVar.zzb();
                        zzbhVar = zzbh.zzc;
                        if (h.a(zzbhVarZzb, zzbhVar)) {
                            zzbjVar = new zzbj(zzbhVar, zzbg.zzap, null);
                        }
                    } else {
                        zzbjVar = new zzbj(zzbh.zzb, zzbg.zzX, e.getClass().getSimpleName());
                    }
                    zzdfVar.zzb(zzbjVar);
                    return p003a.a.h(zzbjVar.zzc());
                }
            } else {
                if (i8 != 1) {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzdfVar = (zzdf) zzcsVar2.zzb;
                    zzdcVar = (zzdc) zzcsVar2.zza;
                    zzcxVar = zzcsVar2.zzg;
                    try {
                        p003a.a.p0(objZzf);
                        zzqf zzqfVar = (zzqf) objZzf;
                        zzcxVar.zzh(zzqfVar, zzdcVar);
                        zzdfVar.zza();
                        return zzqfVar.zzj();
                    } catch (Exception e8) {
                        e = e8;
                        if (e instanceof zzbj) {
                            zzbjVar = (zzbj) e;
                            zzbhVarZzb = zzbjVar.zzb();
                            zzbhVar = zzbh.zzc;
                            if (h.a(zzbhVarZzb, zzbhVar) && !zzcxVar.zzi(zzcxVar.zzb)) {
                                zzbjVar = new zzbj(zzbhVar, zzbg.zzap, null);
                            }
                        } else {
                            zzbjVar = new zzbj(zzbh.zzb, zzbg.zzX, e.getClass().getSimpleName());
                        }
                        zzdfVar.zzb(zzbjVar);
                        return p003a.a.h(zzbjVar.zzc());
                    }
                }
                d7 = zzcsVar2.zzc;
                zzdf zzdfVar2 = zzcsVar2.zzh;
                zzdc zzdcVar2 = (zzdc) zzcsVar2.zzb;
                RecaptchaAction recaptchaAction3 = (RecaptchaAction) zzcsVar2.zza;
                zzcx zzcxVar2 = zzcsVar2.zzg;
                try {
                    p003a.a.p0(objZzf);
                    zzdfVarZzf = zzdfVar2;
                    zzdcVarZza = zzdcVar2;
                    recaptchaAction2 = recaptchaAction3;
                    zzcxVar = zzcxVar2;
                } catch (Exception e9) {
                    e = e9;
                    zzdfVar = zzdfVar2;
                    zzcxVar = zzcxVar2;
                    if (e instanceof zzbj) {
                        zzbjVar = (zzbj) e;
                        zzbhVarZzb = zzbjVar.zzb();
                        zzbhVar = zzbh.zzc;
                        if (h.a(zzbhVarZzb, zzbhVar)) {
                            zzbjVar = new zzbj(zzbhVar, zzbg.zzap, null);
                        }
                    } else {
                        zzbjVar = new zzbj(zzbh.zzb, zzbg.zzX, e.getClass().getSimpleName());
                    }
                    zzdfVar.zzb(zzbjVar);
                    return p003a.a.h(zzbjVar.zzc());
                }
            }
            zzcsVar2.zzg = zzcxVar;
            zzcsVar2.zza = zzdcVarZza;
            zzcsVar2.zzb = zzdfVarZzf;
            zzcsVar2.zzh = null;
            zzcsVar2.zzf = 2;
            objZzf = E.x(zzcxVar.zzi.zza().c(), new zzcv((long) d7, zzdcVarZza, zzcxVar, recaptchaAction2, (zzpw) objZzf, null), zzcsVar2);
            if (objZzf == aVar) {
                return aVar;
            }
            zzdcVar = zzdcVarZza;
            zzdfVar = zzdfVarZzf;
            zzqf zzqfVar2 = (zzqf) objZzf;
            zzcxVar.zzh(zzqfVar2, zzdcVar);
            zzdfVar.zza();
            return zzqfVar2.zzj();
        } catch (Exception e10) {
            e = e10;
            zzdfVar = zzdfVarZzf;
            if (e instanceof zzbj) {
                zzbjVar = (zzbj) e;
                zzbhVarZzb = zzbjVar.zzb();
                zzbhVar = zzbh.zzc;
                if (h.a(zzbhVarZzb, zzbhVar)) {
                    zzbjVar = new zzbj(zzbhVar, zzbg.zzap, null);
                }
            } else {
                zzbjVar = new zzbj(zzbh.zzb, zzbg.zzX, e.getClass().getSimpleName());
            }
            zzdfVar.zzb(zzbjVar);
            return p003a.a.h(zzbjVar.zzc());
        }
    }

    private final void zzh(zzqf zzqfVar, zzdc zzdcVar) throws zzbj {
        zzdf zzdfVarZzf = zzdcVar.zzf(29);
        try {
            List<zzqh> listZzk = zzqfVar.zzk();
            int iK0 = s.K0(j.N0(listZzk));
            if (iK0 < 16) {
                iK0 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iK0);
            for (zzqh zzqhVar : listZzk) {
                linkedHashMap.put(zzqhVar.zzg(), zzqhVar.zzi());
            }
            this.zzh.zzb(linkedHashMap);
            this.zzc.zzf(zzqfVar);
            zzdfVarZzf.zza();
        } catch (Exception e7) {
            zzbj zzbjVar = e7 instanceof zzbj ? (zzbj) e7 : new zzbj(zzbh.zzb, zzbg.zzaa, null);
            zzdfVarZzf.zzb(zzbjVar);
            throw zzbjVar;
        }
    }

    private final boolean zzi(Application application) {
        int i7 = zzbb.zza;
        return zzbk.zzb(application);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* JADX INFO: renamed from: execute-0E7RQCE */
    public final Object mo3execute0E7RQCE(RecaptchaAction recaptchaAction, long j, d dVar) throws Throwable {
        zzcq zzcqVar;
        if (dVar instanceof zzcq) {
            zzcqVar = (zzcq) dVar;
            int i7 = zzcqVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzcqVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzcqVar = new zzcq(this, dVar);
            }
        } else {
            zzcqVar = new zzcq(this, dVar);
        }
        Object obj = zzcqVar.zza;
        Object obj2 = a.f14648a;
        int i8 = zzcqVar.zzc;
        if (i8 != 0) {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p003a.a.p0(obj);
            return ((f) obj).f13009a;
        }
        p003a.a.p0(obj);
        zzcqVar.zzc = 1;
        Object objZzg = zzg(recaptchaAction, j, zzcqVar);
        return objZzg == obj2 ? obj2 : objZzg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* JADX INFO: renamed from: execute-gIAlu-s */
    public final Object mo4executegIAlus(RecaptchaAction recaptchaAction, d dVar) throws Throwable {
        zzcr zzcrVar;
        if (dVar instanceof zzcr) {
            zzcrVar = (zzcr) dVar;
            int i7 = zzcrVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzcrVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzcrVar = new zzcr(this, dVar);
            }
        } else {
            zzcrVar = new zzcr(this, dVar);
        }
        Object obj = zzcrVar.zza;
        Object obj2 = a.f14648a;
        int i8 = zzcrVar.zzc;
        if (i8 != 0) {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p003a.a.p0(obj);
            return ((f) obj).f13009a;
        }
        p003a.a.p0(obj);
        zzcrVar.zzc = 1;
        Object objMo3execute0E7RQCE = mo3execute0E7RQCE(recaptchaAction, 10000L, zzcrVar);
        return objMo3execute0E7RQCE == obj2 ? obj2 : objMo3execute0E7RQCE;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        return zzax.zza(E.c(this.zzi.zzb(), new zzct(this, recaptchaAction, 10000L, null)));
    }

    public final String zze() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j) {
        return zzax.zza(E.c(this.zzi.zzb(), new zzct(this, recaptchaAction, j, null)));
    }
}
