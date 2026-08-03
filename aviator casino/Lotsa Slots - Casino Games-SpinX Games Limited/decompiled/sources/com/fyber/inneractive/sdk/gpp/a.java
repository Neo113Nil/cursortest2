package com.fyber.inneractive.sdk.gpp;

/* loaded from: classes3.dex */
public final class a {
    public java.lang.String b;
    public java.lang.String d;
    public java.lang.Boolean e;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f3769a = new java.util.concurrent.atomic.AtomicReference();
    public final com.fyber.inneractive.sdk.tcf.a c = new com.fyber.inneractive.sdk.tcf.a();

    public final void a(android.content.SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s defaultSharedPreferences is null, not initializing GppManager", "GppManager");
            return;
        }
        if (this.f3769a.get() == null) {
            this.f3769a.set(sharedPreferences);
            java.lang.String str = null;
            if (this.f3769a.get() != null) {
                try {
                    this.d = ((android.content.SharedPreferences) this.f3769a.get()).getString("IABGPP_HDR_GppString", null);
                } catch (java.lang.Throwable th) {
                    com.fyber.inneractive.sdk.util.IAlog.a("%s Error on getGppString", th, "GppManager");
                }
            }
            if (this.f3769a.get() != null) {
                try {
                    this.b = ((android.content.SharedPreferences) this.f3769a.get()).getString("IABGPP_GppSID", null);
                } catch (java.lang.Throwable th2) {
                    com.fyber.inneractive.sdk.util.IAlog.a("%s Error on computeAvailableSections", th2, "GppManager");
                }
            }
            if (this.f3769a.get() != null) {
                try {
                    str = ((android.content.SharedPreferences) this.f3769a.get()).getString("IABGPP_2_String", null);
                } catch (java.lang.Throwable th3) {
                    com.fyber.inneractive.sdk.util.IAlog.a("%s Error on getSectionGppString", th3, "GppManager");
                }
            }
            if (str == null) {
                com.fyber.inneractive.sdk.util.IAlog.a("%s decodeTcf - gppTcfString is null, not decoding TCF", "GppManager");
                return;
            }
            com.fyber.inneractive.sdk.tcf.a aVar = this.c;
            aVar.b = str;
            java.lang.String[] split = str.split("\\.");
            if (split.length == 0 || !com.fyber.inneractive.sdk.util.v.a(split[0])) {
                com.fyber.inneractive.sdk.util.IAlog.a("%s empty string", "GppTcf");
                return;
            }
            try {
                aVar.f4266a.a(split[0]);
                aVar.a();
                aVar.c = true;
                com.fyber.inneractive.sdk.util.IAlog.a(" %s parsed object: %s", "GppTcf", aVar.toString());
            } catch (java.lang.Exception e) {
                com.fyber.inneractive.sdk.util.IAlog.a("%s invalid string: %s", e, "GppTcf", aVar.b);
            }
        }
    }

    public final boolean a() {
        java.lang.Boolean bool = this.e;
        if (bool != null) {
            return bool.booleanValue();
        }
        java.lang.String str = this.b;
        if (str != null && !str.isEmpty()) {
            for (java.lang.String str2 : this.b.split("_")) {
                try {
                } catch (java.lang.NumberFormatException e) {
                    com.fyber.inneractive.sdk.util.IAlog.a("%s Error parsing section ID: %s", e, "GppManager", str2);
                }
                if (java.lang.Integer.parseInt(str2.trim()) == 2) {
                    this.e = java.lang.Boolean.TRUE;
                    return true;
                }
                continue;
            }
            this.e = java.lang.Boolean.FALSE;
            return false;
        }
        this.e = java.lang.Boolean.FALSE;
        return false;
    }
}
