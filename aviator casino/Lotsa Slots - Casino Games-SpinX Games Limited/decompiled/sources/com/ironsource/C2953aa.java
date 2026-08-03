package com.ironsource;

/* renamed from: com.ironsource.aa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2953aa {
    public static final java.lang.String m = "age";
    public static final java.lang.String n = "gen";
    public static final java.lang.String o = "lvl";
    public static final java.lang.String p = "pay";
    public static final java.lang.String q = "iapt";
    public static final java.lang.String r = "ucd";
    private static final java.lang.String s = "segName";

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f6138a;
    private java.lang.String g;
    private int b = 999999;
    private double c = 999999.99d;
    private final java.lang.String d = "custom";
    private final int e = 5;
    private int f = -1;
    private int h = -1;
    private java.util.concurrent.atomic.AtomicBoolean i = null;
    private double j = -1.0d;
    private long k = 0;
    private java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> l = new java.util.ArrayList<>();

    @java.lang.Deprecated
    public int a() {
        return this.f;
    }

    @java.lang.Deprecated
    public java.lang.String b() {
        return this.g;
    }

    public double c() {
        return this.j;
    }

    public java.util.concurrent.atomic.AtomicBoolean d() {
        return this.i;
    }

    public int e() {
        return this.h;
    }

    public java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> f() {
        java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> arrayList = new java.util.ArrayList<>();
        if (this.f != -1) {
            arrayList.add(new android.util.Pair<>("age", this.f + ""));
        }
        if (!android.text.TextUtils.isEmpty(this.g)) {
            arrayList.add(new android.util.Pair<>(n, this.g));
        }
        if (this.h != -1) {
            arrayList.add(new android.util.Pair<>("lvl", this.h + ""));
        }
        if (this.i != null) {
            arrayList.add(new android.util.Pair<>("pay", this.i + ""));
        }
        if (this.j != -1.0d) {
            arrayList.add(new android.util.Pair<>("iapt", this.j + ""));
        }
        if (this.k != 0) {
            arrayList.add(new android.util.Pair<>("ucd", this.k + ""));
        }
        if (!android.text.TextUtils.isEmpty(this.f6138a)) {
            arrayList.add(new android.util.Pair<>("segName", this.f6138a));
        }
        arrayList.addAll(this.l);
        return arrayList;
    }

    public java.lang.String g() {
        return this.f6138a;
    }

    public long h() {
        return this.k;
    }

    public org.json.JSONObject i() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.util.Iterator<android.util.Pair<java.lang.String, java.lang.String>> it = f().iterator();
        while (it.hasNext()) {
            android.util.Pair<java.lang.String, java.lang.String> next = it.next();
            try {
                jSONObject.put((java.lang.String) next.first, next.second);
            } catch (org.json.JSONException e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("exception " + e.getMessage());
            }
        }
        return jSONObject;
    }

    private boolean b(java.lang.String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    public void a(int i) {
        if (i > 0 && i < this.b) {
            this.h = i;
            return;
        }
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "setLevel( " + i + " ) level must be between 1-" + this.b, 2);
    }

    public void a(boolean z) {
        if (this.i == null) {
            this.i = new java.util.concurrent.atomic.AtomicBoolean();
        }
        this.i.set(z);
    }

    public void a(double d) {
        if (d > 0.0d && d < this.c) {
            this.j = java.lang.Math.floor(d * 100.0d) / 100.0d;
            return;
        }
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "setIAPTotal( " + d + " ) iapt must be between 0-" + this.c, 2);
    }

    public void a(long j) {
        if (j > 0) {
            this.k = j;
            return;
        }
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "setUserCreationDate( " + j + " ) is an invalid timestamp", 2);
    }

    public void a(java.lang.String str) {
        if (b(str) && a(str, 1, 32)) {
            this.f6138a = str;
            return;
        }
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "setSegmentName( " + str + " ) segment name must be alphanumeric and 1-32 in length", 2);
    }

    public void a(java.lang.String str, java.lang.String str2) {
        try {
            if (b(str) && b(str2) && a(str, 1, 32) && a(str2, 1, 32)) {
                java.lang.String str3 = "custom_" + str;
                if (this.l.size() >= 5) {
                    this.l.remove(0);
                }
                this.l.add(new android.util.Pair<>(str3, str2));
                return;
            }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "setCustom( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length", 2);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private boolean a(java.lang.String str, int i, int i2) {
        return str != null && str.length() >= i && str.length() <= i2;
    }
}
