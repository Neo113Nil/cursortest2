package com.paypal.oslo.feature.mosaic.widget;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a\u0013\u0010\t\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\"\u0018\u0010\u000f\u001a\u00020\f*\u00020\u000b8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0018\u0010\u0013\u001a\u00020\u0010*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u001e\u0010\u0018\u001a\u00020\f*\u00020\u00008AX\u0080\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\"\u001e\u0010\u0018\u001a\u00020\f*\u00020\u00048AX\u0080\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;", "", "displayName", "(Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocCategory;", "(Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocCategory;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "toIdScanDocumentType", "(Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;)Ljava/lang/String;", "defaultDescription", "toFlowName", "(Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocCategory;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadError;", "", "getMessageResId", "(Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadError;)I", "messageResId", "Lcom/paypal/pds/core/Icon;", "getIcon", "(Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;)Lcom/paypal/pds/core/Icon;", "icon", "getDisplayNameResId", "(Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;)I", "getDisplayNameResId$annotations", "(Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;)V", "displayNameResId", "(Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocCategory;)I", "(Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocCategory;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DocUploadMappingsKt {
    public static /* synthetic */ void getDisplayNameResId$annotations(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory docCategory) {
    }

    public static /* synthetic */ void getDisplayNameResId$annotations(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID) {
    }

    public static final int getMessageResId(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError docUploadError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docUploadError, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(docUploadError, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.NoDocumentTypeIDSelected.INSTANCE)) {
            return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_error_no_doc_type_selected;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(docUploadError, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.UploadFailed.INSTANCE)) {
            return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_error_upload_failed;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(docUploadError, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.PermissionDenied.INSTANCE)) {
            return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_error_permission_denied;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(docUploadError, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.Cancelled.INSTANCE)) {
            return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_error_cancelled;
        }
        if (docUploadError instanceof com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.Unknown) {
            return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_error_unknown;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.paypal.pds.core.Icon getIcon(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentTypeID, "");
        switch (com.paypal.oslo.feature.mosaic.widget.DocUploadMappingsKt.WhenMappings.$EnumSwitchMapping$0[documentTypeID.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                return com.paypal.pds.core.Icon.Card.INSTANCE;
            default:
                return com.paypal.pds.core.Icon.Document.INSTANCE;
        }
    }

    public static final int getDisplayNameResId(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentTypeID, "");
        switch (com.paypal.oslo.feature.mosaic.widget.DocUploadMappingsKt.WhenMappings.$EnumSwitchMapping$0[documentTypeID.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_drivers_license;
            case 2:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_id_card;
            case 3:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_national_id_card;
            case 4:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_state_id_card;
            case 5:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_voter_id;
            case 6:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_voter_id_card;
            case 7:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_nexus_card;
            case 8:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_residence_card;
            case 9:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_migration_card;
            case 10:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_health_insurance_card;
            case 11:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_social_security_card;
            case 12:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_aadhar_card;
            case 13:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_alien_registration_card;
            case 14:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_defence_card;
            case 15:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_defence_dependent_card;
            case 16:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_disability_id_card;
            case 17:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_nrega_card;
            case 18:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_organisation_identity_card;
            case 19:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_pension_card;
            case 20:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_ration_card;
            case 21:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_social_ration_card;
            case 22:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_resident_registration_card;
            case 23:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_hk_id;
            case 24:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_credit_card_copy;
            case 25:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_proof_of_age_card;
            case 26:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_special_permanent_residence_card;
            case 27:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_bank_cheque;
            case 28:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_bank_doc;
            case 29:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_bank_letter;
            case 30:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_bank_passbook;
            case 31:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_bank_statement;
            case 32:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_birth_certificate;
            case 33:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_cc_statement;
            case 34:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_certificate_of_longterm_care_insurance;
            case 35:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_certificate_of_loss_of_nationality;
            case 36:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_certificate_of_residence;
            case 37:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_certificate_of_residence_with_registered_items;
            case 38:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_certificate_of_residence_with_tax_id;
            case 39:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_citizenship_certificate;
            case 40:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_corporate_contract;
            case 41:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_council_rates_notice;
            case 42:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_council_rates_notices;
            case 43:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_cpf;
            case 44:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_cra_statement;
            case 45:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_curp_certificate;
            case 46:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_demat_statement;
            case 47:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_ein;
            case 48:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_electricity_bill;
            case 49:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_employee_pay_slip;
            case 50:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_employer_issued_letter;
            case 51:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_face_photo;
            case 52:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_fcra_registration;
            case 53:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_fiscal_code;
            case 54:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_gas_bill;
            case 55:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_government_issued_id;
            case 56:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_gstinuin;
            case 57:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_gst_certification;
            case 58:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_immigrant_id;
            case 59:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_india_post_issued_address_proof;
            case 60:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_inn;
            case 61:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_insurance_premium_receipt;
            case 62:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_itin;
            case 63:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_kpp;
            case 64:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_lease_agreement;
            case 65:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_letter_from_council;
            case 66:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_letter_issued_by_employer;
            case 67:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_letter_of_authorization;
            case 68:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_letter_of_bank_debit_authorization;
            case 69:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_letter_of_trustee;
            case 70:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_loan_statement;
            case 71:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_military_identification_card;
            case 72:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_mortgage_statement;
            case 73:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_mutual_fund_certificate;
            case 74:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_my_number;
            case 75:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_my_number_notification_card;
            case 76:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_national_id;
            case 77:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_notary_affidavit;
            case 78:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_official_government_letter;
            case 79:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_other;
            case 80:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_other_govt_id;
            case 81:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_ownership_certificate;
            case 82:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_pan;
            case 83:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_pan_intimation_letter;
            case 84:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_passbook;
            case 85:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_passport;
            case 86:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_pension_books;
            case 87:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_personal_income_tax_return;
            case 88:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_phone_bill;
            case 89:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_photo_id;
            case 90:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_postal_address_proof;
            case 91:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_power_of_attorney;
            case 92:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_proof_of_address;
            case 93:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_proof_of_business_address;
            case 94:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_proof_of_id;
            case 95:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_proof_of_identity;
            case 96:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_proof_of_name;
            case 97:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_proof_of_sin;
            case 98:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_property_tax_assessment;
            case 99:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_receipt_of_tax_payment;
            case 100:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_relationship_document;
            case 101:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_self_assessment_tax_form;
            case 102:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_sin;
            case 103:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_snils;
            case 104:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_social_insurance_premium;
            case 105:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_social_security_benefits_statement;
            case 106:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_ssn;
            case 107:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_student_record;
            case 108:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_tax_assessment_notice;
            case 109:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_tax_exemption_proof;
            case 110:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_tax_id;
            case 111:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_tax_info_correction_form;
            case 112:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_tax_registration_certificate;
            case 113:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_tax_statement;
            case 114:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_travel_permit;
            case 115:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_tv_bill;
            case 116:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_usirs_w9_form;
            case 117:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_utilities_bill;
            case 118:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_veo_certificate;
            case 119:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_visa;
            case 120:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_voided_bank_check;
            case 121:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_voided_check;
            case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_water_bill;
            case SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_welfare_books;
            case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_w8ben_form;
            case 125:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_w8bene_form;
            case 126:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_type_w8eci_form;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final java.lang.String displayName(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentTypeID, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1206028367, i, -1, "com.paypal.oslo.feature.mosaic.widget.displayName (DocUploadMappings.kt:219)");
        }
        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(getDisplayNameResId(documentTypeID), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    public static final int getDisplayNameResId(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory docCategory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docCategory, "");
        switch (com.paypal.oslo.feature.mosaic.widget.DocUploadMappingsKt.WhenMappings.$EnumSwitchMapping$1[docCategory.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_proof_of_address;
            case 2:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_proof_of_address;
            case 3:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_category_proof_of_authority;
            case 4:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_category_proof_of_bank;
            case 5:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_category_proof_of_biz_registration;
            case 6:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_category_proof_of_bo_identity;
            case 7:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_category_proof_of_business;
            case 8:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_category_proof_of_business_existence;
            case 9:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_category_proof_of_business_name;
            case 10:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_category_proof_of_business_ownership;
            case 11:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_category_proof_of_business_structure;
            case 12:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_category_proof_of_charity;
            case 13:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_category_proof_of_citizenship;
            case 14:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_category_proof_of_company_executive_identity;
            case 15:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_category_proof_of_contact_name;
            case 16:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_category_proof_of_face_match;
            case 17:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_category_proof_of_financial_account;
            case 18:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_category_proof_of_foreign_address;
            case 19:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_category_proof_of_foreign_identity;
            case 20:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_proof_of_identity;
            case 21:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_proof_of_identity;
            case 22:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_proof_of_name;
            case 23:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_proof_of_identity;
            case 24:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_category_proof_of_non_us_tax_status;
            case 25:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_category_proof_of_office_bearer_identity;
            case 26:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_category_proof_of_ownership;
            case 27:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_category_proof_of_partner_identity;
            case 28:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_category_proof_of_residency_status;
            case 29:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_category_proof_of_tax;
            case 30:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_category_proof_of_tax;
            case 31:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_category_proof_of_tax_exemption;
            case 32:
                return com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_doc_upload_widget_doc_category_proof_of_tax_id;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final java.lang.String displayName(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory docCategory, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docCategory, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1725377435, i, -1, "com.paypal.oslo.feature.mosaic.widget.displayName (DocUploadMappings.kt:271)");
        }
        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(getDisplayNameResId(docCategory), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    public static final java.lang.String toIdScanDocumentType(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentTypeID, "");
        return documentTypeID.getKey();
    }

    public static final java.lang.String defaultDescription(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentTypeID, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1349422879, i, -1, "com.paypal.oslo.feature.mosaic.widget.defaultDescription (DocUploadMappings.kt:285)");
        }
        if (!androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            return null;
        }
        androidx.compose.runtime.ComposerKt.traceEventEnd();
        return null;
    }

    public static final java.lang.String toFlowName(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory docCategory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docCategory, "");
        return docCategory.getKey();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.values().length];
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.DriversLicense.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.IdCard.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.NationalIdCard.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.StateIdCard.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.VoterId.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.VoterIdCard.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.NexusCard.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.ResidenceCard.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.MigrationCard.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.HealthInsuranceCard.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.SocialSecurityCard.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.AadharCard.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.AlienRegistrationCard.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.DefenceCard.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.DefenceDependentCard.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.DisabilityIdCard.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.NregaCard.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.OrganisationIdentityCard.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.PensionCard.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.RationCard.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.SocialRationCard.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.ResidentRegistrationCard.ordinal()] = 22;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.HkId.ordinal()] = 23;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.CreditCardCopy.ordinal()] = 24;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.ProofOfAgeCard.ordinal()] = 25;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.SpecialPermanentResidenceCard.ordinal()] = 26;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.BankCheque.ordinal()] = 27;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.BankDoc.ordinal()] = 28;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.BankLetter.ordinal()] = 29;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.BankPassbook.ordinal()] = 30;
            } catch (java.lang.NoSuchFieldError unused30) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.BankStatement.ordinal()] = 31;
            } catch (java.lang.NoSuchFieldError unused31) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.BirthCertificate.ordinal()] = 32;
            } catch (java.lang.NoSuchFieldError unused32) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.CcStatement.ordinal()] = 33;
            } catch (java.lang.NoSuchFieldError unused33) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.CertificateOfLongtermCareInsurance.ordinal()] = 34;
            } catch (java.lang.NoSuchFieldError unused34) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.CertificateOfLossOfNationality.ordinal()] = 35;
            } catch (java.lang.NoSuchFieldError unused35) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.CertificateOfResidence.ordinal()] = 36;
            } catch (java.lang.NoSuchFieldError unused36) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.CertificateOfResidenceWithRegisteredItems.ordinal()] = 37;
            } catch (java.lang.NoSuchFieldError unused37) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.CertificateOfResidenceWithTaxId.ordinal()] = 38;
            } catch (java.lang.NoSuchFieldError unused38) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.CitizenshipCertificate.ordinal()] = 39;
            } catch (java.lang.NoSuchFieldError unused39) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.CorporateContract.ordinal()] = 40;
            } catch (java.lang.NoSuchFieldError unused40) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.CouncilRatesNotice.ordinal()] = 41;
            } catch (java.lang.NoSuchFieldError unused41) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.CouncilRatesNotices.ordinal()] = 42;
            } catch (java.lang.NoSuchFieldError unused42) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.Cpf.ordinal()] = 43;
            } catch (java.lang.NoSuchFieldError unused43) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.CraStatement.ordinal()] = 44;
            } catch (java.lang.NoSuchFieldError unused44) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.CurpCertificate.ordinal()] = 45;
            } catch (java.lang.NoSuchFieldError unused45) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.DematStatement.ordinal()] = 46;
            } catch (java.lang.NoSuchFieldError unused46) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.Ein.ordinal()] = 47;
            } catch (java.lang.NoSuchFieldError unused47) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.ElectricityBill.ordinal()] = 48;
            } catch (java.lang.NoSuchFieldError unused48) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.EmployeePaySlip.ordinal()] = 49;
            } catch (java.lang.NoSuchFieldError unused49) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.EmployerIssuedLetter.ordinal()] = 50;
            } catch (java.lang.NoSuchFieldError unused50) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.FacePhoto.ordinal()] = 51;
            } catch (java.lang.NoSuchFieldError unused51) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.FcraRegistration.ordinal()] = 52;
            } catch (java.lang.NoSuchFieldError unused52) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.FiscalCode.ordinal()] = 53;
            } catch (java.lang.NoSuchFieldError unused53) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.GasBill.ordinal()] = 54;
            } catch (java.lang.NoSuchFieldError unused54) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.GovernmentIssuedId.ordinal()] = 55;
            } catch (java.lang.NoSuchFieldError unused55) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.Gstinuin.ordinal()] = 56;
            } catch (java.lang.NoSuchFieldError unused56) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.GstCertification.ordinal()] = 57;
            } catch (java.lang.NoSuchFieldError unused57) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.ImmigrantId.ordinal()] = 58;
            } catch (java.lang.NoSuchFieldError unused58) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.IndiaPostIssuedAddressProof.ordinal()] = 59;
            } catch (java.lang.NoSuchFieldError unused59) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.Inn.ordinal()] = 60;
            } catch (java.lang.NoSuchFieldError unused60) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.InsurancePremiumReceipt.ordinal()] = 61;
            } catch (java.lang.NoSuchFieldError unused61) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.Itin.ordinal()] = 62;
            } catch (java.lang.NoSuchFieldError unused62) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.Kpp.ordinal()] = 63;
            } catch (java.lang.NoSuchFieldError unused63) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.LeaseAgreement.ordinal()] = 64;
            } catch (java.lang.NoSuchFieldError unused64) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.LetterFromCouncil.ordinal()] = 65;
            } catch (java.lang.NoSuchFieldError unused65) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.LetterIssuedByEmployer.ordinal()] = 66;
            } catch (java.lang.NoSuchFieldError unused66) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.LetterOfAuthorization.ordinal()] = 67;
            } catch (java.lang.NoSuchFieldError unused67) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.LetterOfBankDebitAuthorization.ordinal()] = 68;
            } catch (java.lang.NoSuchFieldError unused68) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.LetterOfTrustee.ordinal()] = 69;
            } catch (java.lang.NoSuchFieldError unused69) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.LoanStatement.ordinal()] = 70;
            } catch (java.lang.NoSuchFieldError unused70) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.MilitaryIdentificationCard.ordinal()] = 71;
            } catch (java.lang.NoSuchFieldError unused71) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.MortgageStatement.ordinal()] = 72;
            } catch (java.lang.NoSuchFieldError unused72) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.MutualFundCertificate.ordinal()] = 73;
            } catch (java.lang.NoSuchFieldError unused73) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.MyNumber.ordinal()] = 74;
            } catch (java.lang.NoSuchFieldError unused74) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.MyNumberNotificationCard.ordinal()] = 75;
            } catch (java.lang.NoSuchFieldError unused75) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.NationalId.ordinal()] = 76;
            } catch (java.lang.NoSuchFieldError unused76) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.NotaryAffidavit.ordinal()] = 77;
            } catch (java.lang.NoSuchFieldError unused77) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.OfficialGovernmentLetter.ordinal()] = 78;
            } catch (java.lang.NoSuchFieldError unused78) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.Other.ordinal()] = 79;
            } catch (java.lang.NoSuchFieldError unused79) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.OtherGovtId.ordinal()] = 80;
            } catch (java.lang.NoSuchFieldError unused80) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.OwnershipCertificate.ordinal()] = 81;
            } catch (java.lang.NoSuchFieldError unused81) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.Pan.ordinal()] = 82;
            } catch (java.lang.NoSuchFieldError unused82) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.PanIntimationLetter.ordinal()] = 83;
            } catch (java.lang.NoSuchFieldError unused83) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.Passbook.ordinal()] = 84;
            } catch (java.lang.NoSuchFieldError unused84) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.Passport.ordinal()] = 85;
            } catch (java.lang.NoSuchFieldError unused85) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.PensionBooks.ordinal()] = 86;
            } catch (java.lang.NoSuchFieldError unused86) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.PersonalIncomeTaxReturn.ordinal()] = 87;
            } catch (java.lang.NoSuchFieldError unused87) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.PhoneBill.ordinal()] = 88;
            } catch (java.lang.NoSuchFieldError unused88) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.PhotoId.ordinal()] = 89;
            } catch (java.lang.NoSuchFieldError unused89) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.PostalAddressProof.ordinal()] = 90;
            } catch (java.lang.NoSuchFieldError unused90) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.PowerOfAttorney.ordinal()] = 91;
            } catch (java.lang.NoSuchFieldError unused91) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.ProofOfAddress.ordinal()] = 92;
            } catch (java.lang.NoSuchFieldError unused92) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.ProofOfBusinessAddress.ordinal()] = 93;
            } catch (java.lang.NoSuchFieldError unused93) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.ProofOfId.ordinal()] = 94;
            } catch (java.lang.NoSuchFieldError unused94) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.ProofOfIdentity.ordinal()] = 95;
            } catch (java.lang.NoSuchFieldError unused95) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.ProofOfName.ordinal()] = 96;
            } catch (java.lang.NoSuchFieldError unused96) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.ProofOfSin.ordinal()] = 97;
            } catch (java.lang.NoSuchFieldError unused97) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.PropertyTaxAssessment.ordinal()] = 98;
            } catch (java.lang.NoSuchFieldError unused98) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.ReceiptOfTaxPayment.ordinal()] = 99;
            } catch (java.lang.NoSuchFieldError unused99) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.RelationshipDocument.ordinal()] = 100;
            } catch (java.lang.NoSuchFieldError unused100) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.SelfAssessmentTaxForm.ordinal()] = 101;
            } catch (java.lang.NoSuchFieldError unused101) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.Sin.ordinal()] = 102;
            } catch (java.lang.NoSuchFieldError unused102) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.Snils.ordinal()] = 103;
            } catch (java.lang.NoSuchFieldError unused103) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.SocialInsurancePremium.ordinal()] = 104;
            } catch (java.lang.NoSuchFieldError unused104) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.SocialSecurityBenefitsStatement.ordinal()] = 105;
            } catch (java.lang.NoSuchFieldError unused105) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.Ssn.ordinal()] = 106;
            } catch (java.lang.NoSuchFieldError unused106) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.StudentRecord.ordinal()] = 107;
            } catch (java.lang.NoSuchFieldError unused107) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.TaxAssessmentNotice.ordinal()] = 108;
            } catch (java.lang.NoSuchFieldError unused108) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.TaxExemptionProof.ordinal()] = 109;
            } catch (java.lang.NoSuchFieldError unused109) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.TaxId.ordinal()] = 110;
            } catch (java.lang.NoSuchFieldError unused110) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.TaxInfoCorrectionForm.ordinal()] = 111;
            } catch (java.lang.NoSuchFieldError unused111) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.TaxRegistrationCertificate.ordinal()] = 112;
            } catch (java.lang.NoSuchFieldError unused112) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.TaxStatement.ordinal()] = 113;
            } catch (java.lang.NoSuchFieldError unused113) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.TravelPermit.ordinal()] = 114;
            } catch (java.lang.NoSuchFieldError unused114) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.TvBill.ordinal()] = 115;
            } catch (java.lang.NoSuchFieldError unused115) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.UsirsW9Form.ordinal()] = 116;
            } catch (java.lang.NoSuchFieldError unused116) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.UtilitiesBill.ordinal()] = 117;
            } catch (java.lang.NoSuchFieldError unused117) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.VeoCertificate.ordinal()] = 118;
            } catch (java.lang.NoSuchFieldError unused118) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.Visa.ordinal()] = 119;
            } catch (java.lang.NoSuchFieldError unused119) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.VoidedBankCheck.ordinal()] = 120;
            } catch (java.lang.NoSuchFieldError unused120) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.VoidedCheck.ordinal()] = 121;
            } catch (java.lang.NoSuchFieldError unused121) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.WaterBill.ordinal()] = 122;
            } catch (java.lang.NoSuchFieldError unused122) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.WelfareBooks.ordinal()] = 123;
            } catch (java.lang.NoSuchFieldError unused123) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.W8benForm.ordinal()] = 124;
            } catch (java.lang.NoSuchFieldError unused124) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.W8beneForm.ordinal()] = 125;
            } catch (java.lang.NoSuchFieldError unused125) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.W8eciForm.ordinal()] = 126;
            } catch (java.lang.NoSuchFieldError unused126) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.values().length];
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.Poa.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused127) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfAddress.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused128) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfAuthority.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused129) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfBank.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused130) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfBizRegistration.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused131) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfBoIdentity.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused132) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfBusiness.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused133) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfBusinessExistence.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused134) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfBusinessName.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused135) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfBusinessOwnership.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused136) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfBusinessStructure.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused137) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfCharity.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused138) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfCitizenship.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused139) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfCompanyExecutiveIdentity.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused140) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfContactName.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused141) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfFaceMatch.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused142) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfFinancialAccount.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused143) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfForeignAddress.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused144) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfForeignIdentity.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused145) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfIdentity.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused146) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfIdentityLite.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused147) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfName.ordinal()] = 22;
            } catch (java.lang.NoSuchFieldError unused148) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfNameAndDob.ordinal()] = 23;
            } catch (java.lang.NoSuchFieldError unused149) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfNonUsTaxStatus.ordinal()] = 24;
            } catch (java.lang.NoSuchFieldError unused150) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfOfficeBearerIdentity.ordinal()] = 25;
            } catch (java.lang.NoSuchFieldError unused151) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfOwnership.ordinal()] = 26;
            } catch (java.lang.NoSuchFieldError unused152) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfPartnerIdentity.ordinal()] = 27;
            } catch (java.lang.NoSuchFieldError unused153) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfResidencyStatus.ordinal()] = 28;
            } catch (java.lang.NoSuchFieldError unused154) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfSsn.ordinal()] = 29;
            } catch (java.lang.NoSuchFieldError unused155) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfTax.ordinal()] = 30;
            } catch (java.lang.NoSuchFieldError unused156) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfTaxExemption.ordinal()] = 31;
            } catch (java.lang.NoSuchFieldError unused157) {
            }
            try {
                iArr2[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfTaxId.ordinal()] = 32;
            } catch (java.lang.NoSuchFieldError unused158) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
