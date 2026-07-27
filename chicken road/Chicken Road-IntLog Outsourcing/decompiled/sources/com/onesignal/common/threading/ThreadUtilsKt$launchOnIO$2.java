package com.onesignal.common.threading;

import D4.InterfaceC0022w;
import com.onesignal.debug.internal.logging.Logging;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.common.threading.ThreadUtilsKt$launchOnIO$2", f = "ThreadUtils.kt", l = {249}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ThreadUtilsKt$launchOnIO$2 extends h implements InterfaceC1445p {
    final /* synthetic */ InterfaceC1441l $block;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadUtilsKt$launchOnIO$2(InterfaceC1441l interfaceC1441l, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.$block = interfaceC1441l;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new ThreadUtilsKt$launchOnIO$2(this.$block, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((ThreadUtilsKt$launchOnIO$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        try {
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
        } catch (Exception e3) {
            Logging.error("Exception in launchOnIO", e3);
        }
        return v.f5689a;
    }
}
