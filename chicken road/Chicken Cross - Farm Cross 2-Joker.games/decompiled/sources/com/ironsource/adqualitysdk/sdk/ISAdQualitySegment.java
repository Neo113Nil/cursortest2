package com.ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.AbstractC0544;
import com.ironsource.adqualitysdk.sdk.i.AbstractC1191;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

@Deprecated
/* loaded from: classes6.dex */
public class ISAdQualitySegment {

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final HashMap f79;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final double f80;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final long f81;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final AtomicBoolean f82;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final int f83;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String f84;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final int f85;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f86;

    @Deprecated
    public static class Builder {

        /* renamed from: ｋ, reason: contains not printable characters */
        public String f92;

        /* renamed from: ﾒ, reason: contains not printable characters */
        public String f94;

        /* renamed from: ﾇ, reason: contains not printable characters */
        public int f93 = -1;

        /* renamed from: ﻛ, reason: contains not printable characters */
        public int f91 = -1;

        /* renamed from: ﻐ, reason: contains not printable characters */
        public AtomicBoolean f90 = null;

        /* renamed from: ﻏ, reason: contains not printable characters */
        public long f89 = 0;

        /* renamed from: ﺙ, reason: contains not printable characters */
        public double f88 = -1.0d;

        /* renamed from: ﱡ, reason: contains not printable characters */
        public final HashMap f87 = new HashMap();

        @Deprecated
        public Builder() {
        }

        @Deprecated
        public ISAdQualitySegment build() {
            return new ISAdQualitySegment(this.f94, this.f93, this.f92, this.f91, this.f90, this.f88, this.f89, new HashMap(this.f87));
        }

        @Deprecated
        public Builder setAge(int i) {
            if (i == 0) {
                return this;
            }
            if (i < 1 || i > 199) {
                AbstractC0544.m5504("ISAdQualitySegment Builder", "setAge( " + i + " ) age must be between 1-199");
            } else {
                this.f93 = i;
            }
            return this;
        }

        @Deprecated
        public Builder setCustomData(String str, String str2) {
            if (TextUtils.isEmpty(str2)) {
                return this;
            }
            try {
                if (this.f87.size() < 5) {
                    boolean z = false;
                    if (TextUtils.isEmpty(str) ? false : str.matches(StringFog.decrypt("A68ccJkXpLZt2UQAyXI=\n", "XfR9XeNWiew=\n"))) {
                        if (!TextUtils.isEmpty(str2)) {
                            z = str2.matches(StringFog.decrypt("A68ccJkXpLZt2UQAyXI=\n", "XfR9XeNWiew=\n"));
                        }
                        if (z && AbstractC1191.m5916(str, 32) && AbstractC1191.m5916(str2, 32)) {
                            this.f87.put("sgct_" + str, str2);
                        }
                    }
                    AbstractC0544.m5504("ISAdQualitySegment Builder", "setCustomData( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length");
                } else {
                    AbstractC0544.m5504("ISAdQualitySegment Builder", "setCustomData( " + str + " , " + str2 + " ) limited to 5 custom values. Ignoring custom value.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return this;
        }

        @Deprecated
        public Builder setGender(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            Locale locale = Locale.ENGLISH;
            if (str.toLowerCase(locale).equals(IronSourceConstants.a.b) || str.toLowerCase(locale).equals(IronSourceConstants.a.c)) {
                this.f92 = str.toLowerCase(locale);
            } else {
                AbstractC0544.m5504("ISAdQualitySegment Builder", "setGender( " + str + " ) is invalid");
            }
            return this;
        }

        @Deprecated
        public Builder setInAppPurchasesTotal(double d) {
            if (d < 0.0d || d >= 999999.99d) {
                AbstractC0544.m5504("ISAdQualitySegment Builder", "setIAPTotal( " + d + " ) iapt must be between 0-999999.99");
            } else {
                this.f88 = Math.floor(d * 100.0d) / 100.0d;
            }
            return this;
        }

        @Deprecated
        public Builder setIsPaying(boolean z) {
            if (this.f90 == null) {
                this.f90 = new AtomicBoolean();
            }
            this.f90.set(z);
            return this;
        }

        @Deprecated
        public Builder setLevel(int i) {
            if (i == 0) {
                return this;
            }
            if (i <= 0 || i >= 999999) {
                AbstractC0544.m5504("ISAdQualitySegment Builder", "setLevel( " + i + " ) level must be between 1-999999");
            } else {
                this.f91 = i;
            }
            return this;
        }

        @Deprecated
        public Builder setSegmentName(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if ((TextUtils.isEmpty(str) ? false : str.matches(StringFog.decrypt("A68ccJkXpLZt2UQAyXI=\n", "XfR9XeNWiew=\n"))) && AbstractC1191.m5916(str, 32)) {
                this.f94 = str;
            } else {
                AbstractC0544.m5504("ISAdQualitySegment Builder", "setSegmentName( " + str + " ) segment name must be alphanumeric and 1-32 in length");
            }
            return this;
        }

        @Deprecated
        public Builder setUserCreationDate(long j) {
            if (j == 0) {
                return this;
            }
            if (j > 0) {
                this.f89 = j;
            } else {
                AbstractC0544.m5504("ISAdQualitySegment Builder", "setUserCreationDate( " + j + " ) is an invalid timestamp");
            }
            return this;
        }
    }

    public ISAdQualitySegment(String str, int i, String str2, int i2, AtomicBoolean atomicBoolean, double d, long j, HashMap hashMap) {
        this.f86 = str;
        this.f85 = i;
        this.f84 = str2;
        this.f83 = i2;
        this.f82 = atomicBoolean;
        this.f80 = d;
        this.f81 = j;
        this.f79 = hashMap;
    }

    @Deprecated
    public int getAge() {
        return this.f85;
    }

    @Deprecated
    public Map<String, String> getCustomData() {
        return this.f79;
    }

    @Deprecated
    public String getGender() {
        return this.f84;
    }

    @Deprecated
    public double getInAppPurchasesTotal() {
        return this.f80;
    }

    @Deprecated
    public AtomicBoolean getIsPaying() {
        return this.f82;
    }

    @Deprecated
    public int getLevel() {
        return this.f83;
    }

    @Deprecated
    public String getName() {
        return this.f86;
    }

    @Deprecated
    public long getUserCreationDate() {
        return this.f81;
    }
}
