package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class T1 extends Ca {
    public final int g;
    public final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T1(String str, int i, String trace) {
        super("AppExitReasonReporting", "AppExitReasonEvent", AbstractC4143un.a("reason - " + i + " description - " + (str == null ? "ApplicationExit" : str), trace));
        Intrinsics.checkNotNullParameter(trace, "trace");
        this.g = i;
        this.h = trace;
    }
}
