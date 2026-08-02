package com.pichillilorenzo.flutter_inappwebview_android.types;

import e1.k;

/* loaded from: classes2.dex */
public enum PreferredContentModeOptionType {
    RECOMMENDED(0),
    MOBILE(1),
    DESKTOP(2);

    private final int value;

    PreferredContentModeOptionType(int i7) {
        this.value = i7;
    }

    public static PreferredContentModeOptionType fromValue(int i7) {
        for (PreferredContentModeOptionType preferredContentModeOptionType : values()) {
            if (i7 == preferredContentModeOptionType.toValue()) {
                return preferredContentModeOptionType;
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
