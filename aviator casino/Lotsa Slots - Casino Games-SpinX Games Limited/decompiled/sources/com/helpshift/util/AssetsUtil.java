package com.helpshift.util;

/* loaded from: classes5.dex */
public class AssetsUtil {
    private static final java.lang.String TAG = "astsUtl";

    private AssetsUtil() {
    }

    public static boolean resourceExists(android.content.Context context, int i) {
        if (context == null || i == 0) {
            return false;
        }
        try {
            return context.getResources().getResourceName(i) != null;
        } catch (android.content.res.Resources.NotFoundException unused) {
            return false;
        }
    }

    public static java.lang.String readAssetFileContents(android.content.Context context, java.lang.String str) {
        if (context == null) {
            return "";
        }
        try {
            java.io.InputStream open = context.getAssets().open(str);
            try {
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(open));
                try {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    while (true) {
                        java.lang.String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    }
                    java.lang.String sb2 = sb.toString();
                    bufferedReader.close();
                    if (open != null) {
                        open.close();
                    }
                    return sb2;
                } finally {
                }
            } finally {
            }
        } catch (java.lang.Exception e) {
            android.util.Log.e(TAG, "Error in reading the file contents", e);
            return "";
        }
    }
}
