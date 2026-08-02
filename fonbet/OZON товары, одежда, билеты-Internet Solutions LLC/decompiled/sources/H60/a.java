package H60;

import F60.f;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.fintech.exchanger.datapass.ActionResult2;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<FintechWebView> f10688a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Moshi f10689b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1<String, Boolean> f10690c;

    public a(WeakReference weakReference, @NotNull Moshi moshi, Function1 function1) {
        Intrinsics.checkNotNullParameter("window.web_bridge", "webBridgeLocation");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f10688a = weakReference;
        this.f10689b = moshi;
        this.f10690c = function1;
    }

    public final Object a(@NotNull ActionResult2 actionResult2, @NotNull d dVar) {
        String str;
        try {
            str = this.f10689b.c(ActionResult2.class).toJson(actionResult2);
        } catch (Throwable th2) {
            th2.printStackTrace();
            str = "";
        }
        String str2 = str;
        WeakReference<FintechWebView> weakReference = this.f10688a;
        return f.a(this.f10690c, weakReference != null ? weakReference.get() : null, "cbottom2", "callback", str2, (j) dVar);
    }

    public final Object b(@NotNull String str, @NotNull d dVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cbottomId", str);
        WeakReference<FintechWebView> weakReference = this.f10688a;
        return f.a(this.f10690c, weakReference != null ? weakReference.get() : null, "cbottom2", "onCreate", jSONObject.toString(), (j) dVar);
    }

    public final Object c(@NotNull String str, @NotNull d dVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cbottomId", str);
        WeakReference<FintechWebView> weakReference = this.f10688a;
        return f.a(this.f10690c, weakReference != null ? weakReference.get() : null, "cbottom2", "onDestroy", jSONObject.toString(), (j) dVar);
    }

    public final Object d(@NotNull String str, @NotNull d dVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cbottomId", str);
        WeakReference<FintechWebView> weakReference = this.f10688a;
        return f.a(this.f10690c, weakReference != null ? weakReference.get() : null, "cbottom2", "onStart", jSONObject.toString(), (j) dVar);
    }

    public final Object e(@NotNull String str, @NotNull d dVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cbottomId", str);
        WeakReference<FintechWebView> weakReference = this.f10688a;
        return f.a(this.f10690c, weakReference != null ? weakReference.get() : null, "cbottom2", "onStop", jSONObject.toString(), (j) dVar);
    }
}
