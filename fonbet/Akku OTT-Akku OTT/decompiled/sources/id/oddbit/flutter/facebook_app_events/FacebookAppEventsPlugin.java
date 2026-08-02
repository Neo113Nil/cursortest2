package id.oddbit.flutter.facebook_app_events;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.b;
import com.facebook.S;
import com.facebook.appevents.C0691c;
import com.facebook.appevents.F;
import com.facebook.appevents.H;
import com.facebook.appevents.internal.f;
import com.facebook.appevents.internal.g;
import com.facebook.appevents.j;
import com.facebook.appevents.l;
import com.facebook.appevents.p;
import com.facebook.appevents.w;
import com.facebook.appevents.z;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.analytics.Constants;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u000f2\b\b\u0001\u0010\u0013\u001a\u00020\u0011H\u0016J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010 \u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010!\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010#\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\"\u0010$\u001a\u0004\u0018\u00010%2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010(\u0018\u00010'H\u0002J\u0018\u0010)\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010*\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010+\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lid/oddbit/flutter/facebook_app_events/FacebookAppEventsPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "channel", "Lio/flutter/plugin/common/MethodChannel;", "appEventsLogger", "Lcom/facebook/appevents/AppEventsLogger;", "anonymousId", "", "logTag", "application", "Landroid/app/Application;", "onAttachedToEngine", "", "flutterPluginBinding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onDetachedFromEngine", "binding", "onMethodCall", NotificationCompat.CATEGORY_CALL, "Lio/flutter/plugin/common/MethodCall;", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "handleActivateApp", "handleClearUserData", "handleSetUserData", "handleClearUserId", "handleFlush", "handleGetApplicationId", "handleGetAnonymousId", "handleSetAdvertiserTracking", "handleLogEvent", "handlePushNotificationOpen", "handleSetUserId", "createBundleFromMap", "Landroid/os/Bundle;", "parameterMap", "", "", "handleSetAutoLogAppEventsEnabled", "handleSetDataProcessingOptions", "handlePurchased", "facebook_app_events_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFacebookAppEventsPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacebookAppEventsPlugin.kt\nid/oddbit/flutter/facebook_app_events/FacebookAppEventsPlugin\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,255:1\n37#2,2:256\n*S KotlinDebug\n*F\n+ 1 FacebookAppEventsPlugin.kt\nid/oddbit/flutter/facebook_app_events/FacebookAppEventsPlugin\n*L\n236#1:256,2\n*E\n"})
/* renamed from: id.oddbit.flutter.facebook_app_events.a, reason: from Kotlin metadata */
/* loaded from: classes4.dex */
public final class FacebookAppEventsPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler {
    public MethodChannel a;
    public l b;
    public String c;
    public Application d;

