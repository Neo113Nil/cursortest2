package com.google.gson;

/* loaded from: classes4.dex */
public interface FieldNamingStrategy {
    java.lang.String translateName(java.lang.reflect.Field field);

    default java.util.List<java.lang.String> alternateNames(java.lang.reflect.Field field) {
        return java.util.Collections.emptyList();
    }
}
