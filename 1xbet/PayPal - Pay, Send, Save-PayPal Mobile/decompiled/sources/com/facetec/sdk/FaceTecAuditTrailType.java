package com.facetec.sdk;

/* loaded from: classes8.dex */
public enum FaceTecAuditTrailType {
    DISABLED("Audit trail images will not be returned"),
    FULL_RESOLUTION("The full resolution image will be returned for the audit trail"),
    HEIGHT_640("An image of height 640 will be returned for the audit trail");

    private final java.lang.String c;

    FaceTecAuditTrailType(java.lang.String str) {
        this.c = str;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.c;
    }
}
