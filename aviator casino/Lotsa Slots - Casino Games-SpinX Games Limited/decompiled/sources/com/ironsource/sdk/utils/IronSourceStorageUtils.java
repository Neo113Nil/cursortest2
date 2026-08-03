package com.ironsource.sdk.utils;

/* loaded from: classes5.dex */
public class IronSourceStorageUtils {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f6723a = "supersonicads";
    private static com.ironsource.Bf b = null;
    private static boolean c = false;

    private static void a(android.content.Context context) {
        com.ironsource.Bf bf = b;
        if (bf != null && bf.b()) {
            deleteCacheDirectories(context);
        }
        com.ironsource.Bf bf2 = b;
        if (bf2 == null || !bf2.c()) {
            return;
        }
        deleteFilesDirectories(context);
    }

    private static java.io.File b(android.content.Context context) {
        com.ironsource.InterfaceC3362x7 a2 = com.ironsource.Jb.Y().a();
        com.ironsource.Bf bf = b;
        return (bf == null || !bf.d()) ? a2.g(context) : a2.m(context);
    }

    public static java.lang.String buildAbsolutePathToDirInCache(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            return str;
        }
        return str + java.io.File.separator + str2;
    }

    public static org.json.JSONObject buildFilesMap(java.lang.String str, java.lang.String str2) {
        java.io.File file = new java.io.File(str, str2);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.io.File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (java.io.File file2 : listFiles) {
                try {
                    java.lang.Object c2 = c(file2);
                    if (c2 instanceof org.json.JSONArray) {
                        jSONObject.put("files", c(file2));
                    } else if (c2 instanceof org.json.JSONObject) {
                        jSONObject.put(file2.getName(), c(file2));
                    }
                } catch (org.json.JSONException e) {
                    com.ironsource.C3180n4.d().a(e);
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
                }
            }
        }
        return jSONObject;
    }

    public static org.json.JSONObject buildFilesMapOfDirectory(com.ironsource.C3381y8 c3381y8, org.json.JSONObject jSONObject) throws java.lang.Exception {
        if (c3381y8 == null || !c3381y8.isDirectory()) {
            return new org.json.JSONObject();
        }
        java.io.File[] listFiles = c3381y8.listFiles();
        if (listFiles == null) {
            return new org.json.JSONObject();
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        for (java.io.File file : listFiles) {
            com.ironsource.C3381y8 c3381y82 = new com.ironsource.C3381y8(file.getPath());
            if (c3381y82.isFile()) {
                java.lang.String name = c3381y82.getName();
                org.json.JSONObject a2 = c3381y82.a();
                if (jSONObject.has(name)) {
                    jSONObject2.put(name, com.ironsource.sdk.utils.SDKUtils.mergeJSONObjects(a2, jSONObject.getJSONObject(name)));
                } else {
                    jSONObject2.put(name, a2);
                }
            } else if (c3381y82.isDirectory()) {
                jSONObject2.put(c3381y82.getName(), buildFilesMapOfDirectory(c3381y82, jSONObject));
            }
        }
        return jSONObject2;
    }

    private static java.io.File c(android.content.Context context) {
        com.ironsource.InterfaceC3362x7 a2 = com.ironsource.Jb.Y().a();
        com.ironsource.Bf bf = b;
        return (bf == null || !bf.d()) ? a2.k(context) : a2.C(context);
    }

    public static void deleteCacheDirectories(android.content.Context context) {
        com.ironsource.InterfaceC3362x7 a2 = com.ironsource.Jb.Y().a();
        a(a2.m(context));
        a(a2.C(context));
    }

    public static synchronized boolean deleteFile(com.ironsource.C3381y8 c3381y8) {
        synchronized (com.ironsource.sdk.utils.IronSourceStorageUtils.class) {
            if (!c3381y8.exists()) {
                return false;
            }
            return c3381y8.delete();
        }
    }

    public static void deleteFilesDirectories(android.content.Context context) {
        com.ironsource.InterfaceC3362x7 a2 = com.ironsource.Jb.Y().a();
        a(a2.g(context));
        a(a2.k(context));
    }

    public static synchronized boolean deleteFolder(java.lang.String str) {
        boolean z;
        synchronized (com.ironsource.sdk.utils.IronSourceStorageUtils.class) {
            java.io.File file = new java.io.File(str);
            if (deleteFolderContentRecursive(file)) {
                z = file.delete();
            }
        }
        return z;
    }

    public static boolean deleteFolderContentRecursive(java.io.File file) {
        java.io.File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (java.io.File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z &= deleteFolderContentRecursive(file2);
                }
                if (!file2.delete()) {
                    z = false;
                }
            }
        }
        return z;
    }

    public static void ensurePathSafety(java.io.File file, java.lang.String str) throws java.lang.Exception {
        com.ironsource.Bf bf = b;
        if (bf == null || !bf.e()) {
            java.lang.String canonicalPath = new java.io.File(str).getCanonicalPath();
            java.lang.String canonicalPath2 = file.getCanonicalPath();
            if (canonicalPath2.startsWith(canonicalPath)) {
                return;
            }
            throw new java.lang.Exception(com.ironsource.X3.c.u + canonicalPath2);
        }
    }

    public static java.lang.String getCachedFilesMap(java.lang.String str, java.lang.String str2) {
        org.json.JSONObject buildFilesMap = buildFilesMap(str, str2);
        try {
            buildFilesMap.put("path", str2);
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        return buildFilesMap.toString();
    }

    public static java.lang.String getDiskCacheDirPath(android.content.Context context) {
        java.io.File b2;
        if (!a() || !com.ironsource.sdk.utils.SDKUtils.isExternalStorageAvailable() || (b2 = b(context)) == null || !b2.canWrite()) {
            return c(context).getPath();
        }
        c = true;
        return b2.getPath();
    }

    public static java.util.ArrayList<com.ironsource.C3381y8> getFilesInFolderRecursive(com.ironsource.C3381y8 c3381y8) {
        if (c3381y8 == null || !c3381y8.isDirectory()) {
            return new java.util.ArrayList<>();
        }
        java.util.ArrayList<com.ironsource.C3381y8> arrayList = new java.util.ArrayList<>();
        java.io.File[] listFiles = c3381y8.listFiles();
        if (listFiles != null) {
            for (java.io.File file : listFiles) {
                com.ironsource.C3381y8 c3381y82 = new com.ironsource.C3381y8(file.getPath());
                if (c3381y82.isDirectory()) {
                    arrayList.addAll(getFilesInFolderRecursive(c3381y82));
                }
                if (c3381y82.isFile()) {
                    arrayList.add(c3381y82);
                }
            }
        }
        return arrayList;
    }

    public static java.lang.String getNetworkStorageDir(android.content.Context context) {
        java.io.File b2 = b(new java.io.File(getDiskCacheDirPath(context)));
        if (!b2.exists()) {
            b2.mkdir();
        }
        return b2.getPath();
    }

    public static long getTotalSizeOfDir(com.ironsource.C3381y8 c3381y8) {
        long totalSizeOfDir;
        long j = 0;
        if (c3381y8 != null && c3381y8.isDirectory()) {
            java.io.File[] listFiles = c3381y8.listFiles();
            if (listFiles == null) {
                return 0L;
            }
            for (java.io.File file : listFiles) {
                com.ironsource.C3381y8 c3381y82 = new com.ironsource.C3381y8(file.getPath());
                if (c3381y82.isFile()) {
                    totalSizeOfDir = c3381y82.length();
                } else if (c3381y82.isDirectory()) {
                    totalSizeOfDir = getTotalSizeOfDir(c3381y82);
                }
                j += totalSizeOfDir;
            }
        }
        return j;
    }

    public static void initializeCacheDirectory(android.content.Context context, com.ironsource.Bf bf) {
        b = bf;
        a(context);
    }

    public static boolean isPathExist(java.lang.String str, java.lang.String str2) {
        return new java.io.File(str, str2).exists();
    }

    public static boolean isUxt() {
        return c;
    }

    public static java.lang.String makeDir(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (file.exists() || file.mkdirs()) {
            return file.getPath();
        }
        return null;
    }

    public static java.lang.String readFile(com.ironsource.C3381y8 c3381y8) throws java.lang.Exception {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(c3381y8));
        while (true) {
            java.lang.String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(readLine);
            sb.append('\n');
        }
    }

    public static boolean renameFile(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        java.io.File file = new java.io.File(str);
        java.io.File file2 = new java.io.File(str2);
        java.io.File parentFile = file2.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            return file.renameTo(file2);
        }
        return false;
    }

    public static int saveFile(byte[] bArr, java.lang.String str) throws java.lang.Exception {
        java.io.File file = new java.io.File(str);
        java.io.File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            return 0;
        }
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        try {
            byte[] bArr2 = new byte[102400];
            int i = 0;
            while (true) {
                int read = byteArrayInputStream.read(bArr2);
                if (read == -1) {
                    return i;
                }
                fileOutputStream.write(bArr2, 0, read);
                i += read;
            }
        } finally {
            fileOutputStream.close();
            byteArrayInputStream.close();
        }
    }

    private static void a(java.io.File file) {
        if (file != null) {
            deleteFolder(b(file).getPath());
        }
    }

    private static java.io.File b(java.io.File file) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(file.getAbsolutePath());
        java.lang.String str = java.io.File.separator;
        sb.append(str);
        sb.append(f6723a);
        sb.append(str);
        return new java.io.File(sb.toString());
    }

    private static java.lang.Object c(java.io.File file) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        if (file.isFile()) {
            jSONArray.put(file.getName());
            return jSONArray;
        }
        for (java.io.File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                jSONObject.put(file2.getName(), c(file2));
            } else {
                jSONArray.put(file2.getName());
                jSONObject.put("files", jSONArray);
            }
        }
        return jSONObject;
    }

    private static boolean a() {
        com.ironsource.Bf bf;
        return android.os.Build.VERSION.SDK_INT > 29 && (bf = b) != null && bf.a();
    }
}
