package com.google.android.recaptcha.internal;

import D6.C;
import j6.a;
import java.util.Timer;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
final class zzdi extends i implements Function2 {
    final /* synthetic */ zzdk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdi(zzdk zzdkVar, d dVar) {
        super(2, dVar);
        this.zza = zzdkVar;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new zzdi(this.zza, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdi) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14648a;
        p003a.a.p0(obj);
        zzdk zzdkVar = this.zza;
        synchronized (zzdg.class) {
            try {
                zzda zzdaVar = zzdkVar.zze;
                if (zzdaVar != null && zzdaVar.zzb() == 0) {
                    Timer timer = zzdk.zza;
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
        return p044f6.i.f13014a;
    }
}
