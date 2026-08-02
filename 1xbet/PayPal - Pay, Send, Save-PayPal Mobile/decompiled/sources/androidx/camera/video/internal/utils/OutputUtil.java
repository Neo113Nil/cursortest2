package androidx.camera.video.internal.utils;

/* loaded from: classes6.dex */
public final class OutputUtil {
    private OutputUtil() {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String getAbsolutePathFromUri(android.content.ContentResolver contentResolver, android.net.Uri uri, java.lang.String str) {
        java.lang.RuntimeException e;
        android.database.Cursor cursor;
        android.database.Cursor cursor2 = null;
        try {
            cursor = contentResolver.query(uri, new java.lang.String[]{str}, null, null, null);
            if (cursor == null) {
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
            try {
                try {
                    int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
                    cursor.moveToFirst();
                    java.lang.String string = cursor.getString(columnIndexOrThrow);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return string;
                } catch (java.lang.RuntimeException e2) {
                    e = e2;
                    androidx.camera.core.Logger.e("OutputUtil", java.lang.String.format("Failed in getting absolute path for Uri %s with Exception %s", uri.toString(), e.toString()));
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                cursor2 = cursor;
                th = th;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (java.lang.RuntimeException e3) {
            e = e3;
            cursor = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    public static boolean createParentFolder(java.io.File file) {
        java.io.File parentFile = file.getParentFile();
        if (parentFile == null) {
            return false;
        }
        return parentFile.exists() ? parentFile.isDirectory() : parentFile.mkdirs();
    }
}
