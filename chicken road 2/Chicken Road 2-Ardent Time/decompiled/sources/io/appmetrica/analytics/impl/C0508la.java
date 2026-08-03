package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.la, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0508la implements io.appmetrica.analytics.coreapi.internal.backport.BiFunction {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.BiFunction
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0806wn apply(java.lang.Thread thread, java.lang.StackTraceElement[] stackTraceElementArr) {
        java.lang.String name = thread.getName();
        int priority = thread.getPriority();
        long id = thread.getId();
        java.lang.ThreadGroup threadGroup = thread.getThreadGroup();
        return new io.appmetrica.analytics.impl.C0806wn(name, priority, id, threadGroup != null ? threadGroup.getName() : "", java.lang.Integer.valueOf(thread.getState().ordinal()), stackTraceElementArr == null ? null : java.util.Arrays.asList(stackTraceElementArr));
    }
}
