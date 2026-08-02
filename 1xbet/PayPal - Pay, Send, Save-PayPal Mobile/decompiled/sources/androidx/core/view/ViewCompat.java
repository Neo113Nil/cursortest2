package androidx.core.view;

/* loaded from: classes.dex */
public class ViewCompat {
    public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = 2;
    public static final int ACCESSIBILITY_LIVE_REGION_NONE = 0;
    public static final int ACCESSIBILITY_LIVE_REGION_POLITE = 1;
    private static java.lang.reflect.Field Camera2StreamConfigurationMap = null;

    @java.lang.Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;

    @java.lang.Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;

    @java.lang.Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = 4;

    @java.lang.Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_AUTO = 0;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO = 2;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO_EXCLUDE_DESCENDANTS = 8;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES_EXCLUDE_DESCENDANTS = 4;

    @java.lang.Deprecated
    public static final int LAYER_TYPE_HARDWARE = 2;

    @java.lang.Deprecated
    public static final int LAYER_TYPE_NONE = 0;

    @java.lang.Deprecated
    public static final int LAYER_TYPE_SOFTWARE = 1;

    @java.lang.Deprecated
    public static final int LAYOUT_DIRECTION_INHERIT = 2;

    @java.lang.Deprecated
    public static final int LAYOUT_DIRECTION_LOCALE = 3;

    @java.lang.Deprecated
    public static final int LAYOUT_DIRECTION_LTR = 0;

    @java.lang.Deprecated
    public static final int LAYOUT_DIRECTION_RTL = 1;

    @java.lang.Deprecated
    public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;

    @java.lang.Deprecated
    public static final int MEASURED_SIZE_MASK = 16777215;

    @java.lang.Deprecated
    public static final int MEASURED_STATE_MASK = -16777216;

    @java.lang.Deprecated
    public static final int MEASURED_STATE_TOO_SMALL = 16777216;

    @java.lang.Deprecated
    public static final int OVER_SCROLL_ALWAYS = 0;

    @java.lang.Deprecated
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;

    @java.lang.Deprecated
    public static final int OVER_SCROLL_NEVER = 2;
    public static final int SCROLL_AXIS_HORIZONTAL = 1;
    public static final int SCROLL_AXIS_NONE = 0;
    public static final int SCROLL_AXIS_VERTICAL = 2;
    public static final int SCROLL_INDICATOR_BOTTOM = 2;
    public static final int SCROLL_INDICATOR_END = 32;
    public static final int SCROLL_INDICATOR_LEFT = 4;
    public static final int SCROLL_INDICATOR_RIGHT = 8;
    public static final int SCROLL_INDICATOR_START = 16;
    public static final int SCROLL_INDICATOR_TOP = 1;
    public static final int TYPE_NON_TOUCH = 1;
    public static final int TYPE_TOUCH = 0;
    private static boolean getHighResolutionOutputSizeshNQ4ISI = false;
    private static java.util.WeakHashMap<android.view.View, androidx.core.view.ViewPropertyAnimatorCompat> getHighSpeedVideoSizesFor = null;
    private static boolean getInputFormats = true;
    private static java.lang.reflect.Method getOutputFormats;
    private static final int[] getHighSpeedVideoSizes = {androidx.core.R.id.accessibility_custom_action_0, androidx.core.R.id.accessibility_custom_action_1, androidx.core.R.id.accessibility_custom_action_2, androidx.core.R.id.accessibility_custom_action_3, androidx.core.R.id.accessibility_custom_action_4, androidx.core.R.id.accessibility_custom_action_5, androidx.core.R.id.accessibility_custom_action_6, androidx.core.R.id.accessibility_custom_action_7, androidx.core.R.id.accessibility_custom_action_8, androidx.core.R.id.accessibility_custom_action_9, androidx.core.R.id.accessibility_custom_action_10, androidx.core.R.id.accessibility_custom_action_11, androidx.core.R.id.accessibility_custom_action_12, androidx.core.R.id.accessibility_custom_action_13, androidx.core.R.id.accessibility_custom_action_14, androidx.core.R.id.accessibility_custom_action_15, androidx.core.R.id.accessibility_custom_action_16, androidx.core.R.id.accessibility_custom_action_17, androidx.core.R.id.accessibility_custom_action_18, androidx.core.R.id.accessibility_custom_action_19, androidx.core.R.id.accessibility_custom_action_20, androidx.core.R.id.accessibility_custom_action_21, androidx.core.R.id.accessibility_custom_action_22, androidx.core.R.id.accessibility_custom_action_23, androidx.core.R.id.accessibility_custom_action_24, androidx.core.R.id.accessibility_custom_action_25, androidx.core.R.id.accessibility_custom_action_26, androidx.core.R.id.accessibility_custom_action_27, androidx.core.R.id.accessibility_custom_action_28, androidx.core.R.id.accessibility_custom_action_29, androidx.core.R.id.accessibility_custom_action_30, androidx.core.R.id.accessibility_custom_action_31};
    private static final androidx.core.view.OnReceiveContentViewBehavior getHighSpeedVideoFpsRanges = new androidx.core.view.OnReceiveContentViewBehavior() { // from class: androidx.core.view.ViewCompat$$ExternalSyntheticLambda0
        @Override // androidx.core.view.OnReceiveContentViewBehavior
        public final androidx.core.view.ContentInfoCompat onReceiveContent(androidx.core.view.ContentInfoCompat contentInfoCompat) {
            return androidx.core.view.ViewCompat.Camera2StreamConfigurationMap(contentInfoCompat);
        }
    };
    private static final androidx.core.view.ViewCompat.AccessibilityPaneVisibilityManager getHighSpeedVideoFpsRangesFor = new androidx.core.view.ViewCompat.AccessibilityPaneVisibilityManager();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface FocusDirection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface FocusRealDirection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface FocusRelativeDirection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface NestedScrollType {
    }

    /* loaded from: classes3.dex */
    public interface OnUnhandledKeyEventListenerCompat {
        boolean onUnhandledKeyEvent(android.view.View view, android.view.KeyEvent keyEvent);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ScrollAxis {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ScrollIndicators {
    }

    static /* synthetic */ androidx.core.view.ContentInfoCompat Camera2StreamConfigurationMap(androidx.core.view.ContentInfoCompat contentInfoCompat) {
        return contentInfoCompat;
    }

    public static void saveAttributeDataForStyleable(android.view.View view, android.content.Context context, int[] iArr, android.util.AttributeSet attributeSet, android.content.res.TypedArray typedArray, int i, int i2) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.view.ViewCompat.Api29Impl.getHighSpeedVideoSizes(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    @androidx.annotation.ReplaceWith(expression = "view.canScrollHorizontally(direction)")
    @java.lang.Deprecated
    public static boolean canScrollHorizontally(android.view.View view, int i) {
        return view.canScrollHorizontally(i);
    }

    @androidx.annotation.ReplaceWith(expression = "view.canScrollVertically(direction)")
    @java.lang.Deprecated
    public static boolean canScrollVertically(android.view.View view, int i) {
        return view.canScrollVertically(i);
    }

    @androidx.annotation.ReplaceWith(expression = "view.getOverScrollMode()")
    @java.lang.Deprecated
    public static int getOverScrollMode(android.view.View view) {
        return view.getOverScrollMode();
    }

    @androidx.annotation.ReplaceWith(expression = "view.setOverScrollMode(overScrollMode)")
    @java.lang.Deprecated
    public static void setOverScrollMode(android.view.View view, int i) {
        view.setOverScrollMode(i);
    }

    @androidx.annotation.ReplaceWith(expression = "v.onPopulateAccessibilityEvent(event)")
    @java.lang.Deprecated
    public static void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @androidx.annotation.ReplaceWith(expression = "v.onInitializeAccessibilityEvent(event)")
    @java.lang.Deprecated
    public static void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @androidx.annotation.ReplaceWith(expression = "v.onInitializeAccessibilityNodeInfo(info.unwrap())")
    @java.lang.Deprecated
    public static void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat.unwrap());
    }

    public static void setAccessibilityDelegate(android.view.View view, androidx.core.view.AccessibilityDelegateCompat accessibilityDelegateCompat) {
        if (accessibilityDelegateCompat == null && (getHighResolutionOutputSizeshNQ4ISI(view) instanceof androidx.core.view.AccessibilityDelegateCompat.AccessibilityDelegateAdapter)) {
            accessibilityDelegateCompat = new androidx.core.view.AccessibilityDelegateCompat();
        }
        getHighSpeedVideoSizesFor(view);
        view.setAccessibilityDelegate(accessibilityDelegateCompat == null ? null : accessibilityDelegateCompat.getBridge());
    }

    public static void setAutofillHints(android.view.View view, java.lang.String... strArr) {
        androidx.core.view.ViewCompat.Api26Impl.Camera2StreamConfigurationMap(view, strArr);
    }

    public static int getImportantForAutofill(android.view.View view) {
        return androidx.core.view.ViewCompat.Api26Impl.getHighResolutionOutputSizeshNQ4ISI(view);
    }

    public static void setImportantForAutofill(android.view.View view, int i) {
        androidx.core.view.ViewCompat.Api26Impl.getHighSpeedVideoFpsRanges(view, i);
    }

    public static boolean isImportantForAutofill(android.view.View view) {
        return androidx.core.view.ViewCompat.Api26Impl.getHighSpeedVideoSizesFor(view);
    }

    public static androidx.core.view.autofill.AutofillIdCompat getAutofillId(android.view.View view) {
        return androidx.core.view.autofill.AutofillIdCompat.toAutofillIdCompat(androidx.core.view.ViewCompat.Api26Impl.getHighSpeedVideoFpsRanges(view));
    }

