package com.knotapi.knot;

/* loaded from: classes9.dex */
public class Knot {
    private static volatile com.knotapi.knot.Knot INSTANCE;
    private java.lang.String clientId;
    private android.content.Context context;
    private com.knotapi.knot.models.CustomerConfiguration customerConfiguration;
    private java.lang.String[] domainUrls;
    private java.lang.String entryPoint;
    private com.knotapi.knot.models.Environment environment;
    private com.knotapi.knot.interfaces.KnotEventDelegate knotEventDelegate;
    private int[] merchantIds;
    private java.lang.ref.WeakReference<android.app.Activity> openedActivityRef = null;
    private java.lang.String sessionId;
    private java.lang.Boolean useCategories;
    private java.lang.Boolean useSearch;

    public enum Product {
        card_switcher,
        transaction_link,
        link
    }

    private void cleanupReferences() {
        this.knotEventDelegate = null;
        this.context = null;
        this.environment = null;
        this.clientId = null;
        this.sessionId = null;
        this.merchantIds = null;
        this.useCategories = null;
        this.useSearch = null;
        this.domainUrls = null;
        this.entryPoint = null;
        this.customerConfiguration = null;
    }

    public static void close() {
        if (INSTANCE != null) {
            INSTANCE.onCloseSession();
        }
    }

    private android.content.Intent createIntent() {
        android.content.Intent intent = new android.content.Intent(this.context, (java.lang.Class<?>) com.knotapi.knot.ui.activities.KnotActivity.class);
        intent.putExtra("environment", this.environment);
        intent.putExtra("clientId", this.clientId);
        intent.putExtra("sessionId", this.sessionId);
        intent.putExtra("merchantIds", this.merchantIds);
        intent.putExtra("useCategories", this.useCategories);
        intent.putExtra("useSearch", this.useSearch);
        intent.putExtra("domainUrls", this.domainUrls);
        intent.putExtra("entryPoint", this.entryPoint);
        intent.putExtra("customerConfiguration", this.customerConfiguration);
        return intent;
    }

    private void finishActivity() {
        java.lang.ref.WeakReference<android.app.Activity> weakReference = this.openedActivityRef;
        if (weakReference != null) {
            android.app.Activity activity = weakReference.get();
            if (activity != null && !activity.isFinishing()) {
                try {
                    activity.finish();
                } catch (java.lang.Exception e) {
                    com.knotapi.knot.services.ErrorReporter.report(e, "onCloseSession - activity.finish()");
                }
            }
            this.openedActivityRef = null;
        }
    }

    public static com.knotapi.knot.Knot getInstance() {
        if (INSTANCE == null) {
            synchronized (com.knotapi.knot.Knot.class) {
                if (INSTANCE == null) {
                    INSTANCE = new com.knotapi.knot.Knot();
                }
            }
        }
        return INSTANCE;
    }

    public static java.lang.String getSdkVersion() {
        return com.knotapi.knot.BuildConfig.VERSION_NAME;
    }

    private void notifyDelegate() {
        com.knotapi.knot.interfaces.KnotEventDelegate knotEventDelegate = this.knotEventDelegate;
        if (knotEventDelegate != null) {
            try {
                knotEventDelegate.onExit();
            } catch (java.lang.Exception e) {
                com.knotapi.knot.services.ErrorReporter.report(e, "onCloseSession - KnotEventDelegate.onExit");
            }
        }
    }

    public static void open(android.content.Context context, com.knotapi.knot.models.KnotConfiguration knotConfiguration, com.knotapi.knot.interfaces.KnotEventDelegate knotEventDelegate) {
        getInstance().openSessionType(context, knotConfiguration, knotEventDelegate);
    }

