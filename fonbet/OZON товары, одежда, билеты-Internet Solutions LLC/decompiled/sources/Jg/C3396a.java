package Jg;

import Ag.C2429b;
import Hg.c;
import Og.b;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.C9692a;
import tg.C9872a;
import vg.C10317a;
import wg.C10553a;
import xg.C10772a;
import yg.C10897a;
import yg.d;
import yg.g;
import yg.h;
import yg.i;

/* renamed from: Jg.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3396a {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final ConcurrentHashMap<String, AtomicInteger> f14742f = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f14743a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final b f14744b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Kg.a f14745c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C10317a f14746d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicInteger f14747e;

    public C3396a(@NotNull c tracer, @NotNull String libraryPackageName) {
        AtomicInteger putIfAbsent;
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Intrinsics.checkNotNullParameter(libraryPackageName, "libraryPackageName");
        this.f14743a = tracer;
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        this.f14744b = tracer.e();
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Kg.a h11 = tracer.h();
        this.f14745c = h11;
        C10317a.C2232a c2232a = new C10317a.C2232a();
        c2232a.c("CRASH_REPORT");
        c2232a.d(h11);
        this.f14746d = new C10317a(c2232a);
        ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = f14742f;
        AtomicInteger atomicInteger = concurrentHashMap.get(libraryPackageName);
        if (atomicInteger == null && (putIfAbsent = concurrentHashMap.putIfAbsent(libraryPackageName, (atomicInteger = new AtomicInteger()))) != null) {
            atomicInteger = putIfAbsent;
        }
        this.f14747e = atomicInteger;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0161, code lost:
    
        if (kotlin.text.h.t(r5, "test-keys", false) != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0333 A[Catch: all -> 0x0338, TryCatch #3 {all -> 0x0338, blocks: (B:60:0x0319, B:62:0x0333, B:63:0x033c, B:65:0x0345, B:67:0x0348, B:68:0x0366), top: B:59:0x0319, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0345 A[Catch: all -> 0x0338, TryCatch #3 {all -> 0x0338, blocks: (B:60:0x0319, B:62:0x0333, B:63:0x033c, B:65:0x0345, B:67:0x0348, B:68:0x0366), top: B:59:0x0319, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0348 A[Catch: all -> 0x0338, TryCatch #3 {all -> 0x0338, blocks: (B:60:0x0319, B:62:0x0333, B:63:0x033c, B:65:0x0345, B:67:0x0348, B:68:0x0366), top: B:59:0x0319, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(@NotNull Throwable e11, @NotNull List logs, @NotNull Tc.b bVar) {
        long j11;
        boolean z11;
        int i11;
        JSONArray jSONArray;
        JSONObject jSONObject;
        String sb2;
        byte[] content;
        int j12;
        long longVersionCode;
        c cVar = this.f14743a;
        Intrinsics.checkNotNullParameter(e11, "e");
        Intrinsics.checkNotNullParameter(logs, "logs");
        Tc.b tags = bVar;
        Intrinsics.checkNotNullParameter(tags, "tags");
        if (this.f14745c.b("CRASH_REPORT")) {
            Log.e("Tracer", "Feature CRASH_REPORT limited");
            return;
        }
        if (this.f14747e.incrementAndGet() > 8) {
            Log.d("Tracer", "Can't handle non fatal exception. Max non fatal count is reached for this session.");
            return;
        }
        try {
            String f7 = cVar.f();
            if (f7 == null) {
                try {
                    throw new IllegalStateException("No lib token");
                } catch (Exception unused) {
                    Log.e("Tracer", "No lib token");
                    return;
                }
            }
            String a11 = C9692a.a(cVar.c());
            Context context = cVar.c();
            Hg.b libraryInfo = cVar.g();
            Date date = new Date();
            if (tags.isEmpty()) {
                tags = null;
            }
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(libraryInfo, "libraryInfo");
            JSONObject jSONObject2 = new JSONObject();
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            jSONObject2.put("packageName", C10553a.a(packageManager, packageName).packageName);
            PackageManager packageManager2 = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager2, "context.packageManager");
            String packageName2 = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName2, "context.packageName");
            jSONObject2.put("versionName", C10553a.a(packageManager2, packageName2).versionName);
            PackageManager packageManager3 = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager3, "context.packageManager");
            String packageName3 = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName3, "context.packageName");
            PackageInfo a12 = C10553a.a(packageManager3, packageName3);
            Intrinsics.checkNotNullParameter(a12, "<this>");
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 28) {
                longVersionCode = a12.getLongVersionCode();
                j11 = longVersionCode;
            } else {
                j11 = a12.versionCode;
            }
            jSONObject2.put("versionCode", j11);
            jSONObject2.put("buildUuid", C9872a.a(context));
            jSONObject2.put("sessionUuid", Dg.b.a());
            String str = Build.MODEL;
            jSONObject2.put("device", str);
            jSONObject2.put("deviceId", C10772a.a(context));
            String str2 = Build.MANUFACTURER;
            jSONObject2.put("vendor", str2);
            jSONObject2.put("osVersion", String.valueOf(i12));
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            int i13 = runningAppProcessInfo.importance;
            jSONObject2.put("inBackground", !(i13 == 100 || i13 == 200));
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            String str3 = Build.PRODUCT;
            boolean z12 = "sdk".equals(str3) || "google_sdk".equals(str3) || string == null;
            String str4 = Build.TAGS;
            boolean z13 = (z12 || str4 == null) ? z12 : z12;
            try {
                try {
                    if (!new File("/system/app/Superuser.apk").exists()) {
                        File file = new File("/system/xbin/su");
                        if (z13 || !file.exists()) {
                            z11 = false;
                            jSONObject2.put("isRooted", z11);
                            JSONObject jSONObject3 = new JSONObject();
                            Intrinsics.checkNotNullParameter(date, "date");
                            String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.US).format(date);
                            Intrinsics.checkNotNullExpressionValue(format, "{\n        SimpleDateForm…      .format(date)\n    }");
                            jSONObject3.put("date", format);
                            jSONObject3.put("board", Build.BOARD);
                            jSONObject3.put("brand", Build.BRAND);
                            jSONObject3.put("cpuABI", TextUtils.join(", ", Build.SUPPORTED_ABIS));
                            jSONObject3.put("device", Build.DEVICE);
                            jSONObject3.put("manufacturer", str2);
                            jSONObject3.put("model", str);
                            jSONObject3.put("cpuCount", String.valueOf(Runtime.getRuntime().availableProcessors()));
                            jSONObject3.put("osVersionSdkInt", String.valueOf(i12));
                            jSONObject3.put("osVersionRelease", Build.VERSION.RELEASE);
                            jSONObject2.put("properties", jSONObject3);
                            if (tags == null) {
                                jSONArray = new JSONArray();
                                i11 = 0;
                                ListIterator listIterator = tags.listIterator(0);
                                while (listIterator.hasNext()) {
                                    jSONArray.put((String) listIterator.next());
                                }
                            } else {
                                i11 = 0;
                                jSONArray = null;
                            }
                            jSONObject2.put("tags", jSONArray);
                            if (libraryInfo != null) {
                                jSONObject = null;
                            } else {
                                jSONObject = new JSONObject();
                                jSONObject.put("packageName", libraryInfo.b());
                                jSONObject.put("versionName", libraryInfo.c());
                                jSONObject.put("buildUuid", libraryInfo.a());
                            }
                            jSONObject2.put("libraryInfo", jSONObject);
                            String jSONObject4 = jSONObject2.toString();
                            Intrinsics.checkNotNullExpressionValue(jSONObject4, "uploadBean.toString()");
                            StringBuilder sb3 = new StringBuilder();
                            Eg.a.b(e11, sb3);
                            String sb4 = sb3.toString();
                            Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
                            byte[] content2 = C2429b.a(sb4);
                            if (logs.isEmpty()) {
                                StringBuilder sb5 = new StringBuilder();
                                Iterator it = logs.iterator();
                                while (true) {
                                    int i14 = i11;
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    i11 = i14 + 1;
                                    ((Ig.a) it.next()).a(i14, sb5);
                                }
                                sb2 = sb5.toString();
                                Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
                            } else {
                                sb2 = null;
                            }
                            content = sb2 == null ? C2429b.a(sb2) : null;
                            Uri.Builder appendQueryParameter = Uri.parse(cVar.b().a()).buildUpon().appendEncodedPath("api/crash/upload").appendQueryParameter("crashToken", f7);
                            if (a11 != null) {
                                appendQueryParameter.appendQueryParameter("crashHostAppToken", a11);
                            }
                            String builder = appendQueryParameter.toString();
                            Intrinsics.checkNotNullExpressionValue(builder, "tracer.configuration.api…}\n            .toString()");
                            d dVar = new d();
                            dVar.b();
                            int i15 = h.f106612p0;
                            Intrinsics.checkNotNullParameter("application/octet-stream", "contentType");
                            Intrinsics.checkNotNullParameter(content2, "content");
                            dVar.a("stackTrace", "stack.gzip", new C10897a("application/octet-stream", content2));
                            dVar.a("uploadBean", null, h.a.a("application/json; charset=utf-8", jSONObject4));
                            if (content != null) {
                                Intrinsics.checkNotNullParameter("application/octet-stream", "contentType");
                                Intrinsics.checkNotNullParameter(content, "content");
                                dVar.a("logs", "logs.gzip", new C10897a("application/octet-stream", content));
                            }
                            i a13 = this.f14744b.c().a(new g(builder, dVar.c()));
                            j12 = a13.j();
                            String d11 = a13.d();
                            String c11 = a13.c().c();
                            byte[] j13 = a13.c().j();
                            this.f14746d.a(c11, j13 == null ? kotlin.text.h.x(j13) : null);
                            if (j12 != 200) {
                                Unit unit = Unit.f71690a;
                                return;
                            }
                            throw new IOException("HTTP " + j12 + ' ' + d11);
                        }
                    }
                    j12 = a13.j();
                    String d112 = a13.d();
                    String c112 = a13.c().c();
                    byte[] j132 = a13.c().j();
                    this.f14746d.a(c112, j132 == null ? kotlin.text.h.x(j132) : null);
                    if (j12 != 200) {
                    }
                } finally {
                }
                i a132 = this.f14744b.c().a(new g(builder, dVar.c()));
            } catch (IOException e12) {
                Log.e("ru.ok.tracer", "Tracer crash report failed", e12);
                return;
            }
            z11 = true;
            jSONObject2.put("isRooted", z11);
            JSONObject jSONObject32 = new JSONObject();
            Intrinsics.checkNotNullParameter(date, "date");
            String format2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.US).format(date);
            Intrinsics.checkNotNullExpressionValue(format2, "{\n        SimpleDateForm…      .format(date)\n    }");
            jSONObject32.put("date", format2);
            jSONObject32.put("board", Build.BOARD);
            jSONObject32.put("brand", Build.BRAND);
            jSONObject32.put("cpuABI", TextUtils.join(", ", Build.SUPPORTED_ABIS));
            jSONObject32.put("device", Build.DEVICE);
            jSONObject32.put("manufacturer", str2);
            jSONObject32.put("model", str);
            jSONObject32.put("cpuCount", String.valueOf(Runtime.getRuntime().availableProcessors()));
            jSONObject32.put("osVersionSdkInt", String.valueOf(i12));
            jSONObject32.put("osVersionRelease", Build.VERSION.RELEASE);
            jSONObject2.put("properties", jSONObject32);
            if (tags == null) {
            }
            jSONObject2.put("tags", jSONArray);
            if (libraryInfo != null) {
            }
            jSONObject2.put("libraryInfo", jSONObject);
            String jSONObject42 = jSONObject2.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject42, "uploadBean.toString()");
            StringBuilder sb32 = new StringBuilder();
            Eg.a.b(e11, sb32);
            String sb42 = sb32.toString();
            Intrinsics.checkNotNullExpressionValue(sb42, "StringBuilder().apply(builderAction).toString()");
            byte[] content22 = C2429b.a(sb42);
            if (logs.isEmpty()) {
            }
            if (sb2 == null) {
            }
            Uri.Builder appendQueryParameter2 = Uri.parse(cVar.b().a()).buildUpon().appendEncodedPath("api/crash/upload").appendQueryParameter("crashToken", f7);
            if (a11 != null) {
            }
            String builder2 = appendQueryParameter2.toString();
            Intrinsics.checkNotNullExpressionValue(builder2, "tracer.configuration.api…}\n            .toString()");
            d dVar2 = new d();
            dVar2.b();
            int i152 = h.f106612p0;
            Intrinsics.checkNotNullParameter("application/octet-stream", "contentType");
            Intrinsics.checkNotNullParameter(content22, "content");
            dVar2.a("stackTrace", "stack.gzip", new C10897a("application/octet-stream", content22));
            dVar2.a("uploadBean", null, h.a.a("application/json; charset=utf-8", jSONObject42));
            if (content != null) {
            }
        } catch (Exception unused2) {
        }
    }
}
