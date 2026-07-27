package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.n0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3922n0 {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f7256a;
    public final C4036r1 b;
    public final C3639d0 c;

    public C3922n0(CoroutineScope coroutineScope, C4036r1 adManagerContext, C3639d0 adLifecycleData) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(adManagerContext, "adManagerContext");
        Intrinsics.checkNotNullParameter(adLifecycleData, "adLifecycleData");
        this.f7256a = coroutineScope;
        this.b = adManagerContext;
        this.c = adLifecycleData;
    }
}
