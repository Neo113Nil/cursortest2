package com.inmobi.media;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.u5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4124u5 extends Ca {
    public final StackTraceElement[] g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4124u5(Thread thread, Throwable error) {
        super("crashReporting", "CrashEvent", AbstractC4143un.a(thread, error));
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(error, "error");
        this.g = error.getStackTrace();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4124u5(String str) {
        super(eventId, "crashReporting", "CatchEvent", str);
        String eventId = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(eventId, "toString(...)");
        Intrinsics.checkNotNullParameter("crashReporting", "component");
        Intrinsics.checkNotNullParameter("CatchEvent", "eventType");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
    }
}
