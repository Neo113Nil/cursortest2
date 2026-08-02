package com.microblink.blinkid.util;

/* loaded from: classes10.dex */
public class FileLog implements com.microblink.blinkid.util.Log.LogWriter {
    private static java.lang.String getHighSpeedVideoFpsRanges;
    private java.io.PrintWriter Camera2StreamConfigurationMap;

    private FileLog(android.content.Context context) {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i < 29) {
            try {
                java.io.File file = new java.io.File(getLogFolder(context));
                file.mkdirs();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(file.getAbsolutePath());
                sb.append("/javaLog.txt");
                this.Camera2StreamConfigurationMap = new java.io.PrintWriter(new java.io.BufferedWriter(new java.io.FileWriter(sb.toString(), true)));
                return;
            } catch (java.io.IOException unused) {
                this.Camera2StreamConfigurationMap = null;
                return;
            }
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("_display_name", "javaLog.txt");
        contentValues.put("mime_type", "text/plain");
        contentValues.put("relative_path", "Documents/microblink");
        contentValues.put("is_pending", (java.lang.Integer) 1);
        android.content.ContentResolver contentResolver = context.getContentResolver();
        android.net.Uri contentUri = android.provider.MediaStore.Files.getContentUri("external_primary");
        android.net.Uri insert = contentResolver.insert(contentUri, contentValues);
        if (insert == null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("android:query-arg-sql-selection", "_display_name = ? AND relative_path = ?");
            bundle.putStringArray("android:query-arg-sql-selection-args", new java.lang.String[]{"javaLog.txt", "Documents/microblink/"});
            if (i >= 30) {
                bundle.putInt("android:query-arg-match-pending", 1);
            }
            android.database.Cursor query = contentResolver.query(i < 30 ? android.provider.MediaStore.setIncludePending(contentUri) : contentUri, new java.lang.String[]{"_id"}, bundle, null);
            if (query.getCount() == 1) {
                query.moveToFirst();
                insert = android.net.Uri.withAppendedPath(contentUri, query.getString(0));
            }
            query.close();
        }
        try {
            this.Camera2StreamConfigurationMap = new java.io.PrintWriter(new java.io.BufferedWriter(new java.io.OutputStreamWriter(contentResolver.openOutputStream(insert))));
        } catch (java.io.FileNotFoundException unused2) {
            this.Camera2StreamConfigurationMap = null;
        } finally {
            contentValues.clear();
            contentValues.put("is_pending", (java.lang.Integer) 0);
            contentResolver.update(insert, contentValues, null, null);
        }
    }

    public static void disableFileLogging() {
        synchronized (com.microblink.blinkid.util.FileLog.class) {
            com.microblink.blinkid.util.FileLog fileLog = (com.microblink.blinkid.util.FileLog) com.microblink.blinkid.util.Log.getLogWriter();
            if (fileLog != null) {
                synchronized (fileLog) {
                    java.io.PrintWriter printWriter = fileLog.Camera2StreamConfigurationMap;
                    if (printWriter != null) {
                        printWriter.close();
                        fileLog.Camera2StreamConfigurationMap = null;
                    }
                }
                com.microblink.blinkid.util.Log.setLogWriter(null);
            }
        }
    }

    public static void enableFileLogging(android.content.Context context) {
        synchronized (com.microblink.blinkid.util.FileLog.class) {
            com.microblink.blinkid.util.Log.setLogWriter(new com.microblink.blinkid.util.FileLog(context));
        }
    }

    public static java.lang.String getLogFolder(android.content.Context context) {
        java.lang.String str;
        synchronized (com.microblink.blinkid.util.FileLog.class) {
            if (getHighSpeedVideoFpsRanges == null) {
                java.lang.String obj = android.os.Environment.getExternalStorageState().equals("mounted") ? android.os.Environment.getExternalStorageDirectory().toString() : context != null ? context.getCacheDir().getAbsolutePath() : android.os.Environment.getDataDirectory().getAbsolutePath();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(obj);
                sb.append("/Documents/microblink");
                getHighSpeedVideoFpsRanges = sb.toString();
                com.microblink.blinkid.util.Log.getCurrentLogLevel();
                com.microblink.blinkid.util.Log.LogLevel logLevel = com.microblink.blinkid.util.Log.LogLevel.LOG_INFORMATION;
            }
            str = getHighSpeedVideoFpsRanges;
        }
        return str;
    }

    @Override // com.microblink.blinkid.util.Log.LogWriter
    public void writeLog(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Throwable th) {
        synchronized (this) {
            java.io.PrintWriter printWriter = this.Camera2StreamConfigurationMap;
            if (printWriter != null) {
                printWriter.write(str);
                java.sql.Timestamp timestamp = new java.sql.Timestamp(new java.util.Date().getTime());
                this.Camera2StreamConfigurationMap.write(" (");
                this.Camera2StreamConfigurationMap.write(timestamp.toString());
                this.Camera2StreamConfigurationMap.write(") [");
                this.Camera2StreamConfigurationMap.write(str2);
                this.Camera2StreamConfigurationMap.write("] ");
                this.Camera2StreamConfigurationMap.write(str3);
                this.Camera2StreamConfigurationMap.write(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                if (th != null) {
                    th.printStackTrace(this.Camera2StreamConfigurationMap);
                }
                this.Camera2StreamConfigurationMap.flush();
            }
        }
    }
}
