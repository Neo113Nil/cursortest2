package com.paypal.oslo.feature.oneonboarding.ui.preview;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "previewAccountCreationIntentId", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PreviewIntentFactoryKt {
    public static final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId previewAccountCreationIntentId() {
        return new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation(com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl("US"), com.paypal.oslo.feature.oneonboarding.api.domain.Email.m16627constructorimpl("preview@example.com"), new com.paypal.oslo.feature.oneonboarding.api.domain.Phone(com.paypal.oslo.feature.oneonboarding.api.domain.CountryCode.m16618constructorimpl("+1"), com.paypal.oslo.feature.oneonboarding.api.domain.PhoneNumber.m16664constructorimpl("5551234567"), (kotlin.jvm.internal.DefaultConstructorMarker) null), null, 8, null);
    }
}
