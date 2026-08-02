package com.discover.mpos.sdk.card.apdu.processors.selectppse;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/processors/selectppse/ProprietaryTemplateDataPpseProcessor;", "Lcom/discover/mpos/sdk/card/apdu/processors/BaseApduContentProcessor;", "Lcom/discover/mpos/sdk/card/apdu/emv/ProprietaryTemplateDataPpse;", "Lcom/discover/mpos/sdk/card/apdu/emv/FciIssuerDataPpse;", "responseDataProcessor", "Lcom/discover/mpos/sdk/card/apdu/processors/ApduContentProcessor;", "(Lcom/discover/mpos/sdk/card/apdu/processors/ApduContentProcessor;)V", "processContent", "content", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.d.f.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class ProprietaryTemplateDataPpseProcessor extends com.discover.mpos.sdk.card.apdu.processors.BaseApduContentProcessor<com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataPpse, com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataPpse> {
    @Override // com.discover.mpos.sdk.card.apdu.processors.ApduContentProcessor
    public final /* synthetic */ java.lang.Object a(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        byte[] content = a(com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.getFilteredTlvs(bArr, com.discover.mpos.sdk.core.emv.tlv.Tag.FILE_CONTROL_INFORMATION_FCI_ISSUER_DISCRETIONARY_DATA.getTag()), com.discover.mpos.sdk.core.emv.tlv.Tag.FILE_CONTROL_INFORMATION_FCI_ISSUER_DISCRETIONARY_DATA.getTag()).getContent();
        return new com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataPpse(content != null ? b(content) : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProprietaryTemplateDataPpseProcessor(com.discover.mpos.sdk.card.apdu.processors.ApduContentProcessor<com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataPpse> apduContentProcessor) {
        super(apduContentProcessor);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apduContentProcessor, "");
    }
}
