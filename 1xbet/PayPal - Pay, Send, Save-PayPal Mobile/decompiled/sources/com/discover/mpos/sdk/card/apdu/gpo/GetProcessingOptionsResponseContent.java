package com.discover.mpos.sdk.card.apdu.gpo;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/gpo/GetProcessingOptionsResponseContent;", "Lcom/discover/mpos/sdk/core/emv/Clearable;", "tlvs", "", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "(Ljava/util/List;)V", "getTlvs", "()Ljava/util/List;", "clear", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.c.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class GetProcessingOptionsResponseContent implements com.discover.mpos.sdk.core.emv.Clearable {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> f2949a;

    public GetProcessingOptionsResponseContent(java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.f2949a = list;
    }

    public final java.lang.String toString() {
        return this.f2949a.toString();
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        java.util.Iterator<T> it = this.f2949a.iterator();
        while (it.hasNext()) {
            ((com.discover.mpos.sdk.core.emv.tlv.Tlv) it.next()).clear();
        }
    }
}
