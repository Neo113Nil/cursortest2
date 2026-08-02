package com.payair.hce;

/* loaded from: classes4.dex */
public enum getProfileVersion implements com.payair.hce.SdkCoreAlternateContactlessPaymentDataImpl {
    IDENTITY { // from class: com.payair.hce.getProfileVersion.3
        @Override // com.payair.hce.SdkCoreAlternateContactlessPaymentDataImpl
        public final java.lang.String values(java.lang.reflect.Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE { // from class: com.payair.hce.getProfileVersion.5
        @Override // com.payair.hce.SdkCoreAlternateContactlessPaymentDataImpl
        public final java.lang.String values(java.lang.reflect.Field field) {
            return DigitizedCardProfile(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES { // from class: com.payair.hce.getProfileVersion.4
        @Override // com.payair.hce.SdkCoreAlternateContactlessPaymentDataImpl
        public final java.lang.String values(java.lang.reflect.Field field) {
            return DigitizedCardProfile(values(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES { // from class: com.payair.hce.getProfileVersion.2
        @Override // com.payair.hce.SdkCoreAlternateContactlessPaymentDataImpl
        public final java.lang.String values(java.lang.reflect.Field field) {
            return values(field.getName(), "_").toLowerCase(java.util.Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES { // from class: com.payair.hce.getProfileVersion.1
        @Override // com.payair.hce.SdkCoreAlternateContactlessPaymentDataImpl
        public final java.lang.String values(java.lang.reflect.Field field) {
            return values(field.getName(), "-").toLowerCase(java.util.Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS { // from class: com.payair.hce.getProfileVersion.10
        @Override // com.payair.hce.SdkCoreAlternateContactlessPaymentDataImpl
        public final java.lang.String values(java.lang.reflect.Field field) {
            return values(field.getName(), ".").toLowerCase(java.util.Locale.ENGLISH);
        }
    };

    /* synthetic */ getProfileVersion(byte b) {
        this();
    }

    static java.lang.String values(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (java.lang.Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    static java.lang.String DigitizedCardProfile(java.lang.String str) {
        int length = str.length();
        int i = 0;
        while (!java.lang.Character.isLetter(str.charAt(i)) && i < length - 1) {
            i++;
        }
        char charAt = str.charAt(i);
        if (java.lang.Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = java.lang.Character.toUpperCase(charAt);
        if (i == 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(upperCase);
            sb.append(str.substring(1));
            return sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str.substring(0, i));
        sb2.append(upperCase);
        sb2.append(str.substring(i + 1));
        return sb2.toString();
    }
}
