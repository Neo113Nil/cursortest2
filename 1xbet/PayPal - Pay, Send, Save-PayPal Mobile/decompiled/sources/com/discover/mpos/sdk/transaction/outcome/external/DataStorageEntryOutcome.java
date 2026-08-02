package com.discover.mpos.sdk.transaction.outcome.external;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discover/mpos/sdk/transaction/outcome/external/DataStorageEntryOutcome;", "Lcom/discover/mpos/sdk/core/emv/Clearable;", "internalDataStorageDirectoryEntry", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/model/DataStorageDirectoryEntry;", "(Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/model/DataStorageDirectoryEntry;)V", "containerId", "", "containerType", "", "content", "integrityCode", "recordNumber", "writeCounter", "clear", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class DataStorageEntryOutcome implements com.discover.mpos.sdk.core.emv.Clearable {
    private final byte[] containerId;
    private final byte containerType;
    private final byte[] content;
    private final byte[] integrityCode;
    private final byte recordNumber;
    private final byte[] writeCounter;

    public DataStorageEntryOutcome(com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry dataStorageDirectoryEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataStorageDirectoryEntry, "");
        byte[] bArr = dataStorageDirectoryEntry.f;
        this.content = java.util.Arrays.copyOf(bArr, bArr.length);
        byte[] a2 = dataStorageDirectoryEntry.a();
        this.containerId = java.util.Arrays.copyOf(a2, a2.length);
        this.recordNumber = dataStorageDirectoryEntry.b();
        this.containerType = ((java.lang.Number) dataStorageDirectoryEntry.e.getValue()).byteValue();
        byte[] c = dataStorageDirectoryEntry.c();
        this.writeCounter = java.util.Arrays.copyOf(c, c.length);
        byte[] d = dataStorageDirectoryEntry.d();
        this.integrityCode = java.util.Arrays.copyOf(d, d.length);
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear(this.content);
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear(this.containerId);
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear(this.writeCounter);
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear(this.integrityCode);
    }
}
