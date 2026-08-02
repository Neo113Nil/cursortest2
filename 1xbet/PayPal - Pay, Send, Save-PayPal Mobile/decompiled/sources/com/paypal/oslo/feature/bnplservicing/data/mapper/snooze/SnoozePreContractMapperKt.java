package com.paypal.oslo.feature.bnplservicing.data.mapper.snooze;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/CreateSnoozePreContractMutation$Data;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/SnoozePreContractOverview;", "toSnoozePreContractOverview", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/CreateSnoozePreContractMutation$Data;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/SnoozePreContractOverview;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/input/SnoozePreContractInput;", "Lcom/paypal/oslo/api/graphql/schema/type/CreateBNPLPreSnoozeContractInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/input/SnoozePreContractInput;)Lcom/paypal/oslo/api/graphql/schema/type/CreateBNPLPreSnoozeContractInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SnoozePreContractMapperKt {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozePreContractOverview toSnoozePreContractOverview(com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.Data data) {
        com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.CreateBnplPreSnoozeContract createBnplPreSnoozeContract;
        java.util.ArrayList arrayList = null;
        if (data == null || (createBnplPreSnoozeContract = data.getCreateBnplPreSnoozeContract()) == null) {
            return null;
        }
        java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.SnoozeDocument> snoozeDocuments = createBnplPreSnoozeContract.getSnoozeDocuments();
        if (snoozeDocuments != null) {
            java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.SnoozeDocument> list = snoozeDocuments;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingDocumentFragment bnplServicingDocumentFragment = ((com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.SnoozeDocument) it.next()).getBnplServicingDocumentFragment();
                java.lang.String name2 = bnplServicingDocumentFragment.getName();
                java.lang.String fileName = bnplServicingDocumentFragment.getFileName();
                com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingLinkFragment bnplServicingLinkFragment = bnplServicingDocumentFragment.getLink().getBnplServicingLinkFragment();
                java.lang.String relativePath = bnplServicingLinkFragment.getRelativePath();
                java.lang.Object staticUrl = bnplServicingLinkFragment.getStaticUrl();
                java.lang.String obj = staticUrl != null ? staticUrl.toString() : null;
                com.paypal.oslo.api.graphql.schema.type.BNPLServicingDocumentLinkType type = bnplServicingLinkFragment.getType();
                arrayList2.add(new com.paypal.oslo.feature.bnplservicing.domain.model.common.Document(name2, fileName, new com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link(relativePath, obj, type != null ? com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type.INSTANCE.from(type.name()) : null), com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type.INSTANCE.from(bnplServicingDocumentFragment.getType().name())));
            }
            arrayList = arrayList2;
        }
        if (arrayList == null) {
            arrayList = kotlin.collections.CollectionsKt.emptyList();
        }
        return new com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozePreContractOverview(arrayList);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.CreateBNPLPreSnoozeContractInput toGraphQLInput(com.paypal.oslo.feature.bnplservicing.domain.model.snooze.input.SnoozePreContractInput snoozePreContractInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(snoozePreContractInput, "");
        java.lang.String planId = snoozePreContractInput.getPlanId();
        com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier safeValueOf = com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.INSTANCE.safeValueOf(snoozePreContractInput.getCpi().name());
        com.paypal.oslo.api.graphql.schema.type.MoneyInput moneyInput = new com.paypal.oslo.api.graphql.schema.type.MoneyInput(snoozePreContractInput.getEnrollmentFee().getCurrencyCode(), snoozePreContractInput.getEnrollmentFee().getValue());
        java.lang.String merchantName = snoozePreContractInput.getMerchantName();
        java.lang.String newMaturityDate = snoozePreContractInput.getNewMaturityDate();
        com.paypal.oslo.api.graphql.schema.type.MoneyInput moneyInput2 = new com.paypal.oslo.api.graphql.schema.type.MoneyInput(snoozePreContractInput.getAdjustedTotalAmount().getCurrencyCode(), snoozePreContractInput.getAdjustedTotalAmount().getValue());
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money originalBalance = snoozePreContractInput.getOriginalBalance();
        com.apollographql.apollo.api.Optional presentIfNotNull = companion.presentIfNotNull(originalBalance != null ? new com.paypal.oslo.api.graphql.schema.type.MoneyInput(originalBalance.getCurrencyCode(), originalBalance.getValue()) : null);
        com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument = snoozePreContractInput.getFundingInstrument();
        return new com.paypal.oslo.api.graphql.schema.type.CreateBNPLPreSnoozeContractInput(planId, safeValueOf, moneyInput, presentIfNotNull, merchantName, newMaturityDate, moneyInput2, companion2.presentIfNotNull(fundingInstrument != null ? com.paypal.oslo.feature.bnplservicing.data.mapper.common.FundingInstrumentMapperKt.toPaymentFundingInstrumentInput(fundingInstrument) : null));
    }
}
