package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class vt0 {

    /* JADX INFO: renamed from: a */
    public final C0539oc f8262a;

    /* JADX INFO: renamed from: b */
    public int f8263b;

    /* JADX INFO: renamed from: c */
    public int f8264c;

    public vt0(C0539oc c0539oc, int i) {
        this.f8262a = c0539oc;
        this.f8263b = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m5189a(byte[] bArr, int i, int i2) {
        this.f8262a.write(bArr, i, i2);
        this.f8263b -= i2;
        this.f8264c += i2;
    }
}
