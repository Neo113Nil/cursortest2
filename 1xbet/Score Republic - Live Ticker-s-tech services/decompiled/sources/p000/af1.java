package p000;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class af1 {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f173d = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final int f174a;

    /* JADX INFO: renamed from: b */
    public final f71 f175b;

    /* JADX INFO: renamed from: c */
    public volatile int f176c = 0;

    public af1(f71 f71Var, int i) {
        this.f175b = f71Var;
        this.f174a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m201a(int i) {
        qp0 qp0VarM202b = m202b();
        int iM3375a = qp0VarM202b.m3375a(16);
        if (iM3375a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = qp0VarM202b.f5024b;
        int i2 = iM3375a + qp0VarM202b.f5023a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    /* JADX INFO: renamed from: b */
    public final qp0 m202b() {
        ThreadLocal threadLocal = f173d;
        qp0 qp0Var = (qp0) threadLocal.get();
        if (qp0Var == null) {
            qp0Var = new qp0();
            threadLocal.set(qp0Var);
        }
        rp0 rp0Var = (rp0) this.f175b.f2334k;
        int iM3375a = rp0Var.m3375a(6);
        if (iM3375a != 0) {
            int i = iM3375a + rp0Var.f5023a;
            int i2 = (this.f174a * 4) + rp0Var.f5024b.getInt(i) + i + 4;
            int i3 = rp0Var.f5024b.getInt(i2) + i2;
            ByteBuffer byteBuffer = rp0Var.f5024b;
            qp0Var.f5024b = byteBuffer;
            if (byteBuffer != null) {
                qp0Var.f5023a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                qp0Var.f5025c = i4;
                qp0Var.f5026d = qp0Var.f5024b.getShort(i4);
                return qp0Var;
            }
            qp0Var.f5023a = 0;
            qp0Var.f5025c = 0;
            qp0Var.f5026d = 0;
        }
        return qp0Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        qp0 qp0VarM202b = m202b();
        int iM3375a = qp0VarM202b.m3375a(4);
        sb.append(Integer.toHexString(iM3375a != 0 ? qp0VarM202b.f5024b.getInt(iM3375a + qp0VarM202b.f5023a) : 0));
        sb.append(", codepoints:");
        qp0 qp0VarM202b2 = m202b();
        int iM3375a2 = qp0VarM202b2.m3375a(16);
        if (iM3375a2 != 0) {
            int i2 = iM3375a2 + qp0VarM202b2.f5023a;
            i = qp0VarM202b2.f5024b.getInt(qp0VarM202b2.f5024b.getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(m201a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
