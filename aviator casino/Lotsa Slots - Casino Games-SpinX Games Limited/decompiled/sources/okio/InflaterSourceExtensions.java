package okio;

/* compiled from: InflaterSource.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\b\u0002\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0086\b¨\u0006\u0006"}, d2 = {"inflate", "Lokio/InflaterSource;", "Lokio/Source;", "inflater", "Ljava/util/zip/Inflater;", "Lokio/Inflater;", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: okio.-InflaterSourceExtensions, reason: invalid class name */
/* loaded from: classes6.dex */
public final class InflaterSourceExtensions {
    public static /* synthetic */ okio.InflaterSource inflate$default(okio.Source source, java.util.zip.Inflater inflater, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            inflater = new java.util.zip.Inflater();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        return new okio.InflaterSource(source, inflater);
    }

    public static final okio.InflaterSource inflate(okio.Source source, java.util.zip.Inflater inflater) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        return new okio.InflaterSource(source, inflater);
    }
}
