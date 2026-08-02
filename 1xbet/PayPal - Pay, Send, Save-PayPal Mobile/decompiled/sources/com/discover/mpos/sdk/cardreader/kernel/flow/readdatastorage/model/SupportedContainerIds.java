package com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/model/SupportedContainerIds;", "", "sourceContainerIds", "", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/model/SupportedContainerIds$ContainerId;", "(Ljava/util/List;)V", "isContainerSupported", "", "containerId", "", "toString", "", "ContainerId", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.c.e, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class SupportedContainerIds {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List<com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.SupportedContainerIds.a> f3199a;

    public SupportedContainerIds(java.util.List<com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.SupportedContainerIds.a> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.f3199a = list;
    }

    public final java.lang.String toString() {
        return kotlin.collections.CollectionsKt.joinToString$default(this.f3199a, null, null, null, 0, null, null, 63, null);
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/model/SupportedContainerIds$ContainerId;", "", "containerId", "", "([B)V", "match", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.c.e$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f3200a;

        public a(byte[] bArr) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
            this.f3200a = bArr;
        }

        public final java.lang.String toString() {
            return com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.toHexString(this.f3200a);
        }
    }
}
