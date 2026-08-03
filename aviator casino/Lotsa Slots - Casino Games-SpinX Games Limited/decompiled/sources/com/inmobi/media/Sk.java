package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Sk extends com.inmobi.media.A6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sk(com.inmobi.media.Mc nativeAdUnitComponent, com.inmobi.media.AbstractC2367e1 adSessionManager) {
        super(nativeAdUnitComponent, adSessionManager);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
    }

    @Override // com.inmobi.media.A6
    public final java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.F6();
    }
}
