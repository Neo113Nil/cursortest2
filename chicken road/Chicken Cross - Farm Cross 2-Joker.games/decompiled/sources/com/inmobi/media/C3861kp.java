package com.inmobi.media;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.kp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3861kp {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f7209a;
    public final I5 b;
    public final Wp c;
    public final Lazy d;

    public C3861kp(CoroutineScope coroutineScope, I5 trackingView, Wp config) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(trackingView, "trackingView");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f7209a = coroutineScope;
        this.b = trackingView;
        this.c = config;
        this.d = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.kp$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3861kp.a(C3861kp.this);
            }
        });
    }

    public static final Oh a(C3861kp c3861kp) {
        Wp wp = c3861kp.c;
        return new Oh(c3861kp.f7209a, new Qh(c3861kp.c.b), new Yp(new Xp(wp.f6939a, wp.c), new Mk(c3861kp.b, CollectionsKt.emptyList())));
    }
}
