package com.inmobi.media;

import io.ktor.sse.ServerSentEventKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.y1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4229y1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7490a = "y1";
    public String b;
    public Boolean c;

    public C4229y1() {
        Intrinsics.checkNotNullExpressionValue("y1", "TAG");
    }

    public final void a(boolean z) {
        String TAG = this.f7490a;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        String str = "setLimitAdTracking " + this.c + ServerSentEventKt.SPACE + z;
        this.c = Boolean.valueOf(z);
    }
}
