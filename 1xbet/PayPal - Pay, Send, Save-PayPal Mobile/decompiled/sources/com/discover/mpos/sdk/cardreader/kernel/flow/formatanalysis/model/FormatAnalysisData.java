package com.discover.mpos.sdk.cardreader.kernel.flow.formatanalysis.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/formatanalysis/model/FormatAnalysisData;", "", "dfName", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "fciProprietaryTemplate", "Lcom/discover/mpos/sdk/card/apdu/emv/ProprietaryTemplateDataSelect;", "applicationLabel", "pdolData", "deferredAuthorizationSupported", "", "(Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;Lcom/discover/mpos/sdk/card/apdu/emv/ProprietaryTemplateDataSelect;Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;Z)V", "getApplicationLabel", "()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getDeferredAuthorizationSupported", "()Z", "getDfName", "getFciProprietaryTemplate", "()Lcom/discover/mpos/sdk/card/apdu/emv/ProprietaryTemplateDataSelect;", "getPdolData", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.b.b.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class FormatAnalysisData {

    /* renamed from: a, reason: collision with root package name */
    public final com.discover.mpos.sdk.core.emv.tlv.Tlv f3020a;
    public final com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataSelect b;
    public final com.discover.mpos.sdk.core.emv.tlv.Tlv c;
    public final com.discover.mpos.sdk.core.emv.tlv.Tlv d;
    public final boolean e;

    public FormatAnalysisData(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv, com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataSelect proprietaryTemplateDataSelect, com.discover.mpos.sdk.core.emv.tlv.Tlv tlv2, com.discover.mpos.sdk.core.emv.tlv.Tlv tlv3, boolean z) {
        this.f3020a = tlv;
        this.b = proprietaryTemplateDataSelect;
        this.c = tlv2;
        this.d = tlv3;
        this.e = z;
    }

    public /* synthetic */ FormatAnalysisData() {
        this(null, null, null, null, false);
    }

    public final java.lang.String toString() {
        return com.discover.mpos.sdk.core.extensions.StringExtensionsKt.toJSONString(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv = this.f3020a;
        int hashCode = tlv != null ? tlv.hashCode() : 0;
        com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataSelect proprietaryTemplateDataSelect = this.b;
        int hashCode2 = proprietaryTemplateDataSelect != null ? proprietaryTemplateDataSelect.hashCode() : 0;
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv2 = this.c;
        int hashCode3 = tlv2 != null ? tlv2.hashCode() : 0;
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv3 = this.d;
        int hashCode4 = tlv3 != null ? tlv3.hashCode() : 0;
        boolean z = this.e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.cardreader.kernel.flow.formatanalysis.model.FormatAnalysisData)) {
            return false;
        }
        com.discover.mpos.sdk.cardreader.kernel.flow.formatanalysis.model.FormatAnalysisData formatAnalysisData = (com.discover.mpos.sdk.cardreader.kernel.flow.formatanalysis.model.FormatAnalysisData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f3020a, formatAnalysisData.f3020a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, formatAnalysisData.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, formatAnalysisData.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, formatAnalysisData.d) && this.e == formatAnalysisData.e;
    }
}
