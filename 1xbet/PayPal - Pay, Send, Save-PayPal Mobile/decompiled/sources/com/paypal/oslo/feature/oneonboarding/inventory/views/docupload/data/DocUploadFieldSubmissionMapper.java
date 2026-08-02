package com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.data;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\t\u001a\u00060\u0005j\u0002`\u00062\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/data/DocUploadFieldSubmissionMapper;", "Lcom/paypal/oslo/feature/oneonboarding/data/mapper/FieldSubmissionMapper;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/domain/DocUploadCollectedItem;", "<init>", "()V", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardComponentsInput;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/type/OnboardComponentsInput;", "componentsInput", "item", "makeFieldSubmission", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardComponentsInput;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/domain/DocUploadCollectedItem;)Lcom/paypal/oslo/api/graphql/schema/type/OnboardComponentsInput;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DocUploadFieldSubmissionMapper implements com.paypal.oslo.feature.oneonboarding.data.mapper.FieldSubmissionMapper<com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCollectedItem> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public DocUploadFieldSubmissionMapper() {
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.mapper.FieldSubmissionMapper
    public final com.paypal.oslo.api.graphql.schema.type.OnboardComponentsInput makeFieldSubmission(com.paypal.oslo.api.graphql.schema.type.OnboardComponentsInput componentsInput, com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCollectedItem item) {
        com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory onboardDocumentCategory;
        com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType onboardDocumentType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentsInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        int i = com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.data.DocUploadFieldSubmissionMapper.WhenMappings.$EnumSwitchMapping$0[item.getDocumentCategory().ordinal()];
        if (i == 1) {
            onboardDocumentCategory = com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory.PROOF_OF_NAME_AND_DATE_OF_BIRTH;
        } else if (i == 2) {
            onboardDocumentCategory = com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory.PROOF_OF_SSN;
        } else if (i == 3) {
            onboardDocumentCategory = com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory.POA;
        } else if (i == 4) {
            onboardDocumentCategory = com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory.PROOF_OF_ADDRESS;
        } else {
            if (i != 5) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            onboardDocumentCategory = com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory.UNKNOWN__;
        }
        switch (com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.data.DocUploadFieldSubmissionMapper.WhenMappings.$EnumSwitchMapping$1[item.getDocumentType().ordinal()]) {
            case 1:
                onboardDocumentType = com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType.SSN;
                break;
            case 2:
                onboardDocumentType = com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType.PASSPORT;
                break;
            case 3:
                onboardDocumentType = com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType.DRIVERS_LICENSE;
                break;
            case 4:
                onboardDocumentType = com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType.PROOF_OF_NAME;
                break;
            case 5:
                onboardDocumentType = com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType.PROOF_OF_ID;
                break;
            case 6:
                onboardDocumentType = com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType.PROOF_OF_ADDRESS;
                break;
            case 7:
                onboardDocumentType = com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType.UTILITIES_BILL;
                break;
            case 8:
                onboardDocumentType = com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType.PHONE_BILL;
                break;
            case 9:
                onboardDocumentType = com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType.STATE_ID_CARD;
                break;
            case 10:
                onboardDocumentType = com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType.UNKNOWN__;
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.oneonboarding.data.mapper.OnboardComponentsInputExtensionsKt.appendingDocUploadInput(componentsInput, new com.paypal.oslo.api.graphql.schema.type.OnboardDocUploadInputComponentInput(onboardDocumentCategory, onboardDocumentType, item.getDocumentReferenceId(), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(item.getGetHighSpeedVideoSizes())));
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
