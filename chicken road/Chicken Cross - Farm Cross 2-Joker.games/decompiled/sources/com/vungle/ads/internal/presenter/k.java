package com.vungle.ads.internal.presenter;

import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class k extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f12093a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar) {
        super(0);
        this.f12093a = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        com.vungle.ads.internal.ui.z zVar = this.f12093a.d;
        WebView webView = zVar.m;
        if (webView != null) {
            zVar.a(webView, "window.vungle.mraidBridgeExt.notifyPresentAppStoreFailed(0)");
        }
        return Unit.INSTANCE;
    }
}
