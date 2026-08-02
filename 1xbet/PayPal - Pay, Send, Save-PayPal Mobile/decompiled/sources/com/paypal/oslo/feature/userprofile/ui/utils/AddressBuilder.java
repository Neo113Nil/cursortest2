package com.paypal.oslo.feature.userprofile.ui.utils;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/utils/AddressBuilder;", "", "<init>", "()V", "", "", "fieldValues", "countryCode", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "buildFromFields", "(Ljava/util/Map;Ljava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/model/Address;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddressBuilder {
    public static final int $stable = 0;

    @javax.inject.Inject
    public AddressBuilder() {
    }

    public final com.paypal.oslo.core.i18n.domain.model.Address buildFromFields(java.util.Map<java.lang.String, java.lang.String> fieldValues, java.lang.String countryCode) {
        com.paypal.oslo.core.i18n.domain.model.Address.Detail detail;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldValues, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        java.lang.String m11364constructorimpl = com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl(countryCode);
        java.lang.String str = fieldValues.get("AddressLine1");
        java.lang.String m11273constructorimpl = str != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine1.m11273constructorimpl(str) : null;
        java.lang.String str2 = fieldValues.get("AddressLine2");
        java.lang.String m11282constructorimpl = str2 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine2.m11282constructorimpl(str2) : null;
        java.lang.String str3 = fieldValues.get("AddressLine3");
        java.lang.String m11291constructorimpl = str3 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine3.m11291constructorimpl(str3) : null;
        java.lang.String str4 = fieldValues.get("AdminArea1");
        java.lang.String m11300constructorimpl = str4 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea1.m11300constructorimpl(str4) : null;
        java.lang.String str5 = fieldValues.get("AdminArea2");
        java.lang.String m11309constructorimpl = str5 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea2.m11309constructorimpl(str5) : null;
        java.lang.String str6 = fieldValues.get("AdminArea3");
        java.lang.String m11318constructorimpl = str6 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea3.m11318constructorimpl(str6) : null;
        java.lang.String str7 = fieldValues.get("AdminArea4");
        java.lang.String m11327constructorimpl = str7 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea4.m11327constructorimpl(str7) : null;
        java.lang.String str8 = fieldValues.get("PostalCode");
        java.lang.String m11460constructorimpl = str8 != null ? com.paypal.oslo.core.i18n.domain.model.PostalCode.m11460constructorimpl(str8) : null;
        java.lang.String str9 = fieldValues.get("StreetNumber");
        java.lang.String m11496constructorimpl = str9 != null ? com.paypal.oslo.core.i18n.domain.model.StreetNumber.m11496constructorimpl(str9) : null;
        java.lang.String str10 = fieldValues.get("StreetName");
        java.lang.String m11487constructorimpl = str10 != null ? com.paypal.oslo.core.i18n.domain.model.StreetName.m11487constructorimpl(str10) : null;
        java.lang.String str11 = fieldValues.get("StreetType");
        java.lang.String m11505constructorimpl = str11 != null ? com.paypal.oslo.core.i18n.domain.model.StreetType.m11505constructorimpl(str11) : null;
        java.lang.String str12 = fieldValues.get("BuildingName");
        java.lang.String m11337constructorimpl = str12 != null ? com.paypal.oslo.core.i18n.domain.model.BuildingName.m11337constructorimpl(str12) : null;
        java.lang.String str13 = fieldValues.get("SubBuilding");
        java.lang.String m11514constructorimpl = str13 != null ? com.paypal.oslo.core.i18n.domain.model.SubBuilding.m11514constructorimpl(str13) : null;
        java.lang.String str14 = fieldValues.get("DeliveryService");
        java.lang.String m11399constructorimpl = str14 != null ? com.paypal.oslo.core.i18n.domain.model.DeliveryService.m11399constructorimpl(str14) : null;
        com.paypal.oslo.core.i18n.domain.model.Field[] fieldArr = new com.paypal.oslo.core.i18n.domain.model.Field[6];
        fieldArr[0] = m11496constructorimpl != null ? com.paypal.oslo.core.i18n.domain.model.StreetNumber.m11495boximpl(m11496constructorimpl) : null;
        fieldArr[1] = m11487constructorimpl != null ? com.paypal.oslo.core.i18n.domain.model.StreetName.m11486boximpl(m11487constructorimpl) : null;
        fieldArr[2] = m11505constructorimpl != null ? com.paypal.oslo.core.i18n.domain.model.StreetType.m11504boximpl(m11505constructorimpl) : null;
        fieldArr[3] = m11337constructorimpl != null ? com.paypal.oslo.core.i18n.domain.model.BuildingName.m11336boximpl(m11337constructorimpl) : null;
        fieldArr[4] = m11514constructorimpl != null ? com.paypal.oslo.core.i18n.domain.model.SubBuilding.m11513boximpl(m11514constructorimpl) : null;
        fieldArr[5] = m11399constructorimpl != null ? com.paypal.oslo.core.i18n.domain.model.DeliveryService.m11398boximpl(m11399constructorimpl) : null;
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) fieldArr);
        if (!(listOf instanceof java.util.Collection) || !listOf.isEmpty()) {
            java.util.Iterator it = listOf.iterator();
            while (it.hasNext()) {
                if (((com.paypal.oslo.core.i18n.domain.model.Field) it.next()) != null) {
                    detail = new com.paypal.oslo.core.i18n.domain.model.Address.Detail(m11505constructorimpl, m11487constructorimpl, m11496constructorimpl, m11337constructorimpl, m11514constructorimpl, m11399constructorimpl, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    break;
                }
            }
        }
        detail = null;
        return new com.paypal.oslo.core.i18n.domain.model.Address(m11273constructorimpl, m11282constructorimpl, m11291constructorimpl, m11327constructorimpl, m11318constructorimpl, m11309constructorimpl, m11300constructorimpl, m11460constructorimpl, m11364constructorimpl, detail, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
