package com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u001b\u0010\u0005\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u001b\u0010\u0012\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0013\u0010\u0007R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0017\u0010\rR\u000e\u0010\u0019\u001a\u00020\u0010X\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\t\u001a\u0004\b\u001b\u0010\u0007R\u000e\u0010\u001d\u001a\u00020\u0010X\u0082D¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/model/DataStorageDirectoryEntry;", "Lcom/discover/mpos/sdk/core/emv/Clearable;", "content", "", "([B)V", "containerId", "getContainerId", "()[B", "containerId$delegate", "Lkotlin/Lazy;", "containerType", "", "getContainerType", "()B", "containerType$delegate", "containerTypePosition", "", "getContent", "integrityCode", "getIntegrityCode", "integrityCode$delegate", "integrityCodeStartPosition", "recordNumber", "getRecordNumber", "recordNumber$delegate", "recordNumberPosition", "writeCounter", "getWriteCounter", "writeCounter$delegate", "writeCounterStart", "clear", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.c.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class DataStorageDirectoryEntry implements com.discover.mpos.sdk.core.emv.Clearable {

    /* renamed from: a, reason: collision with root package name */
    final int f3192a;
    final int b;
    final int c;
    final int d;
    public final kotlin.Lazy e;
    public final byte[] f;
    private final kotlin.Lazy g;
    private final kotlin.Lazy h;
    private final kotlin.Lazy i;
    private final kotlin.Lazy j;

    public DataStorageDirectoryEntry(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.f = bArr;
        this.f3192a = 4;
        this.b = 5;
        this.c = 6;
        this.d = 8;
        this.g = com.discover.mpos.sdk.core.extensions.UtilExtensionsKt.unsafeLazy(new com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry.a());
        this.h = com.discover.mpos.sdk.core.extensions.UtilExtensionsKt.unsafeLazy(new com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry.d());
        this.e = com.discover.mpos.sdk.core.extensions.UtilExtensionsKt.unsafeLazy(new com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry.b());
        this.i = com.discover.mpos.sdk.core.extensions.UtilExtensionsKt.unsafeLazy(new com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry.e());
        this.j = com.discover.mpos.sdk.core.extensions.UtilExtensionsKt.unsafeLazy(new com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry.c());
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear(this.f);
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear(a());
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear(c());
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear(d());
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.c.b$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<byte[]> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ byte[] invoke() {
            return kotlin.collections.ArraysKt.copyOfRange(com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry.this.f, 0, com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry.this.f3192a);
        }

        a() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0005\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.c.b$d */
    static final class d extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.lang.Byte> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ java.lang.Byte invoke() {
            return java.lang.Byte.valueOf(com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry.this.f[com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry.this.f3192a]);
        }

        d() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0005\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.c.b$b */
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.lang.Byte> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ java.lang.Byte invoke() {
            return java.lang.Byte.valueOf(com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry.this.f[com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry.this.b]);
        }

        b() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.c.b$e */
    static final class e extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<byte[]> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ byte[] invoke() {
            return kotlin.collections.ArraysKt.copyOfRange(com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry.this.f, com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry.this.c, com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry.this.d);
        }

        e() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.c.b$c */
    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<byte[]> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ byte[] invoke() {
            return kotlin.collections.ArraysKt.copyOfRange(com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry.this.f, com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry.this.d, com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry.this.f.length);
        }

        c() {
            super(0);
        }
    }

    public final byte[] d() {
        return (byte[]) this.j.getValue();
    }

    public final byte[] c() {
        return (byte[]) this.i.getValue();
    }

    public final byte b() {
        return ((java.lang.Number) this.h.getValue()).byteValue();
    }

    public final byte[] a() {
        return (byte[]) this.g.getValue();
    }
}
