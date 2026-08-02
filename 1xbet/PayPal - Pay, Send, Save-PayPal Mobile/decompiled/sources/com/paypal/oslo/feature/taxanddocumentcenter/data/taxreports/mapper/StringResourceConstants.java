package com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/mapper/StringResourceConstants;", "", "<init>", "()V", "", "STRING_RESOURCE_PREFIX", "Ljava/lang/String;", "DOWNLOAD_ENDPOINT", "REPORT_IDS", "YEAR", "DESCRIPTION_SUFFIX", "IN_PROGRESS_SEPARATOR", "SECTION_PREFIX", "NOT_ELIGIBLE_MESSAGE_PART", "TOOLTIP_SUFFIX", "INLINE_NOTE_SUFFIX", "TOAST_MESSAGE_SUFFIX", "SALES_1099K_SELF_CORRECTION_IN_PROGRESS_SUFFIX", "UPDATED_REPORTS_NOTE_SUFFIX", "TRANSACTION_STATEMENT_IN_PROGRESS_SUFFIX", "TRANSACTION_STATEMENT_NOT_AVAILABLE_SUFFIX", "LINK_REQUEST_TRANSACTION_STATEMENT_SUFFIX", "REQUEST_STATEMENT_TITLE_SUFFIX", "REQUEST_STATEMENT_DESCRIPTION_SUFFIX", "REQUEST_STATEMENT_PRIMARY_BUTTON_SUFFIX", "SINGLE_ACCOUNT_DESCRIPTION_SUFFIX", "MULTI_ACCOUNT_DESCRIPTION_SUFFIX", "MULTI_SHEET_TITLE_SUFFIX", "MULTI_SHEET_DESCRIPTION_SUFFIX", "SAVINGS_ACCOUNT_TITLE_SUFFIX", "SAVINGS_REPORT_UPDATED_DESCRIPTION_SUFFIX", "SAVINGS_REPORT_ISSUED_DESCRIPTION_SUFFIX", "BADGE_UPDATED_SUFFIX", "BADGE_ISSUED_SUFFIX"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StringResourceConstants {
    public static final int $stable = 0;
    public static final java.lang.String BADGE_ISSUED_SUFFIX = "badge_issued";
    public static final java.lang.String BADGE_UPDATED_SUFFIX = "badge_updated";
    public static final java.lang.String DESCRIPTION_SUFFIX = "_description";
    public static final java.lang.String DOWNLOAD_ENDPOINT = "/v1/customer/tax-reports";
    public static final java.lang.String INLINE_NOTE_SUFFIX = "not_available_inline_note";
    public static final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants();
    public static final java.lang.String IN_PROGRESS_SEPARATOR = "_in_progress_";
    public static final java.lang.String LINK_REQUEST_TRANSACTION_STATEMENT_SUFFIX = "link_request_transaction_statement";
    public static final java.lang.String MULTI_ACCOUNT_DESCRIPTION_SUFFIX = "_multi_account_description";
    public static final java.lang.String MULTI_SHEET_DESCRIPTION_SUFFIX = "_multi_sheet_description";
    public static final java.lang.String MULTI_SHEET_TITLE_SUFFIX = "_multi_sheet_title";
    public static final java.lang.String NOT_ELIGIBLE_MESSAGE_PART = "not_eligible_message_";
    public static final java.lang.String REPORT_IDS = "report_ids";
    public static final java.lang.String REQUEST_STATEMENT_DESCRIPTION_SUFFIX = "request_statement_description";
    public static final java.lang.String REQUEST_STATEMENT_PRIMARY_BUTTON_SUFFIX = "request_statement_primary_button_text";
    public static final java.lang.String REQUEST_STATEMENT_TITLE_SUFFIX = "request_statement_title";
    public static final java.lang.String SALES_1099K_SELF_CORRECTION_IN_PROGRESS_SUFFIX = "sales_1099k_self_correction_in_progress_text";
    public static final java.lang.String SAVINGS_ACCOUNT_TITLE_SUFFIX = "savings_account_title";
    public static final java.lang.String SAVINGS_REPORT_ISSUED_DESCRIPTION_SUFFIX = "savings_report_issued_description";
    public static final java.lang.String SAVINGS_REPORT_UPDATED_DESCRIPTION_SUFFIX = "savings_report_updated_description";
    public static final java.lang.String SECTION_PREFIX = "section_";
    public static final java.lang.String SINGLE_ACCOUNT_DESCRIPTION_SUFFIX = "_single_account_description";
    public static final java.lang.String STRING_RESOURCE_PREFIX = "feature_tax_and_document_center_";
    public static final java.lang.String TOAST_MESSAGE_SUFFIX = "not_available_toast_message";
    public static final java.lang.String TOOLTIP_SUFFIX = "_tooltip";
    public static final java.lang.String TRANSACTION_STATEMENT_IN_PROGRESS_SUFFIX = "sales_transaction_statement_in_progress_text";
    public static final java.lang.String TRANSACTION_STATEMENT_NOT_AVAILABLE_SUFFIX = "sales_transaction_statement_not_available_yet_text";
    public static final java.lang.String UPDATED_REPORTS_NOTE_SUFFIX = "updated_reports_note";
    public static final java.lang.String YEAR = "year";

    private StringResourceConstants() {
    }
}
