package com.facebook.login;

/* compiled from: CustomTabPrefetchHelper.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/facebook/login/CustomTabPrefetchHelper;", "Landroidx/browser/customtabs/CustomTabsServiceConnection;", "()V", "onCustomTabsServiceConnected", "", "name", "Landroid/content/ComponentName;", "newClient", "Landroidx/browser/customtabs/CustomTabsClient;", "onServiceDisconnected", "componentName", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomTabPrefetchHelper extends androidx.browser.customtabs.CustomTabsServiceConnection {
    private static androidx.browser.customtabs.CustomTabsClient client;
    private static androidx.browser.customtabs.CustomTabsSession session;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.login.CustomTabPrefetchHelper.Companion INSTANCE = new com.facebook.login.CustomTabPrefetchHelper.Companion(null);
    private static final java.util.concurrent.locks.ReentrantLock lock = new java.util.concurrent.locks.ReentrantLock();

    @kotlin.jvm.JvmStatic
    public static final androidx.browser.customtabs.CustomTabsSession getPreparedSessionOnce() {
        return INSTANCE.getPreparedSessionOnce();
    }

    @kotlin.jvm.JvmStatic
    public static final void mayLaunchUrl(android.net.Uri uri) {
        INSTANCE.mayLaunchUrl(uri);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentName, "componentName");
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public void onCustomTabsServiceConnected(android.content.ComponentName name, androidx.browser.customtabs.CustomTabsClient newClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newClient, "newClient");
        newClient.warmup(0L);
        com.facebook.login.CustomTabPrefetchHelper.Companion companion = INSTANCE;
        client = newClient;
        companion.prepareSession();
    }

    /* compiled from: CustomTabPrefetchHelper.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/login/CustomTabPrefetchHelper$Companion;", "", "()V", "client", "Landroidx/browser/customtabs/CustomTabsClient;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "session", "Landroidx/browser/customtabs/CustomTabsSession;", "getPreparedSessionOnce", "mayLaunchUrl", "", "url", "Landroid/net/Uri;", "prepareSession", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void prepareSession() {
            androidx.browser.customtabs.CustomTabsClient customTabsClient;
            com.facebook.login.CustomTabPrefetchHelper.lock.lock();
            if (com.facebook.login.CustomTabPrefetchHelper.session == null && (customTabsClient = com.facebook.login.CustomTabPrefetchHelper.client) != null) {
                com.facebook.login.CustomTabPrefetchHelper.Companion companion = com.facebook.login.CustomTabPrefetchHelper.INSTANCE;
                com.facebook.login.CustomTabPrefetchHelper.session = customTabsClient.newSession(null);
            }
            com.facebook.login.CustomTabPrefetchHelper.lock.unlock();
        }

        @kotlin.jvm.JvmStatic
        public final void mayLaunchUrl(android.net.Uri url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            prepareSession();
            com.facebook.login.CustomTabPrefetchHelper.lock.lock();
            androidx.browser.customtabs.CustomTabsSession customTabsSession = com.facebook.login.CustomTabPrefetchHelper.session;
            if (customTabsSession != null) {
                customTabsSession.mayLaunchUrl(url, null, null);
            }
            com.facebook.login.CustomTabPrefetchHelper.lock.unlock();
        }

        @kotlin.jvm.JvmStatic
        public final androidx.browser.customtabs.CustomTabsSession getPreparedSessionOnce() {
            com.facebook.login.CustomTabPrefetchHelper.lock.lock();
            androidx.browser.customtabs.CustomTabsSession customTabsSession = com.facebook.login.CustomTabPrefetchHelper.session;
            com.facebook.login.CustomTabPrefetchHelper.session = null;
            com.facebook.login.CustomTabPrefetchHelper.lock.unlock();
            return customTabsSession;
        }
    }
}
