package G60;

import F60.f;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.webbridge.groups.callback.models.SmsData;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<FintechWebView> f9729a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Moshi f9730b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1<String, Boolean> f9731c;

    public a(WeakReference weakReference, @NotNull Moshi moshi, Function1 function1) {
        Intrinsics.checkNotNullParameter("window.web_bridge", "webBridgeLocation");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f9729a = weakReference;
        this.f9730b = moshi;
        this.f9731c = function1;
    }

    public final Object a(String str, @NotNull d<? super Boolean> dVar) {
        WeakReference<FintechWebView> weakReference = this.f9729a;
        FintechWebView fintechWebView = weakReference != null ? weakReference.get() : null;
        Moshi moshi = this.f9730b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        try {
            str2 = moshi.c(SmsData.class).toJson(new SmsData(str));
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return f.a(this.f9731c, fintechWebView, "native_bridge", "sms", str2, (j) dVar);
    }
}
