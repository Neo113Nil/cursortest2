package com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\u0007*\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00120\u00062\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060\u0017j\u0002`\u00180\u00062\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/criticalalert/data/repository/CriticalAlertRepositoryImpl;", "Lcom/paypal/oslo/feature/notificationcenter/criticalalert/domain/repository/CriticalAlertRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/notificationcenter/criticalalert/domain/repository/CriticalAlertError;", "", "Lcom/paypal/oslo/feature/notificationcenter/criticalalert/domain/model/CriticalAlertData;", "getCriticalAlerts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/notificationcenter/criticalalert/domain/repository/CriticalAlertError;", "alertData", "Lcom/paypal/oslo/feature/notificationcenter/criticalalert/domain/model/TrackingStatus;", "status", "", "trackAlert", "(Lcom/paypal/oslo/feature/notificationcenter/criticalalert/domain/model/CriticalAlertData;Lcom/paypal/oslo/feature/notificationcenter/criticalalert/domain/model/TrackingStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "p1", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateNotificationsTrackingStatusInput;", "Lcom/paypal/oslo/feature/notificationcenter/graphql/type/UpdateNotificationsTrackingStatusInput;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/notificationcenter/criticalalert/domain/model/CriticalAlertData;Lcom/paypal/oslo/feature/notificationcenter/criticalalert/domain/model/TrackingStatus;)Larrow/core/Either;", "Lcom/apollographql/apollo/ApolloClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CriticalAlertRepositoryImpl implements com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public CriticalAlertRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRangesFor = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCriticalAlerts(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertError, ? extends java.util.List<com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData>>> continuation) {
        com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository.CriticalAlertRepositoryImpl$getCriticalAlerts$1 criticalAlertRepositoryImpl$getCriticalAlerts$1;
        int i;
        arrow.core.Either either;
        arrow.core.Either.Right right;
        java.util.ArrayList emptyList;
        java.util.List<com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.CriticalAlert> criticalAlerts;
        if (continuation instanceof com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository.CriticalAlertRepositoryImpl$getCriticalAlerts$1) {
            criticalAlertRepositoryImpl$getCriticalAlerts$1 = (com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository.CriticalAlertRepositoryImpl$getCriticalAlerts$1) continuation;
            if ((criticalAlertRepositoryImpl$getCriticalAlerts$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                criticalAlertRepositoryImpl$getCriticalAlerts$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository.CriticalAlertRepositoryImpl$getCriticalAlerts$1 criticalAlertRepositoryImpl$getCriticalAlerts$12 = criticalAlertRepositoryImpl$getCriticalAlerts$1;
                java.lang.Object obj = criticalAlertRepositoryImpl$getCriticalAlerts$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = criticalAlertRepositoryImpl$getCriticalAlerts$12.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery getCriticalAlertsQuery = new com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery();
                    criticalAlertRepositoryImpl$getCriticalAlerts$12.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, getCriticalAlertsQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, criticalAlertRepositoryImpl$getCriticalAlerts$12, 2, (java.lang.Object) null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.Data data = (com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Either.Right) right).getValue()).getData();
                    if (data == null || (criticalAlerts = data.getCriticalAlerts()) == null) {
                        emptyList = kotlin.collections.CollectionsKt.emptyList();
                    } else {
                        java.util.List<com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.CriticalAlert> list = criticalAlerts;
                        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                        for (com.paypal.oslo.feature.notificationcenter.graphql.GetCriticalAlertsQuery.CriticalAlert criticalAlert : list) {
                            arrayList.add(new com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData(criticalAlert.getNotificationId(), criticalAlert.getCampaignId(), criticalAlert.getContentId(), criticalAlert.getTitle(), criticalAlert.getBody(), criticalAlert.getDeepLink().toString(), criticalAlert.getTrackingToken()));
                        }
                        emptyList = arrayList;
                    }
                    return new arrow.core.Either.Right(emptyList);
                }
                if (right instanceof arrow.core.Either.Left) {
                    return right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        criticalAlertRepositoryImpl$getCriticalAlerts$1 = new com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository.CriticalAlertRepositoryImpl$getCriticalAlerts$1(this, continuation);
        com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository.CriticalAlertRepositoryImpl$getCriticalAlerts$1 criticalAlertRepositoryImpl$getCriticalAlerts$122 = criticalAlertRepositoryImpl$getCriticalAlerts$1;
        java.lang.Object obj2 = criticalAlertRepositoryImpl$getCriticalAlerts$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = criticalAlertRepositoryImpl$getCriticalAlerts$122.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        if (!(right instanceof arrow.core.Either.Right)) {
        }
    }

    private static com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertError getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return new com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertError.Network(((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError().toString());
        }
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            return new com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertError.Network(((com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY()))).getMessage());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object trackAlert(com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData criticalAlertData, com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.TrackingStatus trackingStatus, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository.CriticalAlertRepositoryImpl$trackAlert$1 criticalAlertRepositoryImpl$trackAlert$1;
        int i;
        arrow.core.Either either;
        arrow.core.Either.Right right;
        com.paypal.oslo.feature.notificationcenter.graphql.UpdateNotificationsTrackingStatusMutation.UpdateNotificationsTrackingStatus updateNotificationsTrackingStatus;
        if (continuation instanceof com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository.CriticalAlertRepositoryImpl$trackAlert$1) {
            criticalAlertRepositoryImpl$trackAlert$1 = (com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository.CriticalAlertRepositoryImpl$trackAlert$1) continuation;
            if ((criticalAlertRepositoryImpl$trackAlert$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                criticalAlertRepositoryImpl$trackAlert$1.getOutputFormats -= 2147483648;
                com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository.CriticalAlertRepositoryImpl$trackAlert$1 criticalAlertRepositoryImpl$trackAlert$12 = criticalAlertRepositoryImpl$trackAlert$1;
                java.lang.Object obj = criticalAlertRepositoryImpl$trackAlert$12.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = criticalAlertRepositoryImpl$trackAlert$12.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrow.core.Either<com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertError, com.paypal.oslo.api.graphql.schema.type.UpdateNotificationsTrackingStatusInput> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(criticalAlertData, trackingStatus);
                    if (highResolutionOutputSizeshNQ4ISI instanceof arrow.core.Either.Right) {
                        com.paypal.oslo.api.graphql.schema.type.UpdateNotificationsTrackingStatusInput updateNotificationsTrackingStatusInput = (com.paypal.oslo.api.graphql.schema.type.UpdateNotificationsTrackingStatusInput) ((arrow.core.Either.Right) highResolutionOutputSizeshNQ4ISI).getValue();
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRangesFor;
                        com.paypal.oslo.feature.notificationcenter.graphql.UpdateNotificationsTrackingStatusMutation updateNotificationsTrackingStatusMutation = new com.paypal.oslo.feature.notificationcenter.graphql.UpdateNotificationsTrackingStatusMutation(updateNotificationsTrackingStatusInput);
                        criticalAlertRepositoryImpl$trackAlert$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(criticalAlertData);
                        criticalAlertRepositoryImpl$trackAlert$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(trackingStatus);
                        criticalAlertRepositoryImpl$trackAlert$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(highResolutionOutputSizeshNQ4ISI);
                        criticalAlertRepositoryImpl$trackAlert$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateNotificationsTrackingStatusInput);
                        criticalAlertRepositoryImpl$trackAlert$12.getHighSpeedVideoSizes = 0;
                        criticalAlertRepositoryImpl$trackAlert$12.getHighSpeedVideoFpsRangesFor = 0;
                        criticalAlertRepositoryImpl$trackAlert$12.getOutputFormats = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, updateNotificationsTrackingStatusMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, criticalAlertRepositoryImpl$trackAlert$12, 2, (java.lang.Object) null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (highResolutionOutputSizeshNQ4ISI instanceof arrow.core.Either.Left) {
                            return highResolutionOutputSizeshNQ4ISI;
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = criticalAlertRepositoryImpl$trackAlert$12.getHighSpeedVideoFpsRangesFor;
                    int i3 = criticalAlertRepositoryImpl$trackAlert$12.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.notificationcenter.graphql.UpdateNotificationsTrackingStatusMutation.Data data = (com.paypal.oslo.feature.notificationcenter.graphql.UpdateNotificationsTrackingStatusMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Either.Right) right).getValue()).getData();
                    if (kotlin.jvm.internal.Intrinsics.areEqual((data == null || (updateNotificationsTrackingStatus = data.getUpdateNotificationsTrackingStatus()) == null) ? null : kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updateNotificationsTrackingStatus.getSuccess()), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true))) {
                        return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                    }
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertError.Network("update_notifications_tracking_status_failed"));
                }
                if (right instanceof arrow.core.Either.Left) {
                    return right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        criticalAlertRepositoryImpl$trackAlert$1 = new com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository.CriticalAlertRepositoryImpl$trackAlert$1(this, continuation);
        com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository.CriticalAlertRepositoryImpl$trackAlert$1 criticalAlertRepositoryImpl$trackAlert$122 = criticalAlertRepositoryImpl$trackAlert$1;
        java.lang.Object obj2 = criticalAlertRepositoryImpl$trackAlert$122.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = criticalAlertRepositoryImpl$trackAlert$122.getOutputFormats;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        if (!(right instanceof arrow.core.Either.Right)) {
        }
    }

    private static arrow.core.Either<com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertError, com.paypal.oslo.api.graphql.schema.type.UpdateNotificationsTrackingStatusInput> getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData p0, com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.TrackingStatus p1) {
        com.paypal.oslo.api.graphql.schema.type.NotificationStatus notificationStatus;
        com.paypal.oslo.api.graphql.schema.type.UpdateNotificationsTrackingStatusInput updateNotificationsTrackingStatusInput;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            int i = com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository.CriticalAlertRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[p1.ordinal()];
            if (i == 1) {
                notificationStatus = com.paypal.oslo.api.graphql.schema.type.NotificationStatus.IMPRESSED;
            } else {
                if (i != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                notificationStatus = com.paypal.oslo.api.graphql.schema.type.NotificationStatus.CLICKED;
            }
            if (p0.getTrackingToken() != null) {
                updateNotificationsTrackingStatusInput = new com.paypal.oslo.api.graphql.schema.type.UpdateNotificationsTrackingStatusInput(com.paypal.oslo.api.graphql.schema.type.NotificationChannel.CRITICAL_ALERT, com.apollographql.apollo.api.Optional.INSTANCE.absent(), com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.collections.CollectionsKt.listOf(p0.getTrackingToken())), notificationStatus);
            } else if (p0.getCampaignId() != null) {
                if (p0.getContentId() != null) {
                    updateNotificationsTrackingStatusInput = new com.paypal.oslo.api.graphql.schema.type.UpdateNotificationsTrackingStatusInput(com.paypal.oslo.api.graphql.schema.type.NotificationChannel.CRITICAL_ALERT, com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.api.graphql.schema.type.NotificationIdentifierInput(com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(p0.getNotificationId()), p0.getContentId(), p0.getCampaignId()))), com.apollographql.apollo.api.Optional.INSTANCE.absent(), notificationStatus);
                } else {
                    defaultRaise2.raise(new com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertError.Network("Missing contentId for tracking"));
                    throw new kotlin.KotlinNothingValueException();
                }
            } else {
                defaultRaise2.raise(new com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertError.Network("Missing campaignId for tracking"));
                throw new kotlin.KotlinNothingValueException();
            }
            defaultRaise.complete();
            return new arrow.core.Either.Right(updateNotificationsTrackingStatusInput);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.TrackingStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.TrackingStatus.IMPRESSED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.TrackingStatus.CLICKED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
