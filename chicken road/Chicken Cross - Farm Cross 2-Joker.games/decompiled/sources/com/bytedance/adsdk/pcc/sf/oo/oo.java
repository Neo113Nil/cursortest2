package com.bytedance.adsdk.pcc.sf.oo;

import com.ironsource.U3;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum oo implements vj {
    LEFT_PAREN("("),
    RIGHT_PAREN(")"),
    LEFT_BRACKET(U3.j.d),
    RIGHT_BRACKET(U3.j.e),
    COMMA(",");

    private static final Map<String, oo> wh;
    private final String qf;

    static {
        HashMap hashMap = new HashMap(128);
        wh = hashMap;
        for (oo ooVar : hashMap.values()) {
            wh.put(ooVar.pcc(), ooVar);
        }
    }

    oo(String str) {
        this.qf = str;
    }

    public static boolean pcc(vj vjVar) {
        return vjVar instanceof oo;
    }

    public String pcc() {
        return this.qf;
    }
}
