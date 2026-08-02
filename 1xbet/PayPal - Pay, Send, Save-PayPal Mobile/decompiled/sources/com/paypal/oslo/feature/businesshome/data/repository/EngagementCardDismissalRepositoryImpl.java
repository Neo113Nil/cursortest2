package com.paypal.oslo.feature.businesshome.data.repository;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u0010H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/data/repository/EngagementCardDismissalRepositoryImpl;", "Lcom/paypal/oslo/feature/businesshome/domain/repository/EngagementCardDismissalRepository;", "Lcom/paypal/oslo/feature/businesshome/data/local/DismissedCardsStorage;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "<init>", "(Lcom/paypal/oslo/feature/businesshome/data/local/DismissedCardsStorage;)V", "", "cardId", "", "dismissedAtMillis", "", "dismissCard", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/businesshome/domain/model/CardDismissalInfo;", "getDismissalInfo", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getAllDismissals", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/businesshome/data/local/DismissedCardsStorage;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EngagementCardDismissalRepositoryImpl implements com.paypal.oslo.feature.businesshome.domain.repository.EngagementCardDismissalRepository {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorage getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public EngagementCardDismissalRepositoryImpl(com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorage dismissedCardsStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dismissedCardsStorage, "");
        this.getHighSpeedVideoFpsRangesFor = dismissedCardsStorage;
    }

    @Override // com.paypal.oslo.feature.businesshome.domain.repository.EngagementCardDismissalRepository
    public final java.lang.Object dismissCard(java.lang.String str, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object dismissedCard = this.getHighSpeedVideoFpsRangesFor.setDismissedCard(str, j, continuation);
        return dismissedCard == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? dismissedCard : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.businesshome.domain.repository.EngagementCardDismissalRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getDismissalInfo(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesshome.domain.model.CardDismissalInfo> continuation) {
        com.paypal.oslo.feature.businesshome.data.repository.EngagementCardDismissalRepositoryImpl$getDismissalInfo$1 engagementCardDismissalRepositoryImpl$getDismissalInfo$1;
        int i;
        java.lang.Long l;
        if (continuation instanceof com.paypal.oslo.feature.businesshome.data.repository.EngagementCardDismissalRepositoryImpl$getDismissalInfo$1) {
            engagementCardDismissalRepositoryImpl$getDismissalInfo$1 = (com.paypal.oslo.feature.businesshome.data.repository.EngagementCardDismissalRepositoryImpl$getDismissalInfo$1) continuation;
            if ((engagementCardDismissalRepositoryImpl$getDismissalInfo$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                engagementCardDismissalRepositoryImpl$getDismissalInfo$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = engagementCardDismissalRepositoryImpl$getDismissalInfo$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = engagementCardDismissalRepositoryImpl$getDismissalInfo$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorage dismissedCardsStorage = this.getHighSpeedVideoFpsRangesFor;
                    engagementCardDismissalRepositoryImpl$getDismissalInfo$1.getHighResolutionOutputSizeshNQ4ISI = str;
                    engagementCardDismissalRepositoryImpl$getDismissalInfo$1.getHighSpeedVideoFpsRanges = 1;
                    obj = dismissedCardsStorage.getDismissedAtMillis(str, engagementCardDismissalRepositoryImpl$getDismissalInfo$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) engagementCardDismissalRepositoryImpl$getDismissalInfo$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                l = (java.lang.Long) obj;
                if (l == null) {
                    return new com.paypal.oslo.feature.businesshome.domain.model.CardDismissalInfo(str, l.longValue());
                }
                return null;
            }
        }
        engagementCardDismissalRepositoryImpl$getDismissalInfo$1 = new com.paypal.oslo.feature.businesshome.data.repository.EngagementCardDismissalRepositoryImpl$getDismissalInfo$1(this, continuation);
        java.lang.Object obj2 = engagementCardDismissalRepositoryImpl$getDismissalInfo$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = engagementCardDismissalRepositoryImpl$getDismissalInfo$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        l = (java.lang.Long) obj2;
        if (l == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061 A[LOOP:0: B:11:0x005b->B:13:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.businesshome.domain.repository.EngagementCardDismissalRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getAllDismissals(kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, com.paypal.oslo.feature.businesshome.domain.model.CardDismissalInfo>> continuation) {
        com.paypal.oslo.feature.businesshome.data.repository.EngagementCardDismissalRepositoryImpl$getAllDismissals$1 engagementCardDismissalRepositoryImpl$getAllDismissals$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.businesshome.data.repository.EngagementCardDismissalRepositoryImpl$getAllDismissals$1) {
            engagementCardDismissalRepositoryImpl$getAllDismissals$1 = (com.paypal.oslo.feature.businesshome.data.repository.EngagementCardDismissalRepositoryImpl$getAllDismissals$1) continuation;
            if ((engagementCardDismissalRepositoryImpl$getAllDismissals$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                engagementCardDismissalRepositoryImpl$getAllDismissals$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = engagementCardDismissalRepositoryImpl$getAllDismissals$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = engagementCardDismissalRepositoryImpl$getAllDismissals$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorage dismissedCardsStorage = this.getHighSpeedVideoFpsRangesFor;
                    engagementCardDismissalRepositoryImpl$getAllDismissals$1.getHighSpeedVideoSizes = 1;
                    obj = dismissedCardsStorage.getAllDismissedCards(engagementCardDismissalRepositoryImpl$getAllDismissals$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.util.Map map = (java.util.Map) obj;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(map.size()));
                for (java.util.Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), new com.paypal.oslo.feature.businesshome.domain.model.CardDismissalInfo((java.lang.String) entry.getKey(), ((java.lang.Number) entry.getValue()).longValue()));
                }
                return linkedHashMap;
            }
        }
        engagementCardDismissalRepositoryImpl$getAllDismissals$1 = new com.paypal.oslo.feature.businesshome.data.repository.EngagementCardDismissalRepositoryImpl$getAllDismissals$1(this, continuation);
        java.lang.Object obj2 = engagementCardDismissalRepositoryImpl$getAllDismissals$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = engagementCardDismissalRepositoryImpl$getAllDismissals$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        java.util.Map map2 = (java.util.Map) obj2;
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(map2.size()));
        while (r7.hasNext()) {
        }
        return linkedHashMap2;
    }
}
