package com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\tH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/data/repository/PayPalDebitCardRepositoryImpl;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/repository/PayPalDebitCardRepository;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/StringResourceProvider;", "stringResourceProvider", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/utils/RewardsSummaryDynamicConfig;", "dynamicConfig", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/StringResourceProvider;Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/utils/RewardsSummaryDynamicConfig;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/EarnContent$PpdcCard;", "getPayPalDebitCard", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/StringResourceProvider;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/utils/RewardsSummaryDynamicConfig;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayPalDebitCardRepositoryImpl extends com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository implements com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.PayPalDebitCardRepository {
    public static final java.lang.String PPDC_CARD_ID = "ppdc_monthly_category_card";
    public static final java.lang.String STORE_LOGO_URL = "https://www.paypalobjects.com/shopping/oslo-rewards/ppdc.png";

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryDynamicConfig getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider getHighSpeedVideoFpsRanges;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.PayPalDebitCardRepositoryImpl.Companion INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.PayPalDebitCardRepositoryImpl.Companion(null);
    public static final int $stable = 8;
    private static final java.time.format.DateTimeFormatter Camera2StreamConfigurationMap = java.time.format.DateTimeFormatter.ofPattern("MM/dd");

    @javax.inject.Inject
    public PayPalDebitCardRepositoryImpl(com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider stringResourceProvider, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryDynamicConfig rewardsSummaryDynamicConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringResourceProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsSummaryDynamicConfig, "");
        this.getHighSpeedVideoFpsRanges = stringResourceProvider;
        this.getHighSpeedVideoFpsRangesFor = rewardsSummaryDynamicConfig;
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.PayPalDebitCardRepository
    public final java.lang.Object getPayPalDebitCard(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent.PpdcCard>>> continuation) {
        return arrow.core.IorKt.rightIor(new com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success("", new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent.PpdcCard(PPDC_CARD_ID, this.getHighSpeedVideoFpsRanges.getFormattedString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_category_selection_title, new java.lang.Object[0]), "", this.getHighSpeedVideoFpsRanges.getFormattedString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_category_selection_expiry, INSTANCE.currentMonthLastDateMmDd$shopping_rewards_prodRelease()), this.getHighSpeedVideoFpsRanges.getFormattedString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_category_selection_description, this.getHighSpeedVideoFpsRangesFor.getPpdcPointsPerUnit(), this.getHighSpeedVideoFpsRangesFor.getPpdcCurrencyUnit(), this.getHighSpeedVideoFpsRangesFor.getPpdcMonthlyCap()), STORE_LOGO_URL, this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_shared_action_choose))));
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0018\u0010\r\u001a\u0006*\u00020\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/data/repository/PayPalDebitCardRepositoryImpl$Companion;", "", "<init>", "()V", "", "currentMonthLastDateMmDd$shopping_rewards_prodRelease", "()Ljava/lang/String;", "STORE_LOGO_URL", "Ljava/lang/String;", "PPDC_CARD_ID", "Ljava/time/format/DateTimeFormatter;", "Camera2StreamConfigurationMap", "Ljava/time/format/DateTimeFormatter;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String currentMonthLastDateMmDd$shopping_rewards_prodRelease() {
            java.lang.String format = java.time.LocalDate.now().withDayOfMonth(java.time.LocalDate.now().lengthOfMonth()).format(com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.PayPalDebitCardRepositoryImpl.Camera2StreamConfigurationMap);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            return format;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
