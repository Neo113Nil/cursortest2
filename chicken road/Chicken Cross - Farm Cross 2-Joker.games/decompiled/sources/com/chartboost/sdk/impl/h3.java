package com.chartboost.sdk.impl;

import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.chartboost.sdk.impl.hl;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class h3 extends WebChromeClient implements hl.a, t8 {

    /* renamed from: a, reason: collision with root package name */
    public final View f4787a;
    public final id b;
    public final hl c;
    public boolean d;
    public WebChromeClient.CustomViewCallback e;

    public static final class a extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ String c;
        public final /* synthetic */ ConsoleMessage d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ConsoleMessage consoleMessage, Continuation continuation) {
            super(2, continuation);
            this.c = str;
            this.d = consoleMessage;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            mb.a("Chartboost Rich Webview: " + this.c + " -- From line " + this.d.lineNumber() + " of " + this.d.sourceId(), (Throwable) null, 2, (Object) null);
            return Unit.INSTANCE;
        }
    }

    public h3(View activityNonVideoView, id cmd, hl hlVar) {
        Intrinsics.checkNotNullParameter(activityNonVideoView, "activityNonVideoView");
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        this.f4787a = activityNonVideoView;
        this.b = cmd;
        this.c = hlVar;
        cmd.a(this);
    }

    public final void a(String str) {
        hl hlVar = this.c;
        if (hlVar != null) {
            hlVar.a(str, this);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage cm) {
        Intrinsics.checkNotNullParameter(cm, "cm");
        String message = cm.message();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new a(message, cm, null), 3, null);
        Intrinsics.checkNotNull(message);
        a(message);
        return true;
    }

    @Override // android.webkit.WebChromeClient, com.chartboost.sdk.impl.t8
    public void onHideCustomView() {
        WebChromeClient.CustomViewCallback customViewCallback;
        if (this.d) {
            this.f4787a.setVisibility(0);
            WebChromeClient.CustomViewCallback customViewCallback2 = this.e;
            if (customViewCallback2 != null && !StringsKt.contains$default((CharSequence) customViewCallback2.getClass().getName(), (CharSequence) ".chromium.", false, 2, (Object) null) && (customViewCallback = this.e) != null) {
                customViewCallback.onCustomViewHidden();
            }
            this.d = false;
            this.e = null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (str2 == null) {
            return true;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String string = jSONObject.getString("eventType");
            String a2 = this.b.a(jSONObject.getJSONObject("eventArgs"), string);
            if (jsPromptResult != null) {
                jsPromptResult.confirm(a2);
            }
            return true;
        } catch (JSONException unused) {
            mb.b("Exception caught parsing the function name from js to native", (Throwable) null, 2, (Object) null);
            return true;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (view instanceof FrameLayout) {
            this.d = true;
            this.e = customViewCallback;
            this.f4787a.setVisibility(4);
        }
    }

    @Override // com.chartboost.sdk.impl.hl.a
    public void a(JSONObject jSONObject) {
        this.b.a(jSONObject, jd.u.c());
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, customViewCallback);
    }
}
