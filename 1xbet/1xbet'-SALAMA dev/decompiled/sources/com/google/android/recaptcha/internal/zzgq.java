package com.google.android.recaptcha.internal;

import D6.C;
import j6.a;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
final class zzgq extends i implements Function2 {
    final /* synthetic */ zzgv zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgq(zzgv zzgvVar, String str, d dVar) {
        super(2, dVar);
        this.zza = zzgvVar;
        this.zzb = str;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new zzgq(this.zza, this.zzb, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgq) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14648a;
        p003a.a.p0(obj);
        this.zza.zzm().clearCache(true);
        zzgv.zzv(this.zza, this.zzb);
        return p044f6.i.f13014a;
    }
}
