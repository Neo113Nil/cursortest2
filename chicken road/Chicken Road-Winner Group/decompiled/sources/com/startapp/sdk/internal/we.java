package com.startapp.sdk.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;

/* loaded from: classes.dex */
public abstract class we {
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(Context context) {
        boolean z3;
        boolean z4;
        Process process;
        boolean z5;
        boolean z6;
        Process process2;
        boolean z7;
        PackageManager packageManager = context.getPackageManager();
        char c3 = 1;
        if (!ue.a(packageManager, ve.f4519a)) {
            if (!(ue.a(packageManager, new String[]{"com.noshufou.android.su", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.zachspong.temprootremovejb", "com.ramdroid.appquarantine"}) ? true : ue.a(packageManager, ve.f4520b)) && !ue.a("su") && !ue.a("busybox")) {
                HashMap hashMap = new HashMap();
                hashMap.put("ro.debuggable", "1");
                hashMap.put("ro.secure", CommonUrlParts.Values.FALSE_INTEGER);
                String[] strArr = new String[0];
                try {
                    strArr = new Scanner(Runtime.getRuntime().exec("getprop").getInputStream()).useDelimiter("\\A").next().split(IOUtils.LINE_SEPARATOR_UNIX);
                } catch (IOException | NoSuchElementException unused) {
                }
                boolean z8 = false;
                for (String str : strArr) {
                    for (String str2 : hashMap.keySet()) {
                        if (str.contains(str2)) {
                            if (str.contains("[" + ((String) hashMap.get(str2)) + "]")) {
                                z8 = true;
                            }
                        }
                    }
                }
                if (!z8) {
                    String[] strArr2 = new String[0];
                    try {
                        strArr2 = new Scanner(Runtime.getRuntime().exec("mount").getInputStream()).useDelimiter("\\A").next().split(IOUtils.LINE_SEPARATOR_UNIX);
                    } catch (IOException | NoSuchElementException unused2) {
                    }
                    int length = strArr2.length;
                    int i3 = 0;
                    boolean z9 = false;
                    while (i3 < length) {
                        String[] split = strArr2[i3].split(" ");
                        if (split.length >= 4) {
                            String str3 = split[c3];
                            String str4 = split[3];
                            String[] strArr3 = ve.f4522d;
                            for (int i4 = 0; i4 < 7; i4++) {
                                if (str3.equalsIgnoreCase(strArr3[i4])) {
                                    String[] split2 = str4.split(StringUtils.COMMA);
                                    int length2 = split2.length;
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 >= length2) {
                                            break;
                                        }
                                        if (split2[i5].equalsIgnoreCase("rw")) {
                                            z9 = true;
                                            break;
                                        }
                                        i5++;
                                    }
                                }
                            }
                        }
                        i3++;
                        c3 = 1;
                    }
                    if (!z9) {
                        String str5 = Build.TAGS;
                        if (!(str5 != null && str5.contains("test-keys"))) {
                            try {
                                process2 = Runtime.getRuntime().exec(new String[]{"which", "su"});
                            } catch (Throwable unused3) {
                                process2 = null;
                            }
                            try {
                            } catch (Throwable unused4) {
                                if (process2 == null) {
                                    z7 = false;
                                    if (!z7) {
                                    }
                                    z3 = true;
                                    if (!z3) {
                                    }
                                    return true;
                                }
                                z7 = false;
                                process2.destroy();
                                if (!z7) {
                                }
                                z3 = true;
                                if (!z3) {
                                }
                                return true;
                            }
                            if (new BufferedReader(new InputStreamReader(process2.getInputStream())).readLine() != null) {
                                z7 = true;
                                process2.destroy();
                                if (!z7 && !ue.a("magisk")) {
                                    z3 = false;
                                    if (!z3) {
                                        String str6 = Build.TAGS;
                                        if (!(str6 != null && str6.contains("test-keys"))) {
                                            String[] strArr4 = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
                                            int i6 = 0;
                                            while (true) {
                                                if (i6 >= 10) {
                                                    z4 = false;
                                                    break;
                                                }
                                                if (new File(strArr4[i6]).exists()) {
                                                    z4 = true;
                                                    break;
                                                }
                                                i6++;
                                            }
                                            if (!z4) {
                                                try {
                                                    process = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
                                                } catch (Throwable unused5) {
                                                    process = null;
                                                }
                                                try {
                                                } catch (Throwable unused6) {
                                                    if (process == null) {
                                                        z5 = false;
                                                        if (!z5) {
                                                        }
                                                        return true;
                                                    }
                                                    z5 = false;
                                                    process.destroy();
                                                    if (!z5) {
                                                    }
                                                    return true;
                                                }
                                                if (new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() != null) {
                                                    z5 = true;
                                                    process.destroy();
                                                    if (!z5) {
                                                        try {
                                                            z6 = new File("/system/app/Superuser.apk").exists();
                                                        } catch (Throwable unused7) {
                                                            z6 = false;
                                                        }
                                                        if (!z6) {
                                                            return false;
                                                        }
                                                    }
                                                }
                                                z5 = false;
                                                process.destroy();
                                                if (!z5) {
                                                }
                                            }
                                        }
                                    }
                                    return true;
                                }
                            }
                            z7 = false;
                            process2.destroy();
                            if (!z7) {
                                z3 = false;
                                if (!z3) {
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        z3 = true;
        if (!z3) {
        }
        return true;
    }
}
