package p000;

import android.util.Log;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d02 implements y22 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ f02 f1506j;

    @Override // p000.y22
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo1075a(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.f1506j.m1570i(i, th, bArr);
    }

    /* JADX INFO: renamed from: b */
    public boolean m1076b() {
        ky1 ky1Var = this.f1506j.f2247o;
        f02.m1560m(ky1Var);
        return Log.isLoggable(ky1Var.m3114K(), 3);
    }

    public d02(q12 q12Var, f02 f02Var) {
        this.f1506j = f02Var;
    }
}
