package com.discover.mpos.sdk.cardreader.kernel.flow.oda.flow.sdad;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0003J\b\u0010%\u001a\u00020\u0003H\u0002J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\rH\u0002J\u0006\u0010(\u001a\u00020\u0005R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u000e\u0010\u0012\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000bR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000bR\u000e\u0010\u0017\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000bR\u000e\u0010 \u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u000b¨\u0006)"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/oda/flow/sdad/IccDynamicData;", "", "content", "", "isDataStorageEnabled", "", "safeDataExtractor", "Lcom/discover/mpos/sdk/core/data/SafeIndexBasedExtractor;", "([BZLcom/discover/mpos/sdk/core/data/SafeIndexBasedExtractor;)V", "cid", "getCid", "()[B", "cidLength", "", "getContent", "currentDataStorageDirectoryHashSize", "dataStorageDirectoryHash", "getDataStorageDirectoryHash", "dataStorageDirectorySize", "dynamicNumber", "getDynamicNumber", "dynamicNumberLength", "getDynamicNumberLength", "dynamicNumberSize", "hashLength", "indexRangeDefiner", "Ljava/util/concurrent/atomic/AtomicInteger;", "keyLengthRange", "Lkotlin/ranges/IntRange;", "numberLengthInt", "tcOrArqc", "getTcOrArqc", "tcOrArqcLength", "transactionDataHashCode", "getTransactionDataHashCode", "areCidEquals", "cidFromGpo", "extractDataStorageDirectoryHash", "extractValue", io.ktor.http.ContentDisposition.Parameters.Size, "isWellFormatted", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.d.b.c.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class IccDynamicData {

    /* renamed from: a, reason: collision with root package name */
    final kotlin.ranges.IntRange f3098a;
    final int b;
    final byte[] c;
    final byte[] d;
    final byte[] e;
    final byte[] f;
    final byte[] g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final java.util.concurrent.atomic.AtomicInteger n;

    /* renamed from: o, reason: collision with root package name */
    private final byte[] f3099o;
    private final byte[] p;
    private final boolean q;
    private final com.discover.mpos.sdk.core.data.SafeIndexBasedExtractor r;

    public IccDynamicData(byte[] bArr, boolean z, com.discover.mpos.sdk.core.data.SafeIndexBasedExtractor safeIndexBasedExtractor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(safeIndexBasedExtractor, "");
        this.g = bArr;
        this.q = z;
        this.r = safeIndexBasedExtractor;
        this.h = 20;
        this.i = 8;
        this.j = 1;
        this.f3098a = new kotlin.ranges.IntRange(2, 8);
        this.k = 1;
        this.l = 20;
        int i = z ? 20 : 0;
        this.m = i;
        this.n = new java.util.concurrent.atomic.AtomicInteger(0);
        byte[] a2 = a(1);
        this.f3099o = a2;
        byte first = kotlin.collections.ArraysKt.first(a2);
        this.b = first;
        this.p = a(first);
        this.c = a(1);
        this.d = a(8);
        this.e = a(20);
        this.f = z ? a(i) : new byte[0];
    }

    private final byte[] a(int i) {
        return this.r.extractDataSafely(this.g, this.n.getAndAdd(i), this.n.get());
    }
}
