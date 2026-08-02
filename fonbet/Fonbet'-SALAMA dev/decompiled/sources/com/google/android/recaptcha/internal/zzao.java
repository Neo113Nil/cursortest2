package com.google.android.recaptcha.internal;

import D6.C;
import D6.C0136t;
import D6.E;
import D6.InterfaceC0135s;
import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import j6.a;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;
import t6.p;

/* loaded from: classes.dex */
final class zzao extends AbstractC1362i implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzap zzc;
    final /* synthetic */ zzdf zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzao(zzap zzapVar, zzdf zzdfVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.zzc = zzapVar;
        this.zzd = zzdfVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new zzao(this.zzc, this.zzd, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzao) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    @Override // k6.AbstractC1354a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Exception e7;
        Throwable th;
        a aVar = a.f14642a;
        if (this.zzb != 0) {
            obj2 = this.zza;
            try {
                AbstractC0603a.p0(obj);
            } catch (Exception e8) {
                e7 = e8;
                InterfaceC0135s zzf = this.zzc.zzf();
                th = (Throwable) ((p) obj2).f16472a;
                if (th == null) {
                }
                ((C0136t) zzf).O(th);
                this.zzc.zze = zzat.zza;
                this.zzd.zzb(new zzbj(zzbh.zzb, zzbg.zza, e7.getMessage()));
                return C1116i.f13008a;
            }
        } else {
            AbstractC0603a.p0(obj);
            p pVar = new p();
            try {
                zzan zzanVar = new zzan(this.zzc, this.zzd, pVar, null);
                this.zza = pVar;
                this.zzb = 1;
                if (E.y(60000L, zzanVar, this) == aVar) {
                    return aVar;
                }
            } catch (Exception e9) {
                obj2 = pVar;
                e7 = e9;
                InterfaceC0135s zzf2 = this.zzc.zzf();
                th = (Throwable) ((p) obj2).f16472a;
                if (th == null) {
                    th = e7;
                }
                ((C0136t) zzf2).O(th);
                this.zzc.zze = zzat.zza;
                this.zzd.zzb(new zzbj(zzbh.zzb, zzbg.zza, e7.getMessage()));
                return C1116i.f13008a;
            }
        }
        return C1116i.f13008a;
    }
}
