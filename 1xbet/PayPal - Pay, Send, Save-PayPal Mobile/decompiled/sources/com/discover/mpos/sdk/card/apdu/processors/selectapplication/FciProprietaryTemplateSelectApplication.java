package com.discover.mpos.sdk.card.apdu.processors.selectapplication;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\r"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/processors/selectapplication/FciProprietaryTemplateSelectApplication;", "Lcom/discover/mpos/sdk/card/apdu/processors/BaseApduContentProcessor;", "Lcom/discover/mpos/sdk/card/apdu/emv/ProprietaryTemplateDataSelect;", "Lcom/discover/mpos/sdk/card/apdu/emv/FciIssuerDataSelect;", "responseDataProcessor", "Lcom/discover/mpos/sdk/card/apdu/processors/ApduContentProcessor;", "(Lcom/discover/mpos/sdk/card/apdu/processors/ApduContentProcessor;)V", "getTlvs", "", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "content", "", "processContent", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.d.e.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class FciProprietaryTemplateSelectApplication extends com.discover.mpos.sdk.card.apdu.processors.BaseApduContentProcessor<com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataSelect, com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataSelect> {
    @Override // com.discover.mpos.sdk.card.apdu.processors.ApduContentProcessor
    public final /* synthetic */ java.lang.Object a(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> filteredTlvs = com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.getFilteredTlvs(bArr, com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_LABEL.getTag(), com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_PRIORITY_INDICATOR.getTag(), com.discover.mpos.sdk.core.emv.tlv.Tag.PROCESSING_OPTIONS_DATA_OBJECT_LIST_PDOL.getTag(), com.discover.mpos.sdk.core.emv.tlv.Tag.LANGUAGE_PREFERENCE.getTag(), com.discover.mpos.sdk.core.emv.tlv.Tag.ISSUER_CODE_TABLE_INDEX.getTag(), com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_PREFERRED_NAME.getTag(), com.discover.mpos.sdk.core.emv.tlv.Tag.FILE_CONTROL_INFORMATION_FCI_ISSUER_DISCRETIONARY_DATA.getTag());
        com.discover.mpos.sdk.card.apdu.emv.CardApplication cardApplication = new com.discover.mpos.sdk.card.apdu.emv.CardApplication(a(filteredTlvs, com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_LABEL.getTag()), a(filteredTlvs, com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_PRIORITY_INDICATOR.getTag()));
        com.discover.mpos.sdk.core.emv.tlv.Tlv a2 = a(filteredTlvs, com.discover.mpos.sdk.core.emv.tlv.Tag.PROCESSING_OPTIONS_DATA_OBJECT_LIST_PDOL.getTag());
        com.discover.mpos.sdk.core.emv.tlv.Tlv a3 = a(filteredTlvs, com.discover.mpos.sdk.core.emv.tlv.Tag.LANGUAGE_PREFERENCE.getTag());
        com.discover.mpos.sdk.core.emv.tlv.Tlv a4 = a(filteredTlvs, com.discover.mpos.sdk.core.emv.tlv.Tag.ISSUER_CODE_TABLE_INDEX.getTag());
        com.discover.mpos.sdk.core.emv.tlv.Tlv a5 = a(filteredTlvs, com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_PREFERRED_NAME.getTag());
        byte[] content = a(filteredTlvs, com.discover.mpos.sdk.core.emv.tlv.Tag.FILE_CONTROL_INFORMATION_FCI_ISSUER_DISCRETIONARY_DATA.getTag()).getContent();
        return new com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataSelect(cardApplication, a2, a3, a4, a5, content != null ? b(content) : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FciProprietaryTemplateSelectApplication(com.discover.mpos.sdk.card.apdu.processors.ApduContentProcessor<com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataSelect> apduContentProcessor) {
        super(apduContentProcessor);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apduContentProcessor, "");
    }
}
