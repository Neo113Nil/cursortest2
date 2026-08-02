package com.paypal.oslo.feature.userprofile.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u00020\u0002*\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/Address;", "", "", "toFieldMap", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;)Ljava/util/Map;", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "getFieldKey", "(Lcom/paypal/oslo/core/i18n/domain/model/Field;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddressUtilsKt {
    public static final java.util.Map<java.lang.String, java.lang.String> toFieldMap(com.paypal.oslo.core.i18n.domain.model.Address address) {
        java.lang.String m11266getDeliveryServiceYY4fDwk;
        java.lang.String m11270getSubBuildinghBBN82c;
        java.lang.String m11265getBuildingNamePs3OuNg;
        java.lang.String m11269getStreetTypezNMmW38;
        java.lang.String m11267getStreetNameSYCAxFQ;
        java.lang.String m11268getStreetNumberozdXfa4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String m11248getAddressLine1rVKqk9c = address.m11248getAddressLine1rVKqk9c();
        if (m11248getAddressLine1rVKqk9c != null && m11248getAddressLine1rVKqk9c != null) {
            linkedHashMap.put("AddressLine1", m11248getAddressLine1rVKqk9c);
        }
        java.lang.String m11249getAddressLine2c7KZG_s = address.m11249getAddressLine2c7KZG_s();
        if (m11249getAddressLine2c7KZG_s != null && m11249getAddressLine2c7KZG_s != null) {
            linkedHashMap.put("AddressLine2", m11249getAddressLine2c7KZG_s);
        }
        java.lang.String m11250getAddressLine3z9ldjEo = address.m11250getAddressLine3z9ldjEo();
        if (m11250getAddressLine3z9ldjEo != null && m11250getAddressLine3z9ldjEo != null) {
            linkedHashMap.put("AddressLine3", m11250getAddressLine3z9ldjEo);
        }
        java.lang.String m11251getAdminArea1bsDj6rY = address.m11251getAdminArea1bsDj6rY();
        if (m11251getAdminArea1bsDj6rY != null && m11251getAdminArea1bsDj6rY != null) {
            linkedHashMap.put("AdminArea1", m11251getAdminArea1bsDj6rY);
        }
        java.lang.String m11252getAdminArea2DR8a_90 = address.m11252getAdminArea2DR8a_90();
        if (m11252getAdminArea2DR8a_90 != null && m11252getAdminArea2DR8a_90 != null) {
            linkedHashMap.put("AdminArea2", m11252getAdminArea2DR8a_90);
        }
        java.lang.String m11253getAdminArea3W_yfEd8 = address.m11253getAdminArea3W_yfEd8();
        if (m11253getAdminArea3W_yfEd8 != null && m11253getAdminArea3W_yfEd8 != null) {
            linkedHashMap.put("AdminArea3", m11253getAdminArea3W_yfEd8);
        }
        java.lang.String m11254getAdminArea4GnJiKOo = address.m11254getAdminArea4GnJiKOo();
        if (m11254getAdminArea4GnJiKOo != null && m11254getAdminArea4GnJiKOo != null) {
            linkedHashMap.put("AdminArea4", m11254getAdminArea4GnJiKOo);
        }
        java.lang.String m11256getPostalCodeyjZ2Xzc = address.m11256getPostalCodeyjZ2Xzc();
        if (m11256getPostalCodeyjZ2Xzc != null && m11256getPostalCodeyjZ2Xzc != null) {
            linkedHashMap.put("PostalCode", m11256getPostalCodeyjZ2Xzc);
        }
        com.paypal.oslo.core.i18n.domain.model.Address.Detail detail = address.getDetail();
        if (detail != null && (m11268getStreetNumberozdXfa4 = detail.m11268getStreetNumberozdXfa4()) != null) {
            linkedHashMap.put("StreetNumber", m11268getStreetNumberozdXfa4);
        }
        if (detail != null && (m11267getStreetNameSYCAxFQ = detail.m11267getStreetNameSYCAxFQ()) != null) {
            linkedHashMap.put("StreetName", m11267getStreetNameSYCAxFQ);
        }
        if (detail != null && (m11269getStreetTypezNMmW38 = detail.m11269getStreetTypezNMmW38()) != null) {
            linkedHashMap.put("StreetType", m11269getStreetTypezNMmW38);
        }
        if (detail != null && (m11265getBuildingNamePs3OuNg = detail.m11265getBuildingNamePs3OuNg()) != null) {
            linkedHashMap.put("BuildingName", m11265getBuildingNamePs3OuNg);
        }
        if (detail != null && (m11270getSubBuildinghBBN82c = detail.m11270getSubBuildinghBBN82c()) != null) {
            linkedHashMap.put("SubBuilding", m11270getSubBuildinghBBN82c);
        }
        if (detail != null && (m11266getDeliveryServiceYY4fDwk = detail.m11266getDeliveryServiceYY4fDwk()) != null) {
            linkedHashMap.put("DeliveryService", m11266getDeliveryServiceYY4fDwk);
        }
        return linkedHashMap;
    }

    public static final java.lang.String getFieldKey(com.paypal.oslo.core.i18n.domain.model.Field field) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(field.getClass()).getSimpleName();
        return simpleName == null ? "unknown" : simpleName;
    }
}
