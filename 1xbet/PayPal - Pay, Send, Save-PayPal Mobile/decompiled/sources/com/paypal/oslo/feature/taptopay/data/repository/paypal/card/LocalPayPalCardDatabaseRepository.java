package com.paypal.oslo.feature.taptopay.data.repository.paypal.card;

@kotlin.Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0001;B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0014\u0010\u0010J,\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0\u00172\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00150\u00172\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u001c\u0010\u0010J$\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\n0\u00172\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u001e\u0010\u0010J\u001a\u0010\u001f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u001f\u0010\u0010J\u0018\u0010 \u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b \u0010\u0010J \u0010$\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0096@¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b'\u0010\u0010J\u0018\u0010(\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b(\u0010\u0010J\u0013\u0010*\u001a\u00020\u0006*\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0,*\u00020\bH\u0002¢\u0006\u0004\b-\u0010.J\u0013\u00100\u001a\u00020/*\u00020/H\u0002¢\u0006\u0004\b0\u00101J!\u00102\u001a\u0004\u0018\u00010\b*\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0,H\u0002¢\u0006\u0004\b2\u00103R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00104R\u0015\u00107\u001a\u0002058CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b-\u00106R\u0015\u0010-\u001a\u0002088CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b0\u00106R\u0015\u00100\u001a\u0002098CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b2\u00106R\u0015\u00102\u001a\u00020:8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b7\u00106"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/LocalPayPalCardDatabaseRepository;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalLocalCardDataRepository;", "Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/DeviceWalletDataBase;", com.datadog.trace.api.DDSpanTypes.COUCHBASE, "<init>", "(Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/DeviceWalletDataBase;)V", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardIdGroup;", "idGroup", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardInfo;", "cardInfo", "", "mapCardIdData", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardIdGroup;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId;", "id", "getCardIdGroup", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getCardIdGroups", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCardIdGroup", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArtCollection;", "cardArtCollection", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalSetCardArtError;", "setCardArt", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArtCollection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalGetCardArtError;", "getCardArt", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDeleteCardArtError;", "deleteCardArt", "getCardInfo", "deleteCardInfo", "", "deviceWalletServiceCardId", "termsAndConditionsText", "storeTermsAndConditions", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/TermsAndConditionsData;", "getTermsAndConditions", "deleteTermsAndConditions", "Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardIdGroupEntity;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardIdGroupEntity;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardIdGroup;", "", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardInfo;)Ljava/util/Map;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArt;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArt;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArt;", "getHighSpeedVideoFpsRangesFor", "(Ljava/util/Map;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardInfo;", "Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/DeviceWalletDataBase;", "Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardIdGroupDao;", "Lkotlin/Lazy;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardInfoDao;", "Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardArtDao;", "Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/TnCDao;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LocalPayPalCardDatabaseRepository implements com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository {

    @java.lang.Deprecated
    public static final java.lang.String KEY_DEFAULT_CARD_INFO = "DefaultCardInfo";

    @java.lang.Deprecated
    public static final java.lang.String KEY_PAY_LATER_CARD_INFO = "PayLaterCardInfo";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.Lazy Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.taptopay.data.db.card.paypal.DeviceWalletDataBase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRangesFor;
    private static final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository.Companion Companion = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository.Companion(null);
    public static final int $stable = 8;

    public LocalPayPalCardDatabaseRepository(com.paypal.oslo.feature.taptopay.data.db.card.paypal.DeviceWalletDataBase deviceWalletDataBase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceWalletDataBase, "");
        this.getHighSpeedVideoFpsRanges = deviceWalletDataBase;
        this.getHighSpeedVideoSizes = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao cardIdGroupDao$taptopay_prodRelease;
                cardIdGroupDao$taptopay_prodRelease = com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository.this.getHighSpeedVideoFpsRanges.cardIdGroupDao$taptopay_prodRelease();
                return cardIdGroupDao$taptopay_prodRelease;
            }
        });
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao cardInfoDao$taptopay_prodRelease;
                cardInfoDao$taptopay_prodRelease = com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository.this.getHighSpeedVideoFpsRanges.cardInfoDao$taptopay_prodRelease();
                return cardInfoDao$taptopay_prodRelease;
            }
        });
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtDao cardArtDao$taptopay_prodRelease;
                cardArtDao$taptopay_prodRelease = com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository.this.getHighSpeedVideoFpsRanges.cardArtDao$taptopay_prodRelease();
                return cardArtDao$taptopay_prodRelease;
            }
        });
        this.getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCDao tncDao$taptopay_prodRelease;
                tncDao$taptopay_prodRelease = com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository.this.getHighSpeedVideoFpsRanges.tncDao$taptopay_prodRelease();
                return tncDao$taptopay_prodRelease;
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/LocalPayPalCardDatabaseRepository$Companion;", "", "<init>", "()V", "", "KEY_PAY_LATER_CARD_INFO", "Ljava/lang/String;", "KEY_DEFAULT_CARD_INFO"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository
    public final java.lang.Object mapCardIdData(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withTransaction = androidx.room.RoomDatabaseKt.withTransaction(this.getHighSpeedVideoFpsRanges, new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$mapCardIdData$2(this, cardIdGroup, cardInfo, null), continuation);
        return withTransaction == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withTransaction : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        if (r9 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009b, code lost:
    
        if (r9 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c6, code lost:
    
        if (r9 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCardIdGroup(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$getCardIdGroup$1 localPayPalCardDatabaseRepository$getCardIdGroup$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$getCardIdGroup$1) {
            localPayPalCardDatabaseRepository$getCardIdGroup$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$getCardIdGroup$1) continuation;
            if ((localPayPalCardDatabaseRepository$getCardIdGroup$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                localPayPalCardDatabaseRepository$getCardIdGroup$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = localPayPalCardDatabaseRepository$getCardIdGroup$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = localPayPalCardDatabaseRepository$getCardIdGroup$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!(cardId instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId)) {
                        if (!(cardId instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId)) {
                            if (!(cardId instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao cardIdGroupDao = (com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao) this.getHighSpeedVideoSizes.getValue();
                            java.lang.String id = ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId) cardId).getId();
                            localPayPalCardDatabaseRepository$getCardIdGroup$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardId);
                            localPayPalCardDatabaseRepository$getCardIdGroup$1.Camera2StreamConfigurationMap = 3;
                            obj = cardIdGroupDao.getCardIdGroupEntityByDeviceWalletServiceCardId(id, localPayPalCardDatabaseRepository$getCardIdGroup$1);
                        } else {
                            com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao cardIdGroupDao2 = (com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao) this.getHighSpeedVideoSizes.getValue();
                            java.lang.String id2 = ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId) cardId).getId();
                            localPayPalCardDatabaseRepository$getCardIdGroup$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardId);
                            localPayPalCardDatabaseRepository$getCardIdGroup$1.Camera2StreamConfigurationMap = 2;
                            obj = cardIdGroupDao2.getCardIdGroupEntityByDigitizedCardId(id2, localPayPalCardDatabaseRepository$getCardIdGroup$1);
                        }
                    } else {
                        com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao cardIdGroupDao3 = (com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao) this.getHighSpeedVideoSizes.getValue();
                        java.lang.String id3 = ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId) cardId).getId();
                        localPayPalCardDatabaseRepository$getCardIdGroup$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardId);
                        localPayPalCardDatabaseRepository$getCardIdGroup$1.Camera2StreamConfigurationMap = 1;
                        obj = cardIdGroupDao3.getCardIdGroupEntityByPayPalCardId(id3, localPayPalCardDatabaseRepository$getCardIdGroup$1);
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity cardIdGroupEntity = (com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity) obj;
                    if (cardIdGroupEntity != null) {
                        return getHighSpeedVideoFpsRanges(cardIdGroupEntity);
                    }
                    return null;
                }
                if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity cardIdGroupEntity2 = (com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity) obj;
                    if (cardIdGroupEntity2 != null) {
                        return getHighSpeedVideoFpsRanges(cardIdGroupEntity2);
                    }
                    return null;
                }
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity cardIdGroupEntity3 = (com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity) obj;
                if (cardIdGroupEntity3 != null) {
                    return getHighSpeedVideoFpsRanges(cardIdGroupEntity3);
                }
                return null;
            }
        }
        localPayPalCardDatabaseRepository$getCardIdGroup$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$getCardIdGroup$1(this, continuation);
        java.lang.Object obj2 = localPayPalCardDatabaseRepository$getCardIdGroup$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = localPayPalCardDatabaseRepository$getCardIdGroup$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f A[LOOP:0: B:11:0x0059->B:13:0x005f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCardIdGroups(kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$getCardIdGroups$1 localPayPalCardDatabaseRepository$getCardIdGroups$1;
        int i;
        java.util.Iterator it;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$getCardIdGroups$1) {
            localPayPalCardDatabaseRepository$getCardIdGroups$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$getCardIdGroups$1) continuation;
            if ((localPayPalCardDatabaseRepository$getCardIdGroups$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                localPayPalCardDatabaseRepository$getCardIdGroups$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = localPayPalCardDatabaseRepository$getCardIdGroups$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = localPayPalCardDatabaseRepository$getCardIdGroups$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao cardIdGroupDao = (com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao) this.getHighSpeedVideoSizes.getValue();
                    localPayPalCardDatabaseRepository$getCardIdGroups$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = cardIdGroupDao.getCardIdGroupsEntity(localPayPalCardDatabaseRepository$getCardIdGroups$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.Iterable iterable = (java.lang.Iterable) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity) it.next()));
                }
                return arrayList;
            }
        }
        localPayPalCardDatabaseRepository$getCardIdGroups$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$getCardIdGroups$1(this, continuation);
        java.lang.Object obj2 = localPayPalCardDatabaseRepository$getCardIdGroups$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = localPayPalCardDatabaseRepository$getCardIdGroups$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        java.lang.Iterable iterable2 = (java.lang.Iterable) obj2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00aa, code lost:
    
        if (androidx.room.RoomDatabaseKt.withTransaction(r2, r4, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b0, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r13 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deleteCardIdGroup(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$deleteCardIdGroup$1 localPayPalCardDatabaseRepository$deleteCardIdGroup$1;
        int i;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$deleteCardIdGroup$1) {
            localPayPalCardDatabaseRepository$deleteCardIdGroup$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$deleteCardIdGroup$1) continuation;
            if ((localPayPalCardDatabaseRepository$deleteCardIdGroup$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                localPayPalCardDatabaseRepository$deleteCardIdGroup$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = localPayPalCardDatabaseRepository$deleteCardIdGroup$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = localPayPalCardDatabaseRepository$deleteCardIdGroup$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    localPayPalCardDatabaseRepository$deleteCardIdGroup$1.Camera2StreamConfigurationMap = cardId;
                    localPayPalCardDatabaseRepository$deleteCardIdGroup$1.getHighSpeedVideoSizes = 1;
                    obj = getCardIdGroup(cardId, localPayPalCardDatabaseRepository$deleteCardIdGroup$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    cardId = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId) localPayPalCardDatabaseRepository$deleteCardIdGroup$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj;
                if (cardIdGroup != null) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayPal card not found for deletion", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardIdType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(cardId.getClass()).getSimpleName()), kotlin.TuplesKt.to("method", "deleteCardIdGroup")), null, 4, null);
                    return kotlin.Unit.INSTANCE;
                }
                com.paypal.oslo.feature.taptopay.data.db.card.paypal.DeviceWalletDataBase deviceWalletDataBase = this.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$deleteCardIdGroup$2 localPayPalCardDatabaseRepository$deleteCardIdGroup$2 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$deleteCardIdGroup$2(this, cardIdGroup, null);
                localPayPalCardDatabaseRepository$deleteCardIdGroup$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardId);
                localPayPalCardDatabaseRepository$deleteCardIdGroup$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardIdGroup);
                localPayPalCardDatabaseRepository$deleteCardIdGroup$1.getHighSpeedVideoSizes = 2;
            }
        }
        localPayPalCardDatabaseRepository$deleteCardIdGroup$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$deleteCardIdGroup$1(this, continuation);
        java.lang.Object obj2 = localPayPalCardDatabaseRepository$deleteCardIdGroup$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = localPayPalCardDatabaseRepository$deleteCardIdGroup$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj2;
        if (cardIdGroup != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0104, code lost:
    
        if (r2.addCardArtCollectionEntity(r7, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0123, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
    
        if (r14 != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object setCardArt(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalSetCardArtError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$setCardArt$1 localPayPalCardDatabaseRepository$setCardArt$1;
        int i;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId;
        java.lang.String id;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$setCardArt$1) {
            localPayPalCardDatabaseRepository$setCardArt$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$setCardArt$1) continuation;
            if ((localPayPalCardDatabaseRepository$setCardArt$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                localPayPalCardDatabaseRepository$setCardArt$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = localPayPalCardDatabaseRepository$setCardArt$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = localPayPalCardDatabaseRepository$setCardArt$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[4];
                    pairArr[0] = kotlin.TuplesKt.to("cardIdType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(cardId.getClass()).getSimpleName());
                    pairArr[1] = kotlin.TuplesKt.to("has_primary", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(cardArtCollection.getPrimary() != null));
                    pairArr[2] = kotlin.TuplesKt.to("has_thumbnail", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(cardArtCollection.getThumbnail() != null));
                    pairArr[3] = kotlin.TuplesKt.to("has_stack_view", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(cardArtCollection.getStackView() != null));
                    com.paypal.android.logger.Logger.d$default(logger, "Storing card art in DB", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                    localPayPalCardDatabaseRepository$setCardArt$1.getHighResolutionOutputSizeshNQ4ISI = cardId;
                    localPayPalCardDatabaseRepository$setCardArt$1.getHighSpeedVideoSizes = cardArtCollection;
                    localPayPalCardDatabaseRepository$setCardArt$1.getHighSpeedVideoFpsRanges = 1;
                    obj = getCardIdGroup(cardId, localPayPalCardDatabaseRepository$setCardArt$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                    }
                    cardArtCollection = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection) localPayPalCardDatabaseRepository$setCardArt$1.getHighSpeedVideoSizes;
                    cardId = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId) localPayPalCardDatabaseRepository$setCardArt$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj;
                if (cardIdGroup != null || (payPalCardId = cardIdGroup.getPayPalCardId()) == null || (id = payPalCardId.getId()) == null) {
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalSetCardArtError("No PayPal card ID found for card ID: ".concat(java.lang.String.valueOf(cardId)), null, 2, null));
                }
                com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtDao cardArtDao = (com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtDao) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
                com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity cardArtCollectionEntity = new com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity(id, cardArtCollection.getPrimary(), cardArtCollection.getThumbnail(), cardArtCollection.getStackView());
                localPayPalCardDatabaseRepository$setCardArt$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardId);
                localPayPalCardDatabaseRepository$setCardArt$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardArtCollection);
                localPayPalCardDatabaseRepository$setCardArt$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
                localPayPalCardDatabaseRepository$setCardArt$1.getHighSpeedVideoFpsRanges = 2;
            }
        }
        localPayPalCardDatabaseRepository$setCardArt$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$setCardArt$1(this, continuation);
        java.lang.Object obj2 = localPayPalCardDatabaseRepository$setCardArt$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = localPayPalCardDatabaseRepository$setCardArt$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj2;
        if (cardIdGroup != null) {
        }
        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalSetCardArtError("No PayPal card ID found for card ID: ".concat(java.lang.String.valueOf(cardId)), null, 2, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x007d, code lost:
    
        if (r14 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ef, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0051, code lost:
    
        if (r14 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCardArt(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardArtError, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$getCardArt$1 localPayPalCardDatabaseRepository$getCardArt$1;
        int i;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId;
        java.lang.String id;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$getCardArt$1) {
            localPayPalCardDatabaseRepository$getCardArt$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$getCardArt$1) continuation;
            if ((localPayPalCardDatabaseRepository$getCardArt$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                localPayPalCardDatabaseRepository$getCardArt$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = localPayPalCardDatabaseRepository$getCardArt$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = localPayPalCardDatabaseRepository$getCardArt$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    localPayPalCardDatabaseRepository$getCardArt$1.Camera2StreamConfigurationMap = cardId;
                    localPayPalCardDatabaseRepository$getCardArt$1.getHighSpeedVideoFpsRanges = 1;
                    obj = getCardIdGroup(cardId, localPayPalCardDatabaseRepository$getCardArt$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity cardArtCollectionEntity = (com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity) obj;
                        if (cardArtCollectionEntity != null) {
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Returning card art found in db", null, null, 6, null);
                            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt primary = cardArtCollectionEntity.getPrimary();
                            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt highResolutionOutputSizeshNQ4ISI = primary != null ? getHighResolutionOutputSizeshNQ4ISI(primary) : null;
                            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt thumbnail = cardArtCollectionEntity.getThumbnail();
                            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt highResolutionOutputSizeshNQ4ISI2 = thumbnail != null ? getHighResolutionOutputSizeshNQ4ISI(thumbnail) : null;
                            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt stackView = cardArtCollectionEntity.getStackView();
                            arrow.core.Either right = arrow.core.EitherKt.right(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection(highResolutionOutputSizeshNQ4ISI, highResolutionOutputSizeshNQ4ISI2, stackView != null ? getHighResolutionOutputSizeshNQ4ISI(stackView) : null));
                            if (right != null) {
                                return right;
                            }
                        }
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to get card art from db", null, null, 6, null);
                        return arrow.core.EitherKt.left(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardArtError.CardArtNotFound.INSTANCE);
                    }
                    cardId = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId) localPayPalCardDatabaseRepository$getCardArt$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj;
                if (cardIdGroup != null || (payPalCardId = cardIdGroup.getPayPalCardId()) == null || (id = payPalCardId.getId()) == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("No PayPal card ID for ");
                    sb.append(cardId);
                    sb.append(".");
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardArtError.DefaultError(sb.toString(), null, 2, null));
                }
                com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtDao cardArtDao = (com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtDao) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
                localPayPalCardDatabaseRepository$getCardArt$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardId);
                localPayPalCardDatabaseRepository$getCardArt$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
                localPayPalCardDatabaseRepository$getCardArt$1.getHighSpeedVideoFpsRanges = 2;
                obj = cardArtDao.getCardArtCollectionEntity(id, localPayPalCardDatabaseRepository$getCardArt$1);
            }
        }
        localPayPalCardDatabaseRepository$getCardArt$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$getCardArt$1(this, continuation);
        java.lang.Object obj2 = localPayPalCardDatabaseRepository$getCardArt$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = localPayPalCardDatabaseRepository$getCardArt$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj2;
        if (cardIdGroup != null) {
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("No PayPal card ID for ");
        sb2.append(cardId);
        sb2.append(".");
        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardArtError.DefaultError(sb2.toString(), null, 2, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        if (r2.deleteCardArtCollectionEntity(r13, r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if (r13 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deleteCardArt(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDeleteCardArtError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$deleteCardArt$1 localPayPalCardDatabaseRepository$deleteCardArt$1;
        int i;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId;
        java.lang.String id;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$deleteCardArt$1) {
            localPayPalCardDatabaseRepository$deleteCardArt$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$deleteCardArt$1) continuation;
            if ((localPayPalCardDatabaseRepository$deleteCardArt$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                localPayPalCardDatabaseRepository$deleteCardArt$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = localPayPalCardDatabaseRepository$deleteCardArt$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = localPayPalCardDatabaseRepository$deleteCardArt$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Deleting card art from db", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardIdType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(cardId.getClass()).getSimpleName())), null, 4, null);
                    localPayPalCardDatabaseRepository$deleteCardArt$1.Camera2StreamConfigurationMap = cardId;
                    localPayPalCardDatabaseRepository$deleteCardArt$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = getCardIdGroup(cardId, localPayPalCardDatabaseRepository$deleteCardArt$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                    }
                    cardId = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId) localPayPalCardDatabaseRepository$deleteCardArt$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj;
                if (cardIdGroup != null || (payPalCardId = cardIdGroup.getPayPalCardId()) == null || (id = payPalCardId.getId()) == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("No PayPal card ID for ");
                    sb.append(cardId);
                    sb.append(".");
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDeleteCardArtError.DefaultError(sb.toString(), null, 2, null));
                }
                com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtDao cardArtDao = (com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtDao) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
                localPayPalCardDatabaseRepository$deleteCardArt$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardId);
                localPayPalCardDatabaseRepository$deleteCardArt$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
                localPayPalCardDatabaseRepository$deleteCardArt$1.getHighResolutionOutputSizeshNQ4ISI = 2;
            }
        }
        localPayPalCardDatabaseRepository$deleteCardArt$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$deleteCardArt$1(this, continuation);
        java.lang.Object obj2 = localPayPalCardDatabaseRepository$deleteCardArt$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = localPayPalCardDatabaseRepository$deleteCardArt$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj2;
        if (cardIdGroup != null) {
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("No PayPal card ID for ");
        sb2.append(cardId);
        sb2.append(".");
        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDeleteCardArtError.DefaultError(sb2.toString(), null, 2, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0051, code lost:
    
        if (r15 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCardInfo(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$getCardInfo$1 localPayPalCardDatabaseRepository$getCardInfo$1;
        int i;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId;
        java.lang.String id;
        java.lang.String str;
        com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardData cardData;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DefaultCardInfo defaultCardInfo;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$getCardInfo$1) {
            localPayPalCardDatabaseRepository$getCardInfo$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$getCardInfo$1) continuation;
            if ((localPayPalCardDatabaseRepository$getCardInfo$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                localPayPalCardDatabaseRepository$getCardInfo$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = localPayPalCardDatabaseRepository$getCardInfo$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = localPayPalCardDatabaseRepository$getCardInfo$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    localPayPalCardDatabaseRepository$getCardInfo$1.getHighSpeedVideoFpsRangesFor = cardId;
                    localPayPalCardDatabaseRepository$getCardInfo$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = getCardIdGroup(cardId, localPayPalCardDatabaseRepository$getCardInfo$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = (java.lang.String) localPayPalCardDatabaseRepository$getCardInfo$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        cardData = (com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardData) obj;
                        if (cardData != null) {
                            java.util.Map<java.lang.String, java.lang.String> extras = cardData.getExtras();
                            if (extras == null || (defaultCardInfo = getHighSpeedVideoFpsRangesFor(extras)) == null) {
                                defaultCardInfo = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DefaultCardInfo(cardData.getType(), cardData.getBrand(), cardData.getDescription());
                            }
                            if (defaultCardInfo != null) {
                                return defaultCardInfo;
                            }
                        }
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Card data is null", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paypalCardId", str)), 2, null);
                        return null;
                    }
                    cardId = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId) localPayPalCardDatabaseRepository$getCardInfo$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj;
                if (cardIdGroup != null || (payPalCardId = cardIdGroup.getPayPalCardId()) == null || (id = payPalCardId.getId()) == null) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayPal card not found", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardIdType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(cardId.getClass()).getSimpleName()), kotlin.TuplesKt.to("method", "getCardInfo")), null, 4, null);
                    return null;
                }
                com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao cardInfoDao = (com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao) this.Camera2StreamConfigurationMap.getValue();
                localPayPalCardDatabaseRepository$getCardInfo$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardId);
                localPayPalCardDatabaseRepository$getCardInfo$1.getHighSpeedVideoSizes = id;
                localPayPalCardDatabaseRepository$getCardInfo$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                java.lang.Object cardData2 = cardInfoDao.getCardData(id, localPayPalCardDatabaseRepository$getCardInfo$1);
                if (cardData2 != coroutine_suspended) {
                    obj = cardData2;
                    str = id;
                    cardData = (com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardData) obj;
                    if (cardData != null) {
                    }
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Card data is null", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paypalCardId", str)), 2, null);
                    return null;
                }
                return coroutine_suspended;
            }
        }
        localPayPalCardDatabaseRepository$getCardInfo$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$getCardInfo$1(this, continuation);
        java.lang.Object obj2 = localPayPalCardDatabaseRepository$getCardInfo$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = localPayPalCardDatabaseRepository$getCardInfo$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj2;
        if (cardIdGroup != null) {
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayPal card not found", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardIdType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(cardId.getClass()).getSimpleName()), kotlin.TuplesKt.to("method", "getCardInfo")), null, 4, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        if (r2.deleteCardInfo(r13, r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b7, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        if (r13 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deleteCardInfo(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$deleteCardInfo$1 localPayPalCardDatabaseRepository$deleteCardInfo$1;
        int i;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId;
        java.lang.String id;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$deleteCardInfo$1) {
            localPayPalCardDatabaseRepository$deleteCardInfo$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$deleteCardInfo$1) continuation;
            if ((localPayPalCardDatabaseRepository$deleteCardInfo$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                localPayPalCardDatabaseRepository$deleteCardInfo$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = localPayPalCardDatabaseRepository$deleteCardInfo$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = localPayPalCardDatabaseRepository$deleteCardInfo$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    localPayPalCardDatabaseRepository$deleteCardInfo$1.getHighSpeedVideoFpsRangesFor = cardId;
                    localPayPalCardDatabaseRepository$deleteCardInfo$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = getCardIdGroup(cardId, localPayPalCardDatabaseRepository$deleteCardInfo$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    cardId = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId) localPayPalCardDatabaseRepository$deleteCardInfo$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj;
                if (cardIdGroup != null || (payPalCardId = cardIdGroup.getPayPalCardId()) == null || (id = payPalCardId.getId()) == null) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayPal card not found", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardIdType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(cardId.getClass()).getSimpleName()), kotlin.TuplesKt.to("method", "deleteCardInfo")), null, 4, null);
                    return kotlin.Unit.INSTANCE;
                }
                com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao cardInfoDao = (com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao) this.Camera2StreamConfigurationMap.getValue();
                localPayPalCardDatabaseRepository$deleteCardInfo$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardId);
                localPayPalCardDatabaseRepository$deleteCardInfo$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
                localPayPalCardDatabaseRepository$deleteCardInfo$1.getHighResolutionOutputSizeshNQ4ISI = 2;
            }
        }
        localPayPalCardDatabaseRepository$deleteCardInfo$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$deleteCardInfo$1(this, continuation);
        java.lang.Object obj2 = localPayPalCardDatabaseRepository$deleteCardInfo$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = localPayPalCardDatabaseRepository$deleteCardInfo$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj2;
        if (cardIdGroup != null) {
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayPal card not found", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardIdType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(cardId.getClass()).getSimpleName()), kotlin.TuplesKt.to("method", "deleteCardInfo")), null, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        if (r12 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bb, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0051, code lost:
    
        if (r12 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getTermsAndConditions(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.TermsAndConditionsData> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$getTermsAndConditions$1 localPayPalCardDatabaseRepository$getTermsAndConditions$1;
        int i;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId;
        java.lang.String id;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$getTermsAndConditions$1) {
            localPayPalCardDatabaseRepository$getTermsAndConditions$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$getTermsAndConditions$1) continuation;
            if ((localPayPalCardDatabaseRepository$getTermsAndConditions$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                localPayPalCardDatabaseRepository$getTermsAndConditions$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = localPayPalCardDatabaseRepository$getTermsAndConditions$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = localPayPalCardDatabaseRepository$getTermsAndConditions$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    localPayPalCardDatabaseRepository$getTermsAndConditions$1.getHighResolutionOutputSizeshNQ4ISI = cardId;
                    localPayPalCardDatabaseRepository$getTermsAndConditions$1.Camera2StreamConfigurationMap = 1;
                    obj = getCardIdGroup(cardId, localPayPalCardDatabaseRepository$getTermsAndConditions$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCData tnCData = (com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCData) obj;
                        if (tnCData != null) {
                            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.TermsAndConditionsData(tnCData.getDeviceWalletServiceCardId(), tnCData.getTncText(), tnCData.getAcceptedTime());
                        }
                        return null;
                    }
                    cardId = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId) localPayPalCardDatabaseRepository$getTermsAndConditions$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj;
                if (cardIdGroup != null || (deviceWalletServiceCardId = cardIdGroup.getDeviceWalletServiceCardId()) == null || (id = deviceWalletServiceCardId.getId()) == null) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "LocalPayPalCardDatabaseRepository: PayPal card not found", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardIdType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(cardId.getClass()).getSimpleName())), null, 4, null);
                    return null;
                }
                com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCDao tnCDao = (com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCDao) this.getHighSpeedVideoFpsRangesFor.getValue();
                localPayPalCardDatabaseRepository$getTermsAndConditions$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardId);
                localPayPalCardDatabaseRepository$getTermsAndConditions$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
                localPayPalCardDatabaseRepository$getTermsAndConditions$1.Camera2StreamConfigurationMap = 2;
                obj = tnCDao.getTermsAndConditions(id, localPayPalCardDatabaseRepository$getTermsAndConditions$1);
            }
        }
        localPayPalCardDatabaseRepository$getTermsAndConditions$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$getTermsAndConditions$1(this, continuation);
        java.lang.Object obj2 = localPayPalCardDatabaseRepository$getTermsAndConditions$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = localPayPalCardDatabaseRepository$getTermsAndConditions$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj2;
        if (cardIdGroup != null) {
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "LocalPayPalCardDatabaseRepository: PayPal card not found", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardIdType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(cardId.getClass()).getSimpleName())), null, 4, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        if (r2.deleteTermsAndConditions(r8, r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a8, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        if (r8 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deleteTermsAndConditions(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$deleteTermsAndConditions$1 localPayPalCardDatabaseRepository$deleteTermsAndConditions$1;
        int i;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId;
        java.lang.String id;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$deleteTermsAndConditions$1) {
            localPayPalCardDatabaseRepository$deleteTermsAndConditions$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$deleteTermsAndConditions$1) continuation;
            if ((localPayPalCardDatabaseRepository$deleteTermsAndConditions$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                localPayPalCardDatabaseRepository$deleteTermsAndConditions$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = localPayPalCardDatabaseRepository$deleteTermsAndConditions$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = localPayPalCardDatabaseRepository$deleteTermsAndConditions$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    localPayPalCardDatabaseRepository$deleteTermsAndConditions$1.Camera2StreamConfigurationMap = cardId;
                    localPayPalCardDatabaseRepository$deleteTermsAndConditions$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = getCardIdGroup(cardId, localPayPalCardDatabaseRepository$deleteTermsAndConditions$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    cardId = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId) localPayPalCardDatabaseRepository$deleteTermsAndConditions$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj;
                if (cardIdGroup != null || (deviceWalletServiceCardId = cardIdGroup.getDeviceWalletServiceCardId()) == null || (id = deviceWalletServiceCardId.getId()) == null) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "LocalPayPalCardDatabaseRepository: PayPal card not found", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardIdType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(cardId.getClass()).getSimpleName())), null, 4, null);
                    return kotlin.Unit.INSTANCE;
                }
                com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCDao tnCDao = (com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCDao) this.getHighSpeedVideoFpsRangesFor.getValue();
                localPayPalCardDatabaseRepository$deleteTermsAndConditions$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardId);
                localPayPalCardDatabaseRepository$deleteTermsAndConditions$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
                localPayPalCardDatabaseRepository$deleteTermsAndConditions$1.getHighSpeedVideoFpsRangesFor = 2;
            }
        }
        localPayPalCardDatabaseRepository$deleteTermsAndConditions$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$deleteTermsAndConditions$1(this, continuation);
        java.lang.Object obj2 = localPayPalCardDatabaseRepository$deleteTermsAndConditions$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = localPayPalCardDatabaseRepository$deleteTermsAndConditions$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj2;
        if (cardIdGroup != null) {
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "LocalPayPalCardDatabaseRepository: PayPal card not found", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardIdType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(cardId.getClass()).getSimpleName())), null, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    private static com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity cardIdGroupEntity) {
        return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId(cardIdGroupEntity.getDigitizedCardId()), new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId(cardIdGroupEntity.getPayPalCardId()), new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId(cardIdGroupEntity.getDeviceWalletServiceCardId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo) {
        if (cardInfo instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayLaterCardInfo) {
            try {
                return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(KEY_PAY_LATER_CARD_INFO, com.paypal.oslo.feature.taptopay.data.util.ExtensionsKt.getJson().encodeToString(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayLaterCardInfo.INSTANCE.serializer(), cardInfo)));
            } catch (kotlinx.serialization.SerializationException e) {
                java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayLaterCardInfo.class).getSimpleName();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to serialize ");
                sb.append(simpleName);
                sb.append(" to JSON");
                throw new java.lang.IllegalStateException(sb.toString(), e);
            }
        }
        if (!(cardInfo instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DefaultCardInfo)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        try {
            return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(KEY_DEFAULT_CARD_INFO, com.paypal.oslo.feature.taptopay.data.util.ExtensionsKt.getJson().encodeToString(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DefaultCardInfo.INSTANCE.serializer(), cardInfo)));
        } catch (kotlinx.serialization.SerializationException e2) {
            java.lang.String simpleName2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DefaultCardInfo.class).getSimpleName();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to serialize ");
            sb2.append(simpleName2);
            sb2.append(" to JSON");
            throw new java.lang.IllegalStateException(sb2.toString(), e2);
        }
    }

    private static com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt cardArt) {
        java.lang.String sourceUrl = cardArt.getSourceUrl();
        java.lang.String mimeType = cardArt.getMimeType();
        java.lang.Integer width = cardArt.getWidth();
        java.lang.Integer height = cardArt.getHeight();
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata metadata = cardArt.getMetadata();
        return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt(sourceUrl, mimeType, width, height, metadata != null ? new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata(metadata.getBackgroundColor(), metadata.getForegroundColor(), metadata.getLabelColor()) : null);
    }

    private static com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo getHighSpeedVideoFpsRangesFor(java.util.Map<java.lang.String, java.lang.String> map) {
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo2;
        java.util.Iterator<T> it = map.entrySet().iterator();
        do {
            cardInfo = null;
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.String str2 = (java.lang.String) entry.getValue();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(str, KEY_PAY_LATER_CARD_INFO)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(str, KEY_DEFAULT_CARD_INFO)) {
                    try {
                        cardInfo2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo) com.paypal.oslo.feature.taptopay.data.util.ExtensionsKt.getJson().decodeFromString(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DefaultCardInfo.INSTANCE.serializer(), str2);
                    } catch (kotlinx.serialization.SerializationException e) {
                        throw new java.lang.IllegalStateException("Failed to deserialize JSON to ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DefaultCardInfo.class).getSimpleName())), e);
                    }
                }
            } else {
                try {
                    cardInfo2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo) com.paypal.oslo.feature.taptopay.data.util.ExtensionsKt.getJson().decodeFromString(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayLaterCardInfo.INSTANCE.serializer(), str2);
                } catch (kotlinx.serialization.SerializationException e2) {
                    throw new java.lang.IllegalStateException("Failed to deserialize JSON to ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayLaterCardInfo.class).getSimpleName())), e2);
                }
            }
            cardInfo = cardInfo2;
        } while (cardInfo == null);
        return cardInfo;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao access$getCardIdGroupDao(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository localPayPalCardDatabaseRepository) {
        return (com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupDao) localPayPalCardDatabaseRepository.getHighSpeedVideoSizes.getValue();
    }

    public static final /* synthetic */ com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao access$getCardInfoDao(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository localPayPalCardDatabaseRepository) {
        return (com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao) localPayPalCardDatabaseRepository.Camera2StreamConfigurationMap.getValue();
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository
    public final java.lang.Object storeTermsAndConditions(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object storeTermsAndConditions = ((com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCDao) this.getHighSpeedVideoFpsRangesFor.getValue()).storeTermsAndConditions(new com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCData(str, str2, com.paypal.oslo.feature.taptopay.data.util.ExtensionsKt.getFormattedCurrentDate()), continuation);
        return storeTermsAndConditions == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? storeTermsAndConditions : kotlin.Unit.INSTANCE;
    }
}
