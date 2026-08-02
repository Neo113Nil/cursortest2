package com.discover.mpos.sdk.card.apdu.processors.selectapplication;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/processors/selectapplication/IssuerDiscretionaryDataSelectApplication;", "Lcom/discover/mpos/sdk/card/apdu/processors/BaseApduContentProcessor;", "Lcom/discover/mpos/sdk/card/apdu/emv/FciIssuerDataSelect;", "", "()V", "getStartIndex", "", "f", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "processContent", "content", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.d.e.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class IssuerDiscretionaryDataSelectApplication extends com.discover.mpos.sdk.card.apdu.processors.BaseApduContentProcessor<com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataSelect, kotlin.Unit> {
    @Override // com.discover.mpos.sdk.card.apdu.processors.ApduContentProcessor
    public final /* synthetic */ java.lang.Object a(byte[] bArr) {
        int a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        com.discover.mpos.sdk.core.emv.tlv.Tlv a3 = a(com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.getFilteredTlvs(bArr, com.discover.mpos.sdk.core.emv.tlv.Tag.LOG_ENTRY.getTag()), com.discover.mpos.sdk.core.emv.tlv.Tag.LOG_ENTRY.getTag());
        com.discover.mpos.sdk.core.emv.tlv.Tlv a4 = a(com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.getFilteredTlvs(bArr, com.discover.mpos.sdk.core.emv.tlv.Tag.FORM_FACTOR_IDENTIFIER.getTag()), com.discover.mpos.sdk.core.emv.tlv.Tag.FORM_FACTOR_IDENTIFIER.getTag());
        if (a4.getLength() == 0) {
            a2 = a(a3);
        } else {
            a2 = a(a4);
        }
        return new com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataSelect(a3, a4, com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.getFilteredTlvs(kotlin.collections.ArraysKt.copyOfRange(bArr, a2, bArr.length), new java.lang.String[0]));
    }

    private static int a(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv) {
        if (tlv.getLength() == 0) {
            return tlv.getLength();
        }
        return tlv.getLastByteIndex();
    }
}
