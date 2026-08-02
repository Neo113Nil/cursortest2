package com.discover.mpos.sdk.cardreader.kernel.flow.oda.flow.sdad;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0006\u0010$\u001a\u00020\u0003R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000bR\u0014\u0010\u001a\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000bR\u0014\u0010\u001c\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082D¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/oda/flow/sdad/SignedDynamicAuthenticationRecoveredData;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/oda/model/RecoveredDataFormat;", "recoveredData", "", "safeDataExtractor", "Lcom/discover/mpos/sdk/core/data/SafeIndexBasedExtractor;", "dataStorageEnabled", "", "([BLcom/discover/mpos/sdk/core/data/SafeIndexBasedExtractor;Z)V", "algorithmIndicator", "getAlgorithmIndicator", "()[B", "dynamicData", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/oda/flow/sdad/IccDynamicData;", "getDynamicData", "()Lcom/discover/mpos/sdk/cardreader/kernel/flow/oda/flow/sdad/IccDynamicData;", "dynamicDataLength", "getDynamicDataLength", "hashResult", "getHashResult", "indexRangeDefiner", "Ljava/util/concurrent/atomic/AtomicInteger;", "panPattern", "getPanPattern", "recoveredFormat", "getRecoveredFormat", "recoveredHeader", "getRecoveredHeader", "recoveredTrailer", "getRecoveredTrailer", "trailingDataLength", "", "extractValue", io.ktor.http.ContentDisposition.Parameters.Size, "toString", "", "transactionDataHash", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.d.b.c.d, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class SignedDynamicAuthenticationRecoveredData implements com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.RecoveredDataFormat {

    /* renamed from: a, reason: collision with root package name */
    final byte[] f3126a;
    final byte[] b;
    final byte[] c;
    final com.discover.mpos.sdk.cardreader.kernel.flow.oda.flow.sdad.IccDynamicData d;
    final byte[] e;
    final byte[] f;
    private final java.util.concurrent.atomic.AtomicInteger g;
    private final int h;
    private final byte[] i;
    private final byte[] j;
    private final byte[] k;
    private final com.discover.mpos.sdk.core.data.SafeIndexBasedExtractor l;

    public SignedDynamicAuthenticationRecoveredData(byte[] bArr, com.discover.mpos.sdk.core.data.SafeIndexBasedExtractor safeIndexBasedExtractor, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(safeIndexBasedExtractor, "");
        this.k = bArr;
        this.l = safeIndexBasedExtractor;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        this.g = atomicInteger;
        this.h = 21;
        this.i = a(1);
        this.f3126a = a(1);
        this.b = a(1);
        byte[] a2 = a(1);
        this.c = a2;
        this.d = new com.discover.mpos.sdk.cardreader.kernel.flow.oda.flow.sdad.IccDynamicData(a(kotlin.collections.ArraysKt.first(a2)), z, safeIndexBasedExtractor);
        this.e = a(bArr.length - (atomicInteger.get() + 21));
        this.f = a(20);
        this.j = a(1);
    }

    @Override // com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.RecoveredDataFormat
    /* renamed from: a, reason: from getter */
    public final byte[] getI() {
        return this.i;
    }

    @Override // com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.RecoveredDataFormat
    /* renamed from: b, reason: from getter */
    public final byte[] getF3126a() {
        return this.f3126a;
    }

    @Override // com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.RecoveredDataFormat
    /* renamed from: c, reason: from getter */
    public final byte[] getJ() {
        return this.j;
    }

    private final byte[] a(int i) {
        return this.l.extractDataSafely(this.k, this.g.getAndAdd(i), this.g.get());
    }

    public final java.lang.String toString() {
        return com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.toHexString(this.k);
    }
}
