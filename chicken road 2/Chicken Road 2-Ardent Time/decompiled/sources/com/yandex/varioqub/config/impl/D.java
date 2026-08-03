package com.yandex.varioqub.config.impl;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f2659a;

    public static java.lang.String a(java.lang.String str) {
        java.lang.String str2 = f2659a;
        if (str2 == null) {
            str2 = "https://app.uaas.yandex.ru/v1/app?client_id=%s";
        }
        return java.lang.String.format(str2, java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
    }
}
