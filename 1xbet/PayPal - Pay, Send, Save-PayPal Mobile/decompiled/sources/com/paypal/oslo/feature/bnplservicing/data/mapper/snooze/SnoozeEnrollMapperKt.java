package com.paypal.oslo.feature.bnplservicing.data.mapper.snooze;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/EnrollInBnplPlanProgramMutation$Data;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/SnoozeEnrollResult;", "toSnoozeEnrollResult", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/EnrollInBnplPlanProgramMutation$Data;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/SnoozeEnrollResult;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/input/SnoozeEnrollInput;", "Lcom/paypal/oslo/api/graphql/schema/type/EnrollInBNPLPlanProgramInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/input/SnoozeEnrollInput;)Lcom/paypal/oslo/api/graphql/schema/type/EnrollInBNPLPlanProgramInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SnoozeEnrollMapperKt {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult toSnoozeEnrollResult(com.paypal.oslo.feature.bnplservicing.graphql.EnrollInBnplPlanProgramMutation.Data data) {
        com.paypal.oslo.feature.bnplservicing.graphql.EnrollInBnplPlanProgramMutation.EnrollInBnplPlanProgram enrollInBnplPlanProgram;
        if (data == null || (enrollInBnplPlanProgram = data.getEnrollInBnplPlanProgram()) == null) {
            return null;
        }
        return new com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult(com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus.INSTANCE.from(enrollInBnplPlanProgram.getStatus().name()));
    }

    public static final com.paypal.oslo.api.graphql.schema.type.EnrollInBNPLPlanProgramInput toGraphQLInput(com.paypal.oslo.feature.bnplservicing.domain.model.snooze.input.SnoozeEnrollInput snoozeEnrollInput) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(snoozeEnrollInput, "");
        com.paypal.oslo.api.graphql.schema.type.EnrollInBNPLPlanProgramFlowContextInput enrollInBNPLPlanProgramFlowContextInput = new com.paypal.oslo.api.graphql.schema.type.EnrollInBNPLPlanProgramFlowContextInput(com.paypal.oslo.api.graphql.schema.type.BNPLServicingFlowSpecifier.SELF_SERVICING, com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel.MOBILE_APP);
        java.lang.String planId = snoozeEnrollInput.getPlanId();
        com.paypal.oslo.api.graphql.schema.type.BNPLPlanProgramName bNPLPlanProgramName = com.paypal.oslo.api.graphql.schema.type.BNPLPlanProgramName.SNOOZE;
        com.paypal.oslo.api.graphql.schema.type.BNPLPlanProgramEnrollmentReason safeValueOf = com.paypal.oslo.api.graphql.schema.type.BNPLPlanProgramEnrollmentReason.INSTANCE.safeValueOf(snoozeEnrollInput.getEnrollmentReason());
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.Integer defermentDurationDays = snoozeEnrollInput.getDefermentDurationDays();
        if (defermentDurationDays != null) {
            int intValue = defermentDurationDays.intValue();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("P");
            sb.append(intValue);
            sb.append("D");
            str = sb.toString();
        } else {
            str = null;
        }
        com.apollographql.apollo.api.Optional presentIfNotNull = companion.presentIfNotNull(str);
        com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money enrollmentFee = snoozeEnrollInput.getEnrollmentFee();
        com.apollographql.apollo.api.Optional presentIfNotNull2 = companion2.presentIfNotNull(enrollmentFee != null ? new com.paypal.oslo.api.graphql.schema.type.MoneyInput(enrollmentFee.getCurrencyCode(), enrollmentFee.getValue()) : null);
        com.apollographql.apollo.api.Optional.Companion companion3 = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money outstandingBalance = snoozeEnrollInput.getOutstandingBalance();
        return new com.paypal.oslo.api.graphql.schema.type.EnrollInBNPLPlanProgramInput(enrollInBNPLPlanProgramFlowContextInput, planId, null, null, new com.paypal.oslo.api.graphql.schema.type.BNPLPlanProgramInput(bNPLPlanProgramName, safeValueOf, presentIfNotNull, presentIfNotNull2, companion3.presentIfNotNull(outstandingBalance != null ? new com.paypal.oslo.api.graphql.schema.type.MoneyInput(outstandingBalance.getCurrencyCode(), outstandingBalance.getValue()) : null), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(snoozeEnrollInput.getCentralBankRate()), null, null, 192, null), 12, null);
    }
}
