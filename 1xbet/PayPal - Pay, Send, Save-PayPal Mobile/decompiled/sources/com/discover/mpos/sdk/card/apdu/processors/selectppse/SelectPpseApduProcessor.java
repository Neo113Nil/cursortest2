package com.discover.mpos.sdk.card.apdu.processors.selectppse;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/processors/selectppse/SelectPpseApduProcessor;", "Lcom/discover/mpos/sdk/card/apdu/processors/ApduProcessor;", "Lcom/discover/mpos/sdk/card/apdu/select/ppse/SelectPPSEResponseContent;", "Lcom/discover/mpos/sdk/card/apdu/error/SelectApduError;", "fciTemplateProcessor", "Lcom/discover/mpos/sdk/card/apdu/processors/FciTemplateProcessor;", "Lcom/discover/mpos/sdk/card/apdu/emv/ProprietaryTemplateDataPpse;", "(Lcom/discover/mpos/sdk/card/apdu/processors/FciTemplateProcessor;)V", "processContent", "content", "", "processError", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.d.f.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class SelectPpseApduProcessor implements com.discover.mpos.sdk.card.apdu.processors.ApduProcessor<com.discover.mpos.sdk.card.apdu.g.ppse.SelectPPSEResponseContent, com.discover.mpos.sdk.card.apdu.error.SelectApduError> {

    /* renamed from: a, reason: collision with root package name */
    private final com.discover.mpos.sdk.card.apdu.processors.FciTemplateProcessor<com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataPpse> f2954a;

    public SelectPpseApduProcessor(com.discover.mpos.sdk.card.apdu.processors.FciTemplateProcessor<com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataPpse> fciTemplateProcessor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fciTemplateProcessor, "");
        this.f2954a = fciTemplateProcessor;
    }

    @Override // com.discover.mpos.sdk.card.apdu.processors.ApduContentProcessor
    public final /* synthetic */ java.lang.Object a(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        new java.lang.Object[]{bArr};
        byte[] dataRegion = com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.dataRegion(bArr, com.discover.mpos.sdk.core.emv.tlv.Tag.FILE_CONTROL_INFORMATION_FCI_TEMPLATE.getTag());
        return new com.discover.mpos.sdk.card.apdu.g.ppse.SelectPPSEResponseContent(dataRegion != null ? this.f2954a.a(dataRegion) : null);
    }

    @Override // com.discover.mpos.sdk.card.apdu.processors.ApduErrorProcessor
    public final /* synthetic */ com.discover.mpos.sdk.card.apdu.error.ApduError b(byte[] bArr) {
        return new com.discover.mpos.sdk.card.apdu.error.SelectApduError(bArr);
    }
}
