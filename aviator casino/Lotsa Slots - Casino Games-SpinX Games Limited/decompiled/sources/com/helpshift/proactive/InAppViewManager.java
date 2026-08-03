package com.helpshift.proactive;

/* loaded from: classes5.dex */
public class InAppViewManager {
    private static java.lang.String TAG = "InAppViewMngr";
    private java.lang.Runnable autoDismissRunnable;
    private android.window.OnBackInvokedCallback backInvokedCallback;
    private android.view.ViewGroup decorView;
    private com.helpshift.analytics.HSAnalyticsEventDM hsAnalyticsEventDM;
    private com.helpshift.config.HSConfigManager hsConfigManager;
    private final com.helpshift.storage.HSPersistentStorage hsPersistentStorage;
    private com.helpshift.proactive.InAppNotificationViewCallback inAppNotificationViewCallback;
    private android.view.ViewGroup inAppParentLayoutView;
    private android.widget.LinearLayout overlayView;
    private com.helpshift.proactive.ProactiveInappNotification proactiveInappNotification;
    private android.view.ViewGroup rootView;
    private android.view.ViewGroup scrollView;
    private java.util.Map<java.lang.String, java.io.File> urlToFileMapping;
    private android.app.Activity currentActivity = null;
    final float SWIPE_THRESHOLD_RATIO = 0.33333334f;

    static /* synthetic */ void lambda$setClickActionListener$6(android.view.View view) {
    }

    public InAppViewManager(com.helpshift.storage.HSPersistentStorage hSPersistentStorage) {
        this.hsPersistentStorage = hSPersistentStorage;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r10 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        r10.inAppViewed();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        com.helpshift.util.ApplicationUtil.cancelNotification(r4.currentActivity.getApplicationContext(), r7.notificationId);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        if (r10 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void showInAppNotification(com.helpshift.analytics.HSAnalyticsEventDM hSAnalyticsEventDM, com.helpshift.config.HSConfigManager hSConfigManager, com.helpshift.proactive.ProactiveInappNotification proactiveInappNotification, java.util.Map<java.lang.String, java.io.File> map, boolean z, com.helpshift.proactive.InAppNotificationViewCallback inAppNotificationViewCallback) {
        try {
            try {
                com.helpshift.proactive.ProactiveInappNotification proactiveInappNotification2 = this.proactiveInappNotification;
                if (proactiveInappNotification2 != null && proactiveInappNotification2.analyticsId != null && this.proactiveInappNotification.analyticsId.equals(proactiveInappNotification.analyticsId)) {
                    com.helpshift.log.HSLogger.d(TAG, "Same in-app notification is already displayed");
                    return;
                }
                if (this.proactiveInappNotification != null && this.decorView != null && this.overlayView != null) {
                    com.helpshift.log.HSLogger.d(TAG, "Removing existing in-app notification before showing new");
                    closeInAppNotification(true);
                }
                this.proactiveInappNotification = proactiveInappNotification;
                this.urlToFileMapping = map;
                this.hsAnalyticsEventDM = hSAnalyticsEventDM;
                this.inAppNotificationViewCallback = inAppNotificationViewCallback;
                this.hsConfigManager = hSConfigManager;
                if (showNotificationInternal(false)) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    sendInAppViewEvent(currentTimeMillis, z);
                    proactiveInappNotification.setViewTime(currentTimeMillis);
                }
            } catch (java.lang.Exception e) {
                com.helpshift.log.HSLogger.e(TAG, "Error in showing in-app notification", e);
                com.helpshift.proactive.ProactiveAnalyticsUtil.sendInAppEventToAnalytics(hSAnalyticsEventDM, com.helpshift.analytics.AnalyticsEventType.IN_APP_FAILED, java.lang.System.currentTimeMillis(), com.helpshift.proactive.ProactiveAnalyticsUtil.getCommonEventData(proactiveInappNotification));
                this.hsPersistentStorage.storeInAppNotificationData("");
                this.hsPersistentStorage.storeLastProactiveNotificationData("");
                closeInAppNotification(true);
            }
        } finally {
            if (inAppNotificationViewCallback != null) {
                inAppNotificationViewCallback.inAppViewed();
            }
            com.helpshift.util.ApplicationUtil.cancelNotification(this.currentActivity.getApplicationContext(), proactiveInappNotification.notificationId);
        }
    }

    private void sendInAppViewEvent(long j, boolean z) {
        java.util.Map<java.lang.String, java.lang.Object> commonEventData = com.helpshift.proactive.ProactiveAnalyticsUtil.getCommonEventData(this.proactiveInappNotification);
        com.helpshift.proactive.ProactiveAnalyticsUtil.addIsForegroundEventType(commonEventData, z);
        com.helpshift.proactive.ProactiveAnalyticsUtil.sendInAppEventToAnalytics(this.hsAnalyticsEventDM, com.helpshift.analytics.AnalyticsEventType.IN_APP_VIEWED, j, commonEventData);
    }

    private boolean showNotificationInternal(boolean z) throws java.lang.Exception {
        android.app.Activity activity = this.currentActivity;
        if (activity == null || activity.isFinishing() || this.currentActivity.isDestroyed()) {
            com.helpshift.log.HSLogger.d(TAG, "Not showing in-app notification, current-activity is null");
            closeInAppNotification(true);
            return false;
        }
        org.json.JSONObject inAppChildViewData = getInAppChildViewData(this.currentActivity, this.proactiveInappNotification.inAppData);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.currentActivity.findViewById(android.R.id.content);
        this.decorView = viewGroup;
        this.overlayView = getOverlayContent(viewGroup.getContext());
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) createViewFromJson(this.decorView.getContext(), inAppChildViewData, this.urlToFileMapping, true);
        this.inAppParentLayoutView = viewGroup2;
        this.scrollView = wrapScrollViewIfNeeded(viewGroup2, inAppChildViewData);
        setPositionForInApp(this.overlayView);
        setAutoDismissal(this.scrollView);
        setupDismissOnSlide(this.scrollView);
        setDismissOnOutsideClick(this.overlayView);
        clipChildrenToOutline(this.inAppParentLayoutView);
        android.view.ViewGroup wrapCrossButton = wrapCrossButton(this.scrollView, inAppChildViewData);
        this.rootView = wrapCrossButton;
        animateInApp(wrapCrossButton);
        this.overlayView.addView(this.rootView);
        this.decorView.addView(this.overlayView);
        this.hsPersistentStorage.storeInAppNotificationData("");
        applyWindowInsets(this.overlayView, inAppChildViewData);
        addBackButtonHandling(this.overlayView);
        com.helpshift.log.HSLogger.d(TAG, "In-app notification shown, id " + com.helpshift.util.Utils.getMaskedString(this.proactiveInappNotification.notificationId));
        return true;
    }

