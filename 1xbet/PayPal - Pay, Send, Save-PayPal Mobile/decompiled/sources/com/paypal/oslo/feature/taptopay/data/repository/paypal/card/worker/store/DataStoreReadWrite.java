package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BK\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR&\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/DataStoreReadWrite;", "", "T", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/ReadWriteStore;", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "appStorage", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;", "key", "Lkotlin/Function1;", "", "", "serialize", "deserialize", "<init>", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "read", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "write", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clear", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DataStoreReadWrite<T> implements com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadWriteStore<T> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.util.Set<? extends T>, java.lang.String> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.String, java.util.Set<T>> Camera2StreamConfigurationMap;
    private final com.paypal.oslo.core.persistence.appstorage.AppStorage getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.persistence.appstorage.AppStorageKey getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public DataStoreReadWrite(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, kotlin.jvm.functions.Function1<? super java.util.Set<? extends T>, java.lang.String> function1, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends java.util.Set<? extends T>> function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStorageKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        this.getHighSpeedVideoFpsRangesFor = appStorage;
        this.getHighResolutionOutputSizeshNQ4ISI = appStorageKey;
        this.getHighSpeedVideoFpsRanges = function1;
        this.Camera2StreamConfigurationMap = function12;
    }

    @Override // com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadStore
    public final /* bridge */ java.lang.Object read(boolean z, kotlin.coroutines.Continuation<? super java.util.Set<? extends T>> continuation) {
        return super.read(z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object read(kotlin.coroutines.Continuation<? super java.util.Set<? extends T>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DataStoreReadWrite$read$1 dataStoreReadWrite$read$1;
        int i;
        java.lang.String str;
        java.util.Set emptySet;
        java.lang.Object m23436constructorimpl;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DataStoreReadWrite$read$1) {
            dataStoreReadWrite$read$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DataStoreReadWrite$read$1) continuation;
            if ((dataStoreReadWrite$read$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                dataStoreReadWrite$read$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = dataStoreReadWrite$read$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dataStoreReadWrite$read$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey = this.getHighResolutionOutputSizeshNQ4ISI;
                    dataStoreReadWrite$read$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = appStorage.getString(appStorageKey, dataStoreReadWrite$read$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.String str2 = (java.lang.String) obj;
                str = str2;
                if (str != null || str.length() == 0) {
                    emptySet = kotlin.collections.SetsKt.emptySet();
                } else {
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DataStoreReadWrite<T> dataStoreReadWrite = this;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(this.Camera2StreamConfigurationMap.invoke(str2));
                    } catch (java.lang.Throwable th) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                    }
                    java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                    if (m23439exceptionOrNullimpl != null) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to deserialize data from DataStore", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("key", this.getHighResolutionOutputSizeshNQ4ISI.getName()), kotlin.TuplesKt.to("error", m23439exceptionOrNullimpl.getMessage())), null, 4, null);
                    }
                    java.util.Set emptySet2 = kotlin.collections.SetsKt.emptySet();
                    if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                        m23436constructorimpl = emptySet2;
                    }
                    emptySet = (java.util.Set) m23436constructorimpl;
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Retrieving pending list from DataStore", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("key", this.getHighResolutionOutputSizeshNQ4ISI.getName()), kotlin.TuplesKt.to("pendingList", emptySet)), null, 4, null);
                return emptySet;
            }
        }
        dataStoreReadWrite$read$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DataStoreReadWrite$read$1(this, continuation);
        java.lang.Object obj2 = dataStoreReadWrite$read$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataStoreReadWrite$read$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        java.lang.String str22 = (java.lang.String) obj2;
        str = str22;
        if (str != null) {
        }
        emptySet = kotlin.collections.SetsKt.emptySet();
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Retrieving pending list from DataStore", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("key", this.getHighResolutionOutputSizeshNQ4ISI.getName()), kotlin.TuplesKt.to("pendingList", emptySet)), null, 4, null);
        return emptySet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (r2 != r4) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    @Override // com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.WriteStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object write(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DataStoreReadWrite$write$1 dataStoreReadWrite$write$1;
        java.lang.Object coroutine_suspended;
        int i;
        java.lang.String invoke;
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage;
        com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey;
        java.lang.Object obj;
        java.util.Set<? extends T> set;
        java.lang.Object obj2 = t;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DataStoreReadWrite$write$1) {
            dataStoreReadWrite$write$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DataStoreReadWrite$write$1) continuation;
            if ((dataStoreReadWrite$write$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                dataStoreReadWrite$write$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj3 = dataStoreReadWrite$write$1.Camera2StreamConfigurationMap;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dataStoreReadWrite$write$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Storing data to pending list in DataStore", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("key", this.getHighResolutionOutputSizeshNQ4ISI.getName()), kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, obj2)), null, 4, null);
                    dataStoreReadWrite$write$1.getHighSpeedVideoSizes = obj2;
                    dataStoreReadWrite$write$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj3 = read(dataStoreReadWrite$write$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        set = (java.util.Set) dataStoreReadWrite$write$1.getHighSpeedVideoFpsRanges;
                        obj = dataStoreReadWrite$write$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "List appended and stored in DataStore", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("key", this.getHighResolutionOutputSizeshNQ4ISI.getName()), kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, obj), kotlin.TuplesKt.to("newList", set)), null, 4, null);
                        return kotlin.Unit.INSTANCE;
                    }
                    obj2 = dataStoreReadWrite$write$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj3);
                }
                java.util.Set<? extends T> mutableSet = kotlin.collections.CollectionsKt.toMutableSet((java.lang.Iterable) obj3);
                mutableSet.add(obj2);
                invoke = this.getHighSpeedVideoFpsRanges.invoke(mutableSet);
                appStorage = this.getHighSpeedVideoFpsRangesFor;
                appStorageKey = this.getHighResolutionOutputSizeshNQ4ISI;
                dataStoreReadWrite$write$1.getHighSpeedVideoSizes = obj2;
                dataStoreReadWrite$write$1.getHighSpeedVideoFpsRanges = mutableSet;
                dataStoreReadWrite$write$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(invoke);
                dataStoreReadWrite$write$1.getHighSpeedVideoFpsRangesFor = 2;
                if (appStorage.setString(appStorageKey, invoke, dataStoreReadWrite$write$1) != coroutine_suspended) {
                    obj = obj2;
                    set = mutableSet;
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "List appended and stored in DataStore", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("key", this.getHighResolutionOutputSizeshNQ4ISI.getName()), kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, obj), kotlin.TuplesKt.to("newList", set)), null, 4, null);
                    return kotlin.Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
        }
        dataStoreReadWrite$write$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DataStoreReadWrite$write$1(this, continuation);
        java.lang.Object obj32 = dataStoreReadWrite$write$1.Camera2StreamConfigurationMap;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataStoreReadWrite$write$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        java.util.Set<? extends T> mutableSet2 = kotlin.collections.CollectionsKt.toMutableSet((java.lang.Iterable) obj32);
        mutableSet2.add(obj2);
        invoke = this.getHighSpeedVideoFpsRanges.invoke(mutableSet2);
        appStorage = this.getHighSpeedVideoFpsRangesFor;
        appStorageKey = this.getHighResolutionOutputSizeshNQ4ISI;
        dataStoreReadWrite$write$1.getHighSpeedVideoSizes = obj2;
        dataStoreReadWrite$write$1.getHighSpeedVideoFpsRanges = mutableSet2;
        dataStoreReadWrite$write$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(invoke);
        dataStoreReadWrite$write$1.getHighSpeedVideoFpsRangesFor = 2;
        if (appStorage.setString(appStorageKey, invoke, dataStoreReadWrite$write$1) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    @Override // com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadStore
    public final java.lang.Object clear(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Clearing pending notify from DataStore", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("key", this.getHighResolutionOutputSizeshNQ4ISI.getName())), null, 4, null);
        java.lang.Object remove = this.getHighSpeedVideoFpsRangesFor.remove(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        return remove == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? remove : kotlin.Unit.INSTANCE;
    }
}
