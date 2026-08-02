package Mm0;

import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public enum e {
    UnknownSources(null, true, Integer.class, null),
    DeveloperTools(null, true, Integer.class, null),
    HoursSinceInstall(null, false, Om0.a.class, null),
    Default(HoursSinceInstall, false, Om0.a.class, null),
    Custom(HoursSinceInstall, false, Om0.a.class, null),
    GooglePlayProtect(null, true, Integer.class, null),
    Emulator(null, true, Integer.class, null),
    TIMESTAMP(null, true, String.class, null),
    HardwareID(null, false, String.class, null),
    SIM_ID(null, false, String.class, null),
    PhoneNumber(null, false, String.class, null),
    PhoneNumbers(null, false, Om0.a.class, null),
    DeviceModel(null, true, String.class, null),
    DeviceSystemName(null, true, String.class, null),
    DeviceSystemVersion(null, true, String.class, null),
    Languages(null, true, String.class, null),
    WiFiMacAddress(null, true, String.class, null),
    WiFiNetworksData(null, false, Om0.a.class, null),
    BSSID(WiFiNetworksData, false, String.class, null),
    SignalStrength(WiFiNetworksData, false, String.class, null),
    Channel(WiFiNetworksData, true, String.class, null),
    SSID(WiFiNetworksData, false, String.class, null),
    CellTowerId(null, false, String.class, null),
    CellIdentities(null, false, Om0.c.class, null),
    LocationAreaCode(null, false, String.class, null),
    ScreenSize(null, true, String.class, null),
    DisplayMetrics(null, false, Om0.a.class, null),
    Density(DisplayMetrics, false, String.class, "cachingDensity"),
    DensityDpi(DisplayMetrics, false, String.class, "cachingDensityDpi"),
    ScaledDensity(DisplayMetrics, false, String.class, "cachingScaledDensity"),
    MCC(null, false, String.class, null),
    MNC(null, false, String.class, null),
    AppKey(null, true, String.class, "uniqueID"),
    SDK_VERSION(null, true, String.class, null),
    Compromised(null, true, Integer.class, null),
    MultitaskingSupported(null, true, Boolean.class, null),
    AdvertiserId(null, false, String.class, "adsId"),
    AppSetIdScopeApp(null, false, String.class, "appSetIdScopeApp"),
    AppSetIdScopeDeveloper(null, false, String.class, "appSetIdScopeDeveloper"),
    OS_ID(null, false, String.class, null),
    GeoLocationInfo(null, true, Om0.c.class, "cachingGeoLocationTimeName"),
    Longitude(GeoLocationInfo, true, String.class, "cachingLongitude"),
    Latitude(GeoLocationInfo, true, String.class, "cachingLatitude"),
    GeoProvider(GeoLocationInfo, true, String.class, "cachingGeoProvider"),
    HorizontalAccuracy(GeoLocationInfo, true, String.class, "cachingHorizontalAccuracy"),
    Altitude(GeoLocationInfo, true, String.class, "cachingAltitude"),
    AltitudeAccuracy(GeoLocationInfo, true, String.class, "cachingVerticalAccuracy"),
    Heading(GeoLocationInfo, true, String.class, "cachingHeading"),
    Speed(GeoLocationInfo, true, String.class, "cachingSpeed"),
    Status(GeoLocationInfo, true, String.class, null),
    Timestamp(GeoLocationInfo, true, String.class, "cachingTimeStamp"),
    RSA_ApplicationKey(null, false, String.class, null),
    AgentBrand(null, true, String.class, null),
    AgentBootTime(null, true, String.class, null),
    TimeZone(null, true, String.class, null),
    SupportedAPILevel(null, true, String.class, null),
    OSCodeName(null, true, String.class, null),
    AgentAppInfo(null, true, String.class, null),
    OSFontsNumber(null, true, String.class, null),
    OSFontsHash(null, true, Integer.class, null),
    ScreenColorDepth(null, true, String.class, null),
    TimeZoneDSTOffset(null, true, String.class, null),
    SimCard(null, true, String.class, null),
    AgentSignalStrengthCellular(null, true, String.class, null),
    AgentConnectionType(null, false, String.class, null),
    AgentSignalTypeCellular(null, true, String.class, null),
    LocalIPv4(null, false, String.class, null),
    LocalIPv6(null, false, String.class, null),
    DnsIP(null, true, String.class, null),
    RdpConnection(null, true, String.class, null),
    RdpConnectionDuration(null, true, Integer.class, null),
    LocationHash(null, true, String.class, null),
    ApplicationMD5(null, false, String.class, null),
    InstallationSource(null, false, String.class, null),
    PhoneCallState(null, true, Integer.class, null),
    PhoneCallDirection(null, true, Integer.class, null),
    PhoneLastCall(null, false, Om0.a.class, null),
    GoogleServicesParameters(null, false, Om0.a.class, null),
    GoogleServicesDeviceId(GoogleServicesParameters, false, String.class, null),
    AccessibilityServices(null, false, Om0.a.class, null),
    AuthenticationInfo(null, false, Om0.a.class, null),
    ShareScreen(null, false, Boolean.class, null),
    ShareScreenInfo(null, false, Om0.a.class, null),
    Debugger(null, true, Integer.class, null),
    VpnConnection(null, false, Boolean.class, null),
    VpnApps(null, false, String.class, null),
    BootId(null, false, String.class, null),
    BootCount(null, false, Integer.class, null),
    BuildData(null, false, Om0.a.class, null),
    BOARD(BuildData, false, String.class, "cachingBOARD"),
    BOOTLOADER(BuildData, false, String.class, "cachingBOOTLOADER"),
    BRAND(BuildData, false, String.class, "cachingBRAND"),
    DEVICE(BuildData, false, String.class, "cachingDEVICE"),
    DISPLAY(BuildData, false, String.class, "cachingDISPLAY"),
    FINGERPRINT(BuildData, false, String.class, "cachingFINGERPRINT"),
    HARDWARE(BuildData, false, String.class, "cachingHARDWARE"),
    ID(BuildData, false, String.class, "cachingID"),
    MANUFACTURER(BuildData, false, String.class, "cachingMANUFACTURER"),
    PRODUCT(BuildData, false, String.class, "cachingPRODUCT"),
    RADIO(BuildData, false, String.class, "cachingRADIO"),
    PackageManager(null, false, Serializable.class, null),
    SystemAvailableFeatures(PackageManager, false, List.class, "cachingSystemAvailableFeatures"),
    SystemSharedLibraryNames(PackageManager, false, List.class, "cachingSystemSharedLibraryNames"),
    FileSystemInfo(null, false, Om0.a.class, null),
    RootBytes(FileSystemInfo, false, String.class, "cachingRootBytes"),
    DataBytes(FileSystemInfo, false, String.class, "cachingDataBytes"),
    ExStorageBytes(FileSystemInfo, false, String.class, "cachingExStorageBytes"),
    PhoneInfo(null, false, Om0.a.class, null),
    IMEI(PhoneInfo, false, String.class, "cachingIMEI"),
    IMSI(PhoneInfo, false, String.class, "cachingIMSI"),
    SIM(PhoneInfo, false, String.class, "cachingSIM"),
    PhoneESimInfo(null, true, Om0.a.class, null),
    UnsafeInstall(null, false, Om0.a.class, null),
    CameraUse(null, false, Boolean.class, null),
    ScreenshotCounter(null, false, Integer.class, null),
    GoogleID(null, false, String.class, null);

    public static final Class[] SUPPORTED_VALUE_CLASSES = {Serializable.class, Integer.class, String.class, Boolean.class, List.class, Om0.a.class, Om0.c.class};

    /* renamed from: default, reason: not valid java name */
    private final String f4default;

    /* renamed from: do, reason: not valid java name */
    private final e f5do;

    /* renamed from: final, reason: not valid java name */
    private final boolean f6final;

    /* renamed from: transient, reason: not valid java name */
    @NonNull
    private final Class f7transient;

    public static class a implements Comparator<e> {
        @Override // java.util.Comparator
        public final int compare(e eVar, e eVar2) {
            return Integer.compare(eVar.ordinal(), eVar2.ordinal());
        }
    }

    e(e eVar, boolean z11, @NonNull Class cls, String str) {
        this.f5do = eVar;
        this.f6final = z11;
        this.f7transient = cls;
        this.f4default = str;
    }

    public static HashMap<String, String> a() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("com.teamviewer.quicksupport.market", "QS");
        hashMap.put("com.anydesk.anydeskandroid", "AnyDesk");
        hashMap.put("us.zoom.videomeetings", "Zoom");
        hashMap.put("com.discord", "Discord");
        hashMap.put("com.awesun.control", "AwerayRemote");
        hashMap.put("com.awesun.control.service", "AweSunClient");
        hashMap.put("com.sand.airdroid", "Airdroid");
        hashMap.put("com.sand.aircast", "Aircast");
        hashMap.put("com.sand.airsos", "AirdroidRemoteSupport");
        hashMap.put("com.sand.airdroidbizc", "AirdroidBusiness");
        hashMap.put("ru.yandex.telemost", "YandexTelemost");
        hashMap.put("com.sand.airmirror", "Airmirror");
        hashMap.put("ru.nspk.mirpay", "MirPayS");
        hashMap.put("ru.nspk.sbpay", "SbpPayS");
        hashMap.put("com.carriez.flutter_hbb", "RustDeskRD");
        hashMap.put("com.logmein.ignitionpro.android", "LogMein");
        hashMap.put("com.islonline.isllight.mobile.android", "ISLLight");
        hashMap.put("com.apowersoft.mirror", "APowerMirror");
        hashMap.put("com.ve.devicemanager.devicemanager", "DeviceManager");
        hashMap.put("getscreen.agent", "GetScreen");
        hashMap.put("com.skype.raider", "Skype");
        hashMap.put("com.webkey", "WebKey");
        hashMap.put("ru.desktop.flutter_hbb", "RuDesktop");
        hashMap.put("ru.safib.assistant", "Assistant");
        hashMap.put("ru.rostel", "Gosuslugi");
        hashMap.put("de.im.RemoDroid", "RemoDroid");
        hashMap.put("com.koushikdutta.vysor", "Vysor");
        hashMap.put("com.google.chromeremotedesktop", "ChromeRD");
        hashMap.put("com.realvnc.viewer.android", "RealVncV");
        hashMap.put("it.nanosystems.Supremo", "Supremo");
        hashMap.put("com.embarcadero.LiteManager", "LiteManager");
        hashMap.put("ru.rmansys.mviewer", "RMS");
        hashMap.put("com.nomachine.nxplayer", "NoMachine");
        hashMap.put("com.zoho.assist", "ZohoAssist");
        hashMap.put("com.bomgar.thinclient.android", "BeyondTrust");
        hashMap.put("com.logmein.rescuemobile", "Rescue");
        return hashMap;
    }

    @NonNull
    public final String b() {
        String str = this.f4default;
        if (str != null) {
            return str;
        }
        return "fp_" + name();
    }

    public final e d() {
        return this.f5do;
    }

    @NonNull
    public final Class<?> e() {
        return this.f7transient;
    }

    public final boolean f() {
        return this.f6final;
    }
}
