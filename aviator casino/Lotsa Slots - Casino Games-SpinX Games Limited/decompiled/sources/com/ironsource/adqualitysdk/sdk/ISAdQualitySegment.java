package com.ironsource.adqualitysdk.sdk;

/* loaded from: classes5.dex */
public class ISAdQualitySegment {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private final java.util.Map<java.lang.String, java.lang.String> f76;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private double f77;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private final long f78;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final int f79;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final java.util.concurrent.atomic.AtomicBoolean f80;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final java.lang.String f81;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final int f82;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final java.lang.String f83;

    /* synthetic */ ISAdQualitySegment(java.lang.String str, int i, java.lang.String str2, int i2, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, double d, long j, java.util.Map map, byte b) {
        this(str, i, str2, i2, atomicBoolean, d, j, map);
    }

    private ISAdQualitySegment(java.lang.String str, int i, java.lang.String str2, int i2, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, double d, long j, java.util.Map<java.lang.String, java.lang.String> map) {
        this.f81 = str;
        this.f79 = i;
        this.f83 = str2;
        this.f82 = i2;
        this.f80 = atomicBoolean;
        this.f77 = d;
        this.f78 = j;
        this.f76 = map;
    }

    public java.lang.String getName() {
        return this.f81;
    }

    public int getAge() {
        return this.f79;
    }

    public java.lang.String getGender() {
        return this.f83;
    }

    public int getLevel() {
        return this.f82;
    }

    public java.util.concurrent.atomic.AtomicBoolean getIsPaying() {
        return this.f80;
    }

    public double getInAppPurchasesTotal() {
        return this.f77;
    }

    public long getUserCreationDate() {
        return this.f78;
    }

    public java.util.Map<java.lang.String, java.lang.String> getCustomData() {
        return this.f76;
    }

    public static class Builder {

        /* renamed from: ﾇ, reason: contains not printable characters */
        private java.lang.String f91;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private java.lang.String f92;

        /* renamed from: ｋ, reason: contains not printable characters */
        private double f90 = 999999.99d;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private int f88 = -1;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private int f89 = -1;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private java.util.concurrent.atomic.AtomicBoolean f87 = null;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private long f86 = 0;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private double f85 = -1.0d;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private java.util.Map<java.lang.String, java.lang.String> f84 = new java.util.HashMap();

        public com.ironsource.adqualitysdk.sdk.ISAdQualitySegment.Builder setSegmentName(java.lang.String str) {
            if (android.text.TextUtils.isEmpty(str)) {
                return this;
            }
            if (com.ironsource.adqualitysdk.sdk.i.kn.m8468(str) && com.ironsource.adqualitysdk.sdk.i.kn.m8474(str, 32)) {
                this.f92 = str;
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("setSegmentName( ");
                sb.append(str);
                sb.append(" ) segment name must be alphanumeric and 1-32 in length");
                com.ironsource.adqualitysdk.sdk.i.m.m8520("ISAdQualitySegment Builder", sb.toString());
            }
            return this;
        }

        public com.ironsource.adqualitysdk.sdk.ISAdQualitySegment.Builder setAge(int i) {
            if (i == 0) {
                return this;
            }
            if (i > 0 && i <= 199) {
                this.f88 = i;
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("setAge( ");
                sb.append(i);
                sb.append(" ) age must be between 1-199");
                com.ironsource.adqualitysdk.sdk.i.m.m8520("ISAdQualitySegment Builder", sb.toString());
            }
            return this;
        }

        public com.ironsource.adqualitysdk.sdk.ISAdQualitySegment.Builder setGender(java.lang.String str) {
            if (android.text.TextUtils.isEmpty(str)) {
                return this;
            }
            if (str.toLowerCase(java.util.Locale.ENGLISH).equals(com.ironsource.mediationsdk.utils.IronSourceConstants.a.b) || str.toLowerCase(java.util.Locale.ENGLISH).equals(com.ironsource.mediationsdk.utils.IronSourceConstants.a.c)) {
                this.f91 = str.toLowerCase(java.util.Locale.ENGLISH);
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("setGender( ");
                sb.append(str);
                sb.append(" ) is invalid");
                com.ironsource.adqualitysdk.sdk.i.m.m8520("ISAdQualitySegment Builder", sb.toString());
            }
            return this;
        }

