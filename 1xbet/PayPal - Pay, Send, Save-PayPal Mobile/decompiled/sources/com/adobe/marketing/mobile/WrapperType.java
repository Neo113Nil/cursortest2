package com.adobe.marketing.mobile;

/* loaded from: classes3.dex */
public enum WrapperType {
    NONE("N"),
    REACT_NATIVE(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE),
    FLUTTER(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER),
    CORDOVA(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA),
    UNITY(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.UNITY),
    XAMARIN(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.XAMARIN);

    private final java.lang.String Camera2StreamConfigurationMap;

    WrapperType(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    public final java.lang.String getWrapperTag() {
        return this.Camera2StreamConfigurationMap;
    }

    public static com.adobe.marketing.mobile.WrapperType fromString(java.lang.String str) {
        if (com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE.equals(str)) {
            return REACT_NATIVE;
        }
        if (com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER.equals(str)) {
            return FLUTTER;
        }
        if (com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA.equals(str)) {
            return CORDOVA;
        }
        if (com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.UNITY.equals(str)) {
            return UNITY;
        }
        if (com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.XAMARIN.equals(str)) {
            return XAMARIN;
        }
        return NONE;
    }

    /* renamed from: com.adobe.marketing.mobile.WrapperType$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[com.adobe.marketing.mobile.WrapperType.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[com.adobe.marketing.mobile.WrapperType.REACT_NATIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[com.adobe.marketing.mobile.WrapperType.FLUTTER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[com.adobe.marketing.mobile.WrapperType.CORDOVA.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                Camera2StreamConfigurationMap[com.adobe.marketing.mobile.WrapperType.UNITY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                Camera2StreamConfigurationMap[com.adobe.marketing.mobile.WrapperType.XAMARIN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                Camera2StreamConfigurationMap[com.adobe.marketing.mobile.WrapperType.NONE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    public final java.lang.String getFriendlyName() {
        int i = com.adobe.marketing.mobile.WrapperType.AnonymousClass1.Camera2StreamConfigurationMap[ordinal()];
        if (i == 1) {
            return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.REACT_NATIVE;
        }
        if (i == 2) {
            return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.FLUTTER;
        }
        if (i == 3) {
            return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.CORDOVA;
        }
        if (i == 4) {
            return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.UNITY;
        }
        if (i == 5) {
            return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.XAMARIN;
        }
        return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE;
    }
}
