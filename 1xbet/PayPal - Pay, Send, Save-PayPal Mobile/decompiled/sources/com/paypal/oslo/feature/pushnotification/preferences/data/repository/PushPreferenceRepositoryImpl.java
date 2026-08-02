package com.paypal.oslo.feature.pushnotification.preferences.data.repository;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/preferences/data/repository/PushPreferenceRepositoryImpl;", "Lcom/paypal/oslo/feature/pushnotification/preferences/domain/repository/PushPreferenceRepository;", "Lcom/paypal/oslo/feature/pushnotification/preferences/data/service/PushPreferenceDataService;", "pushPreferenceDataService", "<init>", "(Lcom/paypal/oslo/feature/pushnotification/preferences/data/service/PushPreferenceDataService;)V", "", "deviceId", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/pushnotification/preferences/domain/error/PreferencesError;", "Lcom/paypal/oslo/feature/pushnotification/preferences/domain/model/PreferencesList;", "getPreferencesList", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushNotificationPreferences", "", "updatePreferences", "(Ljava/lang/String;Lcom/paypal/oslo/feature/pushnotification/preferences/domain/model/PreferencesList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/pushnotification/preferences/data/service/PushPreferenceDataService;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PushPreferenceRepositoryImpl implements com.paypal.oslo.feature.pushnotification.preferences.domain.repository.PushPreferenceRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataService Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public PushPreferenceRepositoryImpl(com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataService pushPreferenceDataService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushPreferenceDataService, "");
        this.Camera2StreamConfigurationMap = pushPreferenceDataService;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0097 A[Catch: all -> 0x0046, RaiseCancellationException -> 0x0049, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0049, all -> 0x0046, blocks: (B:11:0x0042, B:12:0x0091, B:15:0x0097, B:16:0x00bc, B:21:0x00af, B:22:0x00d1, B:23:0x00d6), top: B:10:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.pushnotification.preferences.domain.repository.PushPreferenceRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPreferencesList(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.pushnotification.preferences.domain.error.PreferencesError, com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList>> continuation) {
        com.paypal.oslo.feature.pushnotification.preferences.data.repository.PushPreferenceRepositoryImpl$getPreferencesList$1 pushPreferenceRepositoryImpl$getPreferencesList$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.Either either;
        arrow.core.Either right;
        if (continuation instanceof com.paypal.oslo.feature.pushnotification.preferences.data.repository.PushPreferenceRepositoryImpl$getPreferencesList$1) {
            pushPreferenceRepositoryImpl$getPreferencesList$1 = (com.paypal.oslo.feature.pushnotification.preferences.data.repository.PushPreferenceRepositoryImpl$getPreferencesList$1) continuation;
            if ((pushPreferenceRepositoryImpl$getPreferencesList$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                pushPreferenceRepositoryImpl$getPreferencesList$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = pushPreferenceRepositoryImpl$getPreferencesList$1.getOutputSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pushPreferenceRepositoryImpl$getPreferencesList$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.api.graphql.schema.type.PushNotificationPreferencesInput pushNotificationPreferencesInput = new com.paypal.oslo.api.graphql.schema.type.PushNotificationPreferencesInput(str);
                        com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataService pushPreferenceDataService = this.Camera2StreamConfigurationMap;
                        pushPreferenceRepositoryImpl$getPreferencesList$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        pushPreferenceRepositoryImpl$getPreferencesList$1.getOutputMinFrameDuration = defaultRaise;
                        pushPreferenceRepositoryImpl$getPreferencesList$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        pushPreferenceRepositoryImpl$getPreferencesList$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pushNotificationPreferencesInput);
                        pushPreferenceRepositoryImpl$getPreferencesList$1.getInputFormats = defaultRaise3;
                        pushPreferenceRepositoryImpl$getPreferencesList$1.Camera2StreamConfigurationMap = 0;
                        pushPreferenceRepositoryImpl$getPreferencesList$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        pushPreferenceRepositoryImpl$getPreferencesList$1.getHighSpeedVideoFpsRangesFor = 0;
                        pushPreferenceRepositoryImpl$getPreferencesList$1.getHighSpeedVideoSizes = 0;
                        pushPreferenceRepositoryImpl$getPreferencesList$1.getInputSizeshNQ4ISI = 1;
                        java.lang.Object preferences = pushPreferenceDataService.getPreferences(pushNotificationPreferencesInput, pushPreferenceRepositoryImpl$getPreferencesList$1);
                        if (preferences == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        obj = preferences;
                        raise = defaultRaise3;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = pushPreferenceRepositoryImpl$getPreferencesList$1.getHighSpeedVideoSizes;
                    int i3 = pushPreferenceRepositoryImpl$getPreferencesList$1.getHighSpeedVideoFpsRangesFor;
                    int i4 = pushPreferenceRepositoryImpl$getPreferencesList$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = pushPreferenceRepositoryImpl$getPreferencesList$1.Camera2StreamConfigurationMap;
                    raise = (arrow.core.raise.Raise) pushPreferenceRepositoryImpl$getPreferencesList$1.getInputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) pushPreferenceRepositoryImpl$getPreferencesList$1.getOutputMinFrameDuration;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.pushnotification.preferences.data.mapper.PreferenceErrorMapperKt.toPreferenceDomainError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList domain = com.paypal.oslo.feature.pushnotification.preferences.data.mapper.PreferencesModelMapperKt.toDomain((java.util.List<com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.PushNotificationPreference>) raise.bind(right));
                defaultRaise2.complete();
                return new arrow.core.Either.Right(domain);
            }
        }
        pushPreferenceRepositoryImpl$getPreferencesList$1 = new com.paypal.oslo.feature.pushnotification.preferences.data.repository.PushPreferenceRepositoryImpl$getPreferencesList$1(this, continuation);
        java.lang.Object obj2 = pushPreferenceRepositoryImpl$getPreferencesList$1.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pushPreferenceRepositoryImpl$getPreferencesList$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList domain2 = com.paypal.oslo.feature.pushnotification.preferences.data.mapper.PreferencesModelMapperKt.toDomain((java.util.List<com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.PushNotificationPreference>) raise.bind(right));
        defaultRaise2.complete();
        return new arrow.core.Either.Right(domain2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f A[Catch: all -> 0x004c, RaiseCancellationException -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x004f, all -> 0x004c, blocks: (B:11:0x0046, B:13:0x0099, B:16:0x009f, B:17:0x00c4, B:19:0x00e8, B:20:0x0111, B:22:0x0117, B:24:0x0125, B:25:0x0145, B:27:0x0146, B:31:0x00b7, B:32:0x0153, B:33:0x0158), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8 A[Catch: all -> 0x004c, RaiseCancellationException -> 0x004f, TryCatch #4 {RaiseCancellationException -> 0x004f, all -> 0x004c, blocks: (B:11:0x0046, B:13:0x0099, B:16:0x009f, B:17:0x00c4, B:19:0x00e8, B:20:0x0111, B:22:0x0117, B:24:0x0125, B:25:0x0145, B:27:0x0146, B:31:0x00b7, B:32:0x0153, B:33:0x0158), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0146 A[Catch: all -> 0x004c, RaiseCancellationException -> 0x004f, TryCatch #4 {RaiseCancellationException -> 0x004f, all -> 0x004c, blocks: (B:11:0x0046, B:13:0x0099, B:16:0x009f, B:17:0x00c4, B:19:0x00e8, B:20:0x0111, B:22:0x0117, B:24:0x0125, B:25:0x0145, B:27:0x0146, B:31:0x00b7, B:32:0x0153, B:33:0x0158), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r9v16, types: [arrow.core.raise.Raise] */
    @Override // com.paypal.oslo.feature.pushnotification.preferences.domain.repository.PushPreferenceRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updatePreferences(java.lang.String str, com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList preferencesList, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.pushnotification.preferences.domain.error.PreferencesError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.pushnotification.preferences.data.repository.PushPreferenceRepositoryImpl$updatePreferences$1 pushPreferenceRepositoryImpl$updatePreferences$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        arrow.core.raise.Raise raise;
        arrow.core.Either either;
        arrow.core.Either right;
        com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList domain;
        if (continuation instanceof com.paypal.oslo.feature.pushnotification.preferences.data.repository.PushPreferenceRepositoryImpl$updatePreferences$1) {
            pushPreferenceRepositoryImpl$updatePreferences$1 = (com.paypal.oslo.feature.pushnotification.preferences.data.repository.PushPreferenceRepositoryImpl$updatePreferences$1) continuation;
            if ((pushPreferenceRepositoryImpl$updatePreferences$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                pushPreferenceRepositoryImpl$updatePreferences$1.getOutputStallDurationlomOqCM -= 2147483648;
                java.lang.Object obj = pushPreferenceRepositoryImpl$updatePreferences$1.getOutputSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pushPreferenceRepositoryImpl$updatePreferences$1.getOutputStallDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        defaultRaise2 = defaultRaise;
                        com.paypal.oslo.api.graphql.schema.type.UpdatePushNotificationPreferencesInput updatePushNotificationPreferencesInput = new com.paypal.oslo.api.graphql.schema.type.UpdatePushNotificationPreferencesInput(str, com.paypal.oslo.feature.pushnotification.preferences.data.mapper.PreferencesModelMapperKt.toDataUpdatePreferencesList(preferencesList));
                        com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataService pushPreferenceDataService = this.Camera2StreamConfigurationMap;
                        pushPreferenceRepositoryImpl$updatePreferences$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        pushPreferenceRepositoryImpl$updatePreferences$1.getHighSpeedVideoSizesFor = preferencesList;
                        pushPreferenceRepositoryImpl$updatePreferences$1.getOutputMinFrameDuration = defaultRaise;
                        pushPreferenceRepositoryImpl$updatePreferences$1.getOutputFormats = defaultRaise2;
                        pushPreferenceRepositoryImpl$updatePreferences$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updatePushNotificationPreferencesInput);
                        pushPreferenceRepositoryImpl$updatePreferences$1.getInputSizeshNQ4ISI = defaultRaise2;
                        pushPreferenceRepositoryImpl$updatePreferences$1.getHighSpeedVideoFpsRangesFor = 0;
                        pushPreferenceRepositoryImpl$updatePreferences$1.getHighSpeedVideoFpsRanges = 0;
                        pushPreferenceRepositoryImpl$updatePreferences$1.getHighSpeedVideoSizes = 0;
                        pushPreferenceRepositoryImpl$updatePreferences$1.Camera2StreamConfigurationMap = 0;
                        pushPreferenceRepositoryImpl$updatePreferences$1.getOutputStallDurationlomOqCM = 1;
                        java.lang.Object preference = pushPreferenceDataService.setPreference(updatePushNotificationPreferencesInput, pushPreferenceRepositoryImpl$updatePreferences$1);
                        if (preference == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise3 = defaultRaise;
                        obj = preference;
                        raise = defaultRaise2;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = pushPreferenceRepositoryImpl$updatePreferences$1.Camera2StreamConfigurationMap;
                    int i3 = pushPreferenceRepositoryImpl$updatePreferences$1.getHighSpeedVideoSizes;
                    int i4 = pushPreferenceRepositoryImpl$updatePreferences$1.getHighSpeedVideoFpsRanges;
                    int i5 = pushPreferenceRepositoryImpl$updatePreferences$1.getHighSpeedVideoFpsRangesFor;
                    raise = (arrow.core.raise.Raise) pushPreferenceRepositoryImpl$updatePreferences$1.getInputSizeshNQ4ISI;
                    ?? r9 = (arrow.core.raise.Raise) pushPreferenceRepositoryImpl$updatePreferences$1.getOutputFormats;
                    defaultRaise3 = (arrow.core.raise.DefaultRaise) pushPreferenceRepositoryImpl$updatePreferences$1.getOutputMinFrameDuration;
                    com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList preferencesList2 = (com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList) pushPreferenceRepositoryImpl$updatePreferences$1.getHighSpeedVideoSizesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise2 = r9;
                        preferencesList = preferencesList2;
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise3;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise3;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.pushnotification.preferences.data.mapper.PreferenceErrorMapperKt.toPreferenceDomainError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                domain = com.paypal.oslo.feature.pushnotification.preferences.data.mapper.PreferencesModelMapperKt.toDomain((com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.UpdatePushNotificationPreferences) raise.bind(right));
                if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.collections.CollectionsKt.toSet(preferencesList.getPreferences()), kotlin.collections.CollectionsKt.toSet(domain.getPreferences()))) {
                    java.util.List minus = kotlin.collections.CollectionsKt.minus((java.lang.Iterable) preferencesList.getPreferences(), (java.lang.Iterable) kotlin.collections.CollectionsKt.toSet(domain.getPreferences()));
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(minus, 10));
                    java.util.Iterator it = minus.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((com.paypal.oslo.feature.pushnotification.preferences.domain.model.PushNotificationPreference) it.next()).getType());
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("Update failed for preferences: ");
                    sb.append(arrayList);
                    defaultRaise2.raise(new com.paypal.oslo.feature.pushnotification.preferences.domain.error.PreferencesError.Business.SyncFailed(sb.toString()));
                    throw new kotlin.KotlinNothingValueException();
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                defaultRaise3.complete();
                return new arrow.core.Either.Right(unit);
            }
        }
        pushPreferenceRepositoryImpl$updatePreferences$1 = new com.paypal.oslo.feature.pushnotification.preferences.data.repository.PushPreferenceRepositoryImpl$updatePreferences$1(this, continuation);
        java.lang.Object obj2 = pushPreferenceRepositoryImpl$updatePreferences$1.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pushPreferenceRepositoryImpl$updatePreferences$1.getOutputStallDurationlomOqCM;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        domain = com.paypal.oslo.feature.pushnotification.preferences.data.mapper.PreferencesModelMapperKt.toDomain((com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.UpdatePushNotificationPreferences) raise.bind(right));
        if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.collections.CollectionsKt.toSet(preferencesList.getPreferences()), kotlin.collections.CollectionsKt.toSet(domain.getPreferences()))) {
        }
    }
}
