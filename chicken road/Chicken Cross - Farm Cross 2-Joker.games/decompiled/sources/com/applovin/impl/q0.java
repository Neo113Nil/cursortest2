package com.applovin.impl;

import android.content.Context;

/* loaded from: classes5.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f4384a = new a("Age Restricted User", e5.r);
    private static final a b = new a("Has User Consent", e5.q);
    private static final a c = new a("\"Do Not Sell\"", e5.s);

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f4385a;
        private final e5 b;

        a(String str, e5 e5Var) {
            this.f4385a = str;
            this.b = e5Var;
        }

        public Boolean b(Context context) {
            if (context != null) {
                return (Boolean) f5.a(this.b, (Object) null, context);
            }
            com.applovin.impl.sdk.p.h("AppLovinSdk", "Failed to get value for key: " + this.b);
            return null;
        }

        public String a() {
            return this.f4385a;
        }

        public String a(Context context) {
            Boolean b = b(context);
            return b != null ? b.toString() : "No value set";
        }
    }

    public static a a() {
        return c;
    }

    public static a b() {
        return b;
    }

    public static a c() {
        return f4384a;
    }

    public static boolean a(boolean z, Context context) {
        return a(e5.s, Boolean.valueOf(z), context);
    }

    public static boolean b(boolean z, Context context) {
        return a(e5.q, Boolean.valueOf(z), context);
    }

    public static String a(Context context) {
        return a(b, context) + a(c, context);
    }

    private static boolean a(e5 e5Var, Boolean bool, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.p.h("AppLovinSdk", "Failed to update compliance value for key: " + e5Var);
            return false;
        }
        try {
            Boolean bool2 = (Boolean) f5.a(e5Var, (Object) null, context);
            f5.b(e5Var, bool, context);
            return bool2 == null || bool2 != bool;
        } catch (Throwable th) {
            com.applovin.impl.sdk.p.c("ComplianceManager", "Unable to update compliance", th);
            com.applovin.impl.sdk.l lVar = com.applovin.impl.sdk.l.E0;
            if (lVar != null) {
                lVar.E().a("ComplianceManager", "updateCompliance", th);
            }
            return false;
        }
    }

    private static String a(a aVar, Context context) {
        return "\n" + aVar.f4385a + " - " + aVar.a(context);
    }
}
