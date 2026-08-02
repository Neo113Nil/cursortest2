package com.paypal.oslo.feature.userprofile.data.repository;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b0\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J4\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u00152\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d0\u00152\u0006\u0010\u0019\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d0\u00152\u0006\u0010\u0019\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b \u0010\u001fJ$\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d0\u00152\u0006\u0010\u0019\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b!\u0010\u001fJ$\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d0\u00152\u0006\u0010\u0019\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\"\u0010\u001fJ$\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020#0\u00152\u0006\u0010\u0019\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b$\u0010\u001fJ4\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020#0\u00152\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b'\u0010(JN\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u00152\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010*\u001a\u0004\u0018\u00010\u0011H\u0096@¢\u0006\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/data/repository/EmailRepositoryImpl;", "Lcom/paypal/oslo/feature/userprofile/domain/repository/EmailRepository;", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/ObserveUserStoreUseCase;", "observeUserStoreUseCase", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/feature/userprofile/domain/usecase/ObserveUserStoreUseCase;Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/core/userstore/UserStore;)V", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/userprofile/domain/model/DataResult;", "", "Lcom/paypal/oslo/feature/userprofile/domain/ProfileDataItem;", "Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "getEmails", "()Lkotlinx/coroutines/flow/Flow;", "", androidx.autofill.HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "", "makePrimary", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailError;", "addEmail", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emailId", "isPrimary", "updateEmail", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "makePrimaryEmail", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "replacePrimaryEmail", "reconfirmEmail", "removeEmail", "Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailConfirmationChallenge;", "initiateEmailConfirmation", "authId", "challengeId", "reinitiateEmailConfirmation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "code", "replaceId", "confirmEmail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/ObserveUserStoreUseCase;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/userstore/UserStore;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EmailRepositoryImpl implements com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore Camera2StreamConfigurationMap;
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoSizes;

    @javax.inject.Inject
    public EmailRepositoryImpl(com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase observeUserStoreUseCase, com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observeUserStoreUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.getHighSpeedVideoFpsRanges = observeUserStoreUseCase;
        this.getHighSpeedVideoSizes = apolloClient;
        this.Camera2StreamConfigurationMap = userStore;
    }

    @Override // com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.userprofile.domain.model.DataResult<java.util.List<com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<com.paypal.oslo.core.userstore.model.ProfileEmail>>>> getEmails() {
        final kotlinx.coroutines.flow.Flow<com.paypal.oslo.core.userstore.model.UserState> invoke = this.getHighSpeedVideoFpsRanges.invoke();
        return (kotlinx.coroutines.flow.Flow) new kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.userprofile.domain.model.DataResult<? extends java.util.List<? extends com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<com.paypal.oslo.core.userstore.model.ProfileEmail>>>>() { // from class: com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$getEmails$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.userprofile.domain.model.DataResult<? extends java.util.List<? extends com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<com.paypal.oslo.core.userstore.model.ProfileEmail>>>> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$getEmails$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$getEmails$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRangesFor;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$getEmails$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    java.lang.Object obj2;
                    java.util.ArrayList arrayList;
                    if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$getEmails$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$getEmails$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getOutputMinFrameDuration -= 2147483648;
                            java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoSizesFor;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getOutputMinFrameDuration;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj3);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRangesFor;
                                com.paypal.oslo.core.userstore.model.UserState userState = (com.paypal.oslo.core.userstore.model.UserState) obj;
                                if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoading) {
                                    obj2 = (com.paypal.oslo.feature.userprofile.domain.model.DataResult) com.paypal.oslo.feature.userprofile.domain.model.DataResult.Loading.INSTANCE;
                                } else if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
                                    java.util.List<com.paypal.oslo.core.userstore.model.ProfileEmail> profileEmails = ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState).getUser().getProfileEmails();
                                    if (profileEmails != null) {
                                        java.util.List<com.paypal.oslo.core.userstore.model.ProfileEmail> list = profileEmails;
                                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                                        java.util.Iterator<T> it = list.iterator();
                                        while (it.hasNext()) {
                                            arrayList2.add(com.paypal.oslo.feature.userprofile.domain.ProfileDataItemExtensionsKt.toProfileDataItem((com.paypal.oslo.core.userstore.model.ProfileEmail) it.next()));
                                        }
                                        arrayList = arrayList2;
                                    } else {
                                        arrayList = null;
                                    }
                                    if (arrayList == null) {
                                        arrayList = kotlin.collections.CollectionsKt.emptyList();
                                    }
                                    obj2 = (com.paypal.oslo.feature.userprofile.domain.model.DataResult) new com.paypal.oslo.feature.userprofile.domain.model.DataResult.Success(arrayList);
                                } else {
                                    obj2 = userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileError ? (com.paypal.oslo.feature.userprofile.domain.model.DataResult) new com.paypal.oslo.feature.userprofile.domain.model.DataResult.Error("Failed to load user profile.") : (com.paypal.oslo.feature.userprofile.domain.model.DataResult) new com.paypal.oslo.feature.userprofile.domain.model.DataResult.Success(kotlin.collections.CollectionsKt.emptyList());
                                }
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoSizes = 0;
                                anonymousClass1.getOutputMinFrameDuration = 1;
                                if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoSizes;
                                java.lang.Object obj4 = anonymousClass1.Camera2StreamConfigurationMap;
                                java.lang.Object obj5 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                kotlin.ResultKt.throwOnFailure(obj3);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$getEmails$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj32 = anonymousClass1.getHighSpeedVideoSizesFor;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getOutputMinFrameDuration;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$getEmails$$inlined$map$1$2", f = "EmailRepositoryImpl.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$getEmails$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    int getHighSpeedVideoSizes;
                    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
                    int getOutputMinFrameDuration;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoSizesFor = obj;
                        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$getEmails$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.getHighSpeedVideoFpsRangesFor = flowCollector;
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object addEmail(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.email.EmailError, com.paypal.oslo.core.userstore.model.ProfileEmail>> continuation) {
        com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$addEmail$1 emailRepositoryImpl$addEmail$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.lang.Object highSpeedVideoSizes;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$addEmail$1) {
            emailRepositoryImpl$addEmail$1 = (com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$addEmail$1) continuation;
            if ((emailRepositoryImpl$addEmail$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                emailRepositoryImpl$addEmail$1.getOutputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$addEmail$1 emailRepositoryImpl$addEmail$12 = emailRepositoryImpl$addEmail$1;
                java.lang.Object obj = emailRepositoryImpl$addEmail$12.getOutputStallDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = emailRepositoryImpl$addEmail$12.getOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.api.graphql.schema.type.AddPartyEmailInput addPartyEmailInput = new com.paypal.oslo.api.graphql.schema.type.AddPartyEmailInput(str, z);
                        com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation addPartyEmailMutation = new com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation(addPartyEmailInput);
                        com.paypal.oslo.core.network.graphql.RiskSourceId addEmail = com.paypal.oslo.core.network.graphql.RiskSourceId.UserProfile.INSTANCE.getAddEmail();
                        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl.$r8$lambda$sSwZP9BRNd_UW954lVJAu1G3DoY((com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Data) obj2);
                            }
                        };
                        emailRepositoryImpl$addEmail$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        emailRepositoryImpl$addEmail$12.getHighSpeedVideoSizesFor = defaultRaise;
                        emailRepositoryImpl$addEmail$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        emailRepositoryImpl$addEmail$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addPartyEmailInput);
                        emailRepositoryImpl$addEmail$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addPartyEmailMutation);
                        emailRepositoryImpl$addEmail$12.getInputFormats = defaultRaise3;
                        emailRepositoryImpl$addEmail$12.getOutputMinFrameDurationlomOqCM = z;
                        emailRepositoryImpl$addEmail$12.getHighSpeedVideoFpsRangesFor = 0;
                        emailRepositoryImpl$addEmail$12.getHighSpeedVideoSizes = 0;
                        emailRepositoryImpl$addEmail$12.Camera2StreamConfigurationMap = 0;
                        emailRepositoryImpl$addEmail$12.getHighSpeedVideoFpsRanges = 0;
                        emailRepositoryImpl$addEmail$12.getOutputSizeshNQ4ISI = 1;
                        highSpeedVideoSizes = com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImplKt.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, addPartyEmailMutation, addEmail, "addEmail", function1, emailRepositoryImpl$addEmail$12);
                        if (highSpeedVideoSizes == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        obj = highSpeedVideoSizes;
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
                    int i2 = emailRepositoryImpl$addEmail$12.getHighSpeedVideoFpsRanges;
                    int i3 = emailRepositoryImpl$addEmail$12.Camera2StreamConfigurationMap;
                    int i4 = emailRepositoryImpl$addEmail$12.getHighSpeedVideoSizes;
                    int i5 = emailRepositoryImpl$addEmail$12.getHighSpeedVideoFpsRangesFor;
                    boolean z2 = emailRepositoryImpl$addEmail$12.getOutputMinFrameDurationlomOqCM;
                    raise = (arrow.core.raise.Raise) emailRepositoryImpl$addEmail$12.getInputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) emailRepositoryImpl$addEmail$12.getHighSpeedVideoSizesFor;
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
                com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail = com.paypal.oslo.feature.userprofile.data.mapper.EmailResponseMapperKt.toProfileEmail(((com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Email) raise.bind((arrow.core.Either) obj)).getEmailFragment());
                defaultRaise2.complete();
                return new arrow.core.Either.Right(profileEmail);
            }
        }
        emailRepositoryImpl$addEmail$1 = new com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$addEmail$1(this, continuation);
        com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$addEmail$1 emailRepositoryImpl$addEmail$122 = emailRepositoryImpl$addEmail$1;
        java.lang.Object obj2 = emailRepositoryImpl$addEmail$122.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = emailRepositoryImpl$addEmail$122.getOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail2 = com.paypal.oslo.feature.userprofile.data.mapper.EmailResponseMapperKt.toProfileEmail(((com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Email) raise.bind((arrow.core.Either) obj2)).getEmailFragment());
        defaultRaise2.complete();
        return new arrow.core.Either.Right(profileEmail2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateEmail(java.lang.String str, java.lang.String str2, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.email.EmailError, com.paypal.oslo.core.userstore.model.ProfileEmail>> continuation) {
        com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$updateEmail$1 emailRepositoryImpl$updateEmail$1;
        java.lang.Object coroutine_suspended;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        int i2;
        com.paypal.oslo.api.graphql.schema.type.UpdatePartyEmailInput updatePartyEmailInput;
        java.lang.String str3;
        java.lang.Object highSpeedVideoSizes;
        int i3;
        int i4;
        int i5;
        arrow.core.raise.Raise raise;
        com.paypal.oslo.feature.userprofile.graphql.UpdatePartyEmailMutation updatePartyEmailMutation;
        java.lang.String str4;
        arrow.core.raise.Raise raise2;
        com.paypal.oslo.core.userstore.UserStore userStore;
        com.paypal.oslo.feature.userprofile.graphql.UpdatePartyEmailMutation.Email email;
        arrow.core.raise.DefaultRaise defaultRaise2;
        boolean z2 = z;
        try {
            if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$updateEmail$1) {
                emailRepositoryImpl$updateEmail$1 = (com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$updateEmail$1) continuation;
                if ((emailRepositoryImpl$updateEmail$1.getOutputMinFrameDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                    emailRepositoryImpl$updateEmail$1.getOutputMinFrameDurationlomOqCM -= 2147483648;
                    java.lang.Object obj = emailRepositoryImpl$updateEmail$1.getOutputStallDuration;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = emailRepositoryImpl$updateEmail$1.getOutputMinFrameDurationlomOqCM;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        i2 = 0;
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        str3 = str;
                        updatePartyEmailInput = new com.paypal.oslo.api.graphql.schema.type.UpdatePartyEmailInput(str3, str2, z2);
                        com.paypal.oslo.feature.userprofile.graphql.UpdatePartyEmailMutation updatePartyEmailMutation2 = new com.paypal.oslo.feature.userprofile.graphql.UpdatePartyEmailMutation(updatePartyEmailInput);
                        com.paypal.oslo.core.network.graphql.RiskSourceId updateEmail = com.paypal.oslo.core.network.graphql.RiskSourceId.UserProfile.INSTANCE.getUpdateEmail();
                        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl.m20441$r8$lambda$rV9EeJjVsRQ_Ad2yl87Dzs0Q((com.paypal.oslo.feature.userprofile.graphql.UpdatePartyEmailMutation.Data) obj2);
                            }
                        };
                        emailRepositoryImpl$updateEmail$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        emailRepositoryImpl$updateEmail$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        emailRepositoryImpl$updateEmail$1.getInputFormats = defaultRaise;
                        emailRepositoryImpl$updateEmail$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        emailRepositoryImpl$updateEmail$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updatePartyEmailInput);
                        emailRepositoryImpl$updateEmail$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updatePartyEmailMutation2);
                        emailRepositoryImpl$updateEmail$1.getOutputStallDurationlomOqCM = defaultRaise3;
                        emailRepositoryImpl$updateEmail$1.getOutputSizes = z2;
                        emailRepositoryImpl$updateEmail$1.getHighSpeedVideoSizes = 0;
                        emailRepositoryImpl$updateEmail$1.getHighSpeedVideoFpsRanges = 0;
                        emailRepositoryImpl$updateEmail$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        emailRepositoryImpl$updateEmail$1.Camera2StreamConfigurationMap = 0;
                        emailRepositoryImpl$updateEmail$1.getOutputMinFrameDurationlomOqCM = 1;
                        highSpeedVideoSizes = com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImplKt.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, updatePartyEmailMutation2, updateEmail, "updateEmail", function1, emailRepositoryImpl$updateEmail$1);
                        if (highSpeedVideoSizes != coroutine_suspended) {
                            i3 = 0;
                            i4 = 0;
                            i5 = 0;
                            raise = defaultRaise3;
                            updatePartyEmailMutation = updatePartyEmailMutation2;
                            str4 = str2;
                            raise2 = raise;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i6 = emailRepositoryImpl$updateEmail$1.Camera2StreamConfigurationMap;
                        int i7 = emailRepositoryImpl$updateEmail$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i8 = emailRepositoryImpl$updateEmail$1.getHighSpeedVideoFpsRanges;
                        int i9 = emailRepositoryImpl$updateEmail$1.getHighSpeedVideoSizes;
                        boolean z3 = emailRepositoryImpl$updateEmail$1.getOutputSizes;
                        email = (com.paypal.oslo.feature.userprofile.graphql.UpdatePartyEmailMutation.Email) emailRepositoryImpl$updateEmail$1.getOutputStallDurationlomOqCM;
                        defaultRaise2 = (arrow.core.raise.DefaultRaise) emailRepositoryImpl$updateEmail$1.getInputFormats;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail = com.paypal.oslo.feature.userprofile.data.mapper.EmailResponseMapperKt.toProfileEmail(email.getEmailFragment());
                            defaultRaise2.complete();
                            return new arrow.core.Either.Right(profileEmail);
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            e = e;
                            defaultRaise = defaultRaise2;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        } catch (java.lang.Throwable th) {
                            th = th;
                            defaultRaise = defaultRaise2;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    }
                    int i10 = emailRepositoryImpl$updateEmail$1.Camera2StreamConfigurationMap;
                    int i11 = emailRepositoryImpl$updateEmail$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i12 = emailRepositoryImpl$updateEmail$1.getHighSpeedVideoFpsRanges;
                    int i13 = emailRepositoryImpl$updateEmail$1.getHighSpeedVideoSizes;
                    boolean z4 = emailRepositoryImpl$updateEmail$1.getOutputSizes;
                    raise = (arrow.core.raise.Raise) emailRepositoryImpl$updateEmail$1.getOutputStallDurationlomOqCM;
                    updatePartyEmailMutation = (com.paypal.oslo.feature.userprofile.graphql.UpdatePartyEmailMutation) emailRepositoryImpl$updateEmail$1.getInputSizeshNQ4ISI;
                    updatePartyEmailInput = (com.paypal.oslo.api.graphql.schema.type.UpdatePartyEmailInput) emailRepositoryImpl$updateEmail$1.getOutputMinFrameDuration;
                    raise2 = (arrow.core.raise.Raise) emailRepositoryImpl$updateEmail$1.getHighSpeedVideoSizesFor;
                    defaultRaise = (arrow.core.raise.DefaultRaise) emailRepositoryImpl$updateEmail$1.getInputFormats;
                    str4 = (java.lang.String) emailRepositoryImpl$updateEmail$1.getOutputFormats;
                    str3 = (java.lang.String) emailRepositoryImpl$updateEmail$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i2 = i10;
                    z2 = z4;
                    i5 = i13;
                    i4 = i12;
                    i3 = i11;
                    highSpeedVideoSizes = obj;
                    com.paypal.oslo.feature.userprofile.graphql.UpdatePartyEmailMutation.Email email2 = (com.paypal.oslo.feature.userprofile.graphql.UpdatePartyEmailMutation.Email) raise.bind((arrow.core.Either) highSpeedVideoSizes);
                    userStore = this.Camera2StreamConfigurationMap;
                    emailRepositoryImpl$updateEmail$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    emailRepositoryImpl$updateEmail$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                    emailRepositoryImpl$updateEmail$1.getInputFormats = defaultRaise;
                    emailRepositoryImpl$updateEmail$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise2);
                    emailRepositoryImpl$updateEmail$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updatePartyEmailInput);
                    emailRepositoryImpl$updateEmail$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updatePartyEmailMutation);
                    emailRepositoryImpl$updateEmail$1.getOutputStallDurationlomOqCM = email2;
                    emailRepositoryImpl$updateEmail$1.getOutputSizes = z2;
                    emailRepositoryImpl$updateEmail$1.getHighSpeedVideoSizes = i5;
                    emailRepositoryImpl$updateEmail$1.getHighSpeedVideoFpsRanges = i4;
                    emailRepositoryImpl$updateEmail$1.getHighResolutionOutputSizeshNQ4ISI = i3;
                    emailRepositoryImpl$updateEmail$1.Camera2StreamConfigurationMap = i2;
                    emailRepositoryImpl$updateEmail$1.getOutputMinFrameDurationlomOqCM = 2;
                    if (com.paypal.oslo.core.userstore.UserStore.refresh$default(userStore, null, emailRepositoryImpl$updateEmail$1, 1, null) != coroutine_suspended) {
                        email = email2;
                        defaultRaise2 = defaultRaise;
                        com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail2 = com.paypal.oslo.feature.userprofile.data.mapper.EmailResponseMapperKt.toProfileEmail(email.getEmailFragment());
                        defaultRaise2.complete();
                        return new arrow.core.Either.Right(profileEmail2);
                    }
                    return coroutine_suspended;
                }
            }
            if (i != 0) {
            }
            com.paypal.oslo.feature.userprofile.graphql.UpdatePartyEmailMutation.Email email22 = (com.paypal.oslo.feature.userprofile.graphql.UpdatePartyEmailMutation.Email) raise.bind((arrow.core.Either) highSpeedVideoSizes);
            userStore = this.Camera2StreamConfigurationMap;
            emailRepositoryImpl$updateEmail$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
            emailRepositoryImpl$updateEmail$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
            emailRepositoryImpl$updateEmail$1.getInputFormats = defaultRaise;
            emailRepositoryImpl$updateEmail$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise2);
            emailRepositoryImpl$updateEmail$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updatePartyEmailInput);
            emailRepositoryImpl$updateEmail$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updatePartyEmailMutation);
            emailRepositoryImpl$updateEmail$1.getOutputStallDurationlomOqCM = email22;
            emailRepositoryImpl$updateEmail$1.getOutputSizes = z2;
            emailRepositoryImpl$updateEmail$1.getHighSpeedVideoSizes = i5;
            emailRepositoryImpl$updateEmail$1.getHighSpeedVideoFpsRanges = i4;
            emailRepositoryImpl$updateEmail$1.getHighResolutionOutputSizeshNQ4ISI = i3;
            emailRepositoryImpl$updateEmail$1.Camera2StreamConfigurationMap = i2;
            emailRepositoryImpl$updateEmail$1.getOutputMinFrameDurationlomOqCM = 2;
            if (com.paypal.oslo.core.userstore.UserStore.refresh$default(userStore, null, emailRepositoryImpl$updateEmail$1, 1, null) != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        emailRepositoryImpl$updateEmail$1 = new com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$updateEmail$1(this, continuation);
        java.lang.Object obj2 = emailRepositoryImpl$updateEmail$1.getOutputStallDuration;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = emailRepositoryImpl$updateEmail$1.getOutputMinFrameDurationlomOqCM;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object makePrimaryEmail(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.email.EmailError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$makePrimaryEmail$1 emailRepositoryImpl$makePrimaryEmail$1;
        java.lang.Object coroutine_suspended;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.lang.String str2;
        java.lang.Object highSpeedVideoSizes;
        int i2;
        int i3;
        int i4;
        arrow.core.raise.Raise raise;
        com.paypal.oslo.feature.userprofile.graphql.MakePrimaryPartyEmailMutation makePrimaryPartyEmailMutation;
        int i5;
        com.paypal.oslo.api.graphql.schema.type.MakePrimaryPartyEmailInput makePrimaryPartyEmailInput;
        arrow.core.raise.Raise raise2;
        com.paypal.oslo.core.userstore.UserStore userStore;
        arrow.core.raise.DefaultRaise defaultRaise2;
        try {
            if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$makePrimaryEmail$1) {
                emailRepositoryImpl$makePrimaryEmail$1 = (com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$makePrimaryEmail$1) continuation;
                if ((emailRepositoryImpl$makePrimaryEmail$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    emailRepositoryImpl$makePrimaryEmail$1.getOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = emailRepositoryImpl$makePrimaryEmail$1.getOutputStallDurationlomOqCM;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = emailRepositoryImpl$makePrimaryEmail$1.getOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        str2 = str;
                        com.paypal.oslo.api.graphql.schema.type.MakePrimaryPartyEmailInput makePrimaryPartyEmailInput2 = new com.paypal.oslo.api.graphql.schema.type.MakePrimaryPartyEmailInput(str2);
                        com.paypal.oslo.feature.userprofile.graphql.MakePrimaryPartyEmailMutation makePrimaryPartyEmailMutation2 = new com.paypal.oslo.feature.userprofile.graphql.MakePrimaryPartyEmailMutation(makePrimaryPartyEmailInput2);
                        com.paypal.oslo.core.network.graphql.RiskSourceId makePrimaryEmail = com.paypal.oslo.core.network.graphql.RiskSourceId.UserProfile.INSTANCE.getMakePrimaryEmail();
                        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl.$r8$lambda$ccjWFL6J_0bQjnCxtMSnG8N9yw0((com.paypal.oslo.feature.userprofile.graphql.MakePrimaryPartyEmailMutation.Data) obj2);
                            }
                        };
                        emailRepositoryImpl$makePrimaryEmail$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        emailRepositoryImpl$makePrimaryEmail$1.getHighSpeedVideoSizesFor = defaultRaise;
                        emailRepositoryImpl$makePrimaryEmail$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        emailRepositoryImpl$makePrimaryEmail$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(makePrimaryPartyEmailInput2);
                        emailRepositoryImpl$makePrimaryEmail$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(makePrimaryPartyEmailMutation2);
                        emailRepositoryImpl$makePrimaryEmail$1.getInputFormats = defaultRaise3;
                        emailRepositoryImpl$makePrimaryEmail$1.getHighSpeedVideoFpsRanges = 0;
                        emailRepositoryImpl$makePrimaryEmail$1.getHighSpeedVideoSizes = 0;
                        emailRepositoryImpl$makePrimaryEmail$1.getHighSpeedVideoFpsRangesFor = 0;
                        emailRepositoryImpl$makePrimaryEmail$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        emailRepositoryImpl$makePrimaryEmail$1.getOutputSizeshNQ4ISI = 1;
                        highSpeedVideoSizes = com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImplKt.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, makePrimaryPartyEmailMutation2, makePrimaryEmail, "makePrimaryEmail", function1, emailRepositoryImpl$makePrimaryEmail$1);
                        if (highSpeedVideoSizes != coroutine_suspended) {
                            i2 = 0;
                            i3 = 0;
                            i4 = 0;
                            raise = defaultRaise3;
                            makePrimaryPartyEmailMutation = makePrimaryPartyEmailMutation2;
                            obj = highSpeedVideoSizes;
                            i5 = 0;
                            makePrimaryPartyEmailInput = makePrimaryPartyEmailInput2;
                            raise2 = raise;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i6 = emailRepositoryImpl$makePrimaryEmail$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i7 = emailRepositoryImpl$makePrimaryEmail$1.getHighSpeedVideoFpsRangesFor;
                        int i8 = emailRepositoryImpl$makePrimaryEmail$1.getHighSpeedVideoSizes;
                        int i9 = emailRepositoryImpl$makePrimaryEmail$1.getHighSpeedVideoFpsRanges;
                        defaultRaise2 = (arrow.core.raise.DefaultRaise) emailRepositoryImpl$makePrimaryEmail$1.getHighSpeedVideoSizesFor;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            defaultRaise2.complete();
                            return new arrow.core.Either.Right(unit);
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            e = e;
                            defaultRaise = defaultRaise2;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        } catch (java.lang.Throwable th) {
                            th = th;
                            defaultRaise = defaultRaise2;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    }
                    i5 = emailRepositoryImpl$makePrimaryEmail$1.getHighResolutionOutputSizeshNQ4ISI;
                    i2 = emailRepositoryImpl$makePrimaryEmail$1.getHighSpeedVideoFpsRangesFor;
                    i3 = emailRepositoryImpl$makePrimaryEmail$1.getHighSpeedVideoSizes;
                    i4 = emailRepositoryImpl$makePrimaryEmail$1.getHighSpeedVideoFpsRanges;
                    raise = (arrow.core.raise.Raise) emailRepositoryImpl$makePrimaryEmail$1.getInputFormats;
                    makePrimaryPartyEmailMutation = (com.paypal.oslo.feature.userprofile.graphql.MakePrimaryPartyEmailMutation) emailRepositoryImpl$makePrimaryEmail$1.getOutputFormats;
                    makePrimaryPartyEmailInput = (com.paypal.oslo.api.graphql.schema.type.MakePrimaryPartyEmailInput) emailRepositoryImpl$makePrimaryEmail$1.getInputSizeshNQ4ISI;
                    raise2 = (arrow.core.raise.Raise) emailRepositoryImpl$makePrimaryEmail$1.getOutputMinFrameDuration;
                    defaultRaise = (arrow.core.raise.DefaultRaise) emailRepositoryImpl$makePrimaryEmail$1.getHighSpeedVideoSizesFor;
                    str2 = (java.lang.String) emailRepositoryImpl$makePrimaryEmail$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    raise.bind((arrow.core.Either) obj);
                    userStore = this.Camera2StreamConfigurationMap;
                    emailRepositoryImpl$makePrimaryEmail$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    emailRepositoryImpl$makePrimaryEmail$1.getHighSpeedVideoSizesFor = defaultRaise;
                    emailRepositoryImpl$makePrimaryEmail$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise2);
                    emailRepositoryImpl$makePrimaryEmail$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(makePrimaryPartyEmailInput);
                    emailRepositoryImpl$makePrimaryEmail$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(makePrimaryPartyEmailMutation);
                    emailRepositoryImpl$makePrimaryEmail$1.getInputFormats = null;
                    emailRepositoryImpl$makePrimaryEmail$1.getHighSpeedVideoFpsRanges = i4;
                    emailRepositoryImpl$makePrimaryEmail$1.getHighSpeedVideoSizes = i3;
                    emailRepositoryImpl$makePrimaryEmail$1.getHighSpeedVideoFpsRangesFor = i2;
                    emailRepositoryImpl$makePrimaryEmail$1.getHighResolutionOutputSizeshNQ4ISI = i5;
                    emailRepositoryImpl$makePrimaryEmail$1.getOutputSizeshNQ4ISI = 2;
                    if (com.paypal.oslo.core.userstore.UserStore.refresh$default(userStore, null, emailRepositoryImpl$makePrimaryEmail$1, 1, null) != coroutine_suspended) {
                        defaultRaise2 = defaultRaise;
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        defaultRaise2.complete();
                        return new arrow.core.Either.Right(unit2);
                    }
                    return coroutine_suspended;
                }
            }
            if (i != 0) {
            }
            raise.bind((arrow.core.Either) obj);
            userStore = this.Camera2StreamConfigurationMap;
            emailRepositoryImpl$makePrimaryEmail$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
            emailRepositoryImpl$makePrimaryEmail$1.getHighSpeedVideoSizesFor = defaultRaise;
            emailRepositoryImpl$makePrimaryEmail$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise2);
            emailRepositoryImpl$makePrimaryEmail$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(makePrimaryPartyEmailInput);
            emailRepositoryImpl$makePrimaryEmail$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(makePrimaryPartyEmailMutation);
            emailRepositoryImpl$makePrimaryEmail$1.getInputFormats = null;
            emailRepositoryImpl$makePrimaryEmail$1.getHighSpeedVideoFpsRanges = i4;
            emailRepositoryImpl$makePrimaryEmail$1.getHighSpeedVideoSizes = i3;
            emailRepositoryImpl$makePrimaryEmail$1.getHighSpeedVideoFpsRangesFor = i2;
            emailRepositoryImpl$makePrimaryEmail$1.getHighResolutionOutputSizeshNQ4ISI = i5;
            emailRepositoryImpl$makePrimaryEmail$1.getOutputSizeshNQ4ISI = 2;
            if (com.paypal.oslo.core.userstore.UserStore.refresh$default(userStore, null, emailRepositoryImpl$makePrimaryEmail$1, 1, null) != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        emailRepositoryImpl$makePrimaryEmail$1 = new com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$makePrimaryEmail$1(this, continuation);
        java.lang.Object obj2 = emailRepositoryImpl$makePrimaryEmail$1.getOutputStallDurationlomOqCM;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = emailRepositoryImpl$makePrimaryEmail$1.getOutputSizeshNQ4ISI;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object replacePrimaryEmail(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.email.EmailError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$replacePrimaryEmail$1 emailRepositoryImpl$replacePrimaryEmail$1;
        java.lang.Object coroutine_suspended;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.lang.String str2;
        java.lang.Object highSpeedVideoSizes;
        int i2;
        int i3;
        int i4;
        arrow.core.raise.Raise raise;
        com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation replacePrimaryPartyEmailMutation;
        int i5;
        com.paypal.oslo.api.graphql.schema.type.ReplacePrimaryPartyEmailInput replacePrimaryPartyEmailInput;
        arrow.core.raise.Raise raise2;
        com.paypal.oslo.core.userstore.UserStore userStore;
        arrow.core.raise.DefaultRaise defaultRaise2;
        try {
            if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$replacePrimaryEmail$1) {
                emailRepositoryImpl$replacePrimaryEmail$1 = (com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$replacePrimaryEmail$1) continuation;
                if ((emailRepositoryImpl$replacePrimaryEmail$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    emailRepositoryImpl$replacePrimaryEmail$1.getOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = emailRepositoryImpl$replacePrimaryEmail$1.getOutputSizes;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = emailRepositoryImpl$replacePrimaryEmail$1.getOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        str2 = str;
                        com.paypal.oslo.api.graphql.schema.type.ReplacePrimaryPartyEmailInput replacePrimaryPartyEmailInput2 = new com.paypal.oslo.api.graphql.schema.type.ReplacePrimaryPartyEmailInput(str2);
                        com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation replacePrimaryPartyEmailMutation2 = new com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation(replacePrimaryPartyEmailInput2);
                        com.paypal.oslo.core.network.graphql.RiskSourceId replacePrimaryEmail = com.paypal.oslo.core.network.graphql.RiskSourceId.UserProfile.INSTANCE.getReplacePrimaryEmail();
                        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl.$r8$lambda$2eLwl2KcZlcnBxfGdTNzKvJQSQc((com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.Data) obj2);
                            }
                        };
                        emailRepositoryImpl$replacePrimaryEmail$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        emailRepositoryImpl$replacePrimaryEmail$1.getOutputMinFrameDuration = defaultRaise;
                        emailRepositoryImpl$replacePrimaryEmail$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        emailRepositoryImpl$replacePrimaryEmail$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(replacePrimaryPartyEmailInput2);
                        emailRepositoryImpl$replacePrimaryEmail$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(replacePrimaryPartyEmailMutation2);
                        emailRepositoryImpl$replacePrimaryEmail$1.getInputFormats = defaultRaise3;
                        emailRepositoryImpl$replacePrimaryEmail$1.Camera2StreamConfigurationMap = 0;
                        emailRepositoryImpl$replacePrimaryEmail$1.getHighSpeedVideoFpsRangesFor = 0;
                        emailRepositoryImpl$replacePrimaryEmail$1.getHighSpeedVideoFpsRanges = 0;
                        emailRepositoryImpl$replacePrimaryEmail$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        emailRepositoryImpl$replacePrimaryEmail$1.getOutputSizeshNQ4ISI = 1;
                        highSpeedVideoSizes = com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImplKt.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, replacePrimaryPartyEmailMutation2, replacePrimaryEmail, "replacePrimaryEmail", function1, emailRepositoryImpl$replacePrimaryEmail$1);
                        if (highSpeedVideoSizes != coroutine_suspended) {
                            i2 = 0;
                            i3 = 0;
                            i4 = 0;
                            raise = defaultRaise3;
                            replacePrimaryPartyEmailMutation = replacePrimaryPartyEmailMutation2;
                            obj = highSpeedVideoSizes;
                            i5 = 0;
                            replacePrimaryPartyEmailInput = replacePrimaryPartyEmailInput2;
                            raise2 = raise;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i6 = emailRepositoryImpl$replacePrimaryEmail$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i7 = emailRepositoryImpl$replacePrimaryEmail$1.getHighSpeedVideoFpsRanges;
                        int i8 = emailRepositoryImpl$replacePrimaryEmail$1.getHighSpeedVideoFpsRangesFor;
                        int i9 = emailRepositoryImpl$replacePrimaryEmail$1.Camera2StreamConfigurationMap;
                        defaultRaise2 = (arrow.core.raise.DefaultRaise) emailRepositoryImpl$replacePrimaryEmail$1.getOutputMinFrameDuration;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            defaultRaise2.complete();
                            return new arrow.core.Either.Right(unit);
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            e = e;
                            defaultRaise = defaultRaise2;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        } catch (java.lang.Throwable th) {
                            th = th;
                            defaultRaise = defaultRaise2;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    }
                    i5 = emailRepositoryImpl$replacePrimaryEmail$1.getHighResolutionOutputSizeshNQ4ISI;
                    i2 = emailRepositoryImpl$replacePrimaryEmail$1.getHighSpeedVideoFpsRanges;
                    i3 = emailRepositoryImpl$replacePrimaryEmail$1.getHighSpeedVideoFpsRangesFor;
                    i4 = emailRepositoryImpl$replacePrimaryEmail$1.Camera2StreamConfigurationMap;
                    raise = (arrow.core.raise.Raise) emailRepositoryImpl$replacePrimaryEmail$1.getInputFormats;
                    replacePrimaryPartyEmailMutation = (com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation) emailRepositoryImpl$replacePrimaryEmail$1.getHighSpeedVideoSizesFor;
                    replacePrimaryPartyEmailInput = (com.paypal.oslo.api.graphql.schema.type.ReplacePrimaryPartyEmailInput) emailRepositoryImpl$replacePrimaryEmail$1.getOutputFormats;
                    raise2 = (arrow.core.raise.Raise) emailRepositoryImpl$replacePrimaryEmail$1.getInputSizeshNQ4ISI;
                    defaultRaise = (arrow.core.raise.DefaultRaise) emailRepositoryImpl$replacePrimaryEmail$1.getOutputMinFrameDuration;
                    str2 = (java.lang.String) emailRepositoryImpl$replacePrimaryEmail$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    raise.bind((arrow.core.Either) obj);
                    userStore = this.Camera2StreamConfigurationMap;
                    emailRepositoryImpl$replacePrimaryEmail$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    emailRepositoryImpl$replacePrimaryEmail$1.getOutputMinFrameDuration = defaultRaise;
                    emailRepositoryImpl$replacePrimaryEmail$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise2);
                    emailRepositoryImpl$replacePrimaryEmail$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(replacePrimaryPartyEmailInput);
                    emailRepositoryImpl$replacePrimaryEmail$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(replacePrimaryPartyEmailMutation);
                    emailRepositoryImpl$replacePrimaryEmail$1.getInputFormats = null;
                    emailRepositoryImpl$replacePrimaryEmail$1.Camera2StreamConfigurationMap = i4;
                    emailRepositoryImpl$replacePrimaryEmail$1.getHighSpeedVideoFpsRangesFor = i3;
                    emailRepositoryImpl$replacePrimaryEmail$1.getHighSpeedVideoFpsRanges = i2;
                    emailRepositoryImpl$replacePrimaryEmail$1.getHighResolutionOutputSizeshNQ4ISI = i5;
                    emailRepositoryImpl$replacePrimaryEmail$1.getOutputSizeshNQ4ISI = 2;
                    if (com.paypal.oslo.core.userstore.UserStore.refresh$default(userStore, null, emailRepositoryImpl$replacePrimaryEmail$1, 1, null) != coroutine_suspended) {
                        defaultRaise2 = defaultRaise;
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        defaultRaise2.complete();
                        return new arrow.core.Either.Right(unit2);
                    }
                    return coroutine_suspended;
                }
            }
            if (i != 0) {
            }
            raise.bind((arrow.core.Either) obj);
            userStore = this.Camera2StreamConfigurationMap;
            emailRepositoryImpl$replacePrimaryEmail$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
            emailRepositoryImpl$replacePrimaryEmail$1.getOutputMinFrameDuration = defaultRaise;
            emailRepositoryImpl$replacePrimaryEmail$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise2);
            emailRepositoryImpl$replacePrimaryEmail$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(replacePrimaryPartyEmailInput);
            emailRepositoryImpl$replacePrimaryEmail$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(replacePrimaryPartyEmailMutation);
            emailRepositoryImpl$replacePrimaryEmail$1.getInputFormats = null;
            emailRepositoryImpl$replacePrimaryEmail$1.Camera2StreamConfigurationMap = i4;
            emailRepositoryImpl$replacePrimaryEmail$1.getHighSpeedVideoFpsRangesFor = i3;
            emailRepositoryImpl$replacePrimaryEmail$1.getHighSpeedVideoFpsRanges = i2;
            emailRepositoryImpl$replacePrimaryEmail$1.getHighResolutionOutputSizeshNQ4ISI = i5;
            emailRepositoryImpl$replacePrimaryEmail$1.getOutputSizeshNQ4ISI = 2;
            if (com.paypal.oslo.core.userstore.UserStore.refresh$default(userStore, null, emailRepositoryImpl$replacePrimaryEmail$1, 1, null) != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        emailRepositoryImpl$replacePrimaryEmail$1 = new com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$replacePrimaryEmail$1(this, continuation);
        java.lang.Object obj2 = emailRepositoryImpl$replacePrimaryEmail$1.getOutputSizes;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = emailRepositoryImpl$replacePrimaryEmail$1.getOutputSizeshNQ4ISI;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object reconfirmEmail(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.email.EmailError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$reconfirmEmail$1 emailRepositoryImpl$reconfirmEmail$1;
        java.lang.Object coroutine_suspended;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.lang.String str2;
        java.lang.Object highSpeedVideoSizes;
        int i2;
        int i3;
        int i4;
        arrow.core.raise.Raise raise;
        com.paypal.oslo.feature.userprofile.graphql.ReconfirmPartyEmailMutation reconfirmPartyEmailMutation;
        int i5;
        com.paypal.oslo.api.graphql.schema.type.ReconfirmPartyEmailInput reconfirmPartyEmailInput;
        arrow.core.raise.Raise raise2;
        com.paypal.oslo.core.userstore.UserStore userStore;
        arrow.core.raise.DefaultRaise defaultRaise2;
        try {
            if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$reconfirmEmail$1) {
                emailRepositoryImpl$reconfirmEmail$1 = (com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$reconfirmEmail$1) continuation;
                if ((emailRepositoryImpl$reconfirmEmail$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    emailRepositoryImpl$reconfirmEmail$1.getOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = emailRepositoryImpl$reconfirmEmail$1.getOutputSizes;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = emailRepositoryImpl$reconfirmEmail$1.getOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        str2 = str;
                        com.paypal.oslo.api.graphql.schema.type.ReconfirmPartyEmailInput reconfirmPartyEmailInput2 = new com.paypal.oslo.api.graphql.schema.type.ReconfirmPartyEmailInput(str2);
                        com.paypal.oslo.feature.userprofile.graphql.ReconfirmPartyEmailMutation reconfirmPartyEmailMutation2 = new com.paypal.oslo.feature.userprofile.graphql.ReconfirmPartyEmailMutation(reconfirmPartyEmailInput2);
                        com.paypal.oslo.core.network.graphql.RiskSourceId reconfirmEmail = com.paypal.oslo.core.network.graphql.RiskSourceId.UserProfile.INSTANCE.getReconfirmEmail();
                        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl.$r8$lambda$LEcXldtJK06dwqNcffRdS597htQ((com.paypal.oslo.feature.userprofile.graphql.ReconfirmPartyEmailMutation.Data) obj2);
                            }
                        };
                        emailRepositoryImpl$reconfirmEmail$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        emailRepositoryImpl$reconfirmEmail$1.getInputSizeshNQ4ISI = defaultRaise;
                        emailRepositoryImpl$reconfirmEmail$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        emailRepositoryImpl$reconfirmEmail$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(reconfirmPartyEmailInput2);
                        emailRepositoryImpl$reconfirmEmail$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(reconfirmPartyEmailMutation2);
                        emailRepositoryImpl$reconfirmEmail$1.getInputFormats = defaultRaise3;
                        emailRepositoryImpl$reconfirmEmail$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        emailRepositoryImpl$reconfirmEmail$1.getHighSpeedVideoFpsRangesFor = 0;
                        emailRepositoryImpl$reconfirmEmail$1.getHighSpeedVideoFpsRanges = 0;
                        emailRepositoryImpl$reconfirmEmail$1.Camera2StreamConfigurationMap = 0;
                        emailRepositoryImpl$reconfirmEmail$1.getOutputSizeshNQ4ISI = 1;
                        highSpeedVideoSizes = com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImplKt.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, reconfirmPartyEmailMutation2, reconfirmEmail, "reconfirmEmail", function1, emailRepositoryImpl$reconfirmEmail$1);
                        if (highSpeedVideoSizes != coroutine_suspended) {
                            i2 = 0;
                            i3 = 0;
                            i4 = 0;
                            raise = defaultRaise3;
                            reconfirmPartyEmailMutation = reconfirmPartyEmailMutation2;
                            obj = highSpeedVideoSizes;
                            i5 = 0;
                            reconfirmPartyEmailInput = reconfirmPartyEmailInput2;
                            raise2 = raise;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i6 = emailRepositoryImpl$reconfirmEmail$1.Camera2StreamConfigurationMap;
                        int i7 = emailRepositoryImpl$reconfirmEmail$1.getHighSpeedVideoFpsRanges;
                        int i8 = emailRepositoryImpl$reconfirmEmail$1.getHighSpeedVideoFpsRangesFor;
                        int i9 = emailRepositoryImpl$reconfirmEmail$1.getHighResolutionOutputSizeshNQ4ISI;
                        defaultRaise2 = (arrow.core.raise.DefaultRaise) emailRepositoryImpl$reconfirmEmail$1.getInputSizeshNQ4ISI;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            defaultRaise2.complete();
                            return new arrow.core.Either.Right(unit);
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            e = e;
                            defaultRaise = defaultRaise2;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        } catch (java.lang.Throwable th) {
                            th = th;
                            defaultRaise = defaultRaise2;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    }
                    i5 = emailRepositoryImpl$reconfirmEmail$1.Camera2StreamConfigurationMap;
                    i2 = emailRepositoryImpl$reconfirmEmail$1.getHighSpeedVideoFpsRanges;
                    i3 = emailRepositoryImpl$reconfirmEmail$1.getHighSpeedVideoFpsRangesFor;
                    i4 = emailRepositoryImpl$reconfirmEmail$1.getHighResolutionOutputSizeshNQ4ISI;
                    raise = (arrow.core.raise.Raise) emailRepositoryImpl$reconfirmEmail$1.getInputFormats;
                    reconfirmPartyEmailMutation = (com.paypal.oslo.feature.userprofile.graphql.ReconfirmPartyEmailMutation) emailRepositoryImpl$reconfirmEmail$1.getOutputMinFrameDuration;
                    reconfirmPartyEmailInput = (com.paypal.oslo.api.graphql.schema.type.ReconfirmPartyEmailInput) emailRepositoryImpl$reconfirmEmail$1.getHighSpeedVideoSizesFor;
                    raise2 = (arrow.core.raise.Raise) emailRepositoryImpl$reconfirmEmail$1.getOutputFormats;
                    defaultRaise = (arrow.core.raise.DefaultRaise) emailRepositoryImpl$reconfirmEmail$1.getInputSizeshNQ4ISI;
                    str2 = (java.lang.String) emailRepositoryImpl$reconfirmEmail$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    raise.bind((arrow.core.Either) obj);
                    userStore = this.Camera2StreamConfigurationMap;
                    emailRepositoryImpl$reconfirmEmail$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    emailRepositoryImpl$reconfirmEmail$1.getInputSizeshNQ4ISI = defaultRaise;
                    emailRepositoryImpl$reconfirmEmail$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise2);
                    emailRepositoryImpl$reconfirmEmail$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(reconfirmPartyEmailInput);
                    emailRepositoryImpl$reconfirmEmail$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(reconfirmPartyEmailMutation);
                    emailRepositoryImpl$reconfirmEmail$1.getInputFormats = null;
                    emailRepositoryImpl$reconfirmEmail$1.getHighResolutionOutputSizeshNQ4ISI = i4;
                    emailRepositoryImpl$reconfirmEmail$1.getHighSpeedVideoFpsRangesFor = i3;
                    emailRepositoryImpl$reconfirmEmail$1.getHighSpeedVideoFpsRanges = i2;
                    emailRepositoryImpl$reconfirmEmail$1.Camera2StreamConfigurationMap = i5;
                    emailRepositoryImpl$reconfirmEmail$1.getOutputSizeshNQ4ISI = 2;
                    if (com.paypal.oslo.core.userstore.UserStore.refresh$default(userStore, null, emailRepositoryImpl$reconfirmEmail$1, 1, null) != coroutine_suspended) {
                        defaultRaise2 = defaultRaise;
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        defaultRaise2.complete();
                        return new arrow.core.Either.Right(unit2);
                    }
                    return coroutine_suspended;
                }
            }
            if (i != 0) {
            }
            raise.bind((arrow.core.Either) obj);
            userStore = this.Camera2StreamConfigurationMap;
            emailRepositoryImpl$reconfirmEmail$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
            emailRepositoryImpl$reconfirmEmail$1.getInputSizeshNQ4ISI = defaultRaise;
            emailRepositoryImpl$reconfirmEmail$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise2);
            emailRepositoryImpl$reconfirmEmail$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(reconfirmPartyEmailInput);
            emailRepositoryImpl$reconfirmEmail$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(reconfirmPartyEmailMutation);
            emailRepositoryImpl$reconfirmEmail$1.getInputFormats = null;
            emailRepositoryImpl$reconfirmEmail$1.getHighResolutionOutputSizeshNQ4ISI = i4;
            emailRepositoryImpl$reconfirmEmail$1.getHighSpeedVideoFpsRangesFor = i3;
            emailRepositoryImpl$reconfirmEmail$1.getHighSpeedVideoFpsRanges = i2;
            emailRepositoryImpl$reconfirmEmail$1.Camera2StreamConfigurationMap = i5;
            emailRepositoryImpl$reconfirmEmail$1.getOutputSizeshNQ4ISI = 2;
            if (com.paypal.oslo.core.userstore.UserStore.refresh$default(userStore, null, emailRepositoryImpl$reconfirmEmail$1, 1, null) != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        emailRepositoryImpl$reconfirmEmail$1 = new com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$reconfirmEmail$1(this, continuation);
        java.lang.Object obj2 = emailRepositoryImpl$reconfirmEmail$1.getOutputSizes;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = emailRepositoryImpl$reconfirmEmail$1.getOutputSizeshNQ4ISI;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object removeEmail(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.email.EmailError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$removeEmail$1 emailRepositoryImpl$removeEmail$1;
        java.lang.Object coroutine_suspended;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.lang.String str2;
        java.lang.Object highSpeedVideoSizes;
        int i2;
        int i3;
        int i4;
        arrow.core.raise.Raise raise;
        com.paypal.oslo.feature.userprofile.graphql.DeletePartyEmailMutation deletePartyEmailMutation;
        int i5;
        com.paypal.oslo.api.graphql.schema.type.DeletePartyEmailInput deletePartyEmailInput;
        arrow.core.raise.Raise raise2;
        com.paypal.oslo.core.userstore.UserStore userStore;
        arrow.core.raise.DefaultRaise defaultRaise2;
        try {
            if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$removeEmail$1) {
                emailRepositoryImpl$removeEmail$1 = (com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$removeEmail$1) continuation;
                if ((emailRepositoryImpl$removeEmail$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                    emailRepositoryImpl$removeEmail$1.getOutputSizes -= 2147483648;
                    java.lang.Object obj = emailRepositoryImpl$removeEmail$1.getOutputMinFrameDurationlomOqCM;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = emailRepositoryImpl$removeEmail$1.getOutputSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        str2 = str;
                        com.paypal.oslo.api.graphql.schema.type.DeletePartyEmailInput deletePartyEmailInput2 = new com.paypal.oslo.api.graphql.schema.type.DeletePartyEmailInput(str2);
                        com.paypal.oslo.feature.userprofile.graphql.DeletePartyEmailMutation deletePartyEmailMutation2 = new com.paypal.oslo.feature.userprofile.graphql.DeletePartyEmailMutation(deletePartyEmailInput2);
                        com.paypal.oslo.core.network.graphql.RiskSourceId deleteEmail = com.paypal.oslo.core.network.graphql.RiskSourceId.UserProfile.INSTANCE.getDeleteEmail();
                        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl.$r8$lambda$f6E9M1C_yYXoPhpWzDkY7KWQF48((com.paypal.oslo.feature.userprofile.graphql.DeletePartyEmailMutation.Data) obj2);
                            }
                        };
                        emailRepositoryImpl$removeEmail$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        emailRepositoryImpl$removeEmail$1.getHighSpeedVideoSizesFor = defaultRaise;
                        emailRepositoryImpl$removeEmail$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        emailRepositoryImpl$removeEmail$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deletePartyEmailInput2);
                        emailRepositoryImpl$removeEmail$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deletePartyEmailMutation2);
                        emailRepositoryImpl$removeEmail$1.getInputSizeshNQ4ISI = defaultRaise3;
                        emailRepositoryImpl$removeEmail$1.Camera2StreamConfigurationMap = 0;
                        emailRepositoryImpl$removeEmail$1.getHighSpeedVideoSizes = 0;
                        emailRepositoryImpl$removeEmail$1.getHighSpeedVideoFpsRanges = 0;
                        emailRepositoryImpl$removeEmail$1.getHighSpeedVideoFpsRangesFor = 0;
                        emailRepositoryImpl$removeEmail$1.getOutputSizes = 1;
                        highSpeedVideoSizes = com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImplKt.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, deletePartyEmailMutation2, deleteEmail, "removeEmail", function1, emailRepositoryImpl$removeEmail$1);
                        if (highSpeedVideoSizes != coroutine_suspended) {
                            i2 = 0;
                            i3 = 0;
                            i4 = 0;
                            raise = defaultRaise3;
                            deletePartyEmailMutation = deletePartyEmailMutation2;
                            obj = highSpeedVideoSizes;
                            i5 = 0;
                            deletePartyEmailInput = deletePartyEmailInput2;
                            raise2 = raise;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i6 = emailRepositoryImpl$removeEmail$1.getHighSpeedVideoFpsRangesFor;
                        int i7 = emailRepositoryImpl$removeEmail$1.getHighSpeedVideoFpsRanges;
                        int i8 = emailRepositoryImpl$removeEmail$1.getHighSpeedVideoSizes;
                        int i9 = emailRepositoryImpl$removeEmail$1.Camera2StreamConfigurationMap;
                        defaultRaise2 = (arrow.core.raise.DefaultRaise) emailRepositoryImpl$removeEmail$1.getHighSpeedVideoSizesFor;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            defaultRaise2.complete();
                            return new arrow.core.Either.Right(unit);
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            e = e;
                            defaultRaise = defaultRaise2;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        } catch (java.lang.Throwable th) {
                            th = th;
                            defaultRaise = defaultRaise2;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    }
                    i5 = emailRepositoryImpl$removeEmail$1.getHighSpeedVideoFpsRangesFor;
                    i2 = emailRepositoryImpl$removeEmail$1.getHighSpeedVideoFpsRanges;
                    i3 = emailRepositoryImpl$removeEmail$1.getHighSpeedVideoSizes;
                    i4 = emailRepositoryImpl$removeEmail$1.Camera2StreamConfigurationMap;
                    raise = (arrow.core.raise.Raise) emailRepositoryImpl$removeEmail$1.getInputSizeshNQ4ISI;
                    deletePartyEmailMutation = (com.paypal.oslo.feature.userprofile.graphql.DeletePartyEmailMutation) emailRepositoryImpl$removeEmail$1.getInputFormats;
                    deletePartyEmailInput = (com.paypal.oslo.api.graphql.schema.type.DeletePartyEmailInput) emailRepositoryImpl$removeEmail$1.getOutputFormats;
                    raise2 = (arrow.core.raise.Raise) emailRepositoryImpl$removeEmail$1.getOutputMinFrameDuration;
                    defaultRaise = (arrow.core.raise.DefaultRaise) emailRepositoryImpl$removeEmail$1.getHighSpeedVideoSizesFor;
                    str2 = (java.lang.String) emailRepositoryImpl$removeEmail$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    raise.bind((arrow.core.Either) obj);
                    userStore = this.Camera2StreamConfigurationMap;
                    emailRepositoryImpl$removeEmail$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    emailRepositoryImpl$removeEmail$1.getHighSpeedVideoSizesFor = defaultRaise;
                    emailRepositoryImpl$removeEmail$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise2);
                    emailRepositoryImpl$removeEmail$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deletePartyEmailInput);
                    emailRepositoryImpl$removeEmail$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deletePartyEmailMutation);
                    emailRepositoryImpl$removeEmail$1.getInputSizeshNQ4ISI = null;
                    emailRepositoryImpl$removeEmail$1.Camera2StreamConfigurationMap = i4;
                    emailRepositoryImpl$removeEmail$1.getHighSpeedVideoSizes = i3;
                    emailRepositoryImpl$removeEmail$1.getHighSpeedVideoFpsRanges = i2;
                    emailRepositoryImpl$removeEmail$1.getHighSpeedVideoFpsRangesFor = i5;
                    emailRepositoryImpl$removeEmail$1.getOutputSizes = 2;
                    if (com.paypal.oslo.core.userstore.UserStore.refresh$default(userStore, null, emailRepositoryImpl$removeEmail$1, 1, null) != coroutine_suspended) {
                        defaultRaise2 = defaultRaise;
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        defaultRaise2.complete();
                        return new arrow.core.Either.Right(unit2);
                    }
                    return coroutine_suspended;
                }
            }
            if (i != 0) {
            }
            raise.bind((arrow.core.Either) obj);
            userStore = this.Camera2StreamConfigurationMap;
            emailRepositoryImpl$removeEmail$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
            emailRepositoryImpl$removeEmail$1.getHighSpeedVideoSizesFor = defaultRaise;
            emailRepositoryImpl$removeEmail$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise2);
            emailRepositoryImpl$removeEmail$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deletePartyEmailInput);
            emailRepositoryImpl$removeEmail$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deletePartyEmailMutation);
            emailRepositoryImpl$removeEmail$1.getInputSizeshNQ4ISI = null;
            emailRepositoryImpl$removeEmail$1.Camera2StreamConfigurationMap = i4;
            emailRepositoryImpl$removeEmail$1.getHighSpeedVideoSizes = i3;
            emailRepositoryImpl$removeEmail$1.getHighSpeedVideoFpsRanges = i2;
            emailRepositoryImpl$removeEmail$1.getHighSpeedVideoFpsRangesFor = i5;
            emailRepositoryImpl$removeEmail$1.getOutputSizes = 2;
            if (com.paypal.oslo.core.userstore.UserStore.refresh$default(userStore, null, emailRepositoryImpl$removeEmail$1, 1, null) != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        emailRepositoryImpl$removeEmail$1 = new com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$removeEmail$1(this, continuation);
        java.lang.Object obj2 = emailRepositoryImpl$removeEmail$1.getOutputMinFrameDurationlomOqCM;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = emailRepositoryImpl$removeEmail$1.getOutputSizes;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object initiateEmailConfirmation(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.email.EmailError, com.paypal.oslo.feature.userprofile.domain.model.email.EmailConfirmationChallenge>> continuation) {
        com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$initiateEmailConfirmation$1 emailRepositoryImpl$initiateEmailConfirmation$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.lang.Object highSpeedVideoSizes;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$initiateEmailConfirmation$1) {
            emailRepositoryImpl$initiateEmailConfirmation$1 = (com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$initiateEmailConfirmation$1) continuation;
            if ((emailRepositoryImpl$initiateEmailConfirmation$1.getOutputMinFrameDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                emailRepositoryImpl$initiateEmailConfirmation$1.getOutputMinFrameDurationlomOqCM -= 2147483648;
                com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$initiateEmailConfirmation$1 emailRepositoryImpl$initiateEmailConfirmation$12 = emailRepositoryImpl$initiateEmailConfirmation$1;
                java.lang.Object obj = emailRepositoryImpl$initiateEmailConfirmation$12.getOutputStallDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = emailRepositoryImpl$initiateEmailConfirmation$12.getOutputMinFrameDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.api.graphql.schema.type.InitiateEmailConfirmationInput initiateEmailConfirmationInput = new com.paypal.oslo.api.graphql.schema.type.InitiateEmailConfirmationInput(str);
                        com.paypal.oslo.feature.userprofile.graphql.InitiateEmailConfirmationMutation initiateEmailConfirmationMutation = new com.paypal.oslo.feature.userprofile.graphql.InitiateEmailConfirmationMutation(initiateEmailConfirmationInput);
                        com.paypal.oslo.core.network.graphql.RiskSourceId initiateEmailConfirmation = com.paypal.oslo.core.network.graphql.RiskSourceId.UserProfile.INSTANCE.getInitiateEmailConfirmation();
                        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl.$r8$lambda$02OZyII6nmds_ir7hGA6i8DKbq4((com.paypal.oslo.feature.userprofile.graphql.InitiateEmailConfirmationMutation.Data) obj2);
                            }
                        };
                        emailRepositoryImpl$initiateEmailConfirmation$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        emailRepositoryImpl$initiateEmailConfirmation$12.getOutputMinFrameDuration = defaultRaise;
                        emailRepositoryImpl$initiateEmailConfirmation$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        emailRepositoryImpl$initiateEmailConfirmation$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(initiateEmailConfirmationInput);
                        emailRepositoryImpl$initiateEmailConfirmation$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(initiateEmailConfirmationMutation);
                        emailRepositoryImpl$initiateEmailConfirmation$12.getOutputFormats = defaultRaise3;
                        emailRepositoryImpl$initiateEmailConfirmation$12.getHighSpeedVideoSizes = 0;
                        emailRepositoryImpl$initiateEmailConfirmation$12.getHighSpeedVideoFpsRanges = 0;
                        emailRepositoryImpl$initiateEmailConfirmation$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        emailRepositoryImpl$initiateEmailConfirmation$12.getHighSpeedVideoFpsRangesFor = 0;
                        emailRepositoryImpl$initiateEmailConfirmation$12.getOutputMinFrameDurationlomOqCM = 1;
                        highSpeedVideoSizes = com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImplKt.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, initiateEmailConfirmationMutation, initiateEmailConfirmation, "initiateEmailConfirmation", function1, emailRepositoryImpl$initiateEmailConfirmation$12);
                        if (highSpeedVideoSizes == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        obj = highSpeedVideoSizes;
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
                    int i2 = emailRepositoryImpl$initiateEmailConfirmation$12.getHighSpeedVideoFpsRangesFor;
                    int i3 = emailRepositoryImpl$initiateEmailConfirmation$12.getHighResolutionOutputSizeshNQ4ISI;
                    int i4 = emailRepositoryImpl$initiateEmailConfirmation$12.getHighSpeedVideoFpsRanges;
                    int i5 = emailRepositoryImpl$initiateEmailConfirmation$12.getHighSpeedVideoSizes;
                    raise = (arrow.core.raise.Raise) emailRepositoryImpl$initiateEmailConfirmation$12.getOutputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) emailRepositoryImpl$initiateEmailConfirmation$12.getOutputMinFrameDuration;
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
                com.paypal.oslo.feature.userprofile.domain.model.email.EmailConfirmationChallenge emailConfirmationChallenge = com.paypal.oslo.feature.userprofile.data.mapper.EmailResponseMapperKt.toEmailConfirmationChallenge(((com.paypal.oslo.feature.userprofile.graphql.InitiateEmailConfirmationMutation.InitiateEmailConfirmation) raise.bind((arrow.core.Either) obj)).getEmailConfirmationChallengeFragment());
                defaultRaise2.complete();
                return new arrow.core.Either.Right(emailConfirmationChallenge);
            }
        }
        emailRepositoryImpl$initiateEmailConfirmation$1 = new com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$initiateEmailConfirmation$1(this, continuation);
        com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$initiateEmailConfirmation$1 emailRepositoryImpl$initiateEmailConfirmation$122 = emailRepositoryImpl$initiateEmailConfirmation$1;
        java.lang.Object obj2 = emailRepositoryImpl$initiateEmailConfirmation$122.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = emailRepositoryImpl$initiateEmailConfirmation$122.getOutputMinFrameDurationlomOqCM;
        if (i != 0) {
        }
        com.paypal.oslo.feature.userprofile.domain.model.email.EmailConfirmationChallenge emailConfirmationChallenge2 = com.paypal.oslo.feature.userprofile.data.mapper.EmailResponseMapperKt.toEmailConfirmationChallenge(((com.paypal.oslo.feature.userprofile.graphql.InitiateEmailConfirmationMutation.InitiateEmailConfirmation) raise.bind((arrow.core.Either) obj2)).getEmailConfirmationChallengeFragment());
        defaultRaise2.complete();
        return new arrow.core.Either.Right(emailConfirmationChallenge2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object reinitiateEmailConfirmation(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.email.EmailError, com.paypal.oslo.feature.userprofile.domain.model.email.EmailConfirmationChallenge>> continuation) {
        com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$reinitiateEmailConfirmation$1 emailRepositoryImpl$reinitiateEmailConfirmation$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.lang.Object highSpeedVideoSizes;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$reinitiateEmailConfirmation$1) {
            emailRepositoryImpl$reinitiateEmailConfirmation$1 = (com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$reinitiateEmailConfirmation$1) continuation;
            if ((emailRepositoryImpl$reinitiateEmailConfirmation$1.getOutputStallDuration & Integer.MIN_VALUE) != 0) {
                emailRepositoryImpl$reinitiateEmailConfirmation$1.getOutputStallDuration -= 2147483648;
                com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$reinitiateEmailConfirmation$1 emailRepositoryImpl$reinitiateEmailConfirmation$12 = emailRepositoryImpl$reinitiateEmailConfirmation$1;
                java.lang.Object obj = emailRepositoryImpl$reinitiateEmailConfirmation$12.getOutputSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = emailRepositoryImpl$reinitiateEmailConfirmation$12.getOutputStallDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.api.graphql.schema.type.ReinitiateEmailConfirmationInput reinitiateEmailConfirmationInput = new com.paypal.oslo.api.graphql.schema.type.ReinitiateEmailConfirmationInput(str, str2, str3);
                        com.paypal.oslo.feature.userprofile.graphql.ReInitiateEmailConfirmationMutation reInitiateEmailConfirmationMutation = new com.paypal.oslo.feature.userprofile.graphql.ReInitiateEmailConfirmationMutation(reinitiateEmailConfirmationInput);
                        com.paypal.oslo.core.network.graphql.RiskSourceId reinitiateEmailConfirmation = com.paypal.oslo.core.network.graphql.RiskSourceId.UserProfile.INSTANCE.getReinitiateEmailConfirmation();
                        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl.m20442$r8$lambda$RlaJ2Tz0OrKXRZrou1q67MH2A4((com.paypal.oslo.feature.userprofile.graphql.ReInitiateEmailConfirmationMutation.Data) obj2);
                            }
                        };
                        emailRepositoryImpl$reinitiateEmailConfirmation$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        emailRepositoryImpl$reinitiateEmailConfirmation$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        emailRepositoryImpl$reinitiateEmailConfirmation$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                        emailRepositoryImpl$reinitiateEmailConfirmation$12.getInputFormats = defaultRaise;
                        emailRepositoryImpl$reinitiateEmailConfirmation$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        emailRepositoryImpl$reinitiateEmailConfirmation$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(reinitiateEmailConfirmationInput);
                        emailRepositoryImpl$reinitiateEmailConfirmation$12.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(reInitiateEmailConfirmationMutation);
                        emailRepositoryImpl$reinitiateEmailConfirmation$12.getOutputMinFrameDurationlomOqCM = defaultRaise3;
                        emailRepositoryImpl$reinitiateEmailConfirmation$12.getHighSpeedVideoSizes = 0;
                        emailRepositoryImpl$reinitiateEmailConfirmation$12.getHighSpeedVideoFpsRanges = 0;
                        emailRepositoryImpl$reinitiateEmailConfirmation$12.Camera2StreamConfigurationMap = 0;
                        emailRepositoryImpl$reinitiateEmailConfirmation$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        emailRepositoryImpl$reinitiateEmailConfirmation$12.getOutputStallDuration = 1;
                        highSpeedVideoSizes = com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImplKt.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, reInitiateEmailConfirmationMutation, reinitiateEmailConfirmation, "reinitiateEmailConfirmation", function1, emailRepositoryImpl$reinitiateEmailConfirmation$12);
                        if (highSpeedVideoSizes == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        obj = highSpeedVideoSizes;
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
                    int i2 = emailRepositoryImpl$reinitiateEmailConfirmation$12.getHighResolutionOutputSizeshNQ4ISI;
                    int i3 = emailRepositoryImpl$reinitiateEmailConfirmation$12.Camera2StreamConfigurationMap;
                    int i4 = emailRepositoryImpl$reinitiateEmailConfirmation$12.getHighSpeedVideoFpsRanges;
                    int i5 = emailRepositoryImpl$reinitiateEmailConfirmation$12.getHighSpeedVideoSizes;
                    raise = (arrow.core.raise.Raise) emailRepositoryImpl$reinitiateEmailConfirmation$12.getOutputMinFrameDurationlomOqCM;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) emailRepositoryImpl$reinitiateEmailConfirmation$12.getInputFormats;
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
                com.paypal.oslo.feature.userprofile.domain.model.email.EmailConfirmationChallenge emailConfirmationChallenge = com.paypal.oslo.feature.userprofile.data.mapper.EmailResponseMapperKt.toEmailConfirmationChallenge(((com.paypal.oslo.feature.userprofile.graphql.ReInitiateEmailConfirmationMutation.ReinitiateEmailConfirmation) raise.bind((arrow.core.Either) obj)).getEmailConfirmationChallengeFragment());
                defaultRaise2.complete();
                return new arrow.core.Either.Right(emailConfirmationChallenge);
            }
        }
        emailRepositoryImpl$reinitiateEmailConfirmation$1 = new com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$reinitiateEmailConfirmation$1(this, continuation);
        com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$reinitiateEmailConfirmation$1 emailRepositoryImpl$reinitiateEmailConfirmation$122 = emailRepositoryImpl$reinitiateEmailConfirmation$1;
        java.lang.Object obj2 = emailRepositoryImpl$reinitiateEmailConfirmation$122.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = emailRepositoryImpl$reinitiateEmailConfirmation$122.getOutputStallDuration;
        if (i != 0) {
        }
        com.paypal.oslo.feature.userprofile.domain.model.email.EmailConfirmationChallenge emailConfirmationChallenge2 = com.paypal.oslo.feature.userprofile.data.mapper.EmailResponseMapperKt.toEmailConfirmationChallenge(((com.paypal.oslo.feature.userprofile.graphql.ReInitiateEmailConfirmationMutation.ReinitiateEmailConfirmation) raise.bind((arrow.core.Either) obj2)).getEmailConfirmationChallengeFragment());
        defaultRaise2.complete();
        return new arrow.core.Either.Right(emailConfirmationChallenge2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(5:(2:3|(8:5|6|7|(1:(1:(5:11|12|13|14|15)(2:26|27))(3:28|29|30))(3:42|43|(1:45)(2:46|47))|31|32|33|(1:36)(3:35|14|15)))|31|32|33|(0)(0))|50|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation] */
    /* JADX WARN: Type inference failed for: r14v3, types: [arrow.core.raise.Raise] */
    /* JADX WARN: Type inference failed for: r8v4, types: [arrow.core.raise.Raise] */
    @Override // com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object confirmEmail(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, java.lang.String str5, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.email.EmailError, com.paypal.oslo.core.userstore.model.ProfileEmail>> continuation) {
        com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$confirmEmail$1 emailRepositoryImpl$confirmEmail$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        boolean z2;
        java.lang.Object highSpeedVideoSizes;
        java.lang.String str6;
        int i2;
        int i3;
        int i4;
        java.lang.Object obj;
        java.lang.Object obj2;
        arrow.core.raise.DefaultRaise defaultRaise2;
        com.paypal.oslo.api.graphql.schema.type.VerifyPartyEmailWithOtpInput verifyPartyEmailWithOtpInput;
        arrow.core.raise.DefaultRaise defaultRaise3;
        java.lang.String str7;
        arrow.core.raise.DefaultRaise defaultRaise4;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        int i5;
        java.lang.Object refresh$default;
        java.lang.Object obj3;
        com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation.Email email;
        arrow.core.raise.DefaultRaise defaultRaise5;
        try {
            if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$confirmEmail$1) {
                emailRepositoryImpl$confirmEmail$1 = (com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$confirmEmail$1) continuation;
                if ((emailRepositoryImpl$confirmEmail$1.isOutputSupportedFor & Integer.MIN_VALUE) != 0) {
                    emailRepositoryImpl$confirmEmail$1.isOutputSupportedFor -= 2147483648;
                    java.lang.Object obj4 = emailRepositoryImpl$confirmEmail$1.isOutputSupportedForhNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = emailRepositoryImpl$confirmEmail$1.isOutputSupportedFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj4);
                        arrow.core.raise.DefaultRaise defaultRaise6 = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise7 = defaultRaise6;
                        com.paypal.oslo.api.graphql.schema.type.VerifyPartyEmailWithOtpInput verifyPartyEmailWithOtpInput2 = new com.paypal.oslo.api.graphql.schema.type.VerifyPartyEmailWithOtpInput(str, str2, str3, str4, z, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(str5));
                        ?? verifyPartyEmailWithOtpMutation = new com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation(verifyPartyEmailWithOtpInput2);
                        com.paypal.oslo.core.network.graphql.RiskSourceId verifyEmailWithOtp = com.paypal.oslo.core.network.graphql.RiskSourceId.UserProfile.INSTANCE.getVerifyEmailWithOtp();
                        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj5) {
                                return com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl.$r8$lambda$TtpBKTlhXpzOAxKEax9G0WhV4KQ((com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation.Data) obj5);
                            }
                        };
                        emailRepositoryImpl$confirmEmail$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        emailRepositoryImpl$confirmEmail$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        emailRepositoryImpl$confirmEmail$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                        emailRepositoryImpl$confirmEmail$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                        emailRepositoryImpl$confirmEmail$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
                        emailRepositoryImpl$confirmEmail$1.getInputSizeshNQ4ISI = defaultRaise6;
                        emailRepositoryImpl$confirmEmail$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise7);
                        emailRepositoryImpl$confirmEmail$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(verifyPartyEmailWithOtpInput2);
                        emailRepositoryImpl$confirmEmail$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(verifyPartyEmailWithOtpMutation);
                        emailRepositoryImpl$confirmEmail$1.getOutputSizes = defaultRaise7;
                        z2 = z;
                        emailRepositoryImpl$confirmEmail$1.getOutputMinFrameDurationlomOqCM = z2;
                        emailRepositoryImpl$confirmEmail$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        emailRepositoryImpl$confirmEmail$1.Camera2StreamConfigurationMap = 0;
                        emailRepositoryImpl$confirmEmail$1.getHighSpeedVideoFpsRanges = 0;
                        emailRepositoryImpl$confirmEmail$1.getHighSpeedVideoFpsRangesFor = 0;
                        emailRepositoryImpl$confirmEmail$1.isOutputSupportedFor = 1;
                        highSpeedVideoSizes = com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImplKt.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, (com.apollographql.apollo.api.Mutation) verifyPartyEmailWithOtpMutation, verifyEmailWithOtp, "confirmEmail", function1, emailRepositoryImpl$confirmEmail$1);
                        if (highSpeedVideoSizes == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str6 = str3;
                        i2 = 0;
                        i3 = 0;
                        i4 = 0;
                        obj = highSpeedVideoSizes;
                        obj2 = coroutine_suspended;
                        defaultRaise2 = defaultRaise7;
                        verifyPartyEmailWithOtpInput = verifyPartyEmailWithOtpInput2;
                        defaultRaise3 = defaultRaise6;
                        str7 = str;
                        defaultRaise4 = defaultRaise2;
                        str8 = str5;
                        defaultRaise = verifyPartyEmailWithOtpMutation;
                        str9 = str2;
                        str10 = str4;
                        i5 = 0;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i6 = emailRepositoryImpl$confirmEmail$1.getHighSpeedVideoFpsRangesFor;
                            int i7 = emailRepositoryImpl$confirmEmail$1.getHighSpeedVideoFpsRanges;
                            int i8 = emailRepositoryImpl$confirmEmail$1.Camera2StreamConfigurationMap;
                            int i9 = emailRepositoryImpl$confirmEmail$1.getHighResolutionOutputSizeshNQ4ISI;
                            boolean z3 = emailRepositoryImpl$confirmEmail$1.getOutputMinFrameDurationlomOqCM;
                            email = (com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation.Email) emailRepositoryImpl$confirmEmail$1.getOutputSizes;
                            defaultRaise5 = (arrow.core.raise.DefaultRaise) emailRepositoryImpl$confirmEmail$1.getInputSizeshNQ4ISI;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj4);
                                com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail = com.paypal.oslo.feature.userprofile.data.mapper.EmailResponseMapperKt.toProfileEmail(email.getEmailFragment());
                                defaultRaise5.complete();
                                return new arrow.core.Either.Right(profileEmail);
                            } catch (arrow.core.raise.RaiseCancellationException e) {
                                e = e;
                                defaultRaise = defaultRaise5;
                                defaultRaise.complete();
                                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                            } catch (java.lang.Throwable th) {
                                th = th;
                                defaultRaise = defaultRaise5;
                                defaultRaise.complete();
                                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                            }
                        }
                        int i10 = emailRepositoryImpl$confirmEmail$1.getHighSpeedVideoFpsRangesFor;
                        int i11 = emailRepositoryImpl$confirmEmail$1.getHighSpeedVideoFpsRanges;
                        int i12 = emailRepositoryImpl$confirmEmail$1.Camera2StreamConfigurationMap;
                        int i13 = emailRepositoryImpl$confirmEmail$1.getHighResolutionOutputSizeshNQ4ISI;
                        boolean z4 = emailRepositoryImpl$confirmEmail$1.getOutputMinFrameDurationlomOqCM;
                        ?? r8 = (arrow.core.raise.Raise) emailRepositoryImpl$confirmEmail$1.getOutputSizes;
                        ?? r12 = (com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation) emailRepositoryImpl$confirmEmail$1.getOutputStallDuration;
                        com.paypal.oslo.api.graphql.schema.type.VerifyPartyEmailWithOtpInput verifyPartyEmailWithOtpInput3 = (com.paypal.oslo.api.graphql.schema.type.VerifyPartyEmailWithOtpInput) emailRepositoryImpl$confirmEmail$1.getOutputSizeshNQ4ISI;
                        ?? r14 = (arrow.core.raise.Raise) emailRepositoryImpl$confirmEmail$1.getOutputStallDurationlomOqCM;
                        arrow.core.raise.DefaultRaise defaultRaise8 = (arrow.core.raise.DefaultRaise) emailRepositoryImpl$confirmEmail$1.getInputSizeshNQ4ISI;
                        str8 = (java.lang.String) emailRepositoryImpl$confirmEmail$1.getOutputFormats;
                        str10 = (java.lang.String) emailRepositoryImpl$confirmEmail$1.getInputFormats;
                        java.lang.String str11 = (java.lang.String) emailRepositoryImpl$confirmEmail$1.getOutputMinFrameDuration;
                        java.lang.String str12 = (java.lang.String) emailRepositoryImpl$confirmEmail$1.getHighSpeedVideoSizesFor;
                        str7 = (java.lang.String) emailRepositoryImpl$confirmEmail$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj4);
                        obj2 = coroutine_suspended;
                        verifyPartyEmailWithOtpInput = verifyPartyEmailWithOtpInput3;
                        defaultRaise2 = r14;
                        defaultRaise3 = defaultRaise8;
                        z2 = z4;
                        defaultRaise4 = r8;
                        defaultRaise = r12;
                        i3 = i11;
                        i4 = i12;
                        i5 = i13;
                        i2 = i10;
                        str6 = str11;
                        obj = obj4;
                        str9 = str12;
                    }
                    com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation.Email email2 = (com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation.Email) defaultRaise4.bind((arrow.core.Either) obj);
                    com.paypal.oslo.core.userstore.UserStore userStore = this.Camera2StreamConfigurationMap;
                    emailRepositoryImpl$confirmEmail$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str7);
                    emailRepositoryImpl$confirmEmail$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str9);
                    emailRepositoryImpl$confirmEmail$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str6);
                    emailRepositoryImpl$confirmEmail$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str10);
                    emailRepositoryImpl$confirmEmail$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str8);
                    emailRepositoryImpl$confirmEmail$1.getInputSizeshNQ4ISI = defaultRaise3;
                    emailRepositoryImpl$confirmEmail$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
                    emailRepositoryImpl$confirmEmail$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(verifyPartyEmailWithOtpInput);
                    emailRepositoryImpl$confirmEmail$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise);
                    emailRepositoryImpl$confirmEmail$1.getOutputSizes = email2;
                    emailRepositoryImpl$confirmEmail$1.getOutputMinFrameDurationlomOqCM = z2;
                    emailRepositoryImpl$confirmEmail$1.getHighResolutionOutputSizeshNQ4ISI = i5;
                    emailRepositoryImpl$confirmEmail$1.Camera2StreamConfigurationMap = i4;
                    emailRepositoryImpl$confirmEmail$1.getHighSpeedVideoFpsRanges = i3;
                    emailRepositoryImpl$confirmEmail$1.getHighSpeedVideoFpsRangesFor = i2;
                    emailRepositoryImpl$confirmEmail$1.isOutputSupportedFor = 2;
                    refresh$default = com.paypal.oslo.core.userstore.UserStore.refresh$default(userStore, null, emailRepositoryImpl$confirmEmail$1, 1, null);
                    obj3 = obj2;
                    if (refresh$default != obj3) {
                        return obj3;
                    }
                    email = email2;
                    defaultRaise5 = defaultRaise3;
                    com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail2 = com.paypal.oslo.feature.userprofile.data.mapper.EmailResponseMapperKt.toProfileEmail(email.getEmailFragment());
                    defaultRaise5.complete();
                    return new arrow.core.Either.Right(profileEmail2);
                }
            }
            com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation.Email email22 = (com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation.Email) defaultRaise4.bind((arrow.core.Either) obj);
            com.paypal.oslo.core.userstore.UserStore userStore2 = this.Camera2StreamConfigurationMap;
            emailRepositoryImpl$confirmEmail$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str7);
            emailRepositoryImpl$confirmEmail$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str9);
            emailRepositoryImpl$confirmEmail$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str6);
            emailRepositoryImpl$confirmEmail$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str10);
            emailRepositoryImpl$confirmEmail$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str8);
            emailRepositoryImpl$confirmEmail$1.getInputSizeshNQ4ISI = defaultRaise3;
            emailRepositoryImpl$confirmEmail$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
            emailRepositoryImpl$confirmEmail$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(verifyPartyEmailWithOtpInput);
            emailRepositoryImpl$confirmEmail$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise);
            emailRepositoryImpl$confirmEmail$1.getOutputSizes = email22;
            emailRepositoryImpl$confirmEmail$1.getOutputMinFrameDurationlomOqCM = z2;
            emailRepositoryImpl$confirmEmail$1.getHighResolutionOutputSizeshNQ4ISI = i5;
            emailRepositoryImpl$confirmEmail$1.Camera2StreamConfigurationMap = i4;
            emailRepositoryImpl$confirmEmail$1.getHighSpeedVideoFpsRanges = i3;
            emailRepositoryImpl$confirmEmail$1.getHighSpeedVideoFpsRangesFor = i2;
            emailRepositoryImpl$confirmEmail$1.isOutputSupportedFor = 2;
            refresh$default = com.paypal.oslo.core.userstore.UserStore.refresh$default(userStore2, null, emailRepositoryImpl$confirmEmail$1, 1, null);
            obj3 = obj2;
            if (refresh$default != obj3) {
            }
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
        emailRepositoryImpl$confirmEmail$1 = new com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$confirmEmail$1(this, continuation);
        java.lang.Object obj42 = emailRepositoryImpl$confirmEmail$1.isOutputSupportedForhNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = emailRepositoryImpl$confirmEmail$1.isOutputSupportedFor;
        if (i != 0) {
        }
    }

    /* renamed from: $r8$lambda$-rV9EeJjVsRQ_Ad2y-l87D-zs0Q, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.userprofile.graphql.UpdatePartyEmailMutation.Email m20441$r8$lambda$rV9EeJjVsRQ_Ad2yl87Dzs0Q(com.paypal.oslo.feature.userprofile.graphql.UpdatePartyEmailMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return data.getUpdatePartyEmail().getEmail();
    }

    public static /* synthetic */ com.paypal.oslo.feature.userprofile.graphql.InitiateEmailConfirmationMutation.InitiateEmailConfirmation $r8$lambda$02OZyII6nmds_ir7hGA6i8DKbq4(com.paypal.oslo.feature.userprofile.graphql.InitiateEmailConfirmationMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return data.getInitiateEmailConfirmation();
    }

    public static /* synthetic */ java.lang.String $r8$lambda$2eLwl2KcZlcnBxfGdTNzKvJQSQc(com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return data.getReplacePrimaryPartyEmail().getParty().getEmailPartyFragment().getId();
    }

    public static /* synthetic */ java.lang.String $r8$lambda$LEcXldtJK06dwqNcffRdS597htQ(com.paypal.oslo.feature.userprofile.graphql.ReconfirmPartyEmailMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return data.getReconfirmPartyEmail().getParty().getEmailPartyFragment().getId();
    }

    /* renamed from: $r8$lambda$RlaJ2Tz0OrKXRZrou1q67MH-2A4, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.userprofile.graphql.ReInitiateEmailConfirmationMutation.ReinitiateEmailConfirmation m20442$r8$lambda$RlaJ2Tz0OrKXRZrou1q67MH2A4(com.paypal.oslo.feature.userprofile.graphql.ReInitiateEmailConfirmationMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return data.getReinitiateEmailConfirmation();
    }

    public static /* synthetic */ com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation.Email $r8$lambda$TtpBKTlhXpzOAxKEax9G0WhV4KQ(com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return data.getVerifyPartyEmailWithOtp().getEmail();
    }

    public static /* synthetic */ java.lang.String $r8$lambda$ccjWFL6J_0bQjnCxtMSnG8N9yw0(com.paypal.oslo.feature.userprofile.graphql.MakePrimaryPartyEmailMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return data.getMakePrimaryPartyEmail().getParty().getEmailPartyFragment().getId();
    }

    public static /* synthetic */ java.lang.String $r8$lambda$f6E9M1C_yYXoPhpWzDkY7KWQF48(com.paypal.oslo.feature.userprofile.graphql.DeletePartyEmailMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return data.getDeletePartyEmail().getParty().getEmailPartyFragment().getId();
    }

    public static /* synthetic */ com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Email $r8$lambda$sSwZP9BRNd_UW954lVJAu1G3DoY(com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return data.getAddPartyEmail().getEmail();
    }
}
