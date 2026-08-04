package com.google.android.recaptcha.internal;

import D6.C;
import D6.C0136t;
import D6.E;
import D6.InterfaceC0135s;
import j6.a;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;
import t6.p;

/* JADX INFO: loaded from: classes.dex */
final class zzao extends i implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzap zzc;
    final /* synthetic */ zzdf zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzao(zzap zzapVar, zzdf zzdfVar, d dVar) {
        super(2, dVar);
        this.zzc = zzapVar;
        this.zzd = zzdfVar;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new zzao(this.zzc, this.zzd, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzao) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Exception e7;
        Throwable th;
        a aVar = a.f14648a;
        if (this.zzb != 0) {
            obj2 = this.zza;
            try {
                p003a.a.p0(obj);
            } catch (Exception e8) {
                e7 = e8;
                InterfaceC0135s interfaceC0135sZzf = this.zzc.zzf();
                th = (Throwable) ((p) obj2).f16478a;
                if (th == null) {
                    th = e7;
                }
                ((C0136t) interfaceC0135sZzf).O(th);
                this.zzc.zze = zzat.zza;
                this.zzd.zzb(new zzbj(zzbh.zzb, zzbg.zza, e7.getMessage()));
            }
        } else {
            p003a.a.p0(obj);
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
                InterfaceC0135s interfaceC0135sZzf2 = this.zzc.zzf();
                th = (Throwable) ((p) obj2).f16478a;
                if (th == null) {
                    th = e7;
                }
                ((C0136t) interfaceC0135sZzf2).O(th);
                this.zzc.zze = zzat.zza;
                this.zzd.zzb(new zzbj(zzbh.zzb, zzbg.zza, e7.getMessage()));
            }
        }
        return p044f6.i.f13014a;
    }
}
