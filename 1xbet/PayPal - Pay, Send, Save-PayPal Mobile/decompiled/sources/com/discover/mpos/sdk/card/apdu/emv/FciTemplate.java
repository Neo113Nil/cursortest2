package com.discover.mpos.sdk.card.apdu.emv;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0007J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/emv/FciTemplate;", "ProprietaryTemplateData", "Lcom/discover/mpos/sdk/core/emv/Clearable;", "", "dfName", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "fciProprietaryTemplate", "(Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;Lcom/discover/mpos/sdk/core/emv/Clearable;)V", "getDfName", "()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getFciProprietaryTemplate", "()Lcom/discover/mpos/sdk/core/emv/Clearable;", "Lcom/discover/mpos/sdk/core/emv/Clearable;", "clear", "", "equals", "", "other", "hashCode", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.a.f, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class FciTemplate<ProprietaryTemplateData extends com.discover.mpos.sdk.core.emv.Clearable> {

    /* renamed from: a, reason: collision with root package name */
    public final com.discover.mpos.sdk.core.emv.tlv.Tlv f2936a;
    public final ProprietaryTemplateData b;

    public FciTemplate(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv, ProprietaryTemplateData proprietarytemplatedata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlv, "");
        this.f2936a = tlv;
        this.b = proprietarytemplatedata;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        if (other == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.discover.mpos.sdk.card.apdu.emv.FciTemplate<*>");
        }
        com.discover.mpos.sdk.card.apdu.emv.FciTemplate fciTemplate = (com.discover.mpos.sdk.card.apdu.emv.FciTemplate) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f2936a, fciTemplate.f2936a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, fciTemplate.b);
    }

    public final int hashCode() {
        int hashCode = this.f2936a.hashCode();
        ProprietaryTemplateData proprietarytemplatedata = this.b;
        return (hashCode * 31) + (proprietarytemplatedata != null ? proprietarytemplatedata.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FciTemplate(dfName=");
        sb.append(this.f2936a);
        sb.append(", fciProprietaryTemplate=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
