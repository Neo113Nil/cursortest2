package com.paypal.oslo.feature.onboarding.signup.address.data.service;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\f2\u0006\u0010\u0012\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\f2\u0006\u0010\u0017\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u0018\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/address/data/service/AddressServiceImpl;", "Lcom/paypal/oslo/feature/onboarding/signup/address/domain/service/AddressService;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/mapper/ErrorMapper;", "errorMapper", "<init>", "(Ldagger/Lazy;Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/mapper/ErrorMapper;)V", "", "query", "countryCode", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "", "Lcom/paypal/oslo/feature/onboarding/signup/address/domain/model/AddressSuggestion;", "requestAddressSuggestions", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "placeId", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "requestAddressDetails", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceSuggestionsQuery$PlaceSuggestion;", "p0", "getHighSpeedVideoFpsRangesFor", "(Ljava/util/List;)Ljava/util/List;", "Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceQuery$Place;", "(Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceQuery$Place;)Larrow/core/Either;", "getHighSpeedVideoFpsRanges", "Ldagger/Lazy;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/mapper/ErrorMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressServiceImpl implements com.paypal.oslo.feature.onboarding.signup.address.domain.service.AddressService {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public AddressServiceImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper errorMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMapper, "");
        this.getHighSpeedVideoSizes = lazy;
        this.getHighSpeedVideoFpsRangesFor = errorMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0141 A[Catch: all -> 0x0158, RaiseCancellationException -> 0x0161, TryCatch #2 {RaiseCancellationException -> 0x0161, all -> 0x0158, blocks: (B:11:0x004b, B:12:0x00c5, B:17:0x00cf, B:19:0x00df, B:21:0x00e5, B:22:0x0121, B:25:0x00ea, B:26:0x00f9, B:29:0x00fe, B:31:0x0117, B:33:0x011d, B:34:0x012c, B:35:0x013a, B:36:0x013b, B:37:0x0140, B:38:0x0141, B:39:0x0157, B:43:0x0060), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r4v0, types: [arrow.core.raise.DefaultRaise, int] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // com.paypal.oslo.feature.onboarding.signup.address.domain.service.AddressService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object requestAddressSuggestions(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, ? extends java.util.List<com.paypal.oslo.feature.onboarding.signup.address.domain.model.AddressSuggestion>>> continuation) {
        com.paypal.oslo.feature.onboarding.signup.address.data.service.AddressServiceImpl$requestAddressSuggestions$1 addressServiceImpl$requestAddressSuggestions$1;
        ?? r4;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.Ior ior;
        java.util.List<com.paypal.oslo.feature.onboarding.signup.address.domain.model.AddressSuggestion> highSpeedVideoFpsRangesFor;
        try {
            if (continuation instanceof com.paypal.oslo.feature.onboarding.signup.address.data.service.AddressServiceImpl$requestAddressSuggestions$1) {
                addressServiceImpl$requestAddressSuggestions$1 = (com.paypal.oslo.feature.onboarding.signup.address.data.service.AddressServiceImpl$requestAddressSuggestions$1) continuation;
                if ((addressServiceImpl$requestAddressSuggestions$1.getOutputMinFrameDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                    addressServiceImpl$requestAddressSuggestions$1.getOutputMinFrameDurationlomOqCM -= 2147483648;
                    java.lang.Object obj = addressServiceImpl$requestAddressSuggestions$1.getOutputSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r4 = addressServiceImpl$requestAddressSuggestions$1.getOutputMinFrameDurationlomOqCM;
                    if (r4 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        com.paypal.oslo.api.graphql.schema.type.PlaceSuggestionsInput placeSuggestionsInput = new com.paypal.oslo.api.graphql.schema.type.PlaceSuggestionsInput(str, str2);
                        com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery getPlaceSuggestionsQuery = new com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery(placeSuggestionsInput);
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes.get();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                        com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.Client(new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("onboarding_address_suggestions", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), r6, 2, r6);
                        addressServiceImpl$requestAddressSuggestions$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        addressServiceImpl$requestAddressSuggestions$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        addressServiceImpl$requestAddressSuggestions$1.getInputSizeshNQ4ISI = defaultRaise;
                        addressServiceImpl$requestAddressSuggestions$1.getOutputMinFrameDuration = defaultRaise2;
                        addressServiceImpl$requestAddressSuggestions$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(placeSuggestionsInput);
                        addressServiceImpl$requestAddressSuggestions$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getPlaceSuggestionsQuery);
                        addressServiceImpl$requestAddressSuggestions$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        addressServiceImpl$requestAddressSuggestions$1.getHighSpeedVideoSizes = 0;
                        addressServiceImpl$requestAddressSuggestions$1.Camera2StreamConfigurationMap = 0;
                        addressServiceImpl$requestAddressSuggestions$1.getHighSpeedVideoFpsRangesFor = 0;
                        addressServiceImpl$requestAddressSuggestions$1.getOutputMinFrameDurationlomOqCM = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(apolloClient, getPlaceSuggestionsQuery, callConfig, addressServiceImpl$requestAddressSuggestions$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        raise = defaultRaise2;
                    } else {
                        if (r4 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i = addressServiceImpl$requestAddressSuggestions$1.getHighSpeedVideoFpsRangesFor;
                        int i2 = addressServiceImpl$requestAddressSuggestions$1.Camera2StreamConfigurationMap;
                        int i3 = addressServiceImpl$requestAddressSuggestions$1.getHighSpeedVideoSizes;
                        int i4 = addressServiceImpl$requestAddressSuggestions$1.getHighResolutionOutputSizeshNQ4ISI;
                        raise = (arrow.core.raise.Raise) addressServiceImpl$requestAddressSuggestions$1.getOutputMinFrameDuration;
                        defaultRaise = (arrow.core.raise.DefaultRaise) addressServiceImpl$requestAddressSuggestions$1.getInputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    ior = (arrow.core.Ior) obj;
                    if (!(ior instanceof arrow.core.Ior.Left)) {
                        raise.raise(this.getHighSpeedVideoFpsRangesFor.mapToApiCallError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    if (ior instanceof arrow.core.Ior.Right) {
                        com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.Data data = (com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                        java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.PlaceSuggestion> placeSuggestions = data != null ? data.getPlaceSuggestions() : null;
                        if (placeSuggestions == null) {
                            raise.raise(new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.DataNotFound("placeSuggestions: No data returned"));
                            throw new kotlin.KotlinNothingValueException();
                        }
                        highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(placeSuggestions);
                    } else if (ior instanceof arrow.core.Ior.Both) {
                        com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) ior).getLeftValue();
                        com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.Data data2 = (com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue()).getData();
                        r6 = data2 != null ? data2.getPlaceSuggestions() : 0;
                        if (r6 == 0) {
                            raise.raise(this.getHighSpeedVideoFpsRangesFor.mapToApiCallError(callError));
                            throw new kotlin.KotlinNothingValueException();
                        }
                        highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.PlaceSuggestion>) r6);
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    defaultRaise.complete();
                    return new arrow.core.Either.Right(highSpeedVideoFpsRangesFor);
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
        addressServiceImpl$requestAddressSuggestions$1 = new com.paypal.oslo.feature.onboarding.signup.address.data.service.AddressServiceImpl$requestAddressSuggestions$1(this, continuation);
        java.lang.Object obj2 = addressServiceImpl$requestAddressSuggestions$1.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = addressServiceImpl$requestAddressSuggestions$1.getOutputMinFrameDurationlomOqCM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0131 A[Catch: all -> 0x0148, RaiseCancellationException -> 0x0151, TryCatch #2 {RaiseCancellationException -> 0x0151, all -> 0x0148, blocks: (B:11:0x0043, B:12:0x00a9, B:17:0x00b3, B:19:0x00c3, B:21:0x00c9, B:22:0x0111, B:25:0x00d4, B:26:0x00e3, B:29:0x00e8, B:31:0x0101, B:33:0x0107, B:34:0x011c, B:35:0x012a, B:36:0x012b, B:37:0x0130, B:38:0x0131, B:39:0x0147, B:43:0x0058), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r4v0, types: [arrow.core.raise.DefaultRaise, int] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // com.paypal.oslo.feature.onboarding.signup.address.domain.service.AddressService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object requestAddressDetails(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, com.paypal.oslo.core.i18n.domain.model.Address>> continuation) {
        com.paypal.oslo.feature.onboarding.signup.address.data.service.AddressServiceImpl$requestAddressDetails$1 addressServiceImpl$requestAddressDetails$1;
        ?? r4;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.Ior ior;
        com.paypal.oslo.core.i18n.domain.model.Address address;
        try {
            if (continuation instanceof com.paypal.oslo.feature.onboarding.signup.address.data.service.AddressServiceImpl$requestAddressDetails$1) {
                addressServiceImpl$requestAddressDetails$1 = (com.paypal.oslo.feature.onboarding.signup.address.data.service.AddressServiceImpl$requestAddressDetails$1) continuation;
                if ((addressServiceImpl$requestAddressDetails$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                    addressServiceImpl$requestAddressDetails$1.getOutputFormats -= 2147483648;
                    java.lang.Object obj = addressServiceImpl$requestAddressDetails$1.getInputFormats;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r4 = addressServiceImpl$requestAddressDetails$1.getOutputFormats;
                    if (r4 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery getPlaceQuery = new com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery(str);
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes.get();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                        com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.Client(new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("onboarding_address_details", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), r6, 2, r6);
                        addressServiceImpl$requestAddressDetails$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        addressServiceImpl$requestAddressDetails$1.getInputSizeshNQ4ISI = defaultRaise;
                        addressServiceImpl$requestAddressDetails$1.getHighSpeedVideoSizesFor = defaultRaise2;
                        addressServiceImpl$requestAddressDetails$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getPlaceQuery);
                        addressServiceImpl$requestAddressDetails$1.Camera2StreamConfigurationMap = 0;
                        addressServiceImpl$requestAddressDetails$1.getHighSpeedVideoSizes = 0;
                        addressServiceImpl$requestAddressDetails$1.getHighSpeedVideoFpsRangesFor = 0;
                        addressServiceImpl$requestAddressDetails$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        addressServiceImpl$requestAddressDetails$1.getOutputFormats = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(apolloClient, getPlaceQuery, callConfig, addressServiceImpl$requestAddressDetails$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        raise = defaultRaise2;
                    } else {
                        if (r4 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i = addressServiceImpl$requestAddressDetails$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i2 = addressServiceImpl$requestAddressDetails$1.getHighSpeedVideoFpsRangesFor;
                        int i3 = addressServiceImpl$requestAddressDetails$1.getHighSpeedVideoSizes;
                        int i4 = addressServiceImpl$requestAddressDetails$1.Camera2StreamConfigurationMap;
                        raise = (arrow.core.raise.Raise) addressServiceImpl$requestAddressDetails$1.getHighSpeedVideoSizesFor;
                        defaultRaise = (arrow.core.raise.DefaultRaise) addressServiceImpl$requestAddressDetails$1.getInputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    ior = (arrow.core.Ior) obj;
                    if (!(ior instanceof arrow.core.Ior.Left)) {
                        raise.raise(this.getHighSpeedVideoFpsRangesFor.mapToApiCallError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    if (ior instanceof arrow.core.Ior.Right) {
                        com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Data data = (com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                        com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Place place = data != null ? data.getPlace() : null;
                        if (place == null) {
                            raise.raise(new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.DataNotFound("place: No data returned"));
                            throw new kotlin.KotlinNothingValueException();
                        }
                        address = (com.paypal.oslo.core.i18n.domain.model.Address) raise.bind(getHighSpeedVideoFpsRangesFor(place));
                    } else if (ior instanceof arrow.core.Ior.Both) {
                        com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) ior).getLeftValue();
                        com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Data data2 = (com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue()).getData();
                        r6 = data2 != null ? data2.getPlace() : 0;
                        if (r6 == 0) {
                            raise.raise(this.getHighSpeedVideoFpsRangesFor.mapToApiCallError(callError));
                            throw new kotlin.KotlinNothingValueException();
                        }
                        address = (com.paypal.oslo.core.i18n.domain.model.Address) raise.bind(getHighSpeedVideoFpsRangesFor(r6));
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    defaultRaise.complete();
                    return new arrow.core.Either.Right(address);
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
        addressServiceImpl$requestAddressDetails$1 = new com.paypal.oslo.feature.onboarding.signup.address.data.service.AddressServiceImpl$requestAddressDetails$1(this, continuation);
        java.lang.Object obj2 = addressServiceImpl$requestAddressDetails$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = addressServiceImpl$requestAddressDetails$1.getOutputFormats;
    }

    private static java.util.List<com.paypal.oslo.feature.onboarding.signup.address.domain.model.AddressSuggestion> getHighSpeedVideoFpsRangesFor(java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.PlaceSuggestion> p0) {
        java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.PlaceSuggestion> list = p0;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.PlaceSuggestion placeSuggestion : list) {
            arrayList.add(new com.paypal.oslo.feature.onboarding.signup.address.domain.model.AddressSuggestion(com.paypal.oslo.feature.onboarding.signup.address.domain.model.PlaceId.m16206constructorimpl(placeSuggestion.getPlaceId()), placeSuggestion.getMainText(), placeSuggestion.getSecondaryText(), placeSuggestion.getCompleteText(), null));
        }
        return arrayList;
    }

    private static arrow.core.Either<com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, com.paypal.oslo.core.i18n.domain.model.Address> getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Place p0) {
        java.lang.Object m23436constructorimpl;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            com.paypal.oslo.feature.onboarding.graphql.GetPlaceQuery.Address address = p0.getAddress();
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.paypal.oslo.core.i18n.domain.model.CountryCode.m11363boximpl(com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl(address.getCountryCode().toString())));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
            if (m23439exceptionOrNullimpl != null) {
                java.lang.String message = m23439exceptionOrNullimpl.getMessage();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid country code from suggested address: ");
                sb.append(message);
                defaultRaise2.raise(new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.InvalidData(sb.toString()));
                throw new kotlin.KotlinNothingValueException();
            }
            java.lang.String m11369unboximpl = ((com.paypal.oslo.core.i18n.domain.model.CountryCode) m23436constructorimpl).m11369unboximpl();
            java.lang.String addressLine1 = address.getAddressLine1();
            java.lang.String m11273constructorimpl = addressLine1 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine1.m11273constructorimpl(addressLine1) : null;
            java.lang.String addressLine2 = address.getAddressLine2();
            java.lang.String m11282constructorimpl = addressLine2 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine2.m11282constructorimpl(addressLine2) : null;
            java.lang.String addressLine3 = address.getAddressLine3();
            java.lang.String m11291constructorimpl = addressLine3 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine3.m11291constructorimpl(addressLine3) : null;
            java.lang.String adminArea1 = address.getAdminArea1();
            java.lang.String m11300constructorimpl = adminArea1 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea1.m11300constructorimpl(adminArea1) : null;
            java.lang.String adminArea2 = address.getAdminArea2();
            java.lang.String m11309constructorimpl = adminArea2 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea2.m11309constructorimpl(adminArea2) : null;
            java.lang.String adminArea3 = address.getAdminArea3();
            java.lang.String m11318constructorimpl = adminArea3 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea3.m11318constructorimpl(adminArea3) : null;
            java.lang.String adminArea4 = address.getAdminArea4();
            java.lang.String m11327constructorimpl = adminArea4 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea4.m11327constructorimpl(adminArea4) : null;
            java.lang.String postalCode = address.getPostalCode();
            com.paypal.oslo.core.i18n.domain.model.Address address2 = new com.paypal.oslo.core.i18n.domain.model.Address(m11273constructorimpl, m11282constructorimpl, m11291constructorimpl, m11327constructorimpl, m11318constructorimpl, m11309constructorimpl, m11300constructorimpl, postalCode != null ? com.paypal.oslo.core.i18n.domain.model.PostalCode.m11460constructorimpl(postalCode) : null, m11369unboximpl, (com.paypal.oslo.core.i18n.domain.model.Address.Detail) null, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            defaultRaise.complete();
            return new arrow.core.Either.Right(address2);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th2) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th2);
        }
    }
}
