package androidx.graphics.path;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/graphics/path/PathIteratorApi34Impl;", "Landroidx/graphics/path/PathIteratorImpl;", "Landroid/graphics/Path;", "path", "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "conicEvaluation", "", "tolerance", "<init>", "(Landroid/graphics/Path;Landroidx/graphics/path/PathIterator$ConicEvaluation;F)V", "", "includeConvertedConics", "", "calculateSize", "(Z)I", "hasNext", "()Z", "", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "offset", "Landroidx/graphics/path/PathSegment$Type;", io.ktor.http.LinkHeader.Rel.Next, "([FI)Landroidx/graphics/path/PathSegment$Type;", "peek", "()Landroidx/graphics/path/PathSegment$Type;", "Landroidx/graphics/path/ConicConverter;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/graphics/path/ConicConverter;", "Camera2StreamConfigurationMap", "Landroid/graphics/PathIterator;", "getHighSpeedVideoSizes", "Landroid/graphics/PathIterator;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PathIteratorApi34Impl extends androidx.graphics.path.PathIteratorImpl {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.graphics.path.ConicConverter Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.graphics.PathIterator getHighResolutionOutputSizeshNQ4ISI;

    public /* synthetic */ PathIteratorApi34Impl(android.graphics.Path path, androidx.graphics.path.PathIterator.ConicEvaluation conicEvaluation, float f, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(path, (i & 2) != 0 ? androidx.graphics.path.PathIterator.ConicEvaluation.AsQuadratics : conicEvaluation, (i & 4) != 0 ? 0.25f : f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathIteratorApi34Impl(android.graphics.Path path, androidx.graphics.path.PathIterator.ConicEvaluation conicEvaluation, float f) {
        super(path, conicEvaluation, f);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conicEvaluation, "");
        android.graphics.PathIterator pathIterator = path.getPathIterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathIterator, "");
        this.getHighResolutionOutputSizeshNQ4ISI = pathIterator;
        this.Camera2StreamConfigurationMap = new androidx.graphics.path.ConicConverter();
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public final int calculateSize(boolean includeConvertedConics) {
        boolean z = includeConvertedConics && getConicEvaluation() == androidx.graphics.path.PathIterator.ConicEvaluation.AsQuadratics;
        android.graphics.PathIterator pathIterator = getPath().getPathIterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathIterator, "");
        float[] fArr = new float[8];
        int i = 0;
        while (pathIterator.hasNext()) {
            if (pathIterator.next(fArr, 0) == 3 && z) {
                androidx.graphics.path.ConicConverter conicConverter = this.Camera2StreamConfigurationMap;
                androidx.graphics.path.ConicConverter.convert$default(conicConverter, fArr, fArr[6], getTolerance(), 0, 8, null);
                i += conicConverter.getQuadraticCount();
            } else {
                i++;
            }
        }
        return i;
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public final androidx.graphics.path.PathSegment.Type next(float[] points, int offset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(points, "");
        if (this.Camera2StreamConfigurationMap.getCurrentQuadratic() < this.Camera2StreamConfigurationMap.getQuadraticCount()) {
            this.Camera2StreamConfigurationMap.nextQuadratic(points, offset);
            return androidx.graphics.path.PathSegment.Type.Quadratic;
        }
        androidx.graphics.path.PathSegment.Type access$platformToAndroidXSegmentType = androidx.graphics.path.PathIteratorImplKt.access$platformToAndroidXSegmentType(this.getHighResolutionOutputSizeshNQ4ISI.next(points, offset));
        if (access$platformToAndroidXSegmentType != androidx.graphics.path.PathSegment.Type.Conic || getConicEvaluation() != androidx.graphics.path.PathIterator.ConicEvaluation.AsQuadratics) {
            return access$platformToAndroidXSegmentType;
        }
        androidx.graphics.path.ConicConverter conicConverter = this.Camera2StreamConfigurationMap;
        conicConverter.convert(points, points[offset + 6], getTolerance(), offset);
        if (conicConverter.getQuadraticCount() > 0) {
            conicConverter.nextQuadratic(points, offset);
        }
        return androidx.graphics.path.PathSegment.Type.Quadratic;
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public final boolean hasNext() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hasNext();
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public final androidx.graphics.path.PathSegment.Type peek() {
        return androidx.graphics.path.PathIteratorImplKt.access$platformToAndroidXSegmentType(this.getHighResolutionOutputSizeshNQ4ISI.peek());
    }
}
