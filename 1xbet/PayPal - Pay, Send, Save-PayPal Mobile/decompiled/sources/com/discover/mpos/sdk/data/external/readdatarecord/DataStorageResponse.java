package com.discover.mpos.sdk.data.external.readdatarecord;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/discover/mpos/sdk/data/external/readdatarecord/DataStorageResponse;", "", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "dataStorageUpdatedTemplate", "", "commitControlSettings", "Lcom/discover/mpos/sdk/data/external/readdatarecord/PdolUpdate;", "pdolUpdate", "<init>", "(Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;BLcom/discover/mpos/sdk/data/external/readdatarecord/PdolUpdate;)V", "", "debugTag$mpos_sdk_card_reader_offlineRegularRelease", "()Ljava/lang/String;", "", "isValid$mpos_sdk_card_reader_offlineRegularRelease", "()Z", "Lcom/discover/mpos/sdk/data/readdatarecord/DataStorage;", "toDataStorage$mpos_sdk_card_reader_offlineRegularRelease", "()Lcom/discover/mpos/sdk/data/readdatarecord/DataStorage;", "B", "getCommitControlSettings$mpos_sdk_card_reader_offlineRegularRelease", "()B", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getDataStorageUpdatedTemplate$mpos_sdk_card_reader_offlineRegularRelease", "()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "isDataValid", "Ljava/lang/Boolean;", "Lcom/discover/mpos/sdk/data/external/readdatarecord/PdolUpdate;", "getPdolUpdate$mpos_sdk_card_reader_offlineRegularRelease", "()Lcom/discover/mpos/sdk/data/external/readdatarecord/PdolUpdate;", "", "validLength", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class DataStorageResponse {
    private final byte commitControlSettings;
    private final com.discover.mpos.sdk.core.emv.tlv.Tlv dataStorageUpdatedTemplate;
    private java.lang.Boolean isDataValid;
    private final com.discover.mpos.sdk.data.external.readdatarecord.PdolUpdate pdolUpdate;
    private final int validLength;

    public DataStorageResponse(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv, byte b, com.discover.mpos.sdk.data.external.readdatarecord.PdolUpdate pdolUpdate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlv, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pdolUpdate, "");
        this.dataStorageUpdatedTemplate = tlv;
        this.commitControlSettings = b;
        this.pdolUpdate = pdolUpdate;
        this.validLength = 256;
    }

    /* renamed from: getDataStorageUpdatedTemplate$mpos_sdk_card_reader_offlineRegularRelease, reason: from getter */
    public final com.discover.mpos.sdk.core.emv.tlv.Tlv getDataStorageUpdatedTemplate() {
        return this.dataStorageUpdatedTemplate;
    }

    /* renamed from: getCommitControlSettings$mpos_sdk_card_reader_offlineRegularRelease, reason: from getter */
    public final byte getCommitControlSettings() {
        return this.commitControlSettings;
    }

    /* renamed from: getPdolUpdate$mpos_sdk_card_reader_offlineRegularRelease, reason: from getter */
    public final com.discover.mpos.sdk.data.external.readdatarecord.PdolUpdate getPdolUpdate() {
        return this.pdolUpdate;
    }

    public final boolean isValid$mpos_sdk_card_reader_offlineRegularRelease() {
        boolean z = this.dataStorageUpdatedTemplate.tlvLength() + this.pdolUpdate.getK().length < this.validLength;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
        this.isDataValid = valueOf;
        new java.lang.Object[]{valueOf};
        debugTag$mpos_sdk_card_reader_offlineRegularRelease();
        return z;
    }

    public final com.discover.mpos.sdk.data.readdatarecord.DataStorage toDataStorage$mpos_sdk_card_reader_offlineRegularRelease() {
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv;
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.isDataValid, java.lang.Boolean.TRUE)) {
            tlv = this.dataStorageUpdatedTemplate;
        } else {
            debugTag$mpos_sdk_card_reader_offlineRegularRelease();
            tlv = new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.DATA_STORAGE_UPDATED_TEMPLATE.getTag(), null, 0, 0, 14, null);
        }
        return new com.discover.mpos.sdk.data.readdatarecord.DataStorage(tlv, this.commitControlSettings, this.pdolUpdate);
    }

    public final java.lang.String debugTag$mpos_sdk_card_reader_offlineRegularRelease() {
        return "DataStorageResponse";
    }
}
