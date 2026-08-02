package coil3.content;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0013\u0092\u0001\u00020\u0002"}, d2 = {"Lcoil3/network/ByteStringNetworkRequestBody;", "Lcoil3/network/NetworkRequestBody;", "Lokio/ByteString;", "p0", "getHighSpeedVideoFpsRanges", "(Lokio/ByteString;)Lokio/ByteString;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lokio/ByteString;", "getHighSpeedVideoFpsRangesFor", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes7.dex */
final class ByteStringNetworkRequestBody implements coil3.content.NetworkRequestBody {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final okio.ByteString getHighSpeedVideoFpsRangesFor;

    public static okio.ByteString getHighSpeedVideoFpsRanges(okio.ByteString byteString) {
        return byteString;
    }

    private /* synthetic */ ByteStringNetworkRequestBody(okio.ByteString byteString) {
        this.getHighSpeedVideoFpsRangesFor = byteString;
    }

    @Override // coil3.content.NetworkRequestBody
    public final java.lang.Object writeTo(okio.BufferedSink bufferedSink, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        bufferedSink.write(this.getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }

    public final boolean equals(java.lang.Object p0) {
        return (p0 instanceof coil3.content.ByteStringNetworkRequestBody) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, ((coil3.content.ByteStringNetworkRequestBody) p0).getHighSpeedVideoFpsRangesFor);
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    public final java.lang.String toString() {
        okio.ByteString byteString = this.getHighSpeedVideoFpsRangesFor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ByteStringNetworkRequestBody(getHighSpeedVideoFpsRangesFor=");
        sb.append(byteString);
        sb.append(")");
        return sb.toString();
    }

    public static final /* synthetic */ coil3.content.ByteStringNetworkRequestBody getHighSpeedVideoSizes(okio.ByteString byteString) {
        return new coil3.content.ByteStringNetworkRequestBody(byteString);
    }
}
