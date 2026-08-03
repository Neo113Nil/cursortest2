package com.inmobi.media;

/* renamed from: com.inmobi.media.m0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2576m0 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.CoroutineScope f5324a;
    public final com.inmobi.media.C2657p1 b;
    public final com.inmobi.media.C2313c0 c;

    public C2576m0(kotlinx.coroutines.CoroutineScope coroutineScope, com.inmobi.media.C2657p1 adManagerContext, com.inmobi.media.C2313c0 adLifecycleData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adManagerContext, "adManagerContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLifecycleData, "adLifecycleData");
        this.f5324a = coroutineScope;
        this.b = adManagerContext;
        this.c = adLifecycleData;
    }
}
