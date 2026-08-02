package com.paypal.oslo.feature.identity.unifiedalert.data.repository;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000f\u0010\rJ'\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015H\u0082@¢\u0006\u0004\b\u0016\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/data/repository/HandledAlertsRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/repository/HandledAlertsRepository;", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "appStorage", "<init>", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;)V", "", "documentId", "userId", "", "expiresAtEpoch", "", "isHandled", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "addHandledAlert", "p0", "p1", "p2", "getHighSpeedVideoSizes", "(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;", "", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HandledAlertsRepositoryImpl implements com.paypal.oslo.feature.identity.unifiedalert.domain.repository.HandledAlertsRepository {

    @java.lang.Deprecated
    public static final java.lang.String DELIMITER = "|";

    @java.lang.Deprecated
    public static final int MAX_HANDLED_ALERTS = 10;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.persistence.appstorage.AppStorage getHighSpeedVideoFpsRangesFor;
    private static final com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.Companion Companion = new com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.Companion(null);
    public static final int $stable = 8;
    private static final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted("handled_unified_alerts");

    @javax.inject.Inject
    public HandledAlertsRepositoryImpl(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStorage, "");
        this.getHighSpeedVideoFpsRangesFor = appStorage;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.identity.unifiedalert.domain.repository.HandledAlertsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object isHandled(java.lang.String str, java.lang.String str2, long j, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl$isHandled$1 handledAlertsRepositoryImpl$isHandled$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl$isHandled$1) {
            handledAlertsRepositoryImpl$isHandled$1 = (com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl$isHandled$1) continuation;
            if ((handledAlertsRepositoryImpl$isHandled$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                handledAlertsRepositoryImpl$isHandled$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = handledAlertsRepositoryImpl$isHandled$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = handledAlertsRepositoryImpl$isHandled$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    handledAlertsRepositoryImpl$isHandled$1.Camera2StreamConfigurationMap = str;
                    handledAlertsRepositoryImpl$isHandled$1.getHighSpeedVideoSizes = str2;
                    handledAlertsRepositoryImpl$isHandled$1.getHighSpeedVideoFpsRangesFor = j;
                    handledAlertsRepositoryImpl$isHandled$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = getHighResolutionOutputSizeshNQ4ISI(handledAlertsRepositoryImpl$isHandled$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = handledAlertsRepositoryImpl$isHandled$1.getHighSpeedVideoFpsRangesFor;
                    str2 = (java.lang.String) handledAlertsRepositoryImpl$isHandled$1.getHighSpeedVideoSizes;
                    str = (java.lang.String) handledAlertsRepositoryImpl$isHandled$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((java.util.List) obj).contains(getHighSpeedVideoSizes(str, str2, j)));
            }
        }
        handledAlertsRepositoryImpl$isHandled$1 = new com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl$isHandled$1(this, continuation);
        java.lang.Object obj2 = handledAlertsRepositoryImpl$isHandled$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = handledAlertsRepositoryImpl$isHandled$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((java.util.List) obj2).contains(getHighSpeedVideoSizes(str, str2, j)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bc, code lost:
    
        if (getHighResolutionOutputSizeshNQ4ISI(r12, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.identity.unifiedalert.domain.repository.HandledAlertsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object addHandledAlert(java.lang.String str, java.lang.String str2, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl$addHandledAlert$1 handledAlertsRepositoryImpl$addHandledAlert$1;
        int i;
        java.lang.String str3;
        java.lang.String str4;
        java.util.List<java.lang.String> mutableList;
        if (continuation instanceof com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl$addHandledAlert$1) {
            handledAlertsRepositoryImpl$addHandledAlert$1 = (com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl$addHandledAlert$1) continuation;
            if ((handledAlertsRepositoryImpl$addHandledAlert$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                handledAlertsRepositoryImpl$addHandledAlert$1.getInputFormats -= 2147483648;
                java.lang.Object obj = handledAlertsRepositoryImpl$addHandledAlert$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = handledAlertsRepositoryImpl$addHandledAlert$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(str, str2, j);
                    handledAlertsRepositoryImpl$addHandledAlert$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    handledAlertsRepositoryImpl$addHandledAlert$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    handledAlertsRepositoryImpl$addHandledAlert$1.Camera2StreamConfigurationMap = highSpeedVideoSizes;
                    handledAlertsRepositoryImpl$addHandledAlert$1.getHighResolutionOutputSizeshNQ4ISI = j;
                    handledAlertsRepositoryImpl$addHandledAlert$1.getInputFormats = 1;
                    java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(handledAlertsRepositoryImpl$addHandledAlert$1);
                    if (highResolutionOutputSizeshNQ4ISI != coroutine_suspended) {
                        str3 = str;
                        str4 = highSpeedVideoSizes;
                        obj = highResolutionOutputSizeshNQ4ISI;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j2 = handledAlertsRepositoryImpl$addHandledAlert$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                j = handledAlertsRepositoryImpl$addHandledAlert$1.getHighResolutionOutputSizeshNQ4ISI;
                str4 = (java.lang.String) handledAlertsRepositoryImpl$addHandledAlert$1.Camera2StreamConfigurationMap;
                str2 = (java.lang.String) handledAlertsRepositoryImpl$addHandledAlert$1.getHighSpeedVideoFpsRangesFor;
                str3 = (java.lang.String) handledAlertsRepositoryImpl$addHandledAlert$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) obj);
                if (!mutableList.contains(str4)) {
                    return kotlin.Unit.INSTANCE;
                }
                mutableList.add(str4);
                while (mutableList.size() > 10) {
                    mutableList.remove(0);
                }
                handledAlertsRepositoryImpl$addHandledAlert$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                handledAlertsRepositoryImpl$addHandledAlert$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                handledAlertsRepositoryImpl$addHandledAlert$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                handledAlertsRepositoryImpl$addHandledAlert$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(mutableList);
                handledAlertsRepositoryImpl$addHandledAlert$1.getHighResolutionOutputSizeshNQ4ISI = j;
                handledAlertsRepositoryImpl$addHandledAlert$1.getInputFormats = 2;
            }
        }
        handledAlertsRepositoryImpl$addHandledAlert$1 = new com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl$addHandledAlert$1(this, continuation);
        java.lang.Object obj2 = handledAlertsRepositoryImpl$addHandledAlert$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = handledAlertsRepositoryImpl$addHandledAlert$1.getInputFormats;
        if (i != 0) {
        }
        mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) obj2);
        if (!mutableList.contains(str4)) {
        }
    }

    private static java.lang.String getHighSpeedVideoSizes(java.lang.String p0, java.lang.String p1, long p2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(p0);
        sb.append("_");
        sb.append(p1);
        sb.append("_");
        sb.append(p2);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> continuation) {
        com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl$loadHandledKeys$1 handledAlertsRepositoryImpl$loadHandledKeys$1;
        int i;
        java.lang.String str;
        if (continuation instanceof com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl$loadHandledKeys$1) {
            handledAlertsRepositoryImpl$loadHandledKeys$1 = (com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl$loadHandledKeys$1) continuation;
            if ((handledAlertsRepositoryImpl$loadHandledKeys$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                handledAlertsRepositoryImpl$loadHandledKeys$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = handledAlertsRepositoryImpl$loadHandledKeys$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = handledAlertsRepositoryImpl$loadHandledKeys$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted = getHighResolutionOutputSizeshNQ4ISI;
                    handledAlertsRepositoryImpl$loadHandledKeys$1.getHighSpeedVideoSizes = 1;
                    obj = appStorage.getString(unencrypted, handledAlertsRepositoryImpl$loadHandledKeys$1);
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
                    return kotlin.collections.CollectionsKt.emptyList();
                }
                java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{DELIMITER}, false, 0, 6, (java.lang.Object) null);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : split$default) {
                    if (!kotlin.text.StringsKt.isBlank((java.lang.String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            }
        }
        handledAlertsRepositoryImpl$loadHandledKeys$1 = new com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl$loadHandledKeys$1(this, continuation);
        java.lang.Object obj3 = handledAlertsRepositoryImpl$loadHandledKeys$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = handledAlertsRepositoryImpl$loadHandledKeys$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        str = (java.lang.String) obj3;
        if (str != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.util.List<java.lang.String> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object string = this.getHighSpeedVideoFpsRangesFor.setString(getHighResolutionOutputSizeshNQ4ISI, kotlin.collections.CollectionsKt.joinToString$default(list, DELIMITER, null, null, 0, null, null, 62, null), continuation);
        return string == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? string : kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/data/repository/HandledAlertsRepositoryImpl$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "getHighSpeedVideoFpsRanges", "", "DELIMITER", "Ljava/lang/String;", "", "MAX_HANDLED_ALERTS", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
