package androidx.core.app;

/* loaded from: classes.dex */
public class AppLocalesStorageHelper {
    static final java.lang.String APPLICATION_LOCALES_RECORD_FILE = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file";
    static final boolean DEBUG = false;
    static final java.lang.String LOCALE_RECORD_ATTRIBUTE_TAG = "application_locales";
    static final java.lang.String LOCALE_RECORD_FILE_TAG = "locales";
    static final java.lang.String TAG = "AppLocalesStorageHelper";
    private static final java.lang.Object sAppLocaleStorageSync = new java.lang.Object();

    private AppLocalesStorageHelper() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r2 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003a, code lost:
    
        r1 = r3.getAttributeValue(null, androidx.core.app.AppLocalesStorageHelper.LOCALE_RECORD_ATTRIBUTE_TAG);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0050, code lost:
    
        if (r2 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String readLocales(android.content.Context context) {
        java.lang.String str;
        synchronized (sAppLocaleStorageSync) {
            str = "";
            try {
                java.io.FileInputStream openFileInput = context.openFileInput(APPLICATION_LOCALES_RECORD_FILE);
                try {
                    try {
                        org.xmlpull.v1.XmlPullParser newPullParser = android.util.Xml.newPullParser();
                        newPullParser.setInput(openFileInput, "UTF-8");
                        int depth = newPullParser.getDepth();
                        while (true) {
                            int next = newPullParser.next();
                            if (next == 1 || (next == 3 && newPullParser.getDepth() <= depth)) {
                                break;
                            }
                            if (next != 3 && next != 4 && newPullParser.getName().equals(LOCALE_RECORD_FILE_TAG)) {
                                break;
                            }
                        }
                    } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
                        android.util.Log.w(TAG, "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    }
                } catch (java.lang.Throwable th) {
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (java.io.IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (java.io.FileNotFoundException unused3) {
                return "";
            }
        }
        return str;
        if (str.isEmpty()) {
            context.deleteFile(APPLICATION_LOCALES_RECORD_FILE);
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (r5 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004d, code lost:
    
        if (r5 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void persistLocales(android.content.Context context, java.lang.String str) {
        synchronized (sAppLocaleStorageSync) {
            if (str.equals("")) {
                context.deleteFile(APPLICATION_LOCALES_RECORD_FILE);
                return;
            }
            try {
                java.io.FileOutputStream openFileOutput = context.openFileOutput(APPLICATION_LOCALES_RECORD_FILE, 0);
                org.xmlpull.v1.XmlSerializer newSerializer = android.util.Xml.newSerializer();
                try {
                    try {
                        newSerializer.setOutput(openFileOutput, null);
                        newSerializer.startDocument("UTF-8", true);
                        newSerializer.startTag(null, LOCALE_RECORD_FILE_TAG);
                        newSerializer.attribute(null, LOCALE_RECORD_ATTRIBUTE_TAG, str);
                        newSerializer.endTag(null, LOCALE_RECORD_FILE_TAG);
                        newSerializer.endDocument();
                    } catch (java.lang.Throwable th) {
                        if (openFileOutput != null) {
                            try {
                                openFileOutput.close();
                            } catch (java.io.IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (java.lang.Exception e) {
                    android.util.Log.w(TAG, "Storing App Locales : Failed to persist app-locales in storage ", e);
                }
            } catch (java.io.FileNotFoundException unused2) {
                android.util.Log.w(TAG, java.lang.String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", APPLICATION_LOCALES_RECORD_FILE));
            }
        }
    }
}
