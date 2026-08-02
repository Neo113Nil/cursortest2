package com.paypal.oslo.feature.shaketoreport.utils;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0004¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\u000b\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006\u001aY\u0010\u0015\u001a\u00020\u0014*\u00020\u00042\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroid/app/Activity;", "", "displaySizeReportString", "(Landroid/app/Activity;)Ljava/lang/String;", "Landroid/content/Context;", "connectivityTypeReportString", "(Landroid/content/Context;)Ljava/lang/String;", "telephoneCountryCode", "", "isDebugBuild", "(Landroid/content/Context;)Z", "getDeviceType", "title", "frequency", "stepsToReproduce", "agileTeamName", "activityName", "buildType", "flavor", "employeeEmail", "Lcom/paypal/oslo/feature/shaketoreport/domain/IssueData;", "createIssueDataWithDeviceInfo", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/shaketoreport/domain/IssueData;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DeviceInfoUtilKt {
    public static final java.lang.String displaySizeReportString(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            java.lang.Object systemService = activity.getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME);
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
            android.view.WindowMetrics currentWindowMetrics = ((android.view.WindowManager) systemService).getCurrentWindowMetrics();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "");
            int width = currentWindowMetrics.getBounds().width();
            int height = currentWindowMetrics.getBounds().height();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(width);
            sb.append(" x ");
            sb.append(height);
            return sb.toString();
        }
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(i);
        sb2.append(" x ");
        sb2.append(i2);
        return sb2.toString();
    }

    public static final java.lang.String connectivityTypeReportString(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService("connectivity");
        android.net.ConnectivityManager connectivityManager = systemService instanceof android.net.ConnectivityManager ? (android.net.ConnectivityManager) systemService : null;
        android.net.Network activeNetwork = connectivityManager != null ? connectivityManager.getActiveNetwork() : null;
        android.net.NetworkCapabilities networkCapabilities = activeNetwork != null ? connectivityManager.getNetworkCapabilities(activeNetwork) : null;
        if (networkCapabilities != null) {
            return networkCapabilities.hasTransport(1) ? "WIFI" : networkCapabilities.hasTransport(0) ? "CELLULAR" : networkCapabilities.hasTransport(2) ? "BLUETOOTH" : "others";
        }
        return null;
    }

    public static final java.lang.String telephoneCountryCode(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService("phone");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        return ((android.telephony.TelephonyManager) systemService).getNetworkCountryIso();
    }

    public static final boolean isDebugBuild(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static final java.lang.String getDeviceType(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        int i = context.getResources().getConfiguration().uiMode & 15;
        if (i == 2) {
            return "Desk";
        }
        if (i == 3) {
            return androidx.webkit.UserAgentMetadata.FORM_FACTOR_AUTOMOTIVE;
        }
        if (i == 4) {
            return "TV";
        }
        if (i == 5) {
            return "Appliance";
        }
        if (i == 6) {
            return androidx.webkit.UserAgentMetadata.FORM_FACTOR_WATCH;
        }
        if ((context.getResources().getConfiguration().screenLayout & 15) >= 3) {
            return androidx.webkit.UserAgentMetadata.FORM_FACTOR_TABLET;
        }
        return "Phone";
    }

    public static /* synthetic */ com.paypal.oslo.feature.shaketoreport.domain.IssueData createIssueDataWithDeviceInfo$default(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i, java.lang.Object obj) {
        java.lang.String str9;
        if ((i & 32) != 0) {
            str9 = isDebugBuild(context) ? com.datadog.android.rum.internal.domain.event.RumEventDeserializer.TELEMETRY_TYPE_DEBUG : "release";
        } else {
            str9 = str6;
        }
        return createIssueDataWithDeviceInfo(context, str, str2, str3, str4, str5, str9, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8);
    }

    public static final com.paypal.oslo.feature.shaketoreport.domain.IssueData createIssueDataWithDeviceInfo(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        java.util.Locale locale;
        int i;
        java.lang.String displaySizeReportString;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
        android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.lang.Object systemService = context.getSystemService("phone");
        android.telephony.TelephonyManager telephonyManager = systemService instanceof android.telephony.TelephonyManager ? (android.telephony.TelephonyManager) systemService : null;
        java.lang.String str9 = packageInfo.versionName;
        java.lang.String str10 = str9 == null ? "Unknown" : str9;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            locale = locale2;
            i = (int) packageInfo.getLongVersionCode();
        } else {
            locale = locale2;
            i = packageInfo.versionCode;
        }
        java.lang.String str11 = android.os.Build.MODEL;
        java.lang.String str12 = android.os.Build.BRAND;
        int i2 = android.os.Build.VERSION.SDK_INT;
        java.lang.String str13 = android.os.Build.VERSION.RELEASE;
        java.lang.String connectivityTypeReportString = connectivityTypeReportString(context);
        return new com.paypal.oslo.feature.shaketoreport.domain.IssueData(str, str2, str3, str8, str4, str5, null, "", "Oslo", str10, java.lang.Integer.valueOf(i), str6, str7, str11, str12, java.lang.String.valueOf(i2), str13, connectivityTypeReportString == null ? "Unknown" : connectivityTypeReportString, (activity == null || (displaySizeReportString = displaySizeReportString(activity)) == null) ? "Unknown" : displaySizeReportString, locale.getDisplayLanguage(), telephonyManager != null ? telephonyManager.getNetworkCountryIso() : null, context.getPackageName(), locale.getLanguage(), locale.toString(), locale.getCountry(), telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null, "Android", getDeviceType(context));
    }
}
