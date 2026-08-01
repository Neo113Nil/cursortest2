package com.ironsource;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ironsource.ea, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ThreadFactoryC4390ea implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f8155a = new AtomicInteger();

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable r) {
        Intrinsics.checkNotNullParameter(r, "r");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.ENGLISH, "%s-%d", Arrays.copyOf(new Object[]{"IronSourceThread", Integer.valueOf(this.f8155a.incrementAndGet())}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        return new Thread(r, format);
    }
}
