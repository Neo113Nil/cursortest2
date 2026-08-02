package com.paypal.oslo.feature.notificationcenter.data.repository;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJD\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00130\b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/data/repository/NotificationRepositoryImpl;", "Lcom/paypal/oslo/feature/notificationcenter/domain/repository/NotificationRepository;", "Lcom/paypal/oslo/feature/notificationcenter/data/mapper/NotificationMapper;", "notificationMapper", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/paypal/oslo/feature/notificationcenter/data/mapper/NotificationMapper;Lcom/apollographql/apollo/ApolloClient;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationError;", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationData;", "getNotifications", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "trackingTokens", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationIdentifierInput;", "notificationIdentifierList", "status", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/UpdateNotificationsTrackingStatus;", "updateNotificationsTrackingStatus", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/notificationcenter/data/mapper/NotificationMapper;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/ApolloClient;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NotificationRepositoryImpl implements com.paypal.oslo.feature.notificationcenter.domain.repository.NotificationRepository {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.notificationcenter.data.mapper.NotificationMapper Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public NotificationRepositoryImpl(com.paypal.oslo.feature.notificationcenter.data.mapper.NotificationMapper notificationMapper, com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.Camera2StreamConfigurationMap = notificationMapper;
        this.getHighResolutionOutputSizeshNQ4ISI = apolloClient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f A[Catch: all -> 0x003a, RaiseCancellationException -> 0x003d, ApolloException -> 0x0040, TryCatch #4 {ApolloException -> 0x0040, blocks: (B:12:0x0036, B:13:0x0087, B:15:0x008f, B:16:0x00c1, B:18:0x00ca, B:22:0x00e1, B:23:0x00f0, B:24:0x00a9, B:26:0x00af, B:27:0x00bb), top: B:11:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ca A[Catch: all -> 0x003a, RaiseCancellationException -> 0x003d, ApolloException -> 0x0040, TRY_LEAVE, TryCatch #4 {ApolloException -> 0x0040, blocks: (B:12:0x0036, B:13:0x0087, B:15:0x008f, B:16:0x00c1, B:18:0x00ca, B:22:0x00e1, B:23:0x00f0, B:24:0x00a9, B:26:0x00af, B:27:0x00bb), top: B:11:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1 A[Catch: all -> 0x003a, RaiseCancellationException -> 0x003d, ApolloException -> 0x0040, TRY_ENTER, TryCatch #4 {ApolloException -> 0x0040, blocks: (B:12:0x0036, B:13:0x0087, B:15:0x008f, B:16:0x00c1, B:18:0x00ca, B:22:0x00e1, B:23:0x00f0, B:24:0x00a9, B:26:0x00af, B:27:0x00bb), top: B:11:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9 A[Catch: all -> 0x003a, RaiseCancellationException -> 0x003d, ApolloException -> 0x0040, TryCatch #4 {ApolloException -> 0x0040, blocks: (B:12:0x0036, B:13:0x0087, B:15:0x008f, B:16:0x00c1, B:18:0x00ca, B:22:0x00e1, B:23:0x00f0, B:24:0x00a9, B:26:0x00af, B:27:0x00bb), top: B:11:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.paypal.oslo.feature.notificationcenter.domain.repository.NotificationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getNotifications(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.notificationcenter.domain.model.NotificationError, com.paypal.oslo.feature.notificationcenter.domain.model.NotificationData>> continuation) {
        com.paypal.oslo.feature.notificationcenter.data.repository.NotificationRepositoryImpl$getNotifications$1 notificationRepositoryImpl$getNotifications$1;
        int i;
        java.lang.Throwable th;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.RaiseCancellationException e;
        arrow.core.raise.DefaultRaise defaultRaise2;
        com.apollographql.apollo.exception.ApolloException e2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.DefaultRaise defaultRaise3;
        com.apollographql.apollo.exception.ApolloException apolloException;
        arrow.core.Either right;
        com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Data data;
        try {
            if (continuation instanceof com.paypal.oslo.feature.notificationcenter.data.repository.NotificationRepositoryImpl$getNotifications$1) {
                notificationRepositoryImpl$getNotifications$1 = (com.paypal.oslo.feature.notificationcenter.data.repository.NotificationRepositoryImpl$getNotifications$1) continuation;
                if ((notificationRepositoryImpl$getNotifications$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    notificationRepositoryImpl$getNotifications$1.getInputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = notificationRepositoryImpl$getNotifications$1.getHighSpeedVideoSizesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = notificationRepositoryImpl$getNotifications$1.getInputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        try {
                            defaultRaise2 = defaultRaise;
                            try {
                                com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighResolutionOutputSizeshNQ4ISI.query(new com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery()), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                                notificationRepositoryImpl$getNotifications$1.getHighSpeedVideoFpsRanges = defaultRaise;
                                notificationRepositoryImpl$getNotifications$1.getOutputMinFrameDuration = defaultRaise2;
                                notificationRepositoryImpl$getNotifications$1.Camera2StreamConfigurationMap = 0;
                                notificationRepositoryImpl$getNotifications$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                notificationRepositoryImpl$getNotifications$1.getHighSpeedVideoFpsRangesFor = 0;
                                notificationRepositoryImpl$getNotifications$1.getHighSpeedVideoSizes = 0;
                                notificationRepositoryImpl$getNotifications$1.getInputSizeshNQ4ISI = 1;
                                java.lang.Object execute = apolloCall.execute(notificationRepositoryImpl$getNotifications$1);
                                if (execute == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                raise = defaultRaise2;
                                defaultRaise3 = defaultRaise;
                                obj = execute;
                            } catch (com.apollographql.apollo.exception.ApolloException e3) {
                                e2 = e3;
                                java.lang.String message = e2.getMessage();
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to fetch notifications: ");
                                sb.append(message);
                                defaultRaise2.raise(new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationError.NetworkError(sb.toString()));
                                throw new kotlin.KotlinNothingValueException();
                            }
                        } catch (arrow.core.raise.RaiseCancellationException e4) {
                            e = e4;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = notificationRepositoryImpl$getNotifications$1.getHighSpeedVideoSizes;
                        int i3 = notificationRepositoryImpl$getNotifications$1.getHighSpeedVideoFpsRangesFor;
                        int i4 = notificationRepositoryImpl$getNotifications$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i5 = notificationRepositoryImpl$getNotifications$1.Camera2StreamConfigurationMap;
                        raise = (arrow.core.raise.Raise) notificationRepositoryImpl$getNotifications$1.getOutputMinFrameDuration;
                        defaultRaise3 = (arrow.core.raise.DefaultRaise) notificationRepositoryImpl$getNotifications$1.getHighSpeedVideoFpsRanges;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                        } catch (com.apollographql.apollo.exception.ApolloException e5) {
                            e2 = e5;
                            defaultRaise2 = raise;
                            java.lang.String message2 = e2.getMessage();
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to fetch notifications: ");
                            sb2.append(message2);
                            defaultRaise2.raise(new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationError.NetworkError(sb2.toString()));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    }
                    com.apollographql.apollo.api.ApolloResponse apolloResponse = (com.apollographql.apollo.api.ApolloResponse) obj;
                    apolloException = apolloResponse.exception;
                    if (!(apolloException instanceof com.apollographql.apollo.exception.ApolloNetworkException)) {
                        right = arrow.core.EitherKt.left(new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationError.NoInternetError("No internet connection: ".concat(java.lang.String.valueOf(((com.apollographql.apollo.exception.ApolloNetworkException) apolloException).getMessage()))));
                    } else if (apolloResponse.hasErrors()) {
                        right = arrow.core.EitherKt.left(new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationError.NetworkError("GraphQL query returned with errors"));
                    } else {
                        right = arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                    }
                    raise.bind(right);
                    data = (com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Data) apolloResponse.data;
                    if (data != null) {
                        raise.raise(new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationError.NetworkError("GraphQL response data is null"));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    com.paypal.oslo.feature.notificationcenter.domain.model.NotificationData notificationData = (com.paypal.oslo.feature.notificationcenter.domain.model.NotificationData) raise.bind(this.Camera2StreamConfigurationMap.processNotificationCenterResponse$notification_center_prodRelease(data));
                    defaultRaise3.complete();
                    return new arrow.core.Either.Right(notificationData);
                }
            }
            if (i != 0) {
            }
            com.apollographql.apollo.api.ApolloResponse apolloResponse2 = (com.apollographql.apollo.api.ApolloResponse) obj;
            apolloException = apolloResponse2.exception;
            if (!(apolloException instanceof com.apollographql.apollo.exception.ApolloNetworkException)) {
            }
            raise.bind(right);
            data = (com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Data) apolloResponse2.data;
            if (data != null) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e6) {
            com.paypal.oslo.feature.notificationcenter.data.repository.NotificationRepositoryImpl$getNotifications$1 notificationRepositoryImpl$getNotifications$12 = notificationRepositoryImpl$getNotifications$1;
            e = e6;
            defaultRaise = notificationRepositoryImpl$getNotifications$12;
        } catch (java.lang.Throwable th3) {
            com.paypal.oslo.feature.notificationcenter.data.repository.NotificationRepositoryImpl$getNotifications$1 notificationRepositoryImpl$getNotifications$13 = notificationRepositoryImpl$getNotifications$1;
            th = th3;
            defaultRaise = notificationRepositoryImpl$getNotifications$13;
        }
        notificationRepositoryImpl$getNotifications$1 = new com.paypal.oslo.feature.notificationcenter.data.repository.NotificationRepositoryImpl$getNotifications$1(this, continuation);
        java.lang.Object obj2 = notificationRepositoryImpl$getNotifications$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationRepositoryImpl$getNotifications$1.getInputSizeshNQ4ISI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0125 A[Catch: all -> 0x0056, RaiseCancellationException -> 0x0059, ApolloException -> 0x005c, TryCatch #2 {ApolloException -> 0x005c, blocks: (B:12:0x0051, B:13:0x011d, B:15:0x0125, B:16:0x0157, B:18:0x0160, B:22:0x0171, B:23:0x0180, B:24:0x013f, B:26:0x0145, B:27:0x0151), top: B:11:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0160 A[Catch: all -> 0x0056, RaiseCancellationException -> 0x0059, ApolloException -> 0x005c, TRY_LEAVE, TryCatch #2 {ApolloException -> 0x005c, blocks: (B:12:0x0051, B:13:0x011d, B:15:0x0125, B:16:0x0157, B:18:0x0160, B:22:0x0171, B:23:0x0180, B:24:0x013f, B:26:0x0145, B:27:0x0151), top: B:11:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0171 A[Catch: all -> 0x0056, RaiseCancellationException -> 0x0059, ApolloException -> 0x005c, TRY_ENTER, TryCatch #2 {ApolloException -> 0x005c, blocks: (B:12:0x0051, B:13:0x011d, B:15:0x0125, B:16:0x0157, B:18:0x0160, B:22:0x0171, B:23:0x0180, B:24:0x013f, B:26:0x0145, B:27:0x0151), top: B:11:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013f A[Catch: all -> 0x0056, RaiseCancellationException -> 0x0059, ApolloException -> 0x005c, TryCatch #2 {ApolloException -> 0x005c, blocks: (B:12:0x0051, B:13:0x011d, B:15:0x0125, B:16:0x0157, B:18:0x0160, B:22:0x0171, B:23:0x0180, B:24:0x013f, B:26:0x0145, B:27:0x0151), top: B:11:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r3v15, types: [arrow.core.raise.Raise] */
    /* JADX WARN: Type inference failed for: r4v0, types: [arrow.core.raise.DefaultRaise, int] */
    @Override // com.paypal.oslo.feature.notificationcenter.domain.repository.NotificationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateNotificationsTrackingStatus(java.util.List<java.lang.String> list, java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIdentifierInput> list2, java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.notificationcenter.domain.model.NotificationError, com.paypal.oslo.feature.notificationcenter.domain.model.UpdateNotificationsTrackingStatus>> continuation) {
        com.paypal.oslo.feature.notificationcenter.data.repository.NotificationRepositoryImpl$updateNotificationsTrackingStatus$1 notificationRepositoryImpl$updateNotificationsTrackingStatus$1;
        ?? r4;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        java.util.ArrayList arrayList;
        arrow.core.raise.DefaultRaise defaultRaise3;
        com.apollographql.apollo.exception.ApolloException apolloException;
        arrow.core.Either right;
        com.paypal.oslo.feature.notificationcenter.graphql.UpdateNotificationsTrackingStatusMutation.Data data;
        try {
            if (continuation instanceof com.paypal.oslo.feature.notificationcenter.data.repository.NotificationRepositoryImpl$updateNotificationsTrackingStatus$1) {
                notificationRepositoryImpl$updateNotificationsTrackingStatus$1 = (com.paypal.oslo.feature.notificationcenter.data.repository.NotificationRepositoryImpl$updateNotificationsTrackingStatus$1) continuation;
                if ((notificationRepositoryImpl$updateNotificationsTrackingStatus$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                    notificationRepositoryImpl$updateNotificationsTrackingStatus$1.getOutputSizes -= 2147483648;
                    java.lang.Object obj = notificationRepositoryImpl$updateNotificationsTrackingStatus$1.getOutputStallDuration;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r4 = notificationRepositoryImpl$updateNotificationsTrackingStatus$1.getOutputSizes;
                    if (r4 == 0) {
                        if (r4 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i = notificationRepositoryImpl$updateNotificationsTrackingStatus$1.getHighSpeedVideoSizes;
                        int i2 = notificationRepositoryImpl$updateNotificationsTrackingStatus$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i3 = notificationRepositoryImpl$updateNotificationsTrackingStatus$1.Camera2StreamConfigurationMap;
                        int i4 = notificationRepositoryImpl$updateNotificationsTrackingStatus$1.getHighSpeedVideoFpsRanges;
                        ?? r3 = (arrow.core.raise.Raise) notificationRepositoryImpl$updateNotificationsTrackingStatus$1.getOutputFormats;
                        defaultRaise = (arrow.core.raise.DefaultRaise) notificationRepositoryImpl$updateNotificationsTrackingStatus$1.getOutputMinFrameDuration;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            defaultRaise3 = r3;
                        } catch (com.apollographql.apollo.exception.ApolloException e) {
                            e = e;
                            defaultRaise2 = r3;
                            java.lang.String message = e.getMessage();
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append("Failed to update notification status: ");
                            sb.append(message);
                            defaultRaise2.raise(new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationError.NetworkError(sb.toString()));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    } else {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        defaultRaise2 = defaultRaise;
                        try {
                            com.paypal.oslo.api.graphql.schema.type.NotificationStatus safeValueOf = com.paypal.oslo.api.graphql.schema.type.NotificationStatus.INSTANCE.safeValueOf(str);
                            if (list2 != null) {
                                java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIdentifierInput> list3 = list2;
                                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                                for (com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIdentifierInput notificationIdentifierInput : list3) {
                                    arrayList2.add(new com.paypal.oslo.api.graphql.schema.type.NotificationIdentifierInput(com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(notificationIdentifierInput.getNotificationId()), notificationIdentifierInput.getContentId(), notificationIdentifierInput.getCampaignId()));
                                }
                                arrayList = arrayList2;
                            } else {
                                arrayList = null;
                            }
                            com.paypal.oslo.api.graphql.schema.type.UpdateNotificationsTrackingStatusInput updateNotificationsTrackingStatusInput = new com.paypal.oslo.api.graphql.schema.type.UpdateNotificationsTrackingStatusInput(com.paypal.oslo.api.graphql.schema.type.NotificationChannel.NOTIFICATION_CENTER, com.apollographql.apollo.api.Optional.INSTANCE.present(arrayList), com.apollographql.apollo.api.Optional.INSTANCE.present(list), safeValueOf);
                            com.apollographql.apollo.ApolloCall mutation = this.getHighResolutionOutputSizeshNQ4ISI.mutation(new com.paypal.oslo.feature.notificationcenter.graphql.UpdateNotificationsTrackingStatusMutation(updateNotificationsTrackingStatusInput));
                            notificationRepositoryImpl$updateNotificationsTrackingStatus$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                            notificationRepositoryImpl$updateNotificationsTrackingStatus$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                            notificationRepositoryImpl$updateNotificationsTrackingStatus$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                            notificationRepositoryImpl$updateNotificationsTrackingStatus$1.getOutputMinFrameDuration = defaultRaise;
                            notificationRepositoryImpl$updateNotificationsTrackingStatus$1.getOutputFormats = defaultRaise2;
                            notificationRepositoryImpl$updateNotificationsTrackingStatus$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(safeValueOf);
                            notificationRepositoryImpl$updateNotificationsTrackingStatus$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateNotificationsTrackingStatusInput);
                            notificationRepositoryImpl$updateNotificationsTrackingStatus$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(arrayList);
                            notificationRepositoryImpl$updateNotificationsTrackingStatus$1.getHighSpeedVideoFpsRanges = 0;
                            notificationRepositoryImpl$updateNotificationsTrackingStatus$1.Camera2StreamConfigurationMap = 0;
                            notificationRepositoryImpl$updateNotificationsTrackingStatus$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            notificationRepositoryImpl$updateNotificationsTrackingStatus$1.getHighSpeedVideoSizes = 0;
                            notificationRepositoryImpl$updateNotificationsTrackingStatus$1.getOutputSizes = 1;
                            obj = mutation.execute(notificationRepositoryImpl$updateNotificationsTrackingStatus$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            defaultRaise3 = defaultRaise2;
                        } catch (com.apollographql.apollo.exception.ApolloException e2) {
                            e = e2;
                            java.lang.String message2 = e.getMessage();
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append("Failed to update notification status: ");
                            sb2.append(message2);
                            defaultRaise2.raise(new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationError.NetworkError(sb2.toString()));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    }
                    com.apollographql.apollo.api.ApolloResponse apolloResponse = (com.apollographql.apollo.api.ApolloResponse) obj;
                    apolloException = apolloResponse.exception;
                    if (!(apolloException instanceof com.apollographql.apollo.exception.ApolloNetworkException)) {
                        right = arrow.core.EitherKt.left(new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationError.NoInternetError("No internet connection: ".concat(java.lang.String.valueOf(((com.apollographql.apollo.exception.ApolloNetworkException) apolloException).getMessage()))));
                    } else if (apolloResponse.hasErrors()) {
                        right = arrow.core.EitherKt.left(new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationError.NetworkError("GraphQL mutation returned with errors"));
                    } else {
                        right = arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                    }
                    defaultRaise3.bind(right);
                    data = (com.paypal.oslo.feature.notificationcenter.graphql.UpdateNotificationsTrackingStatusMutation.Data) apolloResponse.data;
                    if (data != null) {
                        defaultRaise3.raise(new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationError.NetworkError("GraphQL response data is null"));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    com.paypal.oslo.feature.notificationcenter.domain.model.UpdateNotificationsTrackingStatus processUpdateNotificationsTrackingStatusResponse = this.Camera2StreamConfigurationMap.processUpdateNotificationsTrackingStatusResponse(data);
                    defaultRaise.complete();
                    return new arrow.core.Either.Right(processUpdateNotificationsTrackingStatusResponse);
                }
            }
            if (r4 == 0) {
            }
            com.apollographql.apollo.api.ApolloResponse apolloResponse2 = (com.apollographql.apollo.api.ApolloResponse) obj;
            apolloException = apolloResponse2.exception;
            if (!(apolloException instanceof com.apollographql.apollo.exception.ApolloNetworkException)) {
            }
            defaultRaise3.bind(right);
            data = (com.paypal.oslo.feature.notificationcenter.graphql.UpdateNotificationsTrackingStatusMutation.Data) apolloResponse2.data;
            if (data != null) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e3) {
            r4.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e3, r4));
        } catch (java.lang.Throwable th) {
            r4.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        notificationRepositoryImpl$updateNotificationsTrackingStatus$1 = new com.paypal.oslo.feature.notificationcenter.data.repository.NotificationRepositoryImpl$updateNotificationsTrackingStatus$1(this, continuation);
        java.lang.Object obj2 = notificationRepositoryImpl$updateNotificationsTrackingStatus$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = notificationRepositoryImpl$updateNotificationsTrackingStatus$1.getOutputSizes;
    }
}
