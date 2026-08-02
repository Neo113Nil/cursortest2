package Ch0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;
import ru.ozon.android.hardwareinfo.DeviceInfoManager;
import ru.ozon.android.hardwareinfo.powermanager.PowerManagerRepository;
import ru.ozon.android.hardwareinfo.telephony.TelephonyRepositoryImpl;
import ru.ozon.android.networkinfo.models.ConnectionType;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final DeviceInfoManager f5044a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C9067a f5045b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final PowerManagerRepository f5046c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final TelephonyRepositoryImpl f5047d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final PowerManagerRepository f5048e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C9067a f5049f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C9067a f5050g;

    public b(@NotNull DeviceInfoManager deviceInfoManager, @NotNull C9067a networkInfoProvider, @NotNull PowerManagerRepository powerManagerRepository, @NotNull TelephonyRepositoryImpl telephonyRepository, @NotNull PowerManagerRepository batteryRepository, @NotNull C9067a vpnInteractor, @NotNull C9067a proxyInteractor) {
        Intrinsics.checkNotNullParameter(deviceInfoManager, "deviceInfoManager");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(powerManagerRepository, "powerManagerRepository");
        Intrinsics.checkNotNullParameter(telephonyRepository, "telephonyRepository");
        Intrinsics.checkNotNullParameter(batteryRepository, "batteryRepository");
        Intrinsics.checkNotNullParameter(vpnInteractor, "vpnInteractor");
        Intrinsics.checkNotNullParameter(proxyInteractor, "proxyInteractor");
        this.f5044a = deviceInfoManager;
        this.f5045b = networkInfoProvider;
        this.f5046c = powerManagerRepository;
        this.f5047d = telephonyRepository;
        this.f5048e = batteryRepository;
        this.f5049f = vpnInteractor;
        this.f5050g = proxyInteractor;
    }

    @NotNull
    public final Kh0.a a() {
        String deviceModel = this.f5044a.getDeviceModel();
        ConnectionType g10 = C9067a.g(this.f5045b);
        TelephonyRepositoryImpl telephonyRepositoryImpl = this.f5047d;
        String networkOperatorName = telephonyRepositoryImpl.getNetworkOperatorName();
        String networkOperatorName2 = telephonyRepositoryImpl.getNetworkOperatorName();
        int batteryCharge = this.f5048e.getBatteryCharge();
        PowerManagerRepository powerManagerRepository = this.f5046c;
        return new Kh0.a(deviceModel, g10, networkOperatorName, networkOperatorName2, batteryCharge, powerManagerRepository.isPowerSaveMode(), powerManagerRepository.powerSaveState(), this.f5049f.n(), this.f5050g.l());
    }
}
