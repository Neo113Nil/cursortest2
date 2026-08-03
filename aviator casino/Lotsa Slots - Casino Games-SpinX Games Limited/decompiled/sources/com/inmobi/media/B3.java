package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class B3 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4612a = 0;

    public static int a(android.content.Context context, java.lang.String url, android.content.pm.ResolveInfo resolveInfo, com.inmobi.media.InterfaceC2859wh redirectionValidator, java.lang.String api) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(api, "api");
        if (context == null) {
            return 7;
        }
        if (!redirectionValidator.c()) {
            redirectionValidator.a("EX_" + api);
            return 8;
        }
        android.content.Intent parseUri = android.content.Intent.parseUri(url, android.os.Build.VERSION.SDK_INT >= 22 ? 3 : 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parseUri, "parseUri(...)");
        com.inmobi.media.B5.f4614a.getClass();
        if (com.inmobi.media.B5.v() && parseUri.getAction() == null) {
            parseUri.setAction("android.intent.action.VIEW");
        }
        if ((resolveInfo != null ? resolveInfo.activityInfo : null) != null) {
            android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;
            if ((activityInfo != null ? activityInfo.packageName : null) != null) {
                if ((activityInfo != null ? activityInfo.name : null) != null) {
                    parseUri.setClassName(activityInfo.packageName, activityInfo.name);
                }
            }
        }
        parseUri.setFlags(268435456);
        context.startActivity(parseUri);
        return 0;
    }

    public static int a(android.content.Context context, java.lang.String url, com.inmobi.media.InterfaceC2859wh redirectionValidator, java.lang.String api) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(api, "api");
        if (context == null) {
            return 7;
        }
        if (!redirectionValidator.c()) {
            redirectionValidator.a("EX_" + api);
            return 8;
        }
        try {
            android.content.Intent parseUri = android.content.Intent.parseUri(url, 0);
            parseUri.setFlags(268435456);
            com.inmobi.media.B5.f4614a.getClass();
            if (com.inmobi.media.B5.v() && parseUri.getAction() == null) {
                parseUri.setAction("android.intent.action.VIEW");
            }
            context.startActivity(parseUri);
            return 0;
        } catch (android.content.ActivityNotFoundException e) {
            android.net.Uri parse = android.net.Uri.parse(url);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "Uri.parse(this)");
            java.lang.String a2 = a(url);
            if (kotlin.jvm.internal.Intrinsics.areEqual("intent", parse.getScheme()) && a2 != null && a2.length() != 0) {
                return a(context, a2, redirectionValidator, api);
            }
            throw e;
        } catch (java.lang.NullPointerException e2) {
            android.net.Uri parse2 = android.net.Uri.parse(url);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse2, "Uri.parse(this)");
            java.lang.String a3 = a(url);
            if (kotlin.jvm.internal.Intrinsics.areEqual("intent", parse2.getScheme()) && a3 != null && a3.length() != 0) {
                return a(context, a3, redirectionValidator, api);
            }
            throw e2;
        }
    }

    public static int a(com.inmobi.media.Za validationResult, com.inmobi.media.InterfaceC2859wh redirectionValidator, java.lang.String api) {
        android.content.pm.PackageManager packageManager;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(api, "api");
        if (!redirectionValidator.c()) {
            redirectionValidator.a("EX_" + api);
            return 8;
        }
        android.app.Activity activity = validationResult.f5082a;
        java.lang.String str = validationResult.b;
        boolean z = validationResult.d;
        java.lang.String str2 = validationResult.c;
        if (kotlin.text.StringsKt.isBlank(str)) {
            return 2;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("B3", "TAG");
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(android.net.Uri.parse(str));
        intent.putExtra("overlay", z);
        intent.putExtra("callerId", str2);
        try {
            packageManager = activity.getPackageManager();
        } catch (java.lang.Exception unused) {
            packageManager = null;
        }
        if (packageManager == null || intent.resolveActivity(packageManager) == null) {
            return 6;
        }
        try {
            activity.startActivityForResult(intent, 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("B3", "TAG");
            intent.toString();
            return 0;
        } catch (android.content.ActivityNotFoundException unused2) {
            return 6;
        } catch (java.lang.NullPointerException unused3) {
            return 13;
        } catch (java.lang.SecurityException unused4) {
            return 12;
        } catch (java.net.URISyntaxException unused5) {
            return 5;
        } catch (java.lang.Exception unused6) {
            return 9;
        }
    }

    public static java.lang.String a(java.lang.String str) {
        try {
            android.content.Intent parseUri = android.content.Intent.parseUri(str, 1);
            com.inmobi.media.B5.f4614a.getClass();
            if (com.inmobi.media.B5.v() && parseUri.getAction() == null) {
                parseUri.setAction("android.intent.action.VIEW");
            }
            return parseUri.getStringExtra("browser_fallback_url");
        } catch (java.net.URISyntaxException e) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("B3", "TAG");
            e.getMessage();
            return null;
        }
    }

    public static boolean a(android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        return kotlin.jvm.internal.Intrinsics.areEqual(androidx.webkit.ProxyConfig.MATCH_HTTP, uri.getScheme()) || kotlin.jvm.internal.Intrinsics.areEqual("https", uri.getScheme());
    }

    public static java.util.List a(android.content.Context context, java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        if (url.length() == 0 || context == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        android.content.Intent parseUri = android.content.Intent.parseUri(url, android.os.Build.VERSION.SDK_INT >= 22 ? 3 : 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parseUri, "parseUri(...)");
        com.inmobi.media.B5.f4614a.getClass();
        if (com.inmobi.media.B5.v() && parseUri.getAction() == null) {
            parseUri.setAction("android.intent.action.VIEW");
        }
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivityOptions = context.getPackageManager().queryIntentActivityOptions((android.content.ComponentName) null, (android.content.Intent[]) null, parseUri, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(queryIntentActivityOptions, "queryIntentActivityOptions(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : queryIntentActivityOptions) {
            if (((android.content.pm.ResolveInfo) obj).activityInfo.exported) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
