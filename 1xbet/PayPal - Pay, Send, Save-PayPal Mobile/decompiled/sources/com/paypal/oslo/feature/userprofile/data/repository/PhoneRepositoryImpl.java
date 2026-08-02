package com.paypal.oslo.feature.userprofile.data.repository;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b0\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010JF\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJN\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0\u00182\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001f0\u00182\u0006\u0010\u001c\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b \u0010!J$\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001f0\u00182\u0006\u0010\u001c\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\"\u0010!J$\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020#0\u00182\u0006\u0010\u001c\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b$\u0010!J4\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020#0\u00182\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b'\u0010(JD\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0\u00182\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b+\u0010\u001bJ\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020\u0011H\u0002¢\u0006\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010.\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00105"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/data/repository/PhoneRepositoryImpl;", "Lcom/paypal/oslo/feature/userprofile/domain/repository/PhoneRepository;", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/ObserveUserStoreUseCase;", "observeUserStoreUseCase", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/feature/userprofile/domain/usecase/ObserveUserStoreUseCase;Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/core/userstore/UserStore;)V", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/userprofile/domain/model/DataResult;", "", "Lcom/paypal/oslo/feature/userprofile/domain/ProfileDataItem;", "Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "getPhones", "()Lkotlinx/coroutines/flow/Flow;", "", "countryCode", com.microblink.blinkid.entities.recognizers.blinkid.jordan.JordanCombinedRecognizer.VerificationConstants.NationalNumber, "phoneType", "extensionNumber", "", "refreshUserStore", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhoneError;", "addPhone", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "phoneId", "replacePhone", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deletePhone", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makePrimaryPhone", "Lcom/paypal/oslo/feature/userprofile/domain/model/phone/PhoneConfirmationChallenge;", "initiatePhoneConfirmation", "authId", "challengeId", "reinitiatePhoneConfirmation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "code", "primary", "verifyPhone", "p0", "Lcom/paypal/oslo/api/graphql/schema/type/PhoneType;", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/PhoneType;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/ObserveUserStoreUseCase;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/ApolloClient;", "Lcom/paypal/oslo/core/userstore/UserStore;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PhoneRepositoryImpl implements com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoFpsRanges;
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoSizes;

    @javax.inject.Inject
    public PhoneRepositoryImpl(com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase observeUserStoreUseCase, com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observeUserStoreUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.getHighSpeedVideoFpsRangesFor = observeUserStoreUseCase;
        this.getHighSpeedVideoSizes = apolloClient;
        this.getHighSpeedVideoFpsRanges = userStore;
    }

    @Override // com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.userprofile.domain.model.DataResult<java.util.List<com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<com.paypal.oslo.core.userstore.model.ProfilePhone>>>> getPhones() {
        final kotlinx.coroutines.flow.Flow<com.paypal.oslo.core.userstore.model.UserState> invoke = this.getHighSpeedVideoFpsRangesFor.invoke();
        return (kotlinx.coroutines.flow.Flow) new kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.userprofile.domain.model.DataResult<? extends java.util.List<? extends com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<com.paypal.oslo.core.userstore.model.ProfilePhone>>>>() { // from class: com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$getPhones$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.userprofile.domain.model.DataResult<? extends java.util.List<? extends com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<com.paypal.oslo.core.userstore.model.ProfilePhone>>>> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$getPhones$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$getPhones$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$getPhones$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    java.lang.Object obj2;
                    java.util.ArrayList arrayList;
                    if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$getPhones$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$getPhones$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getOutputMinFrameDuration -= 2147483648;
                            java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoSizesFor;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getOutputMinFrameDuration;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj3);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.Camera2StreamConfigurationMap;
                                com.paypal.oslo.core.userstore.model.UserState userState = (com.paypal.oslo.core.userstore.model.UserState) obj;
                                if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoading) {
                                    obj2 = (com.paypal.oslo.feature.userprofile.domain.model.DataResult) com.paypal.oslo.feature.userprofile.domain.model.DataResult.Loading.INSTANCE;
                                } else if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
                                    java.util.List<com.paypal.oslo.core.userstore.model.ProfilePhone> profilePhones = ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState).getUser().getProfilePhones();
                                    if (profilePhones != null) {
                                        java.util.List<com.paypal.oslo.core.userstore.model.ProfilePhone> list = profilePhones;
                                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                                        java.util.Iterator<T> it = list.iterator();
                                        while (it.hasNext()) {
                                            arrayList2.add(com.paypal.oslo.feature.userprofile.domain.ProfileDataItemExtensionsKt.toProfileDataItem((com.paypal.oslo.core.userstore.model.ProfilePhone) it.next()));
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
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                anonymousClass1.getOutputMinFrameDuration = 1;
                                if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                java.lang.Object obj5 = anonymousClass1.getHighSpeedVideoSizes;
                                kotlin.ResultKt.throwOnFailure(obj3);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$getPhones$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj32 = anonymousClass1.getHighSpeedVideoSizesFor;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getOutputMinFrameDuration;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$getPhones$$inlined$map$1$2", f = "PhoneRepositoryImpl.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$getPhones$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    int getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
                    int getOutputMinFrameDuration;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoSizesFor = obj;
                        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$getPhones$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.Camera2StreamConfigurationMap = flowCollector;
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0160 A[Catch: all -> 0x0064, RaiseCancellationException -> 0x0067, TryCatch #4 {RaiseCancellationException -> 0x0067, all -> 0x0064, blocks: (B:12:0x005f, B:14:0x01b2, B:23:0x0152, B:25:0x0160), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r12v5, types: [com.paypal.oslo.api.graphql.schema.type.AddPartyPhoneInput] */
    /* JADX WARN: Type inference failed for: r14v3, types: [arrow.core.raise.Raise] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v8, types: [arrow.core.raise.DefaultRaise] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.paypal.oslo.api.graphql.schema.type.AddPartyPhoneInput, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [arrow.core.raise.Raise] */
    @Override // com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object addPhone(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.PhoneError, com.paypal.oslo.core.userstore.model.ProfilePhone>> continuation) {
        com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$addPhone$1 phoneRepositoryImpl$addPhone$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        ?? r4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.Object highSpeedVideoFpsRangesFor;
        boolean z2;
        arrow.core.raise.DefaultRaise defaultRaise2;
        com.paypal.oslo.api.graphql.schema.type.PhoneInput phoneInput;
        arrow.core.raise.DefaultRaise defaultRaise3;
        int i2;
        int i3;
        int i4;
        arrow.core.raise.DefaultRaise defaultRaise4;
        java.lang.String str7;
        int i5;
        java.lang.String str8;
        com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone;
        com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone2;
        arrow.core.raise.DefaultRaise defaultRaise5;
        try {
            try {
                if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$addPhone$1) {
                    phoneRepositoryImpl$addPhone$1 = (com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$addPhone$1) continuation;
                    r4 = -2147483648;
                    r4 = -2147483648;
                    if ((phoneRepositoryImpl$addPhone$1.toString & Integer.MIN_VALUE) != 0) {
                        phoneRepositoryImpl$addPhone$1.toString -= 2147483648;
                        java.lang.Object obj = phoneRepositoryImpl$addPhone$1.unwrapAs;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = phoneRepositoryImpl$addPhone$1.toString;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            arrow.core.raise.DefaultRaise defaultRaise6 = new arrow.core.raise.DefaultRaise(false);
                            arrow.core.raise.DefaultRaise defaultRaise7 = defaultRaise6;
                            str5 = str;
                            str6 = str2;
                            com.paypal.oslo.api.graphql.schema.type.PhoneInput phoneInput2 = new com.paypal.oslo.api.graphql.schema.type.PhoneInput(str5, str6, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(str4));
                            ?? addPartyPhoneInput = new com.paypal.oslo.api.graphql.schema.type.AddPartyPhoneInput(phoneInput2, false, getHighSpeedVideoFpsRanges(str3));
                            com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes;
                            com.paypal.oslo.feature.userprofile.graphql.AddPartyPhoneMutation addPartyPhoneMutation = new com.paypal.oslo.feature.userprofile.graphql.AddPartyPhoneMutation(addPartyPhoneInput);
                            com.paypal.oslo.core.network.graphql.RiskSourceId addPhone = com.paypal.oslo.core.network.graphql.RiskSourceId.UserProfile.INSTANCE.getAddPhone();
                            kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl.$r8$lambda$8qPWSU7i5yBcFOh05ixQZ2yEdg0((com.paypal.oslo.feature.userprofile.graphql.AddPartyPhoneMutation.Data) obj2);
                                }
                            };
                            phoneRepositoryImpl$addPhone$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                            phoneRepositoryImpl$addPhone$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                            phoneRepositoryImpl$addPhone$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                            phoneRepositoryImpl$addPhone$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                            phoneRepositoryImpl$addPhone$1.getInputSizeshNQ4ISI = defaultRaise6;
                            phoneRepositoryImpl$addPhone$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise7);
                            phoneRepositoryImpl$addPhone$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(phoneInput2);
                            phoneRepositoryImpl$addPhone$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addPartyPhoneInput);
                            phoneRepositoryImpl$addPhone$1.getOutputSizeshNQ4ISI = defaultRaise7;
                            phoneRepositoryImpl$addPhone$1.getOutputStallDuration = z;
                            phoneRepositoryImpl$addPhone$1.getHighSpeedVideoFpsRangesFor = 0;
                            phoneRepositoryImpl$addPhone$1.Camera2StreamConfigurationMap = 0;
                            phoneRepositoryImpl$addPhone$1.getHighSpeedVideoFpsRanges = 0;
                            phoneRepositoryImpl$addPhone$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            phoneRepositoryImpl$addPhone$1.toString = 1;
                            highSpeedVideoFpsRangesFor = com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImplKt.getHighSpeedVideoFpsRangesFor(apolloClient, addPartyPhoneMutation, addPhone, "addPhone", function1, phoneRepositoryImpl$addPhone$1);
                            if (highSpeedVideoFpsRangesFor == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            z2 = z;
                            defaultRaise2 = defaultRaise7;
                            phoneInput = phoneInput2;
                            defaultRaise3 = defaultRaise6;
                            i2 = 0;
                            i3 = 0;
                            i4 = 0;
                            defaultRaise = addPartyPhoneInput;
                            obj = highSpeedVideoFpsRangesFor;
                            defaultRaise4 = defaultRaise2;
                            str7 = str4;
                            i5 = 0;
                            str8 = str3;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i6 = phoneRepositoryImpl$addPhone$1.getHighResolutionOutputSizeshNQ4ISI;
                                int i7 = phoneRepositoryImpl$addPhone$1.getHighSpeedVideoFpsRanges;
                                int i8 = phoneRepositoryImpl$addPhone$1.Camera2StreamConfigurationMap;
                                int i9 = phoneRepositoryImpl$addPhone$1.getHighSpeedVideoFpsRangesFor;
                                boolean z3 = phoneRepositoryImpl$addPhone$1.getOutputStallDuration;
                                profilePhone2 = (com.paypal.oslo.core.userstore.model.ProfilePhone) phoneRepositoryImpl$addPhone$1.getOutputSizes;
                                arrow.core.raise.DefaultRaise defaultRaise8 = (arrow.core.raise.DefaultRaise) phoneRepositoryImpl$addPhone$1.getInputSizeshNQ4ISI;
                                kotlin.ResultKt.throwOnFailure(obj);
                                defaultRaise5 = defaultRaise8;
                                profilePhone = profilePhone2;
                                r4 = defaultRaise5;
                                r4.complete();
                                return new arrow.core.Either.Right(profilePhone);
                            }
                            int i10 = phoneRepositoryImpl$addPhone$1.getHighResolutionOutputSizeshNQ4ISI;
                            int i11 = phoneRepositoryImpl$addPhone$1.getHighSpeedVideoFpsRanges;
                            int i12 = phoneRepositoryImpl$addPhone$1.Camera2StreamConfigurationMap;
                            int i13 = phoneRepositoryImpl$addPhone$1.getHighSpeedVideoFpsRangesFor;
                            z2 = phoneRepositoryImpl$addPhone$1.getOutputStallDuration;
                            ?? r8 = (arrow.core.raise.Raise) phoneRepositoryImpl$addPhone$1.getOutputSizeshNQ4ISI;
                            ?? r12 = (com.paypal.oslo.api.graphql.schema.type.AddPartyPhoneInput) phoneRepositoryImpl$addPhone$1.getOutputMinFrameDurationlomOqCM;
                            com.paypal.oslo.api.graphql.schema.type.PhoneInput phoneInput3 = (com.paypal.oslo.api.graphql.schema.type.PhoneInput) phoneRepositoryImpl$addPhone$1.getOutputStallDurationlomOqCM;
                            ?? r14 = (arrow.core.raise.Raise) phoneRepositoryImpl$addPhone$1.getOutputFormats;
                            arrow.core.raise.DefaultRaise defaultRaise9 = (arrow.core.raise.DefaultRaise) phoneRepositoryImpl$addPhone$1.getInputSizeshNQ4ISI;
                            str7 = (java.lang.String) phoneRepositoryImpl$addPhone$1.getOutputMinFrameDuration;
                            str8 = (java.lang.String) phoneRepositoryImpl$addPhone$1.getInputFormats;
                            java.lang.String str9 = (java.lang.String) phoneRepositoryImpl$addPhone$1.getHighSpeedVideoSizesFor;
                            java.lang.String str10 = (java.lang.String) phoneRepositoryImpl$addPhone$1.getHighSpeedVideoSizes;
                            kotlin.ResultKt.throwOnFailure(obj);
                            phoneInput = phoneInput3;
                            defaultRaise2 = r14;
                            str6 = str9;
                            defaultRaise4 = r8;
                            i4 = i13;
                            i3 = i12;
                            i2 = i11;
                            defaultRaise3 = defaultRaise9;
                            defaultRaise = r12;
                            str5 = str10;
                            i5 = i10;
                        }
                        com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragment partyPhoneFragment = (com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragment) defaultRaise4.bind((arrow.core.Either) obj);
                        profilePhone = com.paypal.oslo.feature.userprofile.data.mapper.PhoneResponseMapperKt.toProfilePhone(partyPhoneFragment);
                        r4 = defaultRaise3;
                        if (z2) {
                            com.paypal.oslo.core.userstore.UserStore userStore = this.getHighSpeedVideoFpsRanges;
                            phoneRepositoryImpl$addPhone$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
                            phoneRepositoryImpl$addPhone$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str6);
                            phoneRepositoryImpl$addPhone$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str8);
                            phoneRepositoryImpl$addPhone$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str7);
                            phoneRepositoryImpl$addPhone$1.getInputSizeshNQ4ISI = defaultRaise3;
                            phoneRepositoryImpl$addPhone$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
                            phoneRepositoryImpl$addPhone$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(phoneInput);
                            phoneRepositoryImpl$addPhone$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise);
                            phoneRepositoryImpl$addPhone$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(partyPhoneFragment);
                            phoneRepositoryImpl$addPhone$1.getOutputSizes = profilePhone;
                            phoneRepositoryImpl$addPhone$1.getOutputStallDuration = z2;
                            phoneRepositoryImpl$addPhone$1.getHighSpeedVideoFpsRangesFor = i4;
                            phoneRepositoryImpl$addPhone$1.Camera2StreamConfigurationMap = i3;
                            phoneRepositoryImpl$addPhone$1.getHighSpeedVideoFpsRanges = i2;
                            phoneRepositoryImpl$addPhone$1.getHighResolutionOutputSizeshNQ4ISI = i5;
                            phoneRepositoryImpl$addPhone$1.toString = 2;
                            if (com.paypal.oslo.core.userstore.UserStore.refresh$default(userStore, null, phoneRepositoryImpl$addPhone$1, 1, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            profilePhone2 = profilePhone;
                            defaultRaise5 = defaultRaise3;
                            profilePhone = profilePhone2;
                            r4 = defaultRaise5;
                        }
                        r4.complete();
                        return new arrow.core.Either.Right(profilePhone);
                    }
                }
                if (i != 0) {
                }
                com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragment partyPhoneFragment2 = (com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragment) defaultRaise4.bind((arrow.core.Either) obj);
                profilePhone = com.paypal.oslo.feature.userprofile.data.mapper.PhoneResponseMapperKt.toProfilePhone(partyPhoneFragment2);
                r4 = defaultRaise3;
                if (z2) {
                }
                r4.complete();
                return new arrow.core.Either.Right(profilePhone);
            } catch (arrow.core.raise.RaiseCancellationException e) {
                e = e;
                defaultRaise = r4;
                defaultRaise.complete();
                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
            } catch (java.lang.Throwable th) {
                th = th;
                defaultRaise = r4;
                defaultRaise.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
            }
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th2) {
            th = th2;
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        phoneRepositoryImpl$addPhone$1 = new com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$addPhone$1(this, continuation);
        java.lang.Object obj2 = phoneRepositoryImpl$addPhone$1.unwrapAs;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = phoneRepositoryImpl$addPhone$1.toString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0179 A[Catch: all -> 0x01e3, RaiseCancellationException -> 0x01e7, TRY_LEAVE, TryCatch #8 {RaiseCancellationException -> 0x01e7, all -> 0x01e3, blocks: (B:33:0x016b, B:35:0x0179), top: B:32:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r14v3, types: [arrow.core.raise.Raise] */
    /* JADX WARN: Type inference failed for: r8v5, types: [arrow.core.raise.Raise] */
    @Override // com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object replacePhone(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.PhoneError, com.paypal.oslo.core.userstore.model.ProfilePhone>> continuation) {
        com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$replacePhone$1 phoneRepositoryImpl$replacePhone$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.Object highSpeedVideoFpsRangesFor;
        boolean z2;
        com.paypal.oslo.api.graphql.schema.type.ReplacePartyPhoneInput replacePartyPhoneInput;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        java.lang.String str8;
        com.paypal.oslo.api.graphql.schema.type.PhoneInput phoneInput;
        int i2;
        int i3;
        int i4;
        int i5;
        java.lang.String str9;
        arrow.core.raise.DefaultRaise defaultRaise4;
        java.lang.String str10;
        arrow.core.raise.DefaultRaise defaultRaise5;
        com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone;
        arrow.core.raise.DefaultRaise defaultRaise6;
        com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone2;
        try {
            if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$replacePhone$1) {
                phoneRepositoryImpl$replacePhone$1 = (com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$replacePhone$1) continuation;
                if ((phoneRepositoryImpl$replacePhone$1.toString & Integer.MIN_VALUE) != 0) {
                    phoneRepositoryImpl$replacePhone$1.toString -= 2147483648;
                    java.lang.Object obj = phoneRepositoryImpl$replacePhone$1.isOutputSupportedForhNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = phoneRepositoryImpl$replacePhone$1.toString;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        try {
                            arrow.core.raise.DefaultRaise defaultRaise7 = defaultRaise;
                            str6 = str2;
                            str7 = str3;
                            com.paypal.oslo.api.graphql.schema.type.PhoneInput phoneInput2 = new com.paypal.oslo.api.graphql.schema.type.PhoneInput(str6, str7, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(str5));
                            com.paypal.oslo.api.graphql.schema.type.ReplacePartyPhoneInput replacePartyPhoneInput2 = new com.paypal.oslo.api.graphql.schema.type.ReplacePartyPhoneInput(str, phoneInput2, false, getHighSpeedVideoFpsRanges(str4));
                            com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes;
                            com.paypal.oslo.feature.userprofile.graphql.ReplacePartyPhoneMutation replacePartyPhoneMutation = new com.paypal.oslo.feature.userprofile.graphql.ReplacePartyPhoneMutation(replacePartyPhoneInput2);
                            com.paypal.oslo.core.network.graphql.RiskSourceId replacePhone = com.paypal.oslo.core.network.graphql.RiskSourceId.UserProfile.INSTANCE.getReplacePhone();
                            kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl.$r8$lambda$jGrMszeFSpZoNOJmhDLmljFAOLg((com.paypal.oslo.feature.userprofile.graphql.ReplacePartyPhoneMutation.Data) obj2);
                                }
                            };
                            phoneRepositoryImpl$replacePhone$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                            phoneRepositoryImpl$replacePhone$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                            phoneRepositoryImpl$replacePhone$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                            phoneRepositoryImpl$replacePhone$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                            phoneRepositoryImpl$replacePhone$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
                            phoneRepositoryImpl$replacePhone$1.getOutputStallDuration = defaultRaise;
                            phoneRepositoryImpl$replacePhone$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise7);
                            phoneRepositoryImpl$replacePhone$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(phoneInput2);
                            phoneRepositoryImpl$replacePhone$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(replacePartyPhoneInput2);
                            phoneRepositoryImpl$replacePhone$1.getOutputMinFrameDurationlomOqCM = defaultRaise7;
                            phoneRepositoryImpl$replacePhone$1.unwrapAs = z;
                            phoneRepositoryImpl$replacePhone$1.getHighSpeedVideoFpsRangesFor = 0;
                            phoneRepositoryImpl$replacePhone$1.Camera2StreamConfigurationMap = 0;
                            phoneRepositoryImpl$replacePhone$1.getHighSpeedVideoFpsRanges = 0;
                            phoneRepositoryImpl$replacePhone$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            phoneRepositoryImpl$replacePhone$1.toString = 1;
                            highSpeedVideoFpsRangesFor = com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImplKt.getHighSpeedVideoFpsRangesFor(apolloClient, replacePartyPhoneMutation, replacePhone, "replacePhone", function1, phoneRepositoryImpl$replacePhone$1);
                            if (highSpeedVideoFpsRangesFor == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            z2 = z;
                            replacePartyPhoneInput = replacePartyPhoneInput2;
                            obj = highSpeedVideoFpsRangesFor;
                            defaultRaise2 = defaultRaise;
                            defaultRaise3 = defaultRaise7;
                            str8 = str5;
                            phoneInput = phoneInput2;
                            i2 = 0;
                            i3 = 0;
                            i4 = 0;
                            i5 = 0;
                            str9 = str;
                            defaultRaise4 = defaultRaise3;
                            str10 = str4;
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
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i6 = phoneRepositoryImpl$replacePhone$1.getHighResolutionOutputSizeshNQ4ISI;
                            int i7 = phoneRepositoryImpl$replacePhone$1.getHighSpeedVideoFpsRanges;
                            int i8 = phoneRepositoryImpl$replacePhone$1.Camera2StreamConfigurationMap;
                            int i9 = phoneRepositoryImpl$replacePhone$1.getHighSpeedVideoFpsRangesFor;
                            boolean z3 = phoneRepositoryImpl$replacePhone$1.unwrapAs;
                            profilePhone2 = (com.paypal.oslo.core.userstore.model.ProfilePhone) phoneRepositoryImpl$replacePhone$1.getInputFormats;
                            defaultRaise6 = (arrow.core.raise.DefaultRaise) phoneRepositoryImpl$replacePhone$1.getOutputStallDuration;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                profilePhone = profilePhone2;
                                defaultRaise6.complete();
                                return new arrow.core.Either.Right(profilePhone);
                            } catch (arrow.core.raise.RaiseCancellationException e2) {
                                e = e2;
                                defaultRaise = defaultRaise6;
                                defaultRaise.complete();
                                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                defaultRaise = defaultRaise6;
                                defaultRaise.complete();
                                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                            }
                        }
                        int i10 = phoneRepositoryImpl$replacePhone$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i11 = phoneRepositoryImpl$replacePhone$1.getHighSpeedVideoFpsRanges;
                        int i12 = phoneRepositoryImpl$replacePhone$1.Camera2StreamConfigurationMap;
                        int i13 = phoneRepositoryImpl$replacePhone$1.getHighSpeedVideoFpsRangesFor;
                        z2 = phoneRepositoryImpl$replacePhone$1.unwrapAs;
                        ?? r8 = (arrow.core.raise.Raise) phoneRepositoryImpl$replacePhone$1.getOutputMinFrameDurationlomOqCM;
                        com.paypal.oslo.api.graphql.schema.type.ReplacePartyPhoneInput replacePartyPhoneInput3 = (com.paypal.oslo.api.graphql.schema.type.ReplacePartyPhoneInput) phoneRepositoryImpl$replacePhone$1.getOutputSizes;
                        com.paypal.oslo.api.graphql.schema.type.PhoneInput phoneInput3 = (com.paypal.oslo.api.graphql.schema.type.PhoneInput) phoneRepositoryImpl$replacePhone$1.getOutputSizeshNQ4ISI;
                        ?? r14 = (arrow.core.raise.Raise) phoneRepositoryImpl$replacePhone$1.getOutputStallDurationlomOqCM;
                        defaultRaise5 = (arrow.core.raise.DefaultRaise) phoneRepositoryImpl$replacePhone$1.getOutputStallDuration;
                        str8 = (java.lang.String) phoneRepositoryImpl$replacePhone$1.getInputSizeshNQ4ISI;
                        str10 = (java.lang.String) phoneRepositoryImpl$replacePhone$1.getOutputMinFrameDuration;
                        java.lang.String str11 = (java.lang.String) phoneRepositoryImpl$replacePhone$1.getOutputFormats;
                        java.lang.String str12 = (java.lang.String) phoneRepositoryImpl$replacePhone$1.getHighSpeedVideoSizesFor;
                        str9 = (java.lang.String) phoneRepositoryImpl$replacePhone$1.getHighSpeedVideoSizes;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            replacePartyPhoneInput = replacePartyPhoneInput3;
                            phoneInput = phoneInput3;
                            defaultRaise3 = r14;
                            str6 = str12;
                            i5 = i13;
                            defaultRaise4 = r8;
                            i3 = i11;
                            i4 = i12;
                            defaultRaise2 = defaultRaise5;
                            i2 = i10;
                            str7 = str11;
                        } catch (arrow.core.raise.RaiseCancellationException e3) {
                            e = e3;
                            defaultRaise = defaultRaise5;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            defaultRaise = defaultRaise5;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    }
                    com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragment partyPhoneFragment = (com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragment) defaultRaise4.bind((arrow.core.Either) obj);
                    profilePhone = com.paypal.oslo.feature.userprofile.data.mapper.PhoneResponseMapperKt.toProfilePhone(partyPhoneFragment);
                    if (!z2) {
                        com.paypal.oslo.core.userstore.UserStore userStore = this.getHighSpeedVideoFpsRanges;
                        phoneRepositoryImpl$replacePhone$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str9);
                        phoneRepositoryImpl$replacePhone$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str6);
                        phoneRepositoryImpl$replacePhone$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str7);
                        phoneRepositoryImpl$replacePhone$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str10);
                        phoneRepositoryImpl$replacePhone$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str8);
                        phoneRepositoryImpl$replacePhone$1.getOutputStallDuration = defaultRaise2;
                        phoneRepositoryImpl$replacePhone$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        phoneRepositoryImpl$replacePhone$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(phoneInput);
                        phoneRepositoryImpl$replacePhone$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(replacePartyPhoneInput);
                        phoneRepositoryImpl$replacePhone$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(partyPhoneFragment);
                        phoneRepositoryImpl$replacePhone$1.getInputFormats = profilePhone;
                        phoneRepositoryImpl$replacePhone$1.unwrapAs = z2;
                        phoneRepositoryImpl$replacePhone$1.getHighSpeedVideoFpsRangesFor = i5;
                        phoneRepositoryImpl$replacePhone$1.Camera2StreamConfigurationMap = i4;
                        phoneRepositoryImpl$replacePhone$1.getHighSpeedVideoFpsRanges = i3;
                        phoneRepositoryImpl$replacePhone$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                        phoneRepositoryImpl$replacePhone$1.toString = 2;
                        if (com.paypal.oslo.core.userstore.UserStore.refresh$default(userStore, null, phoneRepositoryImpl$replacePhone$1, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise6 = defaultRaise2;
                        profilePhone2 = profilePhone;
                        profilePhone = profilePhone2;
                        defaultRaise6.complete();
                        return new arrow.core.Either.Right(profilePhone);
                    }
                    defaultRaise6 = defaultRaise2;
                    defaultRaise6.complete();
                    return new arrow.core.Either.Right(profilePhone);
                }
            }
            com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragment partyPhoneFragment2 = (com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragment) defaultRaise4.bind((arrow.core.Either) obj);
            profilePhone = com.paypal.oslo.feature.userprofile.data.mapper.PhoneResponseMapperKt.toProfilePhone(partyPhoneFragment2);
            if (!z2) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e4) {
            e = e4;
            defaultRaise5 = defaultRaise2;
            defaultRaise = defaultRaise5;
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th4) {
            th = th4;
            defaultRaise5 = defaultRaise2;
            defaultRaise = defaultRaise5;
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        phoneRepositoryImpl$replacePhone$1 = new com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$replacePhone$1(this, continuation);
        java.lang.Object obj2 = phoneRepositoryImpl$replacePhone$1.isOutputSupportedForhNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = phoneRepositoryImpl$replacePhone$1.toString;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deletePhone(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.PhoneError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$deletePhone$1 phoneRepositoryImpl$deletePhone$1;
        java.lang.Object coroutine_suspended;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        java.lang.Object highSpeedVideoFpsRangesFor;
        int i2;
        int i3;
        int i4;
        arrow.core.raise.Raise raise;
        com.paypal.oslo.api.graphql.schema.type.DeletePartyPhoneInput deletePartyPhoneInput;
        java.lang.String str2;
        int i5;
        com.paypal.oslo.core.userstore.UserStore userStore;
        arrow.core.raise.DefaultRaise defaultRaise3;
        try {
            if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$deletePhone$1) {
                phoneRepositoryImpl$deletePhone$1 = (com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$deletePhone$1) continuation;
                if ((phoneRepositoryImpl$deletePhone$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                    phoneRepositoryImpl$deletePhone$1.getInputFormats -= 2147483648;
                    java.lang.Object obj = phoneRepositoryImpl$deletePhone$1.getOutputSizeshNQ4ISI;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = phoneRepositoryImpl$deletePhone$1.getInputFormats;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        defaultRaise2 = defaultRaise;
                        com.paypal.oslo.api.graphql.schema.type.DeletePartyPhoneInput deletePartyPhoneInput2 = new com.paypal.oslo.api.graphql.schema.type.DeletePartyPhoneInput(str);
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes;
                        com.paypal.oslo.feature.userprofile.graphql.DeletePartyPhoneMutation deletePartyPhoneMutation = new com.paypal.oslo.feature.userprofile.graphql.DeletePartyPhoneMutation(deletePartyPhoneInput2);
                        com.paypal.oslo.core.network.graphql.RiskSourceId deletePhone = com.paypal.oslo.core.network.graphql.RiskSourceId.UserProfile.INSTANCE.getDeletePhone();
                        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl.m20445$r8$lambda$pEBlxVWn0O6LOaeeHn6cOYHTek((com.paypal.oslo.feature.userprofile.graphql.DeletePartyPhoneMutation.Data) obj2);
                            }
                        };
                        phoneRepositoryImpl$deletePhone$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        phoneRepositoryImpl$deletePhone$1.getOutputFormats = defaultRaise;
                        phoneRepositoryImpl$deletePhone$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
                        phoneRepositoryImpl$deletePhone$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deletePartyPhoneInput2);
                        phoneRepositoryImpl$deletePhone$1.getOutputMinFrameDuration = defaultRaise2;
                        phoneRepositoryImpl$deletePhone$1.getHighSpeedVideoFpsRanges = 0;
                        phoneRepositoryImpl$deletePhone$1.getHighSpeedVideoFpsRangesFor = 0;
                        phoneRepositoryImpl$deletePhone$1.Camera2StreamConfigurationMap = 0;
                        phoneRepositoryImpl$deletePhone$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        phoneRepositoryImpl$deletePhone$1.getInputFormats = 1;
                        highSpeedVideoFpsRangesFor = com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImplKt.getHighSpeedVideoFpsRangesFor(apolloClient, deletePartyPhoneMutation, deletePhone, "deletePhone", function1, phoneRepositoryImpl$deletePhone$1);
                        if (highSpeedVideoFpsRangesFor != coroutine_suspended) {
                            i2 = 0;
                            i3 = 0;
                            i4 = 0;
                            raise = defaultRaise2;
                            deletePartyPhoneInput = deletePartyPhoneInput2;
                            str2 = str;
                            obj = highSpeedVideoFpsRangesFor;
                            i5 = 0;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i6 = phoneRepositoryImpl$deletePhone$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i7 = phoneRepositoryImpl$deletePhone$1.Camera2StreamConfigurationMap;
                        int i8 = phoneRepositoryImpl$deletePhone$1.getHighSpeedVideoFpsRangesFor;
                        int i9 = phoneRepositoryImpl$deletePhone$1.getHighSpeedVideoFpsRanges;
                        defaultRaise3 = (arrow.core.raise.DefaultRaise) phoneRepositoryImpl$deletePhone$1.getOutputFormats;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            defaultRaise3.complete();
                            return new arrow.core.Either.Right(unit);
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            e = e;
                            defaultRaise = defaultRaise3;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        } catch (java.lang.Throwable th) {
                            th = th;
                            defaultRaise = defaultRaise3;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    }
                    i5 = phoneRepositoryImpl$deletePhone$1.getHighResolutionOutputSizeshNQ4ISI;
                    i2 = phoneRepositoryImpl$deletePhone$1.Camera2StreamConfigurationMap;
                    i3 = phoneRepositoryImpl$deletePhone$1.getHighSpeedVideoFpsRangesFor;
                    i4 = phoneRepositoryImpl$deletePhone$1.getHighSpeedVideoFpsRanges;
                    raise = (arrow.core.raise.Raise) phoneRepositoryImpl$deletePhone$1.getOutputMinFrameDuration;
                    deletePartyPhoneInput = (com.paypal.oslo.api.graphql.schema.type.DeletePartyPhoneInput) phoneRepositoryImpl$deletePhone$1.getInputSizeshNQ4ISI;
                    defaultRaise2 = (arrow.core.raise.Raise) phoneRepositoryImpl$deletePhone$1.getHighSpeedVideoSizesFor;
                    defaultRaise = (arrow.core.raise.DefaultRaise) phoneRepositoryImpl$deletePhone$1.getOutputFormats;
                    str2 = (java.lang.String) phoneRepositoryImpl$deletePhone$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    raise.bind((arrow.core.Either) obj);
                    userStore = this.getHighSpeedVideoFpsRanges;
                    phoneRepositoryImpl$deletePhone$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    phoneRepositoryImpl$deletePhone$1.getOutputFormats = defaultRaise;
                    phoneRepositoryImpl$deletePhone$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
                    phoneRepositoryImpl$deletePhone$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deletePartyPhoneInput);
                    phoneRepositoryImpl$deletePhone$1.getOutputMinFrameDuration = null;
                    phoneRepositoryImpl$deletePhone$1.getHighSpeedVideoFpsRanges = i4;
                    phoneRepositoryImpl$deletePhone$1.getHighSpeedVideoFpsRangesFor = i3;
                    phoneRepositoryImpl$deletePhone$1.Camera2StreamConfigurationMap = i2;
                    phoneRepositoryImpl$deletePhone$1.getHighResolutionOutputSizeshNQ4ISI = i5;
                    phoneRepositoryImpl$deletePhone$1.getInputFormats = 2;
                    if (com.paypal.oslo.core.userstore.UserStore.refresh$default(userStore, null, phoneRepositoryImpl$deletePhone$1, 1, null) != coroutine_suspended) {
                        defaultRaise3 = defaultRaise;
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        defaultRaise3.complete();
                        return new arrow.core.Either.Right(unit2);
                    }
                    return coroutine_suspended;
                }
            }
            if (i != 0) {
            }
            raise.bind((arrow.core.Either) obj);
            userStore = this.getHighSpeedVideoFpsRanges;
            phoneRepositoryImpl$deletePhone$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
            phoneRepositoryImpl$deletePhone$1.getOutputFormats = defaultRaise;
            phoneRepositoryImpl$deletePhone$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
            phoneRepositoryImpl$deletePhone$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deletePartyPhoneInput);
            phoneRepositoryImpl$deletePhone$1.getOutputMinFrameDuration = null;
            phoneRepositoryImpl$deletePhone$1.getHighSpeedVideoFpsRanges = i4;
            phoneRepositoryImpl$deletePhone$1.getHighSpeedVideoFpsRangesFor = i3;
            phoneRepositoryImpl$deletePhone$1.Camera2StreamConfigurationMap = i2;
            phoneRepositoryImpl$deletePhone$1.getHighResolutionOutputSizeshNQ4ISI = i5;
            phoneRepositoryImpl$deletePhone$1.getInputFormats = 2;
            if (com.paypal.oslo.core.userstore.UserStore.refresh$default(userStore, null, phoneRepositoryImpl$deletePhone$1, 1, null) != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        phoneRepositoryImpl$deletePhone$1 = new com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$deletePhone$1(this, continuation);
        java.lang.Object obj2 = phoneRepositoryImpl$deletePhone$1.getOutputSizeshNQ4ISI;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = phoneRepositoryImpl$deletePhone$1.getInputFormats;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object makePrimaryPhone(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.PhoneError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$makePrimaryPhone$1 phoneRepositoryImpl$makePrimaryPhone$1;
        java.lang.Object coroutine_suspended;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        java.lang.Object highSpeedVideoFpsRangesFor;
        int i2;
        int i3;
        int i4;
        arrow.core.raise.Raise raise;
        com.paypal.oslo.api.graphql.schema.type.UpdatePartyPhoneInput updatePartyPhoneInput;
        java.lang.String str2;
        int i5;
        com.paypal.oslo.core.userstore.UserStore userStore;
        arrow.core.raise.DefaultRaise defaultRaise3;
        try {
            if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$makePrimaryPhone$1) {
                phoneRepositoryImpl$makePrimaryPhone$1 = (com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$makePrimaryPhone$1) continuation;
                if ((phoneRepositoryImpl$makePrimaryPhone$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    phoneRepositoryImpl$makePrimaryPhone$1.getInputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = phoneRepositoryImpl$makePrimaryPhone$1.getOutputSizeshNQ4ISI;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = phoneRepositoryImpl$makePrimaryPhone$1.getInputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        defaultRaise2 = defaultRaise;
                        com.paypal.oslo.api.graphql.schema.type.UpdatePartyPhoneInput updatePartyPhoneInput2 = new com.paypal.oslo.api.graphql.schema.type.UpdatePartyPhoneInput(str);
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes;
                        com.paypal.oslo.feature.userprofile.graphql.UpdatePartyPhoneMutation updatePartyPhoneMutation = new com.paypal.oslo.feature.userprofile.graphql.UpdatePartyPhoneMutation(updatePartyPhoneInput2);
                        com.paypal.oslo.core.network.graphql.RiskSourceId makePrimaryPhone = com.paypal.oslo.core.network.graphql.RiskSourceId.UserProfile.INSTANCE.getMakePrimaryPhone();
                        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl.m20444$r8$lambda$BxDo9Ek_Re5qFm4UTv9jQv6iaY((com.paypal.oslo.feature.userprofile.graphql.UpdatePartyPhoneMutation.Data) obj2);
                            }
                        };
                        phoneRepositoryImpl$makePrimaryPhone$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        phoneRepositoryImpl$makePrimaryPhone$1.getOutputMinFrameDuration = defaultRaise;
                        phoneRepositoryImpl$makePrimaryPhone$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
                        phoneRepositoryImpl$makePrimaryPhone$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updatePartyPhoneInput2);
                        phoneRepositoryImpl$makePrimaryPhone$1.getInputFormats = defaultRaise2;
                        phoneRepositoryImpl$makePrimaryPhone$1.getHighSpeedVideoSizes = 0;
                        phoneRepositoryImpl$makePrimaryPhone$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        phoneRepositoryImpl$makePrimaryPhone$1.getHighSpeedVideoFpsRangesFor = 0;
                        phoneRepositoryImpl$makePrimaryPhone$1.getHighSpeedVideoFpsRanges = 0;
                        phoneRepositoryImpl$makePrimaryPhone$1.getInputSizeshNQ4ISI = 1;
                        highSpeedVideoFpsRangesFor = com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImplKt.getHighSpeedVideoFpsRangesFor(apolloClient, updatePartyPhoneMutation, makePrimaryPhone, "makePrimaryPhone", function1, phoneRepositoryImpl$makePrimaryPhone$1);
                        if (highSpeedVideoFpsRangesFor != coroutine_suspended) {
                            i2 = 0;
                            i3 = 0;
                            i4 = 0;
                            raise = defaultRaise2;
                            updatePartyPhoneInput = updatePartyPhoneInput2;
                            str2 = str;
                            obj = highSpeedVideoFpsRangesFor;
                            i5 = 0;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i6 = phoneRepositoryImpl$makePrimaryPhone$1.getHighSpeedVideoFpsRanges;
                        int i7 = phoneRepositoryImpl$makePrimaryPhone$1.getHighSpeedVideoFpsRangesFor;
                        int i8 = phoneRepositoryImpl$makePrimaryPhone$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i9 = phoneRepositoryImpl$makePrimaryPhone$1.getHighSpeedVideoSizes;
                        defaultRaise3 = (arrow.core.raise.DefaultRaise) phoneRepositoryImpl$makePrimaryPhone$1.getOutputMinFrameDuration;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            defaultRaise3.complete();
                            return new arrow.core.Either.Right(unit);
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            e = e;
                            defaultRaise = defaultRaise3;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        } catch (java.lang.Throwable th) {
                            th = th;
                            defaultRaise = defaultRaise3;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    }
                    i5 = phoneRepositoryImpl$makePrimaryPhone$1.getHighSpeedVideoFpsRanges;
                    i2 = phoneRepositoryImpl$makePrimaryPhone$1.getHighSpeedVideoFpsRangesFor;
                    i3 = phoneRepositoryImpl$makePrimaryPhone$1.getHighResolutionOutputSizeshNQ4ISI;
                    i4 = phoneRepositoryImpl$makePrimaryPhone$1.getHighSpeedVideoSizes;
                    raise = (arrow.core.raise.Raise) phoneRepositoryImpl$makePrimaryPhone$1.getInputFormats;
                    updatePartyPhoneInput = (com.paypal.oslo.api.graphql.schema.type.UpdatePartyPhoneInput) phoneRepositoryImpl$makePrimaryPhone$1.getOutputFormats;
                    defaultRaise2 = (arrow.core.raise.Raise) phoneRepositoryImpl$makePrimaryPhone$1.getHighSpeedVideoSizesFor;
                    defaultRaise = (arrow.core.raise.DefaultRaise) phoneRepositoryImpl$makePrimaryPhone$1.getOutputMinFrameDuration;
                    str2 = (java.lang.String) phoneRepositoryImpl$makePrimaryPhone$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    raise.bind((arrow.core.Either) obj);
                    userStore = this.getHighSpeedVideoFpsRanges;
                    phoneRepositoryImpl$makePrimaryPhone$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    phoneRepositoryImpl$makePrimaryPhone$1.getOutputMinFrameDuration = defaultRaise;
                    phoneRepositoryImpl$makePrimaryPhone$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
                    phoneRepositoryImpl$makePrimaryPhone$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updatePartyPhoneInput);
                    phoneRepositoryImpl$makePrimaryPhone$1.getInputFormats = null;
                    phoneRepositoryImpl$makePrimaryPhone$1.getHighSpeedVideoSizes = i4;
                    phoneRepositoryImpl$makePrimaryPhone$1.getHighResolutionOutputSizeshNQ4ISI = i3;
                    phoneRepositoryImpl$makePrimaryPhone$1.getHighSpeedVideoFpsRangesFor = i2;
                    phoneRepositoryImpl$makePrimaryPhone$1.getHighSpeedVideoFpsRanges = i5;
                    phoneRepositoryImpl$makePrimaryPhone$1.getInputSizeshNQ4ISI = 2;
                    if (com.paypal.oslo.core.userstore.UserStore.refresh$default(userStore, null, phoneRepositoryImpl$makePrimaryPhone$1, 1, null) != coroutine_suspended) {
                        defaultRaise3 = defaultRaise;
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        defaultRaise3.complete();
                        return new arrow.core.Either.Right(unit2);
                    }
                    return coroutine_suspended;
                }
            }
            if (i != 0) {
            }
            raise.bind((arrow.core.Either) obj);
            userStore = this.getHighSpeedVideoFpsRanges;
            phoneRepositoryImpl$makePrimaryPhone$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
            phoneRepositoryImpl$makePrimaryPhone$1.getOutputMinFrameDuration = defaultRaise;
            phoneRepositoryImpl$makePrimaryPhone$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
            phoneRepositoryImpl$makePrimaryPhone$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updatePartyPhoneInput);
            phoneRepositoryImpl$makePrimaryPhone$1.getInputFormats = null;
            phoneRepositoryImpl$makePrimaryPhone$1.getHighSpeedVideoSizes = i4;
            phoneRepositoryImpl$makePrimaryPhone$1.getHighResolutionOutputSizeshNQ4ISI = i3;
            phoneRepositoryImpl$makePrimaryPhone$1.getHighSpeedVideoFpsRangesFor = i2;
            phoneRepositoryImpl$makePrimaryPhone$1.getHighSpeedVideoFpsRanges = i5;
            phoneRepositoryImpl$makePrimaryPhone$1.getInputSizeshNQ4ISI = 2;
            if (com.paypal.oslo.core.userstore.UserStore.refresh$default(userStore, null, phoneRepositoryImpl$makePrimaryPhone$1, 1, null) != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        phoneRepositoryImpl$makePrimaryPhone$1 = new com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$makePrimaryPhone$1(this, continuation);
        java.lang.Object obj2 = phoneRepositoryImpl$makePrimaryPhone$1.getOutputSizeshNQ4ISI;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = phoneRepositoryImpl$makePrimaryPhone$1.getInputSizeshNQ4ISI;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object initiatePhoneConfirmation(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.PhoneError, com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge>> continuation) {
        com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$initiatePhoneConfirmation$1 phoneRepositoryImpl$initiatePhoneConfirmation$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.lang.Object highSpeedVideoFpsRangesFor;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$initiatePhoneConfirmation$1) {
            phoneRepositoryImpl$initiatePhoneConfirmation$1 = (com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$initiatePhoneConfirmation$1) continuation;
            if ((phoneRepositoryImpl$initiatePhoneConfirmation$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                phoneRepositoryImpl$initiatePhoneConfirmation$1.getInputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$initiatePhoneConfirmation$1 phoneRepositoryImpl$initiatePhoneConfirmation$12 = phoneRepositoryImpl$initiatePhoneConfirmation$1;
                java.lang.Object obj = phoneRepositoryImpl$initiatePhoneConfirmation$12.getOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = phoneRepositoryImpl$initiatePhoneConfirmation$12.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.api.graphql.schema.type.InitiatePartyPhoneConfirmationInput initiatePartyPhoneConfirmationInput = new com.paypal.oslo.api.graphql.schema.type.InitiatePartyPhoneConfirmationInput(str);
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes;
                        com.paypal.oslo.feature.userprofile.graphql.InitiatePartyPhoneConfirmationMutation initiatePartyPhoneConfirmationMutation = new com.paypal.oslo.feature.userprofile.graphql.InitiatePartyPhoneConfirmationMutation(initiatePartyPhoneConfirmationInput);
                        com.paypal.oslo.core.network.graphql.RiskSourceId initiatePhoneConfirmation = com.paypal.oslo.core.network.graphql.RiskSourceId.UserProfile.INSTANCE.getInitiatePhoneConfirmation();
                        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl.$r8$lambda$8T3jH_1RECLlUx_LeKBb1wMhtII((com.paypal.oslo.feature.userprofile.graphql.InitiatePartyPhoneConfirmationMutation.Data) obj2);
                            }
                        };
                        phoneRepositoryImpl$initiatePhoneConfirmation$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        phoneRepositoryImpl$initiatePhoneConfirmation$12.getOutputMinFrameDuration = defaultRaise;
                        phoneRepositoryImpl$initiatePhoneConfirmation$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        phoneRepositoryImpl$initiatePhoneConfirmation$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(initiatePartyPhoneConfirmationInput);
                        phoneRepositoryImpl$initiatePhoneConfirmation$12.getOutputFormats = defaultRaise3;
                        phoneRepositoryImpl$initiatePhoneConfirmation$12.Camera2StreamConfigurationMap = 0;
                        phoneRepositoryImpl$initiatePhoneConfirmation$12.getHighSpeedVideoFpsRangesFor = 0;
                        phoneRepositoryImpl$initiatePhoneConfirmation$12.getHighSpeedVideoFpsRanges = 0;
                        phoneRepositoryImpl$initiatePhoneConfirmation$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        phoneRepositoryImpl$initiatePhoneConfirmation$12.getInputSizeshNQ4ISI = 1;
                        highSpeedVideoFpsRangesFor = com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImplKt.getHighSpeedVideoFpsRangesFor(apolloClient, initiatePartyPhoneConfirmationMutation, initiatePhoneConfirmation, "initiatePartyPhoneConfirmation", function1, phoneRepositoryImpl$initiatePhoneConfirmation$12);
                        if (highSpeedVideoFpsRangesFor == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        obj = highSpeedVideoFpsRangesFor;
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
                    int i2 = phoneRepositoryImpl$initiatePhoneConfirmation$12.getHighResolutionOutputSizeshNQ4ISI;
                    int i3 = phoneRepositoryImpl$initiatePhoneConfirmation$12.getHighSpeedVideoFpsRanges;
                    int i4 = phoneRepositoryImpl$initiatePhoneConfirmation$12.getHighSpeedVideoFpsRangesFor;
                    int i5 = phoneRepositoryImpl$initiatePhoneConfirmation$12.Camera2StreamConfigurationMap;
                    raise = (arrow.core.raise.Raise) phoneRepositoryImpl$initiatePhoneConfirmation$12.getOutputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) phoneRepositoryImpl$initiatePhoneConfirmation$12.getOutputMinFrameDuration;
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
                com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge phoneConfirmationChallenge = com.paypal.oslo.feature.userprofile.data.mapper.PhoneResponseMapperKt.toPhoneConfirmationChallenge((com.paypal.oslo.feature.userprofile.graphql.fragment.InitiatePartyPhoneConfirmationResultFragment) raise.bind((arrow.core.Either) obj));
                defaultRaise2.complete();
                return new arrow.core.Either.Right(phoneConfirmationChallenge);
            }
        }
        phoneRepositoryImpl$initiatePhoneConfirmation$1 = new com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$initiatePhoneConfirmation$1(this, continuation);
        com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$initiatePhoneConfirmation$1 phoneRepositoryImpl$initiatePhoneConfirmation$122 = phoneRepositoryImpl$initiatePhoneConfirmation$1;
        java.lang.Object obj2 = phoneRepositoryImpl$initiatePhoneConfirmation$122.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = phoneRepositoryImpl$initiatePhoneConfirmation$122.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge phoneConfirmationChallenge2 = com.paypal.oslo.feature.userprofile.data.mapper.PhoneResponseMapperKt.toPhoneConfirmationChallenge((com.paypal.oslo.feature.userprofile.graphql.fragment.InitiatePartyPhoneConfirmationResultFragment) raise.bind((arrow.core.Either) obj2));
        defaultRaise2.complete();
        return new arrow.core.Either.Right(phoneConfirmationChallenge2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object reinitiatePhoneConfirmation(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.PhoneError, com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge>> continuation) {
        com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$reinitiatePhoneConfirmation$1 phoneRepositoryImpl$reinitiatePhoneConfirmation$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.lang.Object highSpeedVideoFpsRangesFor;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$reinitiatePhoneConfirmation$1) {
            phoneRepositoryImpl$reinitiatePhoneConfirmation$1 = (com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$reinitiatePhoneConfirmation$1) continuation;
            if ((phoneRepositoryImpl$reinitiatePhoneConfirmation$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                phoneRepositoryImpl$reinitiatePhoneConfirmation$1.getOutputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$reinitiatePhoneConfirmation$1 phoneRepositoryImpl$reinitiatePhoneConfirmation$12 = phoneRepositoryImpl$reinitiatePhoneConfirmation$1;
                java.lang.Object obj = phoneRepositoryImpl$reinitiatePhoneConfirmation$12.getOutputStallDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = phoneRepositoryImpl$reinitiatePhoneConfirmation$12.getOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.api.graphql.schema.type.ReinitiatePartyPhoneConfirmationInput reinitiatePartyPhoneConfirmationInput = new com.paypal.oslo.api.graphql.schema.type.ReinitiatePartyPhoneConfirmationInput(str, str2, str3);
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes;
                        com.paypal.oslo.feature.userprofile.graphql.ReinitiatePartyPhoneConfirmationMutation reinitiatePartyPhoneConfirmationMutation = new com.paypal.oslo.feature.userprofile.graphql.ReinitiatePartyPhoneConfirmationMutation(reinitiatePartyPhoneConfirmationInput);
                        com.paypal.oslo.core.network.graphql.RiskSourceId reinitiatePhoneConfirmation = com.paypal.oslo.core.network.graphql.RiskSourceId.UserProfile.INSTANCE.getReinitiatePhoneConfirmation();
                        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl.m20443$r8$lambda$9UGCCy5NR8fpOuF0z0rsGrqBHw((com.paypal.oslo.feature.userprofile.graphql.ReinitiatePartyPhoneConfirmationMutation.Data) obj2);
                            }
                        };
                        phoneRepositoryImpl$reinitiatePhoneConfirmation$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        phoneRepositoryImpl$reinitiatePhoneConfirmation$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        phoneRepositoryImpl$reinitiatePhoneConfirmation$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                        phoneRepositoryImpl$reinitiatePhoneConfirmation$12.getOutputMinFrameDuration = defaultRaise;
                        phoneRepositoryImpl$reinitiatePhoneConfirmation$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        phoneRepositoryImpl$reinitiatePhoneConfirmation$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(reinitiatePartyPhoneConfirmationInput);
                        phoneRepositoryImpl$reinitiatePhoneConfirmation$12.getOutputSizes = defaultRaise3;
                        phoneRepositoryImpl$reinitiatePhoneConfirmation$12.getHighSpeedVideoFpsRanges = 0;
                        phoneRepositoryImpl$reinitiatePhoneConfirmation$12.getHighSpeedVideoSizes = 0;
                        phoneRepositoryImpl$reinitiatePhoneConfirmation$12.getHighSpeedVideoFpsRangesFor = 0;
                        phoneRepositoryImpl$reinitiatePhoneConfirmation$12.Camera2StreamConfigurationMap = 0;
                        phoneRepositoryImpl$reinitiatePhoneConfirmation$12.getOutputSizeshNQ4ISI = 1;
                        highSpeedVideoFpsRangesFor = com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImplKt.getHighSpeedVideoFpsRangesFor(apolloClient, reinitiatePartyPhoneConfirmationMutation, reinitiatePhoneConfirmation, "reinitiatePartyPhoneConfirmation", function1, phoneRepositoryImpl$reinitiatePhoneConfirmation$12);
                        if (highSpeedVideoFpsRangesFor == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        obj = highSpeedVideoFpsRangesFor;
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
                    int i2 = phoneRepositoryImpl$reinitiatePhoneConfirmation$12.Camera2StreamConfigurationMap;
                    int i3 = phoneRepositoryImpl$reinitiatePhoneConfirmation$12.getHighSpeedVideoFpsRangesFor;
                    int i4 = phoneRepositoryImpl$reinitiatePhoneConfirmation$12.getHighSpeedVideoSizes;
                    int i5 = phoneRepositoryImpl$reinitiatePhoneConfirmation$12.getHighSpeedVideoFpsRanges;
                    raise = (arrow.core.raise.Raise) phoneRepositoryImpl$reinitiatePhoneConfirmation$12.getOutputSizes;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) phoneRepositoryImpl$reinitiatePhoneConfirmation$12.getOutputMinFrameDuration;
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
                com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge phoneConfirmationChallenge = com.paypal.oslo.feature.userprofile.data.mapper.PhoneResponseMapperKt.toPhoneConfirmationChallenge((com.paypal.oslo.feature.userprofile.graphql.fragment.InitiatePartyPhoneConfirmationResultFragment) raise.bind((arrow.core.Either) obj));
                defaultRaise2.complete();
                return new arrow.core.Either.Right(phoneConfirmationChallenge);
            }
        }
        phoneRepositoryImpl$reinitiatePhoneConfirmation$1 = new com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$reinitiatePhoneConfirmation$1(this, continuation);
        com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$reinitiatePhoneConfirmation$1 phoneRepositoryImpl$reinitiatePhoneConfirmation$122 = phoneRepositoryImpl$reinitiatePhoneConfirmation$1;
        java.lang.Object obj2 = phoneRepositoryImpl$reinitiatePhoneConfirmation$122.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = phoneRepositoryImpl$reinitiatePhoneConfirmation$122.getOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge phoneConfirmationChallenge2 = com.paypal.oslo.feature.userprofile.data.mapper.PhoneResponseMapperKt.toPhoneConfirmationChallenge((com.paypal.oslo.feature.userprofile.graphql.fragment.InitiatePartyPhoneConfirmationResultFragment) raise.bind((arrow.core.Either) obj2));
        defaultRaise2.complete();
        return new arrow.core.Either.Right(phoneConfirmationChallenge2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r13v3, types: [arrow.core.raise.Raise] */
    /* JADX WARN: Type inference failed for: r8v4, types: [arrow.core.raise.Raise] */
    @Override // com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object verifyPhone(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.PhoneError, com.paypal.oslo.core.userstore.model.ProfilePhone>> continuation) {
        com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$verifyPhone$1 phoneRepositoryImpl$verifyPhone$1;
        java.lang.Object coroutine_suspended;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.lang.Object highSpeedVideoFpsRangesFor;
        java.lang.String str5;
        int i2;
        int i3;
        int i4;
        int i5;
        arrow.core.raise.DefaultRaise defaultRaise2;
        boolean z2;
        com.paypal.oslo.api.graphql.schema.type.VerifyPartyPhoneInput verifyPartyPhoneInput;
        java.lang.String str6;
        java.lang.String str7;
        arrow.core.raise.DefaultRaise defaultRaise3;
        java.lang.String str8;
        arrow.core.raise.DefaultRaise defaultRaise4;
        com.paypal.oslo.core.userstore.UserStore userStore;
        com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone;
        try {
            try {
                if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$verifyPhone$1) {
                    phoneRepositoryImpl$verifyPhone$1 = (com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$verifyPhone$1) continuation;
                    if ((phoneRepositoryImpl$verifyPhone$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                        phoneRepositoryImpl$verifyPhone$1.getOutputSizes -= 2147483648;
                        java.lang.Object obj = phoneRepositoryImpl$verifyPhone$1.isOutputSupportedFor;
                        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = phoneRepositoryImpl$verifyPhone$1.getOutputSizes;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            defaultRaise = new arrow.core.raise.DefaultRaise(false);
                            arrow.core.raise.DefaultRaise defaultRaise5 = defaultRaise;
                            com.paypal.oslo.api.graphql.schema.type.VerifyPartyPhoneInput verifyPartyPhoneInput2 = new com.paypal.oslo.api.graphql.schema.type.VerifyPartyPhoneInput(str, str2, str3, str4, z, null, 32, null);
                            com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes;
                            com.paypal.oslo.feature.userprofile.graphql.VerifyPartyPhoneMutation verifyPartyPhoneMutation = new com.paypal.oslo.feature.userprofile.graphql.VerifyPartyPhoneMutation(verifyPartyPhoneInput2);
                            com.paypal.oslo.core.network.graphql.RiskSourceId verifyPhone = com.paypal.oslo.core.network.graphql.RiskSourceId.UserProfile.INSTANCE.getVerifyPhone();
                            kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl.$r8$lambda$zYRKrEM_ij_4D_1NxqiLQ78XTZk((com.paypal.oslo.feature.userprofile.graphql.VerifyPartyPhoneMutation.Data) obj2);
                                }
                            };
                            phoneRepositoryImpl$verifyPhone$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                            phoneRepositoryImpl$verifyPhone$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                            phoneRepositoryImpl$verifyPhone$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                            phoneRepositoryImpl$verifyPhone$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                            phoneRepositoryImpl$verifyPhone$1.getHighSpeedVideoSizesFor = defaultRaise;
                            phoneRepositoryImpl$verifyPhone$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise5);
                            phoneRepositoryImpl$verifyPhone$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(verifyPartyPhoneInput2);
                            phoneRepositoryImpl$verifyPhone$1.getOutputStallDuration = defaultRaise5;
                            phoneRepositoryImpl$verifyPhone$1.getOutputStallDurationlomOqCM = z;
                            phoneRepositoryImpl$verifyPhone$1.getHighSpeedVideoFpsRanges = 0;
                            phoneRepositoryImpl$verifyPhone$1.getHighSpeedVideoFpsRangesFor = 0;
                            phoneRepositoryImpl$verifyPhone$1.Camera2StreamConfigurationMap = 0;
                            phoneRepositoryImpl$verifyPhone$1.getHighSpeedVideoSizes = 0;
                            phoneRepositoryImpl$verifyPhone$1.getOutputSizes = 1;
                            highSpeedVideoFpsRangesFor = com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImplKt.getHighSpeedVideoFpsRangesFor(apolloClient, verifyPartyPhoneMutation, verifyPhone, "verifyPartyPhone", function1, phoneRepositoryImpl$verifyPhone$1);
                            if (highSpeedVideoFpsRangesFor == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            str5 = str4;
                            i2 = 0;
                            i3 = 0;
                            i4 = 0;
                            i5 = 0;
                            obj = highSpeedVideoFpsRangesFor;
                            defaultRaise2 = defaultRaise5;
                            z2 = z;
                            verifyPartyPhoneInput = verifyPartyPhoneInput2;
                            str6 = str;
                            str7 = str2;
                            defaultRaise3 = defaultRaise2;
                            str8 = str3;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i6 = phoneRepositoryImpl$verifyPhone$1.getHighSpeedVideoSizes;
                                int i7 = phoneRepositoryImpl$verifyPhone$1.Camera2StreamConfigurationMap;
                                int i8 = phoneRepositoryImpl$verifyPhone$1.getHighSpeedVideoFpsRangesFor;
                                int i9 = phoneRepositoryImpl$verifyPhone$1.getHighSpeedVideoFpsRanges;
                                boolean z3 = phoneRepositoryImpl$verifyPhone$1.getOutputStallDurationlomOqCM;
                                profilePhone = (com.paypal.oslo.core.userstore.model.ProfilePhone) phoneRepositoryImpl$verifyPhone$1.getOutputMinFrameDurationlomOqCM;
                                defaultRaise4 = (arrow.core.raise.DefaultRaise) phoneRepositoryImpl$verifyPhone$1.getHighSpeedVideoSizesFor;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    defaultRaise4.complete();
                                    return new arrow.core.Either.Right(profilePhone);
                                } catch (arrow.core.raise.RaiseCancellationException e) {
                                    e = e;
                                    defaultRaise = defaultRaise4;
                                    defaultRaise.complete();
                                    return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    defaultRaise = defaultRaise4;
                                    defaultRaise.complete();
                                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                }
                            }
                            int i10 = phoneRepositoryImpl$verifyPhone$1.getHighSpeedVideoSizes;
                            int i11 = phoneRepositoryImpl$verifyPhone$1.Camera2StreamConfigurationMap;
                            int i12 = phoneRepositoryImpl$verifyPhone$1.getHighSpeedVideoFpsRangesFor;
                            int i13 = phoneRepositoryImpl$verifyPhone$1.getHighSpeedVideoFpsRanges;
                            z2 = phoneRepositoryImpl$verifyPhone$1.getOutputStallDurationlomOqCM;
                            ?? r8 = (arrow.core.raise.Raise) phoneRepositoryImpl$verifyPhone$1.getOutputStallDuration;
                            com.paypal.oslo.api.graphql.schema.type.VerifyPartyPhoneInput verifyPartyPhoneInput3 = (com.paypal.oslo.api.graphql.schema.type.VerifyPartyPhoneInput) phoneRepositoryImpl$verifyPhone$1.getOutputSizeshNQ4ISI;
                            ?? r13 = (arrow.core.raise.Raise) phoneRepositoryImpl$verifyPhone$1.getOutputFormats;
                            defaultRaise = (arrow.core.raise.DefaultRaise) phoneRepositoryImpl$verifyPhone$1.getHighSpeedVideoSizesFor;
                            str5 = (java.lang.String) phoneRepositoryImpl$verifyPhone$1.getInputFormats;
                            str8 = (java.lang.String) phoneRepositoryImpl$verifyPhone$1.getInputSizeshNQ4ISI;
                            str7 = (java.lang.String) phoneRepositoryImpl$verifyPhone$1.getOutputMinFrameDuration;
                            str6 = (java.lang.String) phoneRepositoryImpl$verifyPhone$1.getHighResolutionOutputSizeshNQ4ISI;
                            kotlin.ResultKt.throwOnFailure(obj);
                            defaultRaise2 = r13;
                            verifyPartyPhoneInput = verifyPartyPhoneInput3;
                            defaultRaise3 = r8;
                            i5 = i13;
                            i4 = i12;
                            i3 = i11;
                            i2 = i10;
                        }
                        com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragment partyPhoneFragment = (com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragment) defaultRaise3.bind((arrow.core.Either) obj);
                        com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone2 = com.paypal.oslo.feature.userprofile.data.mapper.PhoneResponseMapperKt.toProfilePhone(partyPhoneFragment);
                        userStore = this.getHighSpeedVideoFpsRanges;
                        phoneRepositoryImpl$verifyPhone$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str6);
                        phoneRepositoryImpl$verifyPhone$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str7);
                        phoneRepositoryImpl$verifyPhone$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str8);
                        phoneRepositoryImpl$verifyPhone$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
                        phoneRepositoryImpl$verifyPhone$1.getHighSpeedVideoSizesFor = defaultRaise;
                        phoneRepositoryImpl$verifyPhone$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
                        phoneRepositoryImpl$verifyPhone$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(verifyPartyPhoneInput);
                        phoneRepositoryImpl$verifyPhone$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(partyPhoneFragment);
                        phoneRepositoryImpl$verifyPhone$1.getOutputMinFrameDurationlomOqCM = profilePhone2;
                        phoneRepositoryImpl$verifyPhone$1.getOutputStallDurationlomOqCM = z2;
                        phoneRepositoryImpl$verifyPhone$1.getHighSpeedVideoFpsRanges = i5;
                        phoneRepositoryImpl$verifyPhone$1.getHighSpeedVideoFpsRangesFor = i4;
                        phoneRepositoryImpl$verifyPhone$1.Camera2StreamConfigurationMap = i3;
                        phoneRepositoryImpl$verifyPhone$1.getHighSpeedVideoSizes = i2;
                        phoneRepositoryImpl$verifyPhone$1.getOutputSizes = 2;
                        if (com.paypal.oslo.core.userstore.UserStore.refresh$default(userStore, null, phoneRepositoryImpl$verifyPhone$1, 1, null) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        profilePhone = profilePhone2;
                        defaultRaise4 = defaultRaise;
                        defaultRaise4.complete();
                        return new arrow.core.Either.Right(profilePhone);
                    }
                }
                com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragment partyPhoneFragment2 = (com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragment) defaultRaise3.bind((arrow.core.Either) obj);
                com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone22 = com.paypal.oslo.feature.userprofile.data.mapper.PhoneResponseMapperKt.toProfilePhone(partyPhoneFragment2);
                userStore = this.getHighSpeedVideoFpsRanges;
                phoneRepositoryImpl$verifyPhone$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str6);
                phoneRepositoryImpl$verifyPhone$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str7);
                phoneRepositoryImpl$verifyPhone$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str8);
                phoneRepositoryImpl$verifyPhone$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
                phoneRepositoryImpl$verifyPhone$1.getHighSpeedVideoSizesFor = defaultRaise;
                phoneRepositoryImpl$verifyPhone$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
                phoneRepositoryImpl$verifyPhone$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(verifyPartyPhoneInput);
                phoneRepositoryImpl$verifyPhone$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(partyPhoneFragment2);
                phoneRepositoryImpl$verifyPhone$1.getOutputMinFrameDurationlomOqCM = profilePhone22;
                phoneRepositoryImpl$verifyPhone$1.getOutputStallDurationlomOqCM = z2;
                phoneRepositoryImpl$verifyPhone$1.getHighSpeedVideoFpsRanges = i5;
                phoneRepositoryImpl$verifyPhone$1.getHighSpeedVideoFpsRangesFor = i4;
                phoneRepositoryImpl$verifyPhone$1.Camera2StreamConfigurationMap = i3;
                phoneRepositoryImpl$verifyPhone$1.getHighSpeedVideoSizes = i2;
                phoneRepositoryImpl$verifyPhone$1.getOutputSizes = 2;
                if (com.paypal.oslo.core.userstore.UserStore.refresh$default(userStore, null, phoneRepositoryImpl$verifyPhone$1, 1, null) != coroutine_suspended) {
                }
            } catch (arrow.core.raise.RaiseCancellationException e2) {
                e = e2;
                defaultRaise4 = defaultRaise;
                defaultRaise = defaultRaise4;
                defaultRaise.complete();
                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
            } catch (java.lang.Throwable th2) {
                th = th2;
                defaultRaise4 = defaultRaise;
                defaultRaise = defaultRaise4;
                defaultRaise.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
            }
            if (i != 0) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e3) {
            e = e3;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
        phoneRepositoryImpl$verifyPhone$1 = new com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$verifyPhone$1(this, continuation);
        java.lang.Object obj2 = phoneRepositoryImpl$verifyPhone$1.isOutputSupportedFor;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = phoneRepositoryImpl$verifyPhone$1.getOutputSizes;
    }

    private static com.paypal.oslo.api.graphql.schema.type.PhoneType getHighSpeedVideoFpsRanges(java.lang.String p0) {
        java.lang.String upperCase = p0.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        int hashCode = upperCase.hashCode();
        if (hashCode != -2015525726) {
            if (hashCode != 2223327) {
                if (hashCode == 2670353 && upperCase.equals("WORK")) {
                    return com.paypal.oslo.api.graphql.schema.type.PhoneType.WORK;
                }
            } else if (upperCase.equals("HOME")) {
                return com.paypal.oslo.api.graphql.schema.type.PhoneType.HOME;
            }
        } else if (upperCase.equals("MOBILE")) {
            return com.paypal.oslo.api.graphql.schema.type.PhoneType.MOBILE;
        }
        return com.paypal.oslo.api.graphql.schema.type.PhoneType.MOBILE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.userprofile.graphql.fragment.InitiatePartyPhoneConfirmationResultFragment $r8$lambda$8T3jH_1RECLlUx_LeKBb1wMhtII(com.paypal.oslo.feature.userprofile.graphql.InitiatePartyPhoneConfirmationMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return data.getInitiatePartyPhoneConfirmation().getInitiatePartyPhoneConfirmationResultFragment();
    }

    public static /* synthetic */ com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragment $r8$lambda$8qPWSU7i5yBcFOh05ixQZ2yEdg0(com.paypal.oslo.feature.userprofile.graphql.AddPartyPhoneMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return data.getAddPartyPhone().getPhone().getPartyPhoneFragment();
    }

    /* renamed from: $r8$lambda$9UGCCy5NR8fpOuF0z0-rsGrqBHw, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.userprofile.graphql.fragment.InitiatePartyPhoneConfirmationResultFragment m20443$r8$lambda$9UGCCy5NR8fpOuF0z0rsGrqBHw(com.paypal.oslo.feature.userprofile.graphql.ReinitiatePartyPhoneConfirmationMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return data.getReinitiatePartyPhoneConfirmation().getInitiatePartyPhoneConfirmationResultFragment();
    }

    /* renamed from: $r8$lambda$BxDo9Ek_Re-5qFm4UTv9jQv6iaY, reason: not valid java name */
    public static /* synthetic */ java.lang.String m20444$r8$lambda$BxDo9Ek_Re5qFm4UTv9jQv6iaY(com.paypal.oslo.feature.userprofile.graphql.UpdatePartyPhoneMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return data.getUpdatePartyPhone().getParty().getId();
    }

    public static /* synthetic */ com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragment $r8$lambda$jGrMszeFSpZoNOJmhDLmljFAOLg(com.paypal.oslo.feature.userprofile.graphql.ReplacePartyPhoneMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return data.getReplacePartyPhone().getPhone().getPartyPhoneFragment();
    }

    /* renamed from: $r8$lambda$pEBlxV-Wn0O6LOaeeHn6cOYHTek, reason: not valid java name */
    public static /* synthetic */ java.lang.String m20445$r8$lambda$pEBlxVWn0O6LOaeeHn6cOYHTek(com.paypal.oslo.feature.userprofile.graphql.DeletePartyPhoneMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return data.getDeletePartyPhone().getParty().getId();
    }

    public static /* synthetic */ com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragment $r8$lambda$zYRKrEM_ij_4D_1NxqiLQ78XTZk(com.paypal.oslo.feature.userprofile.graphql.VerifyPartyPhoneMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return data.getVerifyPartyPhone().getPhone().getPartyPhoneFragment();
    }
}
