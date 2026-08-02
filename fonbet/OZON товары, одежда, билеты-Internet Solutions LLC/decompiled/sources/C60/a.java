package C60;

import Q90.n;
import U50.j;
import android.app.Activity;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class a implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final n f4425a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final S80.b f4426b;

    public a(@NotNull n ultraManager, @NotNull S80.b fintechNavigation) {
        Intrinsics.checkNotNullParameter(ultraManager, "ultraManager");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        this.f4425a = ultraManager;
        this.f4426b = fintechNavigation;
    }

    private final NativeResult.Success a(String str) {
        Boolean bool;
        NativeResult.Success success;
        NativeResult.Success success2;
        try {
            bool = Boolean.valueOf(new JSONObject(str).getBoolean("enabled"));
        } catch (Exception e11) {
            L80.a.c("ChangeIconBridgeInterface", null, e11);
            bool = null;
        }
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            Activity c11 = this.f4426b.c();
            if (c11 != null) {
                n nVar = this.f4425a;
                if (nVar.f()) {
                    nVar.j(c11);
                    if (!nVar.c(c11, booleanValue)) {
                        nVar.l(c11);
                    }
                }
            }
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
        return "change_state";
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