    private void trackAnalytics(android.content.Intent intent) {
        com.knotapi.knot.services.AnalyticsManager analyticsManager = com.knotapi.knot.services.AnalyticsManager.getInstance(this.environment);
        if (analyticsManager == null) {
            com.knotapi.knot.services.ErrorReporter.report(new java.lang.IllegalArgumentException("AnalyticsManager instance is null."), "Analytics Initialization for Tracking");
            return;
        }
        analyticsManager.identifyAndTrackOpen(this.sessionId);
        java.lang.String str = this.sessionId;
        java.lang.Boolean bool = this.useSearch;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        java.lang.Boolean bool2 = this.useCategories;
        analyticsManager.trackSDKOpened(str, intent, booleanValue, bool2 != null ? bool2.booleanValue() : true, this.merchantIds);
    }

    private void trackClosureEvent() {
        com.knotapi.knot.services.AnalyticsManager analyticsManager = com.knotapi.knot.services.AnalyticsManager.getInstance(this.environment);
        if (analyticsManager == null) {
            com.knotapi.knot.services.ErrorReporter.report(new java.lang.IllegalArgumentException("AnalyticsManager instance is null."), "onCloseSession - AnalyticsManager");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME);
        hashMap.put("sdk_version", com.knotapi.knot.BuildConfig.VERSION_NAME);
        analyticsManager.trackEvent("SDK Closed using onClose()", this.sessionId, new java.util.HashMap(), hashMap);
    }

    public com.knotapi.knot.interfaces.KnotEventDelegate getKnotEventDelegateListener() {
        return this.knotEventDelegate;
    }

    public void onCloseSession() {
        try {
            trackClosureEvent();
            notifyDelegate();
            finishActivity();
            cleanupReferences();
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "onCloseSession");
        }
    }

    public void openProduct(android.content.Context context) {
        try {
            android.content.Intent createIntent = createIntent();
            boolean z = context instanceof android.app.Activity;
            if (!z) {
                createIntent.addFlags(268435456);
            }
            context.startActivity(createIntent);
            if (z) {
                this.openedActivityRef = new java.lang.ref.WeakReference<>((android.app.Activity) context);
            }
            trackAnalytics(createIntent);
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "openProduct");
        }
    }

    public void openSessionType(android.content.Context context, com.knotapi.knot.models.KnotConfiguration knotConfiguration, com.knotapi.knot.interfaces.KnotEventDelegate knotEventDelegate) {
        try {
            if (context == null) {
                throw new java.lang.IllegalArgumentException("Context cannot be null.");
            }
            if (knotConfiguration == null) {
                throw new java.lang.IllegalArgumentException("Configuration cannot be null.");
            }
            this.context = context.getApplicationContext();
            this.environment = knotConfiguration.getEnvironment();
            this.clientId = knotConfiguration.getClientId();
            this.sessionId = knotConfiguration.getSessionId();
            this.knotEventDelegate = knotEventDelegate;
            this.merchantIds = knotConfiguration.getMerchantIds() != null ? knotConfiguration.getMerchantIds() : new int[0];
            this.useCategories = java.lang.Boolean.valueOf(knotConfiguration.getUseCategories() != null ? knotConfiguration.getUseCategories().booleanValue() : true);
            this.useSearch = java.lang.Boolean.valueOf(knotConfiguration.getUseSearch() != null ? knotConfiguration.getUseSearch().booleanValue() : true);
            this.domainUrls = knotConfiguration.getDomainUrls();
            this.entryPoint = knotConfiguration.getEntryPoint();
            this.customerConfiguration = knotConfiguration.getCustomerConfiguration();
            if (com.knotapi.knot.services.AnalyticsManager.getInstance(this.environment) == null) {
                com.knotapi.knot.services.ErrorReporter.report(new java.lang.IllegalArgumentException("AnalyticsManager instance is null."), "AnalyticsManager Initialization");
            }
            openProduct(context);
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "openSession");
        }
    }

    public void registerOpenedActivity(android.app.Activity activity) {
        if (activity != null) {
            this.openedActivityRef = new java.lang.ref.WeakReference<>(activity);
        }
    }
}
