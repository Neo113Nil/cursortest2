package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/SecurityQuestionIdentityChallengeValidationInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "type", "", "Lcom/paypal/oslo/api/graphql/schema/type/SecurityQuestionIdentityChallengeAnswerInput;", "securityQuestionAnswers", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;Ljava/util/List;)Lcom/paypal/oslo/api/graphql/schema/type/SecurityQuestionIdentityChallengeValidationInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "getType", "Ljava/util/List;", "getSecurityQuestionAnswers"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SecurityQuestionIdentityChallengeValidationInput {
    private final java.util.List<com.paypal.oslo.api.graphql.schema.type.SecurityQuestionIdentityChallengeAnswerInput> securityQuestionAnswers;
    private final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod type;

    public SecurityQuestionIdentityChallengeValidationInput(com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod, java.util.List<com.paypal.oslo.api.graphql.schema.type.SecurityQuestionIdentityChallengeAnswerInput> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpIdentityChallengeMethod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.type = stepUpIdentityChallengeMethod;
        this.securityQuestionAnswers = list;
    }

    public final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod getType() {
        return this.type;
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.SecurityQuestionIdentityChallengeAnswerInput> getSecurityQuestionAnswers() {
        return this.securityQuestionAnswers;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod = this.type;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.SecurityQuestionIdentityChallengeAnswerInput> list = this.securityQuestionAnswers;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SecurityQuestionIdentityChallengeValidationInput(type=");
        sb.append(stepUpIdentityChallengeMethod);
        sb.append(", securityQuestionAnswers=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.type.hashCode() * 31) + this.securityQuestionAnswers.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.SecurityQuestionIdentityChallengeValidationInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.SecurityQuestionIdentityChallengeValidationInput securityQuestionIdentityChallengeValidationInput = (com.paypal.oslo.api.graphql.schema.type.SecurityQuestionIdentityChallengeValidationInput) other;
        return this.type == securityQuestionIdentityChallengeValidationInput.type && kotlin.jvm.internal.Intrinsics.areEqual(this.securityQuestionAnswers, securityQuestionIdentityChallengeValidationInput.securityQuestionAnswers);
    }

    public final com.paypal.oslo.api.graphql.schema.type.SecurityQuestionIdentityChallengeValidationInput copy(com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod type, java.util.List<com.paypal.oslo.api.graphql.schema.type.SecurityQuestionIdentityChallengeAnswerInput> securityQuestionAnswers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(securityQuestionAnswers, "");
        return new com.paypal.oslo.api.graphql.schema.type.SecurityQuestionIdentityChallengeValidationInput(type, securityQuestionAnswers);
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.SecurityQuestionIdentityChallengeAnswerInput> component2() {
        return this.securityQuestionAnswers;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.SecurityQuestionIdentityChallengeValidationInput copy$default(com.paypal.oslo.api.graphql.schema.type.SecurityQuestionIdentityChallengeValidationInput securityQuestionIdentityChallengeValidationInput, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            stepUpIdentityChallengeMethod = securityQuestionIdentityChallengeValidationInput.type;
        }
        if ((i & 2) != 0) {
            list = securityQuestionIdentityChallengeValidationInput.securityQuestionAnswers;
        }
        return securityQuestionIdentityChallengeValidationInput.copy(stepUpIdentityChallengeMethod, list);
    }
}
