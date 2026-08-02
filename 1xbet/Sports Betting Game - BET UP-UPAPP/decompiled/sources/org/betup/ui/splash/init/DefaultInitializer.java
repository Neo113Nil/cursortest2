package org.betup.ui.splash.init;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import org.betup.R;
import org.betup.model.domain.RemoteConfigConstants;
import org.betup.services.analytics.FirebaseAnalyticsHelper;
import org.betup.ui.splash.init.DefaultInitializer;
import org.betup.utils.ConnectionUtil;

/* loaded from: classes4.dex */
public class DefaultInitializer implements Initializer, DynamicLinkListener, ConfigFetchListener {
    private Activity activity;
    private DynamicLinkProcessor dynamicLinkProcessor;
    private FirebaseAuth firebaseAuth;
    private InitializationListener initializationListener;

    @Override // org.betup.ui.splash.init.Initializer
    public void init() {
        setupConfig(this);
    }

    public DefaultInitializer(Activity activity, FirebaseAuth firebaseAuth, InitializationListener initializationListener) {
        this.activity = activity;
        this.initializationListener = initializationListener;
        this.firebaseAuth = firebaseAuth;
        this.dynamicLinkProcessor = new DefaultDynamicLinkProcessor(activity);
    }

    @Override // org.betup.ui.splash.init.ConfigFetchListener
    public void configFetched(boolean success) {
        if (isActivityActive()) {
            long j = FirebaseRemoteConfig.getInstance().getLong(RemoteConfigConstants.MIN_ANDROID_VERSION);
            boolean checkConnection = ConnectionUtil.checkConnection(this.activity);
            if (success && checkConnection) {
                if (j <= 3606) {
                    this.dynamicLinkProcessor.processDynamicLinks(this);
                    return;
                } else {
                    this.initializationListener.initForceUpdate();
                    return;
                }
            }
            if (!checkConnection) {
                Log.d("INETERROR", "CAN NOT FETCH CONFIG " + ConnectionUtil.checkConnection(this.activity));
                this.initializationListener.initInetError();
            } else {
                FirebaseAnalyticsHelper.logPlayServicesError(this.activity, "cannot fetch config");
                this.initializationListener.initPlayServicesError();
            }
        }
    }

    @Override // org.betup.ui.splash.init.DynamicLinkListener
    public void linkProcessed() {
        if (isActivityActive()) {
            if (this.firebaseAuth.getCurrentUser() != null) {
                this.initializationListener.initSuccess(true, false);
            } else {
                this.initializationListener.initSuccess(false, false);
            }
        }
    }

    private void setupConfig(final ConfigFetchListener listener) {
        if (isActivityActive()) {
            int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.activity);
            final FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
            if (isGooglePlayServicesAvailable == 0) {
                Log.d("VERSIONTEST", "ARE PLAY SERVICES AVAILABLE = " + isGooglePlayServicesAvailable);
                final FirebaseRemoteConfigSettings build = new FirebaseRemoteConfigSettings.Builder().build();
                firebaseRemoteConfig.setDefaultsAsync(R.xml.defaults).addOnCompleteListener(new OnCompleteListener() { // from class: org.betup.ui.splash.init.DefaultInitializer$$ExternalSyntheticLambda1
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        DefaultInitializer.this.m14334lambda$setupConfig$2$orgbetupuisplashinitDefaultInitializer(firebaseRemoteConfig, build, listener, task);
                    }
                });
            } else {
                FirebaseAnalyticsHelper.logPlayServicesError(this.activity, "play services unavailable, continuing without google auth");
                Log.w("VERSIONTEST", "Play Services unavailable during init, using defaults and continuing auth flow");
                firebaseRemoteConfig.setDefaultsAsync(R.xml.defaults).addOnCompleteListener(new OnCompleteListener() { // from class: org.betup.ui.splash.init.DefaultInitializer$$ExternalSyntheticLambda0
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        ConfigFetchListener.this.configFetched(true);
                    }
                });
            }
        }
    }

    /* renamed from: lambda$setupConfig$2$org-betup-ui-splash-init-DefaultInitializer, reason: not valid java name */
    /* synthetic */ void m14334lambda$setupConfig$2$orgbetupuisplashinitDefaultInitializer(final FirebaseRemoteConfig firebaseRemoteConfig, FirebaseRemoteConfigSettings firebaseRemoteConfigSettings, final ConfigFetchListener configFetchListener, Task task) {
        if (isActivityActive()) {
            firebaseRemoteConfig.setConfigSettingsAsync(firebaseRemoteConfigSettings).addOnCompleteListener(new OnCompleteListener() { // from class: org.betup.ui.splash.init.DefaultInitializer$$ExternalSyntheticLambda2
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    DefaultInitializer.this.m14333lambda$setupConfig$1$orgbetupuisplashinitDefaultInitializer(firebaseRemoteConfig, configFetchListener, task2);
                }
            });
        }
    }

    /* renamed from: lambda$setupConfig$1$org-betup-ui-splash-init-DefaultInitializer, reason: not valid java name */
    /* synthetic */ void m14333lambda$setupConfig$1$orgbetupuisplashinitDefaultInitializer(FirebaseRemoteConfig firebaseRemoteConfig, ConfigFetchListener configFetchListener, Task task) {
        if (isActivityActive()) {
            firebaseRemoteConfig.fetch(60000L).addOnCompleteListener(new AnonymousClass1(firebaseRemoteConfig, configFetchListener));
        }
    }

    /* renamed from: org.betup.ui.splash.init.DefaultInitializer$1, reason: invalid class name */
    class AnonymousClass1 implements OnCompleteListener<Void> {
        final /* synthetic */ ConfigFetchListener val$listener;
        final /* synthetic */ FirebaseRemoteConfig val$mFirebaseRemoteConfig;

        AnonymousClass1(final FirebaseRemoteConfig val$mFirebaseRemoteConfig, final ConfigFetchListener val$listener) {
            this.val$mFirebaseRemoteConfig = val$mFirebaseRemoteConfig;
            this.val$listener = val$listener;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void onComplete(Task<Void> task) {
            if (DefaultInitializer.this.isActivityActive()) {
                if (task.isSuccessful()) {
                    Task<Boolean> activate = this.val$mFirebaseRemoteConfig.activate();
                    final ConfigFetchListener configFetchListener = this.val$listener;
                    activate.addOnCompleteListener(new OnCompleteListener() { // from class: org.betup.ui.splash.init.DefaultInitializer$1$$ExternalSyntheticLambda0
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final void onComplete(Task task2) {
                            DefaultInitializer.AnonymousClass1.this.m14335x4672ee31(configFetchListener, task2);
                        }
                    });
                    return;
                }
                this.val$listener.configFetched(false);
            }
        }

        /* renamed from: lambda$onComplete$0$org-betup-ui-splash-init-DefaultInitializer$1, reason: not valid java name */
        /* synthetic */ void m14335x4672ee31(ConfigFetchListener configFetchListener, Task task) {
            if (DefaultInitializer.this.isActivityActive()) {
                configFetchListener.configFetched(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isActivityActive() {
        Activity activity = this.activity;
        return (activity == null || activity.isFinishing() || this.activity.isDestroyed()) ? false : true;
    }
}
