package com.zettle.sdk.feature.taptopay.core.models;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ2\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/models/KernelInfo;", "", "", "name", "checksum", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/core/models/KernelInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getChecksum", "getName", "getVersion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class KernelInfo {
    private final java.lang.String checksum;
    private final java.lang.String name;
    private final java.lang.String version;

    public KernelInfo(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        this.checksum = str2;
        this.version = str3;
    }

    public final java.lang.String getChecksum() {
        return this.checksum;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getVersion() {
        return this.version;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.checksum;
        java.lang.String str3 = this.version;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("KernelInfo(name=");
        sb.append(str);
        sb.append(", checksum=");
        sb.append(str2);
        sb.append(", version=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        java.lang.String str = this.checksum;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.version;
        return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.feature.taptopay.core.models.KernelInfo)) {
            return false;
        }
        com.zettle.sdk.feature.taptopay.core.models.KernelInfo kernelInfo = (com.zettle.sdk.feature.taptopay.core.models.KernelInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, kernelInfo.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.checksum, kernelInfo.checksum) && kotlin.jvm.internal.Intrinsics.areEqual(this.version, kernelInfo.version);
    }

    public final com.zettle.sdk.feature.taptopay.core.models.KernelInfo copy(java.lang.String name2, java.lang.String checksum, java.lang.String version) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new com.zettle.sdk.feature.taptopay.core.models.KernelInfo(name2, checksum, version);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getVersion() {
        return this.version;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getChecksum() {
        return this.checksum;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.zettle.sdk.feature.taptopay.core.models.KernelInfo copy$default(com.zettle.sdk.feature.taptopay.core.models.KernelInfo kernelInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = kernelInfo.name;
        }
        if ((i & 2) != 0) {
            str2 = kernelInfo.checksum;
        }
        if ((i & 4) != 0) {
            str3 = kernelInfo.version;
        }
        return kernelInfo.copy(str, str2, str3);
    }
}
