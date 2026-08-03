package com.facebook.appevents.codeless;

/* compiled from: RCTCodelessLoggingEventListener.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\u000b"}, d2 = {"Lcom/facebook/appevents/codeless/RCTCodelessLoggingEventListener;", "", "()V", "getOnTouchListener", "Lcom/facebook/appevents/codeless/RCTCodelessLoggingEventListener$AutoLoggingOnTouchListener;", "mapping", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "rootView", "Landroid/view/View;", "hostView", "AutoLoggingOnTouchListener", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class RCTCodelessLoggingEventListener {
    public static final com.facebook.appevents.codeless.RCTCodelessLoggingEventListener INSTANCE = new com.facebook.appevents.codeless.RCTCodelessLoggingEventListener();

    private RCTCodelessLoggingEventListener() {
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener getOnTouchListener(com.facebook.appevents.codeless.internal.EventBinding mapping, android.view.View rootView, android.view.View hostView) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapping, "mapping");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "rootView");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostView, "hostView");
            return new com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener(mapping, rootView, hostView);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.class);
            return null;
        }
    }

    /* compiled from: RCTCodelessLoggingEventListener.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/facebook/appevents/codeless/RCTCodelessLoggingEventListener$AutoLoggingOnTouchListener;", "Landroid/view/View$OnTouchListener;", "mapping", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "rootView", "Landroid/view/View;", "hostView", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/view/View;)V", "existingOnTouchListener", "Ljava/lang/ref/WeakReference;", "supportCodelessLogging", "", "getSupportCodelessLogging", "()Z", "setSupportCodelessLogging", "(Z)V", "onTouch", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "motionEvent", "Landroid/view/MotionEvent;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AutoLoggingOnTouchListener implements android.view.View.OnTouchListener {
        private final android.view.View.OnTouchListener existingOnTouchListener;
        private final java.lang.ref.WeakReference<android.view.View> hostView;
        private final com.facebook.appevents.codeless.internal.EventBinding mapping;
        private final java.lang.ref.WeakReference<android.view.View> rootView;
        private boolean supportCodelessLogging;

        public AutoLoggingOnTouchListener(com.facebook.appevents.codeless.internal.EventBinding mapping, android.view.View rootView, android.view.View hostView) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapping, "mapping");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "rootView");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostView, "hostView");
            this.mapping = mapping;
            this.hostView = new java.lang.ref.WeakReference<>(hostView);
            this.rootView = new java.lang.ref.WeakReference<>(rootView);
            com.facebook.appevents.codeless.internal.ViewHierarchy viewHierarchy = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE;
            this.existingOnTouchListener = com.facebook.appevents.codeless.internal.ViewHierarchy.getExistingOnTouchListener(hostView);
            this.supportCodelessLogging = true;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
            android.view.View view2 = this.rootView.get();
            android.view.View view3 = this.hostView.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                com.facebook.appevents.codeless.CodelessLoggingEventListener codelessLoggingEventListener = com.facebook.appevents.codeless.CodelessLoggingEventListener.INSTANCE;
                com.facebook.appevents.codeless.CodelessLoggingEventListener.logEvent$facebook_core_release(this.mapping, view2, view3);
            }
            android.view.View.OnTouchListener onTouchListener = this.existingOnTouchListener;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }

        public final boolean getSupportCodelessLogging() {
            return this.supportCodelessLogging;
        }

        public final void setSupportCodelessLogging(boolean z) {
            this.supportCodelessLogging = z;
        }
    }
}
