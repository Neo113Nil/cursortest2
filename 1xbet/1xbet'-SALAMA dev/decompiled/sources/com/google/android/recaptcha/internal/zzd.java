package com.google.android.recaptcha.internal;

import D6.C;
import j6.a;
import kotlin.jvm.functions.Function2;
import p044f6.f;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
final class zzd extends i implements Function2 {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ zzpq zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzd(zze zzeVar, zzpq zzpqVar, d dVar) {
        super(2, dVar);
        this.zzb = zzeVar;
        this.zzc = zzpqVar;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new zzd(this.zzb, this.zzc, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzd) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        Object objZzh;
        a aVar = a.f14648a;
        int i7 = this.zza;
        p003a.a.p0(obj);
        if (i7 != 0) {
            objZzh = ((f) obj).f13009a;
        } else {
            zze zzeVar = this.zzb;
            zzpq zzpqVar = this.zzc;
            this.zza = 1;
            objZzh = zzeVar.zzh(zzpqVar, this);
            if (objZzh == aVar) {
                return aVar;
            }
        }
        return new f(objZzh);
    }
}
