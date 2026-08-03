package com.inmobi.media;

/* renamed from: com.inmobi.media.nn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2627nn {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.CoroutineScope f5362a;
    public final com.inmobi.media.C2555l5 b;
    public final com.inmobi.media.Zn c;
    public final kotlin.Lazy d;

    public C2627nn(kotlinx.coroutines.CoroutineScope coroutineScope, com.inmobi.media.C2555l5 trackingView, com.inmobi.media.Zn config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackingView, "trackingView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        this.f5362a = coroutineScope;
        this.b = trackingView;
        this.c = config;
        this.d = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.nn$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.C2627nn.a(com.inmobi.media.C2627nn.this);
            }
        });
    }

    public static final com.inmobi.media.Fg a(com.inmobi.media.C2627nn c2627nn) {
        com.inmobi.media.Zn zn = c2627nn.c;
        return new com.inmobi.media.Fg(c2627nn.f5362a, new com.inmobi.media.Hg(c2627nn.c.b), new com.inmobi.media.C2311bo(new com.inmobi.media.C2285ao(zn.f5090a, zn.c), new com.inmobi.media.C2727rj(c2627nn.b, kotlin.collections.CollectionsKt.emptyList())));
    }
}
