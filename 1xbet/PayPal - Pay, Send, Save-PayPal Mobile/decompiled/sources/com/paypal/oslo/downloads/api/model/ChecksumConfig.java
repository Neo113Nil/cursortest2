package com.paypal.oslo.downloads.api.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/ChecksumConfig;", "", "", "expectedChecksum", "Lcom/paypal/oslo/downloads/api/model/ChecksumAlgorithm;", "algorithm", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/downloads/api/model/ChecksumAlgorithm;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/downloads/api/model/ChecksumAlgorithm;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/downloads/api/model/ChecksumAlgorithm;)Lcom/paypal/oslo/downloads/api/model/ChecksumConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getExpectedChecksum", "Lcom/paypal/oslo/downloads/api/model/ChecksumAlgorithm;", "getAlgorithm"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ChecksumConfig {
    private final com.paypal.oslo.downloads.api.model.ChecksumAlgorithm algorithm;
    private final java.lang.String expectedChecksum;

    public ChecksumConfig(java.lang.String str, com.paypal.oslo.downloads.api.model.ChecksumAlgorithm checksumAlgorithm) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checksumAlgorithm, "");
        this.expectedChecksum = str;
        this.algorithm = checksumAlgorithm;
    }

    public final java.lang.String getExpectedChecksum() {
        return this.expectedChecksum;
    }

    public final com.paypal.oslo.downloads.api.model.ChecksumAlgorithm getAlgorithm() {
        return this.algorithm;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.expectedChecksum;
        com.paypal.oslo.downloads.api.model.ChecksumAlgorithm checksumAlgorithm = this.algorithm;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ChecksumConfig(expectedChecksum=");
        sb.append(str);
        sb.append(", algorithm=");
        sb.append(checksumAlgorithm);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.expectedChecksum.hashCode() * 31) + this.algorithm.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.downloads.api.model.ChecksumConfig)) {
            return false;
        }
        com.paypal.oslo.downloads.api.model.ChecksumConfig checksumConfig = (com.paypal.oslo.downloads.api.model.ChecksumConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.expectedChecksum, checksumConfig.expectedChecksum) && this.algorithm == checksumConfig.algorithm;
    }

    public final com.paypal.oslo.downloads.api.model.ChecksumConfig copy(java.lang.String expectedChecksum, com.paypal.oslo.downloads.api.model.ChecksumAlgorithm algorithm) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expectedChecksum, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(algorithm, "");
        return new com.paypal.oslo.downloads.api.model.ChecksumConfig(expectedChecksum, algorithm);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.downloads.api.model.ChecksumAlgorithm getAlgorithm() {
        return this.algorithm;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getExpectedChecksum() {
        return this.expectedChecksum;
    }

    public static /* synthetic */ com.paypal.oslo.downloads.api.model.ChecksumConfig copy$default(com.paypal.oslo.downloads.api.model.ChecksumConfig checksumConfig, java.lang.String str, com.paypal.oslo.downloads.api.model.ChecksumAlgorithm checksumAlgorithm, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = checksumConfig.expectedChecksum;
        }
        if ((i & 2) != 0) {
            checksumAlgorithm = checksumConfig.algorithm;
        }
        return checksumConfig.copy(str, checksumAlgorithm);
    }
}
