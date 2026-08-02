package com.paypal.oslo.core.i18n.domain.util;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/util/MetadataConstants;", "", "<init>", "()V", "Ljava/util/regex/Pattern;", "FIELD_DELIMITER_PATTERN", "Ljava/util/regex/Pattern;", "getFIELD_DELIMITER_PATTERN", "()Ljava/util/regex/Pattern;", "", "", "ALL_ADDRESS_FIELDS", "Ljava/util/List;", "getALL_ADDRESS_FIELDS", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MetadataConstants {
    private static final java.util.List<java.lang.String> ALL_ADDRESS_FIELDS;
    private static final java.util.regex.Pattern FIELD_DELIMITER_PATTERN;
    public static final com.paypal.oslo.core.i18n.domain.util.MetadataConstants INSTANCE = new com.paypal.oslo.core.i18n.domain.util.MetadataConstants();

    private MetadataConstants() {
    }

    static {
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\\{|\\}|,");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(compile, "");
        FIELD_DELIMITER_PATTERN = compile;
        ALL_ADDRESS_FIELDS = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"addressLine1", "addressLine2", "addressLine3", "adminArea1", "adminArea2", "adminArea3", "adminArea4", androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, "addressDetails.streetNumber", "addressDetails.streetName", "addressDetails.streetType", "addressDetails.buildingName", "addressDetails.subBuilding", "addressDetails.deliveryService"});
    }

    public final java.util.regex.Pattern getFIELD_DELIMITER_PATTERN() {
        return FIELD_DELIMITER_PATTERN;
    }

    public final java.util.List<java.lang.String> getALL_ADDRESS_FIELDS() {
        return ALL_ADDRESS_FIELDS;
    }
}
