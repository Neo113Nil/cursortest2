package com.adobe.marketing.mobile.xdm;

/* loaded from: classes7.dex */
public final class Formatters {
    public static java.util.List<java.util.Map<java.lang.String, java.lang.Object>> serializeFromList(java.util.List<? extends com.adobe.marketing.mobile.xdm.Property> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            for (com.adobe.marketing.mobile.xdm.Property property : list) {
                if (property != null) {
                    arrayList.add(property.serializeToXdm());
                }
            }
        }
        return arrayList;
    }

    private Formatters() {
    }
}
