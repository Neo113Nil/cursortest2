package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.h4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0536h4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7399a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f7400b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7401c;

    public C0536h4(String str, Integer num, String str2) {
        this.f7399a = str;
        this.f7400b = num;
        this.f7401c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0536h4.class == obj.getClass()) {
            C0536h4 c0536h4 = (C0536h4) obj;
            if (!this.f7399a.equals(c0536h4.f7399a)) {
                return false;
            }
            Integer num = this.f7400b;
            if (num == null ? c0536h4.f7400b != null : !num.equals(c0536h4.f7400b)) {
                return false;
            }
            String str = this.f7401c;
            String str2 = c0536h4.f7401c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f7399a.hashCode() * 31;
        Integer num = this.f7400b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f7401c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }
}
