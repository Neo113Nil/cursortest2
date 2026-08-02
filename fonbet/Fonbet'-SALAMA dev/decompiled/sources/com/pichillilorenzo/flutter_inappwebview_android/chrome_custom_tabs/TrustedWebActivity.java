package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p.BinderC1519f;
import p.C1524k;
import p.C1530q;
import q.C1543c;
import q.C1544d;
import q.InterfaceC1542b;

/* loaded from: classes2.dex */
public class TrustedWebActivity extends ChromeCustomTabsActivity {
    protected static final String LOG_TAG = "TrustedWebActivity";
    public C1544d builder;

    private void prepareCustomTabs() {
        String str = this.customSettings.toolbarBackgroundColor;
        Integer num = null;
        Integer valueOf = (str == null || str.isEmpty()) ? null : Integer.valueOf(Color.parseColor(this.customSettings.toolbarBackgroundColor) | (-16777216));
        String str2 = this.customSettings.navigationBarColor;
        Integer valueOf2 = (str2 == null || str2.isEmpty()) ? null : Integer.valueOf((-16777216) | Color.parseColor(this.customSettings.navigationBarColor));
        String str3 = this.customSettings.navigationBarDividerColor;
        Integer valueOf3 = (str3 == null || str3.isEmpty()) ? null : Integer.valueOf(Color.parseColor(this.customSettings.navigationBarDividerColor));
        String str4 = this.customSettings.secondaryToolbarColor;
        if (str4 != null && !str4.isEmpty()) {
            num = Integer.valueOf(Color.parseColor(this.customSettings.secondaryToolbarColor));
        }
        C1524k c1524k = this.builder.f15719b;
        c1524k.getClass();
        Bundle bundle = new Bundle();
        if (valueOf != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
        }
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num.intValue());
        }
        if (valueOf2 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", valueOf2.intValue());
        }
        if (valueOf3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", valueOf3.intValue());
        }
        c1524k.f15647e = bundle;
        List<String> list = this.customSettings.additionalTrustedOrigins;
        if (list != null && !list.isEmpty()) {
            this.builder.f15720c = this.customSettings.additionalTrustedOrigins;
        }
        ChromeCustomTabsSettings chromeCustomTabsSettings = this.customSettings;
        InterfaceC1542b interfaceC1542b = chromeCustomTabsSettings.displayMode;
        if (interfaceC1542b != null) {
            this.builder.f15721d = interfaceC1542b;
        }
        this.builder.f15722e = chromeCustomTabsSettings.screenOrientation.intValue();
    }

    private void prepareCustomTabsIntent(C1543c c1543c) {
        Intent intent = c1543c.f15716a;
        String str = this.customSettings.packageName;
        if (str != null) {
            intent.setPackage(str);
        } else {
            intent.setPackage(CustomTabsHelper.getPackageNameToUse(this));
        }
        if (this.customSettings.keepAliveEnabled.booleanValue()) {
            CustomTabsHelper.addKeepAliveExtra(this, intent);
        }
        if (this.customSettings.alwaysUseBrowserUI.booleanValue()) {
            if (intent == null) {
                intent = new Intent("android.intent.action.VIEW");
            }
            intent.addFlags(268435456);
            intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity
    public void launchUrl(String str, Map<String, String> map, String str2, List<String> list) {
        if (this.customTabsSession == null) {
            return;
        }
        Uri parse = Uri.parse(str);
        mayLaunchUrl(str, list);
        this.builder = new C1544d(parse);
        prepareCustomTabs();
        C1544d c1544d = this.builder;
        C1530q c1530q = this.customTabsSession;
        if (c1530q == null) {
            c1544d.getClass();
            throw new NullPointerException("CustomTabsSession is required for launching a TWA");
        }
        C1524k c1524k = c1544d.f15719b;
        c1524k.getClass();
        String packageName = c1530q.f15661d.getPackageName();
        Intent intent = c1524k.f15643a;
        intent.setPackage(packageName);
        BinderC1519f binderC1519f = c1530q.f15660c;
        Bundle bundle = new Bundle();
        bundle.putBinder("android.support.customtabs.extra.SESSION", binderC1519f);
        intent.putExtras(bundle);
        Intent intent2 = c1524k.a().f15650a;
        intent2.setData(c1544d.f15718a);
        intent2.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
        if (c1544d.f15720c != null) {
            intent2.putExtra("android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS", new ArrayList(c1544d.f15720c));
        }
        List emptyList = Collections.emptyList();
        intent2.putExtra("androidx.browser.trusted.extra.DISPLAY_MODE", c1544d.f15721d.q());
        intent2.putExtra("androidx.browser.trusted.extra.SCREEN_ORIENTATION", c1544d.f15722e);
        C1543c c1543c = new C1543c(intent2, emptyList);
        prepareCustomTabsIntent(c1543c);
        CustomTabActivityHelper.openTrustedWebActivity(this, c1543c, parse, map, str2 != null ? Uri.parse(str2) : null, 100);
    }
}
