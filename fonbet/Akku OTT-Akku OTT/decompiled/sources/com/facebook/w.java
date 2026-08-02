package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import androidx.annotation.RestrictTo;
import androidx.media3.common.C0338w;
import androidx.media3.session.legacy.PlaybackStateCompat;
import com.facebook.C0688a;
import com.facebook.FacebookActivity;
import com.facebook.appevents.l;
import com.facebook.internal.C0706b;
import com.facebook.internal.C0715k;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;

@SourceDebugExtension({"SMAP\nFacebookSdk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacebookSdk.kt\ncom/facebook/FacebookSdk\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1209:1\n1#2:1210\n*E\n"})
/* loaded from: classes3.dex */
public final class w {
    public static Executor d;
    public static volatile String e;
    public static volatile String f;
    public static volatile String g;
    public static volatile Boolean h;
    public static Context j;
    public static final String m;

    @JvmField
    public static boolean n;

    @JvmField
    public static boolean o;

    @JvmField
    public static boolean p;
    public static final AtomicBoolean q;
    public static volatile String r;
    public static volatile String s;
    public static final C0338w t;
    public static boolean u;
    public static final w a = new w();
    public static final String b = w.class.getCanonicalName();
    public static final HashSet<G> c = SetsKt.hashSetOf(G.e);
    public static final AtomicLong i = new AtomicLong(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
    public static int k = 64206;
    public static final ReentrantLock l = new ReentrantLock();

    static {
        int i2 = com.facebook.internal.A.a;
        m = "v16.0";
        q = new AtomicBoolean(false);
        r = "instagram.com";
        s = "facebook.com";
        t = new C0338w();
    }

    @JvmStatic
    public static final Context a() {
        com.facebook.internal.F.f();
        Context context = j;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
        return null;
    }

    @JvmStatic
    public static final String b() {
        com.facebook.internal.F.f();
        String str = e;
        if (str != null) {
            return str;
        }
        throw new C0728q("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    @JvmStatic
    public static final Executor c() {
        ReentrantLock reentrantLock = l;
        reentrantLock.lock();
        try {
            if (d == null) {
                d = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            Executor executor = d;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @JvmStatic
    public static final String d() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = m;
        Intrinsics.checkNotNullExpressionValue(String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{str}, 1)), "format(format, *args)");
        com.facebook.internal.E e2 = com.facebook.internal.E.a;
        return str;
    }

    @JvmStatic
    public static final String e() {
        String replace$default;
        String replace$default2;
        C0688a.Companion.getClass();
        C0688a b2 = C0688a.b.b();
        String str = b2 != null ? b2.m : null;
        com.facebook.internal.E e2 = com.facebook.internal.E.a;
        String str2 = s;
        if (str != null) {
            if (Intrinsics.areEqual(str, "gaming")) {
                replace$default2 = StringsKt__StringsJVMKt.replace$default(str2, "facebook.com", "fb.gg", false, 4, (Object) null);
                return replace$default2;
            }
            if (Intrinsics.areEqual(str, "instagram")) {
                replace$default = StringsKt__StringsJVMKt.replace$default(str2, "facebook.com", "instagram.com", false, 4, (Object) null);
                return replace$default;
            }
        }
        return str2;
    }

    @JvmStatic
    public static final boolean f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        com.facebook.internal.F.f();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final synchronized boolean g() {
        boolean z;
        synchronized (w.class) {
            z = u;
        }
        return z;
    }

    @JvmStatic
    public static final void h(G behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        synchronized (c) {
        }
    }

    @JvmStatic
    public static final void i(Context context) {
        boolean startsWith$default;
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "try {\n                co…     return\n            }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (e == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale locale = Locale.ROOT;
                    startsWith$default = StringsKt__StringsJVMKt.startsWith$default(androidx.collection.a.c(locale, "ROOT", str, locale, "this as java.lang.String).toLowerCase(locale)"), "fb", false, 2, null);
                    if (startsWith$default) {
                        String substring = str.substring(2);
                        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                        e = substring;
                    } else {
                        e = str;
                    }
                } else if (obj instanceof Number) {
                    throw new C0728q("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            applicationInfo.metaData.getString("com.facebook.sdk.RedirectURI");
            applicationInfo.metaData.getString("com.facebook.sdk.IntentUriPackageTarget");
            if (f == null) {
                f = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (g == null) {
                g = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (k == 64206) {
                k = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (h == null) {
                h = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @Deprecated(message = "sdkInitialize is called automatically on app start. Use FacebookSdk.fullyInitialize() instead.")
    @JvmStatic
    public static final synchronized void j(Context context) {
        synchronized (w.class) {
            Intrinsics.checkNotNullParameter(context, "applicationContext");
            if (q.get()) {
                return;
            }
            try {
                FacebookActivity.Companion companion = FacebookActivity.INSTANCE;
                com.facebook.internal.F.b(context);
            } catch (ClassNotFoundException unused) {
            }
            int i2 = com.facebook.internal.F.a;
            Intrinsics.checkNotNullParameter(context, "context");
            context.checkCallingOrSelfPermission("android.permission.INTERNET");
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext.applicationContext");
            j = applicationContext;
            com.facebook.appevents.l.Companion.getClass();
            l.a.b(context);
            Context context2 = j;
            Context context3 = null;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                context2 = null;
            }
            i(context2);
            String str = e;
            if (str == null || str.length() == 0) {
                throw new C0728q("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
            }
            String str2 = g;
            if (str2 == null || str2.length() == 0) {
                throw new C0728q("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
            }
            q.set(true);
            S s2 = S.a;
            boolean z = false;
            if (!com.facebook.internal.instrument.crashshield.a.b(S.class)) {
                try {
                    S.a.e();
                    z = S.d.a();
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, S.class);
                }
            }
            if (z) {
                u = true;
            }
            Context context4 = j;
            if (context4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                context4 = null;
            }
            if ((context4 instanceof Application) && S.c()) {
                Context context5 = j;
                if (context5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                    context5 = null;
                }
                com.facebook.appevents.internal.f.c((Application) context5, e);
            } else {
                com.facebook.appevents.iap.r.g();
            }
            com.facebook.appevents.internal.i a2 = com.facebook.appevents.internal.i.Companion.a();
            if (a2 != null) {
                Context context6 = j;
                if (context6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                    context6 = null;
                }
                Application application = (Application) context6;
                if (!com.facebook.internal.instrument.crashshield.a.b(a2)) {
                    try {
                        Intrinsics.checkNotNullParameter(application, "application");
                        application.registerActivityLifecycleCallbacks(new com.facebook.appevents.internal.j());
                    } catch (Throwable th2) {
                        com.facebook.internal.instrument.crashshield.a.a(th2, a2);
                    }
                }
            }
            com.facebook.internal.p.d();
            com.facebook.internal.w.l();
            C0706b.a aVar = C0706b.Companion;
            Context context7 = j;
            if (context7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
            } else {
                context3 = context7;
            }
            aVar.getClass();
            C0706b.a.a(context3);
            final u callable = new u();
            Intrinsics.checkNotNullParameter(callable, "callable");
            final com.facebook.internal.t tVar = new com.facebook.internal.t();
            tVar.b = new CountDownLatch(1);
            c().execute(new FutureTask(new Callable() { // from class: com.facebook.internal.s
                /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    t this$0 = t.this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    com.facebook.u callable2 = callable;
                    Intrinsics.checkNotNullParameter(callable2, "$callable");
                    try {
                        this$0.a = callable2.call();
                    } finally {
                        CountDownLatch countDownLatch = this$0.b;
                        if (countDownLatch != null) {
                            countDownLatch.countDown();
                        }
                    }
                }
            }));
            C0715k.a(new androidx.media3.common.audio.k(), C0715k.b.Instrument);
            C0715k.a(new androidx.media3.common.audio.l(), C0715k.b.AppEvents);
            C0715k.a(new androidx.media3.common.audio.m(), C0715k.b.ChromeCustomTabsPrefetching);
            C0715k.a(new androidx.fragment.app.u(), C0715k.b.IgnoreAppSwitchToLoggedOut);
            C0715k.a(new androidx.fragment.app.v(), C0715k.b.BypassAppSwitch);
            c().execute(new FutureTask(new v()));
        }
    }
}
