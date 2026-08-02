package p000;

import java.io.FileInputStream;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class h00 extends AbstractC0882xm {

    /* JADX INFO: renamed from: m */
    public Object f2980m;

    /* JADX INFO: renamed from: n */
    public FileInputStream f2981n;

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f2982o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ i00 f2983p;

    /* JADX INFO: renamed from: q */
    public int f2984q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h00(i00 i00Var, AbstractC0882xm abstractC0882xm) {
        super(abstractC0882xm);
        this.f2983p = i00Var;
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: m */
    public final Object mo17m(Object obj) {
        this.f2982o = obj;
        this.f2984q |= Integer.MIN_VALUE;
        return i00.m2357a(this.f2983p, this);
    }
}
