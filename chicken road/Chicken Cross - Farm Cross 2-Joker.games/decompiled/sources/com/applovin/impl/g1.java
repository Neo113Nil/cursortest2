package com.applovin.impl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsService;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.R;
import com.facebook.internal.AnalyticsEvents;
import com.ironsource.U3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes5.dex */
public class g1 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f4206a;
    private CustomTabsClient b;

    class a extends CustomTabsServiceConnection {
        a() {
        }

        @Override // androidx.browser.customtabs.CustomTabsServiceConnection
        public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
            g1.this.f4206a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                g1.this.f4206a.Q().a("CustomTabsManager", "Connection successful: " + componentName);
            }
            g1.this.b = customTabsClient;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            g1.this.f4206a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                g1.this.f4206a.Q().a("CustomTabsManager", "Service disconnected: " + componentName);
            }
            g1.this.b = null;
        }
    }

    private class b extends CustomTabsCallback {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f4208a;

        public b(com.applovin.impl.adview.a aVar) {
            this.f4208a = new WeakReference(aVar);
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int i, Bundle bundle) {
            com.applovin.impl.adview.a aVar = (com.applovin.impl.adview.a) this.f4208a.get();
            if (aVar == null) {
                g1.this.f4206a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    g1.this.f4206a.Q().b("CustomTabsManager", "Unable to track navigation event (" + i + "). Controller is null.");
                }
                return;
            }
            com.applovin.impl.sdk.ad.b g = aVar.g();
            if (g == null) {
                g1.this.f4206a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    g1.this.f4206a.Q().b("CustomTabsManager", "Unable to track navigation event (" + i + "). No ad specified.");
                    return;
                }
                return;
            }
            switch (i) {
                case 1:
                    if (g.shouldCustomTabsTrackEvents()) {
                        g1.this.f4206a.l().trackCustomTabsNavigationStarted(g);
                        break;
                    }
                    break;
                case 2:
                    if (g.shouldCustomTabsTrackEvents()) {
                        g1.this.f4206a.l().trackCustomTabsNavigationFinished(g);
                        break;
                    }
                    break;
                case 3:
                    if (g.shouldCustomTabsTrackEvents()) {
                        g1.this.f4206a.l().trackCustomTabsNavigationFailed(g);
                        break;
                    }
                    break;
                case 4:
                    if (g.shouldCustomTabsTrackEvents()) {
                        g1.this.f4206a.l().trackCustomTabsNavigationAborted(g);
                        break;
                    }
                    break;
                case 5:
                    if (g.shouldCustomTabsTrackEvents()) {
                        g1.this.f4206a.l().trackCustomTabsTabShown(g);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_shown"), null);
                    x2.c(aVar.e(), g, aVar.i());
                    break;
                case 6:
                    if (g.shouldCustomTabsTrackEvents()) {
                        g1.this.f4206a.l().trackCustomTabsTabHidden(g);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_hidden"), null);
                    x2.a(aVar.e(), g, aVar.i());
                    break;
                default:
                    g1.this.f4206a.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        g1.this.f4206a.Q().a("CustomTabsManager", "Unknown navigation event: " + i);
                        break;
                    }
                    break;
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
            g1.this.f4206a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                g1.this.f4206a.Q().a("CustomTabsManager", "Validation " + (z ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : U3.i.t) + " for session-URL relation(" + i + "), requestedOrigin(" + uri + ")");
            }
        }
    }

    private class c extends CustomTabsCallback {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f4209a;

        public c(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f4209a = new WeakReference(appLovinNativeAdImpl);
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int i, Bundle bundle) {
            AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) this.f4209a.get();
            if (appLovinNativeAdImpl == null) {
                g1.this.f4206a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    g1.this.f4206a.Q().b("CustomTabsManager", "Unable to track navigation event (" + i + "). Native ad is null.");
                }
                return;
            }
            switch (i) {
                case 1:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        g1.this.f4206a.l().trackNativeAdCustomTabsNavigationStarted(appLovinNativeAdImpl);
                        break;
                    }
                    break;
                case 2:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        g1.this.f4206a.l().trackNativeAdCustomTabsNavigationFinished(appLovinNativeAdImpl);
                        break;
                    }
                    break;
                case 3:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        g1.this.f4206a.l().trackNativeAdCustomTabsNavigationFailed(appLovinNativeAdImpl);
                        break;
                    }
                    break;
                case 4:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        g1.this.f4206a.l().trackNativeAdCustomTabsNavigationAborted(appLovinNativeAdImpl);
                        break;
                    }
                    break;
                case 5:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        g1.this.f4206a.l().trackNativeAdCustomTabsTabShown(appLovinNativeAdImpl);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_shown"), null);
                    break;
                case 6:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        g1.this.f4206a.l().trackNativeAdCustomTabsTabHidden(appLovinNativeAdImpl);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_hidden"), null);
                    break;
                default:
                    g1.this.f4206a.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        g1.this.f4206a.Q().a("CustomTabsManager", "Unknown navigation event: " + i);
                        break;
                    }
                    break;
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
            g1.this.f4206a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                g1.this.f4206a.Q().a("CustomTabsManager", "Validation " + (z ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : U3.i.t) + " for session-URL relation(" + i + "), requestedOrigin(" + uri + ")");
            }
        }
    }

    public g1(com.applovin.impl.sdk.l lVar) {
        this.f4206a = lVar;
    }

    public void b(final List list, final CustomTabsSession customTabsSession) {
        if (list.isEmpty()) {
            return;
        }
        if (customTabsSession != null) {
            a("warmup urls", new Runnable() { // from class: com.applovin.impl.g1$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    g1.this.a(list, customTabsSession);
                }
            });
            return;
        }
        this.f4206a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f4206a.Q().a("CustomTabsManager", "Custom Tabs session is null, cannot warmup urls");
        }
    }

    public void a() {
        if (((Boolean) this.f4206a.a(c5.p7)).booleanValue() && this.b == null) {
            String packageName = CustomTabsClient.getPackageName(com.applovin.impl.sdk.l.p(), this.f4206a.c(c5.q7), true);
            String packageName2 = CustomTabsClient.getPackageName(com.applovin.impl.sdk.l.p(), null);
            LinkedList linkedList = new LinkedList();
            if (((Boolean) this.f4206a.a(c5.r7)).booleanValue()) {
                CollectionUtils.addUniqueObjectIfExists(packageName2, linkedList);
                CollectionUtils.addUniqueObjectIfExists(packageName, linkedList);
            } else {
                CollectionUtils.addUniqueObjectIfExists(packageName, linkedList);
                CollectionUtils.addUniqueObjectIfExists(packageName2, linkedList);
            }
            if (linkedList.isEmpty()) {
                this.f4206a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f4206a.Q().b("CustomTabsManager", "Unable to find a supported Custom Tabs package name");
                    return;
                }
                return;
            }
            a(linkedList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(h1 h1Var, CustomTabsSession customTabsSession) {
        this.b.warmup(0L);
        if (h1Var == null) {
            return;
        }
        Integer e = h1Var.e();
        String b2 = h1Var.b();
        if (e == null || TextUtils.isEmpty(b2)) {
            return;
        }
        if (customTabsSession == null) {
            this.f4206a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f4206a.Q().b("CustomTabsManager", "Cannot validate session-URL relation because the session is null");
                return;
            }
            return;
        }
        this.f4206a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f4206a.Q().a("CustomTabsManager", "Validating session-URL relation: " + e + " with digital asset link: " + b2);
        }
        customTabsSession.validateRelationship(e.intValue(), Uri.parse(b2), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (com.applovin.impl.sdk.p.a() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(LinkedList linkedList) {
        boolean z = false;
        try {
            z = CustomTabsClient.bindCustomTabsService(com.applovin.impl.sdk.l.p(), (String) linkedList.poll(), new a());
            if (!z) {
                this.f4206a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f4206a.Q().b("CustomTabsManager", "Custom Tabs service not available");
                }
            }
            if (z || linkedList.isEmpty()) {
            } else {
                this.f4206a.Q();
            }
        } catch (Throwable th) {
            try {
                this.f4206a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f4206a.Q().a("CustomTabsManager", "Failed to bind to service", th);
                }
            } finally {
                if (!z && !linkedList.isEmpty()) {
                    this.f4206a.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f4206a.Q().a("CustomTabsManager", "Retrying with next package name...");
                    }
                    a(linkedList);
                }
            }
        }
    }

    public CustomTabsSession a(com.applovin.impl.adview.a aVar) {
        if (this.b == null) {
            this.f4206a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f4206a.Q().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f4206a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f4206a.Q().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            CustomTabsSession newSession = this.b.newSession(new b(aVar));
            a(newSession, aVar.g());
            return newSession;
        } catch (Exception e) {
            this.f4206a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f4206a.Q().a("CustomTabsManager", "Failed to create Custom Tabs session", e);
            }
            return null;
        }
    }

    public CustomTabsSession a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (this.b == null) {
            this.f4206a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f4206a.Q().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f4206a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f4206a.Q().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            CustomTabsSession newSession = this.b.newSession(new c(appLovinNativeAdImpl));
            a(newSession, appLovinNativeAdImpl);
            return newSession;
        } catch (Exception e) {
            this.f4206a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f4206a.Q().a("CustomTabsManager", "Failed to create Custom Tabs session", e);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, CustomTabsSession customTabsSession) {
        this.f4206a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f4206a.Q().a("CustomTabsManager", "Warming up URLs: " + list);
        }
        String str = (String) list.remove(0);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putParcelable(CustomTabsService.KEY_URL, Uri.parse(str2));
            arrayList.add(bundle);
        }
        boolean mayLaunchUrl = customTabsSession.mayLaunchUrl(Uri.parse(str), null, arrayList);
        this.f4206a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f4206a.Q().a("CustomTabsManager", "Warmup for URLs ".concat(mayLaunchUrl ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : U3.i.t));
        }
    }

    public void a(final Uri uri, final com.applovin.impl.adview.a aVar, final Activity activity) {
        if (aVar.h() == null) {
            this.f4206a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f4206a.Q().b("CustomTabsManager", "Unable to launch URL in Custom Tabs. No Custom Tabs session found.");
            }
            a(uri, activity);
            return;
        }
        if (a("launch uri", new Runnable() { // from class: com.applovin.impl.g1$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                g1.this.a(aVar, activity, uri);
            }
        })) {
            this.f4206a.o0().pauseForClick();
            return;
        }
        this.f4206a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f4206a.Q().b("CustomTabsManager", "Opening in Custom Tabs failed: " + uri);
        }
        a(uri, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.adview.a aVar, Activity activity, Uri uri) {
        a(aVar, activity).launchUrl(activity, uri);
    }

    public boolean a(final Uri uri, final AppLovinNativeAdImpl appLovinNativeAdImpl, final Activity activity) {
        if (appLovinNativeAdImpl.getCustomTabsSession() == null) {
            this.f4206a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f4206a.Q().b("CustomTabsManager", "Unable to launch URL in Custom Tabs. No Custom Tabs session found.");
            }
            a(uri, activity);
            return false;
        }
        boolean a2 = a("launch uri", new Runnable() { // from class: com.applovin.impl.g1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                g1.this.a(appLovinNativeAdImpl, activity, uri);
            }
        });
        if (a2) {
            this.f4206a.o0().pauseForClick();
        } else {
            this.f4206a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f4206a.Q().b("CustomTabsManager", "Opening in Custom Tabs failed: " + uri);
            }
            a(uri, activity);
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity, Uri uri) {
        a(appLovinNativeAdImpl, activity).launchUrl(activity, uri);
    }

    private void a(CustomTabsSession customTabsSession, com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null || !bVar.isCustomTabsClientWarmupEnabled()) {
            return;
        }
        a(bVar.getCustomTabsSettings(), customTabsSession);
    }

    private void a(CustomTabsSession customTabsSession, AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (appLovinNativeAdImpl == null || !appLovinNativeAdImpl.isCustomTabsClientWarmupEnabled()) {
            return;
        }
        a(appLovinNativeAdImpl.getCustomTabsSettings(), customTabsSession);
    }

    private void a(final h1 h1Var, final CustomTabsSession customTabsSession) {
        a("client warmup", new Runnable() { // from class: com.applovin.impl.g1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                g1.this.b(h1Var, customTabsSession);
            }
        });
    }

    private CustomTabsIntent a(com.applovin.impl.adview.a aVar, Activity activity) {
        com.applovin.impl.sdk.ad.b g = aVar.g();
        return a(g != null ? g.getCustomTabsSettings() : null, g != null ? g.getCustomTabsHeaders() : Bundle.EMPTY, aVar.h(), activity);
    }

    private CustomTabsIntent a(AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity) {
        return a(appLovinNativeAdImpl.getCustomTabsSettings(), appLovinNativeAdImpl.getCustomTabsHeaders(), appLovinNativeAdImpl.getCustomTabsSession(), activity);
    }

    private CustomTabsIntent a(h1 h1Var, Bundle bundle, CustomTabsSession customTabsSession, Activity activity) {
        this.f4206a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f4206a.Q().a("CustomTabsManager", "Creating Custom Tabs intent");
        }
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(customTabsSession);
        if (((Boolean) this.f4206a.a(c5.s7)).booleanValue()) {
            builder.setStartAnimations(activity, R.anim.applovin_slide_up_animation, R.anim.applovin_slide_down_animation);
            builder.setExitAnimations(activity, R.anim.applovin_slide_up_animation, R.anim.applovin_slide_down_animation);
        }
        if (h1Var != null) {
            Integer h = h1Var.h();
            if (h != null) {
                builder.setDefaultColorSchemeParams(new CustomTabColorSchemeParams.Builder().setToolbarColor(h.intValue()).build());
            }
            Integer a2 = h1Var.a();
            if (a2 != null) {
                builder.setColorSchemeParams(2, new CustomTabColorSchemeParams.Builder().setToolbarColor(a2.intValue()).build());
            }
            Boolean i = h1Var.i();
            if (i != null) {
                builder.setUrlBarHidingEnabled(i.booleanValue());
            }
            Boolean g = h1Var.g();
            if (g != null) {
                builder.setShowTitle(g.booleanValue());
            }
            Boolean c2 = h1Var.c();
            if (c2 != null) {
                builder.setInstantAppsEnabled(c2.booleanValue());
            }
            Integer f = h1Var.f();
            if (f != null) {
                builder.setShareState(f.intValue());
            }
        }
        CustomTabsIntent build = builder.build();
        if (h1Var != null) {
            String d = h1Var.d();
            if (d != null) {
                build.intent.putExtra("android.intent.extra.REFERRER", Uri.parse(d));
            }
            if (!bundle.isEmpty()) {
                build.intent.putExtra("com.android.browser.headers", bundle);
            }
        }
        return build;
    }

    private void a(Uri uri, Activity activity) {
        if (((Boolean) this.f4206a.a(c5.t7)).booleanValue()) {
            q7.a(uri, activity, this.f4206a);
        }
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_failure"), CollectionUtils.map("url", uri));
    }

    private boolean a(String str, Runnable runnable) {
        try {
            this.f4206a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f4206a.Q().a("CustomTabsManager", "Running operation: " + str);
            }
            runnable.run();
            this.f4206a.Q();
            if (!com.applovin.impl.sdk.p.a()) {
                return true;
            }
            this.f4206a.Q().a("CustomTabsManager", "Finished operation: " + str);
            return true;
        } catch (Throwable th) {
            this.f4206a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f4206a.Q().a("CustomTabsManager", "Failed to run operation: " + str, th);
            }
            this.f4206a.E().a("CustomTabsManager", str, th);
            return false;
        }
    }
}
