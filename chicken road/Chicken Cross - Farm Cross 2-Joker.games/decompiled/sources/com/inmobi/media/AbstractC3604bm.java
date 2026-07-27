package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.bm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3604bm {

    /* renamed from: a, reason: collision with root package name */
    public static final Lazy f7033a = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.bm$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC3604bm.a();
        }
    });

    public static final void a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        ((Handler) f7033a.getValue()).post(runnable);
    }

    public static final Handler a() {
        return new Handler(Looper.getMainLooper());
    }
}
