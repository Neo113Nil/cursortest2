package com.paypal.oslo.feature.shaketoreport.shake;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001%B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\fR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00048G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R&\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001b\u0012\u0004\u0012\u00020\u001c0\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR(\u0010$\u001a\u0004\u0018\u00010\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/shake/ActivityUiLifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "Lcom/paypal/oslo/feature/shaketoreport/shake/ActivityUiLifecycleCallbacks$Listener;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/shaketoreport/shake/ActivityUiLifecycleCallbacks$Listener;", "getHighResolutionOutputSizeshNQ4ISI", "getTopForegroundActivity", "()Landroid/app/Activity;", "topForegroundActivity", "", "Ljava/lang/ref/WeakReference;", "Lcom/paypal/oslo/feature/shaketoreport/data/ActivityData;", "Camera2StreamConfigurationMap", "Ljava/util/Map;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getActivityUiLifecycleListener", "()Lcom/paypal/oslo/feature/shaketoreport/shake/ActivityUiLifecycleCallbacks$Listener;", "setActivityUiLifecycleListener", "(Lcom/paypal/oslo/feature/shaketoreport/shake/ActivityUiLifecycleCallbacks$Listener;)V", "activityUiLifecycleListener", "Listener"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ActivityUiLifecycleCallbacks implements android.app.Application.ActivityLifecycleCallbacks {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Map<java.lang.ref.WeakReference<android.app.Activity>, com.paypal.oslo.feature.shaketoreport.data.ActivityData> getHighSpeedVideoSizes = new java.util.LinkedHashMap();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private com.paypal.oslo.feature.shaketoreport.shake.ActivityUiLifecycleCallbacks.Listener getHighResolutionOutputSizeshNQ4ISI;

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/shake/ActivityUiLifecycleCallbacks$Listener;", "", "Landroidx/lifecycle/Lifecycle$Event;", "lifecycleEvent", "Landroid/app/Activity;", "activity", "", "onActivityStatus", "(Landroidx/lifecycle/Lifecycle$Event;Landroid/app/Activity;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Listener {
        void onActivityStatus(androidx.lifecycle.Lifecycle.Event lifecycleEvent, android.app.Activity activity);
    }

    @javax.inject.Inject
    public ActivityUiLifecycleCallbacks() {
    }

    public final android.app.Activity getTopForegroundActivity() {
        java.util.Set<java.util.Map.Entry<java.lang.ref.WeakReference<android.app.Activity>, com.paypal.oslo.feature.shaketoreport.data.ActivityData>> entrySet = this.getHighSpeedVideoSizes.entrySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = entrySet.iterator();
        while (true) {
            kotlin.Pair pair = null;
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            android.app.Activity activity = (android.app.Activity) ((java.lang.ref.WeakReference) entry.getKey()).get();
            if (activity != null && ((com.paypal.oslo.feature.shaketoreport.data.ActivityData) entry.getValue()).getStarted() != -1) {
                pair = kotlin.TuplesKt.to(activity, entry.getValue());
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        final java.util.Comparator comparator = new java.util.Comparator() { // from class: com.paypal.oslo.feature.shaketoreport.shake.ActivityUiLifecycleCallbacks$special$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Long.valueOf(((com.paypal.oslo.feature.shaketoreport.data.ActivityData) ((kotlin.Pair) t2).getSecond()).getStarted()), java.lang.Long.valueOf(((com.paypal.oslo.feature.shaketoreport.data.ActivityData) ((kotlin.Pair) t).getSecond()).getStarted()));
            }
        };
        kotlin.Pair pair2 = (kotlin.Pair) kotlin.collections.CollectionsKt.firstOrNull(kotlin.collections.CollectionsKt.sortedWith(arrayList, new java.util.Comparator() { // from class: com.paypal.oslo.feature.shaketoreport.shake.ActivityUiLifecycleCallbacks$special$$inlined$thenByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compare = comparator.compare(t, t2);
                return compare != 0 ? compare : kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Long.valueOf(((com.paypal.oslo.feature.shaketoreport.data.ActivityData) ((kotlin.Pair) t2).getSecond()).getResumed()), java.lang.Long.valueOf(((com.paypal.oslo.feature.shaketoreport.data.ActivityData) ((kotlin.Pair) t).getSecond()).getResumed()));
            }
        }));
        if (pair2 != null) {
            return (android.app.Activity) pair2.getFirst();
        }
        return null;
    }

    /* renamed from: getActivityUiLifecycleListener, reason: from getter */
    public final com.paypal.oslo.feature.shaketoreport.shake.ActivityUiLifecycleCallbacks.Listener getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void setActivityUiLifecycleListener(com.paypal.oslo.feature.shaketoreport.shake.ActivityUiLifecycleCallbacks.Listener listener) {
        this.getHighResolutionOutputSizeshNQ4ISI = listener;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        com.paypal.oslo.feature.shaketoreport.shake.ActivityUiLifecycleCallbacks.Listener listener = this.getHighResolutionOutputSizeshNQ4ISI;
        if (listener != null) {
            listener.onActivityStatus(androidx.lifecycle.Lifecycle.Event.ON_CREATE, activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        com.paypal.oslo.feature.shaketoreport.shake.ActivityUiLifecycleCallbacks.Listener listener = this.getHighResolutionOutputSizeshNQ4ISI;
        if (listener != null) {
            listener.onActivityStatus(androidx.lifecycle.Lifecycle.Event.ON_START, activity);
        }
        java.util.Iterator<T> it = this.getHighSpeedVideoSizes.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((java.lang.ref.WeakReference) obj).get(), activity)) {
                    break;
                }
            }
        }
        java.lang.ref.WeakReference<android.app.Activity> weakReference = (java.lang.ref.WeakReference) obj;
        if (weakReference == null) {
            weakReference = new java.lang.ref.WeakReference<>(activity);
        }
        com.paypal.oslo.feature.shaketoreport.data.ActivityData activityData = this.getHighSpeedVideoSizes.get(weakReference);
        if (activityData != null) {
            this.getHighSpeedVideoSizes.put(weakReference, com.paypal.oslo.feature.shaketoreport.data.ActivityData.copy$default(activityData, java.lang.System.currentTimeMillis(), 0L, 2, null));
        } else {
            this.getHighSpeedVideoSizes.put(weakReference, new com.paypal.oslo.feature.shaketoreport.data.ActivityData(java.lang.System.currentTimeMillis(), 0L, 2, null));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        com.paypal.oslo.feature.shaketoreport.shake.ActivityUiLifecycleCallbacks.Listener listener = this.getHighResolutionOutputSizeshNQ4ISI;
        if (listener != null) {
            listener.onActivityStatus(androidx.lifecycle.Lifecycle.Event.ON_RESUME, activity);
        }
        java.util.Iterator<T> it = this.getHighSpeedVideoSizes.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((java.lang.ref.WeakReference) obj).get(), activity)) {
                    break;
                }
            }
        }
        java.lang.ref.WeakReference<android.app.Activity> weakReference = (java.lang.ref.WeakReference) obj;
        if (weakReference == null) {
            weakReference = new java.lang.ref.WeakReference<>(activity);
        }
        com.paypal.oslo.feature.shaketoreport.data.ActivityData activityData = this.getHighSpeedVideoSizes.get(weakReference);
        if (activityData != null) {
            this.getHighSpeedVideoSizes.put(weakReference, com.paypal.oslo.feature.shaketoreport.data.ActivityData.copy$default(activityData, 0L, java.lang.System.currentTimeMillis(), 1, null));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        com.paypal.oslo.feature.shaketoreport.shake.ActivityUiLifecycleCallbacks.Listener listener = this.getHighResolutionOutputSizeshNQ4ISI;
        if (listener != null) {
            listener.onActivityStatus(androidx.lifecycle.Lifecycle.Event.ON_PAUSE, activity);
        }
        java.util.Iterator<T> it = this.getHighSpeedVideoSizes.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((java.lang.ref.WeakReference) obj).get(), activity)) {
                    break;
                }
            }
        }
        java.lang.ref.WeakReference<android.app.Activity> weakReference = (java.lang.ref.WeakReference) obj;
        if (weakReference == null) {
            weakReference = new java.lang.ref.WeakReference<>(activity);
        }
        com.paypal.oslo.feature.shaketoreport.data.ActivityData activityData = this.getHighSpeedVideoSizes.get(weakReference);
        if (activityData != null) {
            this.getHighSpeedVideoSizes.put(weakReference, com.paypal.oslo.feature.shaketoreport.data.ActivityData.copy$default(activityData, 0L, -1L, 1, null));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        com.paypal.oslo.feature.shaketoreport.shake.ActivityUiLifecycleCallbacks.Listener listener = this.getHighResolutionOutputSizeshNQ4ISI;
        if (listener != null) {
            listener.onActivityStatus(androidx.lifecycle.Lifecycle.Event.ON_STOP, activity);
        }
        java.util.Iterator<T> it = this.getHighSpeedVideoSizes.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((java.lang.ref.WeakReference) obj).get(), activity)) {
                    break;
                }
            }
        }
        java.lang.ref.WeakReference<android.app.Activity> weakReference = (java.lang.ref.WeakReference) obj;
        if (weakReference == null) {
            weakReference = new java.lang.ref.WeakReference<>(activity);
        }
        com.paypal.oslo.feature.shaketoreport.data.ActivityData activityData = this.getHighSpeedVideoSizes.get(weakReference);
        if (activityData != null) {
            this.getHighSpeedVideoSizes.put(weakReference, com.paypal.oslo.feature.shaketoreport.data.ActivityData.copy$default(activityData, -1L, 0L, 2, null));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        com.paypal.oslo.feature.shaketoreport.shake.ActivityUiLifecycleCallbacks.Listener listener = this.getHighResolutionOutputSizeshNQ4ISI;
        if (listener != null) {
            listener.onActivityStatus(androidx.lifecycle.Lifecycle.Event.ON_DESTROY, activity);
        }
        java.util.Iterator<T> it = this.getHighSpeedVideoSizes.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((java.lang.ref.WeakReference) obj).get(), activity)) {
                    break;
                }
            }
        }
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) obj;
        if (weakReference == null) {
            weakReference = new java.lang.ref.WeakReference(activity);
        }
        this.getHighSpeedVideoSizes.remove(weakReference);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "");
    }
}
