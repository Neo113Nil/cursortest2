package com.applovin.impl;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.InterfaceC4394ee;

/* loaded from: classes5.dex */
public class f7 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f4203a;
    private final SharedPreferences b;
    private Integer c;
    private Integer d;
    private Integer e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;

    public f7(com.applovin.impl.sdk.l lVar) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.l.p());
        this.b = defaultSharedPreferences;
        this.f4203a = lVar;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.c = a(e5.u.a());
        this.d = a(e5.v.a());
        this.e = h();
        this.f = (String) f5.a(e5.x, (Object) null, defaultSharedPreferences, false);
        this.g = (String) f5.a(e5.y, (Object) null, defaultSharedPreferences, false);
        this.h = (String) f5.a(e5.z, (Object) null, defaultSharedPreferences, false);
        this.i = (String) f5.a(e5.B, (Object) null, defaultSharedPreferences, false);
        this.j = (String) f5.a(e5.D, (Object) null, defaultSharedPreferences, false);
        b(this.g);
    }

    private Integer h() {
        String a2 = e5.w.a();
        if (this.b.contains(a2)) {
            Integer num = (Integer) f5.a(a2, null, Integer.class, this.b, false);
            if (num != null) {
                if (num.intValue() == 1 || num.intValue() == 0) {
                    return num;
                }
                this.f4203a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f4203a.Q().b("TcfManager", "Integer value (" + num + ") for " + a2 + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Long l = (Long) f5.a(a2, null, Long.class, this.b, false);
            if (l != null) {
                if (l.longValue() == 1 || l.longValue() == 0) {
                    return Integer.valueOf(l.intValue());
                }
                this.f4203a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f4203a.Q().b("TcfManager", "Long value (" + l + ") for " + a2 + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Boolean bool = (Boolean) f5.a(a2, null, Boolean.class, this.b, false);
            if (bool != null) {
                return Integer.valueOf(bool.booleanValue() ? 1 : 0);
            }
            String str = (String) f5.a(a2, null, String.class, this.b, false);
            if (str != null) {
                if ("1".equals(str) || "true".equals(str)) {
                    return 1;
                }
                if ("0".equals(str) || "false".equals(str)) {
                    return 0;
                }
                this.f4203a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f4203a.Q().b("TcfManager", "String value (" + str + ") for " + a2 + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
        }
        return null;
    }

    public Boolean a(int i) {
        return i7.a(i, this.g);
    }

    public boolean b() {
        return i7.a(this.g);
    }

    public String c() {
        return this.g;
    }

    public String d() {
        return d7.a(this.c);
    }

    public Integer e() {
        return this.c;
    }

    public Integer f() {
        return this.d;
    }

    public Integer g() {
        return this.e;
    }

    public String i() {
        return a("CMP Name", d()) + a("CMP SDK ID", this.c) + a("CMP SDK Version", this.d) + a(e5.w.a(), this.e) + a(e5.x.a(), this.f) + a(e5.y.a(), this.g);
    }

    public String j() {
        return this.f;
    }

    public String k() {
        return this.h;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str == null) {
            this.f4203a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f4203a.Q().a("TcfManager", "SharedPreferences are cleared - setting all stored TC data to null");
            }
            a();
            return;
        }
        if (str.equals(e5.u.a())) {
            this.c = a(str);
            this.f4203a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f4203a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.c);
            }
            this.f4203a.S0();
            return;
        }
        if (str.equals(e5.v.a())) {
            this.d = a(str);
            this.f4203a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f4203a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.d);
                return;
            }
            return;
        }
        if (str.equals(e5.w.a())) {
            this.e = h();
            this.f4203a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f4203a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.e);
                return;
            }
            return;
        }
        if (str.equals(e5.x.a())) {
            this.f = (String) f5.a(str, (Object) null, String.class, sharedPreferences);
            this.f4203a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f4203a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f);
            }
            this.f4203a.S0();
            return;
        }
        if (str.equals(e5.y.a())) {
            this.g = (String) f5.a(str, (Object) null, String.class, sharedPreferences);
            this.f4203a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f4203a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.g);
            }
            b(this.g);
            return;
        }
        if (str.equals(e5.z.a())) {
            this.h = (String) f5.a(str, (Object) null, String.class, sharedPreferences);
            this.f4203a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f4203a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.h);
                return;
            }
            return;
        }
        if (str.equals(e5.A.a())) {
            String str2 = (String) f5.a(str, (Object) null, String.class, sharedPreferences);
            this.f4203a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f4203a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str2);
                return;
            }
            return;
        }
        if (str.equals(e5.B.a())) {
            this.i = (String) f5.a(str, (Object) null, String.class, sharedPreferences);
            this.f4203a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f4203a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.i);
                return;
            }
            return;
        }
        if (str.equals(e5.C.a())) {
            String str3 = (String) f5.a(str, (Object) null, String.class, sharedPreferences);
            this.f4203a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f4203a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str3);
                return;
            }
            return;
        }
        if (str.equals(e5.D.a())) {
            this.j = (String) f5.a(str, (Object) null, String.class, sharedPreferences);
            this.f4203a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f4203a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.j);
                return;
            }
            return;
        }
        if (str.contains("IABTCF_PublisherRestrictions")) {
            String str4 = (String) f5.a(str, (Object) null, String.class, sharedPreferences);
            this.f4203a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f4203a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str4);
            }
        }
    }

    private Integer a(String str) {
        if (this.b.contains(str)) {
            Integer num = (Integer) f5.a(str, null, Integer.class, this.b, false);
            if (num != null) {
                return num;
            }
            Long l = (Long) f5.a(str, null, Long.class, this.b, false);
            if (l != null && l.longValue() >= -2147483648L && l.longValue() <= 2147483647L) {
                return Integer.valueOf(l.intValue());
            }
            String str2 = (String) f5.a(str, null, String.class, this.b, false);
            if (str2 != null) {
                if (StringUtils.isNumeric(str2)) {
                    return Integer.valueOf(Integer.parseInt(str2));
                }
                this.f4203a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f4203a.Q().b("TcfManager", "String value (" + str2 + ") for " + str + " is not numeric - storing value as null");
                }
            }
        }
        return null;
    }

    public Boolean b(int i) {
        String str = this.i;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(i7.a(str, i - 1));
    }

    public Boolean c(int i) {
        String str = this.j;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(i7.a(str, i - 1));
    }

    public Boolean d(int i) {
        String str = this.h;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(i7.a(str, i - 1));
    }

    private void b(String str) {
        this.f4203a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f4203a.Q().a("TcfManager", "Attempting to update consent from Additional Consent string: " + str);
        }
        Boolean a2 = i7.a(InterfaceC4394ee.c.e, str);
        if (a2 != null) {
            if (a2.booleanValue()) {
                this.f4203a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f4203a.Q().a("TcfManager", "Found AppLovin ID in the list of consented ATP IDs - setting user consent to true");
                }
                q0.b(true, com.applovin.impl.sdk.l.p());
            } else {
                this.f4203a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f4203a.Q().a("TcfManager", "Could not find AppLovin ID in the list of consented ATP IDs - setting user consent to false");
                }
                q0.b(false, com.applovin.impl.sdk.l.p());
            }
            this.f4203a.S0();
            return;
        }
        this.f4203a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f4203a.Q().a("TcfManager", "AC string is not valid or AppLovin was not listed on the CMP flow - no consent update");
        }
    }

    private void a() {
        this.c = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    private String a(String str, Object obj) {
        return "\n" + str + " - " + (obj != null ? obj.toString() : "No value set");
    }
}
