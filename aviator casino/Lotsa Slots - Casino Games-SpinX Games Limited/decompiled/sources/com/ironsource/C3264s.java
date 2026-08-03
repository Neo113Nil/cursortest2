package com.ironsource;

/* renamed from: com.ironsource.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3264s implements com.ironsource.InterfaceC3076h7, com.ironsource.InterfaceC3076h7.a {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map<com.ironsource.mediationsdk.IronSource.a, java.util.concurrent.atomic.AtomicBoolean> f6585a = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO, new java.util.concurrent.atomic.AtomicBoolean(false)), kotlin.TuplesKt.to(com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL, new java.util.concurrent.atomic.AtomicBoolean(false)), kotlin.TuplesKt.to(com.ironsource.mediationsdk.IronSource.a.BANNER, new java.util.concurrent.atomic.AtomicBoolean(false)));

    @Override // com.ironsource.InterfaceC3076h7.a
    public void a(com.ironsource.mediationsdk.IronSource.a adFormat, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f6585a.get(adFormat);
        if (atomicBoolean != null) {
            atomicBoolean.set(z);
        }
    }

    @Override // com.ironsource.InterfaceC3076h7
    public boolean a(com.ironsource.mediationsdk.IronSource.a adFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f6585a.get(adFormat);
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        return false;
    }
}
