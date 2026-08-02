package p000;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class b22 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f690j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f691k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ long f692l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ long f693m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Bundle f694n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ boolean f695o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ boolean f696p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ boolean f697q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ v22 f698r;

    public b22(v22 v22Var, String str, String str2, long j, long j2, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.f690j = str;
        this.f691k = str2;
        this.f692l = j;
        this.f693m = j2;
        this.f694n = bundle;
        this.f695o = z;
        this.f696p = z2;
        this.f697q = z3;
        this.f698r = v22Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f698r.m5028J(this.f690j, this.f691k, this.f692l, this.f693m, this.f694n, this.f695o, this.f696p, this.f697q);
    }
}
