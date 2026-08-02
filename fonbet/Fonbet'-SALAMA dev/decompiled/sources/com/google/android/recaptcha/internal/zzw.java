package com.google.android.recaptcha.internal;

import D6.C;
import a.AbstractC0603a;
import f6.C1113f;
import f6.C1116i;
import i6.InterfaceC1287d;
import j6.a;
import java.util.Iterator;
import java.util.List;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzw extends AbstractC1362i implements Function2 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzpq zzd;
    final /* synthetic */ zzx zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzw(zzpq zzpqVar, zzx zzxVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.zzd = zzpqVar;
        this.zze = zzxVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new zzw(this.zzd, this.zze, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzw) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        List list;
        Object obj2;
        Iterator it;
        a aVar = a.f14642a;
        if (this.zzc != 0) {
            Object obj3 = this.zzb;
            Object obj4 = this.zza;
            AbstractC0603a.p0(obj);
            it = obj3;
            obj2 = obj4;
        } else {
            AbstractC0603a.p0(obj);
            if (!this.zzd.zzO()) {
                return new C1113f(AbstractC0603a.h(new zzbj(zzbh.zzb, zzbg.zzac, null)));
            }
            zzpq zzpqVar = this.zzd;
            zzx zzxVar = this.zze;
            zzps zzj = zzpqVar.zzj();
            zzxVar.zzc = zzj.zzi();
            list = this.zze.zzb;
            it = list.iterator();
            obj2 = zzj;
        }
        while (it.hasNext()) {
            zzaa zzaaVar = (zzaa) it.next();
            this.zza = obj2;
            this.zzb = it;
            this.zzc = 1;
            if (zzaaVar.zzd((zzps) obj2, this) == aVar) {
                return aVar;
            }
        }
        return new C1113f(C1116i.f13008a);
    }
}
