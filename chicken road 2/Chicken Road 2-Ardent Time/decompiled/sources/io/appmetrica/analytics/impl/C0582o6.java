package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.o6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0582o6 implements io.appmetrica.analytics.coreapi.internal.backport.Function {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0806wn apply(java.lang.Thread thread) {
        java.lang.String name = thread.getName();
        int priority = thread.getPriority();
        long id = thread.getId();
        java.lang.ThreadGroup threadGroup = thread.getThreadGroup();
        return new io.appmetrica.analytics.impl.C0806wn(name, priority, id, threadGroup != null ? threadGroup.getName() : "", null, null);
    }
}
