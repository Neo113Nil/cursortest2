package com.paypal.oslo.feature.inappcheckout.analytics;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00142\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020&2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/analytics/AnalyticsContextMapper;", "", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "appSwitchSession", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", "buildBusinessFlowContext", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutContextEntity;", "checkoutContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/MerchantContext;", "toMerchantContext", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutContextEntity;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/MerchantContext;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;", "selectedFundingInstrument", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/TransactionContext;", "toTransactionContext", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/TransactionContext;", "fundingInstrument", "", "allInstruments", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/FundingInstrumentContext;", "toFundingInstrumentContext", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;Ljava/util/List;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/FundingInstrumentContext;", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "buildCheckoutContexts", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutContextEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;Ljava/util/List;)Ljava/util/List;", "buildFundingInstrumentContexts", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;Ljava/util/List;)Ljava/util/List;", "", "screen", "comp", "item", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "buildUiContext", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "intent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "buildUserIntentContext", "(Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AnalyticsContextMapper {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public AnalyticsContextMapper(com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchSession, "");
        this.getHighSpeedVideoFpsRanges = appSwitchSession;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext buildBusinessFlowContext() {
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType.BILLING_TOKEN.getRawValue(), this.getHighSpeedVideoFpsRanges.getCheckoutTokenValueOrEmpty());
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext toMerchantContext(com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity checkoutContext) {
        com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantEntity merchant = checkoutContext != null ? checkoutContext.getMerchant() : null;
        java.lang.String merchantId = merchant != null ? merchant.getMerchantId() : null;
        java.lang.String name2 = merchant != null ? merchant.getName() : null;
        if (merchant == null || merchantId == null || name2 == null) {
            return null;
        }
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext(merchantId, name2);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.domain.TransactionContext toTransactionContext(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument selectedFundingInstrument) {
        java.lang.String str;
        java.lang.String str2;
        if (selectedFundingInstrument == null) {
            return null;
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.SmartAuthAmount smartAuthRawAmount = selectedFundingInstrument.getSmartAuthRawAmount();
        if (smartAuthRawAmount == null || (str = smartAuthRawAmount.getAmount()) == null) {
            str = "0.00";
        }
        java.lang.String str3 = str;
        if (smartAuthRawAmount == null || (str2 = smartAuthRawAmount.getCurrencyCode()) == null) {
            str2 = "USD";
        }
        java.lang.String str4 = str2;
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.TransactionContext(str4, com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType.CONSUMER, str4, "MERCHANT", str3, "BILLING_AGREEMENT", "MERCHANT", null, 128, null);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.domain.FundingInstrumentContext toFundingInstrumentContext(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument, java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> allInstruments) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allInstruments, "");
        if (fundingInstrument == null || allInstruments.isEmpty()) {
            return null;
        }
        java.lang.String smartAuthAmount = fundingInstrument.getSmartAuthAmount();
        if (smartAuthAmount == null) {
            com.paypal.oslo.feature.inappcheckout.domain.entity.SmartAuthAmount smartAuthRawAmount = fundingInstrument.getSmartAuthRawAmount();
            smartAuthAmount = smartAuthRawAmount != null ? smartAuthRawAmount.getAmount() : null;
            if (smartAuthAmount == null) {
                smartAuthAmount = "0.00";
            }
        }
        java.lang.String str = smartAuthAmount;
        java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> list = allInstruments;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument) it.next()).getId());
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.lang.String id = fundingInstrument.getId();
        java.lang.String name2 = fundingInstrument.getType().name();
        com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType bankSubtype = fundingInstrument.getBankSubtype();
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.FundingInstrumentContext(arrayList2, id, null, name2, bankSubtype != null ? bankSubtype.name() : null, fundingInstrument.getLabel(), fundingInstrument.getCardBrand(), str);
    }

    public final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> buildCheckoutContexts(com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity checkoutContext, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument selectedFundingInstrument, java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> allInstruments) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allInstruments, "");
        return kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{toMerchantContext(checkoutContext), toTransactionContext(selectedFundingInstrument), toFundingInstrumentContext(selectedFundingInstrument, allInstruments)});
    }

    public final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> buildFundingInstrumentContexts(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument selectedFundingInstrument, java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> allInstruments) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allInstruments, "");
        return kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{toTransactionContext(selectedFundingInstrument), toFundingInstrumentContext(selectedFundingInstrument, allInstruments)});
    }

    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext buildUiContext$default(com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper analyticsContextMapper, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return analyticsContextMapper.buildUiContext(str, str2, str3);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext buildUiContext(java.lang.String screen, java.lang.String comp, java.lang.String item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screen, "");
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen screen2 = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(screen);
        java.lang.String str = comp;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component component = (str == null || kotlin.text.StringsKt.isBlank(str)) ? null : new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(comp, 0, null, null, 14, null);
        java.lang.String str2 = item;
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(screen2, null, component, (str2 == null || kotlin.text.StringsKt.isBlank(str2)) ? null : new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(item, 0, 2, null), 2, null);
    }

    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext buildUserIntentContext$default(com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper analyticsContextMapper, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return analyticsContextMapper.buildUserIntentContext(str);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext buildUserIntentContext(java.lang.String intent) {
        if (intent == null) {
            intent = com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Actions.REVIEWED_PURCHASE;
        }
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.MOBILE_CHECKOUT, com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.FEATURE, intent);
    }
}
