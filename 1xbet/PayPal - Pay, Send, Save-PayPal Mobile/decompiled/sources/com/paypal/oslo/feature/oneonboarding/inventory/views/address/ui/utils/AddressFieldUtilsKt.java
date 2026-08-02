package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a'\u0010\u0005\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a3\u0010\t\u001a\u00020\u00002\u001a\u0010\u0007\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/Address;", "", "Lkotlin/reflect/KClass;", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "", "toFieldMap", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;)Ljava/util/Map;", "fieldValues", "countryCode", "buildAddressFromFields", "(Ljava/util/Map;Ljava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/model/Address;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressFieldUtilsKt {
    public static final java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, java.lang.String> toFieldMap(com.paypal.oslo.core.i18n.domain.model.Address address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        java.lang.String m11248getAddressLine1rVKqk9c = address.m11248getAddressLine1rVKqk9c();
        if (m11248getAddressLine1rVKqk9c != null && m11248getAddressLine1rVKqk9c != null) {
        }
        java.lang.String m11249getAddressLine2c7KZG_s = address.m11249getAddressLine2c7KZG_s();
        if (m11249getAddressLine2c7KZG_s != null && m11249getAddressLine2c7KZG_s != null) {
        }
        java.lang.String m11250getAddressLine3z9ldjEo = address.m11250getAddressLine3z9ldjEo();
        if (m11250getAddressLine3z9ldjEo != null && m11250getAddressLine3z9ldjEo != null) {
        }
        java.lang.String m11251getAdminArea1bsDj6rY = address.m11251getAdminArea1bsDj6rY();
        if (m11251getAdminArea1bsDj6rY != null && m11251getAdminArea1bsDj6rY != null) {
        }
        java.lang.String m11252getAdminArea2DR8a_90 = address.m11252getAdminArea2DR8a_90();
        if (m11252getAdminArea2DR8a_90 != null && m11252getAdminArea2DR8a_90 != null) {
        }
        java.lang.String m11253getAdminArea3W_yfEd8 = address.m11253getAdminArea3W_yfEd8();
        if (m11253getAdminArea3W_yfEd8 != null && m11253getAdminArea3W_yfEd8 != null) {
        }
        java.lang.String m11254getAdminArea4GnJiKOo = address.m11254getAdminArea4GnJiKOo();
        if (m11254getAdminArea4GnJiKOo != null && m11254getAdminArea4GnJiKOo != null) {
        }
        java.lang.String m11256getPostalCodeyjZ2Xzc = address.m11256getPostalCodeyjZ2Xzc();
        if (m11256getPostalCodeyjZ2Xzc != null && m11256getPostalCodeyjZ2Xzc != null) {
            createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.PostalCode.class), m11256getPostalCodeyjZ2Xzc);
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.core.i18n.domain.model.Address buildAddressFromFields(java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, java.lang.String> map, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String str15;
        java.lang.String str16;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String m11364constructorimpl = com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl(str);
        java.lang.String str17 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AddressLine1.class));
        if (str17 != null) {
            if (kotlin.text.StringsKt.isBlank(str17)) {
                str17 = null;
            }
            if (str17 != null) {
                str2 = com.paypal.oslo.core.i18n.domain.model.AddressLine1.m11273constructorimpl(str17);
                str3 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AddressLine2.class));
                if (str3 != null) {
                    if (kotlin.text.StringsKt.isBlank(str3)) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        str4 = com.paypal.oslo.core.i18n.domain.model.AddressLine2.m11282constructorimpl(str3);
                        str5 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AddressLine3.class));
                        if (str5 != null) {
                            if (kotlin.text.StringsKt.isBlank(str5)) {
                                str5 = null;
                            }
                            if (str5 != null) {
                                str6 = com.paypal.oslo.core.i18n.domain.model.AddressLine3.m11291constructorimpl(str5);
                                str7 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AdminArea1.class));
                                if (str7 != null) {
                                    if (kotlin.text.StringsKt.isBlank(str7)) {
                                        str7 = null;
                                    }
                                    if (str7 != null) {
                                        str8 = com.paypal.oslo.core.i18n.domain.model.AdminArea1.m11300constructorimpl(str7);
                                        str9 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AdminArea2.class));
                                        if (str9 != null) {
                                            if (kotlin.text.StringsKt.isBlank(str9)) {
                                                str9 = null;
                                            }
                                            if (str9 != null) {
                                                str10 = com.paypal.oslo.core.i18n.domain.model.AdminArea2.m11309constructorimpl(str9);
                                                str11 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AdminArea3.class));
                                                if (str11 != null) {
                                                    if (kotlin.text.StringsKt.isBlank(str11)) {
                                                        str11 = null;
                                                    }
                                                    if (str11 != null) {
                                                        str12 = com.paypal.oslo.core.i18n.domain.model.AdminArea3.m11318constructorimpl(str11);
                                                        str13 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AdminArea4.class));
                                                        if (str13 != null) {
                                                            if (kotlin.text.StringsKt.isBlank(str13)) {
                                                                str13 = null;
                                                            }
                                                            if (str13 != null) {
                                                                str14 = com.paypal.oslo.core.i18n.domain.model.AdminArea4.m11327constructorimpl(str13);
                                                                str15 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.PostalCode.class));
                                                                if (str15 != null) {
                                                                    if (kotlin.text.StringsKt.isBlank(str15)) {
                                                                        str15 = null;
                                                                    }
                                                                    if (str15 != null) {
                                                                        str16 = com.paypal.oslo.core.i18n.domain.model.PostalCode.m11460constructorimpl(str15);
                                                                        return new com.paypal.oslo.core.i18n.domain.model.Address(str2, str4, str6, str14, str12, str10, str8, str16, m11364constructorimpl, null, 512, null);
                                                                    }
                                                                }
                                                                str16 = null;
                                                                return new com.paypal.oslo.core.i18n.domain.model.Address(str2, str4, str6, str14, str12, str10, str8, str16, m11364constructorimpl, null, 512, null);
                                                            }
                                                        }
                                                        str14 = null;
                                                        str15 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.PostalCode.class));
                                                        if (str15 != null) {
                                                        }
                                                        str16 = null;
                                                        return new com.paypal.oslo.core.i18n.domain.model.Address(str2, str4, str6, str14, str12, str10, str8, str16, m11364constructorimpl, null, 512, null);
                                                    }
                                                }
                                                str12 = null;
                                                str13 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AdminArea4.class));
                                                if (str13 != null) {
                                                }
                                                str14 = null;
                                                str15 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.PostalCode.class));
                                                if (str15 != null) {
                                                }
                                                str16 = null;
                                                return new com.paypal.oslo.core.i18n.domain.model.Address(str2, str4, str6, str14, str12, str10, str8, str16, m11364constructorimpl, null, 512, null);
                                            }
                                        }
                                        str10 = null;
                                        str11 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AdminArea3.class));
                                        if (str11 != null) {
                                        }
                                        str12 = null;
                                        str13 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AdminArea4.class));
                                        if (str13 != null) {
                                        }
                                        str14 = null;
                                        str15 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.PostalCode.class));
                                        if (str15 != null) {
                                        }
                                        str16 = null;
                                        return new com.paypal.oslo.core.i18n.domain.model.Address(str2, str4, str6, str14, str12, str10, str8, str16, m11364constructorimpl, null, 512, null);
                                    }
                                }
                                str8 = null;
                                str9 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AdminArea2.class));
                                if (str9 != null) {
                                }
                                str10 = null;
                                str11 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AdminArea3.class));
                                if (str11 != null) {
                                }
                                str12 = null;
                                str13 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AdminArea4.class));
                                if (str13 != null) {
                                }
                                str14 = null;
                                str15 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.PostalCode.class));
                                if (str15 != null) {
                                }
                                str16 = null;
                                return new com.paypal.oslo.core.i18n.domain.model.Address(str2, str4, str6, str14, str12, str10, str8, str16, m11364constructorimpl, null, 512, null);
                            }
                        }
                        str6 = null;
                        str7 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AdminArea1.class));
                        if (str7 != null) {
                        }
                        str8 = null;
                        str9 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AdminArea2.class));
                        if (str9 != null) {
                        }
                        str10 = null;
                        str11 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AdminArea3.class));
                        if (str11 != null) {
                        }
                        str12 = null;
                        str13 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AdminArea4.class));
                        if (str13 != null) {
                        }
                        str14 = null;
                        str15 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.PostalCode.class));
                        if (str15 != null) {
                        }
                        str16 = null;
                        return new com.paypal.oslo.core.i18n.domain.model.Address(str2, str4, str6, str14, str12, str10, str8, str16, m11364constructorimpl, null, 512, null);
                    }
                }
                str4 = null;
                str5 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AddressLine3.class));
                if (str5 != null) {
                }
                str6 = null;
                str7 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AdminArea1.class));
                if (str7 != null) {
                }
                str8 = null;
                str9 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AdminArea2.class));
                if (str9 != null) {
                }
                str10 = null;
                str11 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AdminArea3.class));
                if (str11 != null) {
                }
                str12 = null;
                str13 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AdminArea4.class));
                if (str13 != null) {
                }
                str14 = null;
                str15 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.PostalCode.class));
                if (str15 != null) {
                }
                str16 = null;
                return new com.paypal.oslo.core.i18n.domain.model.Address(str2, str4, str6, str14, str12, str10, str8, str16, m11364constructorimpl, null, 512, null);
            }
        }
        str2 = null;
        str3 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AddressLine2.class));
        if (str3 != null) {
        }
        str4 = null;
        str5 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AddressLine3.class));
        if (str5 != null) {
        }
        str6 = null;
        str7 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AdminArea1.class));
        if (str7 != null) {
        }
        str8 = null;
        str9 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AdminArea2.class));
        if (str9 != null) {
        }
        str10 = null;
        str11 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AdminArea3.class));
        if (str11 != null) {
        }
        str12 = null;
        str13 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AdminArea4.class));
        if (str13 != null) {
        }
        str14 = null;
        str15 = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.PostalCode.class));
        if (str15 != null) {
        }
        str16 = null;
        return new com.paypal.oslo.core.i18n.domain.model.Address(str2, str4, str6, str14, str12, str10, str8, str16, m11364constructorimpl, null, 512, null);
    }
}
