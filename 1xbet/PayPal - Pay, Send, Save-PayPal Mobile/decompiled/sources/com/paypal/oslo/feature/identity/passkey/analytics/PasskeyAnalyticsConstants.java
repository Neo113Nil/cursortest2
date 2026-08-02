package com.paypal.oslo.feature.identity.passkey.analytics;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/analytics/PasskeyAnalyticsConstants;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/Product;", "PRODUCT", "Lcom/paypal/oslo/core/telemetry/analytics/schema/Product;", "getPRODUCT", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/Product;", "", "FEATURE", "Ljava/lang/String;", "ItemName", "Management", "Enrollment", com.paypal.oslo.feature.identity.graphql.PasskeyListQuery.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyAnalyticsConstants {
    public static final int $stable = 0;
    public static final java.lang.String FEATURE = "passkey";
    public static final com.paypal.oslo.feature.identity.passkey.analytics.PasskeyAnalyticsConstants INSTANCE = new com.paypal.oslo.feature.identity.passkey.analytics.PasskeyAnalyticsConstants();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.Product PRODUCT = com.paypal.oslo.core.telemetry.analytics.schema.Product.IDENTITY;

    private PasskeyAnalyticsConstants() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.Product getPRODUCT() {
        return PRODUCT;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/analytics/PasskeyAnalyticsConstants$ItemName;", "", "<init>", "()V", "", "ADD_PASSKEY_BUTTON", "Ljava/lang/String;", "HOW_PASSKEYS_WORK_LINK", "DELETE_PASSKEY_BUTTON", "KEEP_PASSKEY_BUTTON", "CONFIRM_DELETE_BUTTON", "ERROR_ACTION_BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ItemName {
        public static final int $stable = 0;
        public static final java.lang.String ADD_PASSKEY_BUTTON = "add_passkey_button";
        public static final java.lang.String CONFIRM_DELETE_BUTTON = "confirm_delete_button";
        public static final java.lang.String DELETE_PASSKEY_BUTTON = "delete_passkey_button";
        public static final java.lang.String ERROR_ACTION_BUTTON = "error_got_it_action_button";
        public static final java.lang.String HOW_PASSKEYS_WORK_LINK = "how_passkeys_work_link";
        public static final com.paypal.oslo.feature.identity.passkey.analytics.PasskeyAnalyticsConstants.ItemName INSTANCE = new com.paypal.oslo.feature.identity.passkey.analytics.PasskeyAnalyticsConstants.ItemName();
        public static final java.lang.String KEEP_PASSKEY_BUTTON = "keep_passkey_button";

        private ItemName() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/analytics/PasskeyAnalyticsConstants$Management;", "", "<init>", "()V", "", "SCREEN_LOADING", "Ljava/lang/String;", "SCREEN_ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Management {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.analytics.PasskeyAnalyticsConstants.Management INSTANCE = new com.paypal.oslo.feature.identity.passkey.analytics.PasskeyAnalyticsConstants.Management();
        public static final java.lang.String SCREEN_ERROR = "passkey_management_error";
        public static final java.lang.String SCREEN_LOADING = "passkey_management_loading";

        private Management() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/analytics/PasskeyAnalyticsConstants$Enrollment;", "", "<init>", "()V", "", "SCREEN_IDLE", "Ljava/lang/String;", "SCREEN_ENROLLING", "SCREEN_ERROR", "SCREEN_SUCCESS"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Enrollment {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.analytics.PasskeyAnalyticsConstants.Enrollment INSTANCE = new com.paypal.oslo.feature.identity.passkey.analytics.PasskeyAnalyticsConstants.Enrollment();
        public static final java.lang.String SCREEN_ENROLLING = "passkey_enrollment_enrolling";
        public static final java.lang.String SCREEN_ERROR = "passkey_enrollment_error";
        public static final java.lang.String SCREEN_IDLE = "passkey_enrollment_idle";
        public static final java.lang.String SCREEN_SUCCESS = "passkey_enrollment_success";

        private Enrollment() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/analytics/PasskeyAnalyticsConstants$PasskeyList;", "", "<init>", "()V", "", "SCREEN_LOADING", "Ljava/lang/String;", "SCREEN_CONTENT", "SCREEN_EMPTY", "SCREEN_ERROR", "SCREEN_CREATE_SUCCESS", "SCREEN_DELETE_SUCCESS", "SCREEN_DELETE_CONFIRMATION"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PasskeyList {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.analytics.PasskeyAnalyticsConstants.PasskeyList INSTANCE = new com.paypal.oslo.feature.identity.passkey.analytics.PasskeyAnalyticsConstants.PasskeyList();
        public static final java.lang.String SCREEN_CONTENT = "passkey_list_content";
        public static final java.lang.String SCREEN_CREATE_SUCCESS = "passkey_list_create_success";
        public static final java.lang.String SCREEN_DELETE_CONFIRMATION = "passkey_list_delete_confirmation";
        public static final java.lang.String SCREEN_DELETE_SUCCESS = "passkey_list_delete_success";
        public static final java.lang.String SCREEN_EMPTY = "passkey_list_empty";
        public static final java.lang.String SCREEN_ERROR = "passkey_list_error";
        public static final java.lang.String SCREEN_LOADING = "passkey_list_loading";

        private PasskeyList() {
        }
    }
}
