package com.discover.mpos.sdk.card.apdu.processors;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0004\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/processors/FciTemplateProcessor;", "FciTemplateData", "Lcom/discover/mpos/sdk/core/emv/Clearable;", "Lcom/discover/mpos/sdk/card/apdu/processors/BaseApduContentProcessor;", "Lcom/discover/mpos/sdk/card/apdu/emv/FciTemplate;", "responseDataProcessor", "Lcom/discover/mpos/sdk/card/apdu/processors/ApduContentProcessor;", "(Lcom/discover/mpos/sdk/card/apdu/processors/ApduContentProcessor;)V", "processContent", "content", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.d.e, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class FciTemplateProcessor<FciTemplateData extends com.discover.mpos.sdk.core.emv.Clearable> extends com.discover.mpos.sdk.card.apdu.processors.BaseApduContentProcessor<com.discover.mpos.sdk.card.apdu.emv.FciTemplate<FciTemplateData>, FciTemplateData> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FciTemplateProcessor(com.discover.mpos.sdk.card.apdu.processors.ApduContentProcessor<FciTemplateData> apduContentProcessor) {
        super(apduContentProcessor);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apduContentProcessor, "");
    }

    @Override // com.discover.mpos.sdk.card.apdu.processors.ApduContentProcessor
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final com.discover.mpos.sdk.card.apdu.emv.FciTemplate<FciTemplateData> a(byte[] bArr) {
        com.discover.mpos.sdk.core.emv.Clearable clearable;
        java.lang.Object obj;
        java.lang.Object obj2;
        byte[] content;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> filteredTlvs = com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.getFilteredTlvs(bArr, com.discover.mpos.sdk.core.emv.tlv.Tag.DEDICATED_FILE_DF_NAME.getTag(), com.discover.mpos.sdk.core.emv.tlv.Tag.FILE_CONTROL_INFORMATION_FCI_PROPRIETARY_TEMPLATE.getTag());
        java.util.Iterator<T> it = filteredTlvs.iterator();
        while (true) {
            clearable = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.discover.mpos.sdk.core.emv.tlv.Tlv) obj).getTag(), com.discover.mpos.sdk.core.emv.tlv.Tag.DEDICATED_FILE_DF_NAME.getTag())) {
                break;
            }
        }
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv = (com.discover.mpos.sdk.core.emv.tlv.Tlv) obj;
        if (tlv == null) {
            tlv = new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.DEDICATED_FILE_DF_NAME.getTag(), null, 0, 0, 14, null);
        }
        java.util.Iterator<T> it2 = filteredTlvs.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.discover.mpos.sdk.core.emv.tlv.Tlv) obj2).getTag(), com.discover.mpos.sdk.core.emv.tlv.Tag.FILE_CONTROL_INFORMATION_FCI_PROPRIETARY_TEMPLATE.getTag())) {
                break;
            }
        }
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv2 = (com.discover.mpos.sdk.core.emv.tlv.Tlv) obj2;
        if (tlv2 != null && (content = tlv2.getContent()) != null) {
            clearable = (com.discover.mpos.sdk.core.emv.Clearable) b(content);
        }
        return new com.discover.mpos.sdk.card.apdu.emv.FciTemplate<>(tlv, clearable);
    }
}
