package com.paypal.oslo.feature.cryptocurrency.domain.model.funding;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;", "", "", "displayType", "displayBrand", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentArt;", "instrumentArt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentArt;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentArt;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentArt;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentMetadata;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDisplayType", "getDisplayBrand", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/InstrumentArt;", "getInstrumentArt"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class InstrumentMetadata {
    public static final int $stable = 0;
    private final java.lang.String displayBrand;
    private final java.lang.String displayType;
    private final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt instrumentArt;

    public InstrumentMetadata(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt instrumentArt) {
        this.displayType = str;
        this.displayBrand = str2;
        this.instrumentArt = instrumentArt;
    }

    public final java.lang.String getDisplayType() {
        return this.displayType;
    }

    public final java.lang.String getDisplayBrand() {
        return this.displayBrand;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt getInstrumentArt() {
        return this.instrumentArt;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.displayType;
        java.lang.String str2 = this.displayBrand;
        com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt instrumentArt = this.instrumentArt;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InstrumentMetadata(displayType=");
        sb.append(str);
        sb.append(", displayBrand=");
        sb.append(str2);
        sb.append(", instrumentArt=");
        sb.append(instrumentArt);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.displayType;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.displayBrand;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt instrumentArt = this.instrumentArt;
        return (((hashCode * 31) + hashCode2) * 31) + (instrumentArt != null ? instrumentArt.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata = (com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.displayType, instrumentMetadata.displayType) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayBrand, instrumentMetadata.displayBrand) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentArt, instrumentMetadata.instrumentArt);
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata copy(java.lang.String displayType, java.lang.String displayBrand, com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt instrumentArt) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata(displayType, displayBrand, instrumentArt);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt getInstrumentArt() {
        return this.instrumentArt;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDisplayBrand() {
        return this.displayBrand;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDisplayType() {
        return this.displayType;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata copy$default(com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata instrumentMetadata, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt instrumentArt, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = instrumentMetadata.displayType;
        }
        if ((i & 2) != 0) {
            str2 = instrumentMetadata.displayBrand;
        }
        if ((i & 4) != 0) {
            instrumentArt = instrumentMetadata.instrumentArt;
        }
        return instrumentMetadata.copy(str, str2, instrumentArt);
    }
}
