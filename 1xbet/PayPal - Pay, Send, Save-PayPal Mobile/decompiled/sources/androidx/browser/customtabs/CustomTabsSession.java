package androidx.browser.customtabs;

/* loaded from: classes6.dex */
public final class CustomTabsSession {
    private final android.support.customtabs.ICustomTabsService Camera2StreamConfigurationMap;
    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
    final android.support.customtabs.ICustomTabsCallback getHighSpeedVideoFpsRanges;
    final android.app.PendingIntent getHighSpeedVideoFpsRangesFor;
    final android.content.ComponentName getHighSpeedVideoSizes;

    public static androidx.browser.customtabs.CustomTabsSession createMockSessionForTesting(android.content.ComponentName componentName) {
        return new androidx.browser.customtabs.CustomTabsSession(new androidx.browser.customtabs.CustomTabsSession.MockSession(), new androidx.browser.customtabs.CustomTabsSessionToken.MockCallback(), componentName, null);
    }

    CustomTabsSession(android.support.customtabs.ICustomTabsService iCustomTabsService, android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.content.ComponentName componentName, android.app.PendingIntent pendingIntent) {
        this.Camera2StreamConfigurationMap = iCustomTabsService;
        this.getHighSpeedVideoFpsRanges = iCustomTabsCallback;
        this.getHighSpeedVideoSizes = componentName;
        this.getHighSpeedVideoFpsRangesFor = pendingIntent;
    }

