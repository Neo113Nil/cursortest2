package com.discover.mpos.sdk.card.apdu.processors.selectapplication;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/processors/selectapplication/SelectApplicationProcessor;", "Lcom/discover/mpos/sdk/card/apdu/processors/ApduProcessor;", "Lcom/discover/mpos/sdk/card/apdu/select/application/SelectApplicationResponseContent;", "Lcom/discover/mpos/sdk/card/apdu/error/SelectApduError;", "fciTemplateProcessor", "Lcom/discover/mpos/sdk/card/apdu/processors/FciTemplateProcessor;", "Lcom/discover/mpos/sdk/card/apdu/emv/ProprietaryTemplateDataSelect;", "(Lcom/discover/mpos/sdk/card/apdu/processors/FciTemplateProcessor;)V", "processContent", "content", "", "processError", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.d.e.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class SelectApplicationProcessor implements com.discover.mpos.sdk.card.apdu.processors.ApduProcessor<com.discover.mpos.sdk.card.apdu.g.application.SelectApplicationResponseContent, com.discover.mpos.sdk.card.apdu.error.SelectApduError> {

    /* renamed from: a, reason: collision with root package name */
    private final com.discover.mpos.sdk.card.apdu.processors.FciTemplateProcessor<com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataSelect> f2952a;

    public SelectApplicationProcessor(com.discover.mpos.sdk.card.apdu.processors.FciTemplateProcessor<com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataSelect> fciTemplateProcessor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fciTemplateProcessor, "");
        this.f2952a = fciTemplateProcessor;
    }

    @Override // com.discover.mpos.sdk.card.apdu.processors.ApduContentProcessor
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final com.discover.mpos.sdk.card.apdu.g.application.SelectApplicationResponseContent a(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        new java.lang.Object[]{bArr};
        byte[] dataRegion = com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.dataRegion(bArr, com.discover.mpos.sdk.core.emv.tlv.Tag.FILE_CONTROL_INFORMATION_FCI_TEMPLATE.getTag());
        return new com.discover.mpos.sdk.card.apdu.g.application.SelectApplicationResponseContent(dataRegion != null ? this.f2952a.a(dataRegion) : null);
    }

    @Override // com.discover.mpos.sdk.card.apdu.processors.ApduErrorProcessor
    public final /* synthetic */ com.discover.mpos.sdk.card.apdu.error.ApduError b(byte[] bArr) {
        return new com.discover.mpos.sdk.card.apdu.error.SelectApduError(bArr);
    }
}
