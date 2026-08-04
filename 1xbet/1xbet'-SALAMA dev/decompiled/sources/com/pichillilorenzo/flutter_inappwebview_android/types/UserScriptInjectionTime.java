package com.pichillilorenzo.flutter_inappwebview_android.types;

import p031e1.k;

/* JADX INFO: loaded from: classes2.dex */
public enum UserScriptInjectionTime {
    AT_DOCUMENT_START(0),
    AT_DOCUMENT_END(1);

    private final int value;

    UserScriptInjectionTime(int i7) {
        this.value = i7;
    }

    public static UserScriptInjectionTime fromValue(int i7) {
        for (UserScriptInjectionTime userScriptInjectionTime : values()) {
            if (i7 == userScriptInjectionTime.toValue()) {
                return userScriptInjectionTime;
            }
        }
        throw new IllegalArgumentException(k.d(i7, "No enum constant: "));
    }

    public boolean equalsValue(int i7) {
        return this.value == i7;
    }

    public int toValue() {
        return this.value;
    }
}
