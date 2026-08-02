package com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0013\u0014B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/usecase/GetCategorySelectionUseCase;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCase;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/usecase/GetCategorySelectionUseCase$Request;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/usecase/GetCategorySelectionUseCase$Response;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/repository/CategorySelectionRepository;", "categorySelectionRepository", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/StringResourceProvider;", "stringResourceProvider", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/repository/CategorySelectionRepository;Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/StringResourceProvider;)V", "request", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/usecase/GetCategorySelectionUseCase$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/repository/CategorySelectionRepository;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/StringResourceProvider;", "Request", "Response"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetCategorySelectionUseCase implements com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.Request, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.Response> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.repository.CategorySelectionRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public GetCategorySelectionUseCase(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.repository.CategorySelectionRepository categorySelectionRepository, com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider stringResourceProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categorySelectionRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringResourceProvider, "");
        this.getHighResolutionOutputSizeshNQ4ISI = categorySelectionRepository;
        this.getHighSpeedVideoFpsRanges = stringResourceProvider;
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.Request request, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<? extends com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.Response>> continuation) {
        return invoke2(request, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.Response>>) continuation);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.Response> onDataResultError(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError dataResultError) {
        return super.onDataResultError(dataResultError);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.Response> onResponseData(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T> dataResult, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.Response> function1) {
        return super.onResponseData(dataResult, function1);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.Response> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T>> ior, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.Response> function1) {
        return super.toUseCaseResult(ior, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.Request request, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.Response>> continuation) {
        com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase$invoke$1 getCategorySelectionUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase getCategorySelectionUseCase;
        if (continuation instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase$invoke$1) {
            getCategorySelectionUseCase$invoke$1 = (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase$invoke$1) continuation;
            if ((getCategorySelectionUseCase$invoke$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                getCategorySelectionUseCase$invoke$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = getCategorySelectionUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getCategorySelectionUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.repository.CategorySelectionRepository categorySelectionRepository = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.repository.CategorySelectionRepository.CategorySelectionGraphQLRequest categorySelectionGraphQLRequest = com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.repository.CategorySelectionRepository.CategorySelectionGraphQLRequest.INSTANCE;
                    getCategorySelectionUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(request);
                    getCategorySelectionUseCase$invoke$1.Camera2StreamConfigurationMap = this;
                    getCategorySelectionUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = categorySelectionRepository.getSelectionCategories(categorySelectionGraphQLRequest, getCategorySelectionUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    getCategorySelectionUseCase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    getCategorySelectionUseCase = (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase) getCategorySelectionUseCase$invoke$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return getCategorySelectionUseCase.toUseCaseResult((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.$r8$lambda$fSDUv6XX_08XBaglTjtqoSr2sWU(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.this, (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.CategorySelectionResponse) obj2);
                    }
                });
            }
        }
        getCategorySelectionUseCase$invoke$1 = new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getCategorySelectionUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getCategorySelectionUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return getCategorySelectionUseCase.toUseCaseResult((arrow.core.Ior) obj2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.$r8$lambda$fSDUv6XX_08XBaglTjtqoSr2sWU(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.this, (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.CategorySelectionResponse) obj22);
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/usecase/GetCategorySelectionUseCase$Request;", "", "<init>", "()V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Request {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.Request INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.Request();

        public final int hashCode() {
            return 1968206732;
        }

        private Request() {
        }

        public final java.lang.String toString() {
            return "Request";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.Request)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/usecase/GetCategorySelectionUseCase$Response;", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/models/CategorySelectionResponse;", "categorySelectionResponse", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/models/SelectionText;", "selectionText", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/models/CategorySelectionResponse;Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/models/SelectionText;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/models/CategorySelectionResponse;", "component2", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/models/SelectionText;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/models/CategorySelectionResponse;Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/models/SelectionText;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/usecase/GetCategorySelectionUseCase$Response;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/models/CategorySelectionResponse;", "getCategorySelectionResponse", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/models/SelectionText;", "getSelectionText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Response {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.CategorySelectionResponse categorySelectionResponse;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.SelectionText selectionText;

        public Response(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.CategorySelectionResponse categorySelectionResponse, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.SelectionText selectionText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categorySelectionResponse, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectionText, "");
            this.categorySelectionResponse = categorySelectionResponse;
            this.selectionText = selectionText;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.CategorySelectionResponse getCategorySelectionResponse() {
            return this.categorySelectionResponse;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.SelectionText getSelectionText() {
            return this.selectionText;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.CategorySelectionResponse categorySelectionResponse = this.categorySelectionResponse;
            com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.SelectionText selectionText = this.selectionText;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Response(categorySelectionResponse=");
            sb.append(categorySelectionResponse);
            sb.append(", selectionText=");
            sb.append(selectionText);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.categorySelectionResponse.hashCode() * 31) + this.selectionText.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.Response)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.Response response = (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.Response) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.categorySelectionResponse, response.categorySelectionResponse) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectionText, response.selectionText);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.Response copy(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.CategorySelectionResponse categorySelectionResponse, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.SelectionText selectionText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categorySelectionResponse, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectionText, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.Response(categorySelectionResponse, selectionText);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.SelectionText getSelectionText() {
            return this.selectionText;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.CategorySelectionResponse getCategorySelectionResponse() {
            return this.categorySelectionResponse;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.Response copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.Response response, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.CategorySelectionResponse categorySelectionResponse, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.SelectionText selectionText, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                categorySelectionResponse = response.categorySelectionResponse;
            }
            if ((i & 2) != 0) {
                selectionText = response.selectionText;
            }
            return response.copy(categorySelectionResponse, selectionText);
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.Response $r8$lambda$fSDUv6XX_08XBaglTjtqoSr2sWU(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase getCategorySelectionUseCase, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.CategorySelectionResponse categorySelectionResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categorySelectionResponse, "");
        java.lang.String offerDetailsTermsText = categorySelectionResponse.getOfferDetailsTermsText();
        return new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.Response(categorySelectionResponse, new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.SelectionText(offerDetailsTermsText != null ? offerDetailsTermsText : "", getCategorySelectionUseCase.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_category_selection_confirm_cta_label)));
    }
}
