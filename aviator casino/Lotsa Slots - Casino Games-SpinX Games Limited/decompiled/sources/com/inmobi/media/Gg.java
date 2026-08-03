package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Gg extends com.inmobi.media.AbstractC2547ko {
    public final com.inmobi.media.core.config.models.AdConfig.ViewabilityConfig l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gg(com.inmobi.media.core.config.models.AdConfig.ViewabilityConfig viewabilityConfig, byte b, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        super(new java.util.WeakHashMap(10), new android.os.Handler(android.os.Looper.getMainLooper()), b, interfaceC2772t9);
        com.inmobi.media.C2715r7 visibilityChecker = com.inmobi.media.C2797u7.k;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visibilityChecker, "visibilityChecker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visibilityChecker, "visibilityChecker");
        this.l = viewabilityConfig;
    }

    @Override // com.inmobi.media.AbstractC2547ko
    public final void d() {
        toString();
        if (this.k || this.g.get()) {
            return;
        }
        this.k = true;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.d, null, null, new com.inmobi.media.C2521jo(this, null), 3, null);
    }
}
