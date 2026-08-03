package com.facebook.appevents.aam;

/* compiled from: MetadataViewObserver.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u000fH\u0002J\b\u0010\u001a\u001a\u00020\u000fH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/facebook/appevents/aam/MetadataViewObserver;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "isTracking", "Ljava/util/concurrent/atomic/AtomicBoolean;", "processedText", "", "", "uiThreadHandler", "Landroid/os/Handler;", "onGlobalFocusChanged", "", "oldView", "Landroid/view/View;", "newView", "process", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "processEditText", "runOnUIThread", "runnable", "Ljava/lang/Runnable;", "startTracking", "stopTracking", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class MetadataViewObserver implements android.view.ViewTreeObserver.OnGlobalFocusChangeListener {
    private static final int MAX_TEXT_LENGTH = 100;
    private final java.lang.ref.WeakReference<android.app.Activity> activityWeakReference;
    private final java.util.concurrent.atomic.AtomicBoolean isTracking;
    private final java.util.Set<java.lang.String> processedText;
    private final android.os.Handler uiThreadHandler;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.appevents.aam.MetadataViewObserver.Companion INSTANCE = new com.facebook.appevents.aam.MetadataViewObserver.Companion(null);
    private static final java.util.Map<java.lang.Integer, com.facebook.appevents.aam.MetadataViewObserver> observers = new java.util.HashMap();

    public /* synthetic */ MetadataViewObserver(android.app.Activity activity, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    @kotlin.jvm.JvmStatic
    public static final void startTrackingActivity(android.app.Activity activity) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.aam.MetadataViewObserver.class)) {
            return;
        }
        try {
            INSTANCE.startTrackingActivity(activity);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.aam.MetadataViewObserver.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void stopTrackingActivity(android.app.Activity activity) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.aam.MetadataViewObserver.class)) {
            return;
        }
        try {
            INSTANCE.stopTrackingActivity(activity);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.aam.MetadataViewObserver.class);
        }
    }

    private MetadataViewObserver(android.app.Activity activity) {
        this.processedText = new java.util.LinkedHashSet();
        this.uiThreadHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.activityWeakReference = new java.lang.ref.WeakReference<>(activity);
        this.isTracking = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static final /* synthetic */ java.util.Map access$getObservers$cp() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.aam.MetadataViewObserver.class)) {
            return null;
        }
        try {
            return observers;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.aam.MetadataViewObserver.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$startTracking(com.facebook.appevents.aam.MetadataViewObserver metadataViewObserver) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.aam.MetadataViewObserver.class)) {
            return;
        }
        try {
            metadataViewObserver.startTracking();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.aam.MetadataViewObserver.class);
        }
    }

    public static final /* synthetic */ void access$stopTracking(com.facebook.appevents.aam.MetadataViewObserver metadataViewObserver) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.aam.MetadataViewObserver.class)) {
            return;
        }
        try {
            metadataViewObserver.stopTracking();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.aam.MetadataViewObserver.class);
        }
    }

    private final void startTracking() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (this.isTracking.getAndSet(true)) {
                return;
            }
            com.facebook.appevents.internal.AppEventUtility appEventUtility = com.facebook.appevents.internal.AppEventUtility.INSTANCE;
            android.view.View rootView = com.facebook.appevents.internal.AppEventUtility.getRootView(this.activityWeakReference.get());
            if (rootView == null) {
                return;
            }
            android.view.ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalFocusChangeListener(this);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void stopTracking() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (this.isTracking.getAndSet(false)) {
                com.facebook.appevents.internal.AppEventUtility appEventUtility = com.facebook.appevents.internal.AppEventUtility.INSTANCE;
                android.view.View rootView = com.facebook.appevents.internal.AppEventUtility.getRootView(this.activityWeakReference.get());
                if (rootView == null) {
                    return;
                }
                android.view.ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalFocusChangeListener(this);
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(android.view.View oldView, android.view.View newView) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        if (oldView != null) {
            try {
                process(oldView);
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                return;
            }
        }
        if (newView != null) {
            process(newView);
        }
    }

    private final void process(final android.view.View view) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            runOnUIThread(new java.lang.Runnable() { // from class: com.facebook.appevents.aam.MetadataViewObserver$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.appevents.aam.MetadataViewObserver.m5110process$lambda0(view, this);
                }
            });
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: process$lambda-0, reason: not valid java name */
    public static final void m5110process$lambda0(android.view.View view, com.facebook.appevents.aam.MetadataViewObserver this$0) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.aam.MetadataViewObserver.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$view");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (view instanceof android.widget.EditText) {
                this$0.processEditText(view);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.aam.MetadataViewObserver.class);
        }
    }

    private final void processEditText(android.view.View view) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            java.lang.String obj = ((android.widget.EditText) view).getText().toString();
            if (obj == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            java.lang.String obj2 = kotlin.text.StringsKt.trim((java.lang.CharSequence) obj).toString();
            if (obj2 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            java.lang.String lowerCase = obj2.toLowerCase();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (lowerCase.length() != 0 && !this.processedText.contains(lowerCase) && lowerCase.length() <= 100) {
                this.processedText.add(lowerCase);
                java.util.HashMap hashMap = new java.util.HashMap();
                com.facebook.appevents.aam.MetadataMatcher metadataMatcher = com.facebook.appevents.aam.MetadataMatcher.INSTANCE;
                java.util.List<java.lang.String> currentViewIndicators = com.facebook.appevents.aam.MetadataMatcher.getCurrentViewIndicators(view);
                java.util.List<java.lang.String> list = null;
                for (com.facebook.appevents.aam.MetadataRule metadataRule : com.facebook.appevents.aam.MetadataRule.INSTANCE.getRules()) {
                    com.facebook.appevents.aam.MetadataViewObserver.Companion companion = INSTANCE;
                    java.lang.String preNormalize = companion.preNormalize(metadataRule.getName(), lowerCase);
                    if (metadataRule.getValRule().length() > 0) {
                        com.facebook.appevents.aam.MetadataMatcher metadataMatcher2 = com.facebook.appevents.aam.MetadataMatcher.INSTANCE;
                        if (!com.facebook.appevents.aam.MetadataMatcher.matchValue(preNormalize, metadataRule.getValRule())) {
                        }
                    }
                    com.facebook.appevents.aam.MetadataMatcher metadataMatcher3 = com.facebook.appevents.aam.MetadataMatcher.INSTANCE;
                    if (!com.facebook.appevents.aam.MetadataMatcher.matchIndicator(currentViewIndicators, metadataRule.getKeyRules())) {
                        if (list == null) {
                            com.facebook.appevents.aam.MetadataMatcher metadataMatcher4 = com.facebook.appevents.aam.MetadataMatcher.INSTANCE;
                            list = com.facebook.appevents.aam.MetadataMatcher.getAroundViewIndicators(view);
                        }
                        com.facebook.appevents.aam.MetadataMatcher metadataMatcher5 = com.facebook.appevents.aam.MetadataMatcher.INSTANCE;
                        if (com.facebook.appevents.aam.MetadataMatcher.matchIndicator(list, metadataRule.getKeyRules())) {
                            companion.putUserData(hashMap, metadataRule.getName(), preNormalize);
                        }
                    } else {
                        companion.putUserData(hashMap, metadataRule.getName(), preNormalize);
                    }
                }
                com.facebook.appevents.InternalAppEventsLogger.INSTANCE.setInternalUserData(hashMap);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void runOnUIThread(java.lang.Runnable runnable) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.uiThreadHandler.post(runnable);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* compiled from: MetadataViewObserver.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J,\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/facebook/appevents/aam/MetadataViewObserver$Companion;", "", "()V", "MAX_TEXT_LENGTH", "", "observers", "", "Lcom/facebook/appevents/aam/MetadataViewObserver;", "preNormalize", "", com.ironsource.X3.i.W, "value", "putUserData", "", "userData", "startTrackingActivity", "activity", "Landroid/app/Activity;", "stopTrackingActivity", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final void startTrackingActivity(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            int hashCode = activity.hashCode();
            java.util.Map access$getObservers$cp = com.facebook.appevents.aam.MetadataViewObserver.access$getObservers$cp();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode);
            java.lang.Object obj = access$getObservers$cp.get(valueOf);
            if (obj == null) {
                obj = new com.facebook.appevents.aam.MetadataViewObserver(activity, null);
                access$getObservers$cp.put(valueOf, obj);
            }
            com.facebook.appevents.aam.MetadataViewObserver.access$startTracking((com.facebook.appevents.aam.MetadataViewObserver) obj);
        }

        @kotlin.jvm.JvmStatic
        public final void stopTrackingActivity(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            com.facebook.appevents.aam.MetadataViewObserver metadataViewObserver = (com.facebook.appevents.aam.MetadataViewObserver) com.facebook.appevents.aam.MetadataViewObserver.access$getObservers$cp().remove(java.lang.Integer.valueOf(activity.hashCode()));
            if (metadataViewObserver == null) {
                return;
            }
            com.facebook.appevents.aam.MetadataViewObserver.access$stopTracking(metadataViewObserver);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.String preNormalize(java.lang.String key, java.lang.String value) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual("r2", key)) {
                return value;
            }
            return new kotlin.text.Regex("[^\\d.]").replace(value, "");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
            if (r8.equals("r5") == false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
        
            r9 = new kotlin.text.Regex("[^a-z]+").replace(r9, "");
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
        
            if (r8.equals("r4") == false) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void putUserData(java.util.Map<java.lang.String, java.lang.String> userData, java.lang.String key, java.lang.String value) {
            switch (key.hashCode()) {
                case 3585:
                    if (key.equals("r3")) {
                        if (kotlin.text.StringsKt.startsWith$default(value, com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_MALE, false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(value, "b", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(value, com.facebook.appevents.UserDataStore.GENDER, false, 2, (java.lang.Object) null)) {
                            value = com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_MALE;
                        } else {
                            value = com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_FEMALE;
                        }
                    }
                    userData.put(key, value);
                    return;
                case 3586:
                    break;
                case 3587:
                    break;
                case 3588:
                    if (key.equals("r6")) {
                        java.lang.String str = value;
                        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null)) {
                            java.lang.Object[] array = new kotlin.text.Regex("-").split(str, 0).toArray(new java.lang.String[0]);
                            if (array != null) {
                                value = ((java.lang.String[]) array)[0];
                            } else {
                                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                            }
                        }
                    }
                    userData.put(key, value);
                    return;
                default:
                    userData.put(key, value);
                    return;
            }
        }
    }
}
