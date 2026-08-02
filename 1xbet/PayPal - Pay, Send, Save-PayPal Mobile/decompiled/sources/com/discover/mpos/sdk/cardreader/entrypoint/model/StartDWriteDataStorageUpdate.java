package com.discover.mpos.sdk.cardreader.entrypoint.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/model/StartDWriteDataStorageUpdate;", "", "Lcom/discover/mpos/sdk/cardreader/entrypoint/model/WriteDataStorageUpdate;", "writeDataStorageUpdate", "", "selectApplicationResponse", "unpredictableNumber", "<init>", "(Lcom/discover/mpos/sdk/cardreader/entrypoint/model/WriteDataStorageUpdate;[B[B)V", "[B", "getSelectApplicationResponse", "()[B", "getUnpredictableNumber", "Lcom/discover/mpos/sdk/cardreader/entrypoint/model/WriteDataStorageUpdate;", "getWriteDataStorageUpdate", "()Lcom/discover/mpos/sdk/cardreader/entrypoint/model/WriteDataStorageUpdate;"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class StartDWriteDataStorageUpdate {
    private final byte[] selectApplicationResponse;
    private final byte[] unpredictableNumber;
    private final com.discover.mpos.sdk.cardreader.entrypoint.model.WriteDataStorageUpdate writeDataStorageUpdate;

    public StartDWriteDataStorageUpdate(com.discover.mpos.sdk.cardreader.entrypoint.model.WriteDataStorageUpdate writeDataStorageUpdate, byte[] bArr, byte[] bArr2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeDataStorageUpdate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr2, "");
        this.writeDataStorageUpdate = writeDataStorageUpdate;
        this.selectApplicationResponse = bArr;
        this.unpredictableNumber = bArr2;
    }

    public final com.discover.mpos.sdk.cardreader.entrypoint.model.WriteDataStorageUpdate getWriteDataStorageUpdate() {
        return this.writeDataStorageUpdate;
    }

    public final byte[] getSelectApplicationResponse() {
        return this.selectApplicationResponse;
    }

    public final byte[] getUnpredictableNumber() {
        return this.unpredictableNumber;
    }
}
