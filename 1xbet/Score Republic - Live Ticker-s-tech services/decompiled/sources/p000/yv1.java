package p000;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class yv1 extends jw1 {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f9514n = 2;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ String f9515o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ String f9516p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ boolean f9517q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ mw1 f9518r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f9519s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv1(mw1 mw1Var, String str, String str2, Object obj, boolean z) {
        super(mw1Var, true);
        this.f9515o = str;
        this.f9516p = str2;
        this.f9519s = obj;
        this.f9517q = z;
        Objects.requireNonNull(mw1Var);
        this.f9518r = mw1Var;
    }

    @Override // p000.jw1
    /* JADX INFO: renamed from: a */
    public final void mo492a() {
        switch (this.f9514n) {
            case 0:
                ev1 ev1Var = this.f9518r.f5174f;
                p80.m3863h(ev1Var);
                ev1Var.setUserProperty(this.f9515o, this.f9516p, new vs0(this.f9519s), this.f9517q, this.f4100j);
                break;
            case 1:
                ev1 ev1Var2 = this.f9518r.f5174f;
                p80.m3863h(ev1Var2);
                ev1Var2.getUserProperties(this.f9515o, this.f9516p, this.f9517q, (bv1) this.f9519s);
                break;
            default:
                long j = this.f4100j;
                long j2 = this.f4101k;
                ev1 ev1Var3 = this.f9518r.f5174f;
                p80.m3863h(ev1Var3);
                ev1Var3.logEventWithElapsedTime(this.f9515o, this.f9516p, (Bundle) this.f9519s, this.f9517q, true, j, j2);
                break;
        }
    }

    @Override // p000.jw1
    /* JADX INFO: renamed from: b */
    public void mo493b() {
        switch (this.f9514n) {
            case 1:
                ((bv1) this.f9519s).mo785n(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv1(mw1 mw1Var, String str, String str2, Bundle bundle, boolean z) {
        super(mw1Var, true);
        this.f9515o = str;
        this.f9516p = str2;
        this.f9519s = bundle;
        this.f9517q = z;
        this.f9518r = mw1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv1(mw1 mw1Var, String str, String str2, boolean z, bv1 bv1Var) {
        super(mw1Var, true);
        this.f9515o = str;
        this.f9516p = str2;
        this.f9517q = z;
        this.f9519s = bv1Var;
        this.f9518r = mw1Var;
    }
}
