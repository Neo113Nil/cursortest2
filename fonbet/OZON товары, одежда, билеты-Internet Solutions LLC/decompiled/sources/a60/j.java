package a60;

import H30.k;
import U50.n;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.exchanger.datapass.ActionResult2;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class j implements U50.a, n<ActionResult2>, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final K40.a f36404a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<String> f36405b;

    public j(@NotNull Moshi moshi, @NotNull K40.a cbottomDisplay, @NotNull Function0<String> provideUUID) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(cbottomDisplay, "cbottomDisplay");
        Intrinsics.checkNotNullParameter(provideUUID, "provideUUID");
        this.f36404a = cbottomDisplay;
        this.f36405b = provideUUID;
    }

    public static Unit b(j jVar, A40.a aVar, String str) {
        try {
            jVar.f36404a.i(aVar, jVar.f36405b.invoke(), str);
        } catch (Exception e11) {
            L80.a.b("Cbottom", "error show cbottom e=" + e11);
        }
        return Unit.f71690a;
    }

    @Override // U50.n
    public final void a(ActionResult2 actionResult2) {
        ActionResult2 result = actionResult2;
        Intrinsics.checkNotNullParameter(result, "result");
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "show";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((U50.j) callback).invoke(handleSync(weakReference, parameterJson));
    }

    @Override // U50.d
    @NotNull
    public final NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson) {
        NativeResult.Success success;
        FintechWebView fintechWebView;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        L80.a.a("cbottom", "show parameterJson=" + parameterJson);
        try {
            final ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a h11 = this.f36404a.h(parameterJson);
            final String tabId = (weakReference == null || (fintechWebView = weakReference.get()) == null) ? null : fintechWebView.getTabId();
            k.a(new Function0() { // from class: a60.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return j.b(j.this, h11, tabId);
                }
            });
            NativeResult.Success.INSTANCE.getClass();
            success = NativeResult.Success.DEFAULT_WITH_SUCCESS;
            return success;
        } catch (Exception e11) {
            return new NativeResult.Error(e11.toString(), NativeResult.Error.a.SDK_ERROR);
        }
    }
}
