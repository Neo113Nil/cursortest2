package com.datadog.android.rum.internal.instrumentation.gestures;

@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 S2\u00020\u0001:\u0001SBa\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J1\u0010(\u001a\u00020\u001b2\b\u0010$\u001a\u0004\u0018\u00010 2\u0006\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u0018H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020*2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b+\u0010,J1\u00100\u001a\u00020\u001b2\b\u0010$\u001a\u0004\u0018\u00010 2\u0006\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u0018H\u0016¢\u0006\u0004\b0\u0010)J\u0017\u00101\u001a\u00020*2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b1\u0010,J\u0017\u00102\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b2\u0010#J\u0015\u00104\u001a\u00020*2\u0006\u00103\u001a\u00020 ¢\u0006\u0004\b4\u0010,J/\u00108\u001a\u0010\u0012\u0004\u0012\u000206\u0012\u0006\u0012\u0004\u0018\u000107052\u0006\u0010\u0017\u001a\u00020\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b8\u00109J\u0017\u00108\u001a\u00020*2\u0006\u0010\u0017\u001a\u00020\u001dH\u0002¢\u0006\u0004\b8\u0010:R\u0014\u0010;\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010<R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010@R\u0016\u0010=\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010AR\u0014\u0010D\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010E\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010HR\u0018\u0010B\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010KR\u0018\u0010N\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010L\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R"}, d2 = {"Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesListener;", "Lcom/datadog/android/rum/internal/instrumentation/gestures/GestureListenerCompat;", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Ljava/lang/ref/WeakReference;", "Landroid/view/Window;", "windowReference", "", "Lcom/datadog/android/rum/tracking/ViewAttributesProvider;", "attributesProviders", "Lcom/datadog/android/rum/tracking/InteractionPredicate;", "interactionPredicate", "Ljava/lang/ref/Reference;", "Landroid/content/Context;", "contextRef", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/rum/tracking/ActionTrackingStrategy;", "composeActionTrackingStrategy", "androidActionTrackingStrategy", "<init>", "(Lcom/datadog/android/api/SdkCore;Ljava/lang/ref/WeakReference;[Lcom/datadog/android/rum/tracking/ViewAttributesProvider;Lcom/datadog/android/rum/tracking/InteractionPredicate;Ljava/lang/ref/Reference;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/rum/tracking/ActionTrackingStrategy;Lcom/datadog/android/rum/tracking/ActionTrackingStrategy;)V", "Landroid/view/View;", "p0", "", "p1", "p2", "", "p3", "Lcom/datadog/android/rum/tracking/ViewTarget;", "getHighSpeedVideoFpsRangesFor", "(Landroid/view/View;FFZ)Lcom/datadog/android/rum/tracking/ViewTarget;", "Landroid/view/MotionEvent;", "e", "onDown", "(Landroid/view/MotionEvent;)Z", "startDownEvent", "endUpEvent", "velocityX", "velocityY", "onFling", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "", "onLongPress", "(Landroid/view/MotionEvent;)V", "currentMoveEvent", "distanceX", "distanceY", "onScroll", "onShowPress", "onSingleTapUp", "event", "onUp", "", "", "", "Camera2StreamConfigurationMap", "(Lcom/datadog/android/rum/tracking/ViewTarget;Landroid/view/MotionEvent;)Ljava/util/Map;", "(Lcom/datadog/android/rum/tracking/ViewTarget;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/rum/tracking/ActionTrackingStrategy;", "getHighSpeedVideoSizes", "[Lcom/datadog/android/rum/tracking/ViewAttributesProvider;", "getHighSpeedVideoFpsRanges", "Ljava/lang/ref/Reference;", "Ljava/lang/String;", "getOutputMinFrameDuration", "Lcom/datadog/android/rum/tracking/InteractionPredicate;", "getInputFormats", "getHighSpeedVideoSizesFor", "Lcom/datadog/android/api/InternalLogger;", "getInputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getOutputFormats", "Lcom/datadog/android/rum/RumActionType;", "Lcom/datadog/android/rum/RumActionType;", "getOutputStallDuration", "Lcom/datadog/android/rum/tracking/ViewTarget;", "getOutputSizeshNQ4ISI", "getOutputSizes", "Lcom/datadog/android/api/SdkCore;", "getOutputMinFrameDurationlomOqCM", "Ljava/lang/ref/WeakReference;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GesturesListener extends com.datadog.android.rum.internal.instrumentation.gestures.GestureListenerCompat {
    public static final java.lang.String MSG_NO_COMPOSE_TARGET = "We could not find a valid target for the gesture event. Compose actions tracking not enabled, or the compose view is not tagged.";
    public static final java.lang.String MSG_NO_TARGET_ACTION = "We could not find a valid target for the gesture event. The DecorView was empty and either transparent or not clickable for this Activity.";
    public static final java.lang.String SCROLL_DIRECTION_DOWN = "down";
    public static final java.lang.String SCROLL_DIRECTION_LEFT = "left";
    public static final java.lang.String SCROLL_DIRECTION_RIGHT = "right";
    public static final java.lang.String SCROLL_DIRECTION_UP = "up";
    private final java.lang.ref.Reference<android.content.Context> Camera2StreamConfigurationMap;
    private final com.datadog.android.rum.tracking.ActionTrackingStrategy getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.rum.tracking.ActionTrackingStrategy getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.rum.tracking.ViewAttributesProvider[] getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getInputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private float getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private float getHighSpeedVideoSizesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private com.datadog.android.rum.RumActionType getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.datadog.android.rum.tracking.InteractionPredicate getInputFormats;
    private final java.lang.ref.WeakReference<android.view.Window> getOutputMinFrameDurationlomOqCM;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final com.datadog.android.api.SdkCore getOutputStallDuration;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private com.datadog.android.rum.tracking.ViewTarget getOutputSizeshNQ4ISI;

    public /* synthetic */ GesturesListener(com.datadog.android.api.SdkCore sdkCore, java.lang.ref.WeakReference weakReference, com.datadog.android.rum.tracking.ViewAttributesProvider[] viewAttributesProviderArr, com.datadog.android.rum.tracking.InteractionPredicate interactionPredicate, java.lang.ref.Reference reference, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.rum.tracking.ActionTrackingStrategy actionTrackingStrategy, com.datadog.android.rum.tracking.ActionTrackingStrategy actionTrackingStrategy2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(sdkCore, weakReference, (i & 4) != 0 ? new com.datadog.android.rum.tracking.ViewAttributesProvider[0] : viewAttributesProviderArr, (i & 8) != 0 ? new com.datadog.android.rum.internal.tracking.NoOpInteractionPredicate() : interactionPredicate, reference, internalLogger, (i & 64) != 0 ? new com.datadog.android.rum.tracking.NoOpActionTrackingStrategy() : actionTrackingStrategy, (i & 128) != 0 ? new com.datadog.android.rum.internal.instrumentation.gestures.AndroidActionTrackingStrategy() : actionTrackingStrategy2);
    }

    public GesturesListener(com.datadog.android.api.SdkCore sdkCore, java.lang.ref.WeakReference<android.view.Window> weakReference, com.datadog.android.rum.tracking.ViewAttributesProvider[] viewAttributesProviderArr, com.datadog.android.rum.tracking.InteractionPredicate interactionPredicate, java.lang.ref.Reference<android.content.Context> reference, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.rum.tracking.ActionTrackingStrategy actionTrackingStrategy, com.datadog.android.rum.tracking.ActionTrackingStrategy actionTrackingStrategy2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewAttributesProviderArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interactionPredicate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionTrackingStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionTrackingStrategy2, "");
        this.getOutputStallDuration = sdkCore;
        this.getOutputMinFrameDurationlomOqCM = weakReference;
        this.getHighSpeedVideoFpsRanges = viewAttributesProviderArr;
        this.getInputFormats = interactionPredicate;
        this.Camera2StreamConfigurationMap = reference;
        this.getInputSizeshNQ4ISI = internalLogger;
        this.getHighSpeedVideoFpsRangesFor = actionTrackingStrategy;
        this.getHighResolutionOutputSizeshNQ4ISI = actionTrackingStrategy2;
        this.getHighSpeedVideoSizes = "";
        android.content.Context context = reference.get();
        if (context != null) {
            actionTrackingStrategy.register(sdkCore, context);
            actionTrackingStrategy2.register(sdkCore, context);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(android.view.MotionEvent e) {
        com.datadog.android.rum.tracking.ViewTarget highSpeedVideoFpsRangesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
        android.view.Window window = this.getOutputMinFrameDurationlomOqCM.get();
        android.view.View decorView = window != null ? window.getDecorView() : null;
        if (decorView == null || (highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(decorView, e.getX(), e.getY(), false)) == null) {
            return true;
        }
        Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor);
        return true;
    }

    public final void onUp(android.view.MotionEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        android.view.Window window = this.getOutputMinFrameDurationlomOqCM.get();
        android.view.View decorView = window != null ? window.getDecorView() : null;
        com.datadog.android.rum.RumActionType rumActionType = this.getOutputMinFrameDuration;
        if (rumActionType != null) {
            com.datadog.android.rum.RumMonitor rumMonitor = com.datadog.android.rum.GlobalRumMonitor.get(this.getOutputStallDuration);
            com.datadog.android.rum.tracking.ViewTarget viewTarget = this.getOutputSizeshNQ4ISI;
            if (decorView != null && viewTarget != null) {
                rumMonitor.stopAction(rumActionType, com.datadog.android.rum.internal.instrumentation.gestures.GesturesUtilsKt.resolveViewTargetName(this.getInputFormats, viewTarget), Camera2StreamConfigurationMap(viewTarget, event));
            }
        } else if (decorView != null) {
            com.datadog.android.rum.tracking.ViewTarget highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(decorView, this.getHighSpeedVideoSizesFor, this.getOutputFormats, false);
            com.datadog.android.rum.tracking.ViewTarget highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(decorView, event.getX(), event.getY(), false);
            if (highSpeedVideoFpsRangesFor != null) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(highSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor2)) {
                    highSpeedVideoFpsRangesFor = null;
                }
                if (highSpeedVideoFpsRangesFor != null) {
                    Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor);
                }
            }
        }
        this.getOutputSizeshNQ4ISI = null;
        this.getOutputMinFrameDuration = null;
        this.getHighSpeedVideoSizes = "";
        this.getOutputFormats = 0.0f;
        this.getHighSpeedVideoSizesFor = 0.0f;
    }

    @Override // com.datadog.android.rum.internal.instrumentation.gestures.GestureListenerCompat, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(android.view.MotionEvent startDownEvent, android.view.MotionEvent endUpEvent, float velocityX, float velocityY) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endUpEvent, "");
        this.getOutputMinFrameDuration = com.datadog.android.rum.RumActionType.SWIPE;
        return false;
    }

    @Override // com.datadog.android.rum.internal.instrumentation.gestures.GestureListenerCompat, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(android.view.MotionEvent startDownEvent, android.view.MotionEvent currentMoveEvent, float distanceX, float distanceY) {
        android.view.View decorView;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentMoveEvent, "");
        com.datadog.android.rum.RumMonitor rumMonitor = com.datadog.android.rum.GlobalRumMonitor.get(this.getOutputStallDuration);
        android.view.Window window = this.getOutputMinFrameDurationlomOqCM.get();
        if (window == null || (decorView = window.getDecorView()) == null || this.getOutputMinFrameDuration != null) {
            return false;
        }
        com.datadog.android.rum.tracking.ViewTarget highSpeedVideoFpsRangesFor = startDownEvent != null ? getHighSpeedVideoFpsRangesFor(decorView, startDownEvent.getX(), startDownEvent.getY(), true) : null;
        if (highSpeedVideoFpsRangesFor == null) {
            return false;
        }
        this.getOutputSizeshNQ4ISI = highSpeedVideoFpsRangesFor;
        rumMonitor.startAction(com.datadog.android.rum.RumActionType.SCROLL, com.datadog.android.rum.internal.instrumentation.gestures.GesturesUtilsKt.resolveViewTargetName(this.getInputFormats, highSpeedVideoFpsRangesFor), Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor, null));
        this.getOutputMinFrameDuration = com.datadog.android.rum.RumActionType.SCROLL;
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (r10 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (r9 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        r6 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r8.getVisibility() != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if ((r8 instanceof android.view.ViewGroup) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        r8 = (android.view.ViewGroup) r8;
        r9 = r8.getChildCount();
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (r10 >= r9) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        r3.add(r8.getChildAt(r10));
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
    
        if (r10 != null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final com.datadog.android.rum.tracking.ViewTarget getHighSpeedVideoFpsRangesFor(android.view.View p0, float p1, float p2, boolean p3) {
        final java.lang.String str;
        com.datadog.android.rum.tracking.ViewTarget findTargetForTap;
        com.datadog.android.rum.tracking.ViewTarget findTargetForTap2;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(0, p0);
        boolean z = false;
        com.datadog.android.rum.tracking.ViewTarget viewTarget = null;
        while (!linkedList.isEmpty()) {
            java.lang.Object remove = linkedList.remove(0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(remove, "");
            android.view.View view = (android.view.View) remove;
            if (!z) {
                java.lang.String name2 = view.getClass().getName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
                if (!kotlin.text.StringsKt.startsWith$default(name2, "androidx.compose.ui.platform.ComposeView", false, 2, (java.lang.Object) null)) {
                    z = false;
                    if (!p3) {
                        findTargetForTap = this.getHighResolutionOutputSizeshNQ4ISI.findTargetForScroll(view, p1, p2);
                        if (findTargetForTap == null) {
                            findTargetForTap = null;
                        }
                        findTargetForTap2 = this.getHighSpeedVideoFpsRangesFor.findTargetForScroll(view, p1, p2);
                    } else {
                        findTargetForTap = this.getHighResolutionOutputSizeshNQ4ISI.findTargetForTap(view, p1, p2);
                        if (findTargetForTap == null) {
                            findTargetForTap = null;
                        }
                        findTargetForTap2 = this.getHighSpeedVideoFpsRangesFor.findTargetForTap(view, p1, p2);
                    }
                }
            }
            z = true;
            if (!p3) {
            }
        }
        if (viewTarget == null) {
            if (z) {
                str = MSG_NO_COMPOSE_TARGET;
            } else {
                str = MSG_NO_TARGET_ACTION;
            }
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getInputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener$findTarget$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return str;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        }
        return viewTarget;
    }

    private final void Camera2StreamConfigurationMap(com.datadog.android.rum.tracking.ViewTarget p0) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        android.view.View view = p0.getViewRef().get();
        if (view != null) {
            java.lang.String resourceIdName = com.datadog.android.rum.internal.instrumentation.gestures.GesturesUtilsKt.resourceIdName(this.Camera2StreamConfigurationMap.get(), view.getId());
            linkedHashMap.put(com.datadog.android.rum.RumAttributes.ACTION_TARGET_CLASS_NAME, com.datadog.android.rum.internal.instrumentation.gestures.GesturesUtilsKt.targetClassName(view));
            linkedHashMap.put(com.datadog.android.rum.RumAttributes.ACTION_TARGET_RESOURCE_ID, resourceIdName);
            for (com.datadog.android.rum.tracking.ViewAttributesProvider viewAttributesProvider : this.getHighSpeedVideoFpsRanges) {
                viewAttributesProvider.extractAttributes(view, linkedHashMap);
            }
        }
        com.datadog.android.rum.tracking.Node node = p0.getNode();
        if (node != null) {
            linkedHashMap.putAll(node.getCustomAttributes());
        }
        com.datadog.android.rum.GlobalRumMonitor.get(this.getOutputStallDuration).addAction(com.datadog.android.rum.RumActionType.TAP, com.datadog.android.rum.internal.instrumentation.gestures.GesturesUtilsKt.resolveViewTargetName(this.getInputFormats, p0), linkedHashMap);
    }

    private final java.util.Map<java.lang.String, java.lang.Object> Camera2StreamConfigurationMap(com.datadog.android.rum.tracking.ViewTarget p0, android.view.MotionEvent p1) {
        java.lang.String str;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        android.view.View view = p0.getViewRef().get();
        if (view != null) {
            java.lang.String resourceIdName = com.datadog.android.rum.internal.instrumentation.gestures.GesturesUtilsKt.resourceIdName(this.Camera2StreamConfigurationMap.get(), view.getId());
            linkedHashMap.put(com.datadog.android.rum.RumAttributes.ACTION_TARGET_CLASS_NAME, com.datadog.android.rum.internal.instrumentation.gestures.GesturesUtilsKt.targetClassName(view));
            linkedHashMap.put(com.datadog.android.rum.RumAttributes.ACTION_TARGET_RESOURCE_ID, resourceIdName);
            for (com.datadog.android.rum.tracking.ViewAttributesProvider viewAttributesProvider : this.getHighSpeedVideoFpsRanges) {
                viewAttributesProvider.extractAttributes(view, linkedHashMap);
            }
        }
        com.datadog.android.rum.tracking.Node node = p0.getNode();
        if (node != null) {
            linkedHashMap.putAll(node.getCustomAttributes());
        }
        if (p1 != null) {
            float x = p1.getX() - this.getHighSpeedVideoSizesFor;
            float y = p1.getY() - this.getOutputFormats;
            if (java.lang.Math.abs(x) > java.lang.Math.abs(y)) {
                if (x > 0.0f) {
                    str = SCROLL_DIRECTION_RIGHT;
                } else {
                    str = SCROLL_DIRECTION_LEFT;
                }
            } else if (y > 0.0f) {
                str = SCROLL_DIRECTION_DOWN;
            } else {
                str = SCROLL_DIRECTION_UP;
            }
            this.getHighSpeedVideoSizes = str;
            linkedHashMap.put(com.datadog.android.rum.RumAttributes.ACTION_GESTURE_DIRECTION, str);
        }
        return linkedHashMap;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(android.view.MotionEvent e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
        this.getOutputSizeshNQ4ISI = null;
        this.getOutputMinFrameDuration = null;
        this.getHighSpeedVideoSizes = "";
        this.getOutputFormats = 0.0f;
        this.getHighSpeedVideoSizesFor = 0.0f;
        this.getHighSpeedVideoSizesFor = e.getX();
        this.getOutputFormats = e.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(android.view.MotionEvent e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(android.view.MotionEvent e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
    }
}
