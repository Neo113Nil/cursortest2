package com.paypal.oslo.core.i18n.domain.util;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u00180\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/util/AddressFormattingUtil;", "", "Lcom/paypal/oslo/core/i18n/domain/util/FieldExtractionUtil;", "fieldExtractionUtil", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/util/FieldExtractionUtil;)V", "", "layoutLine", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "", "isInternational", "Lcom/paypal/oslo/core/i18n/domain/model/Label;", "label", "countryName", "processLayoutLine", "(Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/Address;ZLcom/paypal/oslo/core/i18n/domain/model/Label;Ljava/lang/String;)Ljava/lang/String;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressMetadata;", "metadata", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "Lcom/paypal/oslo/core/i18n/domain/model/Address$Style;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressFormattingError;", "Lkotlin/Pair;", "Lcom/paypal/oslo/core/i18n/domain/model/LayoutMetadata;", "getLayoutAndLabel", "(Lcom/paypal/oslo/core/i18n/domain/model/AddressMetadata;Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/Address$Style;)Larrow/core/Either;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/i18n/domain/util/FieldExtractionUtil;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AddressFormattingUtil {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public AddressFormattingUtil(com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil fieldExtractionUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldExtractionUtil, "");
        this.getHighResolutionOutputSizeshNQ4ISI = fieldExtractionUtil;
    }

    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.AddressFormattingError, kotlin.Pair<com.paypal.oslo.core.i18n.domain.model.LayoutMetadata, com.paypal.oslo.core.i18n.domain.model.Label>> getLayoutAndLabel(com.paypal.oslo.core.i18n.domain.model.AddressMetadata metadata, java.lang.String country, com.paypal.oslo.core.i18n.domain.model.Address.Style style) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.getLayoutAndLabel(metadata, country, style);
    }

    public final java.lang.String processLayoutLine(java.lang.String layoutLine, com.paypal.oslo.core.i18n.domain.model.Address address, boolean isInternational, com.paypal.oslo.core.i18n.domain.model.Label label, java.lang.String countryName) {
        java.lang.String str = layoutLine;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryName, "");
        java.util.regex.Matcher matcher = com.paypal.oslo.core.i18n.domain.util.MetadataConstants.INSTANCE.getFIELD_DELIMITER_PATTERN().matcher(str);
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
        int i = 0;
        while (matcher.find()) {
            if (i < matcher.start()) {
                java.lang.String substring = str.substring(i, matcher.start());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                arrayList.add(substring);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(matcher.group(), ",")) {
                java.lang.String group = matcher.group();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group, "");
                arrayList.add(group);
            }
            i = matcher.end();
        }
        if (i < layoutLine.length()) {
            java.lang.String substring2 = str.substring(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
            arrayList.add(substring2);
        }
        for (java.lang.String str2 : arrayList) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(str2, ",") && !kotlin.text.StringsKt.isBlank(str2)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
                sb.append(str2);
                sb.append("}");
                java.lang.String obj = sb.toString();
                com.paypal.oslo.core.i18n.domain.model.AddressFieldInfo fieldDetail = this.getHighResolutionOutputSizeshNQ4ISI.getFieldDetail(str2, address, isInternational, label, countryName);
                str = kotlin.text.StringsKt.replace$default(str, obj, ((fieldDetail.getAddressField() instanceof com.paypal.oslo.core.i18n.domain.model.UnknownField) || fieldDetail.getValue() == null) ? "" : fieldDetail.getValue(), false, 4, (java.lang.Object) null);
            }
        }
        return kotlin.text.StringsKt.trim(new kotlin.text.Regex("\\s*,\\s*").replace(new kotlin.text.Regex("\\s+").replace(new kotlin.text.Regex("[,\\s]+$").replace(new kotlin.text.Regex("^[,\\s]+").replace(new kotlin.text.Regex(",(?:\\s*,)+").replace(str, ","), ""), ""), " "), ", ")).toString();
    }
}
