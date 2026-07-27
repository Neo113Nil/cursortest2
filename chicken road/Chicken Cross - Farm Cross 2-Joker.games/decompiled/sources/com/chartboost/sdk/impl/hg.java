package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import android.webkit.WebChromeClient;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class hg extends t4 {
    public /* synthetic */ hg(Context context, String str, t5 t5Var, da daVar, String str2, id idVar, hl hlVar, h7 h7Var, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, t5Var, daVar, str2, idVar, (i & 64) != 0 ? new hl() : hlVar, h7Var, (i & 256) != 0 ? new Function1() { // from class: com.chartboost.sdk.impl.hg$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                n3 a2;
                a2 = hg.a((Context) obj);
                return a2;
            }
        } : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n3 a(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new n3(it);
    }

    public static final WebChromeClient a(id idVar, hl hlVar, View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new h3(container, idVar, hlVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg(Context context, String html, t5 callback, da impressionInterface, String str, final id nativeBridgeCommand, final hl webViewCorsErrorHandler, h7 eventTracker, Function1 cbWebViewFactory) {
        super(context, html, callback, impressionInterface, str, eventTracker, cbWebViewFactory, new Function1() { // from class: com.chartboost.sdk.impl.hg$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return hg.a(id.this, webViewCorsErrorHandler, (View) obj);
            }
        }, null, 256, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.checkNotNullParameter(webViewCorsErrorHandler, "webViewCorsErrorHandler");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(cbWebViewFactory, "cbWebViewFactory");
    }
}
