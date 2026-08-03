package com.inmobi.media;

/* loaded from: classes5.dex */
public final class B6 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4615a;
    public final kotlinx.coroutines.CoroutineScope b;
    public final kotlinx.coroutines.flow.MutableSharedFlow c;
    public final com.inmobi.media.C2799u9 d;

    public B6(android.content.Context context, kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.flow.MutableSharedFlow mediaEventFlow, com.inmobi.media.C2799u9 c2799u9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaEventFlow, "mediaEventFlow");
        this.f4615a = context;
        this.b = coroutineScope;
        this.c = mediaEventFlow;
        this.d = c2799u9;
    }
}
