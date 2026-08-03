package com.inmobi.media;

/* renamed from: com.inmobi.media.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2867x implements com.inmobi.media.A8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2631o1 f5538a;
    public final com.inmobi.media.G b;

    public C2867x(com.inmobi.media.C2631o1 adManagerComponent, com.inmobi.media.G adContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adContext, "adContext");
        this.f5538a = adManagerComponent;
        this.b = adContext;
    }

    @Override // com.inmobi.media.A8
    public final kotlinx.coroutines.CoroutineScope a() {
        return this.f5538a.e;
    }

    @Override // com.inmobi.media.A8
    public final com.inmobi.media.C2576m0 b() {
        return this.f5538a.f;
    }

    @Override // com.inmobi.media.A8
    public final com.inmobi.media.InterfaceC2772t9 c() {
        return this.f5538a.c;
    }
}
