package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.internal.publisher.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4793h {
    public static final String a(Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j> function0) {
        String name;
        if (function0 == null) {
            return null;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j invoke = function0.invoke();
        if (invoke != null && (name = invoke.name()) != null) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase != null) {
                return lowerCase;
            }
        }
        String lowerCase2 = "UNKNOWN".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        return lowerCase2;
    }

    public static final CountEvent a(CountEvent countEvent, Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j> function0) {
        CountEvent withTag;
        Intrinsics.checkNotNullParameter(countEvent, "<this>");
        String a2 = a(function0);
        return (a2 == null || (withTag = countEvent.withTag(com.moloco.sdk.internal.client_metrics_data.d.h.c(), a2)) == null) ? countEvent : withTag;
    }

    public static final TimerEvent a(TimerEvent timerEvent, Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j> function0) {
        TimerEvent withTag;
        Intrinsics.checkNotNullParameter(timerEvent, "<this>");
        String a2 = a(function0);
        return (a2 == null || (withTag = timerEvent.withTag(com.moloco.sdk.internal.client_metrics_data.d.h.c(), a2)) == null) ? timerEvent : withTag;
    }
}
