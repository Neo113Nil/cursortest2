package com.paypal.oslo.feature.dataprivacy.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/domain/usecase/CreateErasureRequestUseCase;", "", "Lcom/paypal/oslo/feature/dataprivacy/domain/repository/DataAccessRequestRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/dataprivacy/domain/repository/DataAccessRequestRepository;)V", "", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureReason;", "reasons", "", "comments", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/dataprivacy/domain/error/DataPrivacyError;", "invoke", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/dataprivacy/domain/repository/DataAccessRequestRepository;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CreateErasureRequestUseCase {
    private final com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository getHighResolutionOutputSizeshNQ4ISI;
    private static final com.paypal.oslo.feature.dataprivacy.domain.usecase.CreateErasureRequestUseCase.Companion Companion = new com.paypal.oslo.feature.dataprivacy.domain.usecase.CreateErasureRequestUseCase.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public CreateErasureRequestUseCase(com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository dataAccessRequestRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataAccessRequestRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = dataAccessRequestRepository;
    }

    public final java.lang.Object invoke(java.util.List<? extends com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason> list, java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError, java.lang.String>> continuation) {
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureFeedback erasureFeedback;
        java.lang.String str2;
        java.lang.String str3 = null;
        if (list.isEmpty() && ((str2 = str) == null || kotlin.text.StringsKt.isBlank(str2))) {
            erasureFeedback = null;
        } else {
            if (str != null && !kotlin.text.StringsKt.isBlank(str)) {
                str3 = str;
            }
            erasureFeedback = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureFeedback(list, str3);
        }
        return this.getHighResolutionOutputSizeshNQ4ISI.createErasureRequest(new com.paypal.oslo.feature.dataprivacy.domain.model.CreateErasureRequest(null, null, "mobile-android", null, null, null, null, erasureFeedback, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, null), continuation);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/domain/usecase/CreateErasureRequestUseCase$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
