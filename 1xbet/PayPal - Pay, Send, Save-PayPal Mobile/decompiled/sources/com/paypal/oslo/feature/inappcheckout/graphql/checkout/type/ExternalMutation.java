package com.paypal.oslo.feature.inappcheckout.graphql.checkout.type;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalMutation;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExternalMutation {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.Companion INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.Companion(null);
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __addCard_token = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY).build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __addCard_card = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("card").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __addCard_preferred = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("preferred").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __addCard_cardholder = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("cardholder").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __addCard_address = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("address").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __addCard_deviceType = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("deviceType").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __addCard_paypalRequestId = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("paypalRequestId").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __approveElectronicConsent_token = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY).build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __authorizeBillingAgreementCreation_billingAgreementToken = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("billingAgreementToken").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __authorizeBillingAgreementCreation_authorizeBillingAgreementCreationRequest = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("authorizeBillingAgreementCreationRequest").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateCard_token = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY).build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateCard_cardUpdate = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("cardUpdate").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateCard_cardholder = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("cardholder").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateCard_address = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("address").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateCard_preferred = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("preferred").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateCard_deviceType = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("deviceType").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __updateCard_paypalRequestId = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("paypalRequestId").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __saveCheckoutExperienceUserAction_token = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY).build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __saveCheckoutExperienceUserAction_tokenType = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("tokenType").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __saveCheckoutExperienceUserAction_userActionInExperience = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("userActionInExperience").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __initializeNativeRypCheckout_token = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY).build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __initializeNativeRypCheckout_tokenType = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder("tokenType").build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __initializeNativeRypCheckout_country = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder(com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY).build();
    private static final com.apollographql.apollo.api.CompiledArgumentDefinition __initializeNativeRypCheckout_language = new com.apollographql.apollo.api.CompiledArgumentDefinition.Builder(com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY).build();
    private static final com.apollographql.apollo.api.ObjectType type = new com.apollographql.apollo.api.ObjectType.Builder("externalMutation").build();

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u001a\u0010%\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u001a\u0010)\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR\u001a\u0010+\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u001a\u0010/\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\bR\u001a\u00101\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u001a\u00105\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\bR\u001a\u00108\u001a\u0002078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalMutation$Companion;", "", "<init>", "()V", "Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "__addCard_token", "Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "get__addCard_token", "()Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "__addCard_card", "get__addCard_card", "__addCard_preferred", "get__addCard_preferred", "__addCard_cardholder", "get__addCard_cardholder", "__addCard_address", "get__addCard_address", "__addCard_deviceType", "get__addCard_deviceType", "__addCard_paypalRequestId", "get__addCard_paypalRequestId", "__approveElectronicConsent_token", "get__approveElectronicConsent_token", "__authorizeBillingAgreementCreation_billingAgreementToken", "get__authorizeBillingAgreementCreation_billingAgreementToken", "__authorizeBillingAgreementCreation_authorizeBillingAgreementCreationRequest", "get__authorizeBillingAgreementCreation_authorizeBillingAgreementCreationRequest", "__updateCard_token", "get__updateCard_token", "__updateCard_cardUpdate", "get__updateCard_cardUpdate", "__updateCard_cardholder", "get__updateCard_cardholder", "__updateCard_address", "get__updateCard_address", "__updateCard_preferred", "get__updateCard_preferred", "__updateCard_deviceType", "get__updateCard_deviceType", "__updateCard_paypalRequestId", "get__updateCard_paypalRequestId", "__saveCheckoutExperienceUserAction_token", "get__saveCheckoutExperienceUserAction_token", "__saveCheckoutExperienceUserAction_tokenType", "get__saveCheckoutExperienceUserAction_tokenType", "__saveCheckoutExperienceUserAction_userActionInExperience", "get__saveCheckoutExperienceUserAction_userActionInExperience", "__initializeNativeRypCheckout_token", "get__initializeNativeRypCheckout_token", "__initializeNativeRypCheckout_tokenType", "get__initializeNativeRypCheckout_tokenType", "__initializeNativeRypCheckout_country", "get__initializeNativeRypCheckout_country", "__initializeNativeRypCheckout_language", "get__initializeNativeRypCheckout_language", "Lcom/apollographql/apollo/api/ObjectType;", "type", "Lcom/apollographql/apollo/api/ObjectType;", "getType", "()Lcom/apollographql/apollo/api/ObjectType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__addCard_token() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.__addCard_token;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__addCard_card() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.__addCard_card;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__addCard_preferred() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.__addCard_preferred;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__addCard_cardholder() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.__addCard_cardholder;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__addCard_address() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.__addCard_address;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__addCard_deviceType() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.__addCard_deviceType;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__addCard_paypalRequestId() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.__addCard_paypalRequestId;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__approveElectronicConsent_token() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.__approveElectronicConsent_token;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__authorizeBillingAgreementCreation_billingAgreementToken() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.__authorizeBillingAgreementCreation_billingAgreementToken;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__authorizeBillingAgreementCreation_authorizeBillingAgreementCreationRequest() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.__authorizeBillingAgreementCreation_authorizeBillingAgreementCreationRequest;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateCard_token() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.__updateCard_token;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateCard_cardUpdate() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.__updateCard_cardUpdate;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateCard_cardholder() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.__updateCard_cardholder;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateCard_address() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.__updateCard_address;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateCard_preferred() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.__updateCard_preferred;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateCard_deviceType() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.__updateCard_deviceType;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__updateCard_paypalRequestId() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.__updateCard_paypalRequestId;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__saveCheckoutExperienceUserAction_token() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.__saveCheckoutExperienceUserAction_token;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__saveCheckoutExperienceUserAction_tokenType() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.__saveCheckoutExperienceUserAction_tokenType;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__saveCheckoutExperienceUserAction_userActionInExperience() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.__saveCheckoutExperienceUserAction_userActionInExperience;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__initializeNativeRypCheckout_token() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.__initializeNativeRypCheckout_token;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__initializeNativeRypCheckout_tokenType() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.__initializeNativeRypCheckout_tokenType;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__initializeNativeRypCheckout_country() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.__initializeNativeRypCheckout_country;
        }

        public final com.apollographql.apollo.api.CompiledArgumentDefinition get__initializeNativeRypCheckout_language() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.__initializeNativeRypCheckout_language;
        }

        public final com.apollographql.apollo.api.ObjectType getType() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalMutation.type;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
