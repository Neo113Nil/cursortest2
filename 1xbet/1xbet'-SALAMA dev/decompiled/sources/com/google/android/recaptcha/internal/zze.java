package com.google.android.recaptcha.internal;

import D6.E;
import j6.a;
import p044f6.f;
import p044f6.i;
import p065i6.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class zze {
    private boolean zza;

    public zzdf zza(String str) {
        throw null;
    }

    public zzdf zzb() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object zzc(String str, long j, d dVar) throws Throwable {
        zza zzaVar;
        zzdf zzdfVarZza;
        Exception exc;
        long j3;
        zzdf zzdfVar;
        Object obj;
        Object obj2;
        zzbj zzbjVarZza;
        long j7;
        String str2 = str;
        long j8 = j;
        if (dVar instanceof zza) {
            zzaVar = (zza) dVar;
            int i7 = zzaVar.zze;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzaVar.zze = i7 - Integer.MIN_VALUE;
            } else {
                zzaVar = new zza(this, dVar);
            }
        } else {
            zzaVar = new zza(this, dVar);
        }
        Object objY = zzaVar.zzc;
        a aVar = a.f14648a;
        int i8 = zzaVar.zze;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    long j9 = zzaVar.zzb;
                    zzdfVar = zzaVar.zzg;
                    String str3 = zzaVar.zzf;
                    obj2 = zzaVar.zza;
                    try {
                        p003a.a.p0(objY);
                        zzdfVarZza = zzdfVar;
                        j8 = j9;
                        str2 = str3;
                    } catch (Exception e7) {
                        exc = e7;
                        j7 = j9;
                        str2 = str3;
                        obj = obj2;
                        j3 = j7;
                        zzbjVarZza = zzf.zza(exc, new zzbj(zzbh.zzb, zzbg.zzaq, exc.getClass().getSimpleName()));
                        if (zzdfVar != null) {
                            zzdfVar.zzb(zzbjVarZza);
                        }
                        zzaVar.zza = obj;
                        zzaVar.zzf = str2;
                        zzaVar.zzg = null;
                        zzaVar.zze = 2;
                        if (((zze) obj).zzi(str2, j3, exc, zzaVar) == aVar) {
                            return aVar;
                        }
                        zzaVar.zza = null;
                        zzaVar.zzf = null;
                        zzaVar.zze = 3;
                        objY = ((zze) obj).zzd(str2, zzaVar);
                        if (objY == aVar) {
                            return aVar;
                        }
                        return objY;
                    }
                } else if (i8 == 2) {
                    str2 = zzaVar.zzf;
                    obj = zzaVar.zza;
                    p003a.a.p0(objY);
                    zzaVar.zza = null;
                    zzaVar.zzf = null;
                    zzaVar.zze = 3;
                    objY = ((zze) obj).zzd(str2, zzaVar);
                    if (objY == aVar) {
                        return aVar;
                    }
                } else {
                    if (i8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p003a.a.p0(objY);
                }
                return objY;
            }
            p003a.a.p0(objY);
            zzdfVarZza = zza(str);
            try {
                zzb zzbVar = new zzb(this, str2, null);
                zzaVar.zza = this;
                zzaVar.zzf = str2;
                zzaVar.zzg = zzdfVarZza;
                zzaVar.zzb = j8;
                zzaVar.zze = 1;
                objY = E.y(j8, zzbVar, zzaVar);
                if (objY == aVar) {
                    return aVar;
                }
                obj2 = this;
            } catch (Exception e8) {
                exc = e8;
                j3 = j8;
                zzdfVar = zzdfVarZza;
                obj = this;
                zzbjVarZza = zzf.zza(exc, new zzbj(zzbh.zzb, zzbg.zzaq, exc.getClass().getSimpleName()));
                if (zzdfVar != null) {
                    zzdfVar.zzb(zzbjVarZza);
                }
                zzaVar.zza = obj;
                zzaVar.zzf = str2;
                zzaVar.zzg = null;
                zzaVar.zze = 2;
                if (((zze) obj).zzi(str2, j3, exc, zzaVar) == aVar) {
                    return aVar;
                }
                zzaVar.zza = null;
                zzaVar.zzf = null;
                zzaVar.zze = 3;
                objY = ((zze) obj).zzd(str2, zzaVar);
                if (objY == aVar) {
                    return aVar;
                }
            }
            Object obj3 = ((f) objY).f13009a;
            p003a.a.p0(obj3);
            objY = (zzpw) obj3;
            if (zzdfVarZza != null) {
                zzdfVarZza.zza();
            }
        } catch (Exception e9) {
            exc = e9;
            j7 = j8;
            zzdfVar = zzdfVarZza;
            obj = obj2;
            j3 = j7;
            zzbjVarZza = zzf.zza(exc, new zzbj(zzbh.zzb, zzbg.zzaq, exc.getClass().getSimpleName()));
            if (zzdfVar != null) {
                zzdfVar.zzb(zzbjVarZza);
            }
            zzaVar.zza = obj;
            zzaVar.zzf = str2;
            zzaVar.zzg = null;
            zzaVar.zze = 2;
            if (((zze) obj).zzi(str2, j3, exc, zzaVar) == aVar) {
                return aVar;
            }
            zzaVar.zza = null;
            zzaVar.zzf = null;
            zzaVar.zze = 3;
            objY = ((zze) obj).zzd(str2, zzaVar);
            if (objY == aVar) {
                return aVar;
            }
        }
        return objY;
    }

    public abstract Object zzd(String str, d dVar);

    /* JADX WARN: Code duplicated, block: B:39:0x009b A[PHI: r10 r11 r13
      0x009b: PHI (r10v8 com.google.android.recaptcha.internal.zzdf) = (r10v5 com.google.android.recaptcha.internal.zzdf), (r10v14 com.google.android.recaptcha.internal.zzdf) binds: [B:38:0x0099, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r11v5 com.google.android.recaptcha.internal.zze) = (r11v2 com.google.android.recaptcha.internal.zze), (r11v9 com.google.android.recaptcha.internal.zze) binds: [B:38:0x0099, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r13v8 java.lang.Object) = (r13v5 java.lang.Object), (r13v1 java.lang.Object) binds: [B:38:0x0099, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zze(long j, zzpq zzpqVar, d dVar) throws Throwable {
        zzc zzcVar;
        Exception e7;
        zze zzeVar;
        zzdf zzdfVar;
        zzbj zzbjVar;
        zzbj zzbjVar2;
        if (dVar instanceof zzc) {
            zzcVar = (zzc) dVar;
            int i7 = zzcVar.zzd;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzcVar.zzd = i7 - Integer.MIN_VALUE;
            } else {
                zzcVar = new zzc(this, dVar);
            }
        } else {
            zzcVar = new zzc(this, dVar);
        }
        Object objZzj = zzcVar.zzb;
        a aVar = a.f14648a;
        int i8 = zzcVar.zzd;
        i iVar = i.f13014a;
        if (i8 == 0) {
            p003a.a.p0(objZzj);
            zzdf zzdfVarZzb = zzb();
            if (this.zza) {
                zzdfVarZzb.zza();
                return iVar;
            }
            try {
                zzd zzdVar = new zzd(this, zzpqVar, null);
                zzcVar.zza = this;
                zzcVar.zze = zzdfVarZzb;
                zzcVar.zzd = 1;
                Object objY = E.y(j, zzdVar, zzcVar);
                if (objY != aVar) {
                    zzeVar = this;
                    objZzj = objY;
                    zzdfVar = zzdfVarZzb;
                }
            } catch (Exception e8) {
                e7 = e8;
                zzeVar = this;
                zzdfVar = zzdfVarZzb;
                zzeVar.zza = false;
                zzcVar.zza = zzeVar;
                zzcVar.zze = zzdfVar;
                zzcVar.zzd = 2;
                objZzj = zzeVar.zzj(e7, zzcVar);
                if (objZzj != aVar) {
                    zzbjVar = (zzbj) objZzj;
                    if (zzdfVar != null) {
                        zzdfVar.zzb(zzbjVar);
                    }
                    zzcVar.zza = zzbjVar;
                    zzcVar.zze = null;
                    zzcVar.zzd = 3;
                    if (zzeVar.zzg(zzbjVar, zzcVar) != aVar) {
                        zzbjVar2 = zzbjVar;
                        return p003a.a.h(zzbjVar2);
                    }
                }
            }
            return aVar;
        }
        if (i8 != 1) {
            if (i8 == 2) {
                zzdfVar = zzcVar.zze;
                zzeVar = (zze) zzcVar.zza;
                p003a.a.p0(objZzj);
                zzbjVar = (zzbj) objZzj;
                if (zzdfVar != null) {
                    zzdfVar.zzb(zzbjVar);
                }
                zzcVar.zza = zzbjVar;
                zzcVar.zze = null;
                zzcVar.zzd = 3;
                if (zzeVar.zzg(zzbjVar, zzcVar) != aVar) {
                    zzbjVar2 = zzbjVar;
                }
                return aVar;
            }
            if (i8 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzbjVar2 = (zzbj) zzcVar.zza;
            p003a.a.p0(objZzj);
            return p003a.a.h(zzbjVar2);
        }
        zzdfVar = zzcVar.zze;
        zzeVar = (zze) zzcVar.zza;
        try {
            p003a.a.p0(objZzj);
        } catch (Exception e9) {
            e7 = e9;
            zzeVar.zza = false;
            zzcVar.zza = zzeVar;
            zzcVar.zze = zzdfVar;
            zzcVar.zzd = 2;
            objZzj = zzeVar.zzj(e7, zzcVar);
            if (objZzj != aVar) {
                zzbjVar = (zzbj) objZzj;
                if (zzdfVar != null) {
                    zzdfVar.zzb(zzbjVar);
                }
                zzcVar.zza = zzbjVar;
                zzcVar.zze = null;
                zzcVar.zzd = 3;
                if (zzeVar.zzg(zzbjVar, zzcVar) != aVar) {
                    zzbjVar2 = zzbjVar;
                    return p003a.a.h(zzbjVar2);
                }
            }
            return aVar;
        }
        p003a.a.p0(((f) objZzj).f13009a);
        zzeVar.zza = true;
        if (zzdfVar != null) {
            zzdfVar.zza();
        }
        return iVar;
    }

    public abstract Object zzf(String str, d dVar);

    public Object zzg(zzbj zzbjVar, d dVar) {
        return i.f13014a;
    }

    public abstract Object zzh(zzpq zzpqVar, d dVar);

    public Object zzi(String str, long j, Exception exc, d dVar) {
        return i.f13014a;
    }

    public Object zzj(Exception exc, d dVar) {
        return zzf.zza(exc, new zzbj(zzbh.zzb, zzbg.zzaq, exc.getClass().getSimpleName()));
    }

    public void zzk(zzqf zzqfVar) {
    }

    public final boolean zzl() {
        return this.zza;
    }
}
