package com.facebook.appevents.suggestedevents;

/* compiled from: ViewOnClickListener.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J \u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/facebook/appevents/suggestedevents/ViewOnClickListener;", "Landroid/view/View$OnClickListener;", "hostView", "Landroid/view/View;", "rootView", "activityName", "", "(Landroid/view/View;Landroid/view/View;Ljava/lang/String;)V", "baseListener", "hostViewWeakReference", "Ljava/lang/ref/WeakReference;", "rootViewWeakReference", "onClick", "", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "predictAndProcess", "pathID", "buttonText", "viewData", "Lorg/json/JSONObject;", "process", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewOnClickListener implements android.view.View.OnClickListener {
    private static final java.lang.String API_ENDPOINT = "%s/suggested_events";
    public static final java.lang.String OTHER_EVENT = "other";
    private final java.lang.String activityName;
    private final android.view.View.OnClickListener baseListener;
    private final java.lang.ref.WeakReference<android.view.View> hostViewWeakReference;
    private final java.lang.ref.WeakReference<android.view.View> rootViewWeakReference;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.appevents.suggestedevents.ViewOnClickListener.Companion INSTANCE = new com.facebook.appevents.suggestedevents.ViewOnClickListener.Companion(null);
    private static final java.util.Set<java.lang.Integer> viewsAttachedListener = new java.util.HashSet();

    public /* synthetic */ ViewOnClickListener(android.view.View view, android.view.View view2, java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(view, view2, str);
    }

    @kotlin.jvm.JvmStatic
    public static final void attachListener$facebook_core_release(android.view.View view, android.view.View view2, java.lang.String str) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.suggestedevents.ViewOnClickListener.class)) {
            return;
        }
        try {
            INSTANCE.attachListener$facebook_core_release(view, view2, str);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.suggestedevents.ViewOnClickListener.class);
        }
    }

    private ViewOnClickListener(android.view.View view, android.view.View view2, java.lang.String str) {
        com.facebook.appevents.codeless.internal.ViewHierarchy viewHierarchy = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE;
        this.baseListener = com.facebook.appevents.codeless.internal.ViewHierarchy.getExistingOnClickListener(view);
        this.rootViewWeakReference = new java.lang.ref.WeakReference<>(view2);
        this.hostViewWeakReference = new java.lang.ref.WeakReference<>(view);
        if (str == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        java.lang.String lowerCase = str.toLowerCase();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
        this.activityName = kotlin.text.StringsKt.replace$default(lowerCase, "activity", "", false, 4, (java.lang.Object) null);
    }

    public static final /* synthetic */ java.util.Set access$getViewsAttachedListener$cp() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.suggestedevents.ViewOnClickListener.class)) {
            return null;
        }
        try {
            return viewsAttachedListener;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.suggestedevents.ViewOnClickListener.class);
            return null;
        }
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
                    android.view.View.OnClickListener onClickListener = this.baseListener;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    process();
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

    private final void process() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            android.view.View view = this.rootViewWeakReference.get();
            android.view.View view2 = this.hostViewWeakReference.get();
            if (view == null || view2 == null) {
                return;
            }
            try {
                com.facebook.appevents.suggestedevents.SuggestedEventViewHierarchy suggestedEventViewHierarchy = com.facebook.appevents.suggestedevents.SuggestedEventViewHierarchy.INSTANCE;
                java.lang.String textOfViewRecursively = com.facebook.appevents.suggestedevents.SuggestedEventViewHierarchy.getTextOfViewRecursively(view2);
                com.facebook.appevents.suggestedevents.PredictionHistoryManager predictionHistoryManager = com.facebook.appevents.suggestedevents.PredictionHistoryManager.INSTANCE;
                java.lang.String pathID = com.facebook.appevents.suggestedevents.PredictionHistoryManager.getPathID(view2, textOfViewRecursively);
                if (pathID == null || INSTANCE.queryHistoryAndProcess(pathID, textOfViewRecursively)) {
                    return;
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.facebook.appevents.suggestedevents.SuggestedEventViewHierarchy suggestedEventViewHierarchy2 = com.facebook.appevents.suggestedevents.SuggestedEventViewHierarchy.INSTANCE;
                jSONObject.put(com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, com.facebook.appevents.suggestedevents.SuggestedEventViewHierarchy.getDictionaryOfView(view, view2));
                jSONObject.put(com.facebook.appevents.internal.ViewHierarchyConstants.SCREEN_NAME_KEY, this.activityName);
                predictAndProcess(pathID, textOfViewRecursively, jSONObject);
            } catch (java.lang.Exception unused) {
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void predictAndProcess(final java.lang.String pathID, final java.lang.String buttonText, final org.json.JSONObject viewData) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.Utility.runOnNonUiThread(new java.lang.Runnable() { // from class: com.facebook.appevents.suggestedevents.ViewOnClickListener$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.appevents.suggestedevents.ViewOnClickListener.m5152predictAndProcess$lambda0(viewData, buttonText, this, pathID);
                }
            });
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: predictAndProcess$lambda-0, reason: not valid java name */
    public static final void m5152predictAndProcess$lambda0(org.json.JSONObject viewData, java.lang.String buttonText, com.facebook.appevents.suggestedevents.ViewOnClickListener this$0, java.lang.String pathID) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.suggestedevents.ViewOnClickListener.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewData, "$viewData");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonText, "$buttonText");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathID, "$pathID");
            try {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                java.lang.String appName = com.facebook.internal.Utility.getAppName(com.facebook.FacebookSdk.getApplicationContext());
                if (appName == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                java.lang.String lowerCase = appName.toLowerCase();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                com.facebook.appevents.suggestedevents.FeatureExtractor featureExtractor = com.facebook.appevents.suggestedevents.FeatureExtractor.INSTANCE;
                float[] denseFeatures = com.facebook.appevents.suggestedevents.FeatureExtractor.getDenseFeatures(viewData, lowerCase);
                com.facebook.appevents.suggestedevents.FeatureExtractor featureExtractor2 = com.facebook.appevents.suggestedevents.FeatureExtractor.INSTANCE;
                java.lang.String textFeature = com.facebook.appevents.suggestedevents.FeatureExtractor.getTextFeature(buttonText, this$0.activityName, lowerCase);
                if (denseFeatures == null) {
                    return;
                }
                com.facebook.appevents.ml.ModelManager modelManager = com.facebook.appevents.ml.ModelManager.INSTANCE;
                java.lang.String[] predict = com.facebook.appevents.ml.ModelManager.predict(com.facebook.appevents.ml.ModelManager.Task.MTML_APP_EVENT_PREDICTION, new float[][]{denseFeatures}, new java.lang.String[]{textFeature});
                if (predict == null) {
                    return;
                }
                java.lang.String str = predict[0];
                com.facebook.appevents.suggestedevents.PredictionHistoryManager predictionHistoryManager = com.facebook.appevents.suggestedevents.PredictionHistoryManager.INSTANCE;
                com.facebook.appevents.suggestedevents.PredictionHistoryManager.addPrediction(pathID, str);
                if (kotlin.jvm.internal.Intrinsics.areEqual(str, "other")) {
                    return;
                }
                INSTANCE.processPredictedResult(str, buttonText, denseFeatures);
            } catch (java.lang.Exception unused) {
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.suggestedevents.ViewOnClickListener.class);
        }
    }

    /* compiled from: ViewOnClickListener.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u000fJ \u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J \u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/facebook/appevents/suggestedevents/ViewOnClickListener$Companion;", "", "()V", "API_ENDPOINT", "", "OTHER_EVENT", "viewsAttachedListener", "", "", "attachListener", "", "hostView", "Landroid/view/View;", "rootView", "activityName", "attachListener$facebook_core_release", "processPredictedResult", "predictedEvent", "buttonText", "dense", "", "queryHistoryAndProcess", "", "pathID", "sendPredictedResult", "eventToPost", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final void attachListener$facebook_core_release(android.view.View hostView, android.view.View rootView, java.lang.String activityName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostView, "hostView");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "rootView");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityName, "activityName");
            int hashCode = hostView.hashCode();
            if (com.facebook.appevents.suggestedevents.ViewOnClickListener.access$getViewsAttachedListener$cp().contains(java.lang.Integer.valueOf(hashCode))) {
                return;
            }
            com.facebook.appevents.codeless.internal.ViewHierarchy viewHierarchy = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE;
            com.facebook.appevents.codeless.internal.ViewHierarchy.setOnClickListener(hostView, new com.facebook.appevents.suggestedevents.ViewOnClickListener(hostView, rootView, activityName, null));
            com.facebook.appevents.suggestedevents.ViewOnClickListener.access$getViewsAttachedListener$cp().add(java.lang.Integer.valueOf(hashCode));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean queryHistoryAndProcess(java.lang.String pathID, final java.lang.String buttonText) {
            com.facebook.appevents.suggestedevents.PredictionHistoryManager predictionHistoryManager = com.facebook.appevents.suggestedevents.PredictionHistoryManager.INSTANCE;
            final java.lang.String queryEvent = com.facebook.appevents.suggestedevents.PredictionHistoryManager.queryEvent(pathID);
            if (queryEvent == null) {
                return false;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(queryEvent, "other")) {
                return true;
            }
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.Utility.runOnNonUiThread(new java.lang.Runnable() { // from class: com.facebook.appevents.suggestedevents.ViewOnClickListener$Companion$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.appevents.suggestedevents.ViewOnClickListener.Companion.m5153queryHistoryAndProcess$lambda0(queryEvent, buttonText);
                }
            });
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: queryHistoryAndProcess$lambda-0, reason: not valid java name */
        public static final void m5153queryHistoryAndProcess$lambda0(java.lang.String queriedEvent, java.lang.String buttonText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queriedEvent, "$queriedEvent");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonText, "$buttonText");
            com.facebook.appevents.suggestedevents.ViewOnClickListener.INSTANCE.processPredictedResult(queriedEvent, buttonText, new float[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void processPredictedResult(java.lang.String predictedEvent, java.lang.String buttonText, float[] dense) {
            com.facebook.appevents.suggestedevents.SuggestedEventsManager suggestedEventsManager = com.facebook.appevents.suggestedevents.SuggestedEventsManager.INSTANCE;
            if (com.facebook.appevents.suggestedevents.SuggestedEventsManager.isProductionEvents$facebook_core_release(predictedEvent)) {
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                new com.facebook.appevents.InternalAppEventsLogger(com.facebook.FacebookSdk.getApplicationContext()).logEventFromSE(predictedEvent, buttonText);
            } else {
                com.facebook.appevents.suggestedevents.SuggestedEventsManager suggestedEventsManager2 = com.facebook.appevents.suggestedevents.SuggestedEventsManager.INSTANCE;
                if (com.facebook.appevents.suggestedevents.SuggestedEventsManager.isEligibleEvents$facebook_core_release(predictedEvent)) {
                    sendPredictedResult(predictedEvent, buttonText, dense);
                }
            }
        }

        private final void sendPredictedResult(java.lang.String eventToPost, java.lang.String buttonText, float[] dense) {
            android.os.Bundle bundle = new android.os.Bundle();
            try {
                bundle.putString("event_name", eventToPost);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int length = dense.length;
                int i = 0;
                while (i < length) {
                    float f = dense[i];
                    i++;
                    sb.append(f);
                    sb.append(",");
                }
                jSONObject.put("dense", sb.toString());
                jSONObject.put("button_text", buttonText);
                bundle.putString("metadata", jSONObject.toString());
                com.facebook.GraphRequest.Companion companion = com.facebook.GraphRequest.INSTANCE;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.util.Locale locale = java.util.Locale.US;
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                java.lang.String format = java.lang.String.format(locale, com.facebook.appevents.suggestedevents.ViewOnClickListener.API_ENDPOINT, java.util.Arrays.copyOf(new java.lang.Object[]{com.facebook.FacebookSdk.getApplicationId()}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                com.facebook.GraphRequest newPostRequest = companion.newPostRequest(null, format, null, null);
                newPostRequest.setParameters(bundle);
                newPostRequest.executeAndWait();
            } catch (org.json.JSONException unused) {
            }
        }
    }
}
