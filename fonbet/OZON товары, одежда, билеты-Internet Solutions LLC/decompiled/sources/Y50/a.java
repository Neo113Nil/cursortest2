package Y50;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.banks.CanOpenInterface;

/* loaded from: classes3.dex */
public final class a implements U50.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<U50.a> f34608a;

    public a(@NotNull e installedBanksAppsBridgeInterface, @NotNull f openInstalledBankAppBridgeInterface, @NotNull CanOpenInterface canOpenInterface, @NotNull c installedAppsBridgeInterface) {
        Intrinsics.checkNotNullParameter(installedBanksAppsBridgeInterface, "installedBanksAppsBridgeInterface");
        Intrinsics.checkNotNullParameter(openInstalledBankAppBridgeInterface, "openInstalledBankAppBridgeInterface");
        Intrinsics.checkNotNullParameter(canOpenInterface, "canOpenInterface");
        Intrinsics.checkNotNullParameter(installedAppsBridgeInterface, "installedAppsBridgeInterface");
        this.f34608a = C7714v.b0(installedBanksAppsBridgeInterface, openInstalledBankAppBridgeInterface, canOpenInterface, installedAppsBridgeInterface);
    }

    @Override // U50.b
    @NotNull
    public final List<U50.a> a() {
        return this.f34608a;
    }

    @Override // U50.b
    @NotNull
    public final String getName() {
        return "banks";
    }
}
