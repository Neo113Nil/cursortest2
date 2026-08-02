package financial.atomic.a;

/* loaded from: classes17.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final financial.atomic.transact.Transact f6733a;

    public f(financial.atomic.transact.Transact transact) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transact, "");
        this.f6733a = transact;
    }

    @android.webkit.JavascriptInterface
    public final kotlinx.coroutines.Job emit(java.lang.String str, java.lang.String str2) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f6733a.get_scope(), kotlinx.coroutines.Dispatchers.getMain(), null, new financial.atomic.transact.c(this, str, new org.json.JSONObject(str2), null), 2, null);
        return launch$default;
    }

    @android.webkit.JavascriptInterface
    public final void handleAction(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.nio.charset.Charset charset = kotlin.text.Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] decode = android.util.Base64.decode(bytes, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decode);
        org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(decode, charset));
        java.lang.String string = jSONObject.getString("event");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("payload");
        java.util.Objects.toString(optJSONObject);
        kotlin.jvm.internal.Intrinsics.checkNotNull(string);
        if (optJSONObject == null) {
            optJSONObject = new org.json.JSONObject();
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f6733a.get_scope(), kotlinx.coroutines.Dispatchers.getMain(), null, new financial.atomic.transact.c(this, string, optJSONObject, null), 2, null);
    }
}
