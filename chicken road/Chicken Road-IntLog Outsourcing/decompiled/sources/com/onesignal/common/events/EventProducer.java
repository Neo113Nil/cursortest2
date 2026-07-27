package com.onesignal.common.events;

import D4.AbstractC0024y;
import D4.E;
import I4.o;
import K4.d;
import com.onesignal.common.threading.ThreadUtilsKt;
import e5.g;
import f4.v;
import g4.AbstractC0465j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import t4.InterfaceC1441l;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public class EventProducer<THandler> implements IEventNotifier<THandler> {
    private final List<THandler> subscribers;

    public EventProducer() {
        List<THandler> synchronizedList = Collections.synchronizedList(new ArrayList());
        i.d(synchronizedList, "synchronizedList(...)");
        this.subscribers = synchronizedList;
    }

    public final void fire(InterfaceC1441l callback) {
        List S02;
        i.e(callback, "callback");
        synchronized (this.subscribers) {
            S02 = AbstractC0465j.S0(this.subscribers);
        }
        Iterator it = S02.iterator();
        while (it.hasNext()) {
            callback.invoke(it.next());
        }
    }

    public final void fireOnMain(InterfaceC1441l callback) {
        i.e(callback, "callback");
        ThreadUtilsKt.suspendifyOnMain(new EventProducer$fireOnMain$1(this, callback, null));
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        i.e(this.subscribers, "<this>");
        return !r0.isEmpty();
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(THandler thandler) {
        synchronized (this.subscribers) {
            this.subscribers.add(thandler);
        }
    }

    public final void subscribeAll(EventProducer<THandler> from) {
        i.e(from, "from");
        synchronized (this.subscribers) {
            Iterator<THandler> it = from.subscribers.iterator();
            while (it.hasNext()) {
                subscribe(it.next());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object suspendingFire(InterfaceC1445p interfaceC1445p, InterfaceC1218d interfaceC1218d) {
        EventProducer$suspendingFire$1 eventProducer$suspendingFire$1;
        int i2;
        List S02;
        InterfaceC1445p interfaceC1445p2;
        Iterator it;
        if (interfaceC1218d instanceof EventProducer$suspendingFire$1) {
            eventProducer$suspendingFire$1 = (EventProducer$suspendingFire$1) interfaceC1218d;
            int i3 = eventProducer$suspendingFire$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eventProducer$suspendingFire$1.label = i3 - Integer.MIN_VALUE;
                Object obj = eventProducer$suspendingFire$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = eventProducer$suspendingFire$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    synchronized (this.subscribers) {
                        S02 = AbstractC0465j.S0(this.subscribers);
                    }
                    interfaceC1445p2 = interfaceC1445p;
                    it = S02.iterator();
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) eventProducer$suspendingFire$1.L$1;
                    InterfaceC1445p interfaceC1445p3 = (InterfaceC1445p) eventProducer$suspendingFire$1.L$0;
                    g.y(obj);
                    interfaceC1445p2 = interfaceC1445p3;
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    eventProducer$suspendingFire$1.L$0 = interfaceC1445p2;
                    eventProducer$suspendingFire$1.L$1 = it;
                    eventProducer$suspendingFire$1.label = 1;
                    if (interfaceC1445p2.invoke(next, eventProducer$suspendingFire$1) == enumC1260a) {
                        return enumC1260a;
                    }
                }
                return v.f5689a;
            }
        }
        eventProducer$suspendingFire$1 = new EventProducer$suspendingFire$1(this, interfaceC1218d);
        Object obj2 = eventProducer$suspendingFire$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = eventProducer$suspendingFire$1.label;
        if (i2 != 0) {
        }
        while (it.hasNext()) {
        }
        return v.f5689a;
    }

    public final Object suspendingFireOnMain(InterfaceC1445p interfaceC1445p, InterfaceC1218d interfaceC1218d) {
        d dVar = E.f459a;
        Object w3 = AbstractC0024y.w(o.f1316a, new EventProducer$suspendingFireOnMain$2(this, interfaceC1445p, null), interfaceC1218d);
        return w3 == EnumC1260a.f11058a ? w3 : v.f5689a;
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(THandler thandler) {
        synchronized (this.subscribers) {
            this.subscribers.remove(thandler);
        }
    }
}
