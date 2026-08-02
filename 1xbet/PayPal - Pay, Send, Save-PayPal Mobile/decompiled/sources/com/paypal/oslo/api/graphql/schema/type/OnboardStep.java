package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/OnboardStep;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OnboardStep {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.OnboardStep.Companion INSTANCE = new com.paypal.oslo.api.graphql.schema.type.OnboardStep.Companion(null);
    private static final com.apollographql.apollo.api.UnionType type = new com.apollographql.apollo.api.UnionType("OnboardStep", com.paypal.oslo.api.graphql.schema.type.OnboardTermsStepComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.OnboardCIPW9StepComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.OnboardPhoneStepComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.OnboardPasswordStepComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.OnboardPersonalInfoStepComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSubmissionStepComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.OnboardSignUpWithGoogleStepComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.OnboardSubmissionStepComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.OnboardTermsSheetViewStepComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.OnboardTerminalStepComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.OnboardSavingsCIPW9StepComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.OnboardCIPPersonalInfoStepComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.OnboardCIPTaxInfoStepComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.OnboardCryptoTermsStepComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.OnboardDocUploadStepComponent.INSTANCE.getType(), com.paypal.oslo.api.graphql.schema.type.OnboardModuleLauncherStepComponent.INSTANCE.getType());

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/OnboardStep$Companion;", "", "<init>", "()V", "Lcom/apollographql/apollo/api/UnionType;", "type", "Lcom/apollographql/apollo/api/UnionType;", "getType", "()Lcom/apollographql/apollo/api/UnionType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.UnionType getType() {
            return com.paypal.oslo.api.graphql.schema.type.OnboardStep.type;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
