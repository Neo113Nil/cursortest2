package com.plaid.internal;

/* loaded from: classes16.dex */
public final class A2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.DelayQueue<com.plaid.internal.DelayedC0689y0> f5748a;
    public final java.util.List<com.plaid.link.event.LinkEvent> b;

    public A2() {
        this(null);
    }

    public final void a(com.plaid.link.event.LinkEvent linkEvent, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkEvent, "");
        com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
        com.plaid.link.event.LinkEventName eventName = linkEvent.getEventName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("putting: ");
        sb.append(eventName);
        sb.append(" for ");
        sb.append(i);
        com.plaid.internal.C0452a6.a.a(sb.toString(), true);
        this.f5748a.put((java.util.concurrent.DelayQueue<com.plaid.internal.DelayedC0689y0>) new com.plaid.internal.DelayedC0689y0(linkEvent, i));
    }

    public final void b(kotlin.jvm.functions.Function1<? super com.plaid.link.event.LinkEvent, kotlin.Unit> function1) {
        synchronized (this.b) {
            java.util.List<com.plaid.link.event.LinkEvent> list = this.b;
            com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
            int size = list.size();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("flushing ");
            sb.append(size);
            sb.append(" events");
            com.plaid.internal.C0452a6.a.a(sb.toString(), true);
            for (com.plaid.link.event.LinkEvent linkEvent : list) {
                if (function1 != null) {
                    function1.invoke(linkEvent);
                } else {
                    a(linkEvent, -1);
                }
            }
            list.clear();
        }
    }

    public A2(java.lang.Object obj) {
        java.util.concurrent.DelayQueue<com.plaid.internal.DelayedC0689y0> delayQueue = new java.util.concurrent.DelayQueue<>();
        java.util.List<com.plaid.link.event.LinkEvent> synchronizedList = java.util.Collections.synchronizedList(new java.util.ArrayList());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(synchronizedList, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delayQueue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(synchronizedList, "");
        this.f5748a = delayQueue;
        this.b = synchronizedList;
    }

    public final void a(kotlin.jvm.functions.Function1<? super com.plaid.link.event.LinkEvent, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        b(function1);
        java.lang.Object[] array = this.f5748a.toArray();
        this.f5748a.clear();
        kotlin.jvm.internal.Intrinsics.checkNotNull(array);
        kotlin.collections.ArraysKt.sort(array);
        com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
        int length = array.length;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("draining: ");
        sb.append(length);
        sb.append(" events");
        com.plaid.internal.C0452a6.a.a(sb.toString(), true);
        for (java.lang.Object obj : array) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            function1.invoke(((com.plaid.internal.DelayedC0689y0) obj).a());
        }
    }

    public final void a(com.plaid.link.event.LinkEvent linkEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkEvent, "");
        synchronized (this.b) {
            com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
            com.plaid.link.event.LinkEventName eventName = linkEvent.getEventName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("enqueueing: ");
            sb.append(eventName);
            com.plaid.internal.C0452a6.a.a(aVar, sb.toString(), new java.lang.Object[]{""});
            this.b.add(linkEvent);
        }
    }
}
