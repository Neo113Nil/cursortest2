package com.plaid.link.result;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u000f2\u00020\u0001:\u0010\u0010\u0011\u0012\u000f\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001eB\u001b\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\t\u0082\u0001\u000f\u001f !\"#$%&'()*+,-"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode;", "Landroid/os/Parcelable;", "", "json", "Lcom/plaid/link/result/LinkErrorType;", "errorType", "<init>", "(Ljava/lang/String;Lcom/plaid/link/result/LinkErrorType;)V", "toString", "()Ljava/lang/String;", "Lcom/plaid/link/result/LinkErrorType;", "getErrorType", "()Lcom/plaid/link/result/LinkErrorType;", "Ljava/lang/String;", "getJson", "Companion", "ApiError", "AssetReport", "BankTransferError", "DepositSwitchError", "INTERNAL_ERROR", "InstitutionError", "InvalidInput", "InvalidRequest", "ItemError", "OAuthError", "PaymentError", "RateLimit", "RecaptchaError", "SandboxError", "UNKNOWN", "Lcom/plaid/link/result/LinkErrorCode$ApiError;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError;", "Lcom/plaid/link/result/LinkErrorCode$INTERNAL_ERROR;", "Lcom/plaid/link/result/LinkErrorCode$InstitutionError;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "Lcom/plaid/link/result/LinkErrorCode$OAuthError;", "Lcom/plaid/link/result/LinkErrorCode$PaymentError;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit;", "Lcom/plaid/link/result/LinkErrorCode$RecaptchaError;", "Lcom/plaid/link/result/LinkErrorCode$SandboxError;", "Lcom/plaid/link/result/LinkErrorCode$UNKNOWN;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class LinkErrorCode implements android.os.Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.plaid.link.result.LinkErrorCode.Companion INSTANCE = new com.plaid.link.result.LinkErrorCode.Companion(null);
    private static final kotlin.Lazy<java.util.Map<java.lang.String, com.plaid.link.result.LinkErrorCode>> jsonToObject$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.util.Map<java.lang.String, ? extends com.plaid.link.result.LinkErrorCode>>() { // from class: com.plaid.link.result.LinkErrorCode$Companion$jsonToObject$2
        @Override // kotlin.jvm.functions.Function0
        public final java.util.Map<java.lang.String, ? extends com.plaid.link.result.LinkErrorCode> invoke() {
            com.plaid.link.result.LinkErrorCode.InvalidRequest.MISSING_FIELDS missing_fields = com.plaid.link.result.LinkErrorCode.InvalidRequest.MISSING_FIELDS.INSTANCE;
            kotlin.Pair pair = kotlin.TuplesKt.to(missing_fields.getJson(), missing_fields);
            com.plaid.link.result.LinkErrorCode.InvalidRequest.UNKNOWN_FIELDS unknown_fields = com.plaid.link.result.LinkErrorCode.InvalidRequest.UNKNOWN_FIELDS.INSTANCE;
            kotlin.Pair pair2 = kotlin.TuplesKt.to(unknown_fields.getJson(), unknown_fields);
            com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_FIELD invalid_field = com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_FIELD.INSTANCE;
            kotlin.Pair pair3 = kotlin.TuplesKt.to(invalid_field.getJson(), invalid_field);
            com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_CONFIGURATION invalid_configuration = com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_CONFIGURATION.INSTANCE;
            kotlin.Pair pair4 = kotlin.TuplesKt.to(invalid_configuration.getJson(), invalid_configuration);
            com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_BODY invalid_body = com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_BODY.INSTANCE;
            kotlin.Pair pair5 = kotlin.TuplesKt.to(invalid_body.getJson(), invalid_body);
            com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_HEADERS invalid_headers = com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_HEADERS.INSTANCE;
            kotlin.Pair pair6 = kotlin.TuplesKt.to(invalid_headers.getJson(), invalid_headers);
            com.plaid.link.result.LinkErrorCode.InvalidRequest.NOT_FOUND not_found = com.plaid.link.result.LinkErrorCode.InvalidRequest.NOT_FOUND.INSTANCE;
            kotlin.Pair pair7 = kotlin.TuplesKt.to(not_found.getJson(), not_found);
            com.plaid.link.result.LinkErrorCode.InvalidRequest.SANDBOX_ONLY sandbox_only = com.plaid.link.result.LinkErrorCode.InvalidRequest.SANDBOX_ONLY.INSTANCE;
            kotlin.Pair pair8 = kotlin.TuplesKt.to(sandbox_only.getJson(), sandbox_only);
            com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_API_KEYS invalid_api_keys = com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_API_KEYS.INSTANCE;
            kotlin.Pair pair9 = kotlin.TuplesKt.to(invalid_api_keys.getJson(), invalid_api_keys);
            com.plaid.link.result.LinkErrorCode.InvalidInput.UNAUTHORIZED_ENVIRONMENT unauthorized_environment = com.plaid.link.result.LinkErrorCode.InvalidInput.UNAUTHORIZED_ENVIRONMENT.INSTANCE;
            kotlin.Pair pair10 = kotlin.TuplesKt.to(unauthorized_environment.getJson(), unauthorized_environment);
            com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_ACCESS_TOKEN invalid_access_token = com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_ACCESS_TOKEN.INSTANCE;
            kotlin.Pair pair11 = kotlin.TuplesKt.to(invalid_access_token.getJson(), invalid_access_token);
            com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PUBLIC_TOKEN invalid_public_token = com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PUBLIC_TOKEN.INSTANCE;
            kotlin.Pair pair12 = kotlin.TuplesKt.to(invalid_public_token.getJson(), invalid_public_token);
            com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PRODUCTS invalid_products = com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PRODUCTS.INSTANCE;
            kotlin.Pair pair13 = kotlin.TuplesKt.to(invalid_products.getJson(), invalid_products);
            com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_ACCOUNT_ID invalid_account_id = com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_ACCOUNT_ID.INSTANCE;
            kotlin.Pair pair14 = kotlin.TuplesKt.to(invalid_account_id.getJson(), invalid_account_id);
            com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_INSTITUTION invalid_institution = com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_INSTITUTION.INSTANCE;
            kotlin.Pair pair15 = kotlin.TuplesKt.to(invalid_institution.getJson(), invalid_institution);
            com.plaid.link.result.LinkErrorCode.InvalidInput.TOO_MANY_VERIFICATION_ATTEMPTS too_many_verification_attempts = com.plaid.link.result.LinkErrorCode.InvalidInput.TOO_MANY_VERIFICATION_ATTEMPTS.INSTANCE;
            kotlin.Pair pair16 = kotlin.TuplesKt.to(too_many_verification_attempts.getJson(), too_many_verification_attempts);
            com.plaid.link.result.LinkErrorCode.InvalidInput.INCORRECT_DEPOSIT_AMOUNTS incorrect_deposit_amounts = com.plaid.link.result.LinkErrorCode.InvalidInput.INCORRECT_DEPOSIT_AMOUNTS.INSTANCE;
            kotlin.Pair pair17 = kotlin.TuplesKt.to(incorrect_deposit_amounts.getJson(), incorrect_deposit_amounts);
            com.plaid.link.result.LinkErrorCode.InvalidInput.USER_PERMISSION_REVOKED user_permission_revoked = com.plaid.link.result.LinkErrorCode.InvalidInput.USER_PERMISSION_REVOKED.INSTANCE;
            kotlin.Pair pair18 = kotlin.TuplesKt.to(user_permission_revoked.getJson(), user_permission_revoked);
            com.plaid.link.result.LinkErrorCode.InvalidInput.UNAUTHORIZED_ROUTE_ACCESS unauthorized_route_access = com.plaid.link.result.LinkErrorCode.InvalidInput.UNAUTHORIZED_ROUTE_ACCESS.INSTANCE;
            kotlin.Pair pair19 = kotlin.TuplesKt.to(unauthorized_route_access.getJson(), unauthorized_route_access);
            com.plaid.link.result.LinkErrorCode.InvalidInput.DIRECT_INTEGRATION_NOT_ENABLED direct_integration_not_enabled = com.plaid.link.result.LinkErrorCode.InvalidInput.DIRECT_INTEGRATION_NOT_ENABLED.INSTANCE;
            kotlin.Pair pair20 = kotlin.TuplesKt.to(direct_integration_not_enabled.getJson(), direct_integration_not_enabled);
            com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_LINK_TOKEN invalid_link_token = com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_LINK_TOKEN.INSTANCE;
            kotlin.Pair pair21 = kotlin.TuplesKt.to(invalid_link_token.getJson(), invalid_link_token);
            com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PROCESSOR_TOKEN invalid_processor_token = com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PROCESSOR_TOKEN.INSTANCE;
            kotlin.Pair pair22 = kotlin.TuplesKt.to(invalid_processor_token.getJson(), invalid_processor_token);
            com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_AUDIT_COPY_TOKEN invalid_audit_copy_token = com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_AUDIT_COPY_TOKEN.INSTANCE;
            kotlin.Pair pair23 = kotlin.TuplesKt.to(invalid_audit_copy_token.getJson(), invalid_audit_copy_token);
            com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_STRIPE_ACCOUNT invalid_stripe_account = com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_STRIPE_ACCOUNT.INSTANCE;
            kotlin.Pair pair24 = kotlin.TuplesKt.to(invalid_stripe_account.getJson(), invalid_stripe_account);
            com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_CREDENTIAL_FIELDS invalid_credential_fields = com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_CREDENTIAL_FIELDS.INSTANCE;
            kotlin.Pair pair25 = kotlin.TuplesKt.to(invalid_credential_fields.getJson(), invalid_credential_fields);
            com.plaid.link.result.LinkErrorCode.InvalidInput.PRODUCT_UNAVAILABLE product_unavailable = com.plaid.link.result.LinkErrorCode.InvalidInput.PRODUCT_UNAVAILABLE.INSTANCE;
            kotlin.Pair pair26 = kotlin.TuplesKt.to(product_unavailable.getJson(), product_unavailable);
            com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_WEBHOOK_VERIFICATION_KEY_ID invalid_webhook_verification_key_id = com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_WEBHOOK_VERIFICATION_KEY_ID.INSTANCE;
            kotlin.Pair pair27 = kotlin.TuplesKt.to(invalid_webhook_verification_key_id.getJson(), invalid_webhook_verification_key_id);
            com.plaid.link.result.LinkErrorCode.RateLimit.ACCOUNTS_LIMIT accounts_limit = com.plaid.link.result.LinkErrorCode.RateLimit.ACCOUNTS_LIMIT.INSTANCE;
            kotlin.Pair pair28 = kotlin.TuplesKt.to(accounts_limit.getJson(), accounts_limit);
            com.plaid.link.result.LinkErrorCode.RateLimit.ADDITION_LIMIT addition_limit = com.plaid.link.result.LinkErrorCode.RateLimit.ADDITION_LIMIT.INSTANCE;
            kotlin.Pair pair29 = kotlin.TuplesKt.to(addition_limit.getJson(), addition_limit);
            com.plaid.link.result.LinkErrorCode.RateLimit.AUTH_LIMIT auth_limit = com.plaid.link.result.LinkErrorCode.RateLimit.AUTH_LIMIT.INSTANCE;
            kotlin.Pair pair30 = kotlin.TuplesKt.to(auth_limit.getJson(), auth_limit);
            com.plaid.link.result.LinkErrorCode.RateLimit.IDENTITY_LIMIT identity_limit = com.plaid.link.result.LinkErrorCode.RateLimit.IDENTITY_LIMIT.INSTANCE;
            kotlin.Pair pair31 = kotlin.TuplesKt.to(identity_limit.getJson(), identity_limit);
            com.plaid.link.result.LinkErrorCode.RateLimit.BALANCE_LIMIT balance_limit = com.plaid.link.result.LinkErrorCode.RateLimit.BALANCE_LIMIT.INSTANCE;
            kotlin.Pair pair32 = kotlin.TuplesKt.to(balance_limit.getJson(), balance_limit);
            com.plaid.link.result.LinkErrorCode.RateLimit.ITEM_GET_LIMIT item_get_limit = com.plaid.link.result.LinkErrorCode.RateLimit.ITEM_GET_LIMIT.INSTANCE;
            kotlin.Pair pair33 = kotlin.TuplesKt.to(item_get_limit.getJson(), item_get_limit);
            com.plaid.link.result.LinkErrorCode.RateLimit.RATE_LIMIT rate_limit = com.plaid.link.result.LinkErrorCode.RateLimit.RATE_LIMIT.INSTANCE;
            kotlin.Pair pair34 = kotlin.TuplesKt.to(rate_limit.getJson(), rate_limit);
            com.plaid.link.result.LinkErrorCode.RateLimit.TRANSACTIONS_LIMIT transactions_limit = com.plaid.link.result.LinkErrorCode.RateLimit.TRANSACTIONS_LIMIT.INSTANCE;
            kotlin.Pair pair35 = kotlin.TuplesKt.to(transactions_limit.getJson(), transactions_limit);
            com.plaid.link.result.LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR internal_server_error = com.plaid.link.result.LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR.INSTANCE;
            kotlin.Pair pair36 = kotlin.TuplesKt.to(internal_server_error.getJson(), internal_server_error);
            com.plaid.link.result.LinkErrorCode.ApiError.PLANNED_MAINTENANCE planned_maintenance = com.plaid.link.result.LinkErrorCode.ApiError.PLANNED_MAINTENANCE.INSTANCE;
            kotlin.Pair pair37 = kotlin.TuplesKt.to(planned_maintenance.getJson(), planned_maintenance);
            com.plaid.link.result.LinkErrorCode.ItemError.INSUFFICIENT_CREDENTIALS insufficient_credentials = com.plaid.link.result.LinkErrorCode.ItemError.INSUFFICIENT_CREDENTIALS.INSTANCE;
            kotlin.Pair pair38 = kotlin.TuplesKt.to(insufficient_credentials.getJson(), insufficient_credentials);
            com.plaid.link.result.LinkErrorCode.ItemError.INVALID_CREDENTIALS invalid_credentials = com.plaid.link.result.LinkErrorCode.ItemError.INVALID_CREDENTIALS.INSTANCE;
            kotlin.Pair pair39 = kotlin.TuplesKt.to(invalid_credentials.getJson(), invalid_credentials);
            com.plaid.link.result.LinkErrorCode.ItemError.INVALID_MFA invalid_mfa = com.plaid.link.result.LinkErrorCode.ItemError.INVALID_MFA.INSTANCE;
            kotlin.Pair pair40 = kotlin.TuplesKt.to(invalid_mfa.getJson(), invalid_mfa);
            com.plaid.link.result.LinkErrorCode.ItemError.INVALID_SEND_METHOD invalid_send_method = com.plaid.link.result.LinkErrorCode.ItemError.INVALID_SEND_METHOD.INSTANCE;
            kotlin.Pair pair41 = kotlin.TuplesKt.to(invalid_send_method.getJson(), invalid_send_method);
            com.plaid.link.result.LinkErrorCode.ItemError.INVALID_UPDATE_USERNAME invalid_update_username = com.plaid.link.result.LinkErrorCode.ItemError.INVALID_UPDATE_USERNAME.INSTANCE;
            kotlin.Pair pair42 = kotlin.TuplesKt.to(invalid_update_username.getJson(), invalid_update_username);
            com.plaid.link.result.LinkErrorCode.ItemError.ITEM_LOCKED item_locked = com.plaid.link.result.LinkErrorCode.ItemError.ITEM_LOCKED.INSTANCE;
            kotlin.Pair pair43 = kotlin.TuplesKt.to(item_locked.getJson(), item_locked);
            com.plaid.link.result.LinkErrorCode.ItemError.ITEM_LOGIN_REQUIRED item_login_required = com.plaid.link.result.LinkErrorCode.ItemError.ITEM_LOGIN_REQUIRED.INSTANCE;
            kotlin.Pair pair44 = kotlin.TuplesKt.to(item_login_required.getJson(), item_login_required);
            com.plaid.link.result.LinkErrorCode.ItemError.ITEM_NO_ERROR item_no_error = com.plaid.link.result.LinkErrorCode.ItemError.ITEM_NO_ERROR.INSTANCE;
            kotlin.Pair pair45 = kotlin.TuplesKt.to(item_no_error.getJson(), item_no_error);
            kotlin.Pair pair46 = kotlin.TuplesKt.to("item-no-error", item_no_error);
            com.plaid.link.result.LinkErrorCode.ItemError.ITEM_NOT_SUPPORTED item_not_supported = com.plaid.link.result.LinkErrorCode.ItemError.ITEM_NOT_SUPPORTED.INSTANCE;
            kotlin.Pair pair47 = kotlin.TuplesKt.to(item_not_supported.getJson(), item_not_supported);
            com.plaid.link.result.LinkErrorCode.ItemError.USER_SETUP_REQUIRED user_setup_required = com.plaid.link.result.LinkErrorCode.ItemError.USER_SETUP_REQUIRED.INSTANCE;
            kotlin.Pair pair48 = kotlin.TuplesKt.to(user_setup_required.getJson(), user_setup_required);
            com.plaid.link.result.LinkErrorCode.ItemError.MFA_NOT_SUPPORTED mfa_not_supported = com.plaid.link.result.LinkErrorCode.ItemError.MFA_NOT_SUPPORTED.INSTANCE;
            kotlin.Pair pair49 = kotlin.TuplesKt.to(mfa_not_supported.getJson(), mfa_not_supported);
            com.plaid.link.result.LinkErrorCode.ItemError.NO_ACCOUNTS no_accounts = com.plaid.link.result.LinkErrorCode.ItemError.NO_ACCOUNTS.INSTANCE;
            kotlin.Pair pair50 = kotlin.TuplesKt.to(no_accounts.getJson(), no_accounts);
            com.plaid.link.result.LinkErrorCode.ItemError.NO_AUTH_ACCOUNTS no_auth_accounts = com.plaid.link.result.LinkErrorCode.ItemError.NO_AUTH_ACCOUNTS.INSTANCE;
            kotlin.Pair pair51 = kotlin.TuplesKt.to(no_auth_accounts.getJson(), no_auth_accounts);
            kotlin.Pair pair52 = kotlin.TuplesKt.to("no-depository-accounts", no_auth_accounts);
            com.plaid.link.result.LinkErrorCode.ItemError.NO_INVESTMENT_ACCOUNTS no_investment_accounts = com.plaid.link.result.LinkErrorCode.ItemError.NO_INVESTMENT_ACCOUNTS.INSTANCE;
            kotlin.Pair pair53 = kotlin.TuplesKt.to(no_investment_accounts.getJson(), no_investment_accounts);
            com.plaid.link.result.LinkErrorCode.ItemError.NO_LIABILITY_ACCOUNTS no_liability_accounts = com.plaid.link.result.LinkErrorCode.ItemError.NO_LIABILITY_ACCOUNTS.INSTANCE;
            kotlin.Pair pair54 = kotlin.TuplesKt.to(no_liability_accounts.getJson(), no_liability_accounts);
            com.plaid.link.result.LinkErrorCode.ItemError.PRODUCT_NOT_READY product_not_ready = com.plaid.link.result.LinkErrorCode.ItemError.PRODUCT_NOT_READY.INSTANCE;
            kotlin.Pair pair55 = kotlin.TuplesKt.to(product_not_ready.getJson(), product_not_ready);
            com.plaid.link.result.LinkErrorCode.ItemError.PRODUCTS_NOT_SUPPORTED products_not_supported = com.plaid.link.result.LinkErrorCode.ItemError.PRODUCTS_NOT_SUPPORTED.INSTANCE;
            kotlin.Pair pair56 = kotlin.TuplesKt.to(products_not_supported.getJson(), products_not_supported);
            com.plaid.link.result.LinkErrorCode.ItemError.INSTANT_MATCH_FAILED instant_match_failed = com.plaid.link.result.LinkErrorCode.ItemError.INSTANT_MATCH_FAILED.INSTANCE;
            kotlin.Pair pair57 = kotlin.TuplesKt.to(instant_match_failed.getJson(), instant_match_failed);
            com.plaid.link.result.LinkErrorCode.AssetReport.PRODUCT_NOT_ENABLED product_not_enabled = com.plaid.link.result.LinkErrorCode.AssetReport.PRODUCT_NOT_ENABLED.INSTANCE;
            kotlin.Pair pair58 = kotlin.TuplesKt.to(product_not_enabled.getJson(), product_not_enabled);
            com.plaid.link.result.LinkErrorCode.AssetReport.DATA_UNAVAILABLE data_unavailable = com.plaid.link.result.LinkErrorCode.AssetReport.DATA_UNAVAILABLE.INSTANCE;
            kotlin.Pair pair59 = kotlin.TuplesKt.to(data_unavailable.getJson(), data_unavailable);
            com.plaid.link.result.LinkErrorCode.AssetReport.PRODUCT_NOT_READY product_not_ready2 = com.plaid.link.result.LinkErrorCode.AssetReport.PRODUCT_NOT_READY.INSTANCE;
            kotlin.Pair pair60 = kotlin.TuplesKt.to(product_not_ready2.getJson(), product_not_ready2);
            com.plaid.link.result.LinkErrorCode.AssetReport.ASSET_REPORT_GENERATION_FAILED asset_report_generation_failed = com.plaid.link.result.LinkErrorCode.AssetReport.ASSET_REPORT_GENERATION_FAILED.INSTANCE;
            kotlin.Pair pair61 = kotlin.TuplesKt.to(asset_report_generation_failed.getJson(), asset_report_generation_failed);
            com.plaid.link.result.LinkErrorCode.AssetReport.INVALID_PARENT invalid_parent = com.plaid.link.result.LinkErrorCode.AssetReport.INVALID_PARENT.INSTANCE;
            kotlin.Pair pair62 = kotlin.TuplesKt.to(invalid_parent.getJson(), invalid_parent);
            com.plaid.link.result.LinkErrorCode.AssetReport.INSIGHTS_NOT_ENABLED insights_not_enabled = com.plaid.link.result.LinkErrorCode.AssetReport.INSIGHTS_NOT_ENABLED.INSTANCE;
            kotlin.Pair pair63 = kotlin.TuplesKt.to(insights_not_enabled.getJson(), insights_not_enabled);
            com.plaid.link.result.LinkErrorCode.AssetReport.INSIGHTS_PREVIOUSLY_NOT_ENABLED insights_previously_not_enabled = com.plaid.link.result.LinkErrorCode.AssetReport.INSIGHTS_PREVIOUSLY_NOT_ENABLED.INSTANCE;
            kotlin.Pair pair64 = kotlin.TuplesKt.to(insights_previously_not_enabled.getJson(), insights_previously_not_enabled);
            com.plaid.link.result.LinkErrorCode.RecaptchaError.RECAPTCHA_REQUIRED recaptcha_required = com.plaid.link.result.LinkErrorCode.RecaptchaError.RECAPTCHA_REQUIRED.INSTANCE;
            kotlin.Pair pair65 = kotlin.TuplesKt.to(recaptcha_required.getJson(), recaptcha_required);
            com.plaid.link.result.LinkErrorCode.RecaptchaError.RECAPTCHA_BAD recaptcha_bad = com.plaid.link.result.LinkErrorCode.RecaptchaError.RECAPTCHA_BAD.INSTANCE;
            kotlin.Pair pair66 = kotlin.TuplesKt.to(recaptcha_bad.getJson(), recaptcha_bad);
            com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_LIMIT_EXCEEDED bank_transfer_limit_exceeded = com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_LIMIT_EXCEEDED.INSTANCE;
            kotlin.Pair pair67 = kotlin.TuplesKt.to(bank_transfer_limit_exceeded.getJson(), bank_transfer_limit_exceeded);
            com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT bank_transfer_missing_origination_account = com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT.INSTANCE;
            kotlin.Pair pair68 = kotlin.TuplesKt.to(bank_transfer_missing_origination_account.getJson(), bank_transfer_missing_origination_account);
            com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT bank_transfer_invalid_origination_account = com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT.INSTANCE;
            kotlin.Pair pair69 = kotlin.TuplesKt.to(bank_transfer_invalid_origination_account.getJson(), bank_transfer_invalid_origination_account);
            com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_ACCOUNT_BLOCKED bank_transfer_account_blocked = com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_ACCOUNT_BLOCKED.INSTANCE;
            kotlin.Pair pair70 = kotlin.TuplesKt.to(bank_transfer_account_blocked.getJson(), bank_transfer_account_blocked);
            com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_INSUFFICIENT_FUNDS bank_transfer_insufficient_funds = com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_INSUFFICIENT_FUNDS.INSTANCE;
            kotlin.Pair pair71 = kotlin.TuplesKt.to(bank_transfer_insufficient_funds.getJson(), bank_transfer_insufficient_funds);
            com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_NOT_CANCELLABLE bank_transfer_not_cancellable = com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_NOT_CANCELLABLE.INSTANCE;
            kotlin.Pair pair72 = kotlin.TuplesKt.to(bank_transfer_not_cancellable.getJson(), bank_transfer_not_cancellable);
            com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE bank_transfer_unsupported_account_type = com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE.INSTANCE;
            kotlin.Pair pair73 = kotlin.TuplesKt.to(bank_transfer_unsupported_account_type.getJson(), bank_transfer_unsupported_account_type);
            com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT bank_transfer_unsupported_environment = com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT.INSTANCE;
            kotlin.Pair pair74 = kotlin.TuplesKt.to(bank_transfer_unsupported_environment.getJson(), bank_transfer_unsupported_environment);
            com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_BLOCKED payment_blocked = com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_BLOCKED.INSTANCE;
            kotlin.Pair pair75 = kotlin.TuplesKt.to(payment_blocked.getJson(), payment_blocked);
            com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INSUFFICIENT_FUNDS payment_insufficient_funds = com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INSUFFICIENT_FUNDS.INSTANCE;
            kotlin.Pair pair76 = kotlin.TuplesKt.to(payment_insufficient_funds.getJson(), payment_insufficient_funds);
            com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_RECIPIENT payment_invalid_recipient = com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_RECIPIENT.INSTANCE;
            kotlin.Pair pair77 = kotlin.TuplesKt.to(payment_invalid_recipient.getJson(), payment_invalid_recipient);
            com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_REFERENCE payment_invalid_reference = com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_REFERENCE.INSTANCE;
            kotlin.Pair pair78 = kotlin.TuplesKt.to(payment_invalid_reference.getJson(), payment_invalid_reference);
            com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_SCHEDULE payment_invalid_schedule = com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_SCHEDULE.INSTANCE;
            kotlin.Pair pair79 = kotlin.TuplesKt.to(payment_invalid_schedule.getJson(), payment_invalid_schedule);
            com.plaid.link.result.LinkErrorCode.OAuthError.INCORRECT_OAUTH_NONCE incorrect_oauth_nonce = com.plaid.link.result.LinkErrorCode.OAuthError.INCORRECT_OAUTH_NONCE.INSTANCE;
            kotlin.Pair pair80 = kotlin.TuplesKt.to(incorrect_oauth_nonce.getJson(), incorrect_oauth_nonce);
            com.plaid.link.result.LinkErrorCode.OAuthError.INCORRECT_LINK_TOKEN incorrect_link_token = com.plaid.link.result.LinkErrorCode.OAuthError.INCORRECT_LINK_TOKEN.INSTANCE;
            kotlin.Pair pair81 = kotlin.TuplesKt.to(incorrect_link_token.getJson(), incorrect_link_token);
            com.plaid.link.result.LinkErrorCode.OAuthError.OAUTH_STATE_ID_ALREADY_PROCESSED oauth_state_id_already_processed = com.plaid.link.result.LinkErrorCode.OAuthError.OAUTH_STATE_ID_ALREADY_PROCESSED.INSTANCE;
            kotlin.Pair pair82 = kotlin.TuplesKt.to(oauth_state_id_already_processed.getJson(), oauth_state_id_already_processed);
            com.plaid.link.result.LinkErrorCode.DepositSwitchError.INVALID_DEPOSIT_SWITCH_ID invalid_deposit_switch_id = com.plaid.link.result.LinkErrorCode.DepositSwitchError.INVALID_DEPOSIT_SWITCH_ID.INSTANCE;
            kotlin.Pair pair83 = kotlin.TuplesKt.to(invalid_deposit_switch_id.getJson(), invalid_deposit_switch_id);
            com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_NOT_FOUND deposit_switch_not_found = com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_NOT_FOUND.INSTANCE;
            kotlin.Pair pair84 = kotlin.TuplesKt.to(deposit_switch_not_found.getJson(), deposit_switch_not_found);
            com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_TOKEN_NOT_FOUND deposit_switch_token_not_found = com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_TOKEN_NOT_FOUND.INSTANCE;
            kotlin.Pair pair85 = kotlin.TuplesKt.to(deposit_switch_token_not_found.getJson(), deposit_switch_token_not_found);
            com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_INVALID_ACCOUNT deposit_switch_invalid_account = com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_INVALID_ACCOUNT.INSTANCE;
            kotlin.Pair pair86 = kotlin.TuplesKt.to(deposit_switch_invalid_account.getJson(), deposit_switch_invalid_account);
            com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND deposit_switch_valid_auth_not_found = com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND.INSTANCE;
            kotlin.Pair pair87 = kotlin.TuplesKt.to(deposit_switch_valid_auth_not_found.getJson(), deposit_switch_valid_auth_not_found);
            com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND deposit_switch_valid_identity_not_found = com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND.INSTANCE;
            kotlin.Pair pair88 = kotlin.TuplesKt.to(deposit_switch_valid_identity_not_found.getJson(), deposit_switch_valid_identity_not_found);
            com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_ALREADY_COMPLETED deposit_switch_already_completed = com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_ALREADY_COMPLETED.INSTANCE;
            kotlin.Pair pair89 = kotlin.TuplesKt.to(deposit_switch_already_completed.getJson(), deposit_switch_already_completed);
            com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_PRODUCT_NOT_ENABLED sandbox_product_not_enabled = com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_PRODUCT_NOT_ENABLED.INSTANCE;
            kotlin.Pair pair90 = kotlin.TuplesKt.to(sandbox_product_not_enabled.getJson(), sandbox_product_not_enabled);
            com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_WEBHOOK_INVALID sandbox_webhook_invalid = com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_WEBHOOK_INVALID.INSTANCE;
            kotlin.Pair pair91 = kotlin.TuplesKt.to(sandbox_webhook_invalid.getJson(), sandbox_webhook_invalid);
            com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID sandbox_bank_transfer_event_transition_invalid = com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID.INSTANCE;
            kotlin.Pair pair92 = kotlin.TuplesKt.to(sandbox_bank_transfer_event_transition_invalid.getJson(), sandbox_bank_transfer_event_transition_invalid);
            com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_DOWN institution_down = com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_DOWN.INSTANCE;
            kotlin.Pair pair93 = kotlin.TuplesKt.to(institution_down.getJson(), institution_down);
            com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NOT_RESPONDING institution_not_responding = com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NOT_RESPONDING.INSTANCE;
            kotlin.Pair pair94 = kotlin.TuplesKt.to(institution_not_responding.getJson(), institution_not_responding);
            com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NOT_AVAILABLE institution_not_available = com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NOT_AVAILABLE.INSTANCE;
            kotlin.Pair pair95 = kotlin.TuplesKt.to(institution_not_available.getJson(), institution_not_available);
            com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NO_LONGER_SUPPORTED institution_no_longer_supported = com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NO_LONGER_SUPPORTED.INSTANCE;
            return kotlin.collections.MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, pair25, pair26, pair27, pair28, pair29, pair30, pair31, pair32, pair33, pair34, pair35, pair36, pair37, pair38, pair39, pair40, pair41, pair42, pair43, pair44, pair45, pair46, pair47, pair48, pair49, pair50, pair51, pair52, pair53, pair54, pair55, pair56, pair57, pair58, pair59, pair60, pair61, pair62, pair63, pair64, pair65, pair66, pair67, pair68, pair69, pair70, pair71, pair72, pair73, pair74, pair75, pair76, pair77, pair78, pair79, pair80, pair81, pair82, pair83, pair84, pair85, pair86, pair87, pair88, pair89, pair90, pair91, pair92, pair93, pair94, pair95, kotlin.TuplesKt.to(institution_no_longer_supported.getJson(), institution_no_longer_supported));
        }
    });
    private final com.plaid.link.result.LinkErrorType errorType;
    private final java.lang.String json;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ApiError;", "Lcom/plaid/link/result/LinkErrorCode;", "", "json", "<init>", "(Ljava/lang/String;)V", com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR, "PLANNED_MAINTENANCE", "Lcom/plaid/link/result/LinkErrorCode$ApiError$INTERNAL_SERVER_ERROR;", "Lcom/plaid/link/result/LinkErrorCode$ApiError$PLANNED_MAINTENANCE;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class ApiError extends com.plaid.link.result.LinkErrorCode {
        public /* synthetic */ ApiError(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private ApiError(java.lang.String str) {
            super(str, com.plaid.link.result.LinkErrorType.API_ERROR.INSTANCE, null);
        }

        public /* synthetic */ ApiError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ApiError$INTERNAL_SERVER_ERROR;", "Lcom/plaid/link/result/LinkErrorCode$ApiError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INTERNAL_SERVER_ERROR extends com.plaid.link.result.LinkErrorCode.ApiError {
            public static final com.plaid.link.result.LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR INSTANCE = new com.plaid.link.result.LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR> CREATOR = new com.plaid.link.result.LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR[i];
                }
            }

            private INTERNAL_SERVER_ERROR() {
                super(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR, null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ApiError$PLANNED_MAINTENANCE;", "Lcom/plaid/link/result/LinkErrorCode$ApiError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PLANNED_MAINTENANCE extends com.plaid.link.result.LinkErrorCode.ApiError {
            public static final com.plaid.link.result.LinkErrorCode.ApiError.PLANNED_MAINTENANCE INSTANCE = new com.plaid.link.result.LinkErrorCode.ApiError.PLANNED_MAINTENANCE();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ApiError.PLANNED_MAINTENANCE> CREATOR = new com.plaid.link.result.LinkErrorCode.ApiError.PLANNED_MAINTENANCE.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ApiError.PLANNED_MAINTENANCE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ApiError.PLANNED_MAINTENANCE createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.ApiError.PLANNED_MAINTENANCE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ApiError.PLANNED_MAINTENANCE[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.ApiError.PLANNED_MAINTENANCE[i];
                }
            }

            private PLANNED_MAINTENANCE() {
                super("PLANNED_MAINTENANCE", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0007\u0006\u0007\b\t\n\u000b\fB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0007\r\u000e\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$AssetReport;", "Lcom/plaid/link/result/LinkErrorCode;", "", "json", "<init>", "(Ljava/lang/String;)V", "ASSET_REPORT_GENERATION_FAILED", "DATA_UNAVAILABLE", "INSIGHTS_NOT_ENABLED", "INSIGHTS_PREVIOUSLY_NOT_ENABLED", "INVALID_PARENT", "PRODUCT_NOT_ENABLED", "PRODUCT_NOT_READY", "Lcom/plaid/link/result/LinkErrorCode$AssetReport$ASSET_REPORT_GENERATION_FAILED;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport$DATA_UNAVAILABLE;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport$INSIGHTS_NOT_ENABLED;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport$INSIGHTS_PREVIOUSLY_NOT_ENABLED;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport$INVALID_PARENT;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport$PRODUCT_NOT_ENABLED;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport$PRODUCT_NOT_READY;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class AssetReport extends com.plaid.link.result.LinkErrorCode {
        public /* synthetic */ AssetReport(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private AssetReport(java.lang.String str) {
            super(str, com.plaid.link.result.LinkErrorType.ASSET_REPORT_ERROR.INSTANCE, null);
        }

        public /* synthetic */ AssetReport(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$AssetReport$ASSET_REPORT_GENERATION_FAILED;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ASSET_REPORT_GENERATION_FAILED extends com.plaid.link.result.LinkErrorCode.AssetReport {
            public static final com.plaid.link.result.LinkErrorCode.AssetReport.ASSET_REPORT_GENERATION_FAILED INSTANCE = new com.plaid.link.result.LinkErrorCode.AssetReport.ASSET_REPORT_GENERATION_FAILED();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.AssetReport.ASSET_REPORT_GENERATION_FAILED> CREATOR = new com.plaid.link.result.LinkErrorCode.AssetReport.ASSET_REPORT_GENERATION_FAILED.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.AssetReport.ASSET_REPORT_GENERATION_FAILED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.AssetReport.ASSET_REPORT_GENERATION_FAILED createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.AssetReport.ASSET_REPORT_GENERATION_FAILED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.AssetReport.ASSET_REPORT_GENERATION_FAILED[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.AssetReport.ASSET_REPORT_GENERATION_FAILED[i];
                }
            }

            private ASSET_REPORT_GENERATION_FAILED() {
                super("ASSET_REPORT_GENERATION_FAILED", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$AssetReport$DATA_UNAVAILABLE;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class DATA_UNAVAILABLE extends com.plaid.link.result.LinkErrorCode.AssetReport {
            public static final com.plaid.link.result.LinkErrorCode.AssetReport.DATA_UNAVAILABLE INSTANCE = new com.plaid.link.result.LinkErrorCode.AssetReport.DATA_UNAVAILABLE();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.AssetReport.DATA_UNAVAILABLE> CREATOR = new com.plaid.link.result.LinkErrorCode.AssetReport.DATA_UNAVAILABLE.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.AssetReport.DATA_UNAVAILABLE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.AssetReport.DATA_UNAVAILABLE createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.AssetReport.DATA_UNAVAILABLE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.AssetReport.DATA_UNAVAILABLE[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.AssetReport.DATA_UNAVAILABLE[i];
                }
            }

            private DATA_UNAVAILABLE() {
                super("DATA_UNAVAILABLE", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$AssetReport$INSIGHTS_NOT_ENABLED;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INSIGHTS_NOT_ENABLED extends com.plaid.link.result.LinkErrorCode.AssetReport {
            public static final com.plaid.link.result.LinkErrorCode.AssetReport.INSIGHTS_NOT_ENABLED INSTANCE = new com.plaid.link.result.LinkErrorCode.AssetReport.INSIGHTS_NOT_ENABLED();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.AssetReport.INSIGHTS_NOT_ENABLED> CREATOR = new com.plaid.link.result.LinkErrorCode.AssetReport.INSIGHTS_NOT_ENABLED.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.AssetReport.INSIGHTS_NOT_ENABLED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.AssetReport.INSIGHTS_NOT_ENABLED createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.AssetReport.INSIGHTS_NOT_ENABLED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.AssetReport.INSIGHTS_NOT_ENABLED[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.AssetReport.INSIGHTS_NOT_ENABLED[i];
                }
            }

            private INSIGHTS_NOT_ENABLED() {
                super("INSIGHTS_NOT_ENABLED", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$AssetReport$INSIGHTS_PREVIOUSLY_NOT_ENABLED;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INSIGHTS_PREVIOUSLY_NOT_ENABLED extends com.plaid.link.result.LinkErrorCode.AssetReport {
            public static final com.plaid.link.result.LinkErrorCode.AssetReport.INSIGHTS_PREVIOUSLY_NOT_ENABLED INSTANCE = new com.plaid.link.result.LinkErrorCode.AssetReport.INSIGHTS_PREVIOUSLY_NOT_ENABLED();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.AssetReport.INSIGHTS_PREVIOUSLY_NOT_ENABLED> CREATOR = new com.plaid.link.result.LinkErrorCode.AssetReport.INSIGHTS_PREVIOUSLY_NOT_ENABLED.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.AssetReport.INSIGHTS_PREVIOUSLY_NOT_ENABLED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.AssetReport.INSIGHTS_PREVIOUSLY_NOT_ENABLED createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.AssetReport.INSIGHTS_PREVIOUSLY_NOT_ENABLED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.AssetReport.INSIGHTS_PREVIOUSLY_NOT_ENABLED[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.AssetReport.INSIGHTS_PREVIOUSLY_NOT_ENABLED[i];
                }
            }

            private INSIGHTS_PREVIOUSLY_NOT_ENABLED() {
                super("INSIGHTS_PREVIOUSLY_NOT_ENABLED", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$AssetReport$INVALID_PARENT;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_PARENT extends com.plaid.link.result.LinkErrorCode.AssetReport {
            public static final com.plaid.link.result.LinkErrorCode.AssetReport.INVALID_PARENT INSTANCE = new com.plaid.link.result.LinkErrorCode.AssetReport.INVALID_PARENT();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.AssetReport.INVALID_PARENT> CREATOR = new com.plaid.link.result.LinkErrorCode.AssetReport.INVALID_PARENT.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.AssetReport.INVALID_PARENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.AssetReport.INVALID_PARENT createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.AssetReport.INVALID_PARENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.AssetReport.INVALID_PARENT[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.AssetReport.INVALID_PARENT[i];
                }
            }

            private INVALID_PARENT() {
                super("INVALID_PARENT", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$AssetReport$PRODUCT_NOT_ENABLED;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PRODUCT_NOT_ENABLED extends com.plaid.link.result.LinkErrorCode.AssetReport {
            public static final com.plaid.link.result.LinkErrorCode.AssetReport.PRODUCT_NOT_ENABLED INSTANCE = new com.plaid.link.result.LinkErrorCode.AssetReport.PRODUCT_NOT_ENABLED();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.AssetReport.PRODUCT_NOT_ENABLED> CREATOR = new com.plaid.link.result.LinkErrorCode.AssetReport.PRODUCT_NOT_ENABLED.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.AssetReport.PRODUCT_NOT_ENABLED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.AssetReport.PRODUCT_NOT_ENABLED createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.AssetReport.PRODUCT_NOT_ENABLED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.AssetReport.PRODUCT_NOT_ENABLED[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.AssetReport.PRODUCT_NOT_ENABLED[i];
                }
            }

            private PRODUCT_NOT_ENABLED() {
                super("PRODUCT_NOT_ENABLED", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$AssetReport$PRODUCT_NOT_READY;", "Lcom/plaid/link/result/LinkErrorCode$AssetReport;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PRODUCT_NOT_READY extends com.plaid.link.result.LinkErrorCode.AssetReport {
            public static final com.plaid.link.result.LinkErrorCode.AssetReport.PRODUCT_NOT_READY INSTANCE = new com.plaid.link.result.LinkErrorCode.AssetReport.PRODUCT_NOT_READY();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.AssetReport.PRODUCT_NOT_READY> CREATOR = new com.plaid.link.result.LinkErrorCode.AssetReport.PRODUCT_NOT_READY.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.AssetReport.PRODUCT_NOT_READY> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.AssetReport.PRODUCT_NOT_READY createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.AssetReport.PRODUCT_NOT_READY.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.AssetReport.PRODUCT_NOT_READY[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.AssetReport.PRODUCT_NOT_READY[i];
                }
            }

            private PRODUCT_NOT_READY() {
                super("PRODUCT_NOT_READY", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\b\u0006\u0007\b\t\n\u000b\f\rB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$BankTransferError;", "Lcom/plaid/link/result/LinkErrorCode;", "", "json", "<init>", "(Ljava/lang/String;)V", "BANK_TRANSFER_ACCOUNT_BLOCKED", "BANK_TRANSFER_INSUFFICIENT_FUNDS", "BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT", "BANK_TRANSFER_LIMIT_EXCEEDED", "BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT", "BANK_TRANSFER_NOT_CANCELLABLE", "BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE", "BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_ACCOUNT_BLOCKED;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_INSUFFICIENT_FUNDS;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_LIMIT_EXCEEDED;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_NOT_CANCELLABLE;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class BankTransferError extends com.plaid.link.result.LinkErrorCode {
        public /* synthetic */ BankTransferError(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private BankTransferError(java.lang.String str) {
            super(str, com.plaid.link.result.LinkErrorType.INSTITUTION_ERROR.INSTANCE, null);
        }

        public /* synthetic */ BankTransferError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_ACCOUNT_BLOCKED;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BANK_TRANSFER_ACCOUNT_BLOCKED extends com.plaid.link.result.LinkErrorCode.BankTransferError {
            public static final com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_ACCOUNT_BLOCKED INSTANCE = new com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_ACCOUNT_BLOCKED();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_ACCOUNT_BLOCKED> CREATOR = new com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_ACCOUNT_BLOCKED.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_ACCOUNT_BLOCKED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_ACCOUNT_BLOCKED createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_ACCOUNT_BLOCKED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_ACCOUNT_BLOCKED[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_ACCOUNT_BLOCKED[i];
                }
            }

            private BANK_TRANSFER_ACCOUNT_BLOCKED() {
                super("BANK_TRANSFER_ACCOUNT_BLOCKED", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_INSUFFICIENT_FUNDS;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BANK_TRANSFER_INSUFFICIENT_FUNDS extends com.plaid.link.result.LinkErrorCode.BankTransferError {
            public static final com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_INSUFFICIENT_FUNDS INSTANCE = new com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_INSUFFICIENT_FUNDS();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_INSUFFICIENT_FUNDS> CREATOR = new com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_INSUFFICIENT_FUNDS.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_INSUFFICIENT_FUNDS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_INSUFFICIENT_FUNDS createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_INSUFFICIENT_FUNDS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_INSUFFICIENT_FUNDS[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_INSUFFICIENT_FUNDS[i];
                }
            }

            private BANK_TRANSFER_INSUFFICIENT_FUNDS() {
                super("BANK_TRANSFER_INSUFFICIENT_FUNDS", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT extends com.plaid.link.result.LinkErrorCode.BankTransferError {
            public static final com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT INSTANCE = new com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT> CREATOR = new com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT[i];
                }
            }

            private BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT() {
                super("BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_LIMIT_EXCEEDED;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BANK_TRANSFER_LIMIT_EXCEEDED extends com.plaid.link.result.LinkErrorCode.BankTransferError {
            public static final com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_LIMIT_EXCEEDED INSTANCE = new com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_LIMIT_EXCEEDED();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_LIMIT_EXCEEDED> CREATOR = new com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_LIMIT_EXCEEDED.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_LIMIT_EXCEEDED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_LIMIT_EXCEEDED createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_LIMIT_EXCEEDED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_LIMIT_EXCEEDED[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_LIMIT_EXCEEDED[i];
                }
            }

            private BANK_TRANSFER_LIMIT_EXCEEDED() {
                super("BANK_TRANSFER_LIMIT_EXCEEDED", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT extends com.plaid.link.result.LinkErrorCode.BankTransferError {
            public static final com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT INSTANCE = new com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT> CREATOR = new com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT[i];
                }
            }

            private BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT() {
                super("BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_NOT_CANCELLABLE;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BANK_TRANSFER_NOT_CANCELLABLE extends com.plaid.link.result.LinkErrorCode.BankTransferError {
            public static final com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_NOT_CANCELLABLE INSTANCE = new com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_NOT_CANCELLABLE();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_NOT_CANCELLABLE> CREATOR = new com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_NOT_CANCELLABLE.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_NOT_CANCELLABLE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_NOT_CANCELLABLE createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_NOT_CANCELLABLE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_NOT_CANCELLABLE[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_NOT_CANCELLABLE[i];
                }
            }

            private BANK_TRANSFER_NOT_CANCELLABLE() {
                super("BANK_TRANSFER_NOT_CANCELLABLE", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE extends com.plaid.link.result.LinkErrorCode.BankTransferError {
            public static final com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE INSTANCE = new com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE> CREATOR = new com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE[i];
                }
            }

            private BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE() {
                super("BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$BankTransferError$BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT;", "Lcom/plaid/link/result/LinkErrorCode$BankTransferError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT extends com.plaid.link.result.LinkErrorCode.BankTransferError {
            public static final com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT INSTANCE = new com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT> CREATOR = new com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT[i];
                }
            }

            private BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT() {
                super("BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR'\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$Companion;", "", "<init>", "()V", "", "json", "Lcom/plaid/link/result/LinkErrorCode;", "convert", "(Ljava/lang/String;)Lcom/plaid/link/result/LinkErrorCode;", "", "jsonToObject$delegate", "Lkotlin/Lazy;", "getJsonToObject", "()Ljava/util/Map;", "jsonToObject"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final java.util.Map<java.lang.String, com.plaid.link.result.LinkErrorCode> getJsonToObject() {
            return (java.util.Map) com.plaid.link.result.LinkErrorCode.jsonToObject$delegate.getValue();
        }

        public final com.plaid.link.result.LinkErrorCode convert(java.lang.String json) {
            com.plaid.link.result.LinkErrorCode linkErrorCode = getJsonToObject().get(json);
            if (linkErrorCode != null) {
                return linkErrorCode;
            }
            java.lang.String str = json == null ? "" : json;
            if (json == null) {
                json = "";
            }
            return new com.plaid.link.result.LinkErrorCode.UNKNOWN(str, new com.plaid.link.result.LinkErrorType.UNKNOWN(json));
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0007\u0006\u0007\b\t\n\u000b\fB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0007\r\u000e\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError;", "Lcom/plaid/link/result/LinkErrorCode;", "", "json", "<init>", "(Ljava/lang/String;)V", "DEPOSIT_SWITCH_ALREADY_COMPLETED", "DEPOSIT_SWITCH_INVALID_ACCOUNT", "DEPOSIT_SWITCH_NOT_FOUND", "DEPOSIT_SWITCH_TOKEN_NOT_FOUND", "DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND", "DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND", "INVALID_DEPOSIT_SWITCH_ID", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$DEPOSIT_SWITCH_ALREADY_COMPLETED;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$DEPOSIT_SWITCH_INVALID_ACCOUNT;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$DEPOSIT_SWITCH_NOT_FOUND;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$DEPOSIT_SWITCH_TOKEN_NOT_FOUND;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$INVALID_DEPOSIT_SWITCH_ID;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class DepositSwitchError extends com.plaid.link.result.LinkErrorCode {
        public /* synthetic */ DepositSwitchError(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private DepositSwitchError(java.lang.String str) {
            super(str, com.plaid.link.result.LinkErrorType.INSTITUTION_ERROR.INSTANCE, null);
        }

        public /* synthetic */ DepositSwitchError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$DEPOSIT_SWITCH_ALREADY_COMPLETED;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class DEPOSIT_SWITCH_ALREADY_COMPLETED extends com.plaid.link.result.LinkErrorCode.DepositSwitchError {
            public static final com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_ALREADY_COMPLETED INSTANCE = new com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_ALREADY_COMPLETED();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_ALREADY_COMPLETED> CREATOR = new com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_ALREADY_COMPLETED.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_ALREADY_COMPLETED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_ALREADY_COMPLETED createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_ALREADY_COMPLETED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_ALREADY_COMPLETED[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_ALREADY_COMPLETED[i];
                }
            }

            private DEPOSIT_SWITCH_ALREADY_COMPLETED() {
                super("DEPOSIT_SWITCH_ALREADY_COMPLETED", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$DEPOSIT_SWITCH_INVALID_ACCOUNT;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class DEPOSIT_SWITCH_INVALID_ACCOUNT extends com.plaid.link.result.LinkErrorCode.DepositSwitchError {
            public static final com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_INVALID_ACCOUNT INSTANCE = new com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_INVALID_ACCOUNT();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_INVALID_ACCOUNT> CREATOR = new com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_INVALID_ACCOUNT.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_INVALID_ACCOUNT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_INVALID_ACCOUNT createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_INVALID_ACCOUNT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_INVALID_ACCOUNT[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_INVALID_ACCOUNT[i];
                }
            }

            private DEPOSIT_SWITCH_INVALID_ACCOUNT() {
                super("DEPOSIT_SWITCH_INVALID_ACCOUNT", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$DEPOSIT_SWITCH_NOT_FOUND;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class DEPOSIT_SWITCH_NOT_FOUND extends com.plaid.link.result.LinkErrorCode.DepositSwitchError {
            public static final com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_NOT_FOUND INSTANCE = new com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_NOT_FOUND();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_NOT_FOUND> CREATOR = new com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_NOT_FOUND.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_NOT_FOUND> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_NOT_FOUND createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_NOT_FOUND.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_NOT_FOUND[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_NOT_FOUND[i];
                }
            }

            private DEPOSIT_SWITCH_NOT_FOUND() {
                super("DEPOSIT_SWITCH_NOT_FOUND", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$DEPOSIT_SWITCH_TOKEN_NOT_FOUND;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class DEPOSIT_SWITCH_TOKEN_NOT_FOUND extends com.plaid.link.result.LinkErrorCode.DepositSwitchError {
            public static final com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_TOKEN_NOT_FOUND INSTANCE = new com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_TOKEN_NOT_FOUND();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_TOKEN_NOT_FOUND> CREATOR = new com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_TOKEN_NOT_FOUND.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_TOKEN_NOT_FOUND> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_TOKEN_NOT_FOUND createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_TOKEN_NOT_FOUND.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_TOKEN_NOT_FOUND[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_TOKEN_NOT_FOUND[i];
                }
            }

            private DEPOSIT_SWITCH_TOKEN_NOT_FOUND() {
                super("DEPOSIT_SWITCH_TOKEN_NOT_FOUND", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND extends com.plaid.link.result.LinkErrorCode.DepositSwitchError {
            public static final com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND INSTANCE = new com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND> CREATOR = new com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND[i];
                }
            }

            private DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND() {
                super("DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND extends com.plaid.link.result.LinkErrorCode.DepositSwitchError {
            public static final com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND INSTANCE = new com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND> CREATOR = new com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND[i];
                }
            }

            private DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND() {
                super("DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError$INVALID_DEPOSIT_SWITCH_ID;", "Lcom/plaid/link/result/LinkErrorCode$DepositSwitchError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_DEPOSIT_SWITCH_ID extends com.plaid.link.result.LinkErrorCode.DepositSwitchError {
            public static final com.plaid.link.result.LinkErrorCode.DepositSwitchError.INVALID_DEPOSIT_SWITCH_ID INSTANCE = new com.plaid.link.result.LinkErrorCode.DepositSwitchError.INVALID_DEPOSIT_SWITCH_ID();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.DepositSwitchError.INVALID_DEPOSIT_SWITCH_ID> CREATOR = new com.plaid.link.result.LinkErrorCode.DepositSwitchError.INVALID_DEPOSIT_SWITCH_ID.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.DepositSwitchError.INVALID_DEPOSIT_SWITCH_ID> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.DepositSwitchError.INVALID_DEPOSIT_SWITCH_ID createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.DepositSwitchError.INVALID_DEPOSIT_SWITCH_ID.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.DepositSwitchError.INVALID_DEPOSIT_SWITCH_ID[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.DepositSwitchError.INVALID_DEPOSIT_SWITCH_ID[i];
                }
            }

            private INVALID_DEPOSIT_SWITCH_ID() {
                super("INVALID_DEPOSIT_SWITCH_ID", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InstitutionError;", "Lcom/plaid/link/result/LinkErrorCode;", "", "json", "<init>", "(Ljava/lang/String;)V", "INSTITUTION_DOWN", "INSTITUTION_NOT_AVAILABLE", "INSTITUTION_NOT_RESPONDING", "INSTITUTION_NO_LONGER_SUPPORTED", "Lcom/plaid/link/result/LinkErrorCode$InstitutionError$INSTITUTION_DOWN;", "Lcom/plaid/link/result/LinkErrorCode$InstitutionError$INSTITUTION_NOT_AVAILABLE;", "Lcom/plaid/link/result/LinkErrorCode$InstitutionError$INSTITUTION_NOT_RESPONDING;", "Lcom/plaid/link/result/LinkErrorCode$InstitutionError$INSTITUTION_NO_LONGER_SUPPORTED;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class InstitutionError extends com.plaid.link.result.LinkErrorCode {
        public /* synthetic */ InstitutionError(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private InstitutionError(java.lang.String str) {
            super(str, com.plaid.link.result.LinkErrorType.INSTITUTION_ERROR.INSTANCE, null);
        }

        public /* synthetic */ InstitutionError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InstitutionError$INSTITUTION_DOWN;", "Lcom/plaid/link/result/LinkErrorCode$InstitutionError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INSTITUTION_DOWN extends com.plaid.link.result.LinkErrorCode.InstitutionError {
            public static final com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_DOWN INSTANCE = new com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_DOWN();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_DOWN> CREATOR = new com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_DOWN.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_DOWN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_DOWN createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_DOWN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_DOWN[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_DOWN[i];
                }
            }

            private INSTITUTION_DOWN() {
                super("INSTITUTION_DOWN", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InstitutionError$INSTITUTION_NOT_AVAILABLE;", "Lcom/plaid/link/result/LinkErrorCode$InstitutionError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INSTITUTION_NOT_AVAILABLE extends com.plaid.link.result.LinkErrorCode.InstitutionError {
            public static final com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NOT_AVAILABLE INSTANCE = new com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NOT_AVAILABLE();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NOT_AVAILABLE> CREATOR = new com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NOT_AVAILABLE.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NOT_AVAILABLE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NOT_AVAILABLE createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NOT_AVAILABLE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NOT_AVAILABLE[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NOT_AVAILABLE[i];
                }
            }

            private INSTITUTION_NOT_AVAILABLE() {
                super("INSTITUTION_NOT_AVAILABLE", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InstitutionError$INSTITUTION_NOT_RESPONDING;", "Lcom/plaid/link/result/LinkErrorCode$InstitutionError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INSTITUTION_NOT_RESPONDING extends com.plaid.link.result.LinkErrorCode.InstitutionError {
            public static final com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NOT_RESPONDING INSTANCE = new com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NOT_RESPONDING();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NOT_RESPONDING> CREATOR = new com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NOT_RESPONDING.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NOT_RESPONDING> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NOT_RESPONDING createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NOT_RESPONDING.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NOT_RESPONDING[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NOT_RESPONDING[i];
                }
            }

            private INSTITUTION_NOT_RESPONDING() {
                super("INSTITUTION_NOT_RESPONDING", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InstitutionError$INSTITUTION_NO_LONGER_SUPPORTED;", "Lcom/plaid/link/result/LinkErrorCode$InstitutionError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INSTITUTION_NO_LONGER_SUPPORTED extends com.plaid.link.result.LinkErrorCode.InstitutionError {
            public static final com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NO_LONGER_SUPPORTED INSTANCE = new com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NO_LONGER_SUPPORTED();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NO_LONGER_SUPPORTED> CREATOR = new com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NO_LONGER_SUPPORTED.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NO_LONGER_SUPPORTED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NO_LONGER_SUPPORTED createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NO_LONGER_SUPPORTED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NO_LONGER_SUPPORTED[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InstitutionError.INSTITUTION_NO_LONGER_SUPPORTED[i];
                }
            }

            private INSTITUTION_NO_LONGER_SUPPORTED() {
                super("INSTITUTION_NO_LONGER_SUPPORTED", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0013\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0013\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "Lcom/plaid/link/result/LinkErrorCode;", "", "json", "<init>", "(Ljava/lang/String;)V", "DIRECT_INTEGRATION_NOT_ENABLED", "INCORRECT_DEPOSIT_AMOUNTS", "INVALID_ACCESS_TOKEN", "INVALID_ACCOUNT_ID", "INVALID_API_KEYS", "INVALID_AUDIT_COPY_TOKEN", "INVALID_CREDENTIAL_FIELDS", "INVALID_INSTITUTION", "INVALID_LINK_TOKEN", "INVALID_PROCESSOR_TOKEN", "INVALID_PRODUCTS", "INVALID_PUBLIC_TOKEN", "INVALID_STRIPE_ACCOUNT", "INVALID_WEBHOOK_VERIFICATION_KEY_ID", "PRODUCT_UNAVAILABLE", "TOO_MANY_VERIFICATION_ATTEMPTS", "UNAUTHORIZED_ENVIRONMENT", "UNAUTHORIZED_ROUTE_ACCESS", "USER_PERMISSION_REVOKED", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$DIRECT_INTEGRATION_NOT_ENABLED;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INCORRECT_DEPOSIT_AMOUNTS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_ACCESS_TOKEN;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_ACCOUNT_ID;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_API_KEYS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_AUDIT_COPY_TOKEN;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_CREDENTIAL_FIELDS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_INSTITUTION;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_LINK_TOKEN;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_PROCESSOR_TOKEN;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_PRODUCTS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_PUBLIC_TOKEN;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_STRIPE_ACCOUNT;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_WEBHOOK_VERIFICATION_KEY_ID;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$PRODUCT_UNAVAILABLE;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$TOO_MANY_VERIFICATION_ATTEMPTS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$UNAUTHORIZED_ENVIRONMENT;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$UNAUTHORIZED_ROUTE_ACCESS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput$USER_PERMISSION_REVOKED;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class InvalidInput extends com.plaid.link.result.LinkErrorCode {
        public /* synthetic */ InvalidInput(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private InvalidInput(java.lang.String str) {
            super(str, com.plaid.link.result.LinkErrorType.INVALID_INPUT.INSTANCE, null);
        }

        public /* synthetic */ InvalidInput(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$DIRECT_INTEGRATION_NOT_ENABLED;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class DIRECT_INTEGRATION_NOT_ENABLED extends com.plaid.link.result.LinkErrorCode.InvalidInput {
            public static final com.plaid.link.result.LinkErrorCode.InvalidInput.DIRECT_INTEGRATION_NOT_ENABLED INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidInput.DIRECT_INTEGRATION_NOT_ENABLED();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.DIRECT_INTEGRATION_NOT_ENABLED> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidInput.DIRECT_INTEGRATION_NOT_ENABLED.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.DIRECT_INTEGRATION_NOT_ENABLED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.DIRECT_INTEGRATION_NOT_ENABLED createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidInput.DIRECT_INTEGRATION_NOT_ENABLED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.DIRECT_INTEGRATION_NOT_ENABLED[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidInput.DIRECT_INTEGRATION_NOT_ENABLED[i];
                }
            }

            private DIRECT_INTEGRATION_NOT_ENABLED() {
                super("DIRECT_INTEGRATION_NOT_ENABLED", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INCORRECT_DEPOSIT_AMOUNTS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INCORRECT_DEPOSIT_AMOUNTS extends com.plaid.link.result.LinkErrorCode.InvalidInput {
            public static final com.plaid.link.result.LinkErrorCode.InvalidInput.INCORRECT_DEPOSIT_AMOUNTS INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidInput.INCORRECT_DEPOSIT_AMOUNTS();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.INCORRECT_DEPOSIT_AMOUNTS> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidInput.INCORRECT_DEPOSIT_AMOUNTS.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.INCORRECT_DEPOSIT_AMOUNTS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.INCORRECT_DEPOSIT_AMOUNTS createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidInput.INCORRECT_DEPOSIT_AMOUNTS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.INCORRECT_DEPOSIT_AMOUNTS[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidInput.INCORRECT_DEPOSIT_AMOUNTS[i];
                }
            }

            private INCORRECT_DEPOSIT_AMOUNTS() {
                super("INCORRECT_DEPOSIT_AMOUNTS", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_ACCESS_TOKEN;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_ACCESS_TOKEN extends com.plaid.link.result.LinkErrorCode.InvalidInput {
            public static final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_ACCESS_TOKEN INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_ACCESS_TOKEN();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_ACCESS_TOKEN> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_ACCESS_TOKEN.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_ACCESS_TOKEN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_ACCESS_TOKEN createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_ACCESS_TOKEN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_ACCESS_TOKEN[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_ACCESS_TOKEN[i];
                }
            }

            private INVALID_ACCESS_TOKEN() {
                super("INVALID_ACCESS_TOKEN", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_ACCOUNT_ID;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_ACCOUNT_ID extends com.plaid.link.result.LinkErrorCode.InvalidInput {
            public static final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_ACCOUNT_ID INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_ACCOUNT_ID();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_ACCOUNT_ID> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_ACCOUNT_ID.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_ACCOUNT_ID> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_ACCOUNT_ID createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_ACCOUNT_ID.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_ACCOUNT_ID[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_ACCOUNT_ID[i];
                }
            }

            private INVALID_ACCOUNT_ID() {
                super("INVALID_ACCOUNT_ID", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_API_KEYS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_API_KEYS extends com.plaid.link.result.LinkErrorCode.InvalidInput {
            public static final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_API_KEYS INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_API_KEYS();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_API_KEYS> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_API_KEYS.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_API_KEYS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_API_KEYS createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_API_KEYS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_API_KEYS[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_API_KEYS[i];
                }
            }

            private INVALID_API_KEYS() {
                super("INVALID_API_KEYS", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_AUDIT_COPY_TOKEN;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_AUDIT_COPY_TOKEN extends com.plaid.link.result.LinkErrorCode.InvalidInput {
            public static final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_AUDIT_COPY_TOKEN INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_AUDIT_COPY_TOKEN();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_AUDIT_COPY_TOKEN> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_AUDIT_COPY_TOKEN.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_AUDIT_COPY_TOKEN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_AUDIT_COPY_TOKEN createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_AUDIT_COPY_TOKEN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_AUDIT_COPY_TOKEN[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_AUDIT_COPY_TOKEN[i];
                }
            }

            private INVALID_AUDIT_COPY_TOKEN() {
                super("INVALID_AUDIT_COPY_TOKEN", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_CREDENTIAL_FIELDS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_CREDENTIAL_FIELDS extends com.plaid.link.result.LinkErrorCode.InvalidInput {
            public static final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_CREDENTIAL_FIELDS INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_CREDENTIAL_FIELDS();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_CREDENTIAL_FIELDS> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_CREDENTIAL_FIELDS.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_CREDENTIAL_FIELDS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_CREDENTIAL_FIELDS createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_CREDENTIAL_FIELDS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_CREDENTIAL_FIELDS[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_CREDENTIAL_FIELDS[i];
                }
            }

            private INVALID_CREDENTIAL_FIELDS() {
                super("INVALID_CREDENTIAL_FIELDS", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_INSTITUTION;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_INSTITUTION extends com.plaid.link.result.LinkErrorCode.InvalidInput {
            public static final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_INSTITUTION INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_INSTITUTION();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_INSTITUTION> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_INSTITUTION.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_INSTITUTION> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_INSTITUTION createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_INSTITUTION.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_INSTITUTION[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_INSTITUTION[i];
                }
            }

            private INVALID_INSTITUTION() {
                super("INVALID_INSTITUTION", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_LINK_TOKEN;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_LINK_TOKEN extends com.plaid.link.result.LinkErrorCode.InvalidInput {
            public static final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_LINK_TOKEN INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_LINK_TOKEN();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_LINK_TOKEN> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_LINK_TOKEN.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_LINK_TOKEN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_LINK_TOKEN createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_LINK_TOKEN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_LINK_TOKEN[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_LINK_TOKEN[i];
                }
            }

            private INVALID_LINK_TOKEN() {
                super("INVALID_LINK_TOKEN", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_PROCESSOR_TOKEN;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_PROCESSOR_TOKEN extends com.plaid.link.result.LinkErrorCode.InvalidInput {
            public static final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PROCESSOR_TOKEN INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PROCESSOR_TOKEN();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PROCESSOR_TOKEN> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PROCESSOR_TOKEN.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PROCESSOR_TOKEN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PROCESSOR_TOKEN createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PROCESSOR_TOKEN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PROCESSOR_TOKEN[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PROCESSOR_TOKEN[i];
                }
            }

            private INVALID_PROCESSOR_TOKEN() {
                super("INVALID_PROCESSOR_TOKEN", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_PRODUCTS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_PRODUCTS extends com.plaid.link.result.LinkErrorCode.InvalidInput {
            public static final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PRODUCTS INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PRODUCTS();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PRODUCTS> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PRODUCTS.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PRODUCTS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PRODUCTS createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PRODUCTS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PRODUCTS[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PRODUCTS[i];
                }
            }

            private INVALID_PRODUCTS() {
                super("INVALID_PRODUCTS", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_PUBLIC_TOKEN;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_PUBLIC_TOKEN extends com.plaid.link.result.LinkErrorCode.InvalidInput {
            public static final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PUBLIC_TOKEN INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PUBLIC_TOKEN();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PUBLIC_TOKEN> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PUBLIC_TOKEN.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PUBLIC_TOKEN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PUBLIC_TOKEN createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PUBLIC_TOKEN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PUBLIC_TOKEN[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_PUBLIC_TOKEN[i];
                }
            }

            private INVALID_PUBLIC_TOKEN() {
                super("INVALID_PUBLIC_TOKEN", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_STRIPE_ACCOUNT;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_STRIPE_ACCOUNT extends com.plaid.link.result.LinkErrorCode.InvalidInput {
            public static final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_STRIPE_ACCOUNT INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_STRIPE_ACCOUNT();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_STRIPE_ACCOUNT> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_STRIPE_ACCOUNT.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_STRIPE_ACCOUNT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_STRIPE_ACCOUNT createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_STRIPE_ACCOUNT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_STRIPE_ACCOUNT[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_STRIPE_ACCOUNT[i];
                }
            }

            private INVALID_STRIPE_ACCOUNT() {
                super("INVALID_STRIPE_ACCOUNT", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$INVALID_WEBHOOK_VERIFICATION_KEY_ID;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_WEBHOOK_VERIFICATION_KEY_ID extends com.plaid.link.result.LinkErrorCode.InvalidInput {
            public static final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_WEBHOOK_VERIFICATION_KEY_ID INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_WEBHOOK_VERIFICATION_KEY_ID();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_WEBHOOK_VERIFICATION_KEY_ID> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_WEBHOOK_VERIFICATION_KEY_ID.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_WEBHOOK_VERIFICATION_KEY_ID> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_WEBHOOK_VERIFICATION_KEY_ID createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_WEBHOOK_VERIFICATION_KEY_ID.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_WEBHOOK_VERIFICATION_KEY_ID[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidInput.INVALID_WEBHOOK_VERIFICATION_KEY_ID[i];
                }
            }

            private INVALID_WEBHOOK_VERIFICATION_KEY_ID() {
                super("INVALID_WEBHOOK_VERIFICATION_KEY_ID", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$PRODUCT_UNAVAILABLE;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PRODUCT_UNAVAILABLE extends com.plaid.link.result.LinkErrorCode.InvalidInput {
            public static final com.plaid.link.result.LinkErrorCode.InvalidInput.PRODUCT_UNAVAILABLE INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidInput.PRODUCT_UNAVAILABLE();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.PRODUCT_UNAVAILABLE> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidInput.PRODUCT_UNAVAILABLE.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.PRODUCT_UNAVAILABLE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.PRODUCT_UNAVAILABLE createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidInput.PRODUCT_UNAVAILABLE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.PRODUCT_UNAVAILABLE[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidInput.PRODUCT_UNAVAILABLE[i];
                }
            }

            private PRODUCT_UNAVAILABLE() {
                super("PRODUCT_UNAVAILABLE", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$TOO_MANY_VERIFICATION_ATTEMPTS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TOO_MANY_VERIFICATION_ATTEMPTS extends com.plaid.link.result.LinkErrorCode.InvalidInput {
            public static final com.plaid.link.result.LinkErrorCode.InvalidInput.TOO_MANY_VERIFICATION_ATTEMPTS INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidInput.TOO_MANY_VERIFICATION_ATTEMPTS();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.TOO_MANY_VERIFICATION_ATTEMPTS> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidInput.TOO_MANY_VERIFICATION_ATTEMPTS.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.TOO_MANY_VERIFICATION_ATTEMPTS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.TOO_MANY_VERIFICATION_ATTEMPTS createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidInput.TOO_MANY_VERIFICATION_ATTEMPTS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.TOO_MANY_VERIFICATION_ATTEMPTS[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidInput.TOO_MANY_VERIFICATION_ATTEMPTS[i];
                }
            }

            private TOO_MANY_VERIFICATION_ATTEMPTS() {
                super("TOO_MANY_VERIFICATION_ATTEMPTS", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$UNAUTHORIZED_ENVIRONMENT;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class UNAUTHORIZED_ENVIRONMENT extends com.plaid.link.result.LinkErrorCode.InvalidInput {
            public static final com.plaid.link.result.LinkErrorCode.InvalidInput.UNAUTHORIZED_ENVIRONMENT INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidInput.UNAUTHORIZED_ENVIRONMENT();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.UNAUTHORIZED_ENVIRONMENT> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidInput.UNAUTHORIZED_ENVIRONMENT.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.UNAUTHORIZED_ENVIRONMENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.UNAUTHORIZED_ENVIRONMENT createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidInput.UNAUTHORIZED_ENVIRONMENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.UNAUTHORIZED_ENVIRONMENT[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidInput.UNAUTHORIZED_ENVIRONMENT[i];
                }
            }

            private UNAUTHORIZED_ENVIRONMENT() {
                super("UNAUTHORIZED_ENVIRONMENT", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$UNAUTHORIZED_ROUTE_ACCESS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class UNAUTHORIZED_ROUTE_ACCESS extends com.plaid.link.result.LinkErrorCode.InvalidInput {
            public static final com.plaid.link.result.LinkErrorCode.InvalidInput.UNAUTHORIZED_ROUTE_ACCESS INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidInput.UNAUTHORIZED_ROUTE_ACCESS();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.UNAUTHORIZED_ROUTE_ACCESS> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidInput.UNAUTHORIZED_ROUTE_ACCESS.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.UNAUTHORIZED_ROUTE_ACCESS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.UNAUTHORIZED_ROUTE_ACCESS createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidInput.UNAUTHORIZED_ROUTE_ACCESS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.UNAUTHORIZED_ROUTE_ACCESS[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidInput.UNAUTHORIZED_ROUTE_ACCESS[i];
                }
            }

            private UNAUTHORIZED_ROUTE_ACCESS() {
                super("UNAUTHORIZED_ROUTE_ACCESS", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidInput$USER_PERMISSION_REVOKED;", "Lcom/plaid/link/result/LinkErrorCode$InvalidInput;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class USER_PERMISSION_REVOKED extends com.plaid.link.result.LinkErrorCode.InvalidInput {
            public static final com.plaid.link.result.LinkErrorCode.InvalidInput.USER_PERMISSION_REVOKED INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidInput.USER_PERMISSION_REVOKED();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.USER_PERMISSION_REVOKED> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidInput.USER_PERMISSION_REVOKED.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidInput.USER_PERMISSION_REVOKED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.USER_PERMISSION_REVOKED createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidInput.USER_PERMISSION_REVOKED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidInput.USER_PERMISSION_REVOKED[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidInput.USER_PERMISSION_REVOKED[i];
                }
            }

            private USER_PERMISSION_REVOKED() {
                super("USER_PERMISSION_REVOKED", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\t\u0006\u0007\b\t\n\u000b\f\r\u000eB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\t\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidRequest;", "Lcom/plaid/link/result/LinkErrorCode;", "", "json", "<init>", "(Ljava/lang/String;)V", "INCOMPATIBLE_API_VERSION", "INVALID_BODY", "INVALID_CONFIGURATION", "INVALID_FIELD", "INVALID_HEADERS", "MISSING_FIELDS", com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_NOT_FOUND, "SANDBOX_ONLY", "UNKNOWN_FIELDS", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$INCOMPATIBLE_API_VERSION;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$INVALID_BODY;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$INVALID_CONFIGURATION;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$INVALID_FIELD;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$INVALID_HEADERS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$MISSING_FIELDS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$NOT_FOUND;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$SANDBOX_ONLY;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$UNKNOWN_FIELDS;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class InvalidRequest extends com.plaid.link.result.LinkErrorCode {
        public /* synthetic */ InvalidRequest(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private InvalidRequest(java.lang.String str) {
            super(str, com.plaid.link.result.LinkErrorType.INVALID_REQUEST.INSTANCE, null);
        }

        public /* synthetic */ InvalidRequest(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$INCOMPATIBLE_API_VERSION;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INCOMPATIBLE_API_VERSION extends com.plaid.link.result.LinkErrorCode.InvalidRequest {
            public static final com.plaid.link.result.LinkErrorCode.InvalidRequest.INCOMPATIBLE_API_VERSION INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidRequest.INCOMPATIBLE_API_VERSION();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidRequest.INCOMPATIBLE_API_VERSION> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidRequest.INCOMPATIBLE_API_VERSION.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidRequest.INCOMPATIBLE_API_VERSION> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidRequest.INCOMPATIBLE_API_VERSION createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidRequest.INCOMPATIBLE_API_VERSION.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidRequest.INCOMPATIBLE_API_VERSION[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidRequest.INCOMPATIBLE_API_VERSION[i];
                }
            }

            private INCOMPATIBLE_API_VERSION() {
                super("INCOMPATIBLE_API_VERSION", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$INVALID_BODY;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_BODY extends com.plaid.link.result.LinkErrorCode.InvalidRequest {
            public static final com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_BODY INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_BODY();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_BODY> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_BODY.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_BODY> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_BODY createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_BODY.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_BODY[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_BODY[i];
                }
            }

            private INVALID_BODY() {
                super("INVALID_BODY", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$INVALID_CONFIGURATION;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_CONFIGURATION extends com.plaid.link.result.LinkErrorCode.InvalidRequest {
            public static final com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_CONFIGURATION INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_CONFIGURATION();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_CONFIGURATION> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_CONFIGURATION.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_CONFIGURATION> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_CONFIGURATION createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_CONFIGURATION.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_CONFIGURATION[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_CONFIGURATION[i];
                }
            }

            private INVALID_CONFIGURATION() {
                super("INVALID_CONFIGURATION", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$INVALID_FIELD;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_FIELD extends com.plaid.link.result.LinkErrorCode.InvalidRequest {
            public static final com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_FIELD INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_FIELD();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_FIELD> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_FIELD.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_FIELD> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_FIELD createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_FIELD.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_FIELD[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_FIELD[i];
                }
            }

            private INVALID_FIELD() {
                super("INVALID_FIELD", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$INVALID_HEADERS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_HEADERS extends com.plaid.link.result.LinkErrorCode.InvalidRequest {
            public static final com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_HEADERS INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_HEADERS();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_HEADERS> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_HEADERS.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_HEADERS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_HEADERS createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_HEADERS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_HEADERS[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidRequest.INVALID_HEADERS[i];
                }
            }

            private INVALID_HEADERS() {
                super("INVALID_HEADERS", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$MISSING_FIELDS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class MISSING_FIELDS extends com.plaid.link.result.LinkErrorCode.InvalidRequest {
            public static final com.plaid.link.result.LinkErrorCode.InvalidRequest.MISSING_FIELDS INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidRequest.MISSING_FIELDS();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidRequest.MISSING_FIELDS> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidRequest.MISSING_FIELDS.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidRequest.MISSING_FIELDS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidRequest.MISSING_FIELDS createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidRequest.MISSING_FIELDS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidRequest.MISSING_FIELDS[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidRequest.MISSING_FIELDS[i];
                }
            }

            private MISSING_FIELDS() {
                super("MISSING_FIELDS", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$NOT_FOUND;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NOT_FOUND extends com.plaid.link.result.LinkErrorCode.InvalidRequest {
            public static final com.plaid.link.result.LinkErrorCode.InvalidRequest.NOT_FOUND INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidRequest.NOT_FOUND();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidRequest.NOT_FOUND> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidRequest.NOT_FOUND.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidRequest.NOT_FOUND> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidRequest.NOT_FOUND createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidRequest.NOT_FOUND.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidRequest.NOT_FOUND[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidRequest.NOT_FOUND[i];
                }
            }

            private NOT_FOUND() {
                super(com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_NOT_FOUND, null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$SANDBOX_ONLY;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SANDBOX_ONLY extends com.plaid.link.result.LinkErrorCode.InvalidRequest {
            public static final com.plaid.link.result.LinkErrorCode.InvalidRequest.SANDBOX_ONLY INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidRequest.SANDBOX_ONLY();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidRequest.SANDBOX_ONLY> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidRequest.SANDBOX_ONLY.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidRequest.SANDBOX_ONLY> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidRequest.SANDBOX_ONLY createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidRequest.SANDBOX_ONLY.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidRequest.SANDBOX_ONLY[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidRequest.SANDBOX_ONLY[i];
                }
            }

            private SANDBOX_ONLY() {
                super("SANDBOX_ONLY", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$InvalidRequest$UNKNOWN_FIELDS;", "Lcom/plaid/link/result/LinkErrorCode$InvalidRequest;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class UNKNOWN_FIELDS extends com.plaid.link.result.LinkErrorCode.InvalidRequest {
            public static final com.plaid.link.result.LinkErrorCode.InvalidRequest.UNKNOWN_FIELDS INSTANCE = new com.plaid.link.result.LinkErrorCode.InvalidRequest.UNKNOWN_FIELDS();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidRequest.UNKNOWN_FIELDS> CREATOR = new com.plaid.link.result.LinkErrorCode.InvalidRequest.UNKNOWN_FIELDS.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.InvalidRequest.UNKNOWN_FIELDS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidRequest.UNKNOWN_FIELDS createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.InvalidRequest.UNKNOWN_FIELDS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.InvalidRequest.UNKNOWN_FIELDS[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.InvalidRequest.UNKNOWN_FIELDS[i];
                }
            }

            private UNKNOWN_FIELDS() {
                super("UNKNOWN_FIELDS", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0012\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0012\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError;", "Lcom/plaid/link/result/LinkErrorCode;", "", "json", "<init>", "(Ljava/lang/String;)V", "INSTANT_MATCH_FAILED", "INSUFFICIENT_CREDENTIALS", "INVALID_CREDENTIALS", "INVALID_MFA", "INVALID_SEND_METHOD", "INVALID_UPDATE_USERNAME", "ITEM_LOCKED", "ITEM_LOGIN_REQUIRED", "ITEM_NOT_SUPPORTED", "ITEM_NO_ERROR", "MFA_NOT_SUPPORTED", "NO_ACCOUNTS", "NO_AUTH_ACCOUNTS", "NO_INVESTMENT_ACCOUNTS", "NO_LIABILITY_ACCOUNTS", "PRODUCTS_NOT_SUPPORTED", "PRODUCT_NOT_READY", "USER_SETUP_REQUIRED", "Lcom/plaid/link/result/LinkErrorCode$ItemError$INSTANT_MATCH_FAILED;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$INSUFFICIENT_CREDENTIALS;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$INVALID_CREDENTIALS;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$INVALID_MFA;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$INVALID_SEND_METHOD;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$INVALID_UPDATE_USERNAME;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$ITEM_LOCKED;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$ITEM_LOGIN_REQUIRED;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$ITEM_NOT_SUPPORTED;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$ITEM_NO_ERROR;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$MFA_NOT_SUPPORTED;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$NO_ACCOUNTS;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$NO_AUTH_ACCOUNTS;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$NO_INVESTMENT_ACCOUNTS;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$NO_LIABILITY_ACCOUNTS;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$PRODUCTS_NOT_SUPPORTED;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$PRODUCT_NOT_READY;", "Lcom/plaid/link/result/LinkErrorCode$ItemError$USER_SETUP_REQUIRED;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class ItemError extends com.plaid.link.result.LinkErrorCode {
        public /* synthetic */ ItemError(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private ItemError(java.lang.String str) {
            super(str, com.plaid.link.result.LinkErrorType.ITEM_ERROR.INSTANCE, null);
        }

        public /* synthetic */ ItemError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$INSTANT_MATCH_FAILED;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INSTANT_MATCH_FAILED extends com.plaid.link.result.LinkErrorCode.ItemError {
            public static final com.plaid.link.result.LinkErrorCode.ItemError.INSTANT_MATCH_FAILED INSTANCE = new com.plaid.link.result.LinkErrorCode.ItemError.INSTANT_MATCH_FAILED();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.INSTANT_MATCH_FAILED> CREATOR = new com.plaid.link.result.LinkErrorCode.ItemError.INSTANT_MATCH_FAILED.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.INSTANT_MATCH_FAILED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.INSTANT_MATCH_FAILED createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.ItemError.INSTANT_MATCH_FAILED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.INSTANT_MATCH_FAILED[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.ItemError.INSTANT_MATCH_FAILED[i];
                }
            }

            private INSTANT_MATCH_FAILED() {
                super("INSTANT_MATCH_FAILED", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$INSUFFICIENT_CREDENTIALS;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INSUFFICIENT_CREDENTIALS extends com.plaid.link.result.LinkErrorCode.ItemError {
            public static final com.plaid.link.result.LinkErrorCode.ItemError.INSUFFICIENT_CREDENTIALS INSTANCE = new com.plaid.link.result.LinkErrorCode.ItemError.INSUFFICIENT_CREDENTIALS();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.INSUFFICIENT_CREDENTIALS> CREATOR = new com.plaid.link.result.LinkErrorCode.ItemError.INSUFFICIENT_CREDENTIALS.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.INSUFFICIENT_CREDENTIALS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.INSUFFICIENT_CREDENTIALS createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.ItemError.INSUFFICIENT_CREDENTIALS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.INSUFFICIENT_CREDENTIALS[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.ItemError.INSUFFICIENT_CREDENTIALS[i];
                }
            }

            private INSUFFICIENT_CREDENTIALS() {
                super("INSUFFICIENT_CREDENTIALS", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$INVALID_CREDENTIALS;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_CREDENTIALS extends com.plaid.link.result.LinkErrorCode.ItemError {
            public static final com.plaid.link.result.LinkErrorCode.ItemError.INVALID_CREDENTIALS INSTANCE = new com.plaid.link.result.LinkErrorCode.ItemError.INVALID_CREDENTIALS();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.INVALID_CREDENTIALS> CREATOR = new com.plaid.link.result.LinkErrorCode.ItemError.INVALID_CREDENTIALS.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.INVALID_CREDENTIALS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.INVALID_CREDENTIALS createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.ItemError.INVALID_CREDENTIALS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.INVALID_CREDENTIALS[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.ItemError.INVALID_CREDENTIALS[i];
                }
            }

            private INVALID_CREDENTIALS() {
                super("INVALID_CREDENTIALS", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$INVALID_MFA;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_MFA extends com.plaid.link.result.LinkErrorCode.ItemError {
            public static final com.plaid.link.result.LinkErrorCode.ItemError.INVALID_MFA INSTANCE = new com.plaid.link.result.LinkErrorCode.ItemError.INVALID_MFA();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.INVALID_MFA> CREATOR = new com.plaid.link.result.LinkErrorCode.ItemError.INVALID_MFA.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.INVALID_MFA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.INVALID_MFA createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.ItemError.INVALID_MFA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.INVALID_MFA[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.ItemError.INVALID_MFA[i];
                }
            }

            private INVALID_MFA() {
                super("INVALID_MFA", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$INVALID_SEND_METHOD;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_SEND_METHOD extends com.plaid.link.result.LinkErrorCode.ItemError {
            public static final com.plaid.link.result.LinkErrorCode.ItemError.INVALID_SEND_METHOD INSTANCE = new com.plaid.link.result.LinkErrorCode.ItemError.INVALID_SEND_METHOD();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.INVALID_SEND_METHOD> CREATOR = new com.plaid.link.result.LinkErrorCode.ItemError.INVALID_SEND_METHOD.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.INVALID_SEND_METHOD> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.INVALID_SEND_METHOD createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.ItemError.INVALID_SEND_METHOD.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.INVALID_SEND_METHOD[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.ItemError.INVALID_SEND_METHOD[i];
                }
            }

            private INVALID_SEND_METHOD() {
                super("INVALID_SEND_METHOD", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$INVALID_UPDATE_USERNAME;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVALID_UPDATE_USERNAME extends com.plaid.link.result.LinkErrorCode.ItemError {
            public static final com.plaid.link.result.LinkErrorCode.ItemError.INVALID_UPDATE_USERNAME INSTANCE = new com.plaid.link.result.LinkErrorCode.ItemError.INVALID_UPDATE_USERNAME();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.INVALID_UPDATE_USERNAME> CREATOR = new com.plaid.link.result.LinkErrorCode.ItemError.INVALID_UPDATE_USERNAME.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.INVALID_UPDATE_USERNAME> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.INVALID_UPDATE_USERNAME createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.ItemError.INVALID_UPDATE_USERNAME.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.INVALID_UPDATE_USERNAME[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.ItemError.INVALID_UPDATE_USERNAME[i];
                }
            }

            private INVALID_UPDATE_USERNAME() {
                super("INVALID_UPDATE_USERNAME", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$ITEM_LOCKED;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ITEM_LOCKED extends com.plaid.link.result.LinkErrorCode.ItemError {
            public static final com.plaid.link.result.LinkErrorCode.ItemError.ITEM_LOCKED INSTANCE = new com.plaid.link.result.LinkErrorCode.ItemError.ITEM_LOCKED();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.ITEM_LOCKED> CREATOR = new com.plaid.link.result.LinkErrorCode.ItemError.ITEM_LOCKED.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.ITEM_LOCKED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.ITEM_LOCKED createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.ItemError.ITEM_LOCKED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.ITEM_LOCKED[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.ItemError.ITEM_LOCKED[i];
                }
            }

            private ITEM_LOCKED() {
                super("ITEM_LOCKED", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$ITEM_LOGIN_REQUIRED;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ITEM_LOGIN_REQUIRED extends com.plaid.link.result.LinkErrorCode.ItemError {
            public static final com.plaid.link.result.LinkErrorCode.ItemError.ITEM_LOGIN_REQUIRED INSTANCE = new com.plaid.link.result.LinkErrorCode.ItemError.ITEM_LOGIN_REQUIRED();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.ITEM_LOGIN_REQUIRED> CREATOR = new com.plaid.link.result.LinkErrorCode.ItemError.ITEM_LOGIN_REQUIRED.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.ITEM_LOGIN_REQUIRED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.ITEM_LOGIN_REQUIRED createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.ItemError.ITEM_LOGIN_REQUIRED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.ITEM_LOGIN_REQUIRED[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.ItemError.ITEM_LOGIN_REQUIRED[i];
                }
            }

            private ITEM_LOGIN_REQUIRED() {
                super("ITEM_LOGIN_REQUIRED", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$ITEM_NOT_SUPPORTED;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ITEM_NOT_SUPPORTED extends com.plaid.link.result.LinkErrorCode.ItemError {
            public static final com.plaid.link.result.LinkErrorCode.ItemError.ITEM_NOT_SUPPORTED INSTANCE = new com.plaid.link.result.LinkErrorCode.ItemError.ITEM_NOT_SUPPORTED();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.ITEM_NOT_SUPPORTED> CREATOR = new com.plaid.link.result.LinkErrorCode.ItemError.ITEM_NOT_SUPPORTED.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.ITEM_NOT_SUPPORTED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.ITEM_NOT_SUPPORTED createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.ItemError.ITEM_NOT_SUPPORTED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.ITEM_NOT_SUPPORTED[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.ItemError.ITEM_NOT_SUPPORTED[i];
                }
            }

            private ITEM_NOT_SUPPORTED() {
                super("ITEM_NOT_SUPPORTED", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$ITEM_NO_ERROR;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ITEM_NO_ERROR extends com.plaid.link.result.LinkErrorCode.ItemError {
            public static final com.plaid.link.result.LinkErrorCode.ItemError.ITEM_NO_ERROR INSTANCE = new com.plaid.link.result.LinkErrorCode.ItemError.ITEM_NO_ERROR();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.ITEM_NO_ERROR> CREATOR = new com.plaid.link.result.LinkErrorCode.ItemError.ITEM_NO_ERROR.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.ITEM_NO_ERROR> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.ITEM_NO_ERROR createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.ItemError.ITEM_NO_ERROR.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.ITEM_NO_ERROR[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.ItemError.ITEM_NO_ERROR[i];
                }
            }

            private ITEM_NO_ERROR() {
                super("ITEM_NO_ERROR", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$MFA_NOT_SUPPORTED;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class MFA_NOT_SUPPORTED extends com.plaid.link.result.LinkErrorCode.ItemError {
            public static final com.plaid.link.result.LinkErrorCode.ItemError.MFA_NOT_SUPPORTED INSTANCE = new com.plaid.link.result.LinkErrorCode.ItemError.MFA_NOT_SUPPORTED();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.MFA_NOT_SUPPORTED> CREATOR = new com.plaid.link.result.LinkErrorCode.ItemError.MFA_NOT_SUPPORTED.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.MFA_NOT_SUPPORTED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.MFA_NOT_SUPPORTED createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.ItemError.MFA_NOT_SUPPORTED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.MFA_NOT_SUPPORTED[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.ItemError.MFA_NOT_SUPPORTED[i];
                }
            }

            private MFA_NOT_SUPPORTED() {
                super("MFA_NOT_SUPPORTED", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$NO_ACCOUNTS;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NO_ACCOUNTS extends com.plaid.link.result.LinkErrorCode.ItemError {
            public static final com.plaid.link.result.LinkErrorCode.ItemError.NO_ACCOUNTS INSTANCE = new com.plaid.link.result.LinkErrorCode.ItemError.NO_ACCOUNTS();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.NO_ACCOUNTS> CREATOR = new com.plaid.link.result.LinkErrorCode.ItemError.NO_ACCOUNTS.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.NO_ACCOUNTS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.NO_ACCOUNTS createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.ItemError.NO_ACCOUNTS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.NO_ACCOUNTS[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.ItemError.NO_ACCOUNTS[i];
                }
            }

            private NO_ACCOUNTS() {
                super("NO_ACCOUNTS", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$NO_AUTH_ACCOUNTS;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NO_AUTH_ACCOUNTS extends com.plaid.link.result.LinkErrorCode.ItemError {
            public static final com.plaid.link.result.LinkErrorCode.ItemError.NO_AUTH_ACCOUNTS INSTANCE = new com.plaid.link.result.LinkErrorCode.ItemError.NO_AUTH_ACCOUNTS();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.NO_AUTH_ACCOUNTS> CREATOR = new com.plaid.link.result.LinkErrorCode.ItemError.NO_AUTH_ACCOUNTS.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.NO_AUTH_ACCOUNTS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.NO_AUTH_ACCOUNTS createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.ItemError.NO_AUTH_ACCOUNTS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.NO_AUTH_ACCOUNTS[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.ItemError.NO_AUTH_ACCOUNTS[i];
                }
            }

            private NO_AUTH_ACCOUNTS() {
                super("NO_AUTH_ACCOUNTS", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$NO_INVESTMENT_ACCOUNTS;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NO_INVESTMENT_ACCOUNTS extends com.plaid.link.result.LinkErrorCode.ItemError {
            public static final com.plaid.link.result.LinkErrorCode.ItemError.NO_INVESTMENT_ACCOUNTS INSTANCE = new com.plaid.link.result.LinkErrorCode.ItemError.NO_INVESTMENT_ACCOUNTS();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.NO_INVESTMENT_ACCOUNTS> CREATOR = new com.plaid.link.result.LinkErrorCode.ItemError.NO_INVESTMENT_ACCOUNTS.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.NO_INVESTMENT_ACCOUNTS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.NO_INVESTMENT_ACCOUNTS createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.ItemError.NO_INVESTMENT_ACCOUNTS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.NO_INVESTMENT_ACCOUNTS[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.ItemError.NO_INVESTMENT_ACCOUNTS[i];
                }
            }

            private NO_INVESTMENT_ACCOUNTS() {
                super("NO_INVESTMENT_ACCOUNTS", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$NO_LIABILITY_ACCOUNTS;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NO_LIABILITY_ACCOUNTS extends com.plaid.link.result.LinkErrorCode.ItemError {
            public static final com.plaid.link.result.LinkErrorCode.ItemError.NO_LIABILITY_ACCOUNTS INSTANCE = new com.plaid.link.result.LinkErrorCode.ItemError.NO_LIABILITY_ACCOUNTS();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.NO_LIABILITY_ACCOUNTS> CREATOR = new com.plaid.link.result.LinkErrorCode.ItemError.NO_LIABILITY_ACCOUNTS.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.NO_LIABILITY_ACCOUNTS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.NO_LIABILITY_ACCOUNTS createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.ItemError.NO_LIABILITY_ACCOUNTS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.NO_LIABILITY_ACCOUNTS[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.ItemError.NO_LIABILITY_ACCOUNTS[i];
                }
            }

            private NO_LIABILITY_ACCOUNTS() {
                super("NO_LIABILITY_ACCOUNTS", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$PRODUCTS_NOT_SUPPORTED;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PRODUCTS_NOT_SUPPORTED extends com.plaid.link.result.LinkErrorCode.ItemError {
            public static final com.plaid.link.result.LinkErrorCode.ItemError.PRODUCTS_NOT_SUPPORTED INSTANCE = new com.plaid.link.result.LinkErrorCode.ItemError.PRODUCTS_NOT_SUPPORTED();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.PRODUCTS_NOT_SUPPORTED> CREATOR = new com.plaid.link.result.LinkErrorCode.ItemError.PRODUCTS_NOT_SUPPORTED.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.PRODUCTS_NOT_SUPPORTED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.PRODUCTS_NOT_SUPPORTED createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.ItemError.PRODUCTS_NOT_SUPPORTED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.PRODUCTS_NOT_SUPPORTED[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.ItemError.PRODUCTS_NOT_SUPPORTED[i];
                }
            }

            private PRODUCTS_NOT_SUPPORTED() {
                super("PRODUCTS_NOT_SUPPORTED", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$PRODUCT_NOT_READY;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PRODUCT_NOT_READY extends com.plaid.link.result.LinkErrorCode.ItemError {
            public static final com.plaid.link.result.LinkErrorCode.ItemError.PRODUCT_NOT_READY INSTANCE = new com.plaid.link.result.LinkErrorCode.ItemError.PRODUCT_NOT_READY();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.PRODUCT_NOT_READY> CREATOR = new com.plaid.link.result.LinkErrorCode.ItemError.PRODUCT_NOT_READY.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.PRODUCT_NOT_READY> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.PRODUCT_NOT_READY createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.ItemError.PRODUCT_NOT_READY.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.PRODUCT_NOT_READY[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.ItemError.PRODUCT_NOT_READY[i];
                }
            }

            private PRODUCT_NOT_READY() {
                super("PRODUCT_NOT_READY", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$ItemError$USER_SETUP_REQUIRED;", "Lcom/plaid/link/result/LinkErrorCode$ItemError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class USER_SETUP_REQUIRED extends com.plaid.link.result.LinkErrorCode.ItemError {
            public static final com.plaid.link.result.LinkErrorCode.ItemError.USER_SETUP_REQUIRED INSTANCE = new com.plaid.link.result.LinkErrorCode.ItemError.USER_SETUP_REQUIRED();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.USER_SETUP_REQUIRED> CREATOR = new com.plaid.link.result.LinkErrorCode.ItemError.USER_SETUP_REQUIRED.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.ItemError.USER_SETUP_REQUIRED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.USER_SETUP_REQUIRED createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.ItemError.USER_SETUP_REQUIRED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.ItemError.USER_SETUP_REQUIRED[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.ItemError.USER_SETUP_REQUIRED[i];
                }
            }

            private USER_SETUP_REQUIRED() {
                super("USER_SETUP_REQUIRED", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$OAuthError;", "Lcom/plaid/link/result/LinkErrorCode;", "", "json", "<init>", "(Ljava/lang/String;)V", "INCORRECT_LINK_TOKEN", "INCORRECT_OAUTH_NONCE", "OAUTH_STATE_ID_ALREADY_PROCESSED", "Lcom/plaid/link/result/LinkErrorCode$OAuthError$INCORRECT_LINK_TOKEN;", "Lcom/plaid/link/result/LinkErrorCode$OAuthError$INCORRECT_OAUTH_NONCE;", "Lcom/plaid/link/result/LinkErrorCode$OAuthError$OAUTH_STATE_ID_ALREADY_PROCESSED;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class OAuthError extends com.plaid.link.result.LinkErrorCode {
        public /* synthetic */ OAuthError(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private OAuthError(java.lang.String str) {
            super(str, com.plaid.link.result.LinkErrorType.INSTITUTION_ERROR.INSTANCE, null);
        }

        public /* synthetic */ OAuthError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$OAuthError$INCORRECT_LINK_TOKEN;", "Lcom/plaid/link/result/LinkErrorCode$OAuthError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INCORRECT_LINK_TOKEN extends com.plaid.link.result.LinkErrorCode.OAuthError {
            public static final com.plaid.link.result.LinkErrorCode.OAuthError.INCORRECT_LINK_TOKEN INSTANCE = new com.plaid.link.result.LinkErrorCode.OAuthError.INCORRECT_LINK_TOKEN();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.OAuthError.INCORRECT_LINK_TOKEN> CREATOR = new com.plaid.link.result.LinkErrorCode.OAuthError.INCORRECT_LINK_TOKEN.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.OAuthError.INCORRECT_LINK_TOKEN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.OAuthError.INCORRECT_LINK_TOKEN createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.OAuthError.INCORRECT_LINK_TOKEN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.OAuthError.INCORRECT_LINK_TOKEN[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.OAuthError.INCORRECT_LINK_TOKEN[i];
                }
            }

            private INCORRECT_LINK_TOKEN() {
                super("INCORRECT_LINK_TOKEN", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$OAuthError$INCORRECT_OAUTH_NONCE;", "Lcom/plaid/link/result/LinkErrorCode$OAuthError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INCORRECT_OAUTH_NONCE extends com.plaid.link.result.LinkErrorCode.OAuthError {
            public static final com.plaid.link.result.LinkErrorCode.OAuthError.INCORRECT_OAUTH_NONCE INSTANCE = new com.plaid.link.result.LinkErrorCode.OAuthError.INCORRECT_OAUTH_NONCE();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.OAuthError.INCORRECT_OAUTH_NONCE> CREATOR = new com.plaid.link.result.LinkErrorCode.OAuthError.INCORRECT_OAUTH_NONCE.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.OAuthError.INCORRECT_OAUTH_NONCE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.OAuthError.INCORRECT_OAUTH_NONCE createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.OAuthError.INCORRECT_OAUTH_NONCE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.OAuthError.INCORRECT_OAUTH_NONCE[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.OAuthError.INCORRECT_OAUTH_NONCE[i];
                }
            }

            private INCORRECT_OAUTH_NONCE() {
                super("INCORRECT_OAUTH_NONCE", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$OAuthError$OAUTH_STATE_ID_ALREADY_PROCESSED;", "Lcom/plaid/link/result/LinkErrorCode$OAuthError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class OAUTH_STATE_ID_ALREADY_PROCESSED extends com.plaid.link.result.LinkErrorCode.OAuthError {
            public static final com.plaid.link.result.LinkErrorCode.OAuthError.OAUTH_STATE_ID_ALREADY_PROCESSED INSTANCE = new com.plaid.link.result.LinkErrorCode.OAuthError.OAUTH_STATE_ID_ALREADY_PROCESSED();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.OAuthError.OAUTH_STATE_ID_ALREADY_PROCESSED> CREATOR = new com.plaid.link.result.LinkErrorCode.OAuthError.OAUTH_STATE_ID_ALREADY_PROCESSED.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.OAuthError.OAUTH_STATE_ID_ALREADY_PROCESSED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.OAuthError.OAUTH_STATE_ID_ALREADY_PROCESSED createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.OAuthError.OAUTH_STATE_ID_ALREADY_PROCESSED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.OAuthError.OAUTH_STATE_ID_ALREADY_PROCESSED[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.OAuthError.OAUTH_STATE_ID_ALREADY_PROCESSED[i];
                }
            }

            private OAUTH_STATE_ID_ALREADY_PROCESSED() {
                super("OAUTH_STATE_ID_ALREADY_PROCESSED", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\u000b\f\r\u000e\u000f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$PaymentError;", "Lcom/plaid/link/result/LinkErrorCode;", "", "json", "<init>", "(Ljava/lang/String;)V", "PAYMENT_BLOCKED", "PAYMENT_INSUFFICIENT_FUNDS", "PAYMENT_INVALID_RECIPIENT", "PAYMENT_INVALID_REFERENCE", "PAYMENT_INVALID_SCHEDULE", "Lcom/plaid/link/result/LinkErrorCode$PaymentError$PAYMENT_BLOCKED;", "Lcom/plaid/link/result/LinkErrorCode$PaymentError$PAYMENT_INSUFFICIENT_FUNDS;", "Lcom/plaid/link/result/LinkErrorCode$PaymentError$PAYMENT_INVALID_RECIPIENT;", "Lcom/plaid/link/result/LinkErrorCode$PaymentError$PAYMENT_INVALID_REFERENCE;", "Lcom/plaid/link/result/LinkErrorCode$PaymentError$PAYMENT_INVALID_SCHEDULE;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class PaymentError extends com.plaid.link.result.LinkErrorCode {
        public /* synthetic */ PaymentError(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private PaymentError(java.lang.String str) {
            super(str, com.plaid.link.result.LinkErrorType.INSTITUTION_ERROR.INSTANCE, null);
        }

        public /* synthetic */ PaymentError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$PaymentError$PAYMENT_BLOCKED;", "Lcom/plaid/link/result/LinkErrorCode$PaymentError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PAYMENT_BLOCKED extends com.plaid.link.result.LinkErrorCode.PaymentError {
            public static final com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_BLOCKED INSTANCE = new com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_BLOCKED();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_BLOCKED> CREATOR = new com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_BLOCKED.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_BLOCKED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_BLOCKED createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_BLOCKED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_BLOCKED[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_BLOCKED[i];
                }
            }

            private PAYMENT_BLOCKED() {
                super("PAYMENT_BLOCKED", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$PaymentError$PAYMENT_INSUFFICIENT_FUNDS;", "Lcom/plaid/link/result/LinkErrorCode$PaymentError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PAYMENT_INSUFFICIENT_FUNDS extends com.plaid.link.result.LinkErrorCode.PaymentError {
            public static final com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INSUFFICIENT_FUNDS INSTANCE = new com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INSUFFICIENT_FUNDS();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INSUFFICIENT_FUNDS> CREATOR = new com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INSUFFICIENT_FUNDS.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INSUFFICIENT_FUNDS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INSUFFICIENT_FUNDS createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INSUFFICIENT_FUNDS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INSUFFICIENT_FUNDS[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INSUFFICIENT_FUNDS[i];
                }
            }

            private PAYMENT_INSUFFICIENT_FUNDS() {
                super("PAYMENT_INSUFFICIENT_FUNDS", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$PaymentError$PAYMENT_INVALID_RECIPIENT;", "Lcom/plaid/link/result/LinkErrorCode$PaymentError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PAYMENT_INVALID_RECIPIENT extends com.plaid.link.result.LinkErrorCode.PaymentError {
            public static final com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_RECIPIENT INSTANCE = new com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_RECIPIENT();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_RECIPIENT> CREATOR = new com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_RECIPIENT.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_RECIPIENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_RECIPIENT createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_RECIPIENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_RECIPIENT[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_RECIPIENT[i];
                }
            }

            private PAYMENT_INVALID_RECIPIENT() {
                super("PAYMENT_INVALID_RECIPIENT", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$PaymentError$PAYMENT_INVALID_REFERENCE;", "Lcom/plaid/link/result/LinkErrorCode$PaymentError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PAYMENT_INVALID_REFERENCE extends com.plaid.link.result.LinkErrorCode.PaymentError {
            public static final com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_REFERENCE INSTANCE = new com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_REFERENCE();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_REFERENCE> CREATOR = new com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_REFERENCE.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_REFERENCE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_REFERENCE createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_REFERENCE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_REFERENCE[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_REFERENCE[i];
                }
            }

            private PAYMENT_INVALID_REFERENCE() {
                super("PAYMENT_INVALID_REFERENCE", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$PaymentError$PAYMENT_INVALID_SCHEDULE;", "Lcom/plaid/link/result/LinkErrorCode$PaymentError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PAYMENT_INVALID_SCHEDULE extends com.plaid.link.result.LinkErrorCode.PaymentError {
            public static final com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_SCHEDULE INSTANCE = new com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_SCHEDULE();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_SCHEDULE> CREATOR = new com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_SCHEDULE.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_SCHEDULE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_SCHEDULE createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_SCHEDULE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_SCHEDULE[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.PaymentError.PAYMENT_INVALID_SCHEDULE[i];
                }
            }

            private PAYMENT_INVALID_SCHEDULE() {
                super("PAYMENT_INVALID_SCHEDULE", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\b\u0006\u0007\b\t\n\u000b\f\rB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$RateLimit;", "Lcom/plaid/link/result/LinkErrorCode;", "", "json", "<init>", "(Ljava/lang/String;)V", "ACCOUNTS_LIMIT", "ADDITION_LIMIT", "AUTH_LIMIT", "BALANCE_LIMIT", "IDENTITY_LIMIT", "ITEM_GET_LIMIT", "RATE_LIMIT", "TRANSACTIONS_LIMIT", "Lcom/plaid/link/result/LinkErrorCode$RateLimit$ACCOUNTS_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit$ADDITION_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit$AUTH_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit$BALANCE_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit$IDENTITY_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit$ITEM_GET_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit$RATE_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit$TRANSACTIONS_LIMIT;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class RateLimit extends com.plaid.link.result.LinkErrorCode {
        public /* synthetic */ RateLimit(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private RateLimit(java.lang.String str) {
            super(str, com.plaid.link.result.LinkErrorType.RATE_LIMIT_EXCEEDED.INSTANCE, null);
        }

        public /* synthetic */ RateLimit(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$RateLimit$ACCOUNTS_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ACCOUNTS_LIMIT extends com.plaid.link.result.LinkErrorCode.RateLimit {
            public static final com.plaid.link.result.LinkErrorCode.RateLimit.ACCOUNTS_LIMIT INSTANCE = new com.plaid.link.result.LinkErrorCode.RateLimit.ACCOUNTS_LIMIT();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.RateLimit.ACCOUNTS_LIMIT> CREATOR = new com.plaid.link.result.LinkErrorCode.RateLimit.ACCOUNTS_LIMIT.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.RateLimit.ACCOUNTS_LIMIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.RateLimit.ACCOUNTS_LIMIT createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.RateLimit.ACCOUNTS_LIMIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.RateLimit.ACCOUNTS_LIMIT[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.RateLimit.ACCOUNTS_LIMIT[i];
                }
            }

            private ACCOUNTS_LIMIT() {
                super("ACCOUNTS_LIMIT", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$RateLimit$ADDITION_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ADDITION_LIMIT extends com.plaid.link.result.LinkErrorCode.RateLimit {
            public static final com.plaid.link.result.LinkErrorCode.RateLimit.ADDITION_LIMIT INSTANCE = new com.plaid.link.result.LinkErrorCode.RateLimit.ADDITION_LIMIT();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.RateLimit.ADDITION_LIMIT> CREATOR = new com.plaid.link.result.LinkErrorCode.RateLimit.ADDITION_LIMIT.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.RateLimit.ADDITION_LIMIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.RateLimit.ADDITION_LIMIT createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.RateLimit.ADDITION_LIMIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.RateLimit.ADDITION_LIMIT[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.RateLimit.ADDITION_LIMIT[i];
                }
            }

            private ADDITION_LIMIT() {
                super("ADDITION_LIMIT", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$RateLimit$AUTH_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class AUTH_LIMIT extends com.plaid.link.result.LinkErrorCode.RateLimit {
            public static final com.plaid.link.result.LinkErrorCode.RateLimit.AUTH_LIMIT INSTANCE = new com.plaid.link.result.LinkErrorCode.RateLimit.AUTH_LIMIT();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.RateLimit.AUTH_LIMIT> CREATOR = new com.plaid.link.result.LinkErrorCode.RateLimit.AUTH_LIMIT.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.RateLimit.AUTH_LIMIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.RateLimit.AUTH_LIMIT createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.RateLimit.AUTH_LIMIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.RateLimit.AUTH_LIMIT[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.RateLimit.AUTH_LIMIT[i];
                }
            }

            private AUTH_LIMIT() {
                super("AUTH_LIMIT", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$RateLimit$BALANCE_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BALANCE_LIMIT extends com.plaid.link.result.LinkErrorCode.RateLimit {
            public static final com.plaid.link.result.LinkErrorCode.RateLimit.BALANCE_LIMIT INSTANCE = new com.plaid.link.result.LinkErrorCode.RateLimit.BALANCE_LIMIT();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.RateLimit.BALANCE_LIMIT> CREATOR = new com.plaid.link.result.LinkErrorCode.RateLimit.BALANCE_LIMIT.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.RateLimit.BALANCE_LIMIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.RateLimit.BALANCE_LIMIT createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.RateLimit.BALANCE_LIMIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.RateLimit.BALANCE_LIMIT[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.RateLimit.BALANCE_LIMIT[i];
                }
            }

            private BALANCE_LIMIT() {
                super("BALANCE_LIMIT", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$RateLimit$IDENTITY_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class IDENTITY_LIMIT extends com.plaid.link.result.LinkErrorCode.RateLimit {
            public static final com.plaid.link.result.LinkErrorCode.RateLimit.IDENTITY_LIMIT INSTANCE = new com.plaid.link.result.LinkErrorCode.RateLimit.IDENTITY_LIMIT();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.RateLimit.IDENTITY_LIMIT> CREATOR = new com.plaid.link.result.LinkErrorCode.RateLimit.IDENTITY_LIMIT.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.RateLimit.IDENTITY_LIMIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.RateLimit.IDENTITY_LIMIT createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.RateLimit.IDENTITY_LIMIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.RateLimit.IDENTITY_LIMIT[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.RateLimit.IDENTITY_LIMIT[i];
                }
            }

            private IDENTITY_LIMIT() {
                super("IDENTITY_LIMIT", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$RateLimit$ITEM_GET_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ITEM_GET_LIMIT extends com.plaid.link.result.LinkErrorCode.RateLimit {
            public static final com.plaid.link.result.LinkErrorCode.RateLimit.ITEM_GET_LIMIT INSTANCE = new com.plaid.link.result.LinkErrorCode.RateLimit.ITEM_GET_LIMIT();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.RateLimit.ITEM_GET_LIMIT> CREATOR = new com.plaid.link.result.LinkErrorCode.RateLimit.ITEM_GET_LIMIT.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.RateLimit.ITEM_GET_LIMIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.RateLimit.ITEM_GET_LIMIT createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.RateLimit.ITEM_GET_LIMIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.RateLimit.ITEM_GET_LIMIT[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.RateLimit.ITEM_GET_LIMIT[i];
                }
            }

            private ITEM_GET_LIMIT() {
                super("ITEM_GET_LIMIT", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$RateLimit$RATE_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RATE_LIMIT extends com.plaid.link.result.LinkErrorCode.RateLimit {
            public static final com.plaid.link.result.LinkErrorCode.RateLimit.RATE_LIMIT INSTANCE = new com.plaid.link.result.LinkErrorCode.RateLimit.RATE_LIMIT();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.RateLimit.RATE_LIMIT> CREATOR = new com.plaid.link.result.LinkErrorCode.RateLimit.RATE_LIMIT.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.RateLimit.RATE_LIMIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.RateLimit.RATE_LIMIT createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.RateLimit.RATE_LIMIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.RateLimit.RATE_LIMIT[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.RateLimit.RATE_LIMIT[i];
                }
            }

            private RATE_LIMIT() {
                super("RATE_LIMIT", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$RateLimit$TRANSACTIONS_LIMIT;", "Lcom/plaid/link/result/LinkErrorCode$RateLimit;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TRANSACTIONS_LIMIT extends com.plaid.link.result.LinkErrorCode.RateLimit {
            public static final com.plaid.link.result.LinkErrorCode.RateLimit.TRANSACTIONS_LIMIT INSTANCE = new com.plaid.link.result.LinkErrorCode.RateLimit.TRANSACTIONS_LIMIT();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.RateLimit.TRANSACTIONS_LIMIT> CREATOR = new com.plaid.link.result.LinkErrorCode.RateLimit.TRANSACTIONS_LIMIT.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.RateLimit.TRANSACTIONS_LIMIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.RateLimit.TRANSACTIONS_LIMIT createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.RateLimit.TRANSACTIONS_LIMIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.RateLimit.TRANSACTIONS_LIMIT[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.RateLimit.TRANSACTIONS_LIMIT[i];
                }
            }

            private TRANSACTIONS_LIMIT() {
                super("TRANSACTIONS_LIMIT", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$RecaptchaError;", "Lcom/plaid/link/result/LinkErrorCode;", "", "json", "<init>", "(Ljava/lang/String;)V", "RECAPTCHA_BAD", "RECAPTCHA_REQUIRED", "Lcom/plaid/link/result/LinkErrorCode$RecaptchaError$RECAPTCHA_BAD;", "Lcom/plaid/link/result/LinkErrorCode$RecaptchaError$RECAPTCHA_REQUIRED;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class RecaptchaError extends com.plaid.link.result.LinkErrorCode {
        public /* synthetic */ RecaptchaError(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private RecaptchaError(java.lang.String str) {
            super(str, com.plaid.link.result.LinkErrorType.INSTITUTION_ERROR.INSTANCE, null);
        }

        public /* synthetic */ RecaptchaError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$RecaptchaError$RECAPTCHA_BAD;", "Lcom/plaid/link/result/LinkErrorCode$RecaptchaError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RECAPTCHA_BAD extends com.plaid.link.result.LinkErrorCode.RecaptchaError {
            public static final com.plaid.link.result.LinkErrorCode.RecaptchaError.RECAPTCHA_BAD INSTANCE = new com.plaid.link.result.LinkErrorCode.RecaptchaError.RECAPTCHA_BAD();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.RecaptchaError.RECAPTCHA_BAD> CREATOR = new com.plaid.link.result.LinkErrorCode.RecaptchaError.RECAPTCHA_BAD.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.RecaptchaError.RECAPTCHA_BAD> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.RecaptchaError.RECAPTCHA_BAD createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.RecaptchaError.RECAPTCHA_BAD.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.RecaptchaError.RECAPTCHA_BAD[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.RecaptchaError.RECAPTCHA_BAD[i];
                }
            }

            private RECAPTCHA_BAD() {
                super("RECAPTCHA_BAD", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$RecaptchaError$RECAPTCHA_REQUIRED;", "Lcom/plaid/link/result/LinkErrorCode$RecaptchaError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RECAPTCHA_REQUIRED extends com.plaid.link.result.LinkErrorCode.RecaptchaError {
            public static final com.plaid.link.result.LinkErrorCode.RecaptchaError.RECAPTCHA_REQUIRED INSTANCE = new com.plaid.link.result.LinkErrorCode.RecaptchaError.RECAPTCHA_REQUIRED();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.RecaptchaError.RECAPTCHA_REQUIRED> CREATOR = new com.plaid.link.result.LinkErrorCode.RecaptchaError.RECAPTCHA_REQUIRED.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.RecaptchaError.RECAPTCHA_REQUIRED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.RecaptchaError.RECAPTCHA_REQUIRED createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.RecaptchaError.RECAPTCHA_REQUIRED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.RecaptchaError.RECAPTCHA_REQUIRED[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.RecaptchaError.RECAPTCHA_REQUIRED[i];
                }
            }

            private RECAPTCHA_REQUIRED() {
                super("RECAPTCHA_REQUIRED", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$SandboxError;", "Lcom/plaid/link/result/LinkErrorCode;", "", "json", "<init>", "(Ljava/lang/String;)V", "SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID", "SANDBOX_PRODUCT_NOT_ENABLED", "SANDBOX_WEBHOOK_INVALID", "Lcom/plaid/link/result/LinkErrorCode$SandboxError$SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID;", "Lcom/plaid/link/result/LinkErrorCode$SandboxError$SANDBOX_PRODUCT_NOT_ENABLED;", "Lcom/plaid/link/result/LinkErrorCode$SandboxError$SANDBOX_WEBHOOK_INVALID;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class SandboxError extends com.plaid.link.result.LinkErrorCode {
        public /* synthetic */ SandboxError(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private SandboxError(java.lang.String str) {
            super(str, com.plaid.link.result.LinkErrorType.INSTITUTION_ERROR.INSTANCE, null);
        }

        public /* synthetic */ SandboxError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$SandboxError$SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID;", "Lcom/plaid/link/result/LinkErrorCode$SandboxError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID extends com.plaid.link.result.LinkErrorCode.SandboxError {
            public static final com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID INSTANCE = new com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID> CREATOR = new com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID[i];
                }
            }

            private SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID() {
                super("SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$SandboxError$SANDBOX_PRODUCT_NOT_ENABLED;", "Lcom/plaid/link/result/LinkErrorCode$SandboxError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SANDBOX_PRODUCT_NOT_ENABLED extends com.plaid.link.result.LinkErrorCode.SandboxError {
            public static final com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_PRODUCT_NOT_ENABLED INSTANCE = new com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_PRODUCT_NOT_ENABLED();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_PRODUCT_NOT_ENABLED> CREATOR = new com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_PRODUCT_NOT_ENABLED.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_PRODUCT_NOT_ENABLED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_PRODUCT_NOT_ENABLED createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_PRODUCT_NOT_ENABLED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_PRODUCT_NOT_ENABLED[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_PRODUCT_NOT_ENABLED[i];
                }
            }

            private SANDBOX_PRODUCT_NOT_ENABLED() {
                super("SANDBOX_PRODUCT_NOT_ENABLED", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$SandboxError$SANDBOX_WEBHOOK_INVALID;", "Lcom/plaid/link/result/LinkErrorCode$SandboxError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SANDBOX_WEBHOOK_INVALID extends com.plaid.link.result.LinkErrorCode.SandboxError {
            public static final com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_WEBHOOK_INVALID INSTANCE = new com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_WEBHOOK_INVALID();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_WEBHOOK_INVALID> CREATOR = new com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_WEBHOOK_INVALID.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_WEBHOOK_INVALID> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_WEBHOOK_INVALID createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_WEBHOOK_INVALID.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_WEBHOOK_INVALID[] newArray(int i) {
                    return new com.plaid.link.result.LinkErrorCode.SandboxError.SANDBOX_WEBHOOK_INVALID[i];
                }
            }

            private SANDBOX_WEBHOOK_INVALID() {
                super("SANDBOX_WEBHOOK_INVALID", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }
    }

    public /* synthetic */ LinkErrorCode(java.lang.String str, com.plaid.link.result.LinkErrorType linkErrorType, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, linkErrorType);
    }

    public final com.plaid.link.result.LinkErrorType getErrorType() {
        return this.errorType;
    }

    public final java.lang.String getJson() {
        return this.json;
    }

    public java.lang.String toString() {
        com.plaid.link.result.LinkErrorType linkErrorType = this.errorType;
        java.lang.String str = this.json;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(linkErrorType);
        sb.append(" : ");
        sb.append(str);
        return sb.toString();
    }

    private LinkErrorCode(java.lang.String str, com.plaid.link.result.LinkErrorType linkErrorType) {
        this.json = str;
        this.errorType = linkErrorType;
    }

    public /* synthetic */ LinkErrorCode(java.lang.String str, com.plaid.link.result.LinkErrorType linkErrorType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, linkErrorType, null);
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$INTERNAL_ERROR;", "Lcom/plaid/link/result/LinkErrorCode;", "", "name", "Lcom/plaid/link/result/LinkErrorType;", "type", "<init>", "(Ljava/lang/String;Lcom/plaid/link/result/LinkErrorType;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/plaid/link/result/LinkErrorType;", "getType", "()Lcom/plaid/link/result/LinkErrorType;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class INTERNAL_ERROR extends com.plaid.link.result.LinkErrorCode {
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.INTERNAL_ERROR> CREATOR = new com.plaid.link.result.LinkErrorCode.INTERNAL_ERROR.Creator();
        private final java.lang.String name;
        private final com.plaid.link.result.LinkErrorType type;

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.INTERNAL_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorCode.INTERNAL_ERROR createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.plaid.link.result.LinkErrorCode.INTERNAL_ERROR(parcel.readString(), (com.plaid.link.result.LinkErrorType) parcel.readParcelable(com.plaid.link.result.LinkErrorCode.INTERNAL_ERROR.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorCode.INTERNAL_ERROR[] newArray(int i) {
                return new com.plaid.link.result.LinkErrorCode.INTERNAL_ERROR[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public INTERNAL_ERROR(java.lang.String str, com.plaid.link.result.LinkErrorType linkErrorType) {
            super(str, linkErrorType, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkErrorType, "");
            this.name = str;
            this.type = linkErrorType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final com.plaid.link.result.LinkErrorType getType() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.name);
            parcel.writeParcelable(this.type, flags);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/plaid/link/result/LinkErrorCode$UNKNOWN;", "Lcom/plaid/link/result/LinkErrorCode;", "", "name", "Lcom/plaid/link/result/LinkErrorType;", "type", "<init>", "(Ljava/lang/String;Lcom/plaid/link/result/LinkErrorType;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/plaid/link/result/LinkErrorType;", "getType", "()Lcom/plaid/link/result/LinkErrorType;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UNKNOWN extends com.plaid.link.result.LinkErrorCode {
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.UNKNOWN> CREATOR = new com.plaid.link.result.LinkErrorCode.UNKNOWN.Creator();
        private final java.lang.String name;
        private final com.plaid.link.result.LinkErrorType type;

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorCode.UNKNOWN> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorCode.UNKNOWN createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.plaid.link.result.LinkErrorCode.UNKNOWN(parcel.readString(), (com.plaid.link.result.LinkErrorType) parcel.readParcelable(com.plaid.link.result.LinkErrorCode.UNKNOWN.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorCode.UNKNOWN[] newArray(int i) {
                return new com.plaid.link.result.LinkErrorCode.UNKNOWN[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UNKNOWN(java.lang.String str, com.plaid.link.result.LinkErrorType linkErrorType) {
            super(str, linkErrorType, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkErrorType, "");
            this.name = str;
            this.type = linkErrorType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final com.plaid.link.result.LinkErrorType getType() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.name);
            parcel.writeParcelable(this.type, flags);
        }
    }
}
