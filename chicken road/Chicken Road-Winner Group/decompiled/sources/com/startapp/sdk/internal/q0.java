package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4234a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final sf f4235b;

    /* renamed from: c, reason: collision with root package name */
    public volatile String f4236c;

    /* renamed from: d, reason: collision with root package name */
    public volatile String f4237d;

    public q0(sf sfVar) {
        this.f4235b = sfVar;
    }

    public final boolean a(String str, String str2) {
        boolean z3;
        if (str != null) {
            str = str.trim();
            if (str.isEmpty()) {
                str = null;
            }
        }
        if (str2 != null) {
            str2 = str2.trim();
            if (str2.isEmpty()) {
                str2 = null;
            }
        }
        synchronized (this.f4234a) {
            try {
                if (si.a((Object) this.f4236c, (Object) str) && si.a((Object) this.f4237d, (Object) str2)) {
                    z3 = false;
                    this.f4236c = str;
                    this.f4237d = str2;
                    rf edit = this.f4235b.edit();
                    edit.a("c88d4eab540fab77", str);
                    edit.f4299a.putString("c88d4eab540fab77", str);
                    edit.a("2696a7f502faed4b", str2);
                    edit.f4299a.putString("2696a7f502faed4b", str2);
                    edit.f4299a.commit();
                }
                z3 = true;
                this.f4236c = str;
                this.f4237d = str2;
                rf edit2 = this.f4235b.edit();
                edit2.a("c88d4eab540fab77", str);
                edit2.f4299a.putString("c88d4eab540fab77", str);
                edit2.a("2696a7f502faed4b", str2);
                edit2.f4299a.putString("2696a7f502faed4b", str2);
                edit2.f4299a.commit();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    public final String a() {
        String str;
        String str2 = this.f4237d;
        if (str2 != null) {
            return str2;
        }
        synchronized (this.f4234a) {
            try {
                str = this.f4237d;
                if (str == null && (str = this.f4235b.getString("2696a7f502faed4b", null)) == null) {
                    str = this.f4235b.getString("31721150b470a3b9", null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
