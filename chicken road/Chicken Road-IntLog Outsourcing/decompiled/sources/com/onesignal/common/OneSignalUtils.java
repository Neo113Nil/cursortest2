package com.onesignal.common;

import B4.k;
import a.AbstractC0169a;
import f4.InterfaceC0428e;
import g4.AbstractC0465j;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class OneSignalUtils {
    public static final OneSignalUtils INSTANCE = new OneSignalUtils();
    private static final InterfaceC0428e sdkVersion$delegate = AbstractC0169a.A(OneSignalUtils$sdkVersion$2.INSTANCE);

    private OneSignalUtils() {
    }

    public final String formatVersion$com_onesignal_core(String version) {
        String str;
        String str2;
        String c02;
        i.e(version, "version");
        List h02 = k.h0(version, new String[]{"-"}, 2, 2);
        List h03 = k.h0((CharSequence) h02.get(0), new String[]{"."}, 0, 6);
        String str3 = (String) AbstractC0465j.H0(0, h03);
        String str4 = "00";
        if (str3 == null || (str = k.c0(2, str3)) == null) {
            str = "00";
        }
        String str5 = (String) AbstractC0465j.H0(1, h03);
        if (str5 == null || (str2 = k.c0(2, str5)) == null) {
            str2 = "00";
        }
        String str6 = (String) AbstractC0465j.H0(2, h03);
        if (str6 != null && (c02 = k.c0(2, str6)) != null) {
            str4 = c02;
        }
        String str7 = str + str2 + str4;
        if (h02.size() <= 1) {
            return str7;
        }
        return str7 + '-' + ((String) h02.get(1));
    }

    public final String getSdkVersion() {
        return (String) sdkVersion$delegate.getValue();
    }

    public final boolean isValidEmail(String email) {
        i.e(email, "email");
        if (email.length() == 0) {
            return false;
        }
        Pattern compile = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$");
        i.d(compile, "compile(...)");
        return compile.matcher(email).matches();
    }

    public final boolean isValidPhoneNumber(String number) {
        i.e(number, "number");
        if (number.length() == 0) {
            return false;
        }
        Pattern compile = Pattern.compile("^\\+?[1-9]\\d{1,14}$");
        i.d(compile, "compile(...)");
        return compile.matcher(number).matches();
    }
}
