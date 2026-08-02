package com.zettle.sdk.core.payment;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/zettle/sdk/core/payment/MagnesModule;", "Lcom/zettle/sdk/core/Module;", "", "getPaypalClientMetaDataId", "()Ljava/lang/String;", "paypalClientMetaDataId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface MagnesModule extends com.zettle.sdk.core.Module {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.payment.MagnesModule.Companion INSTANCE = com.zettle.sdk.core.payment.MagnesModule.Companion.getHighSpeedVideoFpsRangesFor;

    java.lang.String getPaypalClientMetaDataId();

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void start(com.zettle.sdk.core.payment.MagnesModule magnesModule) {
            com.zettle.sdk.core.Module.DefaultImpls.start(magnesModule);
        }

        public static void stop(com.zettle.sdk.core.payment.MagnesModule magnesModule) {
            com.zettle.sdk.core.Module.DefaultImpls.stop(magnesModule);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/core/payment/MagnesModule$Companion;", "", "<init>", "()V", "Ljava/lang/Class;", "Lcom/zettle/sdk/core/payment/MagnesModule;", "TYPE", "Ljava/lang/Class;", "getTYPE$core_publicRelease", "()Ljava/lang/Class;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.core.payment.MagnesModule.Companion getHighSpeedVideoFpsRangesFor = new com.zettle.sdk.core.payment.MagnesModule.Companion();
        private static final java.lang.Class<com.zettle.sdk.core.payment.MagnesModule> TYPE = com.zettle.sdk.core.payment.MagnesModule.class;

        private Companion() {
        }

        public final java.lang.Class<com.zettle.sdk.core.payment.MagnesModule> getTYPE$core_publicRelease() {
            return TYPE;
        }
    }
}
