package com.discover.mpos.sdk.module;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\"\u001f\u0010\u000f\u001a\u00020\n*\u00020\t8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/discover/mpos/sdk/config/MPosConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Landroid/app/Application;", "application", "Lcom/discover/mpos/sdk/initialization/CustomInitializer;", "initializer", "Lcom/discover/mpos/sdk/core/initialization/MPosModule;", "cardReaderModule", "(Lcom/discover/mpos/sdk/config/MPosConfiguration;Landroid/app/Application;Lcom/discover/mpos/sdk/initialization/CustomInitializer;)Lcom/discover/mpos/sdk/core/initialization/MPosModule;", "Lcom/discover/mpos/sdk/core/DiscoverMPos;", "Lcom/discover/mpos/sdk/cardreader/CardReader;", "cardReader$delegate", "Lcom/discover/mpos/sdk/core/data/ExtentionProp;", "getCardReader", "(Lcom/discover/mpos/sdk/core/DiscoverMPos;)Lcom/discover/mpos/sdk/cardreader/CardReader;", "cardReader"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class CardReaderModuleKt {
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.discover.mpos.sdk.module.CardReaderModuleKt.class, "cardReader", "getCardReader(Lcom/discover/mpos/sdk/core/DiscoverMPos;)Lcom/discover/mpos/sdk/cardreader/CardReader;", 1))};
    private static final com.discover.mpos.sdk.core.data.ExtentionProp cardReader$delegate = new com.discover.mpos.sdk.core.data.ExtentionProp(com.discover.mpos.sdk.module.CardReaderModuleKt.a.f3223a);

    public static final com.discover.mpos.sdk.core.initialization.MPosModule cardReaderModule(com.discover.mpos.sdk.config.MPosConfiguration mPosConfiguration, android.app.Application application, com.discover.mpos.sdk.initialization.CustomInitializer customInitializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mPosConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customInitializer, "");
        return new com.discover.mpos.sdk.module.CardReaderModule(mPosConfiguration, application, customInitializer);
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/cardreader/CardReader;", "it", "Lcom/discover/mpos/sdk/core/DiscoverMPos;", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.discover.mpos.sdk.core.DiscoverMPos, com.discover.mpos.sdk.cardreader.CardReader> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.discover.mpos.sdk.module.CardReaderModuleKt.a f3223a = new com.discover.mpos.sdk.module.CardReaderModuleKt.a();

        private static com.discover.mpos.sdk.cardreader.CardReader a(com.discover.mpos.sdk.core.DiscoverMPos discoverMPos) {
            java.lang.Object m23436constructorimpl;
            com.discover.mpos.sdk.core.initialization.MPosModule findModule;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(discoverMPos, "");
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                findModule = discoverMPos.findModule(com.discover.mpos.sdk.module.CardReaderModuleKt.a.C0060a.f3224a);
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            if (findModule == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.discover.mpos.sdk.module.CardReaderModule");
            }
            m23436constructorimpl = kotlin.Result.m23436constructorimpl((com.discover.mpos.sdk.module.CardReaderModule) findModule);
            if (kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl) == null) {
                return ((com.discover.mpos.sdk.module.CardReaderModule) m23436constructorimpl).getCardReader();
            }
            throw new kotlin.UninitializedPropertyAccessException();
        }

        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics.FEATURE_MODULE, "Lcom/discover/mpos/sdk/core/initialization/MPosModule;", "invoke"}, k = 3, mv = {1, 4, 1})
        /* renamed from: com.discover.mpos.sdk.module.CardReaderModuleKt$a$a, reason: collision with other inner class name */
        static final class C0060a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.discover.mpos.sdk.core.initialization.MPosModule, java.lang.Boolean> {

            /* renamed from: a, reason: collision with root package name */
            public static final com.discover.mpos.sdk.module.CardReaderModuleKt.a.C0060a f3224a = new com.discover.mpos.sdk.module.CardReaderModuleKt.a.C0060a();

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Boolean invoke(com.discover.mpos.sdk.core.initialization.MPosModule mPosModule) {
                com.discover.mpos.sdk.core.initialization.MPosModule mPosModule2 = mPosModule;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mPosModule2, "");
                return java.lang.Boolean.valueOf(mPosModule2 instanceof com.discover.mpos.sdk.module.CardReaderModule);
            }

            C0060a() {
                super(1);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ com.discover.mpos.sdk.cardreader.CardReader invoke(com.discover.mpos.sdk.core.DiscoverMPos discoverMPos) {
            return a(discoverMPos);
        }

        a() {
            super(1);
        }
    }

    public static final com.discover.mpos.sdk.cardreader.CardReader getCardReader(com.discover.mpos.sdk.core.DiscoverMPos discoverMPos) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(discoverMPos, "");
        return (com.discover.mpos.sdk.cardreader.CardReader) cardReader$delegate.getValue(discoverMPos, $$delegatedProperties[0]);
    }
}
