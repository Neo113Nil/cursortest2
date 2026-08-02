package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import A5.o;
import A5.r;
import A5.s;
import W5.AbstractC0486a1;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import c.b;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsSecondaryToolbar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p.C1530q;

/* loaded from: classes2.dex */
public class ChromeCustomTabsChannelDelegate extends ChannelDelegateImpl {
    private ChromeCustomTabsActivity chromeCustomTabsActivity;

    public ChromeCustomTabsChannelDelegate(ChromeCustomTabsActivity chromeCustomTabsActivity, s sVar) {
        super(sVar);
        this.chromeCustomTabsActivity = chromeCustomTabsActivity;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.chromeCustomTabsActivity = null;
    }

    public void onClosed() {
        s channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onClosed", new HashMap(), null);
    }

    public void onCompletedInitialLoad() {
        s channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onCompletedInitialLoad", new HashMap(), null);
    }

    public void onGreatestScrollPercentageIncreased(int i7) {
        s channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("scrollPercentage", Integer.valueOf(i7));
        channel.a("onGreatestScrollPercentageIncreased", hashMap, null);
    }

    public void onItemActionPerform(int i7, String str, String str2) {
        s channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        AbstractC0486a1.m(i7, hashMap, "id", "url", str);
        hashMap.put("title", str2);
        channel.a("onItemActionPerform", hashMap, null);
    }

