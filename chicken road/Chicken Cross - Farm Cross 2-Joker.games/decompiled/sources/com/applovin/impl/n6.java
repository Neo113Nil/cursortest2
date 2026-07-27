package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class n6 extends n5 {
    private final AppLovinAdLoadListener g;
    private final a h;

    private static final class a extends y7 {
        a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.l lVar) {
            super(jSONObject, jSONObject2, lVar);
        }

        void a(t8 t8Var) {
            if (t8Var == null) {
                throw new IllegalArgumentException("No aggregated vast response specified");
            }
            this.b.add(t8Var);
        }
    }

    private static final class b extends n6 {
        private final String i;

        b(String str, y7 y7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
            super(y7Var, appLovinAdLoadListener, lVar);
            this.i = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            t8 b = b(this.i);
            if (b != null) {
                a(b);
                return;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Unable to process XML: " + this.i);
            }
            c(this.i);
            a(z7.XML_PARSING);
        }
    }

    private static final class c extends n6 {
        private final JSONObject i;

        c(y7 y7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
            super(y7Var, appLovinAdLoadListener, lVar);
            this.i = y7Var.b();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.i, "xml", null);
            if (!StringUtils.isValidString(string)) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.b(this.b, "No VAST response received.");
                }
                a(z7.NO_WRAPPER_RESPONSE);
            } else {
                if (string.length() >= ((Integer) this.f4351a.a(c5.Z4)).intValue()) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.c.b(this.b, "VAST response is over max length");
                    }
                    a(z7.XML_PARSING);
                    return;
                }
                t8 b = b(string);
                if (b != null) {
                    a(b);
                    return;
                }
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.b(this.b, "Unable to process XML: " + string);
                }
                c(string);
                a(z7.XML_PARSING);
            }
        }
    }

    private static final class d extends n6 {
        private final t8 i;

        d(t8 t8Var, y7 y7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
            super(y7Var, appLovinAdLoadListener, lVar);
            if (t8Var == null) {
                throw new IllegalArgumentException("No response specified.");
            }
            if (y7Var == null) {
                throw new IllegalArgumentException("No context specified.");
            }
            if (appLovinAdLoadListener == null) {
                throw new IllegalArgumentException("No callback specified.");
            }
            this.i = t8Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Processing VAST Wrapper response...");
            }
            a(this.i);
        }
    }

    n6(y7 y7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super("TaskProcessVastResponse", lVar);
        if (y7Var == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        this.g = appLovinAdLoadListener;
        this.h = (a) y7Var;
    }

    public static n6 a(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        return new c(new a(jSONObject, jSONObject2, lVar), appLovinAdLoadListener, lVar);
    }

    protected t8 b(String str) {
        try {
            return u8.a(str, this.f4351a);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Failed to process VAST response", th);
            }
            a(z7.XML_PARSING);
            this.f4351a.E().a(this.b, th);
            return null;
        }
    }

    protected void c(String str) {
        if (str == null) {
            return;
        }
        Iterator<String> it = StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f4351a.a(c5.s5)), 1).iterator();
        while (it.hasNext()) {
            t8 b2 = b("<VAST>" + it.next() + "</VAST>");
            if (b2 != null) {
                this.h.a(b2);
            }
        }
    }

    public static n6 a(String str, JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        return new b(str, new a(jSONObject, jSONObject2, lVar), appLovinAdLoadListener, lVar);
    }

    public static n6 a(t8 t8Var, y7 y7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        return new d(t8Var, y7Var, appLovinAdLoadListener, lVar);
    }

    void a(t8 t8Var) {
        int d2 = this.h.d();
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Finished parsing XML at depth " + d2);
        }
        this.h.a(t8Var);
        if (g8.b(t8Var)) {
            int intValue = ((Integer) this.f4351a.a(c5.a5)).intValue();
            if (d2 < intValue) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.a(this.b, "VAST response is wrapper. Resolving...");
                }
                this.f4351a.s0().a(new v6(this.h, this.g, this.f4351a));
                return;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Reached beyond max wrapper depth of " + intValue);
            }
            a(z7.WRAPPER_LIMIT_REACHED);
            return;
        }
        if (g8.a(t8Var)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "VAST response is inline. Rendering ad...");
            }
            this.f4351a.s0().a(new q6(this.h, this.g, this.f4351a));
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.c.b(this.b, "VAST response is an error");
        }
        a(z7.NO_WRAPPER_RESPONSE);
    }

    void a(z7 z7Var) {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.b(this.b, "Failed to process VAST response due to VAST error code " + z7Var);
        }
        g8.a(this.h, this.g, z7Var, -6, this.f4351a);
    }
}
