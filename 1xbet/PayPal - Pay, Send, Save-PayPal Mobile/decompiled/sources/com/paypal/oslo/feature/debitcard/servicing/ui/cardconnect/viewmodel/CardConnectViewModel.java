package com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 -2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002.-B5\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001d0\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010\"\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0015\u0010(\u001a\u00020*8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b+\u0010,"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/viewmodel/CardConnectViewModel;", "Lcom/paypal/oslo/feature/debitcard/shared/base/MviViewModel;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEffect;", "Lcom/paypal/oslo/feature/cardconnect/api/CardConnectApi;", "cardConnectApi", "Lcom/paypal/oslo/core/remoteconfig/config/RemoteConfigConfig;", "remoteConfigConfig", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "cardProduct", "", "instrumentId", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/cardconnect/api/CardConnectApi;Lcom/paypal/oslo/core/remoteconfig/config/RemoteConfigConfig;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectReducer;)V", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSession;", "session", "", "launchKnotSdk", "(Landroid/content/Context;Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSession;)V", "initialState", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectState;", "stateStoreName", "()Ljava/lang/String;", "", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "middlewares", "()Ljava/util/List;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/cardconnect/api/CardConnectApi;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/remoteconfig/config/RemoteConfigConfig;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getCardProduct", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectSideEffectsMiddleware;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Lazy;", "Companion", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CardConnectViewModel extends com.paypal.oslo.feature.debitcard.shared.base.MviViewModel<com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState, com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent, com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEffect> {

    @java.lang.Deprecated
    public static final java.lang.String SOURCE_DEBIT_CARD_MANAGEMENT = "debit_card_management";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName cardProduct;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.cardconnect.api.CardConnectApi getHighSpeedVideoSizes;
    private static final com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel.Companion Companion = new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel.Companion(null);
    public static final int $stable = 8;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/viewmodel/CardConnectViewModel$Factory;", "", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "cardProduct", "", "instrumentId", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/viewmodel/CardConnectViewModel;", "create", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/viewmodel/CardConnectViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel create(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName cardProduct, @dagger.assisted.Assisted("instrumentId") java.lang.String instrumentId);
    }

    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getCardProduct() {
        return this.cardProduct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @dagger.assisted.AssistedInject
    public CardConnectViewModel(com.paypal.oslo.feature.cardconnect.api.CardConnectApi cardConnectApi, com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig remoteConfigConfig, @dagger.assisted.Assisted com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, @dagger.assisted.Assisted("instrumentId") java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectReducer cardConnectReducer) {
        super(cardConnectReducer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardConnectApi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteConfigConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardConnectReducer, "");
        this.getHighSpeedVideoSizes = cardConnectApi;
        this.getHighResolutionOutputSizeshNQ4ISI = remoteConfigConfig;
        this.cardProduct = debitCardProductName;
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel.$r8$lambda$YtkqH95257CozC4GUmB4gCbgNKs(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel.this);
            }
        });
        processEvent(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.CreateSessionLoading.INSTANCE);
    }

    public final void launchKnotSdk(android.content.Context context, com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession session) {
        com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment cardConnectEnvironment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "");
        java.lang.String clientId = session.getClientId();
        java.lang.String sessionId = session.getSessionId();
        if (this.getHighResolutionOutputSizeshNQ4ISI.getEnvironment() instanceof com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment.Production) {
            cardConnectEnvironment = com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment.PRODUCTION;
        } else {
            cardConnectEnvironment = com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment.STAGE;
        }
        com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment cardConnectEnvironment2 = cardConnectEnvironment;
        java.util.List<com.paypal.oslo.feature.cardconnect.api.models.CardConnectMerchant> merchants = session.getMerchants();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = merchants.iterator();
        while (it.hasNext()) {
            java.lang.String id = ((com.paypal.oslo.feature.cardconnect.api.models.CardConnectMerchant) it.next()).getId();
            java.lang.Integer intOrNull = id != null ? kotlin.text.StringsKt.toIntOrNull(id) : null;
            if (intOrNull != null) {
                arrayList.add(intOrNull);
            }
        }
        com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKConfiguration cardConnectSDKConfiguration = new com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKConfiguration("debit_card_management", clientId, sessionId, arrayList, cardConnectEnvironment2, false, false, null, null, null, 992, null);
        processEvent(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkLaunched.INSTANCE);
        this.getHighSpeedVideoSizes.launchKnotSdk(context, cardConnectSDKConfiguration, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel.$r8$lambda$9RgK3z8MEKD5f9lW6_CPbWzCEss(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel.this, (com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState initialState() {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.Loading(0, 1, null);
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.lang.String stateStoreName() {
        return "CardConnectViewModel.store";
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/viewmodel/CardConnectViewModel$Companion;", "", "<init>", "()V", "", "SOURCE_DEBIT_CARD_MANAGEMENT", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9RgK3z8MEKD5f9lW6_CPbWzCEss(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel cardConnectViewModel, com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent cardConnectSDKEvent) {
        java.util.LinkedHashMap linkedHashMap;
        com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkEvent knotSdkEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardConnectSDKEvent, "");
        if (cardConnectSDKEvent instanceof com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Success) {
            knotSdkEvent = new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkSuccess(((com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Success) cardConnectSDKEvent).getMerchantId());
        } else if (cardConnectSDKEvent instanceof com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Error) {
            com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Error error = (com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Error) cardConnectSDKEvent;
            knotSdkEvent = new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkError(error.getErrorCode(), error.getErrorDescription());
        } else if (cardConnectSDKEvent instanceof com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Exit) {
            knotSdkEvent = com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkExit.INSTANCE;
        } else {
            if (!(cardConnectSDKEvent instanceof com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.KnotEvent)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.KnotEvent knotEvent = (com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.KnotEvent) cardConnectSDKEvent;
            java.lang.String event = knotEvent.getEvent();
            java.lang.String merchantName = knotEvent.getMerchantName();
            java.lang.String merchantId = knotEvent.getMerchantId();
            java.lang.String taskId = knotEvent.getTaskId();
            java.util.Map<java.lang.String, java.lang.Object> metaData = knotEvent.getMetaData();
            if (metaData != null) {
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(metaData.size()));
                java.util.Iterator<T> it = metaData.entrySet().iterator();
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    linkedHashMap2.put(entry.getKey(), entry.getValue().toString());
                }
                linkedHashMap = linkedHashMap2;
            } else {
                linkedHashMap = null;
            }
            knotSdkEvent = new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkEvent(event, merchantName, merchantId, taskId, linkedHashMap);
        }
        cardConnectViewModel.processEvent(knotSdkEvent);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectSideEffectsMiddleware $r8$lambda$YtkqH95257CozC4GUmB4gCbgNKs(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel cardConnectViewModel) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectSideEffectsMiddleware(cardConnectViewModel.getHighSpeedVideoSizes, cardConnectViewModel.cardProduct.name(), cardConnectViewModel.getHighSpeedVideoFpsRanges);
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.util.List<com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState, com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent>> middlewares() {
        return kotlin.collections.CollectionsKt.listOf((com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectSideEffectsMiddleware) this.Camera2StreamConfigurationMap.getValue());
    }
}
