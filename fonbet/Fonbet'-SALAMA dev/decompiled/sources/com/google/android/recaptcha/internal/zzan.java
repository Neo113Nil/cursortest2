package com.google.android.recaptcha.internal;

import D6.C;
import D6.C0130m;
import D6.C0136t;
import D6.E;
import P6.b;
import a.AbstractC0603a;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import f6.C1116i;
import i6.InterfaceC1287d;
import j6.a;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;
import t6.p;

/* loaded from: classes.dex */
final class zzan extends AbstractC1362i implements Function2 {
    long zza;
    boolean zzb;
    int zzc;
    final /* synthetic */ zzap zzd;
    final /* synthetic */ zzdf zze;
    final /* synthetic */ p zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzan(zzap zzapVar, zzdf zzdfVar, p pVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.zzd = zzapVar;
        this.zze = zzdfVar;
        this.zzf = pVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new zzan(this.zzd, this.zze, this.zzf, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzan) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a7, code lost:
    
        if (r10 == j6.a.f14642a) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0013, code lost:
    
        if (r10 == r0) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026 A[Catch: Exception -> 0x001c, TRY_ENTER, TryCatch #0 {Exception -> 0x001c, blocks: (B:8:0x0026, B:10:0x0032, B:46:0x0018), top: B:45:0x0018 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x004b -> B:7:0x0024). Please report as a decompilation issue!!! */
    @Override // k6.AbstractC1354a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        boolean z4;
        boolean z7;
        int errorCode;
        a aVar = a.f14642a;
        int i7 = this.zzc;
        C1116i c1116i = C1116i.f13008a;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            j = 1000;
            z4 = true;
            if (!z4) {
            }
        } else if (i7 != 1) {
            z7 = this.zzb;
            j = this.zza;
            AbstractC0603a.p0(obj);
            z4 = z7;
            j += j;
            if (!z4) {
                zzap zzapVar = this.zzd;
                this.zza = j;
                this.zzc = 1;
                obj = zzapVar.zzi(this);
                if (obj == aVar) {
                    return aVar;
                }
                ((C0136t) this.zzd.zzf()).C((StandardIntegrityManager.StandardIntegrityTokenProvider) obj);
                this.zzd.zze = zzat.zzc;
                this.zze.zza();
                z4 = false;
                if (!z4) {
                    return c1116i;
                }
            }
        } else {
            j = this.zza;
            try {
                AbstractC0603a.p0(obj);
            } catch (Exception e7) {
                this.zzf.f16472a = e7;
                z7 = (e7 instanceof StandardIntegrityException) && ((errorCode = ((StandardIntegrityException) e7).getErrorCode()) == -100 || errorCode == -18 || errorCode == -12 || errorCode == -8 || errorCode == -3);
                if (!z7) {
                    throw e7;
                }
                this.zza = j;
                this.zzb = true;
                this.zzc = 2;
                if (j > 0) {
                    C0130m c0130m = new C0130m(1, b.v(this));
                    c0130m.s();
                    if (j < Long.MAX_VALUE) {
                        E.h(c0130m.f1858e).c(j, c0130m);
                    }
                    Object r7 = c0130m.r();
                }
                if (c1116i == aVar) {
                    return aVar;
                }
            }
            ((C0136t) this.zzd.zzf()).C((StandardIntegrityManager.StandardIntegrityTokenProvider) obj);
            this.zzd.zze = zzat.zzc;
            this.zze.zza();
            z4 = false;
            if (!z4) {
            }
        }
    }
}
