package com.google.android.recaptcha.internal;

import D6.C;
import j6.a;
import kotlin.jvm.functions.Function2;
import p044f6.f;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
final class zzw extends i implements Function2 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzpq zzd;
    final /* synthetic */ zzx zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzw(zzpq zzpqVar, zzx zzxVar, d dVar) {
        super(2, dVar);
        this.zzd = zzpqVar;
        this.zze = zzxVar;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new zzw(this.zzd, this.zze, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzw) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        ?? it;
        a aVar = a.f14648a;
        if (this.zzc != 0) {
            Object obj3 = this.zzb;
            Object obj4 = this.zza;
            p003a.a.p0(obj);
            it = obj3;
            obj2 = obj4;
        } else {
            p003a.a.p0(obj);
            if (!this.zzd.zzO()) {
                return new f(p003a.a.h(new zzbj(zzbh.zzb, zzbg.zzac, null)));
            }
            zzpq zzpqVar = this.zzd;
            zzx zzxVar = this.zze;
            zzps zzpsVarZzj = zzpqVar.zzj();
            zzxVar.zzc = zzpsVarZzj.zzi();
            it = this.zze.zzb.iterator();
            obj2 = zzpsVarZzj;
        }
        while (it.hasNext()) {
            zzaa zzaaVar = (zzaa) it.next();
            this.zza = obj2;
            this.zzb = it;
            this.zzc = 1;
            if (zzaaVar.zzd((zzps) obj2, this) == aVar) {
                return aVar;
            }
        }
        return new f(p044f6.i.f13014a);
    }
}
