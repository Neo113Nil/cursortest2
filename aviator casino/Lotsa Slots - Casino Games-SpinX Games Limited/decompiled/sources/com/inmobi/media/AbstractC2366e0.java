package com.inmobi.media;

/* renamed from: com.inmobi.media.e0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2366e0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2657p1 f5166a;
    public final kotlinx.coroutines.CoroutineScope b;
    public final com.inmobi.media.core.config.models.AdConfig c;
    public final com.inmobi.media.Sg d;
    public final com.inmobi.media.C2799u9 e;
    public final com.inmobi.media.C2313c0 f;
    public final com.inmobi.media.C2576m0 g;

    public AbstractC2366e0(com.inmobi.media.C2631o1 adManagerComponent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adManagerComponent.b.getApplicationContext(), "getApplicationContext(...)");
        com.inmobi.media.C2657p1 c2657p1 = adManagerComponent.f5364a;
        this.f5166a = c2657p1;
        this.b = adManagerComponent.e;
        this.c = c2657p1.b;
        this.d = c2657p1.f5382a;
        this.e = adManagerComponent.c;
        this.f = adManagerComponent.d;
        this.g = adManagerComponent.f;
    }
}
