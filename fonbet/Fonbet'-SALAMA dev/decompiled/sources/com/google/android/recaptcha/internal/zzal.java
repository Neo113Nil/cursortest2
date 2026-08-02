package com.google.android.recaptcha.internal;

import D6.C;
import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import j6.a;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzal extends AbstractC1362i implements Function2 {
    int zza;
    final /* synthetic */ zzap zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzal(zzap zzapVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.zzb = zzapVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new zzal(this.zzb, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzal) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14642a;
        int i7 = this.zza;
        AbstractC0603a.p0(obj);
        if (i7 == 0) {
            this.zzb.zze = zzat.zza;
            zzap zzapVar = this.zzb;
            this.zza = 1;
            if (zzapVar.zze(this) == aVar) {
                return aVar;
            }
        }
        return C1116i.f13008a;
    }
}
