package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0006\u001a\u00020\t8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR!\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0011j\b\u0012\u0004\u0012\u00020\r`\u00128\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0011j\b\u0012\u0004\u0012\u00020\r`\u00128\u0006¢\u0006\u0006\n\u0004\b\b\u0010\u0014"}, d2 = {"Landroidx/compose/ui/platform/FocusSorter;", "", "<init>", "()V", "Landroidx/collection/MutableObjectList;", "Landroid/graphics/Rect;", "getHighSpeedVideoSizes", "Landroidx/collection/MutableObjectList;", "getHighSpeedVideoFpsRangesFor", "", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "Landroidx/collection/MutableScatterMap;", "Landroid/view/View;", "getHighSpeedVideoFpsRanges", "Landroidx/collection/MutableScatterMap;", "Camera2StreamConfigurationMap", "Ljava/util/Comparator;", "Lkotlin/getOutputStallDuration;", "getOutputMinFrameDuration", "Ljava/util/Comparator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FocusSorter {
    public static final androidx.compose.ui.platform.FocusSorter INSTANCE = new androidx.compose.ui.platform.FocusSorter();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final androidx.collection.MutableObjectList<android.graphics.Rect> getHighSpeedVideoFpsRangesFor = new androidx.collection.MutableObjectList<>(0, 1, null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    public static int getHighSpeedVideoSizes = 1;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final androidx.collection.MutableScatterMap<android.view.View, android.graphics.Rect> Camera2StreamConfigurationMap = androidx.collection.ScatterMapKt.mutableScatterMapOf();

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private static final java.util.Comparator<android.view.View> getHighSpeedVideoFpsRanges = new java.util.Comparator() { // from class: androidx.compose.ui.platform.FocusSorter$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return androidx.compose.ui.platform.FocusSorter.getHighResolutionOutputSizeshNQ4ISI((android.view.View) obj, (android.view.View) obj2);
        }
    };

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.util.Comparator<android.view.View> getHighResolutionOutputSizeshNQ4ISI = new java.util.Comparator() { // from class: androidx.compose.ui.platform.FocusSorter$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return androidx.compose.ui.platform.FocusSorter.getHighSpeedVideoSizes((android.view.View) obj, (android.view.View) obj2);
        }
    };

    private FocusSorter() {
    }

    public static /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI(android.view.View view, android.view.View view2) {
        if (view == view2) {
            return 0;
        }
        androidx.collection.MutableScatterMap<android.view.View, android.graphics.Rect> mutableScatterMap = Camera2StreamConfigurationMap;
        android.graphics.Rect rect = mutableScatterMap.get(view);
        kotlin.jvm.internal.Intrinsics.checkNotNull(rect);
        android.graphics.Rect rect2 = rect;
        android.graphics.Rect rect3 = mutableScatterMap.get(view2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(rect3);
        android.graphics.Rect rect4 = rect3;
        int i = rect2.top - rect4.top;
        return i == 0 ? rect2.bottom - rect4.bottom : i;
    }

    public static /* synthetic */ int getHighSpeedVideoSizes(android.view.View view, android.view.View view2) {
        if (view == view2) {
            return 0;
        }
        androidx.collection.MutableScatterMap<android.view.View, android.graphics.Rect> mutableScatterMap = Camera2StreamConfigurationMap;
        android.graphics.Rect rect = mutableScatterMap.get(view);
        kotlin.jvm.internal.Intrinsics.checkNotNull(rect);
        android.graphics.Rect rect2 = rect;
        android.graphics.Rect rect3 = mutableScatterMap.get(view2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(rect3);
        android.graphics.Rect rect4 = rect3;
        int i = rect2.left - rect4.left;
        if (i == 0) {
            return (rect2.right - rect4.right) * getHighSpeedVideoSizes;
        }
        return i * getHighSpeedVideoSizes;
    }
}
