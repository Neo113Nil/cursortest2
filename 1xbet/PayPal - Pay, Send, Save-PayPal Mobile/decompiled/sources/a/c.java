package a;

/* loaded from: classes3.dex */
public final class c {
    public static boolean a(java.lang.String[] strArr, java.lang.String str) {
        if (strArr != null && str != null) {
            boolean isEmpty = str.isEmpty();
            for (java.lang.String str2 : strArr) {
                if ((!isEmpty ? new java.io.File(str2, str) : new java.io.File(str2)).exists()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static java.lang.String b(java.io.File file) {
        java.io.RandomAccessFile randomAccessFile;
        java.io.RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new java.io.RandomAccessFile(file, "r");
            } catch (java.lang.Throwable th) {
                th = th;
                randomAccessFile = null;
            }
        } catch (java.lang.Exception e) {
            e = e;
        }
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr);
            java.lang.String str = new java.lang.String(bArr, "UTF-8");
            lib.android.paypal.com.magnessdk.f.a(a.c.class, randomAccessFile);
            return str;
        } catch (java.lang.Exception e2) {
            e = e2;
            randomAccessFile2 = randomAccessFile;
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) a.c.class, 3, e);
            lib.android.paypal.com.magnessdk.f.a(a.c.class, randomAccessFile2);
            return "";
        } catch (java.lang.Throwable th2) {
            th = th2;
            lib.android.paypal.com.magnessdk.f.a(a.c.class, randomAccessFile);
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x003f: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:21:0x003f */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String c(java.io.File file) {
        java.io.BufferedReader bufferedReader;
        java.io.Closeable closeable;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.io.Closeable closeable2 = null;
        try {
            try {
                bufferedReader = new java.io.BufferedReader(new java.io.FileReader(file));
                while (true) {
                    try {
                        java.lang.String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    } catch (java.io.IOException e) {
                        e = e;
                        sb.append(lib.android.paypal.com.magnessdk.g.d);
                        lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) a.c.class, 3, e);
                        lib.android.paypal.com.magnessdk.f.a(a.c.class, bufferedReader);
                        if (sb.toString().isEmpty()) {
                        }
                    }
                }
            } catch (java.lang.Throwable th) {
                th = th;
                closeable2 = closeable;
                lib.android.paypal.com.magnessdk.f.a(a.c.class, closeable2);
                throw th;
            }
        } catch (java.io.IOException e2) {
            e = e2;
            bufferedReader = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            lib.android.paypal.com.magnessdk.f.a(a.c.class, closeable2);
            throw th;
        }
        lib.android.paypal.com.magnessdk.f.a(a.c.class, bufferedReader);
        if (sb.toString().isEmpty()) {
            return sb.toString();
        }
        return null;
    }

    public static void a(android.content.Context context, java.lang.String str) {
        android.content.SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.clear();
        edit.apply();
    }

    public static java.lang.String b(android.content.Context context, java.lang.String str) {
        return context.getSharedPreferences(str, 0).getString(str, "");
    }

    public static void c(android.content.Context context, java.lang.String str) {
        android.content.SharedPreferences sharedPreferences;
        android.content.SharedPreferences.Editor edit;
        if (context == null || str == null || (sharedPreferences = context.getSharedPreferences(str, 0)) == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.remove(str);
        edit.apply();
    }

    public static boolean a(java.io.File file) {
        try {
            if (file.exists()) {
                lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) a.c.class, 0, "deleting CachedConfigDataFromDisk");
                return file.delete();
            }
        } catch (java.lang.Exception e) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) a.c.class, 3, e);
        }
        return false;
    }

    public static void b(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences sharedPreferences;
        android.content.SharedPreferences.Editor edit;
        if (context == null || str == null || str2 == null || (sharedPreferences = context.getSharedPreferences(str, 0)) == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.putString(str, str2);
        edit.apply();
    }

    public static java.lang.String a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return context.getSharedPreferences(str, 0).getString(str2, "");
    }

    public static boolean a(java.io.File file, java.lang.String str) {
        java.io.FileOutputStream fileOutputStream;
        java.io.FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new java.io.FileOutputStream(file);
            } catch (java.lang.Exception e) {
                e = e;
            }
        } catch (java.lang.Throwable th) {
            th = th;
            fileOutputStream = fileOutputStream2;
        }
        try {
            fileOutputStream.write(str.getBytes("UTF-8"));
            lib.android.paypal.com.magnessdk.f.a(a.c.class, fileOutputStream);
            return true;
        } catch (java.lang.Exception e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) a.c.class, 3, e);
            lib.android.paypal.com.magnessdk.f.a(a.c.class, fileOutputStream2);
            return false;
        } catch (java.lang.Throwable th2) {
            th = th2;
            lib.android.paypal.com.magnessdk.f.a(a.c.class, fileOutputStream);
            throw th;
        }
    }

    public static void a(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.content.SharedPreferences sharedPreferences;
        android.content.SharedPreferences.Editor edit;
        if (context == null || str2 == null || str3 == null || (sharedPreferences = context.getSharedPreferences(str, 0)) == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.putString(str2, str3);
        edit.apply();
    }

    private c() {
    }
}
