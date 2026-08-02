package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/GetRedeemConversionRateUseCase;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCase;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/GetRedeemConversionRateUseCase$Request;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/GetRedeemConversionRateUseCase$Response;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/repository/RedeemConversionRateRepository;", "redeemConversionRateRepository", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/repository/RedeemConversionRateRepository;)V", "request", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/GetRedeemConversionRateUseCase$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/repository/RedeemConversionRateRepository;", "Request", "Response"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetRedeemConversionRateUseCase implements com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Request, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Response> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemConversionRateRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetRedeemConversionRateUseCase(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemConversionRateRepository redeemConversionRateRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemConversionRateRepository, "");
        this.getHighSpeedVideoFpsRangesFor = redeemConversionRateRepository;
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Request request, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<? extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Response>> continuation) {
        return invoke2(request, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Response>>) continuation);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Response> onDataResultError(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError dataResultError) {
        return super.onDataResultError(dataResultError);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Response> onResponseData(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T> dataResult, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Response> function1) {
        return super.onResponseData(dataResult, function1);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Response> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T>> ior, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Response> function1) {
        return super.toUseCaseResult(ior, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Request request, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Response>> continuation) {
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase$invoke$1 getRedeemConversionRateUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.RedemptionType redemptionType;
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase getRedeemConversionRateUseCase;
        if (continuation instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase$invoke$1) {
            getRedeemConversionRateUseCase$invoke$1 = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase$invoke$1) continuation;
            if ((getRedeemConversionRateUseCase$invoke$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                getRedeemConversionRateUseCase$invoke$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = getRedeemConversionRateUseCase$invoke$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getRedeemConversionRateUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    int i2 = com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.WhenMappings.$EnumSwitchMapping$0[request.getRedeemType().ordinal()];
                    if (i2 == 1) {
                        redemptionType = com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.RedemptionType.CHARITY;
                    } else {
                        if (i2 != 2 && i2 != 3) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        redemptionType = null;
                    }
                    com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemConversionRateRepository redeemConversionRateRepository = this.getHighSpeedVideoFpsRangesFor;
                    getRedeemConversionRateUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(request);
                    getRedeemConversionRateUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(redemptionType);
                    getRedeemConversionRateUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = this;
                    getRedeemConversionRateUseCase$invoke$1.getHighSpeedVideoFpsRanges = 1;
                    obj = redeemConversionRateRepository.getConversionRate(redemptionType, getRedeemConversionRateUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    getRedeemConversionRateUseCase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    getRedeemConversionRateUseCase = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase) getRedeemConversionRateUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return getRedeemConversionRateUseCase.toUseCaseResult((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.$r8$lambda$KPMwp7xBv4xDbEim1czD6yCNMSM((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.ConversionRateResult) obj2);
                    }
                });
            }
        }
        getRedeemConversionRateUseCase$invoke$1 = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getRedeemConversionRateUseCase$invoke$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getRedeemConversionRateUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return getRedeemConversionRateUseCase.toUseCaseResult((arrow.core.Ior) obj2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.$r8$lambda$KPMwp7xBv4xDbEim1czD6yCNMSM((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.ConversionRateResult) obj22);
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/GetRedeemConversionRateUseCase$Request;", "", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "redeemType", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/GetRedeemConversionRateUseCase$Request;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "getRedeemType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Request {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType;

        public Request(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            this.redeemType = redeemType;
        }

        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType getRedeemType() {
            return this.redeemType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType = this.redeemType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Request(redeemType=");
            sb.append(redeemType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.redeemType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Request) && this.redeemType == ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Request) other).redeemType;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Request copy(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Request(redeemType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType getRedeemType() {
            return this.redeemType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Request copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Request request, com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                redeemType = request.redeemType;
            }
            return request.copy(redeemType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0013J\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b!\u0010\u000fR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/GetRedeemConversionRateUseCase$Response;", "", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONVERSION_RATE, "", "exchangeRatePoints", "exchangeRateAmount", "currencyCode", "", "pointsAvailable", "<init>", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "component1", "()D", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()I", "copy", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/GetRedeemConversionRateUseCase$Response;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "D", "getConversionRate", "Ljava/lang/String;", "getExchangeRatePoints", "getExchangeRateAmount", "getCurrencyCode", com.visa.cbp.getEncExpo.warmup, "getPointsAvailable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Response {
        public static final int $stable = 0;
        private final double conversionRate;
        private final java.lang.String currencyCode;
        private final java.lang.String exchangeRateAmount;
        private final java.lang.String exchangeRatePoints;
        private final int pointsAvailable;

        public Response(double d, java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.conversionRate = d;
            this.exchangeRatePoints = str;
            this.exchangeRateAmount = str2;
            this.currencyCode = str3;
            this.pointsAvailable = i;
        }

        public final double getConversionRate() {
            return this.conversionRate;
        }

        public final java.lang.String getExchangeRatePoints() {
            return this.exchangeRatePoints;
        }

        public final java.lang.String getExchangeRateAmount() {
            return this.exchangeRateAmount;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final int getPointsAvailable() {
            return this.pointsAvailable;
        }

        public final java.lang.String toString() {
            double d = this.conversionRate;
            java.lang.String str = this.exchangeRatePoints;
            java.lang.String str2 = this.exchangeRateAmount;
            java.lang.String str3 = this.currencyCode;
            int i = this.pointsAvailable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Response(conversionRate=");
            sb.append(d);
            sb.append(", exchangeRatePoints=");
            sb.append(str);
            sb.append(", exchangeRateAmount=");
            sb.append(str2);
            sb.append(", currencyCode=");
            sb.append(str3);
            sb.append(", pointsAvailable=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((java.lang.Double.hashCode(this.conversionRate) * 31) + this.exchangeRatePoints.hashCode()) * 31) + this.exchangeRateAmount.hashCode()) * 31) + this.currencyCode.hashCode()) * 31) + java.lang.Integer.hashCode(this.pointsAvailable);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Response)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Response response = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Response) other;
            return java.lang.Double.compare(this.conversionRate, response.conversionRate) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRatePoints, response.exchangeRatePoints) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRateAmount, response.exchangeRateAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, response.currencyCode) && this.pointsAvailable == response.pointsAvailable;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Response copy(double conversionRate, java.lang.String exchangeRatePoints, java.lang.String exchangeRateAmount, java.lang.String currencyCode, int pointsAvailable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRatePoints, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRateAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Response(conversionRate, exchangeRatePoints, exchangeRateAmount, currencyCode, pointsAvailable);
        }

        /* renamed from: component5, reason: from getter */
        public final int getPointsAvailable() {
            return this.pointsAvailable;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getExchangeRateAmount() {
            return this.exchangeRateAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getExchangeRatePoints() {
            return this.exchangeRatePoints;
        }

        /* renamed from: component1, reason: from getter */
        public final double getConversionRate() {
            return this.conversionRate;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Response copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Response response, double d, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                d = response.conversionRate;
            }
            double d2 = d;
            if ((i2 & 2) != 0) {
                str = response.exchangeRatePoints;
            }
            java.lang.String str4 = str;
            if ((i2 & 4) != 0) {
                str2 = response.exchangeRateAmount;
            }
            java.lang.String str5 = str2;
            if ((i2 & 8) != 0) {
                str3 = response.currencyCode;
            }
            java.lang.String str6 = str3;
            if ((i2 & 16) != 0) {
                i = response.pointsAvailable;
            }
            return response.copy(d2, str4, str5, str6, i);
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Response $r8$lambda$KPMwp7xBv4xDbEim1czD6yCNMSM(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.ConversionRateResult conversionRateResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversionRateResult, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Response(conversionRateResult.getConversionRate(), conversionRateResult.getExchangeRatePoints(), conversionRateResult.getExchangeRateAmount(), conversionRateResult.getCurrencyCode(), conversionRateResult.getPointsAvailable());
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.values().length];
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.DONATION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.BALANCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.SAVINGS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
