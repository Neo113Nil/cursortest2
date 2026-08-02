package com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0006\u0010\u0002\u001a\u00020\u0003J\u0006\u0010\u001c\u001a\u00020\u0000J\b\u0010\u001d\u001a\u00020\u0003H\u0016R!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0012\u0010\u000bR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u0018\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/model/DataStorageDirectory;", "Lcom/discover/mpos/sdk/core/emv/ClearableEmvData;", "content", "", "contentHash", "safeIndexBasedExtractor", "Lcom/discover/mpos/sdk/core/data/SafeIndexBasedExtractor;", "([B[BLcom/discover/mpos/sdk/core/data/SafeIndexBasedExtractor;)V", "containerIds", "", "getContainerIds", "()Ljava/util/List;", "containerIds$delegate", "Lkotlin/Lazy;", "getContentHash", "()[B", "directoryEntries", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/model/DataStorageDirectoryEntry;", "getDirectoryEntries", "directoryEntries$delegate", "directorySize", "", "unEndPosition", "unpredictableNumber", "getUnpredictableNumber", "unpredictableNumber$delegate", "clear", "", "copy", "toByteArray", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.c.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class DataStorageDirectory implements com.discover.mpos.sdk.core.emv.ClearableEmvData {

    /* renamed from: a, reason: collision with root package name */
    final int f3188a;
    final int b;
    public final byte[] c;
    public final byte[] d;
    public final com.discover.mpos.sdk.core.data.SafeIndexBasedExtractor e;
    private final kotlin.Lazy f;
    private final kotlin.Lazy g;
    private final kotlin.Lazy h;

    public DataStorageDirectory(byte[] bArr, byte[] bArr2, com.discover.mpos.sdk.core.data.SafeIndexBasedExtractor safeIndexBasedExtractor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(safeIndexBasedExtractor, "");
        this.c = bArr;
        this.d = bArr2;
        this.e = safeIndexBasedExtractor;
        this.f3188a = 8;
        this.b = 10;
        this.f = com.discover.mpos.sdk.core.extensions.UtilExtensionsKt.unsafeLazy(new com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory.c());
        this.g = com.discover.mpos.sdk.core.extensions.UtilExtensionsKt.unsafeLazy(new com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory.b());
        this.h = com.discover.mpos.sdk.core.extensions.UtilExtensionsKt.unsafeLazy(new com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory.a());
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    public final java.lang.String toHexString() {
        return com.discover.mpos.sdk.core.emv.ClearableEmvData.DefaultImpls.toHexString(this);
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear(this.c);
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear(this.d);
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear(a());
        java.util.Iterator<T> it = b().iterator();
        while (it.hasNext()) {
            ((com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry) it.next()).clear();
        }
        java.util.Iterator<T> it2 = c().iterator();
        while (it2.hasNext()) {
            com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear((byte[]) it2.next());
        }
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    /* renamed from: toByteArray */
    public final byte[] getE() {
        byte[] bArr = this.c;
        return java.util.Arrays.copyOf(bArr, bArr.length);
    }

    public final byte[] d() {
        byte[] bArr = this.c;
        return java.util.Arrays.copyOf(bArr, bArr.length);
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.c.a$c */
    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<byte[]> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ byte[] invoke() {
            return com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory.this.c.length == 0 ? new byte[0] : com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory.this.e.extractDataSafely(com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory.this.c, 0, com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory.this.f3188a);
        }

        c() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/model/DataStorageDirectoryEntry;", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.c.a$b */
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.util.List<com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry>> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ java.util.List<com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry> invoke() {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory.this.c.length != 0) {
                byte[] extractDataSafely = com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory.this.e.extractDataSafely(com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory.this.c, com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory.this.f3188a, com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory.this.c.length);
                kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.collections.ArraysKt.getIndices(extractDataSafely), com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory.this.b);
                int first = step.getFirst();
                int last = step.getLast();
                int step2 = step.getStep();
                if (step2 < 0 ? first >= last : first <= last) {
                    while (true) {
                        arrayList.add(new com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry(kotlin.collections.ArraysKt.copyOfRange(extractDataSafely, first, com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory.this.b + first)));
                        if (first == last) {
                            break;
                        }
                        first += step2;
                    }
                }
            }
            return arrayList;
        }

        b() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.c.a$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.util.List<? extends byte[]>> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ java.util.List<? extends byte[]> invoke() {
            java.util.List<com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry> b = com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory.this.b();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(b, 10));
            java.util.Iterator<T> it = b.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry) it.next()).a());
            }
            return arrayList;
        }

        a() {
            super(0);
        }
    }

    public final java.util.List<byte[]> c() {
        return (java.util.List) this.h.getValue();
    }

    public final java.util.List<com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry> b() {
        return (java.util.List) this.g.getValue();
    }

    public final byte[] a() {
        return (byte[]) this.f.getValue();
    }
}