    public void onMessageChannelReady() {
        s channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onMessageChannelReady", new HashMap(), null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, A5.q
    public void onMethodCall(o oVar, r rVar) {
        boolean z4;
        C1530q c1530q;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        Activity activity;
        z4 = false;
        String str = oVar.f676a;
        str.getClass();
        switch (str) {
            case "isEngagementSignalsApiAvailable":
                ChromeCustomTabsActivity chromeCustomTabsActivity = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity == null || (c1530q = chromeCustomTabsActivity.customTabsSession) == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    try {
                        rVar.success(Boolean.valueOf(c1530q.b(new Bundle())));
                        break;
                    } catch (Throwable unused) {
                        rVar.success(Boolean.FALSE);
                        return;
                    }
                }
            case "launchUrl":
                if (this.chromeCustomTabsActivity == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    String str2 = (String) oVar.a("url");
                    if (str2 == null) {
                        rVar.success(Boolean.FALSE);
                        break;
                    } else {
                        this.chromeCustomTabsActivity.launchUrl(str2, (Map) oVar.a("headers"), (String) oVar.a("referrer"), (List) oVar.a("otherLikelyURLs"));
                        rVar.success(Boolean.TRUE);
                        break;
                    }
                }
            case "updateSecondaryToolbar":
                if (this.chromeCustomTabsActivity == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    this.chromeCustomTabsActivity.updateSecondaryToolbar(CustomTabsSecondaryToolbar.fromMap((Map) oVar.a("secondaryToolbar")));
                    rVar.success(Boolean.TRUE);
                    break;
                }
            case "updateActionButton":
                if (this.chromeCustomTabsActivity == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    this.chromeCustomTabsActivity.updateActionButton((byte[]) oVar.a("icon"), (String) oVar.a("description"));
                    rVar.success(Boolean.TRUE);
                    break;
                }
            case "close":
                ChromeCustomTabsActivity chromeCustomTabsActivity2 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity2 == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    chromeCustomTabsActivity2.onStop();
                    this.chromeCustomTabsActivity.onDestroy();
                    this.chromeCustomTabsActivity.close();
                    ChromeSafariBrowserManager chromeSafariBrowserManager = this.chromeCustomTabsActivity.manager;
                    if (chromeSafariBrowserManager != null && (inAppWebViewFlutterPlugin = chromeSafariBrowserManager.plugin) != null && (activity = inAppWebViewFlutterPlugin.activity) != null) {
                        Intent intent = new Intent(activity, activity.getClass());
                        intent.addFlags(67108864);
                        intent.addFlags(536870912);
                        activity.startActivity(intent);
                    }
                    this.chromeCustomTabsActivity.dispose();
                    rVar.success(Boolean.TRUE);
                    break;
                }
                break;
            case "validateRelationship":
                ChromeCustomTabsActivity chromeCustomTabsActivity3 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity3 != null && chromeCustomTabsActivity3.customTabsSession != null) {
                    Integer num = (Integer) oVar.a("relation");
                    String str3 = (String) oVar.a("origin");
                    C1530q c1530q2 = this.chromeCustomTabsActivity.customTabsSession;
                    int intValue = num.intValue();
                    Uri parse = Uri.parse(str3);
                    c1530q2.getClass();
                    if (intValue >= 1 && intValue <= 2) {
                        try {
                            z4 = ((b) c1530q2.f15659b).A0(c1530q2.f15660c, intValue, parse, c1530q2.a(null));
                        } catch (RemoteException unused2) {
                        }
                    }
                    rVar.success(Boolean.valueOf(z4));
                    break;
                } else {
                    rVar.success(Boolean.FALSE);
                    break;
                }
                break;
            case "requestPostMessageChannel":
                ChromeCustomTabsActivity chromeCustomTabsActivity4 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity4 != null && chromeCustomTabsActivity4.customTabsSession != null) {
                    String str4 = (String) oVar.a("sourceOrigin");
                    String str5 = (String) oVar.a("targetOrigin");
                    rVar.success(Boolean.valueOf(this.chromeCustomTabsActivity.customTabsSession.d(Uri.parse(str4), str5 != null ? Uri.parse(str5) : null, new Bundle())));
                    break;
                } else {
                    rVar.success(Boolean.FALSE);
                    break;
                }
            case "postMessage":
                ChromeCustomTabsActivity chromeCustomTabsActivity5 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity5 != null && chromeCustomTabsActivity5.customTabsSession != null) {
                    rVar.success(Integer.valueOf(this.chromeCustomTabsActivity.customTabsSession.c((String) oVar.a("message"), new Bundle())));
                    break;
                } else {
                    rVar.success(-3);
                    break;
                }
            case "mayLaunchUrl":
                if (this.chromeCustomTabsActivity == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    rVar.success(Boolean.valueOf(this.chromeCustomTabsActivity.mayLaunchUrl((String) oVar.a("url"), (List) oVar.a("otherLikelyURLs"))));
                    break;
                }
            default:
                rVar.notImplemented();
                break;
        }
    }

    public void onNavigationEvent(int i7) {
        s channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("navigationEvent", Integer.valueOf(i7));
        channel.a("onNavigationEvent", hashMap, null);
    }

    public void onOpened() {
        s channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onOpened", new HashMap(), null);
    }

    public void onPostMessage(String str) {
        s channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("message", str);
        channel.a("onPostMessage", hashMap, null);
    }

    public void onRelationshipValidationResult(int i7, Uri uri, boolean z4) {
        s channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("relation", Integer.valueOf(i7));
        hashMap.put("requestedOrigin", uri.toString());
        hashMap.put("result", Boolean.valueOf(z4));
        channel.a("onRelationshipValidationResult", hashMap, null);
    }

    public void onSecondaryItemActionPerform(String str, String str2) {
        s channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("name", str);
        hashMap.put("url", str2);
        channel.a("onSecondaryItemActionPerform", hashMap, null);
    }

    public void onServiceConnected() {
        s channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onServiceConnected", new HashMap(), null);
    }

    public void onSessionEnded(boolean z4) {
        s channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("didUserInteract", Boolean.valueOf(z4));
        channel.a("onSessionEnded", hashMap, null);
    }

    public void onVerticalScrollEvent(boolean z4) {
        s channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isDirectionUp", Boolean.valueOf(z4));
        channel.a("onVerticalScrollEvent", hashMap, null);
    }
}
