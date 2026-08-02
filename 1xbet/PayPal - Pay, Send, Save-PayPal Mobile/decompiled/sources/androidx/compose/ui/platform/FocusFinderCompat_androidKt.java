package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a%\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u0007\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005\u001a1\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0004\u0010\n\u001a3\u0010\u000b\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a3\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0016\u0010\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00000\rj\b\u0012\u0004\u0012\u00020\u0000`\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroid/view/View;", "p0", "", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/view/View;Landroid/view/View;I)Landroid/view/View;", "p2", "getHighSpeedVideoSizes", "Lkotlin/Function1;", "", "(Landroid/view/View;Landroid/view/View;Lkotlin/jvm/functions/Function1;)Landroid/view/View;", "Camera2StreamConfigurationMap", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;Landroid/view/View;)Landroid/view/View;", "Ljava/util/ArrayList;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "", "getHighSpeedVideoFpsRanges", "(Landroid/view/View;Ljava/util/ArrayList;I)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FocusFinderCompat_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final android.view.View getHighResolutionOutputSizeshNQ4ISI(final android.view.View view, final android.view.View view2, int i) {
        int nextFocusForwardId;
        if (i == 1) {
            if (view.getId() == -1) {
                return null;
            }
            return getHighResolutionOutputSizeshNQ4ISI(view2, view, new kotlin.jvm.functions.Function1<android.view.View, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.FocusFinderCompat_androidKt$findUserSetNextFocus$1
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.Boolean invoke(android.view.View view3) {
                    android.view.View highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.ui.platform.FocusFinderCompat_androidKt.getHighSpeedVideoSizes(view2, view3, view3.getNextFocusForwardId());
                    return java.lang.Boolean.valueOf(highSpeedVideoSizes == view);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
        }
        if (i == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
            return getHighSpeedVideoSizes(view2, view, nextFocusForwardId);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.view.View getHighSpeedVideoSizes(android.view.View view, android.view.View view2, final int i) {
        return getHighResolutionOutputSizeshNQ4ISI(view, view2, new kotlin.jvm.functions.Function1<android.view.View, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.FocusFinderCompat_androidKt$findViewInsideOutShouldExist$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(android.view.View view3) {
                return java.lang.Boolean.valueOf(view3.getId() == i);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final android.view.View getHighResolutionOutputSizeshNQ4ISI(android.view.View view, android.view.View view2, kotlin.jvm.functions.Function1<? super android.view.View, java.lang.Boolean> function1) {
        android.view.View view3 = null;
        while (true) {
            android.view.View Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(view2, function1, view3);
            if (Camera2StreamConfigurationMap != null || view2 == view) {
                break;
            }
            java.lang.Object parent = view2.getParent();
            if (parent == null || !(parent instanceof android.view.View)) {
                break;
            }
            android.view.View view4 = (android.view.View) parent;
            view3 = view2;
            view2 = view4;
        }
        return null;
    }

    private static final android.view.View Camera2StreamConfigurationMap(android.view.View view, kotlin.jvm.functions.Function1<? super android.view.View, java.lang.Boolean> function1, android.view.View view2) {
        android.view.View Camera2StreamConfigurationMap;
        if (function1.invoke(view).booleanValue()) {
            return view;
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if (childAt != view2 && (Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(childAt, function1, view2)) != null) {
                return Camera2StreamConfigurationMap;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRanges(android.view.View view, java.util.ArrayList<android.view.View> arrayList, int i) {
        view.addFocusables(arrayList, i, view.isInTouchMode() ? 1 : 0);
    }
}