    private android.view.ViewGroup wrapCrossButton(android.view.ViewGroup viewGroup, org.json.JSONObject jSONObject) {
        android.content.Context context = viewGroup.getContext();
        if (this.proactiveInappNotification.type != com.helpshift.proactive.InAppViewConstants.InAppNotificationType.MODAL) {
            return viewGroup;
        }
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        android.widget.ImageView createCrossButton = createCrossButton(context, jSONObject.optJSONObject(com.helpshift.proactive.InAppViewConstants.CROSS_BUTTON));
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams((com.helpshift.util.ViewUtil.isDeviceInLandscape(viewGroup.getContext()) || com.helpshift.util.ViewUtil.isTablet(context)) ? -2 : -1, -2));
        frameLayout.addView(viewGroup);
        if (createCrossButton != null) {
            frameLayout.addView(createCrossButton);
        }
        return frameLayout;
    }

    private android.widget.ImageView createCrossButton(android.content.Context context, org.json.JSONObject jSONObject) {
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(com.helpshift.util.ViewUtil.dpToPx(this.inAppParentLayoutView.getContext(), 38), com.helpshift.util.ViewUtil.dpToPx(this.inAppParentLayoutView.getContext(), 38));
        int parseColor = com.helpshift.util.ViewUtil.parseColor("#FF000000", "#FF000000");
        int[] iArr = {8, 24};
        if (jSONObject != null) {
            parseColor = com.helpshift.util.ViewUtil.parseColor(jSONObject.optString("color", "#FF000000"), "#FF000000");
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.helpshift.proactive.InAppViewConstants.MARGIN);
            if (optJSONArray != null && optJSONArray.length() == 2) {
                iArr[0] = optJSONArray.optInt(0, iArr[0]);
                iArr[1] = optJSONArray.optInt(1, iArr[1]);
            }
        }
        imageView.setColorFilter(parseColor);
        layoutParams.rightMargin = com.helpshift.util.ViewUtil.dpToPx(context, iArr[1]);
        layoutParams.topMargin = com.helpshift.util.ViewUtil.dpToPx(context, iArr[0]);
        imageView.setImageResource(com.helpshift.R.drawable.hs__cross_icon);
        imageView.setClickable(true);
        imageView.setOnClickListener(new com.helpshift.util.SafeWrappedClickedListener(new android.view.View.OnClickListener() { // from class: com.helpshift.proactive.InAppViewManager$$ExternalSyntheticLambda11
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.helpshift.proactive.InAppViewManager.this.m5687x93d6d5fd(view);
            }
        }));
        imageView.setContentDescription(com.helpshift.proactive.InAppViewConstants.CONTENT_DESCRIPTION_CROSS);
        com.helpshift.proactive.InAppViewUtil.addCircularRippleEffect(imageView);
        int dpToPx = com.helpshift.util.ViewUtil.dpToPx(context, 6);
        imageView.setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
        layoutParams.gravity = androidx.core.view.GravityCompat.END;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    /* renamed from: lambda$createCrossButton$0$com-helpshift-proactive-InAppViewManager, reason: not valid java name */
    /* synthetic */ void m5687x93d6d5fd(android.view.View view) {
        dismissInAppWithAnimation(com.helpshift.proactive.InAppViewConstants.InAppNotificationType.MODAL, "center", com.helpshift.proactive.ProactiveInAppDismissType.CROSS_BUTTON);
    }

    private android.widget.LinearLayout getOverlayContent(android.content.Context context) {
        this.overlayView = new android.widget.LinearLayout(context);
        this.overlayView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        if (this.proactiveInappNotification.type == com.helpshift.proactive.InAppViewConstants.InAppNotificationType.MODAL) {
            this.overlayView.setBackgroundColor(android.graphics.Color.parseColor("#99000012"));
        }
        return this.overlayView;
    }

    private void setDismissOnOutsideClick(android.widget.LinearLayout linearLayout) {
        if (this.proactiveInappNotification.type != com.helpshift.proactive.InAppViewConstants.InAppNotificationType.MODAL) {
            return;
        }
        linearLayout.setOnClickListener(new com.helpshift.util.SafeWrappedClickedListener(new android.view.View.OnClickListener() { // from class: com.helpshift.proactive.InAppViewManager$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.helpshift.proactive.InAppViewManager.this.m5694xe53ed12e(view);
            }
        }));
    }

    /* renamed from: lambda$setDismissOnOutsideClick$1$com-helpshift-proactive-InAppViewManager, reason: not valid java name */
    /* synthetic */ void m5694xe53ed12e(android.view.View view) {
        dismissInAppWithAnimation(this.proactiveInappNotification.type, this.proactiveInappNotification.position, com.helpshift.proactive.ProactiveInAppDismissType.OUTSIDE_CLICK);
    }

    private void animateInApp(android.view.ViewGroup viewGroup) {
        if (this.proactiveInappNotification.type == com.helpshift.proactive.InAppViewConstants.InAppNotificationType.MODAL) {
            com.helpshift.proactive.InAppViewUtil.animateScaleIn(viewGroup);
        } else if (com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM.equalsIgnoreCase(this.proactiveInappNotification.position)) {
            com.helpshift.proactive.InAppViewUtil.animateSlideUp(viewGroup);
        } else {
            com.helpshift.proactive.InAppViewUtil.animateSlideDown(viewGroup);
        }
    }

    private void clipChildrenToOutline(android.view.ViewGroup viewGroup) {
        viewGroup.setClipToOutline(true);
    }

    private void setupDismissOnSlide(final android.view.ViewGroup viewGroup) {
        if (this.proactiveInappNotification.type == com.helpshift.proactive.InAppViewConstants.InAppNotificationType.MODAL) {
            return;
        }
        final float[] fArr = new float[1];
        final float[] fArr2 = new float[1];
        final long[] jArr = new long[1];
        viewGroup.setOnTouchListener(new com.helpshift.util.SafeWrappedTouchListener(new android.view.View.OnTouchListener() { // from class: com.helpshift.proactive.InAppViewManager$$ExternalSyntheticLambda12
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return com.helpshift.proactive.InAppViewManager.this.m5697x745457ca(fArr, jArr, fArr2, viewGroup, view, motionEvent);
            }
        }));
    }

    /* renamed from: lambda$setupDismissOnSlide$4$com-helpshift-proactive-InAppViewManager, reason: not valid java name */
    /* synthetic */ boolean m5697x745457ca(float[] fArr, long[] jArr, float[] fArr2, final android.view.ViewGroup viewGroup, android.view.View view, android.view.MotionEvent motionEvent) {
        int scaledTouchSlop = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
        int action = motionEvent.getAction();
        if (action == 0) {
            fArr[0] = motionEvent.getRawX();
            jArr[0] = motionEvent.getEventTime();
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                float rawX = motionEvent.getRawX() - fArr[0];
                if (java.lang.Math.abs(rawX) > scaledTouchSlop) {
                    fArr2[0] = rawX;
                    view.setTranslationX(rawX);
                }
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        float rawX2 = motionEvent.getRawX() - fArr[0];
        float width = view.getWidth() * 0.33333334f;
        long eventTime = motionEvent.getEventTime() - jArr[0];
        if (java.lang.Math.abs(rawX2) < scaledTouchSlop && eventTime < longPressTimeout) {
            view.performClick();
            return true;
        }
        if (java.lang.Math.abs(rawX2) > width) {
            view.animate().translationX((rawX2 <= 0.0f ? -1.0f : 1.0f) * view.getWidth()).alpha(0.0f).setDuration(300L).withEndAction(new java.lang.Runnable() { // from class: com.helpshift.proactive.InAppViewManager$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.proactive.InAppViewManager.this.m5696x6cef22ab(viewGroup);
                }
            }).start();
        } else {
            view.animate().translationX(0.0f).alpha(1.0f).setDuration(200L).start();
        }
        return true;
    }

    /* renamed from: lambda$setupDismissOnSlide$3$com-helpshift-proactive-InAppViewManager, reason: not valid java name */
    /* synthetic */ void m5696x6cef22ab(android.view.ViewGroup viewGroup) {
        viewGroup.post(new java.lang.Runnable() { // from class: com.helpshift.proactive.InAppViewManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.proactive.InAppViewManager.this.m5695x6589ed8c();
            }
        });
    }

    /* renamed from: lambda$setupDismissOnSlide$2$com-helpshift-proactive-InAppViewManager, reason: not valid java name */
    /* synthetic */ void m5695x6589ed8c() {
        m5691x5aa2ca1e(com.helpshift.proactive.ProactiveInAppDismissType.SWIPE_DISMISS);
    }

    private void applyWindowInsets(final android.view.View view, final org.json.JSONObject jSONObject) {
        if (android.os.Build.VERSION.SDK_INT < 35) {
            return;
        }
        if (com.helpshift.util.ViewUtil.isEdgeToEdgeOptedOut(this.currentActivity)) {
            com.helpshift.log.HSLogger.d(TAG, "applyWindowInsets : Edge-to-edge is opted out, no need to apply insets");
        } else {
            final android.content.Context context = view.getContext();
            view.post(new java.lang.Runnable() { // from class: com.helpshift.proactive.InAppViewManager$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.proactive.InAppViewManager.lambda$applyWindowInsets$5(jSONObject, view, context);
                }
            });
        }
    }

    static /* synthetic */ void lambda$applyWindowInsets$5(org.json.JSONObject jSONObject, android.view.View view, android.content.Context context) {
        try {
            int[] iArr = new int[4];
            com.helpshift.proactive.InAppViewUtil.parseMarginOrPadding(jSONObject.optJSONArray(com.helpshift.proactive.InAppViewConstants.MARGIN), iArr);
            android.view.WindowInsets rootWindowInsets = view.getRootWindowInsets();
            int displayCutout = android.view.WindowInsets.Type.displayCutout() | android.view.WindowInsets.Type.systemBars();
            view.setPadding(0, com.helpshift.util.ViewUtil.dpToPx(context, iArr[1]) + rootWindowInsets.getInsets(displayCutout).top, 0, com.helpshift.util.ViewUtil.dpToPx(context, iArr[3]) + rootWindowInsets.getInsets(displayCutout).bottom);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in applying window insets", e);
        }
    }

    private void setClickActionListener(android.view.View view, org.json.JSONObject jSONObject, boolean z, boolean z2) {
        try {
            if (!jSONObject.has("actionConfig")) {
                if (z2) {
                    view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.helpshift.proactive.InAppViewManager$$ExternalSyntheticLambda14
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view2) {
                            com.helpshift.proactive.InAppViewManager.lambda$setClickActionListener$6(view2);
                        }
                    });
                    return;
                }
                return;
            }
            final com.helpshift.proactive.ProactiveActionEntity extractProactiveActionEntity = com.helpshift.proactive.ProactiveNotificationParser.extractProactiveActionEntity(jSONObject);
            final int i = extractProactiveActionEntity.priority;
            final java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.helpshift.proactive.ProactiveNotificationConstants.ANALYTICS_ID, this.proactiveInappNotification.analyticsId);
            hashMap.put(com.helpshift.proactive.ProactiveNotificationConstants.NOTIFICATION_ID, this.proactiveInappNotification.notificationId);
            hashMap.put(com.helpshift.proactive.ProactiveNotificationConstants.ENCODED_NOTIF_PAYLOAD, this.proactiveInappNotification.encodedNotificationPayload);
            hashMap.put(com.helpshift.proactive.ProactiveNotificationConstants.DELIVERY_TIME, java.lang.String.valueOf(this.proactiveInappNotification.deliveryTime));
            if (i != -1) {
                hashMap.put("priority", java.lang.String.valueOf(i));
            }
            if (z) {
                com.helpshift.proactive.InAppViewUtil.setRippleEffect(view, jSONObject.optInt(com.helpshift.proactive.InAppViewConstants.RADIUS));
            }
            view.setClickable(true);
            view.setOnClickListener(new com.helpshift.util.SafeWrappedClickedListener(new android.view.View.OnClickListener() { // from class: com.helpshift.proactive.InAppViewManager$$ExternalSyntheticLambda15
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.helpshift.proactive.InAppViewManager.this.m5693x41acb442(extractProactiveActionEntity, hashMap, i, view2);
                }
            }));
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in setting click listener", e);
        }
    }

    /* renamed from: lambda$setClickActionListener$7$com-helpshift-proactive-InAppViewManager, reason: not valid java name */
    /* synthetic */ void m5693x41acb442(com.helpshift.proactive.ProactiveActionEntity proactiveActionEntity, java.util.Map map, int i, android.view.View view) {
        java.lang.String str = proactiveActionEntity.action.value;
        if (!com.helpshift.proactive.ProactiveActions.DISMISS.value.equalsIgnoreCase(str)) {
            com.helpshift.proactive.ProactiveActionHandler.handleProactiveAction(this.currentActivity, this.hsConfigManager, proactiveActionEntity.actionConfigJSON, map, proactiveActionEntity.action.value, proactiveActionEntity.actionValue);
        }
        java.util.Map<java.lang.String, java.lang.Object> commonEventData = com.helpshift.proactive.ProactiveAnalyticsUtil.getCommonEventData(this.proactiveInappNotification);
        com.helpshift.proactive.ProactiveAnalyticsUtil.addPriority(i, commonEventData);
        com.helpshift.proactive.ProactiveAnalyticsUtil.addActionType(str, commonEventData);
        com.helpshift.proactive.ProactiveAnalyticsUtil.addViewTime(this.proactiveInappNotification.viewTime, commonEventData);
        com.helpshift.proactive.ProactiveAnalyticsUtil.sendInAppEventToAnalytics(this.hsAnalyticsEventDM, com.helpshift.analytics.AnalyticsEventType.IN_APP_CLICKED, java.lang.System.currentTimeMillis(), commonEventData);
        m5691x5aa2ca1e(com.helpshift.proactive.ProactiveInAppDismissType.VIEW_CLICK);
    }

    private void setPositionForInApp(android.widget.LinearLayout linearLayout) {
        linearLayout.setGravity(com.helpshift.proactive.InAppViewUtil.getGravity(this.proactiveInappNotification.position));
    }

    private void setAutoDismissal(android.view.View view) {
        boolean z = this.proactiveInappNotification.shouldDismiss;
        int i = this.proactiveInappNotification.dismissAfter;
        if (!z || i == 0) {
            com.helpshift.log.HSLogger.d(TAG, "Auto-dismiss not enabled for in-app");
            return;
        }
        com.helpshift.util.SafeWrappedRunnable safeWrappedRunnable = new com.helpshift.util.SafeWrappedRunnable(new java.lang.Runnable() { // from class: com.helpshift.proactive.InAppViewManager$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.proactive.InAppViewManager.this.m5692x7b409e0d();
            }
        });
        this.autoDismissRunnable = safeWrappedRunnable;
        view.postDelayed(safeWrappedRunnable, i * 1000);
    }

    /* renamed from: lambda$setAutoDismissal$8$com-helpshift-proactive-InAppViewManager, reason: not valid java name */
    /* synthetic */ void m5692x7b409e0d() {
        com.helpshift.proactive.ProactiveInappNotification proactiveInappNotification = this.proactiveInappNotification;
        if (proactiveInappNotification == null) {
            return;
        }
        dismissInAppWithAnimation(proactiveInappNotification.type, this.proactiveInappNotification.position, com.helpshift.proactive.ProactiveInAppDismissType.AUTO_DISMISS);
    }

    private void dismissInAppWithAnimation(com.helpshift.proactive.InAppViewConstants.InAppNotificationType inAppNotificationType, java.lang.String str, final com.helpshift.proactive.ProactiveInAppDismissType proactiveInAppDismissType) {
        if (inAppNotificationType == com.helpshift.proactive.InAppViewConstants.InAppNotificationType.MODAL) {
            this.overlayView.setBackgroundColor(0);
            com.helpshift.proactive.InAppViewUtil.dismissWithScaleOutAnimation(this.rootView, new java.lang.Runnable() { // from class: com.helpshift.proactive.InAppViewManager$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.proactive.InAppViewManager.this.m5691x5aa2ca1e(proactiveInAppDismissType);
                }
            });
        } else if (com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM.equalsIgnoreCase(str)) {
            com.helpshift.proactive.InAppViewUtil.dismissWithSlideDownAnimation(this.overlayView, new java.lang.Runnable() { // from class: com.helpshift.proactive.InAppViewManager$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.proactive.InAppViewManager.this.m5689x5b46612e(proactiveInAppDismissType);
                }
            });
        } else {
            com.helpshift.proactive.InAppViewUtil.dismissWithSlideUpAnimation(this.overlayView, new java.lang.Runnable() { // from class: com.helpshift.proactive.InAppViewManager$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.proactive.InAppViewManager.this.m5690x62ab964d(proactiveInAppDismissType);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dismissInAppNotification, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m5691x5aa2ca1e(com.helpshift.proactive.ProactiveInAppDismissType proactiveInAppDismissType) {
        try {
            try {
                if (proactiveInAppDismissType != com.helpshift.proactive.ProactiveInAppDismissType.VIEW_CLICK) {
                    java.util.Map<java.lang.String, java.lang.Object> commonEventData = com.helpshift.proactive.ProactiveAnalyticsUtil.getCommonEventData(this.proactiveInappNotification);
                    com.helpshift.proactive.ProactiveAnalyticsUtil.addDismissType(proactiveInAppDismissType, commonEventData);
                    com.helpshift.proactive.ProactiveInappNotification proactiveInappNotification = this.proactiveInappNotification;
                    if (proactiveInappNotification != null) {
                        com.helpshift.proactive.ProactiveAnalyticsUtil.addViewTime(proactiveInappNotification.viewTime, commonEventData);
                    }
                    com.helpshift.proactive.ProactiveAnalyticsUtil.sendInAppEventToAnalytics(this.hsAnalyticsEventDM, com.helpshift.analytics.AnalyticsEventType.IN_APP_DISMISSED, java.lang.System.currentTimeMillis(), commonEventData);
                }
            } catch (java.lang.Exception e) {
                com.helpshift.log.HSLogger.e(TAG, "Error in dismissing in-app notification", e);
            }
            com.helpshift.log.HSLogger.d(TAG, "dismissInAppNotification: dismissType " + proactiveInAppDismissType);
        } finally {
            closeInAppNotification(true);
        }
    }

    private android.view.ViewGroup wrapScrollViewIfNeeded(android.view.ViewGroup viewGroup, org.json.JSONObject jSONObject) {
        android.content.Context context = viewGroup.getContext();
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int optInt = jSONObject.optInt(com.helpshift.proactive.InAppViewConstants.RADIUS, 0);
        viewGroup.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = viewGroup.getMeasuredHeight();
        viewGroup.getMeasuredWidth();
        if (measuredHeight <= i2 * 0.7d && this.proactiveInappNotification.type != com.helpshift.proactive.InAppViewConstants.InAppNotificationType.MODAL) {
            com.helpshift.proactive.InAppViewUtil.addMarginToView((android.view.ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams(), viewGroup, jSONObject);
            return viewGroup;
        }
        android.widget.ScrollView scrollView = new android.widget.ScrollView(context);
        scrollView.setClipToPadding(false);
        scrollView.setOverScrollMode(1);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams((com.helpshift.util.ViewUtil.isDeviceInLandscape(this.inAppParentLayoutView.getContext()) || com.helpshift.util.ViewUtil.isTablet(context)) ? -2 : -1, java.lang.Math.min((int) (i2 * 0.7f), measuredHeight));
        com.helpshift.proactive.InAppViewUtil.addMarginToView(layoutParams, scrollView, jSONObject);
        layoutParams.width -= layoutParams.leftMargin + layoutParams.rightMargin;
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setCornerRadius(com.helpshift.util.ViewUtil.dpToPx(context, optInt));
        scrollView.setBackground(gradientDrawable);
        scrollView.setLayoutParams(layoutParams);
        scrollView.addView(viewGroup);
        return scrollView;
    }

    private org.json.JSONObject getInAppChildViewData(android.content.Context context, org.json.JSONObject jSONObject) {
        if (!jSONObject.has("landscape")) {
            return jSONObject.optJSONObject("portrait");
        }
        if (com.helpshift.util.ViewUtil.isDeviceInLandscape(context)) {
            return jSONObject.optJSONObject("landscape");
        }
        return jSONObject.optJSONObject("portrait");
    }

    private android.view.View createViewFromJson(android.content.Context context, org.json.JSONObject jSONObject, java.util.Map<java.lang.String, java.io.File> map, boolean z) throws java.lang.Exception {
        com.helpshift.proactive.InAppViewConstants.InAppViewType fromString = com.helpshift.proactive.InAppViewConstants.InAppViewType.fromString(jSONObject.optString("type"));
        boolean optBoolean = jSONObject.optBoolean(com.helpshift.proactive.InAppViewConstants.ANIMATE);
        if (fromString == null) {
            return null;
        }
        int i = com.helpshift.proactive.InAppViewManager.AnonymousClass1.$SwitchMap$com$helpshift$proactive$InAppViewConstants$InAppViewType[fromString.ordinal()];
        if (i == 1) {
            return createLayout(context, jSONObject, map, z);
        }
        if (i == 2) {
            return createTextView(context, jSONObject, map);
        }
        if (i != 3) {
            if (i != 4) {
                return null;
            }
            return createButton(context, jSONObject, map);
        }
        if (optBoolean) {
            return createGifView(context, jSONObject, map);
        }
        return createImageView(context, jSONObject, map);
    }

    /* renamed from: com.helpshift.proactive.InAppViewManager$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$helpshift$proactive$InAppViewConstants$InAppViewType;

        static {
            int[] iArr = new int[com.helpshift.proactive.InAppViewConstants.InAppViewType.values().length];
            $SwitchMap$com$helpshift$proactive$InAppViewConstants$InAppViewType = iArr;
            try {
                iArr[com.helpshift.proactive.InAppViewConstants.InAppViewType.LAYOUT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$helpshift$proactive$InAppViewConstants$InAppViewType[com.helpshift.proactive.InAppViewConstants.InAppViewType.TEXT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$helpshift$proactive$InAppViewConstants$InAppViewType[com.helpshift.proactive.InAppViewConstants.InAppViewType.IMAGE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$helpshift$proactive$InAppViewConstants$InAppViewType[com.helpshift.proactive.InAppViewConstants.InAppViewType.BUTTON.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    private android.view.View createGifView(android.content.Context context, org.json.JSONObject jSONObject, java.util.Map<java.lang.String, java.io.File> map) {
        try {
            com.helpshift.proactive.GifView gifView = new com.helpshift.proactive.GifView(context);
            int resolveDimension = com.helpshift.proactive.InAppViewUtil.resolveDimension(context, jSONObject.optString("height", ""));
            int resolveDimension2 = com.helpshift.proactive.InAppViewUtil.resolveDimension(context, jSONObject.optString("width", ""));
            double optDouble = jSONObject.optDouble(com.helpshift.proactive.InAppViewConstants.WEIGHT, 0.0d);
            java.lang.String optString = jSONObject.optString(com.helpshift.proactive.InAppViewConstants.IMAGE_URL, "");
            int optInt = jSONObject.optInt(com.helpshift.proactive.InAppViewConstants.STROKE_WIDTH, 0);
            double optDouble2 = jSONObject.optDouble("aspectRatio", 1.0d);
            java.lang.String optString2 = jSONObject.optString(com.helpshift.proactive.InAppViewConstants.STROKE_COLOR, "#FF000000");
            java.lang.String optString3 = jSONObject.optString("visibility");
            float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
            com.helpshift.proactive.GifView.ScaleType scaleTypeForGif = com.helpshift.proactive.InAppViewUtil.getScaleTypeForGif(jSONObject.optString(com.helpshift.proactive.InAppViewConstants.SCALE_TYPE));
            if (com.helpshift.util.Utils.isEmpty(optString)) {
                return null;
            }
            gifView.setGif(map.get(optString));
            gifView.setStroke(optInt, optString2);
            gifView.setAspectRatio((float) optDouble2);
            gifView.setScaleType(scaleTypeForGif);
            if (com.helpshift.proactive.InAppViewUtil.parseRadii(gifView.getContext(), jSONObject.optJSONArray(com.helpshift.proactive.InAppViewConstants.RADII), fArr)) {
                gifView.setCornerRadius(fArr);
            }
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(resolveDimension2, resolveDimension, (float) optDouble);
            com.helpshift.proactive.InAppViewUtil.addPaddingToView(gifView, jSONObject);
            com.helpshift.proactive.InAppViewUtil.addMarginToView(layoutParams, gifView, jSONObject);
            com.helpshift.proactive.InAppViewUtil.setMinWidthAndHeight(gifView, jSONObject);
            com.helpshift.proactive.InAppViewUtil.setVisibilityForView(gifView, optString3);
            try {
                setClickActionListener(gifView, jSONObject, false, false);
                layoutParams.gravity = com.helpshift.proactive.InAppViewUtil.getGravity(jSONObject.optString(com.helpshift.proactive.InAppViewConstants.GRAVITY));
                gifView.setLayoutParams(layoutParams);
                return gifView;
            } catch (java.lang.Exception e) {
                e = e;
                com.helpshift.log.HSLogger.e(TAG, "Error in creating GIF view", e);
                return null;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
        }
    }

    private android.widget.TextView createTextView(android.content.Context context, org.json.JSONObject jSONObject, java.util.Map<java.lang.String, java.io.File> map) {
        try {
            android.widget.TextView textView = new android.widget.TextView(context);
            java.lang.String optString = jSONObject.optString("text");
            int resolveDimension = com.helpshift.proactive.InAppViewUtil.resolveDimension(context, jSONObject.optString("height"));
            int resolveDimension2 = com.helpshift.proactive.InAppViewUtil.resolveDimension(context, jSONObject.optString("width"));
            double optDouble = jSONObject.optDouble(com.helpshift.proactive.InAppViewConstants.WEIGHT, 0.0d);
            java.lang.String optString2 = jSONObject.optString("visibility");
            java.lang.String optString3 = jSONObject.optString(com.helpshift.proactive.InAppViewConstants.TEXT_ALIGNMENT);
            textView.setText(android.text.Html.fromHtml(optString));
            textView.setGravity(com.helpshift.proactive.InAppViewUtil.getGravity(jSONObject.optString(com.helpshift.proactive.InAppViewConstants.GRAVITY)));
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(resolveDimension2, resolveDimension);
            layoutParams.weight = (float) optDouble;
            com.helpshift.proactive.InAppViewUtil.setMaxWidthAndHeight(textView, jSONObject);
            com.helpshift.proactive.InAppViewUtil.applyFontsToText(textView, optString, this.proactiveInappNotification, map);
            com.helpshift.proactive.InAppViewUtil.addMarginToView(layoutParams, textView, jSONObject);
            com.helpshift.proactive.InAppViewUtil.addPaddingToView(textView, jSONObject);
            com.helpshift.proactive.InAppViewUtil.setTextAlignment(textView, optString3);
            setBackgroundProperty(textView, jSONObject, false);
            makeTextViewScrollable(textView, jSONObject);
            com.helpshift.proactive.InAppViewUtil.setMinWidthAndHeight(textView, jSONObject);
            com.helpshift.proactive.InAppViewUtil.setVisibilityForView(textView, optString2);
            setFontColorAndSize(textView, jSONObject);
            setClickActionListener(textView, jSONObject, false, false);
            textView.setLayoutParams(layoutParams);
            return textView;
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in creating text view", e);
            return null;
        }
    }

    private void makeTextViewScrollable(final android.widget.TextView textView, org.json.JSONObject jSONObject) {
        try {
            textView.setMaxLines(jSONObject.optInt(com.helpshift.proactive.InAppViewConstants.MAX_LINES, 5));
            textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
            if (com.helpshift.proactive.InAppViewConstants.SCROLL.equalsIgnoreCase(jSONObject.optString(com.helpshift.proactive.InAppViewConstants.OVERFLOW, com.helpshift.proactive.InAppViewConstants.ELLIPSIZE))) {
                final float[] fArr = {0.0f};
                final float[] fArr2 = {0.0f};
                final boolean[] zArr = {false};
                textView.setMovementMethod(new android.text.method.ScrollingMovementMethod());
                textView.setOnTouchListener(new com.helpshift.util.SafeWrappedTouchListener(new android.view.View.OnTouchListener() { // from class: com.helpshift.proactive.InAppViewManager$$ExternalSyntheticLambda7
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                        return com.helpshift.proactive.InAppViewManager.lambda$makeTextViewScrollable$12(fArr2, fArr, zArr, textView, view, motionEvent);
                    }
                }));
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in making text scrollable", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r0 != 3) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ boolean lambda$makeTextViewScrollable$12(float[] fArr, float[] fArr2, boolean[] zArr, android.widget.TextView textView, android.view.View view, android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int scaledTouchSlop = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        if (action == 0) {
            float y = motionEvent.getY();
            fArr[0] = y;
            fArr2[0] = y;
            zArr[0] = false;
        } else {
            if (action != 1) {
                if (action == 2) {
                    float y2 = motionEvent.getY();
                    float f = y2 - fArr2[0];
                    view.getParent().requestDisallowInterceptTouchEvent(!((!textView.canScrollVertically(-1) && f > 0.0f) || (!textView.canScrollVertically(1) && f < 0.0f)));
                    fArr2[0] = y2;
                }
            }
            view.getParent().requestDisallowInterceptTouchEvent(false);
            return java.lang.Math.abs(motionEvent.getY() - fArr[0]) <= ((float) scaledTouchSlop) && !zArr[0] && !view.hasOnClickListeners() && com.helpshift.util.ViewUtil.performAncestorClick(view);
        }
        return false;
    }

    private void setFontColorAndSize(android.widget.TextView textView, org.json.JSONObject jSONObject) {
        try {
            textView.setTextColor(android.graphics.Color.parseColor(jSONObject.optString(com.helpshift.proactive.InAppViewConstants.TEXT_COLOR, "#FF000000")));
            textView.setTextSize((float) jSONObject.optDouble("fontSize"));
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in setting font color and size", e);
        }
    }

    private com.helpshift.proactive.InAppImageView createImageView(android.content.Context context, org.json.JSONObject jSONObject, java.util.Map<java.lang.String, java.io.File> map) {
        com.helpshift.proactive.InAppImageView inAppImageView;
        int resolveDimension;
        int resolveDimension2;
        double optDouble;
        android.widget.ImageView.ScaleType scaleTypeForImage;
        double optDouble2;
        int dpToPx;
        int parseColor;
        float[] fArr;
        java.lang.String optString;
        java.lang.String optString2;
        try {
            inAppImageView = new com.helpshift.proactive.InAppImageView(context);
            resolveDimension = com.helpshift.proactive.InAppViewUtil.resolveDimension(context, jSONObject.optString("height", ""));
            resolveDimension2 = com.helpshift.proactive.InAppViewUtil.resolveDimension(context, jSONObject.optString("width", ""));
            optDouble = jSONObject.optDouble(com.helpshift.proactive.InAppViewConstants.WEIGHT, 0.0d);
            scaleTypeForImage = com.helpshift.proactive.InAppViewUtil.getScaleTypeForImage(jSONObject.optString(com.helpshift.proactive.InAppViewConstants.SCALE_TYPE));
            optDouble2 = jSONObject.optDouble("aspectRatio", 1.0d);
            dpToPx = com.helpshift.util.ViewUtil.dpToPx(inAppImageView.getContext(), jSONObject.optInt(com.helpshift.proactive.InAppViewConstants.STROKE_WIDTH, 0));
            parseColor = android.graphics.Color.parseColor(jSONObject.optString(com.helpshift.proactive.InAppViewConstants.STROKE_COLOR, "#FF000000"));
            fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
            optString = jSONObject.optString("visibility");
            optString2 = jSONObject.optString(com.helpshift.proactive.InAppViewConstants.IMAGE_URL);
        } catch (java.lang.Exception e) {
            e = e;
        }
        try {
            android.graphics.Bitmap bitmapForImage = com.helpshift.proactive.InAppViewUtil.getBitmapForImage(inAppImageView.getContext(), this.hsPersistentStorage, optString2, map);
            if (com.helpshift.util.Utils.isEmpty(optString2)) {
                return null;
            }
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(resolveDimension2, resolveDimension);
            layoutParams.weight = (float) optDouble;
            layoutParams.gravity = com.helpshift.proactive.InAppViewUtil.getGravity(jSONObject.optString(com.helpshift.proactive.InAppViewConstants.GRAVITY));
            com.helpshift.proactive.InAppViewUtil.addMarginToView(layoutParams, inAppImageView, jSONObject);
            com.helpshift.proactive.InAppViewUtil.addPaddingToView(inAppImageView, jSONObject);
            inAppImageView.setScaleType(scaleTypeForImage);
            inAppImageView.setImageBitmap(bitmapForImage);
            inAppImageView.setAspectRatio((float) optDouble2);
            inAppImageView.setLayoutParams(layoutParams);
            inAppImageView.setClipToOutline(true);
            inAppImageView.setStroke(parseColor, dpToPx);
            inAppImageView.setBitmap(bitmapForImage);
            com.helpshift.proactive.InAppViewUtil.setVisibilityForView(inAppImageView, optString);
            com.helpshift.proactive.InAppViewUtil.setMaxWidthAndHeight(inAppImageView, jSONObject);
            com.helpshift.proactive.InAppViewUtil.setMinWidthAndHeight(inAppImageView, jSONObject);
            if (com.helpshift.proactive.InAppViewUtil.parseRadii(inAppImageView.getContext(), jSONObject.optJSONArray(com.helpshift.proactive.InAppViewConstants.RADII), fArr)) {
                inAppImageView.setCornerRadius(fArr);
            }
            setClickActionListener(inAppImageView, jSONObject, false, false);
            return inAppImageView;
        } catch (java.lang.Exception e2) {
            e = e2;
            com.helpshift.log.HSLogger.e(TAG, "Error in creating image view", e);
            return null;
        }
    }

    private android.widget.Button createButton(android.content.Context context, org.json.JSONObject jSONObject, java.util.Map<java.lang.String, java.io.File> map) {
        try {
            android.widget.Button button = new android.widget.Button(context);
            java.lang.String optString = jSONObject.optString("text");
            int resolveDimension = com.helpshift.proactive.InAppViewUtil.resolveDimension(context, jSONObject.optString("height"));
            int resolveDimension2 = com.helpshift.proactive.InAppViewUtil.resolveDimension(context, jSONObject.optString("width"));
            double optDouble = jSONObject.optDouble(com.helpshift.proactive.InAppViewConstants.WEIGHT, 0.0d);
            java.lang.String optString2 = jSONObject.optString("visibility");
            java.lang.String optString3 = jSONObject.optString(com.helpshift.proactive.InAppViewConstants.TEXT_ALIGNMENT);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(resolveDimension2, resolveDimension);
            layoutParams.weight = (float) optDouble;
            button.setText(android.text.Html.fromHtml(optString));
            com.helpshift.proactive.InAppViewUtil.setMaxWidthAndHeight(button, jSONObject);
            com.helpshift.proactive.InAppViewUtil.addMarginToView(layoutParams, button, jSONObject);
            com.helpshift.proactive.InAppViewUtil.addPaddingToView(button, jSONObject);
            com.helpshift.proactive.InAppViewUtil.setTextAlignment(button, optString3);
            setBackgroundProperty(button, jSONObject, false);
            setFontColorAndSize(button, jSONObject);
            com.helpshift.proactive.InAppViewUtil.setVisibilityForView(button, optString2);
            com.helpshift.proactive.InAppViewUtil.applyFontsToText(button, optString, this.proactiveInappNotification, map);
            setClickActionListener(button, jSONObject, true, false);
            com.helpshift.proactive.InAppViewUtil.setMinWidthAndHeight(button, jSONObject);
            button.setGravity(com.helpshift.proactive.InAppViewUtil.getGravity(jSONObject.optString(com.helpshift.proactive.InAppViewConstants.GRAVITY)));
            button.setLayoutParams(layoutParams);
            button.setAllCaps(false);
            return button;
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in creating button view", e);
            return null;
        }
    }

    private android.widget.LinearLayout createLayout(final android.content.Context context, org.json.JSONObject jSONObject, java.util.Map<java.lang.String, java.io.File> map, boolean z) throws java.lang.Exception {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        try {
            int resolveDimension = com.helpshift.proactive.InAppViewUtil.resolveDimension(context, jSONObject.optString("height", ""), jSONObject.optString(com.helpshift.proactive.InAppViewConstants.TAB_HEIGHT, ""));
            int resolveDimension2 = com.helpshift.proactive.InAppViewUtil.resolveDimension(context, jSONObject.optString("width", ""), jSONObject.optString(com.helpshift.proactive.InAppViewConstants.TAB_WIDTH, ""));
            double optDouble = jSONObject.optDouble(com.helpshift.proactive.InAppViewConstants.WEIGHT, 0.0d);
            java.lang.String optString = jSONObject.optString("visibility");
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(resolveDimension2, resolveDimension, (float) optDouble);
            if (!z) {
                com.helpshift.proactive.InAppViewUtil.addMarginToView(layoutParams, linearLayout, jSONObject);
            }
            com.helpshift.proactive.InAppViewUtil.addPaddingToView(linearLayout, jSONObject);
            com.helpshift.proactive.InAppViewUtil.setMinWidthAndHeight(linearLayout, jSONObject);
            setBackgroundProperty(linearLayout, jSONObject, z);
            setLayoutOrientation(linearLayout, jSONObject);
            setClickActionListener(linearLayout, jSONObject, !z, z);
            com.helpshift.proactive.InAppViewUtil.setVisibilityForView(linearLayout, optString);
            com.helpshift.proactive.InAppViewUtil.setImageForLayout(this.hsPersistentStorage, linearLayout, jSONObject, map, resolveDimension2, resolveDimension, new com.helpshift.proactive.OnGlobalLayoutCallback() { // from class: com.helpshift.proactive.InAppViewManager$$ExternalSyntheticLambda0
                @Override // com.helpshift.proactive.OnGlobalLayoutCallback
                public final void onSuccess(int i, int i2) {
                    com.helpshift.proactive.InAppViewManager.this.m5688lambda$createLayout$13$comhelpshiftproactiveInAppViewManager(context, i, i2);
                }
            });
            linearLayout.setGravity(com.helpshift.proactive.InAppViewUtil.getGravity(jSONObject.optString(com.helpshift.proactive.InAppViewConstants.GRAVITY)));
            if (jSONObject.has(com.helpshift.proactive.InAppViewConstants.CHILDREN)) {
                org.json.JSONArray jSONArray = jSONObject.getJSONArray(com.helpshift.proactive.InAppViewConstants.CHILDREN);
                for (int i = 0; i < jSONArray.length(); i++) {
                    android.view.View createViewFromJson = createViewFromJson(context, jSONArray.getJSONObject(i), map, false);
                    if (createViewFromJson != null) {
                        linearLayout.addView(createViewFromJson);
                    }
                }
            }
            linearLayout.setLayoutParams(layoutParams);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in creating layout", e);
            if (z) {
                throw e;
            }
        }
        return linearLayout;
    }

    /* renamed from: lambda$createLayout$13$com-helpshift-proactive-InAppViewManager, reason: not valid java name */
    /* synthetic */ void m5688lambda$createLayout$13$comhelpshiftproactiveInAppViewManager(android.content.Context context, int i, int i2) {
        com.helpshift.util.SafeWrapOnGlobalLayout safeWrapOnGlobalLayout;
        android.view.ViewGroup.LayoutParams layoutParams = this.scrollView.getLayoutParams();
        int i3 = context.getResources().getDisplayMetrics().heightPixels;
        if (layoutParams != null && this.scrollView != null) {
            layoutParams.height = java.lang.Math.min((int) (i3 * 0.7f), i2);
            this.scrollView.setLayoutParams(layoutParams);
        }
        android.view.ViewGroup viewGroup = this.inAppParentLayoutView;
        if (viewGroup == null || (safeWrapOnGlobalLayout = (com.helpshift.util.SafeWrapOnGlobalLayout) viewGroup.getTag()) == null) {
            return;
        }
        this.inAppParentLayoutView.getViewTreeObserver().removeOnGlobalLayoutListener(safeWrapOnGlobalLayout);
    }

    private void setLayoutOrientation(android.widget.LinearLayout linearLayout, org.json.JSONObject jSONObject) {
        try {
            if (!jSONObject.has("orientation")) {
                linearLayout.setOrientation(1);
            } else if (com.helpshift.proactive.InAppViewConstants.ORIENTATION_HORIZONTAL.equalsIgnoreCase(jSONObject.optString("orientation"))) {
                linearLayout.setOrientation(0);
            } else {
                linearLayout.setOrientation(1);
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in setting orientation", e);
        }
    }

    private void setBackgroundProperty(android.view.View view, org.json.JSONObject jSONObject, boolean z) {
        try {
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            if (jSONObject.has(com.helpshift.proactive.InAppViewConstants.BACKGROUND) || z) {
                gradientDrawable.setColor(android.graphics.Color.parseColor(jSONObject.optString(com.helpshift.proactive.InAppViewConstants.BACKGROUND, "#FFFFFF")));
            }
            gradientDrawable.setCornerRadius(com.helpshift.util.ViewUtil.dpToPx(view.getContext(), jSONObject.optInt(com.helpshift.proactive.InAppViewConstants.RADIUS, 0)));
            gradientDrawable.setStroke(jSONObject.optInt(com.helpshift.proactive.InAppViewConstants.STROKE_WIDTH, 0), android.graphics.Color.parseColor(jSONObject.optString(com.helpshift.proactive.InAppViewConstants.STROKE_COLOR, "#000000")));
            view.setBackground(gradientDrawable);
        } catch (java.lang.Exception e) {
            view.setBackgroundColor(android.graphics.Color.parseColor("#FFFFFF"));
            com.helpshift.log.HSLogger.e(TAG, "Error in setting background property", e);
        }
    }

    private void addBackButtonHandling(android.view.ViewGroup viewGroup) {
        if (this.proactiveInappNotification.type != com.helpshift.proactive.InAppViewConstants.InAppNotificationType.MODAL) {
            return;
        }
        try {
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                this.backInvokedCallback = new android.window.OnBackInvokedCallback() { // from class: com.helpshift.proactive.InAppViewManager$$ExternalSyntheticLambda2
                    @Override // android.window.OnBackInvokedCallback
                    public final void onBackInvoked() {
                        com.helpshift.proactive.InAppViewManager.this.m5685xf3b9e3fd();
                    }
                };
                this.currentActivity.getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.backInvokedCallback);
            } else {
                viewGroup.setFocusableInTouchMode(true);
                viewGroup.setFocusable(true);
                viewGroup.requestFocus();
                viewGroup.setOnKeyListener(new android.view.View.OnKeyListener() { // from class: com.helpshift.proactive.InAppViewManager$$ExternalSyntheticLambda3
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(android.view.View view, int i, android.view.KeyEvent keyEvent) {
                        return com.helpshift.proactive.InAppViewManager.this.m5686xfb1f191c(view, i, keyEvent);
                    }
                });
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in adding back button handling", e);
        }
    }

    /* renamed from: lambda$addBackButtonHandling$14$com-helpshift-proactive-InAppViewManager, reason: not valid java name */
    /* synthetic */ void m5685xf3b9e3fd() {
        if (isInAppDisplayed()) {
            dismissInAppWithAnimation(this.proactiveInappNotification.type, this.proactiveInappNotification.position, com.helpshift.proactive.ProactiveInAppDismissType.NAVIGATE);
            return;
        }
        android.app.Activity activity = this.currentActivity;
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* renamed from: lambda$addBackButtonHandling$15$com-helpshift-proactive-InAppViewManager, reason: not valid java name */
    /* synthetic */ boolean m5686xfb1f191c(android.view.View view, int i, android.view.KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1 || !isInAppDisplayed()) {
            return false;
        }
        dismissInAppWithAnimation(this.proactiveInappNotification.type, this.proactiveInappNotification.position, com.helpshift.proactive.ProactiveInAppDismissType.NAVIGATE);
        return true;
    }

    public void onAppResumed(android.app.Activity activity, boolean z) {
        try {
            android.app.Activity activity2 = this.currentActivity;
            boolean z2 = (activity2 == null || activity2 == activity) ? false : true;
            this.currentActivity = activity;
            if (isInAppDisplayed()) {
                if (z) {
                    closeInAppNotification(false);
                    showNotificationInternal(true);
                } else if (z2) {
                    m5691x5aa2ca1e(com.helpshift.proactive.ProactiveInAppDismissType.NAVIGATE);
                }
                if (this.proactiveInappNotification != null) {
                    com.helpshift.log.HSLogger.d(TAG, "In-app is currently displayed, id " + com.helpshift.util.Utils.getMaskedString(this.proactiveInappNotification.notificationId));
                }
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error on activity resumed", e);
        }
    }

    public void onAppStopped() {
        if (isInAppDisplayed()) {
            m5691x5aa2ca1e(com.helpshift.proactive.ProactiveInAppDismissType.NAVIGATE);
        }
        this.currentActivity = null;
    }

    public boolean isInAppDisplayed() {
        return this.proactiveInappNotification != null;
    }

    public void closeInAppNotification(boolean z) {
        try {
            com.helpshift.log.HSLogger.d(TAG, "Closing in-app notification");
            if (this.currentActivity != null && android.os.Build.VERSION.SDK_INT >= 33 && this.backInvokedCallback != null) {
                this.currentActivity.getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.backInvokedCallback);
            }
            android.view.ViewGroup viewGroup = this.inAppParentLayoutView;
            if (viewGroup != null) {
                com.helpshift.util.SafeWrapOnGlobalLayout safeWrapOnGlobalLayout = (com.helpshift.util.SafeWrapOnGlobalLayout) viewGroup.getTag();
                if (safeWrapOnGlobalLayout != null) {
                    this.inAppParentLayoutView.getViewTreeObserver().removeOnGlobalLayoutListener(safeWrapOnGlobalLayout);
                }
                java.lang.Runnable runnable = this.autoDismissRunnable;
                if (runnable != null) {
                    this.inAppParentLayoutView.removeCallbacks(runnable);
                    this.autoDismissRunnable = null;
                }
            }
            android.view.ViewGroup viewGroup2 = this.decorView;
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.overlayView);
            }
            if (z) {
                this.proactiveInappNotification = null;
            }
            this.inAppParentLayoutView = null;
            this.overlayView = null;
            this.rootView = null;
            this.scrollView = null;
            this.decorView = null;
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in closing in-app notification", e);
        }
    }
}
