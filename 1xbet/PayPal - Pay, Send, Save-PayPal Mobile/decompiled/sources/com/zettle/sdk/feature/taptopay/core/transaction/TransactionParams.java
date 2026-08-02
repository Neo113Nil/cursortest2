package com.zettle.sdk.feature.taptopay.core.transaction;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014JB\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\n\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b\n\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\t\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0012"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionParams;", "", "", "amount", "Lcom/zettle/sdk/feature/taptopay/core/transaction/KernelConfigurationParams;", "kernelConfig", "", "waitForUserInputTimeout", "", "isDebitOptIn", "isBerTlvMode", "<init>", "(Ljava/lang/String;Lcom/zettle/sdk/feature/taptopay/core/transaction/KernelConfigurationParams;IZZ)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/KernelConfigurationParams;", "component3", "()I", "component4", "()Z", "component5", "copy", "(Ljava/lang/String;Lcom/zettle/sdk/feature/taptopay/core/transaction/KernelConfigurationParams;IZZ)Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionParams;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getAmount", "Z", "Lcom/zettle/sdk/feature/taptopay/core/transaction/KernelConfigurationParams;", "getKernelConfig", com.visa.cbp.getEncExpo.warmup, "getWaitForUserInputTimeout"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class TransactionParams {
    private final java.lang.String amount;
    private final boolean isBerTlvMode;
    private final boolean isDebitOptIn;
    private final com.zettle.sdk.feature.taptopay.core.transaction.KernelConfigurationParams kernelConfig;
    private final int waitForUserInputTimeout;

    public TransactionParams(java.lang.String str, com.zettle.sdk.feature.taptopay.core.transaction.KernelConfigurationParams kernelConfigurationParams, int i, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kernelConfigurationParams, "");
        this.amount = str;
        this.kernelConfig = kernelConfigurationParams;
        this.waitForUserInputTimeout = i;
        this.isDebitOptIn = z;
        this.isBerTlvMode = z2;
    }

    public /* synthetic */ TransactionParams(java.lang.String str, com.zettle.sdk.feature.taptopay.core.transaction.KernelConfigurationParams kernelConfigurationParams, int i, boolean z, boolean z2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, kernelConfigurationParams, i, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? false : z2);
    }

    public final java.lang.String getAmount() {
        return this.amount;
    }

    public final com.zettle.sdk.feature.taptopay.core.transaction.KernelConfigurationParams getKernelConfig() {
        return this.kernelConfig;
    }

    public final int getWaitForUserInputTimeout() {
        return this.waitForUserInputTimeout;
    }

    public final boolean isDebitOptIn() {
        return this.isDebitOptIn;
    }

    public final boolean isBerTlvMode() {
        return this.isBerTlvMode;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.amount;
        com.zettle.sdk.feature.taptopay.core.transaction.KernelConfigurationParams kernelConfigurationParams = this.kernelConfig;
        int i = this.waitForUserInputTimeout;
        boolean z = this.isDebitOptIn;
        boolean z2 = this.isBerTlvMode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionParams(amount=");
        sb.append(str);
        sb.append(", kernelConfig=");
        sb.append(kernelConfigurationParams);
        sb.append(", waitForUserInputTimeout=");
        sb.append(i);
        sb.append(", isDebitOptIn=");
        sb.append(z);
        sb.append(", isBerTlvMode=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.amount.hashCode();
        int hashCode2 = this.kernelConfig.hashCode();
        int hashCode3 = java.lang.Integer.hashCode(this.waitForUserInputTimeout);
        boolean z = this.isDebitOptIn;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        boolean z2 = this.isBerTlvMode;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i) * 31) + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionParams)) {
            return false;
        }
        com.zettle.sdk.feature.taptopay.core.transaction.TransactionParams transactionParams = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionParams) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, transactionParams.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.kernelConfig, transactionParams.kernelConfig) && this.waitForUserInputTimeout == transactionParams.waitForUserInputTimeout && this.isDebitOptIn == transactionParams.isDebitOptIn && this.isBerTlvMode == transactionParams.isBerTlvMode;
    }

    public final com.zettle.sdk.feature.taptopay.core.transaction.TransactionParams copy(java.lang.String amount, com.zettle.sdk.feature.taptopay.core.transaction.KernelConfigurationParams kernelConfig, int waitForUserInputTimeout, boolean isDebitOptIn, boolean isBerTlvMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kernelConfig, "");
        return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionParams(amount, kernelConfig, waitForUserInputTimeout, isDebitOptIn, isBerTlvMode);
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsBerTlvMode() {
        return this.isBerTlvMode;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsDebitOptIn() {
        return this.isDebitOptIn;
    }

    /* renamed from: component3, reason: from getter */
    public final int getWaitForUserInputTimeout() {
        return this.waitForUserInputTimeout;
    }

    /* renamed from: component2, reason: from getter */
    public final com.zettle.sdk.feature.taptopay.core.transaction.KernelConfigurationParams getKernelConfig() {
        return this.kernelConfig;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAmount() {
        return this.amount;
    }

    public static /* synthetic */ com.zettle.sdk.feature.taptopay.core.transaction.TransactionParams copy$default(com.zettle.sdk.feature.taptopay.core.transaction.TransactionParams transactionParams, java.lang.String str, com.zettle.sdk.feature.taptopay.core.transaction.KernelConfigurationParams kernelConfigurationParams, int i, boolean z, boolean z2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = transactionParams.amount;
        }
        if ((i2 & 2) != 0) {
            kernelConfigurationParams = transactionParams.kernelConfig;
        }
        com.zettle.sdk.feature.taptopay.core.transaction.KernelConfigurationParams kernelConfigurationParams2 = kernelConfigurationParams;
        if ((i2 & 4) != 0) {
            i = transactionParams.waitForUserInputTimeout;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = transactionParams.isDebitOptIn;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            z2 = transactionParams.isBerTlvMode;
        }
        return transactionParams.copy(str, kernelConfigurationParams2, i3, z3, z2);
    }
}
