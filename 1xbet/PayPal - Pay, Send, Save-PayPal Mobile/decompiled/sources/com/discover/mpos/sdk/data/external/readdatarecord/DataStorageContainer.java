package com.discover.mpos.sdk.data.external.readdatarecord;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\f\u0010\u000b"}, d2 = {"Lcom/discover/mpos/sdk/data/external/readdatarecord/DataStorageContainer;", "", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/storage/ContainerContent;", "containerContent", "<init>", "(Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/storage/ContainerContent;)V", "", "containerId", "([B[B)V", "[B", "getContainerContent", "()[B", "getContainerId"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class DataStorageContainer {
    private final byte[] containerContent;
    private final byte[] containerId;

    public DataStorageContainer(byte[] bArr, byte[] bArr2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr2, "");
        this.containerId = bArr;
        this.containerContent = bArr2;
    }

    public final byte[] getContainerContent() {
        return this.containerContent;
    }

    public final byte[] getContainerId() {
        return this.containerId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DataStorageContainer(com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.ContainerContent containerContent) {
        this(r0, java.util.Arrays.copyOf(r3, r3.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(containerContent, "");
        byte[] bArr = containerContent.f3202a;
        byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        byte[] bArr2 = containerContent.b;
    }
}
