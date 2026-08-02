package com.discover.mpos.sdk.card.apdu.processors.selectppse;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u001e\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J(\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u001a2\b\b\u0002\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0012H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/processors/selectppse/IssuerDataProcessorPpse;", "Lcom/discover/mpos/sdk/card/apdu/processors/BaseApduContentProcessor;", "Lcom/discover/mpos/sdk/card/apdu/emv/FciIssuerDataPpse;", "", "()V", "dataChunkIndexModifier", "", "defaultAppPriority", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "defaultPriorityValue", "", "directoryEntry", "Lcom/discover/mpos/sdk/card/apdu/emv/DirectoryEntry;", "tlv", "", "order", "indexOfNextDataChunk", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "isMoreAppDataAvailable", "", "currentDataSize", "appInfoDataSize", "parseDirectoryEntry", "content", "entries", "", "processContent", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.d.f.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class IssuerDataProcessorPpse extends com.discover.mpos.sdk.card.apdu.processors.BaseApduContentProcessor<com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataPpse, kotlin.Unit> {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f2953a = "0F";
    private final int b = 1;
    private final com.discover.mpos.sdk.core.emv.tlv.Tlv c = new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_PRIORITY_INDICATOR.getTag(), com.discover.mpos.sdk.core.extensions.HexExtensionsKt.hexToByteArray("0F"), 0, 0, 12, null);

    @Override // com.discover.mpos.sdk.card.apdu.processors.ApduContentProcessor
    public final /* synthetic */ java.lang.Object a(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        a(bArr, arrayList, 0);
        return new com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataPpse(arrayList);
    }

    private final void a(byte[] bArr, java.util.List<com.discover.mpos.sdk.card.apdu.emv.DirectoryEntry> list, int i) {
        while (true) {
            byte[] dataRegion = com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.dataRegion(bArr, com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_TEMPLATE.getTag());
            if (dataRegion == null) {
                return;
            }
            java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> filteredTlvs = com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.getFilteredTlvs(dataRegion, com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_DEDICATED_FILE_ADF_NAME.getTag(), com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_LABEL.getTag(), com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_PRIORITY_INDICATOR.getTag(), com.discover.mpos.sdk.core.emv.tlv.Tag.KERNEL_ID.getTag(), com.discover.mpos.sdk.core.emv.tlv.Tag.EXTENDED_SELECTION.getTag());
            com.discover.mpos.sdk.core.emv.tlv.Tlv a2 = a(filteredTlvs, com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_DEDICATED_FILE_ADF_NAME.getTag());
            com.discover.mpos.sdk.core.emv.tlv.Tlv a3 = a(filteredTlvs, com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_LABEL.getTag());
            com.discover.mpos.sdk.core.emv.tlv.Tlv a4 = a(filteredTlvs, com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_PRIORITY_INDICATOR.getTag());
            if (a4.getContent() == null) {
                a4 = this.c;
            }
            list.add(new com.discover.mpos.sdk.card.apdu.emv.DirectoryEntry(a2, new com.discover.mpos.sdk.card.apdu.emv.CardApplication(a3, a4), a(filteredTlvs, com.discover.mpos.sdk.core.emv.tlv.Tag.KERNEL_ID.getTag()), a(filteredTlvs, com.discover.mpos.sdk.core.emv.tlv.Tag.EXTENDED_SELECTION.getTag()), i));
            if (bArr.length % dataRegion.length <= 0) {
                return;
            }
            bArr = kotlin.collections.ArraysKt.copyOfRange(bArr, dataRegion.length + this.b, bArr.length);
            i++;
        }
    }
}
