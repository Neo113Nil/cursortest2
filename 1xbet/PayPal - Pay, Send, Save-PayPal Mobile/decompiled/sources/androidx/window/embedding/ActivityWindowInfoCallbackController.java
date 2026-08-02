package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0011\u0018\u00002\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0014\u0010\u001b\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\nH\u0011¢\u0006\u0002\b\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R:\u0010\u000b\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0012\u00060\u000fR\u00020\u00000\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Landroidx/window/embedding/ActivityWindowInfoCallbackController;", "", "embeddingExtension", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "<init>", "(Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;)V", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "extensionsCallback", "Landroidx/window/extensions/core/util/function/Consumer;", "Landroidx/window/extensions/embedding/EmbeddedActivityWindowInfo;", "callbacks", "", "Landroidx/core/util/Consumer;", "Landroidx/window/embedding/EmbeddedActivityWindowInfo;", "Landroidx/window/embedding/ActivityWindowInfoCallbackController$CallbackWrapper;", "getCallbacks$window_release$annotations", "()V", "getCallbacks$window_release", "()Ljava/util/Map;", "setCallbacks$window_release", "(Ljava/util/Map;)V", "addCallback", "", "activity", "Landroid/app/Activity;", com.sun.jna.Callback.METHOD_NAME, "removeCallback", "translate", "info", "translate$window_release", "CallbackWrapper", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class ActivityWindowInfoCallbackController {
    private final androidx.window.extensions.core.util.function.Consumer<androidx.window.extensions.embedding.EmbeddedActivityWindowInfo> Camera2StreamConfigurationMap;
    private java.util.Map<androidx.core.util.Consumer<androidx.window.embedding.EmbeddedActivityWindowInfo>, androidx.window.embedding.ActivityWindowInfoCallbackController.CallbackWrapper> getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.window.extensions.embedding.ActivityEmbeddingComponent getHighSpeedVideoFpsRanges;
    private final java.util.concurrent.locks.ReentrantLock getHighSpeedVideoFpsRangesFor;

    public static /* synthetic */ void getCallbacks$window_release$annotations() {
    }

    public ActivityWindowInfoCallbackController(androidx.window.extensions.embedding.ActivityEmbeddingComponent activityEmbeddingComponent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityEmbeddingComponent, "");
        this.getHighSpeedVideoFpsRanges = activityEmbeddingComponent;
        this.getHighSpeedVideoFpsRangesFor = new java.util.concurrent.locks.ReentrantLock();
        this.getHighResolutionOutputSizeshNQ4ISI = new android.util.ArrayMap();
        androidx.window.WindowSdkExtensions.INSTANCE.getInstance().requireExtensionVersion$window_release(6);
        this.Camera2StreamConfigurationMap = new androidx.window.reflection.Consumer2() { // from class: androidx.window.embedding.ActivityWindowInfoCallbackController$$ExternalSyntheticLambda0
            @Override // androidx.window.reflection.Consumer2
            public final void accept(java.lang.Object obj) {
                androidx.window.embedding.ActivityWindowInfoCallbackController.m9430$r8$lambda$yAt7g5mVSXdVaB6s8NDArE_u_4(androidx.window.embedding.ActivityWindowInfoCallbackController.this, (androidx.window.extensions.embedding.EmbeddedActivityWindowInfo) obj);
            }
        };
    }

    public final java.util.Map<androidx.core.util.Consumer<androidx.window.embedding.EmbeddedActivityWindowInfo>, androidx.window.embedding.ActivityWindowInfoCallbackController.CallbackWrapper> getCallbacks$window_release() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void setCallbacks$window_release(java.util.Map<androidx.core.util.Consumer<androidx.window.embedding.EmbeddedActivityWindowInfo>, androidx.window.embedding.ActivityWindowInfoCallbackController.CallbackWrapper> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.getHighResolutionOutputSizeshNQ4ISI = map;
    }

    public final void addCallback(android.app.Activity activity, androidx.core.util.Consumer<androidx.window.embedding.EmbeddedActivityWindowInfo> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighSpeedVideoFpsRangesFor;
        reentrantLock.lock();
        try {
            if (this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                this.getHighSpeedVideoFpsRanges.setEmbeddedActivityWindowInfoCallback(new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1$$ExternalSyntheticLambda0(), this.Camera2StreamConfigurationMap);
            }
            androidx.window.embedding.ActivityWindowInfoCallbackController.CallbackWrapper callbackWrapper = new androidx.window.embedding.ActivityWindowInfoCallbackController.CallbackWrapper(this, activity, callback);
            this.getHighResolutionOutputSizeshNQ4ISI.put(callback, callbackWrapper);
            androidx.window.extensions.embedding.EmbeddedActivityWindowInfo embeddedActivityWindowInfo = this.getHighSpeedVideoFpsRanges.getEmbeddedActivityWindowInfo(activity);
            if (embeddedActivityWindowInfo != null) {
                callbackWrapper.accept(embeddedActivityWindowInfo);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void removeCallback(androidx.core.util.Consumer<androidx.window.embedding.EmbeddedActivityWindowInfo> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighSpeedVideoFpsRangesFor;
        reentrantLock.lock();
        try {
            if (this.getHighResolutionOutputSizeshNQ4ISI.remove(callback) == null) {
                return;
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                this.getHighSpeedVideoFpsRanges.clearEmbeddedActivityWindowInfoCallback();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public androidx.window.embedding.EmbeddedActivityWindowInfo translate$window_release(androidx.window.extensions.embedding.EmbeddedActivityWindowInfo info) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "");
        android.graphics.Rect rect = new android.graphics.Rect(info.getTaskBounds());
        android.graphics.Rect rect2 = new android.graphics.Rect(info.getActivityStackBounds());
        rect2.offset(-rect.left, -rect.top);
        return new androidx.window.embedding.EmbeddedActivityWindowInfo(info.isEmbedded(), rect, rect2);
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0081\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Landroidx/window/embedding/ActivityWindowInfoCallbackController$CallbackWrapper;", "", "activity", "Landroid/app/Activity;", com.sun.jna.Callback.METHOD_NAME, "Landroidx/core/util/Consumer;", "Landroidx/window/embedding/EmbeddedActivityWindowInfo;", "<init>", "(Landroidx/window/embedding/ActivityWindowInfoCallbackController;Landroid/app/Activity;Landroidx/core/util/Consumer;)V", "getCallback", "()Landroidx/core/util/Consumer;", "lastReportedInfo", "getLastReportedInfo", "()Landroidx/window/embedding/EmbeddedActivityWindowInfo;", "setLastReportedInfo", "(Landroidx/window/embedding/EmbeddedActivityWindowInfo;)V", "accept", "", "extensionsActivityWindowInfo", "Landroidx/window/extensions/embedding/EmbeddedActivityWindowInfo;", "shouldReportInfo", "", "newInfo", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class CallbackWrapper {
        private final android.app.Activity Camera2StreamConfigurationMap;
        private androidx.window.embedding.EmbeddedActivityWindowInfo getHighResolutionOutputSizeshNQ4ISI;
        private final androidx.core.util.Consumer<androidx.window.embedding.EmbeddedActivityWindowInfo> getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.window.embedding.ActivityWindowInfoCallbackController getHighSpeedVideoSizes;

        public CallbackWrapper(androidx.window.embedding.ActivityWindowInfoCallbackController activityWindowInfoCallbackController, android.app.Activity activity, androidx.core.util.Consumer<androidx.window.embedding.EmbeddedActivityWindowInfo> consumer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumer, "");
            this.getHighSpeedVideoSizes = activityWindowInfoCallbackController;
            this.Camera2StreamConfigurationMap = activity;
            this.getHighSpeedVideoFpsRanges = consumer;
        }

        public final androidx.core.util.Consumer<androidx.window.embedding.EmbeddedActivityWindowInfo> getCallback() {
            return this.getHighSpeedVideoFpsRanges;
        }

        /* renamed from: getLastReportedInfo, reason: from getter */
        public final androidx.window.embedding.EmbeddedActivityWindowInfo getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final void setLastReportedInfo(androidx.window.embedding.EmbeddedActivityWindowInfo embeddedActivityWindowInfo) {
            this.getHighResolutionOutputSizeshNQ4ISI = embeddedActivityWindowInfo;
        }

        public final void accept(androidx.window.extensions.embedding.EmbeddedActivityWindowInfo extensionsActivityWindowInfo) {
            boolean isEmbedded;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionsActivityWindowInfo, "");
            android.app.Activity activity = extensionsActivityWindowInfo.getActivity();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, activity)) {
                androidx.window.embedding.EmbeddedActivityWindowInfo translate$window_release = this.getHighSpeedVideoSizes.translate$window_release(extensionsActivityWindowInfo);
                androidx.window.embedding.EmbeddedActivityWindowInfo embeddedActivityWindowInfo = this.getHighResolutionOutputSizeshNQ4ISI;
                if (embeddedActivityWindowInfo != null) {
                    if (embeddedActivityWindowInfo.getIsEmbedded() == translate$window_release.getIsEmbedded()) {
                        if (!translate$window_release.getIsEmbedded()) {
                            return;
                        } else {
                            isEmbedded = !kotlin.jvm.internal.Intrinsics.areEqual(embeddedActivityWindowInfo, translate$window_release);
                        }
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI = translate$window_release;
                    this.getHighSpeedVideoFpsRanges.accept(translate$window_release);
                }
                isEmbedded = translate$window_release.getIsEmbedded();
                if (!isEmbedded) {
                    return;
                }
                this.getHighResolutionOutputSizeshNQ4ISI = translate$window_release;
                this.getHighSpeedVideoFpsRanges.accept(translate$window_release);
            }
        }
    }

    /* renamed from: $r8$lambda$yAt7g5mVSXdVaB6s8NDArE_u-_4, reason: not valid java name */
    public static /* synthetic */ void m9430$r8$lambda$yAt7g5mVSXdVaB6s8NDArE_u_4(androidx.window.embedding.ActivityWindowInfoCallbackController activityWindowInfoCallbackController, androidx.window.extensions.embedding.EmbeddedActivityWindowInfo embeddedActivityWindowInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddedActivityWindowInfo, "");
        java.util.concurrent.locks.ReentrantLock reentrantLock = activityWindowInfoCallbackController.getHighSpeedVideoFpsRangesFor;
        reentrantLock.lock();
        try {
            java.util.Iterator<androidx.window.embedding.ActivityWindowInfoCallbackController.CallbackWrapper> it = activityWindowInfoCallbackController.getHighResolutionOutputSizeshNQ4ISI.values().iterator();
            while (it.hasNext()) {
                it.next().accept(embeddedActivityWindowInfo);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
