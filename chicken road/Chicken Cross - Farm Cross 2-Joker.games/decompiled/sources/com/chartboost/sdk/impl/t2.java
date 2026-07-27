package com.chartboost.sdk.impl;

import android.content.Context;
import android.widget.RelativeLayout;
import com.chartboost.sdk.Mediation;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class t2 extends m3 {
    public final String O;
    public final String P;
    public final na Q;
    public final da R;
    public final List S;
    public final i7 T;
    public final CoroutineDispatcher U;
    public final Function1 V;

    public /* synthetic */ t2(Context context, String str, bc bcVar, String str2, k8 k8Var, e3 e3Var, oi oiVar, j3 j3Var, Mediation mediation, String str3, String str4, na naVar, zd zdVar, r0 r0Var, da daVar, ml mlVar, List list, i7 i7Var, CoroutineDispatcher coroutineDispatcher, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, bcVar, str2, k8Var, e3Var, oiVar, j3Var, mediation, str3, str4, naVar, zdVar, r0Var, daVar, mlVar, list, i7Var, (i & 262144) != 0 ? Dispatchers.getMain() : coroutineDispatcher, (i & 524288) != 0 ? new Function1() { // from class: com.chartboost.sdk.impl.t2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t2.c((Context) obj);
            }
        } : function1);
    }

    public static final r2 c(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new r2(it);
    }

    @Override // com.chartboost.sdk.impl.m3
    public qk b(Context context) {
        qk qkVar;
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.P;
        if (str == null || StringsKt.isBlank(str)) {
            mb.b("html must not be null or blank", (Throwable) null, 2, (Object) null);
            return null;
        }
        try {
            qkVar = null;
        } catch (Exception e) {
            e = e;
            qkVar = null;
        }
        try {
            w8 w8Var = new w8(context, this.O, this.P, this.Q, this.T, j(), this.R, this.U, this.V, null, 512, null);
            RelativeLayout webViewContainer = w8Var.getWebViewContainer();
            if (webViewContainer != null) {
                w8Var.a(webViewContainer);
                return w8Var;
            }
            mb.b("webViewContainer null when creating HtmlWebViewBase", (Throwable) null, 2, (Object) null);
            return w8Var;
        } catch (Exception e2) {
            e = e2;
            qk qkVar2 = qkVar;
            c("Can't instantiate WebViewBase: " + e);
            return qkVar2;
        }
    }

    @Override // com.chartboost.sdk.impl.m3
    public void w() {
    }

    @Override // com.chartboost.sdk.impl.m3
    public void x() {
        n3 webView;
        super.x();
        this.R.z();
        qk u = u();
        if (u == null || (webView = u.getWebView()) == null) {
            return;
        }
        Iterator it = this.S.iterator();
        while (it.hasNext()) {
            webView.evaluateJavascript((String) it.next(), null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(Context context, String location, bc mtype, String adUnitParameters, k8 fileCache, e3 e3Var, oi uiPoster, j3 j3Var, Mediation mediation, String baseUrl, String str, na infoIcon, zd openMeasurementImpressionCallback, r0 adUnitRendererCallback, da impressionInterface, ml webViewTimeoutInterface, List scripts, i7 eventTracker, CoroutineDispatcher dispatcher, Function1 cbWebViewFactory) {
        super(context, location, mtype, adUnitParameters, uiPoster, fileCache, e3Var, j3Var, mediation, str, openMeasurementImpressionCallback, adUnitRendererCallback, webViewTimeoutInterface, eventTracker, null, 16384, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(mtype, "mtype");
        Intrinsics.checkNotNullParameter(adUnitParameters, "adUnitParameters");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(adUnitRendererCallback, "adUnitRendererCallback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.checkNotNullParameter(scripts, "scripts");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(cbWebViewFactory, "cbWebViewFactory");
        this.O = baseUrl;
        this.P = str;
        this.Q = infoIcon;
        this.R = impressionInterface;
        this.S = scripts;
        this.T = eventTracker;
        this.U = dispatcher;
        this.V = cbWebViewFactory;
    }
}
