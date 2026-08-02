package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014"}, d2 = {"Landroidx/compose/ui/layout/InnerRectRulers;", "Landroidx/compose/ui/layout/RectRulers;", "", "p0", "<init>", "([Landroidx/compose/ui/layout/RectRulers;)V", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "[Landroidx/compose/ui/layout/RectRulers;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/layout/VerticalRuler;", "Landroidx/compose/ui/layout/VerticalRuler;", "getLeft", "()Landroidx/compose/ui/layout/VerticalRuler;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/layout/HorizontalRuler;", "Landroidx/compose/ui/layout/HorizontalRuler;", "getTop", "()Landroidx/compose/ui/layout/HorizontalRuler;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "getRight", "getBottom"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class InnerRectRulers implements androidx.compose.ui.layout.RectRulers {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.layout.HorizontalRuler getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.layout.RectRulers[] getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.layout.HorizontalRuler getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.ui.layout.VerticalRuler Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.ui.layout.VerticalRuler getHighResolutionOutputSizeshNQ4ISI;

    public InnerRectRulers(androidx.compose.ui.layout.RectRulers[] rectRulersArr) {
        this.getHighSpeedVideoFpsRangesFor = rectRulersArr;
        androidx.compose.ui.layout.VerticalRuler.Companion companion = androidx.compose.ui.layout.VerticalRuler.INSTANCE;
        int length = rectRulersArr.length;
        androidx.compose.ui.layout.VerticalRuler[] verticalRulerArr = new androidx.compose.ui.layout.VerticalRuler[length];
        for (int i = 0; i < length; i++) {
            verticalRulerArr[i] = this.getHighSpeedVideoFpsRangesFor[i].getCamera2StreamConfigurationMap();
        }
        this.Camera2StreamConfigurationMap = companion.maxOf(verticalRulerArr);
        androidx.compose.ui.layout.HorizontalRuler.Companion companion2 = androidx.compose.ui.layout.HorizontalRuler.INSTANCE;
        int length2 = this.getHighSpeedVideoFpsRangesFor.length;
        androidx.compose.ui.layout.HorizontalRuler[] horizontalRulerArr = new androidx.compose.ui.layout.HorizontalRuler[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            horizontalRulerArr[i2] = this.getHighSpeedVideoFpsRangesFor[i2].getGetHighSpeedVideoFpsRanges();
        }
        this.getHighSpeedVideoFpsRanges = companion2.maxOf(horizontalRulerArr);
        androidx.compose.ui.layout.VerticalRuler.Companion companion3 = androidx.compose.ui.layout.VerticalRuler.INSTANCE;
        int length3 = this.getHighSpeedVideoFpsRangesFor.length;
        androidx.compose.ui.layout.VerticalRuler[] verticalRulerArr2 = new androidx.compose.ui.layout.VerticalRuler[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            verticalRulerArr2[i3] = this.getHighSpeedVideoFpsRangesFor[i3].getGetHighResolutionOutputSizeshNQ4ISI();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = companion3.minOf(verticalRulerArr2);
        androidx.compose.ui.layout.HorizontalRuler.Companion companion4 = androidx.compose.ui.layout.HorizontalRuler.INSTANCE;
        int length4 = this.getHighSpeedVideoFpsRangesFor.length;
        androidx.compose.ui.layout.HorizontalRuler[] horizontalRulerArr2 = new androidx.compose.ui.layout.HorizontalRuler[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            horizontalRulerArr2[i4] = this.getHighSpeedVideoFpsRangesFor[i4].getGetHighSpeedVideoSizes();
        }
        this.getHighSpeedVideoSizes = companion4.minOf(horizontalRulerArr2);
    }

    @Override // androidx.compose.ui.layout.RectRulers
    /* renamed from: getLeft, reason: from getter */
    public final androidx.compose.ui.layout.VerticalRuler getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.ui.layout.RectRulers
    /* renamed from: getTop, reason: from getter */
    public final androidx.compose.ui.layout.HorizontalRuler getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.ui.layout.RectRulers
    /* renamed from: getRight, reason: from getter */
    public final androidx.compose.ui.layout.VerticalRuler getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.compose.ui.layout.RectRulers
    /* renamed from: getBottom, reason: from getter */
    public final androidx.compose.ui.layout.HorizontalRuler getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String toString() {
        return kotlin.collections.ArraysKt.joinToString$default(this.getHighSpeedVideoFpsRangesFor, (java.lang.CharSequence) null, "innermostOf(", ")", 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 57, (java.lang.Object) null);
    }
}
