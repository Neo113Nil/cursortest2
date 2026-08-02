package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\n\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010\",\u0010\u0015\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00018G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0003\"\u0004\b\u0013\u0010\u0014\"&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u001b\u001a\u00020\u0000*\u00020\u00008CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u001e\u0010 \u001a\u00020\u000e*\u00020\u00008AX\u0080\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroid/view/View;", "Landroidx/compose/runtime/CompositionContext;", "findViewTreeCompositionContext", "(Landroid/view/View;)Landroidx/compose/runtime/CompositionContext;", "Landroid/content/Context;", "p0", "Lkotlinx/coroutines/flow/StateFlow;", "", "Camera2StreamConfigurationMap", "(Landroid/content/Context;)Lkotlinx/coroutines/flow/StateFlow;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroidx/lifecycle/Lifecycle;", com.paypal.oslo.core.telemetry.AppLifecycleConstants.FEATURE, "Landroidx/compose/runtime/Recomposer;", "createLifecycleAwareWindowRecomposer", "(Landroid/view/View;Lkotlin/coroutines/CoroutineContext;Landroidx/lifecycle/Lifecycle;)Landroidx/compose/runtime/Recomposer;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getCompositionContext", "setCompositionContext", "(Landroid/view/View;Landroidx/compose/runtime/CompositionContext;)V", "compositionContext", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges", "(Landroid/view/View;)Landroid/view/View;", "getHighSpeedVideoSizes", "getWindowRecomposer", "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "getWindowRecomposer$annotations", "(Landroid/view/View;)V", "windowRecomposer"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WindowRecomposer_androidKt {
    private static final java.util.Map<android.content.Context, kotlinx.coroutines.flow.StateFlow<java.lang.Float>> getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashMap();

    public static /* synthetic */ void getWindowRecomposer$annotations(android.view.View view) {
    }

    public static final androidx.compose.runtime.CompositionContext getCompositionContext(android.view.View view) {
        java.lang.Object tag = view.getTag(androidx.compose.ui.R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof androidx.compose.runtime.CompositionContext) {
            return (androidx.compose.runtime.CompositionContext) tag;
        }
        return null;
    }

    public static final void setCompositionContext(android.view.View view, androidx.compose.runtime.CompositionContext compositionContext) {
        view.setTag(androidx.compose.ui.R.id.androidx_compose_ui_view_composition_context, compositionContext);
    }

    public static final androidx.compose.runtime.CompositionContext findViewTreeCompositionContext(android.view.View view) {
        androidx.compose.runtime.CompositionContext compositionContext = getCompositionContext(view);
        if (compositionContext != null) {
            return compositionContext;
        }
        java.lang.Object parent = view.getParent();
        while (compositionContext == null && (parent instanceof android.view.View)) {
            android.view.View view2 = (android.view.View) parent;
            compositionContext = getCompositionContext(view2);
            parent = androidx.core.viewtree.ViewTree.getParentOrViewTreeDisjointParent(view2);
        }
        return compositionContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1] */
    public static final kotlinx.coroutines.flow.StateFlow<java.lang.Float> Camera2StreamConfigurationMap(android.content.Context context) {
        kotlinx.coroutines.flow.StateFlow<java.lang.Float> stateFlow;
        java.util.Map<android.content.Context, kotlinx.coroutines.flow.StateFlow<java.lang.Float>> map = getHighResolutionOutputSizeshNQ4ISI;
        synchronized (map) {
            kotlinx.coroutines.flow.StateFlow<java.lang.Float> stateFlow2 = map.get(context);
            if (stateFlow2 == null) {
                android.content.ContentResolver contentResolver = context.getContentResolver();
                android.net.Uri uriFor = android.provider.Settings.Global.getUriFor("animator_duration_scale");
                final kotlinx.coroutines.channels.Channel Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(-1, null, null, 6, null);
                final android.os.Handler createAsync = androidx.core.os.HandlerCompat.createAsync(android.os.Looper.getMainLooper());
                stateFlow2 = kotlinx.coroutines.flow.FlowKt.stateIn(kotlinx.coroutines.flow.FlowKt.flow(new androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new android.database.ContentObserver(createAsync) { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1
                    @Override // android.database.ContentObserver
                    public final void onChange(boolean selfChange, android.net.Uri uri) {
                        Channel$default.mo9266trySendJP2dKIU(kotlin.Unit.INSTANCE);
                    }
                }, Channel$default, context, null)), kotlinx.coroutines.CoroutineScopeKt.MainScope(), kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted.INSTANCE, 0L, 0L, 3, null), java.lang.Float.valueOf(android.provider.Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                map.put(context, stateFlow2);
            }
            stateFlow = stateFlow2;
        }
        return stateFlow;
    }

    private static final android.view.View getHighSpeedVideoFpsRanges(android.view.View view) {
        java.lang.Object parent = view.getParent();
        while (parent instanceof android.view.View) {
            android.view.View view2 = (android.view.View) parent;
            if (view2.getId() == 16908290) {
                break;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final androidx.compose.runtime.Recomposer getWindowRecomposer(android.view.View view) {
        if (!view.isAttachedToWindow()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot locate windowRecomposer; View ");
            sb.append(view);
            sb.append(" is not attached to a window");
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException(sb.toString());
        }
        android.view.View highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(view);
        androidx.compose.runtime.CompositionContext compositionContext = getCompositionContext(highSpeedVideoFpsRanges);
        if (compositionContext == null) {
            return androidx.compose.ui.platform.WindowRecomposerPolicy.INSTANCE.createAndInstallWindowRecomposer$ui(highSpeedVideoFpsRanges);
        }
        if (compositionContext instanceof androidx.compose.runtime.Recomposer) {
            return (androidx.compose.runtime.Recomposer) compositionContext;
        }
        throw new java.lang.IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
    }

    public static /* synthetic */ androidx.compose.runtime.Recomposer createLifecycleAwareWindowRecomposer$default(android.view.View view, kotlin.coroutines.CoroutineContext coroutineContext, androidx.view.Lifecycle lifecycle, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            lifecycle = null;
        }
        return createLifecycleAwareWindowRecomposer(view, coroutineContext, lifecycle);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [T, androidx.compose.ui.platform.MotionDurationScaleImpl] */
    public static final androidx.compose.runtime.Recomposer createLifecycleAwareWindowRecomposer(final android.view.View view, kotlin.coroutines.CoroutineContext coroutineContext, androidx.view.Lifecycle lifecycle) {
        final androidx.compose.runtime.PausableMonotonicFrameClock pausableMonotonicFrameClock;
        if (coroutineContext.get(kotlin.coroutines.ContinuationInterceptor.INSTANCE) == null || coroutineContext.get(androidx.compose.runtime.MonotonicFrameClock.INSTANCE) == null) {
            coroutineContext = androidx.compose.ui.platform.AndroidUiDispatcher.INSTANCE.getCurrentThread().plus(coroutineContext);
        }
        androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock = (androidx.compose.runtime.MonotonicFrameClock) coroutineContext.get(androidx.compose.runtime.MonotonicFrameClock.INSTANCE);
        if (monotonicFrameClock != null) {
            androidx.compose.runtime.PausableMonotonicFrameClock pausableMonotonicFrameClock2 = new androidx.compose.runtime.PausableMonotonicFrameClock(monotonicFrameClock);
            pausableMonotonicFrameClock2.pause();
            pausableMonotonicFrameClock = pausableMonotonicFrameClock2;
        } else {
            pausableMonotonicFrameClock = null;
        }
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        androidx.compose.ui.MotionDurationScale motionDurationScale = (androidx.compose.ui.MotionDurationScale) coroutineContext.get(androidx.compose.ui.MotionDurationScale.INSTANCE);
        if (motionDurationScale == null) {
            ?? motionDurationScaleImpl = new androidx.compose.ui.platform.MotionDurationScaleImpl();
            objectRef.element = motionDurationScaleImpl;
            motionDurationScale = (androidx.compose.ui.MotionDurationScale) motionDurationScaleImpl;
        }
        kotlin.coroutines.CoroutineContext plus = coroutineContext.plus(pausableMonotonicFrameClock != null ? pausableMonotonicFrameClock : kotlin.coroutines.EmptyCoroutineContext.INSTANCE).plus(motionDurationScale);
        final androidx.compose.runtime.Recomposer recomposer = new androidx.compose.runtime.Recomposer(plus);
        recomposer.pauseCompositionFrameClock();
        final kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(plus);
        if (lifecycle == null) {
            androidx.view.LifecycleOwner lifecycleOwner = androidx.view.C0276ViewTreeLifecycleOwner.get(view);
            lifecycle = lifecycleOwner != null ? lifecycleOwner.getLifecycleRegistry() : null;
        }
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$1
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(android.view.View v) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(android.view.View v) {
                    view.removeOnAttachStateChangeListener(this);
                    recomposer.cancel();
                }
            });
            lifecycle.addObserver(new androidx.view.LifecycleEventObserver() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2
                @Override // androidx.view.LifecycleEventObserver
                public final void onStateChanged(androidx.view.LifecycleOwner source, androidx.lifecycle.Lifecycle.Event event) {
                    switch (androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2.WhenMappings.$EnumSwitchMapping$0[event.ordinal()]) {
                        case 1:
                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScope.this, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(objectRef, recomposer, source, this, view, null), 1, null);
                            return;
                        case 2:
                            androidx.compose.runtime.PausableMonotonicFrameClock pausableMonotonicFrameClock3 = pausableMonotonicFrameClock;
                            if (pausableMonotonicFrameClock3 != null) {
                                pausableMonotonicFrameClock3.resume();
                            }
                            recomposer.resumeCompositionFrameClock();
                            return;
                        case 3:
                            recomposer.pauseCompositionFrameClock();
                            return;
                        case 4:
                            recomposer.cancel();
                            return;
                        case 5:
                        case 6:
                        case 7:
                            return;
                        default:
                            throw new kotlin.NoWhenBranchMatchedException();
                    }
                }

                @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[androidx.lifecycle.Lifecycle.Event.values().length];
                        try {
                            iArr[androidx.lifecycle.Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                        } catch (java.lang.NoSuchFieldError unused) {
                        }
                        try {
                            iArr[androidx.lifecycle.Lifecycle.Event.ON_START.ordinal()] = 2;
                        } catch (java.lang.NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[androidx.lifecycle.Lifecycle.Event.ON_STOP.ordinal()] = 3;
                        } catch (java.lang.NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[androidx.lifecycle.Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                        } catch (java.lang.NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[androidx.lifecycle.Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
                        } catch (java.lang.NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[androidx.lifecycle.Lifecycle.Event.ON_RESUME.ordinal()] = 6;
                        } catch (java.lang.NoSuchFieldError unused6) {
                        }
                        try {
                            iArr[androidx.lifecycle.Lifecycle.Event.ON_ANY.ordinal()] = 7;
                        } catch (java.lang.NoSuchFieldError unused7) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }
            });
            return recomposer;
        }
        androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("ViewTreeLifecycleOwner not found from ".concat(java.lang.String.valueOf(view)));
        throw new kotlin.KotlinNothingValueException();
    }
}
