package androidx.view;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001/B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0015\b\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001f\u0010 \u001a\u00060'R\u00020\u00008CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010*R\u0014\u0010.\u001a\u00020+8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "", "Ljava/lang/Runnable;", "fallbackOnBackPressed", "Landroidx/core/util/Consumer;", "", "onHasEnabledCallbacksChanged", "<init>", "(Ljava/lang/Runnable;Landroidx/core/util/Consumer;)V", "(Ljava/lang/Runnable;)V", "Landroid/window/OnBackInvokedDispatcher;", "invoker", "", "setOnBackInvokedDispatcher", "(Landroid/window/OnBackInvokedDispatcher;)V", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "addCallback", "(Landroidx/activity/OnBackPressedCallback;)V", "Landroidx/lifecycle/LifecycleOwner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "(Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/OnBackPressedCallback;)V", "hasEnabledCallbacks", "()Z", "Landroidx/activity/BackEventCompat;", "backEvent", "dispatchOnBackStarted", "(Landroidx/activity/BackEventCompat;)V", "dispatchOnBackProgressed", "onBackPressed", "()V", "dispatchOnBackCancelled", "Camera2StreamConfigurationMap", "Ljava/lang/Runnable;", "getHighSpeedVideoFpsRangesFor", "Landroidx/core/util/Consumer;", "getHighSpeedVideoSizes", "Z", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/activity/OnBackPressedDispatcher$OnBackPressedEventInput;", "getHighSpeedVideoFpsRanges", "Lkotlin/Lazy;", "()Landroidx/activity/OnBackPressedDispatcher$OnBackPressedEventInput;", "Landroidx/navigationevent/NavigationEventDispatcher;", "getEventDispatcher$activity", "()Landroidx/navigationevent/NavigationEventDispatcher;", "eventDispatcher", "OnBackPressedEventInput"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.Runnable getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.Lazy Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.core.util.Consumer<java.lang.Boolean> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    public OnBackPressedDispatcher(java.lang.Runnable runnable, androidx.core.util.Consumer<java.lang.Boolean> consumer) {
        this.getHighSpeedVideoFpsRangesFor = runnable;
        this.getHighSpeedVideoSizes = consumer;
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.view.OnBackPressedDispatcher.$r8$lambda$Ce6hmwzpZeR4nJ6cSxwnPFSCXfY(androidx.view.OnBackPressedDispatcher.this);
            }
        });
    }

    private final androidx.activity.OnBackPressedDispatcher.OnBackPressedEventInput getHighResolutionOutputSizeshNQ4ISI() {
        return (androidx.activity.OnBackPressedDispatcher.OnBackPressedEventInput) this.Camera2StreamConfigurationMap.getValue();
    }

    public final androidx.view.NavigationEventDispatcher getEventDispatcher$activity() {
        return getHighResolutionOutputSizeshNQ4ISI().getGetHighSpeedVideoFpsRanges();
    }

    public OnBackPressedDispatcher(java.lang.Runnable runnable) {
        this(runnable, null);
    }

    public /* synthetic */ OnBackPressedDispatcher(java.lang.Runnable runnable, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : runnable);
    }

    public final void setOnBackInvokedDispatcher(android.window.OnBackInvokedDispatcher invoker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoker, "");
        getEventDispatcher$activity().addInput(new androidx.view.OnBackInvokedDefaultInput(invoker), 1);
        getEventDispatcher$activity().addInput(new androidx.view.OnBackInvokedOverlayInput(invoker), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void addCallback(androidx.view.OnBackPressedCallback onBackPressedCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        androidx.view.NavigationEventDispatcher.addHandler$default(getEventDispatcher$activity(), onBackPressedCallback.createNavigationEventHandler$activity(new androidx.view.OnBackPressedCallbackInfo(onBackPressedCallback, null, 2, 0 == true ? 1 : 0)), 0, 2, null);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.activity.OnBackPressedDispatcher$addCallback$observer$1] */
    public final void addCallback(androidx.view.LifecycleOwner owner, androidx.view.OnBackPressedCallback onBackPressedCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        final androidx.view.Lifecycle lifecycle = owner.getLifecycle();
        if (lifecycle.getCamera2StreamConfigurationMap() == androidx.lifecycle.Lifecycle.State.DESTROYED) {
            return;
        }
        final androidx.activity.OnBackPressedCallback.OnBackPressedEventHandler createNavigationEventHandler$activity = onBackPressedCallback.createNavigationEventHandler$activity(new androidx.view.OnBackPressedCallbackInfo(onBackPressedCallback, owner));
        if (androidx.view.ActivityFlags.isOnBackPressedLifecycleOrderMaintained) {
            createNavigationEventHandler$activity.setLifecycleActive(false);
            androidx.view.NavigationEventDispatcher.addHandler$default(getEventDispatcher$activity(), createNavigationEventHandler$activity, 0, 2, null);
        }
        final ?? r1 = new androidx.view.LifecycleEventObserver() { // from class: androidx.activity.OnBackPressedDispatcher$addCallback$observer$1
            @Override // androidx.view.LifecycleEventObserver
            public final void onStateChanged(androidx.view.LifecycleOwner source, androidx.lifecycle.Lifecycle.Event event) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
                int i = androidx.activity.OnBackPressedDispatcher$addCallback$observer$1.WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                if (i == 1) {
                    if (androidx.view.ActivityFlags.isOnBackPressedLifecycleOrderMaintained) {
                        androidx.activity.OnBackPressedCallback.OnBackPressedEventHandler.this.setLifecycleActive(true);
                        return;
                    } else {
                        androidx.view.NavigationEventDispatcher.addHandler$default(this.getEventDispatcher$activity(), androidx.activity.OnBackPressedCallback.OnBackPressedEventHandler.this, 0, 2, null);
                        return;
                    }
                }
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    androidx.activity.OnBackPressedCallback.OnBackPressedEventHandler.this.remove();
                    lifecycle.removeObserver(this);
                    return;
                }
                if (androidx.view.ActivityFlags.isOnBackPressedLifecycleOrderMaintained) {
                    androidx.activity.OnBackPressedCallback.OnBackPressedEventHandler.this.setLifecycleActive(false);
                } else {
                    androidx.activity.OnBackPressedCallback.OnBackPressedEventHandler.this.remove();
                }
            }

            @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[androidx.lifecycle.Lifecycle.Event.values().length];
                    try {
                        iArr[androidx.lifecycle.Lifecycle.Event.ON_START.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[androidx.lifecycle.Lifecycle.Event.ON_STOP.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[androidx.lifecycle.Lifecycle.Event.ON_DESTROY.ordinal()] = 3;
                    } catch (java.lang.NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }
        };
        lifecycle.addObserver((androidx.view.LifecycleObserver) r1);
        onBackPressedCallback.addCloseable$activity(new java.lang.AutoCloseable() { // from class: androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticLambda1
            @Override // java.lang.AutoCloseable
            public final void close() {
                androidx.view.Lifecycle.this.removeObserver(r1);
            }
        });
    }

    /* renamed from: hasEnabledCallbacks, reason: from getter */
    public final boolean getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void dispatchOnBackStarted(androidx.view.BackEventCompat backEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backEvent, "");
        getHighResolutionOutputSizeshNQ4ISI().getHighSpeedVideoFpsRanges(backEvent.toNavigationEvent());
    }

    public final void dispatchOnBackProgressed(androidx.view.BackEventCompat backEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backEvent, "");
        getHighResolutionOutputSizeshNQ4ISI().getHighSpeedVideoSizes(backEvent.toNavigationEvent());
    }

    public final void onBackPressed() {
        getHighResolutionOutputSizeshNQ4ISI().getHighSpeedVideoFpsRanges();
    }

    public final void dispatchOnBackCancelled() {
        getHighResolutionOutputSizeshNQ4ISI().getHighSpeedVideoSizes();
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\rR\u0017\u0010\n\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$OnBackPressedEventInput;", "Landroidx/navigationevent/NavigationEventInput;", "<init>", "(Landroidx/activity/OnBackPressedDispatcher;)V", "", "p0", "", "onHasEnabledHandlersChanged", "(Z)V", "Landroidx/navigationevent/NavigationEvent;", "getHighSpeedVideoFpsRanges", "(Landroidx/navigationevent/NavigationEvent;)V", "getHighSpeedVideoSizes", "()V", "Landroidx/navigationevent/NavigationEventDispatcher;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/navigationevent/NavigationEventDispatcher;", "Camera2StreamConfigurationMap", "()Landroidx/navigationevent/NavigationEventDispatcher;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    final class OnBackPressedEventInput extends androidx.view.NavigationEventInput {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final androidx.view.NavigationEventDispatcher getHighSpeedVideoFpsRanges;

        public OnBackPressedEventInput() {
            androidx.view.NavigationEventDispatcher navigationEventDispatcher = new androidx.view.NavigationEventDispatcher(new androidx.view.OnBackCompletedFallback() { // from class: androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0
                @Override // androidx.view.OnBackCompletedFallback
                public final void onBackCompletedFallback() {
                    androidx.activity.OnBackPressedDispatcher.OnBackPressedEventInput.getHighSpeedVideoSizes(androidx.view.OnBackPressedDispatcher.this);
                }
            });
            navigationEventDispatcher.addInput(this);
            this.getHighSpeedVideoFpsRanges = navigationEventDispatcher;
        }

        /* renamed from: Camera2StreamConfigurationMap, reason: from getter */
        public final androidx.view.NavigationEventDispatcher getGetHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // androidx.view.NavigationEventInput
        public final void onHasEnabledHandlersChanged(boolean p0) {
            androidx.view.OnBackPressedDispatcher.this.getHighResolutionOutputSizeshNQ4ISI = p0;
            androidx.core.util.Consumer consumer = androidx.view.OnBackPressedDispatcher.this.getHighSpeedVideoSizes;
            if (consumer != null) {
                consumer.accept(java.lang.Boolean.valueOf(p0));
            }
        }

        public final void getHighSpeedVideoFpsRanges(androidx.view.NavigationEvent p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            dispatchOnBackStarted(p0);
        }

        public final void getHighSpeedVideoSizes(androidx.view.NavigationEvent p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            dispatchOnBackProgressed(p0);
        }

        public final void getHighSpeedVideoSizes() {
            dispatchOnBackCancelled();
        }

        public final void getHighSpeedVideoFpsRanges() {
            dispatchOnBackCompleted();
        }

        public static /* synthetic */ void getHighSpeedVideoSizes(androidx.view.OnBackPressedDispatcher onBackPressedDispatcher) {
            java.lang.Runnable runnable = onBackPressedDispatcher.getHighSpeedVideoFpsRangesFor;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public static /* synthetic */ androidx.activity.OnBackPressedDispatcher.OnBackPressedEventInput $r8$lambda$Ce6hmwzpZeR4nJ6cSxwnPFSCXfY(androidx.view.OnBackPressedDispatcher onBackPressedDispatcher) {
        return onBackPressedDispatcher.new OnBackPressedEventInput();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnBackPressedDispatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
