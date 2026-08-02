package Y50;

import H30.q;
import P60.n;
import P60.o;
import U50.j;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.banks.OpenBankData;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class f implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Moshi f34641a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Q90.c f34642b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f34643c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final o f34644d;

    public f(@NotNull Moshi moshi, @NotNull Q90.c featureToggles, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull o installedBankAppsInteractor) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(installedBankAppsInteractor, "installedBankAppsInteractor");
        this.f34641a = moshi;
        this.f34642b = featureToggles;
        this.f34643c = fintechAnalyticInteractor;
        this.f34644d = installedBankAppsInteractor;
    }

    private final NativeResult a(String str) {
        boolean b11;
        NativeResult.Success success;
        if (!Tl.a.f(this.f34642b, S90.c.MOB_INSTALLED_BANK)) {
            L80.a.a("OpenInstalledBankAppBridgeInterface", "Disabled by toggle");
            return new NativeResult.Error("Disabled by toggle", NativeResult.Error.a.IS_NOT_AVAILABLE);
        }
        OpenBankData openBankData = (OpenBankData) q.a(this.f34641a, str, OpenBankData.class);
        if ((openBankData != null ? openBankData.getMemberId() : null) == null) {
            L80.a.a("OpenInstalledBankAppBridgeInterface", "data?.memberId == null");
            return new NativeResult.Error("data?.memberId == null", null, 2, null);
        }
        String packageName = openBankData.getPackageName();
        o oVar = this.f34644d;
        if (packageName == null || h.K(packageName)) {
            n d11 = oVar.d(openBankData.getMemberId().longValue());
            if (d11 == null) {
                L80.a.a("OpenInstalledBankAppBridgeInterface", "installedBankApp not found for memberId=" + openBankData.getMemberId());
                return new NativeResult.Error("installed package not found", null, 2, null);
            }
            b11 = oVar.b(d11);
        } else {
            b11 = oVar.c(openBankData.getPackageName());
        }
        if (b11) {
            NativeResult.Success.INSTANCE.getClass();
            success = NativeResult.Success.DEFAULT_WITH_SUCCESS;
        } else {
            NativeResult.Success.INSTANCE.getClass();
            success = NativeResult.Success.DEFAULT_NOT_SUCCESS;
        }
        this.f34643c.N0(openBankData.getMemberId().longValue(), b11);
        return success;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "open_installed_bank_app";
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
