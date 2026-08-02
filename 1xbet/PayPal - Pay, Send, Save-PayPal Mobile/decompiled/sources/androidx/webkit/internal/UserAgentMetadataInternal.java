package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class UserAgentMetadataInternal {
    private UserAgentMetadataInternal() {
    }

    static java.util.Map<java.lang.String, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI(androidx.webkit.UserAgentMetadata userAgentMetadata) {
        java.lang.String[][] strArr;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.List<androidx.webkit.UserAgentMetadata.BrandVersion> brandVersionList = userAgentMetadata.getBrandVersionList();
        java.lang.String[] strArr2 = null;
        if (brandVersionList == null || brandVersionList.isEmpty()) {
            strArr = null;
        } else {
            strArr = (java.lang.String[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.String.class, brandVersionList.size(), 3);
            for (int i = 0; i < brandVersionList.size(); i++) {
                strArr[i][0] = brandVersionList.get(i).getBrand();
                strArr[i][1] = brandVersionList.get(i).getMajorVersion();
                strArr[i][2] = brandVersionList.get(i).getFullVersion();
            }
        }
        hashMap.put("BRAND_VERSION_LIST", strArr);
        hashMap.put("FULL_VERSION", userAgentMetadata.getFullVersion());
        hashMap.put("PLATFORM", userAgentMetadata.getPlatform());
        hashMap.put("PLATFORM_VERSION", userAgentMetadata.getPlatformVersion());
        hashMap.put("ARCHITECTURE", userAgentMetadata.getArchitecture());
        hashMap.put("MODEL", userAgentMetadata.getModel());
        hashMap.put("MOBILE", java.lang.Boolean.valueOf(userAgentMetadata.isMobile()));
        hashMap.put("BITNESS", java.lang.Integer.valueOf(userAgentMetadata.getBitness()));
        hashMap.put("WOW64", java.lang.Boolean.valueOf(userAgentMetadata.isWow64()));
        if (androidx.webkit.internal.WebViewFeatureInternal.USER_AGENT_METADATA_FORM_FACTORS.isSupportedByWebView()) {
            java.util.List<java.lang.String> formFactors = userAgentMetadata.getFormFactors();
            if (formFactors != null && !formFactors.isEmpty()) {
                strArr2 = new java.lang.String[formFactors.size()];
                for (int i2 = 0; i2 < formFactors.size(); i2++) {
                    strArr2[i2] = formFactors.get(i2);
                }
            }
            hashMap.put("FORM_FACTORS", strArr2);
        }
        return hashMap;
    }

    static androidx.webkit.UserAgentMetadata getHighSpeedVideoFpsRanges(java.util.Map<java.lang.String, java.lang.Object> map) {
        androidx.webkit.UserAgentMetadata.Builder builder = new androidx.webkit.UserAgentMetadata.Builder();
        java.lang.Object obj = map.get("BRAND_VERSION_LIST");
        if (obj != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String[] strArr : (java.lang.String[][]) obj) {
                arrayList.add(new androidx.webkit.UserAgentMetadata.BrandVersion.Builder().setBrand(strArr[0]).setMajorVersion(strArr[1]).setFullVersion(strArr[2]).build());
            }
            builder.setBrandVersionList(arrayList);
        }
        java.lang.String str = (java.lang.String) map.get("FULL_VERSION");
        if (str != null) {
            builder.setFullVersion(str);
        }
        java.lang.String str2 = (java.lang.String) map.get("PLATFORM");
        if (str2 != null) {
            builder.setPlatform(str2);
        }
        java.lang.String str3 = (java.lang.String) map.get("PLATFORM_VERSION");
        if (str3 != null) {
            builder.setPlatformVersion(str3);
        }
        java.lang.String str4 = (java.lang.String) map.get("ARCHITECTURE");
        if (str4 != null) {
            builder.setArchitecture(str4);
        }
        java.lang.String str5 = (java.lang.String) map.get("MODEL");
        if (str5 != null) {
            builder.setModel(str5);
        }
        java.lang.Boolean bool = (java.lang.Boolean) map.get("MOBILE");
        if (bool != null) {
            builder.setMobile(bool.booleanValue());
        }
        java.lang.Integer num = (java.lang.Integer) map.get("BITNESS");
        if (num != null) {
            builder.setBitness(num.intValue());
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) map.get("WOW64");
        if (bool2 != null) {
            builder.setWow64(bool2.booleanValue());
        }
        java.lang.String[] strArr2 = (java.lang.String[]) map.get("FORM_FACTORS");
        if (strArr2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.String str6 : strArr2) {
                arrayList2.add(str6);
            }
            builder.setFormFactors(arrayList2);
        }
        return builder.build();
    }
}
