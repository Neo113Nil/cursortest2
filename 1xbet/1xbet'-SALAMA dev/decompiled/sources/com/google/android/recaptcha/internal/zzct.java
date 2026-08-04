package com.google.android.recaptcha.internal;

import D6.C;
import com.google.android.recaptcha.RecaptchaAction;
import j6.a;
import kotlin.jvm.functions.Function2;
import p044f6.f;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
final class zzct extends i implements Function2 {
    int zza;
    final /* synthetic */ zzcx zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzct(zzcx zzcxVar, RecaptchaAction recaptchaAction, long j, d dVar) {
        super(2, dVar);
        this.zzb = zzcxVar;
        this.zzc = recaptchaAction;
        this.zzd = j;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new zzct(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzct) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objZzg;
        a aVar = a.f14648a;
        int i7 = this.zza;
        p003a.a.p0(obj);
        if (i7 != 0) {
            objZzg = ((f) obj).f13009a;
        } else {
            zzcx zzcxVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            objZzg = zzcxVar.zzg(recaptchaAction, j, this);
            if (objZzg == aVar) {
                return aVar;
            }
        }
        p003a.a.p0(objZzg);
        return objZzg;
    }
}
