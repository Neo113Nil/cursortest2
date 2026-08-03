package com.vungle.ads.internal;

/* compiled from: ImpressionTracker.kt */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000 /2\u00020\u0001:\u0004/012B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B+\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010%J\u0006\u0010&\u001a\u00020\"J\u0006\u0010'\u001a\u00020\"J\u001e\u0010(\u001a\u0004\u0018\u00010\u00072\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0007H\u0002J\u001a\u0010)\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\u00072\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0007H\u0007J\b\u0010-\u001a\u00020\"H\u0002J\u001c\u0010.\u001a\u00020\u000f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0007H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00060\u0018R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u00063"}, d2 = {"Lcom/vungle/ads/internal/ImpressionTracker;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "trackedViews", "", "Landroid/view/View;", "Lcom/vungle/ads/internal/ImpressionTracker$TrackingInfo;", "visibilityHandler", "Landroid/os/Handler;", "(Landroid/content/Context;Ljava/util/Map;Landroid/os/Handler;)V", "clipRect", "Landroid/graphics/Rect;", "isVisibilityScheduled", "", "onPreDrawListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "getOnPreDrawListener$annotations", "()V", "getOnPreDrawListener", "()Landroid/view/ViewTreeObserver$OnPreDrawListener;", "setViewTreeObserverSucceed", "visibilityRunnable", "Lcom/vungle/ads/internal/ImpressionTracker$VisibilityRunnable;", "weakViewTreeObserver", "Ljava/lang/ref/WeakReference;", "Landroid/view/ViewTreeObserver;", "getWeakViewTreeObserver$annotations", "getWeakViewTreeObserver", "()Ljava/lang/ref/WeakReference;", "setWeakViewTreeObserver", "(Ljava/lang/ref/WeakReference;)V", "addView", "", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/vungle/ads/internal/ImpressionTracker$ImpressionListener;", "clear", "destroy", "getTopView", com.ironsource.C3023e8.k, "minPercentageViewed", "", "removeView", "scheduleVisibilityCheck", "setViewTreeObserver", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ImpressionListener", "TrackingInfo", "VisibilityRunnable", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class ImpressionTracker {
    private static final int MIN_VISIBILITY_PERCENTAGE = 1;
    private static final int VISIBILITY_THROTTLE_MILLIS = 100;
    private final android.graphics.Rect clipRect;
    private boolean isVisibilityScheduled;
    private final android.view.ViewTreeObserver.OnPreDrawListener onPreDrawListener;
    private boolean setViewTreeObserverSucceed;
    private final java.util.Map<android.view.View, com.vungle.ads.internal.ImpressionTracker.TrackingInfo> trackedViews;
    private final android.os.Handler visibilityHandler;
    private final com.vungle.ads.internal.ImpressionTracker.VisibilityRunnable visibilityRunnable;
    private java.lang.ref.WeakReference<android.view.ViewTreeObserver> weakViewTreeObserver;
    private static final java.lang.String TAG = "ImpressionTracker";

    /* compiled from: ImpressionTracker.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/ImpressionTracker$ImpressionListener;", "", "onImpression", "", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "onViewInvisible", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface ImpressionListener {
        void onImpression(android.view.View view);

        void onViewInvisible(android.view.View view);
    }

    public static /* synthetic */ void getOnPreDrawListener$annotations() {
    }

    public static /* synthetic */ void getWeakViewTreeObserver$annotations() {
    }

    public ImpressionTracker(android.content.Context context, java.util.Map<android.view.View, com.vungle.ads.internal.ImpressionTracker.TrackingInfo> trackedViews, android.os.Handler visibilityHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackedViews, "trackedViews");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visibilityHandler, "visibilityHandler");
        this.trackedViews = trackedViews;
        this.visibilityHandler = visibilityHandler;
        this.clipRect = new android.graphics.Rect();
        this.visibilityRunnable = new com.vungle.ads.internal.ImpressionTracker.VisibilityRunnable();
        this.onPreDrawListener = new android.view.ViewTreeObserver.OnPreDrawListener() { // from class: com.vungle.ads.internal.ImpressionTracker$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean m10411_init_$lambda0;
                m10411_init_$lambda0 = com.vungle.ads.internal.ImpressionTracker.m10411_init_$lambda0(com.vungle.ads.internal.ImpressionTracker.this);
                return m10411_init_$lambda0;
            }
        };
        this.weakViewTreeObserver = new java.lang.ref.WeakReference<>(null);
        this.setViewTreeObserverSucceed = setViewTreeObserver(context, null);
    }

    public final android.view.ViewTreeObserver.OnPreDrawListener getOnPreDrawListener() {
        return this.onPreDrawListener;
    }

    public final java.lang.ref.WeakReference<android.view.ViewTreeObserver> getWeakViewTreeObserver() {
        return this.weakViewTreeObserver;
    }

    public final void setWeakViewTreeObserver(java.lang.ref.WeakReference<android.view.ViewTreeObserver> weakReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.weakViewTreeObserver = weakReference;
    }

    /* compiled from: ImpressionTracker.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/vungle/ads/internal/ImpressionTracker$TrackingInfo;", "", "()V", "impressionListener", "Lcom/vungle/ads/internal/ImpressionTracker$ImpressionListener;", "getImpressionListener", "()Lcom/vungle/ads/internal/ImpressionTracker$ImpressionListener;", "setImpressionListener", "(Lcom/vungle/ads/internal/ImpressionTracker$ImpressionListener;)V", "minViewablePercent", "", "getMinViewablePercent", "()I", "setMinViewablePercent", "(I)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class TrackingInfo {
        private com.vungle.ads.internal.ImpressionTracker.ImpressionListener impressionListener;
        private int minViewablePercent;

        public final int getMinViewablePercent() {
            return this.minViewablePercent;
        }

        public final void setMinViewablePercent(int i) {
            this.minViewablePercent = i;
        }

        public final com.vungle.ads.internal.ImpressionTracker.ImpressionListener getImpressionListener() {
            return this.impressionListener;
        }

        public final void setImpressionListener(com.vungle.ads.internal.ImpressionTracker.ImpressionListener impressionListener) {
            this.impressionListener = impressionListener;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImpressionTracker(android.content.Context context) {
        this(context, new java.util.WeakHashMap(10), new android.os.Handler(android.os.Looper.getMainLooper()));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final boolean setViewTreeObserver(android.content.Context context, android.view.View view) {
        android.view.ViewTreeObserver viewTreeObserver = this.weakViewTreeObserver.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            return true;
        }
        android.view.View topView = getTopView(context, view);
        if (topView == null) {
            com.vungle.ads.internal.util.Logger.Companion companion = com.vungle.ads.internal.util.Logger.INSTANCE;
            java.lang.String TAG2 = TAG;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            companion.d(TAG2, "Unable to set ViewTreeObserver due to no available root view.");
            return false;
        }
        android.view.ViewTreeObserver viewTreeObserver2 = topView.getViewTreeObserver();
        if (!viewTreeObserver2.isAlive()) {
            com.vungle.ads.internal.util.Logger.Companion companion2 = com.vungle.ads.internal.util.Logger.INSTANCE;
            java.lang.String TAG3 = TAG;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            companion2.d(TAG3, "The root view tree observer was not alive");
            return false;
        }
        this.weakViewTreeObserver = new java.lang.ref.WeakReference<>(viewTreeObserver2);
        viewTreeObserver2.addOnPreDrawListener(this.onPreDrawListener);
        return true;
    }

    public final void addView(android.view.View view, com.vungle.ads.internal.ImpressionTracker.ImpressionListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        this.setViewTreeObserverSucceed = setViewTreeObserver(view.getContext(), view);
        com.vungle.ads.internal.ImpressionTracker.TrackingInfo trackingInfo = this.trackedViews.get(view);
        if (trackingInfo == null) {
            trackingInfo = new com.vungle.ads.internal.ImpressionTracker.TrackingInfo();
            this.trackedViews.put(view, trackingInfo);
            scheduleVisibilityCheck();
        }
        trackingInfo.setMinViewablePercent(1);
        trackingInfo.setImpressionListener(listener);
    }

    public final void removeView(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        this.trackedViews.remove(view);
    }

    public final void clear() {
        this.trackedViews.clear();
        this.visibilityHandler.removeMessages(0);
        this.isVisibilityScheduled = false;
    }

    public final void destroy() {
        clear();
        android.view.ViewTreeObserver viewTreeObserver = this.weakViewTreeObserver.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.onPreDrawListener);
        }
        this.weakViewTreeObserver.clear();
    }

    private final android.view.View getTopView(android.content.Context context, android.view.View view) {
        android.view.Window window;
        android.view.View decorView;
        android.view.View view2 = null;
        if ((context instanceof android.app.Activity) && (window = ((android.app.Activity) context).getWindow()) != null && (decorView = window.getDecorView()) != null) {
            view2 = decorView.findViewById(android.R.id.content);
        }
        if (view2 != null || view == null) {
            return view2;
        }
        if (!androidx.core.view.ViewCompat.isAttachedToWindow(view)) {
            com.vungle.ads.internal.util.Logger.Companion companion = com.vungle.ads.internal.util.Logger.INSTANCE;
            java.lang.String TAG2 = TAG;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            companion.w(TAG2, "Trying to call View#rootView() on an unattached View.");
        }
        android.view.View rootView = view.getRootView();
        if (rootView != null) {
            view2 = rootView.findViewById(android.R.id.content);
        }
        return view2 == null ? rootView : view2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleVisibilityCheck() {
        if (this.isVisibilityScheduled) {
            return;
        }
        this.isVisibilityScheduled = true;
        this.visibilityHandler.postDelayed(this.visibilityRunnable, 100L);
    }

    /* compiled from: ImpressionTracker.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0081\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/ImpressionTracker$VisibilityRunnable;", "Ljava/lang/Runnable;", "(Lcom/vungle/ads/internal/ImpressionTracker;)V", "invisibleViews", "Ljava/util/ArrayList;", "Landroid/view/View;", "visibleViews", "run", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class VisibilityRunnable implements java.lang.Runnable {
        private final java.util.ArrayList<android.view.View> visibleViews = new java.util.ArrayList<>();
        private final java.util.ArrayList<android.view.View> invisibleViews = new java.util.ArrayList<>();

        public VisibilityRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.vungle.ads.internal.ImpressionTracker.ImpressionListener impressionListener;
            com.vungle.ads.internal.ImpressionTracker.ImpressionListener impressionListener2;
            com.vungle.ads.internal.ImpressionTracker.this.isVisibilityScheduled = false;
            for (java.util.Map.Entry entry : com.vungle.ads.internal.ImpressionTracker.this.trackedViews.entrySet()) {
                android.view.View view = (android.view.View) entry.getKey();
                if (com.vungle.ads.internal.ImpressionTracker.this.isVisible(view, ((com.vungle.ads.internal.ImpressionTracker.TrackingInfo) entry.getValue()).getMinViewablePercent())) {
                    this.visibleViews.add(view);
                } else {
                    this.invisibleViews.add(view);
                }
            }
            java.util.Iterator<android.view.View> it = this.visibleViews.iterator();
            while (it.hasNext()) {
                android.view.View view2 = it.next();
                com.vungle.ads.internal.ImpressionTracker.TrackingInfo trackingInfo = (com.vungle.ads.internal.ImpressionTracker.TrackingInfo) com.vungle.ads.internal.ImpressionTracker.this.trackedViews.get(view2);
                if (trackingInfo != null && (impressionListener2 = trackingInfo.getImpressionListener()) != null) {
                    impressionListener2.onImpression(view2);
                }
                com.vungle.ads.internal.ImpressionTracker impressionTracker = com.vungle.ads.internal.ImpressionTracker.this;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view2, "view");
                impressionTracker.removeView(view2);
            }
            this.visibleViews.clear();
            java.util.Iterator<android.view.View> it2 = this.invisibleViews.iterator();
            while (it2.hasNext()) {
                android.view.View next = it2.next();
                com.vungle.ads.internal.ImpressionTracker.TrackingInfo trackingInfo2 = (com.vungle.ads.internal.ImpressionTracker.TrackingInfo) com.vungle.ads.internal.ImpressionTracker.this.trackedViews.get(next);
                if (trackingInfo2 != null && (impressionListener = trackingInfo2.getImpressionListener()) != null) {
                    impressionListener.onViewInvisible(next);
                }
            }
            this.invisibleViews.clear();
            if (!(!com.vungle.ads.internal.ImpressionTracker.this.trackedViews.isEmpty()) || com.vungle.ads.internal.ImpressionTracker.this.setViewTreeObserverSucceed) {
                return;
            }
            com.vungle.ads.internal.ImpressionTracker.this.scheduleVisibilityCheck();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVisible(android.view.View view, int minPercentageViewed) {
        if (view == null || view.getVisibility() != 0 || view.getParent() == null) {
            return false;
        }
        android.view.ViewParent parent = view.getParent();
        while (parent instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
            if (viewGroup.getVisibility() != 0) {
                com.vungle.ads.internal.util.Logger.INSTANCE.w("ImpressionTracker", "Parent visibility is not visible: " + parent);
                return false;
            }
            parent = viewGroup.getParent();
        }
        if (!view.getGlobalVisibleRect(this.clipRect)) {
            return false;
        }
        long height = view.getHeight() * view.getWidth();
        return height > 0 && ((long) 100) * (this.clipRect.height() * this.clipRect.width()) >= ((long) minPercentageViewed) * height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-0, reason: not valid java name */
    public static final boolean m10411_init_$lambda0(com.vungle.ads.internal.ImpressionTracker this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.scheduleVisibilityCheck();
        return true;
    }
}
