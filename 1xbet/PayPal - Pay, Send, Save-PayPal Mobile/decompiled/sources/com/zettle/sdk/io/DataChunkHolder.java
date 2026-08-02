package com.zettle.sdk.io;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/zettle/sdk/io/DataChunkHolder;", "Lcom/zettle/sdk/io/DataChunk;", "", "p0", "", "p1", "p2", "<init>", "([BII)V", "copyOfRange", "(II)[B", "", "get", "(I)B", "", "iterator", "()Ljava/util/Iterator;", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "[B", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "getSize", "()I", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class DataChunkHolder implements com.zettle.sdk.io.DataChunk {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;
    private final byte[] getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    public DataChunkHolder(byte[] bArr, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.getHighSpeedVideoFpsRanges = bArr;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoSizes = i2;
    }

    @Override // com.zettle.sdk.io.DataChunk
    /* renamed from: getSize, reason: from getter */
    public final int getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.zettle.sdk.io.DataChunk
    public final byte get(int p0) {
        return this.getHighSpeedVideoFpsRanges[this.getHighSpeedVideoFpsRangesFor + p0];
    }

    @Override // com.zettle.sdk.io.DataChunk
    public final byte[] copyOfRange(int p0, int p1) {
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        int i = this.getHighSpeedVideoFpsRangesFor;
        return kotlin.collections.ArraysKt.copyOfRange(bArr, p0 + i, i + p1);
    }

    @Override // com.zettle.sdk.io.DataChunk
    public final java.util.Iterator<java.lang.Byte> iterator() {
        return kotlin.collections.CollectionsKt.take(kotlin.collections.ArraysKt.drop(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor), getGetHighSpeedVideoSizes()).iterator();
    }

    @Override // com.zettle.sdk.io.DataChunk
    public final java.lang.String toString() {
        return "0x".concat(java.lang.String.valueOf(com.zettle.sdk.io.BuffersKt.toHexString(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, getGetHighSpeedVideoSizes())));
    }
}
