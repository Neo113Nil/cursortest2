package okio;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lokio/Sink;", "Ljava/util/zip/Deflater;", "Lokio/getInputSizeshNQ4ISI;", "deflater", "Lokio/DeflaterSink;", "deflate", "(Lokio/Sink;Ljava/util/zip/Deflater;)Lokio/DeflaterSink;"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* renamed from: okio.-DeflaterSinkExtensions, reason: invalid class name */
/* loaded from: classes17.dex */
public final class DeflaterSinkExtensions {
    public static /* synthetic */ okio.DeflaterSink deflate$default(okio.Sink sink, java.util.zip.Deflater deflater, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            deflater = new java.util.zip.Deflater();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deflater, "");
        return new okio.DeflaterSink(sink, deflater);
    }

    public static final okio.DeflaterSink deflate(okio.Sink sink, java.util.zip.Deflater deflater) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deflater, "");
        return new okio.DeflaterSink(sink, deflater);
    }
}
