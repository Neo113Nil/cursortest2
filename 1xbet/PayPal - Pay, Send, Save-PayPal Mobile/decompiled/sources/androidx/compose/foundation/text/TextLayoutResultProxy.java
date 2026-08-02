package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0000¢\u0006\u0004\b \u0010\u001eJ\u0013\u0010\"\u001a\u00020\t*\u00020\tH\u0002¢\u0006\u0004\b\"\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010&\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*"}, d2 = {"Landroidx/compose/foundation/text/TextLayoutResultProxy;", "", "Landroidx/compose/ui/text/TextLayoutResult;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/ui/layout/LayoutCoordinates;", "innerTextFieldCoordinates", "decorationBoxCoordinates", "<init>", "(Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/geometry/Offset;", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "coerceInVisibleBounds", "", "getOffsetForPosition-3MmeM6k", "(JZ)I", "getOffsetForPosition", "", "vertical", "getLineForVerticalPosition", "(F)I", "lineIndex", "visibleEnd", "getLineEnd", "(IZ)I", "offset", "isPositionOnText-k-4lQ0M", "(J)Z", "isPositionOnText", "translateDecorationToInnerCoordinates-MK-Hz9U$foundation", "(J)J", "translateDecorationToInnerCoordinates", "translateInnerToDecorationCoordinates-MK-Hz9U$foundation", "translateInnerToDecorationCoordinates", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/text/TextLayoutResult;", "getValue", "()Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getInnerTextFieldCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setInnerTextFieldCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "getDecorationBoxCoordinates", "setDecorationBoxCoordinates"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextLayoutResultProxy {
    public static final int $stable = 8;
    private androidx.compose.ui.layout.LayoutCoordinates decorationBoxCoordinates;
    private androidx.compose.ui.layout.LayoutCoordinates innerTextFieldCoordinates;
    private final androidx.compose.ui.text.TextLayoutResult value;

    public TextLayoutResultProxy(androidx.compose.ui.text.TextLayoutResult textLayoutResult, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2) {
        this.value = textLayoutResult;
        this.innerTextFieldCoordinates = layoutCoordinates;
        this.decorationBoxCoordinates = layoutCoordinates2;
    }

    public /* synthetic */ TextLayoutResultProxy(androidx.compose.ui.text.TextLayoutResult textLayoutResult, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(textLayoutResult, (i & 2) != 0 ? null : layoutCoordinates, (i & 4) != 0 ? null : layoutCoordinates2);
    }

    public final androidx.compose.ui.text.TextLayoutResult getValue() {
        return this.value;
    }

    public final androidx.compose.ui.layout.LayoutCoordinates getInnerTextFieldCoordinates() {
        return this.innerTextFieldCoordinates;
    }

    public final void setInnerTextFieldCoordinates(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        this.innerTextFieldCoordinates = layoutCoordinates;
    }

    public final androidx.compose.ui.layout.LayoutCoordinates getDecorationBoxCoordinates() {
        return this.decorationBoxCoordinates;
    }

    public final void setDecorationBoxCoordinates(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        this.decorationBoxCoordinates = layoutCoordinates;
    }

    /* renamed from: getOffsetForPosition-3MmeM6k$default, reason: not valid java name */
    public static /* synthetic */ int m2135getOffsetForPosition3MmeM6k$default(androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxy, long j, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return textLayoutResultProxy.m2136getOffsetForPosition3MmeM6k(j, z);
    }

    /* renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    public final int m2136getOffsetForPosition3MmeM6k(long position, boolean coerceInVisibleBounds) {
        if (coerceInVisibleBounds) {
            position = getHighSpeedVideoFpsRangesFor(position);
        }
        return this.value.m8011getOffsetForPositionk4lQ0M(m2138translateDecorationToInnerCoordinatesMKHz9U$foundation(position));
    }

    public static /* synthetic */ int getLineEnd$default(androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxy, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayoutResultProxy.getLineEnd(i, z);
    }

    public final int getLineEnd(int lineIndex, boolean visibleEnd) {
        return this.value.getLineEnd(lineIndex, visibleEnd);
    }

    /* renamed from: isPositionOnText-k-4lQ0M, reason: not valid java name */
    public final boolean m2137isPositionOnTextk4lQ0M(long offset) {
        long m2138translateDecorationToInnerCoordinatesMKHz9U$foundation = m2138translateDecorationToInnerCoordinatesMKHz9U$foundation(getHighSpeedVideoFpsRangesFor(offset));
        int lineForVerticalPosition = this.value.getLineForVerticalPosition(java.lang.Float.intBitsToFloat((int) (4294967295L & m2138translateDecorationToInnerCoordinatesMKHz9U$foundation)));
        int i = (int) (m2138translateDecorationToInnerCoordinatesMKHz9U$foundation >> 32);
        return java.lang.Float.intBitsToFloat(i) >= this.value.getLineLeft(lineForVerticalPosition) && java.lang.Float.intBitsToFloat(i) <= this.value.getLineRight(lineForVerticalPosition);
    }

    /* renamed from: translateDecorationToInnerCoordinates-MK-Hz9U$foundation, reason: not valid java name */
    public final long m2138translateDecorationToInnerCoordinatesMKHz9U$foundation(long offset) {
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2 = this.innerTextFieldCoordinates;
        if (layoutCoordinates2 == null) {
            return offset;
        }
        if (!layoutCoordinates2.isAttached()) {
            layoutCoordinates2 = null;
        }
        if (layoutCoordinates2 == null || (layoutCoordinates = this.decorationBoxCoordinates) == null) {
            return offset;
        }
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates3 = layoutCoordinates.isAttached() ? layoutCoordinates : null;
        return layoutCoordinates3 == null ? offset : layoutCoordinates2.mo7362localPositionOfR5De75A(layoutCoordinates3, offset);
    }

    /* renamed from: translateInnerToDecorationCoordinates-MK-Hz9U$foundation, reason: not valid java name */
    public final long m2139translateInnerToDecorationCoordinatesMKHz9U$foundation(long offset) {
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2 = this.innerTextFieldCoordinates;
        if (layoutCoordinates2 == null) {
            return offset;
        }
        if (!layoutCoordinates2.isAttached()) {
            layoutCoordinates2 = null;
        }
        if (layoutCoordinates2 == null || (layoutCoordinates = this.decorationBoxCoordinates) == null) {
            return offset;
        }
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates3 = layoutCoordinates.isAttached() ? layoutCoordinates : null;
        return layoutCoordinates3 == null ? offset : layoutCoordinates3.mo7362localPositionOfR5De75A(layoutCoordinates2, offset);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r2 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long getHighSpeedVideoFpsRangesFor(long j) {
        androidx.compose.ui.geometry.Rect zero;
        long highSpeedVideoFpsRangesFor;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = this.innerTextFieldCoordinates;
        if (layoutCoordinates != null) {
            if (layoutCoordinates.isAttached()) {
                androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2 = this.decorationBoxCoordinates;
                zero = null;
                if (layoutCoordinates2 != null) {
                    zero = androidx.compose.ui.layout.LayoutCoordinates.localBoundingBoxOf$default(layoutCoordinates2, layoutCoordinates, false, 2, null);
                }
            } else {
                zero = androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
            }
        }
        zero = androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
        highSpeedVideoFpsRangesFor = androidx.compose.foundation.text.TextLayoutResultProxyKt.getHighSpeedVideoFpsRangesFor(j, zero);
        return highSpeedVideoFpsRangesFor;
    }

    public final int getLineForVerticalPosition(float vertical) {
        return this.value.getLineForVerticalPosition(java.lang.Float.intBitsToFloat((int) (m2138translateDecorationToInnerCoordinatesMKHz9U$foundation(getHighSpeedVideoFpsRangesFor(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(vertical) & 4294967295L)))) & 4294967295L)));
    }
}
