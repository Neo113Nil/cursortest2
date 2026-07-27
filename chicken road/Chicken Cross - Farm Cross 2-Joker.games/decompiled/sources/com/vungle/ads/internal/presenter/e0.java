package com.vungle.ads.internal.presenter;

import android.content.Context;
import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class e0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12086a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Context context) {
        super(0);
        this.f12086a = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object m8079constructorimpl;
        AtomicBoolean atomicBoolean;
        ReentrantLock reentrantLock = f0.f12088a;
        Context context = this.f12086a;
        try {
            Result.Companion companion = Result.INSTANCE;
            new WebView(context).loadData("<html><head></head><body></body></html>", "text/html", "UTF-8");
            boolean z = com.vungle.ads.internal.util.u.f12190a;
            m8079constructorimpl = Result.m8079constructorimpl(Integer.valueOf(com.vungle.ads.internal.util.t.a("WebViewManager", "Prewarmed webview loaded blank html")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl != null) {
            boolean z2 = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.a("WebViewManager", "Prewarm webview failed", m8082exceptionOrNullimpl);
            atomicBoolean = f0.c;
            atomicBoolean.set(false);
        }
        return Unit.INSTANCE;
    }
}
