package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0016\u001a\u00020\u00152\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/UpdatePaymentTransferAttemptAmountAndIntentMapper;", "", "Lcom/paypal/oslo/feature/p2p/data/mapper/RecommendedContactMapper;", "recommendedContactMapper", "<init>", "(Lcom/paypal/oslo/feature/p2p/data/mapper/RecommendedContactMapper;)V", "Larrow/core/raise/Raise;", "Lcom/paypal/oslo/feature/p2p/domain/error/TransferError;", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptAmountAndIntentMutation$PaymentTransferAttempt;", "paymentTransferAttempt", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferAttempt;", "mapPaymentTransferAttempt", "(Larrow/core/raise/Raise;Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptAmountAndIntentMutation$PaymentTransferAttempt;)Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferAttempt;", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptAmountAndIntentMutation$TransferAmount;", "transferAmount", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "mapAmount", "(Larrow/core/raise/Raise;Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptAmountAndIntentMutation$TransferAmount;)Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferIntent;", "Lcom/paypal/oslo/feature/p2p/graphql/type/PaymentTransferIntent;", "graphqlIntent", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", "mapIntent", "(Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferIntent;)Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/p2p/data/mapper/RecommendedContactMapper;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UpdatePaymentTransferAttemptAmountAndIntentMapper {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.data.mapper.RecommendedContactMapper getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public UpdatePaymentTransferAttemptAmountAndIntentMapper(com.paypal.oslo.feature.p2p.data.mapper.RecommendedContactMapper recommendedContactMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recommendedContactMapper, "");
        this.getHighSpeedVideoFpsRangesFor = recommendedContactMapper;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt mapPaymentTransferAttempt(arrow.core.raise.Raise<? super com.paypal.oslo.feature.p2p.domain.error.TransferError> raise, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptAmountAndIntentMutation.PaymentTransferAttempt paymentTransferAttempt) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raise, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferAttempt, "");
        java.lang.Object id = paymentTransferAttempt.getId();
        java.lang.String str = id instanceof java.lang.String ? (java.lang.String) id : null;
        if (str == null) {
            raise.raise(com.paypal.oslo.feature.p2p.domain.error.TransferError.DataNotFound.INSTANCE);
            throw new kotlin.KotlinNothingValueException();
        }
        java.util.List<com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptAmountAndIntentMutation.RecommendedContact> recommendedContacts = paymentTransferAttempt.getRecommendedContacts();
        if (recommendedContacts != null) {
            java.util.List<com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptAmountAndIntentMutation.RecommendedContact> list = recommendedContacts;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(this.getHighSpeedVideoFpsRangesFor.map((com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptAmountAndIntentMutation.RecommendedContact) it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        java.util.List emptyList = arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptAmountAndIntentMutation.TransferAmount transferAmount = paymentTransferAttempt.getTransferAmount();
        com.paypal.oslo.feature.p2p.domain.model.Amount mapAmount = transferAmount != null ? mapAmount(raise, transferAmount) : null;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent> supportedIntents = paymentTransferAttempt.getSupportedIntents();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(supportedIntents, 10));
        java.util.Iterator<T> it2 = supportedIntents.iterator();
        while (it2.hasNext()) {
            arrayList3.add(mapIntent((com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent) it2.next()));
        }
        java.util.ArrayList arrayList4 = arrayList3;
        com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent selectedIntent = paymentTransferAttempt.getSelectedIntent();
        return new com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt(str, mapAmount, arrayList4, selectedIntent != null ? mapIntent(selectedIntent) : null, emptyList, null, null, null, null, null, 992, null);
    }

    public final com.paypal.oslo.feature.p2p.domain.model.Amount mapAmount(arrow.core.raise.Raise<? super com.paypal.oslo.feature.p2p.domain.error.TransferError> raise, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptAmountAndIntentMutation.TransferAmount transferAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raise, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAmount, "");
        java.lang.Object currencyCode = transferAmount.getCurrencyCode();
        java.lang.String str = currencyCode instanceof java.lang.String ? (java.lang.String) currencyCode : null;
        if (str == null) {
            raise.raise(com.paypal.oslo.feature.p2p.domain.error.TransferError.DataNotFound.INSTANCE);
            throw new kotlin.KotlinNothingValueException();
        }
        return new com.paypal.oslo.feature.p2p.domain.model.Amount(transferAmount.getValue(), str, str);
    }

    public final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent mapIntent(com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent graphqlIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphqlIntent, "");
        int i = com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptAmountAndIntentMapper.WhenMappings.$EnumSwitchMapping$0[graphqlIntent.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.SEND;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.REQUEST;
        }
        return com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.UNKNOWN;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent.SEND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent.REQUEST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
