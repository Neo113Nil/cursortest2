package io.appmetrica.analytics.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import b2.AbstractC0279e;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.AbstractC0777kj;
import io.appmetrica.analytics.impl.C0794la;
import io.appmetrica.analytics.impl.C0799lf;
import io.appmetrica.analytics.impl.C0825mf;
import io.appmetrica.analytics.impl.C1098x3;
import io.appmetrica.analytics.impl.C1123y3;
import io.appmetrica.analytics.impl.H5;
import io.appmetrica.analytics.impl.I5;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public class PreloadInfoContentProvider extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    private boolean f9685a = false;

    /* renamed from: b, reason: collision with root package name */
    private final UriMatcher f9686b = new UriMatcher(-1);

    private void a(I5 i52, ContentValues contentValues) {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        if (applicationContext != null) {
            try {
                Object invoke = i52.f6933a.invoke(contentValues);
                if (invoke != null) {
                    i52.f6935c.b(applicationContext);
                    if (((Boolean) i52.f6934b.invoke(invoke)).booleanValue()) {
                        AbstractC0777kj.a("Successfully saved " + i52.f6936d, new Object[0]);
                    } else {
                        AbstractC0777kj.a("Did not save " + i52.f6936d + " because data is already present", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                ImportantLogger.INSTANCE.info("AppMetrica-Attribution", "Unexpected error occurred\n" + StringUtils.throwableToString(th), new Object[0]);
            }
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        AbstractC0777kj.a("Deleting is not supported", new Object[0]);
        return -1;
    }

    public synchronized void disable() {
        this.f9685a = true;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        synchronized (this) {
            try {
                if (this.f9685a) {
                    return null;
                }
                if (contentValues != null) {
                    int match = this.f9686b.match(uri);
                    if (match == 1) {
                        a(new I5(new C0799lf(), new C0825mf(), C0794la.f8723d, "preload info"), contentValues);
                    } else if (match != 2) {
                        AbstractC0777kj.a("Bad content provider uri.", new Object[0]);
                    } else {
                        a(new I5(new C1098x3(), new C1123y3(), C0794la.f8723d, "clids"), contentValues);
                    }
                }
                CountDownLatch countDownLatch = H5.f6855a;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        String e3 = AbstractC0279e.e(applicationContext != null ? applicationContext.getPackageName() : "", ".appmetrica.preloadinfo.retail");
        this.f9686b.addURI(e3, "preloadinfo", 1);
        this.f9686b.addURI(e3, "clids", 2);
        H5.f6855a = new CountDownLatch(1);
        H5.f6856b = this;
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        AbstractC0777kj.a("Query is not supported", new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        AbstractC0777kj.a("Updating is not supported", new Object[0]);
        return -1;
    }
}
