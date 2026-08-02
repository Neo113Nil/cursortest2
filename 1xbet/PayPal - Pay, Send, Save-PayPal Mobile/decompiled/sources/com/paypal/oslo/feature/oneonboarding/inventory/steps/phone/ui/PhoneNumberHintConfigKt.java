package com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\" \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/identity/PhoneHintIdentityClient;", "LocalPhoneHintIdentityClient", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalPhoneHintIdentityClient", "()Landroidx/compose/runtime/ProvidableCompositionLocal;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhoneNumberHintConfigKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.identity.PhoneHintIdentityClient> LocalPhoneHintIdentityClient = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintConfigKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintConfigKt.$r8$lambda$rszfovpPlYi3TgJDhaKo0KkBq9Q();
        }
    });

    public static final androidx.compose.runtime.ProvidableCompositionLocal<com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.identity.PhoneHintIdentityClient> getLocalPhoneHintIdentityClient() {
        return LocalPhoneHintIdentityClient;
    }

    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.identity.PhoneHintIdentityClient $r8$lambda$rszfovpPlYi3TgJDhaKo0KkBq9Q() {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.identity.GooglePhoneHintIdentityClient();
    }
}
