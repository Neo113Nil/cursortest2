package com.google.android.recaptcha.internal;

import D6.C;
import j6.a;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
final class zzt extends i implements Function2 {
    int zza;
    final /* synthetic */ zzx zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzaa zzd;
    final /* synthetic */ zzqm zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzt(zzx zzxVar, String str, zzaa zzaaVar, zzqm zzqmVar, d dVar) {
        super(2, dVar);
        this.zzb = zzxVar;
        this.zzc = str;
        this.zzd = zzaaVar;
        this.zze = zzqmVar;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new zzt(this.zzb, this.zzc, this.zzd, this.zze, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzt) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f14648a;
        int i7 = this.zza;
        p003a.a.p0(obj);
        if (i7 == 0) {
            zzx zzxVar = this.zzb;
            String str = this.zzc;
            zzaa zzaaVar = this.zzd;
            this.zza = 1;
            obj = zzxVar.zzu(str, zzaaVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        this.zze.zzd((zzqj) obj);
        return p044f6.i.f13014a;
    }
}
