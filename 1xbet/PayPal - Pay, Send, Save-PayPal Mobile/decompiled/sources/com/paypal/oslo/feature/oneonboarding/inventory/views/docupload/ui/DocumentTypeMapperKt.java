package com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/domain/DocUploadDocumentType;", "toDocUploadDocumentType", "(Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;)Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/domain/DocUploadDocumentType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DocumentTypeMapperKt {
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType toDocUploadDocumentType(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentTypeID, "");
        switch (com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui.DocumentTypeMapperKt.WhenMappings.$EnumSwitchMapping$0[documentTypeID.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.SSN;
            case 2:
                return com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.PASSPORT;
            case 3:
                return com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.DRIVERS_LICENSE;
            case 4:
                return com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.PROOF_OF_NAME;
            case 5:
                return com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.PROOF_OF_ID;
            case 6:
                return com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.PROOF_OF_ADDRESS;
            case 7:
                return com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.UTILITIES_BILL;
            case 8:
                return com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.PHONE_BILL;
            case 9:
                return com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.STATE_ID_CARD;
            default:
                return com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.UNKNOWN__;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.values().length];
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.Ssn.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.Passport.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.DriversLicense.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.ProofOfName.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.ProofOfId.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.ProofOfAddress.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.UtilitiesBill.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.PhoneBill.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.StateIdCard.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
