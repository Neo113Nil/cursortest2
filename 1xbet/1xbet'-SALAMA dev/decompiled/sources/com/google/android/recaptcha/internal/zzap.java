package com.google.android.recaptcha.internal;

import D6.C;
import D6.C0136t;
import D6.E;
import D6.H;
import D6.InterfaceC0135s;
import M6.a;
import M6.e;
import android.content.Context;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.lang.reflect.InvocationTargetException;
import java.util.Timer;
import p044f6.i;
import p065i6.d;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class zzap {
    public InterfaceC0135s zza;
    private final C zzb;
    private final zzdc zzc;
    private final StandardIntegrityManager zzd;
    private long zzf;
    private boolean zzh;
    private zzat zze = zzat.zza;
    private final a zzg = e.a();

    public zzap(Context context, C c3, zzdc zzdcVar, StandardIntegrityManager standardIntegrityManager, long j) {
        this.zzb = c3;
        this.zzc = zzdcVar;
        this.zzd = standardIntegrityManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzi(d dVar) throws IllegalAccessException, InvocationTargetException {
        zzai zzaiVar;
        if (dVar instanceof zzai) {
            zzaiVar = (zzai) dVar;
            int i7 = zzaiVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzaiVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzaiVar = new zzai(this, dVar);
            }
        } else {
            zzaiVar = new zzai(this, dVar);
        }
        Object objAwait = zzaiVar.zza;
        j6.a aVar = j6.a.f14648a;
        int i8 = zzaiVar.zzc;
        if (i8 == 0) {
            p003a.a.p0(objAwait);
            H hZza = zzas.zza(this.zzd.prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.zzf).build()));
            zzaiVar.zzc = 1;
            objAwait = hZza.await(zzaiVar);
            if (objAwait == aVar) {
                return aVar;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p003a.a.p0(objAwait);
        }
        return objAwait;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r7 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzj(String str, d dVar) throws Throwable {
        zzaj zzajVar;
        if (dVar instanceof zzaj) {
            zzajVar = (zzaj) dVar;
            int i7 = zzajVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzajVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzajVar = new zzaj(this, dVar);
            }
        } else {
            zzajVar = new zzaj(this, dVar);
        }
        Object objJ = zzajVar.zza;
        j6.a aVar = j6.a.f14648a;
        int i8 = zzajVar.zzc;
        if (i8 != 0) {
            if (i8 == 1) {
                str = zzajVar.zzd;
                p003a.a.p0(objJ);
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p003a.a.p0(objJ);
            }
            return ((StandardIntegrityManager.StandardIntegrityToken) objJ).token();
        }
        p003a.a.p0(objJ);
        InterfaceC0135s interfaceC0135sZzf = zzf();
        zzajVar.zzd = str;
        zzajVar.zzc = 1;
        objJ = ((C0136t) interfaceC0135sZzf).j(zzajVar);
        if (objJ != aVar) {
        }
        return aVar;
        H hZza = zzas.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) objJ).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
        zzajVar.zzd = null;
        zzajVar.zzc = 2;
        objJ = hZza.await(zzajVar);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0064 A[PHI: r2 r7
      0x0064: PHI (r2v3 com.google.android.recaptcha.internal.zzap) = (r2v2 com.google.android.recaptcha.internal.zzap), (r2v5 com.google.android.recaptcha.internal.zzap) binds: [B:27:0x0061, B:16:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0064: PHI (r7v4 java.lang.String) = (r7v3 java.lang.String), (r7v7 java.lang.String) binds: [B:27:0x0061, B:16:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0073 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzc(String str, d dVar) throws Throwable {
        zzah zzahVar;
        zzap zzapVar;
        Object objZzj;
        if (dVar instanceof zzah) {
            zzahVar = (zzah) dVar;
            int i7 = zzahVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzahVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzahVar = new zzah(this, dVar);
            }
        } else {
            zzahVar = new zzah(this, dVar);
        }
        Object obj = zzahVar.zza;
        j6.a aVar = j6.a.f14648a;
        int i8 = zzahVar.zzc;
        if (i8 == 0) {
            p003a.a.p0(obj);
            try {
                zzahVar.zzd = this;
                zzahVar.zze = str;
                zzahVar.zzc = 1;
                Object objZzj2 = zzj(str, zzahVar);
                if (objZzj2 != aVar) {
                    return objZzj2;
                }
            } catch (Exception unused) {
                zzapVar = this;
                zzahVar.zzd = zzapVar;
                zzahVar.zze = str;
                zzahVar.zzc = 2;
                if (zzapVar.zze(zzahVar) != aVar) {
                    zzahVar.zzd = null;
                    zzahVar.zze = null;
                    zzahVar.zzc = 3;
                    objZzj = zzapVar.zzj(str, zzahVar);
                    if (objZzj != aVar) {
                        return objZzj;
                    }
                }
            }
            return aVar;
        }
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p003a.a.p0(obj);
                return obj;
            }
            str = zzahVar.zze;
            zzapVar = zzahVar.zzd;
            p003a.a.p0(obj);
            zzahVar.zzd = null;
            zzahVar.zze = null;
            zzahVar.zzc = 3;
            objZzj = zzapVar.zzj(str, zzahVar);
            if (objZzj != aVar) {
                return objZzj;
            }
            return aVar;
        }
        str = zzahVar.zze;
        zzapVar = zzahVar.zzd;
        try {
            p003a.a.p0(obj);
            return obj;
        } catch (Exception unused2) {
        }
        zzahVar.zzd = zzapVar;
        zzahVar.zze = str;
        zzahVar.zzc = 2;
        if (zzapVar.zze(zzahVar) != aVar) {
            zzahVar.zzd = null;
            zzahVar.zze = null;
            zzahVar.zzc = 3;
            objZzj = zzapVar.zzj(str, zzahVar);
            if (objZzj != aVar) {
                return objZzj;
            }
        }
        return aVar;
    }

    public final Object zzd(long j, d dVar) {
        this.zzf = j;
        return i.f13014a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [M6.a] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final Object zze(d dVar) {
        zzam zzamVar;
        zzap zzapVar;
        ?? r7;
        if (dVar instanceof zzam) {
            zzamVar = (zzam) dVar;
            int i7 = zzamVar.zzd;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzamVar.zzd = i7 - Integer.MIN_VALUE;
            } else {
                zzamVar = new zzam(this, dVar);
            }
        } else {
            zzamVar = new zzam(this, dVar);
        }
        Object obj = zzamVar.zzb;
        j6.a aVar = j6.a.f14648a;
        int i8 = zzamVar.zzd;
        i iVar = i.f13014a;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    Object obj2 = zzamVar.zza;
                    zzapVar = zzamVar.zze;
                    p003a.a.p0(obj);
                    r7 = obj2;
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p003a.a.p0(obj);
                }
            }
            p003a.a.p0(obj);
            a aVar2 = this.zzg;
            zzamVar.zze = this;
            zzamVar.zza = aVar2;
            zzamVar.zzd = 1;
            if (aVar2.a(zzamVar) != aVar) {
                zzapVar = this;
                r7 = aVar2;
            }
            if (!h.a(zzapVar.zze, zzat.zza)) {
                r7.b(null);
                return iVar;
            }
            zzapVar.zze = zzat.zzb;
            r7.b(null);
            zzdc zzdcVar = zzapVar.zzc;
            zzdcVar.zzc(zzdcVar.zzd());
            zzdcVar.zzb(2);
            zzdf zzdfVarZzf = zzdcVar.zzf(38);
            zzapVar.zza = E.a();
            E.p(zzapVar.zzb, new zzao(zzapVar, zzdfVarZzf, null));
            zzamVar.zze = null;
            zzamVar.zza = null;
            zzamVar.zzd = 2;
            if (!zzapVar.zzh) {
                new Timer().schedule(new zzak(zzapVar), 28800000L, 28800000L);
                zzapVar.zzh = true;
            }
            return iVar == aVar ? aVar : iVar;
        } catch (Throwable th) {
            r7.b(null);
            throw th;
        }
    }

    public final InterfaceC0135s zzf() {
        InterfaceC0135s interfaceC0135s = this.zza;
        if (interfaceC0135s != null) {
            return interfaceC0135s;
        }
        return null;
    }
}
