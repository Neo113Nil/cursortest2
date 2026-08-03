package com.inmobi.media;

/* renamed from: com.inmobi.media.vk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2836vk extends com.inmobi.media.AbstractC2499j2 {
    public final java.lang.String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2836vk(java.lang.String eventType, java.lang.String str, java.lang.String eventSource) {
        super(eventType, str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventSource, "eventSource");
        this.e = eventSource;
    }

    public final java.lang.String toString() {
        return this.f5268a + io.ktor.sse.ServerSentEventKt.SPACE;
    }
}
