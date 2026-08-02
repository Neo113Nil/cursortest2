package com.paypal.oslo.feature.verificationcapture.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\b¢\u0006\u0004\b\u0006\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/data/mapper/DocumentTypeMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "", "toApiString", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DocumentTypeMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.verificationcapture.data.mapper.DocumentTypeMapper INSTANCE = new com.paypal.oslo.feature.verificationcapture.data.mapper.DocumentTypeMapper();

    private DocumentTypeMapper() {
    }

    public final java.lang.String toApiString(com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
        int i = com.paypal.oslo.feature.verificationcapture.data.mapper.DocumentTypeMapper.WhenMappings.$EnumSwitchMapping$0[documentType.ordinal()];
        if (i == 1) {
            return com.daon.dmds.utils.face.FaceFinderImpl.PASSPORT_DOCUMENT_CLASS;
        }
        if (i == 2) {
            return "DRIVERS_LICENSE";
        }
        if (i == 3) {
            return "NATIONAL_ID";
        }
        if (i == 4) {
            return "PROOF_OF_ADDRESS";
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return "UNKNOWN";
    }

    public final java.lang.String toApiString(com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSide, "");
        int i = com.paypal.oslo.feature.verificationcapture.data.mapper.DocumentTypeMapper.WhenMappings.$EnumSwitchMapping$1[documentSide.ordinal()];
        if (i == 1) {
            return com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.FRONT;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.BACK;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType.values().length];
            try {
                iArr[com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType.PASSPORT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType.DRIVERS_LICENSE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType.NATIONAL_ID_CARD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType.PROOF_OF_ADDRESS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide.values().length];
            try {
                iArr2[com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide.FRONT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide.BACK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
