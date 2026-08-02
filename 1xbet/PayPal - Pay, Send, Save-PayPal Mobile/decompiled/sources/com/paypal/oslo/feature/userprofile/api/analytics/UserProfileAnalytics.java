package com.paypal.oslo.feature.userprofile.api.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\b\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/analytics/UserProfileAnalytics;", "", "<init>", "()V", "", "PRODUCT", "Ljava/lang/String;", "AddressManagement", "PhotoManagement", "EmailManagement", "PhoneManagement", "CommonErrorCodes", "Actions", "Sources", "ErrorTypes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UserProfileAnalytics {
    public static final com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics INSTANCE = new com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics();
    public static final java.lang.String PRODUCT = "user_profile";

    private UserProfileAnalytics() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/analytics/UserProfileAnalytics$AddressManagement;", "", "<init>", "()V", "", "FEATURE", "Ljava/lang/String;", "SCREEN_ADDRESS_LIST", "SCREEN_ADD_ADDRESS", "SCREEN_EDIT_ADDRESS", "SCREEN_ADDRESS_ADD_EDIT", "SCREEN_ADDRESS_LEAVE_CONFIRMATION", "ErrorCodes", "UiNames"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AddressManagement {
        public static final java.lang.String FEATURE = "address_management";
        public static final com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.AddressManagement INSTANCE = new com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.AddressManagement();
        public static final java.lang.String SCREEN_ADDRESS_ADD_EDIT = "address_add_edit";
        public static final java.lang.String SCREEN_ADDRESS_LEAVE_CONFIRMATION = "address_leave_confirmation_sheet";
        public static final java.lang.String SCREEN_ADDRESS_LIST = "address_list";
        public static final java.lang.String SCREEN_ADD_ADDRESS = "add_address";
        public static final java.lang.String SCREEN_EDIT_ADDRESS = "edit_address";

        private AddressManagement() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/analytics/UserProfileAnalytics$AddressManagement$ErrorCodes;", "", "<init>", "()V", "", "LAYOUT_LOAD_FAILED", "Ljava/lang/String;", "VALIDATION_FAILED", "VALIDATION_UNKNOWN_ERROR", "CONTAINS_PO_BOX_OR_RURAL_ROUTE", "SAVE_NETWORK_ERROR", "SAVE_SERVER_ERROR", "LIST_LOAD_FAILED"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ErrorCodes {
            public static final java.lang.String CONTAINS_PO_BOX_OR_RURAL_ROUTE = "address_contains_po_box_or_rural_route";
            public static final com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.AddressManagement.ErrorCodes INSTANCE = new com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.AddressManagement.ErrorCodes();
            public static final java.lang.String LAYOUT_LOAD_FAILED = "address_layout_load_failed";
            public static final java.lang.String LIST_LOAD_FAILED = "address_list_load_failed";
            public static final java.lang.String SAVE_NETWORK_ERROR = "address_save_network_error";
            public static final java.lang.String SAVE_SERVER_ERROR = "address_save_server_error";
            public static final java.lang.String VALIDATION_FAILED = "address_validation_failed";
            public static final java.lang.String VALIDATION_UNKNOWN_ERROR = "address_validation_unknown_error";

            private ErrorCodes() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/analytics/UserProfileAnalytics$AddressManagement$UiNames;", "", "<init>", "()V", "", "ADD_ADDRESS_BUTTON", "Ljava/lang/String;", "SAVE_BUTTON", "CONFIRM_BUTTON", "CANCEL_BUTTON", "ADDRESS_SAVE_ERROR_BANNER", "ADD_ADDRESS_SUCCESS_TOAST", "ADDRESS_LIST_ITEM"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class UiNames {
            public static final java.lang.String ADDRESS_LIST_ITEM = "address_list_item";
            public static final java.lang.String ADDRESS_SAVE_ERROR_BANNER = "address_save_error_banner";
            public static final java.lang.String ADD_ADDRESS_BUTTON = "add_address_button";
            public static final java.lang.String ADD_ADDRESS_SUCCESS_TOAST = "add_address_success_toast";
            public static final java.lang.String CANCEL_BUTTON = "save_button";
            public static final java.lang.String CONFIRM_BUTTON = "leave_button";
            public static final com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.AddressManagement.UiNames INSTANCE = new com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.AddressManagement.UiNames();
            public static final java.lang.String SAVE_BUTTON = "save_button";

            private UiNames() {
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/analytics/UserProfileAnalytics$PhotoManagement;", "", "<init>", "()V", "", "FEATURE", "Ljava/lang/String;", "SCREEN_PHOTO_OPTIONS", "SCREEN_PHOTO_DELETE_CONFIRMATION", "ErrorCodes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PhotoManagement {
        public static final java.lang.String FEATURE = "photo_management";
        public static final com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhotoManagement INSTANCE = new com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhotoManagement();
        public static final java.lang.String SCREEN_PHOTO_DELETE_CONFIRMATION = "photo_delete_confirmation";
        public static final java.lang.String SCREEN_PHOTO_OPTIONS = "photo_options";

        private PhotoManagement() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/analytics/UserProfileAnalytics$PhotoManagement$ErrorCodes;", "", "<init>", "()V", "", "UPLOAD_FAILED", "Ljava/lang/String;", "UPLOAD_UGCM_FAILED", "UPLOAD_FILE_TOO_LARGE", "UPLOAD_DMS_FAILED", "DELETE_FAILED"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ErrorCodes {
            public static final java.lang.String DELETE_FAILED = "photo_delete_failed";
            public static final com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhotoManagement.ErrorCodes INSTANCE = new com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhotoManagement.ErrorCodes();
            public static final java.lang.String UPLOAD_DMS_FAILED = "photo_upload_dms_failed";
            public static final java.lang.String UPLOAD_FAILED = "photo_upload_failed";
            public static final java.lang.String UPLOAD_FILE_TOO_LARGE = "photo_upload_file_too_large";
            public static final java.lang.String UPLOAD_UGCM_FAILED = "photo_upload_ugcm_failed";

            private ErrorCodes() {
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/analytics/UserProfileAnalytics$EmailManagement;", "", "<init>", "()V", "", "FEATURE", "Ljava/lang/String;", "SCREEN_EMAIL_LIST", "SCREEN_ADD_EMAIL", "SCREEN_EDIT_EMAIL", "SCREEN_CONFIRM_EMAIL", "SCREEN_DELETE_EMAIL", "SCREEN_MAKE_PRIMARY_EMAIL", "ErrorCodes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EmailManagement {
        public static final java.lang.String FEATURE = "email_management";
        public static final com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.EmailManagement INSTANCE = new com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.EmailManagement();
        public static final java.lang.String SCREEN_ADD_EMAIL = "add_email";
        public static final java.lang.String SCREEN_CONFIRM_EMAIL = "confirm_email";
        public static final java.lang.String SCREEN_DELETE_EMAIL = "delete_email";
        public static final java.lang.String SCREEN_EDIT_EMAIL = "edit_email";
        public static final java.lang.String SCREEN_EMAIL_LIST = "email_list";
        public static final java.lang.String SCREEN_MAKE_PRIMARY_EMAIL = "make_primary_email";

        private EmailManagement() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/analytics/UserProfileAnalytics$EmailManagement$ErrorCodes;", "", "<init>", "()V", "", "LIST_LOAD_FAILED", "Ljava/lang/String;", "SAVE_FAILED", "DELETE_FAILED", "MAKE_PRIMARY_FAILED", "CONFIRM_FAILED", "INITIATE_CONFIRMATION_FAILED", "RESEND_CODE_FAILED", "VALIDATION_FAILED", "EMAIL_NOT_FOUND"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ErrorCodes {
            public static final java.lang.String CONFIRM_FAILED = "email_confirm_failed";
            public static final java.lang.String DELETE_FAILED = "email_delete_failed";
            public static final java.lang.String EMAIL_NOT_FOUND = "email_not_found";
            public static final java.lang.String INITIATE_CONFIRMATION_FAILED = "email_initiate_confirmation_failed";
            public static final com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.EmailManagement.ErrorCodes INSTANCE = new com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.EmailManagement.ErrorCodes();
            public static final java.lang.String LIST_LOAD_FAILED = "email_list_load_failed";
            public static final java.lang.String MAKE_PRIMARY_FAILED = "email_make_primary_failed";
            public static final java.lang.String RESEND_CODE_FAILED = "email_resend_code_failed";
            public static final java.lang.String SAVE_FAILED = "email_save_failed";
            public static final java.lang.String VALIDATION_FAILED = "email_validation_failed";

            private ErrorCodes() {
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/analytics/UserProfileAnalytics$PhoneManagement;", "", "<init>", "()V", "", "FEATURE", "Ljava/lang/String;", "SCREEN_PHONE_LIST", "SCREEN_ADD_PHONE", "SCREEN_EDIT_PHONE", "SCREEN_CONFIRM_PHONE", "SCREEN_DELETE_PHONE", "SCREEN_MAKE_PRIMARY_PHONE", "ErrorCodes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PhoneManagement {
        public static final java.lang.String FEATURE = "phone_management";
        public static final com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhoneManagement INSTANCE = new com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhoneManagement();
        public static final java.lang.String SCREEN_ADD_PHONE = "add_phone";
        public static final java.lang.String SCREEN_CONFIRM_PHONE = "confirm_phone";
        public static final java.lang.String SCREEN_DELETE_PHONE = "delete_phone";
        public static final java.lang.String SCREEN_EDIT_PHONE = "edit_phone";
        public static final java.lang.String SCREEN_MAKE_PRIMARY_PHONE = "make_primary_phone";
        public static final java.lang.String SCREEN_PHONE_LIST = "phone_list";

        private PhoneManagement() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/analytics/UserProfileAnalytics$PhoneManagement$ErrorCodes;", "", "<init>", "()V", "", "LIST_LOAD_FAILED", "Ljava/lang/String;", "SAVE_FAILED", "DELETE_FAILED", "MAKE_PRIMARY_FAILED", "CONFIRM_FAILED", "INITIATE_CONFIRMATION_FAILED", "RESEND_CODE_FAILED", "VALIDATION_FAILED", "PHONE_NOT_FOUND", "COUNTRY_LOAD_FAILED", "COUNTRY_NOT_RESOLVED"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ErrorCodes {
            public static final java.lang.String CONFIRM_FAILED = "phone_confirm_failed";
            public static final java.lang.String COUNTRY_LOAD_FAILED = "phone_country_load_failed";
            public static final java.lang.String COUNTRY_NOT_RESOLVED = "phone_country_not_resolved";
            public static final java.lang.String DELETE_FAILED = "phone_delete_failed";
            public static final java.lang.String INITIATE_CONFIRMATION_FAILED = "phone_initiate_confirmation_failed";
            public static final com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhoneManagement.ErrorCodes INSTANCE = new com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhoneManagement.ErrorCodes();
            public static final java.lang.String LIST_LOAD_FAILED = "phone_list_load_failed";
            public static final java.lang.String MAKE_PRIMARY_FAILED = "phone_make_primary_failed";
            public static final java.lang.String PHONE_NOT_FOUND = "phone_not_found";
            public static final java.lang.String RESEND_CODE_FAILED = "phone_resend_code_failed";
            public static final java.lang.String SAVE_FAILED = "phone_save_failed";
            public static final java.lang.String VALIDATION_FAILED = "phone_validation_failed";

            private ErrorCodes() {
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/analytics/UserProfileAnalytics$CommonErrorCodes;", "", "<init>", "()V", "", "FAILED_USER_STORE_LOAD", "Ljava/lang/String;", "RISK_DECLINED"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CommonErrorCodes {
        public static final java.lang.String FAILED_USER_STORE_LOAD = "failed_user_store_load";
        public static final com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.CommonErrorCodes INSTANCE = new com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.CommonErrorCodes();
        public static final java.lang.String RISK_DECLINED = "WALLET_SETTING_RISK_DECLINED";

        private CommonErrorCodes() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/analytics/UserProfileAnalytics$Actions;", "", "<init>", "()V", "", "VIEW", "Ljava/lang/String;", "ADD", "EDIT", com.datadog.android.internal.network.HttpSpec.Method.DELETE, "CONFIRM", "MAKE_PRIMARY", "REPLACE_PRIMARY", "RESEND"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Actions {
        public static final java.lang.String ADD = "add";
        public static final java.lang.String CONFIRM = "confirm";
        public static final java.lang.String DELETE = "delete";
        public static final java.lang.String EDIT = "edit";
        public static final com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions INSTANCE = new com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions();
        public static final java.lang.String MAKE_PRIMARY = "make_primary";
        public static final java.lang.String REPLACE_PRIMARY = "replace_primary";
        public static final java.lang.String RESEND = "resend";
        public static final java.lang.String VIEW = "view";

        private Actions() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/analytics/UserProfileAnalytics$Sources;", "", "<init>", "()V", "", "API_CALL", "Ljava/lang/String;", "WORLD_READY_SDK", "APP_UI", "USER_STORE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Sources {
        public static final java.lang.String API_CALL = "api_call";
        public static final java.lang.String APP_UI = "app_ui";
        public static final com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Sources INSTANCE = new com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Sources();
        public static final java.lang.String USER_STORE = "user_store";
        public static final java.lang.String WORLD_READY_SDK = "world_ready_sdk";

        private Sources() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/analytics/UserProfileAnalytics$ErrorTypes;", "", "<init>", "()V", "", "SYSTEM", "Ljava/lang/String;", com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase.NETWORK_ERROR_CODE, "BUSINESS_RULE", "FIELD_VALIDATION"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ErrorTypes {
        public static final java.lang.String BUSINESS_RULE = "business_rule";
        public static final java.lang.String FIELD_VALIDATION = "field_validation";
        public static final com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.ErrorTypes INSTANCE = new com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.ErrorTypes();
        public static final java.lang.String NETWORK = "network";
        public static final java.lang.String SYSTEM = "system";

        private ErrorTypes() {
        }
    }
}
