package com.google.android.recaptcha.internal;

import D6.C;
import android.app.Application;
import j6.a;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
final class zzcc extends i implements Function2 {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcc(Application application, String str, long j, zzdq zzdqVar, d dVar) {
        super(2, dVar);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new zzcc(this.zzb, this.zzc, this.zzd, null, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcc) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f14648a;
        int i7 = this.zza;
        p003a.a.p0(obj);
        if (i7 == 0) {
            Application application = this.zzb;
            String str = this.zzc;
            long j = this.zzd;
            zzco zzcoVar = zzco.zza;
            this.zza = 1;
            obj = zzcoVar.zze(application, str, j, new zzbv("https://www.recaptcha.net/recaptcha/api3"), null, null, zzco.zzf, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
