package com.paypal.oslo.feature.oneonboarding.inventory.views.address.data.repository;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ:\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001c0\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0018\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010 J\u001f\u0010#\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001aH\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u0004\u0018\u00010\u000b*\u00020\tH\u0002¢\u0006\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010'R\u0014\u0010#\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/data/repository/AddressRepositoryImpl;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/repository/AddressRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/error/ErrorMapper;", "errorMapper", "<init>", "(Ldagger/Lazy;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/error/ErrorMapper;)V", "", "query", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "countryCode", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressMatchingScope;", "addressMatchingScope", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/error/ApiCallError;", "", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressSuggestion;", "requestAddressSuggestions-AttygxE", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressMatchingScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestAddressSuggestions", "Lcom/paypal/oslo/feature/oneonboarding/graphql/GetAddressSuggestionsQuery$AddressSuggestions;", "p0", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/oneonboarding/graphql/GetAddressSuggestionsQuery$AddressSuggestions;)Ljava/util/List;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressVerificationResult;", "verifyAddress", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/api/graphql/schema/type/MatchingScope;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressMatchingScope;)Lcom/paypal/oslo/api/graphql/schema/type/MatchingScope;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery$AddressVerification;", "p1", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery$AddressVerification;Lcom/paypal/oslo/core/i18n/domain/model/Address;)Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressVerificationResult;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;)Ljava/lang/String;", "Ldagger/Lazy;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/error/ErrorMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressRepositoryImpl implements com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.repository.AddressRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ErrorMapper getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public AddressRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ErrorMapper errorMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMapper, "");
        this.getHighSpeedVideoFpsRangesFor = lazy;
        this.getHighSpeedVideoSizes = errorMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b2 A[Catch: all -> 0x01c9, RaiseCancellationException -> 0x01d2, TryCatch #2 {RaiseCancellationException -> 0x01d2, all -> 0x01c9, blocks: (B:11:0x004f, B:12:0x0136, B:17:0x0140, B:19:0x0150, B:21:0x0156, B:22:0x0192, B:25:0x015b, B:26:0x016a, B:29:0x016f, B:31:0x0188, B:33:0x018e, B:34:0x019d, B:35:0x01ab, B:36:0x01ac, B:37:0x01b1, B:38:0x01b2, B:39:0x01c8, B:43:0x0065), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r4v0, types: [arrow.core.raise.DefaultRaise, int] */
    @Override // com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.repository.AddressRepository
    /* renamed from: requestAddressSuggestions-AttygxE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo16894requestAddressSuggestionsAttygxE(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope addressMatchingScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ApiCallError, ? extends java.util.List<com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSuggestion>>> continuation) {
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.data.repository.AddressRepositoryImpl$requestAddressSuggestions$1 addressRepositoryImpl$requestAddressSuggestions$1;
        ?? r4;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.AddressSuggestions addressSuggestions;
        java.util.List<com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSuggestion> highSpeedVideoFpsRanges;
        try {
            if (continuation instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.address.data.repository.AddressRepositoryImpl$requestAddressSuggestions$1) {
                addressRepositoryImpl$requestAddressSuggestions$1 = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.data.repository.AddressRepositoryImpl$requestAddressSuggestions$1) continuation;
                if ((addressRepositoryImpl$requestAddressSuggestions$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                    addressRepositoryImpl$requestAddressSuggestions$1.getOutputSizes -= 2147483648;
                    java.lang.Object obj = addressRepositoryImpl$requestAddressSuggestions$1.getOutputStallDurationlomOqCM;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r4 = addressRepositoryImpl$requestAddressSuggestions$1.getOutputSizes;
                    if (r4 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        com.paypal.oslo.api.graphql.schema.type.AddressSuggestionInput addressSuggestionInput = new com.paypal.oslo.api.graphql.schema.type.AddressSuggestionInput(com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.AddressInput(com.apollographql.apollo.api.Optional.INSTANCE.present(str), null, null, null, null, null, null, null, str2, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null)), null, null, null, null, com.apollographql.apollo.api.Optional.INSTANCE.present(getHighSpeedVideoFpsRanges(addressMatchingScope)), null, null, null, null, null, 2014, null);
                        com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery getAddressSuggestionsQuery = new com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery(addressSuggestionInput);
                        com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRangesFor.get().query(getAddressSuggestionsQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkFirst);
                        com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.Client(new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("onboarding_address_suggestions", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), null, 2, null);
                        addressRepositoryImpl$requestAddressSuggestions$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        addressRepositoryImpl$requestAddressSuggestions$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        addressRepositoryImpl$requestAddressSuggestions$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addressMatchingScope);
                        addressRepositoryImpl$requestAddressSuggestions$1.getOutputFormats = defaultRaise;
                        addressRepositoryImpl$requestAddressSuggestions$1.getInputSizeshNQ4ISI = defaultRaise2;
                        addressRepositoryImpl$requestAddressSuggestions$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addressSuggestionInput);
                        addressRepositoryImpl$requestAddressSuggestions$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getAddressSuggestionsQuery);
                        addressRepositoryImpl$requestAddressSuggestions$1.getHighSpeedVideoSizes = 0;
                        addressRepositoryImpl$requestAddressSuggestions$1.getHighSpeedVideoFpsRanges = 0;
                        addressRepositoryImpl$requestAddressSuggestions$1.getHighSpeedVideoFpsRangesFor = 0;
                        addressRepositoryImpl$requestAddressSuggestions$1.Camera2StreamConfigurationMap = 0;
                        addressRepositoryImpl$requestAddressSuggestions$1.getOutputSizes = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(apolloCall, callConfig, addressRepositoryImpl$requestAddressSuggestions$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        raise = defaultRaise2;
                    } else {
                        if (r4 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i = addressRepositoryImpl$requestAddressSuggestions$1.Camera2StreamConfigurationMap;
                        int i2 = addressRepositoryImpl$requestAddressSuggestions$1.getHighSpeedVideoFpsRangesFor;
                        int i3 = addressRepositoryImpl$requestAddressSuggestions$1.getHighSpeedVideoFpsRanges;
                        int i4 = addressRepositoryImpl$requestAddressSuggestions$1.getHighSpeedVideoSizes;
                        raise = (arrow.core.raise.Raise) addressRepositoryImpl$requestAddressSuggestions$1.getInputSizeshNQ4ISI;
                        defaultRaise = (arrow.core.raise.DefaultRaise) addressRepositoryImpl$requestAddressSuggestions$1.getOutputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    ior = (arrow.core.Ior) obj;
                    if (!(ior instanceof arrow.core.Ior.Left)) {
                        raise.raise(this.getHighSpeedVideoSizes.mapToApiCallError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    if (ior instanceof arrow.core.Ior.Right) {
                        com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Data data = (com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                        addressSuggestions = data != null ? data.getAddressSuggestions() : null;
                        if (addressSuggestions != null) {
                            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(addressSuggestions);
                        } else {
                            raise.raise(new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ApiCallError.DataNotFound("addressSuggestions: No data returned"));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    } else if (ior instanceof arrow.core.Ior.Both) {
                        com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) ior).getLeftValue();
                        com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Data data2 = (com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue()).getData();
                        addressSuggestions = data2 != null ? data2.getAddressSuggestions() : null;
                        if (addressSuggestions != null) {
                            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(addressSuggestions);
                        } else {
                            raise.raise(this.getHighSpeedVideoSizes.mapToApiCallError(callError));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    defaultRaise.complete();
                    return new arrow.core.Either.Right(highSpeedVideoFpsRanges);
                }
            }
            if (r4 != 0) {
            }
            ior = (arrow.core.Ior) obj;
            if (!(ior instanceof arrow.core.Ior.Left)) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e) {
            r4.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, r4));
        } catch (java.lang.Throwable th) {
            r4.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        addressRepositoryImpl$requestAddressSuggestions$1 = new com.paypal.oslo.feature.oneonboarding.inventory.views.address.data.repository.AddressRepositoryImpl$requestAddressSuggestions$1(this, continuation);
        java.lang.Object obj2 = addressRepositoryImpl$requestAddressSuggestions$1.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = addressRepositoryImpl$requestAddressSuggestions$1.getOutputSizes;
    }

    private final java.util.List<com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSuggestion> getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.AddressSuggestions p0) {
        java.lang.String str;
        java.lang.Object obj;
        java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address> addresses = p0.getAddresses();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(addresses, 10));
        for (com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address address : addresses) {
            java.util.Iterator<E> it = com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressType.getEntries().iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                java.lang.String code = ((com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressType) obj).getCode();
                com.paypal.oslo.api.graphql.schema.type.AddressType addressType = address.getAddressType();
                if (kotlin.jvm.internal.Intrinsics.areEqual(code, addressType != null ? addressType.getRawValue() : null)) {
                    break;
                }
            }
            com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressType addressType2 = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressType) obj;
            if (addressType2 == null) {
                addressType2 = com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressType.UNKNOWN__;
            }
            java.util.List<java.lang.String> formattedAddress = address.getFormattedAddress();
            com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address1 address2 = address.getAddress();
            java.lang.String addressLine1 = address2.getAddressLine1();
            java.lang.String m11273constructorimpl = addressLine1 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine1.m11273constructorimpl(addressLine1) : null;
            java.lang.String addressLine2 = address2.getAddressLine2();
            java.lang.String m11282constructorimpl = addressLine2 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine2.m11282constructorimpl(addressLine2) : null;
            java.lang.String addressLine3 = address2.getAddressLine3();
            java.lang.String m11291constructorimpl = addressLine3 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine3.m11291constructorimpl(addressLine3) : null;
            java.lang.String adminArea1 = address2.getAdminArea1();
            java.lang.String m11300constructorimpl = adminArea1 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea1.m11300constructorimpl(adminArea1) : null;
            java.lang.String adminArea2 = address2.getAdminArea2();
            java.lang.String m11309constructorimpl = adminArea2 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea2.m11309constructorimpl(adminArea2) : null;
            java.lang.String adminArea3 = address2.getAdminArea3();
            java.lang.String m11318constructorimpl = adminArea3 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea3.m11318constructorimpl(adminArea3) : null;
            java.lang.String adminArea4 = address2.getAdminArea4();
            java.lang.String m11327constructorimpl = adminArea4 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea4.m11327constructorimpl(adminArea4) : null;
            java.lang.String postalCode = address2.getPostalCode();
            java.lang.String m11460constructorimpl = postalCode != null ? com.paypal.oslo.core.i18n.domain.model.PostalCode.m11460constructorimpl(postalCode) : null;
            java.lang.Object countryCode = address2.getCountryCode();
            java.lang.String str2 = countryCode instanceof java.lang.String ? (java.lang.String) countryCode : null;
            if (str2 != null) {
                str = getHighResolutionOutputSizeshNQ4ISI(str2);
            }
            arrayList.add(new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSuggestion(addressType2, formattedAddress, new com.paypal.oslo.core.i18n.domain.model.Address(m11273constructorimpl, m11282constructorimpl, m11291constructorimpl, m11327constructorimpl, m11318constructorimpl, m11309constructorimpl, m11300constructorimpl, m11460constructorimpl, str, null, 512, null), address.getOpenLocationCode()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e8 A[Catch: all -> 0x004c, RaiseCancellationException -> 0x004f, TryCatch #2 {RaiseCancellationException -> 0x004f, all -> 0x004c, blocks: (B:11:0x0047, B:12:0x016c, B:17:0x0176, B:19:0x0186, B:21:0x018c, B:22:0x01c8, B:25:0x0191, B:26:0x01a0, B:29:0x01a5, B:31:0x01be, B:33:0x01c4, B:34:0x01d3, B:35:0x01e1, B:36:0x01e2, B:37:0x01e7, B:38:0x01e8, B:39:0x01fe, B:43:0x0063, B:45:0x0070, B:47:0x0078, B:50:0x0085, B:53:0x0092, B:56:0x009f, B:59:0x00ac, B:62:0x00b9, B:65:0x00c6, B:68:0x00d3, B:71:0x00e0, B:75:0x01ff, B:76:0x020e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r4v0, types: [arrow.core.raise.DefaultRaise, int] */
    @Override // com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.repository.AddressRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object verifyAddress(com.paypal.oslo.core.i18n.domain.model.Address address, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ApiCallError, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationResult>> continuation) {
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.data.repository.AddressRepositoryImpl$verifyAddress$1 addressRepositoryImpl$verifyAddress$1;
        ?? r4;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        com.paypal.oslo.core.i18n.domain.model.Address address2;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.AddressVerification addressVerification;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationResult highSpeedVideoSizes;
        try {
            if (continuation instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.address.data.repository.AddressRepositoryImpl$verifyAddress$1) {
                addressRepositoryImpl$verifyAddress$1 = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.data.repository.AddressRepositoryImpl$verifyAddress$1) continuation;
                if ((addressRepositoryImpl$verifyAddress$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    addressRepositoryImpl$verifyAddress$1.getInputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = addressRepositoryImpl$verifyAddress$1.getOutputSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r4 = addressRepositoryImpl$verifyAddress$1.getInputSizeshNQ4ISI;
                    if (r4 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
                        java.lang.String m11255getCountryCodeiSWX8ZM = address.m11255getCountryCodeiSWX8ZM();
                        com.paypal.oslo.core.i18n.domain.model.CountryCode m11363boximpl = m11255getCountryCodeiSWX8ZM != null ? com.paypal.oslo.core.i18n.domain.model.CountryCode.m11363boximpl(m11255getCountryCodeiSWX8ZM) : null;
                        if (m11363boximpl != null) {
                            java.lang.String m11369unboximpl = m11363boximpl.m11369unboximpl();
                            com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
                            java.lang.String m11248getAddressLine1rVKqk9c = address.m11248getAddressLine1rVKqk9c();
                            if (m11248getAddressLine1rVKqk9c == null) {
                                m11248getAddressLine1rVKqk9c = null;
                            }
                            com.apollographql.apollo.api.Optional presentIfNotNull = companion2.presentIfNotNull(m11248getAddressLine1rVKqk9c);
                            com.apollographql.apollo.api.Optional.Companion companion3 = com.apollographql.apollo.api.Optional.INSTANCE;
                            java.lang.String m11249getAddressLine2c7KZG_s = address.m11249getAddressLine2c7KZG_s();
                            if (m11249getAddressLine2c7KZG_s == null) {
                                m11249getAddressLine2c7KZG_s = null;
                            }
                            com.apollographql.apollo.api.Optional presentIfNotNull2 = companion3.presentIfNotNull(m11249getAddressLine2c7KZG_s);
                            com.apollographql.apollo.api.Optional.Companion companion4 = com.apollographql.apollo.api.Optional.INSTANCE;
                            java.lang.String m11250getAddressLine3z9ldjEo = address.m11250getAddressLine3z9ldjEo();
                            if (m11250getAddressLine3z9ldjEo == null) {
                                m11250getAddressLine3z9ldjEo = null;
                            }
                            com.apollographql.apollo.api.Optional presentIfNotNull3 = companion4.presentIfNotNull(m11250getAddressLine3z9ldjEo);
                            com.apollographql.apollo.api.Optional.Companion companion5 = com.apollographql.apollo.api.Optional.INSTANCE;
                            java.lang.String m11251getAdminArea1bsDj6rY = address.m11251getAdminArea1bsDj6rY();
                            if (m11251getAdminArea1bsDj6rY == null) {
                                m11251getAdminArea1bsDj6rY = null;
                            }
                            com.apollographql.apollo.api.Optional presentIfNotNull4 = companion5.presentIfNotNull(m11251getAdminArea1bsDj6rY);
                            com.apollographql.apollo.api.Optional.Companion companion6 = com.apollographql.apollo.api.Optional.INSTANCE;
                            java.lang.String m11252getAdminArea2DR8a_90 = address.m11252getAdminArea2DR8a_90();
                            if (m11252getAdminArea2DR8a_90 == null) {
                                m11252getAdminArea2DR8a_90 = null;
                            }
                            com.apollographql.apollo.api.Optional presentIfNotNull5 = companion6.presentIfNotNull(m11252getAdminArea2DR8a_90);
                            com.apollographql.apollo.api.Optional.Companion companion7 = com.apollographql.apollo.api.Optional.INSTANCE;
                            java.lang.String m11253getAdminArea3W_yfEd8 = address.m11253getAdminArea3W_yfEd8();
                            if (m11253getAdminArea3W_yfEd8 == null) {
                                m11253getAdminArea3W_yfEd8 = null;
                            }
                            com.apollographql.apollo.api.Optional presentIfNotNull6 = companion7.presentIfNotNull(m11253getAdminArea3W_yfEd8);
                            com.apollographql.apollo.api.Optional.Companion companion8 = com.apollographql.apollo.api.Optional.INSTANCE;
                            java.lang.String m11254getAdminArea4GnJiKOo = address.m11254getAdminArea4GnJiKOo();
                            if (m11254getAdminArea4GnJiKOo == null) {
                                m11254getAdminArea4GnJiKOo = null;
                            }
                            com.apollographql.apollo.api.Optional presentIfNotNull7 = companion8.presentIfNotNull(m11254getAdminArea4GnJiKOo);
                            com.apollographql.apollo.api.Optional.Companion companion9 = com.apollographql.apollo.api.Optional.INSTANCE;
                            java.lang.String m11256getPostalCodeyjZ2Xzc = address.m11256getPostalCodeyjZ2Xzc();
                            if (m11256getPostalCodeyjZ2Xzc == null) {
                                m11256getPostalCodeyjZ2Xzc = null;
                            }
                            com.paypal.oslo.api.graphql.schema.type.AddressVerificationInput addressVerificationInput = new com.paypal.oslo.api.graphql.schema.type.AddressVerificationInput(companion.present(new com.paypal.oslo.api.graphql.schema.type.AddressInput(presentIfNotNull, presentIfNotNull2, presentIfNotNull3, presentIfNotNull4, presentIfNotNull5, presentIfNotNull6, presentIfNotNull7, companion9.presentIfNotNull(m11256getPostalCodeyjZ2Xzc), m11369unboximpl)), null, com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.MatchingScope.LOCALITY_LEVEL), null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null);
                            com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery verifyAddressQuery = new com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery(addressVerificationInput);
                            com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRangesFor.get().query(verifyAddressQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                            com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.Client(new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("onboarding_address_verification", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), null, 2, null);
                            addressRepositoryImpl$verifyAddress$1.getHighSpeedVideoFpsRangesFor = address;
                            addressRepositoryImpl$verifyAddress$1.getOutputFormats = defaultRaise;
                            addressRepositoryImpl$verifyAddress$1.getInputFormats = defaultRaise2;
                            addressRepositoryImpl$verifyAddress$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addressVerificationInput);
                            addressRepositoryImpl$verifyAddress$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(verifyAddressQuery);
                            addressRepositoryImpl$verifyAddress$1.getHighSpeedVideoFpsRanges = 0;
                            addressRepositoryImpl$verifyAddress$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            addressRepositoryImpl$verifyAddress$1.getHighSpeedVideoSizes = 0;
                            addressRepositoryImpl$verifyAddress$1.Camera2StreamConfigurationMap = 0;
                            addressRepositoryImpl$verifyAddress$1.getInputSizeshNQ4ISI = 1;
                            obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(apolloCall, callConfig, addressRepositoryImpl$verifyAddress$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            raise = defaultRaise2;
                            address2 = address;
                        } else {
                            defaultRaise2.raise(new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ApiCallError.InvalidData("Address country code is required"));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    } else {
                        if (r4 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i = addressRepositoryImpl$verifyAddress$1.Camera2StreamConfigurationMap;
                        int i2 = addressRepositoryImpl$verifyAddress$1.getHighSpeedVideoSizes;
                        int i3 = addressRepositoryImpl$verifyAddress$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i4 = addressRepositoryImpl$verifyAddress$1.getHighSpeedVideoFpsRanges;
                        raise = (arrow.core.raise.Raise) addressRepositoryImpl$verifyAddress$1.getInputFormats;
                        defaultRaise = (arrow.core.raise.DefaultRaise) addressRepositoryImpl$verifyAddress$1.getOutputFormats;
                        address2 = (com.paypal.oslo.core.i18n.domain.model.Address) addressRepositoryImpl$verifyAddress$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    ior = (arrow.core.Ior) obj;
                    if (!(ior instanceof arrow.core.Ior.Left)) {
                        raise.raise(this.getHighSpeedVideoSizes.mapToApiCallError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    if (ior instanceof arrow.core.Ior.Right) {
                        com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Data data = (com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                        addressVerification = data != null ? data.getAddressVerification() : null;
                        if (addressVerification != null) {
                            highSpeedVideoSizes = getHighSpeedVideoSizes(addressVerification, address2);
                        } else {
                            raise.raise(new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ApiCallError.DataNotFound("addressVerification: No data returned"));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    } else if (ior instanceof arrow.core.Ior.Both) {
                        com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) ior).getLeftValue();
                        com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Data data2 = (com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue()).getData();
                        addressVerification = data2 != null ? data2.getAddressVerification() : null;
                        if (addressVerification != null) {
                            highSpeedVideoSizes = getHighSpeedVideoSizes(addressVerification, address2);
                        } else {
                            raise.raise(this.getHighSpeedVideoSizes.mapToApiCallError(callError));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    defaultRaise.complete();
                    return new arrow.core.Either.Right(highSpeedVideoSizes);
                }
            }
            if (r4 != 0) {
            }
            ior = (arrow.core.Ior) obj;
            if (!(ior instanceof arrow.core.Ior.Left)) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e) {
            r4.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, r4));
        } catch (java.lang.Throwable th) {
            r4.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        addressRepositoryImpl$verifyAddress$1 = new com.paypal.oslo.feature.oneonboarding.inventory.views.address.data.repository.AddressRepositoryImpl$verifyAddress$1(this, continuation);
        java.lang.Object obj2 = addressRepositoryImpl$verifyAddress$1.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = addressRepositoryImpl$verifyAddress$1.getInputSizeshNQ4ISI;
    }

    private static com.paypal.oslo.api.graphql.schema.type.MatchingScope getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope p0) {
        java.lang.Object obj;
        java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.MatchingScope.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.MatchingScope) obj).getRawValue(), p0.getScopeName())) {
                break;
            }
        }
        com.paypal.oslo.api.graphql.schema.type.MatchingScope matchingScope = (com.paypal.oslo.api.graphql.schema.type.MatchingScope) obj;
        return matchingScope == null ? com.paypal.oslo.api.graphql.schema.type.MatchingScope.LOCALITY_LEVEL : matchingScope;
    }

    private static com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationResult getHighSpeedVideoSizes(com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.AddressVerification p0, com.paypal.oslo.core.i18n.domain.model.Address p1) {
        com.paypal.oslo.core.i18n.domain.model.Address address;
        java.lang.Object obj;
        com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address address2 = p0.getAddress();
        java.lang.Object obj2 = null;
        com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address1 address3 = address2 != null ? address2.getAddress() : null;
        if (address3 != null) {
            java.lang.String addressLine1 = address3.getAddressLine1();
            java.lang.String m11273constructorimpl = addressLine1 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine1.m11273constructorimpl(addressLine1) : null;
            java.lang.String addressLine2 = address3.getAddressLine2();
            java.lang.String m11282constructorimpl = addressLine2 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine2.m11282constructorimpl(addressLine2) : null;
            java.lang.String addressLine3 = address3.getAddressLine3();
            java.lang.String m11291constructorimpl = addressLine3 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine3.m11291constructorimpl(addressLine3) : null;
            java.lang.String adminArea1 = address3.getAdminArea1();
            java.lang.String m11300constructorimpl = adminArea1 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea1.m11300constructorimpl(adminArea1) : null;
            java.lang.String adminArea2 = address3.getAdminArea2();
            java.lang.String m11309constructorimpl = adminArea2 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea2.m11309constructorimpl(adminArea2) : null;
            java.lang.String adminArea3 = address3.getAdminArea3();
            java.lang.String m11318constructorimpl = adminArea3 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea3.m11318constructorimpl(adminArea3) : null;
            java.lang.String adminArea4 = address3.getAdminArea4();
            java.lang.String m11327constructorimpl = adminArea4 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea4.m11327constructorimpl(adminArea4) : null;
            java.lang.String postalCode = address3.getPostalCode();
            java.lang.String m11460constructorimpl = postalCode != null ? com.paypal.oslo.core.i18n.domain.model.PostalCode.m11460constructorimpl(postalCode) : null;
            java.lang.Object countryCode = address3.getCountryCode();
            java.lang.String str = countryCode instanceof java.lang.String ? (java.lang.String) countryCode : null;
            address = new com.paypal.oslo.core.i18n.domain.model.Address(m11273constructorimpl, m11282constructorimpl, m11291constructorimpl, m11327constructorimpl, m11318constructorimpl, m11309constructorimpl, m11300constructorimpl, m11460constructorimpl, str != null ? getHighResolutionOutputSizeshNQ4ISI(str) : null, null, 512, null);
        } else {
            address = null;
        }
        java.util.Iterator<E> it = com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            java.lang.String status = ((com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus) obj).getStatus();
            com.paypal.oslo.api.graphql.schema.type.AddressVerifyStatus status2 = p0.getStatus();
            if (kotlin.jvm.internal.Intrinsics.areEqual(status, status2 != null ? status2.getRawValue() : null)) {
                break;
            }
        }
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus addressVerificationStatus = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus) obj;
        if (addressVerificationStatus == null) {
            addressVerificationStatus = com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus.UNKNOWN__;
        }
        java.util.Iterator<E> it2 = com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressType.getEntries().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next = it2.next();
            java.lang.String code = ((com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressType) next).getCode();
            com.paypal.oslo.api.graphql.schema.type.AddressType addressType = p0.getAddressType();
            if (kotlin.jvm.internal.Intrinsics.areEqual(code, addressType != null ? addressType.getRawValue() : null)) {
                obj2 = next;
                break;
            }
        }
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressType addressType2 = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressType) obj2;
        if (addressType2 == null) {
            addressType2 = com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressType.UNKNOWN__;
        }
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationResult(addressVerificationStatus, addressType2, address, p1);
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        java.lang.Object m23436constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.String upperCase = kotlin.text.StringsKt.trim(str).toString().toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.paypal.oslo.core.i18n.domain.model.CountryCode.m11363boximpl(com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl(upperCase)));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        com.paypal.oslo.core.i18n.domain.model.CountryCode countryCode = (com.paypal.oslo.core.i18n.domain.model.CountryCode) m23436constructorimpl;
        if (countryCode != null) {
            return countryCode.m11369unboximpl();
        }
        return null;
    }
}
