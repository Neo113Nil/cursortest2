package com.onesignal.common.events;

import e5.g;
import f4.v;
import g4.AbstractC0465j;
import java.util.Iterator;
import java.util.List;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.common.events.EventProducer$fireOnMain$1", f = "EventProducer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class EventProducer$fireOnMain$1 extends h implements InterfaceC1441l {
    final /* synthetic */ InterfaceC1441l $callback;
    int label;
    final /* synthetic */ EventProducer<THandler> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventProducer$fireOnMain$1(EventProducer<THandler> eventProducer, InterfaceC1441l interfaceC1441l, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = eventProducer;
        this.$callback = interfaceC1441l;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new EventProducer$fireOnMain$1(this.this$0, this.$callback, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        List S02;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        list = ((EventProducer) this.this$0).subscribers;
        EventProducer<THandler> eventProducer = this.this$0;
        synchronized (list) {
            list2 = ((EventProducer) eventProducer).subscribers;
            S02 = AbstractC0465j.S0(list2);
        }
        Iterator it = S02.iterator();
        while (it.hasNext()) {
            this.$callback.invoke(it.next());
        }
        return v.f5689a;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((EventProducer$fireOnMain$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
