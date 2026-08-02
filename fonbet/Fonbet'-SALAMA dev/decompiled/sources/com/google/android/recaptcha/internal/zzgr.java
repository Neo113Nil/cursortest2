package com.google.android.recaptcha.internal;

import D6.C;
import D6.C0136t;
import D6.E;
import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import j6.a;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzgr extends AbstractC1362i implements Function2 {
    final /* synthetic */ zzgv zza;
    final /* synthetic */ zzpq zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgr(zzgv zzgvVar, zzpq zzpqVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.zza = zzgvVar;
        this.zzb = zzpqVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new zzgr(this.zza, this.zzb, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgr) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        zzdc zzdcVar;
        zzbo zzboVar;
        a aVar = a.f14642a;
        AbstractC0603a.p0(obj);
        try {
            zzgv zzgvVar = this.zza;
            zzdq zzp = zzgvVar.zzp();
            zzpq zzpqVar = this.zzb;
            zzdcVar = zzgvVar.zzl;
            String zzb = zzp.zzb(zzpqVar, zzdcVar);
            zzboVar = this.zza.zzn;
            E.p(zzboVar.zzb(), new zzgq(this.zza, zzb, null));
        } catch (zzbj e7) {
            ((C0136t) this.zza.zzu()).O(e7);
        }
        return C1116i.f13008a;
    }
}
