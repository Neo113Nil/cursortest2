package com.facebook.login;

/* loaded from: classes3.dex */
public enum A {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");

    public static final a Companion = new a();
    public final String a;

    public static final class a {
    }

    A(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
