package com.bytedance.adsdk.sf.oo;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class qf {
    private final vj pcc;

    public qf(vj vjVar) {
        this.pcc = vjVar;
    }

    Pair<gm, InputStream> pcc(String str) {
        gm gmVar;
        try {
            File sf = sf(str);
            if (sf == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(sf);
            if (sf.getAbsolutePath().endsWith(".zip")) {
                gmVar = gm.ZIP;
            } else {
                gmVar = gm.JSON;
            }
            sf.getAbsolutePath();
            return new Pair<>(gmVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    File pcc(String str, InputStream inputStream, gm gmVar) throws IOException {
        File file = new File(pcc(), pcc(str, gmVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        return file;
                    }
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }

    void pcc(String str, gm gmVar) {
        File file = new File(pcc(), pcc(str, gmVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        new StringBuilder("Copying temp file to real file (").append(file2);
        if (renameTo) {
            return;
        }
        file.getAbsolutePath();
        file2.getAbsolutePath();
    }

    private File sf(String str) throws FileNotFoundException {
        File file = new File(pcc(), pcc(str, gm.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(pcc(), pcc(str, gm.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    private File pcc() {
        File pcc = this.pcc.pcc();
        if (pcc.isFile()) {
            pcc.delete();
        }
        if (!pcc.exists()) {
            pcc.mkdirs();
        }
        return pcc;
    }

    private static String pcc(String str, gm gmVar, boolean z) {
        return "lottie_cache_" + str.replaceAll("\\W+", "") + (z ? gmVar.pcc() : gmVar.gm);
    }
}
