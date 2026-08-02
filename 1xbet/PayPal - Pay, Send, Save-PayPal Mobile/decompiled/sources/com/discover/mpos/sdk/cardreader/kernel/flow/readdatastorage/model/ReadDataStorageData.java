package com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/model/ReadDataStorageData;", "", "supportedContainerIds", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/model/SupportedContainerIds;", "pdolUpdate", "Lcom/discover/mpos/sdk/data/external/readdatarecord/PdolUpdate;", "(Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/model/SupportedContainerIds;Lcom/discover/mpos/sdk/data/external/readdatarecord/PdolUpdate;)V", "getPdolUpdate", "()Lcom/discover/mpos/sdk/data/external/readdatarecord/PdolUpdate;", "getSupportedContainerIds", "()Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/model/SupportedContainerIds;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.c.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class ReadDataStorageData {

    /* renamed from: a, reason: collision with root package name */
    public final com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.SupportedContainerIds f3198a;
    private final com.discover.mpos.sdk.data.external.readdatarecord.PdolUpdate b;

    public ReadDataStorageData(com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.SupportedContainerIds supportedContainerIds, com.discover.mpos.sdk.data.external.readdatarecord.PdolUpdate pdolUpdate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedContainerIds, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pdolUpdate, "");
        this.f3198a = supportedContainerIds;
        this.b = pdolUpdate;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReadDataStorageData(supportedContainerIds=");
        sb.append(this.f3198a);
        sb.append(", pdolUpdate=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.SupportedContainerIds supportedContainerIds = this.f3198a;
        int hashCode = supportedContainerIds != null ? supportedContainerIds.hashCode() : 0;
        com.discover.mpos.sdk.data.external.readdatarecord.PdolUpdate pdolUpdate = this.b;
        return (hashCode * 31) + (pdolUpdate != null ? pdolUpdate.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.ReadDataStorageData)) {
            return false;
        }
        com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.ReadDataStorageData readDataStorageData = (com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.ReadDataStorageData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f3198a, readDataStorageData.f3198a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, readDataStorageData.b);
    }
}
