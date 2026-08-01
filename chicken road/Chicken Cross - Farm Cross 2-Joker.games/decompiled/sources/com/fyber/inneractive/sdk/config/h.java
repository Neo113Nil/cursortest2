package com.fyber.inneractive.sdk.config;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class h implements com.fyber.inneractive.sdk.privacy.d {
    public SharedPreferences k;
    public SharedPreferences l;
    public IabTcfGdprAppliesStatus o;
    public Boolean p;

    /* renamed from: a, reason: collision with root package name */
    public Boolean f5262a = null;
    public Boolean b = null;
    public Boolean c = null;
    public String d = null;
    public String e = null;
    public InneractiveAdManager.GdprConsentSource f = null;
    public String g = null;
    public String h = null;
    public Boolean i = null;
    public Boolean j = null;
    public final com.fyber.inneractive.sdk.privacy.c m = new com.fyber.inneractive.sdk.privacy.c(this);
    public final com.fyber.inneractive.sdk.gpp.a n = new com.fyber.inneractive.sdk.gpp.a();
    public final AtomicBoolean q = new AtomicBoolean(false);
    public final AtomicBoolean r = new AtomicBoolean(false);

    public final boolean a(boolean z, String str) {
        if (com.fyber.inneractive.sdk.util.o.f5960a == null) {
            return false;
        }
        j();
        SharedPreferences sharedPreferences = this.k;
        if (sharedPreferences == null) {
            return false;
        }
        sharedPreferences.edit().putBoolean(str, z).apply();
        return true;
    }

    public final void b() {
        IAlog.a("Clearing LGPD consent status", new Object[0]);
        if (com.fyber.inneractive.sdk.util.o.f5960a == null) {
            IAlog.f("clearLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        j();
        this.i = null;
        SharedPreferences sharedPreferences = this.k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IALgpdConsentStatus").apply();
        }
    }

    public final void c() {
        IAlog.a("Clearing CCPA Consent String", new Object[0]);
        if (com.fyber.inneractive.sdk.util.o.f5960a == null) {
            IAlog.f("clearUSPrivacyString was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        j();
        this.h = null;
        SharedPreferences sharedPreferences = this.k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IACCPAConsentData").apply();
        }
    }

    public final void d() {
        if (this.n.f5423a.get() != null) {
            return;
        }
        if (this.l == null) {
            Application application = com.fyber.inneractive.sdk.util.o.f5960a;
            if (application == null) {
                IAlog.a("%sensureGppManagerInitialization - Context is null - returning", "ConfigDataProtectionProvider: ");
                return;
            }
            this.l = application.getSharedPreferences(application.getPackageName() + "_preferences", 0);
        }
        com.fyber.inneractive.sdk.gpp.a aVar = this.n;
        SharedPreferences sharedPreferences = this.l;
        if (sharedPreferences == null) {
            aVar.getClass();
            IAlog.a("%s defaultSharedPreferences is null, not initializing GppManager", "GppManager");
        } else if (aVar.f5423a.get() == null) {
            aVar.f5423a.set(sharedPreferences);
            aVar.b();
        }
    }

    public final Boolean e() {
        d();
        p();
        if (this.b == null) {
            this.b = m();
        }
        Boolean bool = Boolean.TRUE;
        if (bool.equals(this.f5262a)) {
            IAlog.a("%sB1: GDPR consent granted - Publisher API override", "ConfigDataProtectionProvider: ");
            return bool;
        }
        Boolean bool2 = Boolean.FALSE;
        boolean equals = bool2.equals(this.f5262a);
        IabTcfGdprAppliesStatus n = n();
        if (n != IabTcfGdprAppliesStatus.APPLIES) {
            if (equals) {
                IAlog.a("%sB1.1/B2: Publisher denied, gdprApplies status: %s - checking GPP (strict)", "ConfigDataProtectionProvider: ", n);
                return a(bool2);
            }
            IAlog.a("%sB1.2/B2: Publisher API not used, gdprApplies status: %s - checking GPP (lenient)", "ConfigDataProtectionProvider: ", n);
            return a((Boolean) null);
        }
        IAlog.a("%sB2.2: GDPR applies - Checking TCF VendorConsents", "ConfigDataProtectionProvider: ");
        Boolean bool3 = this.b;
        if (bool3 == null) {
            IAlog.a("%sB3: TCF VendorConsents missing - checking GPP (strict)", "ConfigDataProtectionProvider: ");
            return a(bool2);
        }
        if (bool3.booleanValue()) {
            IAlog.a("%sB3.1: GDPR consent granted - TCF Vendor 262 present", "ConfigDataProtectionProvider: ");
            return bool;
        }
        IAlog.a("%sB3.2: TCF Vendor 262 denied - checking GPP (strict)", "ConfigDataProtectionProvider: ");
        return a(bool2);
    }

    public final Integer f() {
        SharedPreferences sharedPreferences = this.l;
        if (sharedPreferences == null) {
            return null;
        }
        try {
            int i = sharedPreferences.getInt("IABTCF_CmpSdkID", -1);
            if (i != -1) {
                return Integer.valueOf(i);
            }
        } catch (Exception e) {
            IAlog.a("%sError when trying to read IABTCF_CmpSdkID", e, "ConfigDataProtectionProvider: ");
        }
        com.fyber.inneractive.sdk.tcf.a aVar = this.n.c;
        if (aVar.c) {
            return Integer.valueOf(aVar.d);
        }
        return null;
    }

    public final Integer g() {
        SharedPreferences sharedPreferences = this.l;
        if (sharedPreferences == null) {
            return null;
        }
        try {
            int i = sharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
            if (i != -1) {
                return Integer.valueOf(i);
            }
        } catch (Exception e) {
            IAlog.a("%sError when trying to read IABTCF_CmpSdkVersion", e, "ConfigDataProtectionProvider: ");
        }
        com.fyber.inneractive.sdk.tcf.a aVar = this.n.c;
        if (aVar.c) {
            return Integer.valueOf(aVar.e);
        }
        return null;
    }

    public final void h() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            IAlog.b("%sinvalidatePrivacyKeys() called off the main thread — this is a threading bug", "ConfigDataProtectionProvider: ");
        }
        this.o = null;
        this.p = null;
        this.c = null;
        this.e = null;
        this.b = null;
        com.fyber.inneractive.sdk.gpp.a aVar = this.n;
        if (aVar.f5423a.get() == null) {
            IAlog.a("%s refreshFromDefaultSharedPreferences - not initialized", "GppManager");
        } else {
            aVar.b();
            IAlog.a("%s refreshFromDefaultSharedPreferences - GPP/TCF reloaded from prefs", "GppManager");
        }
    }

    public final boolean i() {
        Application application;
        Boolean bool = this.p;
        if (bool != null) {
            return bool.booleanValue();
        }
        d();
        if (this.c == null) {
            this.c = o();
        }
        Boolean bool2 = this.p;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        IabTcfGdprAppliesStatus n = n();
        if (n == IabTcfGdprAppliesStatus.APPLIES) {
            IAlog.a("%sA1.2: GDPR applies - Checking Legacy TCF", "ConfigDataProtectionProvider: ");
            Boolean bool3 = this.c;
            if (bool3 != null && !bool3.booleanValue()) {
                IAlog.a("%sA2: TCF Purpose 1 consent granted - Purpose 1 ENABLED", "ConfigDataProtectionProvider: ");
                this.p = Boolean.FALSE;
                return false;
            }
            Boolean bool4 = this.c;
            IAlog.a("%s%s: TCF Purpose 1 %s - Checking GPP", "ConfigDataProtectionProvider: ", bool4 == null ? "A2.1" : "A2.2", bool4 == null ? "does not exist" : "denied");
            com.fyber.inneractive.sdk.gpp.a aVar = this.n;
            String str = aVar.f5423a.get() != null ? aVar.b : null;
            if (str != null && !str.isEmpty() && this.n.a()) {
                IAlog.a("%sA3.2: GppSID contains EU section - Checking GPP PurposeConsents", "ConfigDataProtectionProvider: ");
                return k();
            }
            IAlog.a("%sA.3.3: GppSID missing or no EU section when GDPR applies - BLOCK AD REQUESTS", "ConfigDataProtectionProvider: ");
            this.p = Boolean.TRUE;
            return true;
        }
        boolean z = n == IabTcfGdprAppliesStatus.NOT_FOUND;
        IAlog.a("%s%s: gdprApplies key %s, checking GPP", "ConfigDataProtectionProvider: ", z ? "A1.1" : "A1", z ? "not found" : "is false");
        com.fyber.inneractive.sdk.gpp.a aVar2 = this.n;
        String str2 = aVar2.f5423a.get() == null ? null : aVar2.b;
        if (str2 != null && !str2.isEmpty()) {
            if (this.n.a()) {
                IAlog.a("%sA3.2: GppSID contains EU section - Checking GPP PurposeConsents", "ConfigDataProtectionProvider: ");
                return k();
            }
            IAlog.a("%sA3: GppSID doesn't contain EU section - Purpose 1 ENABLED", "ConfigDataProtectionProvider: ");
            this.p = Boolean.FALSE;
            return false;
        }
        if (!z || str2 != null) {
            IAlog.a("%sA3.1: GppSID empty - Purpose 1 ENABLED", "ConfigDataProtectionProvider: ");
            this.p = Boolean.FALSE;
            return false;
        }
        Integer num = IAConfigManager.R.f;
        Boolean valueOf = Boolean.valueOf(num != null && num.intValue() == 1);
        this.p = valueOf;
        IAlog.a("%sBoth IABTCF_gdprApplies & IABGPP_GppSID are null. x-dt-is-gdpr = %s. Purpose1 disabled = %s", "ConfigDataProtectionProvider: ", num, valueOf);
        if (this.k == null && (application = com.fyber.inneractive.sdk.util.o.f5960a) != null) {
            this.k = application.getSharedPreferences("IAConfigurationPreferences", 0);
        }
        if (this.k == null) {
            IAlog.a("%sSkipping reportNoCmpFoundEvent - mSharedPrefs are null", "ConfigDataProtectionProvider: ");
        } else if (this.n.d != null) {
            IAlog.a("%sSkipping reportNoCmpFoundEvent - GPP string is not null", "ConfigDataProtectionProvider: ");
        } else if (this.q.compareAndSet(false, true)) {
            IAlog.a("%sreportNoCmpFoundEvent - reporting event", "ConfigDataProtectionProvider: ");
            this.k.edit().putBoolean("no_cmp_found_event_reported", true).apply();
            new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.u.IA_IAB_NO_CMP_FOUND, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null).a((String) null);
        } else {
            IAlog.a("%sSkipping reportNoCmpFoundEvent - event already reported", "ConfigDataProtectionProvider: ");
        }
        return this.p.booleanValue();
    }

    public final void j() {
        Application application = com.fyber.inneractive.sdk.util.o.f5960a;
        if (application != null) {
            if (this.l == null) {
                this.l = application.getSharedPreferences(application.getPackageName() + "_preferences", 0);
            }
            com.fyber.inneractive.sdk.gpp.a aVar = this.n;
            SharedPreferences sharedPreferences = this.l;
            if (sharedPreferences == null) {
                aVar.getClass();
                IAlog.a("%s defaultSharedPreferences is null, not initializing GppManager", "GppManager");
            } else if (aVar.f5423a.get() == null) {
                aVar.f5423a.set(sharedPreferences);
                aVar.b();
            }
            if (this.k == null) {
                SharedPreferences sharedPreferences2 = application.getSharedPreferences("IAConfigurationPreferences", 0);
                this.k = sharedPreferences2;
                if (sharedPreferences2 == null) {
                    IAlog.a("%sretrievePersistedValues - Shared prefs is null - returning", "ConfigDataProtectionProvider: ");
                } else {
                    this.q.set(sharedPreferences2.getBoolean("no_cmp_found_event_reported", false));
                    this.r.set(this.k.getBoolean("invalid_gdpr_applies_flag_event_reported", false));
                }
                SharedPreferences sharedPreferences3 = this.k;
                if (sharedPreferences3 != null) {
                    IAlog.a("%sInitializing privacy content info from shared prefs", "ConfigDataProtectionProvider: ");
                    this.c = o();
                    if (sharedPreferences3.contains("IAGDPRBool")) {
                        this.f5262a = Boolean.valueOf(sharedPreferences3.getBoolean("IAGDPRBool", false));
                    }
                    this.b = m();
                    if (sharedPreferences3.contains("IAGdprConsentData")) {
                        this.d = sharedPreferences3.getString("IAGdprConsentData", null);
                    }
                    this.e = l();
                    if (sharedPreferences3.contains("IACCPAConsentData")) {
                        this.h = sharedPreferences3.getString("IACCPAConsentData", null);
                    }
                    if (sharedPreferences3.contains("IAGdprSource")) {
                        try {
                            this.f = InneractiveAdManager.GdprConsentSource.valueOf(sharedPreferences3.getString("IAGdprSource", InneractiveAdManager.GdprConsentSource.Internal.toString()));
                        } catch (Exception unused) {
                            this.f = InneractiveAdManager.GdprConsentSource.Internal;
                        }
                    }
                    if (sharedPreferences3.contains("IALgpdConsentStatus")) {
                        this.i = Boolean.valueOf(sharedPreferences3.getBoolean("IALgpdConsentStatus", false));
                    }
                    if (sharedPreferences3.contains("keyUserID")) {
                        this.g = sharedPreferences3.getString("keyUserID", null);
                    }
                }
            }
        }
    }

    public final boolean k() {
        com.fyber.inneractive.sdk.tcf.a aVar = this.n.c;
        Boolean valueOf = aVar.c ? Boolean.valueOf(aVar.g) : null;
        if (valueOf == null || valueOf.booleanValue()) {
            IAlog.a("%sA4.1: GPP Purpose 1 %s - BLOCK AD REQUESTS", "ConfigDataProtectionProvider: ", valueOf == null ? "does not exist" : "not granted");
            this.p = Boolean.TRUE;
            return true;
        }
        IAlog.a("%sA4: GPP Purpose 1 consent granted - Purpose 1 ENABLED", "ConfigDataProtectionProvider: ");
        this.p = Boolean.FALSE;
        return false;
    }

    public final String l() {
        r rVar;
        SharedPreferences sharedPreferences;
        if (n() == IabTcfGdprAppliesStatus.DOES_NOT_APPLY) {
            IAlog.a("%sGDPR does not apply - returning null for GDPR consent string", "ConfigDataProtectionProvider: ");
            return null;
        }
        v vVar = IAConfigManager.R.u;
        if (vVar == null || (rVar = vVar.b) == null) {
            IAlog.a("%sGlobal config resolver is null - returning null for GDPR consent string", "ConfigDataProtectionProvider: ");
            return null;
        }
        if (rVar.a("TcfVendorId", 262, Integer.MIN_VALUE) != 0 && (sharedPreferences = this.l) != null && sharedPreferences.contains(AndroidTcfDataSource.TCF_TCSTRING_KEY)) {
            try {
                return this.l.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, null);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final Boolean m() {
        r rVar;
        SharedPreferences sharedPreferences;
        if (n() == IabTcfGdprAppliesStatus.DOES_NOT_APPLY) {
            IAlog.a("%sGDPR does not apply - returning null for GDPR consent status", "ConfigDataProtectionProvider: ");
            return null;
        }
        v vVar = IAConfigManager.R.u;
        if (vVar != null && (rVar = vVar.b) != null) {
            int a2 = rVar.a("TcfVendorId", 262, Integer.MIN_VALUE);
            if (a2 != 0 && (sharedPreferences = this.l) != null) {
                try {
                    String string = sharedPreferences.getString("IABTCF_VendorConsents", null);
                    if (string == null) {
                        return null;
                    }
                    int i = (a2 >= 0 ? a2 : 262) - 1;
                    return Boolean.valueOf(string.length() > i && string.charAt(i) == '1');
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public final IabTcfGdprAppliesStatus n() {
        Application application;
        IabTcfGdprAppliesStatus iabTcfGdprAppliesStatus = this.o;
        if (iabTcfGdprAppliesStatus != null) {
            return iabTcfGdprAppliesStatus;
        }
        SharedPreferences sharedPreferences = this.l;
        if (sharedPreferences == null) {
            IAlog.a("%sError reading gdprApplies mAppDefaultSharedPrefs is null", "ConfigDataProtectionProvider: ");
            IabTcfGdprAppliesStatus iabTcfGdprAppliesStatus2 = IabTcfGdprAppliesStatus.NOT_FOUND;
            this.o = iabTcfGdprAppliesStatus2;
            return iabTcfGdprAppliesStatus2;
        }
        if (!sharedPreferences.contains("IABTCF_gdprApplies")) {
            IAlog.a("%sReading gdprApplies: key not found", "ConfigDataProtectionProvider: ");
            IabTcfGdprAppliesStatus iabTcfGdprAppliesStatus3 = IabTcfGdprAppliesStatus.NOT_FOUND;
            this.o = iabTcfGdprAppliesStatus3;
            return iabTcfGdprAppliesStatus3;
        }
        try {
            int i = this.l.getInt("IABTCF_gdprApplies", -1);
            if (i == 1 || i == 0) {
                this.o = i == 1 ? IabTcfGdprAppliesStatus.APPLIES : IabTcfGdprAppliesStatus.DOES_NOT_APPLY;
                IAlog.a("%sReading gdprApplies: %s", "ConfigDataProtectionProvider: ", Integer.valueOf(i));
                return this.o;
            }
            IAlog.a("%sgdprApplies exists but its value is invalid, returning it as APPLIES", "ConfigDataProtectionProvider: ");
            this.o = IabTcfGdprAppliesStatus.APPLIES;
            Map<String, ?> all = this.l.getAll();
            Object obj = (all == null || !all.containsKey("IABTCF_gdprApplies")) ? null : all.get("IABTCF_gdprApplies");
            if (obj == null) {
                IAlog.a("%sSkipping reportInvalidGdprAppliesFlagEvent - invalidValue is null", "ConfigDataProtectionProvider: ");
            } else {
                if (this.k == null && (application = com.fyber.inneractive.sdk.util.o.f5960a) != null) {
                    this.k = application.getSharedPreferences("IAConfigurationPreferences", 0);
                }
                if (this.k == null) {
                    IAlog.a("%sSkipping reportInvalidGdprAppliesFlagEvent - mSharedPrefs are null", "ConfigDataProtectionProvider: ");
                } else if (this.r.compareAndSet(false, true)) {
                    this.k.edit().putBoolean("invalid_gdpr_applies_flag_event_reported", true).apply();
                    IAlog.a("%sreportInvalidGdprAppliesFlagEvent - reporting event for invalid value: %s", "ConfigDataProtectionProvider: ", obj);
                    new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.u.INVALID_GDPR_APPLIES_FLAG, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null).a("cmp_id", f(), "cmp_version", g(), "value", String.valueOf(obj)).a((String) null);
                } else {
                    IAlog.a("%sSkipping reportInvalidGdprAppliesFlagEvent - event already reported", "ConfigDataProtectionProvider: ");
                }
            }
            return this.o;
        } catch (ClassCastException unused) {
            IAlog.a("%sError reading gdprApplies as int, trying to read it as boolean", "ConfigDataProtectionProvider: ");
            try {
                boolean z = this.l.getBoolean("IABTCF_gdprApplies", true);
                this.o = z ? IabTcfGdprAppliesStatus.APPLIES : IabTcfGdprAppliesStatus.DOES_NOT_APPLY;
                IAlog.a("%sReading gdprApplies: %s", "ConfigDataProtectionProvider: ", Boolean.valueOf(z));
                return this.o;
            } catch (Exception unused2) {
                IAlog.a("%sError reading gdprApplies as boolean", "ConfigDataProtectionProvider: ");
            }
        }
    }

    public final Boolean o() {
        if (n() == IabTcfGdprAppliesStatus.DOES_NOT_APPLY) {
            IAlog.a("%sGDPR does not apply - returning false for GDPR Purpose1Disabled", "ConfigDataProtectionProvider: ");
            return Boolean.FALSE;
        }
        v vVar = IAConfigManager.R.u;
        if (vVar != null && vVar.b != null) {
            SharedPreferences sharedPreferences = this.l;
            if (sharedPreferences == null) {
                IAlog.a("%sApp default shared prefs is null - returning null for GDPR Purpose1Disabled", "ConfigDataProtectionProvider: ");
                return null;
            }
            try {
                String string = sharedPreferences.getString("IABTCF_PurposeConsents", null);
                if (string == null || string.isEmpty()) {
                    return null;
                }
                return Boolean.valueOf(string.charAt(0) != '1');
            } catch (Exception unused) {
                IAlog.b("%sException caught when trying to resolveIsIabGdprPurpose1Disabled from prefs", "ConfigDataProtectionProvider: ");
            }
        }
        return null;
    }

    public final void p() {
        Application application;
        if (this.k == null && (application = com.fyber.inneractive.sdk.util.o.f5960a) != null) {
            this.k = application.getSharedPreferences("IAConfigurationPreferences", 0);
        }
        SharedPreferences sharedPreferences = this.k;
        if (sharedPreferences == null) {
            IAlog.a("%sresolvePublisherApiConsentStatus shared prefs are null - returning", "ConfigDataProtectionProvider: ");
            return;
        }
        if (this.f5262a == null && sharedPreferences.contains("IAGDPRBool")) {
            this.f5262a = Boolean.valueOf(this.k.getBoolean("IAGDPRBool", false));
        }
        if (this.d == null && this.k.contains("IAGdprConsentData")) {
            this.d = this.k.getString("IAGdprConsentData", null);
        }
    }

    public final boolean a(String str, String str2) {
        if (com.fyber.inneractive.sdk.util.o.f5960a == null) {
            return false;
        }
        j();
        if (this.k == null) {
            return false;
        }
        IAlog.a("Saving %s value = %s to sharedPrefs", str, str2);
        this.k.edit().putString(str, str2).apply();
        return true;
    }

    public final void a(String str) {
        if (com.fyber.inneractive.sdk.util.o.f5960a != null) {
            j();
            if (TextUtils.isEmpty(str)) {
                this.g = str;
                SharedPreferences sharedPreferences = this.k;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().remove("keyUserID").apply();
                    return;
                }
                return;
            }
            if (str.length() > 512) {
                str = str.substring(0, 512);
            }
            SharedPreferences sharedPreferences2 = this.k;
            if (sharedPreferences2 != null) {
                this.g = str;
                sharedPreferences2.edit().putString("keyUserID", str).apply();
            }
        }
    }

    public final void a() {
        IAlog.a("Clearing GDPR Consent String and status", new Object[0]);
        if (com.fyber.inneractive.sdk.util.o.f5960a == null) {
            IAlog.f("ClearGdprConsent was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        j();
        this.f5262a = null;
        this.d = null;
        SharedPreferences sharedPreferences = this.k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IAGdprConsentData").remove("IAGDPRBool").remove("IAGdprSource").apply();
        }
    }

    public final Boolean a(Boolean bool) {
        if (this.n.a()) {
            IAlog.a("%sB.4.1: GppSID contains EU section - checking GPP Vendor 262", "ConfigDataProtectionProvider: ");
            com.fyber.inneractive.sdk.tcf.a aVar = this.n.c;
            Boolean valueOf = aVar.c ? Boolean.valueOf(aVar.f) : null;
            if (valueOf != null && valueOf.booleanValue()) {
                IAlog.a("%sB5: GDPR consent granted - GPP Vendor 262 present", "ConfigDataProtectionProvider: ");
                return Boolean.TRUE;
            }
            IAlog.a("%sB5.1: GDPR consent denied - GPP Vendor 262 not present", "ConfigDataProtectionProvider: ");
            return Boolean.FALSE;
        }
        IAlog.a("%s%s: GppSID has no EU section - returning %s", "ConfigDataProtectionProvider: ", bool == null ? "B4" : "B4.2/B4.3", bool == null ? "UNKNOWN" : "DENIED");
        return bool;
    }
}
