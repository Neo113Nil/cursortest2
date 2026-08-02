package com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0006\u0010\r\u001a\u00020\u0000J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/storage/ContainerContent;", "Lcom/discover/mpos/sdk/core/emv/ClearableEmvData;", "containerId", "", "content", "([B[B)V", "getContainerId", "()[B", "getContent", "clear", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toByteArray", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final /* data */ class ContainerContent implements com.discover.mpos.sdk.core.emv.ClearableEmvData {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3202a;
    public final byte[] b;

    private /* synthetic */ ContainerContent() {
        this(new byte[0], new byte[0]);
    }

    public ContainerContent(byte[] bArr, byte[] bArr2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr2, "");
        this.f3202a = bArr;
        this.b = bArr2;
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    public final java.lang.String toHexString() {
        return com.discover.mpos.sdk.core.emv.ClearableEmvData.DefaultImpls.toHexString(this);
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear(this.f3202a);
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear(this.b);
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    /* renamed from: toByteArray, reason: from getter */
    public final byte[] getB() {
        return this.b;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContainerContent(containerId=");
        sb.append(java.util.Arrays.toString(this.f3202a));
        sb.append(", content=");
        sb.append(java.util.Arrays.toString(this.b));
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        byte[] bArr = this.f3202a;
        int hashCode = bArr != null ? java.util.Arrays.hashCode(bArr) : 0;
        byte[] bArr2 = this.b;
        return (hashCode * 31) + (bArr2 != null ? java.util.Arrays.hashCode(bArr2) : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.ContainerContent)) {
            return false;
        }
        com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.ContainerContent containerContent = (com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.ContainerContent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f3202a, containerContent.f3202a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, containerContent.b);
    }
}
