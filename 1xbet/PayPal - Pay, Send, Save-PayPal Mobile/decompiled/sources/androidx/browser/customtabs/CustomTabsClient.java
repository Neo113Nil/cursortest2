package androidx.browser.customtabs;

/* loaded from: classes6.dex */
public class CustomTabsClient {
    private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    private final android.support.customtabs.ICustomTabsService getHighSpeedVideoFpsRanges;
    private final android.content.ComponentName getHighSpeedVideoSizes;

    CustomTabsClient(android.support.customtabs.ICustomTabsService iCustomTabsService, android.content.ComponentName componentName, android.content.Context context) {
        this.getHighSpeedVideoFpsRanges = iCustomTabsService;
        this.getHighSpeedVideoSizes = componentName;
        this.getHighResolutionOutputSizeshNQ4ISI = context;
    }

    public static boolean bindCustomTabsService(android.content.Context context, java.lang.String str, androidx.browser.customtabs.CustomTabsServiceConnection customTabsServiceConnection) {
        customTabsServiceConnection.setApplicationContext(context.getApplicationContext());
        android.content.Intent intent = new android.content.Intent(androidx.browser.customtabs.CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        if (str.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Service Intents must be explicit");
        }
        intent.setPackage(str);
        return context.bindService(intent, customTabsServiceConnection, 33);
    }

    public static boolean bindCustomTabsServicePreservePriority(android.content.Context context, java.lang.String str, androidx.browser.customtabs.CustomTabsServiceConnection customTabsServiceConnection) {
        customTabsServiceConnection.setApplicationContext(context.getApplicationContext());
        android.content.Intent intent = new android.content.Intent(androidx.browser.customtabs.CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        if (str.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Service Intents must be explicit");
        }
        intent.setPackage(str);
        return context.bindService(intent, customTabsServiceConnection, 1);
    }

    public static java.lang.String getPackageName(android.content.Context context, java.util.List<java.lang.String> list) {
        return getPackageName(context, list, false);
    }

    public static java.lang.String getPackageName(android.content.Context context, java.util.List<java.lang.String> list, boolean z) {
        android.content.pm.ResolveInfo resolveActivity;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        java.util.List<java.lang.String> arrayList = list == null ? new java.util.ArrayList<>() : list;
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("http://"));
        if (!z && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            java.lang.String str = resolveActivity.activityInfo.packageName;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        android.content.Intent intent2 = new android.content.Intent(androidx.browser.customtabs.CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        for (java.lang.String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        return null;
    }

    public static boolean connectAndInitialize(android.content.Context context, java.lang.String str) {
        if (str == null) {
            return false;
        }
        final android.content.Context applicationContext = context.getApplicationContext();
        try {
            return bindCustomTabsService(applicationContext, str, new androidx.browser.customtabs.CustomTabsServiceConnection() { // from class: androidx.browser.customtabs.CustomTabsClient.1
                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(android.content.ComponentName componentName) {
                }

                @Override // androidx.browser.customtabs.CustomTabsServiceConnection
                public final void onCustomTabsServiceConnected(android.content.ComponentName componentName, androidx.browser.customtabs.CustomTabsClient customTabsClient) {
                    customTabsClient.warmup(0L);
                    applicationContext.unbindService(this);
                }
            });
        } catch (java.lang.SecurityException unused) {
            return false;
        }
    }

    public boolean warmup(long j) {
        try {
            return this.getHighSpeedVideoFpsRanges.warmup(j);
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    public androidx.browser.customtabs.CustomTabsSession newSession(androidx.browser.customtabs.CustomTabsCallback customTabsCallback) {
        return getHighSpeedVideoSizes(customTabsCallback, null);
    }

    public androidx.browser.customtabs.CustomTabsSession newSession(androidx.browser.customtabs.CustomTabsCallback customTabsCallback, int i) {
        return getHighSpeedVideoSizes(customTabsCallback, android.app.PendingIntent.getActivity(this.getHighResolutionOutputSizeshNQ4ISI, i, new android.content.Intent(), 67108864));
    }

    public androidx.browser.auth.AuthTabSession newAuthTabSession(androidx.browser.auth.AuthTabCallback authTabCallback, java.util.concurrent.Executor executor) {
        return getHighSpeedVideoFpsRangesFor(authTabCallback, executor, null);
    }

    public androidx.browser.auth.AuthTabSession newAuthTabSession(androidx.browser.auth.AuthTabCallback authTabCallback, java.util.concurrent.Executor executor, int i) {
        return getHighSpeedVideoFpsRangesFor(authTabCallback, executor, android.app.PendingIntent.getActivity(this.getHighResolutionOutputSizeshNQ4ISI, i, new android.content.Intent(), 67108864));
    }

    /* renamed from: androidx.browser.customtabs.CustomTabsClient$2, reason: invalid class name */
    class AnonymousClass2 extends android.support.customtabs.IAuthTabCallback.Stub {
        final /* synthetic */ androidx.browser.auth.AuthTabCallback Camera2StreamConfigurationMap;
        final /* synthetic */ java.util.concurrent.Executor getHighResolutionOutputSizeshNQ4ISI;
        private final java.util.concurrent.Executor getHighSpeedVideoFpsRanges;

        @Override // android.support.customtabs.IAuthTabCallback
        public int getInterfaceVersion() {
            return 1;
        }

        AnonymousClass2(java.util.concurrent.Executor executor, androidx.browser.auth.AuthTabCallback authTabCallback) {
            this.getHighResolutionOutputSizeshNQ4ISI = executor;
            this.Camera2StreamConfigurationMap = authTabCallback;
            if (executor == null) {
                final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
                executor = new java.util.concurrent.Executor() { // from class: androidx.browser.customtabs.CustomTabsClient$2$$ExternalSyntheticLambda3
                    @Override // java.util.concurrent.Executor
                    public final void execute(java.lang.Runnable runnable) {
                        handler.post(runnable);
                    }
                };
            }
            this.getHighSpeedVideoFpsRanges = executor;
        }

        @Override // android.support.customtabs.IAuthTabCallback
        public void onNavigationEvent(final int i, final android.os.Bundle bundle) throws android.os.RemoteException {
            if (this.Camera2StreamConfigurationMap == null) {
                return;
            }
            long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                java.util.concurrent.Executor executor = this.getHighSpeedVideoFpsRanges;
                final androidx.browser.auth.AuthTabCallback authTabCallback = this.Camera2StreamConfigurationMap;
                executor.execute(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient$2$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.browser.auth.AuthTabCallback.this.onNavigationEvent(i, bundle);
                    }
                });
            } finally {
                android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.customtabs.IAuthTabCallback
        public void onExtraCallback(final java.lang.String str, final android.os.Bundle bundle) throws android.os.RemoteException {
            if (this.Camera2StreamConfigurationMap == null) {
                return;
            }
            long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                java.util.concurrent.Executor executor = this.getHighSpeedVideoFpsRanges;
                final androidx.browser.auth.AuthTabCallback authTabCallback = this.Camera2StreamConfigurationMap;
                executor.execute(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient$2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.browser.auth.AuthTabCallback.this.onExtraCallback(str, bundle);
                    }
                });
            } finally {
                android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.customtabs.IAuthTabCallback
        public android.os.Bundle onExtraCallbackWithResult(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
            if (this.Camera2StreamConfigurationMap == null) {
                return android.os.Bundle.EMPTY;
            }
            long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                return this.Camera2StreamConfigurationMap.onExtraCallbackWithResult(str, bundle);
            } finally {
                android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.customtabs.IAuthTabCallback
        public void onWarmupCompleted(final android.os.Bundle bundle) throws android.os.RemoteException {
            if (this.Camera2StreamConfigurationMap == null) {
                return;
            }
            long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                java.util.concurrent.Executor executor = this.getHighSpeedVideoFpsRanges;
                final androidx.browser.auth.AuthTabCallback authTabCallback = this.Camera2StreamConfigurationMap;
                executor.execute(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient$2$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.browser.auth.AuthTabCallback.this.onWarmupCompleted(bundle);
                    }
                });
            } finally {
                android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    public androidx.browser.auth.AuthTabSession attachAuthTabSession(androidx.browser.auth.AuthTabSession.PendingSession pendingSession) {
        return getHighSpeedVideoFpsRangesFor(pendingSession.getCallback(), pendingSession.getExecutor(), pendingSession.getId());
    }

    public android.os.Bundle extraCommand(java.lang.String str, android.os.Bundle bundle) {
        try {
            return this.getHighSpeedVideoFpsRanges.extraCommand(str, bundle);
        } catch (android.os.RemoteException unused) {
            return null;
        }
    }

    public static boolean isSetNetworkSupported(android.content.Context context, java.lang.String str) {
        return getHighSpeedVideoFpsRanges(context, str, androidx.browser.customtabs.CustomTabsService.CATEGORY_SET_NETWORK);
    }

    public static boolean isAuthTabSupported(android.content.Context context, java.lang.String str) {
        return getHighSpeedVideoFpsRanges(context, str, androidx.browser.customtabs.CustomTabsService.CATEGORY_AUTH_TAB);
    }

    public static boolean isEphemeralBrowsingSupported(android.content.Context context, java.lang.String str) {
        return getHighSpeedVideoFpsRanges(context, str, androidx.browser.customtabs.CustomTabsService.CATEGORY_EPHEMERAL_BROWSING);
    }

    private static boolean getHighSpeedVideoFpsRanges(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.content.IntentFilter intentFilter;
        for (android.content.pm.ResolveInfo resolveInfo : context.getPackageManager().queryIntentServices(new android.content.Intent(androidx.browser.customtabs.CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 64)) {
            android.content.pm.ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (serviceInfo != null && str.equals(serviceInfo.packageName) && (intentFilter = resolveInfo.filter) != null && intentFilter.hasCategory(str2)) {
                return true;
            }
        }
        return false;
    }

    public static androidx.browser.auth.AuthTabSession.PendingSession createPendingAuthTabSession(android.content.Context context, int i) {
        return new androidx.browser.auth.AuthTabSession.PendingSession(android.app.PendingIntent.getActivity(context, i, new android.content.Intent(), 67108864), null, null);
    }

    public static androidx.browser.auth.AuthTabSession.PendingSession createPendingAuthTabSession(android.content.Context context, int i, java.util.concurrent.Executor executor, androidx.browser.auth.AuthTabCallback authTabCallback) {
        return new androidx.browser.auth.AuthTabSession.PendingSession(android.app.PendingIntent.getActivity(context, i, new android.content.Intent(), 67108864), executor, authTabCallback);
    }

    private androidx.browser.auth.AuthTabSession getHighSpeedVideoFpsRangesFor(androidx.browser.auth.AuthTabCallback authTabCallback, java.util.concurrent.Executor executor, android.app.PendingIntent pendingIntent) {
        androidx.browser.customtabs.CustomTabsClient.AnonymousClass2 anonymousClass2 = new androidx.browser.customtabs.CustomTabsClient.AnonymousClass2(executor, authTabCallback);
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
            if (this.getHighSpeedVideoFpsRanges.newAuthTabSession(anonymousClass2, bundle)) {
                return new androidx.browser.auth.AuthTabSession(anonymousClass2, this.getHighSpeedVideoSizes, pendingIntent);
            }
            return null;
        } catch (android.os.RemoteException unused) {
            return null;
        }
    }

    public static androidx.browser.customtabs.CustomTabsSession.PendingSession newPendingSession(android.content.Context context, androidx.browser.customtabs.CustomTabsCallback customTabsCallback, int i) {
        return new androidx.browser.customtabs.CustomTabsSession.PendingSession(customTabsCallback, android.app.PendingIntent.getActivity(context, i, new android.content.Intent(), 67108864));
    }

    private androidx.browser.customtabs.CustomTabsSession getHighSpeedVideoSizes(final androidx.browser.customtabs.CustomTabsCallback customTabsCallback, android.app.PendingIntent pendingIntent) {
        boolean newSession;
        android.support.customtabs.ICustomTabsCallback.Stub stub = new android.support.customtabs.ICustomTabsCallback.Stub() { // from class: androidx.browser.customtabs.CustomTabsClient.3
            private android.os.Handler Camera2StreamConfigurationMap = new android.os.Handler(android.os.Looper.getMainLooper());

            @Override // android.support.customtabs.ICustomTabsCallback
            public int getInterfaceVersion() {
                return 1;
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onNavigationEvent(final int i, final android.os.Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.Camera2StreamConfigurationMap.post(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onNavigationEvent(i, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void extraCallback(final java.lang.String str, final android.os.Bundle bundle) throws android.os.RemoteException {
                if (customTabsCallback == null) {
                    return;
                }
                this.Camera2StreamConfigurationMap.post(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.2
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.extraCallback(str, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public android.os.Bundle extraCallbackWithResult(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                androidx.browser.customtabs.CustomTabsCallback customTabsCallback2 = customTabsCallback;
                if (customTabsCallback2 == null) {
                    return null;
                }
                return customTabsCallback2.extraCallbackWithResult(str, bundle);
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onMessageChannelReady(final android.os.Bundle bundle) throws android.os.RemoteException {
                if (customTabsCallback == null) {
                    return;
                }
                this.Camera2StreamConfigurationMap.post(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.3
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onMessageChannelReady(bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onPostMessage(final java.lang.String str, final android.os.Bundle bundle) throws android.os.RemoteException {
                if (customTabsCallback == null) {
                    return;
                }
                this.Camera2StreamConfigurationMap.post(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.4
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onPostMessage(str, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onRelationshipValidationResult(final int i, final android.net.Uri uri, final boolean z, final android.os.Bundle bundle) throws android.os.RemoteException {
                if (customTabsCallback == null) {
                    return;
                }
                this.Camera2StreamConfigurationMap.post(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.5
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onRelationshipValidationResult(i, uri, z, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onActivityResized(final int i, final int i2, final android.os.Bundle bundle) throws android.os.RemoteException {
                if (customTabsCallback == null) {
                    return;
                }
                this.Camera2StreamConfigurationMap.post(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.6
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onActivityResized(i, i2, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onWarmupCompleted(final android.os.Bundle bundle) throws android.os.RemoteException {
                if (customTabsCallback == null) {
                    return;
                }
                this.Camera2StreamConfigurationMap.post(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.7
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onWarmupCompleted(bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onActivityLayout(final int i, final int i2, final int i3, final int i4, final int i5, final android.os.Bundle bundle) throws android.os.RemoteException {
                if (customTabsCallback == null) {
                    return;
                }
                this.Camera2StreamConfigurationMap.post(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.8
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onActivityLayout(i, i2, i3, i4, i5, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onMinimized(final android.os.Bundle bundle) throws android.os.RemoteException {
                if (customTabsCallback == null) {
                    return;
                }
                this.Camera2StreamConfigurationMap.post(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.9
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onMinimized(bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onUnminimized(final android.os.Bundle bundle) throws android.os.RemoteException {
                if (customTabsCallback == null) {
                    return;
                }
                this.Camera2StreamConfigurationMap.post(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.10
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onUnminimized(bundle);
                    }
                });
            }
        };
        try {
            if (pendingIntent != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
                newSession = this.getHighSpeedVideoFpsRanges.newSessionWithExtras(stub, bundle);
            } else {
                newSession = this.getHighSpeedVideoFpsRanges.newSession(stub);
            }
            if (newSession) {
                return new androidx.browser.customtabs.CustomTabsSession(this.getHighSpeedVideoFpsRanges, stub, this.getHighSpeedVideoSizes, pendingIntent);
            }
            return null;
        } catch (android.os.RemoteException unused) {
            return null;
        }
    }

    public androidx.browser.customtabs.CustomTabsSession attachSession(androidx.browser.customtabs.CustomTabsSession.PendingSession pendingSession) {
        return getHighSpeedVideoSizes(pendingSession.getHighSpeedVideoFpsRangesFor, pendingSession.getHighResolutionOutputSizeshNQ4ISI);
    }
}
