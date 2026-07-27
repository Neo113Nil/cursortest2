package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﭔ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1158 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String[] f3316 = {StringFog.decrypt("OOXdti+NVyFv9M2rdJtP\n", "F5akxVvoOg4=\n"), StringFog.decrypt("2ajT4zUN826UssS/Mh0=\n", "9tuqkEFonkE=\n"), StringFog.decrypt("XH2nQ87arOo=\n", "cw7FKqD1358=\n"), StringFog.decrypt("811fUJjNf8CvWw==\n", "3C4mI+yoEu8=\n"), StringFog.decrypt("U9cgc0HBWXMezTcvG8FMKFOKKnU=\n", "fKRZADWkNFw=\n"), StringFog.decrypt("QkyzYD8ALEYYTLg8PABsBwharj45Ci4dQky/\n", "bT/KE0tlQWk=\n"), StringFog.decrypt("hMWRgrqRIEDKxpjenYE9CtnDm5S82iwfwA==\n", "q7bo8c70TW8=\n"), StringFog.decrypt("1di8aiUGSsCZ3bExPEtPwdXPqA==\n", "+rzdHkQpJq8=\n"), StringFog.decrypt("tbP96nErLQz5tvCxcm0vTOmi\n", "mtecnhAEQWM=\n"), StringFog.decrypt("O4mmECgEQex3jKtLOl4=\n", "FO3HZEkrLYM=\n")};

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String[] f3315 = {StringFog.decrypt("EfLFaun7ovoH+8cxqfW/9gDywSCp56Q=\n", "cp2oRIeU0ZI=\n"), StringFog.decrypt("IU9kypfY9Ak3RmaR19bpBTBPYIDXxPJPJ0xgkJw=\n", "QiAJ5Pm3h2E=\n"), StringFog.decrypt("Dr/+1rwwbPENo6LQ+iJw7w64o8A=\n", "a8rQtdRRBZ8=\n"), StringFog.decrypt("HFGAKTbGOY4XV4ZjKN04nFFNmHc42zmOGkw=\n", "fz7tB12pTP0=\n"), StringFog.decrypt("VACrBSdmrp1TH6dZJ3fpnEIfo1kmfaKd\n", "N2/GK1MOx+8=\n"), StringFog.decrypt("HUVtWN1yfsERXWUFimRn\n", "fioAdqQXEq0=\n"), StringFog.decrypt("2D5roee0nBrUOWj45vWBEdw4deQ=\n", "u1EGj5Pb7HA=\n"), StringFog.decrypt("GADpBz/uqeIAFaIFIvXi4w==\n", "dWXHd1eGh5E=\n"), StringFog.decrypt("GQfyqLxJl+AVHezjpQ6a6Bc=\n", "emifhtcg+Yc=\n")};

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String[] f3314 = {StringFog.decrypt("uaK7lZBK5Q==\n", "3sfV8OIjhkA=\n"), StringFog.decrypt("r8+e7JXjmg==\n", "2qH1gvqU9D4=\n"), StringFog.decrypt("xI3Ja0MU72PHiQ==\n", "o+KmDC9xsBA=\n"), StringFog.decrypt("UeT3A8p4fC4=\n", "FImCb6sME1w=\n"), StringFog.decrypt("RybArbhC/SFVDO//tV7wbXJowrClC+E5MA==\n", "Bkik39crmQE=\n"), StringFog.decrypt("v206NPQlFKKibA==\n", "zAlRa5NVfM0=\n"), StringFog.decrypt("wSSgxM/Srw==\n", "t0bPvPfk38Y=\n"), StringFog.decrypt("KgpqgWmuc9o=\n", "TWUG5Q/HALI=\n"), StringFog.decrypt("+Lt05+W5\n", "itoahI3MlRA=\n")};

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0149, code lost:
    
        if ((r4 == null ? false : r4.toLowerCase().contains(com.ironsource.adqualitysdk.sdk.StringFog.decrypt("QFQbIO0i\n", "NjZ0WNUUDPU=\n").toLowerCase())) != false) goto L63;
     */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1166 m5898(Context context) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        String[] strArr = f3316;
        int length = strArr.length;
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (new File(strArr[i]).exists()) {
                arrayList.add(1);
                break;
            }
            i++;
        }
        PackageManager packageManager = context.getPackageManager();
        String[] strArr2 = f3315;
        int length2 = strArr2.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                break;
            }
            try {
                packageManager.getPackageInfo(strArr2[i2], 0);
                arrayList.add(2);
                break;
            } catch (Exception unused) {
                i2++;
            }
        }
        String str = Build.TAGS;
        if (str != null && str.contains(StringFog.decrypt("RkBzn/UYlqtB\n", "MiUA69hz89I=\n"))) {
            arrayList.add(3);
        }
        try {
            Process exec = Runtime.getRuntime().exec(StringFog.decrypt("6osvhkE=\n", "h+Ra6DXRJnQ=\n"));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedReader.close();
                        exec.waitFor();
                        break;
                    }
                    if (readLine.contains(StringFog.decrypt("1kirFpeENw==\n", "+TvSZePhWs4=\n")) && readLine.contains(StringFog.decrypt("uTII\n", "mUB/UuAN9Kw=\n"))) {
                        arrayList.add(4);
                        break;
                    }
                } finally {
                    bufferedReader.close();
                }
            }
        } catch (Throwable unused2) {
        }
        String[] strArr3 = {Build.FINGERPRINT, Build.MODEL, Build.MANUFACTURER, Build.BRAND, Build.DEVICE, Build.PRODUCT};
        int i3 = 0;
        loop3: while (true) {
            if (i3 >= 6) {
                break;
            }
            String str2 = strArr3[i3];
            for (String str3 : f3314) {
                if (str2 == null ? false : str2.toLowerCase().contains(str3.toLowerCase())) {
                    arrayList.add(5);
                    break loop3;
                }
            }
            i3++;
        }
        String str4 = Build.HARDWARE;
        if (!(str4 == null ? false : str4.toLowerCase().contains(StringFog.decrypt("e8YC32SNhKw=\n", "HKluuwLk98Q=\n").toLowerCase()))) {
            if (!(str4 == null ? false : str4.toLowerCase().contains(StringFog.decrypt("KUPRlVIl\n", "WyK/9jpQr8w=\n").toLowerCase()))) {
            }
        }
        arrayList.add(6);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (intValue == 1 || intValue == 2 || intValue == 3 || intValue == 4) {
                z = true;
                break;
            }
        }
        z = false;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int intValue2 = ((Integer) it2.next()).intValue();
            if (intValue2 == 5 || intValue2 == 6) {
                z2 = true;
                break;
            }
        }
        return new C1166(z, z2, arrayList);
    }
}
