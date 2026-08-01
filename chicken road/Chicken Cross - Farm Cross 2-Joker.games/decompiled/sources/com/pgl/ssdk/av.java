package com.pgl.ssdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class av {

    /* renamed from: a, reason: collision with root package name */
    private static List<String> f11622a = new ArrayList();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f11623a;
        public String b;

        public a(int i, String... strArr) {
            this.f11623a = i;
            JSONArray jSONArray = new JSONArray();
            for (String str : strArr) {
                jSONArray.put(str);
            }
            this.b = jSONArray.toString();
        }
    }

    private static a a(Context context, String str, File file) {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        ZipFile zipFile = null;
        try {
            ZipFile zipFile2 = new ZipFile(new File(context.getApplicationInfo().sourceDir), 1);
            try {
                ZipEntry a2 = a(zipFile2, Build.CPU_ABI, str);
                if (a2 == null) {
                    try {
                        a2 = a(zipFile2, Build.CPU_ABI2, str);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = null;
                        fileOutputStream = null;
                        zipFile = zipFile2;
                        try {
                            return new a(3, th.getMessage());
                        } finally {
                            as.a(fileOutputStream);
                            as.a(inputStream);
                            as.a(zipFile);
                        }
                    }
                }
                if (a2 == null) {
                    a aVar = new a(2, a(zipFile2, str));
                    as.a((Closeable) null);
                    as.a((Closeable) null);
                    as.a(zipFile2);
                    return aVar;
                }
                file.createNewFile();
                InputStream inputStream2 = zipFile2.getInputStream(a2);
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[16384];
                        while (true) {
                            int read = inputStream2.read(bArr);
                            if (read <= 0) {
                                as.a(file.getAbsolutePath(), FacebookRequestErrorClassification.ESC_APP_INACTIVE);
                                as.a(fileOutputStream2);
                                as.a(inputStream2);
                                as.a(zipFile2);
                                return null;
                            }
                            fileOutputStream2.write(bArr, 0, read);
                        }
                    } catch (Throwable th2) {
                        zipFile = zipFile2;
                        inputStream = inputStream2;
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        return new a(3, th.getMessage());
                    }
                } catch (Throwable th3) {
                    inputStream = inputStream2;
                    th = th3;
                    fileOutputStream = null;
                    zipFile = zipFile2;
                    return new a(3, th.getMessage());
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            fileOutputStream = null;
        }
    }

    private static File a(Context context) {
        if (context == null || context.getFilesDir() == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "libso");
        if (!file.exists()) {
            as.a(file.getAbsolutePath());
        }
        return file;
    }

    private static File a(Context context, String str) {
        String mapLibraryName = System.mapLibraryName(str);
        File a2 = a(context);
        if (a2 != null) {
            return new File(a2, mapLibraryName);
        }
        return null;
    }

    private static String a(ZipFile zipFile, String str) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"armeabi-v7a", "arm64-v8a", "x86", "x86_64", "armeabi"};
        for (int i = 0; i < 5; i++) {
            String str2 = strArr[i];
            if (a(zipFile, str2, str) != null) {
                arrayList.add(str2);
            }
        }
        List asList = Arrays.asList(Build.SUPPORTED_ABIS);
        ArrayList arrayList2 = new ArrayList();
        String str3 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str3)) {
            arrayList2.add(str3);
        }
        String str4 = Build.CPU_ABI2;
        if (!TextUtils.isEmpty(str4)) {
            arrayList2.add(str4);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("supportedABIS", asList);
            jSONObject.put("curABIs", arrayList2);
            jSONObject.put("apkABIS", arrayList);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    private static ZipEntry a(ZipFile zipFile, String str, String str2) {
        ZipEntry entry = zipFile.getEntry("lib/" + str + "/" + System.mapLibraryName(str2));
        if (entry != null) {
            return entry;
        }
        int indexOf = str.indexOf(45);
        StringBuilder sb = new StringBuilder("lib/");
        if (indexOf <= 0) {
            indexOf = str.length();
        }
        return zipFile.getEntry(sb.append(str.substring(0, indexOf)).append("/").append(System.mapLibraryName(str2)).toString());
    }

    public static boolean a(String str) {
        return f11622a.contains(str);
    }

    public static synchronized a b(Context context, String str) {
        synchronized (av.class) {
            if (f11622a.contains(str)) {
                return null;
            }
            try {
                System.loadLibrary(str);
                f11622a.add(str);
            } catch (UnsatisfiedLinkError e) {
                File a2 = a(context, str);
                if (a2 == null) {
                    return new a(3, e.getMessage(), "output null");
                }
                if (a2.exists()) {
                    a2.delete();
                }
                a a3 = a(context, str, a2);
                if (a3 != null) {
                    return a3;
                }
                try {
                    System.load(a2.getAbsolutePath());
                    f11622a.add(str);
                } catch (Throwable th) {
                    return new a(3, e.getMessage(), th.getMessage());
                }
            } catch (Throwable th2) {
                return new a(3, th2.getMessage());
            }
            return null;
        }
    }

    public static void b(String str) {
        if (f11622a.contains(str)) {
            return;
        }
        try {
            System.loadLibrary(str);
            f11622a.add(str);
        } catch (Throwable unused) {
        }
    }
}
