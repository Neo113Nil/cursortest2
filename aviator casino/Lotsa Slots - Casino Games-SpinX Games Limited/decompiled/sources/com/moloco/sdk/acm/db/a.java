package com.moloco.sdk.acm.db;

/* loaded from: classes5.dex */
public final class a {
    public final java.lang.String a(com.moloco.sdk.acm.db.c eventType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        return eventType.name();
    }

    public final java.util.List<java.lang.String> b(java.lang.String tagsString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tagsString, "tagsString");
        return tagsString.length() == 0 ? kotlin.collections.CollectionsKt.emptyList() : kotlin.text.StringsKt.split$default((java.lang.CharSequence) tagsString, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
    }

    public final com.moloco.sdk.acm.db.c a(java.lang.String eventType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        return com.moloco.sdk.acm.db.c.valueOf(eventType);
    }

    public final java.lang.String a(java.util.List<java.lang.String> tags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "tags");
        return kotlin.collections.CollectionsKt.joinToString$default(tags, ",", null, null, 0, null, null, 62, null);
    }
}
