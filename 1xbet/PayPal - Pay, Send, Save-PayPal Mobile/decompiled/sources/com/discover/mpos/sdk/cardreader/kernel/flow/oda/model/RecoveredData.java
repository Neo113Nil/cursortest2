package com.discover.mpos.sdk.cardreader.kernel.flow.oda.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0007H\u0002J\b\u0010(\u001a\u00020)H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000bR\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000bR\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000bR\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000bR\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000bR\u0014\u0010 \u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u000bR\u0014\u0010\"\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u000bR\u0014\u0010$\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/oda/model/RecoveredData;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/oda/model/RecoveredDataFormat;", "byteArray", "", "safeDataExtractor", "Lcom/discover/mpos/sdk/core/data/SafeIndexBasedExtractor;", "panSize", "", "([BLcom/discover/mpos/sdk/core/data/SafeIndexBasedExtractor;I)V", "certificateSerialNumber", "getCertificateSerialNumber", "()[B", "expirationDate", "getExpirationDate", "exponentLength", "getExponentLength", "hashAlgorithmIndicator", "getHashAlgorithmIndicator", "hashResult", "getHashResult", "indexRangeDefiner", "Ljava/util/concurrent/atomic/AtomicInteger;", "key", "getKey", "keyAlgorithmIndicator", "getKeyAlgorithmIndicator", "keyLength", "getKeyLength", "keyWithPadding", "getKeyWithPadding", "panAssessmentValue", "getPanAssessmentValue", "recoveredFormat", "getRecoveredFormat", "recoveredHeader", "getRecoveredHeader", "recoveredTrailer", "getRecoveredTrailer", "extractValue", io.ktor.http.ContentDisposition.Parameters.Size, "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.d.c.d, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class RecoveredData implements com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.RecoveredDataFormat {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3135a;
    public final byte[] b;
    public final byte[] c;
    public final byte[] d;
    public final byte[] e;
    public final byte[] f;
    public final byte[] g;
    public final byte[] h;
    public final byte[] i;
    public final byte[] j;
    public final byte[] k;
    public final byte[] l;
    public final byte[] m;
    private final java.util.concurrent.atomic.AtomicInteger n;

    /* renamed from: o, reason: collision with root package name */
    private final byte[] f3136o;
    private final com.discover.mpos.sdk.core.data.SafeIndexBasedExtractor p;

    public RecoveredData(byte[] bArr, com.discover.mpos.sdk.core.data.SafeIndexBasedExtractor safeIndexBasedExtractor, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(safeIndexBasedExtractor, "");
        this.f3136o = bArr;
        this.p = safeIndexBasedExtractor;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        this.n = atomicInteger;
        this.f3135a = a(1);
        this.b = a(1);
        this.c = a(i);
        this.d = a(2);
        this.e = a(3);
        this.f = a(1);
        this.g = a(1);
        byte[] a2 = a(1);
        this.h = a2;
        this.i = a(1);
        byte[] a3 = a(bArr.length - (atomicInteger.get() + 21));
        this.j = a3;
        int unsignedInt = com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toUnsignedInt(kotlin.collections.ArraysKt.first(a2));
        this.k = a3.length > unsignedInt ? kotlin.collections.ArraysKt.copyOfRange(a3, 0, unsignedInt) : a3;
        this.l = a(20);
        this.m = a(1);
    }

    @Override // com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.RecoveredDataFormat
    /* renamed from: a, reason: from getter */
    public final byte[] getF3135a() {
        return this.f3135a;
    }

    @Override // com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.RecoveredDataFormat
    /* renamed from: b, reason: from getter */
    public final byte[] getB() {
        return this.b;
    }

    @Override // com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.RecoveredDataFormat
    /* renamed from: c, reason: from getter */
    public final byte[] getM() {
        return this.m;
    }

    private final byte[] a(int i) {
        return this.p.extractDataSafely(this.f3136o, this.n.getAndAdd(i), this.n.get());
    }

    public final java.lang.String toString() {
        return com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.toHexString(this.f3136o);
    }
}
