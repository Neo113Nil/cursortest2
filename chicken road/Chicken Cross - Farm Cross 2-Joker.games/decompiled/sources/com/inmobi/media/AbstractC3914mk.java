package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.webkit.WebSettings;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;

/* renamed from: com.inmobi.media.mk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3914mk {

    /* renamed from: a, reason: collision with root package name */
    public static Context f7252a = null;
    public static String b = "";
    public static String c;
    public static final AtomicBoolean d = new AtomicBoolean();
    public static final AtomicLong e = new AtomicLong(0);
    public static final Lazy f = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.mk$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC3914mk.a();
        }
    });
    public static boolean g;
    public static final ExecutorService h;
    public static final CoroutineScope i;
    public static int j;

    public static final C4214xd a() {
        return new C4214xd();
    }

    public static final String b() {
        if (b.length() == 0) {
            b = b(f7252a);
        }
        return b;
    }

    public static final boolean c() {
        return j == 2;
    }

    public static boolean c(Context context) {
        return true;
    }

    public static void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            AbstractC4126u7.a(new File(context != null ? context.getFilesDir() : null, "im_cached_content"));
        } catch (Exception e2) {
            Intrinsics.checkNotNullExpressionValue("mk", "TAG");
            String str = "SDK encountered unexpected error in clearMediaCacheDirectory; " + e2.getMessage();
        }
    }

    public static String b(Context context) {
        Context applicationContext;
        String str = "";
        if (context != null) {
            try {
                applicationContext = context.getApplicationContext();
            } catch (Exception e2) {
                try {
                    throw new C3889ln(e2.getMessage());
                } catch (C3889ln e3) {
                    Intrinsics.checkNotNullExpressionValue("mk", "TAG");
                    String str2 = "SDK encountered an unexpected error in getting user agent information; " + e3.getMessage();
                    Lazy lazy = Ba.f6473a;
                    Ba.a(new C3810j3(e3));
                    try {
                        String property = System.getProperty("http.agent");
                        if (property != null) {
                            str = property;
                        }
                        Intrinsics.checkNotNullExpressionValue("mk", "TAG");
                        String str3 = "Using system-defined User Agent: " + str;
                    } catch (Exception e4) {
                        Intrinsics.checkNotNullExpressionValue("mk", "TAG");
                        String str4 = "SDK encountered an unexpected error in getting property of http.agent; " + e4.getMessage();
                        Intrinsics.checkNotNullExpressionValue("mk", "TAG");
                        Lazy lazy2 = Ba.f6473a;
                        U9.a(e4);
                    }
                    return str;
                } catch (Exception e5) {
                    Intrinsics.checkNotNullExpressionValue("mk", "TAG");
                    String str5 = "SDK encountered an unexpected error in getting user agent information; " + e5.getMessage();
                    return str;
                }
            }
        } else {
            applicationContext = null;
        }
        String defaultUserAgent = WebSettings.getDefaultUserAgent(applicationContext);
        Intrinsics.checkNotNull(defaultUserAgent);
        return defaultUserAgent;
    }

    public static final void a(Context context, Application.ActivityLifecycleCallbacks lifecycleCallbacks) {
        Intrinsics.checkNotNullParameter(lifecycleCallbacks, "lifecycleCallbacks");
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            activity.getApplication().unregisterActivityLifecycleCallbacks(lifecycleCallbacks);
            activity.getApplication().registerActivityLifecycleCallbacks(lifecycleCallbacks);
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("mk", "TAG");
        Intrinsics.checkNotNullParameter("mk", "name");
        ExecutorService COMPONENT_SERVICE = Executors.newSingleThreadExecutor(new ThreadFactoryC3932na("mk", false));
        h = COMPONENT_SERVICE;
        Intrinsics.checkNotNullExpressionValue(COMPONENT_SERVICE, "COMPONENT_SERVICE");
        i = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(COMPONENT_SERVICE));
    }
}
