package com.paypal.oslo.core.i18n.domain.util;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/util/DocumentTypeUtil;", "", "<init>", "()V", "", "typeKey", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentType;", "getDocumentType", "(Ljava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/model/DocumentType;", "", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentValidation;", "subTypesMap", "", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentSubType;", "getDocumentSubTypes", "(Ljava/lang/String;Ljava/util/Map;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DocumentTypeUtil {
    @javax.inject.Inject
    public DocumentTypeUtil() {
    }

    public final com.paypal.oslo.core.i18n.domain.model.DocumentType getDocumentType(java.lang.String typeKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeKey, "");
        java.util.Locale locale = java.util.Locale.ROOT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = typeKey.toUpperCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(upperCase, "TAX_ID")) {
            return com.paypal.oslo.core.i18n.domain.model.DocumentType.TAX_ID;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(upperCase, "NATIONAL_ID")) {
            return com.paypal.oslo.core.i18n.domain.model.DocumentType.NATIONAL_ID;
        }
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Unknown document type encountered", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("documentType", typeKey)), null, new java.lang.IllegalArgumentException("Unsupported document type: ".concat(java.lang.String.valueOf(typeKey))), 4, null);
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final java.util.List<com.paypal.oslo.core.i18n.domain.model.DocumentSubType> getDocumentSubTypes(java.lang.String typeKey, java.util.Map<java.lang.String, com.paypal.oslo.core.i18n.domain.model.DocumentValidation> subTypesMap) {
        com.paypal.oslo.core.i18n.domain.model.DocumentSubType documentSubType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subTypesMap, "");
        java.util.Set<java.lang.String> keySet = subTypesMap.keySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : keySet) {
            java.util.Locale locale = java.util.Locale.ROOT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String upperCase = str.toUpperCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            switch (upperCase.hashCode()) {
                case -1770235375:
                    if (upperCase.equals("VAT_ID")) {
                        documentSubType = com.paypal.oslo.core.i18n.domain.model.DocumentSubType.VAT_ID;
                        break;
                    }
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.core.i18n.LoggerKt.log;
                    java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("documentType", typeKey), kotlin.TuplesKt.to("documentSubType", str));
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported document subtype: ");
                    sb.append(str);
                    sb.append(" for type: ");
                    sb.append(typeKey);
                    com.paypal.android.logger.Logger.e$default(logger, "Unknown document subtype encountered", mapOf, null, new java.lang.IllegalArgumentException(sb.toString()), 4, null);
                    documentSubType = null;
                    break;
                case -410801838:
                    if (upperCase.equals("STEUERNUMMER")) {
                        documentSubType = com.paypal.oslo.core.i18n.domain.model.DocumentSubType.STEUERNUMMER;
                        break;
                    }
                    com.paypal.android.logger.Logger logger2 = com.paypal.oslo.core.i18n.LoggerKt.log;
                    java.util.Map mapOf2 = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("documentType", typeKey), kotlin.TuplesKt.to("documentSubType", str));
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unsupported document subtype: ");
                    sb2.append(str);
                    sb2.append(" for type: ");
                    sb2.append(typeKey);
                    com.paypal.android.logger.Logger.e$default(logger2, "Unknown document subtype encountered", mapOf2, null, new java.lang.IllegalArgumentException(sb2.toString()), 4, null);
                    documentSubType = null;
                    break;
                case 82414:
                    if (upperCase.equals("SSN")) {
                        documentSubType = com.paypal.oslo.core.i18n.domain.model.DocumentSubType.SSN;
                        break;
                    }
                    com.paypal.android.logger.Logger logger22 = com.paypal.oslo.core.i18n.LoggerKt.log;
                    java.util.Map mapOf22 = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("documentType", typeKey), kotlin.TuplesKt.to("documentSubType", str));
                    java.lang.StringBuilder sb22 = new java.lang.StringBuilder("Unsupported document subtype: ");
                    sb22.append(str);
                    sb22.append(" for type: ");
                    sb22.append(typeKey);
                    com.paypal.android.logger.Logger.e$default(logger22, "Unknown document subtype encountered", mapOf22, null, new java.lang.IllegalArgumentException(sb22.toString()), 4, null);
                    documentSubType = null;
                    break;
                case 83065:
                    if (upperCase.equals("TIN")) {
                        documentSubType = com.paypal.oslo.core.i18n.domain.model.DocumentSubType.TIN;
                        break;
                    }
                    com.paypal.android.logger.Logger logger222 = com.paypal.oslo.core.i18n.LoggerKt.log;
                    java.util.Map mapOf222 = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("documentType", typeKey), kotlin.TuplesKt.to("documentSubType", str));
                    java.lang.StringBuilder sb222 = new java.lang.StringBuilder("Unsupported document subtype: ");
                    sb222.append(str);
                    sb222.append(" for type: ");
                    sb222.append(typeKey);
                    com.paypal.android.logger.Logger.e$default(logger222, "Unknown document subtype encountered", mapOf222, null, new java.lang.IllegalArgumentException(sb222.toString()), 4, null);
                    documentSubType = null;
                    break;
                case 2073509:
                    if (upperCase.equals("CNPJ")) {
                        documentSubType = com.paypal.oslo.core.i18n.domain.model.DocumentSubType.CNPJ;
                        break;
                    }
                    com.paypal.android.logger.Logger logger2222 = com.paypal.oslo.core.i18n.LoggerKt.log;
                    java.util.Map mapOf2222 = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("documentType", typeKey), kotlin.TuplesKt.to("documentSubType", str));
                    java.lang.StringBuilder sb2222 = new java.lang.StringBuilder("Unsupported document subtype: ");
                    sb2222.append(str);
                    sb2222.append(" for type: ");
                    sb2222.append(typeKey);
                    com.paypal.android.logger.Logger.e$default(logger2222, "Unknown document subtype encountered", mapOf2222, null, new java.lang.IllegalArgumentException(sb2222.toString()), 4, null);
                    documentSubType = null;
                    break;
                case 2257808:
                    if (upperCase.equals("ITIN")) {
                        documentSubType = com.paypal.oslo.core.i18n.domain.model.DocumentSubType.ITIN;
                        break;
                    }
                    com.paypal.android.logger.Logger logger22222 = com.paypal.oslo.core.i18n.LoggerKt.log;
                    java.util.Map mapOf22222 = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("documentType", typeKey), kotlin.TuplesKt.to("documentSubType", str));
                    java.lang.StringBuilder sb22222 = new java.lang.StringBuilder("Unsupported document subtype: ");
                    sb22222.append(str);
                    sb22222.append(" for type: ");
                    sb22222.append(typeKey);
                    com.paypal.android.logger.Logger.e$default(logger22222, "Unknown document subtype encountered", mapOf22222, null, new java.lang.IllegalArgumentException(sb22222.toString()), 4, null);
                    documentSubType = null;
                    break;
                case 2554886:
                    if (upperCase.equals("SSN4")) {
                        documentSubType = com.paypal.oslo.core.i18n.domain.model.DocumentSubType.SSN4;
                        break;
                    }
                    com.paypal.android.logger.Logger logger222222 = com.paypal.oslo.core.i18n.LoggerKt.log;
                    java.util.Map mapOf222222 = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("documentType", typeKey), kotlin.TuplesKt.to("documentSubType", str));
                    java.lang.StringBuilder sb222222 = new java.lang.StringBuilder("Unsupported document subtype: ");
                    sb222222.append(str);
                    sb222222.append(" for type: ");
                    sb222222.append(typeKey);
                    com.paypal.android.logger.Logger.e$default(logger222222, "Unknown document subtype encountered", mapOf222222, null, new java.lang.IllegalArgumentException(sb222222.toString()), 4, null);
                    documentSubType = null;
                    break;
                case 1844887946:
                    if (upperCase.equals("CURP_ID")) {
                        documentSubType = com.paypal.oslo.core.i18n.domain.model.DocumentSubType.CURP_ID;
                        break;
                    }
                    com.paypal.android.logger.Logger logger2222222 = com.paypal.oslo.core.i18n.LoggerKt.log;
                    java.util.Map mapOf2222222 = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("documentType", typeKey), kotlin.TuplesKt.to("documentSubType", str));
                    java.lang.StringBuilder sb2222222 = new java.lang.StringBuilder("Unsupported document subtype: ");
                    sb2222222.append(str);
                    sb2222222.append(" for type: ");
                    sb2222222.append(typeKey);
                    com.paypal.android.logger.Logger.e$default(logger2222222, "Unknown document subtype encountered", mapOf2222222, null, new java.lang.IllegalArgumentException(sb2222222.toString()), 4, null);
                    documentSubType = null;
                    break;
                default:
                    com.paypal.android.logger.Logger logger22222222 = com.paypal.oslo.core.i18n.LoggerKt.log;
                    java.util.Map mapOf22222222 = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("documentType", typeKey), kotlin.TuplesKt.to("documentSubType", str));
                    java.lang.StringBuilder sb22222222 = new java.lang.StringBuilder("Unsupported document subtype: ");
                    sb22222222.append(str);
                    sb22222222.append(" for type: ");
                    sb22222222.append(typeKey);
                    com.paypal.android.logger.Logger.e$default(logger22222222, "Unknown document subtype encountered", mapOf22222222, null, new java.lang.IllegalArgumentException(sb22222222.toString()), 4, null);
                    documentSubType = null;
                    break;
            }
            if (documentSubType != null) {
                arrayList.add(documentSubType);
            }
        }
        return arrayList;
    }
}
