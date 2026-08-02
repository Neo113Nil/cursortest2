package com.google.android.recaptcha.internal;

import D6.C;
import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import j6.a;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzt extends AbstractC1362i implements Function2 {
    int zza;
    final /* synthetic */ zzx zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzaa zzd;
    final /* synthetic */ zzqm zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzt(zzx zzxVar, String str, zzaa zzaaVar, zzqm zzqmVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.zzb = zzxVar;
        this.zzc = str;
        this.zzd = zzaaVar;
        this.zze = zzqmVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new zzt(this.zzb, this.zzc, this.zzd, this.zze, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzt) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14642a;
        int i7 = this.zza;
        AbstractC0603a.p0(obj);
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
        return C1116i.f13008a;
    }
}
