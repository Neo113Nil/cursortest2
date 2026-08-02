package com.paypal.oslo.feature.oneonboarding.inventory.steps.password.data;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\t\u001a\u00060\u0005j\u0002`\u00062\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/password/data/PasswordFieldSubmissionMapper;", "Lcom/paypal/oslo/feature/oneonboarding/data/mapper/FieldSubmissionMapper;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/password/domain/PasswordCollectedItem;", "<init>", "()V", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardComponentsInput;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/type/OnboardComponentsInput;", "componentsInput", "item", "makeFieldSubmission", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardComponentsInput;Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/password/domain/PasswordCollectedItem;)Lcom/paypal/oslo/api/graphql/schema/type/OnboardComponentsInput;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PasswordFieldSubmissionMapper implements com.paypal.oslo.feature.oneonboarding.data.mapper.FieldSubmissionMapper<com.paypal.oslo.feature.oneonboarding.inventory.steps.password.domain.PasswordCollectedItem> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PasswordFieldSubmissionMapper() {
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.mapper.FieldSubmissionMapper
    public final com.paypal.oslo.api.graphql.schema.type.OnboardComponentsInput makeFieldSubmission(com.paypal.oslo.api.graphql.schema.type.OnboardComponentsInput componentsInput, com.paypal.oslo.feature.oneonboarding.inventory.steps.password.domain.PasswordCollectedItem item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentsInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        return com.paypal.oslo.feature.oneonboarding.data.mapper.OnboardComponentsInputExtensionsKt.withPassword(componentsInput, new com.paypal.oslo.api.graphql.schema.type.OnboardPasswordInputComponentInput(item.getPassword(), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(item.getGetHighSpeedVideoSizes())));
    }
}
