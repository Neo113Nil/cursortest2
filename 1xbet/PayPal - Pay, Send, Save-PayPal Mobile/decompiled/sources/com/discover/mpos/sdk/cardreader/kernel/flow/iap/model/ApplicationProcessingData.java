package com.discover.mpos.sdk.cardreader.kernel.flow.iap.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003J\t\u0010+\u001a\u00020\u0011HÆ\u0003Jc\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u0010-\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\b\u00101\u001a\u00020\bH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00062"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/model/ApplicationProcessingData;", "", "ttqs", "Lcom/discover/mpos/sdk/cardreader/config/TerminalTransactionQualifiers;", "amountAuthorized", "Lcom/discover/mpos/sdk/core/data/Amount;", "amountOther", "terminalCountryCode", "", "transactionCurrencyCode", "Ljava/util/Currency;", "transactionDate", "transactionType", "Lcom/discover/mpos/sdk/transaction/TransactionType;", "unpredictableNumber", "", "pidLimitReached", "", "(Lcom/discover/mpos/sdk/cardreader/config/TerminalTransactionQualifiers;Lcom/discover/mpos/sdk/core/data/Amount;Lcom/discover/mpos/sdk/core/data/Amount;Ljava/lang/String;Ljava/util/Currency;Ljava/lang/String;Lcom/discover/mpos/sdk/transaction/TransactionType;[BZ)V", "getAmountAuthorized", "()Lcom/discover/mpos/sdk/core/data/Amount;", "getAmountOther", "getPidLimitReached", "()Z", "getTerminalCountryCode", "()Ljava/lang/String;", "getTransactionCurrencyCode", "()Ljava/util/Currency;", "getTransactionDate", "getTransactionType", "()Lcom/discover/mpos/sdk/transaction/TransactionType;", "getTtqs", "()Lcom/discover/mpos/sdk/cardreader/config/TerminalTransactionQualifiers;", "getUnpredictableNumber", "()[B", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.c.b.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class ApplicationProcessingData {

    /* renamed from: a, reason: collision with root package name */
    public final com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers f3044a;
    public final boolean b;
    private final com.discover.mpos.sdk.core.data.Amount c;
    private final com.discover.mpos.sdk.core.data.Amount d;
    private final java.lang.String e;
    private final java.util.Currency f;
    private final java.lang.String g;
    private final com.discover.mpos.sdk.transaction.TransactionType h;
    private final byte[] i;

    public ApplicationProcessingData(com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers terminalTransactionQualifiers, com.discover.mpos.sdk.core.data.Amount amount, com.discover.mpos.sdk.core.data.Amount amount2, java.lang.String str, java.util.Currency currency, java.lang.String str2, com.discover.mpos.sdk.transaction.TransactionType transactionType, byte[] bArr, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(terminalTransactionQualifiers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.f3044a = terminalTransactionQualifiers;
        this.c = amount;
        this.d = amount2;
        this.e = str;
        this.f = currency;
        this.g = str2;
        this.h = transactionType;
        this.i = bArr;
        this.b = z;
    }

    public final java.lang.String toString() {
        return com.discover.mpos.sdk.core.extensions.StringExtensionsKt.toJSONString(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers terminalTransactionQualifiers = this.f3044a;
        int hashCode = terminalTransactionQualifiers != null ? terminalTransactionQualifiers.hashCode() : 0;
        com.discover.mpos.sdk.core.data.Amount amount = this.c;
        int hashCode2 = amount != null ? amount.hashCode() : 0;
        com.discover.mpos.sdk.core.data.Amount amount2 = this.d;
        int hashCode3 = amount2 != null ? amount2.hashCode() : 0;
        java.lang.String str = this.e;
        int hashCode4 = str != null ? str.hashCode() : 0;
        java.util.Currency currency = this.f;
        int hashCode5 = currency != null ? currency.hashCode() : 0;
        java.lang.String str2 = this.g;
        int hashCode6 = str2 != null ? str2.hashCode() : 0;
        com.discover.mpos.sdk.transaction.TransactionType transactionType = this.h;
        int hashCode7 = transactionType != null ? transactionType.hashCode() : 0;
        byte[] bArr = this.i;
        int hashCode8 = bArr != null ? java.util.Arrays.hashCode(bArr) : 0;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.cardreader.kernel.flow.iap.model.ApplicationProcessingData)) {
            return false;
        }
        com.discover.mpos.sdk.cardreader.kernel.flow.iap.model.ApplicationProcessingData applicationProcessingData = (com.discover.mpos.sdk.cardreader.kernel.flow.iap.model.ApplicationProcessingData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f3044a, applicationProcessingData.f3044a) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, applicationProcessingData.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, applicationProcessingData.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, applicationProcessingData.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, applicationProcessingData.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, applicationProcessingData.g) && kotlin.jvm.internal.Intrinsics.areEqual(this.h, applicationProcessingData.h) && kotlin.jvm.internal.Intrinsics.areEqual(this.i, applicationProcessingData.i) && this.b == applicationProcessingData.b;
    }
}
