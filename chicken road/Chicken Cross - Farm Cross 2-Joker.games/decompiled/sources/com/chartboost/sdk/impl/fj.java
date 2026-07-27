package com.chartboost.sdk.impl;

import com.chartboost.sdk.events.ChartboostError;
import io.ktor.sse.ServerSentEventKt;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class fj {
    public static final long b(cj cjVar) {
        return cjVar.g() * 1000;
    }

    public static final String b(List list) {
        return CollectionsKt.joinToString$default(list, "; ", null, null, 0, null, new Function1() { // from class: com.chartboost.sdk.impl.fj$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fj.a((ub) obj);
            }
        }, 30, null);
    }

    public static final Void b(String str, String str2, int i) {
        mb.b(str2, (Throwable) null, 2, (Object) null);
        throw new ChartboostError.Load.VastError(str + " (VAST error " + i + ")", new kj(str, i));
    }

    public static final CharSequence a(ub mf) {
        Intrinsics.checkNotNullParameter(mf, "mf");
        String c = mf.c();
        if (c == null) {
            c = "unknown";
        }
        Integer f = mf.f();
        Integer b = mf.b();
        Integer a2 = mf.a();
        return c + ServerSentEventKt.SPACE + f + "x" + b + ServerSentEventKt.SPACE + (a2 != null ? a2.intValue() : 0) + "kbps";
    }
}
