package androidx.browser.customtabs;

/* loaded from: classes6.dex */
public abstract class CustomTabsService extends android.app.Service {
    public static final java.lang.String ACTION_CUSTOM_TABS_CONNECTION = "android.support.customtabs.action.CustomTabsService";
    public static final java.lang.String CATEGORY_AUTH_TAB = "androidx.browser.auth.category.AuthTab";
    public static final java.lang.String CATEGORY_COLOR_SCHEME_CUSTOMIZATION = "androidx.browser.customtabs.category.ColorSchemeCustomization";
    public static final java.lang.String CATEGORY_EPHEMERAL_BROWSING = "androidx.browser.customtabs.category.EphemeralBrowsing";
    public static final java.lang.String CATEGORY_NAVBAR_COLOR_CUSTOMIZATION = "androidx.browser.customtabs.category.NavBarColorCustomization";
    public static final java.lang.String CATEGORY_SET_NETWORK = "androidx.browser.customtabs.category.SetNetwork";
    public static final java.lang.String CATEGORY_TRUSTED_WEB_ACTIVITY_IMMERSIVE_MODE = "androidx.browser.trusted.category.ImmersiveMode";
    public static final java.lang.String CATEGORY_WEB_SHARE_TARGET_V2 = "androidx.browser.trusted.category.WebShareTargetV2";
    public static final int FILE_PURPOSE_TRUSTED_WEB_ACTIVITY_SPLASH_IMAGE = 1;
    public static final java.lang.String KEY_SUCCESS = "androidx.browser.customtabs.SUCCESS";
    public static final java.lang.String KEY_URL = "android.support.customtabs.otherurls.URL";
    public static final int RELATION_HANDLE_ALL_URLS = 2;
    public static final int RELATION_USE_AS_ORIGIN = 1;
    public static final int RESULT_FAILURE_DISALLOWED = -1;
    public static final int RESULT_FAILURE_MESSAGING_ERROR = -3;
    public static final int RESULT_FAILURE_REMOTE_ERROR = -2;
    public static final int RESULT_SUCCESS = 0;
    public static final java.lang.String TRUSTED_WEB_ACTIVITY_CATEGORY = "androidx.browser.trusted.category.TrustedWebActivities";
    final androidx.collection.SimpleArrayMap<android.os.IBinder, android.os.IBinder.DeathRecipient> Camera2StreamConfigurationMap = new androidx.collection.SimpleArrayMap<>();
    private android.support.customtabs.ICustomTabsService.Stub getHighSpeedVideoFpsRanges = new androidx.browser.customtabs.CustomTabsService.AnonymousClass1();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface FilePurpose {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Relation {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Result {
    }

    protected abstract android.os.Bundle extraCommand(java.lang.String str, android.os.Bundle bundle);

    protected boolean isEngagementSignalsApiAvailable(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken, android.os.Bundle bundle) {
        return false;
    }

    protected abstract boolean mayLaunchUrl(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken, android.net.Uri uri, android.os.Bundle bundle, java.util.List<android.os.Bundle> list);

    protected abstract boolean newSession(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken);

    protected abstract int postMessage(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken, java.lang.String str, android.os.Bundle bundle);

    protected void prefetch(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken, android.net.Uri uri, androidx.browser.customtabs.PrefetchOptions prefetchOptions) {
    }

    protected void prefetch(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken, java.util.List<android.net.Uri> list, androidx.browser.customtabs.PrefetchOptions prefetchOptions) {
    }

    protected abstract boolean receiveFile(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken, android.net.Uri uri, int i, android.os.Bundle bundle);

    protected boolean registerAuthTabSession(androidx.browser.auth.AuthTabSessionToken authTabSessionToken) {
        return false;
    }

    protected abstract boolean requestPostMessageChannel(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken, android.net.Uri uri);

    protected boolean setEngagementSignalsCallback(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken, androidx.browser.customtabs.EngagementSignalsCallback engagementSignalsCallback, android.os.Bundle bundle) {
        return false;
    }

    protected abstract boolean updateVisuals(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken, android.os.Bundle bundle);

    protected abstract boolean validateRelationship(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken, int i, android.net.Uri uri, android.os.Bundle bundle);

    protected abstract boolean warmup(long j);

    /* renamed from: androidx.browser.customtabs.CustomTabsService$1, reason: invalid class name */
    class AnonymousClass1 extends android.support.customtabs.ICustomTabsService.Stub {
        @Override // android.support.customtabs.ICustomTabsService
        public int getInterfaceVersion() {
            return 1;
        }

        AnonymousClass1() {
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean warmup(long j) {
            return androidx.browser.customtabs.CustomTabsService.this.warmup(j);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSession(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback) {
            return getHighSpeedVideoFpsRangesFor(iCustomTabsCallback, null);
        }

        private boolean getHighSpeedVideoFpsRangesFor(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.app.PendingIntent pendingIntent) {
            final androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken = new androidx.browser.customtabs.CustomTabsSessionToken(iCustomTabsCallback, pendingIntent);
            try {
                android.os.IBinder.DeathRecipient deathRecipient = new android.os.IBinder.DeathRecipient() { // from class: androidx.browser.customtabs.CustomTabsService$1$$ExternalSyntheticLambda2
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        androidx.browser.customtabs.CustomTabsService.AnonymousClass1.this.getHighSpeedVideoSizes(customTabsSessionToken);
                    }
                };
                synchronized (androidx.browser.customtabs.CustomTabsService.this.Camera2StreamConfigurationMap) {
                    iCustomTabsCallback.asBinder().linkToDeath(deathRecipient, 0);
                    androidx.browser.customtabs.CustomTabsService.this.Camera2StreamConfigurationMap.put(iCustomTabsCallback.asBinder(), deathRecipient);
                }
                return androidx.browser.customtabs.CustomTabsService.this.newSession(customTabsSessionToken);
            } catch (android.os.RemoteException unused) {
                return false;
            }
        }

        final /* synthetic */ void getHighSpeedVideoSizes(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken) {
            androidx.browser.customtabs.CustomTabsService.this.cleanUpSession(customTabsSessionToken);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean mayLaunchUrl(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, android.os.Bundle bundle, java.util.List<android.os.Bundle> list) {
            android.app.PendingIntent pendingIntent;
            androidx.browser.customtabs.CustomTabsService customTabsService = androidx.browser.customtabs.CustomTabsService.this;
            if (bundle == null) {
                pendingIntent = null;
            } else {
                android.app.PendingIntent pendingIntent2 = (android.app.PendingIntent) bundle.getParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
                bundle.remove(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
                pendingIntent = pendingIntent2;
            }
            return customTabsService.mayLaunchUrl(new androidx.browser.customtabs.CustomTabsSessionToken(iCustomTabsCallback, pendingIntent), uri, bundle, list);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public void prefetch(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, android.os.Bundle bundle) {
            android.app.PendingIntent pendingIntent;
            java.util.List<android.net.Uri> m;
            androidx.browser.customtabs.CustomTabsService customTabsService = androidx.browser.customtabs.CustomTabsService.this;
            if (bundle == null) {
                pendingIntent = null;
            } else {
                android.app.PendingIntent pendingIntent2 = (android.app.PendingIntent) bundle.getParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
                bundle.remove(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
                pendingIntent = pendingIntent2;
            }
            androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken = new androidx.browser.customtabs.CustomTabsSessionToken(iCustomTabsCallback, pendingIntent);
            m = androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m(new java.lang.Object[]{uri});
            customTabsService.prefetch(customTabsSessionToken, m, androidx.browser.customtabs.PrefetchOptions.getHighResolutionOutputSizeshNQ4ISI(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsService
        public void prefetchWithMultipleUrls(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, java.util.List<android.net.Uri> list, android.os.Bundle bundle) {
            android.app.PendingIntent pendingIntent;
            androidx.browser.customtabs.CustomTabsService customTabsService = androidx.browser.customtabs.CustomTabsService.this;
            if (bundle == null) {
                pendingIntent = null;
            } else {
                android.app.PendingIntent pendingIntent2 = (android.app.PendingIntent) bundle.getParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
                bundle.remove(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
                pendingIntent = pendingIntent2;
            }
            customTabsService.prefetch(new androidx.browser.customtabs.CustomTabsSessionToken(iCustomTabsCallback, pendingIntent), list, androidx.browser.customtabs.PrefetchOptions.getHighResolutionOutputSizeshNQ4ISI(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsService
        public android.os.Bundle extraCommand(java.lang.String str, android.os.Bundle bundle) {
            return androidx.browser.customtabs.CustomTabsService.this.extraCommand(str, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean updateVisuals(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) {
            android.app.PendingIntent pendingIntent;
            androidx.browser.customtabs.CustomTabsService customTabsService = androidx.browser.customtabs.CustomTabsService.this;
            if (bundle == null) {
                pendingIntent = null;
            } else {
                android.app.PendingIntent pendingIntent2 = (android.app.PendingIntent) bundle.getParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
                bundle.remove(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
                pendingIntent = pendingIntent2;
            }
            return customTabsService.updateVisuals(new androidx.browser.customtabs.CustomTabsSessionToken(iCustomTabsCallback, pendingIntent), bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannel(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri) {
            return androidx.browser.customtabs.CustomTabsService.this.requestPostMessageChannel(new androidx.browser.customtabs.CustomTabsSessionToken(iCustomTabsCallback, null), uri, null, new android.os.Bundle());
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannelWithExtras(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, android.os.Bundle bundle) {
            android.app.PendingIntent pendingIntent;
            androidx.browser.customtabs.CustomTabsService customTabsService = androidx.browser.customtabs.CustomTabsService.this;
            android.net.Uri uri2 = null;
            if (bundle == null) {
                pendingIntent = null;
            } else {
                pendingIntent = (android.app.PendingIntent) bundle.getParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
                bundle.remove(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
            }
            androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken = new androidx.browser.customtabs.CustomTabsSessionToken(iCustomTabsCallback, pendingIntent);
            if (bundle != null) {
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    uri2 = (android.net.Uri) androidx.browser.customtabs.Api33Impl.getHighSpeedVideoFpsRanges(bundle, "target_origin", android.net.Uri.class);
                } else {
                    uri2 = (android.net.Uri) bundle.getParcelable("target_origin");
                }
            }
            return customTabsService.requestPostMessageChannel(customTabsSessionToken, uri, uri2, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public int postMessage(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, java.lang.String str, android.os.Bundle bundle) {
            android.app.PendingIntent pendingIntent;
            androidx.browser.customtabs.CustomTabsService customTabsService = androidx.browser.customtabs.CustomTabsService.this;
            if (bundle == null) {
                pendingIntent = null;
            } else {
                android.app.PendingIntent pendingIntent2 = (android.app.PendingIntent) bundle.getParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
                bundle.remove(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
                pendingIntent = pendingIntent2;
            }
            return customTabsService.postMessage(new androidx.browser.customtabs.CustomTabsSessionToken(iCustomTabsCallback, pendingIntent), str, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean validateRelationship(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, int i, android.net.Uri uri, android.os.Bundle bundle) {
            android.app.PendingIntent pendingIntent;
            androidx.browser.customtabs.CustomTabsService customTabsService = androidx.browser.customtabs.CustomTabsService.this;
            if (bundle == null) {
                pendingIntent = null;
            } else {
                android.app.PendingIntent pendingIntent2 = (android.app.PendingIntent) bundle.getParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
                bundle.remove(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
                pendingIntent = pendingIntent2;
            }
            return customTabsService.validateRelationship(new androidx.browser.customtabs.CustomTabsSessionToken(iCustomTabsCallback, pendingIntent), i, uri, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean receiveFile(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, int i, android.os.Bundle bundle) {
            android.app.PendingIntent pendingIntent;
            androidx.browser.customtabs.CustomTabsService customTabsService = androidx.browser.customtabs.CustomTabsService.this;
            if (bundle == null) {
                pendingIntent = null;
            } else {
                android.app.PendingIntent pendingIntent2 = (android.app.PendingIntent) bundle.getParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
                bundle.remove(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
                pendingIntent = pendingIntent2;
            }
            return customTabsService.receiveFile(new androidx.browser.customtabs.CustomTabsSessionToken(iCustomTabsCallback, pendingIntent), uri, i, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean isEngagementSignalsApiAvailable(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) {
            android.app.PendingIntent pendingIntent;
            androidx.browser.customtabs.CustomTabsService customTabsService = androidx.browser.customtabs.CustomTabsService.this;
            if (bundle == null) {
                pendingIntent = null;
            } else {
                android.app.PendingIntent pendingIntent2 = (android.app.PendingIntent) bundle.getParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
                bundle.remove(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
                pendingIntent = pendingIntent2;
            }
            return customTabsService.isEngagementSignalsApiAvailable(new androidx.browser.customtabs.CustomTabsSessionToken(iCustomTabsCallback, pendingIntent), bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean setEngagementSignalsCallback(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.IBinder iBinder, android.os.Bundle bundle) {
            android.app.PendingIntent pendingIntent;
            androidx.browser.customtabs.EngagementSignalsCallbackRemote Camera2StreamConfigurationMap = androidx.browser.customtabs.EngagementSignalsCallbackRemote.Camera2StreamConfigurationMap(iBinder);
            androidx.browser.customtabs.CustomTabsService customTabsService = androidx.browser.customtabs.CustomTabsService.this;
            if (bundle == null) {
                pendingIntent = null;
            } else {
                android.app.PendingIntent pendingIntent2 = (android.app.PendingIntent) bundle.getParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
                bundle.remove(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
                pendingIntent = pendingIntent2;
            }
            return customTabsService.setEngagementSignalsCallback(new androidx.browser.customtabs.CustomTabsSessionToken(iCustomTabsCallback, pendingIntent), Camera2StreamConfigurationMap, bundle);
        }

        final /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.browser.auth.AuthTabSessionToken authTabSessionToken) {
            androidx.browser.customtabs.CustomTabsService.this.cleanUpSession(authTabSessionToken);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newAuthTabSession(android.support.customtabs.IAuthTabCallback iAuthTabCallback, android.os.Bundle bundle) {
            android.app.PendingIntent pendingIntent;
            if (bundle == null) {
                pendingIntent = null;
            } else {
                android.app.PendingIntent pendingIntent2 = (android.app.PendingIntent) bundle.getParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
                bundle.remove(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
                pendingIntent = pendingIntent2;
            }
            final androidx.browser.auth.AuthTabSessionToken authTabSessionToken = new androidx.browser.auth.AuthTabSessionToken(iAuthTabCallback, pendingIntent);
            try {
                android.os.IBinder.DeathRecipient deathRecipient = new android.os.IBinder.DeathRecipient() { // from class: androidx.browser.customtabs.CustomTabsService$1$$ExternalSyntheticLambda3
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        androidx.browser.customtabs.CustomTabsService.AnonymousClass1.this.getHighSpeedVideoFpsRangesFor(authTabSessionToken);
                    }
                };
                synchronized (androidx.browser.customtabs.CustomTabsService.this.Camera2StreamConfigurationMap) {
                    iAuthTabCallback.asBinder().linkToDeath(deathRecipient, 0);
                    androidx.browser.customtabs.CustomTabsService.this.Camera2StreamConfigurationMap.put(iAuthTabCallback.asBinder(), deathRecipient);
                }
                return androidx.browser.customtabs.CustomTabsService.this.registerAuthTabSession(authTabSessionToken);
            } catch (android.os.RemoteException unused) {
                return false;
            }
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSessionWithExtras(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) {
            android.app.PendingIntent pendingIntent;
            if (bundle == null) {
                pendingIntent = null;
            } else {
                android.app.PendingIntent pendingIntent2 = (android.app.PendingIntent) bundle.getParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
                bundle.remove(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
                pendingIntent = pendingIntent2;
            }
            return getHighSpeedVideoFpsRangesFor(iCustomTabsCallback, pendingIntent);
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return this.getHighSpeedVideoFpsRanges;
    }

    protected boolean cleanUpSession(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken) {
        try {
            synchronized (this.Camera2StreamConfigurationMap) {
                android.support.customtabs.ICustomTabsCallback iCustomTabsCallback = customTabsSessionToken.getHighSpeedVideoFpsRangesFor;
                android.os.IBinder asBinder = iCustomTabsCallback == null ? null : iCustomTabsCallback.asBinder();
                if (asBinder == null) {
                    return false;
                }
                asBinder.unlinkToDeath(this.Camera2StreamConfigurationMap.get(asBinder), 0);
                this.Camera2StreamConfigurationMap.remove(asBinder);
                return true;
            }
        } catch (java.util.NoSuchElementException unused) {
            return false;
        }
    }

    protected boolean cleanUpSession(androidx.browser.auth.AuthTabSessionToken authTabSessionToken) {
        try {
            synchronized (this.Camera2StreamConfigurationMap) {
                android.os.IBinder callbackBinder = authTabSessionToken.getCallbackBinder();
                if (callbackBinder == null) {
                    return false;
                }
                callbackBinder.unlinkToDeath(this.Camera2StreamConfigurationMap.get(callbackBinder), 0);
                this.Camera2StreamConfigurationMap.remove(callbackBinder);
                return true;
            }
        } catch (java.util.NoSuchElementException unused) {
            return false;
        }
    }

    protected boolean requestPostMessageChannel(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken, android.net.Uri uri, android.net.Uri uri2, android.os.Bundle bundle) {
        return requestPostMessageChannel(customTabsSessionToken, uri);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
