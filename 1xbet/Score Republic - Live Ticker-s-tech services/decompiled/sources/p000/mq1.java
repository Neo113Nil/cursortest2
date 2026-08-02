package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class mq1 extends fr1 {

    /* JADX INFO: renamed from: l */
    public final transient int f5131l;

    /* JADX INFO: renamed from: m */
    public final transient int f5132m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ fr1 f5133n;

    public mq1(fr1 fr1Var, int i, int i2) {
        this.f5133n = fr1Var;
        this.f5131l = i;
        this.f5132m = i2;
    }

    @Override // p000.bo1
    /* JADX INFO: renamed from: b */
    public final Object[] mo730b() {
        return this.f5133n.mo730b();
    }

    @Override // p000.bo1
    /* JADX INFO: renamed from: c */
    public final int mo731c() {
        return this.f5133n.mo731c() + this.f5131l;
    }

    @Override // p000.bo1
    /* JADX INFO: renamed from: d */
    public final int mo732d() {
        return this.f5133n.mo731c() + this.f5131l + this.f5132m;
    }

    @Override // p000.fr1, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final fr1 subList(int i, int i2) {
        AbstractC0959zp.m5976E(i, i2, this.f5132m);
        int i3 = this.f5131l;
        return this.f5133n.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC0959zp.m5975D(i, this.f5132m);
        return this.f5133n.get(i + this.f5131l);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5132m;
    }
}
