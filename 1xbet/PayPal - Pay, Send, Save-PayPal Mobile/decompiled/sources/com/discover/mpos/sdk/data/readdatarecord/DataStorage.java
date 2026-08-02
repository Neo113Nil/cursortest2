package com.discover.mpos.sdk.data.readdatarecord;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/discover/mpos/sdk/data/readdatarecord/DataStorage;", "", "dataStorageUpdatedTemplate", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "commitControlSettings", "", "updatedPdol", "Lcom/discover/mpos/sdk/data/external/readdatarecord/PdolUpdate;", "(Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;BLcom/discover/mpos/sdk/data/external/readdatarecord/PdolUpdate;)V", "getCommitControlSettings", "()B", "getDataStorageUpdatedTemplate", "()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getUpdatedPdol", "()Lcom/discover/mpos/sdk/data/external/readdatarecord/PdolUpdate;", "isDataStorageRequired", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class DataStorage {

    /* renamed from: a, reason: collision with root package name */
    public final com.discover.mpos.sdk.core.emv.tlv.Tlv f3218a;
    public final byte b;
    public final com.discover.mpos.sdk.data.external.readdatarecord.PdolUpdate c;

    public DataStorage(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv, byte b, com.discover.mpos.sdk.data.external.readdatarecord.PdolUpdate pdolUpdate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlv, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pdolUpdate, "");
        this.f3218a = tlv;
        this.b = b;
        this.c = pdolUpdate;
    }
}
