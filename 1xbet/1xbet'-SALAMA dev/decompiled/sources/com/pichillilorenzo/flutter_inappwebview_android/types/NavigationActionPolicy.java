package com.pichillilorenzo.flutter_inappwebview_android.types;

import p031e1.k;

/* JADX INFO: loaded from: classes2.dex */
public enum NavigationActionPolicy {
    CANCEL(0),
    ALLOW(1);

    private final int value;

    NavigationActionPolicy(int i7) {
        this.value = i7;
    }

    public static NavigationActionPolicy fromValue(int i7) {
        for (NavigationActionPolicy navigationActionPolicy : values()) {
            if (i7 == navigationActionPolicy.value) {
                return navigationActionPolicy;
            }
        }
        throw new IllegalArgumentException(k.d(i7, "No enum constant: "));
    }

    public boolean equalsValue(int i7) {
        return this.value == i7;
    }

    public int rawValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.valueOf(this.value);
    }
}
