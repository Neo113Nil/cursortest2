package com.facebook.appevents;

/* compiled from: AnalyticsUserIDStore.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0007J\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/appevents/AnalyticsUserIDStore;", "", "()V", "ANALYTICS_USER_ID_KEY", "", "TAG", "kotlin.jvm.PlatformType", "initialized", "", "lock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "userID", "getUserID", "initAndWait", "", "initStore", "setUserID", "id", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AnalyticsUserIDStore {
    private static final java.lang.String ANALYTICS_USER_ID_KEY = "com.facebook.appevents.AnalyticsUserIDStore.userID";
    private static volatile boolean initialized;
    private static java.lang.String userID;
    public static final com.facebook.appevents.AnalyticsUserIDStore INSTANCE = new com.facebook.appevents.AnalyticsUserIDStore();
    private static final java.lang.String TAG = "AnalyticsUserIDStore";
    private static final java.util.concurrent.locks.ReentrantReadWriteLock lock = new java.util.concurrent.locks.ReentrantReadWriteLock();

    private AnalyticsUserIDStore() {
    }

    @kotlin.jvm.JvmStatic
    public static final void initStore() {
        if (initialized) {
            return;
        }
        com.facebook.appevents.InternalAppEventsLogger.INSTANCE.getAnalyticsExecutor().execute(new java.lang.Runnable() { // from class: com.facebook.appevents.AnalyticsUserIDStore$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.facebook.appevents.AnalyticsUserIDStore.m5076initStore$lambda0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initStore$lambda-0, reason: not valid java name */
    public static final void m5076initStore$lambda0() {
        INSTANCE.initAndWait();
    }

    @kotlin.jvm.JvmStatic
    public static final void setUserID(final java.lang.String id) {
        com.facebook.appevents.internal.AppEventUtility appEventUtility = com.facebook.appevents.internal.AppEventUtility.INSTANCE;
        com.facebook.appevents.internal.AppEventUtility.assertIsNotMainThread();
        if (!initialized) {
            android.util.Log.w(TAG, "initStore should have been called before calling setUserID");
            INSTANCE.initAndWait();
        }
        com.facebook.appevents.InternalAppEventsLogger.INSTANCE.getAnalyticsExecutor().execute(new java.lang.Runnable() { // from class: com.facebook.appevents.AnalyticsUserIDStore$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.facebook.appevents.AnalyticsUserIDStore.m5077setUserID$lambda1(id);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setUserID$lambda-1, reason: not valid java name */
    public static final void m5077setUserID$lambda1(java.lang.String str) {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = lock;
        reentrantReadWriteLock.writeLock().lock();
        try {
            userID = str;
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            android.content.SharedPreferences.Editor edit = android.preference.PreferenceManager.getDefaultSharedPreferences(com.facebook.FacebookSdk.getApplicationContext()).edit();
            edit.putString(ANALYTICS_USER_ID_KEY, userID);
            edit.apply();
            reentrantReadWriteLock.writeLock().unlock();
        } catch (java.lang.Throwable th) {
            lock.writeLock().unlock();
            throw th;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getUserID() {
        if (!initialized) {
            android.util.Log.w(TAG, "initStore should have been called before calling setUserID");
            INSTANCE.initAndWait();
        }
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = lock;
        reentrantReadWriteLock.readLock().lock();
        try {
            java.lang.String str = userID;
            reentrantReadWriteLock.readLock().unlock();
            return str;
        } catch (java.lang.Throwable th) {
            lock.readLock().unlock();
            throw th;
        }
    }

    private final void initAndWait() {
        if (initialized) {
            return;
        }
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = lock;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (!initialized) {
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                userID = android.preference.PreferenceManager.getDefaultSharedPreferences(com.facebook.FacebookSdk.getApplicationContext()).getString(ANALYTICS_USER_ID_KEY, null);
                initialized = true;
                reentrantReadWriteLock.writeLock().unlock();
                return;
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (java.lang.Throwable th) {
            lock.writeLock().unlock();
            throw th;
        }
    }
}
