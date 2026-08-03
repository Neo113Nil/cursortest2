package io.appmetrica.analytics.internal;

/* loaded from: classes.dex */
public class PreloadInfoContentProvider extends android.content.ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    private boolean f7199a = false;

    /* renamed from: b, reason: collision with root package name */
    private final android.content.UriMatcher f7200b = new android.content.UriMatcher(-1);

    private void a(io.appmetrica.analytics.impl.B5 b5, android.content.ContentValues contentValues) {
        android.content.Context context = getContext();
        android.content.Context applicationContext = context == null ? null : context.getApplicationContext();
        if (applicationContext != null) {
            try {
                java.lang.Object invoke = b5.f4097a.invoke(contentValues);
                if (invoke != null) {
                    b5.f4099c.b(applicationContext);
                    if (((java.lang.Boolean) b5.f4098b.invoke(invoke)).booleanValue()) {
                        io.appmetrica.analytics.impl.AbstractC0362fj.a("Successfully saved " + b5.f4100d, new java.lang.Object[0]);
                    } else {
                        io.appmetrica.analytics.impl.AbstractC0362fj.a("Did not save " + b5.f4100d + " because data is already present", new java.lang.Object[0]);
                    }
                }
            } catch (java.lang.Throwable th) {
                io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger.INSTANCE.info("AppMetrica-Attribution", "Unexpected error occurred\n" + io.appmetrica.analytics.coreutils.internal.StringUtils.throwableToString(th), new java.lang.Object[0]);
            }
        }
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        io.appmetrica.analytics.impl.AbstractC0362fj.a("Deleting is not supported", new java.lang.Object[0]);
        return -1;
    }

    public synchronized void disable() {
        this.f7199a = true;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        synchronized (this) {
            try {
                if (this.f7199a) {
                    return null;
                }
                if (contentValues != null) {
                    int match = this.f7200b.match(uri);
                    if (match == 1) {
                        a(new io.appmetrica.analytics.impl.B5(new io.appmetrica.analytics.impl.C0384gf(), new io.appmetrica.analytics.impl.C0410hf(), io.appmetrica.analytics.impl.C0327ea.f5833d, "preload info"), contentValues);
                    } else if (match != 2) {
                        io.appmetrica.analytics.impl.AbstractC0362fj.a("Bad content provider uri.", new java.lang.Object[0]);
                    } else {
                        a(new io.appmetrica.analytics.impl.B5(new io.appmetrica.analytics.impl.C0605p3(), new io.appmetrica.analytics.impl.C0631q3(), io.appmetrica.analytics.impl.C0327ea.f5833d, "clids"), contentValues);
                    }
                }
                java.util.concurrent.CountDownLatch countDownLatch = io.appmetrica.analytics.impl.A5.f4032a;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
                return null;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        android.content.Context context = getContext();
        android.content.Context applicationContext = context == null ? null : context.getApplicationContext();
        java.lang.String str = (applicationContext != null ? applicationContext.getPackageName() : "") + ".appmetrica.preloadinfo.retail";
        this.f7200b.addURI(str, "preloadinfo", 1);
        this.f7200b.addURI(str, "clids", 2);
        io.appmetrica.analytics.impl.A5.f4032a = new java.util.concurrent.CountDownLatch(1);
        io.appmetrica.analytics.impl.A5.f4033b = this;
        return true;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        io.appmetrica.analytics.impl.AbstractC0362fj.a("Query is not supported", new java.lang.Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        io.appmetrica.analytics.impl.AbstractC0362fj.a("Updating is not supported", new java.lang.Object[0]);
        return -1;
    }
}
