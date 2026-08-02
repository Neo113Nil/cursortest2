package X50;

import A30.m;
import D30.f;
import T60.a;
import U50.d;
import U50.j;
import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class c implements U50.a, d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final m f34117a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f34118b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f34119c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final S60.a f34120d;

    public c(@NotNull m authInteractor, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull S60.a fintechMetrixInteractor) {
        Intrinsics.checkNotNullParameter(authInteractor, "authInteractor");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(fintechMetrixInteractor, "fintechMetrixInteractor");
        this.f34117a = authInteractor;
        this.f34118b = fintechAnalyticInteractor;
        this.f34119c = fintechSettings;
        this.f34120d = fintechMetrixInteractor;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "notify_logged_in_ozon_bank";
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
        NativeResult.Success success;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        m mVar = this.f34117a;
        if (!Intrinsics.d(mVar.q(), f.a.f5780a)) {
            this.f34120d.a(new a.c(System.currentTimeMillis(), false));
            mVar.E();
            this.f34119c.C(false);
            this.f34118b.m1();
        }
        NativeResult.Success.INSTANCE.getClass();
        success = NativeResult.Success.DEFAULT_WITH_SUCCESS;
        return success;
    }
}
