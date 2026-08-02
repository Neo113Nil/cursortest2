package com.google.android.recaptcha.internal;

import f6.C1116i;
import kotlin.jvm.functions.Function2;
import t6.i;

/* loaded from: classes.dex */
final class zzey extends i implements Function2 {
    final /* synthetic */ zzek zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzey(zzek zzekVar, String str, int i7) {
        super(2);
        this.zza = zzekVar;
        this.zzb = str;
        this.zzc = i7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        this.zza.zzi().zzb(this.zzb, (String) obj2);
        int i7 = this.zzc;
        if (i7 != -1) {
            this.zza.zzc().zze(i7, objArr);
        }
        return C1116i.f13008a;
    }
}
