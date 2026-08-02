package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.cli;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncomePeriod;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditIncomePeriod;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/type/RevolvingCreditIncomePeriod;", "toRevolvingCreditIncomePeriod", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncomePeriod;)Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditIncomePeriod;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$Data;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseResult;", "toResult", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$Data;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseResult;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CLIApplicationMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditIncomePeriod toRevolvingCreditIncomePeriod(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod cLIIncomePeriod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cLIIncomePeriod, "");
        int i = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.cli.CLIApplicationMapperKt.WhenMappings.$EnumSwitchMapping$0[cLIIncomePeriod.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditIncomePeriod.ANNUAL;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditIncomePeriod.MONTHLY;
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult toResult(com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.Data data) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus cLIIncreaseStatus;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.RequestRevolvingCreditLineIncrease requestRevolvingCreditLineIncrease = data.getRequestRevolvingCreditLineIncrease();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseApproved onRequestRevolvingCreditLineIncreaseApproved = requestRevolvingCreditLineIncrease != null ? requestRevolvingCreditLineIncrease.getOnRequestRevolvingCreditLineIncreaseApproved() : null;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.RequestRevolvingCreditLineIncrease requestRevolvingCreditLineIncrease2 = data.getRequestRevolvingCreditLineIncrease();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseDeclined onRequestRevolvingCreditLineIncreaseDeclined = requestRevolvingCreditLineIncrease2 != null ? requestRevolvingCreditLineIncrease2.getOnRequestRevolvingCreditLineIncreaseDeclined() : null;
        if (onRequestRevolvingCreditLineIncreaseApproved == null) {
            if (onRequestRevolvingCreditLineIncreaseDeclined == null) {
                return null;
            }
            java.lang.Object creditAccountId = onRequestRevolvingCreditLineIncreaseDeclined.getCreditAccountId();
            java.lang.String str = creditAccountId instanceof java.lang.String ? (java.lang.String) creditAccountId : null;
            return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult.Declined(str != null ? str : "");
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount(onRequestRevolvingCreditLineIncreaseApproved.getApprovedCreditLimit().getCurrencyCode().toString(), onRequestRevolvingCreditLineIncreaseApproved.getApprovedCreditLimit().getValue());
        int i = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.cli.CLIApplicationMapperKt.WhenMappings.$EnumSwitchMapping$1[onRequestRevolvingCreditLineIncreaseApproved.getStatus().ordinal()];
        if (i == 1) {
            cLIIncreaseStatus = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus.FULL_APPROVAL;
        } else if (i == 2) {
            cLIIncreaseStatus = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus.PARTIAL_APPROVAL;
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            cLIIncreaseStatus = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus.UNKNOWN;
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult.Approved(currencyAmount, cLIIncreaseStatus);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod.ANNUAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod.MONTHLY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseStatus.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseStatus.FULL_APPROVAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseStatus.PARTIAL_APPROVAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseStatus.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
