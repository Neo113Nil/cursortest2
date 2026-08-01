package com.inmobi.media;

import io.ktor.sse.ServerSentEventKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.rm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4057rm extends F2 {
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4057rm(String eventType, String str, String eventSource) {
        super(eventType, str);
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventSource, "eventSource");
        this.e = eventSource;
    }

    public final String toString() {
        return this.f6546a + ServerSentEventKt.SPACE;
    }
}
