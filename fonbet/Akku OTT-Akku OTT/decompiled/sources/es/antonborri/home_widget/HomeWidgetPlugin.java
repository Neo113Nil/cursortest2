package es.antonborri.home_widget;

import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.Constants;
import defpackage.g;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 82\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u00018B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\"\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0006\u0010\f\u001a\u00020\rH\u0002J$\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u0017H\u0016J\u0010\u0010(\u001a\u00020\u00152\u0006\u0010'\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0015H\u0016J\u0010\u0010+\u001a\u00020\u00152\u0006\u0010'\u001a\u00020)H\u0016J\b\u0010,\u001a\u00020\u0015H\u0016J\u001c\u0010-\u001a\u00020\u00152\b\u0010.\u001a\u0004\u0018\u00010 2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0012\u00101\u001a\u00020\u00152\b\u0010.\u001a\u0004\u0018\u00010 H\u0016J\u0012\u00102\u001a\u00020\u00112\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\b\u00103\u001a\u00020\u0015H\u0002J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082D¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Les/antonborri/home_widget/HomeWidgetPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "Lio/flutter/plugin/common/PluginRegistry$NewIntentListener;", "<init>", "()V", "channel", "Lio/flutter/plugin/common/MethodChannel;", "eventChannel", "Lio/flutter/plugin/common/EventChannel;", "context", "Landroid/content/Context;", "activity", "Landroid/app/Activity;", "receiver", "Landroid/content/BroadcastReceiver;", "doubleLongPrefix", "", "onAttachedToEngine", "", "flutterPluginBinding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onMethodCall", NotificationCompat.CATEGORY_CALL, "Lio/flutter/plugin/common/MethodCall;", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "getInstalledWidgets", "", "", "", "widgetInfoToMap", "widgetId", "", "widgetInfo", "Landroid/appwidget/AppWidgetProviderInfo;", "onDetachedFromEngine", "binding", "onAttachedToActivity", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onDetachedFromActivityForConfigChanges", "onReattachedToActivityForConfigChanges", "onDetachedFromActivity", "onListen", "arguments", "events", "Lio/flutter/plugin/common/EventChannel$EventSink;", "onCancel", "createReceiver", "unregisterReceiver", "onNewIntent", "", "intent", "Landroid/content/Intent;", "Companion", "home_widget_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHomeWidgetPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeWidgetPlugin.kt\nes/antonborri/home_widget/HomeWidgetPlugin\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,315:1\n766#2:316\n857#2,2:317\n*S KotlinDebug\n*F\n+ 1 HomeWidgetPlugin.kt\nes/antonborri/home_widget/HomeWidgetPlugin\n*L\n195#1:316\n195#1:317,2\n*E\n"})
/* renamed from: es.antonborri.home_widget.a, reason: from Kotlin metadata */
/* loaded from: classes4.dex */
public final class HomeWidgetPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware, EventChannel.StreamHandler, PluginRegistry.NewIntentListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public MethodChannel a;
    public Context b;
    public Activity c;
    public b d;

    /* renamed from: es.antonborri.home_widget.a$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    public final ArrayList a(Context context) {
        List list;
        ArrayList arrayList = new ArrayList();
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context.getApplicationContext());
        if (Build.VERSION.SDK_INT >= 26) {
            list = appWidgetManager.getInstalledProvidersForPackage(context.getPackageName(), null);
            Intrinsics.checkNotNull(list);
        } else {
            List<AppWidgetProviderInfo> installedProviders = appWidgetManager.getInstalledProviders();
            Intrinsics.checkNotNullExpressionValue(installedProviders, "getInstalledProviders(...)");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : installedProviders) {
                if (Intrinsics.areEqual(((AppWidgetProviderInfo) obj).provider.getPackageName(), context.getPackageName())) {
                    arrayList2.add(obj);
                }
            }
            list = arrayList2;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int[] appWidgetIds = appWidgetManager.getAppWidgetIds(((AppWidgetProviderInfo) it.next()).provider);
            Intrinsics.checkNotNull(appWidgetIds);
            for (int i : appWidgetIds) {
                AppWidgetProviderInfo appWidgetInfo = appWidgetManager.getAppWidgetInfo(i);
                Intrinsics.checkNotNull(appWidgetInfo);
                Context context2 = this.b;
                if (context2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                    context2 = null;
                }
                arrayList.add(MapsKt.mapOf(TuplesKt.to("widgetId", Integer.valueOf(i)), TuplesKt.to("androidClassName", appWidgetInfo.provider.getShortClassName()), TuplesKt.to(Constants.ScionAnalytics.PARAM_LABEL, appWidgetInfo.loadLabel(context2.getPackageManager()).toString())));
            }
        }
        return arrayList;
    }

    public final void b() {
        try {
            if (this.d != null) {
                Context context = this.b;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                    context = null;
                }
                context.unregisterReceiver(this.d);
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.c = binding.getActivity();
        binding.addOnNewIntentListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "home_widget");
        this.a = methodChannel;
        methodChannel.setMethodCallHandler(this);
        new EventChannel(flutterPluginBinding.getBinaryMessenger(), "home_widget/updates").setStreamHandler(this);
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.b = applicationContext;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object arguments) {
        b();
        this.d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        b();
        this.c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        b();
        this.c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.a;
        if (methodChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object arguments, EventChannel.EventSink events) {
        this.d = new b(events);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        Intent intent;
        String action;
        String str;
        Intent intent2;
        Uri data;
        boolean isRequestPinAppWidgetSupported;
        boolean isRequestPinAppWidgetSupported2;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str2 = call.method;
        if (str2 != null) {
            Context context = null;
            switch (str2.hashCode()) {
                case -2070339408:
                    if (str2.equals("initiallyLaunchedFromHomeWidget")) {
                        Activity activity = this.c;
                        if (activity == null || (intent = activity.getIntent()) == null || (action = intent.getAction()) == null || !action.equals("es.antonborri.home_widget.action.LAUNCH")) {
                            result.success(null);
                            return;
                        }
                        Activity activity2 = this.c;
                        if (activity2 == null || (intent2 = activity2.getIntent()) == null || (data = intent2.getData()) == null || (str = data.toString()) == null) {
                            str = "";
                        }
                        result.success(str);
                        return;
                    }
                    break;
                case -2065784469:
                    if (str2.equals("saveWidgetData")) {
                        if (!call.hasArgument("id") || !call.hasArgument("data")) {
                            result.error("-1", "InvalidArguments saveWidgetData must be called with id and data", new IllegalArgumentException());
                            return;
                        }
                        String str3 = (String) call.argument("id");
                        Object argument = call.argument("data");
                        Context context2 = this.b;
                        if (context2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("context");
                        } else {
                            context = context2;
                        }
                        SharedPreferences.Editor edit = context.getSharedPreferences("HomeWidgetPreferences", 0).edit();
                        if (argument != null) {
                            boolean z = argument instanceof Double;
                            edit.putBoolean(g.a("home_widget.double.", str3), z);
                            if (argument instanceof Boolean) {
                                edit.putBoolean(str3, ((Boolean) argument).booleanValue());
                            } else if (argument instanceof Float) {
                                edit.putFloat(str3, ((Number) argument).floatValue());
                            } else if (argument instanceof String) {
                                edit.putString(str3, (String) argument);
                            } else if (z) {
                                edit.putLong(str3, Double.doubleToRawLongBits(((Number) argument).doubleValue()));
                            } else if (argument instanceof Integer) {
                                edit.putInt(str3, ((Number) argument).intValue());
                            } else if (argument instanceof Long) {
                                edit.putLong(str3, ((Number) argument).longValue());
                            } else {
                                result.error("-10", "Invalid Type " + argument.getClass().getSimpleName() + ". Supported types are Boolean, Float, String, Double, Long", new IllegalArgumentException());
                                Unit unit = Unit.INSTANCE;
                            }
                        } else {
                            edit.remove(str3);
                            edit.remove("home_widget.double." + str3);
                        }
                        result.success(Boolean.valueOf(edit.commit()));
                        return;
                    }
                    break;
                case -836303763:
                    if (str2.equals("updateWidget")) {
                        String str4 = (String) call.argument("qualifiedAndroidName");
                        String str5 = (String) call.argument("android");
                        if (str5 == null) {
                            str5 = (String) call.argument("name");
                        }
                        if (str4 == null) {
                            try {
                                StringBuilder sb = new StringBuilder();
                                Context context3 = this.b;
                                if (context3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("context");
                                    context3 = null;
                                }
                                sb.append(context3.getPackageName());
                                sb.append('.');
                                sb.append(str5);
                                str4 = sb.toString();
                            } catch (ClassNotFoundException e) {
                                result.error("-3", android.support.v4.media.b.b("No Widget found with Name ", str5, ". Argument 'name' must be the same as your AppWidgetProvider you wish to update"), e);
                                return;
                            }
                        }
                        Class<?> cls = Class.forName(str4);
                        Context context4 = this.b;
                        if (context4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("context");
                            context4 = null;
                        }
                        Intent intent3 = new Intent(context4, cls);
                        intent3.setAction("android.appwidget.action.APPWIDGET_UPDATE");
                        Context context5 = this.b;
                        if (context5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("context");
                            context5 = null;
                        }
                        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context5.getApplicationContext());
                        Context context6 = this.b;
                        if (context6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("context");
                            context6 = null;
                        }
                        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context6, cls));
                        Intrinsics.checkNotNullExpressionValue(appWidgetIds, "getAppWidgetIds(...)");
                        intent3.putExtra("appWidgetIds", appWidgetIds);
                        Context context7 = this.b;
                        if (context7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("context");
                        } else {
                            context = context7;
                        }
                        context.sendBroadcast(intent3);
                        result.success(Boolean.TRUE);
                        return;
                    }
                    break;
                case -605441020:
                    if (str2.equals("getWidgetData")) {
                        if (!call.hasArgument("id")) {
                            result.error("-2", "InvalidArguments getWidgetData must be called with id", new IllegalArgumentException());
                            return;
                        }
                        String str6 = (String) call.argument("id");
                        Object argument2 = call.argument("defaultValue");
                        Context context8 = this.b;
                        if (context8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("context");
                        } else {
                            context = context8;
                        }
                        SharedPreferences sharedPreferences = context.getSharedPreferences("HomeWidgetPreferences", 0);
                        Object obj = sharedPreferences.getAll().get(str6);
                        if (obj != null) {
                            argument2 = obj;
                        }
                        if (argument2 instanceof Long) {
                            if (sharedPreferences.getBoolean("home_widget.double." + str6, false)) {
                                result.success(Double.valueOf(Double.longBitsToDouble(((Number) argument2).longValue())));
                                return;
                            }
                        }
                        result.success(argument2);
                        return;
                    }
                    break;
                case -489866933:
                    if (str2.equals("getInstalledWidgets")) {
                        try {
                            Context context9 = this.b;
                            if (context9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("context");
                                context9 = null;
                            }
                            result.success(a(context9));
                            return;
                        } catch (Exception e2) {
                            result.error("-5", "Failed to get installed widgets: " + e2.getMessage(), null);
                            return;
                        }
                    }
                    break;
                case 1174565782:
                    if (str2.equals("registerBackgroundCallback")) {
                        Object obj2 = call.arguments;
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.Iterable<*>");
                        Object obj3 = CollectionsKt.toList((Iterable) obj2).get(0);
                        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Number");
                        long longValue = ((Number) obj3).longValue();
                        Object obj4 = call.arguments;
                        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.collections.Iterable<*>");
                        Object obj5 = CollectionsKt.toList((Iterable) obj4).get(1);
                        Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Number");
                        long longValue2 = ((Number) obj5).longValue();
                        Companion companion = INSTANCE;
                        Context context10 = this.b;
                        if (context10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("context");
                        } else {
                            context = context10;
                        }
                        companion.getClass();
                        context.getSharedPreferences("InternalHomeWidgetPreferences", 0).edit().putLong("callbackDispatcherHandle", longValue).putLong("callbackHandle", longValue2).apply();
                        result.success(Boolean.TRUE);
                        return;
                    }
                    break;
                case 1411403610:
                    if (str2.equals("isRequestPinWidgetSupported")) {
                        if (Build.VERSION.SDK_INT < 26) {
                            result.success(Boolean.FALSE);
                            return;
                        }
                        Context context11 = this.b;
                        if (context11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("context");
                        } else {
                            context = context11;
                        }
                        isRequestPinAppWidgetSupported = AppWidgetManager.getInstance(context.getApplicationContext()).isRequestPinAppWidgetSupported();
                        result.success(Boolean.valueOf(isRequestPinAppWidgetSupported));
                        return;
                    }
                    break;
                case 1902315675:
                    if (str2.equals("setAppGroupId")) {
                        result.success(Boolean.TRUE);
                        return;
                    }
                    break;
                case 2122273386:
                    if (str2.equals("requestPinWidget")) {
                        if (Build.VERSION.SDK_INT < 26) {
                            result.success(null);
                            return;
                        }
                        String str7 = (String) call.argument("qualifiedAndroidName");
                        String str8 = (String) call.argument("android");
                        if (str8 == null) {
                            str8 = (String) call.argument("name");
                        }
                        if (str7 == null) {
                            try {
                                StringBuilder sb2 = new StringBuilder();
                                Context context12 = this.b;
                                if (context12 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("context");
                                    context12 = null;
                                }
                                sb2.append(context12.getPackageName());
                                sb2.append('.');
                                sb2.append(str8);
                                str7 = sb2.toString();
                            } catch (ClassNotFoundException e3) {
                                result.error("-4", android.support.v4.media.b.b("No Widget found with Name ", str8, ". Argument 'name' must be the same as your AppWidgetProvider you wish to update"), e3);
                                return;
                            }
                        }
                        Class<?> cls2 = Class.forName(str7);
                        Context context13 = this.b;
                        if (context13 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("context");
                            context13 = null;
                        }
                        ComponentName componentName = new ComponentName(context13, cls2);
                        Context context14 = this.b;
                        if (context14 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("context");
                            context14 = null;
                        }
                        AppWidgetManager appWidgetManager2 = AppWidgetManager.getInstance(context14.getApplicationContext());
                        isRequestPinAppWidgetSupported2 = appWidgetManager2.isRequestPinAppWidgetSupported();
                        if (isRequestPinAppWidgetSupported2) {
                            appWidgetManager2.requestPinAppWidget(componentName, null, null);
                        }
                        result.success(null);
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }

    @Override // io.flutter.plugin.common.PluginRegistry.NewIntentListener
    public final boolean onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        b bVar = this.d;
        if (bVar != null) {
            Context context = this.b;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context = null;
            }
            bVar.onReceive(context, intent);
        }
        return this.d != null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.c = binding.getActivity();
        binding.addOnNewIntentListener(this);
    }
}
