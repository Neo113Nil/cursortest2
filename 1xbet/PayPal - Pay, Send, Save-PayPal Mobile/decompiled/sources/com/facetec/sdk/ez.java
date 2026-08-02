package com.facetec.sdk;

/* loaded from: classes8.dex */
public interface ez {

    public enum a {
        ALLOW,
        INDECISIVE,
        BLOCK_INACCESSIBLE,
        BLOCK_ALL
    }

    com.facetec.sdk.ez.a a(java.lang.Class<?> cls);

    static {
        new com.facetec.sdk.ez() { // from class: com.facetec.sdk.ez.5
            @Override // com.facetec.sdk.ez
            public final com.facetec.sdk.ez.a a(java.lang.Class<?> cls) {
                if (com.facetec.sdk.ft.d(cls)) {
                    return com.facetec.sdk.ez.a.BLOCK_INACCESSIBLE;
                }
                return com.facetec.sdk.ez.a.INDECISIVE;
            }
        };
        new com.facetec.sdk.ez() { // from class: com.facetec.sdk.ez.3
            @Override // com.facetec.sdk.ez
            public final com.facetec.sdk.ez.a a(java.lang.Class<?> cls) {
                if (com.facetec.sdk.ft.d(cls)) {
                    return com.facetec.sdk.ez.a.BLOCK_ALL;
                }
                return com.facetec.sdk.ez.a.INDECISIVE;
            }
        };
        new com.facetec.sdk.ez() { // from class: com.facetec.sdk.ez.4
            @Override // com.facetec.sdk.ez
            public final com.facetec.sdk.ez.a a(java.lang.Class<?> cls) {
                if (com.facetec.sdk.ft.a(cls.getName())) {
                    return com.facetec.sdk.ez.a.BLOCK_ALL;
                }
                return com.facetec.sdk.ez.a.INDECISIVE;
            }
        };
        new com.facetec.sdk.ez() { // from class: com.facetec.sdk.ez.2
            @Override // com.facetec.sdk.ez
            public final com.facetec.sdk.ez.a a(java.lang.Class<?> cls) {
                java.lang.String name2 = cls.getName();
                if (com.facetec.sdk.ft.a(name2) || name2.startsWith("kotlin.") || name2.startsWith("kotlinx.") || name2.startsWith("scala.")) {
                    return com.facetec.sdk.ez.a.BLOCK_ALL;
                }
                return com.facetec.sdk.ez.a.INDECISIVE;
            }
        };
    }
}
