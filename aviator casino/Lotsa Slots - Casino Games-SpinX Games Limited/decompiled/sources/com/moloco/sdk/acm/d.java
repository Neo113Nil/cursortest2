package com.moloco.sdk.acm;

/* loaded from: classes5.dex */
public final class d {
    public static final java.lang.String a(com.moloco.sdk.acm.EventTag eventTag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTag, "<this>");
        return eventTag.getKey() + kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON + eventTag.getValue();
    }
}
