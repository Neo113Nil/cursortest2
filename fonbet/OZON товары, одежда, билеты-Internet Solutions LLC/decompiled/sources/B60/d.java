package B60;

import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.storage.FastEntryState;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class d implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final A30.m f2961a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Moshi f2962b;

    public d(@NotNull A30.m fintechAuthInteractor, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(fintechAuthInteractor, "fintechAuthInteractor");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f2961a = fintechAuthInteractor;
        this.f2962b = moshi;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "get_fast_entry_state";
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
        Moshi moshi = this.f2962b;
        A30.m mVar = this.f2961a;
        try {
            str = moshi.c(FastEntryState.class).toJson(new FastEntryState(mVar.t() && mVar.u()));
        } catch (Throwable th2) {
            th2.printStackTrace();
            str = "";
        }
        return new NativeResult.Success(str);
    }
}
