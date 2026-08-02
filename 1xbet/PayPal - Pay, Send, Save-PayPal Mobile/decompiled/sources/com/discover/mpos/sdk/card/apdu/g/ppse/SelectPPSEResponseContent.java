package com.discover.mpos.sdk.card.apdu.g.ppse;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/select/ppse/SelectPPSEResponseContent;", "", "fciTemplate", "Lcom/discover/mpos/sdk/card/apdu/emv/FciTemplate;", "Lcom/discover/mpos/sdk/card/apdu/emv/ProprietaryTemplateDataPpse;", "(Lcom/discover/mpos/sdk/card/apdu/emv/FciTemplate;)V", "getFciTemplate", "()Lcom/discover/mpos/sdk/card/apdu/emv/FciTemplate;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.g.b.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class SelectPPSEResponseContent {

    /* renamed from: a, reason: collision with root package name */
    public final com.discover.mpos.sdk.card.apdu.emv.FciTemplate<com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataPpse> f2971a;

    public SelectPPSEResponseContent(com.discover.mpos.sdk.card.apdu.emv.FciTemplate<com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataPpse> fciTemplate) {
        this.f2971a = fciTemplate;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectPPSEResponseContent(fciTemplate=");
        sb.append(this.f2971a);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        com.discover.mpos.sdk.card.apdu.emv.FciTemplate<com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataPpse> fciTemplate = this.f2971a;
        if (fciTemplate != null) {
            return fciTemplate.hashCode();
        }
        return 0;
    }

    public final boolean equals(java.lang.Object other) {
        if (this != other) {
            return (other instanceof com.discover.mpos.sdk.card.apdu.g.ppse.SelectPPSEResponseContent) && kotlin.jvm.internal.Intrinsics.areEqual(this.f2971a, ((com.discover.mpos.sdk.card.apdu.g.ppse.SelectPPSEResponseContent) other).f2971a);
        }
        return true;
    }
}
