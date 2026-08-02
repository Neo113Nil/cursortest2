package com.paypal.oslo.feature.inappcheckout.domain.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/EventProperty;", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/EventPropertyKey;", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/EventPropertyKey;Ljava/lang/Object;)V", "Lkotlin/Pair;", "", "toPair", "()Lkotlin/Pair;", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/EventPropertyKey;", "component2", "()Ljava/lang/Object;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/EventPropertyKey;Ljava/lang/Object;)Lcom/paypal/oslo/feature/inappcheckout/domain/model/EventProperty;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/EventPropertyKey;", "getKey", "Ljava/lang/Object;", "getValue", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EventProperty {
    private final com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey key;
    private final java.lang.Object value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.Companion INSTANCE = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.Companion(null);
    public static final int $stable = 8;
    private static final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty IN_APP_CHECKOUT_PRODUCT = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.Product, "InAppCheckout");
    private static final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty CHECKOUT_SPACE_KEY = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.SpaceKey, "SKS09G");
    private static final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty NATIVE_EXPERIENCE_TYPE = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.ExperienceType, "native");
    private static final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty CHECKOUT_FEED_NAME = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.FeedName, "consapp");
    private static final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty CHECKOUT_CONTEXT_TYPE = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.ContextType, "BA-token");
    private static final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty BILLING_XO_PRODUCT = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.XOProduct, "billing");
    private static final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty EXPRESS_CHECKOUT_XO_PRODUCT = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.XOProduct, "onetime");
    private static final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty VAULT_SETUP_TOKEN_XO_PRODUCT = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.XOProduct, "billing");
    private static final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty XO_WEB_ENTRY_POINT = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.XOEntryPoint, "mWeb");
    private static final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty XO_NATIVE_APP_ENTRY_POINT = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.XOEntryPoint, "Merchant app");
    private static final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty OUTCOME_SUCCESS = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.Outcome, "success");
    private static final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty OUTCOME_FAILURE = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.Outcome, com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE);
    private static final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty FAILURE_UNABLE_TO_DECODE_TOKEN = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.FailureReason, "unable to decode token query param");
    private static final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty GET_BA_ERROR_DESCRIPTION = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.ErrorDescription, "Get BA - failure response");
    private static final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty GET_EC_ERROR_DESCRIPTION = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.ErrorDescription, "Get EC - failure response");
    private static final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty GET_VAULT_SETUP_TOKEN_ERROR_DESCRIPTION = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.ErrorDescription, "Get Vault Setup Token - failure response");
    private static final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty GET_FROM_NULL_TOKEN_ERROR_DESCRIPTION = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.ErrorDescription, "Get null token - failure response");
    private static final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty NO_APPROVAL_URL_ERROR_DESCRIPTION = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.ErrorDescription, "Get Token - success response, but Checkout URL approval link is null");
    private static final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty SAVE_CANCEL_CHECKOUT_EXPERIENCE_SUCCESS_REQUEST = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.Request, "success");
    private static final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty SAVE_CANCEL_CHECKOUT_EXPERIENCE_FAILURE_REQUEST = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.Request, com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE);
    private static final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty MERCHANT_UPGRADE_PATH = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.MerchantPath, com.paypal.oslo.feature.inappcheckout.Constants.MERCHANT_PATH_MU);
    private static final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty NO_MERCHANT_UPGRADE_PATH = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.MerchantPath, com.paypal.oslo.feature.inappcheckout.Constants.MERCHANT_PATH_NOMU);
    private static final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty HOME_BACKGROUND_TIMEOUT_OUTCOME_PROCEEDED = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.Outcome, "proceeded");
    private static final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty HOME_BACKGROUND_TIMEOUT_OUTCOME_SKIPPED = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.Outcome, com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.FlowOutcome.SKIPPED);

    public EventProperty(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey eventPropertyKey, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventPropertyKey, "");
        this.key = eventPropertyKey;
        this.value = obj;
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey getKey() {
        return this.key;
    }

    public final java.lang.Object getValue() {
        return this.value;
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> toPair() {
        java.lang.String keyName = this.key.getKeyName();
        java.lang.Object obj = this.value;
        return kotlin.TuplesKt.to(keyName, obj != null ? obj.toString() : null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b2\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u001a\u0010%\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u001a\u0010)\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR\u001a\u0010+\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u001a\u0010/\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\bR\u001a\u00101\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u001a\u00105\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/EventProperty$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/EventProperty;", "IN_APP_CHECKOUT_PRODUCT", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/EventProperty;", "getIN_APP_CHECKOUT_PRODUCT", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/EventProperty;", "CHECKOUT_SPACE_KEY", "getCHECKOUT_SPACE_KEY", "NATIVE_EXPERIENCE_TYPE", "getNATIVE_EXPERIENCE_TYPE", "CHECKOUT_FEED_NAME", "getCHECKOUT_FEED_NAME", "CHECKOUT_CONTEXT_TYPE", "getCHECKOUT_CONTEXT_TYPE", "BILLING_XO_PRODUCT", "getBILLING_XO_PRODUCT", "EXPRESS_CHECKOUT_XO_PRODUCT", "getEXPRESS_CHECKOUT_XO_PRODUCT", "VAULT_SETUP_TOKEN_XO_PRODUCT", "getVAULT_SETUP_TOKEN_XO_PRODUCT", "XO_WEB_ENTRY_POINT", "getXO_WEB_ENTRY_POINT", "XO_NATIVE_APP_ENTRY_POINT", "getXO_NATIVE_APP_ENTRY_POINT", "OUTCOME_SUCCESS", "getOUTCOME_SUCCESS", "OUTCOME_FAILURE", "getOUTCOME_FAILURE", "FAILURE_UNABLE_TO_DECODE_TOKEN", "getFAILURE_UNABLE_TO_DECODE_TOKEN", "GET_BA_ERROR_DESCRIPTION", "getGET_BA_ERROR_DESCRIPTION", "GET_EC_ERROR_DESCRIPTION", "getGET_EC_ERROR_DESCRIPTION", "GET_VAULT_SETUP_TOKEN_ERROR_DESCRIPTION", "getGET_VAULT_SETUP_TOKEN_ERROR_DESCRIPTION", "GET_FROM_NULL_TOKEN_ERROR_DESCRIPTION", "getGET_FROM_NULL_TOKEN_ERROR_DESCRIPTION", "NO_APPROVAL_URL_ERROR_DESCRIPTION", "getNO_APPROVAL_URL_ERROR_DESCRIPTION", "SAVE_CANCEL_CHECKOUT_EXPERIENCE_SUCCESS_REQUEST", "getSAVE_CANCEL_CHECKOUT_EXPERIENCE_SUCCESS_REQUEST", "SAVE_CANCEL_CHECKOUT_EXPERIENCE_FAILURE_REQUEST", "getSAVE_CANCEL_CHECKOUT_EXPERIENCE_FAILURE_REQUEST", "MERCHANT_UPGRADE_PATH", "getMERCHANT_UPGRADE_PATH", "NO_MERCHANT_UPGRADE_PATH", "getNO_MERCHANT_UPGRADE_PATH", "HOME_BACKGROUND_TIMEOUT_OUTCOME_PROCEEDED", "getHOME_BACKGROUND_TIMEOUT_OUTCOME_PROCEEDED", "HOME_BACKGROUND_TIMEOUT_OUTCOME_SKIPPED", "getHOME_BACKGROUND_TIMEOUT_OUTCOME_SKIPPED"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty getIN_APP_CHECKOUT_PRODUCT() {
            return com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.IN_APP_CHECKOUT_PRODUCT;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty getCHECKOUT_SPACE_KEY() {
            return com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.CHECKOUT_SPACE_KEY;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty getNATIVE_EXPERIENCE_TYPE() {
            return com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.NATIVE_EXPERIENCE_TYPE;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty getCHECKOUT_FEED_NAME() {
            return com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.CHECKOUT_FEED_NAME;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty getCHECKOUT_CONTEXT_TYPE() {
            return com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.CHECKOUT_CONTEXT_TYPE;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty getBILLING_XO_PRODUCT() {
            return com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.BILLING_XO_PRODUCT;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty getEXPRESS_CHECKOUT_XO_PRODUCT() {
            return com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.EXPRESS_CHECKOUT_XO_PRODUCT;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty getVAULT_SETUP_TOKEN_XO_PRODUCT() {
            return com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.VAULT_SETUP_TOKEN_XO_PRODUCT;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty getXO_WEB_ENTRY_POINT() {
            return com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.XO_WEB_ENTRY_POINT;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty getXO_NATIVE_APP_ENTRY_POINT() {
            return com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.XO_NATIVE_APP_ENTRY_POINT;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty getOUTCOME_SUCCESS() {
            return com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.OUTCOME_SUCCESS;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty getOUTCOME_FAILURE() {
            return com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.OUTCOME_FAILURE;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty getFAILURE_UNABLE_TO_DECODE_TOKEN() {
            return com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.FAILURE_UNABLE_TO_DECODE_TOKEN;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty getGET_BA_ERROR_DESCRIPTION() {
            return com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.GET_BA_ERROR_DESCRIPTION;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty getGET_EC_ERROR_DESCRIPTION() {
            return com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.GET_EC_ERROR_DESCRIPTION;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty getGET_VAULT_SETUP_TOKEN_ERROR_DESCRIPTION() {
            return com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.GET_VAULT_SETUP_TOKEN_ERROR_DESCRIPTION;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty getGET_FROM_NULL_TOKEN_ERROR_DESCRIPTION() {
            return com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.GET_FROM_NULL_TOKEN_ERROR_DESCRIPTION;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty getNO_APPROVAL_URL_ERROR_DESCRIPTION() {
            return com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.NO_APPROVAL_URL_ERROR_DESCRIPTION;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty getSAVE_CANCEL_CHECKOUT_EXPERIENCE_SUCCESS_REQUEST() {
            return com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.SAVE_CANCEL_CHECKOUT_EXPERIENCE_SUCCESS_REQUEST;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty getSAVE_CANCEL_CHECKOUT_EXPERIENCE_FAILURE_REQUEST() {
            return com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.SAVE_CANCEL_CHECKOUT_EXPERIENCE_FAILURE_REQUEST;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty getMERCHANT_UPGRADE_PATH() {
            return com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.MERCHANT_UPGRADE_PATH;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty getNO_MERCHANT_UPGRADE_PATH() {
            return com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.NO_MERCHANT_UPGRADE_PATH;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty getHOME_BACKGROUND_TIMEOUT_OUTCOME_PROCEEDED() {
            return com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.HOME_BACKGROUND_TIMEOUT_OUTCOME_PROCEEDED;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty getHOME_BACKGROUND_TIMEOUT_OUTCOME_SKIPPED() {
            return com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.HOME_BACKGROUND_TIMEOUT_OUTCOME_SKIPPED;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey eventPropertyKey = this.key;
        java.lang.Object obj = this.value;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EventProperty(key=");
        sb.append(eventPropertyKey);
        sb.append(", value=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.key.hashCode();
        java.lang.Object obj = this.value;
        return (hashCode * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty eventProperty = (com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty) other;
        return this.key == eventProperty.key && kotlin.jvm.internal.Intrinsics.areEqual(this.value, eventProperty.value);
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty copy(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey key, java.lang.Object value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty(key, value);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getValue() {
        return this.value;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey getKey() {
        return this.key;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty copy$default(com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty eventProperty, com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey eventPropertyKey, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            eventPropertyKey = eventProperty.key;
        }
        if ((i & 2) != 0) {
            obj = eventProperty.value;
        }
        return eventProperty.copy(eventPropertyKey, obj);
    }
}
