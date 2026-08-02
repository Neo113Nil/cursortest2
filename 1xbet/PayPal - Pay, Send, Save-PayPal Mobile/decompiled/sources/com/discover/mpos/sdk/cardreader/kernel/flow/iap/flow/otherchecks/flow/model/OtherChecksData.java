package com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÂ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÂ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\b\u0010\u0017\u001a\u00020\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/otherchecks/flow/model/OtherChecksData;", "", "processingData", "Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;", "tlvList", "", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "(Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;Ljava/util/List;)V", "tvr", "Lcom/discover/mpos/sdk/transaction/processing/terminalverificationresults/TerminalVerificationResults;", "getTvr", "()Lcom/discover/mpos/sdk/transaction/processing/terminalverificationresults/TerminalVerificationResults;", "component1", "component2", "copy", "equals", "", "other", "getTLV", "tag", "", "hashCode", "", "toString", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.c.a.c.a.c.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class OtherChecksData {

    /* renamed from: a, reason: collision with root package name */
    public final com.discover.mpos.sdk.transaction.processing.terminalverificationresults.TerminalVerificationResults f3038a;
    private final com.discover.mpos.sdk.transaction.processing.ProcessingData b;
    private final java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> c;

    public OtherChecksData(com.discover.mpos.sdk.transaction.processing.ProcessingData processingData, java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processingData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.b = processingData;
        this.c = list;
        this.f3038a = processingData.h();
    }

    public final java.lang.String toString() {
        return com.discover.mpos.sdk.core.extensions.StringExtensionsKt.toJSONString(this);
    }

    public final com.discover.mpos.sdk.core.emv.tlv.Tlv a(java.lang.String str) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.discover.mpos.sdk.core.emv.tlv.Tlv) obj).getTag(), str)) {
                break;
            }
        }
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv = (com.discover.mpos.sdk.core.emv.tlv.Tlv) obj;
        return tlv == null ? new com.discover.mpos.sdk.core.emv.tlv.Tlv(str, null, 0, 0, 14, null) : tlv;
    }

    public final int hashCode() {
        com.discover.mpos.sdk.transaction.processing.ProcessingData processingData = this.b;
        int hashCode = processingData != null ? processingData.hashCode() : 0;
        java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> list = this.c;
        return (hashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.model.OtherChecksData)) {
            return false;
        }
        com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.model.OtherChecksData otherChecksData = (com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.model.OtherChecksData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.b, otherChecksData.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, otherChecksData.c);
    }
}
