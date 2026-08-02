package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/RedeemPointsToDonationUseCase;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCase;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/RedeemPointsToDonationUseCase$Request;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/RedeemPointsToDonationUseCase$Response;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/repository/RedeemPointsToCharityRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/repository/RedeemPointsToCharityRepository;)V", "request", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/RedeemPointsToDonationUseCase$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/repository/RedeemPointsToCharityRepository;", "Request", "Response"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RedeemPointsToDonationUseCase implements com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Request, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Response> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsToCharityRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public RedeemPointsToDonationUseCase(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsToCharityRepository redeemPointsToCharityRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemPointsToCharityRepository, "");
        this.getHighSpeedVideoSizes = redeemPointsToCharityRepository;
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Request request, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<? extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Response>> continuation) {
        return invoke2(request, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Response>>) continuation);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Response> onDataResultError(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError dataResultError) {
        return super.onDataResultError(dataResultError);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Response> onResponseData(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T> dataResult, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Response> function1) {
        return super.onResponseData(dataResult, function1);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Response> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T>> ior, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Response> function1) {
        return super.toUseCaseResult(ior, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Request request, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Response>> continuation) {
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase$invoke$1 redeemPointsToDonationUseCase$invoke$1;
        int i;
        final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Request request2;
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase redeemPointsToDonationUseCase;
        if (continuation instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase$invoke$1) {
            redeemPointsToDonationUseCase$invoke$1 = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase$invoke$1) continuation;
            if ((redeemPointsToDonationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                redeemPointsToDonationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase$invoke$1 redeemPointsToDonationUseCase$invoke$12 = redeemPointsToDonationUseCase$invoke$1;
                java.lang.Object obj = redeemPointsToDonationUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = redeemPointsToDonationUseCase$invoke$12.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsToCharityRepository redeemPointsToCharityRepository = this.getHighSpeedVideoSizes;
                    int points = request.getPoints();
                    java.lang.String charityId = request.getCharityId();
                    java.lang.String idempotencyKey = request.getIdempotencyKey();
                    boolean shareContactConsent = request.getShareContactConsent();
                    redeemPointsToDonationUseCase$invoke$12.Camera2StreamConfigurationMap = request;
                    redeemPointsToDonationUseCase$invoke$12.getHighSpeedVideoSizes = this;
                    redeemPointsToDonationUseCase$invoke$12.getHighSpeedVideoFpsRangesFor = 1;
                    obj = redeemPointsToCharityRepository.redeemPointsToCharity(java.lang.String.valueOf(points), charityId, idempotencyKey, shareContactConsent, redeemPointsToDonationUseCase$invoke$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    request2 = request;
                    redeemPointsToDonationUseCase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    redeemPointsToDonationUseCase = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase) redeemPointsToDonationUseCase$invoke$12.getHighSpeedVideoSizes;
                    request2 = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Request) redeemPointsToDonationUseCase$invoke$12.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return redeemPointsToDonationUseCase.toUseCaseResult((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.$r8$lambda$ri0ryo9tdTqIf3hOOjYqUuftR_M(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Request.this, (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsResponse) obj2);
                    }
                });
            }
        }
        redeemPointsToDonationUseCase$invoke$1 = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase$invoke$1(this, continuation);
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase$invoke$1 redeemPointsToDonationUseCase$invoke$122 = redeemPointsToDonationUseCase$invoke$1;
        java.lang.Object obj2 = redeemPointsToDonationUseCase$invoke$122.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = redeemPointsToDonationUseCase$invoke$122.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return redeemPointsToDonationUseCase.toUseCaseResult((arrow.core.Ior) obj2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.$r8$lambda$ri0ryo9tdTqIf3hOOjYqUuftR_M(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Request.this, (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsResponse) obj22);
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JL\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000fJ\u0010\u0010\u001e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b%\u0010\u0013R\u001a\u0010\t\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b&\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/RedeemPointsToDonationUseCase$Request;", "", "", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "", "usdAmount", "", "charityId", "charityName", "idempotencyKey", "", "shareContactConsent", "<init>", "(IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()I", "component2", "()D", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()Z", "copy", "(IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/RedeemPointsToDonationUseCase$Request;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getPoints", "D", "getUsdAmount", "Ljava/lang/String;", "getCharityId", "getCharityName", "getIdempotencyKey", "Z", "getShareContactConsent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Request {
        public static final int $stable = 0;
        private final java.lang.String charityId;
        private final java.lang.String charityName;
        private final java.lang.String idempotencyKey;
        private final int points;
        private final boolean shareContactConsent;
        private final double usdAmount;

        public Request(int i, double d, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.points = i;
            this.usdAmount = d;
            this.charityId = str;
            this.charityName = str2;
            this.idempotencyKey = str3;
            this.shareContactConsent = z;
        }

        public /* synthetic */ Request(int i, double d, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, d, str, str2, str3, (i2 & 32) != 0 ? false : z);
        }

        public final int getPoints() {
            return this.points;
        }

        public final double getUsdAmount() {
            return this.usdAmount;
        }

        public final java.lang.String getCharityId() {
            return this.charityId;
        }

        public final java.lang.String getCharityName() {
            return this.charityName;
        }

        public final java.lang.String getIdempotencyKey() {
            return this.idempotencyKey;
        }

        public final boolean getShareContactConsent() {
            return this.shareContactConsent;
        }

        public final java.lang.String toString() {
            int i = this.points;
            double d = this.usdAmount;
            java.lang.String str = this.charityId;
            java.lang.String str2 = this.charityName;
            java.lang.String str3 = this.idempotencyKey;
            boolean z = this.shareContactConsent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Request(points=");
            sb.append(i);
            sb.append(", usdAmount=");
            sb.append(d);
            sb.append(", charityId=");
            sb.append(str);
            sb.append(", charityName=");
            sb.append(str2);
            sb.append(", idempotencyKey=");
            sb.append(str3);
            sb.append(", shareContactConsent=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((java.lang.Integer.hashCode(this.points) * 31) + java.lang.Double.hashCode(this.usdAmount)) * 31) + this.charityId.hashCode()) * 31) + this.charityName.hashCode()) * 31) + this.idempotencyKey.hashCode()) * 31) + java.lang.Boolean.hashCode(this.shareContactConsent);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Request)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Request request = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Request) other;
            return this.points == request.points && java.lang.Double.compare(this.usdAmount, request.usdAmount) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.charityId, request.charityId) && kotlin.jvm.internal.Intrinsics.areEqual(this.charityName, request.charityName) && kotlin.jvm.internal.Intrinsics.areEqual(this.idempotencyKey, request.idempotencyKey) && this.shareContactConsent == request.shareContactConsent;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Request copy(int points, double usdAmount, java.lang.String charityId, java.lang.String charityName, java.lang.String idempotencyKey, boolean shareContactConsent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charityId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charityName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(idempotencyKey, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Request(points, usdAmount, charityId, charityName, idempotencyKey, shareContactConsent);
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShareContactConsent() {
            return this.shareContactConsent;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getIdempotencyKey() {
            return this.idempotencyKey;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCharityName() {
            return this.charityName;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCharityId() {
            return this.charityId;
        }

        /* renamed from: component2, reason: from getter */
        public final double getUsdAmount() {
            return this.usdAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final int getPoints() {
            return this.points;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Request copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Request request, int i, double d, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = request.points;
            }
            if ((i2 & 2) != 0) {
                d = request.usdAmount;
            }
            double d2 = d;
            if ((i2 & 4) != 0) {
                str = request.charityId;
            }
            java.lang.String str4 = str;
            if ((i2 & 8) != 0) {
                str2 = request.charityName;
            }
            java.lang.String str5 = str2;
            if ((i2 & 16) != 0) {
                str3 = request.idempotencyKey;
            }
            java.lang.String str6 = str3;
            if ((i2 & 32) != 0) {
                z = request.shareContactConsent;
            }
            return request.copy(i, d2, str4, str5, str6, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/RedeemPointsToDonationUseCase$Response;", "", "", "transactionId", "", "redeemedAmount", "charityName", "charityId", "<init>", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()D", "component3", "component4", "copy", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/usecase/RedeemPointsToDonationUseCase$Response;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTransactionId", "D", "getRedeemedAmount", "getCharityName", "getCharityId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Response {
        public static final int $stable = 0;
        private final java.lang.String charityId;
        private final java.lang.String charityName;
        private final double redeemedAmount;
        private final java.lang.String transactionId;

        public Response(java.lang.String str, double d, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.transactionId = str;
            this.redeemedAmount = d;
            this.charityName = str2;
            this.charityId = str3;
        }

        public final java.lang.String getTransactionId() {
            return this.transactionId;
        }

        public final double getRedeemedAmount() {
            return this.redeemedAmount;
        }

        public final java.lang.String getCharityName() {
            return this.charityName;
        }

        public final java.lang.String getCharityId() {
            return this.charityId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.transactionId;
            double d = this.redeemedAmount;
            java.lang.String str2 = this.charityName;
            java.lang.String str3 = this.charityId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Response(transactionId=");
            sb.append(str);
            sb.append(", redeemedAmount=");
            sb.append(d);
            sb.append(", charityName=");
            sb.append(str2);
            sb.append(", charityId=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.transactionId.hashCode() * 31) + java.lang.Double.hashCode(this.redeemedAmount)) * 31) + this.charityName.hashCode()) * 31) + this.charityId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Response)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Response response = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Response) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.transactionId, response.transactionId) && java.lang.Double.compare(this.redeemedAmount, response.redeemedAmount) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.charityName, response.charityName) && kotlin.jvm.internal.Intrinsics.areEqual(this.charityId, response.charityId);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Response copy(java.lang.String transactionId, double redeemedAmount, java.lang.String charityName, java.lang.String charityId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charityName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charityId, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Response(transactionId, redeemedAmount, charityName, charityId);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCharityId() {
            return this.charityId;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCharityName() {
            return this.charityName;
        }

        /* renamed from: component2, reason: from getter */
        public final double getRedeemedAmount() {
            return this.redeemedAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTransactionId() {
            return this.transactionId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Response copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Response response, java.lang.String str, double d, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = response.transactionId;
            }
            if ((i & 2) != 0) {
                d = response.redeemedAmount;
            }
            double d2 = d;
            if ((i & 4) != 0) {
                str2 = response.charityName;
            }
            java.lang.String str4 = str2;
            if ((i & 8) != 0) {
                str3 = response.charityId;
            }
            return response.copy(str, d2, str4, str3);
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Response $r8$lambda$ri0ryo9tdTqIf3hOOjYqUuftR_M(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Request request, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsResponse redeemPointsResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemPointsResponse, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase.Response(redeemPointsResponse.getTransactionId(), request.getUsdAmount(), request.getCharityName(), request.getCharityId());
    }
}
