package com.google.android.recaptcha.internal;

import D6.C;
import j6.a;
import kotlin.jvm.functions.Function2;
import p044f6.f;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
final class zzg extends i implements Function2 {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(zze zzeVar, String str, long j, d dVar) {
        super(2, dVar);
        this.zzb = zzeVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new zzg(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzg) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objZzc;
        a aVar = a.f14648a;
        int i7 = this.zza;
        p003a.a.p0(obj);
        if (i7 != 0) {
            objZzc = ((f) obj).f13009a;
        } else {
            zze zzeVar = this.zzb;
            String str = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            objZzc = zzeVar.zzc(str, j, this);
            if (objZzc == aVar) {
                return aVar;
            }
        }
        return new f(objZzc);
    }
}
