package com.inmobi.media;

/* loaded from: classes5.dex */
public class X9 extends com.inmobi.media.AbstractC2499j2 {
    public final java.lang.String e;
    public final java.lang.String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X9(java.lang.String eventId, java.lang.String componentType, java.lang.String eventType, java.lang.String str) {
        super(eventType, str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventId, "eventId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentType, "componentType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.e = eventId;
        this.f = componentType;
    }

    public final java.lang.String toString() {
        return this.f5268a + "@" + this.f + io.ktor.sse.ServerSentEventKt.SPACE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public X9(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this(r0, str, str2, str3);
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
    }
}
