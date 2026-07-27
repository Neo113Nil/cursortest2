package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import b2.AbstractC0279e;

/* loaded from: classes.dex */
public abstract class Vf {
    public static final String a(C0793l9 c0793l9) {
        String str;
        StringBuilder sb = new StringBuilder("Event sent: ");
        int i2 = c0793l9.f8706c;
        String str2 = c0793l9.f8707d;
        byte[] bArr = c0793l9.f8708e;
        if (i2 == 1) {
            str = "Attribution";
        } else if (i2 == 2) {
            str = "Session start";
        } else if (i2 == 4) {
            if (str2 == null) {
                str2 = "null";
            }
            StringBuilder sb2 = new StringBuilder(str2);
            if (bArr != null) {
                String str3 = new String(bArr, B4.a.f287a);
                if (!TextUtils.isEmpty(str3)) {
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
                case C0793l9.f8684F /* 25 */:
                    str = "ANR";
                    break;
                case 26:
                    str = B0.o.i("Crash: ", str2);
                    break;
                case C0793l9.f8686H /* 27 */:
                    str = B0.o.i("Error: ", str2);
                    break;
                default:
                    str = AbstractC0279e.d(i2, "type=");
                    break;
            }
        } else {
            str = "Revenue";
        }
        sb.append(str);
        return sb.toString();
    }

    public static final String a(String str, EnumC0718ib enumC0718ib, String str2, String str3) {
        if (!D9.f6673d.contains(EnumC0718ib.a(enumC0718ib.f8449a))) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(enumC0718ib.name());
        if (D9.f6675f.contains(enumC0718ib) && !TextUtils.isEmpty(str2)) {
            sb.append(" with name ");
            sb.append(str2);
        }
        if (D9.f6674e.contains(enumC0718ib) && !TextUtils.isEmpty(str3)) {
            sb.append(" with value ");
            sb.append(str3);
        }
        return sb.toString();
    }
}
