package com.facetec.sdk;

/* loaded from: classes8.dex */
public interface ow {
    void c(java.io.File file) throws java.io.IOException;

    static {
        new com.facetec.sdk.ow() { // from class: com.facetec.sdk.ow.3
            @Override // com.facetec.sdk.ow
            public final void c(java.io.File file) throws java.io.IOException {
                if (!file.delete() && file.exists()) {
                    throw new java.io.IOException("failed to delete ".concat(java.lang.String.valueOf(file)));
                }
            }
        };
    }
}
