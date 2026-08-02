package com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0012\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/storage/DefaultContainerContentStorage;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/storage/ContainerContentStorage;", "Lcom/discover/mpos/sdk/core/emv/EmvData;", "()V", "content", "", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/storage/ContainerContent;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "Lcom/discover/mpos/sdk/core/extensions/tlv/ByteArrayBuilder;", "getStorage", "()Lcom/discover/mpos/sdk/core/extensions/tlv/ByteArrayBuilder;", "storage$delegate", "Lkotlin/Lazy;", "addContainerContent", "", "containerContent", "clearContainerContent", "getContainersContent", "", "toByteArray", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class DefaultContainerContentStorage implements com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.ContainerContentStorage, com.discover.mpos.sdk.core.emv.EmvData {

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.Lazy f3203a = com.discover.mpos.sdk.core.extensions.UtilExtensionsKt.unsafeLazy(com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.DefaultContainerContentStorage.a.f3204a);
    private final java.util.List<com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.ContainerContent> b = new java.util.ArrayList();

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    public final java.lang.String toHexString() {
        return com.discover.mpos.sdk.core.emv.EmvData.DefaultImpls.toHexString(this);
    }

    @Override // com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.ContainerContentStorage
    public final void a(com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.ContainerContent containerContent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(containerContent, "");
        this.b.add(containerContent);
    }

    @Override // com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.ContainerContentStorage
    public final java.util.List<com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.ContainerContent> a() {
        return new java.util.ArrayList(this.b);
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    /* renamed from: toByteArray */
    public final byte[] getK() {
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder byteArrayBuilder = new com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder();
        java.util.Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            byteArrayBuilder.append(((com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.ContainerContent) it.next()).b);
        }
        return byteArrayBuilder.build();
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/core/extensions/tlv/ByteArrayBuilder;", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.b$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.DefaultContainerContentStorage.a f3204a = new com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.DefaultContainerContentStorage.a();

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder invoke() {
            return new com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder();
        }

        a() {
            super(0);
        }
    }
}
