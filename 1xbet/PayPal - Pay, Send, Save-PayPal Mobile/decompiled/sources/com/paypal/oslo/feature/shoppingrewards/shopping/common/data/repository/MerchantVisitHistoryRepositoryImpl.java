package com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/data/repository/MerchantVisitHistoryRepositoryImpl;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/repository/MerchantVisitHistoryRepository;", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "continueStorage", "<init>", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;)V", "", "merchantId", "", "isMerchantSeen", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "markMerchantAsSeen", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MerchantVisitHistoryRepositoryImpl implements com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.MerchantVisitHistoryRepository {
    private final com.paypal.oslo.core.persistence.appstorage.AppStorage getHighSpeedVideoFpsRangesFor;
    public static final int $stable = 8;

    @javax.inject.Inject
    public MerchantVisitHistoryRepositoryImpl(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStorage, "");
        this.getHighSpeedVideoFpsRangesFor = appStorage;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.MerchantVisitHistoryRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object isMerchantSeen(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MerchantVisitHistoryRepositoryImpl$isMerchantSeen$1 merchantVisitHistoryRepositoryImpl$isMerchantSeen$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MerchantVisitHistoryRepositoryImpl$isMerchantSeen$1) {
            merchantVisitHistoryRepositoryImpl$isMerchantSeen$1 = (com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MerchantVisitHistoryRepositoryImpl$isMerchantSeen$1) continuation;
            if ((merchantVisitHistoryRepositoryImpl$isMerchantSeen$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                merchantVisitHistoryRepositoryImpl$isMerchantSeen$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = merchantVisitHistoryRepositoryImpl$isMerchantSeen$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = merchantVisitHistoryRepositoryImpl$isMerchantSeen$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted("seen_merchants");
                    merchantVisitHistoryRepositoryImpl$isMerchantSeen$1.Camera2StreamConfigurationMap = str;
                    merchantVisitHistoryRepositoryImpl$isMerchantSeen$1.getHighSpeedVideoSizes = 1;
                    obj = appStorage.getStringSet(unencrypted, merchantVisitHistoryRepositoryImpl$isMerchantSeen$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) merchantVisitHistoryRepositoryImpl$isMerchantSeen$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.util.Set set = (java.util.Set) obj;
                boolean z = set == null && set.contains(str);
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.shoppingrewards.LoggerKt.log;
                kotlin.Pair[] pairArr = new kotlin.Pair[3];
                pairArr[0] = kotlin.TuplesKt.to("merchantId", str);
                pairArr[1] = kotlin.TuplesKt.to("isSeen", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z));
                pairArr[2] = kotlin.TuplesKt.to("totalSeenMerchants", kotlin.coroutines.jvm.internal.Boxing.boxInt(set != null ? set.size() : 0));
                com.paypal.android.logger.Logger.d$default(logger, "Checking if merchant is seen", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
            }
        }
        merchantVisitHistoryRepositoryImpl$isMerchantSeen$1 = new com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MerchantVisitHistoryRepositoryImpl$isMerchantSeen$1(this, continuation);
        java.lang.Object obj2 = merchantVisitHistoryRepositoryImpl$isMerchantSeen$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = merchantVisitHistoryRepositoryImpl$isMerchantSeen$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        java.util.Set set2 = (java.util.Set) obj2;
        if (set2 == null) {
        }
        com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.shoppingrewards.LoggerKt.log;
        kotlin.Pair[] pairArr2 = new kotlin.Pair[3];
        pairArr2[0] = kotlin.TuplesKt.to("merchantId", str);
        pairArr2[1] = kotlin.TuplesKt.to("isSeen", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z));
        pairArr2[2] = kotlin.TuplesKt.to("totalSeenMerchants", kotlin.coroutines.jvm.internal.Boxing.boxInt(set2 != null ? set2.size() : 0));
        com.paypal.android.logger.Logger.d$default(logger2, "Checking if merchant is seen", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        if (r14 != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.MerchantVisitHistoryRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object markMerchantAsSeen(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MerchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1 merchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1;
        java.lang.Object coroutine_suspended;
        int i;
        java.util.Set set;
        java.util.Set<java.lang.String> plus;
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage;
        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted;
        java.lang.String str2;
        java.util.Set<java.lang.String> set2;
        if (continuation instanceof com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MerchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1) {
            merchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1 = (com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MerchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1) continuation;
            if ((merchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                merchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = merchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1.Camera2StreamConfigurationMap;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = merchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (str.length() == 0) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, "Marking empty merchantId as seen - this may indicate missing merchant data upstream", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("method_name", "markMerchantAsSeen")), null, 4, null);
                    }
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted2 = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted("seen_merchants");
                    merchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1.getHighSpeedVideoSizes = str;
                    merchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1.getHighSpeedVideoFpsRanges = 1;
                    obj = appStorage2.getStringSet(unencrypted2, merchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        set2 = (java.util.Set) merchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1.getHighSpeedVideoFpsRangesFor;
                        str2 = (java.lang.String) merchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, "Marked merchant as seen", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("merchantId", str2), kotlin.TuplesKt.to("totalSeenMerchants", kotlin.coroutines.jvm.internal.Boxing.boxInt(set2.size()))), null, 4, null);
                        return kotlin.Unit.INSTANCE;
                    }
                    str = (java.lang.String) merchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                set = (java.util.Set) obj;
                if (set == null) {
                    set = kotlin.collections.SetsKt.emptySet();
                }
                plus = kotlin.collections.SetsKt.plus((java.util.Set<? extends java.lang.String>) set, str);
                appStorage = this.getHighSpeedVideoFpsRangesFor;
                unencrypted = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted("seen_merchants");
                merchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1.getHighSpeedVideoSizes = str;
                merchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(set);
                merchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1.getHighSpeedVideoFpsRangesFor = plus;
                merchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1.getHighSpeedVideoFpsRanges = 2;
                if (appStorage.setStringSet(unencrypted, plus, merchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1) != coroutine_suspended) {
                    str2 = str;
                    set2 = plus;
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, "Marked merchant as seen", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("merchantId", str2), kotlin.TuplesKt.to("totalSeenMerchants", kotlin.coroutines.jvm.internal.Boxing.boxInt(set2.size()))), null, 4, null);
                    return kotlin.Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
        }
        merchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1 = new com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MerchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1(this, continuation);
        java.lang.Object obj2 = merchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1.Camera2StreamConfigurationMap;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = merchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        set = (java.util.Set) obj2;
        if (set == null) {
        }
        plus = kotlin.collections.SetsKt.plus((java.util.Set<? extends java.lang.String>) set, str);
        appStorage = this.getHighSpeedVideoFpsRangesFor;
        unencrypted = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted("seen_merchants");
        merchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1.getHighSpeedVideoSizes = str;
        merchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(set);
        merchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1.getHighSpeedVideoFpsRangesFor = plus;
        merchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1.getHighSpeedVideoFpsRanges = 2;
        if (appStorage.setStringSet(unencrypted, plus, merchantVisitHistoryRepositoryImpl$markMerchantAsSeen$1) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
