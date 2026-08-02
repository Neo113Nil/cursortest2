package com.google.android.recaptcha.internal;

import C6.g;
import D6.E;
import a.AbstractC0603a;
import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import f6.C1113f;
import g6.AbstractC1161j;
import g6.AbstractC1170s;
import i6.InterfaceC1287d;
import j6.a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import t6.h;

/* loaded from: classes.dex */
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
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzf(long j, String str, zzdc zzdcVar, InterfaceC1287d interfaceC1287d) {
        zzcp zzcpVar;
        int i7;
        Exception e7;
        zzdf zzdfVar;
        if (interfaceC1287d instanceof zzcp) {
            zzcpVar = (zzcp) interfaceC1287d;
            int i8 = zzcpVar.zzc;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                zzcpVar.zzc = i8 - Integer.MIN_VALUE;
                Object obj = zzcpVar.zza;
                a aVar = a.f14642a;
                i7 = zzcpVar.zzc;
                if (i7 != 0) {
                    AbstractC0603a.p0(obj);
                    zzdf zzf = zzdcVar.zzf(27);
                    try {
                        zzl zzlVar = this.zzc;
                        zzcpVar.zzd = zzf;
                        zzcpVar.zzc = 1;
                        obj = zzlVar.zzb(str, j, zzcpVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        zzdfVar = zzf;
                    } catch (Exception e8) {
                        e7 = e8;
                        zzdfVar = zzf;
                        zzbj zzbjVar = !(e7 instanceof zzbj) ? (zzbj) e7 : new zzbj(zzbh.zzb, zzbg.zzaa, null);
                        zzdfVar.zzb(zzbjVar);
                        throw zzbjVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzdfVar = zzcpVar.zzd;
                    try {
                        AbstractC0603a.p0(obj);
                    } catch (Exception e9) {
                        e7 = e9;
                        if (!(e7 instanceof zzbj)) {
                        }
                        zzdfVar.zzb(zzbjVar);
                        throw zzbjVar;
                    }
                }
                zzpw zzpwVar = (zzpw) obj;
                zzdfVar.zza();
                return zzpwVar;
            }
        }
        zzcpVar = new zzcp(this, interfaceC1287d);
        Object obj2 = zzcpVar.zza;
        a aVar2 = a.f14642a;
        i7 = zzcpVar.zzc;
        if (i7 != 0) {
        }
        zzpw zzpwVar2 = (zzpw) obj2;
        zzdfVar.zza();
        return zzpwVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzg(RecaptchaAction recaptchaAction, long j, InterfaceC1287d interfaceC1287d) {
        zzcs zzcsVar;
        Object obj;
        a aVar;
        int i7;
        zzdc zza2;
        zzdf zzf;
        zzcx zzcxVar;
        RecaptchaAction recaptchaAction2;
        double d7;
        zzdf zzdfVar;
        zzdc zzdcVar;
        zzbj zzbjVar;
        try {
            if (interfaceC1287d instanceof zzcs) {
                zzcsVar = (zzcs) interfaceC1287d;
                int i8 = zzcsVar.zzf;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    zzcsVar.zzf = i8 - Integer.MIN_VALUE;
                    zzcs zzcsVar2 = zzcsVar;
                    obj = zzcsVar2.zzd;
                    aVar = a.f14642a;
                    i7 = zzcsVar2.zzf;
                    if (i7 != 0) {
                        AbstractC0603a.p0(obj);
                        String uuid = UUID.randomUUID().toString();
                        zza2 = this.zzg.zza();
                        zza2.zzc(uuid);
                        zzf = zza2.zzf(9);
                        double d8 = j;
                        try {
                            zzdf zzf2 = zza2.zzf(7);
                            g gVar = zza;
                            String action = recaptchaAction.getAction();
                            gVar.getClass();
                            h.e(action, "input");
                            zzbj zzbjVar2 = !gVar.f1599a.matcher(action).matches() ? new zzbj(zzbh.zzg, zzbg.zzh, null) : null;
                            if (j < 5000) {
                                zzbjVar2 = new zzbj(zzbh.zzb, zzbg.zzI, null);
                            }
                            if (zzbjVar2 != null) {
                                zzf2.zzb(zzbjVar2);
                                throw zzbjVar2;
                            }
                            zzf2.zza();
                            zzcsVar2.zzg = this;
                            zzcsVar2.zza = recaptchaAction;
                            zzcsVar2.zzb = zza2;
                            zzcsVar2.zzh = zzf;
                            double d9 = 0.55d * d8;
                            zzcsVar2.zzc = d9;
                            zzcsVar2.zzf = 1;
                            obj = zzf((long) (0.45d * d8), uuid, zza2, zzcsVar2);
                            if (obj == aVar) {
                                return aVar;
                            }
                            zzcxVar = this;
                            recaptchaAction2 = recaptchaAction;
                            d7 = d9;
                        } catch (Exception e7) {
                            e = e7;
                            zzcxVar = this;
                            zzdfVar = zzf;
                            if (e instanceof zzbj) {
                            }
                            zzdfVar.zzb(zzbjVar);
                            return AbstractC0603a.h(zzbjVar.zzc());
                        }
                    } else {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            zzdfVar = (zzdf) zzcsVar2.zzb;
                            zzdcVar = (zzdc) zzcsVar2.zza;
                            zzcxVar = zzcsVar2.zzg;
                            try {
                                AbstractC0603a.p0(obj);
                                zzqf zzqfVar = (zzqf) obj;
                                zzcxVar.zzh(zzqfVar, zzdcVar);
                                zzdfVar.zza();
                                return zzqfVar.zzj();
                            } catch (Exception e8) {
                                e = e8;
                                if (e instanceof zzbj) {
                                    zzbjVar = new zzbj(zzbh.zzb, zzbg.zzX, e.getClass().getSimpleName());
                                } else {
                                    zzbjVar = (zzbj) e;
                                    zzbh zzb = zzbjVar.zzb();
                                    zzbh zzbhVar = zzbh.zzc;
                                    if (h.a(zzb, zzbhVar) && !zzcxVar.zzi(zzcxVar.zzb)) {
                                        zzbjVar = new zzbj(zzbhVar, zzbg.zzap, null);
                                    }
                                }
                                zzdfVar.zzb(zzbjVar);
                                return AbstractC0603a.h(zzbjVar.zzc());
                            }
                        }
                        d7 = zzcsVar2.zzc;
                        zzdf zzdfVar2 = zzcsVar2.zzh;
                        zzdc zzdcVar2 = (zzdc) zzcsVar2.zzb;
                        RecaptchaAction recaptchaAction3 = (RecaptchaAction) zzcsVar2.zza;
                        zzcx zzcxVar2 = zzcsVar2.zzg;
                        try {
                            AbstractC0603a.p0(obj);
                            zzf = zzdfVar2;
                            zza2 = zzdcVar2;
                            recaptchaAction2 = recaptchaAction3;
                            zzcxVar = zzcxVar2;
                        } catch (Exception e9) {
                            e = e9;
                            zzdfVar = zzdfVar2;
                            zzcxVar = zzcxVar2;
                            if (e instanceof zzbj) {
                            }
                            zzdfVar.zzb(zzbjVar);
                            return AbstractC0603a.h(zzbjVar.zzc());
                        }
                    }
                    zzcsVar2.zzg = zzcxVar;
                    zzcsVar2.zza = zza2;
                    zzcsVar2.zzb = zzf;
                    zzcsVar2.zzh = null;
                    zzcsVar2.zzf = 2;
                    obj = E.x(zzcxVar.zzi.zza().c(), new zzcv((long) d7, zza2, zzcxVar, recaptchaAction2, (zzpw) obj, null), zzcsVar2);
                    if (obj != aVar) {
                        return aVar;
                    }
                    zzdcVar = zza2;
                    zzdfVar = zzf;
                    zzqf zzqfVar2 = (zzqf) obj;
                    zzcxVar.zzh(zzqfVar2, zzdcVar);
                    zzdfVar.zza();
                    return zzqfVar2.zzj();
                }
            }
            zzcsVar2.zzg = zzcxVar;
            zzcsVar2.zza = zza2;
            zzcsVar2.zzb = zzf;
            zzcsVar2.zzh = null;
            zzcsVar2.zzf = 2;
            obj = E.x(zzcxVar.zzi.zza().c(), new zzcv((long) d7, zza2, zzcxVar, recaptchaAction2, (zzpw) obj, null), zzcsVar2);
            if (obj != aVar) {
            }
        } catch (Exception e10) {
            e = e10;
            zzdfVar = zzf;
            if (e instanceof zzbj) {
            }
            zzdfVar.zzb(zzbjVar);
            return AbstractC0603a.h(zzbjVar.zzc());
        }
        zzcsVar = new zzcs(this, interfaceC1287d);
        zzcs zzcsVar22 = zzcsVar;
        obj = zzcsVar22.zzd;
        aVar = a.f14642a;
        i7 = zzcsVar22.zzf;
        if (i7 != 0) {
        }
    }

    private final void zzh(zzqf zzqfVar, zzdc zzdcVar) {
        zzdf zzf = zzdcVar.zzf(29);
        try {
            List<zzqh> zzk = zzqfVar.zzk();
            int K02 = AbstractC1170s.K0(AbstractC1161j.N0(zzk));
            if (K02 < 16) {
                K02 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(K02);
            for (zzqh zzqhVar : zzk) {
                linkedHashMap.put(zzqhVar.zzg(), zzqhVar.zzi());
            }
            this.zzh.zzb(linkedHashMap);
            this.zzc.zzf(zzqfVar);
            zzf.zza();
        } catch (Exception e7) {
            zzbj zzbjVar = e7 instanceof zzbj ? (zzbj) e7 : new zzbj(zzbh.zzb, zzbg.zzaa, null);
            zzf.zzb(zzbjVar);
            throw zzbjVar;
        }
    }

    private final boolean zzi(Application application) {
        int i7 = zzbb.zza;
        return zzbk.zzb(application);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* renamed from: execute-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo3execute0E7RQCE(RecaptchaAction recaptchaAction, long j, InterfaceC1287d interfaceC1287d) {
        zzcq zzcqVar;
        int i7;
        if (interfaceC1287d instanceof zzcq) {
            zzcqVar = (zzcq) interfaceC1287d;
            int i8 = zzcqVar.zzc;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                zzcqVar.zzc = i8 - Integer.MIN_VALUE;
                Object obj = zzcqVar.zza;
                Object obj2 = a.f14642a;
                i7 = zzcqVar.zzc;
                if (i7 == 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0603a.p0(obj);
                    return ((C1113f) obj).f13003a;
                }
                AbstractC0603a.p0(obj);
                zzcqVar.zzc = 1;
                Object zzg = zzg(recaptchaAction, j, zzcqVar);
                return zzg == obj2 ? obj2 : zzg;
            }
        }
        zzcqVar = new zzcq(this, interfaceC1287d);
        Object obj3 = zzcqVar.zza;
        Object obj22 = a.f14642a;
        i7 = zzcqVar.zzc;
        if (i7 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* renamed from: execute-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo4executegIAlus(RecaptchaAction recaptchaAction, InterfaceC1287d interfaceC1287d) {
        zzcr zzcrVar;
        int i7;
        if (interfaceC1287d instanceof zzcr) {
            zzcrVar = (zzcr) interfaceC1287d;
            int i8 = zzcrVar.zzc;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                zzcrVar.zzc = i8 - Integer.MIN_VALUE;
                Object obj = zzcrVar.zza;
                Object obj2 = a.f14642a;
                i7 = zzcrVar.zzc;
                if (i7 == 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0603a.p0(obj);
                    return ((C1113f) obj).f13003a;
                }
                AbstractC0603a.p0(obj);
                zzcrVar.zzc = 1;
                Object mo3execute0E7RQCE = mo3execute0E7RQCE(recaptchaAction, 10000L, zzcrVar);
                return mo3execute0E7RQCE == obj2 ? obj2 : mo3execute0E7RQCE;
            }
        }
        zzcrVar = new zzcr(this, interfaceC1287d);
        Object obj3 = zzcrVar.zza;
        Object obj22 = a.f14642a;
        i7 = zzcrVar.zzc;
        if (i7 == 0) {
        }
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
