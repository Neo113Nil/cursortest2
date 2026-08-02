package com.facebook.appevents;

import android.preference.PreferenceManager;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.facebook.appevents.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0691c {
    public static final C0691c a = new C0691c();
    public static final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    public static String c;
    public static volatile boolean d;

    public static void a() {
        if (d) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = b;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (!d) {
                c = PreferenceManager.getDefaultSharedPreferences(com.facebook.w.a()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                d = true;
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            b.writeLock().unlock();
            throw th;
        }
    }
}
