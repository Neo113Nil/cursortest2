package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC4455i3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class Gf {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<IronSource.a, C4612r0> f7643a = new HashMap();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7644a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            b = iArr;
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[IronSource.a.values().length];
            f7644a = iArr2;
            try {
                iArr2[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7644a[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7644a[IronSource.a.NATIVE_AD.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7644a[IronSource.a.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static Q0 a(AbstractC4720x0 abstractC4720x0, int i) {
        return a(abstractC4720x0).a(abstractC4720x0.b().c(), abstractC4720x0.m(), i);
    }

    public static b b(IronSource.a aVar) {
        return new b(aVar);
    }

    public static int c(IronSource.a aVar) {
        int i = a.f7644a[aVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? AbstractC4455i3.e.NOT_SUPPORTED.b() : AbstractC4455i3.e.BANNER.b() : AbstractC4455i3.e.NATIVE_AD.b() : AbstractC4455i3.e.INTERSTITIAL.b() : AbstractC4455i3.e.REWARDED_VIDEO.b();
    }

    public static IronSource.a b(LevelPlay.AdFormat adFormat) {
        if (adFormat == null) {
            return null;
        }
        int i = a.b[adFormat.ordinal()];
        if (i == 1) {
            return IronSource.a.REWARDED_VIDEO;
        }
        if (i == 2) {
            return IronSource.a.INTERSTITIAL;
        }
        if (i == 3) {
            return IronSource.a.BANNER;
        }
        if (i != 4) {
            return null;
        }
        return IronSource.a.NATIVE_AD;
    }

    private static C4612r0 a(AbstractC4720x0 abstractC4720x0) {
        Map<IronSource.a, C4612r0> map = f7643a;
        if (map.containsKey(abstractC4720x0.b().a())) {
            return map.get(abstractC4720x0.b().a());
        }
        C4612r0 c4612r0 = new C4612r0();
        map.put(abstractC4720x0.b().a(), c4612r0);
        return c4612r0;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final IronSource.a f7645a;

        public b(IronSource.a aVar) {
            this.f7645a = aVar;
        }

        private String b() {
            IronSource.a aVar = this.f7645a;
            return aVar != null ? aVar.name() : "";
        }

        public String a(String str, String str2) {
            String str3 = b() + (TextUtils.isEmpty(str2) ? "" : " - " + str2);
            return TextUtils.isEmpty(str) ? str3 : str3 + " - " + str;
        }

        public String a(String str) {
            return a(str, null);
        }

        public String a() {
            return a(null);
        }
    }

    public static C4293aa a() {
        return com.ironsource.mediationsdk.p.g().m();
    }

    public static void a(Throwable th) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "SafeRunnable", th);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", th.getMessage());
        } catch (JSONException e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        a(EnumC4707w5.TROUBLESHOOTING_SDK_INTERNAL_ERROR, jSONObject);
    }

    public static void a(Exception exc) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "Exception", exc);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", exc.getMessage());
        } catch (JSONException e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        a(EnumC4707w5.TROUBLESHOOTING_LOAD_ARM_DATA_PARSE_ERROR, jSONObject);
    }

    public static void a(EnumC4707w5 enumC4707w5, JSONObject jSONObject) {
        Ib.a0().q().a(new C4689v5(enumC4707w5, C4444ha.a(IronSourceUtils.b(false), jSONObject)));
    }

    public static boolean a(AdapterBaseInterface adapterBaseInterface, IronSource.a aVar, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof AdapterSettingsInterface) || !((AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(a(aVar))) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }

    public static String a(LevelPlay.AdFormat adFormat) {
        int i = a.b[adFormat.ordinal()];
        if (i == 1) {
            return "rewarded";
        }
        if (i == 2) {
            return "interstitial";
        }
        if (i == 3) {
            return "banner";
        }
        if (i != 4) {
            return "";
        }
        return "nativeAd";
    }

    public static LevelPlay.AdFormat a(IronSource.a aVar) {
        int i = a.f7644a[aVar.ordinal()];
        if (i == 1) {
            return LevelPlay.AdFormat.REWARDED;
        }
        if (i == 2) {
            return LevelPlay.AdFormat.INTERSTITIAL;
        }
        if (i == 3) {
            return LevelPlay.AdFormat.NATIVE_AD;
        }
        if (i != 4) {
            return null;
        }
        return LevelPlay.AdFormat.BANNER;
    }
}
