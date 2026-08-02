package com.plaid.internal;

/* renamed from: com.plaid.internal.y0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class DelayedC0689y0 implements java.util.concurrent.Delayed {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.link.event.LinkEvent f6625a;
    public final long b;

    public DelayedC0689y0(com.plaid.link.event.LinkEvent linkEvent, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkEvent, "");
        this.f6625a = linkEvent;
        this.b = java.lang.System.currentTimeMillis() + i;
    }

    public final com.plaid.link.event.LinkEvent a() {
        return this.f6625a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.util.concurrent.Delayed delayed) {
        java.util.concurrent.Delayed delayed2 = delayed;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delayed2, "");
        return kotlin.jvm.internal.Intrinsics.compare(this.b, ((com.plaid.internal.DelayedC0689y0) delayed2).b);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(java.util.concurrent.TimeUnit timeUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
        return timeUnit.convert(this.b - java.lang.System.currentTimeMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
    }
}
