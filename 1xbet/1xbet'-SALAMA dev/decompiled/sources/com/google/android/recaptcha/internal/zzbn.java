package com.google.android.recaptcha.internal;

import j6.a;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
final class zzbn extends i implements Function2 {
    public zzbn(d dVar) {
        super(2, dVar);
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new zzbn(dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new zzbn((d) obj2).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14648a;
        p003a.a.p0(obj);
        Thread.currentThread().setPriority(8);
        return p044f6.i.f13014a;
    }
}
