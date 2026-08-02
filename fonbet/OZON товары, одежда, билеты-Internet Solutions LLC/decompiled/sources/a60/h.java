package a60;

import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.cbottom2.GetOpenIdsResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class h implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final K40.a f36399a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Moshi f36400b;

    public h(@NotNull K40.a cbottomDisplay, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(cbottomDisplay, "cbottomDisplay");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f36399a = cbottomDisplay;
        this.f36400b = moshi;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "get_opened_ids";
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
        String str;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        try {
            List U02 = C7714v.U0(this.f36399a.a());
            Moshi moshi = this.f36400b;
            try {
                str = moshi.c(GetOpenIdsResult.class).toJson(new GetOpenIdsResult(U02));
            } catch (Throwable th2) {
                th2.printStackTrace();
                str = "";
            }
            return new NativeResult.Success(str);
        } catch (Exception e11) {
            return new NativeResult.Error(e11.toString(), NativeResult.Error.a.SDK_ERROR);
        }
    }
}
