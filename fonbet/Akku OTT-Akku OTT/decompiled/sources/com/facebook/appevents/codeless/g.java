package com.facebook.appevents.codeless;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.credentials.provider.CredentialEntry;
import androidx.room.l;
import com.facebook.C0688a;
import com.facebook.E;
import com.facebook.G;
import com.facebook.internal.u;
import com.facebook.w;
import com.facebook.z;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g {
    public static final a Companion = new a();
    public static final String e;
    public final Handler a;
    public final WeakReference<Activity> b;
    public Timer c;
    public String d;

    public static final class a {
        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static z a(String str, C0688a c0688a, String str2) {
            String str3;
            Intrinsics.checkNotNullParameter("app_indexing", "requestType");
            if (str == null) {
                return null;
            }
            z.c cVar = z.Companion;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
            cVar.getClass();
            z h = z.c.h(c0688a, format, null, null);
            Bundle bundle = h.d;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("tree", str);
            int i = com.facebook.appevents.internal.g.a;
            Context a = w.a();
            try {
                str3 = a.getPackageManager().getPackageInfo(a.getPackageName(), 0).versionName;
                Intrinsics.checkNotNullExpressionValue(str3, "{\n      val packageInfo …ageInfo.versionName\n    }");
            } catch (PackageManager.NameNotFoundException unused) {
                str3 = "";
            }
            bundle.putString("app_version", str3);
            bundle.putString("platform", "android");
            bundle.putString("request_type", "app_indexing");
            if (Intrinsics.areEqual("app_indexing", "app_indexing")) {
                bundle.putString("device_session_id", com.facebook.appevents.codeless.b.a());
            }
            Intrinsics.checkNotNullParameter(bundle, "<set-?>");
            h.d = bundle;
            h.j(new f());
            return h;
        }
    }

    public static final class b implements Callable<String> {
        public final WeakReference<View> a;

        public b(View rootView) {
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            this.a = new WeakReference<>(rootView);
        }

        @Override // java.util.concurrent.Callable
        public final String call() {
            View view = this.a.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(view.width,…t, Bitmap.Config.RGB_565)");
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(outputStr…eArray(), Base64.NO_WRAP)");
            return encodeToString;
        }
    }

    public static final class c extends TimerTask {
        public c() {
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[Catch: Exception -> 0x00c9, TRY_LEAVE, TryCatch #4 {Exception -> 0x00c9, blocks: (B:3:0x0002, B:7:0x0015, B:13:0x0025, B:19:0x0048, B:21:0x0060, B:25:0x0074, B:27:0x0079, B:28:0x0099, B:42:0x00c5, B:47:0x0096, B:49:0x0071, B:54:0x005d, B:59:0x0041, B:65:0x0011, B:62:0x000d, B:56:0x0039, B:31:0x00aa, B:40:0x00c0, B:37:0x00b1, B:51:0x0059, B:23:0x0065), top: B:2:0x0002, inners: #0, #1, #2, #3, #5, #7 }] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.util.TimerTask, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            WeakReference<Activity> weakReference;
            Activity activity;
            boolean z;
            try {
                boolean b = com.facebook.internal.instrument.crashshield.a.b(g.class);
                Handler handler = null;
                g gVar = g.this;
                if (!b) {
                    try {
                        weakReference = gVar.b;
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, g.class);
                    }
                    activity = weakReference.get();
                    View a = com.facebook.appevents.internal.g.a(activity);
                    if (activity == null && a != null) {
                        String simpleName = activity.getClass().getSimpleName();
                        com.facebook.appevents.codeless.b bVar = com.facebook.appevents.codeless.b.a;
                        z = false;
                        if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.codeless.b.class)) {
                            try {
                                z = com.facebook.appevents.codeless.b.g.get();
                            } catch (Throwable th2) {
                                com.facebook.internal.instrument.crashshield.a.a(th2, com.facebook.appevents.codeless.b.class);
                            }
                        }
                        if (z) {
                            return;
                        }
                        FutureTask futureTask = new FutureTask(new b(a));
                        if (!com.facebook.internal.instrument.crashshield.a.b(g.class)) {
                            try {
                                handler = gVar.a;
                            } catch (Throwable th3) {
                                com.facebook.internal.instrument.crashshield.a.a(th3, g.class);
                            }
                        }
                        handler.post(futureTask);
                        String str = "";
                        try {
                            str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                        } catch (Exception unused) {
                            g.a();
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("screenname", simpleName);
                            jSONObject.put("screenshot", str);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(com.facebook.appevents.codeless.internal.e.d(a));
                            jSONObject.put("view", jSONArray);
                        } catch (JSONException unused2) {
                            g.a();
                        }
                        String jSONObject2 = jSONObject.toString();
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "viewTree.toString()");
                        if (com.facebook.internal.instrument.crashshield.a.b(g.class)) {
                            return;
                        }
                        try {
                            if (!com.facebook.internal.instrument.crashshield.a.b(gVar)) {
                                try {
                                    w.c().execute(new l(1, jSONObject2, gVar));
                                } catch (Throwable th4) {
                                    com.facebook.internal.instrument.crashshield.a.a(th4, gVar);
                                }
                            }
                            return;
                        } catch (Throwable th5) {
                            com.facebook.internal.instrument.crashshield.a.a(th5, g.class);
                            return;
                        }
                    }
                    return;
                }
                weakReference = null;
                activity = weakReference.get();
                View a2 = com.facebook.appevents.internal.g.a(activity);
                if (activity == null) {
                    return;
                }
                String simpleName2 = activity.getClass().getSimpleName();
                com.facebook.appevents.codeless.b bVar2 = com.facebook.appevents.codeless.b.a;
                z = false;
                if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.codeless.b.class)) {
                }
                if (z) {
                }
            } catch (Exception unused3) {
                g.a();
            }
        }
    }

    static {
        String canonicalName = g.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        e = canonicalName;
    }

    public g(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.b = new WeakReference<>(activity);
        this.d = null;
        this.a = new Handler(Looper.getMainLooper());
    }

    public static final /* synthetic */ String a() {
        if (com.facebook.internal.instrument.crashshield.a.b(g.class)) {
            return null;
        }
        try {
            return e;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, g.class);
            return null;
        }
    }

    public final void b(z zVar, String str) {
        if (com.facebook.internal.instrument.crashshield.a.b(this) || zVar == null) {
            return;
        }
        try {
            E c2 = zVar.c();
            try {
                JSONObject jSONObject = c2.b;
                if (jSONObject == null) {
                    Objects.toString(c2.c);
                    return;
                }
                if (Intrinsics.areEqual(CredentialEntry.TRUE_STRING, jSONObject.optString(FirebaseAnalytics.Param.SUCCESS))) {
                    u.a aVar = u.Companion;
                    G g = G.d;
                    String str2 = e;
                    aVar.getClass();
                    u.a.a(g, str2, "Successfully send UI component tree to server");
                    this.d = str;
                }
                if (jSONObject.has("is_app_indexing_enabled")) {
                    boolean z = jSONObject.getBoolean("is_app_indexing_enabled");
                    com.facebook.appevents.codeless.b bVar = com.facebook.appevents.codeless.b.a;
                    if (com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.codeless.b.class)) {
                        return;
                    }
                    try {
                        com.facebook.appevents.codeless.b.g.set(z);
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.appevents.codeless.b.class);
                    }
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, this);
        }
    }

    public final void c() {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            try {
                w.c().execute(new e(0, this, new c()));
            } catch (RejectedExecutionException unused) {
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }
}
