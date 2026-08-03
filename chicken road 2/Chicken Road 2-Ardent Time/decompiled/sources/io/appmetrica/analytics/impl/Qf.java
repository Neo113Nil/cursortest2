package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class Qf {
    public static final java.lang.String a(io.appmetrica.analytics.impl.C0326e9 c0326e9) {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Event sent: ");
        int i2 = c0326e9.f5816c;
        java.lang.String str2 = c0326e9.f5817d;
        byte[] bArr = c0326e9.f5818e;
        if (i2 == 1) {
            str = "Attribution";
        } else if (i2 == 2) {
            str = "Session start";
        } else if (i2 == 4) {
            if (str2 == null) {
                str2 = "null";
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(str2);
            if (bArr != null) {
                java.lang.String str3 = new java.lang.String(bArr, y1.a.f8486a);
                if (!android.text.TextUtils.isEmpty(str3)) {
                    sb2.append(" with value ");
                    sb2.append(str3);
                }
            }
            str = sb2.toString();
        } else if (i2 == 5) {
            str = "Referrer";
        } else if (i2 == 7) {
            str = "Session heartbeat";
        } else if (i2 == 13) {
            str = "The very first event";
        } else if (i2 == 35) {
            str = "E-Commerce";
        } else if (i2 == 40) {
            str = "Ad revenue (ILRD)";
        } else if (i2 == 42) {
            str = "External attribution";
        } else if (i2 == 16) {
            str = "Open";
        } else if (i2 == 17) {
            str = "Update";
        } else if (i2 == 20) {
            str = "User profile update";
        } else if (i2 != 21) {
            switch (i2) {
                case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                    str = "ANR";
                    break;
                case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                    str = B1.a.i("Crash: ", str2);
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                    str = B1.a.i("Error: ", str2);
                    break;
                default:
                    str = B1.a.f(i2, "type=");
                    break;
            }
        } else {
            str = "Revenue";
        }
        sb.append(str);
        return sb.toString();
    }

    public static final java.lang.String a(java.lang.String str, io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb, java.lang.String str2, java.lang.String str3) {
        if (!io.appmetrica.analytics.impl.AbstractC0792w9.f7008d.contains(io.appmetrica.analytics.impl.EnumC0251bb.a(enumC0251bb.f5573a))) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(enumC0251bb.name());
        if (io.appmetrica.analytics.impl.AbstractC0792w9.f7010f.contains(enumC0251bb) && !android.text.TextUtils.isEmpty(str2)) {
            sb.append(" with name ");
            sb.append(str2);
        }
        if (io.appmetrica.analytics.impl.AbstractC0792w9.f7009e.contains(enumC0251bb) && !android.text.TextUtils.isEmpty(str3)) {
            sb.append(" with value ");
            sb.append(str3);
        }
        return sb.toString();
    }
}
