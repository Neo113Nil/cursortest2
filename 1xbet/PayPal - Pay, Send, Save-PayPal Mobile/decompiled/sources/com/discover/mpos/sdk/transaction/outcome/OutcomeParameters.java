package com.discover.mpos.sdk.transaction.outcome;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b*\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b-\u0010,J\u0012\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b0\u00101J\u009e\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u00020\u00102\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b?\u0010/R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bA\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bC\u0010,R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bD\u0010,R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010E\u001a\u0004\bF\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010G\u001a\u0004\bH\u0010%R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010I\u001a\u0004\bJ\u00101R\u001a\u0010\u0014\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010K\u001a\u0004\bL\u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010M\u001a\u0004\bN\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010O\u001a\u0004\bP\u0010)R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010O\u001a\u0004\bQ\u0010)R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010R\u001a\u0004\bS\u0010#"}, d2 = {"Lcom/discover/mpos/sdk/transaction/outcome/OutcomeParameters;", "Lcom/discover/mpos/sdk/core/emv/Clearable;", "Lcom/discover/mpos/sdk/transaction/outcome/EntryPointStart;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "Lcom/discover/mpos/sdk/transaction/outcome/OnlineResponseData;", "onlineResponseData", "Lcom/discover/mpos/sdk/transaction/outcome/CardholderVerificationMethod;", "cardholderVerificationMethod", "Lcom/discover/mpos/sdk/transaction/outcome/UiRequest;", "uiRequestOnOutcome", "uiRequestOnRestart", "", "dataRecordPresent", "discretionaryData", "Lcom/discover/mpos/sdk/transaction/outcome/AlternateInterface;", "alternateInterfacePresence", "", "receipt", "", "filedOffRequest", "removalTimeout", "Lcom/discover/mpos/sdk/transaction/outcome/external/WriteDataStorageUpdateOutcome;", "writeDataStorageUpdate", "<init>", "(Lcom/discover/mpos/sdk/transaction/outcome/EntryPointStart;Lcom/discover/mpos/sdk/transaction/outcome/OnlineResponseData;Lcom/discover/mpos/sdk/transaction/outcome/CardholderVerificationMethod;Lcom/discover/mpos/sdk/transaction/outcome/UiRequest;Lcom/discover/mpos/sdk/transaction/outcome/UiRequest;[B[BLcom/discover/mpos/sdk/transaction/outcome/AlternateInterface;Ljava/lang/Boolean;Ljava/lang/Long;JLcom/discover/mpos/sdk/transaction/outcome/external/WriteDataStorageUpdateOutcome;)V", "", "clear", "()V", "component1", "()Lcom/discover/mpos/sdk/transaction/outcome/EntryPointStart;", "component10", "()Ljava/lang/Long;", "component11", "()J", "component12", "()Lcom/discover/mpos/sdk/transaction/outcome/external/WriteDataStorageUpdateOutcome;", "component2", "()Lcom/discover/mpos/sdk/transaction/outcome/OnlineResponseData;", "component3", "()Lcom/discover/mpos/sdk/transaction/outcome/CardholderVerificationMethod;", "component4", "()Lcom/discover/mpos/sdk/transaction/outcome/UiRequest;", "component5", "component6", "()[B", "component7", "component8", "()Lcom/discover/mpos/sdk/transaction/outcome/AlternateInterface;", "component9", "()Ljava/lang/Boolean;", "copy", "(Lcom/discover/mpos/sdk/transaction/outcome/EntryPointStart;Lcom/discover/mpos/sdk/transaction/outcome/OnlineResponseData;Lcom/discover/mpos/sdk/transaction/outcome/CardholderVerificationMethod;Lcom/discover/mpos/sdk/transaction/outcome/UiRequest;Lcom/discover/mpos/sdk/transaction/outcome/UiRequest;[B[BLcom/discover/mpos/sdk/transaction/outcome/AlternateInterface;Ljava/lang/Boolean;Ljava/lang/Long;JLcom/discover/mpos/sdk/transaction/outcome/external/WriteDataStorageUpdateOutcome;)Lcom/discover/mpos/sdk/transaction/outcome/OutcomeParameters;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/discover/mpos/sdk/transaction/outcome/AlternateInterface;", "getAlternateInterfacePresence", "Lcom/discover/mpos/sdk/transaction/outcome/CardholderVerificationMethod;", "getCardholderVerificationMethod", "[B", "getDataRecordPresent", "getDiscretionaryData", "Ljava/lang/Long;", "getFiledOffRequest", "Lcom/discover/mpos/sdk/transaction/outcome/OnlineResponseData;", "getOnlineResponseData", "Ljava/lang/Boolean;", "getReceipt", "J", "getRemovalTimeout", "Lcom/discover/mpos/sdk/transaction/outcome/EntryPointStart;", "getStart", "Lcom/discover/mpos/sdk/transaction/outcome/UiRequest;", "getUiRequestOnOutcome", "getUiRequestOnRestart", "Lcom/discover/mpos/sdk/transaction/outcome/external/WriteDataStorageUpdateOutcome;", "getWriteDataStorageUpdate"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final /* data */ class OutcomeParameters implements com.discover.mpos.sdk.core.emv.Clearable {
    private final com.discover.mpos.sdk.transaction.outcome.AlternateInterface alternateInterfacePresence;
    private final com.discover.mpos.sdk.transaction.outcome.CardholderVerificationMethod cardholderVerificationMethod;
    private final byte[] dataRecordPresent;
    private final byte[] discretionaryData;
    private final java.lang.Long filedOffRequest;
    private final com.discover.mpos.sdk.transaction.outcome.OnlineResponseData onlineResponseData;
    private final java.lang.Boolean receipt;
    private final long removalTimeout;
    private final com.discover.mpos.sdk.transaction.outcome.EntryPointStart start;
    private final com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequestOnOutcome;
    private final com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequestOnRestart;
    private final com.discover.mpos.sdk.transaction.outcome.external.WriteDataStorageUpdateOutcome writeDataStorageUpdate;

    public OutcomeParameters(com.discover.mpos.sdk.transaction.outcome.EntryPointStart entryPointStart, com.discover.mpos.sdk.transaction.outcome.OnlineResponseData onlineResponseData, com.discover.mpos.sdk.transaction.outcome.CardholderVerificationMethod cardholderVerificationMethod, com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequest, com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequest2, byte[] bArr, byte[] bArr2, com.discover.mpos.sdk.transaction.outcome.AlternateInterface alternateInterface, java.lang.Boolean bool, java.lang.Long l, long j, com.discover.mpos.sdk.transaction.outcome.external.WriteDataStorageUpdateOutcome writeDataStorageUpdateOutcome) {
        this.start = entryPointStart;
        this.onlineResponseData = onlineResponseData;
        this.cardholderVerificationMethod = cardholderVerificationMethod;
        this.uiRequestOnOutcome = uiRequest;
        this.uiRequestOnRestart = uiRequest2;
        this.dataRecordPresent = bArr;
        this.discretionaryData = bArr2;
        this.alternateInterfacePresence = alternateInterface;
        this.receipt = bool;
        this.filedOffRequest = l;
        this.removalTimeout = j;
        this.writeDataStorageUpdate = writeDataStorageUpdateOutcome;
    }

    public final com.discover.mpos.sdk.transaction.outcome.EntryPointStart getStart() {
        return this.start;
    }

    public final com.discover.mpos.sdk.transaction.outcome.OnlineResponseData getOnlineResponseData() {
        return this.onlineResponseData;
    }

    public final com.discover.mpos.sdk.transaction.outcome.CardholderVerificationMethod getCardholderVerificationMethod() {
        return this.cardholderVerificationMethod;
    }

    public final com.discover.mpos.sdk.transaction.outcome.UiRequest getUiRequestOnOutcome() {
        return this.uiRequestOnOutcome;
    }

    public final com.discover.mpos.sdk.transaction.outcome.UiRequest getUiRequestOnRestart() {
        return this.uiRequestOnRestart;
    }

    public final byte[] getDataRecordPresent() {
        return this.dataRecordPresent;
    }

    public final byte[] getDiscretionaryData() {
        return this.discretionaryData;
    }

    public final com.discover.mpos.sdk.transaction.outcome.AlternateInterface getAlternateInterfacePresence() {
        return this.alternateInterfacePresence;
    }

    public final java.lang.Boolean getReceipt() {
        return this.receipt;
    }

    public final java.lang.Long getFiledOffRequest() {
        return this.filedOffRequest;
    }

    public final long getRemovalTimeout() {
        return this.removalTimeout;
    }

    public /* synthetic */ OutcomeParameters(com.discover.mpos.sdk.transaction.outcome.EntryPointStart entryPointStart, com.discover.mpos.sdk.transaction.outcome.OnlineResponseData onlineResponseData, com.discover.mpos.sdk.transaction.outcome.CardholderVerificationMethod cardholderVerificationMethod, com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequest, com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequest2, byte[] bArr, byte[] bArr2, com.discover.mpos.sdk.transaction.outcome.AlternateInterface alternateInterface, java.lang.Boolean bool, java.lang.Long l, long j, com.discover.mpos.sdk.transaction.outcome.external.WriteDataStorageUpdateOutcome writeDataStorageUpdateOutcome, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : entryPointStart, (i & 2) != 0 ? null : onlineResponseData, (i & 4) != 0 ? null : cardholderVerificationMethod, (i & 8) != 0 ? null : uiRequest, (i & 16) != 0 ? null : uiRequest2, (i & 32) != 0 ? null : bArr, (i & 64) != 0 ? null : bArr2, (i & 128) != 0 ? null : alternateInterface, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : l, (i & 1024) != 0 ? 0L : j, (i & 2048) == 0 ? writeDataStorageUpdateOutcome : null);
    }

    public final com.discover.mpos.sdk.transaction.outcome.external.WriteDataStorageUpdateOutcome getWriteDataStorageUpdate() {
        return this.writeDataStorageUpdate;
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        byte[] bArr = this.dataRecordPresent;
        if (bArr != null) {
            com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear(bArr);
        }
    }

    public final java.lang.String toString() {
        return com.discover.mpos.sdk.core.extensions.StringExtensionsKt.toJSONString(this);
    }

    public final int hashCode() {
        com.discover.mpos.sdk.transaction.outcome.EntryPointStart entryPointStart = this.start;
        int hashCode = entryPointStart != null ? entryPointStart.hashCode() : 0;
        com.discover.mpos.sdk.transaction.outcome.OnlineResponseData onlineResponseData = this.onlineResponseData;
        int hashCode2 = onlineResponseData != null ? onlineResponseData.hashCode() : 0;
        com.discover.mpos.sdk.transaction.outcome.CardholderVerificationMethod cardholderVerificationMethod = this.cardholderVerificationMethod;
        int hashCode3 = cardholderVerificationMethod != null ? cardholderVerificationMethod.hashCode() : 0;
        com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequest = this.uiRequestOnOutcome;
        int hashCode4 = uiRequest != null ? uiRequest.hashCode() : 0;
        com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequest2 = this.uiRequestOnRestart;
        int hashCode5 = uiRequest2 != null ? uiRequest2.hashCode() : 0;
        byte[] bArr = this.dataRecordPresent;
        int hashCode6 = bArr != null ? java.util.Arrays.hashCode(bArr) : 0;
        byte[] bArr2 = this.discretionaryData;
        int hashCode7 = bArr2 != null ? java.util.Arrays.hashCode(bArr2) : 0;
        com.discover.mpos.sdk.transaction.outcome.AlternateInterface alternateInterface = this.alternateInterfacePresence;
        int hashCode8 = alternateInterface != null ? alternateInterface.hashCode() : 0;
        java.lang.Boolean bool = this.receipt;
        int hashCode9 = bool != null ? bool.hashCode() : 0;
        java.lang.Long l = this.filedOffRequest;
        int hashCode10 = l != null ? l.hashCode() : 0;
        int hashCode11 = java.lang.Long.hashCode(this.removalTimeout);
        com.discover.mpos.sdk.transaction.outcome.external.WriteDataStorageUpdateOutcome writeDataStorageUpdateOutcome = this.writeDataStorageUpdate;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (writeDataStorageUpdateOutcome != null ? writeDataStorageUpdateOutcome.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.transaction.outcome.OutcomeParameters)) {
            return false;
        }
        com.discover.mpos.sdk.transaction.outcome.OutcomeParameters outcomeParameters = (com.discover.mpos.sdk.transaction.outcome.OutcomeParameters) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.start, outcomeParameters.start) && kotlin.jvm.internal.Intrinsics.areEqual(this.onlineResponseData, outcomeParameters.onlineResponseData) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardholderVerificationMethod, outcomeParameters.cardholderVerificationMethod) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiRequestOnOutcome, outcomeParameters.uiRequestOnOutcome) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiRequestOnRestart, outcomeParameters.uiRequestOnRestart) && kotlin.jvm.internal.Intrinsics.areEqual(this.dataRecordPresent, outcomeParameters.dataRecordPresent) && kotlin.jvm.internal.Intrinsics.areEqual(this.discretionaryData, outcomeParameters.discretionaryData) && kotlin.jvm.internal.Intrinsics.areEqual(this.alternateInterfacePresence, outcomeParameters.alternateInterfacePresence) && kotlin.jvm.internal.Intrinsics.areEqual(this.receipt, outcomeParameters.receipt) && kotlin.jvm.internal.Intrinsics.areEqual(this.filedOffRequest, outcomeParameters.filedOffRequest) && this.removalTimeout == outcomeParameters.removalTimeout && kotlin.jvm.internal.Intrinsics.areEqual(this.writeDataStorageUpdate, outcomeParameters.writeDataStorageUpdate);
    }

    public final com.discover.mpos.sdk.transaction.outcome.OutcomeParameters copy(com.discover.mpos.sdk.transaction.outcome.EntryPointStart start, com.discover.mpos.sdk.transaction.outcome.OnlineResponseData onlineResponseData, com.discover.mpos.sdk.transaction.outcome.CardholderVerificationMethod cardholderVerificationMethod, com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequestOnOutcome, com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequestOnRestart, byte[] dataRecordPresent, byte[] discretionaryData, com.discover.mpos.sdk.transaction.outcome.AlternateInterface alternateInterfacePresence, java.lang.Boolean receipt, java.lang.Long filedOffRequest, long removalTimeout, com.discover.mpos.sdk.transaction.outcome.external.WriteDataStorageUpdateOutcome writeDataStorageUpdate) {
        return new com.discover.mpos.sdk.transaction.outcome.OutcomeParameters(start, onlineResponseData, cardholderVerificationMethod, uiRequestOnOutcome, uiRequestOnRestart, dataRecordPresent, discretionaryData, alternateInterfacePresence, receipt, filedOffRequest, removalTimeout, writeDataStorageUpdate);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.Boolean getReceipt() {
        return this.receipt;
    }

    /* renamed from: component8, reason: from getter */
    public final com.discover.mpos.sdk.transaction.outcome.AlternateInterface getAlternateInterfacePresence() {
        return this.alternateInterfacePresence;
    }

    /* renamed from: component7, reason: from getter */
    public final byte[] getDiscretionaryData() {
        return this.discretionaryData;
    }

    /* renamed from: component6, reason: from getter */
    public final byte[] getDataRecordPresent() {
        return this.dataRecordPresent;
    }

    /* renamed from: component5, reason: from getter */
    public final com.discover.mpos.sdk.transaction.outcome.UiRequest getUiRequestOnRestart() {
        return this.uiRequestOnRestart;
    }

    /* renamed from: component4, reason: from getter */
    public final com.discover.mpos.sdk.transaction.outcome.UiRequest getUiRequestOnOutcome() {
        return this.uiRequestOnOutcome;
    }

    /* renamed from: component3, reason: from getter */
    public final com.discover.mpos.sdk.transaction.outcome.CardholderVerificationMethod getCardholderVerificationMethod() {
        return this.cardholderVerificationMethod;
    }

    /* renamed from: component2, reason: from getter */
    public final com.discover.mpos.sdk.transaction.outcome.OnlineResponseData getOnlineResponseData() {
        return this.onlineResponseData;
    }

    /* renamed from: component12, reason: from getter */
    public final com.discover.mpos.sdk.transaction.outcome.external.WriteDataStorageUpdateOutcome getWriteDataStorageUpdate() {
        return this.writeDataStorageUpdate;
    }

    /* renamed from: component11, reason: from getter */
    public final long getRemovalTimeout() {
        return this.removalTimeout;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.Long getFiledOffRequest() {
        return this.filedOffRequest;
    }

    /* renamed from: component1, reason: from getter */
    public final com.discover.mpos.sdk.transaction.outcome.EntryPointStart getStart() {
        return this.start;
    }

    public OutcomeParameters() {
        this(null, null, null, null, null, null, null, null, null, null, 0L, null, my.com.softspace.ssfasstapsdk.SSFasstapSDK.CardScheme.ALL, null);
    }
}
