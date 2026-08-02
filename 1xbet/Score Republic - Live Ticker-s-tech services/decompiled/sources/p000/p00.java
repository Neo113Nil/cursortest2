package p000;

import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class p00 extends AbstractC0882xm {

    /* JADX INFO: renamed from: m */
    public FileOutputStream f5944m;

    /* JADX INFO: renamed from: n */
    public FileOutputStream f5945n;

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f5946o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ q00 f5947p;

    /* JADX INFO: renamed from: q */
    public int f5948q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p00(q00 q00Var, AbstractC0882xm abstractC0882xm) {
        super(abstractC0882xm);
        this.f5947p = q00Var;
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: m */
    public final Object mo17m(Object obj) {
        this.f5946o = obj;
        this.f5948q |= Integer.MIN_VALUE;
        return this.f5947p.m4022b(null, this);
    }
}
