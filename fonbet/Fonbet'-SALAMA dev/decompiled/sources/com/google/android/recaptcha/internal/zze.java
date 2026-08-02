package com.google.android.recaptcha.internal;

import D6.E;
import a.AbstractC0603a;
import f6.C1113f;
import f6.C1116i;
import i6.InterfaceC1287d;
import j6.a;

/* loaded from: classes.dex */
public abstract class zze {
    private boolean zza;

    public zzdf zza(String str) {
        throw null;
    }

    public zzdf zzb() {
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|(1:(1:(1:(2:11|12)(2:14|15))(3:16|17|(1:19)(1:12)))(4:20|21|22|23))(4:41|42|43|(1:45)(1:46))|24|25|(1:27)|12))|50|6|(0)(0)|24|25|(0)|12) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        r10 = r0;
        r16 = r3;
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        r4.zzb(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d8, code lost:
    
        return r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d7 A[PHI: r0
      0x00d7: PHI (r0v15 java.lang.Object) = (r0v13 java.lang.Object), (r0v13 java.lang.Object), (r0v14 java.lang.Object), (r0v1 java.lang.Object) binds: [B:26:0x0089, B:27:0x008b, B:18:0x00d4, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[Catch: Exception -> 0x008f, TRY_LEAVE, TryCatch #0 {Exception -> 0x008f, blocks: (B:25:0x0080, B:27:0x008b), top: B:24:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(String str, long j, InterfaceC1287d interfaceC1287d) {
        zza zzaVar;
        int i7;
        zzdf zza;
        Exception exc;
        long j3;
        zzdf zzdfVar;
        Object obj;
        Object obj2;
        String str2 = str;
        long j7 = j;
        if (interfaceC1287d instanceof zza) {
            zzaVar = (zza) interfaceC1287d;
            int i8 = zzaVar.zze;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                zzaVar.zze = i8 - Integer.MIN_VALUE;
                Object obj3 = zzaVar.zzc;
                a aVar = a.f14642a;
                i7 = zzaVar.zze;
                if (i7 != 0) {
                    AbstractC0603a.p0(obj3);
                    zza = zza(str);
                    try {
                        zzb zzbVar = new zzb(this, str2, null);
                        zzaVar.zza = this;
                        zzaVar.zzf = str2;
                        zzaVar.zzg = zza;
                        zzaVar.zzb = j7;
                        zzaVar.zze = 1;
                        obj3 = E.y(j7, zzbVar, zzaVar);
                        if (obj3 == aVar) {
                            return aVar;
                        }
                        obj2 = this;
                    } catch (Exception e7) {
                        exc = e7;
                        j3 = j7;
                        zzdfVar = zza;
                        obj = this;
                        zzbj zza2 = zzf.zza(exc, new zzbj(zzbh.zzb, zzbg.zzaq, exc.getClass().getSimpleName()));
                        if (zzdfVar != null) {
                        }
                        zzaVar.zza = obj;
                        zzaVar.zzf = str2;
                        zzaVar.zzg = null;
                        zzaVar.zze = 2;
                        if (((zze) obj).zzi(str2, j3, exc, zzaVar) == aVar) {
                        }
                        zzaVar.zza = null;
                        zzaVar.zzf = null;
                        zzaVar.zze = 3;
                        obj3 = ((zze) obj).zzd(str2, zzaVar);
                        if (obj3 != aVar) {
                        }
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 == 3) {
                                AbstractC0603a.p0(obj3);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str2 = zzaVar.zzf;
                        obj = zzaVar.zza;
                        AbstractC0603a.p0(obj3);
                        zzaVar.zza = null;
                        zzaVar.zzf = null;
                        zzaVar.zze = 3;
                        obj3 = ((zze) obj).zzd(str2, zzaVar);
                        return obj3 != aVar ? aVar : obj3;
                    }
                    long j8 = zzaVar.zzb;
                    zzdfVar = zzaVar.zzg;
                    String str3 = zzaVar.zzf;
                    obj2 = zzaVar.zza;
                    try {
                        AbstractC0603a.p0(obj3);
                        zza = zzdfVar;
                        j7 = j8;
                        str2 = str3;
                    } catch (Exception e8) {
                        exc = e8;
                        long j9 = j8;
                        str2 = str3;
                        obj = obj2;
                        j3 = j9;
                        zzbj zza22 = zzf.zza(exc, new zzbj(zzbh.zzb, zzbg.zzaq, exc.getClass().getSimpleName()));
                        if (zzdfVar != null) {
                        }
                        zzaVar.zza = obj;
                        zzaVar.zzf = str2;
                        zzaVar.zzg = null;
                        zzaVar.zze = 2;
                        if (((zze) obj).zzi(str2, j3, exc, zzaVar) == aVar) {
                        }
                        zzaVar.zza = null;
                        zzaVar.zzf = null;
                        zzaVar.zze = 3;
                        obj3 = ((zze) obj).zzd(str2, zzaVar);
                        if (obj3 != aVar) {
                        }
                    }
                }
                Object obj4 = ((C1113f) obj3).f13003a;
                AbstractC0603a.p0(obj4);
                obj3 = (zzpw) obj4;
                if (zza != null) {
                    zza.zza();
                }
            }
        }
        zzaVar = new zza(this, interfaceC1287d);
        Object obj32 = zzaVar.zzc;
        a aVar2 = a.f14642a;
        i7 = zzaVar.zze;
        if (i7 != 0) {
        }
        Object obj42 = ((C1113f) obj32).f13003a;
        AbstractC0603a.p0(obj42);
        obj32 = (zzpw) obj42;
        if (zza != null) {
        }
    }

    public abstract Object zzd(String str, InterfaceC1287d interfaceC1287d);

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0099, code lost:
    
        if (r13 != r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[Catch: Exception -> 0x0051, TRY_LEAVE, TryCatch #1 {Exception -> 0x0051, blocks: (B:27:0x004d, B:28:0x0077, B:30:0x0082), top: B:26:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zze(long j, zzpq zzpqVar, InterfaceC1287d interfaceC1287d) {
        zzc zzcVar;
        int i7;
        Exception e7;
        zze zzeVar;
        zzdf zzdfVar;
        Object obj;
        Object obj2;
        zzbj zzbjVar;
        if (interfaceC1287d instanceof zzc) {
            zzcVar = (zzc) interfaceC1287d;
            int i8 = zzcVar.zzd;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                zzcVar.zzd = i8 - Integer.MIN_VALUE;
                Object obj3 = zzcVar.zzb;
                Object obj4 = a.f14642a;
                i7 = zzcVar.zzd;
                C1116i c1116i = C1116i.f13008a;
                if (i7 != 0) {
                    AbstractC0603a.p0(obj3);
                    zzdf zzb = zzb();
                    if (this.zza) {
                        zzb.zza();
                        return c1116i;
                    }
                    try {
                        zzd zzdVar = new zzd(this, zzpqVar, null);
                        zzcVar.zza = this;
                        zzcVar.zze = zzb;
                        zzcVar.zzd = 1;
                        Object y4 = E.y(j, zzdVar, zzcVar);
                        if (y4 != obj4) {
                            zzeVar = this;
                            obj = y4;
                            zzdfVar = zzb;
                        }
                    } catch (Exception e8) {
                        e7 = e8;
                        zzeVar = this;
                        zzdfVar = zzb;
                        zzeVar.zza = false;
                        zzcVar.zza = zzeVar;
                        zzcVar.zze = zzdfVar;
                        zzcVar.zzd = 2;
                        Object zzj = zzeVar.zzj(e7, zzcVar);
                        obj2 = zzj;
                    }
                    return obj4;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zzbjVar = (zzbj) zzcVar.zza;
                        AbstractC0603a.p0(obj3);
                        return AbstractC0603a.h(zzbjVar);
                    }
                    zzdfVar = zzcVar.zze;
                    zzeVar = (zze) zzcVar.zza;
                    AbstractC0603a.p0(obj3);
                    obj2 = obj3;
                    zzbj zzbjVar2 = (zzbj) obj2;
                    if (zzdfVar != null) {
                        zzdfVar.zzb(zzbjVar2);
                    }
                    zzcVar.zza = zzbjVar2;
                    zzcVar.zze = null;
                    zzcVar.zzd = 3;
                    if (zzeVar.zzg(zzbjVar2, zzcVar) != obj4) {
                        zzbjVar = zzbjVar2;
                        return AbstractC0603a.h(zzbjVar);
                    }
                    return obj4;
                }
                zzdfVar = zzcVar.zze;
                zzeVar = (zze) zzcVar.zza;
                try {
                    AbstractC0603a.p0(obj3);
                    obj = obj3;
                } catch (Exception e9) {
                    e7 = e9;
                    zzeVar.zza = false;
                    zzcVar.zza = zzeVar;
                    zzcVar.zze = zzdfVar;
                    zzcVar.zzd = 2;
                    Object zzj2 = zzeVar.zzj(e7, zzcVar);
                    obj2 = zzj2;
                }
                AbstractC0603a.p0(((C1113f) obj).f13003a);
                zzeVar.zza = true;
                if (zzdfVar != null) {
                    zzdfVar.zza();
                }
                return c1116i;
            }
        }
        zzcVar = new zzc(this, interfaceC1287d);
        Object obj32 = zzcVar.zzb;
        Object obj42 = a.f14642a;
        i7 = zzcVar.zzd;
        C1116i c1116i2 = C1116i.f13008a;
        if (i7 != 0) {
        }
        AbstractC0603a.p0(((C1113f) obj).f13003a);
        zzeVar.zza = true;
        if (zzdfVar != null) {
        }
        return c1116i2;
    }

    public abstract Object zzf(String str, InterfaceC1287d interfaceC1287d);

    public Object zzg(zzbj zzbjVar, InterfaceC1287d interfaceC1287d) {
        return C1116i.f13008a;
    }

    public abstract Object zzh(zzpq zzpqVar, InterfaceC1287d interfaceC1287d);

    public Object zzi(String str, long j, Exception exc, InterfaceC1287d interfaceC1287d) {
        return C1116i.f13008a;
    }

    public Object zzj(Exception exc, InterfaceC1287d interfaceC1287d) {
        return zzf.zza(exc, new zzbj(zzbh.zzb, zzbg.zzaq, exc.getClass().getSimpleName()));
    }

    public void zzk(zzqf zzqfVar) {
    }

    public final boolean zzl() {
        return this.zza;
    }
}
