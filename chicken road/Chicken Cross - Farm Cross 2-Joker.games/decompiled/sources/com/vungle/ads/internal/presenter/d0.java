package com.vungle.ads.internal.presenter;

import android.content.Context;
import android.webkit.WebView;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.i0;
import com.vungle.ads.internal.model.j3;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class d0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12084a;
    public final /* synthetic */ i0 b;
    public final /* synthetic */ j3 c;
    public final /* synthetic */ com.vungle.ads.internal.load.f d;
    public final /* synthetic */ Long e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ com.vungle.ads.internal.model.f0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Context context, i0 i0Var, j3 j3Var, com.vungle.ads.internal.load.f fVar, Long l, String str, String str2, com.vungle.ads.internal.model.f0 f0Var) {
        super(0);
        this.f12084a = context;
        this.b = i0Var;
        this.c = j3Var;
        this.d = fVar;
        this.e = l;
        this.f = str;
        this.g = str2;
        this.h = f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00f3  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Object m8079constructorimpl;
        Throwable m8082exceptionOrNullimpl;
        WebView webView;
        com.vungle.ads.internal.ui.z zVar;
        boolean z;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        ReentrantLock reentrantLock = f0.f12088a;
        Context context = this.f12084a;
        i0 i0Var = this.b;
        j3 j3Var = this.c;
        com.vungle.ads.internal.load.f fVar = this.d;
        Long l = this.e;
        String str = this.f;
        String str2 = this.g;
        com.vungle.ads.internal.model.f0 f0Var = this.h;
        try {
            Result.Companion companion = Result.INSTANCE;
            webView = new WebView(context.getApplicationContext());
            com.vungle.ads.internal.platform.g.a(webView, f0Var);
            zVar = new com.vungle.ads.internal.ui.z(i0Var, j3Var, ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new b0(context)).getValue())).f(), (com.vungle.ads.internal.platform.f) LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new c0(context)).getValue(), fVar, l);
            ConfigManager.INSTANCE.getClass();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        if (ConfigManager.m()) {
            PrivacyManager.INSTANCE.getClass();
            if (Intrinsics.areEqual("unknown", PrivacyManager.b())) {
                z = true;
                zVar.a(z, ConfigManager.l(), ConfigManager.k(), ConfigManager.i(), ConfigManager.j());
                webView.setWebViewClient(zVar);
                webView.loadUrl(str);
                linkedHashMap = f0.b;
                linkedHashMap.put(String.valueOf(str2), new a0(zVar, webView));
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                Sdk.SDKMetric.SDKMetricType sDKMetricType = Sdk.SDKMetric.SDKMetricType.CONCURRENT_CACHED_WEBVIEW_COUNT;
                linkedHashMap2 = f0.b;
                AnalyticsClient.a(analyticsClient, sDKMetricType, linkedHashMap2.size(), i0Var.q(), null, 8);
                boolean z2 = com.vungle.ads.internal.util.u.f12190a;
                StringBuilder sb = new StringBuilder("Preload complete. Cache size: ");
                linkedHashMap3 = f0.b;
                m8079constructorimpl = Result.m8079constructorimpl(Integer.valueOf(com.vungle.ads.internal.util.t.a("WebViewManager", sb.append(linkedHashMap3.size()).toString())));
                com.vungle.ads.internal.load.f fVar2 = this.d;
                m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
                if (m8082exceptionOrNullimpl != null) {
                    boolean z3 = com.vungle.ads.internal.util.u.f12190a;
                    com.vungle.ads.internal.util.t.a("WebViewManager", "Preload webview failed", m8082exceptionOrNullimpl);
                    fVar2.b();
                }
                return Unit.INSTANCE;
            }
        }
        z = false;
        zVar.a(z, ConfigManager.l(), ConfigManager.k(), ConfigManager.i(), ConfigManager.j());
        webView.setWebViewClient(zVar);
        webView.loadUrl(str);
        linkedHashMap = f0.b;
        linkedHashMap.put(String.valueOf(str2), new a0(zVar, webView));
        AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
        Sdk.SDKMetric.SDKMetricType sDKMetricType2 = Sdk.SDKMetric.SDKMetricType.CONCURRENT_CACHED_WEBVIEW_COUNT;
        linkedHashMap2 = f0.b;
        AnalyticsClient.a(analyticsClient2, sDKMetricType2, linkedHashMap2.size(), i0Var.q(), null, 8);
        boolean z22 = com.vungle.ads.internal.util.u.f12190a;
        StringBuilder sb2 = new StringBuilder("Preload complete. Cache size: ");
        linkedHashMap3 = f0.b;
        m8079constructorimpl = Result.m8079constructorimpl(Integer.valueOf(com.vungle.ads.internal.util.t.a("WebViewManager", sb2.append(linkedHashMap3.size()).toString())));
        com.vungle.ads.internal.load.f fVar22 = this.d;
        m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
