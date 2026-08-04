package com.google.android.recaptcha.internal;

import D6.C;
import D6.C0136t;
import D6.E;
import j6.a;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
final class zzgr extends i implements Function2 {
    final /* synthetic */ zzgv zza;
    final /* synthetic */ zzpq zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgr(zzgv zzgvVar, zzpq zzpqVar, d dVar) {
        super(2, dVar);
        this.zza = zzgvVar;
        this.zzb = zzpqVar;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new zzgr(this.zza, this.zzb, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgr) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) throws Exception {
        a aVar = a.f14648a;
        p003a.a.p0(obj);
        try {
            zzgv zzgvVar = this.zza;
            E.p(this.zza.zzn.zzb(), new zzgq(this.zza, zzgvVar.zzp().zzb(this.zzb, zzgvVar.zzl), null));
        } catch (zzbj e7) {
            ((C0136t) this.zza.zzu()).O(e7);
        }
        return p044f6.i.f13014a;
    }
}
