package W9;

import B0.A0;
import C.o0;
import U7.d;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.scottyab.rootbeer.RootBeerNative;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f33325a;

    public b(Context context) {
        this.f33325a = context;
    }

    public static boolean a(String str) {
        boolean z11 = false;
        for (String str2 : a.a()) {
            String e11 = d.e(str2, str);
            if (new File(str2, str).exists()) {
                ru.ozon.android.messenger.framework.data.remote.serialize.a.c(e11 + " binary detected!");
                z11 = true;
            }
        }
        return z11;
    }

    private boolean b(ArrayList arrayList) {
        PackageManager packageManager = this.f33325a.getPackageManager();
        Iterator it = arrayList.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                packageManager.getPackageInfo(str, 0);
                ru.ozon.android.messenger.framework.data.remote.serialize.a.a(str + " ROOT management app detected!");
                z11 = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        boolean z11;
        String[] strArr;
        boolean z12;
        String[] strArr2;
        boolean z13;
        String[] strArr3;
        Process process;
        boolean z14;
        boolean z15;
        InputStream inputStream;
        InputStream inputStream2;
        if (!b(new ArrayList(Arrays.asList(a.f33321a)))) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(Arrays.asList(a.f33322b));
            if (!b(arrayList) && !a("su")) {
                HashMap hashMap = new HashMap();
                hashMap.put("ro.debuggable", "1");
                hashMap.put("ro.secure", "0");
                try {
                    inputStream2 = Runtime.getRuntime().exec("getprop").getInputStream();
                } catch (IOException | NoSuchElementException e11) {
                    e11.printStackTrace();
                }
                if (inputStream2 != null) {
                    strArr = new Scanner(inputStream2).useDelimiter("\\A").next().split("\n");
                    if (strArr != null) {
                        z12 = false;
                    } else {
                        z12 = false;
                        for (String str : strArr) {
                            for (String str2 : hashMap.keySet()) {
                                if (str.contains(str2)) {
                                    String b11 = A0.b("[", (String) hashMap.get(str2), "]");
                                    if (str.contains(b11)) {
                                        ru.ozon.android.messenger.framework.data.remote.serialize.a.c(str2 + " = " + b11 + " detected!");
                                        z12 = true;
                                    }
                                }
                            }
                        }
                    }
                    if (!z12) {
                        try {
                            inputStream = Runtime.getRuntime().exec("mount").getInputStream();
                        } catch (IOException | NoSuchElementException e12) {
                            e12.printStackTrace();
                        }
                        if (inputStream != null) {
                            strArr2 = new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
                            if (strArr2 != null) {
                                z13 = false;
                            } else {
                                int length = strArr2.length;
                                int i11 = 0;
                                z13 = false;
                                while (i11 < length) {
                                    String str3 = strArr2[i11];
                                    String[] split = str3.split(" ");
                                    if (split.length < 6) {
                                        ru.ozon.android.messenger.framework.data.remote.serialize.a.a("Error formatting mount line: ".concat(str3));
                                    } else {
                                        String str4 = split[2];
                                        String str5 = split[5];
                                        String[] strArr4 = a.f33324d;
                                        int i12 = 0;
                                        while (i12 < 7) {
                                            String str6 = strArr4[i12];
                                            if (str4.equalsIgnoreCase(str6)) {
                                                str5 = str5.replace("(", "").replace(")", "");
                                                String[] split2 = str5.split(",");
                                                int length2 = split2.length;
                                                int i13 = 0;
                                                while (i13 < length2) {
                                                    strArr3 = strArr2;
                                                    if (split2[i13].equalsIgnoreCase("rw")) {
                                                        ru.ozon.android.messenger.framework.data.remote.serialize.a.c(str6 + " path is mounted with rw permissions! " + str3);
                                                        z13 = true;
                                                        break;
                                                    }
                                                    i13++;
                                                    strArr2 = strArr3;
                                                }
                                            }
                                            strArr3 = strArr2;
                                            i12++;
                                            strArr2 = strArr3;
                                        }
                                    }
                                    i11++;
                                    strArr2 = strArr2;
                                }
                            }
                            if (!z13) {
                                String str7 = Build.TAGS;
                                if (!(str7 != null && str7.contains("test-keys"))) {
                                    try {
                                        process = Runtime.getRuntime().exec(new String[]{"which", "su"});
                                    } catch (Throwable unused) {
                                        process = null;
                                    }
                                    try {
                                        z14 = new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() != null;
                                        process.destroy();
                                    } catch (Throwable unused2) {
                                        if (process != null) {
                                            process.destroy();
                                        }
                                        z14 = false;
                                        if (!z14) {
                                        }
                                        z11 = true;
                                        return z11;
                                    }
                                    if (!z14) {
                                        if (RootBeerNative.a()) {
                                            String[] a11 = a.a();
                                            int length3 = a11.length;
                                            String[] strArr5 = new String[length3];
                                            for (int i14 = 0; i14 < length3; i14++) {
                                                strArr5[i14] = o0.c(new StringBuilder(), a11[i14], "su");
                                            }
                                            RootBeerNative rootBeerNative = new RootBeerNative();
                                            z11 = true;
                                            try {
                                                rootBeerNative.setLogDebugMessages(true);
                                                if (rootBeerNative.checkForRoot(strArr5) > 0) {
                                                    z15 = true;
                                                }
                                            } catch (UnsatisfiedLinkError unused3) {
                                            }
                                            z15 = false;
                                        } else {
                                            ru.ozon.android.messenger.framework.data.remote.serialize.a.a("We could not load the native library to test for root");
                                            z15 = false;
                                            z11 = true;
                                        }
                                        if (!z15 && !a("magisk")) {
                                            return false;
                                        }
                                        return z11;
                                    }
                                }
                            }
                        }
                        strArr2 = null;
                        if (strArr2 != null) {
                        }
                        if (!z13) {
                        }
                    }
                }
                strArr = null;
                if (strArr != null) {
                }
                if (!z12) {
                }
            }
        }
        z11 = true;
        return z11;
    }
}
