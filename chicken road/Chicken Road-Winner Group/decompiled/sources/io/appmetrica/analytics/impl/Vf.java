package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class Vf {
    public static final String a(C0644l9 c0644l9) {
        String str;
        StringBuilder sb = new StringBuilder("Event sent: ");
        int i3 = c0644l9.f7784c;
        String str2 = c0644l9.f7785d;
        byte[] bArr = c0644l9.f7786e;
        if (i3 == 1) {
            str = "Attribution";
        } else if (i3 == 2) {
            str = "Session start";
        } else if (i3 == 4) {
            if (str2 == null) {
                str2 = "null";
            }
            StringBuilder sb2 = new StringBuilder(str2);
            if (bArr != null) {
                String str3 = new String(bArr, v2.a.f10417a);
                if (!TextUtils.isEmpty(str3)) {
                    sb2.append(" with value ");
                    sb2.append(str3);
                }
            }
            str = sb2.toString();
        } else if (i3 == 5) {
            str = "Referrer";
        } else if (i3 == 7) {
            str = "Session heartbeat";
        } else if (i3 == 13) {
            str = "The very first event";
        } else if (i3 == 35) {
            str = "E-Commerce";
        } else if (i3 == 40) {
            str = "Ad revenue (ILRD)";
        } else if (i3 == 42) {
            str = "External attribution";
        } else if (i3 == 16) {
            str = "Open";
        } else if (i3 == 17) {
            str = "Update";
        } else if (i3 == 20) {
            str = "User profile update";
        } else if (i3 != 21) {
            switch (i3) {
                case C0644l9.f7762F /* 25 */:
                    str = "ANR";
                    break;
                case C0644l9.f7763G /* 26 */:
                    str = B0.c.j("Crash: ", str2);
                    break;
                case C0644l9.f7764H /* 27 */:
                    str = B0.c.j("Error: ", str2);
                    break;
                default:
                    str = B0.c.h(i3, "type=");
                    break;
            }
        } else {
            str = "Revenue";
        }
        sb.append(str);
        return sb.toString();
    }

    public static final String a(String str, EnumC0569ib enumC0569ib, String str2, String str3) {
        if (!D9.f5837d.contains(EnumC0569ib.a(enumC0569ib.f7538a))) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(enumC0569ib.name());
        if (D9.f.contains(enumC0569ib) && !TextUtils.isEmpty(str2)) {
            sb.append(" with name ");
            sb.append(str2);
        }
        if (D9.f5838e.contains(enumC0569ib) && !TextUtils.isEmpty(str3)) {
            sb.append(" with value ");
            sb.append(str3);
        }
        return sb.toString();
    }
}
