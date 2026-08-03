package com.iab.omid.library.fyber.adsession;

/* loaded from: classes5.dex */
public enum AdSessionContextType {
    HTML("html"),
    NATIVE("native"),
    JAVASCRIPT("javascript");

    private final java.lang.String typeString;

    AdSessionContextType(java.lang.String str) {
        this.typeString = str;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.typeString;
    }
}
