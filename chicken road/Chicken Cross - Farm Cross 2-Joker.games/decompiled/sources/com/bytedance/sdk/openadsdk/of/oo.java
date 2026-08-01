package com.bytedance.sdk.openadsdk.of;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public enum oo {
    UTF8(26, "UTF-8");

    private final int[] oo;
    private final String[] vj;
    private static final Map<Integer, oo> sf = new HashMap();
    private static final Map<String, oo> gm = new HashMap();

    static {
        for (oo ooVar : values()) {
            if (Charset.isSupported(ooVar.name())) {
                for (int i : ooVar.oo) {
                    sf.put(Integer.valueOf(i), ooVar);
                }
                gm.put(ooVar.name(), ooVar);
                for (String str : ooVar.vj) {
                    gm.put(str, ooVar);
                }
            }
        }
    }

    oo(int i, String... strArr) {
        this.oo = new int[]{i};
        this.vj = strArr;
    }

    public int pcc() {
        return this.oo[0];
    }

    public static oo pcc(Charset charset) {
        return gm.get(charset.name());
    }
}
