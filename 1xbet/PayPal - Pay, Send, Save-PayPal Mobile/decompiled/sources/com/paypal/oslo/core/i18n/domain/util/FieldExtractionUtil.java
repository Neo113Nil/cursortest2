package com.paypal.oslo.core.i18n.domain.util;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0\u00170\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/util/FieldExtractionUtil;", "", "<init>", "()V", "", "field", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "", "isInternational", "Lcom/paypal/oslo/core/i18n/domain/model/Label;", "label", "countryName", "Lcom/paypal/oslo/core/i18n/domain/model/AddressFieldInfo;", "getFieldDetail", "(Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/Address;ZLcom/paypal/oslo/core/i18n/domain/model/Label;Ljava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/model/AddressFieldInfo;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressMetadata;", "metadata", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "Lcom/paypal/oslo/core/i18n/domain/model/Address$Style;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressFormattingError;", "Lkotlin/Pair;", "Lcom/paypal/oslo/core/i18n/domain/model/LayoutMetadata;", "getLayoutAndLabel", "(Lcom/paypal/oslo/core/i18n/domain/model/AddressMetadata;Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/Address$Style;)Larrow/core/Either;", "FieldMapper"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FieldExtractionUtil {
    @javax.inject.Inject
    public FieldExtractionUtil() {
    }

    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.AddressFieldInfo getFieldDetail$default(com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil fieldExtractionUtil, java.lang.String str, com.paypal.oslo.core.i18n.domain.model.Address address, boolean z, com.paypal.oslo.core.i18n.domain.model.Label label, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return fieldExtractionUtil.getFieldDetail(str, address, z, label, str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final com.paypal.oslo.core.i18n.domain.model.AddressFieldInfo getFieldDetail(java.lang.String field, com.paypal.oslo.core.i18n.domain.model.Address address, boolean isInternational, com.paypal.oslo.core.i18n.domain.model.Label label, java.lang.String countryName) {
        com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil.FieldMapper fieldMapper;
        com.paypal.oslo.core.i18n.domain.model.Address.Detail detail;
        com.paypal.oslo.core.i18n.domain.model.Address.Detail detail2;
        com.paypal.oslo.core.i18n.domain.model.Address.Detail detail3;
        com.paypal.oslo.core.i18n.domain.model.Address.Detail detail4;
        com.paypal.oslo.core.i18n.domain.model.Address.Detail detail5;
        com.paypal.oslo.core.i18n.domain.model.Address.Detail detail6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryName, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(field, "countryCode")) {
            return isInternational ? new com.paypal.oslo.core.i18n.domain.model.AddressFieldInfo(com.paypal.oslo.core.i18n.domain.model.CountryName.m11373boximpl(com.paypal.oslo.core.i18n.domain.model.CountryName.m11374constructorimpl(countryName)), "", countryName) : new com.paypal.oslo.core.i18n.domain.model.AddressFieldInfo(com.paypal.oslo.core.i18n.domain.model.UnknownField.m11531boximpl(com.paypal.oslo.core.i18n.domain.model.UnknownField.m11532constructorimpl("")), label.getOptionalLabel(), null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(field, "addressLine1")) {
            java.lang.String m11248getAddressLine1rVKqk9c = address != null ? address.m11248getAddressLine1rVKqk9c() : null;
            fieldMapper = new com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil.FieldMapper(m11248getAddressLine1rVKqk9c != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine1.m11272boximpl(m11248getAddressLine1rVKqk9c) : null, label != null ? label.getAddressLine1() : null, com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil$getFieldMapper$1.getHighSpeedVideoFpsRanges);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(field, "addressLine2")) {
            java.lang.String m11249getAddressLine2c7KZG_s = address != null ? address.m11249getAddressLine2c7KZG_s() : null;
            fieldMapper = new com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil.FieldMapper(m11249getAddressLine2c7KZG_s != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine2.m11281boximpl(m11249getAddressLine2c7KZG_s) : null, label != null ? label.getAddressLine2() : null, com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil$getFieldMapper$2.getHighSpeedVideoFpsRanges);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(field, "addressLine3")) {
            java.lang.String m11250getAddressLine3z9ldjEo = address != null ? address.m11250getAddressLine3z9ldjEo() : null;
            fieldMapper = new com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil.FieldMapper(m11250getAddressLine3z9ldjEo != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine3.m11290boximpl(m11250getAddressLine3z9ldjEo) : null, label != null ? label.getAddressLine3() : null, com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil$getFieldMapper$3.getHighSpeedVideoFpsRanges);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(field, "adminArea1")) {
            java.lang.String m11251getAdminArea1bsDj6rY = address != null ? address.m11251getAdminArea1bsDj6rY() : null;
            fieldMapper = new com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil.FieldMapper(m11251getAdminArea1bsDj6rY != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea1.m11299boximpl(m11251getAdminArea1bsDj6rY) : null, label != null ? label.getAdminArea1() : null, com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil$getFieldMapper$4.getHighSpeedVideoFpsRanges);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(field, "adminArea2")) {
            java.lang.String m11252getAdminArea2DR8a_90 = address != null ? address.m11252getAdminArea2DR8a_90() : null;
            fieldMapper = new com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil.FieldMapper(m11252getAdminArea2DR8a_90 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea2.m11308boximpl(m11252getAdminArea2DR8a_90) : null, label != null ? label.getAdminArea2() : null, com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil$getFieldMapper$5.getHighSpeedVideoFpsRanges);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(field, "adminArea3")) {
            java.lang.String m11253getAdminArea3W_yfEd8 = address != null ? address.m11253getAdminArea3W_yfEd8() : null;
            fieldMapper = new com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil.FieldMapper(m11253getAdminArea3W_yfEd8 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea3.m11317boximpl(m11253getAdminArea3W_yfEd8) : null, label != null ? label.getAdminArea3() : null, com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil$getFieldMapper$6.getHighResolutionOutputSizeshNQ4ISI);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(field, "adminArea4")) {
            java.lang.String m11254getAdminArea4GnJiKOo = address != null ? address.m11254getAdminArea4GnJiKOo() : null;
            fieldMapper = new com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil.FieldMapper(m11254getAdminArea4GnJiKOo != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea4.m11326boximpl(m11254getAdminArea4GnJiKOo) : null, label != null ? label.getAdminArea4() : null, com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil$getFieldMapper$7.Camera2StreamConfigurationMap);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(field, androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE)) {
            java.lang.String m11256getPostalCodeyjZ2Xzc = address != null ? address.m11256getPostalCodeyjZ2Xzc() : null;
            fieldMapper = new com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil.FieldMapper(m11256getPostalCodeyjZ2Xzc != null ? com.paypal.oslo.core.i18n.domain.model.PostalCode.m11459boximpl(m11256getPostalCodeyjZ2Xzc) : null, label != null ? label.getPostalCode() : null, com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil$getFieldMapper$8.getHighSpeedVideoSizes);
        } else {
            if (kotlin.text.StringsKt.startsWith$default(field, "addressDetails.", false, 2, (java.lang.Object) null)) {
                switch (field.hashCode()) {
                    case -1792360991:
                        if (field.equals("addressDetails.deliveryService")) {
                            java.lang.String m11266getDeliveryServiceYY4fDwk = (address == null || (detail = address.getDetail()) == null) ? null : detail.m11266getDeliveryServiceYY4fDwk();
                            fieldMapper = new com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil.FieldMapper(m11266getDeliveryServiceYY4fDwk != null ? com.paypal.oslo.core.i18n.domain.model.DeliveryService.m11398boximpl(m11266getDeliveryServiceYY4fDwk) : null, label != null ? label.getDeliveryService() : null, com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil$getAddressDetailMapper$6.getHighSpeedVideoSizes);
                            break;
                        }
                        break;
                    case 1485625198:
                        if (field.equals("addressDetails.streetName")) {
                            java.lang.String m11267getStreetNameSYCAxFQ = (address == null || (detail2 = address.getDetail()) == null) ? null : detail2.m11267getStreetNameSYCAxFQ();
                            fieldMapper = new com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil.FieldMapper(m11267getStreetNameSYCAxFQ != null ? com.paypal.oslo.core.i18n.domain.model.StreetName.m11486boximpl(m11267getStreetNameSYCAxFQ) : null, label != null ? label.getStreetName() : null, com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil$getAddressDetailMapper$3.Camera2StreamConfigurationMap);
                            break;
                        }
                        break;
                    case 1485827101:
                        if (field.equals("addressDetails.streetType")) {
                            java.lang.String m11269getStreetTypezNMmW38 = (address == null || (detail3 = address.getDetail()) == null) ? null : detail3.m11269getStreetTypezNMmW38();
                            fieldMapper = new com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil.FieldMapper(m11269getStreetTypezNMmW38 != null ? com.paypal.oslo.core.i18n.domain.model.StreetType.m11504boximpl(m11269getStreetTypezNMmW38) : null, label != null ? label.getStreetType() : null, com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil$getAddressDetailMapper$2.getHighSpeedVideoFpsRanges);
                            break;
                        }
                        break;
                    case 1775143788:
                        if (field.equals("addressDetails.streetNumber")) {
                            java.lang.String m11268getStreetNumberozdXfa4 = (address == null || (detail4 = address.getDetail()) == null) ? null : detail4.m11268getStreetNumberozdXfa4();
                            fieldMapper = new com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil.FieldMapper(m11268getStreetNumberozdXfa4 != null ? com.paypal.oslo.core.i18n.domain.model.StreetNumber.m11495boximpl(m11268getStreetNumberozdXfa4) : null, label != null ? label.getStreetNumber() : null, com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil$getAddressDetailMapper$1.getHighSpeedVideoSizes);
                            break;
                        }
                        break;
                    case 1921903316:
                        if (field.equals("addressDetails.subBuilding")) {
                            java.lang.String m11270getSubBuildinghBBN82c = (address == null || (detail5 = address.getDetail()) == null) ? null : detail5.m11270getSubBuildinghBBN82c();
                            fieldMapper = new com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil.FieldMapper(m11270getSubBuildinghBBN82c != null ? com.paypal.oslo.core.i18n.domain.model.SubBuilding.m11513boximpl(m11270getSubBuildinghBBN82c) : null, label != null ? label.getSubBuilding() : null, com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil$getAddressDetailMapper$5.getHighSpeedVideoFpsRanges);
                            break;
                        }
                        break;
                    case 2066958751:
                        if (field.equals("addressDetails.buildingName")) {
                            java.lang.String m11265getBuildingNamePs3OuNg = (address == null || (detail6 = address.getDetail()) == null) ? null : detail6.m11265getBuildingNamePs3OuNg();
                            fieldMapper = new com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil.FieldMapper(m11265getBuildingNamePs3OuNg != null ? com.paypal.oslo.core.i18n.domain.model.BuildingName.m11336boximpl(m11265getBuildingNamePs3OuNg) : null, label != null ? label.getBuildingName() : null, com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil$getAddressDetailMapper$4.getHighSpeedVideoFpsRangesFor);
                            break;
                        }
                        break;
                }
            }
            fieldMapper = null;
        }
        if (fieldMapper == null) {
            return new com.paypal.oslo.core.i18n.domain.model.AddressFieldInfo(com.paypal.oslo.core.i18n.domain.model.UnknownField.m11531boximpl(com.paypal.oslo.core.i18n.domain.model.UnknownField.m11532constructorimpl("")), label != null ? label.getOptionalLabel() : null, null);
        }
        com.paypal.oslo.core.i18n.domain.model.Field field2 = fieldMapper.getHighResolutionOutputSizeshNQ4ISI;
        if (field2 == null) {
            field2 = fieldMapper.Camera2StreamConfigurationMap.invoke("");
        }
        java.lang.String str = fieldMapper.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.core.i18n.domain.model.Field field3 = fieldMapper.getHighResolutionOutputSizeshNQ4ISI;
        return new com.paypal.oslo.core.i18n.domain.model.AddressFieldInfo(field2, str, field3 != null ? field3.getValue() : null);
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/util/FieldExtractionUtil$FieldMapper;", "", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "p0", "", "p1", "Lkotlin/Function1;", "p2", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/model/Field;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final /* data */ class FieldMapper {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        final com.paypal.oslo.core.i18n.domain.model.Field getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        final kotlin.jvm.functions.Function1<java.lang.String, com.paypal.oslo.core.i18n.domain.model.Field> Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final java.lang.String getHighSpeedVideoFpsRanges;

        /* JADX WARN: Multi-variable type inference failed */
        public FieldMapper(com.paypal.oslo.core.i18n.domain.model.Field field, java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends com.paypal.oslo.core.i18n.domain.model.Field> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            this.getHighResolutionOutputSizeshNQ4ISI = field;
            this.getHighSpeedVideoFpsRanges = str;
            this.Camera2StreamConfigurationMap = function1;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.i18n.domain.model.Field field = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function1<java.lang.String, com.paypal.oslo.core.i18n.domain.model.Field> function1 = this.Camera2StreamConfigurationMap;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FieldMapper(getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(field);
            sb.append(", getHighSpeedVideoFpsRanges=");
            sb.append(str);
            sb.append(", Camera2StreamConfigurationMap=");
            sb.append(function1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.core.i18n.domain.model.Field field = this.getHighResolutionOutputSizeshNQ4ISI;
            int hashCode = field == null ? 0 : field.hashCode();
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            return (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.Camera2StreamConfigurationMap.hashCode();
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil.FieldMapper)) {
                return false;
            }
            com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil.FieldMapper fieldMapper = (com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil.FieldMapper) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, fieldMapper.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, fieldMapper.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, fieldMapper.Camera2StreamConfigurationMap);
        }
    }

    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.AddressFormattingError, kotlin.Pair<com.paypal.oslo.core.i18n.domain.model.LayoutMetadata, com.paypal.oslo.core.i18n.domain.model.Label>> getLayoutAndLabel(com.paypal.oslo.core.i18n.domain.model.AddressMetadata metadata, java.lang.String country, com.paypal.oslo.core.i18n.domain.model.Address.Style style) {
        com.paypal.oslo.core.i18n.domain.model.LayoutMetadata layoutMetadata;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
        java.lang.String primaryScript = metadata.getCountryMetadata().getPrimaryScript();
        int i = style == null ? -1 : com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil.WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i == 1 || i == 2) {
            layoutMetadata = metadata.getCountryMetadata().getLayout().getSingleLineLayout().get(primaryScript);
        } else {
            layoutMetadata = metadata.getCountryMetadata().getLayout().getMultiLineLayout().get(primaryScript);
        }
        com.paypal.oslo.core.i18n.domain.model.Label label = metadata.getLabelMetadata().getAddressLabel().get(country);
        if (label == null) {
            label = metadata.getLabelMetadata().getAddressLabel().get(com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter.DOUBLE_ZERO_PREFIX);
        }
        if (layoutMetadata == null) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.core.i18n.domain.model.AddressFormattingError.NoLayoutFound("No layout found for script: ".concat(java.lang.String.valueOf(primaryScript))));
        }
        if (label == null) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.core.i18n.domain.model.AddressFormattingError.ParseError("No label info found for country: ".concat(java.lang.String.valueOf(country))));
        }
        return arrow.core.EitherKt.right(kotlin.TuplesKt.to(layoutMetadata, label));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.i18n.domain.model.Address.Style.values().length];
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.Address.Style.SINGLELINE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.Address.Style.INTERNATIONAL_SINGLELINE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
