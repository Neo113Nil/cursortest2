package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.lq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3892lq extends Ca {
    public final StackTraceElement[] g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3892lq(StackTraceElement[] stackTrace) {
        super("ANRWatchDog", "ANRWatchDogEvent", AbstractC4143un.a(stackTrace));
        Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
        this.g = stackTrace;
    }
}
