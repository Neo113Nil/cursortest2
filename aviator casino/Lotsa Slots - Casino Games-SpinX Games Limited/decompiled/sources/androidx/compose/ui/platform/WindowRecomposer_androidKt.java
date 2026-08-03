package androidx.compose.ui.platform;

/* compiled from: WindowRecomposer.android.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0002\u001a\"\u0010\u0018\u001a\u00020\u0011*\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0007\u001a\f\u0010\u001d\u001a\u0004\u0018\u00010\u0006*\u00020\b\" \u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\",\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\"\u0018\u0010\r\u001a\u00020\b*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u001e\u0010\u0010\u001a\u00020\u0011*\u00020\b8@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"animationScale", "", "Landroid/content/Context;", "Lkotlinx/coroutines/flow/StateFlow;", "", "value", "Landroidx/compose/runtime/CompositionContext;", "compositionContext", "Landroid/view/View;", "getCompositionContext", "(Landroid/view/View;)Landroidx/compose/runtime/CompositionContext;", "setCompositionContext", "(Landroid/view/View;Landroidx/compose/runtime/CompositionContext;)V", "contentChild", "getContentChild", "(Landroid/view/View;)Landroid/view/View;", "windowRecomposer", "Landroidx/compose/runtime/Recomposer;", "getWindowRecomposer$annotations", "(Landroid/view/View;)V", "getWindowRecomposer", "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "getAnimationScaleFlowFor", "applicationContext", "createLifecycleAwareWindowRecomposer", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "findViewTreeCompositionContext", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WindowRecomposer_androidKt {
    private static final java.util.Map<android.content.Context, kotlinx.coroutines.flow.StateFlow<java.lang.Float>> animationScale = new java.util.LinkedHashMap();

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
        for (android.view.ViewParent parent = view.getParent(); compositionContext == null && (parent instanceof android.view.View); parent = parent.getParent()) {
            compositionContext = getCompositionContext((android.view.View) parent);
        }
        return compositionContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1] */
    public static final kotlinx.coroutines.flow.StateFlow<java.lang.Float> getAnimationScaleFlowFor(android.content.Context context) {
        kotlinx.coroutines.flow.StateFlow<java.lang.Float> stateFlow;
        java.util.Map<android.content.Context, kotlinx.coroutines.flow.StateFlow<java.lang.Float>> map = animationScale;
        synchronized (map) {
            kotlinx.coroutines.flow.StateFlow<java.lang.Float> stateFlow2 = map.get(context);
            if (stateFlow2 == null) {
                android.content.ContentResolver contentResolver = context.getContentResolver();
                android.net.Uri uriFor = android.provider.Settings.Global.getUriFor("animator_duration_scale");
                final kotlinx.coroutines.channels.Channel Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(-1, null, null, 6, null);
                final android.os.Handler createAsync = androidx.core.os.HandlerCompat.createAsync(android.os.Looper.getMainLooper());
                stateFlow2 = kotlinx.coroutines.flow.FlowKt.stateIn(kotlinx.coroutines.flow.FlowKt.flow(new androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new android.database.ContentObserver(createAsync) { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1
                    @Override // android.database.ContentObserver
                    public void onChange(boolean selfChange, android.net.Uri uri) {
                        Channel$default.mo10716trySendJP2dKIU(kotlin.Unit.INSTANCE);
                    }
                }, Channel$default, context, null)), kotlinx.coroutines.CoroutineScopeKt.MainScope(), kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted.INSTANCE, 0L, 0L, 3, null), java.lang.Float.valueOf(android.provider.Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                map.put(context, stateFlow2);
            }
            stateFlow = stateFlow2;
        }
        return stateFlow;
    }

    private static final android.view.View getContentChild(android.view.View view) {
        java.lang.Object parent = view.getParent();
        while (parent instanceof android.view.View) {
            android.view.View view2 = (android.view.View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final androidx.compose.runtime.Recomposer getWindowRecomposer(android.view.View view) {
        if (!view.isAttachedToWindow()) {
            throw new java.lang.IllegalStateException(("Cannot locate windowRecomposer; View " + view + " is not attached to a window").toString());
        }
        android.view.View contentChild = getContentChild(view);
        androidx.compose.runtime.CompositionContext compositionContext = getCompositionContext(contentChild);
        if (compositionContext == null) {
            return androidx.compose.ui.platform.WindowRecomposerPolicy.INSTANCE.createAndInstallWindowRecomposer$ui_release(contentChild);
        }
        if (compositionContext instanceof androidx.compose.runtime.Recomposer) {
            return (androidx.compose.runtime.Recomposer) compositionContext;
        }
        throw new java.lang.IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
    }

    public static /* synthetic */ androidx.compose.runtime.Recomposer createLifecycleAwareWindowRecomposer$default(android.view.View view, kotlin.coroutines.CoroutineContext coroutineContext, androidx.lifecycle.Lifecycle lifecycle, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            lifecycle = null;
        }
        return createLifecycleAwareWindowRecomposer(view, coroutineContext, lifecycle);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [T, androidx.compose.ui.platform.MotionDurationScaleImpl] */
    public static final androidx.compose.runtime.Recomposer createLifecycleAwareWindowRecomposer(final android.view.View view, kotlin.coroutines.CoroutineContext coroutineContext, androidx.lifecycle.Lifecycle lifecycle) {
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
            androidx.lifecycle.LifecycleOwner lifecycleOwner = androidx.lifecycle.ViewTreeLifecycleOwner.get(view);
            lifecycle = lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null;
        }
        if (lifecycle == null) {
            throw new java.lang.IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
        }
        view.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(android.view.View v) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(android.view.View v) {
                view.removeOnAttachStateChangeListener(this);
                recomposer.cancel();
            }
        });
        lifecycle.addObserver(new androidx.lifecycle.LifecycleEventObserver() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2

            /* compiled from: WindowRecomposer.android.kt */
            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
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

            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(androidx.lifecycle.LifecycleOwner source, androidx.lifecycle.Lifecycle.Event event) {
                int i = androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2.WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                if (i == 1) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScope.this, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(objectRef, recomposer, source, this, view, null), 1, null);
                    return;
                }
                if (i == 2) {
                    androidx.compose.runtime.PausableMonotonicFrameClock pausableMonotonicFrameClock3 = pausableMonotonicFrameClock;
                    if (pausableMonotonicFrameClock3 != null) {
                        pausableMonotonicFrameClock3.resume();
                    }
                    recomposer.resumeCompositionFrameClock();
                    return;
                }
                if (i == 3) {
                    recomposer.pauseCompositionFrameClock();
                } else {
                    if (i != 4) {
                        return;
                    }
                    recomposer.cancel();
                }
            }
        });
        return recomposer;
    }
}
