package com.moloco.sdk.internal.publisher;

/* renamed from: com.moloco.sdk.internal.publisher.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3424h {
    public static final java.lang.String a(kotlin.jvm.functions.Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> function0) {
        java.lang.String name;
        if (function0 == null) {
            return null;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i invoke = function0.invoke();
        if (invoke != null && (name = invoke.name()) != null) {
            java.lang.String lowerCase = name.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase != null) {
                return lowerCase;
            }
        }
        java.lang.String lowerCase2 = "UNKNOWN".toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        return lowerCase2;
    }

    public static final com.moloco.sdk.acm.CountEvent a(com.moloco.sdk.acm.CountEvent countEvent, kotlin.jvm.functions.Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> function0) {
        com.moloco.sdk.acm.CountEvent withTag;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countEvent, "<this>");
        java.lang.String a2 = a(function0);
        return (a2 == null || (withTag = countEvent.withTag(com.moloco.sdk.internal.client_metrics_data.d.h.c(), a2)) == null) ? countEvent : withTag;
    }

    public static final com.moloco.sdk.acm.TimerEvent a(com.moloco.sdk.acm.TimerEvent timerEvent, kotlin.jvm.functions.Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> function0) {
        com.moloco.sdk.acm.TimerEvent withTag;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timerEvent, "<this>");
        java.lang.String a2 = a(function0);
        return (a2 == null || (withTag = timerEvent.withTag(com.moloco.sdk.internal.client_metrics_data.d.h.c(), a2)) == null) ? timerEvent : withTag;
    }
}
