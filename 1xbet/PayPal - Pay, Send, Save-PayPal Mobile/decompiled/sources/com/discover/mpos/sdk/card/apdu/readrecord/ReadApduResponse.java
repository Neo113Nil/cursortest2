package com.discover.mpos.sdk.card.apdu.readrecord;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/readrecord/ReadApduResponse;", "Lcom/discover/mpos/sdk/core/emv/ClearableEmvData;", "tlvs", "", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getTlvs", "()Ljava/util/List;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.f.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public interface ReadApduResponse extends com.discover.mpos.sdk.core.emv.ClearableEmvData {
    java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> a();
}
