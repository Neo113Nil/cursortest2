package com.zettle.sdk.io;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015J#\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\fH¦\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/zettle/sdk/io/DataChunk;", "", "", "fromIndex", "toIndex", "", "copyOfRange", "(II)[B", "index", "", "get", "(I)B", "", "iterator", "()Ljava/util/Iterator;", "", "toString", "()Ljava/lang/String;", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size, "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface DataChunk {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.io.DataChunk.Companion INSTANCE = com.zettle.sdk.io.DataChunk.Companion.getHighSpeedVideoFpsRangesFor;

    byte[] copyOfRange(int fromIndex, int toIndex);

    byte get(int index);

    /* renamed from: getSize */
    int getGetHighSpeedVideoSizes();

    java.util.Iterator<java.lang.Byte> iterator();

    java.lang.String toString();

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ byte[] copyOfRange$default(com.zettle.sdk.io.DataChunk dataChunk, int i, int i2, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyOfRange");
            }
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = dataChunk.getGetHighSpeedVideoSizes();
            }
            return dataChunk.copyOfRange(i, i2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/zettle/sdk/io/DataChunk$Companion;", "", "<init>", "()V", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "offset", io.ktor.http.ContentDisposition.Parameters.Size, "Lcom/zettle/sdk/io/DataChunk;", "wrap", "([BII)Lcom/zettle/sdk/io/DataChunk;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.io.DataChunk.Companion getHighSpeedVideoFpsRangesFor = new com.zettle.sdk.io.DataChunk.Companion();

        private Companion() {
        }

        public static /* synthetic */ com.zettle.sdk.io.DataChunk wrap$default(com.zettle.sdk.io.DataChunk.Companion companion, byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return companion.wrap(bArr, i, i2);
        }

        public final com.zettle.sdk.io.DataChunk wrap(byte[] data, int offset, int size) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.zettle.sdk.io.DataChunkHolder(data, offset, size);
        }
    }
}
