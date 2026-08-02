package com.discover.mpos.sdk.transaction.outcome.external;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discover/mpos/sdk/transaction/outcome/external/DataStorageDirectoryOutcome;", "Lcom/discover/mpos/sdk/core/emv/ClearableEmvData;", "internalDataStorageDirectory", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/model/DataStorageDirectory;", "(Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/model/DataStorageDirectory;)V", "containerIds", "", "", "content", "contentHash", "directoryEntries", "Lcom/discover/mpos/sdk/transaction/outcome/external/DataStorageEntryOutcome;", "unpredictableNumber", "clear", "", "toByteArray", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class DataStorageDirectoryOutcome implements com.discover.mpos.sdk.core.emv.ClearableEmvData {
    private final java.util.List<byte[]> containerIds;
    private final byte[] content;
    private final byte[] contentHash;
    private final java.util.List<com.discover.mpos.sdk.transaction.outcome.external.DataStorageEntryOutcome> directoryEntries;
    private final byte[] unpredictableNumber;

    public DataStorageDirectoryOutcome(com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory dataStorageDirectory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataStorageDirectory, "");
        this.content = dataStorageDirectory.d();
        byte[] bArr = dataStorageDirectory.d;
        this.contentHash = java.util.Arrays.copyOf(bArr, bArr.length);
        byte[] a2 = dataStorageDirectory.a();
        this.unpredictableNumber = java.util.Arrays.copyOf(a2, a2.length);
        java.util.List<com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry> b = dataStorageDirectory.b();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(b, 10));
        java.util.Iterator<T> it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.discover.mpos.sdk.transaction.outcome.external.DataStorageEntryOutcome((com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry) it.next()));
        }
        this.directoryEntries = arrayList;
        this.containerIds = kotlin.collections.CollectionsKt.toList(dataStorageDirectory.c());
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    public final java.lang.String toHexString() {
        return com.discover.mpos.sdk.core.emv.ClearableEmvData.DefaultImpls.toHexString(this);
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear(this.content);
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear(this.contentHash);
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear(this.unpredictableNumber);
        java.util.Iterator<T> it = this.directoryEntries.iterator();
        while (it.hasNext()) {
            ((com.discover.mpos.sdk.transaction.outcome.external.DataStorageEntryOutcome) it.next()).clear();
        }
        java.util.Iterator<T> it2 = this.containerIds.iterator();
        while (it2.hasNext()) {
            com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear((byte[]) it2.next());
        }
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    /* renamed from: toByteArray */
    public final byte[] getE() {
        byte[] bArr = this.content;
        return java.util.Arrays.copyOf(bArr, bArr.length);
    }
}
