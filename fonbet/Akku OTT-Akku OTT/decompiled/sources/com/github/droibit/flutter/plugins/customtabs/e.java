package com.github.droibit.flutter.plugins.customtabs;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsService;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import io.flutter.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension({"SMAP\nCustomTabsLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomTabsLauncher.kt\ncom/github/droibit/flutter/plugins/customtabs/CustomTabsLauncher\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,159:1\n29#2:160\n31#3:161\n*S KotlinDebug\n*F\n+ 1 CustomTabsLauncher.kt\ncom/github/droibit/flutter/plugins/customtabs/CustomTabsLauncher\n*L\n59#1:160\n90#1:161\n*E\n"})
/* loaded from: classes3.dex */
public final class e implements c {
    public final com.github.droibit.flutter.plugins.customtabs.core.a a;
    public final com.github.droibit.flutter.plugins.customtabs.core.session.b b;
    public final com.github.droibit.flutter.plugins.customtabs.core.c c;
    public final com.github.droibit.flutter.plugins.customtabs.core.b d;
    public final com.github.droibit.flutter.plugins.customtabs.core.d e;
    public Activity f;

    public e() {
        com.github.droibit.flutter.plugins.customtabs.core.a customTabsIntentFactory = new com.github.droibit.flutter.plugins.customtabs.core.a();
        com.github.droibit.flutter.plugins.customtabs.core.session.b customTabsSessionManager = new com.github.droibit.flutter.plugins.customtabs.core.session.b();
        com.github.droibit.flutter.plugins.customtabs.core.c nativeAppLauncher = new com.github.droibit.flutter.plugins.customtabs.core.c();
        com.github.droibit.flutter.plugins.customtabs.core.b externalBrowserLauncher = new com.github.droibit.flutter.plugins.customtabs.core.b();
        com.github.droibit.flutter.plugins.customtabs.core.d partialCustomTabsLauncher = new com.github.droibit.flutter.plugins.customtabs.core.d();
        Intrinsics.checkNotNullParameter(customTabsIntentFactory, "customTabsIntentFactory");
        Intrinsics.checkNotNullParameter(customTabsSessionManager, "customTabsSessionManager");
        Intrinsics.checkNotNullParameter(nativeAppLauncher, "nativeAppLauncher");
        Intrinsics.checkNotNullParameter(externalBrowserLauncher, "externalBrowserLauncher");
        Intrinsics.checkNotNullParameter(partialCustomTabsLauncher, "partialCustomTabsLauncher");
        this.a = customTabsIntentFactory;
        this.b = customTabsSessionManager;
        this.c = nativeAppLauncher;
        this.d = externalBrowserLauncher;
        this.e = partialCustomTabsLauncher;
    }

