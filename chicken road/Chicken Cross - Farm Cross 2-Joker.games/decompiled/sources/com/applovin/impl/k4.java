package com.applovin.impl;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import io.ktor.sse.ServerSentEventKt;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class k4 {

    /* renamed from: a, reason: collision with root package name */
    protected final AppLovinAdBase f4270a;
    protected final com.applovin.impl.sdk.l b;
    protected final com.applovin.impl.sdk.p c;
    protected final String d;
    protected boolean e;
    protected AdSession f;
    protected AdEvents g;

    public k4(AppLovinAdBase appLovinAdBase) {
        this.f4270a = appLovinAdBase;
        this.b = appLovinAdBase.getSdk();
        this.c = appLovinAdBase.getSdk().Q();
        String str = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        this.d = StringUtils.isValidString(appLovinAdBase.getDspName()) ? str + ServerSentEventKt.COLON + appLovinAdBase.getDspName() : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        AdSessionContext a2;
        if (!this.f4270a.isOpenMeasurementEnabled()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.d(this.d, "Skip starting session - Open Measurement disabled");
                return;
            }
            return;
        }
        if (this.f != null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.k(this.d, "Attempting to start session again for ad: " + this.f4270a);
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.d, "Starting session");
        }
        AdSessionConfiguration a3 = a();
        if (a3 == null || (a2 = a(webView)) == null) {
            return;
        }
        try {
            AdSession createAdSession = AdSession.createAdSession(a3, a2);
            this.f = createAdSession;
            try {
                this.g = AdEvents.createAdEvents(createAdSession);
                a(this.f);
                this.f.start();
                this.e = true;
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.a(this.d, "Session started");
                }
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.a(this.d, "Failed to create ad events", th);
                }
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.d, "Failed to create session", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.g.loaded();
    }

    protected abstract AdSessionConfiguration a();

    protected abstract AdSessionContext a(WebView webView);

    protected void a(AdSession adSession) {
    }

    public void c(final WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.k4$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                k4.this.b(webView);
            }
        });
    }

    public void e() {
        c(null);
    }

    public void f() {
        b("stop session", new Runnable() { // from class: com.applovin.impl.k4$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                k4.this.b();
            }
        });
    }

    public void g() {
        b("track impression event", new Runnable() { // from class: com.applovin.impl.k4$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                k4.this.c();
            }
        });
    }

    public void h() {
        b("track loaded", new Runnable() { // from class: com.applovin.impl.k4$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                k4.this.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.g.impressionOccurred();
    }

    public void a(View view) {
        b(view, Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, List list) {
        this.f.registerAdView(view);
        this.f.removeAllFriendlyObstructions();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m4 m4Var = (m4) it.next();
            if (m4Var.c() != null) {
                try {
                    this.f.addFriendlyObstruction(m4Var.c(), m4Var.b(), m4Var.a());
                } catch (Throwable th) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.c.a(this.d, "Failed to add friendly obstruction (" + m4Var + ")", th);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.f.error(ErrorType.VIDEO, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (this.e) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.a(this.d, "Running operation: " + str);
                }
                runnable.run();
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.d, "Failed to run operation: " + str, th);
            }
        }
    }

    public void b(final View view, final List list) {
        b("update main view: " + view, new Runnable() { // from class: com.applovin.impl.k4$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                k4.this.a(view, list);
            }
        });
    }

    public void b(final String str) {
        b("track error", new Runnable() { // from class: com.applovin.impl.k4$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                k4.this.a(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.e = false;
        this.f.finish();
        this.f = null;
        this.g = null;
    }

    protected void b(final String str, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.k4$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                k4.this.a(str, runnable);
            }
        });
    }
}
