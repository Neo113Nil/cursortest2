package com.startapp.sdk.adsbase.model;

import android.content.Context;
import android.media.AudioManager;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.SDKAdPreferences;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.advertisingid.b;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.internal.AbstractC0253g;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.fh;
import com.startapp.sdk.internal.mg;
import com.startapp.sdk.internal.og;
import com.startapp.sdk.internal.p0;
import com.startapp.sdk.internal.pg;
import com.startapp.sdk.internal.q;
import com.startapp.sdk.internal.se;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.t;
import com.startapp.sdk.internal.u0;
import com.startapp.sdk.internal.y1;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class a extends y1 {

    /* renamed from: A0, reason: collision with root package name */
    public Integer f3253A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f3254B0;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f3255C0;

    /* renamed from: D0, reason: collision with root package name */
    public boolean f3256D0;
    public int E0;

    /* renamed from: F0, reason: collision with root package name */
    public Set f3257F0;

    /* renamed from: G0, reason: collision with root package name */
    public Set f3258G0;

    /* renamed from: H0, reason: collision with root package name */
    public HashSet f3259H0;

    /* renamed from: I0, reason: collision with root package name */
    public Set f3260I0;
    public HashSet J0;

    /* renamed from: K0, reason: collision with root package name */
    public Pair f3261K0;

    /* renamed from: L0, reason: collision with root package name */
    public boolean f3262L0;

    /* renamed from: M0, reason: collision with root package name */
    public final long f3263M0;
    public final int N0;

    /* renamed from: O0, reason: collision with root package name */
    public final String f3264O0;

    /* renamed from: P0, reason: collision with root package name */
    public String f3265P0;

    /* renamed from: Q0, reason: collision with root package name */
    public String f3266Q0;

    /* renamed from: R0, reason: collision with root package name */
    public boolean f3267R0;

    /* renamed from: S0, reason: collision with root package name */
    public Boolean f3268S0;

    /* renamed from: T0, reason: collision with root package name */
    public String f3269T0;

    /* renamed from: U0, reason: collision with root package name */
    public Ad.AdType f3270U0;
    public AdPreferences.Placement n0;

    /* renamed from: o0, reason: collision with root package name */
    public String f3271o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f3272p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f3273q0;

    /* renamed from: r0, reason: collision with root package name */
    public SDKAdPreferences.Gender f3274r0;

    /* renamed from: s0, reason: collision with root package name */
    public String f3275s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f3276t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f3277u0;
    public Boolean v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f3278w0;

    /* renamed from: x0, reason: collision with root package name */
    public Double f3279x0;

    /* renamed from: y0, reason: collision with root package name */
    public String f3280y0;

    /* renamed from: z0, reason: collision with root package name */
    public String f3281z0;

    public a() {
        super(4);
        this.f3276t0 = 1;
        this.f3277u0 = true;
        this.f3278w0 = AdsCommonMetaData.k().J();
        this.f3255C0 = true;
        this.E0 = 0;
        this.f3257F0 = null;
        this.f3258G0 = null;
        this.f3259H0 = null;
        this.f3260I0 = null;
        this.J0 = null;
        this.f3262L0 = true;
        this.f3270U0 = null;
        this.f3263M0 = System.currentTimeMillis() - mg.f4061d.f4063b;
        WeakHashMap weakHashMap = si.f4343a;
        this.N0 = t.f4350d.f4351a.size();
        this.f3264O0 = MetaData.E().Q();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(Context context, AdPreferences adPreferences, AdPreferences.Placement placement, Pair pair) {
        Set a3;
        boolean contains;
        boolean z3;
        this.n0 = placement;
        this.f3271o0 = adPreferences.getPlacementId();
        this.f3261K0 = pair;
        this.f3268S0 = adPreferences.getAi();
        this.f3274r0 = adPreferences.getGender(context);
        this.f3275s0 = adPreferences.getKeywords();
        this.f3272p0 = adPreferences.isTestMode();
        this.f3257F0 = adPreferences.getCategories();
        this.f3258G0 = adPreferences.getCategoriesExclude();
        this.f3277u0 = adPreferences.isHardwareAccelerated();
        this.f3253A0 = adPreferences.getAutoLoadAmount();
        this.f3254B0 = adPreferences.isPreCached();
        this.v0 = Boolean.valueOf(p0.c(context));
        this.f3279x0 = adPreferences.getMinCpm();
        this.f3280y0 = adPreferences.getAdTag();
        HashSet hashSet = MetaData.f;
        boolean z4 = true;
        this.f3255C0 = !context.getFileStreamPath("StartappMetadata").exists();
        this.f3270U0 = adPreferences.type;
        this.f4679b = adPreferences.getCustomProductId();
        VideoConfig F3 = AdsCommonMetaData.k().F();
        if ((F3 == null || F3.m() == null) ? false : F3.m().equals("muted")) {
            this.f3256D0 = false;
        } else {
            try {
                Object systemService = context.getSystemService("audio");
                if (systemService instanceof AudioManager) {
                    this.f3256D0 = ((AudioManager) systemService).getStreamVolume(3) > 0;
                }
            } catch (Throwable th) {
                d9.a(th);
            }
        }
        try {
            if (!fh.f3695a.f3794t) {
                q qVar = (q) com.startapp.sdk.components.a.a(context).f3349P.a();
                AdDebuggerMetadata d3 = MetaData.E().d();
                if (d3 != null) {
                    AdDebuggerMetadata d4 = MetaData.E().d();
                    if (d4 != null && (a3 = d4.a()) != null) {
                        contains = a3.contains(((b) qVar.f4233b.a()).a().f3940a);
                        if (contains && d3.c()) {
                            z3 = true;
                            if (!z3) {
                                z4 = false;
                            }
                        }
                    }
                    contains = false;
                    if (contains) {
                        z3 = true;
                        if (!z3) {
                        }
                    }
                }
                z3 = false;
                if (!z3) {
                }
            }
            this.f3273q0 = z4;
        } catch (Throwable unused) {
        }
        this.f3260I0 = adPreferences.packageInclude;
    }

    @Override // com.startapp.sdk.internal.y1
    public final boolean b() {
        return true;
    }

    public void g(Context context) {
        pg pgVar = (pg) com.startapp.sdk.components.a.a(context).f3364l.a();
        AdPreferences.Placement placement = this.n0;
        this.f3281z0 = placement == null ? null : (String) pgVar.f4227a.get(new og(placement));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.startapp.sdk.internal.y1
    public void a(se seVar) {
        super.a(seVar);
        seVar.a("placement", this.n0.name(), true, true);
        seVar.a("placementId", this.f3271o0, false, true);
        seVar.a("testMode", Boolean.toString(this.f3272p0), false, true);
        seVar.a("gender", this.f3274r0, false, true);
        seVar.a("keywords", this.f3275s0, false, true);
        seVar.a("adsNumber", Integer.toString(this.f3276t0), false, true);
        seVar.a("category", this.f3257F0);
        seVar.a("categoryExclude", this.f3258G0);
        seVar.a("packageExclude", this.f3259H0);
        seVar.a("campaignExclude", this.J0);
        seVar.a("offset", Integer.toString(this.E0), false, true);
        seVar.a("ai", this.f3268S0, false, true);
        Double d3 = this.f3279x0;
        WeakHashMap weakHashMap = si.f4343a;
        seVar.a("minCPM", d3 != null ? String.format(Locale.US, "%.2f", d3) : null, false, true);
        seVar.a("previousAdId", this.f3281z0, false, true);
        seVar.a("twoClicks", Boolean.valueOf(!this.f3278w0), false, true);
        seVar.a("engInclude", Boolean.toString(this.f3262L0), false, true);
        Object obj = this.f3270U0;
        if (obj == Ad.AdType.INTERSTITIAL || obj == Ad.AdType.RICH_TEXT) {
            seVar.a("type", obj, false, true);
        }
        seVar.a("timeSinceSessionStart", Long.valueOf(this.f3263M0), true, true);
        seVar.a("adsDisplayed", Integer.valueOf(this.N0), true, true);
        seVar.a("profileId", this.f3264O0, false, true);
        seVar.a("hardwareAccelerated", Boolean.valueOf(this.f3277u0), false, true);
        seVar.a("autoLoadAmount", this.f3253A0, false, true);
        seVar.a("dts", this.v0, false, true);
        if (this.f3254B0) {
            seVar.a("downloadingMode", "CACHE", false, true);
        }
        seVar.a("primaryImg", this.f3265P0, false, true);
        seVar.a("moreImg", this.f3266Q0, false, true);
        seVar.a("contentAd", Boolean.toString(this.f3267R0), false, true);
        if (this.f3273q0) {
            seVar.a("testAdsEnabled", Boolean.TRUE, false, true);
        } else {
            seVar.a("adTag", this.f3280y0, false, true);
        }
        String a3 = AbstractC0253g.a();
        seVar.a(AbstractC0253g.f3737b, a3, true, true);
        String str = AbstractC0253g.f3739d;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4679b);
        sb.append(this.n0.name());
        String str2 = this.f4667Q;
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append(this.f4681c);
        sb.append(a3);
        seVar.a(str, AbstractC0253g.a(sb.toString()), true, false);
        seVar.a("sound", Boolean.valueOf(this.f3256D0), false, true);
        Set set = this.f3260I0;
        if (set != null) {
            seVar.a("packageInclude", set);
        }
        seVar.a("defaultMetaData", Boolean.valueOf(this.f3255C0), true, true);
        Pair pair = this.f3261K0;
        seVar.a((String) pair.first, pair.second, false, true);
        Object obj2 = this.f3269T0;
        if (obj2 != null) {
            seVar.a("trv", obj2, false, false);
        }
        u0 u0Var = this.f4688g0;
        if (u0Var != null) {
            Integer num = (Integer) u0Var.f4405c.get(this.n0);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue > 0) {
                seVar.a("adsDisplayed", Integer.valueOf(intValue), false, false);
            }
        }
        seVar.a("omsdkv", "1.6.0-Startio", false, true);
    }
}
