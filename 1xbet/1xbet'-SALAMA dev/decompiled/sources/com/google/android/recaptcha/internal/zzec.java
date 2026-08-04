package com.google.android.recaptcha.internal;

import D6.C;
import j6.a;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import p050g6.h;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
final class zzec extends i implements Function2 {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzed zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzec(String[] strArr, zzed zzedVar, String str, d dVar) {
        super(2, dVar);
        this.zza = strArr;
        this.zzb = zzedVar;
        this.zzc = str;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new zzec(this.zza, this.zzb, this.zzc, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzec) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14648a;
        p003a.a.p0(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("\"" + str + "\"");
        }
        this.zzb.zza.evaluateJavascript(p150v0.a.o(this.zzc, "(", h.T0(arrayList, ",", null, null, null, 62), ")"), null);
        return p044f6.i.f13014a;
    }
}
