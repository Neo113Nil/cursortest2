package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p109p.f;
import p109p.k;
import p109p.q;
import p116q.b;
import p116q.c;
import p116q.d;

/* JADX INFO: loaded from: classes2.dex */
public class TrustedWebActivity extends ChromeCustomTabsActivity {
    protected static final String LOG_TAG = "TrustedWebActivity";
    public d builder;

    private void prepareCustomTabs() {
        String str = this.customSettings.toolbarBackgroundColor;
        Integer numValueOf = null;
        Integer numValueOf2 = (str == null || str.isEmpty()) ? null : Integer.valueOf(Color.parseColor(this.customSettings.toolbarBackgroundColor) | (-16777216));
        String str2 = this.customSettings.navigationBarColor;
        Integer numValueOf3 = (str2 == null || str2.isEmpty()) ? null : Integer.valueOf((-16777216) | Color.parseColor(this.customSettings.navigationBarColor));
        String str3 = this.customSettings.navigationBarDividerColor;
        Integer numValueOf4 = (str3 == null || str3.isEmpty()) ? null : Integer.valueOf(Color.parseColor(this.customSettings.navigationBarDividerColor));
        String str4 = this.customSettings.secondaryToolbarColor;
        if (str4 != null && !str4.isEmpty()) {
            numValueOf = Integer.valueOf(Color.parseColor(this.customSettings.secondaryToolbarColor));
        }
        k kVar = this.builder.f15725b;
        kVar.getClass();
        Bundle bundle = new Bundle();
        if (numValueOf2 != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", numValueOf2.intValue());
        }
        if (numValueOf != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", numValueOf.intValue());
        }
        if (numValueOf3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", numValueOf3.intValue());
        }
        if (numValueOf4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", numValueOf4.intValue());
        }
        kVar.f15653e = bundle;
        List<String> list = this.customSettings.additionalTrustedOrigins;
        if (list != null && !list.isEmpty()) {
            this.builder.f15726c = this.customSettings.additionalTrustedOrigins;
        }
        ChromeCustomTabsSettings chromeCustomTabsSettings = this.customSettings;
        b bVar = chromeCustomTabsSettings.displayMode;
        if (bVar != null) {
            this.builder.f15727d = bVar;
        }
        this.builder.f15728e = chromeCustomTabsSettings.screenOrientation.intValue();
    }

    private void prepareCustomTabsIntent(c cVar) {
        Intent intent = cVar.f15722a;
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
        Uri uri = Uri.parse(str);
        mayLaunchUrl(str, list);
        this.builder = new d(uri);
        prepareCustomTabs();
        d dVar = this.builder;
        q qVar = this.customTabsSession;
        if (qVar == null) {
            dVar.getClass();
            throw new NullPointerException("CustomTabsSession is required for launching a TWA");
        }
        k kVar = dVar.f15725b;
        kVar.getClass();
        String packageName = qVar.f15667d.getPackageName();
        Intent intent = kVar.f15649a;
        intent.setPackage(packageName);
        f fVar = qVar.f15666c;
        Bundle bundle = new Bundle();
        bundle.putBinder("android.support.customtabs.extra.SESSION", fVar);
        intent.putExtras(bundle);
        Intent intent2 = kVar.a().f15656a;
        intent2.setData(dVar.f15724a);
        intent2.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
        if (dVar.f15726c != null) {
            intent2.putExtra("android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS", new ArrayList(dVar.f15726c));
        }
        List listEmptyList = Collections.emptyList();
        intent2.putExtra("androidx.browser.trusted.extra.DISPLAY_MODE", dVar.f15727d.q());
        intent2.putExtra("androidx.browser.trusted.extra.SCREEN_ORIENTATION", dVar.f15728e);
        c cVar = new c(intent2, listEmptyList);
        prepareCustomTabsIntent(cVar);
        CustomTabActivityHelper.openTrustedWebActivity(this, cVar, uri, map, str2 != null ? Uri.parse(str2) : null, 100);
    }
}
