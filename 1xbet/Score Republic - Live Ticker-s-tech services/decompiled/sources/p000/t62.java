package p000;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class t62 implements e72, ny1 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ x62 f7326j;

    public /* synthetic */ t62(x62 x62Var) {
        this.f7326j = x62Var;
    }

    @Override // p000.ny1
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo3600a(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.f7326j.m5536B(str, i, th, bArr, map);
    }

    @Override // p000.e72
    /* JADX INFO: renamed from: e */
    public void mo1384e(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        x62 x62Var = this.f7326j;
        if (!zIsEmpty) {
            x62Var.mo1564c().m6J(new RunnableC0452m(this, str, str2, bundle, 15));
            return;
        }
        f02 f02Var = x62Var.f8832u;
        if (f02Var != null) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5313b(str2, "AppId not known when logging event");
        }
    }
}
