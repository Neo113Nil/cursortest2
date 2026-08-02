package com.discover.mpos.sdk.card.apdu.emv;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0014"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/emv/ProprietaryTemplateDataPpse;", "Lcom/discover/mpos/sdk/core/emv/Clearable;", "fciIssuerData", "Lcom/discover/mpos/sdk/card/apdu/emv/FciIssuerDataPpse;", "(Lcom/discover/mpos/sdk/card/apdu/emv/FciIssuerDataPpse;)V", "getFciIssuerData", "()Lcom/discover/mpos/sdk/card/apdu/emv/FciIssuerDataPpse;", "setFciIssuerData", "clear", "", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.a.g, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class ProprietaryTemplateDataPpse implements com.discover.mpos.sdk.core.emv.Clearable {

    /* renamed from: a, reason: collision with root package name */
    public com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataPpse f2937a;

    public ProprietaryTemplateDataPpse(com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataPpse fciIssuerDataPpse) {
        this.f2937a = fciIssuerDataPpse;
    }

    private /* synthetic */ ProprietaryTemplateDataPpse() {
        this(null);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProprietaryTemplateDataPpse(fciIssuerData=");
        sb.append(this.f2937a);
        sb.append(')');
        return sb.toString();
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataPpse fciIssuerDataPpse = this.f2937a;
        if (fciIssuerDataPpse != null) {
            fciIssuerDataPpse.clear();
        }
        this.f2937a = null;
    }

    public final int hashCode() {
        com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataPpse fciIssuerDataPpse = this.f2937a;
        if (fciIssuerDataPpse != null) {
            return fciIssuerDataPpse.hashCode();
        }
        return 0;
    }

    public final boolean equals(java.lang.Object other) {
        if (this != other) {
            return (other instanceof com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataPpse) && kotlin.jvm.internal.Intrinsics.areEqual(this.f2937a, ((com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataPpse) other).f2937a);
        }
        return true;
    }
}
