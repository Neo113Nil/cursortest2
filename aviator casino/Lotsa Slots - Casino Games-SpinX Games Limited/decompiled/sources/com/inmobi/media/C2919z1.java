package com.inmobi.media;

/* renamed from: com.inmobi.media.z1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2919z1 extends com.inmobi.media.X9 {
    public final int g;
    public final java.lang.String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2919z1(java.lang.String str, int i, java.lang.String trace) {
        super("AppExitReasonReporting", "AppExitReasonEvent", com.inmobi.media.AbstractC2939zl.a("reason - " + i + " description - " + (str == null ? "ApplicationExit" : str), trace));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trace, "trace");
        this.g = i;
        this.h = trace;
    }
}
