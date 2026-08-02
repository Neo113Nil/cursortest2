package com.google.android.recaptcha.internal;

import D6.C;
import a.AbstractC0603a;
import f6.C1113f;
import f6.C1116i;
import i6.InterfaceC1287d;
import j6.a;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzb extends AbstractC1362i implements Function2 {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(zze zzeVar, String str, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.zzb = zzeVar;
        this.zzc = str;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new zzb(this.zzb, this.zzc, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzb) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        Object zzf;
        a aVar = a.f14642a;
        int i7 = this.zza;
        AbstractC0603a.p0(obj);
        if (i7 != 0) {
            zzf = ((C1113f) obj).f13003a;
        } else {
            zze zzeVar = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            zzf = zzeVar.zzf(str, this);
            if (zzf == aVar) {
                return aVar;
            }
        }
        return new C1113f(zzf);
    }
}
