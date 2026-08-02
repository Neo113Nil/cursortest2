package p000;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class pn1 extends AbstractC0175ei {

    /* JADX INFO: renamed from: d */
    public static final Map f6221d;

    /* JADX INFO: renamed from: c */
    public final nb2 f6222c;

    static {
        EnumMap enumMap = new EnumMap(nb2.class);
        for (nb2 nb2Var : nb2.values()) {
            pn1[] pn1VarArr = new pn1[10];
            for (int i = 0; i < 10; i++) {
                pn1VarArr[i] = new pn1(i, nb2Var, pb2.f6076e);
            }
            enumMap.put(nb2Var, pn1VarArr);
        }
        f6221d = Collections.unmodifiableMap(enumMap);
    }

    public pn1(int i, nb2 nb2Var, pb2 pb2Var) {
        super(pb2Var, i);
        p80.m3874s(nb2Var, "format char");
        this.f6222c = nb2Var;
        if (pb2Var.m3897a()) {
            return;
        }
        int i2 = nb2Var.f5363j;
        i2 = pb2Var.m3899c() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        pb2Var.m3900d(sb);
        sb.append((char) i2);
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: z */
    public final void mo1427z(C0928yv c0928yv, Object obj) {
        c0928yv.m5844e(obj, this.f6222c, (pb2) this.f2095b);
    }
}
