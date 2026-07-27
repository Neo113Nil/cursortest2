package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;

/* loaded from: classes.dex */
public class X4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6822a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6823b;

    public X4(String str, String str2) {
        this.f6822a = str;
        this.f6823b = str2;
    }

    public final String a() {
        return ApiKeyUtils.createPartialApiKey(this.f6823b);
    }

    public final String b() {
        return this.f6823b;
    }

    public final String c() {
        return this.f6822a;
    }

    public boolean d() {
        return false;
    }

    public String e() {
        return this.f6822a + "_" + ApiKeyUtils.createPartialApiKey(this.f6823b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            X4 x4 = (X4) obj;
            String str = this.f6822a;
            if (str == null ? x4.f6822a != null : !str.equals(x4.f6822a)) {
                return false;
            }
            String str2 = this.f6823b;
            String str3 = x4.f6823b;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6822a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6823b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.f6822a + "_" + this.f6823b;
    }
}
