package p000;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class zv1 extends jw1 {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f9969n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ mw1 f9970o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f9971p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv1(mw1 mw1Var, Bundle bundle) {
        super(mw1Var, true);
        this.f9969n = 0;
        this.f9971p = bundle;
        Objects.requireNonNull(mw1Var);
        this.f9970o = mw1Var;
    }

    @Override // p000.jw1
    /* JADX INFO: renamed from: a */
    public final void mo492a() {
        switch (this.f9969n) {
            case 0:
                ev1 ev1Var = this.f9970o.f5174f;
                p80.m3863h(ev1Var);
                ev1Var.setConditionalUserProperty((Bundle) this.f9971p, this.f4100j);
                break;
            case 1:
                ev1 ev1Var2 = this.f9970o.f5174f;
                p80.m3863h(ev1Var2);
                ev1Var2.retrieveAndUploadBatches(new dw1(this, (f31) this.f9971p));
                break;
            case 2:
                ev1 ev1Var3 = this.f9970o.f5174f;
                p80.m3863h(ev1Var3);
                ev1Var3.logHealthData(5, "Error with data collection. Data lost.", new vs0((Exception) this.f9971p), new vs0(null), new vs0(null));
                break;
            default:
                ev1 ev1Var4 = this.f9970o.f5174f;
                p80.m3863h(ev1Var4);
                ev1Var4.registerOnMeasurementEventListener((kw1) this.f9971p);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zv1(mw1 mw1Var, Object obj, int i) {
        super(mw1Var, true);
        this.f9969n = i;
        this.f9971p = obj;
        this.f9970o = mw1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv1(mw1 mw1Var, Exception exc) {
        super(mw1Var, false);
        this.f9969n = 2;
        this.f9971p = exc;
        this.f9970o = mw1Var;
    }
}
