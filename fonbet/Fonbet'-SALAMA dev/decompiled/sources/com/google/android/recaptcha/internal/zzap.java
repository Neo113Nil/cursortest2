package com.google.android.recaptcha.internal;

import D6.C;
import D6.C0136t;
import D6.E;
import D6.H;
import D6.InterfaceC0135s;
import M6.a;
import M6.e;
import a.AbstractC0603a;
import android.content.Context;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import f6.C1116i;
import i6.InterfaceC1287d;
import java.util.Timer;
import t6.h;

/* loaded from: classes.dex */
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
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzi(InterfaceC1287d interfaceC1287d) {
        zzai zzaiVar;
        int i7;
        if (interfaceC1287d instanceof zzai) {
            zzaiVar = (zzai) interfaceC1287d;
            int i8 = zzaiVar.zzc;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                zzaiVar.zzc = i8 - Integer.MIN_VALUE;
                Object obj = zzaiVar.zza;
                j6.a aVar = j6.a.f14642a;
                i7 = zzaiVar.zzc;
                if (i7 != 0) {
                    AbstractC0603a.p0(obj);
                    H zza = zzas.zza(this.zzd.prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.zzf).build()));
                    zzaiVar.zzc = 1;
                    obj = zza.await(zzaiVar);
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
        zzaiVar = new zzai(this, interfaceC1287d);
        Object obj2 = zzaiVar.zza;
        j6.a aVar2 = j6.a.f14642a;
        i7 = zzaiVar.zzc;
        if (i7 != 0) {
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (r7 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r7 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzj(String str, InterfaceC1287d interfaceC1287d) {
        zzaj zzajVar;
        int i7;
        if (interfaceC1287d instanceof zzaj) {
            zzajVar = (zzaj) interfaceC1287d;
            int i8 = zzajVar.zzc;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                zzajVar.zzc = i8 - Integer.MIN_VALUE;
                Object obj = zzajVar.zza;
                j6.a aVar = j6.a.f14642a;
                i7 = zzajVar.zzc;
                if (i7 != 0) {
                    AbstractC0603a.p0(obj);
                    InterfaceC0135s zzf = zzf();
                    zzajVar.zzd = str;
                    zzajVar.zzc = 1;
                    obj = ((C0136t) zzf).j(zzajVar);
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0603a.p0(obj);
                        return ((StandardIntegrityManager.StandardIntegrityToken) obj).token();
                    }
                    str = zzajVar.zzd;
                    AbstractC0603a.p0(obj);
                }
                H zza = zzas.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) obj).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
                zzajVar.zzd = null;
                zzajVar.zzc = 2;
                obj = zza.await(zzajVar);
            }
        }
        zzajVar = new zzaj(this, interfaceC1287d);
        Object obj2 = zzajVar.zza;
        j6.a aVar2 = j6.a.f14642a;
        i7 = zzajVar.zzc;
        if (i7 != 0) {
        }
        H zza2 = zzas.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) obj2).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
        zzajVar.zzd = null;
        zzajVar.zzc = 2;
        obj2 = zza2.await(zzajVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        if (r2.zze(r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(String str, InterfaceC1287d interfaceC1287d) {
        zzah zzahVar;
        int i7;
        zzap zzapVar;
        if (interfaceC1287d instanceof zzah) {
            zzahVar = (zzah) interfaceC1287d;
            int i8 = zzahVar.zzc;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                zzahVar.zzc = i8 - Integer.MIN_VALUE;
                Object obj = zzahVar.zza;
                j6.a aVar = j6.a.f14642a;
                i7 = zzahVar.zzc;
                if (i7 != 0) {
                    AbstractC0603a.p0(obj);
                    try {
                        zzahVar.zzd = this;
                        zzahVar.zze = str;
                        zzahVar.zzc = 1;
                        Object zzj = zzj(str, zzahVar);
                        if (zzj != aVar) {
                            return zzj;
                        }
                    } catch (Exception unused) {
                        zzapVar = this;
                    }
                    return aVar;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0603a.p0(obj);
                        return obj;
                    }
                    str = zzahVar.zze;
                    zzapVar = zzahVar.zzd;
                    AbstractC0603a.p0(obj);
                    zzahVar.zzd = null;
                    zzahVar.zze = null;
                    zzahVar.zzc = 3;
                    Object zzj2 = zzapVar.zzj(str, zzahVar);
                    if (zzj2 != aVar) {
                        return zzj2;
                    }
                    return aVar;
                }
                str = zzahVar.zze;
                zzapVar = zzahVar.zzd;
                try {
                    AbstractC0603a.p0(obj);
                    return obj;
                } catch (Exception unused2) {
                }
                zzahVar.zzd = zzapVar;
                zzahVar.zze = str;
                zzahVar.zzc = 2;
            }
        }
        zzahVar = new zzah(this, interfaceC1287d);
        Object obj2 = zzahVar.zza;
        j6.a aVar2 = j6.a.f14642a;
        i7 = zzahVar.zzc;
        if (i7 != 0) {
        }
        zzahVar.zzd = zzapVar;
        zzahVar.zze = str;
        zzahVar.zzc = 2;
    }

    public final Object zzd(long j, InterfaceC1287d interfaceC1287d) {
        this.zzf = j;
        return C1116i.f13008a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[Catch: all -> 0x00a8, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00a8, blocks: (B:18:0x0050, B:22:0x005e), top: B:17:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zze(InterfaceC1287d interfaceC1287d) {
        zzam zzamVar;
        int i7;
        zzap zzapVar;
        a aVar;
        try {
            if (interfaceC1287d instanceof zzam) {
                zzamVar = (zzam) interfaceC1287d;
                int i8 = zzamVar.zzd;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    zzamVar.zzd = i8 - Integer.MIN_VALUE;
                    Object obj = zzamVar.zzb;
                    j6.a aVar2 = j6.a.f14642a;
                    i7 = zzamVar.zzd;
                    C1116i c1116i = C1116i.f13008a;
                    if (i7 != 0) {
                        AbstractC0603a.p0(obj);
                        a aVar3 = this.zzg;
                        zzamVar.zze = this;
                        zzamVar.zza = aVar3;
                        zzamVar.zzd = 1;
                        if (aVar3.a(zzamVar) != aVar2) {
                            zzapVar = this;
                            aVar = aVar3;
                        }
                    }
                    if (i7 != 1) {
                        if (i7 == 2) {
                            AbstractC0603a.p0(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = zzamVar.zza;
                    zzapVar = zzamVar.zze;
                    AbstractC0603a.p0(obj);
                    aVar = obj2;
                    if (h.a(zzapVar.zze, zzat.zza)) {
                        return c1116i;
                    }
                    zzapVar.zze = zzat.zzb;
                    aVar.b(null);
                    zzdc zzdcVar = zzapVar.zzc;
                    zzdcVar.zzc(zzdcVar.zzd());
                    zzdcVar.zzb(2);
                    zzdf zzf = zzdcVar.zzf(38);
                    zzapVar.zza = E.a();
                    E.p(zzapVar.zzb, new zzao(zzapVar, zzf, null));
                    zzamVar.zze = null;
                    zzamVar.zza = null;
                    zzamVar.zzd = 2;
                    if (!zzapVar.zzh) {
                        new Timer().schedule(new zzak(zzapVar), 28800000L, 28800000L);
                        zzapVar.zzh = true;
                    }
                    return c1116i == aVar2 ? aVar2 : c1116i;
                }
            }
            if (h.a(zzapVar.zze, zzat.zza)) {
            }
        } finally {
            aVar.b(null);
        }
        zzamVar = new zzam(this, interfaceC1287d);
        Object obj3 = zzamVar.zzb;
        j6.a aVar22 = j6.a.f14642a;
        i7 = zzamVar.zzd;
        C1116i c1116i2 = C1116i.f13008a;
        if (i7 != 0) {
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
