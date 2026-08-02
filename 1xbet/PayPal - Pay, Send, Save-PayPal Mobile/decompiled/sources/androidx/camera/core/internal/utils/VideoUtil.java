package androidx.camera.core.internal.utils;

/* loaded from: classes6.dex */
public final class VideoUtil {
    private VideoUtil() {
    }

    public static java.lang.String getAbsolutePathFromUri(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        java.lang.Throwable th;
        android.database.Cursor cursor;
        java.lang.RuntimeException e;
        android.database.Cursor cursor2 = null;
        try {
            try {
                cursor2 = contentResolver.query(uri, new java.lang.String[]{"_data"}, null, null, null);
                cursor = (android.database.Cursor) androidx.core.util.Preconditions.checkNotNull(cursor2);
            } catch (java.lang.RuntimeException e2) {
                e = e2;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            cursor = cursor2;
        }
        try {
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_data");
            cursor.moveToFirst();
            java.lang.String string = cursor.getString(columnIndexOrThrow);
            if (cursor != null) {
                cursor.close();
            }
            return string;
        } catch (java.lang.RuntimeException e3) {
            e = e3;
            cursor2 = cursor;
            androidx.camera.core.Logger.e("VideoUtil", java.lang.String.format("Failed in getting absolute path for Uri %s with Exception %s", uri.toString(), e.toString()));
            if (cursor2 == null) {
                return "";
            }
            cursor2.close();
            return "";
        } catch (java.lang.Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
