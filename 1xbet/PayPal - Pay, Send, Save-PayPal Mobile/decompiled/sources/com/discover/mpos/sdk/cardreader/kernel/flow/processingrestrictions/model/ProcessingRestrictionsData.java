package com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003JG\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/processingrestrictions/model/ProcessingRestrictionsData;", "", "applicationUsageControl", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/processingrestrictions/model/ApplicationUsageControl;", "issuerCountryCode", "", "terminalCountryCode", "", "transactionType", "Lcom/discover/mpos/sdk/transaction/TransactionType;", "cardApplicationVersionNumber", "terminalApplicationVersionNumber", "(Lcom/discover/mpos/sdk/cardreader/kernel/flow/processingrestrictions/model/ApplicationUsageControl;[BLjava/lang/String;Lcom/discover/mpos/sdk/transaction/TransactionType;Ljava/lang/String;Ljava/lang/String;)V", "getApplicationUsageControl", "()Lcom/discover/mpos/sdk/cardreader/kernel/flow/processingrestrictions/model/ApplicationUsageControl;", "getCardApplicationVersionNumber", "()Ljava/lang/String;", "getIssuerCountryCode", "()[B", "getTerminalApplicationVersionNumber", "getTerminalCountryCode", "getTransactionType", "()Lcom/discover/mpos/sdk/transaction/TransactionType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.j.b.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class ProcessingRestrictionsData {

    /* renamed from: a, reason: collision with root package name */
    public final com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.model.ApplicationUsageControl f3165a;
    public final byte[] b;
    public final java.lang.String c;
    public final com.discover.mpos.sdk.transaction.TransactionType d;
    public final java.lang.String e;
    public final java.lang.String f;

    public ProcessingRestrictionsData(com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.model.ApplicationUsageControl applicationUsageControl, byte[] bArr, java.lang.String str, com.discover.mpos.sdk.transaction.TransactionType transactionType, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationUsageControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.f3165a = applicationUsageControl;
        this.b = bArr;
        this.c = str;
        this.d = transactionType;
        this.e = str2;
        this.f = str3;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProcessingRestrictionsData(applicationUsageControl=");
        sb.append(this.f3165a);
        sb.append(", issuerCountryCode=");
        sb.append(java.util.Arrays.toString(this.b));
        sb.append(", terminalCountryCode=");
        sb.append(this.c);
        sb.append(", transactionType=");
        sb.append(this.d);
        sb.append(", cardApplicationVersionNumber=");
        sb.append(this.e);
        sb.append(", terminalApplicationVersionNumber=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.model.ApplicationUsageControl applicationUsageControl = this.f3165a;
        int hashCode = applicationUsageControl != null ? applicationUsageControl.hashCode() : 0;
        byte[] bArr = this.b;
        int hashCode2 = bArr != null ? java.util.Arrays.hashCode(bArr) : 0;
        java.lang.String str = this.c;
        int hashCode3 = str != null ? str.hashCode() : 0;
        com.discover.mpos.sdk.transaction.TransactionType transactionType = this.d;
        int hashCode4 = transactionType != null ? transactionType.hashCode() : 0;
        java.lang.String str2 = this.e;
        int hashCode5 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.f;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.model.ProcessingRestrictionsData)) {
            return false;
        }
        com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.model.ProcessingRestrictionsData processingRestrictionsData = (com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.model.ProcessingRestrictionsData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f3165a, processingRestrictionsData.f3165a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, processingRestrictionsData.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, processingRestrictionsData.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, processingRestrictionsData.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, processingRestrictionsData.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, processingRestrictionsData.f);
    }
}
