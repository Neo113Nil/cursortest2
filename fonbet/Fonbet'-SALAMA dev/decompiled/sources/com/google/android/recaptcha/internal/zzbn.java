package com.google.android.recaptcha.internal;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import j6.a;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzbn extends AbstractC1362i implements Function2 {
    public zzbn(InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new zzbn(interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new zzbn((InterfaceC1287d) obj2).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14642a;
        AbstractC0603a.p0(obj);
        Thread.currentThread().setPriority(8);
        return C1116i.f13008a;
    }
}