        public com.ironsource.adqualitysdk.sdk.ISAdQualitySegment.Builder setLevel(int i) {
            if (i == 0) {
                return this;
            }
            if (i > 0 && i < 999999) {
                this.f89 = i;
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("setLevel( ");
                sb.append(i);
                sb.append(" ) level must be between 1-999999");
                com.ironsource.adqualitysdk.sdk.i.m.m8520("ISAdQualitySegment Builder", sb.toString());
            }
            return this;
        }

        public com.ironsource.adqualitysdk.sdk.ISAdQualitySegment.Builder setIsPaying(boolean z) {
            if (this.f87 == null) {
                this.f87 = new java.util.concurrent.atomic.AtomicBoolean();
            }
            this.f87.set(z);
            return this;
        }

        public com.ironsource.adqualitysdk.sdk.ISAdQualitySegment.Builder setInAppPurchasesTotal(double d) {
            if (d >= 0.0d && d < this.f90) {
                this.f85 = java.lang.Math.floor(d * 100.0d) / 100.0d;
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("setIAPTotal( ");
                sb.append(d);
                sb.append(" ) iapt must be between 0-");
                sb.append(this.f90);
                com.ironsource.adqualitysdk.sdk.i.m.m8520("ISAdQualitySegment Builder", sb.toString());
            }
            return this;
        }

        public com.ironsource.adqualitysdk.sdk.ISAdQualitySegment.Builder setUserCreationDate(long j) {
            if (j == 0) {
                return this;
            }
            if (j > 0) {
                this.f86 = j;
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("setUserCreationDate( ");
                sb.append(j);
                sb.append(" ) is an invalid timestamp");
                com.ironsource.adqualitysdk.sdk.i.m.m8520("ISAdQualitySegment Builder", sb.toString());
            }
            return this;
        }

        public com.ironsource.adqualitysdk.sdk.ISAdQualitySegment.Builder setCustomData(java.lang.String str, java.lang.String str2) {
            if (android.text.TextUtils.isEmpty(str2)) {
                return this;
            }
            try {
                if (this.f84.size() < 5) {
                    if (com.ironsource.adqualitysdk.sdk.i.kn.m8468(str) && com.ironsource.adqualitysdk.sdk.i.kn.m8468(str2) && com.ironsource.adqualitysdk.sdk.i.kn.m8474(str, 32) && com.ironsource.adqualitysdk.sdk.i.kn.m8474(str2, 32)) {
                        this.f84.put("sgct_".concat(java.lang.String.valueOf(str)), str2);
                    } else {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("setCustomData( ");
                        sb.append(str);
                        sb.append(" , ");
                        sb.append(str2);
                        sb.append(" ) key and value must be alphanumeric and 1-32 in length");
                        com.ironsource.adqualitysdk.sdk.i.m.m8520("ISAdQualitySegment Builder", sb.toString());
                    }
                } else {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("setCustomData( ");
                    sb2.append(str);
                    sb2.append(" , ");
                    sb2.append(str2);
                    sb2.append(" ) limited to 5 custom values. Ignoring custom value.");
                    com.ironsource.adqualitysdk.sdk.i.m.m8520("ISAdQualitySegment Builder", sb2.toString());
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            return this;
        }

        public com.ironsource.adqualitysdk.sdk.ISAdQualitySegment build() {
            return new com.ironsource.adqualitysdk.sdk.ISAdQualitySegment(this.f92, this.f88, this.f91, this.f89, this.f87, this.f85, this.f86, new java.util.HashMap(this.f84), (byte) 0);
        }
    }
}
