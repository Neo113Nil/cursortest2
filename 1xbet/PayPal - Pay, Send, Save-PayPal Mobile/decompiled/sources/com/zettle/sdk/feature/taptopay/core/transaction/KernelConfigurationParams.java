package com.zettle.sdk.feature.taptopay.core.transaction;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012JN\u0010\u0015\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0010R\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b%\u0010\u0012R\u001a\u0010\n\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b&\u0010\u0012"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/KernelConfigurationParams;", "", "", "Lcom/zettle/sdk/feature/taptopay/core/models/CardScheme;", "", "terminalCVMLimit", "terminalDefaultCVMLimit", "", "terminalCountryCode", "transactionCurrencyCode", "transactionCurrencyExponent", "<init>", "(Ljava/util/Map;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/util/Map;", "component2", "()J", "component3", "()Ljava/lang/String;", "component4", "component5", "copy", "(Ljava/util/Map;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/core/transaction/KernelConfigurationParams;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/Map;", "getTerminalCVMLimit", "Ljava/lang/String;", "getTerminalCountryCode", "J", "getTerminalDefaultCVMLimit", "getTransactionCurrencyCode", "getTransactionCurrencyExponent"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class KernelConfigurationParams {
    private final java.util.Map<com.zettle.sdk.feature.taptopay.core.models.CardScheme, java.lang.Long> terminalCVMLimit;
    private final java.lang.String terminalCountryCode;
    private final long terminalDefaultCVMLimit;
    private final java.lang.String transactionCurrencyCode;
    private final java.lang.String transactionCurrencyExponent;

    public KernelConfigurationParams(java.util.Map<com.zettle.sdk.feature.taptopay.core.models.CardScheme, java.lang.Long> map, long j, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.terminalCVMLimit = map;
        this.terminalDefaultCVMLimit = j;
        this.terminalCountryCode = str;
        this.transactionCurrencyCode = str2;
        this.transactionCurrencyExponent = str3;
    }

    public final java.util.Map<com.zettle.sdk.feature.taptopay.core.models.CardScheme, java.lang.Long> getTerminalCVMLimit() {
        return this.terminalCVMLimit;
    }

    public final long getTerminalDefaultCVMLimit() {
        return this.terminalDefaultCVMLimit;
    }

    public final java.lang.String getTerminalCountryCode() {
        return this.terminalCountryCode;
    }

    public final java.lang.String getTransactionCurrencyCode() {
        return this.transactionCurrencyCode;
    }

    public final java.lang.String getTransactionCurrencyExponent() {
        return this.transactionCurrencyExponent;
    }

    public final java.lang.String toString() {
        java.util.Map<com.zettle.sdk.feature.taptopay.core.models.CardScheme, java.lang.Long> map = this.terminalCVMLimit;
        long j = this.terminalDefaultCVMLimit;
        java.lang.String str = this.terminalCountryCode;
        java.lang.String str2 = this.transactionCurrencyCode;
        java.lang.String str3 = this.transactionCurrencyExponent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("KernelConfigurationParams(terminalCVMLimit=");
        sb.append(map);
        sb.append(", terminalDefaultCVMLimit=");
        sb.append(j);
        sb.append(", terminalCountryCode=");
        sb.append(str);
        sb.append(", transactionCurrencyCode=");
        sb.append(str2);
        sb.append(", transactionCurrencyExponent=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.terminalCVMLimit.hashCode() * 31) + java.lang.Long.hashCode(this.terminalDefaultCVMLimit)) * 31) + this.terminalCountryCode.hashCode()) * 31) + this.transactionCurrencyCode.hashCode()) * 31) + this.transactionCurrencyExponent.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.feature.taptopay.core.transaction.KernelConfigurationParams)) {
            return false;
        }
        com.zettle.sdk.feature.taptopay.core.transaction.KernelConfigurationParams kernelConfigurationParams = (com.zettle.sdk.feature.taptopay.core.transaction.KernelConfigurationParams) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.terminalCVMLimit, kernelConfigurationParams.terminalCVMLimit) && this.terminalDefaultCVMLimit == kernelConfigurationParams.terminalDefaultCVMLimit && kotlin.jvm.internal.Intrinsics.areEqual(this.terminalCountryCode, kernelConfigurationParams.terminalCountryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionCurrencyCode, kernelConfigurationParams.transactionCurrencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionCurrencyExponent, kernelConfigurationParams.transactionCurrencyExponent);
    }

    public final com.zettle.sdk.feature.taptopay.core.transaction.KernelConfigurationParams copy(java.util.Map<com.zettle.sdk.feature.taptopay.core.models.CardScheme, java.lang.Long> terminalCVMLimit, long terminalDefaultCVMLimit, java.lang.String terminalCountryCode, java.lang.String transactionCurrencyCode, java.lang.String transactionCurrencyExponent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(terminalCVMLimit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(terminalCountryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionCurrencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionCurrencyExponent, "");
        return new com.zettle.sdk.feature.taptopay.core.transaction.KernelConfigurationParams(terminalCVMLimit, terminalDefaultCVMLimit, terminalCountryCode, transactionCurrencyCode, transactionCurrencyExponent);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getTransactionCurrencyExponent() {
        return this.transactionCurrencyExponent;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getTransactionCurrencyCode() {
        return this.transactionCurrencyCode;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTerminalCountryCode() {
        return this.terminalCountryCode;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTerminalDefaultCVMLimit() {
        return this.terminalDefaultCVMLimit;
    }

    public final java.util.Map<com.zettle.sdk.feature.taptopay.core.models.CardScheme, java.lang.Long> component1() {
        return this.terminalCVMLimit;
    }

    public static /* synthetic */ com.zettle.sdk.feature.taptopay.core.transaction.KernelConfigurationParams copy$default(com.zettle.sdk.feature.taptopay.core.transaction.KernelConfigurationParams kernelConfigurationParams, java.util.Map map, long j, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = kernelConfigurationParams.terminalCVMLimit;
        }
        if ((i & 2) != 0) {
            j = kernelConfigurationParams.terminalDefaultCVMLimit;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str = kernelConfigurationParams.terminalCountryCode;
        }
        java.lang.String str4 = str;
        if ((i & 8) != 0) {
            str2 = kernelConfigurationParams.transactionCurrencyCode;
        }
        java.lang.String str5 = str2;
        if ((i & 16) != 0) {
            str3 = kernelConfigurationParams.transactionCurrencyExponent;
        }
        return kernelConfigurationParams.copy(map, j2, str4, str5, str3);
    }
}
