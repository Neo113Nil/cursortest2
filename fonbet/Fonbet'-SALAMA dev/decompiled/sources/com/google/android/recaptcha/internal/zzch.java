package com.google.android.recaptcha.internal;

import D6.C;
import a.AbstractC0603a;
import android.app.Application;
import f6.C1116i;
import i6.InterfaceC1287d;
import j6.a;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzch extends AbstractC1362i implements Function2 {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzch(Application application, String str, long j, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new zzch(this.zzb, this.zzc, this.zzd, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzch) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14642a;
        int i7 = this.zza;
        AbstractC0603a.p0(obj);
        if (i7 == 0) {
            zzco zzcoVar = zzco.zza;
            Application application = this.zzb;
            String str = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            obj = zzco.zzg(application, str, j, null, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
