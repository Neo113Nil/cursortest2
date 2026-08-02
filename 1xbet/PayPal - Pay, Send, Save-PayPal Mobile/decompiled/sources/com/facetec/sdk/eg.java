package com.facetec.sdk;

/* loaded from: classes8.dex */
public enum eg implements com.facetec.sdk.ek {
    IDENTITY { // from class: com.facetec.sdk.eg.1
        @Override // com.facetec.sdk.ek
        public final java.lang.String e(java.lang.reflect.Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE { // from class: com.facetec.sdk.eg.2
        @Override // com.facetec.sdk.ek
        public final java.lang.String e(java.lang.reflect.Field field) {
            return c(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES { // from class: com.facetec.sdk.eg.3
        @Override // com.facetec.sdk.ek
        public final java.lang.String e(java.lang.reflect.Field field) {
            return c(a(field.getName(), ' '));
        }
    },
    UPPER_CASE_WITH_UNDERSCORES { // from class: com.facetec.sdk.eg.4
        @Override // com.facetec.sdk.ek
        public final java.lang.String e(java.lang.reflect.Field field) {
            return a(field.getName(), '_').toUpperCase(java.util.Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_UNDERSCORES { // from class: com.facetec.sdk.eg.5
        @Override // com.facetec.sdk.ek
        public final java.lang.String e(java.lang.reflect.Field field) {
            return a(field.getName(), '_').toLowerCase(java.util.Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES { // from class: com.facetec.sdk.eg.10
        @Override // com.facetec.sdk.ek
        public final java.lang.String e(java.lang.reflect.Field field) {
            return a(field.getName(), '-').toLowerCase(java.util.Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS { // from class: com.facetec.sdk.eg.8
        @Override // com.facetec.sdk.ek
        public final java.lang.String e(java.lang.reflect.Field field) {
            return a(field.getName(), com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR).toLowerCase(java.util.Locale.ENGLISH);
        }
    };

    /* synthetic */ eg(byte b) {
        this();
    }

    static java.lang.String a(java.lang.String str, char c) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (java.lang.Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    static java.lang.String c(java.lang.String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (!java.lang.Character.isLetter(charAt)) {
                i++;
            } else if (!java.lang.Character.isUpperCase(charAt)) {
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
        return str;
    }
}
