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
public final class c implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final n f4428a;

    public c(@NotNull n ultraManager) {
        Intrinsics.checkNotNullParameter(ultraManager, "ultraManager");
        this.f4428a = ultraManager;
    }

    private final NativeResult.Success a(String str) {
        Boolean bool;
        NativeResult.Success success;
        NativeResult.Success success2;
        try {
            bool = Boolean.valueOf(new JSONObject(str).getBoolean("enabled"));
        } catch (Exception e11) {
            L80.a.c("IsUserUltraBridgeInterface", null, e11);
            bool = null;
        }
        if (bool != null) {
            this.f4428a.k(bool.booleanValue());
        }
        if (bool != null) {
            NativeResult.Success.INSTANCE.getClass();
            success2 = NativeResult.Success.DEFAULT_WITH_SUCCESS;
            return success2;
        }
        NativeResult.Success.INSTANCE.getClass();
        success = NativeResult.Success.DEFAULT_NOT_SUCCESS;
        return success;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "is_user_ultra";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((j) callback).invoke(a(parameterJson));
    }

    @Override // U50.d
    @NotNull
    public final NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        return a(parameterJson);
    }
}
