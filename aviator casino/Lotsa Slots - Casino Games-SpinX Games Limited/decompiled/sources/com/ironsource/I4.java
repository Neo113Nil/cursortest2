package com.ironsource;

/* loaded from: classes5.dex */
public final class I4<Smash extends com.ironsource.AbstractC3107j3<?>> extends com.ironsource.Wg<Smash> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I4(int i, boolean z, java.util.List<? extends Smash> waterfall) {
        super(i, z, waterfall);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfall, "waterfall");
    }

    @Override // com.ironsource.Wg
    public void c(Smash smash) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smash, "smash");
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is ready to load");
        smash.a(true);
        c().add(smash);
    }
}
