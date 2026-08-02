package androidx.graphics.path;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0012\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Landroidx/graphics/path/PathIterator;", "", "Landroidx/graphics/path/PathSegment;", "Landroid/graphics/Path;", "path", "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "conicEvaluation", "", "tolerance", "<init>", "(Landroid/graphics/Path;Landroidx/graphics/path/PathIterator$ConicEvaluation;F)V", "", "includeConvertedConics", "", "calculateSize", "(Z)I", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Landroidx/graphics/path/PathSegment;", "", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "offset", "Landroidx/graphics/path/PathSegment$Type;", "([FI)Landroidx/graphics/path/PathSegment$Type;", "peek", "()Landroidx/graphics/path/PathSegment$Type;", "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "getConicEvaluation", "()Landroidx/graphics/path/PathIterator$ConicEvaluation;", "Landroidx/graphics/path/PathIteratorImpl;", "Camera2StreamConfigurationMap", "Landroidx/graphics/path/PathIteratorImpl;", "getHighSpeedVideoFpsRanges", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getTolerance", "()F", "ConicEvaluation"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PathIterator implements java.util.Iterator<androidx.graphics.path.PathSegment>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.graphics.path.PathIteratorImpl getHighSpeedVideoFpsRanges;
    private final androidx.graphics.path.PathIterator.ConicEvaluation conicEvaluation;
    private final android.graphics.Path path;
    private final float tolerance;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/graphics/path/PathIterator$ConicEvaluation;", "", "<init>", "(Ljava/lang/String;I)V", "AsConic", "AsQuadratics"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ConicEvaluation {
        AsConic,
        AsQuadratics
    }

    public PathIterator(android.graphics.Path path, androidx.graphics.path.PathIterator.ConicEvaluation conicEvaluation, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conicEvaluation, "");
        this.path = path;
        this.conicEvaluation = conicEvaluation;
        this.tolerance = f;
        this.getHighSpeedVideoFpsRanges = android.os.Build.VERSION.SDK_INT >= 34 ? new androidx.graphics.path.PathIteratorApi34Impl(path, conicEvaluation, f) : new androidx.graphics.path.PathIteratorPreApi34Impl(path, conicEvaluation, f);
    }

    public final android.graphics.Path getPath() {
        return this.path;
    }

    public /* synthetic */ PathIterator(android.graphics.Path path, androidx.graphics.path.PathIterator.ConicEvaluation conicEvaluation, float f, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(path, (i & 2) != 0 ? androidx.graphics.path.PathIterator.ConicEvaluation.AsQuadratics : conicEvaluation, (i & 4) != 0 ? 0.25f : f);
    }

    public final androidx.graphics.path.PathIterator.ConicEvaluation getConicEvaluation() {
        return this.conicEvaluation;
    }

    public final float getTolerance() {
        return this.tolerance;
    }

    public static /* synthetic */ int calculateSize$default(androidx.graphics.path.PathIterator pathIterator, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return pathIterator.calculateSize(z);
    }

    public final int calculateSize(boolean includeConvertedConics) {
        return this.getHighSpeedVideoFpsRanges.calculateSize(includeConvertedConics);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.getHighSpeedVideoFpsRanges.hasNext();
    }

    public final androidx.graphics.path.PathSegment.Type peek() {
        return this.getHighSpeedVideoFpsRanges.peek();
    }

    public static /* synthetic */ androidx.graphics.path.PathSegment.Type next$default(androidx.graphics.path.PathIterator pathIterator, float[] fArr, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return pathIterator.next(fArr, i);
    }

    public final androidx.graphics.path.PathSegment.Type next(float[] points, int offset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(points, "");
        return this.getHighSpeedVideoFpsRanges.next(points, offset);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public final androidx.graphics.path.PathSegment next() {
        return this.getHighSpeedVideoFpsRanges.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final androidx.graphics.path.PathSegment.Type next(float[] fArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fArr, "");
        return next$default(this, fArr, 0, 2, null);
    }
}
