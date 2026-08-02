package androidx.camera.camera2.pipe.core;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u000e\u001a\u00020\u000b*\u00020\nH\u0086\b¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0013\u001a\u00020\u000b*\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010\u000e\u001a\u00020\u000b*\u00020\u0006H\u0086\b¢\u0006\u0004\b\u0014\u0010\rJ\u0014\u0010\u0013\u001a\u00020\u000b*\u00020\u0006H\u0086\b¢\u0006\u0004\b\u0015\u0010\rJ\u001e\u0010\u0018\u001a\u00020\n*\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/camera/camera2/pipe/core/Timestamps;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/core/TimeSource;", "timeSource", "Landroidx/camera/camera2/pipe/core/TimestampNs;", "now-GvorZiw", "(Landroidx/camera/camera2/pipe/core/TimeSource;)J", "now", "Landroidx/camera/camera2/pipe/core/DurationNs;", "", "formatNs-zYRVrok", "(J)Ljava/lang/String;", "formatNs", "", "decimals", "formatMs-t8DbYm4", "(JI)Ljava/lang/String;", "formatMs", "formatNs-mxdxgDo", "formatMs-mxdxgDo", "measureNow-BzyuS-k", "(JLandroidx/camera/camera2/pipe/core/TimeSource;)J", "measureNow"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Timestamps {
    public static final androidx.camera.camera2.pipe.core.Timestamps INSTANCE = new androidx.camera.camera2.pipe.core.Timestamps();

    private Timestamps() {
    }

    /* renamed from: now-GvorZiw, reason: not valid java name */
    public final long m903nowGvorZiw(androidx.camera.camera2.pipe.core.TimeSource timeSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeSource, "");
        return timeSource.mo885nowvQl9yQU();
    }

    /* renamed from: formatNs-zYRVrok, reason: not valid java name */
    public final java.lang.String m901formatNszYRVrok(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.Object) androidx.camera.camera2.pipe.core.DurationNs.m879toStringimpl(j));
        sb.append(" ns");
        return sb.toString();
    }

    /* renamed from: formatMs-t8DbYm4$default, reason: not valid java name */
    public static /* synthetic */ java.lang.String m896formatMst8DbYm4$default(androidx.camera.camera2.pipe.core.Timestamps timestamps, long j, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 3;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("%.");
        sb.append(i);
        sb.append("f ms");
        java.lang.String format = java.lang.String.format(null, sb.toString(), java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(j / 1000000.0d)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    /* renamed from: formatMs-t8DbYm4, reason: not valid java name */
    public final java.lang.String m899formatMst8DbYm4(long j, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("%.");
        sb.append(i);
        sb.append("f ms");
        java.lang.String format = java.lang.String.format(null, sb.toString(), java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(j / 1000000.0d)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    /* renamed from: formatNs-mxdxgDo, reason: not valid java name */
    public final java.lang.String m900formatNsmxdxgDo(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.Object) androidx.camera.camera2.pipe.core.TimestampNs.m894toStringimpl(j));
        sb.append(" ns");
        return sb.toString();
    }

    /* renamed from: formatMs-mxdxgDo, reason: not valid java name */
    public final java.lang.String m898formatMsmxdxgDo(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(j / 1000000);
        sb.append(" ms");
        return sb.toString();
    }

    /* renamed from: measureNow-BzyuS-k$default, reason: not valid java name */
    public static /* synthetic */ long m897measureNowBzyuSk$default(androidx.camera.camera2.pipe.core.Timestamps timestamps, long j, androidx.camera.camera2.pipe.core.TimeSource timeSource, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            timeSource = new androidx.camera.camera2.pipe.core.SystemTimeSource();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeSource, "");
        return androidx.camera.camera2.pipe.core.DurationNs.m872constructorimpl(timeSource.mo885nowvQl9yQU() - j);
    }

    /* renamed from: measureNow-BzyuS-k, reason: not valid java name */
    public final long m902measureNowBzyuSk(long j, androidx.camera.camera2.pipe.core.TimeSource timeSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeSource, "");
        return androidx.camera.camera2.pipe.core.DurationNs.m872constructorimpl(timeSource.mo885nowvQl9yQU() - j);
    }
}
