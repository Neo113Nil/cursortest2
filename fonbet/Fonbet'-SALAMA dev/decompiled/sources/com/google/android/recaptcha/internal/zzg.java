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
final class zzg extends AbstractC1362i implements Function2 {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(zze zzeVar, String str, long j, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.zzb = zzeVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new zzg(this.zzb, this.zzc, this.zzd, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzg) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        Object zzc;
        a aVar = a.f14642a;
        int i7 = this.zza;
        AbstractC0603a.p0(obj);
        if (i7 != 0) {
            zzc = ((C1113f) obj).f13003a;
        } else {
            zze zzeVar = this.zzb;
            String str = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            zzc = zzeVar.zzc(str, j, this);
            if (zzc == aVar) {
                return aVar;
            }
        }
        return new C1113f(zzc);
    }
}
