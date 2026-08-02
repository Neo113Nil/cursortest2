package com.paypal.oslo.feature.savings.domain.model.savingshub.registry;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0010\u0010\rJ\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J2\u0010\u0013\u001a\u0004\u0018\u00010\u00192\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u0013\u0010\u001aJ \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u0010\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u0010\u0010\u001dJ\u0017\u0010\u0010\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0010\u0010\u001eJ \u0010\u0010\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020 H\u0082@¢\u0006\u0004\b\u0010\u0010!R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010$R\u0014\u0010\u0013\u001a\u00020 8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001c\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/registry/SavingsHubComponentRegistry;", "", "Lcom/paypal/oslo/feature/savings/manager/SavingsFeatureManager;", "featureManager", "Lcom/paypal/oslo/feature/savings/util/CurrencyHandlerImpl;", "currencyHandler", "<init>", "(Lcom/paypal/oslo/feature/savings/manager/SavingsFeatureManager;Lcom/paypal/oslo/feature/savings/util/CurrencyHandlerImpl;)V", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsHubData;", "savingsHubData", "", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/SavingsHubTileDTO;", "getSavingsHubTiles", "(Lcom/paypal/oslo/feature/savings/domain/model/SavingsHubData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/SavingsBalanceTileDTO;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsInterestData;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/InterestDTO;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/savings/domain/model/SavingsInterestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/savings/domain/model/MoneyboxData;", "p1", "", "p2", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalZoneDTO;", "(Ljava/util/List;Lcom/paypal/oslo/feature/savings/domain/model/MoneyboxData;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/savings/domain/model/MoneyboxData;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/paypal/oslo/feature/savings/domain/model/MoneyboxData;)Z", "", "", "(DLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/savings/manager/SavingsFeatureManager;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/savings/util/CurrencyHandlerImpl;", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsHubComponentRegistry {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.manager.SavingsFeatureManager getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl Camera2StreamConfigurationMap;

    public SavingsHubComponentRegistry(com.paypal.oslo.feature.savings.manager.SavingsFeatureManager savingsFeatureManager, com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl currencyHandlerImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsFeatureManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyHandlerImpl, "");
        this.getHighSpeedVideoFpsRangesFor = savingsFeatureManager;
        this.Camera2StreamConfigurationMap = currencyHandlerImpl;
        this.getHighSpeedVideoFpsRanges = com.payair.model.TokenStatusKt.TOKEN_ACTIVE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0170, code lost:
    
        if (r2 != r4) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getSavingsHubTiles(com.paypal.oslo.feature.savings.domain.model.SavingsHubData savingsHubData, kotlin.coroutines.Continuation<? super java.util.List<? extends com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO>> continuation) {
        com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$getSavingsHubTiles$1 savingsHubComponentRegistry$getSavingsHubTiles$1;
        java.lang.Object coroutine_suspended;
        int i;
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.savings.domain.model.SavingsAccountData savingsAccountData;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsBalanceTileDTO savingsBalanceTileDTO;
        boolean areEqual;
        java.lang.Object highSpeedVideoFpsRanges;
        com.paypal.oslo.feature.savings.domain.model.SavingsHubData savingsHubData2;
        java.util.List list;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.InterestDTO interestDTO;
        com.paypal.oslo.feature.savings.domain.model.SavingsHubData savingsHubData3 = savingsHubData;
        if (continuation instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$getSavingsHubTiles$1) {
            savingsHubComponentRegistry$getSavingsHubTiles$1 = (com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$getSavingsHubTiles$1) continuation;
            if ((savingsHubComponentRegistry$getSavingsHubTiles$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                savingsHubComponentRegistry$getSavingsHubTiles$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = savingsHubComponentRegistry$getSavingsHubTiles$1.getOutputFormats;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsHubComponentRegistry$getSavingsHubTiles$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.model.SavingsAccountData savingsAccountData2 = (com.paypal.oslo.feature.savings.domain.model.SavingsAccountData) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) savingsHubData.getSavingsAccounts());
                    arrayList = new java.util.ArrayList();
                    savingsHubComponentRegistry$getSavingsHubTiles$1.Camera2StreamConfigurationMap = savingsHubData3;
                    savingsHubComponentRegistry$getSavingsHubTiles$1.getHighResolutionOutputSizeshNQ4ISI = savingsAccountData2;
                    savingsHubComponentRegistry$getSavingsHubTiles$1.getHighSpeedVideoSizes = arrayList;
                    savingsHubComponentRegistry$getSavingsHubTiles$1.getHighSpeedVideoFpsRanges = 1;
                    java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(savingsHubData3, savingsHubComponentRegistry$getSavingsHubTiles$1);
                    if (highSpeedVideoSizes != coroutine_suspended) {
                        savingsAccountData = savingsAccountData2;
                        obj = highSpeedVideoSizes;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    ?? r1 = (java.util.List) savingsHubComponentRegistry$getSavingsHubTiles$1.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.savings.domain.model.SavingsAccountData savingsAccountData3 = (com.paypal.oslo.feature.savings.domain.model.SavingsAccountData) savingsHubComponentRegistry$getSavingsHubTiles$1.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.savings.domain.model.SavingsHubData savingsHubData4 = (com.paypal.oslo.feature.savings.domain.model.SavingsHubData) savingsHubComponentRegistry$getSavingsHubTiles$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrayList = r1;
                    savingsHubData3 = savingsHubData4;
                    savingsAccountData = savingsAccountData3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z = savingsHubComponentRegistry$getSavingsHubTiles$1.getHighSpeedVideoFpsRangesFor;
                        list = (java.util.List) savingsHubComponentRegistry$getSavingsHubTiles$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO) obj;
                        if (goalZoneDTO != null) {
                            list.add(kotlin.TuplesKt.to(kotlin.coroutines.jvm.internal.Boxing.boxInt(4), goalZoneDTO));
                        } else {
                            list.add(kotlin.TuplesKt.to(kotlin.coroutines.jvm.internal.Boxing.boxInt(4), new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.InvalidDTO(com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType.GoalsZone)));
                        }
                        list.add(kotlin.TuplesKt.to(kotlin.coroutines.jvm.internal.Boxing.boxInt(5), new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.EducationZoneDTO(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.EducationalTileDTO[]{new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.EducationalTileDTO("HOW_SAVINGS_WORK", "ONE_MIN_READ", "HOW_SAVINGS_WORK_CONTENT"), new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.EducationalTileDTO("WHY_SET_GOALS", "ONE_MIN_READ", "WHY_SET_GOALS_CONTENT")}))));
                        list.add(kotlin.TuplesKt.to(kotlin.coroutines.jvm.internal.Boxing.boxInt(6), new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentZoneDTO(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType[]{com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType.SavingsStatementTile.INSTANCE, new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType.AccountAgreementTile(com.paypal.oslo.feature.savings.constants.SavingsConstants.DocumentUrls.SYNCHRONY_ACCOUNT_AGREEMENT), com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType.FdicInsuranceTile.INSTANCE, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType.TaxPreferenceTile.INSTANCE, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DocumentTileType.TaxDocumentsTile.INSTANCE}))));
                        java.util.List sortedWith = kotlin.collections.CollectionsKt.sortedWith(list, new java.util.Comparator() { // from class: com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$getSavingsHubTiles$$inlined$sortedBy$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                return kotlin.comparisons.ComparisonsKt.compareValues((java.lang.Integer) ((kotlin.Pair) t).getFirst(), (java.lang.Integer) ((kotlin.Pair) t2).getFirst());
                            }
                        });
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(sortedWith, 10));
                        java.util.Iterator it = sortedWith.iterator();
                        while (it.hasNext()) {
                            arrayList2.add((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO) ((kotlin.Pair) it.next()).getSecond());
                        }
                        return arrayList2;
                    }
                    boolean z2 = savingsHubComponentRegistry$getSavingsHubTiles$1.getHighSpeedVideoFpsRangesFor;
                    java.util.List list2 = (java.util.List) savingsHubComponentRegistry$getSavingsHubTiles$1.getHighSpeedVideoSizes;
                    savingsAccountData = (com.paypal.oslo.feature.savings.domain.model.SavingsAccountData) savingsHubComponentRegistry$getSavingsHubTiles$1.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.savings.domain.model.SavingsHubData savingsHubData5 = (com.paypal.oslo.feature.savings.domain.model.SavingsHubData) savingsHubComponentRegistry$getSavingsHubTiles$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    areEqual = z2;
                    list = list2;
                    savingsHubData2 = savingsHubData5;
                    highSpeedVideoFpsRanges = obj;
                    interestDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.InterestDTO) highSpeedVideoFpsRanges;
                    if (interestDTO == null) {
                        list.add(kotlin.TuplesKt.to(kotlin.coroutines.jvm.internal.Boxing.boxInt(3), interestDTO));
                    } else {
                        list.add(kotlin.TuplesKt.to(kotlin.coroutines.jvm.internal.Boxing.boxInt(3), new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.InvalidDTO(com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType.InterestZone)));
                    }
                    java.util.List<com.paypal.oslo.feature.savings.domain.model.MoneyboxData> moneyboxes = savingsHubData2.getMoneyboxes();
                    com.paypal.oslo.feature.savings.domain.model.MoneyboxData moneybox = savingsAccountData != null ? savingsAccountData.getMoneybox() : null;
                    savingsHubComponentRegistry$getSavingsHubTiles$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsHubData2);
                    savingsHubComponentRegistry$getSavingsHubTiles$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsAccountData);
                    savingsHubComponentRegistry$getSavingsHubTiles$1.getHighSpeedVideoSizes = list;
                    savingsHubComponentRegistry$getSavingsHubTiles$1.getHighSpeedVideoFpsRangesFor = areEqual;
                    savingsHubComponentRegistry$getSavingsHubTiles$1.getHighSpeedVideoFpsRanges = 3;
                    obj = getHighSpeedVideoFpsRanges(moneyboxes, moneybox, areEqual, savingsHubComponentRegistry$getSavingsHubTiles$1);
                }
                savingsBalanceTileDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsBalanceTileDTO) obj;
                if (savingsBalanceTileDTO == null) {
                    arrayList.add(kotlin.TuplesKt.to(kotlin.coroutines.jvm.internal.Boxing.boxInt(1), savingsBalanceTileDTO));
                } else {
                    arrayList.add(kotlin.TuplesKt.to(kotlin.coroutines.jvm.internal.Boxing.boxInt(1), new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.InvalidDTO(com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType.BalanceCard)));
                }
                com.paypal.oslo.feature.savings.domain.model.SmartRoutePreferencesData smartRoutePreferences = savingsHubData3.getSmartRoutePreferences();
                areEqual = kotlin.jvm.internal.Intrinsics.areEqual(smartRoutePreferences == null ? smartRoutePreferences.getStatus() : null, this.getHighSpeedVideoFpsRanges);
                if (!areEqual && this.getHighSpeedVideoFpsRangesFor.isSmartRouteEntryPointVisible()) {
                    arrayList.add(kotlin.TuplesKt.to(kotlin.coroutines.jvm.internal.Boxing.boxInt(2), new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoZoneDTO(kotlin.collections.CollectionsKt.arrayListOf(new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoTileDTO("Arrow", new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action.Destination(com.paypal.oslo.feature.userprofile.domain.model.constants.PhoneConstants.HOME), new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action.Dismiss(com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS))))));
                }
                com.paypal.oslo.feature.savings.domain.model.SavingsInterestData savingsInterest = savingsHubData3.getSavingsInterest();
                savingsHubComponentRegistry$getSavingsHubTiles$1.Camera2StreamConfigurationMap = savingsHubData3;
                savingsHubComponentRegistry$getSavingsHubTiles$1.getHighResolutionOutputSizeshNQ4ISI = savingsAccountData;
                savingsHubComponentRegistry$getSavingsHubTiles$1.getHighSpeedVideoSizes = arrayList;
                savingsHubComponentRegistry$getSavingsHubTiles$1.getHighSpeedVideoFpsRangesFor = areEqual;
                savingsHubComponentRegistry$getSavingsHubTiles$1.getHighSpeedVideoFpsRanges = 2;
                highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(savingsInterest, savingsHubComponentRegistry$getSavingsHubTiles$1);
                if (highSpeedVideoFpsRanges != coroutine_suspended) {
                    java.util.ArrayList arrayList3 = arrayList;
                    savingsHubData2 = savingsHubData3;
                    list = arrayList3;
                    interestDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.InterestDTO) highSpeedVideoFpsRanges;
                    if (interestDTO == null) {
                    }
                    java.util.List<com.paypal.oslo.feature.savings.domain.model.MoneyboxData> moneyboxes2 = savingsHubData2.getMoneyboxes();
                    if (savingsAccountData != null) {
                    }
                    savingsHubComponentRegistry$getSavingsHubTiles$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsHubData2);
                    savingsHubComponentRegistry$getSavingsHubTiles$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsAccountData);
                    savingsHubComponentRegistry$getSavingsHubTiles$1.getHighSpeedVideoSizes = list;
                    savingsHubComponentRegistry$getSavingsHubTiles$1.getHighSpeedVideoFpsRangesFor = areEqual;
                    savingsHubComponentRegistry$getSavingsHubTiles$1.getHighSpeedVideoFpsRanges = 3;
                    obj = getHighSpeedVideoFpsRanges(moneyboxes2, moneybox, areEqual, savingsHubComponentRegistry$getSavingsHubTiles$1);
                }
                return coroutine_suspended;
            }
        }
        savingsHubComponentRegistry$getSavingsHubTiles$1 = new com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$getSavingsHubTiles$1(this, continuation);
        java.lang.Object obj2 = savingsHubComponentRegistry$getSavingsHubTiles$1.getOutputFormats;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsHubComponentRegistry$getSavingsHubTiles$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        savingsBalanceTileDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsBalanceTileDTO) obj2;
        if (savingsBalanceTileDTO == null) {
        }
        com.paypal.oslo.feature.savings.domain.model.SmartRoutePreferencesData smartRoutePreferences2 = savingsHubData3.getSmartRoutePreferences();
        areEqual = kotlin.jvm.internal.Intrinsics.areEqual(smartRoutePreferences2 == null ? smartRoutePreferences2.getStatus() : null, this.getHighSpeedVideoFpsRanges);
        if (!areEqual) {
            arrayList.add(kotlin.TuplesKt.to(kotlin.coroutines.jvm.internal.Boxing.boxInt(2), new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoZoneDTO(kotlin.collections.CollectionsKt.arrayListOf(new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoTileDTO("Arrow", new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action.Destination(com.paypal.oslo.feature.userprofile.domain.model.constants.PhoneConstants.HOME), new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Action.Dismiss(com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS))))));
        }
        com.paypal.oslo.feature.savings.domain.model.SavingsInterestData savingsInterest2 = savingsHubData3.getSavingsInterest();
        savingsHubComponentRegistry$getSavingsHubTiles$1.Camera2StreamConfigurationMap = savingsHubData3;
        savingsHubComponentRegistry$getSavingsHubTiles$1.getHighResolutionOutputSizeshNQ4ISI = savingsAccountData;
        savingsHubComponentRegistry$getSavingsHubTiles$1.getHighSpeedVideoSizes = arrayList;
        savingsHubComponentRegistry$getSavingsHubTiles$1.getHighSpeedVideoFpsRangesFor = areEqual;
        savingsHubComponentRegistry$getSavingsHubTiles$1.getHighSpeedVideoFpsRanges = 2;
        highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(savingsInterest2, savingsHubComponentRegistry$getSavingsHubTiles$1);
        if (highSpeedVideoFpsRanges != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0191, code lost:
    
        if (r1 != null) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.savings.domain.model.SavingsHubData savingsHubData, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsBalanceTileDTO> continuation) {
        com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$createBalanceTile$1 savingsHubComponentRegistry$createBalanceTile$1;
        int i;
        com.paypal.oslo.feature.savings.domain.model.MoneyData totalBalance;
        java.lang.String str;
        java.util.List build;
        boolean areEqual;
        com.paypal.oslo.feature.savings.domain.model.SavingsHubData savingsHubData2;
        double d;
        java.lang.String str2;
        java.lang.String format;
        java.lang.String annualPercentageYield;
        if (continuation instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$createBalanceTile$1) {
            savingsHubComponentRegistry$createBalanceTile$1 = (com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$createBalanceTile$1) continuation;
            if ((savingsHubComponentRegistry$createBalanceTile$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                savingsHubComponentRegistry$createBalanceTile$1.getInputFormats -= 2147483648;
                java.lang.Object obj = savingsHubComponentRegistry$createBalanceTile$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsHubComponentRegistry$createBalanceTile$1.getInputFormats;
                java.lang.String str3 = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.model.SavingsAccountData savingsAccountData = (com.paypal.oslo.feature.savings.domain.model.SavingsAccountData) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) savingsHubData.getSavingsAccounts());
                    if (savingsAccountData == null || (totalBalance = savingsAccountData.getTotalBalance()) == null) {
                        return null;
                    }
                    java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
                    java.util.List<com.paypal.oslo.feature.savings.domain.model.MoneyboxData> moneyboxes = savingsHubData.getMoneyboxes();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : moneyboxes) {
                        com.paypal.oslo.feature.savings.domain.model.TransferSettingsData transferSettings = ((com.paypal.oslo.feature.savings.domain.model.MoneyboxData) obj2).getTransferSettings();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(transferSettings != null ? transferSettings.getStatus() : null, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING)) {
                            arrayList.add(obj2);
                        }
                    }
                    java.util.Iterator it = arrayList.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        str = com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_SAVINGS;
                        if (!hasNext) {
                            break;
                        }
                        com.paypal.oslo.feature.savings.domain.model.MoneyboxData moneyboxData = (com.paypal.oslo.feature.savings.domain.model.MoneyboxData) it.next();
                        java.lang.String name2 = moneyboxData.getName();
                        if (name2 != null) {
                            str = name2;
                        }
                        createListBuilder.add(new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.AutoSaveConfig(str, kotlin.jvm.internal.Intrinsics.areEqual(moneyboxData.getCategory(), com.paypal.oslo.feature.savings.constants.SavingsConstants.GoalCategories.SAVINGS_NON_GOAL)));
                    }
                    com.paypal.oslo.feature.savings.domain.model.MoneyboxData moneybox = savingsAccountData.getMoneybox();
                    if (moneybox != null) {
                        com.paypal.oslo.feature.savings.domain.model.TransferSettingsData transferSettings2 = moneybox.getTransferSettings();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(transferSettings2 != null ? transferSettings2.getStatus() : null, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING)) {
                            java.lang.String name3 = moneybox.getName();
                            if (name3 != null) {
                                str = name3;
                            }
                            createListBuilder.add(new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.AutoSaveConfig(str, kotlin.jvm.internal.Intrinsics.areEqual(moneybox.getCategory(), com.paypal.oslo.feature.savings.constants.SavingsConstants.GoalCategories.SAVINGS_NON_GOAL)));
                        }
                    }
                    build = kotlin.collections.CollectionsKt.build(createListBuilder);
                    com.paypal.oslo.feature.savings.domain.model.SmartRoutePreferencesData smartRoutePreferences = savingsHubData.getSmartRoutePreferences();
                    areEqual = kotlin.jvm.internal.Intrinsics.areEqual(smartRoutePreferences != null ? smartRoutePreferences.getStatus() : null, this.getHighSpeedVideoFpsRanges);
                    java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(totalBalance.getValue());
                    double doubleValue = doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d;
                    com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl currencyHandlerImpl = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration currencyConfiguration = new com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration(com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(totalBalance.getCurrencyCode()), com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.CODE, 2, null, null, 24, null);
                    savingsHubData2 = savingsHubData;
                    savingsHubComponentRegistry$createBalanceTile$1.getHighSpeedVideoFpsRangesFor = savingsHubData2;
                    savingsHubComponentRegistry$createBalanceTile$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsAccountData);
                    savingsHubComponentRegistry$createBalanceTile$1.getHighSpeedVideoFpsRanges = totalBalance;
                    savingsHubComponentRegistry$createBalanceTile$1.getHighResolutionOutputSizeshNQ4ISI = build;
                    savingsHubComponentRegistry$createBalanceTile$1.getHighSpeedVideoSizesFor = areEqual;
                    savingsHubComponentRegistry$createBalanceTile$1.Camera2StreamConfigurationMap = doubleValue;
                    savingsHubComponentRegistry$createBalanceTile$1.getInputFormats = 1;
                    obj = currencyHandlerImpl.format(doubleValue, currencyConfiguration, savingsHubComponentRegistry$createBalanceTile$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    d = doubleValue;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d = savingsHubComponentRegistry$createBalanceTile$1.Camera2StreamConfigurationMap;
                    areEqual = savingsHubComponentRegistry$createBalanceTile$1.getHighSpeedVideoSizesFor;
                    build = (java.util.List) savingsHubComponentRegistry$createBalanceTile$1.getHighResolutionOutputSizeshNQ4ISI;
                    totalBalance = (com.paypal.oslo.feature.savings.domain.model.MoneyData) savingsHubComponentRegistry$createBalanceTile$1.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.savings.domain.model.SavingsHubData savingsHubData3 = (com.paypal.oslo.feature.savings.domain.model.SavingsHubData) savingsHubComponentRegistry$createBalanceTile$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    savingsHubData2 = savingsHubData3;
                }
                str2 = (java.lang.String) ((arrow.core.Either) obj).getOrNull();
                if (str2 != null) {
                    java.lang.String replace = new kotlin.text.Regex("^[A-Z]{3}\\s*").replace(str2, "");
                    if (replace != null) {
                        java.lang.String replace$default = kotlin.text.StringsKt.replace$default(replace, ",", "", false, 4, (java.lang.Object) null);
                        if (replace$default != null) {
                            format = kotlin.text.StringsKt.trim(replace$default).toString();
                        }
                    }
                }
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                format = java.lang.String.format(java.util.Locale.US, com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.FORMAT_TWO_DECIMALS, java.util.Arrays.copyOf(new java.lang.Object[]{kotlin.coroutines.jvm.internal.Boxing.boxDouble(d)}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                java.lang.String str4 = format;
                java.lang.String currencyCode = totalBalance.getCurrencyCode();
                annualPercentageYield = savingsHubData2.getAnnualPercentageYield();
                if (annualPercentageYield != null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(annualPercentageYield);
                    sb.append("%");
                    str3 = sb.toString();
                }
                return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsBalanceTileDTO(str4, currencyCode, str3, new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.FeaturesDTO(areEqual, build), new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Actions(this.getHighSpeedVideoFpsRangesFor.isTransferMoneyFeatureAvailable(), this.getHighSpeedVideoFpsRangesFor.isAddMoneyFeatureAvailable()), this.getHighSpeedVideoFpsRangesFor.isAutoSaveFeatureAvailable(), this.getHighSpeedVideoFpsRangesFor.isSmartRouteEntryPointVisible());
            }
        }
        savingsHubComponentRegistry$createBalanceTile$1 = new com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$createBalanceTile$1(this, continuation);
        java.lang.Object obj3 = savingsHubComponentRegistry$createBalanceTile$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsHubComponentRegistry$createBalanceTile$1.getInputFormats;
        java.lang.String str32 = null;
        if (i != 0) {
        }
        str2 = (java.lang.String) ((arrow.core.Either) obj3).getOrNull();
        if (str2 != null) {
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        format = java.lang.String.format(java.util.Locale.US, com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.FORMAT_TWO_DECIMALS, java.util.Arrays.copyOf(new java.lang.Object[]{kotlin.coroutines.jvm.internal.Boxing.boxDouble(d)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        java.lang.String str42 = format;
        java.lang.String currencyCode2 = totalBalance.getCurrencyCode();
        annualPercentageYield = savingsHubData2.getAnnualPercentageYield();
        if (annualPercentageYield != null) {
        }
        return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsBalanceTileDTO(str42, currencyCode2, str32, new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.FeaturesDTO(areEqual, build), new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.Actions(this.getHighSpeedVideoFpsRangesFor.isTransferMoneyFeatureAvailable(), this.getHighSpeedVideoFpsRangesFor.isAddMoneyFeatureAvailable()), this.getHighSpeedVideoFpsRangesFor.isAutoSaveFeatureAvailable(), this.getHighSpeedVideoFpsRangesFor.isSmartRouteEntryPointVisible());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.savings.domain.model.SavingsInterestData savingsInterestData, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.InterestDTO> continuation) {
        com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$createInterestTile$1 savingsHubComponentRegistry$createInterestTile$1;
        java.lang.Object coroutine_suspended;
        int i;
        com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData;
        com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData2;
        com.paypal.oslo.feature.savings.domain.model.SavingsInterestData savingsInterestData2;
        com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData3;
        double d;
        double d2;
        java.lang.Object highSpeedVideoSizes;
        java.lang.String str;
        if (continuation instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$createInterestTile$1) {
            savingsHubComponentRegistry$createInterestTile$1 = (com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$createInterestTile$1) continuation;
            if ((savingsHubComponentRegistry$createInterestTile$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                savingsHubComponentRegistry$createInterestTile$1.getInputFormats -= 2147483648;
                java.lang.Object obj = savingsHubComponentRegistry$createInterestTile$1.getInputSizeshNQ4ISI;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsHubComponentRegistry$createInterestTile$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (savingsInterestData == null || (moneyData = savingsInterestData.getMonthToDateInterest()) == null || kotlin.text.StringsKt.isBlank(moneyData.getValue()) || kotlin.text.StringsKt.isBlank(moneyData.getCurrencyCode())) {
                        moneyData = null;
                    }
                    if (savingsInterestData == null || (moneyData2 = savingsInterestData.getLifetimeInterest()) == null || kotlin.text.StringsKt.isBlank(moneyData2.getValue()) || kotlin.text.StringsKt.isBlank(moneyData2.getCurrencyCode())) {
                        moneyData2 = null;
                    }
                    if (moneyData == null || moneyData2 == null) {
                        return null;
                    }
                    java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(moneyData.getValue());
                    double doubleValue = doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d;
                    java.lang.Double doubleOrNull2 = kotlin.text.StringsKt.toDoubleOrNull(moneyData2.getValue());
                    double doubleValue2 = doubleOrNull2 != null ? doubleOrNull2.doubleValue() : 0.0d;
                    java.lang.String currencyCode = moneyData.getCurrencyCode();
                    savingsHubComponentRegistry$createInterestTile$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsInterestData);
                    savingsHubComponentRegistry$createInterestTile$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(moneyData);
                    savingsHubComponentRegistry$createInterestTile$1.Camera2StreamConfigurationMap = moneyData2;
                    savingsHubComponentRegistry$createInterestTile$1.getHighResolutionOutputSizeshNQ4ISI = doubleValue;
                    savingsHubComponentRegistry$createInterestTile$1.getHighSpeedVideoFpsRangesFor = doubleValue2;
                    savingsHubComponentRegistry$createInterestTile$1.getInputFormats = 1;
                    obj = getHighSpeedVideoSizes(doubleValue, currencyCode, savingsHubComponentRegistry$createInterestTile$1);
                    if (obj != coroutine_suspended) {
                        double d3 = doubleValue;
                        savingsInterestData2 = savingsInterestData;
                        moneyData3 = moneyData2;
                        d = doubleValue2;
                        d2 = d3;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    double d4 = savingsHubComponentRegistry$createInterestTile$1.getHighSpeedVideoFpsRangesFor;
                    double d5 = savingsHubComponentRegistry$createInterestTile$1.getHighResolutionOutputSizeshNQ4ISI;
                    str = (java.lang.String) savingsHubComponentRegistry$createInterestTile$1.getHighSpeedVideoSizesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.InterestDTO(str, (java.lang.String) obj);
                }
                d = savingsHubComponentRegistry$createInterestTile$1.getHighSpeedVideoFpsRangesFor;
                d2 = savingsHubComponentRegistry$createInterestTile$1.getHighResolutionOutputSizeshNQ4ISI;
                moneyData3 = (com.paypal.oslo.feature.savings.domain.model.MoneyData) savingsHubComponentRegistry$createInterestTile$1.Camera2StreamConfigurationMap;
                moneyData = (com.paypal.oslo.feature.savings.domain.model.MoneyData) savingsHubComponentRegistry$createInterestTile$1.getHighSpeedVideoFpsRanges;
                savingsInterestData2 = (com.paypal.oslo.feature.savings.domain.model.SavingsInterestData) savingsHubComponentRegistry$createInterestTile$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String str2 = (java.lang.String) obj;
                java.lang.String currencyCode2 = moneyData3.getCurrencyCode();
                savingsHubComponentRegistry$createInterestTile$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsInterestData2);
                savingsHubComponentRegistry$createInterestTile$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(moneyData);
                savingsHubComponentRegistry$createInterestTile$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(moneyData3);
                savingsHubComponentRegistry$createInterestTile$1.getHighSpeedVideoSizesFor = str2;
                savingsHubComponentRegistry$createInterestTile$1.getHighResolutionOutputSizeshNQ4ISI = d2;
                savingsHubComponentRegistry$createInterestTile$1.getHighSpeedVideoFpsRangesFor = d;
                savingsHubComponentRegistry$createInterestTile$1.getInputFormats = 2;
                highSpeedVideoSizes = getHighSpeedVideoSizes(d, currencyCode2, savingsHubComponentRegistry$createInterestTile$1);
                if (highSpeedVideoSizes != coroutine_suspended) {
                    obj = highSpeedVideoSizes;
                    str = str2;
                    return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.InterestDTO(str, (java.lang.String) obj);
                }
                return coroutine_suspended;
            }
        }
        savingsHubComponentRegistry$createInterestTile$1 = new com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$createInterestTile$1(this, continuation);
        java.lang.Object obj2 = savingsHubComponentRegistry$createInterestTile$1.getInputSizeshNQ4ISI;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsHubComponentRegistry$createInterestTile$1.getInputFormats;
        if (i != 0) {
        }
        java.lang.String str22 = (java.lang.String) obj2;
        java.lang.String currencyCode22 = moneyData3.getCurrencyCode();
        savingsHubComponentRegistry$createInterestTile$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsInterestData2);
        savingsHubComponentRegistry$createInterestTile$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(moneyData);
        savingsHubComponentRegistry$createInterestTile$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(moneyData3);
        savingsHubComponentRegistry$createInterestTile$1.getHighSpeedVideoSizesFor = str22;
        savingsHubComponentRegistry$createInterestTile$1.getHighResolutionOutputSizeshNQ4ISI = d2;
        savingsHubComponentRegistry$createInterestTile$1.getHighSpeedVideoFpsRangesFor = d;
        savingsHubComponentRegistry$createInterestTile$1.getInputFormats = 2;
        highSpeedVideoSizes = getHighSpeedVideoSizes(d, currencyCode22, savingsHubComponentRegistry$createInterestTile$1);
        if (highSpeedVideoSizes != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.Set] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x015f -> B:11:0x0160). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(java.util.List<com.paypal.oslo.feature.savings.domain.model.MoneyboxData> list, com.paypal.oslo.feature.savings.domain.model.MoneyboxData moneyboxData, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO> continuation) {
        com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$createGoalsTile$1 savingsHubComponentRegistry$createGoalsTile$1;
        int i;
        java.util.ArrayList arrayList;
        java.util.LinkedHashSet linkedHashSet;
        com.paypal.oslo.feature.savings.domain.model.MoneyboxData moneyboxData2;
        java.util.List<com.paypal.oslo.feature.savings.domain.model.MoneyboxData> list2;
        java.lang.Object Camera2StreamConfigurationMap;
        java.util.ArrayList arrayList2;
        java.util.Iterator it;
        java.lang.Iterable iterable;
        int i2;
        com.paypal.oslo.feature.savings.domain.model.MoneyboxData moneyboxData3;
        java.util.List<com.paypal.oslo.feature.savings.domain.model.MoneyboxData> list3;
        java.util.Set set;
        java.util.ArrayList arrayList3;
        com.paypal.oslo.feature.savings.domain.model.MoneyboxData moneyboxData4 = moneyboxData;
        boolean z2 = z;
        if (continuation instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$createGoalsTile$1) {
            savingsHubComponentRegistry$createGoalsTile$1 = (com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$createGoalsTile$1) continuation;
            if ((savingsHubComponentRegistry$createGoalsTile$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                savingsHubComponentRegistry$createGoalsTile$1.getOutputSizes -= 2147483648;
                java.lang.Object obj = savingsHubComponentRegistry$createGoalsTile$1.getOutputStallDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsHubComponentRegistry$createGoalsTile$1.getOutputSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrayList = new java.util.ArrayList();
                    linkedHashSet = new java.util.LinkedHashSet();
                    if (moneyboxData4 != null) {
                        savingsHubComponentRegistry$createGoalsTile$1.getHighSpeedVideoSizes = list;
                        savingsHubComponentRegistry$createGoalsTile$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(moneyboxData);
                        savingsHubComponentRegistry$createGoalsTile$1.Camera2StreamConfigurationMap = arrayList;
                        savingsHubComponentRegistry$createGoalsTile$1.getOutputMinFrameDuration = linkedHashSet;
                        savingsHubComponentRegistry$createGoalsTile$1.getOutputFormats = moneyboxData4;
                        savingsHubComponentRegistry$createGoalsTile$1.getHighSpeedVideoSizesFor = arrayList;
                        savingsHubComponentRegistry$createGoalsTile$1.getOutputMinFrameDurationlomOqCM = z2;
                        savingsHubComponentRegistry$createGoalsTile$1.getHighSpeedVideoFpsRangesFor = 0;
                        savingsHubComponentRegistry$createGoalsTile$1.getOutputSizes = 1;
                        Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(moneyboxData4, z2, savingsHubComponentRegistry$createGoalsTile$1);
                        if (Camera2StreamConfigurationMap != coroutine_suspended) {
                            moneyboxData2 = moneyboxData4;
                            list2 = list;
                            arrayList2 = arrayList;
                        }
                        return coroutine_suspended;
                    }
                    moneyboxData2 = moneyboxData4;
                    list2 = list;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : list2) {
                        if (getHighSpeedVideoSizes((com.paypal.oslo.feature.savings.domain.model.MoneyboxData) obj2)) {
                            arrayList4.add(obj2);
                        }
                    }
                    java.util.List sortedWith = kotlin.collections.CollectionsKt.sortedWith(arrayList4, new java.util.Comparator() { // from class: com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$createGoalsTile$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            java.lang.String str;
                            java.lang.String name2 = ((com.paypal.oslo.feature.savings.domain.model.MoneyboxData) t).getName();
                            java.lang.String str2 = null;
                            if (name2 != null) {
                                str = name2.toLowerCase(java.util.Locale.ROOT);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                            } else {
                                str = null;
                            }
                            java.lang.String str3 = str;
                            java.lang.String name3 = ((com.paypal.oslo.feature.savings.domain.model.MoneyboxData) t2).getName();
                            if (name3 != null) {
                                str2 = name3.toLowerCase(java.util.Locale.ROOT);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
                            }
                            return kotlin.comparisons.ComparisonsKt.compareValues(str3, str2);
                        }
                    });
                    it = sortedWith.iterator();
                    iterable = sortedWith;
                    i2 = 0;
                    moneyboxData3 = moneyboxData2;
                    list3 = list2;
                    set = linkedHashSet;
                    arrayList3 = arrayList;
                    while (it.hasNext()) {
                    }
                    if (arrayList3.isEmpty()) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i3 = savingsHubComponentRegistry$createGoalsTile$1.getHighResolutionOutputSizeshNQ4ISI;
                        i2 = savingsHubComponentRegistry$createGoalsTile$1.getHighSpeedVideoFpsRangesFor;
                        z2 = savingsHubComponentRegistry$createGoalsTile$1.getOutputMinFrameDurationlomOqCM;
                        arrayList3 = (java.util.ArrayList) savingsHubComponentRegistry$createGoalsTile$1.getOutputStallDurationlomOqCM;
                        java.lang.Object obj3 = savingsHubComponentRegistry$createGoalsTile$1.getInputSizeshNQ4ISI;
                        it = (java.util.Iterator) savingsHubComponentRegistry$createGoalsTile$1.getHighSpeedVideoSizesFor;
                        iterable = (java.lang.Iterable) savingsHubComponentRegistry$createGoalsTile$1.getOutputFormats;
                        set = (java.util.Set) savingsHubComponentRegistry$createGoalsTile$1.getOutputMinFrameDuration;
                        java.util.ArrayList arrayList5 = (java.util.ArrayList) savingsHubComponentRegistry$createGoalsTile$1.Camera2StreamConfigurationMap;
                        moneyboxData3 = (com.paypal.oslo.feature.savings.domain.model.MoneyboxData) savingsHubComponentRegistry$createGoalsTile$1.getHighSpeedVideoFpsRanges;
                        list3 = (java.util.List) savingsHubComponentRegistry$createGoalsTile$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        arrayList3.add(obj);
                        arrayList3 = arrayList5;
                        while (it.hasNext()) {
                            java.lang.Object next = it.next();
                            com.paypal.oslo.feature.savings.domain.model.MoneyboxData moneyboxData5 = (com.paypal.oslo.feature.savings.domain.model.MoneyboxData) next;
                            if (set.add(moneyboxData5.getId())) {
                                savingsHubComponentRegistry$createGoalsTile$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list3);
                                savingsHubComponentRegistry$createGoalsTile$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(moneyboxData3);
                                savingsHubComponentRegistry$createGoalsTile$1.Camera2StreamConfigurationMap = arrayList3;
                                savingsHubComponentRegistry$createGoalsTile$1.getOutputMinFrameDuration = set;
                                savingsHubComponentRegistry$createGoalsTile$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable);
                                savingsHubComponentRegistry$createGoalsTile$1.getHighSpeedVideoSizesFor = it;
                                savingsHubComponentRegistry$createGoalsTile$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                                savingsHubComponentRegistry$createGoalsTile$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(moneyboxData5);
                                savingsHubComponentRegistry$createGoalsTile$1.getOutputStallDurationlomOqCM = arrayList3;
                                savingsHubComponentRegistry$createGoalsTile$1.getOutputMinFrameDurationlomOqCM = z2;
                                savingsHubComponentRegistry$createGoalsTile$1.getHighSpeedVideoFpsRangesFor = i2;
                                savingsHubComponentRegistry$createGoalsTile$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                savingsHubComponentRegistry$createGoalsTile$1.getOutputSizes = 2;
                                obj = getHighSpeedVideoSizes(moneyboxData5, z2, savingsHubComponentRegistry$createGoalsTile$1);
                                if (obj != coroutine_suspended) {
                                    arrayList5 = arrayList3;
                                    arrayList3.add(obj);
                                    arrayList3 = arrayList5;
                                    while (it.hasNext()) {
                                    }
                                }
                                return coroutine_suspended;
                            }
                        }
                        if (arrayList3.isEmpty()) {
                            return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO(new java.util.ArrayList(arrayList3));
                        }
                        return null;
                    }
                    int i4 = savingsHubComponentRegistry$createGoalsTile$1.getHighSpeedVideoFpsRangesFor;
                    boolean z3 = savingsHubComponentRegistry$createGoalsTile$1.getOutputMinFrameDurationlomOqCM;
                    java.util.ArrayList arrayList6 = (java.util.ArrayList) savingsHubComponentRegistry$createGoalsTile$1.getHighSpeedVideoSizesFor;
                    com.paypal.oslo.feature.savings.domain.model.MoneyboxData moneyboxData6 = (com.paypal.oslo.feature.savings.domain.model.MoneyboxData) savingsHubComponentRegistry$createGoalsTile$1.getOutputFormats;
                    ?? r8 = (java.util.Set) savingsHubComponentRegistry$createGoalsTile$1.getOutputMinFrameDuration;
                    arrayList2 = (java.util.ArrayList) savingsHubComponentRegistry$createGoalsTile$1.Camera2StreamConfigurationMap;
                    moneyboxData2 = (com.paypal.oslo.feature.savings.domain.model.MoneyboxData) savingsHubComponentRegistry$createGoalsTile$1.getHighSpeedVideoFpsRanges;
                    list2 = (java.util.List) savingsHubComponentRegistry$createGoalsTile$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    z2 = z3;
                    moneyboxData4 = moneyboxData6;
                    linkedHashSet = r8;
                    Camera2StreamConfigurationMap = obj;
                    arrayList = arrayList6;
                }
                arrayList.add(Camera2StreamConfigurationMap);
                kotlin.coroutines.jvm.internal.Boxing.boxBoolean(linkedHashSet.add(moneyboxData4.getId()));
                arrayList = arrayList2;
                java.util.ArrayList arrayList42 = new java.util.ArrayList();
                while (r1.hasNext()) {
                }
                java.util.List sortedWith2 = kotlin.collections.CollectionsKt.sortedWith(arrayList42, new java.util.Comparator() { // from class: com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$createGoalsTile$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        java.lang.String str;
                        java.lang.String name2 = ((com.paypal.oslo.feature.savings.domain.model.MoneyboxData) t).getName();
                        java.lang.String str2 = null;
                        if (name2 != null) {
                            str = name2.toLowerCase(java.util.Locale.ROOT);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                        } else {
                            str = null;
                        }
                        java.lang.String str3 = str;
                        java.lang.String name3 = ((com.paypal.oslo.feature.savings.domain.model.MoneyboxData) t2).getName();
                        if (name3 != null) {
                            str2 = name3.toLowerCase(java.util.Locale.ROOT);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
                        }
                        return kotlin.comparisons.ComparisonsKt.compareValues(str3, str2);
                    }
                });
                it = sortedWith2.iterator();
                iterable = sortedWith2;
                i2 = 0;
                moneyboxData3 = moneyboxData2;
                list3 = list2;
                set = linkedHashSet;
                arrayList3 = arrayList;
                while (it.hasNext()) {
                }
                if (arrayList3.isEmpty()) {
                }
            }
        }
        savingsHubComponentRegistry$createGoalsTile$1 = new com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$createGoalsTile$1(this, continuation);
        java.lang.Object obj4 = savingsHubComponentRegistry$createGoalsTile$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsHubComponentRegistry$createGoalsTile$1.getOutputSizes;
        if (i != 0) {
        }
        arrayList.add(Camera2StreamConfigurationMap);
        kotlin.coroutines.jvm.internal.Boxing.boxBoolean(linkedHashSet.add(moneyboxData4.getId()));
        arrayList = arrayList2;
        java.util.ArrayList arrayList422 = new java.util.ArrayList();
        while (r1.hasNext()) {
        }
        java.util.List sortedWith22 = kotlin.collections.CollectionsKt.sortedWith(arrayList422, new java.util.Comparator() { // from class: com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$createGoalsTile$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                java.lang.String str;
                java.lang.String name2 = ((com.paypal.oslo.feature.savings.domain.model.MoneyboxData) t).getName();
                java.lang.String str2 = null;
                if (name2 != null) {
                    str = name2.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                } else {
                    str = null;
                }
                java.lang.String str3 = str;
                java.lang.String name3 = ((com.paypal.oslo.feature.savings.domain.model.MoneyboxData) t2).getName();
                if (name3 != null) {
                    str2 = name3.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
                }
                return kotlin.comparisons.ComparisonsKt.compareValues(str3, str2);
            }
        });
        it = sortedWith22.iterator();
        iterable = sortedWith22;
        i2 = 0;
        moneyboxData3 = moneyboxData2;
        list3 = list2;
        set = linkedHashSet;
        arrayList3 = arrayList;
        while (it.hasNext()) {
        }
        if (arrayList3.isEmpty()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(com.paypal.oslo.feature.savings.domain.model.MoneyboxData moneyboxData, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> continuation) {
        com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$createGeneralSavingsGoal$1 savingsHubComponentRegistry$createGeneralSavingsGoal$1;
        int i;
        java.lang.String str;
        java.lang.String id;
        java.lang.String str2;
        com.paypal.oslo.feature.savings.domain.model.MoneyboxData moneyboxData2;
        java.lang.String str3;
        boolean z2;
        java.lang.String value;
        java.lang.Double doubleOrNull;
        if (continuation instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$createGeneralSavingsGoal$1) {
            savingsHubComponentRegistry$createGeneralSavingsGoal$1 = (com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$createGeneralSavingsGoal$1) continuation;
            if ((savingsHubComponentRegistry$createGeneralSavingsGoal$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                savingsHubComponentRegistry$createGeneralSavingsGoal$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = savingsHubComponentRegistry$createGeneralSavingsGoal$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsHubComponentRegistry$createGeneralSavingsGoal$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.model.MoneyData currentBalance = moneyboxData.getCurrentBalance();
                    double doubleValue = (currentBalance == null || (value = currentBalance.getValue()) == null || (doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(value)) == null) ? 0.0d : doubleOrNull.doubleValue();
                    com.paypal.oslo.feature.savings.domain.model.MoneyData currentBalance2 = moneyboxData.getCurrentBalance();
                    if (currentBalance2 == null || (str = currentBalance2.getCurrencyCode()) == null) {
                        str = "USD";
                    }
                    id = moneyboxData.getId();
                    java.lang.String name2 = moneyboxData.getName();
                    if (name2 == null) {
                        name2 = "General Savings";
                    }
                    savingsHubComponentRegistry$createGeneralSavingsGoal$1.getHighSpeedVideoFpsRanges = moneyboxData;
                    savingsHubComponentRegistry$createGeneralSavingsGoal$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    savingsHubComponentRegistry$createGeneralSavingsGoal$1.getHighSpeedVideoFpsRangesFor = id;
                    savingsHubComponentRegistry$createGeneralSavingsGoal$1.Camera2StreamConfigurationMap = name2;
                    savingsHubComponentRegistry$createGeneralSavingsGoal$1.getInputFormats = "NoIcon";
                    savingsHubComponentRegistry$createGeneralSavingsGoal$1.getHighSpeedVideoSizesFor = z;
                    savingsHubComponentRegistry$createGeneralSavingsGoal$1.getHighSpeedVideoSizes = doubleValue;
                    savingsHubComponentRegistry$createGeneralSavingsGoal$1.getOutputMinFrameDuration = 1;
                    obj = getHighSpeedVideoSizes(doubleValue, str, savingsHubComponentRegistry$createGeneralSavingsGoal$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str2 = name2;
                    moneyboxData2 = moneyboxData;
                    str3 = "NoIcon";
                    z2 = z;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    double d = savingsHubComponentRegistry$createGeneralSavingsGoal$1.getHighSpeedVideoSizes;
                    boolean z3 = savingsHubComponentRegistry$createGeneralSavingsGoal$1.getHighSpeedVideoSizesFor;
                    java.lang.String str4 = (java.lang.String) savingsHubComponentRegistry$createGeneralSavingsGoal$1.getInputFormats;
                    str2 = (java.lang.String) savingsHubComponentRegistry$createGeneralSavingsGoal$1.Camera2StreamConfigurationMap;
                    java.lang.String str5 = (java.lang.String) savingsHubComponentRegistry$createGeneralSavingsGoal$1.getHighSpeedVideoFpsRangesFor;
                    moneyboxData2 = (com.paypal.oslo.feature.savings.domain.model.MoneyboxData) savingsHubComponentRegistry$createGeneralSavingsGoal$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    z2 = z3;
                    str3 = str4;
                    id = str5;
                }
                java.lang.String str6 = (java.lang.String) obj;
                com.paypal.oslo.feature.savings.domain.model.TransferSettingsData transferSettings = moneyboxData2.getTransferSettings();
                return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO(id, str2, str3, str6, (java.lang.String) null, 0.0d, kotlin.jvm.internal.Intrinsics.areEqual(transferSettings == null ? transferSettings.getStatus() : null, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING), true, moneyboxData2.getTransferSettings(), (com.paypal.oslo.feature.savings.domain.model.transfers.Money) null, z2, (com.paypal.oslo.feature.savings.domain.model.transfers.Money) null, 2560, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            }
        }
        savingsHubComponentRegistry$createGeneralSavingsGoal$1 = new com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$createGeneralSavingsGoal$1(this, continuation);
        java.lang.Object obj2 = savingsHubComponentRegistry$createGeneralSavingsGoal$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsHubComponentRegistry$createGeneralSavingsGoal$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        java.lang.String str62 = (java.lang.String) obj2;
        com.paypal.oslo.feature.savings.domain.model.TransferSettingsData transferSettings2 = moneyboxData2.getTransferSettings();
        return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO(id, str2, str3, str62, (java.lang.String) null, 0.0d, kotlin.jvm.internal.Intrinsics.areEqual(transferSettings2 == null ? transferSettings2.getStatus() : null, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING), true, moneyboxData2.getTransferSettings(), (com.paypal.oslo.feature.savings.domain.model.transfers.Money) null, z2, (com.paypal.oslo.feature.savings.domain.model.transfers.Money) null, 2560, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.savings.domain.model.MoneyboxData moneyboxData, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> continuation) {
        com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$createGoalMoneyboxDTO$1 savingsHubComponentRegistry$createGoalMoneyboxDTO$1;
        int i;
        com.paypal.oslo.feature.savings.domain.model.MoneyData currentBalance;
        float floatValue;
        java.lang.Float floatOrNull;
        double floatValue2;
        double d;
        java.lang.String currencyCode;
        java.lang.String id;
        com.paypal.oslo.feature.savings.domain.model.MoneyboxData moneyboxData2;
        boolean z2;
        java.lang.String str;
        java.lang.String value;
        java.lang.String str2;
        java.lang.String str3;
        double d2;
        boolean z3;
        java.lang.String str4;
        java.lang.String str5;
        double d3;
        java.lang.String str6;
        java.lang.String str7;
        boolean z4;
        java.lang.String str8;
        com.paypal.oslo.feature.savings.domain.model.MoneyboxData moneyboxData3;
        if (continuation instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$createGoalMoneyboxDTO$1) {
            savingsHubComponentRegistry$createGoalMoneyboxDTO$1 = (com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$createGoalMoneyboxDTO$1) continuation;
            if ((savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getOutputSizes -= 2147483648;
                java.lang.Object obj = savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getOutputSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    currentBalance = moneyboxData.getCurrentBalance();
                    if (currentBalance == null) {
                        throw new java.lang.IllegalStateException("currentBalance should not be null".toString());
                    }
                    java.lang.String name2 = moneyboxData.getName();
                    if (name2 == null) {
                        throw new java.lang.IllegalStateException("name should not be null".toString());
                    }
                    java.lang.Float floatOrNull2 = kotlin.text.StringsKt.toFloatOrNull(currentBalance.getValue());
                    floatValue = floatOrNull2 != null ? floatOrNull2.floatValue() : 0.0f;
                    com.paypal.oslo.feature.savings.domain.model.MoneyData targetAmount = moneyboxData.getTargetAmount();
                    floatOrNull = (targetAmount == null || (value = targetAmount.getValue()) == null) ? null : kotlin.text.StringsKt.toFloatOrNull(value);
                    floatValue2 = (floatOrNull == null || floatOrNull.floatValue() <= 0.0f) ? 0.0d : (floatValue / floatOrNull.floatValue()) * 100.0d;
                    d = floatValue;
                    currencyCode = currentBalance.getCurrencyCode();
                    id = moneyboxData.getId();
                    moneyboxData2 = moneyboxData;
                    savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getHighResolutionOutputSizeshNQ4ISI = moneyboxData2;
                    savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currentBalance);
                    savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getOutputMinFrameDuration = name2;
                    savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getInputSizeshNQ4ISI = floatOrNull;
                    savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyCode);
                    savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getOutputFormats = id;
                    z2 = z;
                    savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getOutputStallDuration = z2;
                    savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getHighSpeedVideoFpsRangesFor = floatValue;
                    savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getHighSpeedVideoSizes = floatValue2;
                    savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getHighSpeedVideoFpsRanges = d;
                    savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getOutputSizes = 1;
                    java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(d, currencyCode, savingsHubComponentRegistry$createGoalMoneyboxDTO$1);
                    if (highSpeedVideoSizes != coroutine_suspended) {
                        str = name2;
                        obj = highSpeedVideoSizes;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    double d4 = savingsHubComponentRegistry$createGoalMoneyboxDTO$1.Camera2StreamConfigurationMap;
                    double d5 = savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getHighSpeedVideoFpsRanges;
                    d3 = savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getHighSpeedVideoSizes;
                    float f = savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getHighSpeedVideoFpsRangesFor;
                    z4 = savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getOutputStallDuration;
                    str8 = (java.lang.String) savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getOutputMinFrameDurationlomOqCM;
                    str6 = (java.lang.String) savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getOutputFormats;
                    str7 = (java.lang.String) savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getOutputMinFrameDuration;
                    moneyboxData3 = (com.paypal.oslo.feature.savings.domain.model.MoneyboxData) savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str4 = (java.lang.String) obj;
                    moneyboxData2 = moneyboxData3;
                    d2 = d3;
                    z3 = z4;
                    str2 = str8;
                    str3 = str6;
                    str = str7;
                    com.paypal.oslo.feature.savings.domain.model.TransferSettingsData transferSettings = moneyboxData2.getTransferSettings();
                    boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(transferSettings != null ? transferSettings.getStatus() : null, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING);
                    com.paypal.oslo.feature.savings.domain.model.TransferSettingsData transferSettings2 = moneyboxData2.getTransferSettings();
                    com.paypal.oslo.feature.savings.domain.model.MoneyData targetAmount2 = moneyboxData2.getTargetAmount();
                    com.paypal.oslo.feature.savings.domain.model.transfers.Money money = targetAmount2 != null ? new com.paypal.oslo.feature.savings.domain.model.transfers.Money(targetAmount2.getCurrencyCode(), targetAmount2.getValue()) : null;
                    com.paypal.oslo.feature.savings.domain.model.MoneyData currentBalance2 = moneyboxData2.getCurrentBalance();
                    return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO(str3, str, "Trophy", str2, str4, d2, areEqual, kotlin.jvm.internal.Intrinsics.areEqual(moneyboxData2.getCategory(), com.paypal.oslo.feature.savings.constants.SavingsConstants.GoalCategories.SAVINGS_NON_GOAL), transferSettings2, money, z3, new com.paypal.oslo.feature.savings.domain.model.transfers.Money(currentBalance2.getCurrencyCode(), currentBalance2.getValue()));
                }
                double d6 = savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getHighSpeedVideoFpsRanges;
                double d7 = savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getHighSpeedVideoSizes;
                floatValue = savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getHighSpeedVideoFpsRangesFor;
                boolean z5 = savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getOutputStallDuration;
                java.lang.String str9 = (java.lang.String) savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getOutputFormats;
                currencyCode = (java.lang.String) savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getInputFormats;
                floatOrNull = (java.lang.Float) savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getInputSizeshNQ4ISI;
                java.lang.String str10 = (java.lang.String) savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getOutputMinFrameDuration;
                currentBalance = (com.paypal.oslo.feature.savings.domain.model.MoneyData) savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getHighSpeedVideoSizesFor;
                com.paypal.oslo.feature.savings.domain.model.MoneyboxData moneyboxData4 = (com.paypal.oslo.feature.savings.domain.model.MoneyboxData) savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                moneyboxData2 = moneyboxData4;
                id = str9;
                z2 = z5;
                str = str10;
                floatValue2 = d7;
                d = d6;
                java.lang.String str11 = (java.lang.String) obj;
                if (floatOrNull == null) {
                    double d8 = d;
                    double floatValue3 = floatOrNull.floatValue();
                    com.paypal.oslo.feature.savings.domain.model.MoneyData targetAmount3 = moneyboxData2.getTargetAmount();
                    if (targetAmount3 == null || (str5 = targetAmount3.getCurrencyCode()) == null) {
                        str5 = "USD";
                    }
                    savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getHighResolutionOutputSizeshNQ4ISI = moneyboxData2;
                    savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currentBalance);
                    savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getOutputMinFrameDuration = str;
                    savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(floatOrNull);
                    savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyCode);
                    savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getOutputFormats = id;
                    savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getOutputMinFrameDurationlomOqCM = str11;
                    savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
                    savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getOutputStallDuration = z2;
                    savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getHighSpeedVideoFpsRangesFor = floatValue;
                    savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getHighSpeedVideoSizes = floatValue2;
                    savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getHighSpeedVideoFpsRanges = d8;
                    savingsHubComponentRegistry$createGoalMoneyboxDTO$1.Camera2StreamConfigurationMap = floatValue3;
                    savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getOutputSizes = 2;
                    java.lang.Object highSpeedVideoSizes2 = getHighSpeedVideoSizes(floatValue3, str5, savingsHubComponentRegistry$createGoalMoneyboxDTO$1);
                    coroutine_suspended = coroutine_suspended;
                    if (highSpeedVideoSizes2 != coroutine_suspended) {
                        d3 = floatValue2;
                        str6 = id;
                        str7 = str;
                        z4 = z2;
                        str8 = str11;
                        obj = highSpeedVideoSizes2;
                        moneyboxData3 = moneyboxData2;
                        str4 = (java.lang.String) obj;
                        moneyboxData2 = moneyboxData3;
                        d2 = d3;
                        z3 = z4;
                        str2 = str8;
                        str3 = str6;
                        str = str7;
                        com.paypal.oslo.feature.savings.domain.model.TransferSettingsData transferSettings3 = moneyboxData2.getTransferSettings();
                        boolean areEqual2 = kotlin.jvm.internal.Intrinsics.areEqual(transferSettings3 != null ? transferSettings3.getStatus() : null, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING);
                        com.paypal.oslo.feature.savings.domain.model.TransferSettingsData transferSettings22 = moneyboxData2.getTransferSettings();
                        com.paypal.oslo.feature.savings.domain.model.MoneyData targetAmount22 = moneyboxData2.getTargetAmount();
                        if (targetAmount22 != null) {
                        }
                        com.paypal.oslo.feature.savings.domain.model.MoneyData currentBalance22 = moneyboxData2.getCurrentBalance();
                        return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO(str3, str, "Trophy", str2, str4, d2, areEqual2, kotlin.jvm.internal.Intrinsics.areEqual(moneyboxData2.getCategory(), com.paypal.oslo.feature.savings.constants.SavingsConstants.GoalCategories.SAVINGS_NON_GOAL), transferSettings22, money, z3, new com.paypal.oslo.feature.savings.domain.model.transfers.Money(currentBalance22.getCurrencyCode(), currentBalance22.getValue()));
                    }
                    return coroutine_suspended;
                }
                str2 = str11;
                str3 = id;
                d2 = floatValue2;
                z3 = z2;
                str4 = null;
                com.paypal.oslo.feature.savings.domain.model.TransferSettingsData transferSettings32 = moneyboxData2.getTransferSettings();
                boolean areEqual22 = kotlin.jvm.internal.Intrinsics.areEqual(transferSettings32 != null ? transferSettings32.getStatus() : null, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING);
                com.paypal.oslo.feature.savings.domain.model.TransferSettingsData transferSettings222 = moneyboxData2.getTransferSettings();
                com.paypal.oslo.feature.savings.domain.model.MoneyData targetAmount222 = moneyboxData2.getTargetAmount();
                if (targetAmount222 != null) {
                }
                com.paypal.oslo.feature.savings.domain.model.MoneyData currentBalance222 = moneyboxData2.getCurrentBalance();
                return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO(str3, str, "Trophy", str2, str4, d2, areEqual22, kotlin.jvm.internal.Intrinsics.areEqual(moneyboxData2.getCategory(), com.paypal.oslo.feature.savings.constants.SavingsConstants.GoalCategories.SAVINGS_NON_GOAL), transferSettings222, money, z3, new com.paypal.oslo.feature.savings.domain.model.transfers.Money(currentBalance222.getCurrencyCode(), currentBalance222.getValue()));
            }
        }
        savingsHubComponentRegistry$createGoalMoneyboxDTO$1 = new com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$createGoalMoneyboxDTO$1(this, continuation);
        java.lang.Object obj2 = savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsHubComponentRegistry$createGoalMoneyboxDTO$1.getOutputSizes;
        if (i != 0) {
        }
        java.lang.String str112 = (java.lang.String) obj2;
        if (floatOrNull == null) {
        }
    }

    private static boolean getHighSpeedVideoSizes(com.paypal.oslo.feature.savings.domain.model.MoneyboxData p0) {
        java.lang.String name2;
        return (kotlin.text.StringsKt.isBlank(p0.getId()) || (name2 = p0.getName()) == null || kotlin.text.StringsKt.isBlank(name2) || p0.getCurrentBalance() == null || kotlin.text.StringsKt.isBlank(p0.getCurrentBalance().getValue()) || kotlin.text.StringsKt.isBlank(p0.getCurrentBalance().getCurrencyCode())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(double d, java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$formatCurrency$1 savingsHubComponentRegistry$formatCurrency$1;
        int i;
        java.lang.String str2;
        double d2 = d;
        if (continuation instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$formatCurrency$1) {
            savingsHubComponentRegistry$formatCurrency$1 = (com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$formatCurrency$1) continuation;
            if ((savingsHubComponentRegistry$formatCurrency$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                savingsHubComponentRegistry$formatCurrency$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = savingsHubComponentRegistry$formatCurrency$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsHubComponentRegistry$formatCurrency$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl currencyHandlerImpl = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration currencyConfiguration = new com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration(com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(str), com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.SYMBOL, 2, null, null, 24, null);
                    savingsHubComponentRegistry$formatCurrency$1.getHighSpeedVideoSizes = str;
                    savingsHubComponentRegistry$formatCurrency$1.Camera2StreamConfigurationMap = d2;
                    savingsHubComponentRegistry$formatCurrency$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = currencyHandlerImpl.format(d2, currencyConfiguration, savingsHubComponentRegistry$formatCurrency$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str2 = str;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d2 = savingsHubComponentRegistry$formatCurrency$1.Camera2StreamConfigurationMap;
                    str2 = (java.lang.String) savingsHubComponentRegistry$formatCurrency$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.String str3 = (java.lang.String) ((arrow.core.Either) obj).getOrNull();
                return str3 != null ? com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl.INSTANCE.formatCurrency(d2, str2) : str3;
            }
        }
        savingsHubComponentRegistry$formatCurrency$1 = new com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$formatCurrency$1(this, continuation);
        java.lang.Object obj2 = savingsHubComponentRegistry$formatCurrency$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsHubComponentRegistry$formatCurrency$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        java.lang.String str32 = (java.lang.String) ((arrow.core.Either) obj2).getOrNull();
        if (str32 != null) {
        }
    }
}
