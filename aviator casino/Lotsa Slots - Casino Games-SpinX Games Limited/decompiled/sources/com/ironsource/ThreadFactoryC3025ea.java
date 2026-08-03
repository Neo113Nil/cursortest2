package com.ironsource;

/* renamed from: com.ironsource.ea, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class ThreadFactoryC3025ea implements java.util.concurrent.ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f6215a = new java.util.concurrent.atomic.AtomicInteger();

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable r) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r, "r");
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "%s-%d", java.util.Arrays.copyOf(new java.lang.Object[]{"IronSourceThread", java.lang.Integer.valueOf(this.f6215a.incrementAndGet())}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        return new java.lang.Thread(r, format);
    }
}
