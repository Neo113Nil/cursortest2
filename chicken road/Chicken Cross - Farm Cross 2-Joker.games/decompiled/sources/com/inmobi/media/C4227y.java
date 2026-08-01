package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4227y implements InterfaceC3620c9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4008q1 f7489a;
    public final H b;

    public C4227y(C4008q1 adManagerComponent, H adContext) {
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(adContext, "adContext");
        this.f7489a = adManagerComponent;
        this.b = adContext;
    }

    @Override // com.inmobi.media.InterfaceC3620c9
    public final CoroutineScope a() {
        return this.f7489a.e;
    }

    @Override // com.inmobi.media.InterfaceC3620c9
    public final C3922n0 b() {
        return this.f7489a.f;
    }

    @Override // com.inmobi.media.InterfaceC3620c9
    public final Y9 c() {
        return this.f7489a.c;
    }
}
