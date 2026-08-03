package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public final class g {
    public android.content.SharedPreferences k;
    public android.content.SharedPreferences l;
    public com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus n;
    public java.lang.Boolean o;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Boolean f3598a = null;
    public java.lang.Boolean b = null;
    public java.lang.Boolean c = null;
    public java.lang.String d = null;
    public java.lang.String e = null;
    public com.fyber.inneractive.sdk.external.InneractiveAdManager.GdprConsentSource f = null;
    public java.lang.String g = null;
    public java.lang.String h = null;
    public java.lang.Boolean i = null;
    public java.lang.Boolean j = null;
    public final com.fyber.inneractive.sdk.gpp.a m = new com.fyber.inneractive.sdk.gpp.a();
    public final java.util.concurrent.atomic.AtomicBoolean p = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean q = new java.util.concurrent.atomic.AtomicBoolean(false);

    public final boolean a(boolean z, java.lang.String str) {
        if (com.fyber.inneractive.sdk.util.o.f4302a == null) {
            return false;
        }
        i();
        android.content.SharedPreferences sharedPreferences = this.k;
        if (sharedPreferences == null) {
            return false;
        }
        sharedPreferences.edit().putBoolean(str, z).apply();
        return true;
    }

    public final void b() {
        com.fyber.inneractive.sdk.util.IAlog.a("Clearing LGPD consent status", new java.lang.Object[0]);
        if (com.fyber.inneractive.sdk.util.o.f4302a == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("clearLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new java.lang.Object[0]);
            return;
        }
        i();
        this.i = null;
        android.content.SharedPreferences sharedPreferences = this.k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IALgpdConsentStatus").apply();
        }
    }

    public final void c() {
        com.fyber.inneractive.sdk.util.IAlog.a("Clearing CCPA Consent String", new java.lang.Object[0]);
        if (com.fyber.inneractive.sdk.util.o.f4302a == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("clearUSPrivacyString was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new java.lang.Object[0]);
            return;
        }
        i();
        this.h = null;
        android.content.SharedPreferences sharedPreferences = this.k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IACCPAConsentData").apply();
        }
    }

    public final void d() {
        if (this.m.f3769a.get() != null) {
            return;
        }
        if (this.l == null) {
            android.app.Application application = com.fyber.inneractive.sdk.util.o.f4302a;
            if (application == null) {
                com.fyber.inneractive.sdk.util.IAlog.a("%sensureGppManagerInitialization - Context is null - returning", "ConfigDataProtectionProvider: ");
                return;
            }
            this.l = application.getSharedPreferences(application.getPackageName() + "_preferences", 0);
        }
        this.m.a(this.l);
    }

    public final java.lang.Boolean e() {
        d();
        o();
        if (this.b == null) {
            l();
        }
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (bool.equals(this.f3598a)) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sB1: GDPR consent granted - Publisher API override", "ConfigDataProtectionProvider: ");
            return bool;
        }
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        boolean equals = bool2.equals(this.f3598a);
        com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus m = m();
        if (m != com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus.APPLIES) {
            if (equals) {
                com.fyber.inneractive.sdk.util.IAlog.a("%sB1.1/B2: Publisher denied, gdprApplies status: %s - checking GPP (strict)", "ConfigDataProtectionProvider: ", m);
                return a(bool2);
            }
            com.fyber.inneractive.sdk.util.IAlog.a("%sB1.2/B2: Publisher API not used, gdprApplies status: %s - checking GPP (lenient)", "ConfigDataProtectionProvider: ", m);
            return a((java.lang.Boolean) null);
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%sB2.2: GDPR applies - Checking TCF VendorConsents", "ConfigDataProtectionProvider: ");
        java.lang.Boolean bool3 = this.b;
        if (bool3 == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sB3: TCF VendorConsents missing - checking GPP (strict)", "ConfigDataProtectionProvider: ");
            return a(bool2);
        }
        if (bool3.booleanValue()) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sB3.1: GDPR consent granted - TCF Vendor 262 present", "ConfigDataProtectionProvider: ");
            return bool;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%sB3.2: TCF Vendor 262 denied - checking GPP (strict)", "ConfigDataProtectionProvider: ");
        return a(bool2);
    }

    public final java.lang.Integer f() {
        android.content.SharedPreferences sharedPreferences = this.l;
        if (sharedPreferences == null) {
            return null;
        }
        try {
            int i = sharedPreferences.getInt("IABTCF_CmpSdkID", -1);
            if (i != -1) {
                return java.lang.Integer.valueOf(i);
            }
        } catch (java.lang.Exception e) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sError when trying to read IABTCF_CmpSdkID", e, "ConfigDataProtectionProvider: ");
        }
        com.fyber.inneractive.sdk.tcf.a aVar = this.m.c;
        if (aVar.c) {
            return java.lang.Integer.valueOf(aVar.d);
        }
        return null;
    }

    public final java.lang.Integer g() {
        android.content.SharedPreferences sharedPreferences = this.l;
        if (sharedPreferences == null) {
            return null;
        }
        try {
            int i = sharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
            if (i != -1) {
                return java.lang.Integer.valueOf(i);
            }
        } catch (java.lang.Exception e) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sError when trying to read IABTCF_CmpSdkVersion", e, "ConfigDataProtectionProvider: ");
        }
        com.fyber.inneractive.sdk.tcf.a aVar = this.m.c;
        if (aVar.c) {
            return java.lang.Integer.valueOf(aVar.e);
        }
        return null;
    }

    public final boolean h() {
        java.lang.Boolean bool = this.o;
        if (bool != null) {
            return bool.booleanValue();
        }
        d();
        if (this.c == null) {
            this.c = n();
        }
        com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus m = m();
        if (m == com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus.APPLIES) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sA1.2: GDPR applies - Checking Legacy TCF", "ConfigDataProtectionProvider: ");
            java.lang.Boolean bool2 = this.c;
            if (bool2 != null && !bool2.booleanValue()) {
                com.fyber.inneractive.sdk.util.IAlog.a("%sA2: TCF Purpose 1 consent granted - Purpose 1 ENABLED", "ConfigDataProtectionProvider: ");
                this.o = java.lang.Boolean.FALSE;
                return false;
            }
            java.lang.Boolean bool3 = this.c;
            com.fyber.inneractive.sdk.util.IAlog.a("%s%s: TCF Purpose 1 %s - Checking GPP", "ConfigDataProtectionProvider: ", bool3 == null ? "A2.1" : "A2.2", bool3 != null ? "denied" : "does not exist");
            com.fyber.inneractive.sdk.gpp.a aVar = this.m;
            java.lang.String str = aVar.f3769a.get() != null ? aVar.b : null;
            if (str != null && !str.isEmpty() && this.m.a()) {
                com.fyber.inneractive.sdk.util.IAlog.a("%sA3.2: GppSID contains EU section - Checking GPP PurposeConsents", "ConfigDataProtectionProvider: ");
                return j();
            }
            com.fyber.inneractive.sdk.util.IAlog.a("%sA.3.3: GppSID missing or no EU section when GDPR applies - BLOCK AD REQUESTS", "ConfigDataProtectionProvider: ");
            this.o = java.lang.Boolean.TRUE;
            return true;
        }
        boolean z = m == com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus.NOT_FOUND;
        com.fyber.inneractive.sdk.util.IAlog.a("%s%s: gdprApplies key %s, checking GPP", "ConfigDataProtectionProvider: ", z ? "A1.1" : "A1", z ? "not found" : "is false");
        com.fyber.inneractive.sdk.gpp.a aVar2 = this.m;
        java.lang.String str2 = aVar2.f3769a.get() == null ? null : aVar2.b;
        if (str2 != null && !str2.isEmpty()) {
            if (this.m.a()) {
                com.fyber.inneractive.sdk.util.IAlog.a("%sA3.2: GppSID contains EU section - Checking GPP PurposeConsents", "ConfigDataProtectionProvider: ");
                return j();
            }
            com.fyber.inneractive.sdk.util.IAlog.a("%sA3: GppSID doesn't contain EU section - Purpose 1 ENABLED", "ConfigDataProtectionProvider: ");
            this.o = java.lang.Boolean.FALSE;
            return false;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%sA3.1: GppSID %s - Purpose 1 ENABLED", "ConfigDataProtectionProvider: ", str2 != null ? "empty" : "does not exist");
        this.o = java.lang.Boolean.FALSE;
        if (!z || str2 != null) {
            return false;
        }
        if (this.k == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sSkipping reportNoCmpFoundEvent - mSharedPrefs are null", "ConfigDataProtectionProvider: ");
            return false;
        }
        if (this.m.d != null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sSkipping reportNoCmpFoundEvent - GPP string is not null", "ConfigDataProtectionProvider: ");
            return false;
        }
        if (!this.p.compareAndSet(false, true)) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sSkipping reportNoCmpFoundEvent - event already reported", "ConfigDataProtectionProvider: ");
            return false;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%sreportNoCmpFoundEvent - reporting event", "ConfigDataProtectionProvider: ");
        this.k.edit().putBoolean("no_cmp_found_event_reported", true).apply();
        new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.u.IA_IAB_NO_CMP_FOUND, (com.fyber.inneractive.sdk.external.InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null).a((java.lang.String) null);
        return false;
    }

    public final void i() {
        android.app.Application application = com.fyber.inneractive.sdk.util.o.f4302a;
        if (application != null) {
            if (this.l == null) {
                this.l = application.getSharedPreferences(application.getPackageName() + "_preferences", 0);
            }
            this.m.a(this.l);
            if (this.k == null) {
                android.content.SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigurationPreferences", 0);
                this.k = sharedPreferences;
                if (sharedPreferences == null) {
                    com.fyber.inneractive.sdk.util.IAlog.a("%sretrievePersistedValues - Shared prefs is null - returning", "ConfigDataProtectionProvider: ");
                } else {
                    this.p.set(sharedPreferences.getBoolean("no_cmp_found_event_reported", false));
                    this.q.set(this.k.getBoolean("invalid_gdpr_applies_flag_event_reported", false));
                }
                android.content.SharedPreferences sharedPreferences2 = this.k;
                if (sharedPreferences2 != null) {
                    com.fyber.inneractive.sdk.util.IAlog.a("%sInitializing privacy content info from shared prefs", "ConfigDataProtectionProvider: ");
                    this.c = n();
                    if (sharedPreferences2.contains("IAGDPRBool")) {
                        this.f3598a = java.lang.Boolean.valueOf(sharedPreferences2.getBoolean("IAGDPRBool", false));
                    }
                    this.b = l();
                    if (sharedPreferences2.contains("IAGdprConsentData")) {
                        this.d = sharedPreferences2.getString("IAGdprConsentData", null);
                    }
                    this.e = k();
                    if (sharedPreferences2.contains("IACCPAConsentData")) {
                        this.h = sharedPreferences2.getString("IACCPAConsentData", null);
                    }
                    if (sharedPreferences2.contains("IAGdprSource")) {
                        try {
                            this.f = com.fyber.inneractive.sdk.external.InneractiveAdManager.GdprConsentSource.valueOf(sharedPreferences2.getString("IAGdprSource", com.fyber.inneractive.sdk.external.InneractiveAdManager.GdprConsentSource.Internal.toString()));
                        } catch (java.lang.Exception unused) {
                            this.f = com.fyber.inneractive.sdk.external.InneractiveAdManager.GdprConsentSource.Internal;
                        }
                    }
                    if (sharedPreferences2.contains("IALgpdConsentStatus")) {
                        this.i = java.lang.Boolean.valueOf(sharedPreferences2.getBoolean("IALgpdConsentStatus", false));
                    }
                    if (sharedPreferences2.contains("keyUserID")) {
                        this.g = sharedPreferences2.getString("keyUserID", null);
                    }
                }
            }
        }
    }

    public final boolean j() {
        com.fyber.inneractive.sdk.tcf.a aVar = this.m.c;
        java.lang.Boolean valueOf = aVar.c ? java.lang.Boolean.valueOf(aVar.g) : null;
        if (valueOf == null || valueOf.booleanValue()) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sA4.1: GPP Purpose 1 %s - BLOCK AD REQUESTS", "ConfigDataProtectionProvider: ", valueOf == null ? "does not exist" : "not granted");
            this.o = java.lang.Boolean.TRUE;
            return true;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%sA4: GPP Purpose 1 consent granted - Purpose 1 ENABLED", "ConfigDataProtectionProvider: ");
        this.o = java.lang.Boolean.FALSE;
        return false;
    }

    public final java.lang.String k() {
        com.fyber.inneractive.sdk.config.o oVar;
        android.content.SharedPreferences sharedPreferences;
        if (m() == com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus.DOES_NOT_APPLY) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sGDPR does not apply - returning null for GDPR consent string", "ConfigDataProtectionProvider: ");
            return null;
        }
        com.fyber.inneractive.sdk.config.s sVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.t;
        if (sVar == null || (oVar = sVar.b) == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sGlobal config resolver is null - returning null for GDPR consent string", "ConfigDataProtectionProvider: ");
            return null;
        }
        if (oVar.a("TcfVendorId", 262, Integer.MIN_VALUE) != 0 && (sharedPreferences = this.l) != null && sharedPreferences.contains("IABTCF_TCString")) {
            try {
                return this.l.getString("IABTCF_TCString", null);
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    public final java.lang.Boolean l() {
        com.fyber.inneractive.sdk.config.o oVar;
        android.content.SharedPreferences sharedPreferences;
        boolean z = false;
        if (m() == com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus.DOES_NOT_APPLY) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sGDPR does not apply - returning null for GDPR consent status", "ConfigDataProtectionProvider: ");
            return null;
        }
        com.fyber.inneractive.sdk.config.s sVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.t;
        if (sVar != null && (oVar = sVar.b) != null) {
            int a2 = oVar.a("TcfVendorId", 262, Integer.MIN_VALUE);
            if (a2 != 0 && (sharedPreferences = this.l) != null) {
                try {
                    java.lang.String string = sharedPreferences.getString("IABTCF_VendorConsents", null);
                    if (string == null) {
                        return null;
                    }
                    int i = (a2 >= 0 ? a2 : 262) - 1;
                    if (string.length() > i && string.charAt(i) == '1') {
                        z = true;
                    }
                    return java.lang.Boolean.valueOf(z);
                } catch (java.lang.Exception unused) {
                }
            }
        }
        return null;
    }

    public final com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus m() {
        com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus iabTcfGdprAppliesStatus = this.n;
        if (iabTcfGdprAppliesStatus != null) {
            return iabTcfGdprAppliesStatus;
        }
        android.content.SharedPreferences sharedPreferences = this.l;
        if (sharedPreferences == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sError reading gdprApplies mAppDefaultSharedPrefs is null", "ConfigDataProtectionProvider: ");
            com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus iabTcfGdprAppliesStatus2 = com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus.NOT_FOUND;
            this.n = iabTcfGdprAppliesStatus2;
            return iabTcfGdprAppliesStatus2;
        }
        if (!sharedPreferences.contains(com.vungle.ads.internal.model.Cookie.IABTCF_GDPR_APPLIES)) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sReading gdprApplies: key not found", "ConfigDataProtectionProvider: ");
            com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus iabTcfGdprAppliesStatus3 = com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus.NOT_FOUND;
            this.n = iabTcfGdprAppliesStatus3;
            return iabTcfGdprAppliesStatus3;
        }
        try {
            int i = this.l.getInt(com.vungle.ads.internal.model.Cookie.IABTCF_GDPR_APPLIES, -1);
            if (i == 1 || i == 0) {
                this.n = i == 1 ? com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus.APPLIES : com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus.DOES_NOT_APPLY;
                com.fyber.inneractive.sdk.util.IAlog.a("%sReading gdprApplies: %s", "ConfigDataProtectionProvider: ", java.lang.Integer.valueOf(i));
                return this.n;
            }
            com.fyber.inneractive.sdk.util.IAlog.a("%sgdprApplies exists but its value is invalid, returning it as APPLIES", "ConfigDataProtectionProvider: ");
            this.n = com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus.APPLIES;
            java.util.Map<java.lang.String, ?> all = this.l.getAll();
            java.lang.Object obj = (all == null || !all.containsKey(com.vungle.ads.internal.model.Cookie.IABTCF_GDPR_APPLIES)) ? null : all.get(com.vungle.ads.internal.model.Cookie.IABTCF_GDPR_APPLIES);
            if (obj == null) {
                com.fyber.inneractive.sdk.util.IAlog.a("%sSkipping reportInvalidGdprAppliesFlagEvent - invalidValue is null", "ConfigDataProtectionProvider: ");
            } else if (this.k == null) {
                com.fyber.inneractive.sdk.util.IAlog.a("%sSkipping reportInvalidGdprAppliesFlagEvent - mSharedPrefs are null", "ConfigDataProtectionProvider: ");
            } else if (this.q.compareAndSet(false, true)) {
                this.k.edit().putBoolean("invalid_gdpr_applies_flag_event_reported", true).apply();
                com.fyber.inneractive.sdk.util.IAlog.a("%sreportInvalidGdprAppliesFlagEvent - reporting event for invalid value: %s", "ConfigDataProtectionProvider: ", obj);
                new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.u.INVALID_GDPR_APPLIES_FLAG, (com.fyber.inneractive.sdk.external.InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null).a("cmp_id", f(), "cmp_version", g(), "value", obj).a((java.lang.String) null);
            } else {
                com.fyber.inneractive.sdk.util.IAlog.a("%sSkipping reportInvalidGdprAppliesFlagEvent - event already reported", "ConfigDataProtectionProvider: ");
            }
            return this.n;
        } catch (java.lang.ClassCastException unused) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sError reading gdprApplies as int, trying to read it as boolean", "ConfigDataProtectionProvider: ");
            try {
                boolean z = this.l.getBoolean(com.vungle.ads.internal.model.Cookie.IABTCF_GDPR_APPLIES, true);
                this.n = z ? com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus.APPLIES : com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus.DOES_NOT_APPLY;
                com.fyber.inneractive.sdk.util.IAlog.a("%sReading gdprApplies: %s", "ConfigDataProtectionProvider: ", java.lang.Boolean.valueOf(z));
                return this.n;
            } catch (java.lang.Exception unused2) {
                com.fyber.inneractive.sdk.util.IAlog.a("%sError reading gdprApplies as boolean", "ConfigDataProtectionProvider: ");
            }
        }
    }

    public final java.lang.Boolean n() {
        if (m() == com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus.DOES_NOT_APPLY) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sGDPR does not apply - returning false for GDPR Purpose1Disabled", "ConfigDataProtectionProvider: ");
            return java.lang.Boolean.FALSE;
        }
        com.fyber.inneractive.sdk.config.s sVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.t;
        if (sVar != null && sVar.b != null) {
            android.content.SharedPreferences sharedPreferences = this.l;
            if (sharedPreferences == null) {
                com.fyber.inneractive.sdk.util.IAlog.a("%sApp default shared prefs is null - returning null for GDPR Purpose1Disabled", "ConfigDataProtectionProvider: ");
                return null;
            }
            try {
                java.lang.String string = sharedPreferences.getString("IABTCF_PurposeConsents", null);
                if (string == null || string.isEmpty()) {
                    return null;
                }
                return java.lang.Boolean.valueOf(string.charAt(0) != '1');
            } catch (java.lang.Exception unused) {
                com.fyber.inneractive.sdk.util.IAlog.b("%sException caught when trying to resolveIsIabGdprPurpose1Disabled from prefs", "ConfigDataProtectionProvider: ");
            }
        }
        return null;
    }

    public final void o() {
        android.content.SharedPreferences sharedPreferences = this.k;
        if (sharedPreferences == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sresolvePublisherApiConsentStatus shared prefs are null - returning", "ConfigDataProtectionProvider: ");
            return;
        }
        if (this.f3598a == null && sharedPreferences.contains("IAGDPRBool")) {
            this.f3598a = java.lang.Boolean.valueOf(this.k.getBoolean("IAGDPRBool", false));
        }
        if (this.d == null && this.k.contains("IAGdprConsentData")) {
            this.d = this.k.getString("IAGdprConsentData", null);
        }
    }

    public final boolean a(java.lang.String str, java.lang.String str2) {
        if (com.fyber.inneractive.sdk.util.o.f4302a == null) {
            return false;
        }
        i();
        if (this.k == null) {
            return false;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("Saving %s value = %s to sharedPrefs", str, str2);
        this.k.edit().putString(str, str2).apply();
        return true;
    }

    public final void a(java.lang.String str) {
        if (com.fyber.inneractive.sdk.util.o.f4302a != null) {
            i();
            if (android.text.TextUtils.isEmpty(str)) {
                this.g = str;
                android.content.SharedPreferences sharedPreferences = this.k;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().remove("keyUserID").apply();
                    return;
                }
                return;
            }
            if (str.length() > 512) {
                str = str.substring(0, 512);
            }
            android.content.SharedPreferences sharedPreferences2 = this.k;
            if (sharedPreferences2 != null) {
                this.g = str;
                sharedPreferences2.edit().putString("keyUserID", str).apply();
            }
        }
    }

    public final void a() {
        com.fyber.inneractive.sdk.util.IAlog.a("Clearing GDPR Consent String and status", new java.lang.Object[0]);
        if (com.fyber.inneractive.sdk.util.o.f4302a == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("ClearGdprConsent was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new java.lang.Object[0]);
            return;
        }
        i();
        this.f3598a = null;
        this.d = null;
        android.content.SharedPreferences sharedPreferences = this.k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IAGdprConsentData").remove("IAGDPRBool").remove("IAGdprSource").apply();
        }
    }

    public final java.lang.Boolean a(java.lang.Boolean bool) {
        if (this.m.a()) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sB.4.1: GppSID contains EU section - checking GPP Vendor 262", "ConfigDataProtectionProvider: ");
            com.fyber.inneractive.sdk.tcf.a aVar = this.m.c;
            java.lang.Boolean valueOf = aVar.c ? java.lang.Boolean.valueOf(aVar.f) : null;
            if (valueOf != null && valueOf.booleanValue()) {
                com.fyber.inneractive.sdk.util.IAlog.a("%sB5: GDPR consent granted - GPP Vendor 262 present", "ConfigDataProtectionProvider: ");
                return java.lang.Boolean.TRUE;
            }
            com.fyber.inneractive.sdk.util.IAlog.a("%sB5.1: GDPR consent denied - GPP Vendor 262 not present", "ConfigDataProtectionProvider: ");
            return java.lang.Boolean.FALSE;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%s%s: GppSID has no EU section - returning %s", "ConfigDataProtectionProvider: ", bool == null ? "B4" : "B4.2/B4.3", bool == null ? "UNKNOWN" : "DENIED");
        return bool;
    }
}
