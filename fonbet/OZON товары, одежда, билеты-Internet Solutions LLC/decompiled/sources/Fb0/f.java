package Fb0;

import Sc.InterfaceC3999a;
import android.widget.FrameLayout;
import fd.InterfaceC6511n;
import java.io.Serializable;
import java.net.CookieHandler;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xb0.InterfaceC10696a;
import yb0.InterfaceC10879a;
import zb0.c;

/* loaded from: classes7.dex */
public abstract class f implements Serializable, Cloneable {
    private final String abVariants;
    private final InterfaceC10879a antibotEventListener;
    private final Function1<FrameLayout, Unit> antibotFrameForHostProvider;
    private final CookieHandler externalCookieHandler;
    private final Function2<Ld0.c, Hb0.c, Unit> hostFeatureFlagsProvider;
    private final String internalHeadersToken;
    private final String meshVersion;
    private final InterfaceC6511n<Cb0.g, InterfaceC10696a, kotlin.coroutines.d<? super Unit>, Object> networkCookieEventListener;
    private final c.b onAuthCookieEvent;

    @NotNull
    private final List<zb0.g> ozonIdCookieHandlers = K.f71697a;

    @NotNull
    private final List<String> mobileIdHosts = C7714v.b0("idgw.mobileid.mts.ru", "mobileid.megafon.ru", "m-c.t2.ru", "he-mc.t2.ru", "balance.beeline.ru", "ozonid-mobile-id-latest.stg.a.o3.ru");

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @InterfaceC3999a
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a BX_APP;
        public static final a DELIVERY_APP;
        public static final a DESIGN_APP;
        public static final a FRESH_APP;
        public static final a IN_APP_UPDATE_DEMO_APP;
        public static final a MAPLE_APP;
        public static final a MAPS_SDK_DEMO_APP;
        public static final a MESSENGER_DEMO_APP;
        public static final a NETZONE_APP;
        public static final a OZON_BANK_B2B;
        public static final a OZON_BANK_B2C;
        public static final a OZON_BANK_PVZ;
        public static final a OZON_FLEX_APP;
        public static final a OZON_HIRE_APP;
        public static final a OZON_LOGISTA;
        public static final a OZON_PLATFORM_DEMO_APP;
        public static final a OZON_SHIPPING_APP;
        public static final a PROFIT_APP;
        public static final a PUSH_SDK;
        public static final a PVZ_APP;
        public static final a SDK_DEMO_APP;
        public static final a SELECT_APP;
        public static final a SX_APP;
        public static final a TRAVEL_APP;
        public static final a TRAVEL_EXTRANET_APP;
        public static final a WIRE_APP;

        @NotNull
        private final String value;

