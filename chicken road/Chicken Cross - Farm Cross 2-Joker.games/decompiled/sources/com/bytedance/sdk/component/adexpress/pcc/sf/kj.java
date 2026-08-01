package com.bytedance.sdk.component.adexpress.pcc.sf;

import com.ironsource.C4761z5;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class kj {
    private static com.bytedance.sdk.component.adexpress.pcc.gm.pcc pcc;

    public static void pcc() {
        FileInputStream fileInputStream = null;
        try {
            File file = new File(vj.kj(), "temp_pkg_info.json");
            Long valueOf = Long.valueOf(file.length());
            if (valueOf.longValue() > 0 && file.exists() && file.isFile()) {
                byte[] bArr = new byte[valueOf.intValue()];
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    fileInputStream2.read(bArr);
                    com.bytedance.sdk.component.adexpress.pcc.gm.pcc pcc2 = com.bytedance.sdk.component.adexpress.pcc.gm.pcc.pcc(new JSONObject(new String(bArr, C4761z5.O)));
                    if (pcc2 != null) {
                        pcc = pcc2;
                        pcc.gm();
                    }
                    fileInputStream = fileInputStream2;
                } catch (Throwable unused) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                            return;
                        } catch (IOException unused2) {
                            return;
                        }
                    }
                    return;
                }
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public static synchronized com.bytedance.sdk.component.adexpress.pcc.gm.pcc sf() {
        com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar;
        synchronized (kj.class) {
            pccVar = pcc;
        }
        return pccVar;
    }

    public static synchronized void pcc(com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar) {
        synchronized (kj.class) {
            if (pccVar != null) {
                if (pccVar.kj()) {
                    pcc = pccVar;
                }
            }
        }
    }

    public static void gm() {
        vj.pcc(vj.kj(), sf(), "temp_pkg_info.json");
    }

    public static boolean pcc(String str) {
        return vj.pcc(sf(), str);
    }

    public static boolean sf(com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar) {
        return vj.gm(sf(), pccVar);
    }

    public static void oo() {
        vj.sf(vj.kj(), sf(), "temp_pkg_info.json");
        pcc = null;
    }
}
