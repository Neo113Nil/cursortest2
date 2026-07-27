package com.startapp.sdk.adsbase.remoteconfig;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.ads.external.config.ExternalAdConfig;
import com.startapp.sdk.ads.external.config.ExternalConfig;
import com.startapp.sdk.adsbase.b;
import com.startapp.sdk.adsbase.consent.ConsentConfig;
import com.startapp.sdk.adsbase.crashreport.ANRRemoteConfig;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.EnabledConfig;
import com.startapp.sdk.components.a;
import com.startapp.sdk.insight.NetworkTestsMetaData;
import com.startapp.sdk.internal.a8;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.e7;
import com.startapp.sdk.internal.e9;
import com.startapp.sdk.internal.f2;
import com.startapp.sdk.internal.fc;
import com.startapp.sdk.internal.gc;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.h6;
import com.startapp.sdk.internal.hc;
import com.startapp.sdk.internal.ib;
import com.startapp.sdk.internal.ic;
import com.startapp.sdk.internal.j2;
import com.startapp.sdk.internal.p0;
import com.startapp.sdk.internal.rf;
import com.startapp.sdk.internal.sf;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.x6;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.sensors.SensorsData;
import com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class MetaData implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f3298d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f3299e = new AtomicBoolean();
    public static final HashSet f = new HashSet(Collections.singletonList(h6.f3826a));

    /* renamed from: g, reason: collision with root package name */
    public static final List f3300g = Arrays.asList("https://adsmetadata.startappservice.com/adsmetadata/api/v1.0/", "https://adsmetadata.mobileadexchange.net/adsmetadata/api/v1.0/", "https://d26xw8rp6mlgfg.cloudfront.net/adsmetadata/api/v1.0/");

    /* renamed from: h, reason: collision with root package name */
    public static final String f3301h = "https://req.startappservice.com/1.5/";

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f3302i = {60, 60, 240};

    /* renamed from: j, reason: collision with root package name */
    public static final HashSet f3303j = new HashSet(Arrays.asList("com.facebook.katana", "com.yandex.browser"));

    /* renamed from: k, reason: collision with root package name */
    private static volatile MetaData f3304k = new MetaData();

    /* renamed from: l, reason: collision with root package name */
    private static final AtomicInteger f3305l = new AtomicInteger();
    private static final long serialVersionUID = 4682036570588775049L;
    private long IABDisplayImpressionDelayInSeconds;
    private long IABVideoImpressionDelayInSeconds;
    private boolean SupportIABViewability;

    /* renamed from: a, reason: collision with root package name */
    private transient boolean f3306a;
    private String adClickURL;

    @TypeInfo(complex = true, name = "debug")
    private AdDebuggerMetadata adDebugger;

    @TypeInfo(complex = true, parser = EnabledConfig.Parser.class)
    private EnabledConfig adLoadWaitForMetadata;
    private String adPlatformBannerHostSecured;
    private String adPlatformHostSecured;
    private String adPlatformNativeHostSecured;
    private String adPlatformOverlayHostSecured;
    private boolean adsPreCachingEnabled;

    @TypeInfo(complex = true)
    private AdvertisingIdResolverMetadata air;
    private boolean alwaysSendToken;

    @TypeInfo(complex = true)
    private AnalyticsConfig analytics;

    @TypeInfo(complex = true)
    private ANRRemoteConfig anrConfig;

    @TypeInfo(complex = true)
    private AppSessionConfig appSession;
    private String assetsBaseUrlSecured;

    /* renamed from: b, reason: collision with root package name */
    private transient boolean f3307b;

    @TypeInfo(complex = true)
    private BluetoothConfig btConfig;

    /* renamed from: c, reason: collision with root package name */
    private transient ArrayList f3308c;
    private String calcProd;
    private boolean chromeCustomeTabsExternal;
    private boolean chromeCustomeTabsInternal;
    private boolean closeAdAfterClick;
    private boolean compressionEnabled;

    @TypeInfo(complex = true)
    private ConnectivityHelperMetadata connectivity;

    @TypeInfo(complex = true)
    private ConsentConfig consentDetails;
    private boolean disableSendAdvertisingId;
    private boolean dns;

    @TypeInfo(complex = true, name = "tracer")
    private EventTracerMetadata eventTracerMetadata;

    @TypeInfo(complex = true)
    private ExternalConfig external;
    private double flh;

    @TypeInfo(complex = true, name = "http")
    private HttpClientConfig httpClientConfig;
    private double httpPost;
    private String impressionURL;

    @TypeInfo(complex = true)
    private ImpressionsTrackingMetadata impressionsTracking;
    private boolean inAppBrowser;

    @TypeInfo(type = HashSet.class)
    private Set<String> installersList;
    private boolean isToken1Mandatory;
    private String lastVersion;

    @TypeInfo(complex = true)
    private LocationMetadata location;
    private String metadataUpdateVersion;

    @TypeInfo(complex = true)
    private MotionMetadata motion;

    @TypeInfo(complex = true)
    private MraidMetadata mraid;

    @TypeInfo(complex = true)
    private NetworkTestsMetaData networkTests;
    private int notVisibleBannerReloadInterval;
    private boolean omSdkEnabled;
    private long omSdkTimeout;
    private int[] periodicEventIntMin;
    private int[] periodicForegroundEventSec;
    private boolean periodicInfoEventEnabled;
    private boolean periodicMetaDataEnabled;
    private int periodicMetaDataIntervalInMinutes;

    @TypeInfo(type = HashSet.class)
    private Set<String> preInstalledPackages;
    private String profileId;

    @TypeInfo(complex = true)
    private RcdMetadata rcd;

    @TypeInfo(complex = true)
    private RscMetadata rsc;

    @TypeInfo(complex = true)
    private SensorsConfig sensorsConfig;

    @TypeInfo(complex = true)
    private SensorsData sensorsData;
    private int sessionMaxBackgroundTime;
    private boolean simpleToken2;

    @TypeInfo(complex = true)
    private StaleDcConfig staleDc;
    private int stopAutoLoadAmount;
    private int stopAutoLoadPreCacheAmount;

    @TypeInfo(complex = true)
    private TelephonyMetadata telephony;

    @TypeInfo(complex = true)
    private TopicsClientMetadata topics;
    private String trackDownloadHost;

    @TypeInfo(complex = true)
    private TriggeredLinksMetadata triggeredLinks;
    private boolean trueNetEnabled;
    private String vastRecorderHost;

    @TypeInfo(complex = true, name = "wvf")
    private WvfMetadata webViewFactory;
    private boolean webViewSecured;

    @TypeInfo(complex = true)
    private SimpleTokenConfig SimpleToken = new SimpleTokenConfig();

    @TypeInfo(type = ArrayList.class)
    private List<String> metaDataHosts = f3300g;

    public MetaData() {
        String str = f3301h;
        this.adPlatformHostSecured = str;
        this.trackDownloadHost = str;
        this.sessionMaxBackgroundTime = 1800;
        this.profileId = null;
        this.installersList = f;
        this.preInstalledPackages = f3303j;
        this.simpleToken2 = true;
        this.alwaysSendToken = true;
        this.isToken1Mandatory = true;
        this.compressionEnabled = false;
        this.periodicMetaDataEnabled = false;
        this.periodicMetaDataIntervalInMinutes = 360;
        this.periodicInfoEventEnabled = false;
        this.periodicEventIntMin = f3302i;
        this.inAppBrowser = true;
        this.SupportIABViewability = true;
        this.IABDisplayImpressionDelayInSeconds = 1L;
        this.IABVideoImpressionDelayInSeconds = 2L;
        this.sensorsConfig = new SensorsConfig();
        this.btConfig = new BluetoothConfig();
        this.assetsBaseUrlSecured = "";
        this.notVisibleBannerReloadInterval = 3600;
        this.analytics = new AnalyticsConfig();
        this.f3306a = false;
        this.f3307b = false;
        this.f3308c = new ArrayList();
        this.metadataUpdateVersion = "5.3.0";
        this.dns = false;
        this.stopAutoLoadAmount = 3;
        this.stopAutoLoadPreCacheAmount = 3;
        this.trueNetEnabled = false;
        this.webViewSecured = true;
        this.omSdkEnabled = false;
        this.omSdkTimeout = 5000L;
        this.chromeCustomeTabsInternal = true;
        this.chromeCustomeTabsExternal = true;
        this.disableSendAdvertisingId = false;
        this.networkTests = new NetworkTestsMetaData();
        this.staleDc = new StaleDcConfig();
        this.telephony = new TelephonyMetadata();
        this.anrConfig = new ANRRemoteConfig();
        this.impressionsTracking = null;
        this.connectivity = new ConnectivityHelperMetadata();
        this.webViewFactory = null;
        this.appSession = new AppSessionConfig();
        this.topics = null;
        this.mraid = null;
        this.eventTracerMetadata = null;
    }

    public static MetaData E() {
        return f3304k;
    }

    public static Object H() {
        return f3298d;
    }

    private static void a(MetaData metaData) {
        synchronized (f3298d) {
            metaData.f3308c.addAll(f3304k.f3308c);
            f3304k = metaData;
        }
    }

    public static boolean c(Context context) {
        if (f3299e.getAndSet(true)) {
            return false;
        }
        MetaData metaData = (MetaData) e7.b(context, "StartappMetadata");
        MetaData metaData2 = new MetaData();
        if (metaData != null) {
            boolean a3 = si.a((Serializable) metaData, (Serializable) metaData2);
            if ("5.3.0".equals(metaData.metadataUpdateVersion) && a3) {
                d9 d9Var = new d9(e9.f3618e);
                d9Var.f3574d = "metadata_null";
                d9Var.a();
            }
            metaData.f3306a = false;
            metaData.f3307b = false;
            metaData.f3308c = new ArrayList();
            a(metaData);
        } else {
            a(metaData2);
        }
        f3304k.a();
        return true;
    }

    public final long A() {
        return this.IABVideoImpressionDelayInSeconds;
    }

    public final String B() {
        return this.impressionURL;
    }

    public final ImpressionsTrackingMetadata C() {
        return this.impressionsTracking;
    }

    public final Set D() {
        return this.installersList;
    }

    public final String F() {
        return this.lastVersion;
    }

    public final LocationMetadata G() {
        return this.location;
    }

    public final List I() {
        List<String> list = this.metaDataHosts;
        if (list == null || list.isEmpty()) {
            list = f3300g;
        }
        return Collections.unmodifiableList(list);
    }

    public final MotionMetadata J() {
        return this.motion;
    }

    public final MraidMetadata K() {
        return this.mraid;
    }

    public final NetworkTestsMetaData L() {
        return this.networkTests;
    }

    public final int M() {
        return this.notVisibleBannerReloadInterval;
    }

    public final long N() {
        return Math.max(0L, this.omSdkTimeout);
    }

    public final int O() {
        return this.periodicMetaDataIntervalInMinutes;
    }

    public final Set P() {
        Set set = this.preInstalledPackages;
        if (set == null) {
            set = f3303j;
        }
        return Collections.unmodifiableSet(set);
    }

    public final String Q() {
        return this.profileId;
    }

    public final RcdMetadata R() {
        return this.rcd;
    }

    public final RscMetadata S() {
        return this.rsc;
    }

    public final SensorsConfig T() {
        return this.sensorsConfig;
    }

    public final SensorsData U() {
        return this.sensorsData;
    }

    public final long V() {
        return TimeUnit.SECONDS.toMillis(this.sessionMaxBackgroundTime);
    }

    public final SimpleTokenConfig W() {
        return this.SimpleToken;
    }

    public final StaleDcConfig X() {
        return this.staleDc;
    }

    public final int Y() {
        return this.stopAutoLoadAmount;
    }

    public final int Z() {
        return this.stopAutoLoadPreCacheAmount;
    }

    public final TelephonyMetadata a0() {
        return this.telephony;
    }

    public final int b(Context context) {
        return a(context, this.periodicEventIntMin);
    }

    public final TopicsClientMetadata b0() {
        return this.topics;
    }

    public final String c0() {
        String str = this.trackDownloadHost;
        if (str != null) {
            return str;
        }
        String str2 = this.adPlatformHostSecured;
        return str2 != null ? str2 : f3301h;
    }

    public final AdDebuggerMetadata d() {
        return this.adDebugger;
    }

    public final String d0() {
        return this.vastRecorderHost;
    }

    public final EnabledConfig e() {
        return this.adLoadWaitForMetadata;
    }

    public final WvfMetadata e0() {
        return this.webViewFactory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MetaData metaData = (MetaData) obj;
            if (this.sessionMaxBackgroundTime == metaData.sessionMaxBackgroundTime && this.simpleToken2 == metaData.simpleToken2 && this.alwaysSendToken == metaData.alwaysSendToken && this.isToken1Mandatory == metaData.isToken1Mandatory && this.compressionEnabled == metaData.compressionEnabled && Double.compare(this.httpPost, metaData.httpPost) == 0 && this.periodicMetaDataEnabled == metaData.periodicMetaDataEnabled && this.periodicMetaDataIntervalInMinutes == metaData.periodicMetaDataIntervalInMinutes && this.periodicInfoEventEnabled == metaData.periodicInfoEventEnabled && this.inAppBrowser == metaData.inAppBrowser && this.SupportIABViewability == metaData.SupportIABViewability && this.IABDisplayImpressionDelayInSeconds == metaData.IABDisplayImpressionDelayInSeconds && this.IABVideoImpressionDelayInSeconds == metaData.IABVideoImpressionDelayInSeconds && this.notVisibleBannerReloadInterval == metaData.notVisibleBannerReloadInterval && this.dns == metaData.dns && this.adsPreCachingEnabled == metaData.adsPreCachingEnabled && this.stopAutoLoadAmount == metaData.stopAutoLoadAmount && this.stopAutoLoadPreCacheAmount == metaData.stopAutoLoadPreCacheAmount && this.trueNetEnabled == metaData.trueNetEnabled && this.webViewSecured == metaData.webViewSecured && this.omSdkEnabled == metaData.omSdkEnabled && this.omSdkTimeout == metaData.omSdkTimeout && this.chromeCustomeTabsInternal == metaData.chromeCustomeTabsInternal && this.chromeCustomeTabsExternal == metaData.chromeCustomeTabsExternal && this.closeAdAfterClick == metaData.closeAdAfterClick && this.disableSendAdvertisingId == metaData.disableSendAdvertisingId && Double.compare(this.flh, metaData.flh) == 0 && si.a((Object) this.SimpleToken, (Object) metaData.SimpleToken) && si.a((Object) this.consentDetails, (Object) metaData.consentDetails) && si.a((Object) this.calcProd, (Object) metaData.calcProd) && si.a(this.metaDataHosts, metaData.metaDataHosts) && si.a((Object) this.adPlatformHostSecured, (Object) metaData.adPlatformHostSecured) && si.a((Object) this.trackDownloadHost, (Object) metaData.trackDownloadHost) && si.a((Object) this.vastRecorderHost, (Object) metaData.vastRecorderHost) && si.a((Object) this.adPlatformBannerHostSecured, (Object) metaData.adPlatformBannerHostSecured) && si.a((Object) this.adPlatformOverlayHostSecured, (Object) metaData.adPlatformOverlayHostSecured) && si.a((Object) this.adPlatformNativeHostSecured, (Object) metaData.adPlatformNativeHostSecured) && si.a((Object) this.profileId, (Object) metaData.profileId) && si.a(this.installersList, metaData.installersList) && si.a(this.preInstalledPackages, metaData.preInstalledPackages) && Arrays.equals(this.periodicEventIntMin, metaData.periodicEventIntMin) && Arrays.equals(this.periodicForegroundEventSec, metaData.periodicForegroundEventSec) && si.a((Object) this.sensorsConfig, (Object) metaData.sensorsConfig) && si.a((Object) this.btConfig, (Object) metaData.btConfig) && si.a((Object) this.external, (Object) metaData.external) && si.a((Object) this.impressionURL, (Object) metaData.impressionURL) && si.a((Object) this.adClickURL, (Object) metaData.adClickURL) && si.a((Object) this.assetsBaseUrlSecured, (Object) metaData.assetsBaseUrlSecured) && si.a((Object) this.httpClientConfig, (Object) metaData.httpClientConfig) && si.a((Object) this.analytics, (Object) metaData.analytics) && si.a((Object) this.metadataUpdateVersion, (Object) metaData.metadataUpdateVersion) && si.a((Object) this.adLoadWaitForMetadata, (Object) metaData.adLoadWaitForMetadata) && si.a((Object) this.networkTests, (Object) metaData.networkTests) && si.a((Object) this.triggeredLinks, (Object) metaData.triggeredLinks) && si.a((Object) this.rsc, (Object) metaData.rsc) && si.a((Object) this.rcd, (Object) metaData.rcd) && si.a((Object) this.staleDc, (Object) metaData.staleDc) && si.a((Object) this.motion, (Object) metaData.motion) && si.a((Object) this.sensorsData, (Object) metaData.sensorsData) && si.a((Object) this.air, (Object) metaData.air) && si.a((Object) this.telephony, (Object) metaData.telephony) && si.a((Object) this.anrConfig, (Object) metaData.anrConfig) && si.a((Object) this.location, (Object) metaData.location) && si.a((Object) this.impressionsTracking, (Object) metaData.impressionsTracking) && si.a((Object) this.connectivity, (Object) metaData.connectivity) && si.a((Object) this.adDebugger, (Object) metaData.adDebugger) && si.a((Object) this.webViewFactory, (Object) metaData.webViewFactory) && si.a((Object) this.appSession, (Object) metaData.appSession) && si.a((Object) this.topics, (Object) metaData.topics) && si.a((Object) this.mraid, (Object) metaData.mraid) && si.a((Object) this.eventTracerMetadata, (Object) metaData.eventTracerMetadata) && si.a((Object) this.lastVersion, (Object) metaData.lastVersion)) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        String str = this.adPlatformHostSecured;
        return str != null ? str : f3301h;
    }

    public final boolean f0() {
        return this.adsPreCachingEnabled;
    }

    public final AdvertisingIdResolverMetadata g() {
        return this.air;
    }

    public final boolean g0() {
        return this.alwaysSendToken;
    }

    public final AnalyticsConfig h() {
        return this.analytics;
    }

    public final boolean h0() {
        return this.compressionEnabled;
    }

    public final int hashCode() {
        Object[] objArr = {this.SimpleToken, this.consentDetails, this.calcProd, this.metaDataHosts, this.adPlatformHostSecured, this.trackDownloadHost, this.vastRecorderHost, this.adPlatformBannerHostSecured, this.adPlatformOverlayHostSecured, this.adPlatformNativeHostSecured, Integer.valueOf(this.sessionMaxBackgroundTime), this.profileId, this.installersList, this.preInstalledPackages, Boolean.valueOf(this.simpleToken2), Boolean.valueOf(this.alwaysSendToken), Boolean.valueOf(this.isToken1Mandatory), Boolean.valueOf(this.compressionEnabled), Double.valueOf(this.httpPost), Boolean.valueOf(this.periodicMetaDataEnabled), Integer.valueOf(this.periodicMetaDataIntervalInMinutes), Boolean.valueOf(this.periodicInfoEventEnabled), this.periodicEventIntMin, this.periodicForegroundEventSec, Boolean.valueOf(this.inAppBrowser), Boolean.valueOf(this.SupportIABViewability), Long.valueOf(this.IABDisplayImpressionDelayInSeconds), Long.valueOf(this.IABVideoImpressionDelayInSeconds), this.sensorsConfig, this.btConfig, this.external, this.impressionURL, this.adClickURL, this.assetsBaseUrlSecured, this.httpClientConfig, Integer.valueOf(this.notVisibleBannerReloadInterval), this.analytics, this.metadataUpdateVersion, Boolean.valueOf(this.dns), Boolean.valueOf(this.adsPreCachingEnabled), Integer.valueOf(this.stopAutoLoadAmount), Integer.valueOf(this.stopAutoLoadPreCacheAmount), Boolean.valueOf(this.trueNetEnabled), Boolean.valueOf(this.webViewSecured), Boolean.valueOf(this.omSdkEnabled), Long.valueOf(this.omSdkTimeout), Boolean.valueOf(this.chromeCustomeTabsInternal), Boolean.valueOf(this.chromeCustomeTabsExternal), Boolean.valueOf(this.closeAdAfterClick), Boolean.valueOf(this.disableSendAdvertisingId), this.adLoadWaitForMetadata, Double.valueOf(this.flh), this.networkTests, this.triggeredLinks, this.rsc, this.rcd, this.staleDc, this.motion, this.sensorsData, this.air, this.telephony, this.anrConfig, this.location, this.impressionsTracking, this.connectivity, this.adDebugger, this.webViewFactory, this.appSession, this.topics, this.mraid, this.eventTracerMetadata, this.lastVersion};
        WeakHashMap weakHashMap = si.f4343a;
        return Arrays.deepHashCode(objArr);
    }

    public final ANRRemoteConfig i() {
        return this.anrConfig;
    }

    public final boolean i0() {
        WeakHashMap weakHashMap = si.f4343a;
        return this.inAppBrowser;
    }

    public final AppSessionConfig j() {
        return this.appSession;
    }

    public final boolean j0() {
        return this.omSdkEnabled;
    }

    public final String k() {
        String str = this.assetsBaseUrlSecured;
        return str != null ? str : "";
    }

    public final boolean k0() {
        return this.periodicForegroundEventSec != null;
    }

    public final BluetoothConfig l() {
        return this.btConfig;
    }

    public final boolean l0() {
        return this.periodicInfoEventEnabled;
    }

    public final String m() {
        return this.calcProd;
    }

    public final boolean m0() {
        return this.periodicMetaDataEnabled;
    }

    public final boolean n() {
        return this.chromeCustomeTabsExternal;
    }

    public final boolean n0() {
        return this.f3307b;
    }

    public final boolean o() {
        return this.chromeCustomeTabsInternal;
    }

    public final boolean o0() {
        return this.SupportIABViewability;
    }

    public final boolean p() {
        return this.closeAdAfterClick;
    }

    public final boolean p0() {
        return this.isToken1Mandatory;
    }

    public final ConnectivityHelperMetadata q() {
        return this.connectivity;
    }

    public final void q0() {
        this.f3307b = true;
    }

    public final ConsentConfig r() {
        return this.consentDetails;
    }

    public final boolean s() {
        return this.disableSendAdvertisingId;
    }

    public final EventTracerMetadata t() {
        return this.eventTracerMetadata;
    }

    public final ExternalConfig u() {
        return this.external;
    }

    public final ExternalAdConfig v() {
        ExternalConfig externalConfig = this.external;
        if (externalConfig != null) {
            return externalConfig.getGoogleads();
        }
        return null;
    }

    public final String w() {
        int indexOf;
        String str = f3304k.adPlatformHostSecured;
        if (str == null) {
            str = f3301h;
        }
        String str2 = (Build.VERSION.SDK_INT > 26 || this.webViewSecured) ? "https" : "http";
        if (str.startsWith(str2.concat("://")) || (indexOf = str.indexOf(58)) == -1) {
            return str;
        }
        return str2 + str.substring(indexOf);
    }

    public final HttpClientConfig x() {
        return this.httpClientConfig;
    }

    public final double y() {
        return this.httpPost;
    }

    public final long z() {
        return this.IABDisplayImpressionDelayInSeconds;
    }

    public final boolean b() {
        return !this.dns;
    }

    public static void a(Context context, MetaData metaData, MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z3) {
        ArrayList arrayList;
        WeakHashMap weakHashMap = si.f4343a;
        synchronized (f3298d) {
            try {
                arrayList = new ArrayList(f3304k.f3308c);
                f3304k.f3308c.clear();
                metaData.f3308c = f3304k.f3308c;
                metaData.a();
                metaData.metadataUpdateVersion = "5.3.0";
                e7.d(context, "StartappMetadata", metaData);
                metaData.f3306a = false;
                metaData.f3307b = true;
                if (!si.a((Object) f3304k, (Object) metaData)) {
                    z3 = true;
                }
                f3304k = metaData;
                if (si.c(context)) {
                    try {
                        sf sfVar = (sf) a.a(context).f3341G.a();
                        int i3 = sfVar.getInt("totalSessions", 0);
                        rf edit = sfVar.edit();
                        int i4 = i3 + 1;
                        edit.a("totalSessions", Integer.valueOf(i4));
                        edit.f4299a.putInt("totalSessions", i4);
                        edit.apply();
                    } catch (Throwable th) {
                        d9.a(th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        boolean z4 = ((Random) si.f4346d.a()).nextDouble() < f3304k.flh;
        Handler handler = z4 ? new Handler(Looper.getMainLooper()) : null;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ic icVar = (ic) it.next();
            if (z4) {
                handler.post(new fc(icVar, metaDataRequest$RequestReason, z3));
            } else {
                icVar.a(metaDataRequest$RequestReason, z3);
            }
        }
    }

    public final String c() {
        return this.adClickURL;
    }

    public static void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason) {
        ArrayList arrayList;
        synchronized (f3298d) {
            arrayList = new ArrayList(f3304k.f3308c);
            f3304k.f3308c.clear();
            f3304k.f3306a = false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ic) it.next()).a();
        }
    }

    public final void a(Context context, AdPreferences adPreferences, MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z3, b bVar, boolean z4) {
        if (context == null) {
            if (bVar != null) {
                bVar.a(metaDataRequest$RequestReason, false);
                return;
            }
            return;
        }
        if (!z3 && bVar != null) {
            bVar.a(metaDataRequest$RequestReason, false);
        }
        synchronized (f3298d) {
            if (f3304k.f3307b && !z4) {
                if (!z3 || bVar == null) {
                    return;
                }
                bVar.a(metaDataRequest$RequestReason, false);
                return;
            }
            if (!f3304k.f3306a || z4) {
                this.f3306a = true;
                this.f3307b = false;
                ib ibVar = a.a(context).f3345K;
                AtomicInteger atomicInteger = f3305l;
                Objects.requireNonNull(atomicInteger);
                a8 a8Var = new a8(context, ibVar, adPreferences, metaDataRequest$RequestReason, new B1.a(0, atomicInteger), atomicInteger.incrementAndGet());
                if (bVar != null) {
                    ((y6) ((x6) ibVar.a())).a(bVar, a8Var);
                }
                a8Var.b();
            }
            if (z3 && bVar != null) {
                f3304k.a(bVar);
            }
        }
    }

    public final void a(ic icVar) {
        synchronized (f3298d) {
            this.f3308c.add(icVar);
        }
    }

    public final int a(Context context) {
        return a(context, this.periodicForegroundEventSec);
    }

    private static int a(Context context, int[] iArr) {
        if (iArr == null || iArr.length < 3) {
            iArr = f3302i;
        }
        if (p0.a(context, "android.permission.ACCESS_FINE_LOCATION")) {
            int i3 = iArr[0];
            return i3 <= 0 ? f3302i[0] : i3;
        }
        if (p0.a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
            int i4 = iArr[1];
            return i4 <= 0 ? f3302i[1] : i4;
        }
        return iArr[2];
    }

    public final String a(AdPreferences.Placement placement) {
        int i3 = gc.f3761a[placement.ordinal()];
        if (i3 == 1) {
            String str = this.adPlatformBannerHostSecured;
            if (str != null) {
                return str;
            }
            String str2 = this.adPlatformHostSecured;
            return str2 != null ? str2 : f3301h;
        }
        if (i3 == 2) {
            String str3 = this.adPlatformOverlayHostSecured;
            if (str3 != null) {
                return str3;
            }
            String str4 = this.adPlatformHostSecured;
            return str4 != null ? str4 : f3301h;
        }
        if (i3 != 3) {
            String str5 = this.adPlatformHostSecured;
            return str5 != null ? str5 : f3301h;
        }
        String str6 = this.adPlatformNativeHostSecured;
        if (str6 != null) {
            return str6;
        }
        String str7 = this.adPlatformHostSecured;
        return str7 != null ? str7 : f3301h;
    }

    public final void a() {
        ArrayList arrayList;
        String str = this.adPlatformHostSecured;
        String str2 = f3301h;
        if (str != null) {
            str2 = str.replace("%AdPlatformProtocol%", "1.5");
        }
        this.adPlatformHostSecured = str2;
        List<String> list = this.metaDataHosts;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String next = it.next();
                String replace = next != null ? next.replace("%AdPlatformProtocol%", "1.5") : null;
                if (replace != null) {
                    arrayList.add(replace);
                }
            }
        } else {
            arrayList = null;
        }
        this.metaDataHosts = arrayList;
        String str3 = this.adPlatformBannerHostSecured;
        this.adPlatformBannerHostSecured = str3 != null ? str3.replace("%AdPlatformProtocol%", "1.5") : null;
        String str4 = this.adPlatformOverlayHostSecured;
        this.adPlatformOverlayHostSecured = str4 != null ? str4.replace("%AdPlatformProtocol%", "1.5") : null;
        String str5 = this.adPlatformNativeHostSecured;
        this.adPlatformNativeHostSecured = str5 != null ? str5.replace("%AdPlatformProtocol%", "1.5") : null;
    }

    public static void a(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (!f2.a(context, "close_button")) {
            WeakHashMap weakHashMap = si.f4343a;
            new j2(context, str.concat("close_button.png"), new hc(context, "close_button"), 0).a();
        }
        WeakHashMap weakHashMap2 = si.f4343a;
        for (String str2 : h0.f3820l) {
            if (!f2.a(context, str2)) {
                new j2(context, str + str2 + ".png", new hc(context, str2), 0).a();
            }
        }
        WeakHashMap weakHashMap3 = si.f4343a;
        for (String str3 : h0.f3821m) {
            if (!f2.a(context, str3)) {
                new j2(context, str + str3 + ".png", new hc(context, str3), 0).a();
            }
        }
        if (f2.a(context, "logo")) {
            return;
        }
        new j2(context, str.concat("logo.png"), new hc(context, "logo"), 0).a();
    }
}
