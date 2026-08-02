package a60;

import H30.k;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* renamed from: a60.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4956b implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final K40.a f36386a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<String> f36387b;

    public C4956b(@NotNull K40.a cbottomDisplay, @NotNull Function0<String> provideUUID) {
        Intrinsics.checkNotNullParameter(cbottomDisplay, "cbottomDisplay");
        Intrinsics.checkNotNullParameter(provideUUID, "provideUUID");
        this.f36386a = cbottomDisplay;
        this.f36387b = provideUUID;
    }

    public static Unit a(C4956b c4956b, String str, String str2) {
        try {
            K40.a aVar = c4956b.f36386a;
            Intrinsics.f(str);
            aVar.e(str2, str, c4956b.f36387b.invoke());
        } catch (Exception e11) {
            L80.a.b("Cbottom", "error action cbottom e=" + e11);
        }
        return Unit.f71690a;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "action";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((U50.j) callback).invoke(handleSync(weakReference, parameterJson));
    }

    @Override // U50.d
    @NotNull
    public final NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull final String parameterJson) {
        NativeResult.Success success;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        try {
            final String string = new JSONObject(parameterJson).getString("id");
            k.a(new Function0() { // from class: a60.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4956b.a(C4956b.this, string, parameterJson);
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
