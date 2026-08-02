package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000f\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/RedeemPointsToBalanceUseCase;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCase;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/RedeemPointsToBalanceUseCase$Request;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/RedeemPointsToBalanceUseCase$Response;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/repository/RedeemPointsToBalanceRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/repository/RedeemPointsToBalanceRepository;)V", "request", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/RedeemPointsToBalanceUseCase$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/repository/RedeemPointsToBalanceRepository;", "getHighSpeedVideoFpsRanges", "Request", "Response"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RedeemPointsToBalanceUseCase implements com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Request, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Response> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsToBalanceRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public RedeemPointsToBalanceUseCase(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsToBalanceRepository redeemPointsToBalanceRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemPointsToBalanceRepository, "");
        this.getHighSpeedVideoFpsRanges = redeemPointsToBalanceRepository;
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Request request, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<? extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Response>> continuation) {
        return invoke2(request, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Response>>) continuation);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Response> onDataResultError(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError dataResultError) {
        return super.onDataResultError(dataResultError);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Response> onResponseData(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T> dataResult, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Response> function1) {
        return super.onResponseData(dataResult, function1);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Response> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T>> ior, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Response> function1) {
        return super.toUseCaseResult(ior, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Request request, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Response>> continuation) {
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase$invoke$1 redeemPointsToBalanceUseCase$invoke$1;
        int i;
        final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Request request2;
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase redeemPointsToBalanceUseCase;
        if (continuation instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase$invoke$1) {
            redeemPointsToBalanceUseCase$invoke$1 = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase$invoke$1) continuation;
            if ((redeemPointsToBalanceUseCase$invoke$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                redeemPointsToBalanceUseCase$invoke$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = redeemPointsToBalanceUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = redeemPointsToBalanceUseCase$invoke$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsToBalanceRepository redeemPointsToBalanceRepository = this.getHighSpeedVideoFpsRanges;
                    int points = request.getPoints();
                    redeemPointsToBalanceUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = request;
                    redeemPointsToBalanceUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = this;
                    redeemPointsToBalanceUseCase$invoke$1.Camera2StreamConfigurationMap = 1;
                    obj = redeemPointsToBalanceRepository.redeemPointsToBalance(java.lang.String.valueOf(points), redeemPointsToBalanceUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    request2 = request;
                    redeemPointsToBalanceUseCase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    redeemPointsToBalanceUseCase = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase) redeemPointsToBalanceUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    request2 = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Request) redeemPointsToBalanceUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return redeemPointsToBalanceUseCase.toUseCaseResult((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.$r8$lambda$1wLM9vVQux23BX5P7Vs4HaNQwwI(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Request.this, (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsResponse) obj2);
                    }
                });
            }
        }
        redeemPointsToBalanceUseCase$invoke$1 = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = redeemPointsToBalanceUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = redeemPointsToBalanceUseCase$invoke$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return redeemPointsToBalanceUseCase.toUseCaseResult((arrow.core.Ior) obj2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.$r8$lambda$1wLM9vVQux23BX5P7Vs4HaNQwwI(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Request.this, (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsResponse) obj22);
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/RedeemPointsToBalanceUseCase$Request;", "", "", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "", "usdAmount", "<init>", "(ID)V", "component1", "()I", "component2", "()D", "copy", "(ID)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/RedeemPointsToBalanceUseCase$Request;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getPoints", "D", "getUsdAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Request {
        public static final int $stable = 0;
        private final int points;
        private final double usdAmount;

        public Request(int i, double d) {
            this.points = i;
            this.usdAmount = d;
        }

        public final int getPoints() {
            return this.points;
        }

        public final double getUsdAmount() {
            return this.usdAmount;
        }

        public final java.lang.String toString() {
            int i = this.points;
            double d = this.usdAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Request(points=");
            sb.append(i);
            sb.append(", usdAmount=");
            sb.append(d);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.points) * 31) + java.lang.Double.hashCode(this.usdAmount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Request)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Request request = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Request) other;
            return this.points == request.points && java.lang.Double.compare(this.usdAmount, request.usdAmount) == 0;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Request copy(int points, double usdAmount) {
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Request(points, usdAmount);
        }

        /* renamed from: component2, reason: from getter */
        public final double getUsdAmount() {
            return this.usdAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final int getPoints() {
            return this.points;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Request copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Request request, int i, double d, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = request.points;
            }
            if ((i2 & 2) != 0) {
                d = request.usdAmount;
            }
            return request.copy(i, d);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/RedeemPointsToBalanceUseCase$Response;", "", "", "transactionId", "", "pointsRedeemed", "", "usdAmount", "<init>", "(Ljava/lang/String;ID)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()D", "copy", "(Ljava/lang/String;ID)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/RedeemPointsToBalanceUseCase$Response;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getTransactionId", com.visa.cbp.getEncExpo.warmup, "getPointsRedeemed", "D", "getUsdAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Response {
        public static final int $stable = 0;
        private final int pointsRedeemed;
        private final java.lang.String transactionId;
        private final double usdAmount;

        public Response(java.lang.String str, int i, double d) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.transactionId = str;
            this.pointsRedeemed = i;
            this.usdAmount = d;
        }

        public final java.lang.String getTransactionId() {
            return this.transactionId;
        }

        public final int getPointsRedeemed() {
            return this.pointsRedeemed;
        }

        public final double getUsdAmount() {
            return this.usdAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.transactionId;
            int i = this.pointsRedeemed;
            double d = this.usdAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Response(transactionId=");
            sb.append(str);
            sb.append(", pointsRedeemed=");
            sb.append(i);
            sb.append(", usdAmount=");
            sb.append(d);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.transactionId.hashCode() * 31) + java.lang.Integer.hashCode(this.pointsRedeemed)) * 31) + java.lang.Double.hashCode(this.usdAmount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Response)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Response response = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Response) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.transactionId, response.transactionId) && this.pointsRedeemed == response.pointsRedeemed && java.lang.Double.compare(this.usdAmount, response.usdAmount) == 0;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Response copy(java.lang.String transactionId, int pointsRedeemed, double usdAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionId, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Response(transactionId, pointsRedeemed, usdAmount);
        }

        /* renamed from: component3, reason: from getter */
        public final double getUsdAmount() {
            return this.usdAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPointsRedeemed() {
            return this.pointsRedeemed;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTransactionId() {
            return this.transactionId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Response copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Response response, java.lang.String str, int i, double d, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = response.transactionId;
            }
            if ((i2 & 2) != 0) {
                i = response.pointsRedeemed;
            }
            if ((i2 & 4) != 0) {
                d = response.usdAmount;
            }
            return response.copy(str, i, d);
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Response $r8$lambda$1wLM9vVQux23BX5P7Vs4HaNQwwI(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Request request, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsResponse redeemPointsResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemPointsResponse, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Response(redeemPointsResponse.getTransactionId(), request.getPoints(), request.getUsdAmount());
    }
}
