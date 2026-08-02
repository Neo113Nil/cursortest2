package okio;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lokio/Source;", "Ljava/util/zip/Inflater;", "Lokio/getHighSpeedVideoSizesFor;", "inflater", "Lokio/InflaterSource;", "inflate", "(Lokio/Source;Ljava/util/zip/Inflater;)Lokio/InflaterSource;"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* renamed from: okio.-InflaterSourceExtensions, reason: invalid class name */
/* loaded from: classes17.dex */
public final class InflaterSourceExtensions {
    public static /* synthetic */ okio.InflaterSource inflate$default(okio.Source source, java.util.zip.Inflater inflater, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            inflater = new java.util.zip.Inflater();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        return new okio.InflaterSource(source, inflater);
    }

    public static final okio.InflaterSource inflate(okio.Source source, java.util.zip.Inflater inflater) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        return new okio.InflaterSource(source, inflater);
    }
}
