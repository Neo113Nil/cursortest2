package com.bytedance.adsdk.pcc.sf.oo;

import io.ktor.sse.ServerSentEventKt;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.slf4j.Marker;

/* loaded from: classes5.dex */
public enum gm implements vj {
    QUESTION("?", 0),
    COLON(ServerSentEventKt.COLON, 0),
    DOUBLE_AMP("&&", 1),
    DOUBLE_BAR("||", 1),
    EQ("==", 2),
    GT(">", 2),
    LT("<", 2),
    LT_EQ("<=", 2),
    GT_EQ(">=", 2),
    NOT_EQ("!=", 2),
    PLUS(Marker.ANY_NON_NULL_MARKER, 3),
    MINUS("-", 3),
    MULTI("*", 4),
    DIVISION("/", 4),
    MOD("%", 4);

    private final int gpj;
    private final String lu;
    private static final Map<String, gm> dax = new HashMap(128);
    private static final Set<gm> nac = new HashSet();

    static {
        for (gm gmVar : values()) {
            dax.put(gmVar.pcc(), gmVar);
            nac.add(gmVar);
        }
    }

    gm(String str, int i) {
        this.lu = str;
        this.gpj = i;
    }

    public static gm pcc(String str) {
        return dax.get(str);
    }

    public static boolean pcc(vj vjVar) {
        return vjVar instanceof gm;
    }

    public String pcc() {
        return this.lu;
    }

    public int sf() {
        return this.gpj;
    }
}
