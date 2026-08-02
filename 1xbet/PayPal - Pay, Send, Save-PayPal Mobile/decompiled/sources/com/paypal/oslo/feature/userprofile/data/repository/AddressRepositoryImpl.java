package com.paypal.oslo.feature.userprofile.data.repository;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b0\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/userprofile/data/repository/AddressRepositoryImpl;", "Lcom/paypal/oslo/feature/userprofile/domain/repository/AddressRepository;", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/ObserveUserStoreUseCase;", "observeUserStoreUseCase", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/feature/userprofile/domain/usecase/ObserveUserStoreUseCase;Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/core/userstore/UserStore;)V", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/userprofile/domain/model/DataResult;", "", "Lcom/paypal/oslo/feature/userprofile/domain/ProfileDataItem;", "Lcom/paypal/oslo/core/userstore/model/ProfileAddress;", "getAddresses", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/userprofile/domain/model/AddressError;", "addAddress", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "p0", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/userprofile/domain/model/AddressError;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/ObserveUserStoreUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/userstore/UserStore;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddressRepositoryImpl implements com.paypal.oslo.feature.userprofile.domain.repository.AddressRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoSizes;

    @javax.inject.Inject
    public AddressRepositoryImpl(com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase observeUserStoreUseCase, com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observeUserStoreUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.getHighResolutionOutputSizeshNQ4ISI = observeUserStoreUseCase;
        this.getHighSpeedVideoFpsRanges = apolloClient;
        this.getHighSpeedVideoSizes = userStore;
    }

    @Override // com.paypal.oslo.feature.userprofile.domain.repository.AddressRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.userprofile.domain.model.DataResult<java.util.List<com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<com.paypal.oslo.core.userstore.model.ProfileAddress>>>> getAddresses() {
        final kotlinx.coroutines.flow.Flow<com.paypal.oslo.core.userstore.model.UserState> invoke = this.getHighResolutionOutputSizeshNQ4ISI.invoke();
        return (kotlinx.coroutines.flow.Flow) new kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.userprofile.domain.model.DataResult<? extends java.util.List<? extends com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<com.paypal.oslo.core.userstore.model.ProfileAddress>>>>() { // from class: com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl$getAddresses$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl$getAddresses$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoSizes;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl$getAddresses$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    java.lang.Object obj2;
                    java.util.ArrayList arrayList;
                    if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl$getAddresses$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl$getAddresses$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getInputFormats & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getInputFormats -= 2147483648;
                            java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoSizesFor;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getInputFormats;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj3);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoSizes;
                                com.paypal.oslo.core.userstore.model.UserState userState = (com.paypal.oslo.core.userstore.model.UserState) obj;
                                if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoading) {
                                    obj2 = (com.paypal.oslo.feature.userprofile.domain.model.DataResult) com.paypal.oslo.feature.userprofile.domain.model.DataResult.Loading.INSTANCE;
                                } else if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
                                    java.util.List<com.paypal.oslo.core.userstore.model.ProfileAddress> profileAddresses = ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState).getUser().getProfileAddresses();
                                    if (profileAddresses != null) {
                                        java.util.List<com.paypal.oslo.core.userstore.model.ProfileAddress> list = profileAddresses;
                                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                                        java.util.Iterator<T> it = list.iterator();
                                        while (it.hasNext()) {
                                            arrayList2.add(com.paypal.oslo.feature.userprofile.domain.ProfileDataItemExtensionsKt.toProfileDataItem((com.paypal.oslo.core.userstore.model.ProfileAddress) it.next()));
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
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoFpsRanges = 0;
                                anonymousClass1.getInputFormats = 1;
                                if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                java.lang.Object obj4 = anonymousClass1.Camera2StreamConfigurationMap;
                                java.lang.Object obj5 = anonymousClass1.getHighSpeedVideoSizes;
                                kotlin.ResultKt.throwOnFailure(obj3);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl$getAddresses$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj32 = anonymousClass1.getHighSpeedVideoSizesFor;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getInputFormats;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl$getAddresses$$inlined$map$1$2", f = "AddressRepositoryImpl.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl$getAddresses$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    int getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
                    int getInputFormats;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoSizesFor = obj;
                        this.getInputFormats |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl$getAddresses$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.getHighSpeedVideoSizes = flowCollector;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.userprofile.domain.model.DataResult<? extends java.util.List<? extends com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<com.paypal.oslo.core.userstore.model.ProfileAddress>>>> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl$getAddresses$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x022a A[Catch: all -> 0x0257, RaiseCancellationException -> 0x0261, TryCatch #4 {RaiseCancellationException -> 0x0261, all -> 0x0257, blocks: (B:12:0x005a, B:13:0x020c, B:22:0x012f, B:27:0x013d, B:29:0x014d, B:31:0x0153, B:33:0x0159, B:36:0x01c0, B:40:0x0164, B:41:0x0173, B:45:0x0178, B:47:0x01ac, B:49:0x01b2, B:51:0x01b8, B:53:0x0217, B:54:0x0223, B:56:0x0224, B:57:0x0229, B:58:0x022a, B:59:0x0254, B:68:0x00a4), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // com.paypal.oslo.feature.userprofile.domain.repository.AddressRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object addAddress(com.paypal.oslo.core.i18n.domain.model.Address address, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.AddressError, com.paypal.oslo.core.userstore.model.ProfileAddress>> continuation) {
        com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl$addAddress$1 addressRepositoryImpl$addAddress$1;
        ?? r4;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        com.paypal.oslo.api.graphql.schema.type.AddPartyBillingAddressInput buildAddressInput$default;
        com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation addPartyBillingAddressMutation;
        com.apollographql.apollo.ApolloCall addExecutionContext;
        int i;
        int i2;
        int i3;
        java.lang.String str;
        com.paypal.oslo.core.i18n.domain.model.Address address2;
        int i4;
        arrow.core.Ior ior;
        int i5;
        com.paypal.oslo.feature.userprofile.graphql.fragment.BillingAddressFields billingAddressFields;
        com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation.AddPartyBillingAddress addPartyBillingAddress;
        com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation.Address address3;
        com.paypal.oslo.core.userstore.model.ProfileAddress profileAddress;
        com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation.AddPartyBillingAddress addPartyBillingAddress2;
        com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation.Address address4;
        try {
            if (continuation instanceof com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl$addAddress$1) {
                addressRepositoryImpl$addAddress$1 = (com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl$addAddress$1) continuation;
                if ((addressRepositoryImpl$addAddress$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                    addressRepositoryImpl$addAddress$1.getOutputSizes -= 2147483648;
                    java.lang.Object obj = addressRepositoryImpl$addAddress$1.getOutputStallDuration;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r4 = addressRepositoryImpl$addAddress$1.getOutputSizes;
                    if (r4 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise2 = new arrow.core.raise.DefaultRaise(false);
                        defaultRaise3 = defaultRaise2;
                        com.paypal.oslo.core.userstore.model.UserState value = this.getHighSpeedVideoSizes.getUserState().getValue();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
                        java.lang.String accountCountryCode = ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value).getUser().getAccountCountryCode();
                        buildAddressInput$default = com.paypal.oslo.feature.userprofile.data.utils.AddressInputBuilder.buildAddressInput$default(com.paypal.oslo.feature.userprofile.data.utils.AddressInputBuilder.INSTANCE, address, accountCountryCode, false, 4, null);
                        addPartyBillingAddressMutation = new com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation(buildAddressInput$default);
                        addExecutionContext = this.getHighSpeedVideoFpsRanges.mutation(addPartyBillingAddressMutation).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeClientMetadataIdHeader(com.paypal.oslo.core.network.graphql.RiskSourceId.UserProfile.INSTANCE.getAddAddress(), null, 2, null));
                        com.paypal.oslo.core.network.graphql.CallConfig createCallConfig = com.paypal.oslo.feature.userprofile.data.utils.CommonUtilsKt.createCallConfig(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, "addPartyBillingAddress");
                        addressRepositoryImpl$addAddress$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(address);
                        addressRepositoryImpl$addAddress$1.getInputFormats = defaultRaise2;
                        addressRepositoryImpl$addAddress$1.getOutputFormats = defaultRaise3;
                        addressRepositoryImpl$addAddress$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildAddressInput$default);
                        addressRepositoryImpl$addAddress$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(accountCountryCode);
                        addressRepositoryImpl$addAddress$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addPartyBillingAddressMutation);
                        addressRepositoryImpl$addAddress$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addExecutionContext);
                        addressRepositoryImpl$addAddress$1.getHighSpeedVideoFpsRanges = 0;
                        addressRepositoryImpl$addAddress$1.getHighSpeedVideoSizes = 0;
                        addressRepositoryImpl$addAddress$1.getHighSpeedVideoFpsRangesFor = 0;
                        addressRepositoryImpl$addAddress$1.Camera2StreamConfigurationMap = 0;
                        addressRepositoryImpl$addAddress$1.getOutputSizes = 1;
                        java.lang.Object execute = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addExecutionContext, createCallConfig, addressRepositoryImpl$addAddress$1);
                        if (execute == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i = 0;
                        i2 = 0;
                        i3 = 0;
                        str = accountCountryCode;
                        address2 = address;
                        obj = execute;
                        i4 = 0;
                    } else {
                        if (r4 != 1) {
                            if (r4 != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i6 = addressRepositoryImpl$addAddress$1.Camera2StreamConfigurationMap;
                            int i7 = addressRepositoryImpl$addAddress$1.getHighSpeedVideoFpsRangesFor;
                            int i8 = addressRepositoryImpl$addAddress$1.getHighSpeedVideoSizes;
                            int i9 = addressRepositoryImpl$addAddress$1.getHighSpeedVideoFpsRanges;
                            profileAddress = (com.paypal.oslo.core.userstore.model.ProfileAddress) addressRepositoryImpl$addAddress$1.getOutputSizeshNQ4ISI;
                            defaultRaise2 = (arrow.core.raise.DefaultRaise) addressRepositoryImpl$addAddress$1.getInputFormats;
                            kotlin.ResultKt.throwOnFailure(obj);
                            defaultRaise2.complete();
                            return new arrow.core.Either.Right(profileAddress);
                        }
                        int i10 = addressRepositoryImpl$addAddress$1.Camera2StreamConfigurationMap;
                        i = addressRepositoryImpl$addAddress$1.getHighSpeedVideoFpsRangesFor;
                        i2 = addressRepositoryImpl$addAddress$1.getHighSpeedVideoSizes;
                        i3 = addressRepositoryImpl$addAddress$1.getHighSpeedVideoFpsRanges;
                        addExecutionContext = (com.apollographql.apollo.ApolloCall) addressRepositoryImpl$addAddress$1.getOutputStallDurationlomOqCM;
                        addPartyBillingAddressMutation = (com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation) addressRepositoryImpl$addAddress$1.getHighSpeedVideoSizesFor;
                        str = (java.lang.String) addressRepositoryImpl$addAddress$1.getOutputMinFrameDuration;
                        buildAddressInput$default = (com.paypal.oslo.api.graphql.schema.type.AddPartyBillingAddressInput) addressRepositoryImpl$addAddress$1.getInputSizeshNQ4ISI;
                        defaultRaise3 = (arrow.core.raise.Raise) addressRepositoryImpl$addAddress$1.getOutputFormats;
                        defaultRaise = (arrow.core.raise.DefaultRaise) addressRepositoryImpl$addAddress$1.getInputFormats;
                        address2 = (com.paypal.oslo.core.i18n.domain.model.Address) addressRepositoryImpl$addAddress$1.getHighResolutionOutputSizeshNQ4ISI;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            i4 = i10;
                            defaultRaise2 = defaultRaise;
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            e = e;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        } catch (java.lang.Throwable th) {
                            th = th;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    }
                    ior = (arrow.core.Ior) obj;
                    if (!(ior instanceof arrow.core.Ior.Left)) {
                        com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Error in addressAdd:", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", callError.toString())), null, 4, null);
                        defaultRaise3.raise(Camera2StreamConfigurationMap(callError));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    if (ior instanceof arrow.core.Ior.Right) {
                        com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation.Data data = (com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                        billingAddressFields = (data == null || (addPartyBillingAddress2 = data.getAddPartyBillingAddress()) == null || (address4 = addPartyBillingAddress2.getAddress()) == null) ? null : address4.getBillingAddressFields();
                        if (billingAddressFields == null) {
                            defaultRaise3.raise(new com.paypal.oslo.feature.userprofile.domain.model.AddressError.ServerError("Address mutation succeeded but response contained no address data"));
                            throw new kotlin.KotlinNothingValueException();
                        }
                        i5 = i4;
                    } else if (ior instanceof arrow.core.Ior.Both) {
                        java.lang.Object leftValue = ((arrow.core.Ior.Both) ior).getLeftValue();
                        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue();
                        com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                        i5 = i4;
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Partial success adding address", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", callError2.toString())), null, 4, null);
                        com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation.Data data2 = (com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation.Data) graphQLData.getData();
                        billingAddressFields = (data2 == null || (addPartyBillingAddress = data2.getAddPartyBillingAddress()) == null || (address3 = addPartyBillingAddress.getAddress()) == null) ? null : address3.getBillingAddressFields();
                        if (billingAddressFields == null) {
                            defaultRaise3.raise(Camera2StreamConfigurationMap(callError2));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    profileAddress = com.paypal.oslo.feature.userprofile.data.mapper.AddressResponseMapperKt.toProfileAddress(billingAddressFields);
                    com.paypal.oslo.core.userstore.UserStore userStore = this.getHighSpeedVideoSizes;
                    addressRepositoryImpl$addAddress$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(address2);
                    addressRepositoryImpl$addAddress$1.getInputFormats = defaultRaise2;
                    addressRepositoryImpl$addAddress$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                    addressRepositoryImpl$addAddress$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildAddressInput$default);
                    addressRepositoryImpl$addAddress$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    addressRepositoryImpl$addAddress$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addPartyBillingAddressMutation);
                    addressRepositoryImpl$addAddress$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addExecutionContext);
                    addressRepositoryImpl$addAddress$1.getOutputSizeshNQ4ISI = profileAddress;
                    addressRepositoryImpl$addAddress$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(billingAddressFields);
                    addressRepositoryImpl$addAddress$1.getHighSpeedVideoFpsRanges = i3;
                    addressRepositoryImpl$addAddress$1.getHighSpeedVideoSizes = i2;
                    addressRepositoryImpl$addAddress$1.getHighSpeedVideoFpsRangesFor = i;
                    addressRepositoryImpl$addAddress$1.Camera2StreamConfigurationMap = i5;
                    addressRepositoryImpl$addAddress$1.getOutputSizes = 2;
                    if (com.paypal.oslo.core.userstore.UserStore.refresh$default(userStore, null, addressRepositoryImpl$addAddress$1, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    defaultRaise2.complete();
                    return new arrow.core.Either.Right(profileAddress);
                }
            }
            if (r4 != 0) {
            }
            ior = (arrow.core.Ior) obj;
            if (!(ior instanceof arrow.core.Ior.Left)) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
            defaultRaise = r4;
        } catch (java.lang.Throwable th2) {
            th = th2;
            defaultRaise = r4;
        }
        addressRepositoryImpl$addAddress$1 = new com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl$addAddress$1(this, continuation);
        java.lang.Object obj2 = addressRepositoryImpl$addAddress$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = addressRepositoryImpl$addAddress$1.getOutputSizes;
    }

    private static com.paypal.oslo.feature.userprofile.domain.model.AddressError Camera2StreamConfigurationMap(com.paypal.oslo.core.network.graphql.error.CallError p0) {
        if (p0 instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return new com.paypal.oslo.feature.userprofile.domain.model.AddressError.NetworkError(((com.paypal.oslo.core.network.graphql.error.CallError.Network) p0).getError().toString());
        }
        if (p0 instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            return new com.paypal.oslo.feature.userprofile.domain.model.AddressError.ValidationError((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) p0).m11659getErrors1X0FAY()));
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
