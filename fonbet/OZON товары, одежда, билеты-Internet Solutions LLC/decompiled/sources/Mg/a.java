package Mg;

import Fg.C3049a;
import Hg.c;
import Lg.C3594a;
import Og.b;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.ListIterator;
import java.util.Map;
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
import yg.g;
import yg.h;
import yg.i;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f18076a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f18077b;

    /* renamed from: c, reason: collision with root package name */
    private final long f18078c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f18079d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final b f18080e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C10317a f18081f;

    public a(@NotNull c tracer) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        this.f18076a = tracer;
        Context c11 = tracer.c();
        PackageManager packageManager = c11.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
        String packageName = c11.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        PackageInfo a11 = C10553a.a(packageManager, packageName);
        String str = a11.versionName;
        Intrinsics.checkNotNullExpressionValue(str, "packageInfo.versionName");
        this.f18077b = str;
        Intrinsics.checkNotNullParameter(a11, "<this>");
        this.f18078c = Build.VERSION.SDK_INT >= 28 ? a11.getLongVersionCode() : a11.versionCode;
        String str2 = a11.packageName;
        Intrinsics.checkNotNullExpressionValue(str2, "packageInfo.packageName");
        this.f18079d = str2;
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        this.f18080e = tracer.e();
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Kg.a h11 = tracer.h();
        C10317a.C2232a c2232a = new C10317a.C2232a();
        c2232a.d(h11);
        c2232a.c("PERFORMANCE_METRICS");
        this.f18081f = new C10317a(c2232a);
    }

    public final void a(@NotNull Tc.b samples) {
        c cVar = this.f18076a;
        Intrinsics.checkNotNullParameter(samples, "samples");
        try {
            String f7 = cVar.f();
            if (f7 == null) {
                throw new IllegalStateException("No lib token");
            }
            String a11 = C9692a.a(cVar.c());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("versionName", this.f18077b);
            jSONObject.put("versionCode", this.f18078c);
            jSONObject.put("packageName", this.f18079d);
            jSONObject.put("buildUuid", C9872a.a(cVar.c()));
            jSONObject.put("sessionUuid", Dg.b.a());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("packageName", cVar.g().b());
            jSONObject2.put("versionName", cVar.g().c());
            jSONObject2.put("buildUuid", cVar.g().a());
            Unit unit = Unit.f71690a;
            jSONObject.put("libraryInfo", jSONObject2);
            jSONObject.put("deviceId", C10772a.a(cVar.c()));
            jSONObject.put("device", Build.MODEL);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("osVersion", String.valueOf(Build.VERSION.SDK_INT));
            jSONObject.put("clientTimeUnixNano", C3049a.a());
            JSONArray jSONArray = new JSONArray();
            ListIterator listIterator = samples.listIterator(0);
            while (true) {
                JSONObject jSONObject3 = null;
                if (!listIterator.hasNext()) {
                    break;
                }
                C3594a c3594a = (C3594a) listIterator.next();
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("timeUnixNano", c3594a.c());
                jSONObject4.put(AppMeasurementSdk.ConditionalUserProperty.NAME, c3594a.b());
                jSONObject4.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, c3594a.e());
                jSONObject4.put("unit", c3594a.d());
                Map<String, Object> a12 = c3594a.a();
                if (a12.isEmpty()) {
                    a12 = null;
                }
                if (a12 != null) {
                    jSONObject3 = new JSONObject();
                    for (Map.Entry<String, Object> entry : a12.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            jSONObject3.put(key, value);
                        } else if (value instanceof Boolean) {
                            jSONObject3.put(key, ((Boolean) value).booleanValue());
                        } else if (value instanceof Long) {
                            jSONObject3.put(key, ((Number) value).longValue());
                        } else if (value instanceof Double) {
                            jSONObject3.put(key, ((Number) value).doubleValue());
                        } else if (value instanceof Byte) {
                            jSONObject3.put(key, value);
                        } else if (value instanceof Short) {
                            jSONObject3.put(key, value);
                        } else if (value instanceof Integer) {
                            jSONObject3.put(key, ((Number) value).intValue());
                        } else if (value instanceof Float) {
                            jSONObject3.put(key, value);
                        } else {
                            jSONObject3.put(key, value.toString());
                        }
                    }
                }
                jSONObject4.put("attributes", jSONObject3);
                jSONArray.put(jSONObject4);
            }
            jSONObject.put("samples", jSONArray);
            Uri.Builder appendQueryParameter = Uri.parse(cVar.b().a()).buildUpon().appendEncodedPath("api/perf/upload").appendQueryParameter("crashToken", f7);
            if (a11 != null) {
                appendQueryParameter.appendQueryParameter("crashHostAppToken", a11);
            }
            String builder = appendQueryParameter.toString();
            Intrinsics.checkNotNullExpressionValue(builder, "tracer.configuration.api…}\n            .toString()");
            int i11 = h.f106612p0;
            String jSONObject5 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject5, "bodyJsonObject.toString()");
            try {
                i a13 = this.f18080e.c().a(new g(builder, h.a.a("application/json; charset=utf-8", jSONObject5)));
                try {
                    int j11 = a13.j();
                    String d11 = a13.d();
                    String c11 = a13.c().c();
                    byte[] j12 = a13.c().j();
                    this.f18081f.a(c11, j12 != null ? kotlin.text.h.x(j12) : null);
                    if (j11 == 200) {
                        Unit unit2 = Unit.f71690a;
                        return;
                    }
                    throw new IOException("HTTP " + j11 + ' ' + d11);
                } finally {
                }
            } catch (IOException e11) {
                Log.e("ru.ok.tracer", "Tracer crash report failed", e11);
            }
        } catch (Exception unused) {
            Log.e("Tracer", "No lib token");
        }
    }
}
