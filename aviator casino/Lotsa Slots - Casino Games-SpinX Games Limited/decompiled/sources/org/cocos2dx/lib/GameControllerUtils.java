package org.cocos2dx.lib;

/* loaded from: classes6.dex */
public class GameControllerUtils {
    public static void ensureDirectoryExist(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static java.lang.String readJsonFile(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            return null;
        }
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            fileInputStream.close();
            return new java.lang.String(bArr, "UTF-8");
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
