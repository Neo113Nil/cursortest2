package com.ironsource;

/* loaded from: classes5.dex */
public final class S7 implements com.ironsource.P1 {
    @Override // com.ironsource.P1
    public void a(com.ironsource.InterfaceC3097ia observer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "observer");
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        com.ironsource.lifecycle.b.d().a(observer);
    }

    @Override // com.ironsource.P1
    public void b(com.ironsource.InterfaceC3097ia observer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "observer");
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        com.ironsource.lifecycle.b.d().b(observer);
    }
}
