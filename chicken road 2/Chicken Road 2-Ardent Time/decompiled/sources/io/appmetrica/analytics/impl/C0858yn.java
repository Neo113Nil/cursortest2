package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.yn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0858yn implements java.lang.Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f7169a = new java.util.concurrent.CopyOnWriteArrayList();

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        java.util.Iterator it = this.f7169a.iterator();
        while (it.hasNext()) {
            ((java.lang.Thread.UncaughtExceptionHandler) it.next()).uncaughtException(thread, th);
        }
    }
}
