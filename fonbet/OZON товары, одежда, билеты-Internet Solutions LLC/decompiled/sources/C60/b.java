package C60;

import Q90.n;
import U50.j;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class b implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final n f4427a;

    public b(@NotNull n ultraManager) {
        Intrinsics.checkNotNullParameter(ultraManager, "ultraManager");
        this.f4427a = ultraManager;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "is_ultra";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((j) callback).invoke(handleSync(weakReference, parameterJson));
    }

    @Override // U50.d
    @NotNull
    public final NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        String jSONObject = new JSONObject().put("enabled", this.f4427a.d()).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return new NativeResult.Success(jSONObject);
    }
}
