package com.facebook;

import androidx.browser.trusted.sharing.ShareTarget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class F {
    public static final F a;
    public static final F b;
    public static final /* synthetic */ F[] c;

    static {
        F f = new F(ShareTarget.METHOD_GET, 0);
        a = f;
        F f2 = new F("POST", 1);
        b = f2;
        c = new F[]{f, f2, new F("DELETE", 2)};
    }

    public F() {
        throw null;
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) c.clone();
    }
}