    @Override // com.github.droibit.flutter.plugins.customtabs.c
    public final void a(String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "sessionPackageName");
        com.github.droibit.flutter.plugins.customtabs.core.session.b bVar = this.b;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        LinkedHashMap linkedHashMap = bVar.a;
        com.github.droibit.flutter.plugins.customtabs.core.session.a aVar = (com.github.droibit.flutter.plugins.customtabs.core.session.a) linkedHashMap.get(packageName);
        if (aVar == null) {
            return;
        }
        aVar.b();
        linkedHashMap.remove(packageName);
    }

    @Override // com.github.droibit.flutter.plugins.customtabs.c
    public final void b(String urlString, Map map, boolean z) {
        List<ResolveInfo> queryIntentActivities;
        List<ResolveInfo> queryIntentActivities2;
        PackageManager.ResolveInfoFlags of;
        PackageManager.ResolveInfoFlags of2;
        com.github.droibit.flutter.plugins.customtabs.core.a aVar = this.a;
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        Activity context = this.f;
        if (context == null) {
            throw new g("Launching a Custom Tab requires a foreground activity.");
        }
        Uri uri = Uri.parse(urlString);
        if (z) {
            this.c.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(uri, "uri");
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                Intent addFlags = new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.BROWSABLE").addFlags(268436480);
                Intrinsics.checkNotNullExpressionValue(addFlags, "addFlags(...)");
                try {
                    context.startActivity(addFlags);
                    return;
                } catch (ActivityNotFoundException unused) {
                }
            } else {
                PackageManager packageManager = context.getPackageManager();
                Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts(uri.getScheme(), "", null));
                Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
                Intrinsics.checkNotNull(packageManager);
                if (i >= 33) {
                    of2 = PackageManager.ResolveInfoFlags.of(131072);
                    queryIntentActivities = packageManager.queryIntentActivities(data, of2);
                    Intrinsics.checkNotNull(queryIntentActivities);
                } else {
                    queryIntentActivities = packageManager.queryIntentActivities(data, 131072);
                    Intrinsics.checkNotNull(queryIntentActivities);
                }
                Set a = com.github.droibit.flutter.plugins.customtabs.core.c.a(queryIntentActivities);
                Intent addCategory = new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.BROWSABLE");
                Intrinsics.checkNotNullExpressionValue(addCategory, "addCategory(...)");
                Set createSetBuilder = SetsKt.createSetBuilder();
                if (i >= 33) {
                    of = PackageManager.ResolveInfoFlags.of(131072);
                    queryIntentActivities2 = packageManager.queryIntentActivities(addCategory, of);
                    Intrinsics.checkNotNull(queryIntentActivities2);
                } else {
                    queryIntentActivities2 = packageManager.queryIntentActivities(addCategory, 131072);
                    Intrinsics.checkNotNull(queryIntentActivities2);
                }
                createSetBuilder.addAll(com.github.droibit.flutter.plugins.customtabs.core.c.a(queryIntentActivities2));
                createSetBuilder.removeAll(a);
                if (!SetsKt.build(createSetBuilder).isEmpty()) {
                    addCategory.addFlags(268435456);
                    context.startActivity(addCategory);
                    return;
                }
            }
        }
        try {
            aVar.getClass();
            com.github.droibit.flutter.plugins.customtabs.core.options.e b = com.github.droibit.flutter.plugins.customtabs.core.a.b(map);
            this.d.getClass();
            if (com.github.droibit.flutter.plugins.customtabs.core.b.a(context, uri, b)) {
                return;
            }
            if (b == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            CustomTabsIntent a2 = aVar.a(context, b, this.b);
            this.e.getClass();
            if (com.github.droibit.flutter.plugins.customtabs.core.d.a(context, uri, a2)) {
                return;
            }
            a2.launchUrl(context, uri);
        } catch (ActivityNotFoundException e) {
            throw new g(e.getMessage());
        }
    }

    @Override // com.github.droibit.flutter.plugins.customtabs.c
    public final void c() {
        ComponentName componentName;
        ComponentName componentName2;
        ComponentName componentName3;
        ResolveInfo resolveService;
        PackageManager.ResolveInfoFlags of;
        Activity activity = this.f;
        if (activity == null) {
            return;
        }
        ActivityManager activityManager = (ActivityManager) ContextCompat.getSystemService(activity, ActivityManager.class);
        ComponentName componentName4 = new ComponentName(activity, activity.getClass());
        if (activityManager == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Iterator<ActivityManager.AppTask> it = activityManager.getAppTasks().iterator();
        while (it.hasNext()) {
            ActivityManager.RecentTaskInfo taskInfo = it.next().getTaskInfo();
            componentName = taskInfo.baseActivity;
            if (Intrinsics.areEqual(componentName4, componentName)) {
                componentName2 = taskInfo.topActivity;
                if (componentName2 == null) {
                    continue;
                } else {
                    Intent intent = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
                    componentName3 = taskInfo.topActivity;
                    Intent intent2 = intent.setPackage(componentName3 != null ? componentName3.getPackageName() : null);
                    Intrinsics.checkNotNullExpressionValue(intent2, "setPackage(...)");
                    PackageManager packageManager = activity.getPackageManager();
                    Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
                    if (Build.VERSION.SDK_INT >= 33) {
                        of = PackageManager.ResolveInfoFlags.of(0);
                        resolveService = packageManager.resolveService(intent2, of);
                    } else {
                        resolveService = packageManager.resolveService(intent2, 0);
                    }
                    if (resolveService != null) {
                        try {
                            Intent flags = new Intent(activity, activity.getClass()).setFlags(603979776);
                            Intrinsics.checkNotNullExpressionValue(flags, "setFlags(...)");
                            activity.startActivity(flags);
                            return;
                        } catch (ActivityNotFoundException unused) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // com.github.droibit.flutter.plugins.customtabs.c
    public final String d(Map<String, ? extends Object> map) {
        Boolean bool;
        Set set;
        com.github.droibit.flutter.plugins.customtabs.core.session.a aVar;
        Activity context = this.f;
        if (context != null) {
            com.github.droibit.flutter.plugins.customtabs.core.session.b bVar = this.b;
            bVar.getClass();
            if (map == null) {
                set = null;
                bool = null;
            } else {
                bool = (Boolean) map.get("prefersDefaultBrowser");
                List list = (List) map.get("fallbackCustomTabs");
                set = list != null ? CollectionsKt.toSet(list) : null;
            }
            com.github.droibit.flutter.plugins.customtabs.core.options.f options = new com.github.droibit.flutter.plugins.customtabs.core.options.f(bool, set);
            LinkedHashMap linkedHashMap = bVar.a;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(options, "options");
            com.github.droibit.flutter.plugins.customtabs.core.options.a aVar2 = options.a;
            boolean z = !Intrinsics.areEqual(aVar2.b, Boolean.TRUE);
            Intrinsics.checkNotNullParameter(context, "context");
            String a = com.droibit.android.customtabs.launcher.a.a(context, z, aVar2.a(context));
            if (a == null) {
                aVar = null;
            } else {
                aVar = (com.github.droibit.flutter.plugins.customtabs.core.session.a) linkedHashMap.get(a);
                if (aVar == null) {
                    aVar = new com.github.droibit.flutter.plugins.customtabs.core.session.a(a);
                    linkedHashMap.put(a, aVar);
                }
            }
            if (aVar != null && aVar.a(context)) {
                return aVar.a;
            }
        }
        return null;
    }

    @Override // com.github.droibit.flutter.plugins.customtabs.c
    public final void e(String packageName, List urls) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(urls, "urls");
        Intrinsics.checkNotNullParameter(packageName, "sessionPackageName");
        com.github.droibit.flutter.plugins.customtabs.core.session.b bVar = this.b;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        com.github.droibit.flutter.plugins.customtabs.core.session.a aVar = (com.github.droibit.flutter.plugins.customtabs.core.session.a) bVar.a.get(packageName);
        if (aVar == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(urls, "urls");
        CustomTabsSession customTabsSession = aVar.c;
        if (customTabsSession == null) {
            Log.w("CustomTabsAndroid", "Custom Tab session is null. Cannot may launch URL(s).");
            return;
        }
        if (urls.isEmpty()) {
            Log.w("CustomTabsAndroid", "URLs is empty. Cannot may launch URL(s).");
            return;
        }
        if (urls.size() == 1) {
            Log.d("CustomTabsAndroid", "May launch URL: " + customTabsSession.mayLaunchUrl(Uri.parse((String) urls.get(0)), null, null));
            return;
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(urls, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = urls.iterator();
        while (it.hasNext()) {
            arrayList.add(BundleKt.bundleOf(TuplesKt.to(CustomTabsService.KEY_URL, Uri.parse((String) it.next()))));
        }
        Log.d("CustomTabsAndroid", "May launch URL(s): " + customTabsSession.mayLaunchUrl(null, null, arrayList));
    }

    public final void f(Activity activity) {
        for (com.github.droibit.flutter.plugins.customtabs.core.session.a aVar : this.b.a.values()) {
            if (activity == null) {
                aVar.b();
            } else {
                aVar.a(activity);
            }
        }
        this.f = activity;
    }
}
