package com.google.gson;

/* loaded from: classes4.dex */
public enum FieldNamingPolicy implements com.google.gson.FieldNamingStrategy {
    IDENTITY { // from class: com.google.gson.FieldNamingPolicy.1
        @Override // com.google.gson.FieldNamingStrategy
        public final java.lang.String translateName(java.lang.reflect.Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE { // from class: com.google.gson.FieldNamingPolicy.2
        @Override // com.google.gson.FieldNamingStrategy
        public final java.lang.String translateName(java.lang.reflect.Field field) {
            return upperCaseFirstLetter(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES { // from class: com.google.gson.FieldNamingPolicy.3
        @Override // com.google.gson.FieldNamingStrategy
        public final java.lang.String translateName(java.lang.reflect.Field field) {
            return upperCaseFirstLetter(separateCamelCase(field.getName(), ' '));
        }
    },
    UPPER_CASE_WITH_UNDERSCORES { // from class: com.google.gson.FieldNamingPolicy.4
        @Override // com.google.gson.FieldNamingStrategy
        public final java.lang.String translateName(java.lang.reflect.Field field) {
            return separateCamelCase(field.getName(), '_').toUpperCase(java.util.Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_UNDERSCORES { // from class: com.google.gson.FieldNamingPolicy.5
        @Override // com.google.gson.FieldNamingStrategy
        public final java.lang.String translateName(java.lang.reflect.Field field) {
            return separateCamelCase(field.getName(), '_').toLowerCase(java.util.Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES { // from class: com.google.gson.FieldNamingPolicy.6
        @Override // com.google.gson.FieldNamingStrategy
        public final java.lang.String translateName(java.lang.reflect.Field field) {
            return separateCamelCase(field.getName(), '-').toLowerCase(java.util.Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS { // from class: com.google.gson.FieldNamingPolicy.7
        @Override // com.google.gson.FieldNamingStrategy
        public final java.lang.String translateName(java.lang.reflect.Field field) {
            return separateCamelCase(field.getName(), com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR).toLowerCase(java.util.Locale.ENGLISH);
        }
    };

    static java.lang.String separateCamelCase(java.lang.String str, char c) {
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

    static java.lang.String upperCaseFirstLetter(java.lang.String str) {
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
