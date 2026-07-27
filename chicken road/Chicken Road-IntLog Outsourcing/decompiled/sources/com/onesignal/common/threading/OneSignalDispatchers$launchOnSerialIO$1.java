package com.onesignal.common.threading;

import D4.InterfaceC0022w;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.common.threading.OneSignalDispatchers$launchOnSerialIO$1", f = "OneSignalDispatchers.kt", l = {172}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OneSignalDispatchers$launchOnSerialIO$1 extends h implements InterfaceC1445p {
    final /* synthetic */ InterfaceC1441l $block;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalDispatchers$launchOnSerialIO$1(InterfaceC1441l interfaceC1441l, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.$block = interfaceC1441l;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new OneSignalDispatchers$launchOnSerialIO$1(this.$block, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((OneSignalDispatchers$launchOnSerialIO$1) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            InterfaceC1441l interfaceC1441l = this.$block;
            this.label = 1;
            if (interfaceC1441l.invoke(this) == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        return v.f5689a;
    }
}
