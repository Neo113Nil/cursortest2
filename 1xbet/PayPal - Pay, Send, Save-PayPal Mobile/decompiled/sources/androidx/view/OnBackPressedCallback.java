package androidx.view;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\b\u0010\u0017\u001a\u00020\u0012H'J\b\u0010\u0018\u001a\u00020\u0012H\u0017J\u0019\u0010\u0019\u001a\u00020\u00122\n\u0010\u001a\u001a\u00060\u000fj\u0002`\u0010H\u0000¢\u0006\u0002\b\u001bJ\u0019\u0010\u001c\u001a\u00020\u00122\n\u0010\u001a\u001a\u00060\u000fj\u0002`\u0010H\u0000¢\u0006\u0002\b\u001dJ\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 H\u0000¢\u0006\u0002\b!R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00038\u0007@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0005R\u0018\u0010\r\u001a\f\u0012\b\u0012\u00060\u000fj\u0002`\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Landroidx/activity/OnBackPressedCallback;", "", "enabled", "", "<init>", "(Z)V", "eventHandlers", "", "Landroidx/activity/OnBackPressedCallback$OnBackPressedEventHandler;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "isEnabled", "()Z", "setEnabled", "closeables", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "remove", "", "handleOnBackStarted", "backEvent", "Landroidx/activity/BackEventCompat;", "handleOnBackProgressed", "handleOnBackPressed", "handleOnBackCancelled", "addCloseable", "closeable", "addCloseable$activity", "removeCloseable", "removeCloseable$activity", "createNavigationEventHandler", "info", "Landroidx/navigationevent/NavigationEventInfo;", "createNavigationEventHandler$activity", "OnBackPressedEventHandler", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class OnBackPressedCallback {
    private boolean isEnabled;
    private final java.util.List<androidx.activity.OnBackPressedCallback.OnBackPressedEventHandler> eventHandlers = new java.util.ArrayList();
    private final java.util.concurrent.CopyOnWriteArrayList<java.lang.AutoCloseable> closeables = new java.util.concurrent.CopyOnWriteArrayList<>();

    public void handleOnBackCancelled() {
    }

    public abstract void handleOnBackPressed();

    public OnBackPressedCallback(boolean z) {
        this.isEnabled = z;
    }

    /* renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        for (androidx.activity.OnBackPressedCallback.OnBackPressedEventHandler onBackPressedEventHandler : this.eventHandlers) {
            onBackPressedEventHandler.setBackEnabled(onBackPressedEventHandler.getIsLifecycleActive() && z);
        }
    }

    public final void remove() {
        java.util.Iterator<java.lang.AutoCloseable> it = this.closeables.iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9182m((java.lang.Object) it.next());
        }
        this.closeables.clear();
        java.util.Iterator<androidx.activity.OnBackPressedCallback.OnBackPressedEventHandler> it2 = this.eventHandlers.iterator();
        while (it2.hasNext()) {
            it2.next().remove();
        }
        this.eventHandlers.clear();
    }

    public final void addCloseable$activity(java.lang.AutoCloseable closeable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeable, "");
        this.closeables.add(closeable);
    }

    public final void removeCloseable$activity(java.lang.AutoCloseable closeable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeable, "");
        this.closeables.remove(closeable);
    }

    public final androidx.activity.OnBackPressedCallback.OnBackPressedEventHandler createNavigationEventHandler$activity(androidx.view.NavigationEventInfo info) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "");
        androidx.activity.OnBackPressedCallback.OnBackPressedEventHandler onBackPressedEventHandler = new androidx.activity.OnBackPressedCallback.OnBackPressedEventHandler(this, info);
        this.eventHandlers.add(onBackPressedEventHandler);
        return onBackPressedEventHandler;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R*\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/activity/OnBackPressedCallback$OnBackPressedEventHandler;", "Landroidx/navigationevent/NavigationEventHandler;", "Landroidx/navigationevent/NavigationEventInfo;", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "info", "<init>", "(Landroidx/activity/OnBackPressedCallback;Landroidx/navigationevent/NavigationEventInfo;)V", "Landroidx/navigationevent/NavigationEvent;", "event", "", "onBackStarted", "(Landroidx/navigationevent/NavigationEvent;)V", "onBackProgressed", "onBackCompleted", "()V", "onBackCancelled", "Camera2StreamConfigurationMap", "Landroidx/activity/OnBackPressedCallback;", "getHighSpeedVideoFpsRanges", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "isLifecycleActive", "Z", "()Z", "setLifecycleActive", "(Z)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class OnBackPressedEventHandler extends androidx.view.NavigationEventHandler<androidx.view.NavigationEventInfo> {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final androidx.view.OnBackPressedCallback getHighSpeedVideoFpsRanges;
        private boolean isLifecycleActive;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnBackPressedEventHandler(androidx.view.OnBackPressedCallback onBackPressedCallback, androidx.view.NavigationEventInfo navigationEventInfo) {
            super(navigationEventInfo, onBackPressedCallback.getIsEnabled());
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationEventInfo, "");
            this.getHighSpeedVideoFpsRanges = onBackPressedCallback;
            this.isLifecycleActive = true;
        }

        /* renamed from: isLifecycleActive, reason: from getter */
        public final boolean getIsLifecycleActive() {
            return this.isLifecycleActive;
        }

        public final void setLifecycleActive(boolean z) {
            this.isLifecycleActive = z;
            setBackEnabled(z && this.getHighSpeedVideoFpsRanges.getIsEnabled());
        }

        @Override // androidx.view.NavigationEventHandler
        public final void onBackStarted(androidx.view.NavigationEvent event) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
            this.getHighSpeedVideoFpsRanges.handleOnBackStarted(new androidx.view.BackEventCompat(event));
        }

        @Override // androidx.view.NavigationEventHandler
        public final void onBackProgressed(androidx.view.NavigationEvent event) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
            this.getHighSpeedVideoFpsRanges.handleOnBackProgressed(new androidx.view.BackEventCompat(event));
        }

        @Override // androidx.view.NavigationEventHandler
        public final void onBackCompleted() {
            this.getHighSpeedVideoFpsRanges.handleOnBackPressed();
        }

        @Override // androidx.view.NavigationEventHandler
        public final void onBackCancelled() {
            this.getHighSpeedVideoFpsRanges.handleOnBackCancelled();
        }
    }

    public void handleOnBackStarted(androidx.view.BackEventCompat backEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backEvent, "");
    }

    public void handleOnBackProgressed(androidx.view.BackEventCompat backEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backEvent, "");
    }
}
