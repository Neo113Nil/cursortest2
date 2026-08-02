package com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a@\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00002!\u0010\u0006\u001a\u001d\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001j\u0004\u0018\u0001`\u0004¢\u0006\u0002\b\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/domain/DocUploadViewComponentConfig;", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;", "", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocDescriptionProvider;", "Landroidx/compose/runtime/Composable;", "docDescriptionProvider", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetConfig;", "toWidgetConfig", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/domain/DocUploadViewComponentConfig;Lkotlin/jvm/functions/Function3;Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetConfig;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DocUploadViewComponentConfigMapperKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetConfig toWidgetConfig(com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadViewComponentConfig docUploadViewComponentConfig, kotlin.jvm.functions.Function3<? super com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, java.lang.String> function3, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory docCategory;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory docCategory2;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docUploadViewComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        int i = com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui.DocUploadViewComponentConfigMapperKt.WhenMappings.$EnumSwitchMapping$0[docUploadViewComponentConfig.getDocumentCategory().ordinal()];
        if (i == 1) {
            docCategory = com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfNameAndDob;
        } else if (i == 2) {
            docCategory = com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfSsn;
        } else if (i == 3) {
            docCategory = com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.Poa;
        } else {
            if (i != 4) {
                if (i != 5) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                docCategory2 = null;
                if (docCategory2 != null) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.oneonboarding.LoggerKt.log, "Unrecognized DocUploadCategory, skipping rendering", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("documentCategory", docUploadViewComponentConfig.getDocumentCategory().name())), null, null, 12, null);
                    return null;
                }
                java.util.List<com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType> allowedDocumentTypes = docUploadViewComponentConfig.getAllowedDocumentTypes();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator<T> it = allowedDocumentTypes.iterator();
                while (it.hasNext()) {
                    switch (com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui.DocUploadViewComponentConfigMapperKt.WhenMappings.$EnumSwitchMapping$1[((com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType) it.next()).ordinal()]) {
                        case 1:
                            documentTypeID = com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.Ssn;
                            break;
                        case 2:
                            documentTypeID = com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.Passport;
                            break;
                        case 3:
                            documentTypeID = com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.DriversLicense;
                            break;
                        case 4:
                            documentTypeID = com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.ProofOfName;
                            break;
                        case 5:
                            documentTypeID = com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.ProofOfId;
                            break;
                        case 6:
                            documentTypeID = com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.ProofOfAddress;
                            break;
                        case 7:
                            documentTypeID = com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.UtilitiesBill;
                            break;
                        case 8:
                            documentTypeID = com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.PhoneBill;
                            break;
                        case 9:
                            documentTypeID = com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID.StateIdCard;
                            break;
                        case 10:
                            documentTypeID = null;
                            break;
                        default:
                            throw new kotlin.NoWhenBranchMatchedException();
                    }
                    if (documentTypeID != null) {
                        arrayList.add(documentTypeID);
                    }
                }
                return new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetConfig(docCategory2, arrayList, function3, null, 0, 0, 0, intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Savings, null, null, null, 1912, null);
            }
            docCategory = com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory.ProofOfAddress;
        }
        docCategory2 = docCategory;
        if (docCategory2 != null) {
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory.values().length];
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory.PROOF_OF_NAME_AND_DATE_OF_BIRTH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory.PROOF_OF_SSN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory.POA.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory.PROOF_OF_ADDRESS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory.UNKNOWN__.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.values().length];
            try {
                iArr2[com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.SSN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.PASSPORT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.DRIVERS_LICENSE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.PROOF_OF_NAME.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.PROOF_OF_ID.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.PROOF_OF_ADDRESS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.UTILITIES_BILL.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr2[com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.PHONE_BILL.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr2[com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.STATE_ID_CARD.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr2[com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.UNKNOWN__.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
