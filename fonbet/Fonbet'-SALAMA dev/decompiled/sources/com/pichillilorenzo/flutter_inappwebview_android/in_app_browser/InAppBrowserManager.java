package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

import A5.o;
import A5.r;
import A5.s;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import t.e;

/* loaded from: classes2.dex */
public class InAppBrowserManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "InAppBrowserManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappbrowser";
    public static final Map<String, InAppBrowserManager> shared = new HashMap();
    public String id;
    public InAppWebViewFlutterPlugin plugin;

    public InAppBrowserManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new s(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        String uuid = UUID.randomUUID().toString();
        this.id = uuid;
        this.plugin = inAppWebViewFlutterPlugin;
        shared.put(uuid, this);
    }

    public static String getMimeType(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        shared.remove(this.id);
        this.plugin = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, A5.q
    public void onMethodCall(o oVar, r rVar) {
        Activity activity;
        String str = oVar.f676a;
        str.getClass();
        if (str.equals("openWithSystemBrowser")) {
            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
            if (inAppWebViewFlutterPlugin == null || inAppWebViewFlutterPlugin.activity == null) {
                rVar.success(Boolean.FALSE);
                return;
            } else {
                openWithSystemBrowser(this.plugin.activity, (String) oVar.a("url"), rVar);
                return;
            }
        }
        if (!str.equals("open")) {
            rVar.notImplemented();
            return;
        }
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
        if (inAppWebViewFlutterPlugin2 == null || (activity = inAppWebViewFlutterPlugin2.activity) == null) {
            rVar.success(Boolean.FALSE);
        } else {
            open(activity, (Map) oVar.f677b);
            rVar.success(Boolean.TRUE);
        }
    }

    public void open(Activity activity, Map<String, Object> map) {
        String str = (String) map.get("id");
        Map map2 = (Map) map.get("urlRequest");
        String str2 = (String) map.get("assetFilePath");
        String str3 = (String) map.get("data");
        String str4 = (String) map.get("mimeType");
        String str5 = (String) map.get(RRWebVideoEvent.JsonKeys.ENCODING);
        String str6 = (String) map.get("baseUrl");
        String str7 = (String) map.get("historyUrl");
        Map map3 = (Map) map.get("settings");
        Map map4 = (Map) map.get("contextMenu");
        Integer num = (Integer) map.get("windowId");
        List list = (List) map.get("initialUserScripts");
        Map map5 = (Map) map.get("pullToRefreshSettings");
        List list2 = (List) map.get("menuItems");
        Bundle bundle = new Bundle();
        bundle.putString("fromActivity", activity.getClass().getName());
        bundle.putSerializable("initialUrlRequest", (Serializable) map2);
        bundle.putString("initialFile", str2);
        bundle.putString("initialData", str3);
        bundle.putString("initialMimeType", str4);
        bundle.putString("initialEncoding", str5);
        bundle.putString("initialBaseUrl", str6);
        bundle.putString("initialHistoryUrl", str7);
        bundle.putString("id", str);
        bundle.putString("managerId", this.id);
        bundle.putSerializable("settings", (Serializable) map3);
        bundle.putSerializable("contextMenu", (Serializable) map4);
        bundle.putInt("windowId", num != null ? num.intValue() : -1);
        bundle.putSerializable("initialUserScripts", (Serializable) list);
        bundle.putSerializable("pullToRefreshInitialSettings", (Serializable) map5);
        bundle.putSerializable("menuItems", (Serializable) list2);
        startInAppBrowserActivity(activity, bundle);
    }

    public void openExternalExcludeCurrentApp(Activity activity, Intent intent) {
        String packageName = activity.getPackageName();
        List<ResolveInfo> queryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            if (packageName.equals(resolveInfo.activityInfo.packageName)) {
                z4 = true;
            } else {
                Intent intent2 = (Intent) intent.clone();
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                arrayList.add(intent2);
            }
        }
        if (!z4 || arrayList.size() == 0) {
            activity.startActivity(intent);
            return;
        }
        if (arrayList.size() == 1) {
            activity.startActivity((Intent) arrayList.get(0));
        } else if (arrayList.size() > 0) {
            Intent createChooser = Intent.createChooser((Intent) arrayList.remove(arrayList.size() - 1), null);
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
            activity.startActivity(createChooser);
        }
    }

    public void openWithSystemBrowser(Activity activity, String str, r rVar) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            Uri parse = Uri.parse(str);
            if ("file".equals(parse.getScheme())) {
                intent.setDataAndType(parse, getMimeType(str));
            } else {
                intent.setData(parse);
            }
            intent.putExtra("com.android.browser.application_id", activity.getPackageName());
            openExternalExcludeCurrentApp(activity, intent);
            rVar.success(Boolean.TRUE);
        } catch (RuntimeException e7) {
            StringBuilder d7 = e.d(str, " cannot be opened: ");
            d7.append(e7.toString());
            Log.d(LOG_TAG, d7.toString());
            rVar.error(LOG_TAG, str + " cannot be opened!", null);
        }
    }

    public void startInAppBrowserActivity(Activity activity, Bundle bundle) {
        Intent intent = new Intent(activity, (Class<?>) InAppBrowserActivity.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        activity.startActivity(intent);
    }
}
