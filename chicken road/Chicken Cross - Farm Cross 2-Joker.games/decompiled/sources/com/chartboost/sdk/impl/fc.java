package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import io.ktor.sse.ServerSentEventKt;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class fc {
    public static final Map a(ec ecVar) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(ecVar, "<this>");
        Mediation mediation = ecVar.getMediation();
        String str4 = "";
        if (mediation == null || (str = mediation.mediationType) == null) {
            str = "";
        }
        Pair pair = TuplesKt.to("CB_MEDIATOR_NAME", str);
        Mediation mediation2 = ecVar.getMediation();
        if (mediation2 == null || (str2 = mediation2.libraryVersion) == null) {
            str2 = "";
        }
        Pair pair2 = TuplesKt.to("CB_MEDIATOR_SDK_VERSION", str2);
        Mediation mediation3 = ecVar.getMediation();
        if (mediation3 != null && (str3 = mediation3.adapterVersion) != null) {
            str4 = str3;
        }
        return MapsKt.mapOf(pair, pair2, TuplesKt.to("CB_MEDIATOR_ADAPTER_VERSION", str4));
    }

    public static final String a(String str, String str2) {
        return (str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? (str == null || str.length() == 0) ? (str2 == null || str2.length() == 0) ? "" : str2 : str : str + ServerSentEventKt.SPACE + str2;
    }
}
