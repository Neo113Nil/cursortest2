package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes.dex */
public final class X3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6817a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6818b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f6819c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6820d;

    /* renamed from: e, reason: collision with root package name */
    public final CounterConfigurationReporterType f6821e;

    public X3(String str, String str2, Integer num, String str3, CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f6817a = str;
        this.f6818b = str2;
        this.f6819c = num;
        this.f6820d = str3;
        this.f6821e = counterConfigurationReporterType;
    }

    public static X3 a(P3 p3) {
        return new X3(p3.f6383b.getApiKey(), p3.f6382a.f5992a.getAsString("PROCESS_CFG_PACKAGE_NAME"), p3.f6382a.f5992a.getAsInteger("PROCESS_CFG_PROCESS_ID"), p3.f6382a.f5992a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), p3.f6383b.getReporterType());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && X3.class == obj.getClass()) {
            X3 x3 = (X3) obj;
            String str = this.f6817a;
            if (str == null ? x3.f6817a != null : !str.equals(x3.f6817a)) {
                return false;
            }
            if (!this.f6818b.equals(x3.f6818b)) {
                return false;
            }
            Integer num = this.f6819c;
            if (num == null ? x3.f6819c != null : !num.equals(x3.f6819c)) {
                return false;
            }
            String str2 = this.f6820d;
            if (str2 == null ? x3.f6820d != null : !str2.equals(x3.f6820d)) {
                return false;
            }
            if (this.f6821e == x3.f6821e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6817a;
        int hashCode = (this.f6818b.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        Integer num = this.f6819c;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f6820d;
        return this.f6821e.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ClientDescription{mApiKey='" + this.f6817a + "', mPackageName='" + this.f6818b + "', mProcessID=" + this.f6819c + ", mProcessSessionID='" + this.f6820d + "', mReporterType=" + this.f6821e + '}';
    }
}
