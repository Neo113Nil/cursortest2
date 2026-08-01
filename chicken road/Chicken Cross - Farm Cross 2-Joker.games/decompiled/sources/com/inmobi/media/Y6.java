package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes6.dex */
public final class Y6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6966a;
    public final CoroutineScope b;
    public final MutableSharedFlow c;
    public final Z9 d;

    public Y6(Context context, CoroutineScope coroutineScope, MutableSharedFlow mediaEventFlow, Z9 z9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(mediaEventFlow, "mediaEventFlow");
        this.f6966a = context;
        this.b = coroutineScope;
        this.c = mediaEventFlow;
        this.d = z9;
    }
}
