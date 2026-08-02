package com.google.android.recaptcha.internal;

import D6.C;
import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import j6.a;
import java.util.Timer;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzdi extends AbstractC1362i implements Function2 {
    final /* synthetic */ zzdk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdi(zzdk zzdkVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.zza = zzdkVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new zzdi(this.zza, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdi) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        zzda zzdaVar;
        Timer timer;
        a aVar = a.f14642a;
        AbstractC0603a.p0(obj);
        zzdk zzdkVar = this.zza;
        synchronized (zzdg.class) {
            try {
                zzdaVar = zzdkVar.zze;
                if (zzdaVar != null && zzdaVar.zzb() == 0) {
                    timer = zzdk.zza;
                    if (timer != null) {
                        timer.cancel();
                    }
                    zzdk.zza = null;
                }
                zzdkVar.zzg();
            } catch (Throwable th) {
                throw th;
            }
        }
        return C1116i.f13008a;
    }
}