        static {
            a aVar = new a("BX_APP", 0, "ozonapp_android");
            BX_APP = aVar;
            a aVar2 = new a("SX_APP", 1, "sellerapp_android");
            SX_APP = aVar2;
            a aVar3 = new a("PVZ_APP", 2, "ozonpvzapp_android");
            PVZ_APP = aVar3;
            a aVar4 = new a("DELIVERY_APP", 3, "ozondeliveryapp_android");
            DELIVERY_APP = aVar4;
            a aVar5 = new a("OZON_FLEX_APP", 4, "ozonflexapp_android");
            OZON_FLEX_APP = aVar5;
            a aVar6 = new a("OZON_BANK_B2C", 5, "ozonbankfinance_android");
            OZON_BANK_B2C = aVar6;
            a aVar7 = new a("OZON_BANK_B2B", 6, "ozonbanksme_android");
            OZON_BANK_B2B = aVar7;
            a aVar8 = new a("OZON_BANK_PVZ", 7, "ozonbankapvz_android");
            OZON_BANK_PVZ = aVar8;
            a aVar9 = new a("OZON_HIRE_APP", 8, "ozonhireapp_android");
            OZON_HIRE_APP = aVar9;
            a aVar10 = new a("OZON_SHIPPING_APP", 9, "ozonshippingapp_android");
            OZON_SHIPPING_APP = aVar10;
            a aVar11 = new a("PUSH_SDK", 10, "ozonpushsdkdemoapp_android");
            PUSH_SDK = aVar11;
            a aVar12 = new a("MAPS_SDK_DEMO_APP", 11, "ozonmapssdkdemoapp_android");
            MAPS_SDK_DEMO_APP = aVar12;
            a aVar13 = new a("MESSENGER_DEMO_APP", 12, "ozonmessengerdemoapp_android");
            MESSENGER_DEMO_APP = aVar13;
            a aVar14 = new a("OZON_PLATFORM_DEMO_APP", 13, "ozonplatformdemoapp_android");
            OZON_PLATFORM_DEMO_APP = aVar14;
            a aVar15 = new a("TRAVEL_APP", 14, "travelapp_android");
            TRAVEL_APP = aVar15;
            a aVar16 = new a("WIRE_APP", 15, "ozonwireapp_android");
            WIRE_APP = aVar16;
            a aVar17 = new a("IN_APP_UPDATE_DEMO_APP", 16, "ozoninappupdatedemoapp_android");
            IN_APP_UPDATE_DEMO_APP = aVar17;
            a aVar18 = new a("SDK_DEMO_APP", 17, "mpxapp_android");
            SDK_DEMO_APP = aVar18;
            a aVar19 = new a("DESIGN_APP", 18, "ozondsgnapp_android");
            DESIGN_APP = aVar19;
            a aVar20 = new a("FRESH_APP", 19, "freshapp_android");
            FRESH_APP = aVar20;
            a aVar21 = new a("SELECT_APP", 20, "selectapp_android");
            SELECT_APP = aVar21;
            a aVar22 = new a("MAPLE_APP", 21, "ozonmapleapp_android");
            MAPLE_APP = aVar22;
            a aVar23 = new a("NETZONE_APP", 22, "netzone_android");
            NETZONE_APP = aVar23;
            a aVar24 = new a("PROFIT_APP", 23, "profitapp_android");
            PROFIT_APP = aVar24;
            a aVar25 = new a("TRAVEL_EXTRANET_APP", 24, "travelextranetapp_android");
            TRAVEL_EXTRANET_APP = aVar25;
            a aVar26 = new a("OZON_LOGISTA", 25, "logistaapp_android");
            OZON_LOGISTA = aVar26;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @NotNull
        public final String a() {
            return this.value;
        }
    }

    public String getAbVariants() {
        return this.abVariants;
    }

    @NotNull
    public abstract String getAntibotAppHash();

    public InterfaceC10879a getAntibotEventListener() {
        return this.antibotEventListener;
    }

    public Function1<FrameLayout, Unit> getAntibotFrameForHostProvider() {
        return this.antibotFrameForHostProvider;
    }

    @NotNull
    public abstract a getAppName();

    @NotNull
    public abstract String getAppVersion();

    public CookieHandler getExternalCookieHandler() {
        return this.externalCookieHandler;
    }

    public Function2<Ld0.c, Hb0.c, Unit> getHostFeatureFlagsProvider() {
        return this.hostFeatureFlagsProvider;
    }

    public String getInternalHeadersToken() {
        return this.internalHeadersToken;
    }

    @NotNull
    public abstract Ub0.b getLocaleProvider();

    public String getMeshVersion() {
        return this.meshVersion;
    }

    @NotNull
    public List<String> getMobileIdHosts$ozon_id_sdk_release() {
        return this.mobileIdHosts;
    }

    public InterfaceC6511n<Cb0.g, InterfaceC10696a, kotlin.coroutines.d<? super Unit>, Object> getNetworkCookieEventListener() {
        return this.networkCookieEventListener;
    }

    public c.b getOnAuthCookieEvent() {
        return this.onAuthCookieEvent;
    }

    @NotNull
    public abstract e getPrimaryDomain();

    @NotNull
    public abstract String getUserAgent();

    /* renamed from: isManualNotificationRootViewControl */
    public abstract boolean getIsManualNotificationRootViewControl();

    @NotNull
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public f m4clone() {
        Object clone = super.clone();
        Intrinsics.g(clone, "null cannot be cast to non-null type ru.ozon.id.core.OzonIdConfig");
        return (f) clone;
    }
}