    public static Bundle a(Map map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            String str = (String) entry.getKey();
            if (value != null) {
                if (value instanceof String) {
                    bundle.putString(str, (String) value);
                } else if (value instanceof Integer) {
                    bundle.putInt(str, ((Number) value).intValue());
                } else if (value instanceof Long) {
                    bundle.putLong(str, ((Number) value).longValue());
                } else if (value instanceof Double) {
                    bundle.putDouble(str, ((Number) value).doubleValue());
                } else if (value instanceof Boolean) {
                    bundle.putBoolean(str, ((Boolean) value).booleanValue());
                } else {
                    boolean z = value instanceof Map;
                    if (!z) {
                        throw new IllegalArgumentException("Unsupported value type: " + Reflection.getOrCreateKotlinClass(value.getClass()));
                    }
                    Bundle a = a(z ? (Map) value : null);
                    if (a != null) {
                        bundle.putBundle(str, a);
                    }
                }
            }
        }
        return bundle;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "flutter.oddbit.id/facebook_app_events");
        this.a = methodChannel;
        methodChannel.setMethodCallHandler(this);
        Context applicationContext = flutterPluginBinding.getApplicationContext().getApplicationContext();
        this.d = applicationContext instanceof Application ? (Application) applicationContext : null;
        l.a aVar = l.Companion;
        Context context = flutterPluginBinding.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        aVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        this.b = new l(context);
        Context applicationContext2 = flutterPluginBinding.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        this.c = l.a.b(applicationContext2);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.d = null;
        MethodChannel methodChannel = this.a;
        if (methodChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = call.method;
        if (str != null) {
            String str2 = null;
            switch (str.hashCode()) {
                case -2129152299:
                    if (str.equals("getApplicationId")) {
                        l lVar = this.b;
                        if (lVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("appEventsLogger");
                            lVar = null;
                        }
                        p pVar = lVar.a;
                        pVar.getClass();
                        if (!com.facebook.internal.instrument.crashshield.a.b(pVar)) {
                            try {
                                str2 = pVar.b.a;
                            } catch (Throwable th) {
                                com.facebook.internal.instrument.crashshield.a.a(th, pVar);
                            }
                        }
                        result.success(str2);
                        return;
                    }
                    break;
                case -1529535789:
                    if (str.equals("clearUserID")) {
                        l.Companion.getClass();
                        C0691c c0691c = C0691c.a;
                        int i = g.a;
                        if (!C0691c.d) {
                            C0691c.a.getClass();
                            C0691c.a();
                        }
                        z.Companion.getClass();
                        z.a.a().execute(new b(null, 1));
                        result.success(null);
                        return;
                    }
                    break;
                case -1146936274:
                    if (str.equals("activateApp")) {
                        Application application = this.d;
                        if (application == null) {
                            result.error("missing_application", "could not activate app: Android application is missing", null);
                            return;
                        }
                        Object argument = call.argument("applicationId");
                        String str3 = argument instanceof String ? (String) argument : null;
                        l.Companion.getClass();
                        l.a.a(application, str3);
                        result.success(null);
                        return;
                    }
                    break;
                case -1005195390:
                    if (str.equals("clearUserData")) {
                        l.Companion.getClass();
                        H h = H.a;
                        if (!com.facebook.internal.instrument.crashshield.a.b(H.class)) {
                            try {
                                z.Companion.getClass();
                                z.a.a().execute(new F());
                            } catch (Throwable th2) {
                                com.facebook.internal.instrument.crashshield.a.a(th2, H.class);
                            }
                        }
                        result.success(null);
                        return;
                    }
                    break;
                case -811628443:
                    if (str.equals("logPurchase")) {
                        Double d = (Double) call.argument("amount");
                        BigDecimal bigDecimal = d != null ? new BigDecimal(String.valueOf(d.doubleValue())) : null;
                        String str4 = (String) call.argument(FirebaseAnalytics.Param.CURRENCY);
                        if (bigDecimal == null || str4 == null) {
                            result.error("INVALID_ARGUMENT", "Amount and currency are required", null);
                            return;
                        }
                        Currency currency = Currency.getInstance(str4);
                        Bundle a = a((Map) call.argument(Constants.PARAMETERS));
                        if (a == null) {
                            a = new Bundle();
                        }
                        Bundle bundle = a;
                        l lVar2 = this.b;
                        if (lVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("appEventsLogger");
                            lVar2 = null;
                        }
                        p pVar2 = lVar2.a;
                        pVar2.getClass();
                        if (!com.facebook.internal.instrument.crashshield.a.b(pVar2)) {
                            try {
                                if (!com.facebook.internal.instrument.crashshield.a.b(p.class)) {
                                    try {
                                        pVar2.i(bigDecimal, currency, bundle, false, null);
                                    } catch (Throwable th3) {
                                        com.facebook.internal.instrument.crashshield.a.a(th3, p.class);
                                    }
                                }
                            } catch (Throwable th4) {
                                com.facebook.internal.instrument.crashshield.a.a(th4, pVar2);
                            }
                        }
                        result.success(null);
                        return;
                    }
                    break;
                case -375431886:
                    if (str.equals("getAnonymousId")) {
                        String str5 = this.c;
                        if (str5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("anonymousId");
                        } else {
                            str2 = str5;
                        }
                        result.success(str2);
                        return;
                    }
                    break;
                case 97532676:
                    if (str.equals("flush")) {
                        l lVar3 = this.b;
                        if (lVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("appEventsLogger");
                            lVar3 = null;
                        }
                        p pVar3 = lVar3.a;
                        pVar3.getClass();
                        if (!com.facebook.internal.instrument.crashshield.a.b(pVar3)) {
                            try {
                                j.c(w.a);
                            } catch (Throwable th5) {
                                com.facebook.internal.instrument.crashshield.a.a(th5, pVar3);
                            }
                        }
                        result.success(null);
                        return;
                    }
                    break;
                case 645367080:
                    if (str.equals("setUserID")) {
                        Object obj = call.arguments;
                        String str6 = obj instanceof String ? (String) obj : null;
                        if (str6 == null) {
                            result.error("INVALID_ARGUMENT", "User ID is required", null);
                            return;
                        }
                        l.Companion.getClass();
                        C0691c c0691c2 = C0691c.a;
                        int i2 = g.a;
                        if (!C0691c.d) {
                            C0691c.a.getClass();
                            C0691c.a();
                        }
                        z.Companion.getClass();
                        z.a.a().execute(new b(str6, 1));
                        result.success(null);
                        return;
                    }
                    break;
                case 792787386:
                    if (str.equals("setAutoLogAppEventsEnabled")) {
                        Object obj2 = call.arguments;
                        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                        boolean booleanValue = bool != null ? bool.booleanValue() : false;
                        com.facebook.w wVar = com.facebook.w.a;
                        S s = S.a;
                        if (!com.facebook.internal.instrument.crashshield.a.b(S.class)) {
                            try {
                                S.a aVar = S.e;
                                aVar.c = Boolean.valueOf(booleanValue);
                                aVar.d = System.currentTimeMillis();
                                if (S.b.get()) {
                                    s.l(aVar);
                                } else {
                                    s.e();
                                }
                            } catch (Throwable th6) {
                                com.facebook.internal.instrument.crashshield.a.a(th6, S.class);
                            }
                        }
                        if (booleanValue) {
                            Context a2 = com.facebook.w.a();
                            Intrinsics.checkNotNull(a2, "null cannot be cast to non-null type android.app.Application");
                            f.c((Application) a2, com.facebook.w.b());
                        }
                        result.success(null);
                        return;
                    }
                    break;
                case 1413464691:
                    if (str.equals("logPushNotificationOpen")) {
                        String str7 = (String) call.argument("action");
                        Bundle payload = a((Map) call.argument("payload"));
                        if (payload == null) {
                            result.error("INVALID_ARGUMENT", "Payload is required", null);
                            return;
                        }
                        if (str7 != null) {
                            l lVar4 = this.b;
                            if (lVar4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("appEventsLogger");
                                lVar4 = null;
                            }
                            lVar4.getClass();
                            Intrinsics.checkNotNullParameter(payload, "payload");
                            lVar4.a.j(payload, str7);
                        } else {
                            l lVar5 = this.b;
                            if (lVar5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("appEventsLogger");
                                lVar5 = null;
                            }
                            lVar5.getClass();
                            Intrinsics.checkNotNullParameter(payload, "payload");
                            lVar5.a.j(payload, null);
                        }
                        result.success(null);
                        return;
                    }
                    break;
                case 1722355863:
                    if (str.equals("setUserData")) {
                        Object obj3 = call.arguments;
                        Map map = obj3 instanceof Map ? (Map) obj3 : null;
                        if (map == null) {
                            map = MapsKt.emptyMap();
                        }
                        Bundle a3 = a(map);
                        l.a aVar2 = l.Companion;
                        String string = a3 != null ? a3.getString("email") : null;
                        String string2 = a3 != null ? a3.getString("firstName") : null;
                        String string3 = a3 != null ? a3.getString("lastName") : null;
                        String string4 = a3 != null ? a3.getString("phone") : null;
                        String string5 = a3 != null ? a3.getString("dateOfBirth") : null;
                        String string6 = a3 != null ? a3.getString("gender") : null;
                        String string7 = a3 != null ? a3.getString("city") : null;
                        String string8 = a3 != null ? a3.getString("state") : null;
                        String string9 = a3 != null ? a3.getString("zip") : null;
                        String string10 = a3 != null ? a3.getString("country") : null;
                        aVar2.getClass();
                        H h2 = H.a;
                        if (!com.facebook.internal.instrument.crashshield.a.b(H.class)) {
                            try {
                                H.d(string, string2, string3, string4, string5, string6, string7, string8, string9, string10);
                            } catch (Throwable th7) {
                                com.facebook.internal.instrument.crashshield.a.a(th7, H.class);
                            }
                        }
                        result.success(null);
                        return;
                    }
                    break;
                case 1817723455:
                    if (str.equals("setDataProcessingOptions")) {
                        ArrayList arrayList = (ArrayList) call.argument("options");
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        Integer num = (Integer) call.argument("country");
                        int intValue = num != null ? num.intValue() : 0;
                        Integer num2 = (Integer) call.argument("state");
                        int intValue2 = num2 != null ? num2.intValue() : 0;
                        String[] strArr = (String[]) arrayList.toArray(new String[0]);
                        com.facebook.w wVar2 = com.facebook.w.a;
                        if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.w.class)) {
                            if (strArr == null) {
                                try {
                                    strArr = new String[0];
                                } catch (Throwable th8) {
                                    com.facebook.internal.instrument.crashshield.a.a(th8, com.facebook.w.class);
                                }
                            }
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("data_processing_options", new JSONArray((Collection) ArraysKt.toList(strArr)));
                                jSONObject.put("data_processing_options_country", intValue);
                                jSONObject.put("data_processing_options_state", intValue2);
                                Context context = com.facebook.w.j;
                                if (context == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                                    context = null;
                                }
                                context.getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).edit().putString("data_processing_options", jSONObject.toString()).apply();
                            } catch (JSONException unused) {
                            }
                        }
                        result.success(null);
                        return;
                    }
                    break;
                case 1989757366:
                    if (str.equals("logEvent")) {
                        String str8 = (String) call.argument("name");
                        if (str8 == null) {
                            result.error("INVALID_ARGUMENT", "Event name is required and cannot be null.", null);
                            return;
                        }
                        Map map2 = (Map) call.argument(Constants.PARAMETERS);
                        Double d2 = (Double) call.argument("_valueToSum");
                        if (d2 != null && map2 != null) {
                            Bundle a4 = a(map2);
                            l lVar6 = this.b;
                            if (lVar6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("appEventsLogger");
                                lVar6 = null;
                            }
                            lVar6.a.d(a4, str8, d2.doubleValue());
                        } else if (d2 != null) {
                            l lVar7 = this.b;
                            if (lVar7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("appEventsLogger");
                                lVar7 = null;
                            }
                            double doubleValue = d2.doubleValue();
                            p pVar4 = lVar7.a;
                            pVar4.getClass();
                            if (!com.facebook.internal.instrument.crashshield.a.b(pVar4)) {
                                try {
                                    pVar4.d(null, str8, doubleValue);
                                } catch (Throwable th9) {
                                    com.facebook.internal.instrument.crashshield.a.a(th9, pVar4);
                                }
                            }
                        } else if (map2 != null) {
                            Bundle a5 = a(map2);
                            l lVar8 = this.b;
                            if (lVar8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("appEventsLogger");
                                lVar8 = null;
                            }
                            lVar8.a.e(str8, a5);
                        } else {
                            l lVar9 = this.b;
                            if (lVar9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("appEventsLogger");
                                lVar9 = null;
                            }
                            p pVar5 = lVar9.a;
                            pVar5.getClass();
                            if (!com.facebook.internal.instrument.crashshield.a.b(pVar5)) {
                                try {
                                    pVar5.e(str8, null);
                                } catch (Throwable th10) {
                                    com.facebook.internal.instrument.crashshield.a.a(th10, pVar5);
                                }
                            }
                        }
                        result.success(null);
                        return;
                    }
                    break;
                case 2126113028:
                    if (str.equals("setAdvertiserTracking")) {
                        Boolean bool2 = (Boolean) call.argument("enabled");
                        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                        Boolean bool3 = (Boolean) call.argument("collectId");
                        boolean z = booleanValue2 && (bool3 != null ? bool3.booleanValue() : true);
                        com.facebook.w wVar3 = com.facebook.w.a;
                        S s2 = S.a;
                        if (!com.facebook.internal.instrument.crashshield.a.b(S.class)) {
                            try {
                                S.a aVar3 = S.f;
                                aVar3.c = Boolean.valueOf(z);
                                aVar3.d = System.currentTimeMillis();
                                if (S.b.get()) {
                                    s2.l(aVar3);
                                } else {
                                    s2.e();
                                }
                            } catch (Throwable th11) {
                                com.facebook.internal.instrument.crashshield.a.a(th11, S.class);
                            }
                        }
                        result.success(null);
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }
}
