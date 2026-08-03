package com.iab.omid.library.vungle.adsession;

/* loaded from: classes5.dex */
public enum Owner {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE("none");

    private final java.lang.String owner;

    Owner(java.lang.String str) {
        this.owner = str;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.owner;
    }
}
