package androidx.core.app;

/* loaded from: classes3.dex */
public class AppLocalesStorageHelper {
    private static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();

    private AppLocalesStorageHelper() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r2 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0039, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004a, code lost:
    
        if (r2 != null) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String readLocales(android.content.Context context) {
        java.lang.String str;
        synchronized (getHighResolutionOutputSizeshNQ4ISI) {
            str = "";
            try {
                java.io.FileInputStream openFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                try {
                    org.xmlpull.v1.XmlPullParser newPullParser = android.util.Xml.newPullParser();
                    newPullParser.setInput(openFileInput, "UTF-8");
                    int depth = newPullParser.getDepth();
                    while (true) {
                        int next = newPullParser.next();
                        if (next == 1 || (next == 3 && newPullParser.getDepth() <= depth)) {
                            break;
                        }
                        if (next != 3 && next != 4 && newPullParser.getName().equals("locales")) {
                            break;
                        }
                    }
                } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
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
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r5 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r5 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void persistLocales(android.content.Context context, java.lang.String str) {
        synchronized (getHighResolutionOutputSizeshNQ4ISI) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                java.io.FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                org.xmlpull.v1.XmlSerializer newSerializer = android.util.Xml.newSerializer();
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument("UTF-8", java.lang.Boolean.TRUE);
                    newSerializer.startTag(null, "locales");
                    newSerializer.attribute(null, "application_locales", str);
                    newSerializer.endTag(null, "locales");
                    newSerializer.endDocument();
                } catch (java.lang.Exception unused) {
                } catch (java.lang.Throwable th) {
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (java.io.IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (java.io.FileNotFoundException unused3) {
            }
        }
    }
}
