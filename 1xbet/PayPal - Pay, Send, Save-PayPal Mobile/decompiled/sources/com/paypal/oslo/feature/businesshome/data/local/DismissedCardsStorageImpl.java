package com.paypal.oslo.feature.businesshome.data.local;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/data/local/DismissedCardsStorageImpl;", "Lcom/paypal/oslo/feature/businesshome/data/local/DismissedCardsStorage;", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "appStorage", "<init>", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;)V", "", "cardId", "", "dismissedAtMillis", "", "setDismissedCard", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDismissedAtMillis", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getAllDismissedCards", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;)Ljava/util/Map;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DismissedCardsStorageImpl implements com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorage {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.persistence.appstorage.AppStorage Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public DismissedCardsStorageImpl(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStorage, "");
        this.Camera2StreamConfigurationMap = appStorage;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a3, code lost:
    
        if (r4.setString(r5, r2, r0) != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r11 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object setDismissedCard(java.lang.String str, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl$setDismissedCard$1 dismissedCardsStorageImpl$setDismissedCard$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl$setDismissedCard$1) {
            dismissedCardsStorageImpl$setDismissedCard$1 = (com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl$setDismissedCard$1) continuation;
            if ((dismissedCardsStorageImpl$setDismissedCard$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                dismissedCardsStorageImpl$setDismissedCard$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = dismissedCardsStorageImpl$setDismissedCard$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dismissedCardsStorageImpl$setDismissedCard$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    dismissedCardsStorageImpl$setDismissedCard$1.getHighSpeedVideoFpsRanges = str;
                    dismissedCardsStorageImpl$setDismissedCard$1.getHighSpeedVideoFpsRangesFor = j;
                    dismissedCardsStorageImpl$setDismissedCard$1.getHighSpeedVideoSizes = 1;
                    obj = getAllDismissedCards(dismissedCardsStorageImpl$setDismissedCard$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        long j2 = dismissedCardsStorageImpl$setDismissedCard$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    j = dismissedCardsStorageImpl$setDismissedCard$1.getHighSpeedVideoFpsRangesFor;
                    str = (java.lang.String) dismissedCardsStorageImpl$setDismissedCard$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap((java.util.Map) obj);
                mutableMap.put(str, kotlin.coroutines.jvm.internal.Boxing.boxLong(j));
                kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
                companion.getSerializersModule();
                java.lang.String encodeToString = companion.encodeToString(new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.LongSerializer.INSTANCE), mutableMap);
                com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.Camera2StreamConfigurationMap;
                com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted dismissed_cards = com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageKeys.INSTANCE.getDISMISSED_CARDS();
                dismissedCardsStorageImpl$setDismissedCard$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                dismissedCardsStorageImpl$setDismissedCard$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(mutableMap);
                dismissedCardsStorageImpl$setDismissedCard$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(encodeToString);
                dismissedCardsStorageImpl$setDismissedCard$1.getHighSpeedVideoFpsRangesFor = j;
                dismissedCardsStorageImpl$setDismissedCard$1.getHighSpeedVideoSizes = 2;
            }
        }
        dismissedCardsStorageImpl$setDismissedCard$1 = new com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl$setDismissedCard$1(this, continuation);
        java.lang.Object obj2 = dismissedCardsStorageImpl$setDismissedCard$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dismissedCardsStorageImpl$setDismissedCard$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        java.util.Map mutableMap2 = kotlin.collections.MapsKt.toMutableMap((java.util.Map) obj2);
        mutableMap2.put(str, kotlin.coroutines.jvm.internal.Boxing.boxLong(j));
        kotlinx.serialization.json.Json.Companion companion2 = kotlinx.serialization.json.Json.INSTANCE;
        companion2.getSerializersModule();
        java.lang.String encodeToString2 = companion2.encodeToString(new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.LongSerializer.INSTANCE), mutableMap2);
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = this.Camera2StreamConfigurationMap;
        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted dismissed_cards2 = com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageKeys.INSTANCE.getDISMISSED_CARDS();
        dismissedCardsStorageImpl$setDismissedCard$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
        dismissedCardsStorageImpl$setDismissedCard$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(mutableMap2);
        dismissedCardsStorageImpl$setDismissedCard$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(encodeToString2);
        dismissedCardsStorageImpl$setDismissedCard$1.getHighSpeedVideoFpsRangesFor = j;
        dismissedCardsStorageImpl$setDismissedCard$1.getHighSpeedVideoSizes = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getDismissedAtMillis(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl$getDismissedAtMillis$1 dismissedCardsStorageImpl$getDismissedAtMillis$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl$getDismissedAtMillis$1) {
            dismissedCardsStorageImpl$getDismissedAtMillis$1 = (com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl$getDismissedAtMillis$1) continuation;
            if ((dismissedCardsStorageImpl$getDismissedAtMillis$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                dismissedCardsStorageImpl$getDismissedAtMillis$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = dismissedCardsStorageImpl$getDismissedAtMillis$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dismissedCardsStorageImpl$getDismissedAtMillis$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    dismissedCardsStorageImpl$getDismissedAtMillis$1.getHighResolutionOutputSizeshNQ4ISI = str;
                    dismissedCardsStorageImpl$getDismissedAtMillis$1.getHighSpeedVideoFpsRanges = 1;
                    obj = getAllDismissedCards(dismissedCardsStorageImpl$getDismissedAtMillis$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) dismissedCardsStorageImpl$getDismissedAtMillis$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return ((java.util.Map) obj).get(str);
            }
        }
        dismissedCardsStorageImpl$getDismissedAtMillis$1 = new com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl$getDismissedAtMillis$1(this, continuation);
        java.lang.Object obj2 = dismissedCardsStorageImpl$getDismissedAtMillis$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dismissedCardsStorageImpl$getDismissedAtMillis$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return ((java.util.Map) obj2).get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getAllDismissedCards(kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, java.lang.Long>> continuation) {
        com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl$getAllDismissedCards$1 dismissedCardsStorageImpl$getAllDismissedCards$1;
        int i;
        java.lang.String str;
        if (continuation instanceof com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl$getAllDismissedCards$1) {
            dismissedCardsStorageImpl$getAllDismissedCards$1 = (com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl$getAllDismissedCards$1) continuation;
            if ((dismissedCardsStorageImpl$getAllDismissedCards$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                dismissedCardsStorageImpl$getAllDismissedCards$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = dismissedCardsStorageImpl$getAllDismissedCards$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dismissedCardsStorageImpl$getAllDismissedCards$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted dismissed_cards = com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageKeys.INSTANCE.getDISMISSED_CARDS();
                    dismissedCardsStorageImpl$getAllDismissedCards$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = appStorage.getString(dismissed_cards, dismissedCardsStorageImpl$getAllDismissedCards$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str != null) {
                    return kotlin.collections.MapsKt.emptyMap();
                }
                return getHighResolutionOutputSizeshNQ4ISI(str);
            }
        }
        dismissedCardsStorageImpl$getAllDismissedCards$1 = new com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl$getAllDismissedCards$1(this, continuation);
        java.lang.Object obj2 = dismissedCardsStorageImpl$getAllDismissedCards$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dismissedCardsStorageImpl$getAllDismissedCards$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str != null) {
        }
    }

    private static java.util.Map<java.lang.String, java.lang.Long> getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0) {
        try {
            kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
            companion.getSerializersModule();
            return (java.util.Map) companion.decodeFromString(new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.LongSerializer.INSTANCE), p0);
        } catch (kotlinx.serialization.SerializationException unused) {
            return kotlin.collections.MapsKt.emptyMap();
        } catch (java.lang.IllegalArgumentException unused2) {
            return kotlin.collections.MapsKt.emptyMap();
        }
    }
}
