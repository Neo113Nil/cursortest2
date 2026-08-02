package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import A5.o;
import A5.r;
import A5.s;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import io.sentry.protocol.SdkVersion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p.AbstractC1520g;

/* loaded from: classes2.dex */
public class ChromeSafariBrowserManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "ChromeBrowserManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_chromesafaribrowser";
    public static final Map<String, ChromeSafariBrowserManager> shared = new HashMap();
    public final Map<String, ChromeCustomTabsActivity> browsers;
    public String id;
    public InAppWebViewFlutterPlugin plugin;

    public ChromeSafariBrowserManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new s(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.browsers = new HashMap();
        String uuid = UUID.randomUUID().toString();
        this.id = uuid;
        this.plugin = inAppWebViewFlutterPlugin;
        shared.put(uuid, this);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        for (ChromeCustomTabsActivity chromeCustomTabsActivity : this.browsers.values()) {
            if (chromeCustomTabsActivity != null) {
                chromeCustomTabsActivity.close();
                chromeCustomTabsActivity.dispose();
            }
        }
        this.browsers.clear();
        shared.remove(this.id);
        this.plugin = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, A5.q
    public void onMethodCall(o oVar, r rVar) {
        String str;
        Activity activity;
        str = (String) oVar.a("id");
        String str2 = oVar.f676a;
        str2.getClass();
        switch (str2) {
            case "getMaxToolbarItems":
                rVar.success(5);
                break;
            case "open":
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
                if (inAppWebViewFlutterPlugin != null && inAppWebViewFlutterPlugin.activity != null) {
                    open(this.plugin.activity, str, (String) oVar.a("url"), (HashMap) oVar.a("headers"), (String) oVar.a("referrer"), (ArrayList) oVar.a("otherLikelyURLs"), (HashMap) oVar.a("settings"), (HashMap) oVar.a("actionButton"), (HashMap) oVar.a("secondaryToolbar"), (List) oVar.a("menuItemList"), rVar);
                    break;
                } else {
                    rVar.success(Boolean.FALSE);
                    break;
                }
                break;
            case "getPackageName":
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
                if (inAppWebViewFlutterPlugin2 != null && inAppWebViewFlutterPlugin2.activity != null) {
                    rVar.success(AbstractC1520g.b(this.plugin.activity, (ArrayList) oVar.a(SdkVersion.JsonKeys.PACKAGES), ((Boolean) oVar.a("ignoreDefault")).booleanValue()));
                    break;
                } else {
                    rVar.success(null);
                    break;
                }
                break;
            case "isAvailable":
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin3 = this.plugin;
                if (inAppWebViewFlutterPlugin3 != null && (activity = inAppWebViewFlutterPlugin3.activity) != null) {
                    rVar.success(Boolean.valueOf(CustomTabActivityHelper.isAvailable(activity)));
                    break;
                } else {
                    rVar.success(Boolean.FALSE);
                    break;
                }
                break;
            default:
                rVar.notImplemented();
                break;
        }
    }

    public void open(Activity activity, String str, String str2, HashMap<String, Object> hashMap, String str3, ArrayList<String> arrayList, HashMap<String, Object> hashMap2, HashMap<String, Object> hashMap3, HashMap<String, Object> hashMap4, List<HashMap<String, Object>> list, r rVar) {
        Bundle bundle = new Bundle();
        bundle.putString("url", str2);
        bundle.putString("id", str);
        bundle.putString("managerId", this.id);
        bundle.putSerializable("headers", hashMap);
        bundle.putString("referrer", str3);
        bundle.putSerializable("otherLikelyURLs", arrayList);
        bundle.putSerializable("settings", hashMap2);
        bundle.putSerializable("actionButton", hashMap3);
        bundle.putSerializable("secondaryToolbar", hashMap4);
        bundle.putSerializable("menuItemList", (Serializable) list);
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) Util.getOrDefault(hashMap2, "isSingleInstance", bool);
        Boolean bool3 = (Boolean) Util.getOrDefault(hashMap2, "isTrustedWebActivity", bool);
        if (!CustomTabActivityHelper.isAvailable(activity)) {
            rVar.error(LOG_TAG, "ChromeCustomTabs is not available!", null);
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) (!bool2.booleanValue() ? !bool3.booleanValue() ? ChromeCustomTabsActivity.class : TrustedWebActivity.class : !bool3.booleanValue() ? ChromeCustomTabsActivitySingleInstance.class : TrustedWebActivitySingleInstance.class));
        intent.putExtras(bundle);
        if (((Boolean) Util.getOrDefault(hashMap2, "noHistory", bool)).booleanValue()) {
            intent.addFlags(1073741824);
        }
        activity.startActivity(intent);
        rVar.success(Boolean.TRUE);
    }
}
