package com.example.nb_utils;

import android.R;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.content.res.ResourcesCompat;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0016\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0002J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/example/nb_utils/NbUtilsPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "channel", "Lio/flutter/plugin/common/MethodChannel;", "appContext", "Landroid/content/Context;", "onAttachedToEngine", "", "flutterPluginBinding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onMethodCall", NotificationCompat.CATEGORY_CALL, "Lio/flutter/plugin/common/MethodCall;", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "packageInfo", "", "getLongVersionCode", "", "info", "Landroid/content/pm/PackageInfo;", "getMaterialYouColours", "", "", "onDetachedFromEngine", "binding", "nb_utils_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNbUtilsPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NbUtilsPlugin.kt\ncom/example/nb_utils/NbUtilsPlugin\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,176:1\n129#2:177\n158#2,3:178\n*S KotlinDebug\n*F\n+ 1 NbUtilsPlugin.kt\ncom/example/nb_utils/NbUtilsPlugin\n*L\n164#1:177\n164#1:178,3\n*E\n"})
/* renamed from: com.example.nb_utils.a, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class NbUtilsPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler {
    public MethodChannel a;
    public Context b;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "nb_utils");
        this.a = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.b = flutterPluginBinding.getApplicationContext();
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

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        PackageInfo packageInfo;
        String string;
        PackageManager.PackageInfoFlags of;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        if (Intrinsics.areEqual(call.method, "getPlatformVersion")) {
            result.success("Android " + Build.VERSION.RELEASE);
            return;
        }
        if (Intrinsics.areEqual(call.method, "isAndroid12Above")) {
            result.success(Boolean.valueOf(Build.VERSION.SDK_INT >= 31));
            return;
        }
        Map map = null;
        if (Intrinsics.areEqual(call.method, "materialYouColors")) {
            if (Build.VERSION.SDK_INT >= 31) {
                Map mapOf = MapsKt.mapOf(TuplesKt.to("system_accent1_0", Integer.valueOf(R.color.system_accent1_0)), TuplesKt.to("system_accent1_10", Integer.valueOf(R.color.system_accent1_10)), TuplesKt.to("system_accent1_50", Integer.valueOf(R.color.system_accent1_50)), TuplesKt.to("system_accent1_100", Integer.valueOf(R.color.system_accent1_100)), TuplesKt.to("system_accent1_200", Integer.valueOf(R.color.system_accent1_200)), TuplesKt.to("system_accent1_300", Integer.valueOf(R.color.system_accent1_300)), TuplesKt.to("system_accent1_400", Integer.valueOf(R.color.system_accent1_400)), TuplesKt.to("system_accent1_500", Integer.valueOf(R.color.system_accent1_500)), TuplesKt.to("system_accent1_600", Integer.valueOf(R.color.system_accent1_600)), TuplesKt.to("system_accent1_700", Integer.valueOf(R.color.system_accent1_700)), TuplesKt.to("system_accent1_800", Integer.valueOf(R.color.system_accent1_800)), TuplesKt.to("system_accent1_900", Integer.valueOf(R.color.system_accent1_900)), TuplesKt.to("system_accent1_1000", Integer.valueOf(R.color.system_accent1_1000)), TuplesKt.to("system_accent2_0", Integer.valueOf(R.color.system_accent2_0)), TuplesKt.to("system_accent2_10", Integer.valueOf(R.color.system_accent2_10)), TuplesKt.to("system_accent2_50", Integer.valueOf(R.color.system_accent2_50)), TuplesKt.to("system_accent2_100", Integer.valueOf(R.color.system_accent2_100)), TuplesKt.to("system_accent2_200", Integer.valueOf(R.color.system_accent2_200)), TuplesKt.to("system_accent2_300", Integer.valueOf(R.color.system_accent2_300)), TuplesKt.to("system_accent2_400", Integer.valueOf(R.color.system_accent2_400)), TuplesKt.to("system_accent2_500", Integer.valueOf(R.color.system_accent2_500)), TuplesKt.to("system_accent2_600", Integer.valueOf(R.color.system_accent2_600)), TuplesKt.to("system_accent2_700", Integer.valueOf(R.color.system_accent2_700)), TuplesKt.to("system_accent2_800", Integer.valueOf(R.color.system_accent2_800)), TuplesKt.to("system_accent2_900", Integer.valueOf(R.color.system_accent2_900)), TuplesKt.to("system_accent2_1000", Integer.valueOf(R.color.system_accent2_1000)), TuplesKt.to("system_accent3_0", Integer.valueOf(R.color.system_accent3_0)), TuplesKt.to("system_accent3_10", Integer.valueOf(R.color.system_accent3_10)), TuplesKt.to("system_accent3_50", Integer.valueOf(R.color.system_accent3_50)), TuplesKt.to("system_accent3_100", Integer.valueOf(R.color.system_accent3_100)), TuplesKt.to("system_accent3_200", Integer.valueOf(R.color.system_accent3_200)), TuplesKt.to("system_accent3_300", Integer.valueOf(R.color.system_accent3_300)), TuplesKt.to("system_accent3_400", Integer.valueOf(R.color.system_accent3_400)), TuplesKt.to("system_accent3_500", Integer.valueOf(R.color.system_accent3_500)), TuplesKt.to("system_accent3_600", Integer.valueOf(R.color.system_accent3_600)), TuplesKt.to("system_accent3_700", Integer.valueOf(R.color.system_accent3_700)), TuplesKt.to("system_accent3_800", Integer.valueOf(R.color.system_accent3_800)), TuplesKt.to("system_accent3_900", Integer.valueOf(R.color.system_accent3_900)), TuplesKt.to("system_accent3_1000", Integer.valueOf(R.color.system_accent3_1000)), TuplesKt.to("system_neutral1_0", Integer.valueOf(R.color.system_neutral1_0)), TuplesKt.to("system_neutral1_10", Integer.valueOf(R.color.system_neutral1_10)), TuplesKt.to("system_neutral1_50", Integer.valueOf(R.color.system_neutral1_50)), TuplesKt.to("system_neutral1_100", Integer.valueOf(R.color.system_neutral1_100)), TuplesKt.to("system_neutral1_200", Integer.valueOf(R.color.system_neutral1_200)), TuplesKt.to("system_neutral1_300", Integer.valueOf(R.color.system_neutral1_300)), TuplesKt.to("system_neutral1_400", Integer.valueOf(R.color.system_neutral1_400)), TuplesKt.to("system_neutral1_500", Integer.valueOf(R.color.system_neutral1_500)), TuplesKt.to("system_neutral1_600", Integer.valueOf(R.color.system_neutral1_600)), TuplesKt.to("system_neutral1_700", Integer.valueOf(R.color.system_neutral1_700)), TuplesKt.to("system_neutral1_800", Integer.valueOf(R.color.system_neutral1_800)), TuplesKt.to("system_neutral1_900", Integer.valueOf(R.color.system_neutral1_900)), TuplesKt.to("system_neutral1_1000", Integer.valueOf(R.color.system_neutral1_1000)), TuplesKt.to("system_neutral2_0", Integer.valueOf(R.color.system_neutral2_0)), TuplesKt.to("system_neutral2_10", Integer.valueOf(R.color.system_neutral2_10)), TuplesKt.to("system_neutral2_50", Integer.valueOf(R.color.system_neutral2_50)), TuplesKt.to("system_neutral2_100", Integer.valueOf(R.color.system_neutral2_100)), TuplesKt.to("system_neutral2_200", Integer.valueOf(R.color.system_neutral2_200)), TuplesKt.to("system_neutral2_300", Integer.valueOf(R.color.system_neutral2_300)), TuplesKt.to("system_neutral2_400", Integer.valueOf(R.color.system_neutral2_400)), TuplesKt.to("system_neutral2_500", Integer.valueOf(R.color.system_neutral2_500)), TuplesKt.to("system_neutral2_600", Integer.valueOf(R.color.system_neutral2_600)), TuplesKt.to("system_neutral2_700", Integer.valueOf(R.color.system_neutral2_700)), TuplesKt.to("system_neutral2_800", Integer.valueOf(R.color.system_neutral2_800)), TuplesKt.to("system_neutral2_900", Integer.valueOf(R.color.system_neutral2_900)), TuplesKt.to("system_neutral2_1000", Integer.valueOf(R.color.system_neutral2_1000)));
                ArrayList arrayList = new ArrayList(mapOf.size());
                for (Map.Entry entry : mapOf.entrySet()) {
                    String str = (String) entry.getKey();
                    int intValue = ((Number) entry.getValue()).intValue();
                    Context context = this.b;
                    Intrinsics.checkNotNull(context);
                    Resources resources = context.getResources();
                    Context context2 = this.b;
                    Intrinsics.checkNotNull(context2);
                    arrayList.add(TuplesKt.to(str, Integer.toHexString(ResourcesCompat.getColor(resources, intValue, context2.getTheme()))));
                }
                map = MapsKt.toMap(arrayList);
            }
            result.success(map);
            return;
        }
        if (!Intrinsics.areEqual(call.method, "packageInfo")) {
            if (Intrinsics.areEqual(call.method, "getAndroidSDKVersion")) {
                result.success(Integer.valueOf(Build.VERSION.SDK_INT));
                return;
            } else if (Intrinsics.areEqual(call.method, "getAndroidOSVersion")) {
                result.success(Build.VERSION.RELEASE);
                return;
            } else {
                result.notImplemented();
                return;
            }
        }
        Context context3 = this.b;
        Intrinsics.checkNotNull(context3);
        PackageManager packageManager = context3.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            Context context4 = this.b;
            Intrinsics.checkNotNull(context4);
            String packageName = context4.getPackageName();
            of = PackageManager.PackageInfoFlags.of(0L);
            packageInfo = packageManager.getPackageInfo(packageName, of);
            Intrinsics.checkNotNull(packageInfo);
        } else {
            Context context5 = this.b;
            Intrinsics.checkNotNull(context5);
            packageInfo = packageManager.getPackageInfo(context5.getPackageName(), 0);
            Intrinsics.checkNotNull(packageInfo);
        }
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        Integer valueOf = applicationInfo != null ? Integer.valueOf(applicationInfo.labelRes) : null;
        if (valueOf == null || valueOf.intValue() != 0) {
            Context context6 = this.b;
            Intrinsics.checkNotNull(context6);
            Intrinsics.checkNotNull(valueOf);
            string = context6.getString(valueOf.intValue());
            Intrinsics.checkNotNull(string);
        } else {
            string = applicationInfo.nonLocalizedLabel.toString();
        }
        result.success(MapsKt.mapOf(TuplesKt.to(Constants.APP_NAME, string), TuplesKt.to("packageName", packageInfo.packageName), TuplesKt.to("versionName", packageInfo.versionName), TuplesKt.to("versionCode", String.valueOf(i >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode)), TuplesKt.to("androidSDKVersion", Integer.valueOf(i))));
    }
}
