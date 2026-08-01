package sg.bigo.ads.K0;

import java.io.File;
import java.io.IOException;

/* renamed from: sg.bigo.ads.K0.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4964v {
    public static long a(int i, long j) {
        char c;
        if (i == 2) {
            c = '\n';
        } else if (i == 3) {
            c = 20;
        } else {
            if (i != 4) {
                return j;
            }
            c = 30;
        }
        return j >> c;
    }

    public static void a(String str, String str2) {
        File file = new File(str);
        File file2 = new File(str, str2);
        try {
            boolean mkdirs = !file.exists() ? file.mkdirs() : true;
            if (file2.exists() || !mkdirs) {
                return;
            }
            file2.createNewFile();
        } catch (IOException unused) {
        }
    }

    public static void a(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2 != null) {
                    if (file2.isDirectory()) {
                        a(file2);
                    } else if (file2.exists()) {
                        file2.delete();
                    }
                }
            }
        }
        if (file.exists()) {
            file.delete();
        }
    }

    public static long a(int i, String str) {
        File file = new File(str);
        if (file.exists()) {
            return a(i, file.length());
        }
        return 0L;
    }

    public static boolean a(String str) {
        if (I.a((CharSequence) str)) {
            return false;
        }
        return new File(str).exists();
    }
}
