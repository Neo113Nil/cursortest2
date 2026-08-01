package com.inmobi.media;

import io.ktor.sse.ServerSentEventKt;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public class Ca extends F2 {
    public final String e;
    public final String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ca(String eventId, String componentType, String eventType, String str) {
        super(eventType, str);
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.e = eventId;
        this.f = componentType;
    }

    public final String toString() {
        return this.f6546a + "@" + this.f + ServerSentEventKt.SPACE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Ca(String str, String str2, String str3) {
        this(r0, str, str2, str3);
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
    }
}
