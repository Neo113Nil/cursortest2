package androidx.documentfile.provider;

/* loaded from: classes7.dex */
class DocumentsContractApi19 {
    public static boolean getInputSizeshNQ4ISI(android.content.Context context, android.net.Uri uri) {
        return android.provider.DocumentsContract.isDocumentUri(context, uri) && (getHighSpeedVideoSizes(context, uri) & 512) != 0;
    }

    public static java.lang.String Camera2StreamConfigurationMap(android.content.Context context, android.net.Uri uri) {
        return getHighSpeedVideoFpsRanges(context, uri, "_display_name", null);
    }

    private static java.lang.String getOutputMinFrameDurationlomOqCM(android.content.Context context, android.net.Uri uri) {
        return getHighSpeedVideoFpsRanges(context, uri, "mime_type", null);
    }

    public static java.lang.String getInputFormats(android.content.Context context, android.net.Uri uri) {
        java.lang.String outputMinFrameDurationlomOqCM = getOutputMinFrameDurationlomOqCM(context, uri);
        if ("vnd.android.document/directory".equals(outputMinFrameDurationlomOqCM)) {
            return null;
        }
        return outputMinFrameDurationlomOqCM;
    }

    public static long getHighSpeedVideoSizes(android.content.Context context, android.net.Uri uri) {
        return getHighResolutionOutputSizeshNQ4ISI(context, uri, "flags", 0L);
    }

    public static boolean getHighSpeedVideoSizesFor(android.content.Context context, android.net.Uri uri) {
        return "vnd.android.document/directory".equals(getOutputMinFrameDurationlomOqCM(context, uri));
    }

    public static boolean getOutputMinFrameDuration(android.content.Context context, android.net.Uri uri) {
        java.lang.String outputMinFrameDurationlomOqCM = getOutputMinFrameDurationlomOqCM(context, uri);
        return ("vnd.android.document/directory".equals(outputMinFrameDurationlomOqCM) || android.text.TextUtils.isEmpty(outputMinFrameDurationlomOqCM)) ? false : true;
    }

    public static long getOutputFormats(android.content.Context context, android.net.Uri uri) {
        return getHighResolutionOutputSizeshNQ4ISI(context, uri, "last_modified", 0L);
    }

    public static long getOutputSizeshNQ4ISI(android.content.Context context, android.net.Uri uri) {
        return getHighResolutionOutputSizeshNQ4ISI(context, uri, "_size", 0L);
    }

    public static boolean getHighSpeedVideoFpsRanges(android.content.Context context, android.net.Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !android.text.TextUtils.isEmpty(getOutputMinFrameDurationlomOqCM(context, uri));
    }

    public static boolean getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, android.net.Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        java.lang.String outputMinFrameDurationlomOqCM = getOutputMinFrameDurationlomOqCM(context, uri);
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(context, uri, "flags", 0);
        if (android.text.TextUtils.isEmpty(outputMinFrameDurationlomOqCM)) {
            return false;
        }
        if ((Camera2StreamConfigurationMap & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(outputMinFrameDurationlomOqCM) || (Camera2StreamConfigurationMap & 8) == 0) {
            return (android.text.TextUtils.isEmpty(outputMinFrameDurationlomOqCM) || (Camera2StreamConfigurationMap & 2) == 0) ? false : true;
        }
        return true;
    }

    public static boolean getHighSpeedVideoFpsRangesFor(android.content.Context context, android.net.Uri uri) {
        android.database.Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new java.lang.String[]{"document_id"}, null, null, null);
            return cursor.getCount() > 0;
        } catch (java.lang.Exception unused) {
            return false;
        } finally {
            getHighSpeedVideoSizes(cursor);
        }
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(android.content.Context context, android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        android.content.ContentResolver contentResolver = context.getContentResolver();
        android.database.Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, new java.lang.String[]{str}, null, null, null);
            return (!cursor.moveToFirst() || cursor.isNull(0)) ? str2 : cursor.getString(0);
        } catch (java.lang.Exception unused) {
            return str2;
        } finally {
            getHighSpeedVideoSizes(cursor);
        }
    }

    private static int Camera2StreamConfigurationMap(android.content.Context context, android.net.Uri uri, java.lang.String str, int i) {
        return (int) getHighResolutionOutputSizeshNQ4ISI(context, uri, str, i);
    }

    private static long getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, android.net.Uri uri, java.lang.String str, long j) {
        android.content.ContentResolver contentResolver = context.getContentResolver();
        android.database.Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, new java.lang.String[]{str}, null, null, null);
            return (!cursor.moveToFirst() || cursor.isNull(0)) ? j : cursor.getLong(0);
        } catch (java.lang.Exception unused) {
            return j;
        } finally {
            getHighSpeedVideoSizes(cursor);
        }
    }

    private static void getHighSpeedVideoSizes(java.lang.AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9182m((java.lang.Object) autoCloseable);
            } catch (java.lang.RuntimeException e) {
                throw e;
            } catch (java.lang.Exception unused) {
            }
        }
    }

    private DocumentsContractApi19() {
    }
}
