package com.inmobi.media;

/* loaded from: classes5.dex */
public class X4 extends com.inmobi.media.X9 {
    public final java.lang.StackTraceElement[] g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X4(java.lang.Thread thread, java.lang.Throwable error) {
        super("crashReporting", "CrashEvent", com.inmobi.media.AbstractC2939zl.a(thread, error));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thread, "thread");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.g = error.getStackTrace();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public X4(java.lang.String str) {
        super(eventId, "crashReporting", "CatchEvent", str);
        java.lang.String eventId = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(eventId, "toString(...)");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("crashReporting", "component");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("CatchEvent", "eventType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventId, "eventId");
    }
}
