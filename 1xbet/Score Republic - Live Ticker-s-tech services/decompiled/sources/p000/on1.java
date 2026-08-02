package p000;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class on1 extends AbstractC0175ei {

    /* JADX INFO: renamed from: c */
    public final nn1 f5816c;

    public on1(pb2 pb2Var, int i, nn1 nn1Var) {
        super(pb2Var, i);
        this.f5816c = nn1Var;
        StringBuilder sb = new StringBuilder("%");
        pb2Var.m3900d(sb);
        sb.append(true != pb2Var.m3899c() ? 't' : 'T');
        sb.append(nn1Var.f5463j);
    }

    @Override // p000.AbstractC0175ei
    /* JADX INFO: renamed from: z */
    public final void mo1427z(C0928yv c0928yv, Object obj) {
        pb2 pb2Var = (pb2) this.f2095b;
        StringBuilder sb = (StringBuilder) c0928yv.f9510g;
        boolean z = obj instanceof Date;
        nn1 nn1Var = this.f5816c;
        if (z || (obj instanceof Calendar) || (obj instanceof Long)) {
            StringBuilder sb2 = new StringBuilder("%");
            pb2Var.m3900d(sb2);
            sb2.append(true != pb2Var.m3899c() ? 't' : 'T');
            sb2.append(nn1Var.f5463j);
            sb.append(String.format(rb2.f6801a, sb2.toString(), obj));
            return;
        }
        char c = nn1Var.f5463j;
        StringBuilder sb3 = new StringBuilder(String.valueOf(c).length() + 2);
        sb3.append("%t");
        sb3.append(c);
        C0928yv.m5839h(sb, obj, sb3.toString());
    }
}
