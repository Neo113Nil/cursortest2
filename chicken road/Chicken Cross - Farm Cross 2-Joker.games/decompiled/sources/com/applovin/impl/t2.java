package com.applovin.impl;

/* loaded from: classes5.dex */
public class t2 {

    /* renamed from: a, reason: collision with root package name */
    private String f4509a;
    private String b;
    private int c;
    private int d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f4510a;
        private String b;
        private int c;
        private int d;

        a() {
        }

        public t2 a() {
            return new t2(this.f4510a, this.b, this.c, this.d);
        }

        public a b(int i) {
            this.c = i;
            return this;
        }

        public String toString() {
            return "LicenseVerificationObject.LicenseVerificationObjectBuilder(signedData=" + this.f4510a + ", signature=" + this.b + ", responseCode=" + this.c + ", nonce=" + this.d + ")";
        }

        public a a(int i) {
            this.d = i;
            return this;
        }

        public a b(String str) {
            this.f4510a = str;
            return this;
        }

        public a a(String str) {
            this.b = str;
            return this;
        }
    }

    t2(String str, String str2, int i, int i2) {
        this.f4509a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    protected boolean a(Object obj) {
        return obj instanceof t2;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.c;
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.f4509a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj;
        if (!t2Var.a(this) || c() != t2Var.c() || b() != t2Var.b()) {
            return false;
        }
        String e = e();
        String e2 = t2Var.e();
        if (e != null ? !e.equals(e2) : e2 != null) {
            return false;
        }
        String d = d();
        String d2 = t2Var.d();
        return d != null ? d.equals(d2) : d2 == null;
    }

    public int hashCode() {
        int c = ((c() + 59) * 59) + b();
        String e = e();
        int hashCode = (c * 59) + (e == null ? 43 : e.hashCode());
        String d = d();
        return (hashCode * 59) + (d != null ? d.hashCode() : 43);
    }

    public String toString() {
        return "LicenseVerificationObject(signedData=" + e() + ", signature=" + d() + ", responseCode=" + c() + ", nonce=" + b() + ")";
    }

    public static a a() {
        return new a();
    }
}
