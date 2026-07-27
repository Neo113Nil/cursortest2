package com.onesignal.common;

import B4.k;
import B4.r;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.UserManager;
import android.text.TextUtils;
import android.view.View;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.internal.logging.Logging;
import g4.AbstractC0466k;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import n4.InterfaceC1344a;
import u1.AbstractC1477a;
import v.f;

/* loaded from: classes.dex */
public final class AndroidUtils {
    public static final AndroidUtils INSTANCE = new AndroidUtils();
    private static final int androidSDKInt = Build.VERSION.SDK_INT;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SchemaType {
        private static final /* synthetic */ InterfaceC1344a $ENTRIES;
        private static final /* synthetic */ SchemaType[] $VALUES;
        public static final Companion Companion;
        private final String text;
        public static final SchemaType DATA = new SchemaType("DATA", 0, "data");
        public static final SchemaType HTTPS = new SchemaType("HTTPS", 1, "https");
        public static final SchemaType HTTP = new SchemaType("HTTP", 2, "http");

        public static final class Companion {
            public /* synthetic */ Companion(e eVar) {
                this();
            }

            public final SchemaType fromString(String str) {
                for (SchemaType schemaType : SchemaType.values()) {
                    if (r.I(schemaType.text, str)) {
                        return schemaType;
                    }
                }
                return null;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ SchemaType[] $values() {
            return new SchemaType[]{DATA, HTTPS, HTTP};
        }

        static {
            SchemaType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC1477a.n($values);
            Companion = new Companion(null);
        }

        private SchemaType(String str, int i2, String str2) {
            this.text = str2;
        }

        public static InterfaceC1344a getEntries() {
            return $ENTRIES;
        }

        public static SchemaType valueOf(String str) {
            return (SchemaType) Enum.valueOf(SchemaType.class, str);
        }

        public static SchemaType[] values() {
            return (SchemaType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SchemaType.values().length];
            try {
                iArr[SchemaType.DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SchemaType.HTTPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SchemaType.HTTP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private AndroidUtils() {
    }

    public final List<String> filterManifestPermissions(List<String> permissions, IApplicationService applicationService) {
        i.e(permissions, "permissions");
        i.e(applicationService, "applicationService");
        PackageInfo packageInfo = applicationService.getAppContext().getPackageManager().getPackageInfo(applicationService.getAppContext().getPackageName(), Base64Utils.IO_BUFFER_SIZE);
        i.d(packageInfo, "getPackageInfo(...)");
        String[] requestedPermissions = packageInfo.requestedPermissions;
        i.d(requestedPermissions, "requestedPermissions");
        List A02 = AbstractC0466k.A0(Arrays.copyOf(requestedPermissions, requestedPermissions.length));
        ArrayList arrayList = new ArrayList();
        for (Object obj : permissions) {
            if (A02.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void finishSafely(Activity activity) {
        i.e(activity, "activity");
        if (activity.isDestroyed() || activity.isFinishing()) {
            return;
        }
        activity.finish();
    }

    public final int getAndroidSDKInt() {
        return androidSDKInt;
    }

    public final String getAppVersion(Context context) {
        Integer num;
        i.e(context, "context");
        try {
            num = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            num = null;
        }
        if (num != null) {
            return num.toString();
        }
        return null;
    }

    public final String getManifestMeta(Context context, String str) {
        i.e(context, "context");
        Bundle manifestMetaBundle = getManifestMetaBundle(context);
        if (manifestMetaBundle != null) {
            return manifestMetaBundle.getString(str);
        }
        return null;
    }

    public final boolean getManifestMetaBoolean(Context context, String str) {
        i.e(context, "context");
        Bundle manifestMetaBundle = getManifestMetaBundle(context);
        if (manifestMetaBundle != null) {
            return manifestMetaBundle.getBoolean(str);
        }
        return false;
    }

    public final Bundle getManifestMetaBundle(Context context) {
        i.e(context, "context");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            i.d(applicationInfo, "getApplicationInfo(...)");
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException e3) {
            Logging.error("Manifest application info not found", e3);
            return null;
        }
    }

    public final int getRandomDelay(int i2, int i3) {
        return new Random().nextInt((i3 + 1) - i2) + i2;
    }

    public final String getResourceString(Context context, String str, String str2) {
        i.e(context, "context");
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "string", context.getPackageName());
        return identifier != 0 ? resources.getString(identifier) : str2;
    }

    public final String getRootCauseMessage(Throwable throwable) {
        i.e(throwable, "throwable");
        return getRootCauseThrowable(throwable).getMessage();
    }

    public final Throwable getRootCauseThrowable(Throwable subjectThrowable) {
        i.e(subjectThrowable, "subjectThrowable");
        while (subjectThrowable.getCause() != null && subjectThrowable.getCause() != subjectThrowable) {
            subjectThrowable = subjectThrowable.getCause();
            i.b(subjectThrowable);
        }
        return subjectThrowable;
    }

    public final int getTargetSdkVersion(Context context) {
        i.e(context, "context");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
            i.d(applicationInfo, "getApplicationInfo(...)");
            return applicationInfo.targetSdkVersion;
        } catch (PackageManager.NameNotFoundException e3) {
            e3.printStackTrace();
            return 21;
        }
    }

    public final boolean hasConfigChangeFlag(Activity activity, int i2) {
        i.e(activity, "activity");
        try {
            return (activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).configChanges & i2) != 0;
        } catch (PackageManager.NameNotFoundException e3) {
            e3.printStackTrace();
            return false;
        }
    }

    public final boolean hasNotificationManagerCompat() {
        return true;
    }

    public final boolean hasPermission(String permission, boolean z, IApplicationService applicationService) {
        i.e(permission, "permission");
        i.e(applicationService, "applicationService");
        try {
            PackageInfo packageInfo = applicationService.getAppContext().getPackageManager().getPackageInfo(applicationService.getAppContext().getPackageName(), Base64Utils.IO_BUFFER_SIZE);
            i.d(packageInfo, "getPackageInfo(...)");
            String[] requestedPermissions = packageInfo.requestedPermissions;
            i.d(requestedPermissions, "requestedPermissions");
            if (!AbstractC0466k.A0(Arrays.copyOf(requestedPermissions, requestedPermissions.length)).contains(permission)) {
                return false;
            }
            if (z) {
                if (f.a(applicationService.getAppContext(), permission) == -1) {
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException e3) {
            e3.printStackTrace();
            return false;
        }
    }

    public final boolean isActivityFullyReady(Activity activity) {
        i.e(activity, "activity");
        boolean z = activity.getWindow().getDecorView().getApplicationWindowToken() != null;
        View decorView = activity.getWindow().getDecorView();
        i.d(decorView, "getDecorView(...)");
        return z && (decorView.getRootWindowInsets() != null);
    }

    public final boolean isAndroidUserUnlocked(Context appContext) {
        i.e(appContext, "appContext");
        Object systemService = appContext.getSystemService("user");
        UserManager userManager = systemService instanceof UserManager ? (UserManager) systemService : null;
        if (userManager != null) {
            return userManager.isUserUnlocked();
        }
        return true;
    }

    public final boolean isRunningOnMainThread() {
        return i.a(Thread.currentThread(), Looper.getMainLooper().getThread());
    }

    public final boolean isStringNotEmpty(String str) {
        return !TextUtils.isEmpty(str);
    }

    public final boolean isValidResourceName(String str) {
        if (str != null) {
            Pattern compile = Pattern.compile("^[0-9]");
            i.d(compile, "compile(...)");
            if (!compile.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    public final boolean opaqueHasClass(Class<?> _class) {
        i.e(_class, "_class");
        return true;
    }

    public final void openURLInBrowser(Context appContext, Uri uri) {
        i.e(appContext, "appContext");
        i.e(uri, "uri");
        appContext.startActivity(openURLInBrowserIntent(uri));
    }

    public final Intent openURLInBrowserIntent(Uri uri) {
        Intent makeMainSelectorActivity;
        i.e(uri, "uri");
        SchemaType fromString = uri.getScheme() != null ? SchemaType.Companion.fromString(uri.getScheme()) : null;
        if (fromString == null) {
            fromString = SchemaType.HTTP;
            String uri2 = uri.toString();
            i.d(uri2, "toString(...)");
            if (!k.R(uri2, "://", false)) {
                uri = Uri.parse("http://" + uri);
                i.d(uri, "parse(...)");
            }
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[fromString.ordinal()];
        if (i2 != 1) {
            makeMainSelectorActivity = (i2 == 2 || i2 == 3) ? new Intent("android.intent.action.VIEW", uri) : new Intent("android.intent.action.VIEW", uri);
        } else {
            makeMainSelectorActivity = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
            i.d(makeMainSelectorActivity, "makeMainSelectorActivity(...)");
            makeMainSelectorActivity.setData(uri);
        }
        makeMainSelectorActivity.addFlags(268435456);
        return makeMainSelectorActivity;
    }

    public final void openURLInBrowser(Context appContext, String url) {
        i.e(appContext, "appContext");
        i.e(url, "url");
        int length = url.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean z5 = i.g(url.charAt(!z ? i2 : length), 32) <= 0;
            if (z) {
                if (!z5) {
                    break;
                } else {
                    length--;
                }
            } else if (z5) {
                i2++;
            } else {
                z = true;
            }
        }
        Uri parse = Uri.parse(url.subSequence(i2, length + 1).toString());
        i.d(parse, "parse(...)");
        openURLInBrowser(appContext, parse);
    }
}
