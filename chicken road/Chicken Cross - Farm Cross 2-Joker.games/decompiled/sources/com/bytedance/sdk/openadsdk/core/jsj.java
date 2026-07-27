package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class jsj {
    private static final AtomicInteger gm;
    private static final AtomicInteger oo;
    private static final AtomicInteger pcc;
    private static final AtomicInteger sf;

    static {
        AtomicInteger atomicInteger = new AtomicInteger();
        pcc = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        sf = atomicInteger2;
        AtomicInteger atomicInteger3 = new AtomicInteger();
        gm = atomicInteger3;
        AtomicInteger atomicInteger4 = new AtomicInteger();
        oo = atomicInteger4;
        atomicInteger.addAndGet(com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("encrypt_statistics_file", "encrypt_success_count", 0));
        atomicInteger2.addAndGet(com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("encrypt_statistics_file", "encrypt_fail_count", 0));
        atomicInteger3.addAndGet(com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("encrypt_statistics_file", "decrypt_success_count", 0));
        atomicInteger4.addAndGet(com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("encrypt_statistics_file", "decrypt_fail_count", 0));
    }

    public static void pcc() {
        try {
            long pcc2 = com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("encrypt_statistics_file", "upload_time_key", 0L);
            if (pcc2 <= 0 || System.currentTimeMillis() - pcc2 < 86400000) {
                if (pcc2 <= 0 || pcc2 > System.currentTimeMillis()) {
                    com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
                    return;
                }
                return;
            }
            sf();
            synchronized (jsj.class) {
                pcc.set(0);
                sf.set(0);
                gm.set(0);
                oo.set(0);
                com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("encrypt_statistics_file");
                com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable unused) {
        }
    }

    private static void sf() {
        final int i = pcc.get();
        final int i2 = sf.get();
        final int i3 = gm.get();
        final int i4 = oo.get();
        com.bytedance.sdk.openadsdk.dax.oo.pcc("crypt_v4_statistics", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.core.jsj.1
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("encrypt_success_count", i);
                    jSONObject.put("encrypt_fail_count", i2);
                    jSONObject.put("decrypt_success_count", i3);
                    jSONObject.put("decrypt_fail_count", i4);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("crypt_v4_statistics").sf(jSONObject.toString());
            }
        });
    }

    public static void pcc(final int i, final PangleEncryptConstant.CryptDataScene cryptDataScene, final int i2) {
        com.bytedance.sdk.openadsdk.dax.oo.pcc("crypt_v4_fail", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.core.jsj.2
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crypt", i);
                    jSONObject.put("scene", cryptDataScene.value());
                    jSONObject.put("reason", i2);
                    if (i2 == 6) {
                        jSONObject.put("model", Build.MODEL);
                        jSONObject.put("vendor", Build.MANUFACTURER);
                    }
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("crypt_v4_fail").sf(jSONObject.toString());
            }
        });
    }

    public static synchronized void pcc(boolean z) {
        synchronized (jsj.class) {
            if (z) {
                com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("encrypt_statistics_file", "decrypt_success_count", Integer.valueOf(gm.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("encrypt_statistics_file", "decrypt_fail_count", Integer.valueOf(gm.incrementAndGet()));
            }
        }
    }

    public static void pcc(JSONObject jSONObject) {
        sf(jSONObject != null && jSONObject.optInt("cypher") == 4);
    }

    public static synchronized void sf(boolean z) {
        synchronized (jsj.class) {
            if (z) {
                com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("encrypt_statistics_file", "encrypt_success_count", Integer.valueOf(pcc.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("encrypt_statistics_file", "encrypt_fail_count", Integer.valueOf(sf.incrementAndGet()));
            }
        }
    }
}
