package com.google.android.recaptcha.internal;

import A1.W;
import D6.C;
import j6.a;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
final class zzr extends i implements Function2 {
    int zza;
    final /* synthetic */ zzaa zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzx zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzr(zzaa zzaaVar, String str, zzx zzxVar, d dVar) {
        super(2, dVar);
        this.zzb = zzaaVar;
        this.zzc = str;
        this.zzd = zzxVar;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new zzr(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14648a;
        int i7 = this.zza;
        p003a.a.p0(obj);
        if (i7 == 0) {
            zzaa zzaaVar = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            obj = zzaaVar.zzc(str, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        zzac zzacVar = (zzac) obj;
        zzqj zzqjVarZzf = zzql.zzf();
        zzqjVarZzf.zzp(3);
        if (zzacVar instanceof zzz) {
            zzqjVarZzf.zze(zzx.zzp(this.zzd, ((zzz) zzacVar).zza()));
        } else {
            if (!(zzacVar instanceof zzy)) {
                throw new W();
            }
            zzqjVarZzf.zzd(zzx.zzo(this.zzd, ((zzy) zzacVar).zza()));
        }
        return zzqjVarZzf;
    }
}
