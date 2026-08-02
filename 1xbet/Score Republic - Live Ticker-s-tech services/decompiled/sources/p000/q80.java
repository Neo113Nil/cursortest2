package p000;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class q80 extends ContextWrapper {

    /* JADX INFO: renamed from: j */
    public static final w70 f6404j;

    /* JADX INFO: renamed from: a */
    public final nk0 f6405a;

    /* JADX INFO: renamed from: b */
    public final p90 f6406b;

    /* JADX INFO: renamed from: c */
    public final nc1 f6407c;

    /* JADX INFO: renamed from: d */
    public final List f6408d;

    /* JADX INFO: renamed from: e */
    public final C0089c8 f6409e;

    /* JADX INFO: renamed from: f */
    public final C0892xw f6410f;

    /* JADX INFO: renamed from: g */
    public final b90 f6411g;

    /* JADX INFO: renamed from: h */
    public final int f6412h;

    /* JADX INFO: renamed from: i */
    public p11 f6413i;

    static {
        w70 w70Var = new w70();
        w70Var.f8450j = fs0.f2489a;
        f6404j = w70Var;
    }

    public q80(Context context, nk0 nk0Var, m81 m81Var, nc1 nc1Var, C0089c8 c0089c8, List list, C0892xw c0892xw, b90 b90Var) {
        super(context.getApplicationContext());
        this.f6405a = nk0Var;
        this.f6407c = nc1Var;
        this.f6408d = list;
        this.f6409e = c0089c8;
        this.f6410f = c0892xw;
        this.f6411g = b90Var;
        this.f6412h = 4;
        this.f6406b = new p90(m81Var);
    }

    /* JADX INFO: renamed from: a */
    public final p01 m4041a() {
        return (p01) this.f6406b.get();
    }
}