    public static void setAutofillId(android.view.View view, androidx.core.view.autofill.AutofillIdCompat autofillIdCompat) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.core.view.ViewCompat.Api28Impl.getHighSpeedVideoFpsRanges(view, autofillIdCompat);
        }
    }

    public static void setImportantForContentCapture(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            androidx.core.view.ViewCompat.Api30Impl.getHighSpeedVideoFpsRanges(view, i);
        }
    }

    public static int getImportantForContentCapture(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.view.ViewCompat.Api30Impl.Camera2StreamConfigurationMap(view);
        }
        return 0;
    }

    public static boolean isImportantForContentCapture(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.view.ViewCompat.Api30Impl.getHighSpeedVideoSizes(view);
        }
        return false;
    }

    public static androidx.core.view.contentcapture.ContentCaptureSessionCompat getContentCaptureSession(android.view.View view) {
        android.view.contentcapture.ContentCaptureSession cA_;
        if (android.os.Build.VERSION.SDK_INT < 29 || (cA_ = androidx.core.view.ViewCompat.Api29Impl.cA_(view)) == null) {
            return null;
        }
        return androidx.core.view.contentcapture.ContentCaptureSessionCompat.toContentCaptureSessionCompat(cA_, view);
    }

    public static void setContentCaptureSession(android.view.View view, androidx.core.view.contentcapture.ContentCaptureSessionCompat contentCaptureSessionCompat) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.view.ViewCompat.Api29Impl.getHighResolutionOutputSizeshNQ4ISI(view, contentCaptureSessionCompat);
        }
    }

    public static boolean hasAccessibilityDelegate(android.view.View view) {
        return getHighResolutionOutputSizeshNQ4ISI(view) != null;
    }

    public static androidx.core.view.AccessibilityDelegateCompat getAccessibilityDelegate(android.view.View view) {
        android.view.View.AccessibilityDelegate highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(view);
        if (highResolutionOutputSizeshNQ4ISI == null) {
            return null;
        }
        if (highResolutionOutputSizeshNQ4ISI instanceof androidx.core.view.AccessibilityDelegateCompat.AccessibilityDelegateAdapter) {
            return ((androidx.core.view.AccessibilityDelegateCompat.AccessibilityDelegateAdapter) highResolutionOutputSizeshNQ4ISI).Camera2StreamConfigurationMap;
        }
        return new androidx.core.view.AccessibilityDelegateCompat(highResolutionOutputSizeshNQ4ISI);
    }

    static void getHighSpeedVideoSizes(android.view.View view) {
        androidx.core.view.AccessibilityDelegateCompat accessibilityDelegate = getAccessibilityDelegate(view);
        if (accessibilityDelegate == null) {
            accessibilityDelegate = new androidx.core.view.AccessibilityDelegateCompat();
        }
        setAccessibilityDelegate(view, accessibilityDelegate);
    }

    private static android.view.View.AccessibilityDelegate getHighResolutionOutputSizeshNQ4ISI(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.core.view.ViewCompat.Api29Impl.getHighSpeedVideoFpsRangesFor(view);
        }
        return Camera2StreamConfigurationMap(view);
    }

    private static android.view.View.AccessibilityDelegate Camera2StreamConfigurationMap(android.view.View view) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            return null;
        }
        if (Camera2StreamConfigurationMap == null) {
            try {
                java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mAccessibilityDelegate");
                Camera2StreamConfigurationMap = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.Throwable unused) {
                getHighResolutionOutputSizeshNQ4ISI = true;
                return null;
            }
        }
        try {
            java.lang.Object obj = Camera2StreamConfigurationMap.get(view);
            if (obj instanceof android.view.View.AccessibilityDelegate) {
                return (android.view.View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (java.lang.Throwable unused2) {
            getHighResolutionOutputSizeshNQ4ISI = true;
            return null;
        }
    }

    @androidx.annotation.ReplaceWith(expression = "view.hasTransientState()")
    @java.lang.Deprecated
    public static boolean hasTransientState(android.view.View view) {
        return view.hasTransientState();
    }

    @androidx.annotation.ReplaceWith(expression = "view.setHasTransientState(hasTransientState)")
    @java.lang.Deprecated
    public static void setHasTransientState(android.view.View view, boolean z) {
        view.setHasTransientState(z);
    }

    @androidx.annotation.ReplaceWith(expression = "view.postInvalidateOnAnimation()")
    @java.lang.Deprecated
    public static void postInvalidateOnAnimation(android.view.View view) {
        view.postInvalidateOnAnimation();
    }

    @androidx.annotation.ReplaceWith(expression = "view.postInvalidateOnAnimation(left, top, right, bottom)")
    @java.lang.Deprecated
    public static void postInvalidateOnAnimation(android.view.View view, int i, int i2, int i3, int i4) {
        view.postInvalidateOnAnimation(i, i2, i3, i4);
    }

    @androidx.annotation.ReplaceWith(expression = "view.postOnAnimation(action)")
    @java.lang.Deprecated
    public static void postOnAnimation(android.view.View view, java.lang.Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @androidx.annotation.ReplaceWith(expression = "view.postOnAnimationDelayed(action, delayMillis)")
    @java.lang.Deprecated
    public static void postOnAnimationDelayed(android.view.View view, java.lang.Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    @androidx.annotation.ReplaceWith(expression = "view.getImportantForAccessibility()")
    @java.lang.Deprecated
    public static int getImportantForAccessibility(android.view.View view) {
        return view.getImportantForAccessibility();
    }

    @androidx.annotation.ReplaceWith(expression = "view.setImportantForAccessibility(mode)")
    @java.lang.Deprecated
    public static void setImportantForAccessibility(android.view.View view, int i) {
        view.setImportantForAccessibility(i);
    }

    public static boolean isImportantForAccessibility(android.view.View view) {
        return view.isImportantForAccessibility();
    }

    @androidx.annotation.ReplaceWith(expression = "view.performAccessibilityAction(action, arguments)")
    @java.lang.Deprecated
    public static boolean performAccessibilityAction(android.view.View view, int i, android.os.Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    public static boolean performHapticFeedback(android.view.View view, int i) {
        int highSpeedVideoFpsRangesFor = androidx.core.view.HapticFeedbackConstantsCompat.getHighSpeedVideoFpsRangesFor(i);
        if (highSpeedVideoFpsRangesFor == -1) {
            return false;
        }
        return view.performHapticFeedback(highSpeedVideoFpsRangesFor);
    }

    public static boolean performHapticFeedback(android.view.View view, int i, int i2) {
        int highSpeedVideoFpsRangesFor = androidx.core.view.HapticFeedbackConstantsCompat.getHighSpeedVideoFpsRangesFor(i);
        if (highSpeedVideoFpsRangesFor == -1) {
            return false;
        }
        return view.performHapticFeedback(highSpeedVideoFpsRangesFor, i2);
    }

    public static int addAccessibilityAction(android.view.View view, java.lang.CharSequence charSequence, androidx.core.view.accessibility.AccessibilityViewCommand accessibilityViewCommand) {
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(view, charSequence);
        if (highSpeedVideoFpsRanges != -1) {
            getHighResolutionOutputSizeshNQ4ISI(view, new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(highSpeedVideoFpsRanges, charSequence, accessibilityViewCommand));
        }
        return highSpeedVideoFpsRanges;
    }

    private static int getHighSpeedVideoFpsRanges(android.view.View view, java.lang.CharSequence charSequence) {
        java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(view);
        for (int i = 0; i < highSpeedVideoFpsRanges.size(); i++) {
            if (android.text.TextUtils.equals(charSequence, highSpeedVideoFpsRanges.get(i).getLabel())) {
                return highSpeedVideoFpsRanges.get(i).getId();
            }
        }
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[] iArr = getHighSpeedVideoSizes;
            if (i3 >= iArr.length || i2 != -1) {
                break;
            }
            int i4 = iArr[i3];
            boolean z = true;
            for (int i5 = 0; i5 < highSpeedVideoFpsRanges.size(); i5++) {
                z &= highSpeedVideoFpsRanges.get(i5).getId() != i4;
            }
            if (z) {
                i2 = i4;
            }
            i3++;
        }
        return i2;
    }

    public static void replaceAccessibilityAction(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, java.lang.CharSequence charSequence, androidx.core.view.accessibility.AccessibilityViewCommand accessibilityViewCommand) {
        if (accessibilityViewCommand == null && charSequence == null) {
            removeAccessibilityAction(view, accessibilityActionCompat.getId());
        } else {
            getHighResolutionOutputSizeshNQ4ISI(view, accessibilityActionCompat.createReplacementAction(charSequence, accessibilityViewCommand));
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat) {
        getHighSpeedVideoSizes(view);
        Camera2StreamConfigurationMap(accessibilityActionCompat.getId(), view);
        getHighSpeedVideoFpsRanges(view).add(accessibilityActionCompat);
        getHighResolutionOutputSizeshNQ4ISI(view, 0);
    }

    public static void removeAccessibilityAction(android.view.View view, int i) {
        Camera2StreamConfigurationMap(i, view);
        getHighResolutionOutputSizeshNQ4ISI(view, 0);
    }

    private static void Camera2StreamConfigurationMap(int i, android.view.View view) {
        java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(view);
        for (int i2 = 0; i2 < highSpeedVideoFpsRanges.size(); i2++) {
            if (highSpeedVideoFpsRanges.get(i2).getId() == i) {
                highSpeedVideoFpsRanges.remove(i2);
                return;
            }
        }
    }

    private static java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat> getHighSpeedVideoFpsRanges(android.view.View view) {
        java.util.ArrayList arrayList = (java.util.ArrayList) view.getTag(androidx.core.R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        view.setTag(androidx.core.R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void setStateDescription(android.view.View view, java.lang.CharSequence charSequence) {
        Camera2StreamConfigurationMap().getHighSpeedVideoFpsRangesFor(view, (android.view.View) charSequence);
    }

    public static java.lang.CharSequence getStateDescription(android.view.View view) {
        return Camera2StreamConfigurationMap().getOutputFormats(view);
    }

    public static void enableAccessibleClickableSpanSupport(android.view.View view) {
        getHighSpeedVideoSizes(view);
    }

    public static androidx.core.view.accessibility.AccessibilityNodeProviderCompat getAccessibilityNodeProvider(android.view.View view) {
        android.view.accessibility.AccessibilityNodeProvider accessibilityNodeProvider = view.getAccessibilityNodeProvider();
        if (accessibilityNodeProvider != null) {
            return new androidx.core.view.accessibility.AccessibilityNodeProviderCompat(accessibilityNodeProvider);
        }
        return null;
    }

    @androidx.annotation.ReplaceWith(expression = "view.getAlpha()")
    @java.lang.Deprecated
    public static float getAlpha(android.view.View view) {
        return view.getAlpha();
    }

    @androidx.annotation.ReplaceWith(expression = "view.setLayerType(layerType, paint)")
    @java.lang.Deprecated
    public static void setLayerType(android.view.View view, int i, android.graphics.Paint paint) {
        view.setLayerType(i, paint);
    }

    @androidx.annotation.ReplaceWith(expression = "view.getLayerType()")
    @java.lang.Deprecated
    public static int getLayerType(android.view.View view) {
        return view.getLayerType();
    }

    @androidx.annotation.ReplaceWith(expression = "view.getLabelFor()")
    @java.lang.Deprecated
    public static int getLabelFor(android.view.View view) {
        return view.getLabelFor();
    }

    @androidx.annotation.ReplaceWith(expression = "view.setLabelFor(labeledId)")
    @java.lang.Deprecated
    public static void setLabelFor(android.view.View view, int i) {
        view.setLabelFor(i);
    }

    @androidx.annotation.ReplaceWith(expression = "view.setLayerPaint(paint)")
    @java.lang.Deprecated
    public static void setLayerPaint(android.view.View view, android.graphics.Paint paint) {
        view.setLayerPaint(paint);
    }

    @androidx.annotation.ReplaceWith(expression = "view.getLayoutDirection()")
    @java.lang.Deprecated
    public static int getLayoutDirection(android.view.View view) {
        return view.getLayoutDirection();
    }

    @androidx.annotation.ReplaceWith(expression = "view.setLayoutDirection(layoutDirection)")
    @java.lang.Deprecated
    public static void setLayoutDirection(android.view.View view, int i) {
        view.setLayoutDirection(i);
    }

    @androidx.annotation.ReplaceWith(expression = "view.getParentForAccessibility()")
    @java.lang.Deprecated
    public static android.view.ViewParent getParentForAccessibility(android.view.View view) {
        return view.getParentForAccessibility();
    }

    public static <T extends android.view.View> T requireViewById(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return (T) androidx.core.view.ViewCompat.Api28Impl.getHighSpeedVideoFpsRangesFor(view, i);
        }
        T t = (T) view.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new java.lang.IllegalArgumentException("ID does not reference a View inside this View");
    }

    @androidx.annotation.ReplaceWith(expression = "view.isOpaque()")
    @java.lang.Deprecated
    public static boolean isOpaque(android.view.View view) {
        return view.isOpaque();
    }

    @java.lang.Deprecated
    public static int resolveSizeAndState(int i, int i2, int i3) {
        return android.view.View.resolveSizeAndState(i, i2, i3);
    }

    @androidx.annotation.ReplaceWith(expression = "view.getMeasuredWidthAndState()")
    @java.lang.Deprecated
    public static int getMeasuredWidthAndState(android.view.View view) {
        return view.getMeasuredWidthAndState();
    }

    @androidx.annotation.ReplaceWith(expression = "view.getMeasuredHeightAndState()")
    @java.lang.Deprecated
    public static int getMeasuredHeightAndState(android.view.View view) {
        return view.getMeasuredHeightAndState();
    }

    @androidx.annotation.ReplaceWith(expression = "view.getMeasuredState()")
    @java.lang.Deprecated
    public static int getMeasuredState(android.view.View view) {
        return view.getMeasuredState();
    }

    @java.lang.Deprecated
    public static int combineMeasuredStates(int i, int i2) {
        return android.view.View.combineMeasuredStates(i, i2);
    }

    @androidx.annotation.ReplaceWith(expression = "view.getAccessibilityLiveRegion()")
    @java.lang.Deprecated
    public static int getAccessibilityLiveRegion(android.view.View view) {
        return view.getAccessibilityLiveRegion();
    }

    @androidx.annotation.ReplaceWith(expression = "view.setAccessibilityLiveRegion(mode)")
    @java.lang.Deprecated
    public static void setAccessibilityLiveRegion(android.view.View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    @androidx.annotation.ReplaceWith(expression = "view.getPaddingStart()")
    @java.lang.Deprecated
    public static int getPaddingStart(android.view.View view) {
        return view.getPaddingStart();
    }

    @androidx.annotation.ReplaceWith(expression = "view.getPaddingEnd()")
    @java.lang.Deprecated
    public static int getPaddingEnd(android.view.View view) {
        return view.getPaddingEnd();
    }

    @androidx.annotation.ReplaceWith(expression = "view.setPaddingRelative(start, top, end, bottom)")
    @java.lang.Deprecated
    public static void setPaddingRelative(android.view.View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public static void dispatchStartTemporaryDetach(android.view.View view) {
        androidx.core.view.ViewCompat.Api24Impl.Camera2StreamConfigurationMap(view);
    }

    public static void dispatchFinishTemporaryDetach(android.view.View view) {
        androidx.core.view.ViewCompat.Api24Impl.getHighSpeedVideoSizes(view);
    }

    @androidx.annotation.ReplaceWith(expression = "view.getTranslationX()")
    @java.lang.Deprecated
    public static float getTranslationX(android.view.View view) {
        return view.getTranslationX();
    }

    @androidx.annotation.ReplaceWith(expression = "view.getTranslationY()")
    @java.lang.Deprecated
    public static float getTranslationY(android.view.View view) {
        return view.getTranslationY();
    }

    @androidx.annotation.ReplaceWith(expression = "view.getMatrix()")
    @java.lang.Deprecated
    public static android.graphics.Matrix getMatrix(android.view.View view) {
        return view.getMatrix();
    }

    @androidx.annotation.ReplaceWith(expression = "view.getMinimumWidth()")
    @java.lang.Deprecated
    public static int getMinimumWidth(android.view.View view) {
        return view.getMinimumWidth();
    }

    @androidx.annotation.ReplaceWith(expression = "view.getMinimumHeight()")
    @java.lang.Deprecated
    public static int getMinimumHeight(android.view.View view) {
        return view.getMinimumHeight();
    }

    @java.lang.Deprecated
    public static androidx.core.view.ViewPropertyAnimatorCompat animate(android.view.View view) {
        if (getHighSpeedVideoSizesFor == null) {
            getHighSpeedVideoSizesFor = new java.util.WeakHashMap<>();
        }
        androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = getHighSpeedVideoSizesFor.get(view);
        if (viewPropertyAnimatorCompat != null) {
            return viewPropertyAnimatorCompat;
        }
        androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = new androidx.core.view.ViewPropertyAnimatorCompat(view);
        getHighSpeedVideoSizesFor.put(view, viewPropertyAnimatorCompat2);
        return viewPropertyAnimatorCompat2;
    }

    @androidx.annotation.ReplaceWith(expression = "view.setTranslationX(value)")
    @java.lang.Deprecated
    public static void setTranslationX(android.view.View view, float f) {
        view.setTranslationX(f);
    }

    @androidx.annotation.ReplaceWith(expression = "view.setTranslationY(value)")
    @java.lang.Deprecated
    public static void setTranslationY(android.view.View view, float f) {
        view.setTranslationY(f);
    }

    @androidx.annotation.ReplaceWith(expression = "view.setAlpha(value)")
    @java.lang.Deprecated
    public static void setAlpha(android.view.View view, float f) {
        view.setAlpha(f);
    }

    @androidx.annotation.ReplaceWith(expression = "view.setX(value)")
    @java.lang.Deprecated
    public static void setX(android.view.View view, float f) {
        view.setX(f);
    }

    @androidx.annotation.ReplaceWith(expression = "view.setY(value)")
    @java.lang.Deprecated
    public static void setY(android.view.View view, float f) {
        view.setY(f);
    }

    @androidx.annotation.ReplaceWith(expression = "view.setRotation(value)")
    @java.lang.Deprecated
    public static void setRotation(android.view.View view, float f) {
        view.setRotation(f);
    }

    @androidx.annotation.ReplaceWith(expression = "view.setRotationX(value)")
    @java.lang.Deprecated
    public static void setRotationX(android.view.View view, float f) {
        view.setRotationX(f);
    }

    @androidx.annotation.ReplaceWith(expression = "view.setRotationY(value)")
    @java.lang.Deprecated
    public static void setRotationY(android.view.View view, float f) {
        view.setRotationY(f);
    }

    @androidx.annotation.ReplaceWith(expression = "view.setScaleX(value)")
    @java.lang.Deprecated
    public static void setScaleX(android.view.View view, float f) {
        view.setScaleX(f);
    }

    @androidx.annotation.ReplaceWith(expression = "view.setScaleY(value)")
    @java.lang.Deprecated
    public static void setScaleY(android.view.View view, float f) {
        view.setScaleY(f);
    }

    @androidx.annotation.ReplaceWith(expression = "view.getPivotX()")
    @java.lang.Deprecated
    public static float getPivotX(android.view.View view) {
        return view.getPivotX();
    }

    @androidx.annotation.ReplaceWith(expression = "view.setPivotX(value)")
    @java.lang.Deprecated
    public static void setPivotX(android.view.View view, float f) {
        view.setPivotX(f);
    }

    @androidx.annotation.ReplaceWith(expression = "view.getPivotY()")
    @java.lang.Deprecated
    public static float getPivotY(android.view.View view) {
        return view.getPivotY();
    }

    @androidx.annotation.ReplaceWith(expression = "view.setPivotY(value)")
    @java.lang.Deprecated
    public static void setPivotY(android.view.View view, float f) {
        view.setPivotY(f);
    }

    @androidx.annotation.ReplaceWith(expression = "view.getRotation()")
    @java.lang.Deprecated
    public static float getRotation(android.view.View view) {
        return view.getRotation();
    }

    @androidx.annotation.ReplaceWith(expression = "view.getRotationX()")
    @java.lang.Deprecated
    public static float getRotationX(android.view.View view) {
        return view.getRotationX();
    }

    @androidx.annotation.ReplaceWith(expression = "view.getRotationY()")
    @java.lang.Deprecated
    public static float getRotationY(android.view.View view) {
        return view.getRotationY();
    }

    @androidx.annotation.ReplaceWith(expression = "view.getScaleX()")
    @java.lang.Deprecated
    public static float getScaleX(android.view.View view) {
        return view.getScaleX();
    }

    @androidx.annotation.ReplaceWith(expression = "view.getScaleY()")
    @java.lang.Deprecated
    public static float getScaleY(android.view.View view) {
        return view.getScaleY();
    }

    @androidx.annotation.ReplaceWith(expression = "view.getX()")
    @java.lang.Deprecated
    public static float getX(android.view.View view) {
        return view.getX();
    }

    @androidx.annotation.ReplaceWith(expression = "view.getY()")
    @java.lang.Deprecated
    public static float getY(android.view.View view) {
        return view.getY();
    }

    public static void setElevation(android.view.View view, float f) {
        view.setElevation(f);
    }

    public static float getElevation(android.view.View view) {
        return view.getElevation();
    }

    public static void setTranslationZ(android.view.View view, float f) {
        view.setTranslationZ(f);
    }

    public static float getTranslationZ(android.view.View view) {
        return view.getTranslationZ();
    }

    public static void setTransitionName(android.view.View view, java.lang.String str) {
        view.setTransitionName(str);
    }

    public static java.lang.String getTransitionName(android.view.View view) {
        return view.getTransitionName();
    }

    public static void addOverlayView(android.view.ViewGroup viewGroup, android.view.View view) {
        viewGroup.getOverlay().add(view);
        androidx.core.viewtree.ViewTree.setViewTreeDisjointParent((android.view.View) view.getParent(), viewGroup);
    }

    @androidx.annotation.ReplaceWith(expression = "view.getWindowSystemUiVisibility()")
    @java.lang.Deprecated
    public static int getWindowSystemUiVisibility(android.view.View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static void requestApplyInsets(android.view.View view) {
        view.requestApplyInsets();
    }

    @java.lang.Deprecated
    public static void setChildrenDrawingOrderEnabled(android.view.ViewGroup viewGroup, boolean z) {
        if (getOutputFormats == null) {
            try {
                getOutputFormats = android.view.ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", java.lang.Boolean.TYPE);
            } catch (java.lang.NoSuchMethodException unused) {
            }
            getOutputFormats.setAccessible(true);
        }
        try {
            getOutputFormats.invoke(viewGroup, java.lang.Boolean.valueOf(z));
        } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException unused2) {
        }
    }

    @androidx.annotation.ReplaceWith(expression = "view.getFitsSystemWindows()")
    @java.lang.Deprecated
    public static boolean getFitsSystemWindows(android.view.View view) {
        return view.getFitsSystemWindows();
    }

    @androidx.annotation.ReplaceWith(expression = "view.setFitsSystemWindows(fitSystemWindows)")
    @java.lang.Deprecated
    public static void setFitsSystemWindows(android.view.View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    @androidx.annotation.ReplaceWith(expression = "view.jumpDrawablesToCurrentState()")
    @java.lang.Deprecated
    public static void jumpDrawablesToCurrentState(android.view.View view) {
        view.jumpDrawablesToCurrentState();
    }

    public static void setOnApplyWindowInsetsListener(android.view.View view, androidx.core.view.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        androidx.core.view.ViewCompat.Api21Impl.getHighSpeedVideoSizes(view, onApplyWindowInsetsListener);
    }

    public static androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        android.view.WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null) {
            android.view.WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
            if (!onApplyWindowInsets.equals(windowInsets)) {
                return androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(onApplyWindowInsets, view);
            }
        }
        return windowInsetsCompat;
    }

    public static androidx.core.view.WindowInsetsCompat dispatchApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        android.view.WindowInsets highSpeedVideoFpsRangesFor;
        android.view.WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null) {
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                highSpeedVideoFpsRangesFor = androidx.core.view.ViewCompat.Api30Impl.getHighSpeedVideoFpsRanges(view, windowInsets);
            } else {
                highSpeedVideoFpsRangesFor = androidx.core.view.ViewCompat.Api20Impl.getHighSpeedVideoFpsRangesFor(view, windowInsets);
            }
            if (!highSpeedVideoFpsRangesFor.equals(windowInsets)) {
                return androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(highSpeedVideoFpsRangesFor, view);
            }
        }
        return windowInsetsCompat;
    }

    public static void setSystemGestureExclusionRects(android.view.View view, java.util.List<android.graphics.Rect> list) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.view.ViewCompat.Api29Impl.getHighSpeedVideoSizes(view, list);
        }
    }

    public static java.util.List<android.graphics.Rect> getSystemGestureExclusionRects(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.core.view.ViewCompat.Api29Impl.getHighSpeedVideoSizes(view);
        }
        return java.util.Collections.emptyList();
    }

    public static androidx.core.view.WindowInsetsCompat getRootWindowInsets(android.view.View view) {
        return androidx.core.view.ViewCompat.Api23Impl.getHighSpeedVideoFpsRangesFor(view);
    }

    public static androidx.core.view.WindowInsetsCompat computeSystemWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat, android.graphics.Rect rect) {
        return androidx.core.view.ViewCompat.Api21Impl.Camera2StreamConfigurationMap(view, windowInsetsCompat, rect);
    }

    @java.lang.Deprecated
    public static androidx.core.view.WindowInsetsControllerCompat getWindowInsetsController(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.view.ViewCompat.Api30Impl.getHighResolutionOutputSizeshNQ4ISI(view);
        }
        for (android.content.Context context = view.getContext(); context instanceof android.content.ContextWrapper; context = ((android.content.ContextWrapper) context).getBaseContext()) {
            if (context instanceof android.app.Activity) {
                android.view.Window window = ((android.app.Activity) context).getWindow();
                if (window != null) {
                    return androidx.core.view.WindowCompat.getInsetsController(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void setWindowInsetsAnimationCallback(android.view.View view, androidx.core.view.WindowInsetsAnimationCompat.Callback callback) {
        androidx.core.view.WindowInsetsAnimationCompat.getHighSpeedVideoSizes(view, callback);
    }

    public static void setOnReceiveContentListener(android.view.View view, java.lang.String[] strArr, androidx.core.view.OnReceiveContentListener onReceiveContentListener) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            androidx.core.view.ViewCompat.Api31Impl.getHighSpeedVideoSizes(view, strArr, onReceiveContentListener);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z = false;
        if (onReceiveContentListener != null) {
            androidx.core.util.Preconditions.checkArgument(strArr != null, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (strArr[i].startsWith("*")) {
                    z = true;
                    break;
                }
                i++;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("A MIME type set here must not start with *: ");
            sb.append(java.util.Arrays.toString(strArr));
            androidx.core.util.Preconditions.checkArgument(!z, sb.toString());
        }
        view.setTag(androidx.core.R.id.tag_on_receive_content_mime_types, strArr);
        view.setTag(androidx.core.R.id.tag_on_receive_content_listener, onReceiveContentListener);
    }

    public static java.lang.String[] getOnReceiveContentMimeTypes(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.core.view.ViewCompat.Api31Impl.getHighSpeedVideoFpsRanges(view);
        }
        return (java.lang.String[]) view.getTag(androidx.core.R.id.tag_on_receive_content_mime_types);
    }

    public static androidx.core.view.ContentInfoCompat performReceiveContent(android.view.View view, androidx.core.view.ContentInfoCompat contentInfoCompat) {
        if (android.util.Log.isLoggable("ViewCompat", 3)) {
            view.getId();
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.core.view.ViewCompat.Api31Impl.getHighResolutionOutputSizeshNQ4ISI(view, contentInfoCompat);
        }
        androidx.core.view.OnReceiveContentListener onReceiveContentListener = (androidx.core.view.OnReceiveContentListener) view.getTag(androidx.core.R.id.tag_on_receive_content_listener);
        if (onReceiveContentListener != null) {
            androidx.core.view.ContentInfoCompat onReceiveContent = onReceiveContentListener.onReceiveContent(view, contentInfoCompat);
            if (onReceiveContent == null) {
                return null;
            }
            return getHighSpeedVideoFpsRangesFor(view).onReceiveContent(onReceiveContent);
        }
        return getHighSpeedVideoFpsRangesFor(view).onReceiveContent(contentInfoCompat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static androidx.core.view.OnReceiveContentViewBehavior getHighSpeedVideoFpsRangesFor(android.view.View view) {
        if (view instanceof androidx.core.view.OnReceiveContentViewBehavior) {
            return (androidx.core.view.OnReceiveContentViewBehavior) view;
        }
        return getHighSpeedVideoFpsRanges;
    }

    /* loaded from: classes3.dex */
    static final class Api31Impl {
        private Api31Impl() {
        }

        public static void getHighSpeedVideoSizes(android.view.View view, java.lang.String[] strArr, androidx.core.view.OnReceiveContentListener onReceiveContentListener) {
            if (onReceiveContentListener == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new androidx.core.view.ViewCompat.OnReceiveContentListenerAdapter(onReceiveContentListener));
            }
        }

        public static java.lang.String[] getHighSpeedVideoFpsRanges(android.view.View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static androidx.core.view.ContentInfoCompat getHighResolutionOutputSizeshNQ4ISI(android.view.View view, androidx.core.view.ContentInfoCompat contentInfoCompat) {
            android.view.ContentInfo contentInfo = contentInfoCompat.toContentInfo();
            android.view.ContentInfo performReceiveContent = view.performReceiveContent(contentInfo);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == contentInfo ? contentInfoCompat : androidx.core.view.ContentInfoCompat.toContentInfoCompat(performReceiveContent);
        }
    }

    /* loaded from: classes7.dex */
    static final class OnReceiveContentListenerAdapter implements android.view.OnReceiveContentListener {
        private final androidx.core.view.OnReceiveContentListener getHighSpeedVideoSizes;

        OnReceiveContentListenerAdapter(androidx.core.view.OnReceiveContentListener onReceiveContentListener) {
            this.getHighSpeedVideoSizes = onReceiveContentListener;
        }

        @Override // android.view.OnReceiveContentListener
        public final android.view.ContentInfo onReceiveContent(android.view.View view, android.view.ContentInfo contentInfo) {
            androidx.core.view.ContentInfoCompat contentInfoCompat = androidx.core.view.ContentInfoCompat.toContentInfoCompat(contentInfo);
            androidx.core.view.ContentInfoCompat onReceiveContent = this.getHighSpeedVideoSizes.onReceiveContent(view, contentInfoCompat);
            if (onReceiveContent == null) {
                return null;
            }
            return onReceiveContent == contentInfoCompat ? contentInfo : onReceiveContent.toContentInfo();
        }
    }

    @androidx.annotation.ReplaceWith(expression = "view.setSaveFromParentEnabled(enabled)")
    @java.lang.Deprecated
    public static void setSaveFromParentEnabled(android.view.View view, boolean z) {
        view.setSaveFromParentEnabled(z);
    }

    @androidx.annotation.ReplaceWith(expression = "view.setActivated(activated)")
    @java.lang.Deprecated
    public static void setActivated(android.view.View view, boolean z) {
        view.setActivated(z);
    }

    @androidx.annotation.ReplaceWith(expression = "view.hasOverlappingRendering()")
    @java.lang.Deprecated
    public static boolean hasOverlappingRendering(android.view.View view) {
        return view.hasOverlappingRendering();
    }

    @androidx.annotation.ReplaceWith(expression = "view.isPaddingRelative()")
    @java.lang.Deprecated
    public static boolean isPaddingRelative(android.view.View view) {
        return view.isPaddingRelative();
    }

    @androidx.annotation.ReplaceWith(expression = "view.setBackground(background)")
    @java.lang.Deprecated
    public static void setBackground(android.view.View view, android.graphics.drawable.Drawable drawable) {
        view.setBackground(drawable);
    }

    public static android.content.res.ColorStateList getBackgroundTintList(android.view.View view) {
        return view.getBackgroundTintList();
    }

    public static void setBackgroundTintList(android.view.View view, android.content.res.ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static android.graphics.PorterDuff.Mode getBackgroundTintMode(android.view.View view) {
        return view.getBackgroundTintMode();
    }

    public static void setBackgroundTintMode(android.view.View view, android.graphics.PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void setNestedScrollingEnabled(android.view.View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    public static boolean isNestedScrollingEnabled(android.view.View view) {
        return view.isNestedScrollingEnabled();
    }

    public static boolean startNestedScroll(android.view.View view, int i) {
        return view.startNestedScroll(i);
    }

    public static void stopNestedScroll(android.view.View view) {
        view.stopNestedScroll();
    }

    public static boolean hasNestedScrollingParent(android.view.View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean dispatchNestedScroll(android.view.View view, int i, int i2, int i3, int i4, int[] iArr) {
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    public static boolean dispatchNestedPreScroll(android.view.View view, int i, int i2, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean startNestedScroll(android.view.View view, int i, int i2) {
        if (view instanceof androidx.core.view.NestedScrollingChild2) {
            return ((androidx.core.view.NestedScrollingChild2) view).startNestedScroll(i, i2);
        }
        if (i2 == 0) {
            return startNestedScroll(view, i);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void stopNestedScroll(android.view.View view, int i) {
        if (view instanceof androidx.core.view.NestedScrollingChild2) {
            ((androidx.core.view.NestedScrollingChild2) view).stopNestedScroll(i);
        } else if (i == 0) {
            stopNestedScroll(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean hasNestedScrollingParent(android.view.View view, int i) {
        if (view instanceof androidx.core.view.NestedScrollingChild2) {
            ((androidx.core.view.NestedScrollingChild2) view).hasNestedScrollingParent(i);
            return false;
        }
        if (i == 0) {
            return hasNestedScrollingParent(view);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void dispatchNestedScroll(android.view.View view, int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        if (view instanceof androidx.core.view.NestedScrollingChild3) {
            ((androidx.core.view.NestedScrollingChild3) view).dispatchNestedScroll(i, i2, i3, i4, iArr, i5, iArr2);
        } else {
            dispatchNestedScroll(view, i, i2, i3, i4, iArr, i5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedScroll(android.view.View view, int i, int i2, int i3, int i4, int[] iArr, int i5) {
        if (view instanceof androidx.core.view.NestedScrollingChild2) {
            return ((androidx.core.view.NestedScrollingChild2) view).dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
        }
        if (i5 == 0) {
            return dispatchNestedScroll(view, i, i2, i3, i4, iArr);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedPreScroll(android.view.View view, int i, int i2, int[] iArr, int[] iArr2, int i3) {
        if (view instanceof androidx.core.view.NestedScrollingChild2) {
            return ((androidx.core.view.NestedScrollingChild2) view).dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
        }
        if (i3 == 0) {
            return dispatchNestedPreScroll(view, i, i2, iArr, iArr2);
        }
        return false;
    }

    public static boolean dispatchNestedFling(android.view.View view, float f, float f2, boolean z) {
        return view.dispatchNestedFling(f, f2, z);
    }

    public static boolean dispatchNestedPreFling(android.view.View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    @androidx.annotation.ReplaceWith(expression = "view.isInLayout()")
    @java.lang.Deprecated
    public static boolean isInLayout(android.view.View view) {
        return view.isInLayout();
    }

    @androidx.annotation.ReplaceWith(expression = "view.isLaidOut()")
    @java.lang.Deprecated
    public static boolean isLaidOut(android.view.View view) {
        return view.isLaidOut();
    }

    @androidx.annotation.ReplaceWith(expression = "view.isLayoutDirectionResolved()")
    @java.lang.Deprecated
    public static boolean isLayoutDirectionResolved(android.view.View view) {
        return view.isLayoutDirectionResolved();
    }

    public static float getZ(android.view.View view) {
        return view.getZ();
    }

    public static void setZ(android.view.View view, float f) {
        view.setZ(f);
    }

    public static void offsetTopAndBottom(android.view.View view, int i) {
        view.offsetTopAndBottom(i);
    }

    public static void offsetLeftAndRight(android.view.View view, int i) {
        view.offsetLeftAndRight(i);
    }

    @androidx.annotation.ReplaceWith(expression = "view.setClipBounds(clipBounds)")
    @java.lang.Deprecated
    public static void setClipBounds(android.view.View view, android.graphics.Rect rect) {
        view.setClipBounds(rect);
    }

    @androidx.annotation.ReplaceWith(expression = "view.getClipBounds()")
    @java.lang.Deprecated
    public static android.graphics.Rect getClipBounds(android.view.View view) {
        return view.getClipBounds();
    }

    @androidx.annotation.ReplaceWith(expression = "view.isAttachedToWindow()")
    @java.lang.Deprecated
    public static boolean isAttachedToWindow(android.view.View view) {
        return view.isAttachedToWindow();
    }

    @androidx.annotation.ReplaceWith(expression = "view.hasOnClickListeners()")
    @java.lang.Deprecated
    public static boolean hasOnClickListeners(android.view.View view) {
        return view.hasOnClickListeners();
    }

    public static void setScrollIndicators(android.view.View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void setScrollIndicators(android.view.View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }

    public static int getScrollIndicators(android.view.View view) {
        return view.getScrollIndicators();
    }

    public static void setPointerIcon(android.view.View view, androidx.core.view.PointerIconCompat pointerIconCompat) {
        androidx.core.view.ViewCompat.Api24Impl.getHighResolutionOutputSizeshNQ4ISI(view, (android.view.PointerIcon) (pointerIconCompat != null ? pointerIconCompat.getPointerIcon() : null));
    }

    @androidx.annotation.ReplaceWith(expression = "view.getDisplay()")
    @java.lang.Deprecated
    public static android.view.Display getDisplay(android.view.View view) {
        return view.getDisplay();
    }

    public static void setTooltipText(android.view.View view, java.lang.CharSequence charSequence) {
        androidx.core.view.ViewCompat.Api26Impl.getHighResolutionOutputSizeshNQ4ISI(view, charSequence);
    }

    public static boolean startDragAndDrop(android.view.View view, android.content.ClipData clipData, android.view.View.DragShadowBuilder dragShadowBuilder, java.lang.Object obj, int i) {
        return androidx.core.view.ViewCompat.Api24Impl.getHighSpeedVideoFpsRangesFor(view, clipData, dragShadowBuilder, obj, i);
    }

    public static void cancelDragAndDrop(android.view.View view) {
        androidx.core.view.ViewCompat.Api24Impl.getHighSpeedVideoFpsRangesFor(view);
    }

    public static void updateDragShadow(android.view.View view, android.view.View.DragShadowBuilder dragShadowBuilder) {
        androidx.core.view.ViewCompat.Api24Impl.getHighResolutionOutputSizeshNQ4ISI(view, dragShadowBuilder);
    }

    public static int getNextClusterForwardId(android.view.View view) {
        return androidx.core.view.ViewCompat.Api26Impl.getHighSpeedVideoSizes(view);
    }

    public static void setNextClusterForwardId(android.view.View view, int i) {
        androidx.core.view.ViewCompat.Api26Impl.Camera2StreamConfigurationMap(view, i);
    }

    public static boolean isKeyboardNavigationCluster(android.view.View view) {
        return androidx.core.view.ViewCompat.Api26Impl.getOutputMinFrameDuration(view);
    }

    public static void setKeyboardNavigationCluster(android.view.View view, boolean z) {
        androidx.core.view.ViewCompat.Api26Impl.getHighSpeedVideoFpsRangesFor(view, z);
    }

    public static boolean isFocusedByDefault(android.view.View view) {
        return androidx.core.view.ViewCompat.Api26Impl.Camera2StreamConfigurationMap(view);
    }

    public static void setFocusedByDefault(android.view.View view, boolean z) {
        androidx.core.view.ViewCompat.Api26Impl.getHighResolutionOutputSizeshNQ4ISI(view, z);
    }

    public static android.view.View keyboardNavigationClusterSearch(android.view.View view, android.view.View view2, int i) {
        return androidx.core.view.ViewCompat.Api26Impl.Camera2StreamConfigurationMap(view, view2, i);
    }

    public static void addKeyboardNavigationClusters(android.view.View view, java.util.Collection<android.view.View> collection, int i) {
        androidx.core.view.ViewCompat.Api26Impl.Camera2StreamConfigurationMap(view, collection, i);
    }

    public static boolean restoreDefaultFocus(android.view.View view) {
        return androidx.core.view.ViewCompat.Api26Impl.getInputFormats(view);
    }

    public static boolean hasExplicitFocusable(android.view.View view) {
        return androidx.core.view.ViewCompat.Api26Impl.getHighSpeedVideoFpsRangesFor(view);
    }

    @java.lang.Deprecated
    public static int generateViewId() {
        return android.view.View.generateViewId();
    }

    public static void addOnUnhandledKeyEventListener(android.view.View view, androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.core.view.ViewCompat.Api28Impl.getHighSpeedVideoFpsRanges(view, onUnhandledKeyEventListenerCompat);
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) view.getTag(androidx.core.R.id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            view.setTag(androidx.core.R.id.tag_unhandled_key_listeners, arrayList);
        }
        arrayList.add(onUnhandledKeyEventListenerCompat);
        if (arrayList.size() == 1) {
            androidx.core.view.ViewCompat.UnhandledKeyEventManager.getHighResolutionOutputSizeshNQ4ISI(view);
        }
    }

    public static void removeOnUnhandledKeyEventListener(android.view.View view, androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.core.view.ViewCompat.Api28Impl.getHighResolutionOutputSizeshNQ4ISI(view, onUnhandledKeyEventListenerCompat);
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) view.getTag(androidx.core.R.id.tag_unhandled_key_listeners);
        if (arrayList != null) {
            arrayList.remove(onUnhandledKeyEventListenerCompat);
            if (arrayList.size() == 0) {
                androidx.core.view.ViewCompat.UnhandledKeyEventManager.getHighSpeedVideoSizes(view);
            }
        }
    }

    @java.lang.Deprecated
    protected ViewCompat() {
    }

    static boolean getHighResolutionOutputSizeshNQ4ISI(android.view.View view, android.view.KeyEvent keyEvent) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return androidx.core.view.ViewCompat.UnhandledKeyEventManager.getHighSpeedVideoFpsRangesFor(view).getHighResolutionOutputSizeshNQ4ISI(keyEvent);
    }

    static boolean Camera2StreamConfigurationMap(android.view.View view, android.view.KeyEvent keyEvent) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return androidx.core.view.ViewCompat.UnhandledKeyEventManager.getHighSpeedVideoFpsRangesFor(view).getHighSpeedVideoSizes(view, keyEvent);
    }

    public static void transformMatrixToGlobal(android.view.View view, android.graphics.Matrix matrix) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.view.ViewCompat.Api29Impl.getHighSpeedVideoSizes(view, matrix);
            return;
        }
        if (getInputFormats) {
            try {
                androidx.core.view.ViewCompat.Api29Impl.getHighSpeedVideoSizes(view, matrix);
                return;
            } catch (java.lang.NoSuchMethodError unused) {
                getInputFormats = false;
            }
        }
        getHighSpeedVideoFpsRangesFor(view, matrix);
    }

    static void getHighSpeedVideoFpsRangesFor(android.view.View view, android.graphics.Matrix matrix) {
        java.lang.Object parent = view.getParent();
        if (parent instanceof android.view.View) {
            getHighSpeedVideoFpsRangesFor((android.view.View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        matrix.preConcat(view.getMatrix());
    }

    public static void setScreenReaderFocusable(android.view.View view, boolean z) {
        getHighSpeedVideoFpsRangesFor().getHighSpeedVideoFpsRangesFor(view, (android.view.View) java.lang.Boolean.valueOf(z));
    }

    public static boolean isScreenReaderFocusable(android.view.View view) {
        java.lang.Boolean outputFormats = getHighSpeedVideoFpsRangesFor().getOutputFormats(view);
        return outputFormats != null && outputFormats.booleanValue();
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.Boolean> getHighSpeedVideoFpsRangesFor() {
        return new androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.Boolean>(androidx.core.R.id.tag_screen_reader_focusable, java.lang.Boolean.class, 28) { // from class: androidx.core.view.ViewCompat.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public java.lang.Boolean getHighSpeedVideoSizes(android.view.View view) {
                return java.lang.Boolean.valueOf(androidx.core.view.ViewCompat.Api28Impl.getHighSpeedVideoSizes(view));
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public void Camera2StreamConfigurationMap(android.view.View view, java.lang.Boolean bool) {
                androidx.core.view.ViewCompat.Api28Impl.getHighSpeedVideoSizes(view, bool.booleanValue());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public boolean getHighSpeedVideoSizes(java.lang.Boolean bool, java.lang.Boolean bool2) {
                return !getHighSpeedVideoFpsRangesFor(bool, bool2);
            }
        };
    }

    public static void setAccessibilityPaneTitle(android.view.View view, java.lang.CharSequence charSequence) {
        getHighResolutionOutputSizeshNQ4ISI().getHighSpeedVideoFpsRangesFor(view, (android.view.View) charSequence);
        if (charSequence != null) {
            getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(view);
        } else {
            getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(view);
        }
    }

    public static java.lang.CharSequence getAccessibilityPaneTitle(android.view.View view) {
        return getHighResolutionOutputSizeshNQ4ISI().getOutputFormats(view);
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.CharSequence> getHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.CharSequence>(androidx.core.R.id.tag_accessibility_pane_title, java.lang.CharSequence.class, 8, 28) { // from class: androidx.core.view.ViewCompat.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public java.lang.CharSequence getHighSpeedVideoSizes(android.view.View view) {
                return androidx.core.view.ViewCompat.Api28Impl.getHighResolutionOutputSizeshNQ4ISI(view);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public void Camera2StreamConfigurationMap(android.view.View view, java.lang.CharSequence charSequence) {
                androidx.core.view.ViewCompat.Api28Impl.Camera2StreamConfigurationMap(view, charSequence);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public boolean getHighSpeedVideoSizes(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
                return !android.text.TextUtils.equals(charSequence, charSequence2);
            }
        };
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.CharSequence> Camera2StreamConfigurationMap() {
        return new androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.CharSequence>(androidx.core.R.id.tag_state_description, java.lang.CharSequence.class, 64, 30) { // from class: androidx.core.view.ViewCompat.3
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public java.lang.CharSequence getHighSpeedVideoSizes(android.view.View view) {
                return androidx.core.view.ViewCompat.Api30Impl.getHighSpeedVideoFpsRanges(view);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public void Camera2StreamConfigurationMap(android.view.View view, java.lang.CharSequence charSequence) {
                androidx.core.view.ViewCompat.Api30Impl.getHighResolutionOutputSizeshNQ4ISI(view, charSequence);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public boolean getHighSpeedVideoSizes(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
                return !android.text.TextUtils.equals(charSequence, charSequence2);
            }
        };
    }

    public static boolean isAccessibilityHeading(android.view.View view) {
        java.lang.Boolean outputFormats = getHighSpeedVideoSizes().getOutputFormats(view);
        return outputFormats != null && outputFormats.booleanValue();
    }

    public static void setAccessibilityHeading(android.view.View view, boolean z) {
        getHighSpeedVideoSizes().getHighSpeedVideoFpsRangesFor(view, (android.view.View) java.lang.Boolean.valueOf(z));
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.Boolean> getHighSpeedVideoSizes() {
        return new androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.Boolean>(androidx.core.R.id.tag_accessibility_heading, java.lang.Boolean.class, 28) { // from class: androidx.core.view.ViewCompat.4
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public java.lang.Boolean getHighSpeedVideoSizes(android.view.View view) {
                return java.lang.Boolean.valueOf(androidx.core.view.ViewCompat.Api28Impl.Camera2StreamConfigurationMap(view));
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public void Camera2StreamConfigurationMap(android.view.View view, java.lang.Boolean bool) {
                androidx.core.view.ViewCompat.Api28Impl.Camera2StreamConfigurationMap(view, bool.booleanValue());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public boolean getHighSpeedVideoSizes(java.lang.Boolean bool, java.lang.Boolean bool2) {
                return !getHighSpeedVideoFpsRangesFor(bool, bool2);
            }
        };
    }

    /* loaded from: classes3.dex */
    static abstract class AccessibilityViewProperty<T> {
        private final int Camera2StreamConfigurationMap;
        private final int getHighResolutionOutputSizeshNQ4ISI;
        private final int getHighSpeedVideoFpsRanges;
        private final java.lang.Class<T> getHighSpeedVideoFpsRangesFor;

        abstract void Camera2StreamConfigurationMap(android.view.View view, T t);

        abstract T getHighSpeedVideoSizes(android.view.View view);

        AccessibilityViewProperty(int i, java.lang.Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        AccessibilityViewProperty(int i, java.lang.Class<T> cls, int i2, int i3) {
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighSpeedVideoFpsRangesFor = cls;
            this.Camera2StreamConfigurationMap = i2;
            this.getHighResolutionOutputSizeshNQ4ISI = i3;
        }

        void getHighSpeedVideoFpsRangesFor(android.view.View view, T t) {
            if (getHighSpeedVideoFpsRangesFor()) {
                Camera2StreamConfigurationMap(view, t);
            } else if (getHighSpeedVideoSizes(getOutputFormats(view), t)) {
                androidx.core.view.ViewCompat.getHighSpeedVideoSizes(view);
                view.setTag(this.getHighSpeedVideoFpsRanges, t);
                androidx.core.view.ViewCompat.getHighResolutionOutputSizeshNQ4ISI(view, this.Camera2StreamConfigurationMap);
            }
        }

        T getOutputFormats(android.view.View view) {
            if (getHighSpeedVideoFpsRangesFor()) {
                return getHighSpeedVideoSizes(view);
            }
            T t = (T) view.getTag(this.getHighSpeedVideoFpsRanges);
            if (this.getHighSpeedVideoFpsRangesFor.isInstance(t)) {
                return t;
            }
            return null;
        }

        private boolean getHighSpeedVideoFpsRangesFor() {
            return android.os.Build.VERSION.SDK_INT >= this.getHighResolutionOutputSizeshNQ4ISI;
        }

        boolean getHighSpeedVideoSizes(T t, T t2) {
            return !t2.equals(t);
        }

        boolean getHighSpeedVideoFpsRangesFor(java.lang.Boolean bool, java.lang.Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI(android.view.View view, int i) {
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = getAccessibilityPaneTitle(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(getAccessibilityPaneTitle(view));
                    getHighSpeedVideoSizesFor(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i == 32) {
                android.view.accessibility.AccessibilityEvent obtain2 = android.view.accessibility.AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(getAccessibilityPaneTitle(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (java.lang.AbstractMethodError unused) {
                    view.getParent();
                }
            }
        }
    }

    private static void getHighSpeedVideoSizesFor(android.view.View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    /* loaded from: classes3.dex */
    static class AccessibilityPaneVisibilityManager implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.View.OnAttachStateChangeListener {
        private final java.util.WeakHashMap<android.view.View, java.lang.Boolean> getHighSpeedVideoSizes = new java.util.WeakHashMap<>();

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
        }

        AccessibilityPaneVisibilityManager() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (android.os.Build.VERSION.SDK_INT < 28) {
                java.util.Iterator<java.util.Map.Entry<android.view.View, java.lang.Boolean>> it = this.getHighSpeedVideoSizes.entrySet().iterator();
                while (it.hasNext()) {
                    Camera2StreamConfigurationMap(it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
            getHighSpeedVideoFpsRangesFor(view);
        }

        void Camera2StreamConfigurationMap(android.view.View view) {
            this.getHighSpeedVideoSizes.put(view, java.lang.Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                getHighSpeedVideoFpsRangesFor(view);
            }
        }

        void getHighResolutionOutputSizeshNQ4ISI(android.view.View view) {
            this.getHighSpeedVideoSizes.remove(view);
            view.removeOnAttachStateChangeListener(this);
            getHighSpeedVideoFpsRanges(view);
        }

        private void Camera2StreamConfigurationMap(java.util.Map.Entry<android.view.View, java.lang.Boolean> entry) {
            android.view.View key = entry.getKey();
            boolean booleanValue = entry.getValue().booleanValue();
            boolean z = key.isShown() && key.getWindowVisibility() == 0;
            if (booleanValue != z) {
                androidx.core.view.ViewCompat.getHighResolutionOutputSizeshNQ4ISI(key, z ? 16 : 32);
                entry.setValue(java.lang.Boolean.valueOf(z));
            }
        }

        private void getHighSpeedVideoFpsRangesFor(android.view.View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void getHighSpeedVideoFpsRanges(android.view.View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* loaded from: classes3.dex */
    static class UnhandledKeyEventManager {
        private static final java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> getHighSpeedVideoSizes = new java.util.ArrayList<>();
        private java.util.WeakHashMap<android.view.View, java.lang.Boolean> getHighSpeedVideoFpsRangesFor = null;
        private android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> Camera2StreamConfigurationMap = null;
        private java.lang.ref.WeakReference<android.view.KeyEvent> getHighResolutionOutputSizeshNQ4ISI = null;

        UnhandledKeyEventManager() {
        }

        private android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> getHighSpeedVideoFpsRangesFor() {
            if (this.Camera2StreamConfigurationMap == null) {
                this.Camera2StreamConfigurationMap = new android.util.SparseArray<>();
            }
            return this.Camera2StreamConfigurationMap;
        }

        static androidx.core.view.ViewCompat.UnhandledKeyEventManager getHighSpeedVideoFpsRangesFor(android.view.View view) {
            androidx.core.view.ViewCompat.UnhandledKeyEventManager unhandledKeyEventManager = (androidx.core.view.ViewCompat.UnhandledKeyEventManager) view.getTag(androidx.core.R.id.tag_unhandled_key_event_manager);
            if (unhandledKeyEventManager != null) {
                return unhandledKeyEventManager;
            }
            androidx.core.view.ViewCompat.UnhandledKeyEventManager unhandledKeyEventManager2 = new androidx.core.view.ViewCompat.UnhandledKeyEventManager();
            view.setTag(androidx.core.R.id.tag_unhandled_key_event_manager, unhandledKeyEventManager2);
            return unhandledKeyEventManager2;
        }

        boolean getHighSpeedVideoSizes(android.view.View view, android.view.KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
            android.view.View highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (highResolutionOutputSizeshNQ4ISI != null && !android.view.KeyEvent.isModifierKey(keyCode)) {
                    getHighSpeedVideoFpsRangesFor().put(keyCode, new java.lang.ref.WeakReference<>(highResolutionOutputSizeshNQ4ISI));
                }
            }
            return highResolutionOutputSizeshNQ4ISI != null;
        }

        private android.view.View getHighResolutionOutputSizeshNQ4ISI(android.view.View view, android.view.KeyEvent keyEvent) {
            java.util.WeakHashMap<android.view.View, java.lang.Boolean> weakHashMap = this.getHighSpeedVideoFpsRangesFor;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    android.view.View highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(viewGroup.getChildAt(childCount), keyEvent);
                    if (highResolutionOutputSizeshNQ4ISI != null) {
                        return highResolutionOutputSizeshNQ4ISI;
                    }
                }
            }
            if (getHighSpeedVideoFpsRangesFor(view, keyEvent)) {
                return view;
            }
            return null;
        }

        boolean getHighResolutionOutputSizeshNQ4ISI(android.view.KeyEvent keyEvent) {
            java.lang.ref.WeakReference<android.view.View> weakReference;
            int indexOfKey;
            java.lang.ref.WeakReference<android.view.KeyEvent> weakReference2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.ref.WeakReference<>(keyEvent);
            android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            if (keyEvent.getAction() != 1 || (indexOfKey = highSpeedVideoFpsRangesFor.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = highSpeedVideoFpsRangesFor.valueAt(indexOfKey);
                highSpeedVideoFpsRangesFor.removeAt(indexOfKey);
            }
            if (weakReference == null) {
                weakReference = highSpeedVideoFpsRangesFor.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            android.view.View view = weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                getHighSpeedVideoFpsRangesFor(view, keyEvent);
            }
            return true;
        }

        private boolean getHighSpeedVideoFpsRangesFor(android.view.View view, android.view.KeyEvent keyEvent) {
            java.util.ArrayList arrayList = (java.util.ArrayList) view.getTag(androidx.core.R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.view.View view) {
            java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> arrayList = getHighSpeedVideoSizes;
            synchronized (arrayList) {
                java.util.Iterator<java.lang.ref.WeakReference<android.view.View>> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().get() == view) {
                        return;
                    }
                }
                getHighSpeedVideoSizes.add(new java.lang.ref.WeakReference<>(view));
            }
        }

        static void getHighSpeedVideoSizes(android.view.View view) {
            synchronized (getHighSpeedVideoSizes) {
                int i = 0;
                while (true) {
                    java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> arrayList = getHighSpeedVideoSizes;
                    if (i >= arrayList.size()) {
                        return;
                    }
                    if (arrayList.get(i).get() == view) {
                        arrayList.remove(i);
                        return;
                    }
                    i++;
                }
            }
        }

        private void getHighResolutionOutputSizeshNQ4ISI() {
            java.util.WeakHashMap<android.view.View, java.lang.Boolean> weakHashMap = this.getHighSpeedVideoFpsRangesFor;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> arrayList = getHighSpeedVideoSizes;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.getHighSpeedVideoFpsRangesFor == null) {
                    this.getHighSpeedVideoFpsRangesFor = new java.util.WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> arrayList2 = getHighSpeedVideoSizes;
                    android.view.View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.getHighSpeedVideoFpsRangesFor.put(view, java.lang.Boolean.TRUE);
                        for (android.view.ViewParent parent = view.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
                            this.getHighSpeedVideoFpsRangesFor.put((android.view.View) parent, java.lang.Boolean.TRUE);
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    static class Api21Impl {
        private Api21Impl() {
        }

        static androidx.core.view.WindowInsetsCompat Camera2StreamConfigurationMap(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat, android.graphics.Rect rect) {
            android.view.WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            if (windowInsets != null) {
                return androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(view.computeSystemWindowInsets(windowInsets, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        static void getHighSpeedVideoSizes(final android.view.View view, final androidx.core.view.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
            android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = onApplyWindowInsetsListener != null ? new android.view.View.OnApplyWindowInsetsListener() { // from class: androidx.core.view.ViewCompat.Api21Impl.1
                androidx.core.view.WindowInsetsCompat getHighSpeedVideoFpsRanges = null;

                @Override // android.view.View.OnApplyWindowInsetsListener
                public android.view.WindowInsets onApplyWindowInsets(android.view.View view2, android.view.WindowInsets windowInsets) {
                    androidx.core.view.WindowInsetsCompat windowInsetsCompat = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view2);
                    if (android.os.Build.VERSION.SDK_INT < 30) {
                        androidx.core.view.ViewCompat.Api21Impl.Camera2StreamConfigurationMap(windowInsets, view);
                        if (windowInsetsCompat.equals(this.getHighSpeedVideoFpsRanges)) {
                            return onApplyWindowInsetsListener.onApplyWindowInsets(view2, windowInsetsCompat).toWindowInsets();
                        }
                    }
                    this.getHighSpeedVideoFpsRanges = windowInsetsCompat;
                    androidx.core.view.WindowInsetsCompat onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view2, windowInsetsCompat);
                    if (android.os.Build.VERSION.SDK_INT >= 30) {
                        return onApplyWindowInsets.toWindowInsets();
                    }
                    androidx.core.view.ViewCompat.requestApplyInsets(view2);
                    return onApplyWindowInsets.toWindowInsets();
                }
            } : null;
            if (android.os.Build.VERSION.SDK_INT < 30) {
                view.setTag(androidx.core.R.id.tag_on_apply_window_listener, onApplyWindowInsetsListener2);
            }
            if (view.getTag(androidx.core.R.id.tag_compat_insets_dispatch) != null) {
                return;
            }
            if (onApplyWindowInsetsListener2 != null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener2);
            } else {
                view.setOnApplyWindowInsetsListener((android.view.View.OnApplyWindowInsetsListener) view.getTag(androidx.core.R.id.tag_window_insets_animation_callback));
            }
        }

        static void Camera2StreamConfigurationMap(android.view.WindowInsets windowInsets, android.view.View view) {
            android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (android.view.View.OnApplyWindowInsetsListener) view.getTag(androidx.core.R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }
    }

    /* loaded from: classes3.dex */
    static class Api23Impl {
        private Api23Impl() {
        }

        public static androidx.core.view.WindowInsetsCompat getHighSpeedVideoFpsRangesFor(android.view.View view) {
            android.view.WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            androidx.core.view.WindowInsetsCompat windowInsetsCompat = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(rootWindowInsets);
            windowInsetsCompat.getHighSpeedVideoSizes(windowInsetsCompat);
            windowInsetsCompat.getHighSpeedVideoFpsRanges(view.getRootView());
            return windowInsetsCompat;
        }
    }

    /* loaded from: classes3.dex */
    static class Api29Impl {
        private Api29Impl() {
        }

        static void getHighSpeedVideoSizes(android.view.View view, android.content.Context context, int[] iArr, android.util.AttributeSet attributeSet, android.content.res.TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        static android.view.View.AccessibilityDelegate getHighSpeedVideoFpsRangesFor(android.view.View view) {
            return view.getAccessibilityDelegate();
        }

        static void getHighSpeedVideoSizes(android.view.View view, java.util.List<android.graphics.Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }

        static java.util.List<android.graphics.Rect> getHighSpeedVideoSizes(android.view.View view) {
            return view.getSystemGestureExclusionRects();
        }

        static android.view.contentcapture.ContentCaptureSession cA_(android.view.View view) {
            return view.getContentCaptureSession();
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.view.View view, androidx.core.view.contentcapture.ContentCaptureSessionCompat contentCaptureSessionCompat) {
            view.setContentCaptureSession(contentCaptureSessionCompat == null ? null : contentCaptureSessionCompat.toContentCaptureSession());
        }

        static void getHighSpeedVideoSizes(android.view.View view, android.graphics.Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }
    }

    /* loaded from: classes3.dex */
    static class Api30Impl {
        private Api30Impl() {
        }

        public static androidx.core.view.WindowInsetsControllerCompat getHighResolutionOutputSizeshNQ4ISI(android.view.View view) {
            android.view.WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return androidx.core.view.WindowInsetsControllerCompat.toWindowInsetsControllerCompat(windowInsetsController);
            }
            return null;
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.view.View view, java.lang.CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }

        static java.lang.CharSequence getHighSpeedVideoFpsRanges(android.view.View view) {
            return view.getStateDescription();
        }

        static void getHighSpeedVideoFpsRanges(android.view.View view, int i) {
            view.setImportantForContentCapture(i);
        }

        static boolean getHighSpeedVideoSizes(android.view.View view) {
            return view.isImportantForContentCapture();
        }

        static int Camera2StreamConfigurationMap(android.view.View view) {
            return view.getImportantForContentCapture();
        }

        static android.view.WindowInsets getHighSpeedVideoFpsRanges(android.view.View view, android.view.WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }
    }

    /* loaded from: classes7.dex */
    static class Api26Impl {
        private Api26Impl() {
        }

        static void Camera2StreamConfigurationMap(android.view.View view, java.lang.String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.view.View view, java.lang.CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }

        static int getHighSpeedVideoSizes(android.view.View view) {
            return view.getNextClusterForwardId();
        }

        static void Camera2StreamConfigurationMap(android.view.View view, int i) {
            view.setNextClusterForwardId(i);
        }

        static boolean getOutputMinFrameDuration(android.view.View view) {
            return view.isKeyboardNavigationCluster();
        }

        static void getHighSpeedVideoFpsRangesFor(android.view.View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        static boolean Camera2StreamConfigurationMap(android.view.View view) {
            return view.isFocusedByDefault();
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.view.View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        static android.view.View Camera2StreamConfigurationMap(android.view.View view, android.view.View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        static void Camera2StreamConfigurationMap(android.view.View view, java.util.Collection<android.view.View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        static boolean getInputFormats(android.view.View view) {
            return view.restoreDefaultFocus();
        }

        static boolean getHighSpeedVideoFpsRangesFor(android.view.View view) {
            return view.hasExplicitFocusable();
        }

        static int getHighResolutionOutputSizeshNQ4ISI(android.view.View view) {
            return view.getImportantForAutofill();
        }

        static void getHighSpeedVideoFpsRanges(android.view.View view, int i) {
            view.setImportantForAutofill(i);
        }

        static boolean getHighSpeedVideoSizesFor(android.view.View view) {
            return view.isImportantForAutofill();
        }

        public static android.view.autofill.AutofillId getHighSpeedVideoFpsRanges(android.view.View view) {
            return view.getAutofillId();
        }
    }

    /* loaded from: classes7.dex */
    static class Api24Impl {
        private Api24Impl() {
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.view.View view, android.view.PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        static boolean getHighSpeedVideoFpsRangesFor(android.view.View view, android.content.ClipData clipData, android.view.View.DragShadowBuilder dragShadowBuilder, java.lang.Object obj, int i) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }

        static void getHighSpeedVideoFpsRangesFor(android.view.View view) {
            view.cancelDragAndDrop();
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.view.View view, android.view.View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }

        static void Camera2StreamConfigurationMap(android.view.View view) {
            view.dispatchStartTemporaryDetach();
        }

        static void getHighSpeedVideoSizes(android.view.View view) {
            view.dispatchFinishTemporaryDetach();
        }
    }

    /* loaded from: classes3.dex */
    static class Api28Impl {
        private Api28Impl() {
        }

        static <T> T getHighSpeedVideoFpsRangesFor(android.view.View view, int i) {
            return (T) view.requireViewById(i);
        }

        static java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI(android.view.View view) {
            return view.getAccessibilityPaneTitle();
        }

        static void Camera2StreamConfigurationMap(android.view.View view, java.lang.CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void Camera2StreamConfigurationMap(android.view.View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        static boolean Camera2StreamConfigurationMap(android.view.View view) {
            return view.isAccessibilityHeading();
        }

        static boolean getHighSpeedVideoSizes(android.view.View view) {
            return view.isScreenReaderFocusable();
        }

        static void getHighSpeedVideoSizes(android.view.View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }

        static void getHighSpeedVideoFpsRanges(android.view.View view, final androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
            androidx.collection.SimpleArrayMap simpleArrayMap = (androidx.collection.SimpleArrayMap) view.getTag(androidx.core.R.id.tag_unhandled_key_listeners);
            if (simpleArrayMap == null) {
                simpleArrayMap = new androidx.collection.SimpleArrayMap();
                view.setTag(androidx.core.R.id.tag_unhandled_key_listeners, simpleArrayMap);
            }
            java.util.Objects.requireNonNull(onUnhandledKeyEventListenerCompat);
            android.view.View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new android.view.View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.ViewCompat$Api28Impl$$ExternalSyntheticLambda0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(android.view.View view2, android.view.KeyEvent keyEvent) {
                    return androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            simpleArrayMap.put(onUnhandledKeyEventListenerCompat, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.view.View view, androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
            android.view.View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            androidx.collection.SimpleArrayMap simpleArrayMap = (androidx.collection.SimpleArrayMap) view.getTag(androidx.core.R.id.tag_unhandled_key_listeners);
            if (simpleArrayMap == null || (onUnhandledKeyEventListener = (android.view.View.OnUnhandledKeyEventListener) simpleArrayMap.get(onUnhandledKeyEventListenerCompat)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static void getHighSpeedVideoFpsRanges(android.view.View view, androidx.core.view.autofill.AutofillIdCompat autofillIdCompat) {
            view.setAutofillId(autofillIdCompat == null ? null : autofillIdCompat.toAutofillId());
        }
    }

    /* loaded from: classes3.dex */
    static class Api20Impl {
        private Api20Impl() {
        }

        static android.view.WindowInsets getHighSpeedVideoFpsRangesFor(android.view.View view, android.view.WindowInsets windowInsets) {
            if (androidx.core.view.ViewGroupCompat.getHighResolutionOutputSizeshNQ4ISI) {
                return androidx.core.view.ViewGroupCompat.getHighSpeedVideoFpsRangesFor(view, windowInsets);
            }
            return view.dispatchApplyWindowInsets(windowInsets);
        }
    }
}
