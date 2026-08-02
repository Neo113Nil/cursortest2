package com.discover.mpos.sdk.data.external.readdatarecord;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005BE\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0004\u0010\u0013R\u0017\u0010\u000e\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000f\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$"}, d2 = {"Lcom/discover/mpos/sdk/data/external/readdatarecord/DataStorageRequest;", "", "Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;", "processingData", "<init>", "(Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;)V", "", "pdol", "Lcom/discover/mpos/sdk/data/external/readdatarecord/PdolUpdate;", "pdolUpdate", "", "resumeTransaction", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "cardFeatureVersionNumber", "cardFeatureDescriptor", "dataStorageDirectory", "", "Lcom/discover/mpos/sdk/data/external/readdatarecord/DataStorageContainer;", "dataContainersRecords", "([BLcom/discover/mpos/sdk/data/external/readdatarecord/PdolUpdate;ZLcom/discover/mpos/sdk/core/emv/tlv/Tlv;Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;Ljava/util/List;)V", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getCardFeatureDescriptor", "()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getCardFeatureVersionNumber", "Ljava/util/List;", "getDataContainersRecords", "()Ljava/util/List;", "getDataStorageDirectory", "[B", "getPdol", "()[B", "Lcom/discover/mpos/sdk/data/external/readdatarecord/PdolUpdate;", "getPdolUpdate", "()Lcom/discover/mpos/sdk/data/external/readdatarecord/PdolUpdate;", "Z", "getResumeTransaction", "()Z"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class DataStorageRequest {
    private final com.discover.mpos.sdk.core.emv.tlv.Tlv cardFeatureDescriptor;
    private final com.discover.mpos.sdk.core.emv.tlv.Tlv cardFeatureVersionNumber;
    private final java.util.List<com.discover.mpos.sdk.data.external.readdatarecord.DataStorageContainer> dataContainersRecords;
    private final com.discover.mpos.sdk.core.emv.tlv.Tlv dataStorageDirectory;
    private final byte[] pdol;
    private final com.discover.mpos.sdk.data.external.readdatarecord.PdolUpdate pdolUpdate;
    private final boolean resumeTransaction;

    public DataStorageRequest(byte[] bArr, com.discover.mpos.sdk.data.external.readdatarecord.PdolUpdate pdolUpdate, boolean z, com.discover.mpos.sdk.core.emv.tlv.Tlv tlv, com.discover.mpos.sdk.core.emv.tlv.Tlv tlv2, com.discover.mpos.sdk.core.emv.tlv.Tlv tlv3, java.util.List<com.discover.mpos.sdk.data.external.readdatarecord.DataStorageContainer> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pdolUpdate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlv, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlv2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlv3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.pdol = bArr;
        this.pdolUpdate = pdolUpdate;
        this.resumeTransaction = z;
        this.cardFeatureVersionNumber = tlv;
        this.cardFeatureDescriptor = tlv2;
        this.dataStorageDirectory = tlv3;
        this.dataContainersRecords = list;
    }

    public final byte[] getPdol() {
        return this.pdol;
    }

    public final com.discover.mpos.sdk.data.external.readdatarecord.PdolUpdate getPdolUpdate() {
        return this.pdolUpdate;
    }

    public final boolean getResumeTransaction() {
        return this.resumeTransaction;
    }

    public final com.discover.mpos.sdk.core.emv.tlv.Tlv getCardFeatureVersionNumber() {
        return this.cardFeatureVersionNumber;
    }

    public final com.discover.mpos.sdk.core.emv.tlv.Tlv getCardFeatureDescriptor() {
        return this.cardFeatureDescriptor;
    }

    public final com.discover.mpos.sdk.core.emv.tlv.Tlv getDataStorageDirectory() {
        return this.dataStorageDirectory;
    }

    public final java.util.List<com.discover.mpos.sdk.data.external.readdatarecord.DataStorageContainer> getDataContainersRecords() {
        return this.dataContainersRecords;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DataStorageRequest(com.discover.mpos.sdk.transaction.processing.ProcessingData processingData) {
        this(r3, r4, r5, r1, r14, r8, r2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processingData, "");
        byte[] f = processingData.f();
        com.discover.mpos.sdk.data.external.readdatarecord.PdolUpdate pdolUpdate = new com.discover.mpos.sdk.data.external.readdatarecord.PdolUpdate(processingData.e().a());
        boolean z = processingData.i;
        java.lang.String tag = com.discover.mpos.sdk.core.emv.tlv.Tag.CARD_FEATURE_VERSION_NUMBER.getTag();
        com.discover.mpos.sdk.core.emv.tlv.Tlv t = processingData.t();
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv = new com.discover.mpos.sdk.core.emv.tlv.Tlv(tag, t != null ? t.getContent() : null, 0, 0, 12, null);
        java.lang.String tag2 = com.discover.mpos.sdk.core.emv.tlv.Tag.CARD_FEATURE_DESCRIPTOR.getTag();
        com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor s = processingData.s();
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv2 = new com.discover.mpos.sdk.core.emv.tlv.Tlv(tag2, s != null ? s.getE() : null, 0, 0, 12, null);
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv3 = new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.DATA_STORAGE_DIRECTORY.getTag(), processingData.c().getE(), 0, 0, 12, null);
        java.util.List<com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.ContainerContent> a2 = processingData.a();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(a2, 10));
        java.util.Iterator<T> it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.discover.mpos.sdk.data.external.readdatarecord.DataStorageContainer((com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.ContainerContent) it.next()));
        }
    }
}
