package a60;

import H30.k;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class e implements U50.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final K40.a f36391a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<String> f36392b;

    public e(@NotNull K40.a cbottomDisplay, @NotNull Function0<String> provideUUID) {
        Intrinsics.checkNotNullParameter(cbottomDisplay, "cbottomDisplay");
        Intrinsics.checkNotNullParameter(provideUUID, "provideUUID");
        this.f36391a = cbottomDisplay;
        this.f36392b = provideUUID;
    }

    public static Unit a(e eVar, U50.j jVar) {
        NativeResult.Success success;
        try {
            eVar.f36391a.f(eVar.f36392b.invoke());
            NativeResult.Success.INSTANCE.getClass();
            success = NativeResult.Success.DEFAULT_WITH_SUCCESS;
            jVar.invoke(success);
        } catch (Exception e11) {
            jVar.invoke(new NativeResult.Error(e11.toString(), NativeResult.Error.a.SDK_ERROR));
        }
        return Unit.f71690a;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "dismissAll";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final U50.j jVar = (U50.j) callback;
        k.a(new Function0() { // from class: a60.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.a(e.this, jVar);
            }
        });
    }
}
