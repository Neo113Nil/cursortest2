package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import androidx.collection.SimpleArrayMap;
import com.google.common.base.a;
import com.google.common.base.j;
import com.google.common.base.n;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class zzjz {
    private static volatile j zza;

    private zzjz() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:8|(4:10|(1:12)|13|14)|15|(4:17|(1:19)|13|14)|20|(1:24)|25|26|27|28|29|30|31|(1:33)(1:80)|34|(9:36|37|38|39|40|(2:41|(3:43|(3:58|59|60)(7:45|46|(2:48|(1:51))|52|(1:54)|55|56)|57)(1:61))|62|63|64)(1:79)|65|14) */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0072, code lost:
    
        r4 = com.google.common.base.a.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static j zza(Context context) {
        j jVar;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        j jVar2;
        j jVar3 = zza;
        if (jVar3 != null) {
            return jVar3;
        }
        synchronized (zzjz.class) {
            try {
                jVar = zza;
                if (jVar == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    int i = zzkb.zza;
                    if (!str.equals("eng")) {
                        if (str.equals("userdebug")) {
                        }
                        jVar = a.a;
                        zza = jVar;
                    }
                    if (!str2.contains("dev-keys")) {
                        if (str2.contains("test-keys")) {
                        }
                        jVar = a.a;
                        zza = jVar;
                    }
                    if (zzjm.zza() && !context.isDeviceProtectedStorage()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    StrictMode.allowThreadDiskWrites();
                    File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                    j jVar4 = file.exists() ? new n(file) : a.a;
                    if (jVar4.b()) {
                        File file2 = (File) jVar4.a();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                            try {
                                SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
                                HashMap hashMap = new HashMap();
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    String[] split = readLine.split(" ", 3);
                                    if (split.length != 3) {
                                        new StringBuilder(readLine.length() + 9);
                                    } else {
                                        String str3 = new String(split[0]);
                                        String decode = Uri.decode(new String(split[1]));
                                        String str4 = (String) hashMap.get(split[2]);
                                        if (str4 == null) {
                                            String str5 = new String(split[2]);
                                            str4 = Uri.decode(str5);
                                            if (str4.length() < 1024 || str4 == str5) {
                                                hashMap.put(str5, str4);
                                            }
                                        }
                                        SimpleArrayMap simpleArrayMap2 = (SimpleArrayMap) simpleArrayMap.get(str3);
                                        if (simpleArrayMap2 == null) {
                                            simpleArrayMap2 = new SimpleArrayMap();
                                            simpleArrayMap.put(str3, simpleArrayMap2);
                                        }
                                        simpleArrayMap2.put(decode, str4);
                                    }
                                }
                                new StringBuilder(file2.toString().length() + 28 + String.valueOf(context.getPackageName()).length());
                                zzjt zzjtVar = new zzjt(simpleArrayMap);
                                bufferedReader.close();
                                jVar2 = new n(zzjtVar);
                            } finally {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th) {
                                    th.addSuppressed(th);
                                }
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        jVar2 = a.a;
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    jVar = jVar2;
                    zza = jVar;
                }
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th2;
            } finally {
            }
        }
        return jVar;
    }
}
