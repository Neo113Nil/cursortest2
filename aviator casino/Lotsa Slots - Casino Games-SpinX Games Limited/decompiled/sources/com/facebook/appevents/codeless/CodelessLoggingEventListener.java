package com.facebook.appevents.codeless;

/* compiled from: CodelessLoggingEventListener.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\fH\u0007J%\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0002\b\u000fJ\u0015\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013¨\u0006\u0016"}, d2 = {"Lcom/facebook/appevents/codeless/CodelessLoggingEventListener;", "", "()V", "getOnClickListener", "Lcom/facebook/appevents/codeless/CodelessLoggingEventListener$AutoLoggingOnClickListener;", "mapping", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "rootView", "Landroid/view/View;", "hostView", "getOnItemClickListener", "Lcom/facebook/appevents/codeless/CodelessLoggingEventListener$AutoLoggingOnItemClickListener;", "Landroid/widget/AdapterView;", "logEvent", "", "logEvent$facebook_core_release", "updateParameters", "parameters", "Landroid/os/Bundle;", "updateParameters$facebook_core_release", "AutoLoggingOnClickListener", "AutoLoggingOnItemClickListener", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CodelessLoggingEventListener {
    public static final com.facebook.appevents.codeless.CodelessLoggingEventListener INSTANCE = new com.facebook.appevents.codeless.CodelessLoggingEventListener();

    private CodelessLoggingEventListener() {
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener getOnClickListener(com.facebook.appevents.codeless.internal.EventBinding mapping, android.view.View rootView, android.view.View hostView) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.CodelessLoggingEventListener.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapping, "mapping");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "rootView");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostView, "hostView");
            return new com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener(mapping, rootView, hostView);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.CodelessLoggingEventListener.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener getOnItemClickListener(com.facebook.appevents.codeless.internal.EventBinding mapping, android.view.View rootView, android.widget.AdapterView<?> hostView) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.CodelessLoggingEventListener.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapping, "mapping");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "rootView");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostView, "hostView");
            return new com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener(mapping, rootView, hostView);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.CodelessLoggingEventListener.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void logEvent$facebook_core_release(com.facebook.appevents.codeless.internal.EventBinding mapping, android.view.View rootView, android.view.View hostView) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.CodelessLoggingEventListener.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapping, "mapping");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "rootView");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostView, "hostView");
            final java.lang.String eventName = mapping.getEventName();
            final android.os.Bundle parameters = com.facebook.appevents.codeless.CodelessMatcher.INSTANCE.getParameters(mapping, rootView, hostView);
            INSTANCE.updateParameters$facebook_core_release(parameters);
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            com.facebook.FacebookSdk.getExecutor().execute(new java.lang.Runnable() { // from class: com.facebook.appevents.codeless.CodelessLoggingEventListener$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.appevents.codeless.CodelessLoggingEventListener.m5118logEvent$lambda0(eventName, parameters);
                }
            });
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.CodelessLoggingEventListener.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: logEvent$lambda-0, reason: not valid java name */
    public static final void m5118logEvent$lambda0(java.lang.String eventName, android.os.Bundle parameters) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.CodelessLoggingEventListener.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "$eventName");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "$parameters");
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            com.facebook.appevents.AppEventsLogger.INSTANCE.newLogger(com.facebook.FacebookSdk.getApplicationContext()).logEvent(eventName, parameters);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.CodelessLoggingEventListener.class);
        }
    }

    public final void updateParameters$facebook_core_release(android.os.Bundle parameters) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
            java.lang.String string = parameters.getString(com.facebook.appevents.AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM);
            if (string != null) {
                com.facebook.appevents.internal.AppEventUtility appEventUtility = com.facebook.appevents.internal.AppEventUtility.INSTANCE;
                parameters.putDouble(com.facebook.appevents.AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM, com.facebook.appevents.internal.AppEventUtility.normalizePrice(string));
            }
            parameters.putString(com.facebook.appevents.codeless.internal.Constants.IS_CODELESS_EVENT_KEY, "1");
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* compiled from: CodelessLoggingEventListener.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/facebook/appevents/codeless/CodelessLoggingEventListener$AutoLoggingOnClickListener;", "Landroid/view/View$OnClickListener;", "mapping", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "rootView", "Landroid/view/View;", "hostView", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/view/View;)V", "existingOnClickListener", "Ljava/lang/ref/WeakReference;", "supportCodelessLogging", "", "getSupportCodelessLogging", "()Z", "setSupportCodelessLogging", "(Z)V", "onClick", "", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AutoLoggingOnClickListener implements android.view.View.OnClickListener {
        private android.view.View.OnClickListener existingOnClickListener;
        private java.lang.ref.WeakReference<android.view.View> hostView;
        private com.facebook.appevents.codeless.internal.EventBinding mapping;
        private java.lang.ref.WeakReference<android.view.View> rootView;
        private boolean supportCodelessLogging;

        public AutoLoggingOnClickListener(com.facebook.appevents.codeless.internal.EventBinding mapping, android.view.View rootView, android.view.View hostView) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapping, "mapping");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "rootView");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostView, "hostView");
            this.mapping = mapping;
            this.hostView = new java.lang.ref.WeakReference<>(hostView);
            this.rootView = new java.lang.ref.WeakReference<>(rootView);
            com.facebook.appevents.codeless.internal.ViewHierarchy viewHierarchy = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE;
            this.existingOnClickListener = com.facebook.appevents.codeless.internal.ViewHierarchy.getExistingOnClickListener(hostView);
            this.supportCodelessLogging = true;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                        return;
                    }
                    try {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
                        android.view.View.OnClickListener onClickListener = this.existingOnClickListener;
                        if (onClickListener != null) {
                            onClickListener.onClick(view);
                        }
                        android.view.View view2 = this.rootView.get();
                        android.view.View view3 = this.hostView.get();
                        if (view2 == null || view3 == null) {
                            return;
                        }
                        com.facebook.appevents.codeless.CodelessLoggingEventListener codelessLoggingEventListener = com.facebook.appevents.codeless.CodelessLoggingEventListener.INSTANCE;
                        com.facebook.appevents.codeless.CodelessLoggingEventListener.logEvent$facebook_core_release(this.mapping, view2, view3);
                    } catch (java.lang.Throwable th) {
                        com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                    }
                } catch (java.lang.Throwable th2) {
                    com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th2, this);
                }
            } catch (java.lang.Throwable th3) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th3, this);
            }
        }

        public final boolean getSupportCodelessLogging() {
            return this.supportCodelessLogging;
        }

        public final void setSupportCodelessLogging(boolean z) {
            this.supportCodelessLogging = z;
        }
    }

    /* compiled from: CodelessLoggingEventListener.kt */
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0002\u0010\bJ.\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/facebook/appevents/codeless/CodelessLoggingEventListener$AutoLoggingOnItemClickListener;", "Landroid/widget/AdapterView$OnItemClickListener;", "mapping", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "rootView", "Landroid/view/View;", "hostView", "Landroid/widget/AdapterView;", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/widget/AdapterView;)V", "existingOnItemClickListener", "Ljava/lang/ref/WeakReference;", "supportCodelessLogging", "", "getSupportCodelessLogging", "()Z", "setSupportCodelessLogging", "(Z)V", "onItemClick", "", "parent", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "position", "", "id", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AutoLoggingOnItemClickListener implements android.widget.AdapterView.OnItemClickListener {
        private android.widget.AdapterView.OnItemClickListener existingOnItemClickListener;
        private java.lang.ref.WeakReference<android.widget.AdapterView<?>> hostView;
        private com.facebook.appevents.codeless.internal.EventBinding mapping;
        private java.lang.ref.WeakReference<android.view.View> rootView;
        private boolean supportCodelessLogging;

        public AutoLoggingOnItemClickListener(com.facebook.appevents.codeless.internal.EventBinding mapping, android.view.View rootView, android.widget.AdapterView<?> hostView) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapping, "mapping");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "rootView");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostView, "hostView");
            this.mapping = mapping;
            this.hostView = new java.lang.ref.WeakReference<>(hostView);
            this.rootView = new java.lang.ref.WeakReference<>(rootView);
            this.existingOnItemClickListener = hostView.getOnItemClickListener();
            this.supportCodelessLogging = true;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
            android.widget.AdapterView.OnItemClickListener onItemClickListener = this.existingOnItemClickListener;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(parent, view, position, id);
            }
            android.view.View view2 = this.rootView.get();
            android.widget.AdapterView<?> adapterView = this.hostView.get();
            if (view2 == null || adapterView == null) {
                return;
            }
            com.facebook.appevents.codeless.CodelessLoggingEventListener codelessLoggingEventListener = com.facebook.appevents.codeless.CodelessLoggingEventListener.INSTANCE;
            com.facebook.appevents.codeless.CodelessLoggingEventListener.logEvent$facebook_core_release(this.mapping, view2, adapterView);
        }

        public final boolean getSupportCodelessLogging() {
            return this.supportCodelessLogging;
        }

        public final void setSupportCodelessLogging(boolean z) {
            this.supportCodelessLogging = z;
        }
    }
}
