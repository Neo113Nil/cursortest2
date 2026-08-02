package com.plaid.internal;

/* renamed from: com.plaid.internal.h, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0536h<T> {

    /* renamed from: a, reason: collision with root package name */
    public volatile T f6423a;
    public volatile java.lang.Exception b;
    public final java.util.concurrent.CountDownLatch c = new java.util.concurrent.CountDownLatch(1);

    public static <T> com.plaid.internal.C0536h<T> a(T t) {
        com.plaid.internal.C0536h<T> c0536h = new com.plaid.internal.C0536h<>();
        synchronized (c0536h.c) {
            if (c0536h.c.getCount() > 0) {
                c0536h.f6423a = t;
                c0536h.c.countDown();
            }
        }
        return c0536h;
    }

    public static <T> com.plaid.internal.C0536h<T> a(java.lang.Exception exc) {
        com.plaid.internal.C0536h<T> c0536h = new com.plaid.internal.C0536h<>();
        synchronized (c0536h.c) {
            if (c0536h.c.getCount() > 0) {
                c0536h.b = exc;
                c0536h.c.countDown();
            }
        }
        return c0536h;
    }

    public final T a() {
        this.c.await();
        if (this.b == null) {
            return this.f6423a;
        }
        throw new java.util.concurrent.ExecutionException(this.b);
    }
}
