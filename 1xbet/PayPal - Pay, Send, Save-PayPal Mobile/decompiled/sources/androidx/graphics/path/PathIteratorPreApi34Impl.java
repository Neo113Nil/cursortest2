package androidx.graphics.path;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000fH\u0082 ¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000fH\u0083 ¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\fH\u0083 ¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0083 ¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0083 ¢\u0006\u0004\b#\u0010\"J\u0018\u0010$\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0083 ¢\u0006\u0004\b$\u0010\"J\u001f\u0010&\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020%H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+"}, d2 = {"Landroidx/graphics/path/PathIteratorPreApi34Impl;", "Landroidx/graphics/path/PathIteratorImpl;", "Landroid/graphics/Path;", "path", "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "conicEvaluation", "", "tolerance", "<init>", "(Landroid/graphics/Path;Landroidx/graphics/path/PathIterator$ConicEvaluation;F)V", "", "includeConvertedConics", "", "calculateSize", "(Z)I", "", "createInternalPathIterator", "(Landroid/graphics/Path;IF)J", "internalPathIterator", "", "destroyInternalPathIterator", "(J)V", "finalize", "()V", "hasNext", "()Z", "internalPathIteratorHasNext", "(J)Z", "", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "offset", "internalPathIteratorNext", "(J[FI)I", "internalPathIteratorPeek", "(J)I", "internalPathIteratorRawSize", "internalPathIteratorSize", "Landroidx/graphics/path/PathSegment$Type;", io.ktor.http.LinkHeader.Rel.Next, "([FI)Landroidx/graphics/path/PathSegment$Type;", "peek", "()Landroidx/graphics/path/PathSegment$Type;", "getHighResolutionOutputSizeshNQ4ISI", "J", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PathIteratorPreApi34Impl extends androidx.graphics.path.PathIteratorImpl {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRangesFor;

    private final native long createInternalPathIterator(android.graphics.Path path, int conicEvaluation, float tolerance);

    private final native void destroyInternalPathIterator(long internalPathIterator);

    private final native boolean internalPathIteratorHasNext(long internalPathIterator);

    private final native int internalPathIteratorNext(long internalPathIterator, float[] points, int offset);

    private final native int internalPathIteratorPeek(long internalPathIterator);

    private final native int internalPathIteratorRawSize(long internalPathIterator);

    private final native int internalPathIteratorSize(long internalPathIterator);

    public /* synthetic */ PathIteratorPreApi34Impl(android.graphics.Path path, androidx.graphics.path.PathIterator.ConicEvaluation conicEvaluation, float f, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(path, (i & 2) != 0 ? androidx.graphics.path.PathIterator.ConicEvaluation.AsQuadratics : conicEvaluation, (i & 4) != 0 ? 0.25f : f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathIteratorPreApi34Impl(android.graphics.Path path, androidx.graphics.path.PathIterator.ConicEvaluation conicEvaluation, float f) {
        super(path, conicEvaluation, f);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conicEvaluation, "");
        this.getHighSpeedVideoFpsRangesFor = createInternalPathIterator(path, conicEvaluation.ordinal(), f);
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public final int calculateSize(boolean includeConvertedConics) {
        if (!includeConvertedConics || getConicEvaluation() == androidx.graphics.path.PathIterator.ConicEvaluation.AsConic) {
            return internalPathIteratorRawSize(this.getHighSpeedVideoFpsRangesFor);
        }
        return internalPathIteratorSize(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public final boolean hasNext() {
        return internalPathIteratorHasNext(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public final androidx.graphics.path.PathSegment.Type peek() {
        androidx.graphics.path.PathSegment.Type[] typeArr;
        typeArr = androidx.graphics.path.PathIteratorImplKt.getHighSpeedVideoFpsRanges;
        return typeArr[internalPathIteratorPeek(this.getHighSpeedVideoFpsRangesFor)];
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public final androidx.graphics.path.PathSegment.Type next(float[] points, int offset) {
        androidx.graphics.path.PathSegment.Type[] typeArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(points, "");
        typeArr = androidx.graphics.path.PathIteratorImplKt.getHighSpeedVideoFpsRanges;
        return typeArr[internalPathIteratorNext(this.getHighSpeedVideoFpsRangesFor, points, offset)];
    }

    protected final void finalize() {
        destroyInternalPathIterator(this.getHighSpeedVideoFpsRangesFor);
    }
}
