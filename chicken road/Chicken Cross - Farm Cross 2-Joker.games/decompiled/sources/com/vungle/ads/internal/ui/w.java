package com.vungle.ads.internal.ui;

import android.webkit.WebView;
import com.vungle.ads.EvaluateJsError;
import com.vungle.ads.internal.model.i0;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class w extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f12173a;
    public final /* synthetic */ WebView b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z zVar, WebView webView, String str) {
        super(0);
        this.f12173a = zVar;
        this.b = webView;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object m8079constructorimpl;
        i0 i0Var;
        WebView webView = this.b;
        String str = this.c;
        try {
            Result.Companion companion = Result.INSTANCE;
            Unit unit = null;
            if (webView != null) {
                webView.evaluateJavascript(str, null);
                unit = Unit.INSTANCE;
            }
            m8079constructorimpl = Result.m8079constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        z zVar = this.f12173a;
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl != null) {
            EvaluateJsError evaluateJsError = new EvaluateJsError(com.iab.omid.library.vungle.internal.l.a("Evaluate js failed ").append(m8082exceptionOrNullimpl.getLocalizedMessage()).toString());
            i0Var = zVar.f12176a;
            evaluateJsError.setLogEntry$vungle_ads_release(i0Var.q()).logErrorNoReturnValue$vungle_ads_release();
        }
        return Unit.INSTANCE;
    }
}
