package com.ironsource.mediationsdk.metadata;

/* loaded from: classes5.dex */
public class MetaDataUtils {
    public static java.lang.String checkMetaDataKeyValidity(java.lang.String str) {
        return (str == null || str.length() > 2048) ? "The MetaData key you entered is invalid. Please enter a key of maximum 2048 characters." : "";
    }

    public static java.lang.String checkMetaDataValueValidity(java.util.List<java.lang.String> list) {
        if (list.isEmpty()) {
            return "The MetaData list should include at least one element.";
        }
        for (java.lang.String str : list) {
            if (str == null || str.length() > 2048) {
                return "The MetaData value(s) you entered is invalid. Please enter a value of maximum 2048 characters.";
            }
        }
        return "";
    }

    public static com.ironsource.mediationsdk.metadata.MetaData formatMetaData(java.lang.String str, java.util.List<java.lang.String> list) {
        if (!isKnownKey(str)) {
            return new com.ironsource.mediationsdk.metadata.MetaData(str, list);
        }
        java.lang.String lowerCase = com.ironsource.environment.StringUtils.toLowerCase(str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.String str2 : list) {
            com.ironsource.mediationsdk.metadata.MetaData.MetaDataValueTypes valueTypeForKey = getValueTypeForKey(lowerCase);
            java.lang.String formatValueForType = formatValueForType(str2, valueTypeForKey);
            arrayList.add(valueTypeForKey);
            arrayList2.add(formatValueForType);
        }
        return new com.ironsource.mediationsdk.metadata.MetaData(lowerCase, arrayList2, arrayList);
    }

    public static java.lang.String formatValueForType(java.lang.String str, com.ironsource.mediationsdk.metadata.MetaData.MetaDataValueTypes metaDataValueTypes) {
        if (metaDataValueTypes != com.ironsource.mediationsdk.metadata.MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN) {
            return str;
        }
        java.lang.String str2 = "true";
        if (!str.equalsIgnoreCase("true") && !str.equalsIgnoreCase("yes")) {
            str2 = "false";
            if (!str.equalsIgnoreCase("false") && !str.equalsIgnoreCase("no")) {
                return "";
            }
        }
        return str2;
    }

    public static boolean getMetaDataBooleanValue(java.lang.String str) {
        return !str.equals("false");
    }

    public static com.ironsource.mediationsdk.metadata.MetaData.MetaDataValueTypes getValueTypeForKey(java.lang.String str) {
        return (str.equalsIgnoreCase("do_not_sell") || str.equalsIgnoreCase(com.ironsource.mediationsdk.metadata.a.b) || str.equalsIgnoreCase(com.ironsource.mediationsdk.metadata.a.c) || str.equalsIgnoreCase(com.ironsource.mediationsdk.metadata.a.d)) ? com.ironsource.mediationsdk.metadata.MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN : com.ironsource.mediationsdk.metadata.MetaData.MetaDataValueTypes.META_DATA_VALUE_STRING;
    }

    public static boolean isKnownKey(java.lang.String str) {
        return com.ironsource.mediationsdk.metadata.a.m.contains(str.toLowerCase(java.util.Locale.getDefault()));
    }

    public static boolean isMediationKeysBeforeInit(java.lang.String str) {
        return com.ironsource.mediationsdk.metadata.a.l.contains(str.toLowerCase(java.util.Locale.getDefault()));
    }

    public static boolean isMediationOnlyKey(java.lang.String str) {
        return com.ironsource.mediationsdk.metadata.a.k.contains(str.toLowerCase(java.util.Locale.getDefault()));
    }

    public static boolean isValidCCPAMetaData(java.lang.String str, java.lang.String str2) {
        return isValidMetaData(str, "do_not_sell", str2);
    }

    public static boolean isValidMetaData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str.equalsIgnoreCase(str2) && !android.text.TextUtils.isEmpty(str3);
    }
}