    public final boolean mayLaunchUrl(android.net.Uri uri, android.os.Bundle bundle, java.util.List<android.os.Bundle> list) {
        try {
            return this.Camera2StreamConfigurationMap.mayLaunchUrl(this.getHighSpeedVideoFpsRanges, uri, getHighSpeedVideoFpsRanges(bundle), list);
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    public final void prefetch(android.net.Uri uri, androidx.browser.customtabs.PrefetchOptions prefetchOptions) {
        try {
            this.Camera2StreamConfigurationMap.prefetch(this.getHighSpeedVideoFpsRanges, uri, getHighSpeedVideoFpsRanges(prefetchOptions.getHighSpeedVideoFpsRangesFor()));
        } catch (android.os.RemoteException unused) {
        }
    }

    public final void prefetch(java.util.List<android.net.Uri> list, androidx.browser.customtabs.PrefetchOptions prefetchOptions) {
        try {
            this.Camera2StreamConfigurationMap.prefetchWithMultipleUrls(this.getHighSpeedVideoFpsRanges, list, getHighSpeedVideoFpsRanges(prefetchOptions.getHighSpeedVideoFpsRangesFor()));
        } catch (android.os.RemoteException unused) {
        }
    }

    public final boolean setActionButton(android.graphics.Bitmap bitmap, java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.KEY_ICON, bitmap);
        bundle.putString(androidx.browser.customtabs.CustomTabsIntent.KEY_DESCRIPTION, str);
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putBundle(androidx.browser.customtabs.CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        android.app.PendingIntent pendingIntent = this.getHighSpeedVideoFpsRangesFor;
        if (pendingIntent != null) {
            bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
        }
        try {
            return this.Camera2StreamConfigurationMap.updateVisuals(this.getHighSpeedVideoFpsRanges, bundle2);
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    public final boolean setSecondaryToolbarViews(android.widget.RemoteViews remoteViews, int[] iArr, android.app.PendingIntent pendingIntent) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_REMOTEVIEWS, remoteViews);
        bundle.putIntArray(androidx.browser.customtabs.CustomTabsIntent.EXTRA_REMOTEVIEWS_VIEW_IDS, iArr);
        bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_REMOTEVIEWS_PENDINGINTENT, pendingIntent);
        android.app.PendingIntent pendingIntent2 = this.getHighSpeedVideoFpsRangesFor;
        if (pendingIntent2 != null) {
            bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent2);
        }
        try {
            return this.Camera2StreamConfigurationMap.updateVisuals(this.getHighSpeedVideoFpsRanges, bundle);
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    public final boolean setSecondaryToolbarSwipeUpGesture(android.app.PendingIntent pendingIntent) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SECONDARY_TOOLBAR_SWIPE_UP_GESTURE, pendingIntent);
        android.app.PendingIntent pendingIntent2 = this.getHighSpeedVideoFpsRangesFor;
        if (pendingIntent2 != null) {
            bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent2);
        }
        try {
            return this.Camera2StreamConfigurationMap.updateVisuals(this.getHighSpeedVideoFpsRanges, bundle);
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    @java.lang.Deprecated
    public final boolean setToolbarItem(int i, android.graphics.Bitmap bitmap, java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(androidx.browser.customtabs.CustomTabsIntent.KEY_ID, i);
        bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.KEY_ICON, bitmap);
        bundle.putString(androidx.browser.customtabs.CustomTabsIntent.KEY_DESCRIPTION, str);
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putBundle(androidx.browser.customtabs.CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        android.app.PendingIntent pendingIntent = this.getHighSpeedVideoFpsRangesFor;
        if (pendingIntent != null) {
            bundle2.putParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
        }
        try {
            return this.Camera2StreamConfigurationMap.updateVisuals(this.getHighSpeedVideoFpsRanges, bundle2);
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    public final boolean requestPostMessageChannel(android.net.Uri uri) {
        return requestPostMessageChannel(uri, null, new android.os.Bundle());
    }

    public final int postMessage(java.lang.String str, android.os.Bundle bundle) {
        int postMessage;
        android.os.Bundle highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bundle);
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            try {
                postMessage = this.Camera2StreamConfigurationMap.postMessage(this.getHighSpeedVideoFpsRanges, str, highSpeedVideoFpsRanges);
            } catch (android.os.RemoteException unused) {
                return -2;
            }
        }
        return postMessage;
    }

    public final boolean validateRelationship(int i, android.net.Uri uri, android.os.Bundle bundle) {
        if (i <= 0 || i > 2) {
            return false;
        }
        try {
            return this.Camera2StreamConfigurationMap.validateRelationship(this.getHighSpeedVideoFpsRanges, i, uri, getHighSpeedVideoFpsRanges(bundle));
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    public final boolean receiveFile(android.net.Uri uri, int i, android.os.Bundle bundle) {
        try {
            return this.Camera2StreamConfigurationMap.receiveFile(this.getHighSpeedVideoFpsRanges, uri, i, getHighSpeedVideoFpsRanges(bundle));
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    public final boolean isEngagementSignalsApiAvailable(android.os.Bundle bundle) throws android.os.RemoteException {
        try {
            return this.Camera2StreamConfigurationMap.isEngagementSignalsApiAvailable(this.getHighSpeedVideoFpsRanges, getHighSpeedVideoFpsRanges(bundle));
        } catch (java.lang.SecurityException e) {
            throw new java.lang.UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }

    public final boolean setEngagementSignalsCallback(androidx.browser.customtabs.EngagementSignalsCallback engagementSignalsCallback, android.os.Bundle bundle) throws android.os.RemoteException {
        try {
            return this.Camera2StreamConfigurationMap.setEngagementSignalsCallback(this.getHighSpeedVideoFpsRanges, new androidx.browser.customtabs.CustomTabsSession.AnonymousClass1(engagementSignalsCallback).asBinder(), getHighSpeedVideoFpsRanges(bundle));
        } catch (java.lang.SecurityException e) {
            throw new java.lang.UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }

    /* renamed from: androidx.browser.customtabs.CustomTabsSession$1, reason: invalid class name */
    class AnonymousClass1 extends android.support.customtabs.IEngagementSignalsCallback.Stub {
        private final android.os.Handler Camera2StreamConfigurationMap = new android.os.Handler(android.os.Looper.getMainLooper());
        final /* synthetic */ androidx.browser.customtabs.EngagementSignalsCallback getHighResolutionOutputSizeshNQ4ISI;

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public int getInterfaceVersion() {
            return 1;
        }

        AnonymousClass1(androidx.browser.customtabs.EngagementSignalsCallback engagementSignalsCallback) {
            this.getHighResolutionOutputSizeshNQ4ISI = engagementSignalsCallback;
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onVerticalScrollEvent(final boolean z, final android.os.Bundle bundle) {
            android.os.Handler handler = this.Camera2StreamConfigurationMap;
            final androidx.browser.customtabs.EngagementSignalsCallback engagementSignalsCallback = this.getHighResolutionOutputSizeshNQ4ISI;
            handler.post(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.browser.customtabs.EngagementSignalsCallback.this.onVerticalScrollEvent(z, bundle);
                }
            });
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onGreatestScrollPercentageIncreased(final int i, final android.os.Bundle bundle) {
            android.os.Handler handler = this.Camera2StreamConfigurationMap;
            final androidx.browser.customtabs.EngagementSignalsCallback engagementSignalsCallback = this.getHighResolutionOutputSizeshNQ4ISI;
            handler.post(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.browser.customtabs.EngagementSignalsCallback.this.onGreatestScrollPercentageIncreased(i, bundle);
                }
            });
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onSessionEnded(final boolean z, final android.os.Bundle bundle) {
            android.os.Handler handler = this.Camera2StreamConfigurationMap;
            final androidx.browser.customtabs.EngagementSignalsCallback engagementSignalsCallback = this.getHighResolutionOutputSizeshNQ4ISI;
            handler.post(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.browser.customtabs.EngagementSignalsCallback.this.onSessionEnded(z, bundle);
                }
            });
        }
    }

    public final boolean setEngagementSignalsCallback(java.util.concurrent.Executor executor, androidx.browser.customtabs.EngagementSignalsCallback engagementSignalsCallback, android.os.Bundle bundle) throws android.os.RemoteException {
        try {
            return this.Camera2StreamConfigurationMap.setEngagementSignalsCallback(this.getHighSpeedVideoFpsRanges, new androidx.browser.customtabs.CustomTabsSession.AnonymousClass2(executor, engagementSignalsCallback).asBinder(), getHighSpeedVideoFpsRanges(bundle));
        } catch (java.lang.SecurityException e) {
            throw new java.lang.UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }

    /* renamed from: androidx.browser.customtabs.CustomTabsSession$2, reason: invalid class name */
    class AnonymousClass2 extends android.support.customtabs.IEngagementSignalsCallback.Stub {
        final /* synthetic */ androidx.browser.customtabs.EngagementSignalsCallback Camera2StreamConfigurationMap;
        final /* synthetic */ java.util.concurrent.Executor getHighResolutionOutputSizeshNQ4ISI;
        private final java.util.concurrent.Executor getHighSpeedVideoFpsRangesFor;

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public int getInterfaceVersion() {
            return 1;
        }

        AnonymousClass2(java.util.concurrent.Executor executor, androidx.browser.customtabs.EngagementSignalsCallback engagementSignalsCallback) {
            this.getHighResolutionOutputSizeshNQ4ISI = executor;
            this.Camera2StreamConfigurationMap = engagementSignalsCallback;
            this.getHighSpeedVideoFpsRangesFor = executor;
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onVerticalScrollEvent(final boolean z, final android.os.Bundle bundle) {
            long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                java.util.concurrent.Executor executor = this.getHighSpeedVideoFpsRangesFor;
                final androidx.browser.customtabs.EngagementSignalsCallback engagementSignalsCallback = this.Camera2StreamConfigurationMap;
                executor.execute(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.browser.customtabs.EngagementSignalsCallback.this.onVerticalScrollEvent(z, bundle);
                    }
                });
            } finally {
                android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onGreatestScrollPercentageIncreased(final int i, final android.os.Bundle bundle) {
            long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                java.util.concurrent.Executor executor = this.getHighSpeedVideoFpsRangesFor;
                final androidx.browser.customtabs.EngagementSignalsCallback engagementSignalsCallback = this.Camera2StreamConfigurationMap;
                executor.execute(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$2$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.browser.customtabs.EngagementSignalsCallback.this.onGreatestScrollPercentageIncreased(i, bundle);
                    }
                });
            } finally {
                android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onSessionEnded(final boolean z, final android.os.Bundle bundle) {
            long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                java.util.concurrent.Executor executor = this.getHighSpeedVideoFpsRangesFor;
                final androidx.browser.customtabs.EngagementSignalsCallback engagementSignalsCallback = this.Camera2StreamConfigurationMap;
                executor.execute(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$2$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.browser.customtabs.EngagementSignalsCallback.this.onSessionEnded(z, bundle);
                    }
                });
            } finally {
                android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    private android.os.Bundle getHighSpeedVideoFpsRanges(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        android.app.PendingIntent pendingIntent = this.getHighSpeedVideoFpsRangesFor;
        if (pendingIntent != null) {
            bundle2.putParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
        }
        return bundle2;
    }

    public static class PendingSession {
        final android.app.PendingIntent getHighResolutionOutputSizeshNQ4ISI;
        final androidx.browser.customtabs.CustomTabsCallback getHighSpeedVideoFpsRangesFor;

        PendingSession(androidx.browser.customtabs.CustomTabsCallback customTabsCallback, android.app.PendingIntent pendingIntent) {
            this.getHighSpeedVideoFpsRangesFor = customTabsCallback;
            this.getHighResolutionOutputSizeshNQ4ISI = pendingIntent;
        }
    }

    static class MockSession extends android.support.customtabs.ICustomTabsService.Stub {
        @Override // android.support.customtabs.ICustomTabsService
        public android.os.Bundle extraCommand(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean isEngagementSignalsApiAvailable(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean mayLaunchUrl(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, android.os.Bundle bundle, java.util.List<android.os.Bundle> list) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newAuthTabSession(android.support.customtabs.IAuthTabCallback iAuthTabCallback, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSession(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSessionWithExtras(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public int postMessage(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
            return 0;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public void prefetch(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsService
        public void prefetchWithMultipleUrls(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, java.util.List<android.net.Uri> list, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean receiveFile(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, int i, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannel(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannelWithExtras(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean setEngagementSignalsCallback(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.IBinder iBinder, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean updateVisuals(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean validateRelationship(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, int i, android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean warmup(long j) throws android.os.RemoteException {
            return false;
        }

        MockSession() {
        }
    }

    public final boolean requestPostMessageChannel(android.net.Uri uri, android.net.Uri uri2, android.os.Bundle bundle) {
        try {
            android.os.Bundle bundle2 = new android.os.Bundle();
            if (uri2 != null) {
                bundle2.putParcelable("target_origin", uri2);
            }
            android.app.PendingIntent pendingIntent = this.getHighSpeedVideoFpsRangesFor;
            if (pendingIntent != null && pendingIntent != null) {
                bundle2.putParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
            }
            if (bundle2.isEmpty()) {
                bundle2 = null;
            }
            if (bundle2 != null) {
                bundle.putAll(bundle2);
                return this.Camera2StreamConfigurationMap.requestPostMessageChannelWithExtras(this.getHighSpeedVideoFpsRanges, uri, bundle);
            }
            return this.Camera2StreamConfigurationMap.requestPostMessageChannel(this.getHighSpeedVideoFpsRanges, uri);
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }
}
