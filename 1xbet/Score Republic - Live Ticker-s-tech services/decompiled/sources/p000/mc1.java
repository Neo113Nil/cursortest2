package p000;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mc1 {

    /* JADX INFO: renamed from: a */
    public int f5023a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f5024b;

    /* JADX INFO: renamed from: c */
    public int f5025c;

    /* JADX INFO: renamed from: d */
    public int f5026d;

    public mc1() {
        if (x80.f8855k == null) {
            x80.f8855k = new x80(19);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m3375a(int i) {
        if (i < this.f5026d) {
            return this.f5024b.getShort(this.f5025c + i);
        }
        return 0;
    }
}
