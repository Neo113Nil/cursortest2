package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AutodetectCardBrandEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.AutodetectCardRepositoryImpl$autodetectCard$2", f = "AutodetectCardRepositoryImpl.kt", i = {0, 0}, l = {63}, m = "invokeSuspend", n = {com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "input"}, nl = {65}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes13.dex */
final class AutodetectCardRepositoryImpl$autodetectCard$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.AutodetectCardBrandEntity>>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.AutodetectCardRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider;
        com.apollographql.apollo.ApolloClient apolloClient;
        com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper callErrorMapper;
        com.paypal.oslo.feature.inappcheckout.data.mapper.AutodetectCardsEntityMapper autodetectCardsEntityMapper;
        com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper callErrorMapper2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            localeProvider = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String component1 = com.paypal.oslo.feature.inappcheckout.extensions.InAppCheckoutExtensionsKt.getCountryAndLanguage(localeProvider).component1();
            com.paypal.oslo.feature.inappcheckout.graphql.cards.type.AutodetectCardInput autodetectCardInput = new com.paypal.oslo.feature.inappcheckout.graphql.cards.type.AutodetectCardInput(this.getHighSpeedVideoFpsRangesFor, component1);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Initiating autodetectCards query", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("userCountryCode", component1)), null, 4, null);
            apolloClient = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(component1);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autodetectCardInput);
            this.getHighSpeedVideoFpsRanges = 1;
            obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient.query(new com.paypal.oslo.feature.inappcheckout.graphql.cards.AutodetectCardQuery(autodetectCardInput)), null, this, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.feature.inappcheckout.data.repository.AutodetectCardRepositoryImpl autodetectCardRepositoryImpl = this.getHighSpeedVideoSizes;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
            callErrorMapper2 = autodetectCardRepositoryImpl.Camera2StreamConfigurationMap;
            return arrow.core.EitherKt.left(callErrorMapper2.map(callError, "AUTODETECT_CARDS"));
        }
        if (ior instanceof arrow.core.Ior.Right) {
            com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
            arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
            try {
                arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                java.lang.Object data = graphQLData.getData();
                if (data != null) {
                    java.lang.Object firstOrNull = kotlin.collections.CollectionsKt.firstOrNull((java.util.List<? extends java.lang.Object>) ((com.paypal.oslo.feature.inappcheckout.graphql.cards.AutodetectCardQuery.Data) data).getAutodetectCards());
                    if (firstOrNull != null) {
                        com.paypal.oslo.feature.inappcheckout.data.dto.AutodetectCardBrandDTO access$mapToAutodetectCardBrandDTO = com.paypal.oslo.feature.inappcheckout.data.repository.AutodetectCardRepositoryImpl.access$mapToAutodetectCardBrandDTO(autodetectCardRepositoryImpl, (com.paypal.oslo.feature.inappcheckout.graphql.cards.AutodetectCardQuery.AutodetectCard) firstOrNull);
                        autodetectCardsEntityMapper = autodetectCardRepositoryImpl.getHighSpeedVideoFpsRangesFor;
                        com.paypal.oslo.feature.inappcheckout.domain.entity.AutodetectCardBrandEntity domain = autodetectCardsEntityMapper.toDomain(access$mapToAutodetectCardBrandDTO);
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Successfully fetched autodetect card brand", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("brand", domain.getBrand())), null, 4, null);
                        defaultRaise.complete();
                        return new arrow.core.Either.Right(domain);
                    }
                    defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("EMPTY_RESPONSE", "No card definitions returned", false, null, null, 24, null));
                    throw new kotlin.KotlinNothingValueException();
                }
                defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("EMPTY_RESPONSE", com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError.NULL_RESPONSE_DATA, false, null, null, 24, null));
                throw new kotlin.KotlinNothingValueException();
            } catch (arrow.core.raise.RaiseCancellationException e) {
                defaultRaise.complete();
                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
            } catch (java.lang.Throwable th) {
                defaultRaise.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
            }
        }
        if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object leftValue = both.getLeftValue();
            callErrorMapper = autodetectCardRepositoryImpl.Camera2StreamConfigurationMap;
            return arrow.core.EitherKt.left(callErrorMapper.map((com.paypal.oslo.core.network.graphql.error.CallError) leftValue, "AUTODETECT_CARDS"));
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.AutodetectCardBrandEntity>> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.data.repository.AutodetectCardRepositoryImpl$autodetectCard$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.AutodetectCardRepositoryImpl$autodetectCard$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutodetectCardRepositoryImpl$autodetectCard$2(com.paypal.oslo.feature.inappcheckout.data.repository.AutodetectCardRepositoryImpl autodetectCardRepositoryImpl, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.AutodetectCardRepositoryImpl$autodetectCard$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = autodetectCardRepositoryImpl;
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
