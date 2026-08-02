package com.discover.mpos.sdk.module;

import com.discover.mpos.sdk.card.connectors.NfcConnector.a;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 #2\u00020\u0001:\u0002\"#B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010\u001f\u001a\u00020\u000bH\u0002J\b\u0010 \u001a\u00020!H\u0016R'\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/discover/mpos/sdk/module/CardReaderModule;", "Lcom/discover/mpos/sdk/core/initialization/MPosModule;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lcom/discover/mpos/sdk/config/MPosConfiguration;", "application", "Landroid/app/Application;", "initializer", "Lcom/discover/mpos/sdk/initialization/CustomInitializer;", "(Lcom/discover/mpos/sdk/config/MPosConfiguration;Landroid/app/Application;Lcom/discover/mpos/sdk/initialization/CustomInitializer;)V", "availableKernels", "", "", "Lcom/discover/mpos/sdk/cardreader/kernel/Kernel;", "getAvailableKernels", "()Ljava/util/Map;", "availableKernels$delegate", "Lkotlin/Lazy;", "cardReader", "Lcom/discover/mpos/sdk/cardreader/CardReader;", "getCardReader", "()Lcom/discover/mpos/sdk/cardreader/CardReader;", "setCardReader", "(Lcom/discover/mpos/sdk/cardreader/CardReader;)V", "discoverKernelId", "readerInitializer", "Lcom/discover/mpos/sdk/initialization/MPosInitializer;", "builtInConnectors", "Lcom/discover/mpos/sdk/card/connectors/ConnectorType;", "Lcom/discover/mpos/sdk/card/connectors/CardConnector;", "createKernels", "Lcom/discover/mpos/sdk/cardreader/entrypoint/model/Combination;", "debugTag", "init", "", "AppLifecycleListener", "Companion", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class CardReaderModule implements com.discover.mpos.sdk.core.initialization.MPosModule {
    private static com.discover.mpos.sdk.card.connectors.NfcConnector nfcConnector;

    /* renamed from: availableKernels$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy availableKernels;
    public com.discover.mpos.sdk.cardreader.CardReader cardReader;
    private final com.discover.mpos.sdk.config.MPosConfiguration configuration;
    private final java.lang.String discoverKernelId;
    private final com.discover.mpos.sdk.initialization.MPosInitializer readerInitializer;

    public CardReaderModule(com.discover.mpos.sdk.config.MPosConfiguration mPosConfiguration, android.app.Application application, com.discover.mpos.sdk.initialization.CustomInitializer customInitializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mPosConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customInitializer, "");
        this.configuration = mPosConfiguration;
        this.discoverKernelId = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_KERNEL_ID_DISCOVER;
        this.availableKernels = com.discover.mpos.sdk.core.extensions.UtilExtensionsKt.unsafeLazy(new com.discover.mpos.sdk.module.CardReaderModule.c());
        com.discover.mpos.sdk.core.debug.logger.PrettifiedGson prettifiedGson = com.discover.mpos.sdk.core.debug.logger.PrettifiedGson.INSTANCE;
        prettifiedGson.registerTypeAdapter(com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers.class, new com.discover.mpos.sdk.logger.TtqGsonAdapter());
        prettifiedGson.registerTypeAdapter(com.discover.mpos.sdk.cardreader.config.TerminalCapabilitiesQualifiers.class, new com.discover.mpos.sdk.logger.TcqGsonAdapter());
        prettifiedGson.registerTypeAdapter(com.discover.mpos.sdk.transaction.processing.terminalverificationresults.TerminalVerificationResults.class, new com.discover.mpos.sdk.logger.TvrGsonAdapter());
        prettifiedGson.registerTypeAdapter(com.discover.mpos.sdk.transaction.processing.transactionstatusinformation.TransactionStatusInformation.class, new com.discover.mpos.sdk.logger.TsiGsonAdapter());
        prettifiedGson.registerTypeAdapter(com.discover.mpos.sdk.transaction.outcome.CardholderVerificationMethod.class, new com.discover.mpos.sdk.logger.CvmGsonAdapter());
        prettifiedGson.registerTypeAdapter(com.discover.mpos.sdk.core.data.Amount.class, new com.discover.mpos.sdk.logger.AmountTypeAdapter());
        java.util.Map<com.discover.mpos.sdk.cardreader.entrypoint.model.Combination, com.discover.mpos.sdk.cardreader.kernel.Kernel> createKernels = createKernels(mPosConfiguration);
        java.util.Map<com.discover.mpos.sdk.card.connectors.ConnectorType, com.discover.mpos.sdk.card.connectors.CardConnector> connectors = customInitializer.getConnectors();
        this.readerInitializer = new com.discover.mpos.sdk.initialization.MPosInitializer(new com.discover.mpos.sdk.cardreader.MPosReaderInitializer(createKernels, connectors == null ? builtInConnectors(application) : connectors, new com.discover.mpos.sdk.security.unpredictablenumber.UnpredictableNumber(new com.discover.mpos.sdk.security.storage.MPosDataStorage(application), customInitializer.getRandomNumberGenerator())));
    }

    public final com.discover.mpos.sdk.cardreader.CardReader getCardReader() {
        com.discover.mpos.sdk.cardreader.CardReader cardReader = this.cardReader;
        if (cardReader == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return cardReader;
    }

    public final void setCardReader(com.discover.mpos.sdk.cardreader.CardReader cardReader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardReader, "");
        this.cardReader = cardReader;
    }

    @Override // com.discover.mpos.sdk.core.initialization.MPosModule
    public final void init() {
        com.discover.mpos.sdk.initialization.MPosInitializer mPosInitializer = this.readerInitializer;
        com.discover.mpos.sdk.cardreader.config.ReaderConfiguration readerConfiguration = this.configuration.getReaderConfiguration();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readerConfiguration, "");
        com.discover.mpos.sdk.cardreader.ReaderInitializer readerInitializer = mPosInitializer.f3220a;
        for (java.util.Map.Entry<com.discover.mpos.sdk.card.connectors.ConnectorType, com.discover.mpos.sdk.card.connectors.CardConnector> entry : readerInitializer.e().entrySet()) {
            com.discover.mpos.sdk.card.connectors.ConnectorHub d = readerInitializer.getD();
            com.discover.mpos.sdk.card.connectors.ConnectorType key = entry.getKey();
            com.discover.mpos.sdk.card.connectors.CardConnector value = entry.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            d.f2977a.put(key, value);
        }
        for (java.util.Map.Entry<com.discover.mpos.sdk.cardreader.entrypoint.model.Combination, com.discover.mpos.sdk.cardreader.kernel.Kernel> entry2 : readerInitializer.c().entrySet()) {
            readerInitializer.getF2982a().a(entry2.getKey(), entry2.getValue());
        }
        new java.lang.Object[]{readerConfiguration};
        this.cardReader = new com.discover.mpos.sdk.cardreader.DPasCardReader(readerInitializer.getF2982a(), readerInitializer.getB(), readerConfiguration, readerInitializer.getD(), readerInitializer.getF());
        new java.lang.Object[]{this.configuration};
    }

    private final java.util.Map<com.discover.mpos.sdk.cardreader.entrypoint.model.Combination, com.discover.mpos.sdk.cardreader.kernel.Kernel> createKernels(com.discover.mpos.sdk.config.MPosConfiguration configuration) {
        new java.lang.Object[]{getAvailableKernels()};
        java.util.List<com.discover.mpos.sdk.cardreader.config.TransactionTypeConfiguration> transactionTypeConfigurations = configuration.getReaderConfiguration().getTransactionTypeConfigurations();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = transactionTypeConfigurations.iterator();
        while (it.hasNext()) {
            java.util.List<com.discover.mpos.sdk.cardreader.config.CombinationConfiguration> combinationConfigurations = ((com.discover.mpos.sdk.cardreader.config.TransactionTypeConfiguration) it.next()).getCombinationConfigurations();
            new java.lang.Object[]{combinationConfigurations};
            kotlin.collections.CollectionsKt.addAll(arrayList, combinationConfigurations);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (getAvailableKernels().containsKey(((com.discover.mpos.sdk.cardreader.config.CombinationConfiguration) obj).getKernelId())) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList<com.discover.mpos.sdk.cardreader.config.CombinationConfiguration> arrayList3 = arrayList2;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        for (com.discover.mpos.sdk.cardreader.config.CombinationConfiguration combinationConfiguration : arrayList3) {
            kotlin.Pair pair = kotlin.TuplesKt.to(new com.discover.mpos.sdk.cardreader.entrypoint.model.Combination(combinationConfiguration.getKernelId(), combinationConfiguration.getApplicationIdentifier()), kotlin.collections.MapsKt.getValue(getAvailableKernels(), combinationConfiguration.getKernelId()));
            new java.lang.Object[]{pair.getFirst()};
            arrayList4.add(pair);
        }
        return kotlin.collections.MapsKt.toMap(arrayList4);
    }

    private final java.util.Map<com.discover.mpos.sdk.card.connectors.ConnectorType, com.discover.mpos.sdk.card.connectors.CardConnector> builtInConnectors(android.app.Application application) {
        if (nfcConnector == null) {
            nfcConnector = new com.discover.mpos.sdk.card.connectors.NfcConnector();
            application.registerActivityLifecycleCallbacks(new com.discover.mpos.sdk.module.CardReaderModule.a());
        }
        com.discover.mpos.sdk.card.connectors.ConnectorType connectorType = com.discover.mpos.sdk.card.connectors.ConnectorType.NFC;
        com.discover.mpos.sdk.card.connectors.NfcConnector nfcConnector2 = nfcConnector;
        kotlin.jvm.internal.Intrinsics.checkNotNull(nfcConnector2);
        return kotlin.collections.MapsKt.mapOf(new kotlin.Pair(connectorType, nfcConnector2));
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0010"}, d2 = {"Lcom/discover/mpos/sdk/module/CardReaderModule$AppLifecycleListener;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "(Lcom/discover/mpos/sdk/module/CardReaderModule;)V", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
    final class a implements android.app.Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            if (com.discover.mpos.sdk.module.CardReaderModule.nfcConnector != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
                android.nfc.NfcAdapter.getDefaultAdapter(activity).disableReaderMode(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            com.discover.mpos.sdk.card.connectors.NfcConnector nfcConnector = com.discover.mpos.sdk.module.CardReaderModule.nfcConnector;
            if (nfcConnector != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
                android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(activity);
                if (defaultAdapter != null) {
                    defaultAdapter.enableReaderMode(activity, nfcConnector.new a(), 131, null);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(android.app.Activity activity, android.os.Bundle savedInstanceState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        }
    }

    private final java.lang.String debugTag() {
        return "CardReaderModule";
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/discover/mpos/sdk/cardreader/kernel/Kernel;", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.util.Map<java.lang.String, ? extends com.discover.mpos.sdk.cardreader.kernel.Kernel>> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ java.util.Map<java.lang.String, ? extends com.discover.mpos.sdk.cardreader.kernel.Kernel> invoke() {
            return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.discover.mpos.sdk.module.CardReaderModule.this.discoverKernelId, new com.discover.mpos.sdk.cardreader.kernel.DPasClKernel()));
        }

        c() {
            super(0);
        }
    }

    private final java.util.Map<java.lang.String, com.discover.mpos.sdk.cardreader.kernel.Kernel> getAvailableKernels() {
        return (java.util.Map) this.availableKernels.getValue();
    }
}
