package com.daon.dmds.recognizers;

/* loaded from: classes7.dex */
public class DMDSDocumentFactory {

    /* renamed from: com.daon.dmds.recognizers.DMDSDocumentFactory$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;

        static {
            int[] iArr = new int[com.daon.dmds.models.DocTypeEnum.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[com.daon.dmds.models.DocTypeEnum.Passport.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.daon.dmds.models.DocTypeEnum.EdgeDetection.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.daon.dmds.models.DocTypeEnum.EdgeDetection_ID1.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.daon.dmds.models.DocTypeEnum.EdgeDetection_ID2.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.daon.dmds.models.DocTypeEnum.EdgeDetection_ID3.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.daon.dmds.models.DocTypeEnum.EdgeDetection_Custom.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.daon.dmds.models.DocTypeEnum.EdgeDetection_A4.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.daon.dmds.models.DocTypeEnum.EdgeDetection_A4_Landscape.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.daon.dmds.models.DocTypeEnum.EdgeDetection_A4_Portrait.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.daon.dmds.models.DocTypeEnum.MRZ.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.daon.dmds.models.DocTypeEnum.IdDocument.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.daon.dmds.models.DocTypeEnum.IdDocumentCombined.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.daon.dmds.models.DocTypeEnum.IdBarcodeDocument.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
        }
    }

    public static com.daon.dmds.recognizers.DocumentRecognizer getDocument(com.daon.dmds.models.DocTypeEnum docTypeEnum) {
        return getDocument((java.util.List<com.daon.dmds.models.DocTypeEnum>) java.util.Collections.singletonList(docTypeEnum));
    }

    public static com.daon.dmds.recognizers.DocumentRecognizer getDocument(java.util.List<com.daon.dmds.models.DocTypeEnum> list) {
        if (com.daon.dmds.utils.DMDSDocumentUtils.listContainsDocType(list, com.daon.dmds.models.DocTypeEnum.IdDocument) && com.daon.dmds.utils.DMDSDocumentUtils.listContainsDocType(list, com.daon.dmds.models.DocTypeEnum.IdBarcodeDocument)) {
            return new com.daon.dmds.recognizers.documents.IdBarcodeCombinedDocument();
        }
        switch (com.daon.dmds.recognizers.DMDSDocumentFactory.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[com.daon.dmds.utils.DMDSDocumentUtils.extractDocumentType(list).ordinal()]) {
            case 1:
                return new com.daon.dmds.recognizers.documents.PassportDocument();
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return new com.daon.dmds.recognizers.documents.EdgeDocument();
            case 10:
                return new com.daon.dmds.recognizers.documents.MRZDocument();
            case 11:
                return new com.daon.dmds.recognizers.documents.BlinkIDDocument();
            case 12:
                return new com.daon.dmds.recognizers.documents.BlinkIDCombinedDocument();
            case 13:
                return new com.daon.dmds.recognizers.documents.IdBarcodeDocument();
            default:
                return new com.daon.dmds.recognizers.documents.EmptyDocument();
        }
    }
}
