package com.ironsource;

/* renamed from: com.ironsource.tg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC3299tg {

    /* renamed from: com.ironsource.tg$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(com.ironsource.InterfaceC3299tg _this, boolean z, kotlin.jvm.functions.Function0 lazyError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyError, "lazyError");
            if (!z) {
                throw new com.ironsource.C3261re((com.ironsource.mediationsdk.logger.IronSourceError) lazyError.invoke());
            }
        }
    }

    void a() throws com.ironsource.C3261re;

    void a(boolean z, kotlin.jvm.functions.Function0<? extends com.ironsource.mediationsdk.logger.IronSourceError> function0);
}
