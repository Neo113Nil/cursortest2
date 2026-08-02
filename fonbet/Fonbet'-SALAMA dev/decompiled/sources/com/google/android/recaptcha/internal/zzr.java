package com.google.android.recaptcha.internal;

import A1.W;
import D6.C;
import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import j6.a;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzr extends AbstractC1362i implements Function2 {
    int zza;
    final /* synthetic */ zzaa zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzx zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzr(zzaa zzaaVar, String str, zzx zzxVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.zzb = zzaaVar;
        this.zzc = str;
        this.zzd = zzxVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new zzr(this.zzb, this.zzc, this.zzd, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14642a;
        int i7 = this.zza;
        AbstractC0603a.p0(obj);
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
        zzqj zzf = zzql.zzf();
        zzf.zzp(3);
        if (zzacVar instanceof zzz) {
            zzf.zze(zzx.zzp(this.zzd, ((zzz) zzacVar).zza()));
        } else {
            if (!(zzacVar instanceof zzy)) {
                throw new W();
            }
            zzf.zzd(zzx.zzo(this.zzd, ((zzy) zzacVar).zza()));
        }
        return zzf;
    }
}
